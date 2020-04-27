package o;

import android.content.Context;
import java.util.concurrent.Executor;
import o.C2302;

/* renamed from: o.ϳΙ  reason: contains not printable characters */
final class C2188 extends C2302 {

    /* renamed from: ı  reason: contains not printable characters */
    private C3351dc f10406;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C3351dc<C2606> f10407;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3351dc<Context> f10408;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3351dc f10409;

    /* renamed from: ɹ  reason: contains not printable characters */
    private C3351dc<C2622> f10410;

    /* renamed from: ɾ  reason: contains not printable characters */
    private C3351dc<C2243> f10411;

    /* renamed from: Ι  reason: contains not printable characters */
    private C3351dc f10412;

    /* renamed from: ι  reason: contains not printable characters */
    private C3351dc<Executor> f10413;

    /* renamed from: І  reason: contains not printable characters */
    private C3351dc<C2466> f10414;

    /* renamed from: і  reason: contains not printable characters */
    private C3351dc<C2572> f10415;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private C3351dc<C2498> f10416;

    /* renamed from: ӏ  reason: contains not printable characters */
    private C3351dc<C2499> f10417;

    /* synthetic */ C2188(Context context, byte b) {
        this(context);
    }

    private C2188(Context context) {
        this.f10413 = N.m1391(C2205.f10455);
        this.f10408 = Q.m1412(context);
        this.f10409 = new C2372(this.f10408, C2711.f12538, C2770.f13111);
        this.f10406 = N.m1391(new C2410(this.f10408, this.f10409));
        this.f10412 = new C2685(this.f10408, C2626.f11966);
        this.f10410 = N.m1391(new C2682(C2711.f12538, C2770.f13111, C2628.f11968, this.f10412));
        this.f10415 = new C2422(C2711.f12538);
        this.f10407 = new C2494(this.f10408, this.f10410, this.f10415, C2770.f13111);
        C3351dc<Executor> dcVar = this.f10413;
        C3351dc dcVar2 = this.f10406;
        C3351dc<C2606> dcVar3 = this.f10407;
        C3351dc<C2622> dcVar4 = this.f10410;
        this.f10414 = new C2413(dcVar, dcVar2, dcVar3, dcVar4, dcVar4);
        C3351dc<Context> dcVar5 = this.f10408;
        C3351dc dcVar6 = this.f10406;
        C3351dc<C2622> dcVar7 = this.f10410;
        C3351dc<C2606> dcVar8 = this.f10407;
        this.f10416 = new C2534(dcVar5, dcVar6, dcVar7, dcVar8, this.f10413, dcVar7, C2711.f12538);
        C3351dc<Executor> dcVar9 = this.f10413;
        C3351dc<C2622> dcVar10 = this.f10410;
        this.f10417 = new C2589(dcVar9, dcVar10, this.f10407, dcVar10);
        this.f10411 = N.m1391(new C2293(C2711.f12538, C2770.f13111, this.f10414, this.f10416, this.f10417));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final C2243 m11577() {
        return this.f10411.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final C2602 m11576() {
        return this.f10410.get();
    }

    /* renamed from: o.ϳΙ$ǃ  reason: contains not printable characters */
    static final class C2189 implements C2302.C2303 {

        /* renamed from: ı  reason: contains not printable characters */
        private Context f10418;

        private C2189() {
        }

        /* synthetic */ C2189(byte b) {
            this();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2302 m11579() {
            Context context = this.f10418;
            Class<Context> cls = Context.class;
            if (context != null) {
                return new C2188(context, (byte) 0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ C2302.C2303 m11578(Context context) {
            if (context != null) {
                this.f10418 = context;
                return this;
            }
            throw new NullPointerException();
        }
    }
}
