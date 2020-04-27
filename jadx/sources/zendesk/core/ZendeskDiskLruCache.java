package zendesk.core;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import o.C2665;
import o.C2864;
import o.C3162;
import o.F;
import o.O;
import o.P;
import o.jP;
import o.jY;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

class ZendeskDiskLruCache implements BaseStorage {
    private final File directory;
    private final long maxSize;
    private final Serializer serializer;
    private C3162 storage = openCache(this.directory, this.maxSize);

    public void remove(String str) {
    }

    ZendeskDiskLruCache(File file, Serializer serializer2, int i) {
        this.directory = file;
        this.maxSize = (long) i;
        this.serializer = serializer2;
    }

    public void put(String str, String str2) {
        if (this.storage != null && !P.m1409(str2)) {
            putString(str, 0, str2);
        }
    }

    public void put(String str, Object obj) {
        if (this.storage != null) {
            if (obj instanceof ResponseBody) {
                ResponseBody responseBody = (ResponseBody) obj;
                write(str, 0, responseBody.source());
                putString(keyMediaType(str), 0, responseBody.contentType().toString());
                return;
            }
            String str2 = null;
            if (obj != null) {
                str2 = this.serializer.serialize(obj);
            }
            put(str, str2);
        }
    }

    public String get(String str) {
        if (this.storage == null) {
            return null;
        }
        return getString(str, 0);
    }

    public <E> E get(String str, Class<E> cls) {
        if (this.storage == null) {
            return null;
        }
        if (cls.equals(ResponseBody.class)) {
            try {
                C3162.C3165 r7 = this.storage.m15999(key(str));
                if (r7 == null) {
                    return null;
                }
                jY r0 = jP.m2974(r7.f14411[0]);
                long j = r7.f14410[0];
                String string = getString(keyMediaType(str), 0);
                return ResponseBody.create(P.m1406(string) ? MediaType.parse(string) : null, j, jP.m2972(r0));
            } catch (IOException unused) {
                F.m1356();
                return null;
            }
        } else {
            return this.serializer.deserialize(getString(str, 0), cls);
        }
    }

    public void clear() {
        C3162 r0 = this.storage;
        if (r0 != null) {
            try {
                if (r0.f14393 == null || !this.storage.f14393.exists() || !O.m1397((Type[]) this.storage.f14393.listFiles())) {
                    this.storage.close();
                } else {
                    C3162 r02 = this.storage;
                    r02.close();
                    C2665.m14140(r02.f14393);
                }
            } catch (IOException e) {
                new Object[1][0] = e.getMessage();
                F.m1359();
            } catch (Throwable th) {
                this.storage = openCache(this.directory, this.maxSize);
                throw th;
            }
            this.storage = openCache(this.directory, this.maxSize);
        }
    }

    private C3162 openCache(File file, long j) {
        try {
            return C3162.m15995(file, j);
        } catch (IOException unused) {
            F.m1361();
            return null;
        }
    }

    private String key(String str) {
        return C2864.C2866.m14866(str);
    }

    private String keyMediaType(String str) {
        return key(String.format(Locale.US, "%s_content_type", new Object[]{str}));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        o.F.m1356();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        r2 = r0;
        r0 = r4;
        r4 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getString(java.lang.String r4, int r5) {
        /*
            r3 = this;
            r0 = 0
            o.յլ r1 = r3.storage     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            java.lang.String r4 = r3.key(r4)     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            o.յլ$ɩ r4 = r1.m15999((java.lang.String) r4)     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            if (r4 == 0) goto L_0x0026
            java.io.InputStream[] r4 = r4.f14411     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            r4 = r4[r5]     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            o.jY r4 = o.jP.m2974((java.io.InputStream) r4)     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            o.jI r5 = o.jP.m2972((o.jY) r4)     // Catch:{ IOException -> 0x0024, all -> 0x001e }
            java.lang.String r0 = r5.m2918()     // Catch:{ IOException -> 0x002e }
            goto L_0x0031
        L_0x001e:
            r5 = move-exception
            r2 = r0
            r0 = r4
            r4 = r5
            r5 = r2
            goto L_0x003c
        L_0x0024:
            r5 = r0
            goto L_0x002e
        L_0x0026:
            r4 = r0
            r5 = r4
            goto L_0x0031
        L_0x0029:
            r4 = move-exception
            r5 = r0
            goto L_0x003c
        L_0x002c:
            r4 = r0
            r5 = r4
        L_0x002e:
            o.F.m1356()     // Catch:{ all -> 0x0038 }
        L_0x0031:
            r3.close(r4)
            r3.close(r5)
            return r0
        L_0x0038:
            r0 = move-exception
            r2 = r0
            r0 = r4
            r4 = r2
        L_0x003c:
            r3.close(r0)
            r3.close(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.core.ZendeskDiskLruCache.getString(java.lang.String, int):java.lang.String");
    }

    private void putString(String str, int i, String str2) {
        try {
            write(str, i, jP.m2974((InputStream) new ByteArrayInputStream(str2.getBytes("UTF-8"))));
        } catch (UnsupportedEncodingException unused) {
            F.m1356();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void write(java.lang.String r4, int r5, o.jY r6) {
        /*
            r3 = this;
            r0 = 0
            java.io.File r1 = r3.directory     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            o.յլ r2 = r3.storage     // Catch:{ all -> 0x0032 }
            java.lang.String r4 = r3.key(r4)     // Catch:{ all -> 0x0032 }
            o.յլ$if r4 = r2.m16000((java.lang.String) r4)     // Catch:{ all -> 0x0032 }
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            if (r4 == 0) goto L_0x0027
            java.io.OutputStream r5 = r4.m16005((int) r5)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            o.jZ r5 = o.jP.m2977((java.io.OutputStream) r5)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            o.jK r0 = o.jP.m2979((o.jZ) r5)     // Catch:{ IOException -> 0x0039 }
            r0.m2940((o.jY) r6)     // Catch:{ IOException -> 0x0039 }
            r0.flush()     // Catch:{ IOException -> 0x0039 }
            r4.m16006()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0028
        L_0x0027:
            r5 = r0
        L_0x0028:
            r3.close(r0)
            r3.close(r5)
            r3.close(r6)
            return
        L_0x0032:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            throw r4     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
        L_0x0035:
            r4 = move-exception
            r5 = r0
            goto L_0x003e
        L_0x0038:
            r5 = r0
        L_0x0039:
            o.F.m1356()     // Catch:{ all -> 0x003d }
            goto L_0x0028
        L_0x003d:
            r4 = move-exception
        L_0x003e:
            r3.close(r0)
            r3.close(r5)
            r3.close(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.core.ZendeskDiskLruCache.write(java.lang.String, int, o.jY):void");
    }

    private void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
