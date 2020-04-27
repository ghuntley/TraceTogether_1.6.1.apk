package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import o.C0858;

/* renamed from: o.ƭł  reason: contains not printable characters */
public class C0785 {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C0460 f5213 = new C0621(0.5f);

    /* renamed from: ı  reason: contains not printable characters */
    public C2197 f5214;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public C0460 f5215;

    /* renamed from: ǃ  reason: contains not printable characters */
    public C2197 f5216;

    /* renamed from: ȷ  reason: contains not printable characters */
    C0565 f5217;

    /* renamed from: ɪ  reason: contains not printable characters */
    C0565 f5218;

    /* renamed from: ɹ  reason: contains not printable characters */
    public C0460 f5219;

    /* renamed from: Ι  reason: contains not printable characters */
    public C2197 f5220;

    /* renamed from: ι  reason: contains not printable characters */
    public C2197 f5221;

    /* renamed from: І  reason: contains not printable characters */
    public C0460 f5222;

    /* renamed from: і  reason: contains not printable characters */
    public C0565 f5223;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public C0460 f5224;

    /* renamed from: ӏ  reason: contains not printable characters */
    C0565 f5225;

    /* renamed from: o.ƭł$ɩ  reason: contains not printable characters */
    public interface C0786 {
        /* renamed from: ı  reason: contains not printable characters */
        C0460 m6134(C0460 r1);
    }

    public /* synthetic */ C0785(If ifR, byte b) {
        this(ifR);
    }

    /* renamed from: o.ƭł$If */
    public static final class If {

        /* renamed from: ı  reason: contains not printable characters */
        public C2197 f5226 = new C0623();

        /* renamed from: Ɩ  reason: contains not printable characters */
        public C0460 f5227 = new C0531(0.0f);

        /* renamed from: ǃ  reason: contains not printable characters */
        public C0460 f5228 = new C0531(0.0f);

        /* renamed from: ȷ  reason: contains not printable characters */
        public C0565 f5229 = new C0565();

        /* renamed from: ɩ  reason: contains not printable characters */
        public C2197 f5230 = new C0623();

        /* renamed from: ɹ  reason: contains not printable characters */
        public C0460 f5231 = new C0531(0.0f);

        /* renamed from: ɾ  reason: contains not printable characters */
        C0565 f5232 = new C0565();

        /* renamed from: Ι  reason: contains not printable characters */
        public C2197 f5233 = new C0623();

        /* renamed from: ι  reason: contains not printable characters */
        public C2197 f5234 = new C0623();

        /* renamed from: І  reason: contains not printable characters */
        public C0460 f5235 = new C0531(0.0f);

        /* renamed from: і  reason: contains not printable characters */
        C0565 f5236 = new C0565();

        /* renamed from: Ӏ  reason: contains not printable characters */
        public C0565 f5237 = new C0565();

        public If() {
        }

        public If(C0785 r3) {
            this.f5234 = r3.f5221;
            this.f5226 = r3.f5220;
            this.f5233 = r3.f5214;
            this.f5230 = r3.f5216;
            this.f5228 = r3.f5215;
            this.f5227 = r3.f5219;
            this.f5235 = r3.f5224;
            this.f5231 = r3.f5222;
            this.f5237 = r3.f5223;
            this.f5236 = r3.f5225;
            this.f5229 = r3.f5218;
            this.f5232 = r3.f5217;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public static float m6133(C2197 r1) {
            if (r1 instanceof C0623) {
                return ((C0623) r1).f4589;
            }
            if (r1 instanceof C0567) {
                return ((C0567) r1).f4469;
            }
            return -1.0f;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static If m6131(Context context, AttributeSet attributeSet, int i, int i2, C0460 r5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0858.Aux.f5599, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return m6130(context, resourceId, resourceId2, r5);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static If m6130(Context context, int i, int i2, C0460 r11) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C0858.Aux.f5605);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            C0460 r112 = m6129(obtainStyledAttributes, 5, r11);
            C0460 r2 = m6129(obtainStyledAttributes, 8, r112);
            C0460 r3 = m6129(obtainStyledAttributes, 9, r112);
            C0460 r4 = m6129(obtainStyledAttributes, 7, r112);
            C0460 r113 = m6129(obtainStyledAttributes, 6, r112);
            If ifR = new If();
            C2197 r10 = C2745.m14530(i4);
            ifR.f5234 = r10;
            float r102 = If.m6133(r10);
            if (r102 != -1.0f) {
                ifR.f5228 = new C0531(r102);
            }
            ifR.f5228 = r2;
            C2197 r103 = C2745.m14530(i5);
            ifR.f5226 = r103;
            float r104 = If.m6133(r103);
            if (r104 != -1.0f) {
                ifR.f5227 = new C0531(r104);
            }
            ifR.f5227 = r3;
            C2197 r105 = C2745.m14530(i6);
            ifR.f5233 = r105;
            float r106 = If.m6133(r105);
            if (r106 != -1.0f) {
                ifR.f5235 = new C0531(r106);
            }
            ifR.f5235 = r4;
            C2197 r9 = C2745.m14530(i7);
            ifR.f5230 = r9;
            float r92 = If.m6133(r9);
            if (r92 != -1.0f) {
                ifR.f5231 = new C0531(r92);
            }
            ifR.f5231 = r113;
            return ifR;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static C0460 m6129(TypedArray typedArray, int i, C0460 r4) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return r4;
        }
        if (peekValue.type == 5) {
            return new C0531((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return peekValue.type == 6 ? new C0621(peekValue.getFraction(1.0f, 1.0f)) : r4;
    }

    private C0785(If ifR) {
        this.f5221 = ifR.f5234;
        this.f5220 = ifR.f5226;
        this.f5214 = ifR.f5233;
        this.f5216 = ifR.f5230;
        this.f5215 = ifR.f5228;
        this.f5219 = ifR.f5227;
        this.f5224 = ifR.f5235;
        this.f5222 = ifR.f5231;
        this.f5223 = ifR.f5237;
        this.f5225 = ifR.f5236;
        this.f5218 = ifR.f5229;
        this.f5217 = ifR.f5232;
    }

    public C0785() {
        this.f5221 = new C0623();
        this.f5220 = new C0623();
        this.f5214 = new C0623();
        this.f5216 = new C0623();
        this.f5215 = new C0531(0.0f);
        this.f5219 = new C0531(0.0f);
        this.f5224 = new C0531(0.0f);
        this.f5222 = new C0531(0.0f);
        this.f5223 = new C0565();
        this.f5225 = new C0565();
        this.f5218 = new C0565();
        this.f5217 = new C0565();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m6132(RectF rectF) {
        boolean z = this.f5217.getClass().equals(C0565.class) && this.f5225.getClass().equals(C0565.class) && this.f5223.getClass().equals(C0565.class) && this.f5218.getClass().equals(C0565.class);
        float r3 = this.f5215.m4787(rectF);
        return z && ((this.f5219.m4787(rectF) > r3 ? 1 : (this.f5219.m4787(rectF) == r3 ? 0 : -1)) == 0 && (this.f5222.m4787(rectF) > r3 ? 1 : (this.f5222.m4787(rectF) == r3 ? 0 : -1)) == 0 && (this.f5224.m4787(rectF) > r3 ? 1 : (this.f5224.m4787(rectF) == r3 ? 0 : -1)) == 0) && ((this.f5220 instanceof C0623) && (this.f5221 instanceof C0623) && (this.f5214 instanceof C0623) && (this.f5216 instanceof C0623));
    }
}
