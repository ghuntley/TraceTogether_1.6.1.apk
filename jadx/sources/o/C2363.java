package o;

import java.util.Collections;
import java.util.List;
import o.C0987;
import o.C2274;

/* renamed from: o.Л  reason: contains not printable characters */
public final class C2363 {

    /* renamed from: o.Л$If */
    public static final class If extends C0987<If, C2364> {
        /* access modifiers changed from: private */
        public static final If zzf;
        private static volatile C1889<If> zzg;
        private int zzc;
        private String zzd = "";
        private String zze = "";

        private If() {
        }

        /* renamed from: o.Л$If$ı  reason: contains not printable characters */
        public static final class C2364 extends C0987.C0989<If, C2364> {
            private C2364() {
                super(If.zzf);
            }

            /* synthetic */ C2364(C2455 r1) {
                this();
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final String m12321() {
            return this.zzd;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final String m12319() {
            return this.zze;
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m12320(int i, Object obj, Object obj2) {
            switch (C2455.f11130[i - 1]) {
                case 1:
                    return new If();
                case 2:
                    return new C2364((C2455) null);
                case 3:
                    return m6981(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    C1889<If> r2 = zzg;
                    if (r2 == null) {
                        synchronized (If.class) {
                            r2 = zzg;
                            if (r2 == null) {
                                r2 = new C0987.C0990<>(zzf);
                                zzg = r2;
                            }
                        }
                    }
                    return r2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            If ifR = new If();
            zzf = ifR;
            C0987.m6979(If.class, ifR);
        }
    }

    /* renamed from: o.Л$ı  reason: contains not printable characters */
    public static final class C2365 extends C0987<C2365, C2366> {
        /* access modifiers changed from: private */
        public static final C2365 zzl;
        private static volatile C1889<C2365> zzm;
        private int zzc;
        private long zzd;
        private String zze = "";
        private int zzf;
        private C1001<If> zzg = m6978();
        private C1001<C2367> zzh = m6978();
        private C1001<C2274.Cif> zzi = m6978();
        private String zzj = "";
        private boolean zzk;

        private C2365() {
        }

        /* renamed from: o.Л$ı$ı  reason: contains not printable characters */
        public static final class C2366 extends C0987.C0989<C2365, C2366> {
            private C2366() {
                super(C2365.zzl);
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final int m12340() {
                return ((C2365) this.f6029).m12338();
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final C2367 m12342(int i) {
                return ((C2365) this.f6029).m12331(i);
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final C2366 m12341(int i, C2367.If ifR) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2365) this.f6029).m12324(i, (C2367) ((C0987) ifR.m7011()));
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final List<C2274.Cif> m12343() {
                return Collections.unmodifiableList(((C2365) this.f6029).m12337());
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final C2366 m12339() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2365) this.f6029).m12328();
                return this;
            }

            /* synthetic */ C2366(C2455 r1) {
                this();
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m12334() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final long m12329() {
            return this.zzd;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m12332() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final String m12335() {
            return this.zze;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final List<If> m12333() {
            return this.zzg;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final int m12338() {
            return this.zzh.size();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2367 m12331(int i) {
            return (C2367) this.zzh.get(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m12324(int i, C2367 r3) {
            r3.getClass();
            if (!this.zzh.m7115()) {
                this.zzh = C0987.m6976(this.zzh);
            }
            this.zzh.set(i, r3);
        }

        /* renamed from: і  reason: contains not printable characters */
        public final List<C2274.Cif> m12337() {
            return this.zzi;
        }

        /* access modifiers changed from: private */
        /* renamed from: ӏ  reason: contains not printable characters */
        public final void m12328() {
            this.zzi = m6978();
        }

        /* renamed from: І  reason: contains not printable characters */
        public final boolean m12336() {
            return this.zzk;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public static C2366 m12325() {
            return (C2366) zzl.m6996();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m12330(int i, Object obj, Object obj2) {
            switch (C2455.f11130[i - 1]) {
                case 1:
                    return new C2365();
                case 2:
                    return new C2366((C2455) null);
                case 3:
                    return m6981(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\b\u0003\b\u0007\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", If.class, "zzh", C2367.class, "zzi", C2274.Cif.class, "zzj", "zzk"});
                case 4:
                    return zzl;
                case 5:
                    C1889<C2365> r2 = zzm;
                    if (r2 == null) {
                        synchronized (C2365.class) {
                            r2 = zzm;
                            if (r2 == null) {
                                r2 = new C0987.C0990<>(zzl);
                                zzm = r2;
                            }
                        }
                    }
                    return r2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static C2365 m12322() {
            return zzl;
        }

        static {
            C2365 r0 = new C2365();
            zzl = r0;
            C0987.m6979(C2365.class, r0);
        }
    }

    /* renamed from: o.Л$ǃ  reason: contains not printable characters */
    public static final class C2367 extends C0987<C2367, If> {
        /* access modifiers changed from: private */
        public static final C2367 zzh;
        private static volatile C1889<C2367> zzi;
        private int zzc;
        private String zzd = "";
        private boolean zze;
        private boolean zzf;
        private int zzg;

        private C2367() {
        }

        /* renamed from: o.Л$ǃ$If */
        public static final class If extends C0987.C0989<C2367, If> {
            private If() {
                super(C2367.zzh);
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final String m12357() {
                return ((C2367) this.f6029).m12349();
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final If m12358(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2367) this.f6029).m12344(str);
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final boolean m12356() {
                return ((C2367) this.f6029).m12350();
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final boolean m12354() {
                return ((C2367) this.f6029).m12352();
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final boolean m12353() {
                return ((C2367) this.f6029).m12351();
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final int m12355() {
                return ((C2367) this.f6029).m12347();
            }

            /* synthetic */ If(C2455 r1) {
                this();
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final String m12349() {
            return this.zzd;
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m12344(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m12350() {
            return this.zze;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m12352() {
            return this.zzf;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m12351() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m12347() {
            return this.zzg;
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m12348(int i, Object obj, Object obj2) {
            switch (C2455.f11130[i - 1]) {
                case 1:
                    return new C2367();
                case 2:
                    return new If((C2455) null);
                case 3:
                    return m6981(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0004\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    C1889<C2367> r2 = zzi;
                    if (r2 == null) {
                        synchronized (C2367.class) {
                            r2 = zzi;
                            if (r2 == null) {
                                r2 = new C0987.C0990<>(zzh);
                                zzi = r2;
                            }
                        }
                    }
                    return r2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            C2367 r0 = new C2367();
            zzh = r0;
            C0987.m6979(C2367.class, r0);
        }
    }
}
