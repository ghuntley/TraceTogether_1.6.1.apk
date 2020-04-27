package o;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: o.аı  reason: contains not printable characters */
public final class C2386 implements View.OnTouchListener {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Dialog f10934;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f10935;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f10936;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f10937;

    public C2386(Dialog dialog, Rect rect) {
        this.f10934 = dialog;
        this.f10937 = rect.left;
        this.f10935 = rect.top;
        this.f10936 = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f10937 + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f10935 + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(4);
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f10936;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f10934.onTouchEvent(obtain);
    }
}
