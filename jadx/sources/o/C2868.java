package o;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import o.C1483;
import o.C2026;
import o.C2328;
import o.C3282auX;

/* renamed from: o.ӏ  reason: contains not printable characters */
final class C2868 extends C3282auX {

    /* renamed from: ı  reason: contains not printable characters */
    Window.Callback f13382;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f13383;

    /* renamed from: ɩ  reason: contains not printable characters */
    boolean f13384;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Runnable f13385 = new Runnable() {
        public final void run() {
            C2868 r0 = C2868.this;
            Menu r1 = r0.m14917();
            C2328 r2 = r1 instanceof C2328 ? (C2328) r1 : null;
            if (r2 != null && !r2.f10820) {
                r2.f10820 = true;
                r2.f10809 = false;
                r2.f10811 = false;
            }
            try {
                r1.clear();
                if (!r0.f13382.onCreatePanelMenu(0, r1) || !r0.f13382.onPreparePanel(0, (View) null, r1)) {
                    r1.clear();
                }
                if (r2 == null) {
                    return;
                }
            } finally {
                if (r2 != null) {
                    r2.f10820 = false;
                    if (r2.f10809) {
                        r2.f10809 = false;
                        r2.m12149(r2.f10811);
                    }
                }
            }
        }
    };

    /* renamed from: Ι  reason: contains not printable characters */
    C2717 f13386;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f13387;

    /* renamed from: І  reason: contains not printable characters */
    private ArrayList<C3282auX.Cif> f13388 = new ArrayList<>();

    /* renamed from: і  reason: contains not printable characters */
    private final C2026.Cif f13389 = new C2026.Cif() {
        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m14926(MenuItem menuItem) {
            return C2868.this.f13382.onMenuItemSelected(0, menuItem);
        }
    };

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14912(boolean z) {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14915(boolean z) {
    }

    C2868(C2026 r3, CharSequence charSequence, Window.Callback callback) {
        this.f13386 = new C1920(r3, false);
        this.f13382 = new If(callback);
        this.f13386.m14432(this.f13382);
        r3.setOnMenuItemClickListener(this.f13389);
        this.f13386.m14428(charSequence);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Context m14918() {
        return this.f13386.m14425();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14914(Configuration configuration) {
        super.m1634(configuration);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m14921(CharSequence charSequence) {
        this.f13386.m14439(charSequence);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m14919(CharSequence charSequence) {
        this.f13386.m14428(charSequence);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m14911() {
        return this.f13386.m14436();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m14909() {
        return this.f13386.m14445();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m14916() {
        return this.f13386.m14424();
    }

    /* renamed from: І  reason: contains not printable characters */
    public final boolean m14923() {
        this.f13386.m14437().removeCallbacks(this.f13385);
        C0293.m4204((View) this.f13386.m14437(), this.f13385);
        return true;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final boolean m14924() {
        if (!this.f13386.m14423()) {
            return false;
        }
        this.f13386.m14441();
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m14910(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.f13386.m14445();
        }
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m14913(int i, KeyEvent keyEvent) {
        Menu r0 = m14917();
        if (r0 == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        r0.setQwertyMode(z);
        return r0.performShortcut(i, keyEvent, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m14925() {
        this.f13386.m14437().removeCallbacks(this.f13385);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m14922(boolean z) {
        if (z != this.f13383) {
            this.f13383 = z;
            int size = this.f13388.size();
            for (int i = 0; i < size; i++) {
                this.f13388.get(i);
            }
        }
    }

    /* renamed from: o.ӏ$If */
    class If extends C0714 {
        public If(Window.Callback callback) {
            super(callback);
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !C2868.this.f13384) {
                C2868.this.f13386.m14444();
                C2868.this.f13384 = true;
            }
            return onPreparePanel;
        }

        public final View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C2868.this.f13386.m14425());
            }
            return super.onCreatePanelView(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final Menu m14917() {
        if (!this.f13387) {
            this.f13386.m14440(new C2870(), new C2869());
            this.f13387 = true;
        }
        return this.f13386.m14446();
    }

    /* renamed from: o.ӏ$ɩ  reason: contains not printable characters */
    final class C2870 implements C1483.C1484 {

        /* renamed from: ı  reason: contains not printable characters */
        private boolean f13394;

        C2870() {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m14930(C2328 r3) {
            if (C2868.this.f13382 == null) {
                return false;
            }
            C2868.this.f13382.onMenuOpened(108, r3);
            return true;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m14929(C2328 r2, boolean z) {
            if (!this.f13394) {
                this.f13394 = true;
                C2868.this.f13386.m14434();
                if (C2868.this.f13382 != null) {
                    C2868.this.f13382.onPanelClosed(108, r2);
                }
                this.f13394 = false;
            }
        }
    }

    /* renamed from: o.ӏ$ǃ  reason: contains not printable characters */
    final class C2869 implements C2328.Cif {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m14927(C2328 r1, MenuItem menuItem) {
            return false;
        }

        C2869() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m14928(C2328 r5) {
            if (C2868.this.f13382 == null) {
                return;
            }
            if (C2868.this.f13386.m14435()) {
                C2868.this.f13382.onPanelClosed(108, r5);
            } else if (C2868.this.f13382.onPreparePanel(0, (View) null, r5)) {
                C2868.this.f13382.onMenuOpened(108, r5);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m14920(boolean z) {
        this.f13386.m14430(((z ? 4 : 0) & 4) | (this.f13386.m14436() & -5));
    }
}
