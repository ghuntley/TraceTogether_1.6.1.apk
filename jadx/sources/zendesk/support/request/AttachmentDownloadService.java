package zendesk.support.request;

import java.io.IOException;
import java.util.concurrent.Executor;
import o.D;
import o.G;
import o.mF;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

class AttachmentDownloadService {
    private final Executor executor;
    private final OkHttpClient okHttpClient;

    AttachmentDownloadService(OkHttpClient okHttpClient2, Executor executor2) {
        this.okHttpClient = okHttpClient2;
        this.executor = executor2;
    }

    /* access modifiers changed from: package-private */
    public void storeAttachment(ResponseBody responseBody, mF mFVar, G<mF> g) {
        this.executor.execute(new SaveToFileTask(responseBody, mFVar, g));
    }

    /* access modifiers changed from: package-private */
    public void downloadAttachment(String str, final G<ResponseBody> g) {
        this.okHttpClient.newCall(new Request.Builder().get().url(str).build()).enqueue(new Callback() {
            public void onFailure(Call call, IOException iOException) {
                g.onError(new D(iOException.getMessage()));
            }

            public void onResponse(Call call, Response response) {
                if (response.isSuccessful()) {
                    g.onSuccess(response.body());
                } else {
                    g.onError(new D(response.message()));
                }
            }
        });
    }

    static class SaveToFileTask implements Runnable {
        private final G<mF> callback;
        private final mF destFile;
        private final ResponseBody responseBody;

        private SaveToFileTask(ResponseBody responseBody2, mF mFVar, G<mF> g) {
            this.responseBody = responseBody2;
            this.destFile = mFVar;
            this.callback = g;
        }

        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v3, types: [o.C] */
        /* JADX WARNING: type inference failed for: r0v5, types: [java.io.Closeable] */
        /* JADX WARNING: type inference failed for: r0v7 */
        /* JADX WARNING: type inference failed for: r0v9 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                r0 = 0
                o.mF r1 = r6.destFile     // Catch:{ IOException -> 0x002b }
                java.io.File r1 = r1.f3087     // Catch:{ IOException -> 0x002b }
                o.jZ r1 = o.jP.m2980((java.io.File) r1)     // Catch:{ IOException -> 0x002b }
                o.jK r1 = o.jP.m2979((o.jZ) r1)     // Catch:{ IOException -> 0x002b }
                okhttp3.ResponseBody r2 = r6.responseBody     // Catch:{ IOException -> 0x0024, all -> 0x001f }
                o.jI r2 = r2.source()     // Catch:{ IOException -> 0x0024, all -> 0x001f }
                r1.m2940((o.jY) r2)     // Catch:{ IOException -> 0x0024, all -> 0x001f }
                zendesk.support.Streams.closeQuietly(r1)
                okhttp3.ResponseBody r1 = r6.responseBody
                zendesk.support.Streams.closeQuietly(r1)
                goto L_0x004b
            L_0x001f:
                r0 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
                goto L_0x005b
            L_0x0024:
                r0 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
                goto L_0x002c
            L_0x0029:
                r1 = move-exception
                goto L_0x005b
            L_0x002b:
                r1 = move-exception
            L_0x002c:
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0029 }
                r3 = 0
                java.lang.String r4 = r1.getMessage()     // Catch:{ all -> 0x0029 }
                r2[r3] = r4     // Catch:{ all -> 0x0029 }
                o.F.m1358()     // Catch:{ all -> 0x0029 }
                o.D r2 = new o.D     // Catch:{ all -> 0x0029 }
                java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0029 }
                r2.<init>(r1)     // Catch:{ all -> 0x0029 }
                zendesk.support.Streams.closeQuietly(r0)
                okhttp3.ResponseBody r0 = r6.responseBody
                zendesk.support.Streams.closeQuietly(r0)
                r0 = r2
            L_0x004b:
                o.G<o.mF> r1 = r6.callback
                if (r1 == 0) goto L_0x005a
                if (r0 != 0) goto L_0x0057
                o.mF r0 = r6.destFile
                r1.onSuccess(r0)
                return
            L_0x0057:
                r1.onError(r0)
            L_0x005a:
                return
            L_0x005b:
                zendesk.support.Streams.closeQuietly(r0)
                okhttp3.ResponseBody r0 = r6.responseBody
                zendesk.support.Streams.closeQuietly(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.AttachmentDownloadService.SaveToFileTask.run():void");
        }
    }
}
