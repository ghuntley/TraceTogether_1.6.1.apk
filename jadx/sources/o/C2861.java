package o;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;

/* renamed from: o.ӊ  reason: contains not printable characters */
public class C2861 extends C2115 implements Checkable {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final int[] f13322 = {16842912};

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f13323;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f13324;

    /* renamed from: ι  reason: contains not printable characters */
    boolean f13325;

    public C2861(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2861(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f151982130968991);
    }

    public C2861(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13325 = true;
        this.f13323 = true;
        C0293.m4151((View) this, (C2449) new C2449() {
            /* renamed from: Ι  reason: contains not printable characters */
            public final void m14858(View view, AccessibilityEvent accessibilityEvent) {
                super.m12584(view, accessibilityEvent);
                accessibilityEvent.setChecked(C2861.this.isChecked());
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m14857(View view, C0520 r2) {
                super.m12579(view, r2);
                r2.m5060(C2861.this.f13325);
                r2.m5053(C2861.this.isChecked());
            }
        });
    }

    public void setChecked(boolean z) {
        if (this.f13325 && this.f13324 != z) {
            this.f13324 = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public boolean isChecked() {
        return this.f13324;
    }

    public void toggle() {
        setChecked(!this.f13324);
    }

    public void setPressed(boolean z) {
        if (this.f13323) {
            super.setPressed(z);
        }
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f13324) {
            return mergeDrawableStates(super.onCreateDrawableState(i + f13322.length), f13322);
        }
        return super.onCreateDrawableState(i);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C2862 r1 = new C2862(super.onSaveInstanceState());
        r1.f13327 = this.f13324;
        return r1;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2862)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2862 r2 = (C2862) parcelable;
        super.onRestoreInstanceState(r2.f6905);
        setChecked(r2.f13327);
    }

    public void setCheckable(boolean z) {
        if (this.f13325 != z) {
            this.f13325 = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setPressable(boolean z) {
        this.f13323 = z;
    }

    /* renamed from: o.ӊ$ı  reason: contains not printable characters */
    static class C2862 extends C1219 {
        public static final Parcelable.Creator<C2862> CREATOR = new Parcelable.ClassLoaderCreator<C2862>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2862(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C2862[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C2862(parcel, (ClassLoader) null);
            }
        };

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean f13327;

        public C2862(Parcelable parcelable) {
            super(parcelable);
        }

        public C2862(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13327 = parcel.readInt() != 1 ? false : true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13327 ? 1 : 0);
        }
    }
}
