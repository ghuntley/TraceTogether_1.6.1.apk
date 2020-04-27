package o;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import o.C2383;
import o.C2715;

/* renamed from: o.ιɔ  reason: contains not printable characters */
public final class C1982 implements C2218<C2715.Cif> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f9927;

    public C1982(int i) {
        this.f9927 = i;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m10774(C2715.Cif ifVar, List<Float> list) {
        double d;
        C2715.Cif ifVar2 = ifVar;
        List<Float> list2 = list;
        int i = this.f9927 << 2;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) list2.get(i).floatValue();
                } else {
                    dArr2[i2] = (double) list2.get(i).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < ifVar2.f12563.length; i3++) {
                int i4 = ifVar2.f12563[i3];
                double d2 = (double) ifVar2.f12564[i3];
                int i5 = 1;
                while (true) {
                    if (i5 >= dArr.length) {
                        d = dArr2[dArr2.length - 1];
                        break;
                    }
                    int i6 = i5 - 1;
                    double d3 = dArr[i6];
                    double d4 = dArr[i5];
                    if (dArr[i5] >= d2) {
                        d = C2493.m13244(dArr2[i6], dArr2[i5], (d2 - d3) / (d4 - d3));
                        break;
                    }
                    i5++;
                }
                ifVar2.f12563[i3] = Color.argb((int) (d * 255.0d), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m10775(C2383 r13, float f) {
        ArrayList arrayList = new ArrayList();
        boolean z = r13.m12390() == C2383.C2384.BEGIN_ARRAY;
        if (z) {
            r13.m12388();
        }
        while (r13.m12383()) {
            arrayList.add(Float.valueOf((float) r13.m12387()));
        }
        if (z) {
            r13.m12386();
        }
        if (this.f9927 == -1) {
            this.f9927 = arrayList.size() / 4;
        }
        int i = this.f9927;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < (this.f9927 << 2); i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        C2715.Cif ifVar = new C2715.Cif(fArr, iArr);
        m10774(ifVar, arrayList);
        return ifVar;
    }
}
