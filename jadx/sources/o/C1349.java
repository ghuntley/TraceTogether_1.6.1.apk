package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import o.C0785;
import o.C3177;

/* renamed from: o.ɪɛ  reason: contains not printable characters */
public final class C1349 extends Drawable implements C3177.If {

    /* renamed from: ı  reason: contains not printable characters */
    public final WeakReference<Context> f7479;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final float f7480;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1350 f7481;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final float f7482;

    /* renamed from: ɨ  reason: contains not printable characters */
    private float f7483;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3177 f7484;

    /* renamed from: ɪ  reason: contains not printable characters */
    private float f7485;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Rect f7486 = new Rect();

    /* renamed from: ɾ  reason: contains not printable characters */
    private float f7487;

    /* renamed from: ɿ  reason: contains not printable characters */
    private float f7488;

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0671 f7489 = new C0671();

    /* renamed from: ι  reason: contains not printable characters */
    public int f7490;

    /* renamed from: І  reason: contains not printable characters */
    public WeakReference<ViewGroup> f7491;

    /* renamed from: і  reason: contains not printable characters */
    public WeakReference<View> f7492;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final float f7493;

    /* renamed from: ӏ  reason: contains not printable characters */
    private float f7494;

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return false;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: o.ɪɛ$ǃ  reason: contains not printable characters */
    public static final class C1350 implements Parcelable {
        public static final Parcelable.Creator<C1350> CREATOR = new Parcelable.Creator<C1350>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C1350[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C1350(parcel);
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        public int f7495 = -1;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public CharSequence f7496;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f7497 = 255;

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f7498;

        /* renamed from: ɹ  reason: contains not printable characters */
        public int f7499;

        /* renamed from: Ι  reason: contains not printable characters */
        public int f7500;

        /* renamed from: ι  reason: contains not printable characters */
        public int f7501;

        /* renamed from: І  reason: contains not printable characters */
        public int f7502;

        /* renamed from: і  reason: contains not printable characters */
        public int f7503;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public int f7504;

        public final int describeContents() {
            return 0;
        }

        public C1350(Context context) {
            this.f7498 = new C0303(context, R.style.f174122131951996).f3585.getDefaultColor();
            this.f7496 = "New notification";
            this.f7503 = R.plurals.f170082131755008;
        }

        protected C1350(Parcel parcel) {
            this.f7500 = parcel.readInt();
            this.f7498 = parcel.readInt();
            this.f7497 = parcel.readInt();
            this.f7495 = parcel.readInt();
            this.f7501 = parcel.readInt();
            this.f7496 = parcel.readString();
            this.f7503 = parcel.readInt();
            this.f7504 = parcel.readInt();
            this.f7499 = parcel.readInt();
            this.f7502 = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7500);
            parcel.writeInt(this.f7498);
            parcel.writeInt(this.f7497);
            parcel.writeInt(this.f7495);
            parcel.writeInt(this.f7501);
            parcel.writeString(this.f7496.toString());
            parcel.writeInt(this.f7503);
            parcel.writeInt(this.f7504);
            parcel.writeInt(this.f7499);
            parcel.writeInt(this.f7502);
        }
    }

    public C1349(Context context) {
        C0303 r0;
        Context context2;
        this.f7479 = new WeakReference<>(context);
        C3160.m15973(context, C3160.f14378, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.f7480 = (float) resources.getDimensionPixelSize(R.dimen.f158462131165363);
        this.f7482 = (float) resources.getDimensionPixelSize(R.dimen.f158452131165362);
        this.f7493 = (float) resources.getDimensionPixelSize(R.dimen.f158492131165366);
        this.f7484 = new C3177(this);
        this.f7484.f14435.setTextAlign(Paint.Align.CENTER);
        this.f7481 = new C1350(context);
        Context context3 = this.f7479.get();
        if (context3 != null && this.f7484.f14436 != (r0 = new C0303(context3, R.style.f174122131951996)) && (context2 = this.f7479.get()) != null) {
            this.f7484.m16030(r0, context2);
            m8450();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8451(View view, ViewGroup viewGroup) {
        this.f7492 = new WeakReference<>(view);
        this.f7491 = new WeakReference<>(viewGroup);
        m8450();
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.f7481.f7497;
    }

    public final void setAlpha(int i) {
        this.f7481.f7497 = i;
        this.f7484.f14435.setAlpha(i);
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return this.f7486.height();
    }

    public final int getIntrinsicWidth() {
        return this.f7486.width();
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f7489.draw(canvas);
            if (this.f7481.f7495 != -1) {
                Rect rect = new Rect();
                String r1 = m8447();
                this.f7484.f14435.getTextBounds(r1, 0, r1.length(), rect);
                canvas.drawText(r1, this.f7483, this.f7494 + ((float) (rect.height() / 2)), this.f7484.f14435);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8449() {
        invalidateSelf();
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m8450() {
        Context context = this.f7479.get();
        WeakReference<View> weakReference = this.f7492;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f7486);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<ViewGroup> weakReference2 = this.f7491;
            if (weakReference2 != null) {
                viewGroup = weakReference2.get();
            }
            if (viewGroup != null || C1315.f7313) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            m8448(context, rect2, view);
            Rect rect3 = this.f7486;
            float f = this.f7483;
            float f2 = this.f7494;
            float f3 = this.f7485;
            float f4 = this.f7488;
            rect3.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
            C0671 r0 = this.f7489;
            float f5 = this.f7487;
            C0785.If ifR = new C0785.If(r0.f4785.f4796);
            ifR.f5228 = new C0531(f5);
            ifR.f5227 = new C0531(f5);
            ifR.f5235 = new C0531(f5);
            ifR.f5231 = new C0531(f5);
            r0.setShapeAppearanceModel(new C0785(ifR, (byte) 0));
            if (!rect.equals(this.f7486)) {
                this.f7489.setBounds(this.f7486);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m8448(Context context, Rect rect, View view) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        int i2 = this.f7481.f7504;
        if (i2 == 8388691 || i2 == 8388693) {
            this.f7494 = (float) (rect.bottom - this.f7481.f7502);
        } else {
            this.f7494 = (float) (rect.top + this.f7481.f7502);
        }
        boolean z = true;
        if (!(this.f7481.f7495 != -1)) {
            i = 0;
        } else {
            i = this.f7481.f7495;
        }
        if (i <= 9) {
            this.f7487 = !(this.f7481.f7495 != -1) ? this.f7480 : this.f7493;
            float f5 = this.f7487;
            this.f7488 = f5;
            this.f7485 = f5;
        } else {
            this.f7487 = this.f7493;
            this.f7488 = this.f7487;
            String r0 = m8447();
            C3177 r5 = this.f7484;
            if (!r5.f14432) {
                f3 = r5.f14434;
            } else {
                if (r0 == null) {
                    f4 = 0.0f;
                } else {
                    f4 = r5.f14435.measureText(r0, 0, r0.length());
                }
                r5.f14434 = f4;
                r5.f14432 = false;
                f3 = r5.f14434;
            }
            this.f7485 = (f3 / 2.0f) + this.f7482;
        }
        Resources resources = context.getResources();
        if (this.f7481.f7495 == -1) {
            z = false;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(z ? R.dimen.f158472131165364 : R.dimen.f158442131165361);
        int i3 = this.f7481.f7504;
        if (i3 == 8388659 || i3 == 8388691) {
            if (C0293.m4156(view) == 0) {
                f = (((float) rect.left) - this.f7485) + ((float) dimensionPixelSize) + ((float) this.f7481.f7499);
            } else {
                f = ((((float) rect.right) + this.f7485) - ((float) dimensionPixelSize)) - ((float) this.f7481.f7499);
            }
            this.f7483 = f;
            return;
        }
        if (C0293.m4156(view) == 0) {
            f2 = ((((float) rect.right) + this.f7485) - ((float) dimensionPixelSize)) - ((float) this.f7481.f7499);
        } else {
            f2 = (((float) rect.left) - this.f7485) + ((float) dimensionPixelSize) + ((float) this.f7481.f7499);
        }
        this.f7483 = f2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private String m8447() {
        int i;
        boolean z = true;
        int i2 = 0;
        if (!(this.f7481.f7495 != -1)) {
            i = 0;
        } else {
            i = this.f7481.f7495;
        }
        if (i <= this.f7490) {
            if (this.f7481.f7495 == -1) {
                z = false;
            }
            if (z) {
                i2 = this.f7481.f7495;
            }
            return Integer.toString(i2);
        }
        Context context = this.f7479.get();
        if (context == null) {
            return "";
        }
        return context.getString(R.string.f170932131886213, new Object[]{Integer.valueOf(this.f7490), "+"});
    }
}
