package zendesk.support;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.F;
import o.O;
import zendesk.core.BaseStorage;
import zendesk.core.MemoryCache;

class ZendeskRequestStorage implements RequestStorage {
    private static final SimpleDateFormat HOURS_MINUTES_FORMAT = new SimpleDateFormat("mm:ss", Locale.ENGLISH);
    private static final long HOUR_IN_MILLIS = TimeUnit.HOURS.toMillis(1);
    private final Object lock = new Object();
    private final MemoryCache memoryCache;
    private final RequestMigrator requestMigrator;
    private final BaseStorage storage;

    ZendeskRequestStorage(BaseStorage baseStorage, RequestMigrator requestMigrator2, MemoryCache memoryCache2) {
        this.storage = baseStorage;
        this.requestMigrator = requestMigrator2;
        this.memoryCache = memoryCache2;
    }

    public void storeRequestData(List<RequestData> list) {
        if (list != null) {
            synchronized (this.lock) {
                this.storage.put("zendesk_request_storage_request_data_list", (Object) new RequestDataList(list));
                this.storage.put("zendesk_request_storage_requests_data_cache_time", Long.toString(System.currentTimeMillis()));
            }
        }
    }

    public boolean isRequestDataExpired() {
        String str;
        long j;
        synchronized (this.lock) {
            str = this.storage.get("zendesk_request_storage_requests_data_cache_time");
        }
        if (str == null) {
            j = 0;
        } else {
            j = Long.parseLong(str);
        }
        boolean z = Math.abs(System.currentTimeMillis() - j) > HOUR_IN_MILLIS;
        if (!z) {
            new Object[1][0] = HOURS_MINUTES_FORMAT.format(Long.valueOf(j));
            F.m1359();
        }
        return z;
    }

    public void updateRequestData(List<Request> list) {
        synchronized (this.lock) {
            storeRequestData(updateRequests(getRequestData(), list));
        }
    }

    public void markRequestAsRead(String str, int i) {
        synchronized (this.lock) {
            List<RequestData> requestData = getRequestData();
            ArrayList arrayList = new ArrayList(requestData.size());
            for (RequestData next : requestData) {
                if (str.equals(next.getId())) {
                    arrayList.add(RequestData.create(next.getId(), i, i));
                } else {
                    arrayList.add(next);
                }
            }
            storeRequestData(arrayList);
        }
    }

    public List<RequestData> getRequestData() {
        RequestDataList requestDataList;
        checkForAndMigrateLegacyRequestData();
        synchronized (this.lock) {
            requestDataList = (RequestDataList) this.storage.get("zendesk_request_storage_request_data_list", RequestDataList.class);
        }
        return requestDataList != null ? requestDataList.requestDataList : new ArrayList(0);
    }

    private void checkForAndMigrateLegacyRequestData() {
        if (!((Boolean) this.memoryCache.getOrDefault("zendesk_request_storage_memory_cache_migrated_flag", Boolean.FALSE)).booleanValue()) {
            List<RequestData> legacyRequests = this.requestMigrator.getLegacyRequests();
            if (O.m1394(legacyRequests)) {
                storeRequestData(legacyRequests);
                this.requestMigrator.clearLegacyRequestStorage();
                this.memoryCache.put("zendesk_request_storage_memory_cache_migrated_flag", Boolean.TRUE);
            }
        }
    }

    private static List<RequestData> updateRequests(List<RequestData> list, List<Request> list2) {
        HashMap hashMap = new HashMap(list.size() + list2.size());
        for (RequestData next : list) {
            hashMap.put(next.getId(), next);
        }
        for (Request next2 : list2) {
            if (hashMap.containsKey(next2.getId())) {
                RequestData requestData = (RequestData) hashMap.get(next2.getId());
                hashMap.put(requestData.getId(), RequestData.create(requestData.getId(), next2.getCommentCount().intValue(), requestData.getReadCommentCount()));
            } else {
                hashMap.put(next2.getId(), RequestData.create(next2));
            }
        }
        return new ArrayList(hashMap.values());
    }
}
