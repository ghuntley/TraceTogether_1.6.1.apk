package o;

import java.util.List;

/* renamed from: o.Ɨϳ  reason: contains not printable characters */
final class C0700 implements C2081 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0598 f4882;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f4883 = 0;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f4884;

    /* renamed from: ι  reason: contains not printable characters */
    private int f4885;

    /* renamed from: ι  reason: contains not printable characters */
    public static C0700 m5761(C0598 r1) {
        if (r1.f4551 != null) {
            return r1.f4551;
        }
        return new C0700(r1);
    }

    private C0700(C0598 r2) {
        this.f4882 = (C0598) C0936.m6813(r2, "input");
        this.f4882.f4551 = this;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m5792() {
        int i = this.f4883;
        if (i != 0) {
            this.f4885 = i;
            this.f4883 = 0;
        } else {
            this.f4885 = this.f4882.m5289();
        }
        int i2 = this.f4885;
        if (i2 == 0 || i2 == this.f4884) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m5763() {
        return this.f4885;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m5774() {
        int i;
        if (this.f4882.m5276() || (i = this.f4885) == this.f4884) {
            return false;
        }
        return this.f4882.m5282(i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m5760(int i) {
        if ((this.f4885 & 7) != i) {
            throw C1124.m7560();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final double m5779() {
        m5760(1);
        return this.f4882.m5278();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final float m5789() {
        m5760(5);
        return this.f4882.m5273();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final long m5770() {
        m5760(0);
        return this.f4882.m5281();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final long m5783() {
        m5760(0);
        return this.f4882.m5292();
    }

    /* renamed from: І  reason: contains not printable characters */
    public final int m5795() {
        m5760(0);
        return this.f4882.m5277();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final long m5799() {
        m5760(1);
        return this.f4882.m5284();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final int m5801() {
        m5760(5);
        return this.f4882.m5296();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final boolean m5782() {
        m5760(0);
        return this.f4882.m5295();
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final String m5785() {
        m5760(2);
        return this.f4882.m5293();
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final String m5775() {
        m5760(2);
        return this.f4882.m5285();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <T> T m5793(C1990<T> r2, C0705 r3) {
        m5760(2);
        return m5755(r2, r3);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final <T> T m5764(C1990<T> r2, C0705 r3) {
        m5760(3);
        return m5758(r2, r3);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final <T> T m5755(C1990<T> r5, C0705 r6) {
        int r0 = this.f4882.m5297();
        if (this.f4882.f4550 < this.f4882.f4552) {
            int r02 = this.f4882.m5291(r0);
            T r1 = r5.m10788();
            this.f4882.f4550++;
            r5.m10785(r1, this, r6);
            r5.m10784(r1);
            this.f4882.m5290(0);
            C0598 r52 = this.f4882;
            r52.f4550--;
            this.f4882.m5274(r02);
            return r1;
        }
        throw new C1124("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final <T> T m5758(C1990<T> r3, C0705 r4) {
        int i = this.f4884;
        this.f4884 = ((this.f4885 >>> 3) << 3) | 4;
        try {
            T r1 = r3.m10788();
            r3.m10785(r1, this, r4);
            r3.m10784(r1);
            if (this.f4885 == this.f4884) {
                return r1;
            }
            throw C1124.m7563();
        } finally {
            this.f4884 = i;
        }
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final C0510 m5803() {
        m5760(2);
        return this.f4882.m5280();
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public final int m5777() {
        m5760(0);
        return this.f4882.m5297();
    }

    /* renamed from: ł  reason: contains not printable characters */
    public final int m5769() {
        m5760(0);
        return this.f4882.m5279();
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    public final int m5767() {
        m5760(5);
        return this.f4882.m5283();
    }

    /* renamed from: г  reason: contains not printable characters */
    public final long m5797() {
        m5760(1);
        return this.f4882.m5275();
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    public final int m5787() {
        m5760(0);
        return this.f4882.m5294();
    }

    /* renamed from: ʟ  reason: contains not printable characters */
    public final long m5788() {
        m5760(0);
        return this.f4882.m5286();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5780(List<Double> list) {
        int r0;
        int r5;
        if (list instanceof C0702) {
            C0702 r02 = (C0702) list;
            int i = this.f4885 & 7;
            if (i == 1) {
                do {
                    r02.m5809(this.f4882.m5278());
                    if (!this.f4882.m5276()) {
                        r5 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r5 == this.f4885);
                this.f4883 = r5;
            } else if (i == 2) {
                int r52 = this.f4882.m5297();
                m5754(r52);
                int r1 = this.f4882.m5287() + r52;
                do {
                    r02.m5809(this.f4882.m5278());
                } while (this.f4882.m5287() < r1);
            } else {
                throw C1124.m7560();
            }
        } else {
            int i2 = this.f4885 & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f4882.m5278()));
                    if (!this.f4882.m5276()) {
                        r0 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r0 == this.f4885);
                this.f4883 = r0;
            } else if (i2 == 2) {
                int r03 = this.f4882.m5297();
                m5754(r03);
                int r12 = this.f4882.m5287() + r03;
                do {
                    list.add(Double.valueOf(this.f4882.m5278()));
                } while (this.f4882.m5287() < r12);
            } else {
                throw C1124.m7560();
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5794(List<Float> list) {
        int r0;
        int r5;
        if (list instanceof C0840) {
            C0840 r02 = (C0840) list;
            int i = this.f4885 & 7;
            if (i == 2) {
                int r52 = this.f4882.m5297();
                m5759(r52);
                int r3 = this.f4882.m5287() + r52;
                do {
                    r02.m6312(this.f4882.m5273());
                } while (this.f4882.m5287() < r3);
            } else if (i == 5) {
                do {
                    r02.m6312(this.f4882.m5273());
                    if (!this.f4882.m5276()) {
                        r5 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r5 == this.f4885);
                this.f4883 = r5;
            } else {
                throw C1124.m7560();
            }
        } else {
            int i2 = this.f4885 & 7;
            if (i2 == 2) {
                int r03 = this.f4882.m5297();
                m5759(r03);
                int r1 = this.f4882.m5287() + r03;
                do {
                    list.add(Float.valueOf(this.f4882.m5273()));
                } while (this.f4882.m5287() < r1);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f4882.m5273()));
                    if (!this.f4882.m5276()) {
                        r0 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r0 == this.f4885);
                this.f4883 = r0;
            } else {
                throw C1124.m7560();
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5790(List<Long> list) {
        int r0;
        int r5;
        if (list instanceof C1440) {
            C1440 r02 = (C1440) list;
            int i = this.f4885 & 7;
            if (i == 0) {
                do {
                    r02.m8702(this.f4882.m5281());
                    if (!this.f4882.m5276()) {
                        r5 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r5 == this.f4885);
                this.f4883 = r5;
            } else if (i == 2) {
                int r1 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    r02.m8702(this.f4882.m5281());
                } while (this.f4882.m5287() < r1);
                m5762(r1);
            } else {
                throw C1124.m7560();
            }
        } else {
            int i2 = this.f4885 & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f4882.m5281()));
                    if (!this.f4882.m5276()) {
                        r0 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r0 == this.f4885);
                this.f4883 = r0;
            } else if (i2 == 2) {
                int r12 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    list.add(Long.valueOf(this.f4882.m5281()));
                } while (this.f4882.m5287() < r12);
                m5762(r12);
            } else {
                throw C1124.m7560();
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5765(List<Long> list) {
        int r0;
        int r5;
        if (list instanceof C1440) {
            C1440 r02 = (C1440) list;
            int i = this.f4885 & 7;
            if (i == 0) {
                do {
                    r02.m8702(this.f4882.m5292());
                    if (!this.f4882.m5276()) {
                        r5 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r5 == this.f4885);
                this.f4883 = r5;
            } else if (i == 2) {
                int r1 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    r02.m8702(this.f4882.m5292());
                } while (this.f4882.m5287() < r1);
                m5762(r1);
            } else {
                throw C1124.m7560();
            }
        } else {
            int i2 = this.f4885 & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f4882.m5292()));
                    if (!this.f4882.m5276()) {
                        r0 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r0 == this.f4885);
                this.f4883 = r0;
            } else if (i2 == 2) {
                int r12 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    list.add(Long.valueOf(this.f4882.m5292()));
                } while (this.f4882.m5287() < r12);
                m5762(r12);
            } else {
                throw C1124.m7560();
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5772(List<Integer> list) {
        int r0;
        int r3;
        if (list instanceof C0986) {
            C0986 r02 = (C0986) list;
            int i = this.f4885 & 7;
            if (i == 0) {
                do {
                    r02.m6972(this.f4882.m5277());
                    if (!this.f4882.m5276()) {
                        r3 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r3 == this.f4885);
                this.f4883 = r3;
            } else if (i == 2) {
                int r1 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    r02.m6972(this.f4882.m5277());
                } while (this.f4882.m5287() < r1);
                m5762(r1);
            } else {
                throw C1124.m7560();
            }
        } else {
            int i2 = this.f4885 & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f4882.m5277()));
                    if (!this.f4882.m5276()) {
                        r0 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r0 == this.f4885);
                this.f4883 = r0;
            } else if (i2 == 2) {
                int r12 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    list.add(Integer.valueOf(this.f4882.m5277()));
                } while (this.f4882.m5287() < r12);
                m5762(r12);
            } else {
                throw C1124.m7560();
            }
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m5771(List<Long> list) {
        int r0;
        int r5;
        if (list instanceof C1440) {
            C1440 r02 = (C1440) list;
            int i = this.f4885 & 7;
            if (i == 1) {
                do {
                    r02.m8702(this.f4882.m5284());
                    if (!this.f4882.m5276()) {
                        r5 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r5 == this.f4885);
                this.f4883 = r5;
            } else if (i == 2) {
                int r52 = this.f4882.m5297();
                m5754(r52);
                int r1 = this.f4882.m5287() + r52;
                do {
                    r02.m8702(this.f4882.m5284());
                } while (this.f4882.m5287() < r1);
            } else {
                throw C1124.m7560();
            }
        } else {
            int i2 = this.f4885 & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f4882.m5284()));
                    if (!this.f4882.m5276()) {
                        r0 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r0 == this.f4885);
                this.f4883 = r0;
            } else if (i2 == 2) {
                int r03 = this.f4882.m5297();
                m5754(r03);
                int r12 = this.f4882.m5287() + r03;
                do {
                    list.add(Long.valueOf(this.f4882.m5284()));
                } while (this.f4882.m5287() < r12);
            } else {
                throw C1124.m7560();
            }
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    public final void m5796(List<Integer> list) {
        int r0;
        int r5;
        if (list instanceof C0986) {
            C0986 r02 = (C0986) list;
            int i = this.f4885 & 7;
            if (i == 2) {
                int r52 = this.f4882.m5297();
                m5759(r52);
                int r3 = this.f4882.m5287() + r52;
                do {
                    r02.m6972(this.f4882.m5296());
                } while (this.f4882.m5287() < r3);
            } else if (i == 5) {
                do {
                    r02.m6972(this.f4882.m5296());
                    if (!this.f4882.m5276()) {
                        r5 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r5 == this.f4885);
                this.f4883 = r5;
            } else {
                throw C1124.m7560();
            }
        } else {
            int i2 = this.f4885 & 7;
            if (i2 == 2) {
                int r03 = this.f4882.m5297();
                m5759(r03);
                int r1 = this.f4882.m5287() + r03;
                do {
                    list.add(Integer.valueOf(this.f4882.m5296()));
                } while (this.f4882.m5287() < r1);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f4882.m5296()));
                    if (!this.f4882.m5276()) {
                        r0 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r0 == this.f4885);
                this.f4883 = r0;
            } else {
                throw C1124.m7560();
            }
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m5784(List<Boolean> list) {
        int r0;
        int r3;
        if (list instanceof C0500) {
            C0500 r02 = (C0500) list;
            int i = this.f4885 & 7;
            if (i == 0) {
                do {
                    r02.m4887(this.f4882.m5295());
                    if (!this.f4882.m5276()) {
                        r3 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r3 == this.f4885);
                this.f4883 = r3;
            } else if (i == 2) {
                int r1 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    r02.m4887(this.f4882.m5295());
                } while (this.f4882.m5287() < r1);
                m5762(r1);
            } else {
                throw C1124.m7560();
            }
        } else {
            int i2 = this.f4885 & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f4882.m5295()));
                    if (!this.f4882.m5276()) {
                        r0 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r0 == this.f4885);
                this.f4883 = r0;
            } else if (i2 == 2) {
                int r12 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    list.add(Boolean.valueOf(this.f4882.m5295()));
                } while (this.f4882.m5287() < r12);
                m5762(r12);
            } else {
                throw C1124.m7560();
            }
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m5802(List<String> list) {
        m5757(list, false);
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m5800(List<String> list) {
        m5757(list, true);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m5757(List<String> list, boolean z) {
        int r0;
        int r3;
        if ((this.f4885 & 7) != 2) {
            throw C1124.m7560();
        } else if (!(list instanceof C1183) || z) {
            do {
                list.add(z ? m5775() : m5785());
                if (!this.f4882.m5276()) {
                    r0 = this.f4882.m5289();
                } else {
                    return;
                }
            } while (r0 == this.f4885);
            this.f4883 = r0;
        } else {
            C1183 r02 = (C1183) list;
            do {
                r02.m7717(m5803());
                if (!this.f4882.m5276()) {
                    r3 = this.f4882.m5289();
                } else {
                    return;
                }
            } while (r3 == this.f4885);
            this.f4883 = r3;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final <T> void m5791(List<T> list, C1990<T> r5, C0705 r6) {
        int r1;
        int i = this.f4885;
        if ((i & 7) == 2) {
            do {
                list.add(m5755(r5, r6));
                if (!this.f4882.m5276() && this.f4883 == 0) {
                    r1 = this.f4882.m5289();
                } else {
                    return;
                }
            } while (r1 == i);
            this.f4883 = r1;
            return;
        }
        throw C1124.m7560();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m5773(List<T> list, C1990<T> r5, C0705 r6) {
        int r1;
        int i = this.f4885;
        if ((i & 7) == 3) {
            do {
                list.add(m5758(r5, r6));
                if (!this.f4882.m5276() && this.f4883 == 0) {
                    r1 = this.f4882.m5289();
                } else {
                    return;
                }
            } while (r1 == i);
            this.f4883 = r1;
            return;
        }
        throw C1124.m7560();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final void m5781(List<C0510> list) {
        int r0;
        if ((this.f4885 & 7) == 2) {
            do {
                list.add(m5803());
                if (!this.f4882.m5276()) {
                    r0 = this.f4882.m5289();
                } else {
                    return;
                }
            } while (r0 == this.f4885);
            this.f4883 = r0;
            return;
        }
        throw C1124.m7560();
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public final void m5778(List<Integer> list) {
        int r0;
        int r3;
        if (list instanceof C0986) {
            C0986 r02 = (C0986) list;
            int i = this.f4885 & 7;
            if (i == 0) {
                do {
                    r02.m6972(this.f4882.m5297());
                    if (!this.f4882.m5276()) {
                        r3 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r3 == this.f4885);
                this.f4883 = r3;
            } else if (i == 2) {
                int r1 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    r02.m6972(this.f4882.m5297());
                } while (this.f4882.m5287() < r1);
                m5762(r1);
            } else {
                throw C1124.m7560();
            }
        } else {
            int i2 = this.f4885 & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f4882.m5297()));
                    if (!this.f4882.m5276()) {
                        r0 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r0 == this.f4885);
                this.f4883 = r0;
            } else if (i2 == 2) {
                int r12 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    list.add(Integer.valueOf(this.f4882.m5297()));
                } while (this.f4882.m5287() < r12);
                m5762(r12);
            } else {
                throw C1124.m7560();
            }
        }
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final void m5804(List<Integer> list) {
        int r0;
        int r3;
        if (list instanceof C0986) {
            C0986 r02 = (C0986) list;
            int i = this.f4885 & 7;
            if (i == 0) {
                do {
                    r02.m6972(this.f4882.m5279());
                    if (!this.f4882.m5276()) {
                        r3 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r3 == this.f4885);
                this.f4883 = r3;
            } else if (i == 2) {
                int r1 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    r02.m6972(this.f4882.m5279());
                } while (this.f4882.m5287() < r1);
                m5762(r1);
            } else {
                throw C1124.m7560();
            }
        } else {
            int i2 = this.f4885 & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f4882.m5279()));
                    if (!this.f4882.m5276()) {
                        r0 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r0 == this.f4885);
                this.f4883 = r0;
            } else if (i2 == 2) {
                int r12 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    list.add(Integer.valueOf(this.f4882.m5279()));
                } while (this.f4882.m5287() < r12);
                m5762(r12);
            } else {
                throw C1124.m7560();
            }
        }
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final void m5786(List<Integer> list) {
        int r0;
        int r5;
        if (list instanceof C0986) {
            C0986 r02 = (C0986) list;
            int i = this.f4885 & 7;
            if (i == 2) {
                int r52 = this.f4882.m5297();
                m5759(r52);
                int r3 = this.f4882.m5287() + r52;
                do {
                    r02.m6972(this.f4882.m5283());
                } while (this.f4882.m5287() < r3);
            } else if (i == 5) {
                do {
                    r02.m6972(this.f4882.m5283());
                    if (!this.f4882.m5276()) {
                        r5 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r5 == this.f4885);
                this.f4883 = r5;
            } else {
                throw C1124.m7560();
            }
        } else {
            int i2 = this.f4885 & 7;
            if (i2 == 2) {
                int r03 = this.f4882.m5297();
                m5759(r03);
                int r1 = this.f4882.m5287() + r03;
                do {
                    list.add(Integer.valueOf(this.f4882.m5283()));
                } while (this.f4882.m5287() < r1);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f4882.m5283()));
                    if (!this.f4882.m5276()) {
                        r0 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r0 == this.f4885);
                this.f4883 = r0;
            } else {
                throw C1124.m7560();
            }
        }
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final void m5776(List<Long> list) {
        int r0;
        int r5;
        if (list instanceof C1440) {
            C1440 r02 = (C1440) list;
            int i = this.f4885 & 7;
            if (i == 1) {
                do {
                    r02.m8702(this.f4882.m5275());
                    if (!this.f4882.m5276()) {
                        r5 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r5 == this.f4885);
                this.f4883 = r5;
            } else if (i == 2) {
                int r52 = this.f4882.m5297();
                m5754(r52);
                int r1 = this.f4882.m5287() + r52;
                do {
                    r02.m8702(this.f4882.m5275());
                } while (this.f4882.m5287() < r1);
            } else {
                throw C1124.m7560();
            }
        } else {
            int i2 = this.f4885 & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f4882.m5275()));
                    if (!this.f4882.m5276()) {
                        r0 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r0 == this.f4885);
                this.f4883 = r0;
            } else if (i2 == 2) {
                int r03 = this.f4882.m5297();
                m5754(r03);
                int r12 = this.f4882.m5287() + r03;
                do {
                    list.add(Long.valueOf(this.f4882.m5275()));
                } while (this.f4882.m5287() < r12);
            } else {
                throw C1124.m7560();
            }
        }
    }

    /* renamed from: г  reason: contains not printable characters */
    public final void m5798(List<Integer> list) {
        int r0;
        int r3;
        if (list instanceof C0986) {
            C0986 r02 = (C0986) list;
            int i = this.f4885 & 7;
            if (i == 0) {
                do {
                    r02.m6972(this.f4882.m5294());
                    if (!this.f4882.m5276()) {
                        r3 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r3 == this.f4885);
                this.f4883 = r3;
            } else if (i == 2) {
                int r1 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    r02.m6972(this.f4882.m5294());
                } while (this.f4882.m5287() < r1);
                m5762(r1);
            } else {
                throw C1124.m7560();
            }
        } else {
            int i2 = this.f4885 & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f4882.m5294()));
                    if (!this.f4882.m5276()) {
                        r0 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r0 == this.f4885);
                this.f4883 = r0;
            } else if (i2 == 2) {
                int r12 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    list.add(Integer.valueOf(this.f4882.m5294()));
                } while (this.f4882.m5287() < r12);
                m5762(r12);
            } else {
                throw C1124.m7560();
            }
        }
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    public final void m5768(List<Long> list) {
        int r0;
        int r5;
        if (list instanceof C1440) {
            C1440 r02 = (C1440) list;
            int i = this.f4885 & 7;
            if (i == 0) {
                do {
                    r02.m8702(this.f4882.m5286());
                    if (!this.f4882.m5276()) {
                        r5 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r5 == this.f4885);
                this.f4883 = r5;
            } else if (i == 2) {
                int r1 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    r02.m8702(this.f4882.m5286());
                } while (this.f4882.m5287() < r1);
                m5762(r1);
            } else {
                throw C1124.m7560();
            }
        } else {
            int i2 = this.f4885 & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f4882.m5286()));
                    if (!this.f4882.m5276()) {
                        r0 = this.f4882.m5289();
                    } else {
                        return;
                    }
                } while (r0 == this.f4885);
                this.f4883 = r0;
            } else if (i2 == 2) {
                int r12 = this.f4882.m5287() + this.f4882.m5297();
                do {
                    list.add(Long.valueOf(this.f4882.m5286()));
                } while (this.f4882.m5287() < r12);
                m5762(r12);
            } else {
                throw C1124.m7560();
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m5754(int i) {
        if ((i & 7) != 0) {
            throw C1124.m7563();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (m5774() != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        throw new o.C1124("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void m5766(java.util.Map<K, V> r8, o.C1528<K, V> r9, o.C0705 r10) {
        /*
            r7 = this;
            r0 = 2
            r7.m5760((int) r0)
            o.ſј r1 = r7.f4882
            int r1 = r1.m5297()
            o.ſј r2 = r7.f4882
            int r1 = r2.m5291(r1)
            K r2 = r9.f8140
            V r3 = r9.f8138
        L_0x0014:
            int r4 = r7.m5792()     // Catch:{ all -> 0x0064 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005b
            o.ſј r5 = r7.f4882     // Catch:{ all -> 0x0064 }
            boolean r5 = r5.m5276()     // Catch:{ all -> 0x0064 }
            if (r5 != 0) goto L_0x005b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0046
            if (r4 == r0) goto L_0x0039
            boolean r4 = r7.m5774()     // Catch:{ ɍɟ -> 0x004e }
            if (r4 == 0) goto L_0x0033
            goto L_0x0014
        L_0x0033:
            o.ɛı r4 = new o.ɛı     // Catch:{ ɍɟ -> 0x004e }
            r4.<init>(r6)     // Catch:{ ɍɟ -> 0x004e }
            throw r4     // Catch:{ ɍɟ -> 0x004e }
        L_0x0039:
            o.Ӏɫ r4 = r9.f8137     // Catch:{ ɍɟ -> 0x004e }
            V r5 = r9.f8138     // Catch:{ ɍɟ -> 0x004e }
            java.lang.Class r5 = r5.getClass()     // Catch:{ ɍɟ -> 0x004e }
            java.lang.Object r3 = r7.m5756((o.C2792) r4, (java.lang.Class<?>) r5, (o.C0705) r10)     // Catch:{ ɍɟ -> 0x004e }
            goto L_0x0014
        L_0x0046:
            o.Ӏɫ r4 = r9.f8139     // Catch:{ ɍɟ -> 0x004e }
            r5 = 0
            java.lang.Object r2 = r7.m5756((o.C2792) r4, (java.lang.Class<?>) r5, (o.C0705) r5)     // Catch:{ ɍɟ -> 0x004e }
            goto L_0x0014
        L_0x004e:
            boolean r4 = r7.m5774()     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0055
            goto L_0x0014
        L_0x0055:
            o.ɛı r8 = new o.ɛı     // Catch:{ all -> 0x0064 }
            r8.<init>(r6)     // Catch:{ all -> 0x0064 }
            throw r8     // Catch:{ all -> 0x0064 }
        L_0x005b:
            r8.put(r2, r3)     // Catch:{ all -> 0x0064 }
            o.ſј r8 = r7.f4882
            r8.m5274(r1)
            return
        L_0x0064:
            r8 = move-exception
            o.ſј r9 = r7.f4882
            r9.m5274(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0700.m5766(java.util.Map, o.ɽІ, o.Ɨј):void");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Object m5756(C2792 r2, Class<?> cls, C0705 r4) {
        switch (C0678.f4826[r2.ordinal()]) {
            case 1:
                return Boolean.valueOf(m5782());
            case 2:
                return m5803();
            case 3:
                return Double.valueOf(m5779());
            case 4:
                return Integer.valueOf(m5769());
            case 5:
                return Integer.valueOf(m5801());
            case 6:
                return Long.valueOf(m5799());
            case 7:
                return Float.valueOf(m5789());
            case 8:
                return Integer.valueOf(m5795());
            case 9:
                return Long.valueOf(m5783());
            case 10:
                m5760(2);
                return m5755(C1934.m10558().m10559(cls), r4);
            case 11:
                return Integer.valueOf(m5767());
            case 12:
                return Long.valueOf(m5797());
            case 13:
                return Integer.valueOf(m5787());
            case 14:
                return Long.valueOf(m5788());
            case 15:
                return m5775();
            case 16:
                return Integer.valueOf(m5777());
            case 17:
                return Long.valueOf(m5770());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m5759(int i) {
        if ((i & 3) != 0) {
            throw C1124.m7563();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m5762(int i) {
        if (this.f4882.m5287() != i) {
            throw C1124.m7558();
        }
    }
}
