package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ǂ  reason: contains not printable characters */
public class C0878 {

    /* renamed from: ı  reason: contains not printable characters */
    public final List<View> f5662 = new ArrayList();

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Cif f5663 = new Cif();

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0879 f5664;

    /* renamed from: o.ǂ$ǃ  reason: contains not printable characters */
    public interface C0879 {
        /* renamed from: ı  reason: contains not printable characters */
        int m6553(View view);

        /* renamed from: ı  reason: contains not printable characters */
        void m6554();

        /* renamed from: ǃ  reason: contains not printable characters */
        void m6555(View view);

        /* renamed from: ǃ  reason: contains not printable characters */
        void m6556(View view, int i);

        /* renamed from: ɩ  reason: contains not printable characters */
        RecyclerView.con m6557(View view);

        /* renamed from: ɩ  reason: contains not printable characters */
        void m6558(int i);

        /* renamed from: Ι  reason: contains not printable characters */
        int m6559();

        /* renamed from: Ι  reason: contains not printable characters */
        View m6560(int i);

        /* renamed from: Ι  reason: contains not printable characters */
        void m6561(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: ι  reason: contains not printable characters */
        void m6562(int i);

        /* renamed from: ι  reason: contains not printable characters */
        void m6563(View view);
    }

    public C0878(C0879 r1) {
        this.f5664 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6545(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f5664.m6559();
        } else {
            i2 = m6544(i);
        }
        this.f5663.m6549(i2, z);
        if (z) {
            this.f5662.add(view);
            this.f5664.m6555(view);
        }
        this.f5664.m6556(view, i2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m6544(int i) {
        if (i < 0) {
            return -1;
        }
        int r1 = this.f5664.m6559();
        int i2 = i;
        while (i2 < r1) {
            int r3 = i - (i2 - this.f5663.m6551(i2));
            if (r3 == 0) {
                while (this.f5663.m6547(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += r3;
        }
        return -1;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6543(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f5664.m6559();
        } else {
            i2 = m6544(i);
        }
        this.f5663.m6549(i2, z);
        if (z) {
            this.f5662.add(view);
            this.f5664.m6555(view);
        }
        this.f5664.m6561(view, i2, layoutParams);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6546(int i) {
        int r2 = m6544(i);
        this.f5663.m6552(r2);
        this.f5664.m6562(r2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m6542(View view) {
        int r3 = this.f5664.m6553(view);
        if (r3 != -1 && !this.f5663.m6547(r3)) {
            return r3 - this.f5663.m6551(r3);
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5663.toString());
        sb.append(", hidden list:");
        sb.append(this.f5662.size());
        return sb.toString();
    }

    /* renamed from: o.ǂ$if  reason: invalid class name */
    public static class Cif {

        /* renamed from: Ι  reason: contains not printable characters */
        public long f5665 = 0;

        /* renamed from: ι  reason: contains not printable characters */
        public Cif f5666;

        Cif() {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m6548(int i) {
            Cif ifVar = this;
            while (i >= 64) {
                ifVar = ifVar.f5666;
                if (ifVar != null) {
                    i -= 64;
                } else {
                    return;
                }
            }
            ifVar.f5665 &= ~(1 << i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final int m6551(int i) {
            Cif ifVar = this.f5666;
            if (ifVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f5665);
                }
                return Long.bitCount(this.f5665 & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f5665 & ((1 << i) - 1));
            } else {
                return ifVar.m6551(i - 64) + Long.bitCount(this.f5665);
            }
        }

        public final String toString() {
            if (this.f5666 == null) {
                return Long.toBinaryString(this.f5665);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5666.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.f5665));
            return sb.toString();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m6550(int i) {
            Cif ifVar = this;
            while (i >= 64) {
                if (ifVar.f5666 == null) {
                    ifVar.f5666 = new Cif();
                }
                ifVar = ifVar.f5666;
                i -= 64;
            }
            ifVar.f5665 |= 1 << i;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m6547(int i) {
            Cif ifVar = this;
            while (i >= 64) {
                if (ifVar.f5666 == null) {
                    ifVar.f5666 = new Cif();
                }
                ifVar = ifVar.f5666;
                i -= 64;
            }
            return (ifVar.f5665 & (1 << i)) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m6549(int i, boolean z) {
            boolean z2 = z;
            Cif ifVar = this;
            while (true) {
                if (i >= 64) {
                    if (ifVar.f5666 == null) {
                        ifVar.f5666 = new Cif();
                    }
                    ifVar = ifVar.f5666;
                    i -= 64;
                } else {
                    boolean z3 = (ifVar.f5665 & Long.MIN_VALUE) != 0;
                    long j = (1 << i) - 1;
                    long j2 = ifVar.f5665;
                    ifVar.f5665 = ((j2 & (~j)) << 1) | (j2 & j);
                    if (z2) {
                        ifVar.m6550(i);
                    } else {
                        ifVar.m6548(i);
                    }
                    if (z3 || ifVar.f5666 != null) {
                        if (ifVar.f5666 == null) {
                            ifVar.f5666 = new Cif();
                        }
                        ifVar = ifVar.f5666;
                        z2 = z3;
                        i = 0;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m6552(int i) {
            Cif ifVar = this;
            while (i >= 64) {
                if (ifVar.f5666 == null) {
                    ifVar.f5666 = new Cif();
                }
                ifVar = ifVar.f5666;
                i -= 64;
            }
            long j = 1 << i;
            boolean z = (ifVar.f5665 & j) != 0;
            ifVar.f5665 &= ~j;
            long j2 = j - 1;
            long j3 = ifVar.f5665;
            ifVar.f5665 = Long.rotateRight(j3 & (~j2), 1) | (j3 & j2);
            Cif ifVar2 = ifVar.f5666;
            if (ifVar2 != null) {
                if (ifVar2.m6547(0)) {
                    ifVar.m6550(63);
                }
                ifVar.f5666.m6552(0);
            }
            return z;
        }
    }
}
