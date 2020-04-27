package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.SparseIntArray;
import android.view.View;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.C2425;
import o.C2512;
import o.C2724;

/* renamed from: o.іι  reason: contains not printable characters */
public class C2597 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static SparseIntArray f11767;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final int[] f11768 = {0, 4, 8};

    /* renamed from: ι  reason: contains not printable characters */
    HashMap<Integer, C2598> f11769 = new HashMap<>();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11767 = sparseIntArray;
        sparseIntArray.append(C2724.C2725.f12700, 25);
        f11767.append(C2724.C2725.f12706, 26);
        f11767.append(C2724.C2725.f12722, 29);
        f11767.append(C2724.C2725.f12717, 30);
        f11767.append(C2724.C2725.f12589, 36);
        f11767.append(C2724.C2725.f12598, 35);
        f11767.append(C2724.C2725.f12623, 4);
        f11767.append(C2724.C2725.f12596, 3);
        f11767.append(C2724.C2725.f12619, 1);
        f11767.append(C2724.C2725.f12634, 6);
        f11767.append(C2724.C2725.f12627, 7);
        f11767.append(C2724.C2725.f12673, 17);
        f11767.append(C2724.C2725.f12672, 18);
        f11767.append(C2724.C2725.f12681, 19);
        f11767.append(C2724.C2725.f12674, 27);
        f11767.append(C2724.C2725.f12707, 32);
        f11767.append(C2724.C2725.f12719, 33);
        f11767.append(C2724.C2725.f12680, 10);
        f11767.append(C2724.C2725.f12675, 9);
        f11767.append(C2724.C2725.f12618, 13);
        f11767.append(C2724.C2725.f12644, 16);
        f11767.append(C2724.C2725.f12645, 14);
        f11767.append(C2724.C2725.f12633, 11);
        f11767.append(C2724.C2725.f12642, 15);
        f11767.append(C2724.C2725.f12624, 12);
        f11767.append(C2724.C2725.f12607, 40);
        f11767.append(C2724.C2725.f12697, 39);
        f11767.append(C2724.C2725.f12703, 41);
        f11767.append(C2724.C2725.f12724, 42);
        f11767.append(C2724.C2725.f12695, 20);
        f11767.append(C2724.C2725.f12592, 37);
        f11767.append(C2724.C2725.f12641, 5);
        f11767.append(C2724.C2725.f12704, 75);
        f11767.append(C2724.C2725.f12604, 75);
        f11767.append(C2724.C2725.f12716, 75);
        f11767.append(C2724.C2725.f12597, 75);
        f11767.append(C2724.C2725.f12621, 75);
        f11767.append(C2724.C2725.f12594, 24);
        f11767.append(C2724.C2725.f12639, 28);
        f11767.append(C2724.C2725.f12713, 31);
        f11767.append(C2724.C2725.f12712, 8);
        f11767.append(C2724.C2725.f12647, 34);
        f11767.append(C2724.C2725.f12654, 2);
        f11767.append(C2724.C2725.f12599, 23);
        f11767.append(C2724.C2725.f12617, 21);
        f11767.append(C2724.C2725.f12600, 22);
        f11767.append(C2724.C2725.f12626, 43);
        f11767.append(C2724.C2725.f12593, 44);
        f11767.append(C2724.C2725.f12709, 45);
        f11767.append(C2724.C2725.f12710, 46);
        f11767.append(C2724.C2725.f12687, 60);
        f11767.append(C2724.C2725.f12660, 47);
        f11767.append(C2724.C2725.f12679, 48);
        f11767.append(C2724.C2725.f12640, 49);
        f11767.append(C2724.C2725.f12676, 50);
        f11767.append(C2724.C2725.f12678, 51);
        f11767.append(C2724.C2725.f12659, 52);
        f11767.append(C2724.C2725.f12723, 53);
        f11767.append(C2724.C2725.f12610, 54);
        f11767.append(C2724.C2725.f12692, 55);
        f11767.append(C2724.C2725.f12606, 56);
        f11767.append(C2724.C2725.f12682, 57);
        f11767.append(C2724.C2725.f12611, 58);
        f11767.append(C2724.C2725.f12685, 59);
        f11767.append(C2724.C2725.f12648, 61);
        f11767.append(C2724.C2725.f12643, 62);
        f11767.append(C2724.C2725.f12636, 63);
        f11767.append(C2724.C2725.f12620, 38);
        f11767.append(C2724.C2725.f12615, 69);
        f11767.append(C2724.C2725.f12691, 70);
        f11767.append(C2724.C2725.f12721, 71);
        f11767.append(C2724.C2725.f12714, 72);
        f11767.append(C2724.C2725.f12622, 73);
        f11767.append(C2724.C2725.f12595, 74);
    }

    /* renamed from: o.іι$ǃ  reason: contains not printable characters */
    static class C2598 {

        /* renamed from: ı  reason: contains not printable characters */
        boolean f11770;

        /* renamed from: ıı  reason: contains not printable characters */
        public float f11771;

        /* renamed from: ıǃ  reason: contains not printable characters */
        public float f11772;

        /* renamed from: ıɩ  reason: contains not printable characters */
        public int[] f11773;

        /* renamed from: ıι  reason: contains not printable characters */
        private int f11774;

        /* renamed from: ĸ  reason: contains not printable characters */
        public String f11775;

        /* renamed from: Ŀ  reason: contains not printable characters */
        private int f11776;

        /* renamed from: ŀ  reason: contains not printable characters */
        public int f11777;

        /* renamed from: ł  reason: contains not printable characters */
        public int f11778;

        /* renamed from: ſ  reason: contains not printable characters */
        public int f11779;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public int f11780;

        /* renamed from: Ɨ  reason: contains not printable characters */
        public float f11781;

        /* renamed from: ƚ  reason: contains not printable characters */
        public String f11782;

        /* renamed from: ǀ  reason: contains not printable characters */
        public float f11783;

        /* renamed from: ǃ  reason: contains not printable characters */
        public int f11784;

        /* renamed from: ǃı  reason: contains not printable characters */
        public float f11785;

        /* renamed from: ǃǃ  reason: contains not printable characters */
        public float f11786;

        /* renamed from: ǃɩ  reason: contains not printable characters */
        private boolean f11787;

        /* renamed from: ǃι  reason: contains not printable characters */
        private boolean f11788;

        /* renamed from: ȷ  reason: contains not printable characters */
        public int f11789;

        /* renamed from: Ƚ  reason: contains not printable characters */
        private int f11790;

        /* renamed from: ɂ  reason: contains not printable characters */
        public float f11791;

        /* renamed from: Ɉ  reason: contains not printable characters */
        public float f11792;

        /* renamed from: ɉ  reason: contains not printable characters */
        public float f11793;

        /* renamed from: ɍ  reason: contains not printable characters */
        public int f11794;

        /* renamed from: ɔ  reason: contains not printable characters */
        public int f11795;

        /* renamed from: ɟ  reason: contains not printable characters */
        public int f11796;

        /* renamed from: ɨ  reason: contains not printable characters */
        public int f11797;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f11798;

        /* renamed from: ɩı  reason: contains not printable characters */
        private int f11799;

        /* renamed from: ɩǃ  reason: contains not printable characters */
        private int f11800;

        /* renamed from: ɪ  reason: contains not printable characters */
        public int f11801;

        /* renamed from: ɭ  reason: contains not printable characters */
        public int f11802;

        /* renamed from: ɹ  reason: contains not printable characters */
        public int f11803;

        /* renamed from: ɺ  reason: contains not printable characters */
        public int f11804;

        /* renamed from: ɻ  reason: contains not printable characters */
        public int f11805;

        /* renamed from: ɼ  reason: contains not printable characters */
        public int f11806;

        /* renamed from: ɽ  reason: contains not printable characters */
        private int f11807;

        /* renamed from: ɾ  reason: contains not printable characters */
        public int f11808;

        /* renamed from: ɿ  reason: contains not printable characters */
        public int f11809;

        /* renamed from: ʃ  reason: contains not printable characters */
        public float f11810;

        /* renamed from: ʅ  reason: contains not printable characters */
        public float f11811;

        /* renamed from: ʌ  reason: contains not printable characters */
        public float f11812;

        /* renamed from: ʏ  reason: contains not printable characters */
        public float f11813;

        /* renamed from: ʔ  reason: contains not printable characters */
        public float f11814;

        /* renamed from: ʕ  reason: contains not printable characters */
        public int f11815;

        /* renamed from: ʖ  reason: contains not printable characters */
        public int f11816;

        /* renamed from: ʟ  reason: contains not printable characters */
        public int f11817;

        /* renamed from: ͻ  reason: contains not printable characters */
        public int f11818;

        /* renamed from: ͼ  reason: contains not printable characters */
        public float f11819;

        /* renamed from: ͽ  reason: contains not printable characters */
        public float f11820;

        /* renamed from: Γ  reason: contains not printable characters */
        public float f11821;

        /* renamed from: Ι  reason: contains not printable characters */
        public int f11822;

        /* renamed from: Ξ  reason: contains not printable characters */
        public float f11823;

        /* renamed from: ι  reason: contains not printable characters */
        public int f11824;

        /* renamed from: ς  reason: contains not printable characters */
        public int f11825;

        /* renamed from: τ  reason: contains not printable characters */
        public int f11826;

        /* renamed from: ϛ  reason: contains not printable characters */
        public boolean f11827;

        /* renamed from: ϲ  reason: contains not printable characters */
        public int f11828;

        /* renamed from: ϳ  reason: contains not printable characters */
        public int f11829;

        /* renamed from: І  reason: contains not printable characters */
        public int f11830;

        /* renamed from: Ј  reason: contains not printable characters */
        public int f11831;

        /* renamed from: Г  reason: contains not printable characters */
        public boolean f11832;

        /* renamed from: г  reason: contains not printable characters */
        public int f11833;

        /* renamed from: с  reason: contains not printable characters */
        public int f11834;

        /* renamed from: т  reason: contains not printable characters */
        public int f11835;

        /* renamed from: х  reason: contains not printable characters */
        public int f11836;

        /* renamed from: ч  reason: contains not printable characters */
        public int f11837;

        /* renamed from: і  reason: contains not printable characters */
        public float f11838;

        /* renamed from: ј  reason: contains not printable characters */
        public int f11839;

        /* renamed from: ґ  reason: contains not printable characters */
        public int f11840;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public int f11841;

        /* renamed from: ӏ  reason: contains not printable characters */
        public int f11842;

        /* renamed from: ӷ  reason: contains not printable characters */
        public float f11843;

        private C2598() {
            this.f11770 = false;
            this.f11824 = -1;
            this.f11780 = -1;
            this.f11838 = -1.0f;
            this.f11841 = -1;
            this.f11830 = -1;
            this.f11803 = -1;
            this.f11801 = -1;
            this.f11789 = -1;
            this.f11797 = -1;
            this.f11808 = -1;
            this.f11842 = -1;
            this.f11817 = -1;
            this.f11833 = -1;
            this.f11778 = -1;
            this.f11777 = -1;
            this.f11809 = -1;
            this.f11781 = 0.5f;
            this.f11811 = 0.5f;
            this.f11782 = null;
            this.f11794 = -1;
            this.f11779 = 0;
            this.f11783 = 0.0f;
            this.f11806 = -1;
            this.f11795 = -1;
            this.f11796 = -1;
            this.f11804 = -1;
            this.f11831 = -1;
            this.f11829 = -1;
            this.f11834 = -1;
            this.f11828 = -1;
            this.f11818 = -1;
            this.f11835 = 0;
            this.f11836 = -1;
            this.f11839 = -1;
            this.f11840 = -1;
            this.f11802 = -1;
            this.f11805 = -1;
            this.f11815 = -1;
            this.f11813 = 0.0f;
            this.f11814 = 0.0f;
            this.f11816 = 0;
            this.f11826 = 0;
            this.f11771 = 1.0f;
            this.f11832 = false;
            this.f11843 = 0.0f;
            this.f11821 = 0.0f;
            this.f11791 = 0.0f;
            this.f11792 = 0.0f;
            this.f11785 = 1.0f;
            this.f11786 = 1.0f;
            this.f11772 = Float.NaN;
            this.f11810 = Float.NaN;
            this.f11812 = 0.0f;
            this.f11819 = 0.0f;
            this.f11793 = 0.0f;
            this.f11787 = false;
            this.f11788 = false;
            this.f11776 = 0;
            this.f11774 = 0;
            this.f11800 = -1;
            this.f11790 = -1;
            this.f11807 = -1;
            this.f11799 = -1;
            this.f11820 = 1.0f;
            this.f11823 = 1.0f;
            this.f11827 = false;
            this.f11825 = -1;
            this.f11837 = -1;
        }

        /* synthetic */ C2598(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m13774(int i, C2425.C2426 r2) {
            m13773(i, (C2512.C2513) r2);
            this.f11771 = r2.f11052;
            this.f11821 = r2.f11045;
            this.f11791 = r2.f11044;
            this.f11792 = r2.f11047;
            this.f11785 = r2.f11046;
            this.f11786 = r2.f11043;
            this.f11772 = r2.f11049;
            this.f11810 = r2.f11050;
            this.f11812 = r2.f11048;
            this.f11819 = r2.f11051;
            this.f11793 = 0.0f;
            this.f11843 = r2.f11053;
            this.f11832 = r2.f11042;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private void m13773(int i, C2512.C2513 r3) {
            this.f11798 = i;
            this.f11841 = r3.f11407;
            this.f11830 = r3.f11408;
            this.f11803 = r3.f11371;
            this.f11801 = r3.f11421;
            this.f11789 = r3.f11389;
            this.f11797 = r3.f11424;
            this.f11808 = r3.f11414;
            this.f11842 = r3.f11378;
            this.f11817 = r3.f11387;
            this.f11833 = r3.f11402;
            this.f11778 = r3.f11417;
            this.f11777 = r3.f11368;
            this.f11809 = r3.f11369;
            this.f11781 = r3.f11392;
            this.f11811 = r3.f11390;
            this.f11782 = r3.f11374;
            this.f11794 = r3.f11385;
            this.f11779 = r3.f11425;
            this.f11783 = r3.f11393;
            this.f11806 = r3.f11398;
            this.f11795 = r3.f11401;
            this.f11796 = r3.f11399;
            this.f11838 = r3.f11375;
            this.f11824 = r3.f11386;
            this.f11780 = r3.f11365;
            this.f11784 = r3.width;
            this.f11822 = r3.height;
            this.f11804 = r3.leftMargin;
            this.f11831 = r3.rightMargin;
            this.f11829 = r3.topMargin;
            this.f11834 = r3.bottomMargin;
            this.f11813 = r3.f11384;
            this.f11814 = r3.f11383;
            this.f11826 = r3.f11412;
            this.f11816 = r3.f11403;
            this.f11787 = r3.f11400;
            this.f11788 = r3.f11391;
            this.f11776 = r3.f11415;
            this.f11774 = r3.f11413;
            this.f11787 = r3.f11400;
            this.f11800 = r3.f11419;
            this.f11790 = r3.f11423;
            this.f11807 = r3.f11418;
            this.f11799 = r3.f11422;
            this.f11820 = r3.f11420;
            this.f11823 = r3.f11388;
            if (Build.VERSION.SDK_INT >= 17) {
                this.f11828 = r3.getMarginEnd();
                this.f11818 = r3.getMarginStart();
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m13775(C2512.C2513 r3) {
            r3.f11407 = this.f11841;
            r3.f11408 = this.f11830;
            r3.f11371 = this.f11803;
            r3.f11421 = this.f11801;
            r3.f11389 = this.f11789;
            r3.f11424 = this.f11797;
            r3.f11414 = this.f11808;
            r3.f11378 = this.f11842;
            r3.f11387 = this.f11817;
            r3.f11402 = this.f11833;
            r3.f11417 = this.f11778;
            r3.f11368 = this.f11777;
            r3.f11369 = this.f11809;
            r3.leftMargin = this.f11804;
            r3.rightMargin = this.f11831;
            r3.topMargin = this.f11829;
            r3.bottomMargin = this.f11834;
            r3.f11372 = this.f11815;
            r3.f11370 = this.f11805;
            r3.f11392 = this.f11781;
            r3.f11390 = this.f11811;
            r3.f11385 = this.f11794;
            r3.f11425 = this.f11779;
            r3.f11393 = this.f11783;
            r3.f11374 = this.f11782;
            r3.f11398 = this.f11806;
            r3.f11401 = this.f11795;
            r3.f11384 = this.f11813;
            r3.f11383 = this.f11814;
            r3.f11412 = this.f11826;
            r3.f11403 = this.f11816;
            r3.f11400 = this.f11787;
            r3.f11391 = this.f11788;
            r3.f11415 = this.f11776;
            r3.f11413 = this.f11774;
            r3.f11419 = this.f11800;
            r3.f11423 = this.f11790;
            r3.f11418 = this.f11807;
            r3.f11422 = this.f11799;
            r3.f11420 = this.f11820;
            r3.f11388 = this.f11823;
            r3.f11399 = this.f11796;
            r3.f11375 = this.f11838;
            r3.f11386 = this.f11824;
            r3.f11365 = this.f11780;
            r3.width = this.f11784;
            r3.height = this.f11822;
            if (Build.VERSION.SDK_INT >= 17) {
                r3.setMarginStart(this.f11818);
                r3.setMarginEnd(this.f11828);
            }
            r3.m13346();
        }

        public final /* synthetic */ Object clone() {
            C2598 r0 = new C2598();
            r0.f11770 = this.f11770;
            r0.f11784 = this.f11784;
            r0.f11822 = this.f11822;
            r0.f11824 = this.f11824;
            r0.f11780 = this.f11780;
            r0.f11838 = this.f11838;
            r0.f11841 = this.f11841;
            r0.f11830 = this.f11830;
            r0.f11803 = this.f11803;
            r0.f11801 = this.f11801;
            r0.f11789 = this.f11789;
            r0.f11797 = this.f11797;
            r0.f11808 = this.f11808;
            r0.f11842 = this.f11842;
            r0.f11817 = this.f11817;
            r0.f11833 = this.f11833;
            r0.f11778 = this.f11778;
            r0.f11777 = this.f11777;
            r0.f11809 = this.f11809;
            r0.f11781 = this.f11781;
            r0.f11811 = this.f11811;
            r0.f11782 = this.f11782;
            r0.f11806 = this.f11806;
            r0.f11795 = this.f11795;
            r0.f11781 = this.f11781;
            r0.f11781 = this.f11781;
            r0.f11781 = this.f11781;
            r0.f11781 = this.f11781;
            r0.f11781 = this.f11781;
            r0.f11796 = this.f11796;
            r0.f11804 = this.f11804;
            r0.f11831 = this.f11831;
            r0.f11829 = this.f11829;
            r0.f11834 = this.f11834;
            r0.f11828 = this.f11828;
            r0.f11818 = this.f11818;
            r0.f11835 = this.f11835;
            r0.f11836 = this.f11836;
            r0.f11839 = this.f11839;
            r0.f11840 = this.f11840;
            r0.f11802 = this.f11802;
            r0.f11805 = this.f11805;
            r0.f11815 = this.f11815;
            r0.f11813 = this.f11813;
            r0.f11814 = this.f11814;
            r0.f11816 = this.f11816;
            r0.f11826 = this.f11826;
            r0.f11771 = this.f11771;
            r0.f11832 = this.f11832;
            r0.f11843 = this.f11843;
            r0.f11821 = this.f11821;
            r0.f11791 = this.f11791;
            r0.f11792 = this.f11792;
            r0.f11785 = this.f11785;
            r0.f11786 = this.f11786;
            r0.f11772 = this.f11772;
            r0.f11810 = this.f11810;
            r0.f11812 = this.f11812;
            r0.f11819 = this.f11819;
            r0.f11793 = this.f11793;
            r0.f11787 = this.f11787;
            r0.f11788 = this.f11788;
            r0.f11776 = this.f11776;
            r0.f11774 = this.f11774;
            r0.f11800 = this.f11800;
            r0.f11790 = this.f11790;
            r0.f11807 = this.f11807;
            r0.f11799 = this.f11799;
            r0.f11820 = this.f11820;
            r0.f11823 = this.f11823;
            r0.f11825 = this.f11825;
            r0.f11837 = this.f11837;
            int[] iArr = this.f11773;
            if (iArr != null) {
                r0.f11773 = Arrays.copyOf(iArr, iArr.length);
            }
            r0.f11794 = this.f11794;
            r0.f11779 = this.f11779;
            r0.f11783 = this.f11783;
            r0.f11827 = this.f11827;
            return r0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m13772(C2512 r10) {
        int childCount = r10.getChildCount();
        HashSet hashSet = new HashSet(this.f11769.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = r10.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f11769.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C2598 r7 = this.f11769.get(Integer.valueOf(id));
                    if (childAt instanceof C2287) {
                        r7.f11837 = 1;
                    }
                    if (r7.f11837 != -1 && r7.f11837 == 1) {
                        C2287 r3 = (C2287) childAt;
                        r3.setId(id);
                        r3.setType(r7.f11825);
                        r3.setAllowsGoneWidget(r7.f11827);
                        if (r7.f11773 != null) {
                            r3.setReferencedIds(r7.f11773);
                        } else if (r7.f11775 != null) {
                            r7.f11773 = m13770(r3, r7.f11775);
                            r3.setReferencedIds(r7.f11773);
                        }
                    }
                    C2512.C2513 r32 = (C2512.C2513) childAt.getLayoutParams();
                    r7.m13775(r32);
                    childAt.setLayoutParams(r32);
                    childAt.setVisibility(r7.f11835);
                    if (Build.VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(r7.f11771);
                        childAt.setRotation(r7.f11821);
                        childAt.setRotationX(r7.f11791);
                        childAt.setRotationY(r7.f11792);
                        childAt.setScaleX(r7.f11785);
                        childAt.setScaleY(r7.f11786);
                        if (!Float.isNaN(r7.f11772)) {
                            childAt.setPivotX(r7.f11772);
                        }
                        if (!Float.isNaN(r7.f11810)) {
                            childAt.setPivotY(r7.f11810);
                        }
                        childAt.setTranslationX(r7.f11812);
                        childAt.setTranslationY(r7.f11819);
                        if (Build.VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(r7.f11793);
                            if (r7.f11832) {
                                childAt.setElevation(r7.f11843);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C2598 r2 = this.f11769.get(num);
            if (r2.f11837 != -1 && r2.f11837 == 1) {
                C2287 r5 = new C2287(r10.getContext());
                r5.setId(num.intValue());
                if (r2.f11773 != null) {
                    r5.setReferencedIds(r2.f11773);
                } else if (r2.f11775 != null) {
                    r2.f11773 = m13770(r5, r2.f11775);
                    r5.setReferencedIds(r2.f11773);
                }
                r5.setType(r2.f11825);
                C2512.C2513 r6 = C2512.m13341();
                r5.m11257();
                r2.m13775(r6);
                r10.addView(r5, r6);
            }
            if (r2.f11770) {
                C2376 r52 = new C2376(r10.getContext());
                r52.setId(num.intValue());
                C2512.C2513 r1 = C2512.m13341();
                r2.m13775(r1);
                r10.addView(r52, r1);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static void m13771(C2598 r5, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f11767.get(index);
            switch (i2) {
                case 1:
                    int resourceId = typedArray.getResourceId(index, r5.f11817);
                    if (resourceId == -1) {
                        resourceId = typedArray.getInt(index, -1);
                    }
                    r5.f11817 = resourceId;
                    break;
                case 2:
                    r5.f11834 = typedArray.getDimensionPixelSize(index, r5.f11834);
                    break;
                case 3:
                    int resourceId2 = typedArray.getResourceId(index, r5.f11842);
                    if (resourceId2 == -1) {
                        resourceId2 = typedArray.getInt(index, -1);
                    }
                    r5.f11842 = resourceId2;
                    break;
                case 4:
                    int resourceId3 = typedArray.getResourceId(index, r5.f11808);
                    if (resourceId3 == -1) {
                        resourceId3 = typedArray.getInt(index, -1);
                    }
                    r5.f11808 = resourceId3;
                    break;
                case 5:
                    r5.f11782 = typedArray.getString(index);
                    break;
                case 6:
                    r5.f11806 = typedArray.getDimensionPixelOffset(index, r5.f11806);
                    break;
                case 7:
                    r5.f11795 = typedArray.getDimensionPixelOffset(index, r5.f11795);
                    break;
                case 8:
                    r5.f11828 = typedArray.getDimensionPixelSize(index, r5.f11828);
                    break;
                case 9:
                    int resourceId4 = typedArray.getResourceId(index, r5.f11809);
                    if (resourceId4 == -1) {
                        resourceId4 = typedArray.getInt(index, -1);
                    }
                    r5.f11809 = resourceId4;
                    break;
                case 10:
                    int resourceId5 = typedArray.getResourceId(index, r5.f11777);
                    if (resourceId5 == -1) {
                        resourceId5 = typedArray.getInt(index, -1);
                    }
                    r5.f11777 = resourceId5;
                    break;
                case 11:
                    r5.f11802 = typedArray.getDimensionPixelSize(index, r5.f11802);
                    break;
                case 12:
                    r5.f11805 = typedArray.getDimensionPixelSize(index, r5.f11805);
                    break;
                case 13:
                    r5.f11836 = typedArray.getDimensionPixelSize(index, r5.f11836);
                    break;
                case 14:
                    r5.f11840 = typedArray.getDimensionPixelSize(index, r5.f11840);
                    break;
                case 15:
                    r5.f11815 = typedArray.getDimensionPixelSize(index, r5.f11815);
                    break;
                case 16:
                    r5.f11839 = typedArray.getDimensionPixelSize(index, r5.f11839);
                    break;
                case 17:
                    r5.f11824 = typedArray.getDimensionPixelOffset(index, r5.f11824);
                    break;
                case 18:
                    r5.f11780 = typedArray.getDimensionPixelOffset(index, r5.f11780);
                    break;
                case 19:
                    r5.f11838 = typedArray.getFloat(index, r5.f11838);
                    break;
                case 20:
                    r5.f11781 = typedArray.getFloat(index, r5.f11781);
                    break;
                case 21:
                    r5.f11822 = typedArray.getLayoutDimension(index, r5.f11822);
                    break;
                case 22:
                    r5.f11835 = typedArray.getInt(index, r5.f11835);
                    r5.f11835 = f11768[r5.f11835];
                    break;
                case 23:
                    r5.f11784 = typedArray.getLayoutDimension(index, r5.f11784);
                    break;
                case 24:
                    r5.f11804 = typedArray.getDimensionPixelSize(index, r5.f11804);
                    break;
                case 25:
                    int resourceId6 = typedArray.getResourceId(index, r5.f11841);
                    if (resourceId6 == -1) {
                        resourceId6 = typedArray.getInt(index, -1);
                    }
                    r5.f11841 = resourceId6;
                    break;
                case 26:
                    int resourceId7 = typedArray.getResourceId(index, r5.f11830);
                    if (resourceId7 == -1) {
                        resourceId7 = typedArray.getInt(index, -1);
                    }
                    r5.f11830 = resourceId7;
                    break;
                case 27:
                    r5.f11796 = typedArray.getInt(index, r5.f11796);
                    break;
                case 28:
                    r5.f11831 = typedArray.getDimensionPixelSize(index, r5.f11831);
                    break;
                case 29:
                    int resourceId8 = typedArray.getResourceId(index, r5.f11803);
                    if (resourceId8 == -1) {
                        resourceId8 = typedArray.getInt(index, -1);
                    }
                    r5.f11803 = resourceId8;
                    break;
                case 30:
                    int resourceId9 = typedArray.getResourceId(index, r5.f11801);
                    if (resourceId9 == -1) {
                        resourceId9 = typedArray.getInt(index, -1);
                    }
                    r5.f11801 = resourceId9;
                    break;
                case 31:
                    r5.f11818 = typedArray.getDimensionPixelSize(index, r5.f11818);
                    break;
                case 32:
                    int resourceId10 = typedArray.getResourceId(index, r5.f11833);
                    if (resourceId10 == -1) {
                        resourceId10 = typedArray.getInt(index, -1);
                    }
                    r5.f11833 = resourceId10;
                    break;
                case 33:
                    int resourceId11 = typedArray.getResourceId(index, r5.f11778);
                    if (resourceId11 == -1) {
                        resourceId11 = typedArray.getInt(index, -1);
                    }
                    r5.f11778 = resourceId11;
                    break;
                case 34:
                    r5.f11829 = typedArray.getDimensionPixelSize(index, r5.f11829);
                    break;
                case 35:
                    int resourceId12 = typedArray.getResourceId(index, r5.f11797);
                    if (resourceId12 == -1) {
                        resourceId12 = typedArray.getInt(index, -1);
                    }
                    r5.f11797 = resourceId12;
                    break;
                case 36:
                    int resourceId13 = typedArray.getResourceId(index, r5.f11789);
                    if (resourceId13 == -1) {
                        resourceId13 = typedArray.getInt(index, -1);
                    }
                    r5.f11789 = resourceId13;
                    break;
                case 37:
                    r5.f11811 = typedArray.getFloat(index, r5.f11811);
                    break;
                case 38:
                    r5.f11798 = typedArray.getResourceId(index, r5.f11798);
                    break;
                case 39:
                    r5.f11814 = typedArray.getFloat(index, r5.f11814);
                    break;
                case 40:
                    r5.f11813 = typedArray.getFloat(index, r5.f11813);
                    break;
                case 41:
                    r5.f11816 = typedArray.getInt(index, r5.f11816);
                    break;
                case 42:
                    r5.f11826 = typedArray.getInt(index, r5.f11826);
                    break;
                case 43:
                    r5.f11771 = typedArray.getFloat(index, r5.f11771);
                    break;
                case 44:
                    r5.f11832 = true;
                    r5.f11843 = typedArray.getDimension(index, r5.f11843);
                    break;
                case 45:
                    r5.f11791 = typedArray.getFloat(index, r5.f11791);
                    break;
                case 46:
                    r5.f11792 = typedArray.getFloat(index, r5.f11792);
                    break;
                case 47:
                    r5.f11785 = typedArray.getFloat(index, r5.f11785);
                    break;
                case 48:
                    r5.f11786 = typedArray.getFloat(index, r5.f11786);
                    break;
                case 49:
                    r5.f11772 = typedArray.getFloat(index, r5.f11772);
                    break;
                case 50:
                    r5.f11810 = typedArray.getFloat(index, r5.f11810);
                    break;
                case 51:
                    r5.f11812 = typedArray.getDimension(index, r5.f11812);
                    break;
                case 52:
                    r5.f11819 = typedArray.getDimension(index, r5.f11819);
                    break;
                case 53:
                    r5.f11793 = typedArray.getDimension(index, r5.f11793);
                    break;
                default:
                    switch (i2) {
                        case C2724.C2725.f12707 /*60*/:
                            r5.f11821 = typedArray.getFloat(index, r5.f11821);
                            break;
                        case C2724.C2725.f12719 /*61*/:
                            int resourceId14 = typedArray.getResourceId(index, r5.f11794);
                            if (resourceId14 == -1) {
                                resourceId14 = typedArray.getInt(index, -1);
                            }
                            r5.f11794 = resourceId14;
                            break;
                        case C2724.C2725.f12604 /*62*/:
                            r5.f11779 = typedArray.getDimensionPixelSize(index, r5.f11779);
                            break;
                        case C2724.C2725.f12598 /*63*/:
                            r5.f11783 = typedArray.getFloat(index, r5.f11783);
                            break;
                        default:
                            switch (i2) {
                                case C2724.C2725.f12606 /*69*/:
                                    r5.f11820 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case C2724.C2725.f12611 /*70*/:
                                    r5.f11823 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case C2724.C2725.f12615 /*71*/:
                                    break;
                                case C2724.C2725.f12634 /*72*/:
                                    r5.f11825 = typedArray.getInt(index, r5.f11825);
                                    break;
                                case C2724.C2725.f12627 /*73*/:
                                    r5.f11775 = typedArray.getString(index);
                                    break;
                                case C2724.C2725.f12633 /*74*/:
                                    r5.f11827 = typedArray.getBoolean(index, r5.f11827);
                                    break;
                                case C2724.C2725.f12624 /*75*/:
                                    f11767.get(index);
                                    break;
                                default:
                                    f11767.get(index);
                                    break;
                            }
                    }
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int[] m13770(View view, String str) {
        int i;
        Object r5;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C2724.If.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof C2512) && (r5 = ((C2512) view.getParent()).m13345((Object) trim)) != null && (r5 instanceof Integer)) {
                i = ((Integer) r5).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }
}
