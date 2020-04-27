package o;

import android.content.Context;

/* renamed from: o.bh  reason: case insensitive filesystem */
public final class C3297bh implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final Context f1748;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C3294be f1749;

    public C3297bh(Context context, C3294be beVar) {
        this.f1748 = context;
        this.f1749 = beVar;
    }

    public final void run() {
        try {
            C3285aw.m1690(this.f1748);
            if (!this.f1749.m1777()) {
                this.f1749.m1776();
            }
        } catch (Exception unused) {
            C3285aw.m1663(this.f1748);
        }
    }
}
