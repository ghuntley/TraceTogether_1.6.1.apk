package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* renamed from: o.ւɾ  reason: contains not printable characters */
class C3204 implements C3195 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3205 f14556;

    C3204(Context context, ViewGroup viewGroup, View view) {
        this.f14556 = new C3205(context, viewGroup, view, this);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16153(Drawable drawable) {
        C3205 r0 = this.f14556;
        if (!r0.f14559) {
            if (r0.f14557 == null) {
                r0.f14557 = new ArrayList<>();
            }
            if (!r0.f14557.contains(drawable)) {
                r0.f14557.add(drawable);
                r0.invalidate(drawable.getBounds());
                drawable.setCallback(r0);
                return;
            }
            return;
        }
        throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m16154(Drawable drawable) {
        C3205 r0 = this.f14556;
        if (r0.f14557 != null) {
            r0.f14557.remove(drawable);
            r0.invalidate(drawable.getBounds());
            drawable.setCallback((Drawable.Callback) null);
            if (r0.getChildCount() != 0) {
                return;
            }
            if (r0.f14557 == null || r0.f14557.size() == 0) {
                r0.f14559 = true;
                r0.f14558.removeView(r0);
            }
        }
    }

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    /* renamed from: o.ւɾ$ǃ  reason: contains not printable characters */
    static class C3205 extends ViewGroup {

        /* renamed from: ı  reason: contains not printable characters */
        ArrayList<Drawable> f14557 = null;

        /* renamed from: ǃ  reason: contains not printable characters */
        ViewGroup f14558;

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean f14559;

        /* renamed from: Ι  reason: contains not printable characters */
        private View f14560;

        /* renamed from: ι  reason: contains not printable characters */
        C3204 f14561;

        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }

        C3205(Context context, ViewGroup viewGroup, View view, C3204 r4) {
            super(context);
            this.f14558 = viewGroup;
            this.f14560 = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f14561 = r4;
        }

        /* access modifiers changed from: protected */
        public final boolean verifyDrawable(Drawable drawable) {
            if (super.verifyDrawable(drawable)) {
                return true;
            }
            ArrayList<Drawable> arrayList = this.f14557;
            return arrayList != null && arrayList.contains(drawable);
        }

        public final void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public final void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f14558.getLocationOnScreen(iArr);
            this.f14560.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f14560.getWidth(), this.f14560.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f14557;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f14557.get(i).draw(canvas);
            }
        }

        public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f14558 == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            ViewGroup viewGroup = this.f14558;
            if (viewGroup != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                int[] iArr3 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                this.f14560.getLocationOnScreen(iArr3);
                int[] iArr4 = {iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]};
                rect.offset(iArr4[0], iArr4[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }
    }
}
