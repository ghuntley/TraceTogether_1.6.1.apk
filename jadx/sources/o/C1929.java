package o;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C1866;
import o.C2745;

/* renamed from: o.γ  reason: contains not printable characters */
public class C1929 {

    /* renamed from: ı  reason: contains not printable characters */
    static final Object f9737 = new Object();

    /* renamed from: ǃ  reason: contains not printable characters */
    static final C0910<String, ArrayList<C1866.C1867<C1930>>> f9738 = new C0910<>();

    /* renamed from: ɩ  reason: contains not printable characters */
    static final C0783<String, Typeface> f9739 = new C0783<>(16);

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C1866 f9740 = new C1866("fonts");

    /* renamed from: ι  reason: contains not printable characters */
    private static final Comparator<byte[]> f9741 = new Comparator<byte[]>() {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: Ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(byte[] r5, byte[] r6) {
            /*
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                if (r0 == r1) goto L_0x0008
                int r5 = r5.length
                int r6 = r6.length
            L_0x0006:
                int r5 = r5 - r6
                return r5
            L_0x0008:
                r0 = 0
                r1 = 0
            L_0x000a:
                int r2 = r5.length
                if (r1 >= r2) goto L_0x001b
                byte r2 = r5[r1]
                byte r3 = r6[r1]
                if (r2 == r3) goto L_0x0018
                byte r5 = r5[r1]
                byte r6 = r6[r1]
                goto L_0x0006
            L_0x0018:
                int r1 = r1 + 1
                goto L_0x000a
            L_0x001b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1929.AnonymousClass1.compare(byte[], byte[]):int");
        }
    };

    /* renamed from: ɩ  reason: contains not printable characters */
    static C1930 m10535(Context context, C2745.C2748 r4, int i) {
        try {
            Cif r42 = m10534(context, (CancellationSignal) null, r4);
            int i2 = -3;
            if (r42.m10551() == 0) {
                Typeface r3 = C1173.m7684(context, (CancellationSignal) null, r42.m10550(), i);
                if (r3 != null) {
                    i2 = 0;
                }
                return new C1930(r3, i2);
            }
            if (r42.m10551() == 1) {
                i2 = -2;
            }
            return new C1930((Typeface) null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C1930((Typeface) null, -1);
        }
    }

    /* renamed from: o.γ$ɩ  reason: contains not printable characters */
    static final class C1930 {

        /* renamed from: ǃ  reason: contains not printable characters */
        final int f9756;

        /* renamed from: ι  reason: contains not printable characters */
        final Typeface f9757;

        C1930(Typeface typeface, int i) {
            this.f9757 = typeface;
            this.f9756 = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        r3 = f9740;
        r3.m10242(new o.C1866.AnonymousClass1(r3, r1, new android.os.Handler(), new o.C1929.AnonymousClass2()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0097, code lost:
        return null;
     */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m10536(final android.content.Context r2, final o.C2745.C2748 r3, final o.C0913.If r4, final android.os.Handler r5, boolean r6, int r7, final int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.f13047
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            o.ƭ<java.lang.String, android.graphics.Typeface> r1 = f9739
            java.lang.Object r1 = r1.m6126(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x0025
            r4.m6735((android.graphics.Typeface) r1)
        L_0x0025:
            return r1
        L_0x0026:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            o.γ$ɩ r2 = m10535((android.content.Context) r2, (o.C2745.C2748) r3, (int) r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.f9756
            if (r3 != 0) goto L_0x003b
            android.graphics.Typeface r3 = r2.f9757
            r4.m6733(r3, r5)
            goto L_0x0040
        L_0x003b:
            int r3 = r2.f9756
            r4.m6736(r3, r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.f9757
            return r2
        L_0x0043:
            o.γ$4 r1 = new o.γ$4
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            o.ΙІ r3 = f9740     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r3 = r3.m10243(r1, r7)     // Catch:{ InterruptedException -> 0x0055 }
            o.γ$ɩ r3 = (o.C1929.C1930) r3     // Catch:{ InterruptedException -> 0x0055 }
            android.graphics.Typeface r2 = r3.f9757     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            o.γ$5 r3 = new o.γ$5
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = f9737
            monitor-enter(r4)
            o.ǃɹ<java.lang.String, java.util.ArrayList<o.ΙІ$ǃ<o.γ$ɩ>>> r5 = f9738     // Catch:{ all -> 0x0098 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x0098 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0071
            r5.add(r3)     // Catch:{ all -> 0x0098 }
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x0098 }
            return r2
        L_0x0073:
            if (r3 == 0) goto L_0x0082
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0098 }
            r5.<init>()     // Catch:{ all -> 0x0098 }
            r5.add(r3)     // Catch:{ all -> 0x0098 }
            o.ǃɹ<java.lang.String, java.util.ArrayList<o.ΙІ$ǃ<o.γ$ɩ>>> r3 = f9738     // Catch:{ all -> 0x0098 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0098 }
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x0098 }
            o.ΙІ r3 = f9740
            o.γ$2 r4 = new o.γ$2
            r4.<init>(r0)
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            o.ΙІ$1 r6 = new o.ΙІ$1
            r6.<init>(r1, r5, r4)
            r3.m10242(r6)
            return r2
        L_0x0098:
            r2 = move-exception
            monitor-exit(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1929.m10536(android.content.Context, o.Ӏ$ɩ, o.ǃɿ$If, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: o.γ$If */
    public static class If {

        /* renamed from: ı  reason: contains not printable characters */
        private final int f9749;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Uri f9750;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final int f9751;

        /* renamed from: Ι  reason: contains not printable characters */
        private final int f9752;

        /* renamed from: ι  reason: contains not printable characters */
        private final boolean f9753;

        public If(Uri uri, int i, int i2, boolean z, int i3) {
            if (uri != null) {
                this.f9750 = uri;
                this.f9752 = i;
                this.f9749 = i2;
                this.f9753 = z;
                this.f9751 = i3;
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public Uri m10547() {
            return this.f9750;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public int m10546() {
            return this.f9752;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public int m10548() {
            return this.f9749;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public boolean m10545() {
            return this.f9753;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public int m10549() {
            return this.f9751;
        }
    }

    /* renamed from: o.γ$if  reason: invalid class name */
    public static class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        private final int f9754;

        /* renamed from: Ι  reason: contains not printable characters */
        private final If[] f9755;

        public Cif(int i, If[] ifArr) {
            this.f9754 = i;
            this.f9755 = ifArr;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public int m10551() {
            return this.f9754;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public If[] m10550() {
            return this.f9755;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static Map<Uri, ByteBuffer> m10538(Context context, If[] ifArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (If ifR : ifArr) {
            if (ifR.m10549() == 0) {
                Uri r3 = ifR.m10547();
                if (!hashMap.containsKey(r3)) {
                    hashMap.put(r3, C1189.m7729(context, cancellationSignal, r3));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Cif m10534(Context context, CancellationSignal cancellationSignal, C2745.C2748 r4) {
        ProviderInfo r0 = m10533(context.getPackageManager(), r4, context.getResources());
        if (r0 == null) {
            return new Cif(1, (If[]) null);
        }
        return new Cif(0, m10530(context, r4, r0.authority, cancellationSignal));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean m10532(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static List<byte[]> m10537(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static If[] m10530(Context context, C2745.C2748 r22, String str, CancellationSignal cancellationSignal) {
        Cursor cursor;
        Uri uri;
        C2745.C2748 r0 = r22;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor2 = null;
        try {
            if (Build.VERSION.SDK_INT > 16) {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{r0.f13044}, (String) null, cancellationSignal);
            } else {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{r0.f13044}, (String) null);
            }
            cursor2 = cursor;
            if (cursor2 != null && cursor2.getCount() > 0) {
                int columnIndex = cursor2.getColumnIndex("result_code");
                arrayList = new ArrayList();
                int columnIndex2 = cursor2.getColumnIndex("_id");
                int columnIndex3 = cursor2.getColumnIndex("file_id");
                int columnIndex4 = cursor2.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor2.getColumnIndex("font_weight");
                int columnIndex6 = cursor2.getColumnIndex("font_italic");
                while (cursor2.moveToNext()) {
                    int i = columnIndex != -1 ? cursor2.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursor2.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        uri = ContentUris.withAppendedId(build, cursor2.getLong(columnIndex2));
                    } else {
                        uri = ContentUris.withAppendedId(build2, cursor2.getLong(columnIndex3));
                    }
                    arrayList.add(new If(uri, i2, columnIndex5 != -1 ? cursor2.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor2.getInt(columnIndex6) == 1, i));
                }
            }
            return (If[]) arrayList.toArray(new If[0]);
        } finally {
            if (cursor2 != null) {
                cursor2.close();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static ProviderInfo m10533(PackageManager packageManager, C2745.C2748 r6, Resources resources) {
        String str = r6.f13042;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: ".concat(String.valueOf(str)));
        } else if (resolveContentProvider.packageName.equals(r6.f13043)) {
            List<byte[]> r5 = m10537(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(r5, f9741);
            List<List<byte[]>> r62 = m10531(r6, resources);
            for (int i = 0; i < r62.size(); i++) {
                ArrayList arrayList = new ArrayList(r62.get(i));
                Collections.sort(arrayList, f9741);
                if (m10532(r5, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            StringBuilder sb = new StringBuilder("Found content provider ");
            sb.append(str);
            sb.append(", but package was not ");
            sb.append(r6.f13043);
            throw new PackageManager.NameNotFoundException(sb.toString());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static List<List<byte[]>> m10531(C2745.C2748 r1, Resources resources) {
        if (r1.f13046 != null) {
            return r1.f13046;
        }
        return C0904.m6695(resources, r1.f13045);
    }
}
