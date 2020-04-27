package o;

import java.util.List;
import o.C0987;

/* renamed from: o.Іͽ  reason: contains not printable characters */
public final class C2274 {

    /* renamed from: o.Іͽ$If */
    public static final class If extends C0987<If, C2275If> {
        /* access modifiers changed from: private */
        public static final If zzl;
        private static volatile C1889<If> zzm;
        private int zzc;
        private int zzd;
        private String zze = "";
        private C1001<C2277> zzf = m6978();
        private boolean zzg;
        private C2279 zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        private If() {
        }

        /* renamed from: o.Іͽ$If$If  reason: collision with other inner class name */
        public static final class C2275If extends C0987.C0989<If, C2275If> {
            private C2275If() {
                super(If.zzl);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final String m11856() {
                return ((If) this.f6029).m11848();
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final C2275If m11860(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((If) this.f6029).m11838(str);
                return this;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final int m11859() {
                return ((If) this.f6029).m11843();
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final C2277 m11857(int i) {
                return ((If) this.f6029).m11844(i);
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final C2275If m11858(int i, C2277 r3) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((If) this.f6029).m11841(i, r3);
                return this;
            }

            /* synthetic */ C2275If(C2261 r1) {
                this();
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m11851() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final int m11846() {
            return this.zzd;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final String m11848() {
            return this.zze;
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m11838(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final List<C2277> m11850() {
            return this.zzf;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m11843() {
            return this.zzf.size();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C2277 m11844(int i) {
            return (C2277) this.zzf.get(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m11841(int i, C2277 r3) {
            r3.getClass();
            if (!this.zzf.m7115()) {
                this.zzf = C0987.m6976(this.zzf);
            }
            this.zzf.set(i, r3);
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final boolean m11854() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final C2279 m11849() {
            C2279 r0 = this.zzh;
            return r0 == null ? C2279.m11924() : r0;
        }

        /* renamed from: І  reason: contains not printable characters */
        public final boolean m11852() {
            return this.zzi;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public final boolean m11845() {
            return this.zzj;
        }

        /* renamed from: і  reason: contains not printable characters */
        public final boolean m11853() {
            return (this.zzc & 64) != 0;
        }

        /* renamed from: ӏ  reason: contains not printable characters */
        public final boolean m11855() {
            return this.zzk;
        }

        /* renamed from: ɨ  reason: contains not printable characters */
        public static C2275If m11840() {
            return (C2275If) zzl.m6996();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m11847(int i, Object obj, Object obj2) {
            switch (C2261.f10586[i - 1]) {
                case 1:
                    return new If();
                case 2:
                    return new C2275If((C2261) null);
                case 3:
                    return m6981(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", C2277.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzl;
                case 5:
                    C1889<If> r2 = zzm;
                    if (r2 == null) {
                        synchronized (If.class) {
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

        static {
            If ifR = new If();
            zzl = ifR;
            C0987.m6979(If.class, ifR);
        }
    }

    /* renamed from: o.Іͽ$aux */
    public static final class aux extends C0987<aux, Cif> {
        /* access modifiers changed from: private */
        public static final aux zzh;
        private static volatile C1889<aux> zzi;
        private int zzc;
        private int zzd;
        private String zze = "";
        private boolean zzf;
        private C1001<String> zzg = C0987.m6978();

        /* renamed from: o.Іͽ$aux$If */
        public enum If implements C1000 {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            

            /* renamed from: і  reason: contains not printable characters */
            private static final C0991<If> f10642 = null;

            /* renamed from: ɹ  reason: contains not printable characters */
            private final int f10644;

            /* renamed from: Ι  reason: contains not printable characters */
            public final int m11874() {
                return this.f10644;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public static If m11873(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public static C1025 m11872() {
                return C2370.f10894;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f10644 + " name=" + name() + '>';
            }

            private If(int i) {
                this.f10644 = i;
            }

            static {
                f10642 = new C2368();
            }
        }

        private aux() {
        }

        /* renamed from: o.Іͽ$aux$if  reason: invalid class name */
        public static final class Cif extends C0987.C0989<aux, Cif> {
            private Cif() {
                super(aux.zzh);
            }

            /* synthetic */ Cif(C2261 r1) {
                this();
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m11863() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final If m11869() {
            If r0 = If.m11873(this.zzd);
            return r0 == null ? If.UNKNOWN_MATCH_TYPE : r0;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m11868() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final String m11866() {
            return this.zze;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m11865() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final boolean m11867() {
            return this.zzf;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final List<String> m11871() {
            return this.zzg;
        }

        /* renamed from: і  reason: contains not printable characters */
        public final int m11870() {
            return this.zzg.size();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m11864(int i, Object obj, Object obj2) {
            switch (C2261.f10586[i - 1]) {
                case 1:
                    return new aux();
                case 2:
                    return new Cif((C2261) null);
                case 3:
                    return m6981(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"zzc", "zzd", If.m11872(), "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    C1889<aux> r2 = zzi;
                    if (r2 == null) {
                        synchronized (aux.class) {
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

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static aux m11861() {
            return zzh;
        }

        static {
            aux aux = new aux();
            zzh = aux;
            C0987.m6979(aux.class, aux);
        }
    }

    /* renamed from: o.Іͽ$if  reason: invalid class name */
    public static final class Cif extends C0987<Cif, C2276> {
        /* access modifiers changed from: private */
        public static final Cif zzi;
        private static volatile C1889<Cif> zzj;
        private int zzc;
        private int zzd;
        private C1001<C2278> zze = m6978();
        private C1001<If> zzf = m6978();
        private boolean zzg;
        private boolean zzh;

        private Cif() {
        }

        /* renamed from: o.Іͽ$if$ı  reason: contains not printable characters */
        public static final class C2276 extends C0987.C0989<Cif, C2276> {
            private C2276() {
                super(Cif.zzi);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final int m11890() {
                return ((Cif) this.f6029).m11881();
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final C2278 m11894(int i) {
                return ((Cif) this.f6029).m11888(i);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final C2276 m11891(int i, C2278.If ifR) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((Cif) this.f6029).m11877(i, (C2278) ((C0987) ifR.m7011()));
                return this;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final int m11892() {
                return ((Cif) this.f6029).m11885();
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final If m11893(int i) {
                return ((Cif) this.f6029).m11883(i);
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final C2276 m11889(int i, If.C2275If ifR) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((Cif) this.f6029).m11876(i, (If) ((C0987) ifR.m7011()));
                return this;
            }

            /* synthetic */ C2276(C2261 r1) {
                this();
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m11886() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final int m11887() {
            return this.zzd;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final List<C2278> m11884() {
            return this.zze;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final int m11881() {
            return this.zze.size();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C2278 m11888(int i) {
            return (C2278) this.zze.get(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m11877(int i, C2278 r3) {
            r3.getClass();
            if (!this.zze.m7115()) {
                this.zze = C0987.m6976(this.zze);
            }
            this.zze.set(i, r3);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final List<If> m11880() {
            return this.zzf;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final int m11885() {
            return this.zzf.size();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final If m11883(int i) {
            return (If) this.zzf.get(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m11876(int i, If ifR) {
            ifR.getClass();
            if (!this.zzf.m7115()) {
                this.zzf = C0987.m6976(this.zzf);
            }
            this.zzf.set(i, ifR);
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m11882(int i, Object obj, Object obj2) {
            switch (C2261.f10586[i - 1]) {
                case 1:
                    return new Cif();
                case 2:
                    return new C2276((C2261) null);
                case 3:
                    return m6981(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0007\u0001\u0005\u0007\u0002", new Object[]{"zzc", "zzd", "zze", C2278.class, "zzf", If.class, "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    C1889<Cif> r2 = zzj;
                    if (r2 == null) {
                        synchronized (Cif.class) {
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
            Cif ifVar = new Cif();
            zzi = ifVar;
            C0987.m6979(Cif.class, ifVar);
        }
    }

    /* renamed from: o.Іͽ$ɩ  reason: contains not printable characters */
    public static final class C2279 extends C0987<C2279, C2281> {
        /* access modifiers changed from: private */
        public static final C2279 zzi;
        private static volatile C1889<C2279> zzj;
        private int zzc;
        private int zzd;
        private boolean zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";

        /* renamed from: o.Іͽ$ɩ$ı  reason: contains not printable characters */
        public enum C2280 implements C1000 {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            

            /* renamed from: ɹ  reason: contains not printable characters */
            private static final C0991<C2280> f10649 = null;

            /* renamed from: і  reason: contains not printable characters */
            private final int f10652;

            /* renamed from: Ι  reason: contains not printable characters */
            public final int m11938() {
                return this.f10652;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public static C2280 m11937(int i) {
                if (i == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i == 1) {
                    return LESS_THAN;
                }
                if (i == 2) {
                    return GREATER_THAN;
                }
                if (i == 3) {
                    return EQUAL;
                }
                if (i != 4) {
                    return null;
                }
                return BETWEEN;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public static C1025 m11936() {
                return C2332.f10826;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f10652 + " name=" + name() + '>';
            }

            private C2280(int i) {
                this.f10652 = i;
            }

            static {
                f10649 = new C2305();
            }
        }

        private C2279() {
        }

        /* renamed from: o.Іͽ$ɩ$ǃ  reason: contains not printable characters */
        public static final class C2281 extends C0987.C0989<C2279, C2281> {
            private C2281() {
                super(C2279.zzi);
            }

            /* synthetic */ C2281(C2261 r1) {
                this();
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m11932() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2280 m11928() {
            C2280 r0 = C2280.m11937(this.zzd);
            return r0 == null ? C2280.UNKNOWN_COMPARISON_TYPE : r0;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m11925() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m11929() {
            return this.zze;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m11931() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public final String m11926() {
            return this.zzf;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final boolean m11930() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: І  reason: contains not printable characters */
        public final String m11933() {
            return this.zzg;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final boolean m11935() {
            return (this.zzc & 16) != 0;
        }

        /* renamed from: і  reason: contains not printable characters */
        public final String m11934() {
            return this.zzh;
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m11927(int i, Object obj, Object obj2) {
            switch (C2261.f10586[i - 1]) {
                case 1:
                    return new C2279();
                case 2:
                    return new C2281((C2261) null);
                case 3:
                    return m6981(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzc", "zzd", C2280.m11936(), "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    C1889<C2279> r2 = zzj;
                    if (r2 == null) {
                        synchronized (C2279.class) {
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

        /* renamed from: ɾ  reason: contains not printable characters */
        public static C2279 m11924() {
            return zzi;
        }

        static {
            C2279 r0 = new C2279();
            zzi = r0;
            C0987.m6979(C2279.class, r0);
        }
    }

    /* renamed from: o.Іͽ$ı  reason: contains not printable characters */
    public static final class C2277 extends C0987<C2277, Cif> {
        /* access modifiers changed from: private */
        public static final C2277 zzh;
        private static volatile C1889<C2277> zzi;
        private int zzc;
        private aux zzd;
        private C2279 zze;
        private boolean zzf;
        private String zzg = "";

        private C2277() {
        }

        /* renamed from: o.Іͽ$ı$if  reason: invalid class name */
        public static final class Cif extends C0987.C0989<C2277, Cif> {
            private Cif() {
                super(C2277.zzh);
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final Cif m11908(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2277) this.f6029).m11896(str);
                return this;
            }

            /* synthetic */ Cif(C2261 r1) {
                this();
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m11904() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final aux m11899() {
            aux aux = this.zzd;
            return aux == null ? aux.m11861() : aux;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m11901() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2279 m11902() {
            C2279 r0 = this.zze;
            return r0 == null ? C2279.m11924() : r0;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m11905() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: і  reason: contains not printable characters */
        public final boolean m11907() {
            return this.zzf;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final boolean m11903() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: І  reason: contains not printable characters */
        public final String m11906() {
            return this.zzg;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m11896(String str) {
            str.getClass();
            this.zzc |= 8;
            this.zzg = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m11900(int i, Object obj, Object obj2) {
            switch (C2261.f10586[i - 1]) {
                case 1:
                    return new C2277();
                case 2:
                    return new Cif((C2261) null);
                case 3:
                    return m6981(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    C1889<C2277> r2 = zzi;
                    if (r2 == null) {
                        synchronized (C2277.class) {
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

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static C2277 m11895() {
            return zzh;
        }

        static {
            C2277 r0 = new C2277();
            zzh = r0;
            C0987.m6979(C2277.class, r0);
        }
    }

    /* renamed from: o.Іͽ$ǃ  reason: contains not printable characters */
    public static final class C2278 extends C0987<C2278, If> {
        /* access modifiers changed from: private */
        public static final C2278 zzj;
        private static volatile C1889<C2278> zzk;
        private int zzc;
        private int zzd;
        private String zze = "";
        private C2277 zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;

        private C2278() {
        }

        /* renamed from: o.Іͽ$ǃ$If */
        public static final class If extends C0987.C0989<C2278, If> {
            private If() {
                super(C2278.zzj);
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final If m11922(String str) {
                if (this.f6031) {
                    m7014();
                    this.f6031 = false;
                }
                ((C2278) this.f6029).m11911(str);
                return this;
            }

            /* synthetic */ If(C2261 r1) {
                this();
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m11918() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m11913() {
            return this.zzd;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final String m11916() {
            return this.zze;
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m11911(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C2277 m11919() {
            C2277 r0 = this.zzf;
            return r0 == null ? C2277.m11895() : r0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m11915() {
            return this.zzg;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final boolean m11917() {
            return this.zzh;
        }

        /* renamed from: І  reason: contains not printable characters */
        public final boolean m11920() {
            return (this.zzc & 32) != 0;
        }

        /* renamed from: і  reason: contains not printable characters */
        public final boolean m11921() {
            return this.zzi;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public static If m11912() {
            return (If) zzj.m6996();
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m11914(int i, Object obj, Object obj2) {
            switch (C2261.f10586[i - 1]) {
                case 1:
                    return new C2278();
                case 2:
                    return new If((C2261) null);
                case 3:
                    return m6981(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    C1889<C2278> r2 = zzk;
                    if (r2 == null) {
                        synchronized (C2278.class) {
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
            C2278 r0 = new C2278();
            zzj = r0;
            C0987.m6979(C2278.class, r0);
        }
    }
}
