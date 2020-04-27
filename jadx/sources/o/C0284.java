package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/* renamed from: o.ıı  reason: contains not printable characters */
class C0284 extends DataSetObservable {

    /* renamed from: ɩ  reason: contains not printable characters */
    static final String f3526 = C0284.class.getSimpleName();

    /* renamed from: ı  reason: contains not printable characters */
    final List<C0286> f3527;

    /* renamed from: Ɩ  reason: contains not printable characters */
    boolean f3528;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Context f3529;

    /* renamed from: ɹ  reason: contains not printable characters */
    boolean f3530;

    /* renamed from: Ι  reason: contains not printable characters */
    final List<C0285> f3531;

    /* renamed from: ι  reason: contains not printable characters */
    final Object f3532;

    /* renamed from: І  reason: contains not printable characters */
    boolean f3533;

    /* renamed from: і  reason: contains not printable characters */
    final String f3534;

    static {
        new HashMap();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m4137() {
        int size;
        synchronized (this.f3532) {
            boolean r1 = m4139() | false;
            m4140();
            if (r1) {
                notifyChanged();
            }
            size = this.f3531.size();
        }
        return size;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final ResolveInfo m4138(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f3532) {
            boolean r1 = m4139() | false;
            m4140();
            if (r1) {
                notifyChanged();
            }
            resolveInfo = this.f3531.get(i).f3536;
        }
        return resolveInfo;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m4142(ResolveInfo resolveInfo) {
        synchronized (this.f3532) {
            boolean r1 = m4139() | false;
            m4140();
            if (r1) {
                notifyChanged();
            }
            List<C0285> list = this.f3531;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f3536 == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final ResolveInfo m4143() {
        synchronized (this.f3532) {
            boolean r1 = m4139() | false;
            m4140();
            if (r1) {
                notifyChanged();
            }
            if (this.f3531.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = this.f3531.get(0).f3536;
            return resolveInfo;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m4141() {
        int size;
        synchronized (this.f3532) {
            boolean r1 = m4139() | false;
            m4140();
            if (r1) {
                notifyChanged();
            }
            size = this.f3527.size();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m4139() {
        if (!this.f3530 || !this.f3533 || TextUtils.isEmpty(this.f3534)) {
            return false;
        }
        this.f3530 = false;
        this.f3528 = true;
        m4136();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4140() {
        int size = this.f3527.size();
        if (size > 0) {
            this.f3533 = true;
            for (int i = 0; i < size; i++) {
                this.f3527.remove(0);
            }
        }
    }

    /* renamed from: o.ıı$ǃ  reason: contains not printable characters */
    public static final class C0286 {

        /* renamed from: ı  reason: contains not printable characters */
        public final ComponentName f3537;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final float f3538;

        /* renamed from: ι  reason: contains not printable characters */
        public final long f3539;

        public C0286(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public C0286(ComponentName componentName, long j, float f) {
            this.f3537 = componentName;
            this.f3539 = j;
            this.f3538 = f;
        }

        public final int hashCode() {
            ComponentName componentName = this.f3537;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.f3539;
            return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f3538);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0286 r8 = (C0286) obj;
            ComponentName componentName = this.f3537;
            if (componentName == null) {
                if (r8.f3537 != null) {
                    return false;
                }
            } else if (!componentName.equals(r8.f3537)) {
                return false;
            }
            return this.f3539 == r8.f3539 && Float.floatToIntBits(this.f3538) == Float.floatToIntBits(r8.f3538);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:");
            sb.append(this.f3537);
            sb.append("; time:");
            sb.append(this.f3539);
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.f3538));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: o.ıı$ı  reason: contains not printable characters */
    public static final class C0285 implements Comparable<C0285> {

        /* renamed from: ɩ  reason: contains not printable characters */
        public final ResolveInfo f3536;

        public final int hashCode() {
            return Float.floatToIntBits(0.0f) + 31;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(0.0f) == Float.floatToIntBits(0.0f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:");
            sb.append(this.f3536.toString());
            sb.append("; weight:");
            sb.append(new BigDecimal(0.0d));
            sb.append("]");
            return sb.toString();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return Float.floatToIntBits(0.0f) - Float.floatToIntBits(0.0f);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: Ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4136() {
        /*
            r9 = this;
            android.content.Context r0 = r9.f3529     // Catch:{ FileNotFoundException -> 0x0094 }
            java.lang.String r1 = r9.f3534     // Catch:{ FileNotFoundException -> 0x0094 }
            java.io.FileInputStream r0 = r0.openFileInput(r1)     // Catch:{ FileNotFoundException -> 0x0094 }
            org.xmlpull.v1.XmlPullParser r1 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            java.lang.String r2 = "UTF-8"
            r1.setInput(r0, r2)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            r2 = 0
        L_0x0012:
            r3 = 1
            if (r2 == r3) goto L_0x001d
            r4 = 2
            if (r2 == r4) goto L_0x001d
            int r2 = r1.next()     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            goto L_0x0012
        L_0x001d:
            java.lang.String r2 = "historical-records"
            java.lang.String r4 = r1.getName()     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            if (r2 == 0) goto L_0x0078
            java.util.List<o.ıı$ǃ> r2 = r9.f3527     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            r2.clear()     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
        L_0x002e:
            int r4 = r1.next()     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            if (r4 == r3) goto L_0x0072
            r5 = 3
            if (r4 == r5) goto L_0x002e
            r5 = 4
            if (r4 == r5) goto L_0x002e
            java.lang.String r4 = r1.getName()     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            java.lang.String r5 = "historical-record"
            boolean r4 = r5.equals(r4)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            if (r4 == 0) goto L_0x006a
            java.lang.String r4 = "activity"
            r5 = 0
            java.lang.String r4 = r1.getAttributeValue(r5, r4)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            java.lang.String r6 = "time"
            java.lang.String r6 = r1.getAttributeValue(r5, r6)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            java.lang.String r8 = "weight"
            java.lang.String r5 = r1.getAttributeValue(r5, r8)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            o.ıı$ǃ r8 = new o.ıı$ǃ     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            r8.<init>((java.lang.String) r4, (long) r6, (float) r5)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            r2.add(r8)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            goto L_0x002e
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            java.lang.String r2 = "Share records file not well-formed."
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            throw r1     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
        L_0x0072:
            if (r0 == 0) goto L_0x0094
            r0.close()     // Catch:{ IOException -> 0x0077 }
        L_0x0077:
            return
        L_0x0078:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            java.lang.String r2 = "Share records file does not start with historical-records tag."
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
            throw r1     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0087, all -> 0x0080 }
        L_0x0080:
            r1 = move-exception
            if (r0 == 0) goto L_0x0086
            r0.close()     // Catch:{ IOException -> 0x0086 }
        L_0x0086:
            throw r1
        L_0x0087:
            if (r0 == 0) goto L_0x0094
            r0.close()     // Catch:{ IOException -> 0x008d }
        L_0x008d:
            return
        L_0x008e:
            if (r0 == 0) goto L_0x0094
            r0.close()     // Catch:{  }
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0284.m4136():void");
    }

    /* renamed from: o.ıı$If */
    final class If extends AsyncTask<Object, Void, Void> {
        If() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0069, code lost:
            if (r14 != null) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r14.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x006f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r0 = o.C0284.f3526;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
            r13.f3535.f3530 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
            if (r14 == null) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r0 = o.C0284.f3526;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
            r13.f3535.f3530 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
            if (r14 == null) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r0 = o.C0284.f3526;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
            r13.f3535.f3530 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
            if (r14 == null) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
            r13.f3535.f3530 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
            if (r14 != null) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r14.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
            throw r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:14:0x0071, B:18:0x007a, B:22:0x0083] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0083 */
        /* renamed from: ɩ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r14) {
            /*
                r13 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                r2 = 0
                r3 = r14[r2]
                java.util.List r3 = (java.util.List) r3
                r4 = 1
                r14 = r14[r4]
                java.lang.String r14 = (java.lang.String) r14
                r5 = 0
                o.ıı r6 = o.C0284.this     // Catch:{ FileNotFoundException -> 0x0097 }
                android.content.Context r6 = r6.f3529     // Catch:{ FileNotFoundException -> 0x0097 }
                java.io.FileOutputStream r14 = r6.openFileOutput(r14, r2)     // Catch:{ FileNotFoundException -> 0x0097 }
                org.xmlpull.v1.XmlSerializer r6 = android.util.Xml.newSerializer()
                r6.setOutput(r14, r5)     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                java.lang.String r7 = "UTF-8"
                java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                r6.startDocument(r7, r8)     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                r6.startTag(r5, r1)     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                int r7 = r3.size()     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                r8 = 0
            L_0x002d:
                if (r8 >= r7) goto L_0x005f
                java.lang.Object r9 = r3.remove(r2)     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                o.ıı$ǃ r9 = (o.C0284.C0286) r9     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                r6.startTag(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                java.lang.String r10 = "activity"
                android.content.ComponentName r11 = r9.f3537     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                java.lang.String r11 = r11.flattenToString()     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                r6.attribute(r5, r10, r11)     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                java.lang.String r10 = "time"
                long r11 = r9.f3539     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                r6.attribute(r5, r10, r11)     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                java.lang.String r10 = "weight"
                float r9 = r9.f3538     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                r6.attribute(r5, r10, r9)     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                r6.endTag(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                int r8 = r8 + 1
                goto L_0x002d
            L_0x005f:
                r6.endTag(r5, r1)     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                r6.endDocument()     // Catch:{ IllegalArgumentException -> 0x0083, IllegalStateException -> 0x007a, IOException -> 0x0071 }
                o.ıı r0 = o.C0284.this
                r0.f3530 = r4
                if (r14 == 0) goto L_0x008c
            L_0x006b:
                r14.close()     // Catch:{ IOException -> 0x008c }
                goto L_0x008c
            L_0x006f:
                r0 = move-exception
                goto L_0x008d
            L_0x0071:
                java.lang.String r0 = o.C0284.f3526     // Catch:{ all -> 0x006f }
                o.ıı r0 = o.C0284.this
                r0.f3530 = r4
                if (r14 == 0) goto L_0x008c
                goto L_0x006b
            L_0x007a:
                java.lang.String r0 = o.C0284.f3526     // Catch:{ all -> 0x006f }
                o.ıı r0 = o.C0284.this
                r0.f3530 = r4
                if (r14 == 0) goto L_0x008c
                goto L_0x006b
            L_0x0083:
                java.lang.String r0 = o.C0284.f3526     // Catch:{ all -> 0x006f }
                o.ıı r0 = o.C0284.this
                r0.f3530 = r4
                if (r14 == 0) goto L_0x008c
                goto L_0x006b
            L_0x008c:
                return r5
            L_0x008d:
                o.ıı r1 = o.C0284.this
                r1.f3530 = r4
                if (r14 == 0) goto L_0x0096
                r14.close()     // Catch:{ IOException -> 0x0096 }
            L_0x0096:
                throw r0
            L_0x0097:
                java.lang.String r14 = o.C0284.f3526
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0284.If.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }
}
