package zendesk.support.request;

import android.annotation.SuppressLint;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.support.CustomField;

class StateRequestTicketForm implements Serializable {
    private final long id;
    private final Map<Long, String> ticketFields;

    public StateRequestTicketForm(long j, List<CustomField> list) {
        this.id = j;
        this.ticketFields = fieldsToMap(list);
    }

    StateRequestTicketForm(List<CustomField> list) {
        this(-1, list);
    }

    /* access modifiers changed from: package-private */
    public long getId() {
        return this.id;
    }

    /* access modifiers changed from: package-private */
    public List<CustomField> getTicketFieldsForApi() {
        return mapToFields(this.ticketFields);
    }

    private static List<CustomField> mapToFields(Map<Long, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new CustomField((Long) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }

    @SuppressLint({"UseSparseArrays"})
    private static Map<Long, String> fieldsToMap(List<CustomField> list) {
        HashMap hashMap = new HashMap(list.size());
        for (CustomField next : list) {
            hashMap.put(next.getId(), next.getValue());
        }
        return hashMap;
    }
}
