package o;

import android.graphics.Color;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C1685;
import o.C2383;

/* renamed from: o.ιс  reason: contains not printable characters */
public final class C2056 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C2383.C2385 f10112 = C2383.C2385.m12397("d", "a");

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C2383.C2385 f10113 = C2383.C2385.m12397("nm");

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2383.C2385 f10114 = C2383.C2385.m12397("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1685 m10951(C2383 r38, C0343 r39) {
        float f;
        ArrayList arrayList;
        C2383 r0 = r38;
        C0343 r7 = r39;
        C1685.C1686 r1 = C1685.C1686.NONE;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        r38.m12391();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        C1685.C1686 r29 = r1;
        C1685.If ifR = null;
        String str = null;
        C1360 r30 = null;
        C1435 r31 = null;
        C2724 r32 = null;
        C1282 r33 = null;
        long j = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 1.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f5 = 0.0f;
        boolean z = false;
        long j2 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (r38.m12383()) {
            switch (r0.m12385(f10114)) {
                case 0:
                    str3 = r38.m12384();
                    break;
                case 1:
                    j2 = (long) r38.m12389();
                    break;
                case 2:
                    str = r38.m12384();
                    break;
                case 3:
                    int r4 = r38.m12389();
                    if (r4 >= C1685.If.UNKNOWN.ordinal()) {
                        ifR = C1685.If.UNKNOWN;
                        break;
                    } else {
                        ifR = C1685.If.values()[r4];
                        break;
                    }
                case 4:
                    j = (long) r38.m12389();
                    break;
                case 5:
                    i = (int) (((float) r38.m12389()) * C2467.m12711());
                    break;
                case 6:
                    i2 = (int) (((float) r38.m12389()) * C2467.m12711());
                    break;
                case 7:
                    i3 = Color.parseColor(r38.m12384());
                    break;
                case 8:
                    r30 = C1812.m10011(r38, r39);
                    break;
                case 9:
                    r29 = C1685.C1686.values()[r38.m12389()];
                    r7.f3736++;
                    break;
                case 10:
                    r38.m12388();
                    while (r38.m12383()) {
                        arrayList2.add(C2066.m10991(r38, r39));
                    }
                    r7.f3736 += arrayList2.size();
                    r38.m12386();
                    break;
                case 11:
                    r38.m12388();
                    while (r38.m12383()) {
                        C1455 r42 = C1791.m9954(r38, r39);
                        if (r42 != null) {
                            arrayList3.add(r42);
                        }
                    }
                    r38.m12386();
                    break;
                case 12:
                    r38.m12391();
                    while (r38.m12383()) {
                        int r43 = r0.m12385(f10112);
                        if (r43 == 0) {
                            r31 = new C1435(C2040.m10922(r0, r7, 1.0f, C1793.f9201));
                        } else if (r43 != 1) {
                            r38.m12393();
                            r38.m12396();
                        } else {
                            r38.m12388();
                            if (r38.m12383()) {
                                r32 = C1773.m9886(r38, r39);
                            }
                            while (r38.m12383()) {
                                r38.m12396();
                            }
                            r38.m12386();
                        }
                    }
                    r38.m12392();
                    break;
                case 13:
                    r38.m12388();
                    ArrayList arrayList4 = new ArrayList();
                    while (r38.m12383()) {
                        r38.m12391();
                        while (r38.m12383()) {
                            if (r0.m12385(f10113) != 0) {
                                r38.m12393();
                                r38.m12396();
                            } else {
                                arrayList4.add(r38.m12384());
                            }
                        }
                        r38.m12392();
                    }
                    r38.m12386();
                    String concat = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList4));
                    C2414.m12460(concat);
                    r7.f3722.add(concat);
                    break;
                case 14:
                    f4 = (float) r38.m12387();
                    break;
                case 15:
                    f5 = (float) r38.m12387();
                    break;
                case 16:
                    i4 = (int) (((float) r38.m12389()) * C2467.m12711());
                    break;
                case 17:
                    i5 = (int) (((float) r38.m12389()) * C2467.m12711());
                    break;
                case 18:
                    f2 = (float) r38.m12387();
                    break;
                case 19:
                    f3 = (float) r38.m12387();
                    break;
                case 20:
                    r33 = C2745.m14540(r38, r39);
                    break;
                case 21:
                    str2 = r38.m12384();
                    break;
                case 22:
                    z = r38.m12394();
                    break;
                default:
                    r38.m12393();
                    r38.m12396();
                    break;
            }
        }
        r38.m12392();
        float f6 = f2 / f4;
        float f7 = f3 / f4;
        ArrayList arrayList5 = new ArrayList();
        if (f6 > 0.0f) {
            C2463 r11 = r0;
            f = f4;
            arrayList = arrayList5;
            C2463 r02 = new C2463(r39, valueOf2, valueOf2, (Interpolator) null, 0.0f, Float.valueOf(f6));
            arrayList.add(r11);
        } else {
            f = f4;
            arrayList = arrayList5;
        }
        if (f7 <= 0.0f) {
            f7 = r7.f3730;
        }
        C0343 r12 = r39;
        arrayList.add(new C2463(r12, valueOf, valueOf, (Interpolator) null, f6, Float.valueOf(f7)));
        arrayList.add(new C2463(r12, valueOf2, valueOf2, (Interpolator) null, f7, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            C2414.m12460("Convert your Illustrator layers to shape layers.");
            r7.f3722.add("Convert your Illustrator layers to shape layers.");
        }
        return new C1685(arrayList3, r39, str3, j2, ifR, j, str, arrayList2, r30, i, i2, i3, f, f5, i4, i5, r31, r32, arrayList, r29, r33, z);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C1685 m10952(C0343 r26) {
        Rect rect = r26.f3729;
        List emptyList = Collections.emptyList();
        C1685.If ifR = C1685.If.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        C1360 r11 = r4;
        C1360 r4 = new C1360();
        return new C1685(emptyList, r26, "__container", -1, ifR, -1, (String) null, emptyList2, r11, 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), (C1435) null, (C2724) null, Collections.emptyList(), C1685.C1686.NONE, (C1282) null, false);
    }
}
