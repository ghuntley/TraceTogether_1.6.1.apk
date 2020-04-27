package o;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: o.ǃɟ  reason: contains not printable characters */
public final class C0903 implements Runnable {

    /* renamed from: Ι  reason: contains not printable characters */
    public static final ThreadLocal<C0903> f5749 = new ThreadLocal<>();

    /* renamed from: і  reason: contains not printable characters */
    private static Comparator<Cif> f5750 = new Comparator<Cif>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            Cif ifVar = (Cif) obj;
            Cif ifVar2 = (Cif) obj2;
            if ((ifVar.f5759 == null) != (ifVar2.f5759 == null)) {
                return ifVar.f5759 == null ? 1 : -1;
            }
            if (ifVar.f5760 != ifVar2.f5760) {
                return ifVar.f5760 ? -1 : 1;
            }
            int i = ifVar2.f5762 - ifVar.f5762;
            if (i != 0) {
                return i;
            }
            int i2 = ifVar.f5763 - ifVar2.f5763;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    private long f5751;

    /* renamed from: ǃ  reason: contains not printable characters */
    public ArrayList<RecyclerView> f5752 = new ArrayList<>();

    /* renamed from: ɩ  reason: contains not printable characters */
    public long f5753;

    /* renamed from: ι  reason: contains not printable characters */
    private ArrayList<Cif> f5754 = new ArrayList<>();

    /* renamed from: o.ǃɟ$if  reason: invalid class name */
    static class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        public RecyclerView f5759;

        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean f5760;

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f5761;

        /* renamed from: Ι  reason: contains not printable characters */
        public int f5762;

        /* renamed from: ι  reason: contains not printable characters */
        public int f5763;

        Cif() {
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: o.ǃɟ$If */
    public static class If implements RecyclerView.IF.C0027 {

        /* renamed from: ı  reason: contains not printable characters */
        public int[] f5755;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f5756;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f5757;

        /* renamed from: ι  reason: contains not printable characters */
        public int f5758;

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m6687(RecyclerView recyclerView, boolean z) {
            boolean z2 = false;
            this.f5758 = 0;
            int[] iArr = this.f5755;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.IF ifR = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && ifR != null && ifR.f350) {
                if (z) {
                    if (recyclerView.mAdapterHelper.f5728.size() > 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        ifR.m426(recyclerView.mAdapter.getItemCount(), (RecyclerView.IF.C0027) this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    ifR.m435(this.f5757, this.f5756, recyclerView.mState, (RecyclerView.IF.C0027) this);
                }
                if (this.f5758 > ifR.f339) {
                    ifR.f339 = this.f5758;
                    ifR.f342 = z;
                    recyclerView.mRecycler.m367();
                }
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m6688(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f5758 << 1;
                int[] iArr = this.f5755;
                if (iArr == null) {
                    this.f5755 = new int[4];
                    Arrays.fill(this.f5755, -1);
                } else if (i3 >= iArr.length) {
                    this.f5755 = new int[(i3 << 1)];
                    System.arraycopy(iArr, 0, this.f5755, 0, iArr.length);
                }
                int[] iArr2 = this.f5755;
                iArr2[i3] = i;
                iArr2[i3 + 1] = i2;
                this.f5758++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m6686(int i) {
            if (this.f5755 != null) {
                int i2 = this.f5758 << 1;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f5755[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6685(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f5751 == 0) {
            this.f5751 = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        If ifR = recyclerView.mPrefetchRegistry;
        ifR.f5757 = i;
        ifR.f5756 = i2;
    }

    public final void run() {
        RecyclerView recyclerView;
        Cif ifVar;
        long j = 0;
        try {
            C1679.m9555("RV Prefetch");
            if (!this.f5752.isEmpty()) {
                int size = this.f5752.size();
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView2 = this.f5752.get(i);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView2.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.f5753;
                    int size2 = this.f5752.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView3 = this.f5752.get(i3);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            recyclerView3.mPrefetchRegistry.m6687(recyclerView3, false);
                            i2 += recyclerView3.mPrefetchRegistry.f5758;
                        }
                    }
                    this.f5754.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView4 = this.f5752.get(i5);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            If ifR = recyclerView4.mPrefetchRegistry;
                            int abs = Math.abs(ifR.f5757) + Math.abs(ifR.f5756);
                            int i6 = i4;
                            int i7 = 0;
                            while (i7 < (ifR.f5758 << 1)) {
                                if (i6 >= this.f5754.size()) {
                                    ifVar = new Cif();
                                    this.f5754.add(ifVar);
                                } else {
                                    ifVar = this.f5754.get(i6);
                                }
                                int i8 = ifR.f5755[i7 + 1];
                                try {
                                    ifVar.f5760 = i8 <= abs;
                                    ifVar.f5762 = abs;
                                    ifVar.f5763 = i8;
                                    ifVar.f5759 = recyclerView4;
                                    ifVar.f5761 = ifR.f5755[i7];
                                    i6++;
                                    i7 += 2;
                                } catch (Throwable th) {
                                    th = th;
                                    j = 0;
                                    this.f5751 = j;
                                    C1679.m9554();
                                    throw th;
                                }
                            }
                            i4 = i6;
                        }
                    }
                    Collections.sort(this.f5754, f5750);
                    for (int i9 = 0; i9 < this.f5754.size(); i9++) {
                        Cif ifVar2 = this.f5754.get(i9);
                        if (ifVar2.f5759 == null) {
                            break;
                        }
                        RecyclerView.con r3 = m6684(ifVar2.f5759, ifVar2.f5761, ifVar2.f5760 ? Long.MAX_VALUE : nanos);
                        if (!(r3 == null || r3.mNestedRecyclerView == null || !r3.isBound() || r3.isInvalid() || (recyclerView = r3.mNestedRecyclerView.get()) == null)) {
                            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.f5664.m6559() != 0) {
                                recyclerView.removeAndRecycleViews();
                            }
                            If ifR2 = recyclerView.mPrefetchRegistry;
                            ifR2.m6687(recyclerView, true);
                            if (ifR2.f5758 != 0) {
                                C1679.m9555("RV Nested Prefetch");
                                RecyclerView.C0033 r8 = recyclerView.mState;
                                RecyclerView.C0035 r10 = recyclerView.mAdapter;
                                r8.f370 = 1;
                                r8.f366 = r10.getItemCount();
                                r8.f378 = false;
                                r8.f376 = false;
                                r8.f372 = false;
                                for (int i10 = 0; i10 < (ifR2.f5758 << 1); i10 += 2) {
                                    m6684(recyclerView, ifR2.f5755[i10], nanos);
                                }
                                C1679.m9554();
                            }
                        }
                        ifVar2.f5760 = false;
                        ifVar2.f5762 = 0;
                        ifVar2.f5763 = 0;
                        ifVar2.f5759 = null;
                        ifVar2.f5761 = 0;
                    }
                    j = 0;
                }
            }
            this.f5751 = j;
            C1679.m9554();
        } catch (Throwable th2) {
            th = th2;
            this.f5751 = j;
            C1679.m9554();
            throw th;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static RecyclerView.con m6684(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int r0 = recyclerView.mChildHelper.f5664.m6559();
        int i2 = 0;
        while (true) {
            if (i2 >= r0) {
                z = false;
                break;
            }
            RecyclerView.con childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.f5664.m6560(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.AUx aUx = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.con r6 = aUx.m362(i, j);
            if (r6 != null) {
                if (!r6.isBound() || r6.isInvalid()) {
                    aUx.m370(r6, false);
                } else {
                    aUx.m366(r6.itemView);
                }
            }
            return r6;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }
}
