package o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import o.C0987;

/* renamed from: o.хɪ  reason: contains not printable characters */
public final class C2477 {

    /* renamed from: o.хɪ$ı  reason: contains not printable characters */
    public static final class C2481 extends C0987<C2481, C2482> {
        /* access modifiers changed from: private */
        public static final C2481 zzi;
        private static volatile C1889<C2481> zzj;
        private int zzc;
        private C1001<C2483> zzd = m6978();
        private String zze = "";
        private long zzf;
        private long zzg;
        private int zzh;

        private C2481() {
        }

        /* renamed from: o.хɪ$ı$ı  reason: contains not printable characters */
        public static final class C2482 extends C0987.C0989<C2481, C2482> {
            private C2482() {
                super(C2481.zzi);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final List<C2483> m13079() {
                return Collections.unmodifiableList(((C2481) this.f6029).m13067());
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final int m13076() {
                return ((C2481) this.f6029).m13071();
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final C2483 m13082(int i) {
                return ((C2481) this.f6029).m13072(i);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final C2482 m13080(int i, C2483 r3) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2481) this.f6029).m13062(i, r3);
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final C2482 m13088(int i, C2483.C2484 r3) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2481) this.f6029).m13062(i, (C2483) ((C0987) r3.m7011()));
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final C2482 m13091(C2483 r2) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2481) this.f6029).m13064(r2);
                return this;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final C2482 m13078(C2483.C2484 r2) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2481) this.f6029).m13064((C2483) ((C0987) r2.m7011()));
                return this;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final C2482 m13081(Iterable<? extends C2483> iterable) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2481) this.f6029).m13055(iterable);
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final C2482 m13087() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2481) this.f6029).m13054();
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final C2482 m13083(int i) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2481) this.f6029).m13051(i);
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final String m13090() {
                return ((C2481) this.f6029).m13068();
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final C2482 m13089(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2481) this.f6029).m13047(str);
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final boolean m13085() {
                return ((C2481) this.f6029).m13070();
            }

            /* renamed from: І  reason: contains not printable characters */
            public final long m13092() {
                return ((C2481) this.f6029).m13065();
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final C2482 m13077(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2481) this.f6029).m13046(j);
                return this;
            }

            /* renamed from: ɹ  reason: contains not printable characters */
            public final long m13086() {
                return ((C2481) this.f6029).m13069();
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final C2482 m13084(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2481) this.f6029).m13058(j);
                return this;
            }

            /* synthetic */ C2482(C2371 r1) {
                this();
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final List<C2483> m13067() {
            return this.zzd;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final int m13071() {
            return this.zzd.size();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C2483 m13072(int i) {
            return (C2483) this.zzd.get(i);
        }

        /* renamed from: ɾ  reason: contains not printable characters */
        private final void m13057() {
            if (!this.zzd.m7115()) {
                this.zzd = C0987.m6976(this.zzd);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m13062(int i, C2483 r3) {
            r3.getClass();
            m13057();
            this.zzd.set(i, r3);
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m13064(C2483 r2) {
            r2.getClass();
            m13057();
            this.zzd.add(r2);
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m13055(Iterable<? extends C2483> iterable) {
            m13057();
            C0457.m4780(iterable, this.zzd);
        }

        /* access modifiers changed from: private */
        /* renamed from: ɨ  reason: contains not printable characters */
        public final void m13054() {
            this.zzd = m6978();
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m13051(int i) {
            m13057();
            this.zzd.remove(i);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final String m13068() {
            return this.zze;
        }

        /* access modifiers changed from: private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m13047(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zze = str;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m13070() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final long m13065() {
            return this.zzf;
        }

        /* access modifiers changed from: private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m13046(long j) {
            this.zzc |= 2;
            this.zzf = j;
        }

        /* renamed from: І  reason: contains not printable characters */
        public final boolean m13073() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final long m13069() {
            return this.zzg;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m13058(long j) {
            this.zzc |= 4;
            this.zzg = j;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final boolean m13075() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: і  reason: contains not printable characters */
        public final int m13074() {
            return this.zzh;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static C2482 m13050() {
            return (C2482) zzi.m6996();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m13066(int i, Object obj, Object obj2) {
            switch (C2371.f10895[i - 1]) {
                case 1:
                    return new C2481();
                case 2:
                    return new C2482((C2371) null);
                case 3:
                    return m6981(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0003\u0002\u0001\u0004\u0002\u0002\u0005\u0004\u0003", new Object[]{"zzc", "zzd", C2483.class, "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    C1889<C2481> r2 = zzj;
                    if (r2 == null) {
                        synchronized (C2481.class) {
                            r2 = zzj;
                            if (r2 == null) {
                                r2 = new C0987.C0990<>(zzi);
                                zzj = r2;
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
            C2481 r0 = new C2481();
            zzi = r0;
            C0987.m6979(C2481.class, r0);
        }
    }

    /* renamed from: o.хɪ$Ι  reason: contains not printable characters */
    public static final class C2487 extends C0987<C2487, C2488> {
        /* access modifiers changed from: private */
        public static final C2487 zzd;
        private static volatile C1889<C2487> zze;
        private C1001<aux> zzc = m6978();

        private C2487() {
        }

        /* renamed from: o.хɪ$Ι$ǃ  reason: contains not printable characters */
        public static final class C2488 extends C0987.C0989<C2487, C2488> {
            private C2488() {
                super(C2487.zzd);
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final aux m13169(int i) {
                return ((C2487) this.f6029).m13168(0);
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final C2488 m13170(aux.Cif ifVar) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2487) this.f6029).m13164((aux) ((C0987) ifVar.m7011()));
                return this;
            }

            /* synthetic */ C2488(C2371 r1) {
                this();
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final List<aux> m13166() {
            return this.zzc;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final aux m13168(int i) {
            return (aux) this.zzc.get(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m13164(aux aux) {
            aux.getClass();
            if (!this.zzc.m7115()) {
                this.zzc = C0987.m6976(this.zzc);
            }
            this.zzc.add(aux);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public static C2488 m13162() {
            return (C2488) zzd.m6996();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m13167(int i, Object obj, Object obj2) {
            switch (C2371.f10895[i - 1]) {
                case 1:
                    return new C2487();
                case 2:
                    return new C2488((C2371) null);
                case 3:
                    return m6981(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", aux.class});
                case 4:
                    return zzd;
                case 5:
                    C1889<C2487> r2 = zze;
                    if (r2 == null) {
                        synchronized (C2487.class) {
                            r2 = zze;
                            if (r2 == null) {
                                r2 = new C0987.C0990<>(zzd);
                                zze = r2;
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
            C2487 r0 = new C2487();
            zzd = r0;
            C0987.m6979(C2487.class, r0);
        }
    }

    /* renamed from: o.хɪ$IF */
    public static final class IF extends C0987<IF, Cif> {
        /* access modifiers changed from: private */
        public static final IF zzg;
        private static volatile C1889<IF> zzh;
        private C1043 zzc = m6980();
        private C1043 zzd = m6980();
        private C1001<C3645If> zze = m6978();
        private C1001<C2489> zzf = m6978();

        private IF() {
        }

        /* renamed from: o.хɪ$IF$if  reason: invalid class name */
        public static final class Cif extends C0987.C0989<IF, Cif> {
            private Cif() {
                super(IF.zzg);
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final Cif m12776(Iterable<? extends Long> iterable) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((IF) this.f6029).m12743(iterable);
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final Cif m12778() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((IF) this.f6029).m12750();
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final Cif m12780(Iterable<? extends Long> iterable) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((IF) this.f6029).m12748(iterable);
                return this;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final Cif m12775() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((IF) this.f6029).m12763();
                return this;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final Cif m12777(Iterable<? extends C3645If> iterable) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((IF) this.f6029).m12757(iterable);
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final Cif m12781(int i) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((IF) this.f6029).m12752(i);
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final Cif m12782(Iterable<? extends C2489> iterable) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((IF) this.f6029).m12759(iterable);
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final Cif m12779(int i) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((IF) this.f6029).m12747(i);
                return this;
            }

            /* synthetic */ Cif(C2371 r1) {
                this();
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final List<Long> m12771() {
            return this.zzc;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m12764() {
            return this.zzc.size();
        }

        /* access modifiers changed from: private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m12743(Iterable<? extends Long> iterable) {
            if (!this.zzc.m7115()) {
                this.zzc = C0987.m6982(this.zzc);
            }
            C0457.m4780(iterable, this.zzc);
        }

        /* access modifiers changed from: private */
        /* renamed from: ȷ  reason: contains not printable characters */
        public final void m12750() {
            this.zzc = m6980();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final List<Long> m12769() {
            return this.zzd;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final int m12765() {
            return this.zzd.size();
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m12748(Iterable<? extends Long> iterable) {
            if (!this.zzd.m7115()) {
                this.zzd = C0987.m6982(this.zzd);
            }
            C0457.m4780(iterable, this.zzd);
        }

        /* access modifiers changed from: private */
        /* renamed from: ӏ  reason: contains not printable characters */
        public final void m12763() {
            this.zzd = m6980();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final List<C3645If> m12767() {
            return this.zze;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final int m12768() {
            return this.zze.size();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C3645If m12772(int i) {
            return (C3645If) this.zze.get(i);
        }

        /* renamed from: ɨ  reason: contains not printable characters */
        private final void m12751() {
            if (!this.zze.m7115()) {
                this.zze = C0987.m6976(this.zze);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m12757(Iterable<? extends C3645If> iterable) {
            m12751();
            C0457.m4780(iterable, this.zze);
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m12752(int i) {
            m12751();
            this.zze.remove(i);
        }

        /* renamed from: і  reason: contains not printable characters */
        public final List<C2489> m12773() {
            return this.zzf;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final int m12774() {
            return this.zzf.size();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2489 m12770(int i) {
            return (C2489) this.zzf.get(i);
        }

        /* renamed from: ɪ  reason: contains not printable characters */
        private final void m12755() {
            if (!this.zzf.m7115()) {
                this.zzf = C0987.m6976(this.zzf);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m12759(Iterable<? extends C2489> iterable) {
            m12755();
            C0457.m4780(iterable, this.zzf);
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m12747(int i) {
            m12755();
            this.zzf.remove(i);
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static Cif m12746() {
            return (Cif) zzg.m6996();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m12766(int i, Object obj, Object obj2) {
            switch (C2371.f10895[i - 1]) {
                case 1:
                    return new IF();
                case 2:
                    return new Cif((C2371) null);
                case 3:
                    return m6981(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", C3645If.class, "zzf", C2489.class});
                case 4:
                    return zzg;
                case 5:
                    C1889<IF> r2 = zzh;
                    if (r2 == null) {
                        synchronized (IF.class) {
                            r2 = zzh;
                            if (r2 == null) {
                                r2 = new C0987.C0990<>(zzg);
                                zzh = r2;
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

        /* renamed from: І  reason: contains not printable characters */
        public static IF m12762() {
            return zzg;
        }

        static {
            IF ifR = new IF();
            zzg = ifR;
            C0987.m6979(IF.class, ifR);
        }
    }

    /* renamed from: o.хɪ$If  reason: case insensitive filesystem */
    public static final class C3645If extends C0987<C3645If, C2478> {
        /* access modifiers changed from: private */
        public static final C3645If zzf;
        private static volatile C1889<C3645If> zzg;
        private int zzc;
        private int zzd;
        private long zze;

        private C3645If() {
        }

        /* renamed from: o.хɪ$If$ǃ  reason: contains not printable characters */
        public static final class C2478 extends C0987.C0989<C3645If, C2478> {
            private C2478() {
                super(C3645If.zzf);
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final C2478 m12795(int i) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C3645If) this.f6029).m12786(i);
                return this;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final C2478 m12794(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C3645If) this.f6029).m12787(j);
                return this;
            }

            /* synthetic */ C2478(C2371 r1) {
                this();
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m12792() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final int m12790() {
            return this.zzd;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m12786(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m12789() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final long m12793() {
            return this.zze;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m12787(long j) {
            this.zzc |= 2;
            this.zze = j;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public static C2478 m12785() {
            return (C2478) zzf.m6996();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m12791(int i, Object obj, Object obj2) {
            switch (C2371.f10895[i - 1]) {
                case 1:
                    return new C3645If();
                case 2:
                    return new C2478((C2371) null);
                case 3:
                    return m6981(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0002\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    C1889<C3645If> r2 = zzg;
                    if (r2 == null) {
                        synchronized (C3645If.class) {
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
            C3645If ifR = new C3645If();
            zzf = ifR;
            C0987.m6979(C3645If.class, ifR);
        }
    }

    /* renamed from: o.хɪ$aux */
    public static final class aux extends C0987<aux, Cif> {
        /* access modifiers changed from: private */
        public static final aux zzav;
        private static volatile C1889<aux> zzaw;
        private int zzaa;
        private String zzab = "";
        private String zzac = "";
        private boolean zzad;
        private C1001<C2485> zzae = m6978();
        private String zzaf = "";
        private int zzag;
        private int zzah;
        private int zzai;
        private String zzaj = "";
        private long zzak;
        private long zzal;
        private String zzam = "";
        private String zzan = "";
        private int zzao;
        private String zzap = "";
        private C3646iF zzaq;
        private C1019 zzar = m6977();
        private long zzas;
        private long zzat;
        private String zzau = "";
        private int zzc;
        private int zzd;
        private int zze;
        private C1001<C2481> zzf = m6978();
        private C1001<C2490> zzg = m6978();
        private long zzh;
        private long zzi;
        private long zzj;
        private long zzk;
        private long zzl;
        private String zzm = "";
        private String zzn = "";
        private String zzo = "";
        private String zzp = "";
        private int zzq;
        private String zzr = "";
        private String zzs = "";
        private String zzt = "";
        private long zzu;
        private long zzv;
        private String zzw = "";
        private boolean zzx;
        private String zzy = "";
        private long zzz;

        private aux() {
        }

        /* renamed from: o.хɪ$aux$if  reason: invalid class name */
        public static final class Cif extends C0987.C0989<aux, Cif> {
            private Cif() {
                super(aux.zzav);
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final Cif m12965(int i) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12873(1);
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final List<C2481> m12985() {
                return Collections.unmodifiableList(((aux) this.f6029).m12904());
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final int m12964() {
                return ((aux) this.f6029).m12914();
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final C2481 m12979(int i) {
                return ((aux) this.f6029).m12916(i);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final Cif m12987(int i, C2481.C2482 r3) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12829(i, (C2481) ((C0987) r3.m7011()));
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final Cif m12991(C2481.C2482 r2) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12838((C2481) ((C0987) r2.m7011()));
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final Cif m13011(Iterable<? extends C2481> iterable) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12860(iterable);
                return this;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final Cif m12973() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12840();
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final Cif m12986(int i) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12857(i);
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final List<C2490> m13002() {
                return Collections.unmodifiableList(((aux) this.f6029).m12947());
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final int m13009() {
                return ((aux) this.f6029).m12951();
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final C2490 m13014(int i) {
                return ((aux) this.f6029).m12927(i);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final Cif m12974(int i, C2490 r3) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12858(i, r3);
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final Cif m13007(C2490 r2) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12822(r2);
                return this;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final Cif m12968(C2490.If ifR) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12822((C2490) ((C0987) ifR.m7011()));
                return this;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final Cif m12976(Iterable<? extends C2490> iterable) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12798(iterable);
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final Cif m13003(int i) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12796(i);
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final Cif m12988(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12797(j);
                return this;
            }

            /* renamed from: Ӏ  reason: contains not printable characters */
            public final long m13022() {
                return ((aux) this.f6029).m12930();
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final Cif m13004(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12874(j);
                return this;
            }

            /* renamed from: ɹ  reason: contains not printable characters */
            public final long m12995() {
                return ((aux) this.f6029).m12925();
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final Cif m12975(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12830(j);
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final Cif m13010(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12813(j);
                return this;
            }

            /* renamed from: і  reason: contains not printable characters */
            public final Cif m13019() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12883();
                return this;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final Cif m12966(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12859(j);
                return this;
            }

            /* renamed from: Ɩ  reason: contains not printable characters */
            public final Cif m12969() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12882();
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final Cif m12990(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12861(str);
                return this;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final Cif m12967(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12831(str);
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final Cif m13006(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12799(str);
                return this;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final Cif m12977(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12876(str);
                return this;
            }

            /* renamed from: І  reason: contains not printable characters */
            public final Cif m13016(int i) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12890(i);
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final Cif m13012(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12815(str);
                return this;
            }

            /* renamed from: І  reason: contains not printable characters */
            public final String m13015() {
                return ((aux) this.f6029).m12911();
            }

            /* renamed from: і  reason: contains not printable characters */
            public final Cif m13021(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12886(str);
                return this;
            }

            /* renamed from: Ӏ  reason: contains not printable characters */
            public final Cif m13025(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12892(str);
                return this;
            }

            /* renamed from: ɹ  reason: contains not printable characters */
            public final Cif m12997(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12808(j);
                return this;
            }

            /* renamed from: Ɩ  reason: contains not printable characters */
            public final Cif m12971(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12845(j);
                return this;
            }

            /* renamed from: ɹ  reason: contains not printable characters */
            public final Cif m12998(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12846(str);
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final Cif m13013(boolean z) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12839(z);
                return this;
            }

            /* renamed from: І  reason: contains not printable characters */
            public final Cif m13018(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12809(str);
                return this;
            }

            /* renamed from: і  reason: contains not printable characters */
            public final Cif m13020(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12885(j);
                return this;
            }

            /* renamed from: Ɩ  reason: contains not printable characters */
            public final Cif m12970(int i) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12896(i);
                return this;
            }

            /* renamed from: Ɩ  reason: contains not printable characters */
            public final Cif m12972(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12898(str);
                return this;
            }

            /* renamed from: ɪ  reason: contains not printable characters */
            public final Cif m12992() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12872();
                return this;
            }

            /* renamed from: ɨ  reason: contains not printable characters */
            public final String m12983() {
                return ((aux) this.f6029).m12957();
            }

            /* renamed from: ɾ  reason: contains not printable characters */
            public final Cif m13000(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12827(str);
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final Cif m13008(boolean z) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12881(z);
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final Cif m13005(Iterable<? extends C2485> iterable) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12875(iterable);
                return this;
            }

            /* renamed from: ɾ  reason: contains not printable characters */
            public final Cif m12999() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12854();
                return this;
            }

            /* renamed from: ȷ  reason: contains not printable characters */
            public final Cif m12982(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12901(str);
                return this;
            }

            /* renamed from: ɹ  reason: contains not printable characters */
            public final Cif m12996(int i) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12807(i);
                return this;
            }

            /* renamed from: ɨ  reason: contains not printable characters */
            public final Cif m12984(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12850(str);
                return this;
            }

            /* renamed from: І  reason: contains not printable characters */
            public final Cif m13017(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12891(j);
                return this;
            }

            /* renamed from: Ӏ  reason: contains not printable characters */
            public final Cif m13024(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12897(j);
                return this;
            }

            /* renamed from: ɪ  reason: contains not printable characters */
            public final Cif m12994(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12823((String) null);
                return this;
            }

            /* renamed from: ȷ  reason: contains not printable characters */
            public final Cif m12980() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12853();
                return this;
            }

            /* renamed from: Ӏ  reason: contains not printable characters */
            public final Cif m13023(int i) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12884(i);
                return this;
            }

            /* renamed from: ӏ  reason: contains not printable characters */
            public final Cif m13027(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12842(str);
                return this;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final Cif m12978(C3646iF.C2479 r2) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12871((C3646iF) ((C0987) r2.m7011()));
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final Cif m12989(Iterable<? extends Integer> iterable) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12814(iterable);
                return this;
            }

            /* renamed from: ȷ  reason: contains not printable characters */
            public final Cif m12981(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12841(j);
                return this;
            }

            /* renamed from: ɪ  reason: contains not printable characters */
            public final Cif m12993(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12826(j);
                return this;
            }

            /* renamed from: ӏ  reason: contains not printable characters */
            public final String m13026() {
                return ((aux) this.f6029).m12944();
            }

            /* renamed from: ɿ  reason: contains not printable characters */
            public final Cif m13001(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((aux) this.f6029).m12806(str);
                return this;
            }

            /* synthetic */ Cif(C2371 r1) {
                this();
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m12946() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m12926() {
            return this.zze;
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m12873(int i) {
            this.zzc |= 1;
            this.zze = i;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final List<C2481> m12904() {
            return this.zzf;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final int m12914() {
            return this.zzf.size();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2481 m12916(int i) {
            return (C2481) this.zzf.get(i);
        }

        /* renamed from: ɫ  reason: contains not printable characters */
        private final void m12844() {
            if (!this.zzf.m7115()) {
                this.zzf = C0987.m6976(this.zzf);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m12829(int i, C2481 r3) {
            r3.getClass();
            m12844();
            this.zzf.set(i, r3);
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m12838(C2481 r2) {
            r2.getClass();
            m12844();
            this.zzf.add(r2);
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m12860(Iterable<? extends C2481> iterable) {
            m12844();
            C0457.m4780(iterable, this.zzf);
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩǃ  reason: contains not printable characters */
        public final void m12840() {
            this.zzf = m6978();
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m12857(int i) {
            m12844();
            this.zzf.remove(i);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final List<C2490> m12947() {
            return this.zzg;
        }

        /* renamed from: І  reason: contains not printable characters */
        public final int m12951() {
            return this.zzg.size();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2490 m12927(int i) {
            return (C2490) this.zzg.get(i);
        }

        /* renamed from: ɽ  reason: contains not printable characters */
        private final void m12849() {
            if (!this.zzg.m7115()) {
                this.zzg = C0987.m6976(this.zzg);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m12858(int i, C2490 r3) {
            r3.getClass();
            m12849();
            this.zzg.set(i, r3);
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m12822(C2490 r2) {
            r2.getClass();
            m12849();
            this.zzg.add(r2);
        }

        /* access modifiers changed from: private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m12798(Iterable<? extends C2490> iterable) {
            m12849();
            C0457.m4780(iterable, this.zzg);
        }

        /* access modifiers changed from: private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m12796(int i) {
            m12849();
            this.zzg.remove(i);
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final boolean m12961() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public final long m12910() {
            return this.zzh;
        }

        /* access modifiers changed from: private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m12797(long j) {
            this.zzc |= 2;
            this.zzh = j;
        }

        /* renamed from: і  reason: contains not printable characters */
        public final boolean m12958() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final long m12930() {
            return this.zzi;
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m12874(long j) {
            this.zzc |= 4;
            this.zzi = j;
        }

        /* renamed from: ȷ  reason: contains not printable characters */
        public final boolean m12919() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: ɨ  reason: contains not printable characters */
        public final long m12925() {
            return this.zzj;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m12830(long j) {
            this.zzc |= 8;
            this.zzj = j;
        }

        /* renamed from: ɾ  reason: contains not printable characters */
        public final boolean m12934() {
            return (this.zzc & 16) != 0;
        }

        /* renamed from: ɪ  reason: contains not printable characters */
        public final long m12928() {
            return this.zzk;
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m12813(long j) {
            this.zzc |= 16;
            this.zzk = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: ιǃ  reason: contains not printable characters */
        public final void m12883() {
            this.zzc &= -17;
            this.zzk = 0;
        }

        /* renamed from: ӏ  reason: contains not printable characters */
        public final boolean m12962() {
            return (this.zzc & 32) != 0;
        }

        /* renamed from: г  reason: contains not printable characters */
        public final long m12954() {
            return this.zzl;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m12859(long j) {
            this.zzc |= 32;
            this.zzl = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: ιı  reason: contains not printable characters */
        public final void m12882() {
            this.zzc &= -33;
            this.zzl = 0;
        }

        /* renamed from: ŀ  reason: contains not printable characters */
        public final String m12907() {
            return this.zzm;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m12861(String str) {
            str.getClass();
            this.zzc |= 64;
            this.zzm = str;
        }

        /* renamed from: ł  reason: contains not printable characters */
        public final String m12908() {
            return this.zzn;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m12831(String str) {
            str.getClass();
            this.zzc |= 128;
            this.zzn = str;
        }

        /* renamed from: ʟ  reason: contains not printable characters */
        public final String m12942() {
            return this.zzo;
        }

        /* access modifiers changed from: private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m12799(String str) {
            str.getClass();
            this.zzc |= 256;
            this.zzo = str;
        }

        /* renamed from: ɿ  reason: contains not printable characters */
        public final String m12935() {
            return this.zzp;
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m12876(String str) {
            str.getClass();
            this.zzc |= 512;
            this.zzp = str;
        }

        /* renamed from: ƚ  reason: contains not printable characters */
        public final boolean m12912() {
            return (this.zzc & 1024) != 0;
        }

        /* renamed from: ſ  reason: contains not printable characters */
        public final int m12909() {
            return this.zzq;
        }

        /* access modifiers changed from: private */
        /* renamed from: і  reason: contains not printable characters */
        public final void m12890(int i) {
            this.zzc |= 1024;
            this.zzq = i;
        }

        /* renamed from: ʅ  reason: contains not printable characters */
        public final String m12937() {
            return this.zzr;
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m12815(String str) {
            str.getClass();
            this.zzc |= 2048;
            this.zzr = str;
        }

        /* renamed from: Ɨ  reason: contains not printable characters */
        public final String m12911() {
            return this.zzs;
        }

        /* access modifiers changed from: private */
        /* renamed from: І  reason: contains not printable characters */
        public final void m12886(String str) {
            str.getClass();
            this.zzc |= C0872.f5653;
            this.zzs = str;
        }

        /* renamed from: ɍ  reason: contains not printable characters */
        public final String m12922() {
            return this.zzt;
        }

        /* access modifiers changed from: private */
        /* renamed from: і  reason: contains not printable characters */
        public final void m12892(String str) {
            str.getClass();
            this.zzc |= 8192;
            this.zzt = str;
        }

        /* renamed from: ǀ  reason: contains not printable characters */
        public final boolean m12913() {
            return (this.zzc & 16384) != 0;
        }

        /* renamed from: ɟ  reason: contains not printable characters */
        public final long m12924() {
            return this.zzu;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ɩ  reason: contains not printable characters */
        public final void m12808(long j) {
            this.zzc |= 16384;
            this.zzu = j;
        }

        /* renamed from: ɺ  reason: contains not printable characters */
        public final boolean m12931() {
            return (this.zzc & 32768) != 0;
        }

        /* renamed from: ɔ  reason: contains not printable characters */
        public final long m12923() {
            return this.zzv;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɹ  reason: contains not printable characters */
        public final void m12845(long j) {
            this.zzc |= 32768;
            this.zzv = j;
        }

        /* renamed from: ɼ  reason: contains not printable characters */
        public final String m12933() {
            return this.zzw;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɹ  reason: contains not printable characters */
        public final void m12846(String str) {
            str.getClass();
            this.zzc |= 65536;
            this.zzw = str;
        }

        /* renamed from: Ј  reason: contains not printable characters */
        public final boolean m12952() {
            return (this.zzc & 131072) != 0;
        }

        /* renamed from: ϳ  reason: contains not printable characters */
        public final boolean m12950() {
            return this.zzx;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m12839(boolean z) {
            this.zzc |= 131072;
            this.zzx = z;
        }

        /* renamed from: ͻ  reason: contains not printable characters */
        public final String m12943() {
            return this.zzy;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ɩ  reason: contains not printable characters */
        public final void m12809(String str) {
            str.getClass();
            this.zzc |= 262144;
            this.zzy = str;
        }

        /* renamed from: с  reason: contains not printable characters */
        public final boolean m12955() {
            return (this.zzc & 524288) != 0;
        }

        /* renamed from: ϲ  reason: contains not printable characters */
        public final long m12949() {
            return this.zzz;
        }

        /* access modifiers changed from: private */
        /* renamed from: І  reason: contains not printable characters */
        public final void m12885(long j) {
            this.zzc |= 524288;
            this.zzz = j;
        }

        /* renamed from: ј  reason: contains not printable characters */
        public final boolean m12959() {
            return (this.zzc & 1048576) != 0;
        }

        /* renamed from: ɭ  reason: contains not printable characters */
        public final int m12929() {
            return this.zzaa;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ӏ  reason: contains not printable characters */
        public final void m12896(int i) {
            this.zzc |= 1048576;
            this.zzaa = i;
        }

        /* renamed from: ґ  reason: contains not printable characters */
        public final String m12960() {
            return this.zzab;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ӏ  reason: contains not printable characters */
        public final void m12898(String str) {
            str.getClass();
            this.zzc |= 2097152;
            this.zzab = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: Υ  reason: contains not printable characters */
        public final void m12872() {
            this.zzc &= -2097153;
            this.zzab = zzav.zzab;
        }

        /* renamed from: х  reason: contains not printable characters */
        public final String m12957() {
            return this.zzac;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɨ  reason: contains not printable characters */
        public final void m12827(String str) {
            str.getClass();
            this.zzc |= 4194304;
            this.zzac = str;
        }

        /* renamed from: т  reason: contains not printable characters */
        public final boolean m12956() {
            return (this.zzc & 8388608) != 0;
        }

        /* renamed from: ʔ  reason: contains not printable characters */
        public final boolean m12939() {
            return this.zzad;
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m12881(boolean z) {
            this.zzc |= 8388608;
            this.zzad = z;
        }

        /* renamed from: ʖ  reason: contains not printable characters */
        public final List<C2485> m12941() {
            return this.zzae;
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m12875(Iterable<? extends C2485> iterable) {
            if (!this.zzae.m7115()) {
                this.zzae = C0987.m6976(this.zzae);
            }
            C0457.m4780(iterable, this.zzae);
        }

        /* access modifiers changed from: private */
        /* renamed from: ʋ  reason: contains not printable characters */
        public final void m12854() {
            this.zzae = m6978();
        }

        /* renamed from: ʕ  reason: contains not printable characters */
        public final String m12940() {
            return this.zzaf;
        }

        /* access modifiers changed from: private */
        /* renamed from: ӏ  reason: contains not printable characters */
        public final void m12901(String str) {
            str.getClass();
            this.zzc |= 16777216;
            this.zzaf = str;
        }

        /* renamed from: ɻ  reason: contains not printable characters */
        public final boolean m12932() {
            return (this.zzc & 33554432) != 0;
        }

        /* renamed from: ʏ  reason: contains not printable characters */
        public final int m12938() {
            return this.zzag;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ɩ  reason: contains not printable characters */
        public final void m12807(int i) {
            this.zzc |= 33554432;
            this.zzag = i;
        }

        /* renamed from: Γ  reason: contains not printable characters */
        public final String m12945() {
            return this.zzaj;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɾ  reason: contains not printable characters */
        public final void m12850(String str) {
            str.getClass();
            this.zzc |= 268435456;
            this.zzaj = str;
        }

        /* renamed from: τ  reason: contains not printable characters */
        public final boolean m12948() {
            return (this.zzc & 536870912) != 0;
        }

        /* renamed from: ıı  reason: contains not printable characters */
        public final long m12905() {
            return this.zzak;
        }

        /* access modifiers changed from: private */
        /* renamed from: і  reason: contains not printable characters */
        public final void m12891(long j) {
            this.zzc |= 536870912;
            this.zzak = j;
        }

        /* renamed from: ӷ  reason: contains not printable characters */
        public final boolean m12963() {
            return (this.zzc & 1073741824) != 0;
        }

        /* renamed from: Г  reason: contains not printable characters */
        public final long m12953() {
            return this.zzal;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ӏ  reason: contains not printable characters */
        public final void m12897(long j) {
            this.zzc |= 1073741824;
            this.zzal = j;
        }

        /* renamed from: ɂ  reason: contains not printable characters */
        public final String m12920() {
            return this.zzam;
        }

        /* access modifiers changed from: private */
        /* renamed from: ȷ  reason: contains not printable characters */
        public final void m12823(String str) {
            str.getClass();
            this.zzc |= RecyclerView.UNDEFINED_DURATION;
            this.zzam = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: ʇ  reason: contains not printable characters */
        public final void m12853() {
            this.zzc &= Integer.MAX_VALUE;
            this.zzam = zzav.zzam;
        }

        /* renamed from: ǃı  reason: contains not printable characters */
        public final boolean m12917() {
            return (this.zzd & 2) != 0;
        }

        /* renamed from: ıǃ  reason: contains not printable characters */
        public final int m12906() {
            return this.zzao;
        }

        /* access modifiers changed from: private */
        /* renamed from: І  reason: contains not printable characters */
        public final void m12884(int i) {
            this.zzd |= 2;
            this.zzao = i;
        }

        /* renamed from: Ɉ  reason: contains not printable characters */
        public final String m12921() {
            return this.zzap;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɪ  reason: contains not printable characters */
        public final void m12842(String str) {
            str.getClass();
            this.zzd |= 4;
            this.zzap = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m12871(C3646iF iFVar) {
            iFVar.getClass();
            this.zzaq = iFVar;
            this.zzd |= 8;
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m12814(Iterable<? extends Integer> iterable) {
            if (!this.zzar.m7115()) {
                C1019 r0 = this.zzar;
                int size = r0.size();
                this.zzar = r0.m7256(size == 0 ? 10 : size << 1);
            }
            C0457.m4780(iterable, this.zzar);
        }

        /* renamed from: ǃǃ  reason: contains not printable characters */
        public final boolean m12918() {
            return (this.zzd & 16) != 0;
        }

        /* renamed from: ʃ  reason: contains not printable characters */
        public final long m12936() {
            return this.zzas;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɪ  reason: contains not printable characters */
        public final void m12841(long j) {
            this.zzd |= 16;
            this.zzas = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɨ  reason: contains not printable characters */
        public final void m12826(long j) {
            this.zzd |= 32;
            this.zzat = j;
        }

        /* renamed from: ͽ  reason: contains not printable characters */
        public final String m12944() {
            return this.zzau;
        }

        /* access modifiers changed from: private */
        /* renamed from: ł  reason: contains not printable characters */
        public final void m12806(String str) {
            str.getClass();
            this.zzd |= 64;
            this.zzau = str;
        }

        /* renamed from: ͼ  reason: contains not printable characters */
        public static Cif m12856() {
            return (Cif) zzav.m6996();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m12915(int i, Object obj, Object obj2) {
            switch (C2371.f10895[i - 1]) {
                case 1:
                    return new aux();
                case 2:
                    return new Cif((C2371) null);
                case 3:
                    return m6981(zzav, "\u0001+\u0000\u0002\u00012+\u0000\u0004\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0002\u0001\u0005\u0002\u0002\u0006\u0002\u0003\u0007\u0002\u0005\b\b\u0006\t\b\u0007\n\b\b\u000b\b\t\f\u0004\n\r\b\u000b\u000e\b\f\u0010\b\r\u0011\u0002\u000e\u0012\u0002\u000f\u0013\b\u0010\u0014\u0007\u0011\u0015\b\u0012\u0016\u0002\u0013\u0017\u0004\u0014\u0018\b\u0015\u0019\b\u0016\u001a\u0002\u0004\u001c\u0007\u0017\u001d\u001b\u001e\b\u0018\u001f\u0004\u0019 \u0004\u001a!\u0004\u001b\"\b\u001c#\u0002\u001d$\u0002\u001e%\b\u001f&\b '\u0004!)\b\",\t#-\u001d.\u0002$/\u0002%2\b&", new Object[]{"zzc", "zzd", "zze", "zzf", C2481.class, "zzg", C2490.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzk", "zzad", "zzae", C2485.class, "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau"});
                case 4:
                    return zzav;
                case 5:
                    C1889<aux> r2 = zzaw;
                    if (r2 == null) {
                        synchronized (aux.class) {
                            r2 = zzaw;
                            if (r2 == null) {
                                r2 = new C0987.C0990<>(zzav);
                                zzaw = r2;
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
            aux aux = new aux();
            zzav = aux;
            C0987.m6979(aux.class, aux);
        }
    }

    /* renamed from: o.хɪ$iF  reason: case insensitive filesystem */
    public static final class C3646iF extends C0987<C3646iF, C2479> {
        /* access modifiers changed from: private */
        public static final C3646iF zzf;
        private static volatile C1889<C3646iF> zzg;
        private int zzc;
        private int zzd = 1;
        private C1001<Cif> zze = m6978();

        /* renamed from: o.хɪ$iF$If */
        public enum If implements C1000 {
            RADS(1),
            PROVISIONING(2);
            

            /* renamed from: ı  reason: contains not printable characters */
            private static final C0991<If> f11281 = null;

            /* renamed from: ǃ  reason: contains not printable characters */
            private final int f11285;

            /* renamed from: Ι  reason: contains not printable characters */
            public final int m13035() {
                return this.f11285;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public static If m13033(int i) {
                if (i == 1) {
                    return RADS;
                }
                if (i != 2) {
                    return null;
                }
                return PROVISIONING;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public static C1025 m13034() {
                return C2380.f10909;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11285 + " name=" + name() + '>';
            }

            private If(int i) {
                this.f11285 = i;
            }

            static {
                f11281 = new C2464();
            }
        }

        private C3646iF() {
        }

        /* renamed from: o.хɪ$iF$ɩ  reason: contains not printable characters */
        public static final class C2479 extends C0987.C0989<C3646iF, C2479> {
            private C2479() {
                super(C3646iF.zzf);
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final C2479 m13036(Cif.C2480 r2) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C3646iF) this.f6029).m13030((Cif) ((C0987) r2.m7011()));
                return this;
            }

            /* synthetic */ C2479(C2371 r1) {
                this();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m13030(Cif ifVar) {
            ifVar.getClass();
            if (!this.zze.m7115()) {
                this.zze = C0987.m6976(this.zze);
            }
            this.zze.add(ifVar);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public static C2479 m13028() {
            return (C2479) zzf.m6996();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m13032(int i, Object obj, Object obj2) {
            switch (C2371.f10895[i - 1]) {
                case 1:
                    return new C3646iF();
                case 2:
                    return new C2479((C2371) null);
                case 3:
                    return m6981(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zzc", "zzd", If.m13034(), "zze", Cif.class});
                case 4:
                    return zzf;
                case 5:
                    C1889<C3646iF> r2 = zzg;
                    if (r2 == null) {
                        synchronized (C3646iF.class) {
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
            C3646iF iFVar = new C3646iF();
            zzf = iFVar;
            C0987.m6979(C3646iF.class, iFVar);
        }
    }

    /* renamed from: o.хɪ$if  reason: invalid class name */
    public static final class Cif extends C0987<Cif, C2480> {
        /* access modifiers changed from: private */
        public static final Cif zzf;
        private static volatile C1889<Cif> zzg;
        private int zzc;
        private String zzd = "";
        private long zze;

        private Cif() {
        }

        /* renamed from: o.хɪ$if$ı  reason: contains not printable characters */
        public static final class C2480 extends C0987.C0989<Cif, C2480> {
            private C2480() {
                super(Cif.zzf);
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final C2480 m13044(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((Cif) this.f6029).m13038(str);
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final C2480 m13045(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((Cif) this.f6029).m13037(j);
                return this;
            }

            /* synthetic */ C2480(C2371 r1) {
                this();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m13038(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m13037(long j) {
            this.zzc |= 2;
            this.zze = j;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static C2480 m13042() {
            return (C2480) zzf.m6996();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m13043(int i, Object obj, Object obj2) {
            switch (C2371.f10895[i - 1]) {
                case 1:
                    return new Cif();
                case 2:
                    return new C2480((C2371) null);
                case 3:
                    return m6981(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    C1889<Cif> r2 = zzg;
                    if (r2 == null) {
                        synchronized (Cif.class) {
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
            Cif ifVar = new Cif();
            zzf = ifVar;
            C0987.m6979(Cif.class, ifVar);
        }
    }

    /* renamed from: o.хɪ$ǃ  reason: contains not printable characters */
    public static final class C2483 extends C0987<C2483, C2484> {
        /* access modifiers changed from: private */
        public static final C2483 zzj;
        private static volatile C1889<C2483> zzk;
        private int zzc;
        private String zzd = "";
        private String zze = "";
        private long zzf;
        private float zzg;
        private double zzh;
        private C1001<C2483> zzi = m6978();

        private C2483() {
        }

        /* renamed from: o.хɪ$ǃ$ı  reason: contains not printable characters */
        public static final class C2484 extends C0987.C0989<C2483, C2484> {
            private C2484() {
                super(C2483.zzj);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final C2484 m13132(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2483) this.f6029).m13111(str);
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final C2484 m13136(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2483) this.f6029).m13102(str);
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final C2484 m13130() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2483) this.f6029).m13100();
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final C2484 m13131(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2483) this.f6029).m13096(j);
                return this;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final C2484 m13127() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2483) this.f6029).m13107();
                return this;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final C2484 m13128(double d) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2483) this.f6029).m13101(d);
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final C2484 m13134() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2483) this.f6029).m13115();
                return this;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final int m13129() {
                return ((C2483) this.f6029).m13117();
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final C2484 m13137(C2484 r2) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2483) this.f6029).m13112((C2483) ((C0987) r2.m7011()));
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final C2484 m13135(Iterable<? extends C2483> iterable) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2483) this.f6029).m13093(iterable);
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final C2484 m13133() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2483) this.f6029).m13114();
                return this;
            }

            /* synthetic */ C2484(C2371 r1) {
                this();
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m13120() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final String m13123() {
            return this.zzd;
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m13111(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m13122() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final String m13119() {
            return this.zze;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m13102(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɨ  reason: contains not printable characters */
        public final void m13100() {
            this.zzc &= -3;
            this.zze = zzj.zze;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m13116() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: і  reason: contains not printable characters */
        public final long m13125() {
            return this.zzf;
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m13096(long j) {
            this.zzc |= 4;
            this.zzf = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɾ  reason: contains not printable characters */
        public final void m13107() {
            this.zzc &= -5;
            this.zzf = 0;
        }

        /* renamed from: І  reason: contains not printable characters */
        public final boolean m13124() {
            return (this.zzc & 16) != 0;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final double m13126() {
            return this.zzh;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m13101(double d) {
            this.zzc |= 16;
            this.zzh = d;
        }

        /* access modifiers changed from: private */
        /* renamed from: ӏ  reason: contains not printable characters */
        public final void m13115() {
            this.zzc &= -17;
            this.zzh = 0.0d;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final List<C2483> m13121() {
            return this.zzi;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public final int m13117() {
            return this.zzi.size();
        }

        /* renamed from: ŀ  reason: contains not printable characters */
        private final void m13095() {
            if (!this.zzi.m7115()) {
                this.zzi = C0987.m6976(this.zzi);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m13112(C2483 r2) {
            r2.getClass();
            m13095();
            this.zzi.add(r2);
        }

        /* access modifiers changed from: private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m13093(Iterable<? extends C2483> iterable) {
            m13095();
            C0457.m4780(iterable, this.zzi);
        }

        /* access modifiers changed from: private */
        /* renamed from: г  reason: contains not printable characters */
        public final void m13114() {
            this.zzi = m6978();
        }

        /* renamed from: ɪ  reason: contains not printable characters */
        public static C2484 m13106() {
            return (C2484) zzj.m6996();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m13118(int i, Object obj, Object obj2) {
            Class<C2483> cls = C2483.class;
            switch (C2371.f10895[i - 1]) {
                case 1:
                    return new C2483();
                case 2:
                    return new C2484((C2371) null);
                case 3:
                    return m6981(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0001\u0003\u0005\u0000\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", cls});
                case 4:
                    return zzj;
                case 5:
                    C1889<C2483> r3 = zzk;
                    if (r3 == null) {
                        synchronized (cls) {
                            r3 = zzk;
                            if (r3 == null) {
                                r3 = new C0987.C0990<>(zzj);
                                zzk = r3;
                            }
                        }
                    }
                    return r3;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            C2483 r0 = new C2483();
            zzj = r0;
            C0987.m6979(C2483.class, r0);
        }
    }

    /* renamed from: o.хɪ$ɩ  reason: contains not printable characters */
    public static final class C2485 extends C0987<C2485, C2486> {
        /* access modifiers changed from: private */
        public static final C2485 zzh;
        private static volatile C1889<C2485> zzi;
        private int zzc;
        private int zzd;
        private IF zze;
        private IF zzf;
        private boolean zzg;

        private C2485() {
        }

        /* renamed from: o.хɪ$ɩ$ǃ  reason: contains not printable characters */
        public static final class C2486 extends C0987.C0989<C2485, C2486> {
            private C2486() {
                super(C2485.zzh);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final C2486 m13157(int i) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2485) this.f6029).m13140(i);
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final C2486 m13159(IF.Cif ifVar) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2485) this.f6029).m13141((IF) ((C0987) ifVar.m7011()));
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final boolean m13161() {
                return ((C2485) this.f6029).m13154();
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final IF m13156() {
                return ((C2485) this.f6029).m13151();
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final C2486 m13160(IF ifR) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2485) this.f6029).m13142(ifR);
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final C2486 m13158(boolean z) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2485) this.f6029).m13145(z);
                return this;
            }

            /* synthetic */ C2486(C2371 r1) {
                this();
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m13150() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m13148() {
            return this.zzd;
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m13140(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final IF m13153() {
            IF ifR = this.zze;
            return ifR == null ? IF.m12762() : ifR;
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m13141(IF ifR) {
            ifR.getClass();
            this.zze = ifR;
            this.zzc |= 2;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m13154() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final IF m13151() {
            IF ifR = this.zzf;
            return ifR == null ? IF.m12762() : ifR;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m13142(IF ifR) {
            ifR.getClass();
            this.zzf = ifR;
            this.zzc |= 4;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final boolean m13152() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final boolean m13155() {
            return this.zzg;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m13145(boolean z) {
            this.zzc |= 8;
            this.zzg = z;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static C2486 m13139() {
            return (C2486) zzh.m6996();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m13149(int i, Object obj, Object obj2) {
            switch (C2371.f10895[i - 1]) {
                case 1:
                    return new C2485();
                case 2:
                    return new C2486((C2371) null);
                case 3:
                    return m6981(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    C1889<C2485> r2 = zzi;
                    if (r2 == null) {
                        synchronized (C2485.class) {
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
            C2485 r0 = new C2485();
            zzh = r0;
            C0987.m6979(C2485.class, r0);
        }
    }

    /* renamed from: o.хɪ$ι  reason: contains not printable characters */
    public static final class C2489 extends C0987<C2489, If> {
        /* access modifiers changed from: private */
        public static final C2489 zzf;
        private static volatile C1889<C2489> zzg;
        private int zzc;
        private int zzd;
        private C1043 zze = m6980();

        private C2489() {
        }

        /* renamed from: o.хɪ$ι$If */
        public static final class If extends C0987.C0989<C2489, If> {
            private If() {
                super(C2489.zzf);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final If m13190(int i) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2489) this.f6029).m13175(i);
                return this;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final If m13188(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2489) this.f6029).m13173(j);
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final If m13191(Iterable<? extends Long> iterable) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2489) this.f6029).m13179(iterable);
                return this;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final If m13189() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2489) this.f6029).m13181();
                return this;
            }

            /* synthetic */ If(C2371 r1) {
                this();
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m13186() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m13182() {
            return this.zzd;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m13175(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final List<Long> m13184() {
            return this.zze;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final int m13187() {
            return this.zze.size();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final long m13185(int i) {
            return this.zze.m7286(i);
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        private final void m13174() {
            if (!this.zze.m7115()) {
                this.zze = C0987.m6982(this.zze);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m13173(long j) {
            m13174();
            this.zze.m7285(j);
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m13179(Iterable<? extends Long> iterable) {
            m13174();
            C0457.m4780(iterable, this.zze);
        }

        /* access modifiers changed from: private */
        /* renamed from: І  reason: contains not printable characters */
        public final void m13181() {
            this.zze = m6980();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static If m13178() {
            return (If) zzf.m6996();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m13183(int i, Object obj, Object obj2) {
            switch (C2371.f10895[i - 1]) {
                case 1:
                    return new C2489();
                case 2:
                    return new If((C2371) null);
                case 3:
                    return m6981(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    C1889<C2489> r2 = zzg;
                    if (r2 == null) {
                        synchronized (C2489.class) {
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
            C2489 r0 = new C2489();
            zzf = r0;
            C0987.m6979(C2489.class, r0);
        }
    }

    /* renamed from: o.хɪ$І  reason: contains not printable characters */
    public static final class C2490 extends C0987<C2490, If> {
        /* access modifiers changed from: private */
        public static final C2490 zzj;
        private static volatile C1889<C2490> zzk;
        private int zzc;
        private long zzd;
        private String zze = "";
        private String zzf = "";
        private long zzg;
        private float zzh;
        private double zzi;

        private C2490() {
        }

        /* renamed from: o.хɪ$І$If */
        public static final class If extends C0987.C0989<C2490, If> {
            private If() {
                super(C2490.zzj);
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final If m13227(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2490) this.f6029).m13207(j);
                return this;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final If m13221(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2490) this.f6029).m13204(str);
                return this;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final If m13222(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2490) this.f6029).m13208(str);
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final If m13223() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2490) this.f6029).m13203();
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final If m13225(long j) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2490) this.f6029).m13192(j);
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final If m13226() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2490) this.f6029).m13197();
                return this;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final If m13224(double d) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2490) this.f6029).m13195(d);
                return this;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final If m13220() {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2490) this.f6029).m13201();
                return this;
            }

            /* synthetic */ If(C2371 r1) {
                this();
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m13215() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final long m13212() {
            return this.zzd;
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m13207(long j) {
            this.zzc |= 1;
            this.zzd = j;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final String m13210() {
            return this.zze;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m13204(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m13214() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final String m13216() {
            return this.zzf;
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m13208(String str) {
            str.getClass();
            this.zzc |= 4;
            this.zzf = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɾ  reason: contains not printable characters */
        public final void m13203() {
            this.zzc &= -5;
            this.zzf = zzj.zzf;
        }

        /* renamed from: І  reason: contains not printable characters */
        public final boolean m13217() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final long m13219() {
            return this.zzg;
        }

        /* access modifiers changed from: private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m13192(long j) {
            this.zzc |= 8;
            this.zzg = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: ȷ  reason: contains not printable characters */
        public final void m13197() {
            this.zzc &= -9;
            this.zzg = 0;
        }

        /* renamed from: і  reason: contains not printable characters */
        public final boolean m13218() {
            return (this.zzc & 32) != 0;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public final double m13211() {
            return this.zzi;
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m13195(double d) {
            this.zzc |= 32;
            this.zzi = d;
        }

        /* access modifiers changed from: private */
        /* renamed from: ɪ  reason: contains not printable characters */
        public final void m13201() {
            this.zzc &= -33;
            this.zzi = 0.0d;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public static If m13202() {
            return (If) zzj.m6996();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m13213(int i, Object obj, Object obj2) {
            switch (C2371.f10895[i - 1]) {
                case 1:
                    return new C2490();
                case 2:
                    return new If((C2371) null);
                case 3:
                    return m6981(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0002\u0003\u0005\u0001\u0004\u0006\u0000\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    C1889<C2490> r2 = zzk;
                    if (r2 == null) {
                        synchronized (C2490.class) {
                            r2 = zzk;
                            if (r2 == null) {
                                r2 = new C0987.C0990<>(zzj);
                                zzk = r2;
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
            C2490 r0 = new C2490();
            zzj = r0;
            C0987.m6979(C2490.class, r0);
        }
    }
}
