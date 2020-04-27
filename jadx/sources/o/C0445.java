package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: o.ıӀ  reason: contains not printable characters */
public final class C0445 extends C2999 implements C0919 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static Method f4035;

    /* renamed from: ι  reason: contains not printable characters */
    public C0919 f4036;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f4035 = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public C0445(Context context, int i, int i2) {
        super(context, (AttributeSet) null, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final C2688 m4739(Context context, boolean z) {
        C0446 r0 = new C0446(context, z);
        r0.setHoverListener(this);
        return r0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4741() {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f4035;
            if (method != null) {
                try {
                    method.invoke(this.f13819, new Object[]{Boolean.FALSE});
                } catch (Exception unused) {
                }
            }
        } else {
            this.f13819.setTouchModal(false);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4742(C2328 r2, MenuItem menuItem) {
        C0919 r0 = this.f4036;
        if (r0 != null) {
            r0.m6747(r2, menuItem);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4740(C2328 r2, MenuItem menuItem) {
        C0919 r0 = this.f4036;
        if (r0 != null) {
            r0.m6746(r2, menuItem);
        }
    }

    /* renamed from: o.ıӀ$ǃ  reason: contains not printable characters */
    public static class C0446 extends C2688 {

        /* renamed from: ǃ  reason: contains not printable characters */
        final int f4037;

        /* renamed from: ɩ  reason: contains not printable characters */
        private C0919 f4038;

        /* renamed from: Ι  reason: contains not printable characters */
        private MenuItem f4039;

        /* renamed from: ι  reason: contains not printable characters */
        final int f4040;

        public final /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public final /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public final /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ int m4743(int i, int i2, int i3, int i4, int i5) {
            return super.m14292(i, i2, i3, i4, i5);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ boolean m4744(MotionEvent motionEvent, int i) {
            return super.m14293(motionEvent, i);
        }

        public C0446(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f4040 = 22;
                this.f4037 = 21;
                return;
            }
            this.f4040 = 21;
            this.f4037 = 22;
        }

        public final void setHoverListener(C0919 r1) {
            this.f4038 = r1;
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            C1475 r0 = (C1475) getSelectedView();
            if (r0 != null && i == this.f4040) {
                if (r0.isEnabled() && r0.f7925.hasSubMenu()) {
                    performItemClick(r0, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (r0 == null || i != this.f4037) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C1487) getAdapter()).f7948.m12133(false);
                return true;
            }
        }

        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C1487 r0;
            int pointToPosition;
            int i2;
            if (this.f4038 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    r0 = (C1487) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    r0 = (C1487) adapter;
                }
                C2459 r2 = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < r0.getCount()) {
                    r2 = r0.getItem(i2);
                }
                MenuItem menuItem = this.f4039;
                if (menuItem != r2) {
                    C2328 r02 = r0.f7948;
                    if (menuItem != null) {
                        this.f4038.m6746(r02, menuItem);
                    }
                    this.f4039 = r2;
                    if (r2 != null) {
                        this.f4038.m6747(r02, r2);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
    }
}
