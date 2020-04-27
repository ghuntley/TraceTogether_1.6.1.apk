package o;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import o.C1242;
import o.C1655;

/* renamed from: o.ɕ  reason: contains not printable characters */
public final class C1116 {

    /* renamed from: ı  reason: contains not printable characters */
    public final String f6604;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C1242.C1243 f6605;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1242.Cif f6606;

    /* renamed from: ȷ  reason: contains not printable characters */
    public final String f6607;

    /* renamed from: ɨ  reason: contains not printable characters */
    public final boolean f6608;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C1242.C1244> f6609 = null;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final Set<Integer> f6610;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final Executor f6611;

    /* renamed from: ɾ  reason: contains not printable characters */
    public final File f6612;

    /* renamed from: Ι  reason: contains not printable characters */
    public final Context f6613;

    /* renamed from: ι  reason: contains not printable characters */
    public final C1655.C1656 f6614;

    /* renamed from: І  reason: contains not printable characters */
    public final boolean f6615 = false;

    /* renamed from: і  reason: contains not printable characters */
    public final boolean f6616;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final Executor f6617;

    /* renamed from: ӏ  reason: contains not printable characters */
    public final boolean f6618;

    public C1116(Context context, String str, C1655.C1656 r3, C1242.Cif ifVar, C1242.C1243 r5, Executor executor, Executor executor2, boolean z) {
        this.f6614 = r3;
        this.f6613 = context;
        this.f6604 = str;
        this.f6606 = ifVar;
        this.f6605 = r5;
        this.f6611 = executor;
        this.f6617 = executor2;
        this.f6616 = false;
        this.f6618 = z;
        this.f6608 = false;
        this.f6610 = null;
        this.f6607 = null;
        this.f6612 = null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m7528(int i, int i2) {
        Set<Integer> set;
        return (!(i > i2) || !this.f6608) && this.f6618 && ((set = this.f6610) == null || !set.contains(Integer.valueOf(i)));
    }
}
