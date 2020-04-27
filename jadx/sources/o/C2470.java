package o;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import o.C1146;
import o.C1483;

/* renamed from: o.т  reason: contains not printable characters */
final class C2470 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C1483.C1484 {

    /* renamed from: ı  reason: contains not printable characters */
    C0638 f11244;

    /* renamed from: Ι  reason: contains not printable characters */
    C1146 f11245;

    /* renamed from: ι  reason: contains not printable characters */
    C2328 f11246;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m12723(C2328 r1) {
        return false;
    }

    public C2470(C2328 r1) {
        this.f11246 = r1;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f11244.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f11244.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f11246.m12133(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f11246.performShortcut(i, keyEvent, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f11245.m7591(this.f11246, true);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m12722(C2328 r1, boolean z) {
        C0638 r12;
        if ((z || r1 == this.f11246) && (r12 = this.f11244) != null) {
            r12.dismiss();
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C2328 r3 = this.f11246;
        C1146 r0 = this.f11245;
        if (r0.f6677 == null) {
            r0.f6677 = new C1146.C1147();
        }
        r3.m12143((C2459) r0.f6677.getItem(i), (C1483) null, 0);
    }
}
