package o;

/* renamed from: o.ԑΙ  reason: contains not printable characters */
final class C2980 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ String f13749;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C2767 f13750;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ String f13751;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ String f13752;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ long f13753;

    C2980(C2767 r1, String str, String str2, String str3, long j) {
        this.f13750 = r1;
        this.f13749 = str;
        this.f13752 = str2;
        this.f13751 = str3;
        this.f13753 = j;
    }

    public final void run() {
        String str = this.f13749;
        if (str == null) {
            this.f13750.f13107.m10495().m14085().m6340(this.f13752, (C0856) null);
            return;
        }
        this.f13750.f13107.m10495().m14085().m6340(this.f13752, new C0856(this.f13751, str, this.f13753));
    }
}
