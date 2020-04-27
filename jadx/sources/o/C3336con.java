package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: o.con  reason: case insensitive filesystem */
public abstract class C3336con {

    /* renamed from: ı  reason: contains not printable characters */
    private static int f2000 = -100;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C0639<WeakReference<C3336con>> f2001 = new C0639<>();

    /* renamed from: ι  reason: contains not printable characters */
    private static final Object f2002 = new Object();

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m1986();

    /* renamed from: ı  reason: contains not printable characters */
    public void m1987(int i) {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m1988(Context context) {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m1989(Bundle bundle);

    /* renamed from: Ɩ  reason: contains not printable characters */
    public int m1990() {
        return -100;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m1991();

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract C3282auX m1992();

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m1993(int i);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m1994(Bundle bundle);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m1995(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m1996(CharSequence charSequence);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m1997(C2026 r1);

    /* renamed from: ɹ  reason: contains not printable characters */
    public abstract void m1998();

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m1999();

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m2000(Configuration configuration);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m2001(View view);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m2002(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract boolean m2003(int i);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract MenuInflater m2004();

    /* renamed from: ι  reason: contains not printable characters */
    public abstract <T extends View> T m2005(int i);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m2006(Bundle bundle);

    /* renamed from: і  reason: contains not printable characters */
    public abstract void m2007();

    /* renamed from: Ӏ  reason: contains not printable characters */
    public abstract void m2008();

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C3336con m1981(Activity activity, C3249AUx aUx) {
        return new AUX(activity, aUx);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C3336con m1982(Dialog dialog, C3249AUx aUx) {
        return new AUX(dialog, aUx);
    }

    C3336con() {
    }

    /* renamed from: І  reason: contains not printable characters */
    public static int m1985() {
        return f2000;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static void m1984(C3336con con) {
        synchronized (f2002) {
            m1980(con);
            f2001.add(new WeakReference(con));
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static void m1983(C3336con con) {
        synchronized (f2002) {
            m1980(con);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m1980(C3336con con) {
        synchronized (f2002) {
            Iterator<WeakReference<C3336con>> it = f2001.iterator();
            while (it.hasNext()) {
                C3336con con2 = (C3336con) it.next().get();
                if (con2 == con || con2 == null) {
                    it.remove();
                }
            }
        }
    }
}
