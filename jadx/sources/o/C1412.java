package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import o.C0913;
import o.C2745;

/* renamed from: o.ɫ  reason: contains not printable characters */
class C1412 {

    /* renamed from: ı  reason: contains not printable characters */
    private C1288 f7711;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C1631 f7712;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final TextView f7713;

    /* renamed from: ȷ  reason: contains not printable characters */
    private Typeface f7714;

    /* renamed from: ɨ  reason: contains not printable characters */
    private int f7715 = -1;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C1288 f7716;

    /* renamed from: ɹ  reason: contains not printable characters */
    private C1288 f7717;

    /* renamed from: Ι  reason: contains not printable characters */
    private C1288 f7718;

    /* renamed from: ι  reason: contains not printable characters */
    private C1288 f7719;

    /* renamed from: І  reason: contains not printable characters */
    private int f7720 = 0;

    /* renamed from: і  reason: contains not printable characters */
    private C1288 f7721;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private C1288 f7722;

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f7723;

    C1412(TextView textView) {
        this.f7713 = textView;
        this.f7712 = new C1631(this.f7713);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0256  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8610(android.util.AttributeSet r20, int r21) {
        /*
            r19 = this;
            r7 = r19
            r0 = r20
            r1 = r21
            android.widget.TextView r2 = r7.f7713
            android.content.Context r2 = r2.getContext()
            o.ʌ r3 = o.C1641.m9449()
            int[] r4 = o.C2745.aux.f12821
            o.ιɩ r5 = new o.ιɩ
            r6 = 0
            android.content.res.TypedArray r4 = r2.obtainStyledAttributes(r0, r4, r1, r6)
            r5.<init>(r2, r4)
            int r4 = o.C2745.aux.f12783
            android.content.res.TypedArray r4 = r5.f9934
            r8 = -1
            int r4 = r4.getResourceId(r6, r8)
            int r9 = o.C2745.aux.f12842
            android.content.res.TypedArray r9 = r5.f9934
            r10 = 3
            boolean r9 = r9.hasValue(r10)
            if (r9 == 0) goto L_0x003e
            int r9 = o.C2745.aux.f12842
            android.content.res.TypedArray r9 = r5.f9934
            int r9 = r9.getResourceId(r10, r6)
            o.ɩι r9 = m8599(r2, r3, r9)
            r7.f7718 = r9
        L_0x003e:
            int r9 = o.C2745.aux.f12819
            android.content.res.TypedArray r9 = r5.f9934
            r11 = 1
            boolean r9 = r9.hasValue(r11)
            if (r9 == 0) goto L_0x0057
            int r9 = o.C2745.aux.f12819
            android.content.res.TypedArray r9 = r5.f9934
            int r9 = r9.getResourceId(r11, r6)
            o.ɩι r9 = m8599(r2, r3, r9)
            r7.f7716 = r9
        L_0x0057:
            int r9 = o.C2745.aux.f12909
            android.content.res.TypedArray r9 = r5.f9934
            r12 = 4
            boolean r9 = r9.hasValue(r12)
            if (r9 == 0) goto L_0x0070
            int r9 = o.C2745.aux.f12909
            android.content.res.TypedArray r9 = r5.f9934
            int r9 = r9.getResourceId(r12, r6)
            o.ɩι r9 = m8599(r2, r3, r9)
            r7.f7719 = r9
        L_0x0070:
            int r9 = o.C2745.aux.f12843
            android.content.res.TypedArray r9 = r5.f9934
            r13 = 2
            boolean r9 = r9.hasValue(r13)
            if (r9 == 0) goto L_0x0089
            int r9 = o.C2745.aux.f12843
            android.content.res.TypedArray r9 = r5.f9934
            int r9 = r9.getResourceId(r13, r6)
            o.ɩι r9 = m8599(r2, r3, r9)
            r7.f7711 = r9
        L_0x0089:
            int r9 = android.os.Build.VERSION.SDK_INT
            r13 = 17
            r14 = 6
            r15 = 5
            if (r9 < r13) goto L_0x00c1
            int r9 = o.C2745.aux.f12888
            android.content.res.TypedArray r9 = r5.f9934
            boolean r9 = r9.hasValue(r15)
            if (r9 == 0) goto L_0x00a9
            int r9 = o.C2745.aux.f12888
            android.content.res.TypedArray r9 = r5.f9934
            int r9 = r9.getResourceId(r15, r6)
            o.ɩι r9 = m8599(r2, r3, r9)
            r7.f7717 = r9
        L_0x00a9:
            int r9 = o.C2745.aux.f12910
            android.content.res.TypedArray r9 = r5.f9934
            boolean r9 = r9.hasValue(r14)
            if (r9 == 0) goto L_0x00c1
            int r9 = o.C2745.aux.f12910
            android.content.res.TypedArray r9 = r5.f9934
            int r9 = r9.getResourceId(r14, r6)
            o.ɩι r9 = m8599(r2, r3, r9)
            r7.f7721 = r9
        L_0x00c1:
            android.content.res.TypedArray r5 = r5.f9934
            r5.recycle()
            android.widget.TextView r5 = r7.f7713
            android.text.method.TransformationMethod r5 = r5.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            r11 = 23
            r13 = 15
            r14 = 14
            if (r4 == r8) goto L_0x0176
            int[] r9 = o.C2745.aux.f12838
            o.ιɩ r8 = new o.ιɩ
            android.content.res.TypedArray r4 = r2.obtainStyledAttributes(r4, r9)
            r8.<init>(r2, r4)
            if (r5 != 0) goto L_0x00f8
            int r4 = o.C2745.aux.f12884
            android.content.res.TypedArray r4 = r8.f9934
            boolean r4 = r4.hasValue(r14)
            if (r4 == 0) goto L_0x00f8
            int r4 = o.C2745.aux.f12884
            android.content.res.TypedArray r4 = r8.f9934
            boolean r4 = r4.getBoolean(r14, r6)
            r9 = r4
            r4 = 1
            goto L_0x00fa
        L_0x00f8:
            r4 = 0
            r9 = 0
        L_0x00fa:
            r7.m8600((android.content.Context) r2, (o.C1992) r8)
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 >= r11) goto L_0x0138
            int r14 = o.C2745.aux.f12854
            android.content.res.TypedArray r14 = r8.f9934
            boolean r14 = r14.hasValue(r10)
            if (r14 == 0) goto L_0x0112
            int r14 = o.C2745.aux.f12854
            android.content.res.ColorStateList r14 = r8.m10792(r14)
            goto L_0x0113
        L_0x0112:
            r14 = 0
        L_0x0113:
            int r17 = o.C2745.aux.f12850
            android.content.res.TypedArray r10 = r8.f9934
            boolean r10 = r10.hasValue(r12)
            if (r10 == 0) goto L_0x0124
            int r10 = o.C2745.aux.f12850
            android.content.res.ColorStateList r10 = r8.m10792(r10)
            goto L_0x0125
        L_0x0124:
            r10 = 0
        L_0x0125:
            int r17 = o.C2745.aux.f12868
            android.content.res.TypedArray r12 = r8.f9934
            boolean r12 = r12.hasValue(r15)
            if (r12 == 0) goto L_0x0136
            int r12 = o.C2745.aux.f12868
            android.content.res.ColorStateList r12 = r8.m10792(r12)
            goto L_0x013b
        L_0x0136:
            r12 = 0
            goto L_0x013b
        L_0x0138:
            r10 = 0
            r12 = 0
            r14 = 0
        L_0x013b:
            int r17 = o.C2745.aux.f12887
            android.content.res.TypedArray r15 = r8.f9934
            boolean r15 = r15.hasValue(r13)
            if (r15 == 0) goto L_0x014e
            int r15 = o.C2745.aux.f12887
            android.content.res.TypedArray r15 = r8.f9934
            java.lang.String r15 = r15.getString(r13)
            goto L_0x014f
        L_0x014e:
            r15 = 0
        L_0x014f:
            int r13 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            if (r13 < r11) goto L_0x016a
            int r11 = o.C2745.aux.f12866
            android.content.res.TypedArray r11 = r8.f9934
            r13 = 13
            boolean r11 = r11.hasValue(r13)
            if (r11 == 0) goto L_0x016a
            int r11 = o.C2745.aux.f12866
            android.content.res.TypedArray r11 = r8.f9934
            java.lang.String r11 = r11.getString(r13)
            goto L_0x016b
        L_0x016a:
            r11 = 0
        L_0x016b:
            android.content.res.TypedArray r8 = r8.f9934
            r8.recycle()
            r18 = r11
            r11 = r4
            r4 = r18
            goto L_0x017d
        L_0x0176:
            r4 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
        L_0x017d:
            int[] r8 = o.C2745.aux.f12838
            o.ιɩ r13 = new o.ιɩ
            android.content.res.TypedArray r8 = r2.obtainStyledAttributes(r0, r8, r1, r6)
            r13.<init>(r2, r8)
            if (r5 != 0) goto L_0x01a2
            int r8 = o.C2745.aux.f12884
            android.content.res.TypedArray r8 = r13.f9934
            r6 = 14
            boolean r8 = r8.hasValue(r6)
            if (r8 == 0) goto L_0x01a2
            int r8 = o.C2745.aux.f12884
            android.content.res.TypedArray r8 = r13.f9934
            r9 = 0
            boolean r8 = r8.getBoolean(r6, r9)
            r16 = 1
            goto L_0x01a5
        L_0x01a2:
            r8 = r9
            r16 = r11
        L_0x01a5:
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 23
            if (r6 >= r9) goto L_0x01de
            int r6 = o.C2745.aux.f12854
            android.content.res.TypedArray r6 = r13.f9934
            r9 = 3
            boolean r6 = r6.hasValue(r9)
            if (r6 == 0) goto L_0x01bc
            int r6 = o.C2745.aux.f12854
            android.content.res.ColorStateList r14 = r13.m10792(r6)
        L_0x01bc:
            int r6 = o.C2745.aux.f12850
            android.content.res.TypedArray r6 = r13.f9934
            r9 = 4
            boolean r6 = r6.hasValue(r9)
            if (r6 == 0) goto L_0x01cd
            int r6 = o.C2745.aux.f12850
            android.content.res.ColorStateList r10 = r13.m10792(r6)
        L_0x01cd:
            int r6 = o.C2745.aux.f12868
            android.content.res.TypedArray r6 = r13.f9934
            r9 = 5
            boolean r6 = r6.hasValue(r9)
            if (r6 == 0) goto L_0x01de
            int r6 = o.C2745.aux.f12868
            android.content.res.ColorStateList r12 = r13.m10792(r6)
        L_0x01de:
            int r6 = o.C2745.aux.f12887
            android.content.res.TypedArray r6 = r13.f9934
            r9 = 15
            boolean r6 = r6.hasValue(r9)
            if (r6 == 0) goto L_0x01f2
            int r6 = o.C2745.aux.f12887
            android.content.res.TypedArray r6 = r13.f9934
            java.lang.String r15 = r6.getString(r9)
        L_0x01f2:
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r6 < r9) goto L_0x020c
            int r6 = o.C2745.aux.f12866
            android.content.res.TypedArray r6 = r13.f9934
            r9 = 13
            boolean r6 = r6.hasValue(r9)
            if (r6 == 0) goto L_0x020c
            int r4 = o.C2745.aux.f12866
            android.content.res.TypedArray r4 = r13.f9934
            java.lang.String r4 = r4.getString(r9)
        L_0x020c:
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r6 < r9) goto L_0x022e
            int r6 = o.C2745.aux.f12857
            android.content.res.TypedArray r6 = r13.f9934
            r9 = 0
            boolean r6 = r6.hasValue(r9)
            if (r6 == 0) goto L_0x022e
            int r6 = o.C2745.aux.f12857
            android.content.res.TypedArray r6 = r13.f9934
            r11 = -1
            int r6 = r6.getDimensionPixelSize(r9, r11)
            if (r6 != 0) goto L_0x022e
            android.widget.TextView r6 = r7.f7713
            r11 = 0
            r6.setTextSize(r9, r11)
        L_0x022e:
            r7.m8600((android.content.Context) r2, (o.C1992) r13)
            android.content.res.TypedArray r6 = r13.f9934
            r6.recycle()
            if (r14 == 0) goto L_0x023d
            android.widget.TextView r6 = r7.f7713
            r6.setTextColor(r14)
        L_0x023d:
            if (r10 == 0) goto L_0x0244
            android.widget.TextView r6 = r7.f7713
            r6.setHintTextColor(r10)
        L_0x0244:
            if (r12 == 0) goto L_0x024b
            android.widget.TextView r6 = r7.f7713
            r6.setLinkTextColor(r12)
        L_0x024b:
            if (r5 != 0) goto L_0x0252
            if (r16 == 0) goto L_0x0252
            r7.m8611((boolean) r8)
        L_0x0252:
            android.graphics.Typeface r5 = r7.f7714
            if (r5 == 0) goto L_0x0268
            int r6 = r7.f7715
            r8 = -1
            if (r6 != r8) goto L_0x0263
            android.widget.TextView r6 = r7.f7713
            int r8 = r7.f7720
            r6.setTypeface(r5, r8)
            goto L_0x0268
        L_0x0263:
            android.widget.TextView r6 = r7.f7713
            r6.setTypeface(r5)
        L_0x0268:
            if (r4 == 0) goto L_0x026f
            android.widget.TextView r5 = r7.f7713
            r5.setFontVariationSettings(r4)
        L_0x026f:
            if (r15 == 0) goto L_0x029b
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L_0x0281
            android.widget.TextView r4 = r7.f7713
            android.os.LocaleList r5 = android.os.LocaleList.forLanguageTags(r15)
            r4.setTextLocales(r5)
            goto L_0x029b
        L_0x0281:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 21
            if (r4 < r5) goto L_0x029b
            r4 = 44
            int r4 = r15.indexOf(r4)
            r5 = 0
            java.lang.String r4 = r15.substring(r5, r4)
            android.widget.TextView r5 = r7.f7713
            java.util.Locale r4 = java.util.Locale.forLanguageTag(r4)
            r5.setTextLocale(r4)
        L_0x029b:
            o.ʋ r4 = r7.f7712
            r4.m9422(r0, r1)
            boolean r1 = o.C0664.f4738
            if (r1 == 0) goto L_0x02e1
            o.ʋ r1 = r7.f7712
            int r1 = r1.m9423()
            if (r1 == 0) goto L_0x02e1
            o.ʋ r1 = r7.f7712
            int[] r1 = r1.m9428()
            int r4 = r1.length
            if (r4 <= 0) goto L_0x02e1
            android.widget.TextView r4 = r7.f7713
            int r4 = r4.getAutoSizeStepGranularity()
            float r4 = (float) r4
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x02db
            android.widget.TextView r1 = r7.f7713
            o.ʋ r4 = r7.f7712
            int r4 = r4.m9429()
            o.ʋ r5 = r7.f7712
            int r5 = r5.m9418()
            o.ʋ r6 = r7.f7712
            int r6 = r6.m9421()
            r8 = 0
            r1.setAutoSizeTextTypeUniformWithConfiguration(r4, r5, r6, r8)
            goto L_0x02e1
        L_0x02db:
            r8 = 0
            android.widget.TextView r4 = r7.f7713
            r4.setAutoSizeTextTypeUniformWithPresetSizes(r1, r8)
        L_0x02e1:
            int[] r1 = o.C2745.aux.f12844
            o.ιɩ r8 = new o.ιɩ
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r0, r1)
            r8.<init>(r2, r0)
            int r0 = o.C2745.aux.f12800
            android.content.res.TypedArray r0 = r8.f9934
            r1 = 8
            r4 = -1
            int r0 = r0.getResourceId(r1, r4)
            if (r0 == r4) goto L_0x02ff
            android.graphics.drawable.Drawable r0 = r3.m9452((android.content.Context) r2, (int) r0)
            r1 = r0
            goto L_0x0300
        L_0x02ff:
            r1 = 0
        L_0x0300:
            int r0 = o.C2745.aux.f12840
            android.content.res.TypedArray r0 = r8.f9934
            r5 = 13
            int r0 = r0.getResourceId(r5, r4)
            if (r0 == r4) goto L_0x0312
            android.graphics.drawable.Drawable r0 = r3.m9452((android.content.Context) r2, (int) r0)
            r5 = r0
            goto L_0x0313
        L_0x0312:
            r5 = 0
        L_0x0313:
            int r0 = o.C2745.aux.f12799
            android.content.res.TypedArray r0 = r8.f9934
            r6 = 9
            int r0 = r0.getResourceId(r6, r4)
            if (r0 == r4) goto L_0x0325
            android.graphics.drawable.Drawable r0 = r3.m9452((android.content.Context) r2, (int) r0)
            r6 = r0
            goto L_0x0326
        L_0x0325:
            r6 = 0
        L_0x0326:
            int r0 = o.C2745.aux.f12942
            android.content.res.TypedArray r0 = r8.f9934
            r9 = 6
            int r0 = r0.getResourceId(r9, r4)
            if (r0 == r4) goto L_0x0337
            android.graphics.drawable.Drawable r0 = r3.m9452((android.content.Context) r2, (int) r0)
            r9 = r0
            goto L_0x0338
        L_0x0337:
            r9 = 0
        L_0x0338:
            int r0 = o.C2745.aux.f12831
            android.content.res.TypedArray r0 = r8.f9934
            r10 = 10
            int r0 = r0.getResourceId(r10, r4)
            if (r0 == r4) goto L_0x034a
            android.graphics.drawable.Drawable r0 = r3.m9452((android.content.Context) r2, (int) r0)
            r10 = r0
            goto L_0x034b
        L_0x034a:
            r10 = 0
        L_0x034b:
            int r0 = o.C2745.aux.f12793
            android.content.res.TypedArray r0 = r8.f9934
            r11 = 7
            int r0 = r0.getResourceId(r11, r4)
            if (r0 == r4) goto L_0x035c
            android.graphics.drawable.Drawable r0 = r3.m9452((android.content.Context) r2, (int) r0)
            r11 = r0
            goto L_0x035d
        L_0x035c:
            r11 = 0
        L_0x035d:
            r0 = r19
            r2 = r5
            r3 = r6
            r4 = r9
            r5 = r10
            r6 = r11
            r0.m8601(r1, r2, r3, r4, r5, r6)
            int r0 = o.C2745.aux.f12824
            android.content.res.TypedArray r0 = r8.f9934
            r1 = 11
            boolean r0 = r0.hasValue(r1)
            if (r0 == 0) goto L_0x037e
            int r0 = o.C2745.aux.f12824
            android.content.res.ColorStateList r0 = r8.m10792(r0)
            android.widget.TextView r1 = r7.f7713
            o.C0893.m6633((android.widget.TextView) r1, (android.content.res.ColorStateList) r0)
        L_0x037e:
            int r0 = o.C2745.aux.f12858
            android.content.res.TypedArray r0 = r8.f9934
            r1 = 12
            boolean r0 = r0.hasValue(r1)
            if (r0 == 0) goto L_0x03a0
            int r0 = o.C2745.aux.f12858
            android.content.res.TypedArray r0 = r8.f9934
            r1 = 12
            r2 = -1
            int r0 = r0.getInt(r1, r2)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = o.C2674.m14214(r0, r1)
            android.widget.TextView r1 = r7.f7713
            o.C0893.m6620((android.widget.TextView) r1, (android.graphics.PorterDuff.Mode) r0)
            goto L_0x03a1
        L_0x03a0:
            r2 = -1
        L_0x03a1:
            int r0 = o.C2745.aux.f12870
            android.content.res.TypedArray r0 = r8.f9934
            r1 = 14
            int r0 = r0.getDimensionPixelSize(r1, r2)
            int r1 = o.C2745.aux.f12856
            android.content.res.TypedArray r1 = r8.f9934
            r3 = 17
            int r1 = r1.getDimensionPixelSize(r3, r2)
            int r3 = o.C2745.aux.f12881
            android.content.res.TypedArray r3 = r8.f9934
            r4 = 18
            int r3 = r3.getDimensionPixelSize(r4, r2)
            android.content.res.TypedArray r4 = r8.f9934
            r4.recycle()
            if (r0 == r2) goto L_0x03cb
            android.widget.TextView r4 = r7.f7713
            o.C0893.m6624((android.widget.TextView) r4, (int) r0)
        L_0x03cb:
            if (r1 == r2) goto L_0x03d2
            android.widget.TextView r0 = r7.f7713
            o.C0893.m6629(r0, r1)
        L_0x03d2:
            if (r3 == r2) goto L_0x03d9
            android.widget.TextView r0 = r7.f7713
            o.C0893.m6619((android.widget.TextView) r0, (int) r3)
        L_0x03d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1412.m8610(android.util.AttributeSet, int):void");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m8609(Typeface typeface) {
        if (this.f7723) {
            this.f7713.setTypeface(typeface);
            this.f7714 = typeface;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m8614(Runnable runnable) {
        this.f7713.post(runnable);
    }

    /* renamed from: o.ɫ$if  reason: invalid class name */
    static class Cif extends C0913.If {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final int f7724;

        /* renamed from: Ι  reason: contains not printable characters */
        private final WeakReference<C1412> f7725;

        /* renamed from: ι  reason: contains not printable characters */
        private final int f7726;

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m8625(int i) {
        }

        /* renamed from: o.ɫ$if$ı  reason: contains not printable characters */
        class C1413 implements Runnable {

            /* renamed from: ı  reason: contains not printable characters */
            private final Typeface f7727;

            /* renamed from: ɩ  reason: contains not printable characters */
            private final WeakReference<C1412> f7728;

            C1413(WeakReference<C1412> weakReference, Typeface typeface) {
                this.f7728 = weakReference;
                this.f7727 = typeface;
            }

            public void run() {
                C1412 r0 = this.f7728.get();
                if (r0 != null) {
                    r0.m8609(this.f7727);
                }
            }
        }

        Cif(C1412 r2, int i, int i2) {
            this.f7725 = new WeakReference<>(r2);
            this.f7724 = i;
            this.f7726 = i2;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m8626(Typeface typeface) {
            int i;
            C1412 r0 = this.f7725.get();
            if (r0 != null) {
                if (Build.VERSION.SDK_INT >= 28 && (i = this.f7724) != -1) {
                    typeface = Typeface.create(typeface, i, (this.f7726 & 2) != 0);
                }
                r0.m8614((Runnable) new C1413(this.f7725, typeface));
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m8600(Context context, C1992 r12) {
        String string;
        int i = C2745.aux.f12853;
        this.f7720 = r12.f9934.getInt(2, this.f7720);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int i2 = C2745.aux.f12876;
            this.f7715 = r12.f9934.getInt(11, -1);
            if (this.f7715 != -1) {
                this.f7720 = (this.f7720 & 2) | 0;
            }
        }
        int i3 = C2745.aux.f12877;
        if (!r12.f9934.hasValue(10)) {
            int i4 = C2745.aux.f12869;
            if (!r12.f9934.hasValue(12)) {
                int i5 = C2745.aux.f12860;
                if (r12.f9934.hasValue(1)) {
                    this.f7723 = false;
                    int i6 = C2745.aux.f12860;
                    int i7 = r12.f9934.getInt(1, 1);
                    if (i7 == 1) {
                        this.f7714 = Typeface.SANS_SERIF;
                        return;
                    } else if (i7 == 2) {
                        this.f7714 = Typeface.SERIF;
                        return;
                    } else if (i7 == 3) {
                        this.f7714 = Typeface.MONOSPACE;
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        Typeface typeface = null;
        this.f7714 = null;
        int i8 = C2745.aux.f12869;
        int i9 = r12.f9934.hasValue(12) ? C2745.aux.f12869 : C2745.aux.f12877;
        int i10 = this.f7715;
        int i11 = this.f7720;
        if (!context.isRestricted()) {
            Cif ifVar = new Cif(this, i10, i11);
            try {
                int i12 = this.f7720;
                int resourceId = r12.f9934.getResourceId(i9, 0);
                if (resourceId != 0) {
                    if (r12.f9933 == null) {
                        r12.f9933 = new TypedValue();
                    }
                    typeface = C0913.m6728(r12.f9935, resourceId, r12.f9933, i12, ifVar);
                }
                if (typeface != null) {
                    if (Build.VERSION.SDK_INT < 28 || this.f7715 == -1) {
                        this.f7714 = typeface;
                    } else {
                        this.f7714 = Typeface.create(Typeface.create(typeface, 0), this.f7715, (this.f7720 & 2) != 0);
                    }
                }
                this.f7723 = this.f7714 == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f7714 == null && (string = r12.f9934.getString(i9)) != null) {
            if (Build.VERSION.SDK_INT < 28 || this.f7715 == -1) {
                this.f7714 = Typeface.create(string, this.f7720);
                return;
            }
            Typeface create = Typeface.create(string, 0);
            int i13 = this.f7715;
            if ((this.f7720 & 2) != 0) {
                z = true;
            }
            this.f7714 = Typeface.create(create, i13, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m8621(Context context, int i) {
        ColorStateList r5;
        C1992 r1 = new C1992(context, context.obtainStyledAttributes(i, C2745.aux.f12838));
        int i2 = C2745.aux.f12884;
        if (r1.f9934.hasValue(14)) {
            int i3 = C2745.aux.f12884;
            m8611(r1.f9934.getBoolean(14, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            int i4 = C2745.aux.f12854;
            if (r1.f9934.hasValue(3) && (r5 = r1.m10792(C2745.aux.f12854)) != null) {
                this.f7713.setTextColor(r5);
            }
        }
        int i5 = C2745.aux.f12857;
        if (r1.f9934.hasValue(0)) {
            int i6 = C2745.aux.f12857;
            if (r1.f9934.getDimensionPixelSize(0, -1) == 0) {
                this.f7713.setTextSize(0, 0.0f);
            }
        }
        m8600(context, r1);
        if (Build.VERSION.SDK_INT >= 26) {
            int i7 = C2745.aux.f12866;
            if (r1.f9934.hasValue(13)) {
                int i8 = C2745.aux.f12866;
                String string = r1.f9934.getString(13);
                if (string != null) {
                    this.f7713.setFontVariationSettings(string);
                }
            }
        }
        r1.f9934.recycle();
        Typeface typeface = this.f7714;
        if (typeface != null) {
            this.f7713.setTypeface(typeface, this.f7720);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m8611(boolean z) {
        this.f7713.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m8608() {
        m8604();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m8604() {
        if (!(this.f7718 == null && this.f7716 == null && this.f7719 == null && this.f7711 == null)) {
            Drawable[] compoundDrawables = this.f7713.getCompoundDrawables();
            m8598(compoundDrawables[0], this.f7718);
            m8598(compoundDrawables[1], this.f7716);
            m8598(compoundDrawables[2], this.f7719);
            m8598(compoundDrawables[3], this.f7711);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f7717 != null || this.f7721 != null) {
            Drawable[] compoundDrawablesRelative = this.f7713.getCompoundDrawablesRelative();
            m8598(compoundDrawablesRelative[0], this.f7717);
            m8598(compoundDrawablesRelative[2], this.f7721);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m8598(Drawable drawable, C1288 r3) {
        if (drawable != null && r3 != null) {
            C1641.m9448(drawable, r3, this.f7713.getDrawableState());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C1288 m8599(Context context, C1641 r1, int i) {
        ColorStateList r0 = r1.m9450(context, i);
        if (r0 == null) {
            return null;
        }
        C1288 r12 = new C1288();
        r12.f7236 = true;
        r12.f7234 = r0;
        return r12;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m8615(boolean z, int i, int i2, int i3, int i4) {
        if (!C0664.f4738) {
            m8617();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m8620(int i, float f) {
        if (!C0664.f4738 && !m8616()) {
            m8603(i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m8617() {
        this.f7712.m9431();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m8616() {
        return this.f7712.m9425();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m8603(int i, float f) {
        this.f7712.m9427(i, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m8605(int i) {
        this.f7712.m9426(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m8618(int i, int i2, int i3, int i4) {
        this.f7712.m9430(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m8612(int[] iArr, int i) {
        this.f7712.m9420(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public int m8619() {
        return this.f7712.m9423();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: І  reason: contains not printable characters */
    public int m8622() {
        return this.f7712.m9421();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public int m8624() {
        return this.f7712.m9429();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public int m8623() {
        return this.f7712.m9418();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public int[] m8607() {
        return this.f7712.m9428();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m8606(ColorStateList colorStateList) {
        if (this.f7722 == null) {
            this.f7722 = new C1288();
        }
        C1288 r0 = this.f7722;
        r0.f7234 = colorStateList;
        r0.f7236 = colorStateList != null;
        m8602();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m8613(PorterDuff.Mode mode) {
        if (this.f7722 == null) {
            this.f7722 = new C1288();
        }
        C1288 r0 = this.f7722;
        r0.f7233 = mode;
        r0.f7235 = mode != null;
        m8602();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private void m8602() {
        C1288 r0 = this.f7722;
        this.f7718 = r0;
        this.f7716 = r0;
        this.f7719 = r0;
        this.f7711 = r0;
        this.f7717 = r0;
        this.f7721 = r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m8601(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f7713.getCompoundDrawablesRelative();
            TextView textView = this.f7713;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f7713.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f7713;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f7713.getCompoundDrawables();
            TextView textView3 = this.f7713;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }
}
