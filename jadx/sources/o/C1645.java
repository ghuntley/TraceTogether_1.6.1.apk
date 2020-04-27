package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import o.C2745;

/* renamed from: o.ʏ  reason: contains not printable characters */
abstract class C1645 extends ViewGroup {

    /* renamed from: ı  reason: contains not printable characters */
    protected final Context f8611;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean f8612;

    /* renamed from: ǃ  reason: contains not printable characters */
    protected int f8613;

    /* renamed from: ɩ  reason: contains not printable characters */
    protected final Cif f8614 = new Cif();

    /* renamed from: Ι  reason: contains not printable characters */
    protected C2118 f8615;

    /* renamed from: ι  reason: contains not printable characters */
    protected C2348 f8616;

    /* renamed from: І  reason: contains not printable characters */
    protected C0358 f8617;

    /* renamed from: і  reason: contains not printable characters */
    private boolean f8618;

    C1645(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.f148132130968579, typedValue, true) || typedValue.resourceId == 0) {
            this.f8611 = context;
        } else {
            this.f8611 = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C2745.aux.f12818, R.attr.f148162130968582, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C2745.aux.f12806, 0));
        obtainStyledAttributes.recycle();
        C2348 r5 = this.f8616;
        if (r5 != null) {
            r5.f10876 = new C1560(r5.f6335).m9186();
            if (r5.f6336 != null) {
                r5.f6336.m12149(true);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8612 = false;
        }
        if (!this.f8612) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f8612 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8612 = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8618 = false;
        }
        if (!this.f8618) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f8618 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8618 = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f8613 = i;
        requestLayout();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C0358 m9470(int i, long j) {
        C0358 r0 = this.f8617;
        if (r0 != null) {
            r0.m4529();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0358 r02 = C0293.m4169(this).m4526(1.0f);
            r02.m4531(j);
            r02.m4533((C0300) this.f8614.m9475(r02, i));
            return r02;
        }
        C0358 r03 = C0293.m4169(this).m4526(0.0f);
        r03.m4531(j);
        r03.m4533((C0300) this.f8614.m9475(r03, i));
        return r03;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0358 r0 = this.f8617;
            if (r0 != null) {
                r0.m4529();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public boolean m9471() {
        C2348 r0 = this.f8616;
        if (r0 != null) {
            return r0.m12296();
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    protected static int m9468(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: o.ʏ$if  reason: invalid class name */
    public class Cif implements C0300 {

        /* renamed from: ɩ  reason: contains not printable characters */
        private int f8620;

        /* renamed from: ι  reason: contains not printable characters */
        private boolean f8621 = false;

        protected Cif() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final Cif m9475(C0358 r2, int i) {
            C1645.this.f8617 = r2;
            this.f8620 = i;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m9474(View view) {
            C1645.super.setVisibility(0);
            this.f8621 = false;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m9473(View view) {
            if (!this.f8621) {
                C1645 r2 = C1645.this;
                r2.f8617 = null;
                C1645.super.setVisibility(this.f8620);
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m9472(View view) {
            this.f8621 = true;
        }
    }
}
