package o;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o.C3604mq;
import o.C3611mx;

/* renamed from: o.mz  reason: case insensitive filesystem */
final class C3613mz implements C3611mx.Cif {

    /* renamed from: ı  reason: contains not printable characters */
    private final long f3366;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final List<mF> f3367;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final List<mF> f3368;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3612my f3369;

    /* renamed from: ι  reason: contains not printable characters */
    private final List<mE> f3370;

    /* renamed from: І  reason: contains not printable characters */
    private final boolean f3371;

    C3613mz(Context context, C3604mq.C0256 r4) {
        this.f3369 = new C3612my(context);
        this.f3370 = r4.f3314;
        this.f3367 = r4.f3311;
        this.f3368 = r4.f3317;
        this.f3366 = r4.f3316;
        this.f3371 = r4.f3315;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<mF> m3965() {
        return m3960(this.f3369.m3958(), m3960(this.f3368, this.f3367));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final mE m3968() {
        return m3959(2);
    }

    /* renamed from: і  reason: contains not printable characters */
    public final mE m3971() {
        return m3959(1);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final List<mF> m3962() {
        return this.f3367;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final List<mF> m3963(mF mFVar) {
        this.f3367.add(mFVar);
        return this.f3367;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final List<mF> m3967(mF mFVar) {
        this.f3367.remove(mFVar);
        return this.f3367;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final long m3966() {
        return this.f3366;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final boolean m3970() {
        return this.f3371;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static List<mF> m3960(List<mF> list, List<mF> list2) {
        HashSet hashSet = new HashSet(list.size());
        for (mF mFVar : list) {
            hashSet.add(mFVar.f3092);
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        for (int size = list2.size() - 1; size >= 0; size--) {
            mF mFVar2 = list2.get(size);
            if (!hashSet.contains(mFVar2.f3092)) {
                arrayList.add(0, mFVar2);
            }
        }
        return arrayList;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private mE m3959(int i) {
        for (mE next : this.f3370) {
            if (next.f3077 == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m3961() {
        return m3959(2) != null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m3964() {
        return m3959(1) != null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m3969() {
        if (m3959(1) == null || !mM.m3753("com.google.android.apps.photos", this.f3369.f3365)) {
            return false;
        }
        return true;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final mE m3972() {
        mE r0 = m3959(1);
        if (r0 == null) {
            return null;
        }
        Intent intent = r0.f3076;
        intent.setPackage("com.google.android.apps.photos");
        intent.setAction("android.intent.action.GET_CONTENT");
        return r0;
    }
}
