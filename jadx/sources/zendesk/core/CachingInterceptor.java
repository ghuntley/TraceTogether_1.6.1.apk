package zendesk.core;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o.F;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

class CachingInterceptor implements Interceptor {
    private final BaseStorage cache;
    private final Map<String, Lock> locks = new HashMap();

    CachingInterceptor(BaseStorage baseStorage) {
        this.cache = baseStorage;
    }

    public Response intercept(Interceptor.Chain chain) {
        Lock lock;
        String obj = chain.request().url().toString();
        synchronized (this.locks) {
            if (this.locks.containsKey(obj)) {
                lock = this.locks.get(obj);
            } else {
                lock = new ReentrantLock();
                this.locks.put(obj, lock);
            }
        }
        try {
            lock.lock();
            return loadData(obj, chain);
        } finally {
            lock.unlock();
        }
    }

    private Response loadData(String str, Interceptor.Chain chain) {
        int i;
        ResponseBody responseBody;
        ResponseBody responseBody2 = (ResponseBody) this.cache.get(str, ResponseBody.class);
        if (responseBody2 == null) {
            new Object[1][0] = str;
            F.m1359();
            Response proceed = chain.proceed(chain.request());
            if (proceed.isSuccessful()) {
                MediaType contentType = proceed.body().contentType();
                byte[] bytes = proceed.body().bytes();
                this.cache.put(str, (Object) ResponseBody.create(contentType, bytes));
                responseBody = ResponseBody.create(contentType, bytes);
            } else {
                new Object[1][0] = str;
                F.m1359();
                responseBody = proceed.body();
            }
            responseBody2 = responseBody;
            i = proceed.code();
        } else {
            i = 200;
        }
        return createResponse(i, chain.request(), responseBody2);
    }

    private Response createResponse(int i, Request request, ResponseBody responseBody) {
        Response.Builder builder = new Response.Builder();
        if (responseBody != null) {
            builder.body(responseBody);
        } else {
            F.m1361();
        }
        return builder.code(i).message(request.method()).request(request).protocol(Protocol.HTTP_1_1).build();
    }
}
