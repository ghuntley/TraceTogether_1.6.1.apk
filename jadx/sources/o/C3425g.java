package o;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* renamed from: o.g  reason: case insensitive filesystem */
public final class C3425g implements C3259a {

    /* renamed from: ı  reason: contains not printable characters */
    private final int f2178;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f2179;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f2180;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f2181;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f2182;

    /* renamed from: ι  reason: contains not printable characters */
    private LinkedHashMap<String, Bitmap> f2183;

    /* renamed from: і  reason: contains not printable characters */
    private int f2184;

    public C3425g(Context context) {
        this(C3626z.m4096(context));
    }

    private C3425g(int i) {
        if (i > 0) {
            this.f2178 = i;
            this.f2183 = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("Max size must be positive.");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Bitmap m2303(String str) {
        if (str != null) {
            synchronized (this) {
                Bitmap bitmap = this.f2183.get(str);
                if (bitmap != null) {
                    this.f2181++;
                    return bitmap;
                }
                this.f2184++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m2304(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            this.f2179++;
            this.f2182 += C3626z.m4089(bitmap);
            Bitmap put = this.f2183.put(str, bitmap);
            if (put != null) {
                this.f2182 -= C3626z.m4089(put);
            }
        }
        m2300(this.f2178);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2300(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f2182     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f2183     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f2182     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r3.f2182     // Catch:{ all -> 0x0071 }
            if (r0 <= r4) goto L_0x0050
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f2183     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f2183     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f2183     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r1 = r3.f2182     // Catch:{ all -> 0x0071 }
            int r0 = o.C3626z.m4089((android.graphics.Bitmap) r0)     // Catch:{ all -> 0x0071 }
            int r1 = r1 - r0
            r3.f2182 = r1     // Catch:{ all -> 0x0071 }
            int r0 = r3.f2180     // Catch:{ all -> 0x0071 }
            int r0 = r0 + 1
            r3.f2180 = r0     // Catch:{ all -> 0x0071 }
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0000
        L_0x0050:
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r4.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r4     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3425g.m2300(int):void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized int m2301() {
        return this.f2182;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final synchronized int m2302() {
        return this.f2178;
    }
}
