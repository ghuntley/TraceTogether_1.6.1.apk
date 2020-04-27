package o;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import o.C1277;
import o.C2319;

/* renamed from: o.ʟɩ  reason: contains not printable characters */
public abstract class C1683 extends C2676 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1550 f8710;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C1795 f8711;

    /* renamed from: ɩ  reason: contains not printable characters */
    private ArrayList<C1277.C1280> f8712;

    /* renamed from: ɹ  reason: contains not printable characters */
    private C1277 f8713;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f8714;

    /* renamed from: ι  reason: contains not printable characters */
    private ArrayList<C1277> f8715;

    /* renamed from: і  reason: contains not printable characters */
    private boolean f8716;

    /* renamed from: ı  reason: contains not printable characters */
    public abstract C1277 m9570(int i);

    @Deprecated
    public C1683(C1550 r2) {
        this(r2, 0);
    }

    public C1683(C1550 r3, int i) {
        this.f8711 = null;
        this.f8712 = new ArrayList<>();
        this.f8715 = new ArrayList<>();
        this.f8713 = null;
        this.f8710 = r3;
        this.f8714 = i;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m9573(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public Object m9575(ViewGroup viewGroup, int i) {
        C1277.C1280 r1;
        C1277 r0;
        if (this.f8715.size() > i && (r0 = this.f8715.get(i)) != null) {
            return r0;
        }
        if (this.f8711 == null) {
            this.f8711 = this.f8710.m9099();
        }
        C1277 r02 = m9570(i);
        if (this.f8712.size() > i && (r1 = this.f8712.get(i)) != null) {
            r02.setInitialSavedState(r1);
        }
        while (this.f8715.size() <= i) {
            this.f8715.add((Object) null);
        }
        r02.setMenuVisibility(false);
        if (this.f8714 == 0) {
            r02.setUserVisibleHint(false);
        }
        this.f8715.set(i, r02);
        this.f8711.m9958(viewGroup.getId(), r02);
        if (this.f8714 == 1) {
            this.f8711.m9961(r02, C2319.Cif.STARTED);
        }
        return r02;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m9578(ViewGroup viewGroup, int i, Object obj) {
        C1277 r5 = (C1277) obj;
        if (this.f8711 == null) {
            this.f8711 = this.f8710.m9099();
        }
        while (this.f8712.size() <= i) {
            this.f8712.add((Object) null);
        }
        this.f8712.set(i, r5.isAdded() ? this.f8710.m9133(r5) : null);
        this.f8715.set(i, (Object) null);
        this.f8711.m9965(r5);
        if (r5.equals(this.f8713)) {
            this.f8713 = null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m9574(ViewGroup viewGroup, int i, Object obj) {
        C1277 r5 = (C1277) obj;
        C1277 r3 = this.f8713;
        if (r5 != r3) {
            if (r3 != null) {
                r3.setMenuVisibility(false);
                if (this.f8714 == 1) {
                    if (this.f8711 == null) {
                        this.f8711 = this.f8710.m9099();
                    }
                    this.f8711.m9961(this.f8713, C2319.Cif.STARTED);
                } else {
                    this.f8713.setUserVisibleHint(false);
                }
            }
            r5.setMenuVisibility(true);
            if (this.f8714 == 1) {
                if (this.f8711 == null) {
                    this.f8711 = this.f8710.m9099();
                }
                this.f8711.m9961(r5, C2319.Cif.RESUMED);
            } else {
                r5.setUserVisibleHint(true);
            }
            this.f8713 = r5;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: ı  reason: contains not printable characters */
    public void m9571(ViewGroup viewGroup) {
        C1795 r3 = this.f8711;
        if (r3 != null) {
            if (!this.f8716) {
                try {
                    this.f8716 = true;
                    r3.m9963();
                    this.f8716 = false;
                } catch (Throwable th) {
                    this.f8716 = false;
                    throw th;
                }
            }
            this.f8711 = null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m9572(View view, Object obj) {
        return ((C1277) obj).getView() == view;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public Parcelable m9576() {
        Bundle bundle;
        if (this.f8712.size() > 0) {
            bundle = new Bundle();
            C1277.C1280[] r1 = new C1277.C1280[this.f8712.size()];
            this.f8712.toArray(r1);
            bundle.putParcelableArray("states", r1);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f8715.size(); i++) {
            C1277 r2 = this.f8715.get(i);
            if (r2 != null && r2.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f8710.m9100(bundle, "f" + i, r2);
            }
        }
        return bundle;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m9577(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f8712.clear();
            this.f8715.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f8712.add((C1277.C1280) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    C1277 r3 = this.f8710.m9113(bundle, str);
                    if (r3 != null) {
                        while (this.f8715.size() <= parseInt) {
                            this.f8715.add((Object) null);
                        }
                        r3.setMenuVisibility(false);
                        this.f8715.set(parseInt, r3);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }
}
