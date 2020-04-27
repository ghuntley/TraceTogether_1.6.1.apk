package o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import o.C2319;
import o.C2751;

/* renamed from: o.ѵ  reason: contains not printable characters */
public class C2656 extends C2319 {

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f12201 = false;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C2536<C2608, C2657> f12202 = new C2536<>();

    /* renamed from: ɩ  reason: contains not printable characters */
    private C2319.Cif f12203;

    /* renamed from: Ι  reason: contains not printable characters */
    private final WeakReference<C2851> f12204;

    /* renamed from: ι  reason: contains not printable characters */
    private int f12205 = 0;

    /* renamed from: І  reason: contains not printable characters */
    private ArrayList<C2319.Cif> f12206 = new ArrayList<>();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f12207 = false;

    public C2656(C2851 r2) {
        this.f12204 = new WeakReference<>(r2);
        this.f12203 = C2319.Cif.INITIALIZED;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14068(C2319.Cif ifVar) {
        m14067(ifVar);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m14066(C2319.C2320 r1) {
        m14067(m14063(r1));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14067(C2319.Cif ifVar) {
        if (this.f12203 != ifVar) {
            this.f12203 = ifVar;
            if (this.f12201 || this.f12205 != 0) {
                this.f12207 = true;
                return;
            }
            this.f12201 = true;
            m14061();
            this.f12201 = false;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m14065() {
        if (this.f12202.f13051 == 0) {
            return true;
        }
        C2319.Cif ifVar = ((C2657) this.f12202.f13052.getValue()).f12210;
        C2319.Cif ifVar2 = ((C2657) this.f12202.f13050.getValue()).f12210;
        if (ifVar == ifVar2 && this.f12203 == ifVar2) {
            return true;
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private C2319.Cif m14058(C2608 r4) {
        C2536<C2608, C2657> r0 = this.f12202;
        C2319.Cif ifVar = null;
        C2751.C2752<K, V> r42 = r0.f11623.containsKey(r4) ? r0.f11623.get(r4).f13057 : null;
        C2319.Cif ifVar2 = r42 != null ? ((C2657) r42.getValue()).f12210 : null;
        if (!this.f12206.isEmpty()) {
            ArrayList<C2319.Cif> arrayList = this.f12206;
            ifVar = arrayList.get(arrayList.size() - 1);
        }
        C2319.Cif ifVar3 = this.f12203;
        if (ifVar2 == null || ifVar2.compareTo(ifVar3) >= 0) {
            ifVar2 = ifVar3;
        }
        return (ifVar == null || ifVar.compareTo(ifVar2) >= 0) ? ifVar2 : ifVar;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m14072(C2608 r7) {
        C2851 r0;
        C2657 r1 = new C2657(r7, this.f12203 == C2319.Cif.DESTROYED ? C2319.Cif.DESTROYED : C2319.Cif.INITIALIZED);
        if (this.f12202.m14578(r7, r1) == null && (r0 = this.f12204.get()) != null) {
            boolean z = this.f12205 != 0 || this.f12201;
            C2319.Cif r4 = m14058(r7);
            this.f12205++;
            while (r1.f12210.compareTo(r4) < 0 && this.f12202.f11623.containsKey(r7)) {
                this.f12206.add(r1.f12210);
                r1.m14073(r0, m14059(r1.f12210));
                ArrayList<C2319.Cif> arrayList = this.f12206;
                arrayList.remove(arrayList.size() - 1);
                r4 = m14058(r7);
            }
            if (!z) {
                m14061();
            }
            this.f12205--;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m14070(C2608 r2) {
        this.f12202.m14580(r2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2319.Cif m14069() {
        return this.f12203;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C2319.Cif m14063(C2319.C2320 r2) {
        switch (AnonymousClass5.f12208[r2.ordinal()]) {
            case 1:
            case 2:
                return C2319.Cif.CREATED;
            case 3:
            case 4:
                return C2319.Cif.STARTED;
            case 5:
                return C2319.Cif.RESUMED;
            case 6:
                return C2319.Cif.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value ".concat(String.valueOf(r2)));
        }
    }

    /* renamed from: o.ѵ$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: ı  reason: contains not printable characters */
        static final /* synthetic */ int[] f12208 = new int[C2319.C2320.values().length];

        /* renamed from: Ι  reason: contains not printable characters */
        static final /* synthetic */ int[] f12209 = new int[C2319.Cif.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0086 */
        static {
            /*
                o.Іӏ$if[] r0 = o.C2319.Cif.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12209 = r0
                r0 = 1
                int[] r1 = f12209     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.Іӏ$if r2 = o.C2319.Cif.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f12209     // Catch:{ NoSuchFieldError -> 0x001f }
                o.Іӏ$if r3 = o.C2319.Cif.CREATED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f12209     // Catch:{ NoSuchFieldError -> 0x002a }
                o.Іӏ$if r4 = o.C2319.Cif.STARTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f12209     // Catch:{ NoSuchFieldError -> 0x0035 }
                o.Іӏ$if r5 = o.C2319.Cif.RESUMED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = f12209     // Catch:{ NoSuchFieldError -> 0x0040 }
                o.Іӏ$if r6 = o.C2319.Cif.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                o.Іӏ$ǃ[] r5 = o.C2319.C2320.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f12208 = r5
                int[] r5 = f12208     // Catch:{ NoSuchFieldError -> 0x0053 }
                o.Іӏ$ǃ r6 = o.C2319.C2320.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f12208     // Catch:{ NoSuchFieldError -> 0x005d }
                o.Іӏ$ǃ r5 = o.C2319.C2320.ON_STOP     // Catch:{ NoSuchFieldError -> 0x005d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                int[] r0 = f12208     // Catch:{ NoSuchFieldError -> 0x0067 }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_START     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = f12208     // Catch:{ NoSuchFieldError -> 0x0071 }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = f12208     // Catch:{ NoSuchFieldError -> 0x007b }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x007b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = f12208     // Catch:{ NoSuchFieldError -> 0x0086 }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = f12208     // Catch:{ NoSuchFieldError -> 0x0091 }
                o.Іӏ$ǃ r1 = o.C2319.C2320.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C2656.AnonymousClass5.<clinit>():void");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static C2319.C2320 m14059(C2319.Cif ifVar) {
        int i = AnonymousClass5.f12209[ifVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C2319.C2320.ON_START;
            }
            if (i == 3) {
                return C2319.C2320.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value ".concat(String.valueOf(ifVar)));
            }
        }
        return C2319.C2320.ON_CREATE;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m14060(C2851 r6) {
        C2536<C2608, C2657> r0 = this.f12202;
        C2751.C2754 r1 = new C2751.C2754();
        r0.f13053.put(r1, Boolean.FALSE);
        while (r1.hasNext() && !this.f12207) {
            Map.Entry entry = (Map.Entry) r1.next();
            C2657 r2 = (C2657) entry.getValue();
            while (r2.f12210.compareTo(this.f12203) < 0 && !this.f12207) {
                C2536<C2608, C2657> r3 = this.f12202;
                if (!r3.f11623.containsKey(entry.getKey())) {
                    break;
                }
                this.f12206.add(r2.f12210);
                r2.m14073(r6, m14059(r2.f12210));
                ArrayList<C2319.Cif> arrayList = this.f12206;
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m14064(C2851 r8) {
        C2319.C2320 r3;
        C2536<C2608, C2657> r0 = this.f12202;
        C2751.If ifR = new C2751.If(r0.f13050, r0.f13052);
        r0.f13053.put(ifR, Boolean.FALSE);
        while (ifR.hasNext() && !this.f12207) {
            Map.Entry entry = (Map.Entry) ifR.next();
            C2657 r2 = (C2657) entry.getValue();
            while (r2.f12210.compareTo(this.f12203) > 0 && !this.f12207) {
                C2536<C2608, C2657> r32 = this.f12202;
                if (!r32.f11623.containsKey(entry.getKey())) {
                    continue;
                    break;
                }
                C2319.Cif ifVar = r2.f12210;
                int i = AnonymousClass5.f12209[ifVar.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        r3 = C2319.C2320.ON_DESTROY;
                    } else if (i == 3) {
                        r3 = C2319.C2320.ON_STOP;
                    } else if (i == 4) {
                        r3 = C2319.C2320.ON_PAUSE;
                    } else if (i != 5) {
                        throw new IllegalArgumentException("Unexpected state value ".concat(String.valueOf(ifVar)));
                    } else {
                        throw new IllegalArgumentException();
                    }
                    this.f12206.add(m14063(r3));
                    r2.m14073(r8, r3);
                    ArrayList<C2319.Cif> arrayList = this.f12206;
                    arrayList.remove(arrayList.size() - 1);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m14061() {
        C2851 r0 = this.f12204.get();
        if (r0 != null) {
            while (!m14065()) {
                this.f12207 = false;
                if (this.f12203.compareTo(((C2657) this.f12202.f13052.getValue()).f12210) < 0) {
                    m14064(r0);
                }
                C2751.C2752<K, V> r1 = this.f12202.f13050;
                if (!this.f12207 && r1 != null && this.f12203.compareTo(((C2657) r1.getValue()).f12210) > 0) {
                    m14060(r0);
                }
            }
            this.f12207 = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    /* renamed from: ι  reason: contains not printable characters */
    static C2319.Cif m14062(C2319.Cif ifVar, C2319.Cif ifVar2) {
        return (ifVar2 == null || ifVar2.compareTo(ifVar) >= 0) ? ifVar : ifVar2;
    }

    /* renamed from: o.ѵ$ɩ  reason: contains not printable characters */
    static class C2657 {

        /* renamed from: ı  reason: contains not printable characters */
        C2319.Cif f12210;

        /* renamed from: ɩ  reason: contains not printable characters */
        private C2456 f12211;

        C2657(C2608 r1, C2319.Cif ifVar) {
            this.f12211 = C2762.m14614((Object) r1);
            this.f12210 = ifVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m14073(C2851 r3, C2319.C2320 r4) {
            C2319.Cif r0 = C2656.m14063(r4);
            this.f12210 = C2656.m14062(this.f12210, r0);
            this.f12211.m12596(r3, r4);
            this.f12210 = r0;
        }
    }

    @Deprecated
    /* renamed from: ι  reason: contains not printable characters */
    public final void m14071(C2319.Cif ifVar) {
        m14067(ifVar);
    }
}
