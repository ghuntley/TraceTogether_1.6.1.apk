package o;

import android.database.Cursor;
import android.util.Base64;
import java.util.ArrayList;
import o.C2174;
import o.C2291;
import o.C2622;
import o.C2745;

/* renamed from: o.ιј  reason: contains not printable characters */
public final class C2066 implements C2622.C2624 {

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C2066 f10138 = new C2066();

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0085  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static o.C1463 m10991(o.C2383 r12, o.C0343 r13) {
        /*
            r12.m12391()
            r0 = 0
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = 0
        L_0x0008:
            boolean r5 = r12.m12383()
            if (r5 == 0) goto L_0x0101
            java.lang.String r5 = r12.m12395()
            int r6 = r5.hashCode()
            r7 = 111(0x6f, float:1.56E-43)
            r8 = -1
            r9 = 3
            r10 = 2
            r11 = 1
            if (r6 == r7) goto L_0x004b
            r7 = 3588(0xe04, float:5.028E-42)
            if (r6 == r7) goto L_0x0041
            r7 = 104433(0x197f1, float:1.46342E-40)
            if (r6 == r7) goto L_0x0037
            r7 = 3357091(0x3339a3, float:4.704286E-39)
            if (r6 == r7) goto L_0x002d
            goto L_0x0055
        L_0x002d:
            java.lang.String r6 = "mode"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0055
            r6 = 0
            goto L_0x0056
        L_0x0037:
            java.lang.String r6 = "inv"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0055
            r6 = 3
            goto L_0x0056
        L_0x0041:
            java.lang.String r6 = "pt"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0055
            r6 = 1
            goto L_0x0056
        L_0x004b:
            java.lang.String r6 = "o"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0055
            r6 = 2
            goto L_0x0056
        L_0x0055:
            r6 = -1
        L_0x0056:
            if (r6 == 0) goto L_0x0085
            if (r6 == r11) goto L_0x0075
            if (r6 == r10) goto L_0x0067
            if (r6 == r9) goto L_0x0062
            r12.m12396()
            goto L_0x0008
        L_0x0062:
            boolean r4 = r12.m12394()
            goto L_0x0008
        L_0x0067:
            o.ɩɺ r3 = new o.ɩɺ
            o.ιɺ r5 = o.C1997.f9939
            r6 = 1065353216(0x3f800000, float:1.0)
            java.util.List r5 = o.C2040.m10922(r12, r13, r6, r5)
            r3.<init>(r5)
            goto L_0x0008
        L_0x0075:
            o.ɩЈ r2 = new o.ɩЈ
            float r5 = o.C2467.m12711()
            o.ϥ r6 = o.C2157.f10322
            java.util.List r5 = o.C2040.m10922(r12, r13, r5, r6)
            r2.<init>(r5)
            goto L_0x0008
        L_0x0085:
            java.lang.String r1 = r12.m12384()
            int r6 = r1.hashCode()
            r7 = 97
            if (r6 == r7) goto L_0x00bc
            r7 = 105(0x69, float:1.47E-43)
            if (r6 == r7) goto L_0x00b2
            r7 = 110(0x6e, float:1.54E-43)
            if (r6 == r7) goto L_0x00a8
            r7 = 115(0x73, float:1.61E-43)
            if (r6 == r7) goto L_0x009e
            goto L_0x00c5
        L_0x009e:
            java.lang.String r6 = "s"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00c5
            r8 = 1
            goto L_0x00c5
        L_0x00a8:
            java.lang.String r6 = "n"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00c5
            r8 = 2
            goto L_0x00c5
        L_0x00b2:
            java.lang.String r6 = "i"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00c5
            r8 = 3
            goto L_0x00c5
        L_0x00bc:
            java.lang.String r6 = "a"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00c5
            r8 = 0
        L_0x00c5:
            if (r8 == 0) goto L_0x00fd
            if (r8 == r11) goto L_0x00f9
            if (r8 == r10) goto L_0x00f5
            if (r8 == r9) goto L_0x00e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "Unknown mask mode "
            r1.<init>(r6)
            r1.append(r5)
            java.lang.String r5 = ". Defaulting to Add."
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            o.C2414.m12460(r1)
            o.ɹȷ$If r1 = o.C1463.If.MASK_MODE_ADD
            goto L_0x0008
        L_0x00e7:
            java.lang.String r1 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            o.C2414.m12460(r1)
            java.util.HashSet<java.lang.String> r5 = r13.f3722
            r5.add(r1)
            o.ɹȷ$If r1 = o.C1463.If.MASK_MODE_INTERSECT
            goto L_0x0008
        L_0x00f5:
            o.ɹȷ$If r1 = o.C1463.If.MASK_MODE_NONE
            goto L_0x0008
        L_0x00f9:
            o.ɹȷ$If r1 = o.C1463.If.MASK_MODE_SUBTRACT
            goto L_0x0008
        L_0x00fd:
            o.ɹȷ$If r1 = o.C1463.If.MASK_MODE_ADD
            goto L_0x0008
        L_0x0101:
            r12.m12392()
            o.ɹȷ r12 = new o.ɹȷ
            r12.<init>(r1, r2, r3, r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2066.m10991(o.а, o.ıɭ):o.ɹȷ");
    }

    private C2066() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m10992(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            C2174.C2175 r1 = new C2174.C2175();
            C1766 r2 = C1766.DEFAULT;
            if (r2 != null) {
                r1.f10356 = r2;
                C2291.C2292 r12 = r1.m11963(cursor.getString(1)).m11964(C2745.C3657iF.m14549(cursor.getInt(2)));
                String string = cursor.getString(3);
                arrayList.add(r12.m11965(string == null ? null : Base64.decode(string, 0)).m11962());
            } else {
                throw new NullPointerException("Null priority");
            }
        }
        return arrayList;
    }
}
