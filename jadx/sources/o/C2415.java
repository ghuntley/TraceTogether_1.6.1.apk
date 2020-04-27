package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: o.гΙ  reason: contains not printable characters */
class C2415 {

    /* renamed from: ǃ  reason: contains not printable characters */
    protected If f10999;

    C2415(Context context, ViewGroup viewGroup, View view) {
        this.f10999 = new If(context, viewGroup, view, this);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static ViewGroup m12464(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static C2415 m12463(View view) {
        ViewGroup r0 = m12464(view);
        if (r0 == null) {
            return null;
        }
        int childCount = r0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = r0.getChildAt(i);
            if (childAt instanceof If) {
                return ((If) childAt).f11003;
            }
        }
        return new C2253(r0.getContext(), r0, view);
    }

    /* renamed from: o.гΙ$If */
    static class If extends ViewGroup {

        /* renamed from: ǃ  reason: contains not printable characters */
        static Method f11000;

        /* renamed from: ı  reason: contains not printable characters */
        ArrayList<Drawable> f11001 = null;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private boolean f11002;

        /* renamed from: ɩ  reason: contains not printable characters */
        C2415 f11003;

        /* renamed from: Ι  reason: contains not printable characters */
        View f11004;

        /* renamed from: ι  reason: contains not printable characters */
        ViewGroup f11005;

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                f11000 = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        If(Context context, ViewGroup viewGroup, View view, C2415 r4) {
            super(context);
            this.f11005 = viewGroup;
            this.f11004 = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f11003 = r4;
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(Drawable drawable) {
            if (super.verifyDrawable(drawable)) {
                return true;
            }
            ArrayList<Drawable> arrayList = this.f11001;
            return arrayList != null && arrayList.contains(drawable);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m12469(View view) {
            m12466();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f11005 || viewGroup.getParent() == null || !C0293.m4187(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f11005.getLocationOnScreen(iArr2);
                    C0293.m4221(view, iArr[0] - iArr2[0]);
                    C0293.m4164(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m12468(View view) {
            super.removeView(view);
            m12467();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private void m12466() {
            if (this.f11002) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        private void m12467() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f11001;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f11002 = true;
                    this.f11005.removeView(this);
                }
            }
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f11005.getLocationOnScreen(iArr);
            this.f11004.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f11004.getWidth(), this.f11004.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f11001;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f11001.get(i).draw(canvas);
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        private void m12465(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f11005.getLocationOnScreen(iArr2);
            this.f11004.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f11005 == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f11005 instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m12465(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }
    }
}
