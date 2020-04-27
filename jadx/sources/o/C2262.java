package o;

/* renamed from: o.Іʄ  reason: contains not printable characters */
final class C2262 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ int f10587;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ String f10588;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ Object f10589;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ Object f10590;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ Object f10591;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final /* synthetic */ C2244 f10592;

    C2262(C2244 r1, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f10592 = r1;
        this.f10587 = i;
        this.f10588 = str;
        this.f10591 = obj;
        this.f10590 = obj2;
        this.f10589 = obj3;
    }

    public final void run() {
        C2327 r0 = this.f10592.f14314.m14107();
        if (r0.m15646()) {
            if (this.f10592.f10536 == 0) {
                if (this.f10592.r_().m13389()) {
                    C2244 r1 = this.f10592;
                    r1.q_();
                    char unused = r1.f10536 = 'C';
                } else {
                    C2244 r12 = this.f10592;
                    r12.q_();
                    char unused2 = r12.f10536 = 'c';
                }
            }
            if (this.f10592.f10543 < 0) {
                C2244 r13 = this.f10592;
                long unused3 = r13.f10543 = r13.r_().m13369();
            }
            char charAt = "01VDIWEA?".charAt(this.f10587);
            char r2 = this.f10592.f10536;
            long r3 = this.f10592.f10543;
            String r5 = C2244.m11705(true, this.f10588, this.f10591, this.f10590, this.f10589);
            StringBuilder sb = new StringBuilder(String.valueOf(r5).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(r2);
            sb.append(r3);
            sb.append(":");
            sb.append(r5);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f10588.substring(0, 1024);
            }
            r0.f10790.m12536(sb2, 1);
            return;
        }
        this.f10592.m11707(6, "Persisted config not initialized. Not logging error/warn");
    }
}
