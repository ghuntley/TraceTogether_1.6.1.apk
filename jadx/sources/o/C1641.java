package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import o.C0930;

/* renamed from: o.ʌ  reason: contains not printable characters */
public final class C1641 {

    /* renamed from: ı  reason: contains not printable characters */
    private static C1641 f8600;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final PorterDuff.Mode f8601 = PorterDuff.Mode.SRC_IN;

    /* renamed from: Ι  reason: contains not printable characters */
    private C0930 f8602;

    /* renamed from: ı  reason: contains not printable characters */
    public static synchronized void m9445() {
        synchronized (C1641.class) {
            if (f8600 == null) {
                C1641 r1 = new C1641();
                f8600 = r1;
                r1.f8602 = C0930.m6776();
                f8600.f8602.m6784(new C0930.Cif() {

                    /* renamed from: ı  reason: contains not printable characters */
                    private final int[] f8603 = {2131230810, 2131230808, 2131230727};

                    /* renamed from: ǃ  reason: contains not printable characters */
                    private final int[] f8604 = {2131230751, R.drawable.f160512131230792, 2131230758, 2131230753, 2131230754, 2131230757, 2131230756};

                    /* renamed from: ɩ  reason: contains not printable characters */
                    private final int[] f8605 = {2131230807, 2131230809, 2131230744, R.drawable.f160562131230800, 2131230801, 2131230803, 2131230805, 2131230802, 2131230804, 2131230806};

                    /* renamed from: Ι  reason: contains not printable characters */
                    private final int[] f8606 = {2131230782, R.drawable.f160282131230742, 2131230781};

                    /* renamed from: ι  reason: contains not printable characters */
                    private final int[] f8607 = {R.drawable.f160552131230798, R.drawable.f160572131230811};

                    /* renamed from: і  reason: contains not printable characters */
                    private final int[] f8608 = {R.drawable.f160222131230730, R.drawable.f160262131230736, R.drawable.f160232131230731, R.drawable.f160272131230737};

                    /* renamed from: ı  reason: contains not printable characters */
                    private ColorStateList m9454(Context context) {
                        return m9455(context, C1176.m7697(context, R.attr.f150232130968803));
                    }

                    /* renamed from: Ι  reason: contains not printable characters */
                    private ColorStateList m9459(Context context) {
                        return m9455(context, 0);
                    }

                    /* renamed from: ɩ  reason: contains not printable characters */
                    private ColorStateList m9457(Context context) {
                        return m9455(context, C1176.m7697(context, R.attr.f150212130968801));
                    }

                    /* renamed from: ı  reason: contains not printable characters */
                    private ColorStateList m9455(Context context, int i) {
                        int r2 = C1176.m7697(context, R.attr.f150252130968805);
                        int r6 = C1176.m7699(context, R.attr.f150232130968803);
                        return new ColorStateList(new int[][]{C1176.f6773, C1176.f6776, C1176.f6775, C1176.f6774}, new int[]{r6, C0960.m6875(r2, i), C0960.m6875(r2, i), i});
                    }

                    /* renamed from: ι  reason: contains not printable characters */
                    private ColorStateList m9460(Context context) {
                        int[][] iArr = new int[3][];
                        int[] iArr2 = new int[3];
                        ColorStateList r3 = C1176.m7698(context, R.attr.f150362130968823);
                        if (r3 == null || !r3.isStateful()) {
                            iArr[0] = C1176.f6773;
                            iArr2[0] = C1176.m7699(context, R.attr.f150362130968823);
                            iArr[1] = C1176.f6777;
                            iArr2[1] = C1176.m7697(context, R.attr.f150242130968804);
                            iArr[2] = C1176.f6774;
                            iArr2[2] = C1176.m7697(context, R.attr.f150362130968823);
                        } else {
                            iArr[0] = C1176.f6773;
                            iArr2[0] = r3.getColorForState(iArr[0], 0);
                            iArr[1] = C1176.f6777;
                            iArr2[1] = C1176.m7697(context, R.attr.f150242130968804);
                            iArr[2] = C1176.f6774;
                            iArr2[2] = r3.getDefaultColor();
                        }
                        return new ColorStateList(iArr, iArr2);
                    }

                    /* renamed from: ǃ  reason: contains not printable characters */
                    public final Drawable m9463(C0930 r4, Context context, int i) {
                        if (i != R.drawable.f160292131230743) {
                            return null;
                        }
                        return new LayerDrawable(new Drawable[]{r4.m6782(context, R.drawable.f160282131230742), r4.m6782(context, 2131230744)});
                    }

                    /* renamed from: ɩ  reason: contains not printable characters */
                    private void m9458(Drawable drawable, int i, PorterDuff.Mode mode) {
                        if (C2674.m14212(drawable)) {
                            drawable = drawable.mutate();
                        }
                        if (mode == null) {
                            mode = C1641.f8601;
                        }
                        drawable.setColorFilter(C1641.m9447(i, mode));
                    }

                    /* renamed from: ı  reason: contains not printable characters */
                    public final boolean m9461(Context context, int i, Drawable drawable) {
                        if (i == R.drawable.f160522131230793) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawable;
                            m9458(layerDrawable.findDrawableByLayerId(16908288), C1176.m7697(context, R.attr.f150262130968806), C1641.f8601);
                            m9458(layerDrawable.findDrawableByLayerId(16908303), C1176.m7697(context, R.attr.f150262130968806), C1641.f8601);
                            m9458(layerDrawable.findDrawableByLayerId(16908301), C1176.m7697(context, R.attr.f150242130968804), C1641.f8601);
                            return true;
                        } else if (i != R.drawable.f160482131230784 && i != R.drawable.f160472131230783 && i != R.drawable.f160492131230785) {
                            return false;
                        } else {
                            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                            m9458(layerDrawable2.findDrawableByLayerId(16908288), C1176.m7699(context, R.attr.f150262130968806), C1641.f8601);
                            m9458(layerDrawable2.findDrawableByLayerId(16908303), C1176.m7697(context, R.attr.f150242130968804), C1641.f8601);
                            m9458(layerDrawable2.findDrawableByLayerId(16908301), C1176.m7697(context, R.attr.f150242130968804), C1641.f8601);
                            return true;
                        }
                    }

                    /* renamed from: ı  reason: contains not printable characters */
                    private boolean m9456(int[] iArr, int i) {
                        for (int i2 : iArr) {
                            if (i2 == i) {
                                return true;
                            }
                        }
                        return false;
                    }

                    /* renamed from: ǃ  reason: contains not printable characters */
                    public final ColorStateList m9462(Context context, int i) {
                        if (i == R.drawable.f160322131230747) {
                            return C3257Con.m1342(context, R.color.f155902131099668);
                        }
                        if (i == 2131230797) {
                            return C3257Con.m1342(context, R.color.f155932131099671);
                        }
                        if (i == R.drawable.f160542131230796) {
                            return m9460(context);
                        }
                        if (i == R.drawable.f160252131230735) {
                            return m9454(context);
                        }
                        if (i == R.drawable.f160212131230729) {
                            return m9459(context);
                        }
                        if (i == R.drawable.f160242131230734) {
                            return m9457(context);
                        }
                        if (i == 2131230794 || i == R.drawable.f160532131230795) {
                            return C3257Con.m1342(context, R.color.f155922131099670);
                        }
                        if (m9456(this.f8604, i)) {
                            return C1176.m7698(context, R.attr.f150262130968806);
                        }
                        if (m9456(this.f8607, i)) {
                            return C3257Con.m1342(context, R.color.f155892131099667);
                        }
                        if (m9456(this.f8608, i)) {
                            return C3257Con.m1342(context, R.color.f155882131099666);
                        }
                        if (i == R.drawable.f160502131230791) {
                            return C3257Con.m1342(context, R.color.f155912131099669);
                        }
                        return null;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
                    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067 A[RETURN] */
                    /* renamed from: ι  reason: contains not printable characters */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final boolean m9465(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
                        /*
                            r6 = this;
                            android.graphics.PorterDuff$Mode r0 = o.C1641.f8601
                            int[] r1 = r6.f8603
                            boolean r1 = r6.m9456((int[]) r1, (int) r8)
                            r2 = 16842801(0x1010031, float:2.3693695E-38)
                            r3 = -1
                            r4 = 0
                            r5 = 1
                            if (r1 == 0) goto L_0x0018
                            r2 = 2130968806(0x7f0400e6, float:1.7546276E38)
                        L_0x0015:
                            r8 = 1
                            r1 = -1
                            goto L_0x004a
                        L_0x0018:
                            int[] r1 = r6.f8605
                            boolean r1 = r6.m9456((int[]) r1, (int) r8)
                            if (r1 == 0) goto L_0x0024
                            r2 = 2130968804(0x7f0400e4, float:1.7546272E38)
                            goto L_0x0015
                        L_0x0024:
                            int[] r1 = r6.f8606
                            boolean r1 = r6.m9456((int[]) r1, (int) r8)
                            if (r1 == 0) goto L_0x002f
                            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                            goto L_0x0015
                        L_0x002f:
                            r1 = 2131230770(0x7f080032, float:1.8077602E38)
                            if (r8 != r1) goto L_0x0041
                            r2 = 16842800(0x1010030, float:2.3693693E-38)
                            r8 = 1109603123(0x42233333, float:40.8)
                            int r8 = java.lang.Math.round(r8)
                            r1 = r8
                            r8 = 1
                            goto L_0x004a
                        L_0x0041:
                            r1 = 2131230746(0x7f08001a, float:1.8077553E38)
                            if (r8 != r1) goto L_0x0047
                            goto L_0x0015
                        L_0x0047:
                            r8 = 0
                            r1 = -1
                            r2 = 0
                        L_0x004a:
                            if (r8 == 0) goto L_0x0067
                            boolean r8 = o.C2674.m14212(r9)
                            if (r8 == 0) goto L_0x0056
                            android.graphics.drawable.Drawable r9 = r9.mutate()
                        L_0x0056:
                            int r7 = o.C1176.m7697(r7, r2)
                            android.graphics.PorterDuffColorFilter r7 = o.C1641.m9447((int) r7, (android.graphics.PorterDuff.Mode) r0)
                            r9.setColorFilter(r7)
                            if (r1 == r3) goto L_0x0066
                            r9.setAlpha(r1)
                        L_0x0066:
                            return r5
                        L_0x0067:
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.C1641.AnonymousClass1.m9465(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                    }

                    /* renamed from: ι  reason: contains not printable characters */
                    public final PorterDuff.Mode m9464(int i) {
                        if (i == R.drawable.f160542131230796) {
                            return PorterDuff.Mode.MULTIPLY;
                        }
                        return null;
                    }
                });
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static synchronized C1641 m9449() {
        C1641 r1;
        synchronized (C1641.class) {
            if (f8600 == null) {
                m9445();
            }
            r1 = f8600;
        }
        return r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized Drawable m9452(Context context, int i) {
        return this.f8602.m6782(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final synchronized Drawable m9453(Context context, int i, boolean z) {
        return this.f8602.m6783(context, i, z);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized void m9451(Context context) {
        this.f8602.m6781(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized ColorStateList m9450(Context context, int i) {
        return this.f8602.m6785(context, i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static void m9448(Drawable drawable, C1288 r1, int[] iArr) {
        C0930.m6779(drawable, r1, iArr);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m9447(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter r1;
        synchronized (C1641.class) {
            r1 = C0930.m6778(i, mode);
        }
        return r1;
    }
}
