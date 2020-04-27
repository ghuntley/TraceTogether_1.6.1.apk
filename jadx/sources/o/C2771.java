package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import o.C2864;

/* renamed from: o.Ӏǃ  reason: contains not printable characters */
public final class C2771 {

    /* renamed from: ı  reason: contains not printable characters */
    public final C0782<View> f13112 = new C0782<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0299<String, View> f13113 = new C0299<>();

    /* renamed from: ɩ  reason: contains not printable characters */
    public final SparseArray<View> f13114 = new SparseArray<>();

    /* renamed from: ι  reason: contains not printable characters */
    public final C0299<View, C2259> f13115 = new C0299<>();

    /* renamed from: o.Ӏǃ$ǃ  reason: contains not printable characters */
    public static final class C2773 {

        /* renamed from: ı  reason: contains not printable characters */
        public static final int f13127 = 1;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static final int f13128 = 6;

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final int[] f13129 = {16843071, 16843072, R.attr.f149282130968705, R.attr.f149292130968706, R.attr.f149302130968707, R.attr.f149322130968709, R.attr.f149332130968710, R.attr.f149342130968711, R.attr.f150482130968835, R.attr.f150492130968836, R.attr.f150502130968837, R.attr.f150512130968838, R.attr.f150522130968839};

        /* renamed from: ȷ  reason: contains not printable characters */
        public static final int f13130 = 10;

        /* renamed from: ɨ  reason: contains not printable characters */
        public static final int f13131 = 12;

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final int f13132 = 2;

        /* renamed from: ɹ  reason: contains not printable characters */
        public static final int f13133 = 7;

        /* renamed from: ɾ  reason: contains not printable characters */
        public static final int f13134 = 9;

        /* renamed from: Ι  reason: contains not printable characters */
        public static final int f13135 = 0;

        /* renamed from: ι  reason: contains not printable characters */
        public static final int f13136 = 3;

        /* renamed from: І  reason: contains not printable characters */
        public static final int f13137 = 5;

        /* renamed from: і  reason: contains not printable characters */
        public static final int f13138 = 8;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public static final int f13139 = 4;

        /* renamed from: ӏ  reason: contains not printable characters */
        public static final int f13140 = 11;
    }

    /* renamed from: o.Ӏǃ$if  reason: invalid class name */
    public static final class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        public final PointF f13123;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final PointF f13124;

        /* renamed from: ι  reason: contains not printable characters */
        public final PointF f13125;

        public Cif() {
            this.f13123 = new PointF();
            this.f13124 = new PointF();
            this.f13125 = new PointF();
        }

        public Cif(PointF pointF, PointF pointF2, PointF pointF3) {
            this.f13123 = pointF;
            this.f13124 = pointF2;
            this.f13125 = pointF3;
        }
    }

    /* renamed from: o.Ӏǃ$ɩ  reason: contains not printable characters */
    public static final class C2774 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private static Boolean f13141;

        /* renamed from: Ι  reason: contains not printable characters */
        private static Context f13142;

        /* renamed from: ı  reason: contains not printable characters */
        public final List<C0742<C2864.Cif, Path>> f13143;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final List<C0742<Integer, Integer>> f13144;

        /* renamed from: ι  reason: contains not printable characters */
        public final List<C1463> f13145;

        public C2774(List<C1463> list) {
            this.f13145 = list;
            this.f13143 = new ArrayList(list.size());
            this.f13144 = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                this.f13143.add(new C1084(list.get(i).f7880.f7684));
                this.f13144.add(new C0865(list.get(i).f7883.f7684));
            }
        }

        public C2774() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:20|21|22|23) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0046 */
        /* renamed from: Ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static synchronized boolean m14663(android.content.Context r4) {
            /*
                java.lang.Class<o.Ӏǃ$ɩ> r0 = o.C2771.C2774.class
                monitor-enter(r0)
                android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x0054 }
                android.content.Context r2 = f13142     // Catch:{ all -> 0x0054 }
                if (r2 == 0) goto L_0x001b
                java.lang.Boolean r2 = f13141     // Catch:{ all -> 0x0054 }
                if (r2 == 0) goto L_0x001b
                android.content.Context r2 = f13142     // Catch:{ all -> 0x0054 }
                if (r2 != r1) goto L_0x001b
                java.lang.Boolean r4 = f13141     // Catch:{ all -> 0x0054 }
                boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0054 }
                monitor-exit(r0)
                return r4
            L_0x001b:
                r2 = 0
                f13141 = r2     // Catch:{ all -> 0x0054 }
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0054 }
                r3 = 26
                if (r2 < r3) goto L_0x0026
                r2 = 1
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                if (r2 == 0) goto L_0x0038
                android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x0054 }
                boolean r4 = r4.isInstantApp()     // Catch:{ all -> 0x0054 }
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0054 }
                f13141 = r4     // Catch:{ all -> 0x0054 }
                goto L_0x004a
            L_0x0038:
                java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0046 }
                java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
                r4.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x0046 }
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0046 }
                f13141 = r4     // Catch:{ ClassNotFoundException -> 0x0046 }
                goto L_0x004a
            L_0x0046:
                java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0054 }
                f13141 = r4     // Catch:{ all -> 0x0054 }
            L_0x004a:
                f13142 = r1     // Catch:{ all -> 0x0054 }
                java.lang.Boolean r4 = f13141     // Catch:{ all -> 0x0054 }
                boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0054 }
                monitor-exit(r0)
                return r4
            L_0x0054:
                r4 = move-exception
                monitor-exit(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C2771.C2774.m14663(android.content.Context):boolean");
        }
    }

    /* renamed from: o.Ӏǃ$ı  reason: contains not printable characters */
    public static final class C2772 {

        /* renamed from: ɩ  reason: contains not printable characters */
        public List<C0851> f13126 = new ArrayList();

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m14662(Path path) {
            for (int size = this.f13126.size() - 1; size >= 0; size--) {
                C2467.m12708(path, this.f13126.get(size));
            }
        }
    }

    /* renamed from: o.Ӏǃ$If */
    public static final class If {

        /* renamed from: І  reason: contains not printable characters */
        private static final char[] f13116 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        /* renamed from: і  reason: contains not printable characters */
        private static final char[] f13117 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        /* renamed from: ı  reason: contains not printable characters */
        public final String f13118;

        /* renamed from: ǃ  reason: contains not printable characters */
        public Bitmap f13119;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int f13120;

        /* renamed from: Ι  reason: contains not printable characters */
        public final int f13121;

        /* renamed from: ι  reason: contains not printable characters */
        public final String f13122;

        public If(int i, int i2, String str, String str2) {
            this.f13120 = i;
            this.f13121 = i2;
            this.f13122 = str;
            this.f13118 = str2;
        }

        public If() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public static String m14660(byte[] bArr) {
            int length = bArr.length;
            StringBuilder sb = new StringBuilder(length << 1);
            for (int i = 0; i < length; i++) {
                sb.append(f13117[(bArr[i] & 240) >>> 4]);
                sb.append(f13117[bArr[i] & 15]);
            }
            return sb.toString();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static String m14661(byte[] bArr) {
            char[] cArr = new char[(bArr.length << 1)];
            int i = 0;
            for (byte b : bArr) {
                byte b2 = b & 255;
                int i2 = i + 1;
                char[] cArr2 = f13116;
                cArr[i] = cArr2[b2 >>> 4];
                i = i2 + 1;
                cArr[i2] = cArr2[b2 & 15];
            }
            return new String(cArr);
        }
    }
}
