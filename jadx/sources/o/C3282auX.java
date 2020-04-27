package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.IInterface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import o.C2407;
import o.C2745;

/* renamed from: o.auX  reason: case insensitive filesystem */
public abstract class C3282auX {

    /* renamed from: o.auX$if  reason: invalid class name */
    public interface Cif extends IInterface {
        /* renamed from: ı  reason: contains not printable characters */
        boolean m1647();

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean m1648();
    }

    @Deprecated
    /* renamed from: o.auX$ɩ  reason: contains not printable characters */
    public static abstract class C0120 {
        /* renamed from: ı  reason: contains not printable characters */
        public abstract View m1649();

        /* renamed from: ǃ  reason: contains not printable characters */
        public abstract CharSequence m1650();

        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract Drawable m1651();

        /* renamed from: Ι  reason: contains not printable characters */
        public abstract CharSequence m1652();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m1629() {
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m1630(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract int m1631();

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m1632(boolean z) {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m1633(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m1634(Configuration configuration) {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m1635(boolean z) {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m1636() {
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public Context m1637() {
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C2407 m1638(C2407.If ifR) {
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m1639(CharSequence charSequence) {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m1640(boolean z);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m1642(CharSequence charSequence);

    /* renamed from: ι  reason: contains not printable characters */
    public void m1643(boolean z) {
    }

    /* renamed from: І  reason: contains not printable characters */
    public boolean m1644() {
        return false;
    }

    /* renamed from: і  reason: contains not printable characters */
    public boolean m1645() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public void m1646() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m1641() {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    /* renamed from: o.auX$ı  reason: contains not printable characters */
    public static class C0119 extends ViewGroup.MarginLayoutParams {

        /* renamed from: ǃ  reason: contains not printable characters */
        public int f1551;

        public C0119(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1551 = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2745.aux.f12802);
            this.f1551 = obtainStyledAttributes.getInt(C2745.aux.f12890, 0);
            obtainStyledAttributes.recycle();
        }

        public C0119() {
            super(-2, -2);
            this.f1551 = 0;
            this.f1551 = 8388627;
        }

        public C0119(C0119 r2) {
            super(r2);
            this.f1551 = 0;
            this.f1551 = r2.f1551;
        }

        public C0119(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1551 = 0;
        }
    }
}
