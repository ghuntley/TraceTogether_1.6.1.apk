package o;

import android.graphics.Paint;
import java.util.List;

/* renamed from: o.ɾɹ  reason: contains not printable characters */
public final class C1547 implements C1455 {

    /* renamed from: ı  reason: contains not printable characters */
    public final String f8228;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C1548 f8229;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final List<C1282> f8230;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1282 f8231;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final C1282 f8232;

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1267 f8233;

    /* renamed from: ι  reason: contains not printable characters */
    public final C1292 f8234;

    /* renamed from: І  reason: contains not printable characters */
    public final Cif f8235;

    /* renamed from: і  reason: contains not printable characters */
    public final float f8236;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final boolean f8237;

    /* renamed from: o.ɾɹ$if  reason: invalid class name */
    public enum Cif {
        BUTT,
        ROUND,
        UNKNOWN;

        /* renamed from: ı  reason: contains not printable characters */
        public final Paint.Cap m9057() {
            int i = AnonymousClass5.f8239[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
    }

    /* renamed from: o.ɾɹ$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: ǃ  reason: contains not printable characters */
        static final /* synthetic */ int[] f8238 = new int[C1548.values().length];

        /* renamed from: ι  reason: contains not printable characters */
        static final /* synthetic */ int[] f8239 = new int[Cif.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        static {
            /*
                o.ɾɹ$ǃ[] r0 = o.C1547.C1548.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8238 = r0
                r0 = 1
                int[] r1 = f8238     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.ɾɹ$ǃ r2 = o.C1547.C1548.BEVEL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f8238     // Catch:{ NoSuchFieldError -> 0x001f }
                o.ɾɹ$ǃ r3 = o.C1547.C1548.MITER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f8238     // Catch:{ NoSuchFieldError -> 0x002a }
                o.ɾɹ$ǃ r4 = o.C1547.C1548.ROUND     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                o.ɾɹ$if[] r3 = o.C1547.Cif.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f8239 = r3
                int[] r3 = f8239     // Catch:{ NoSuchFieldError -> 0x003d }
                o.ɾɹ$if r4 = o.C1547.Cif.BUTT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = f8239     // Catch:{ NoSuchFieldError -> 0x0047 }
                o.ɾɹ$if r3 = o.C1547.Cif.ROUND     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = f8239     // Catch:{ NoSuchFieldError -> 0x0051 }
                o.ɾɹ$if r1 = o.C1547.Cif.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1547.AnonymousClass5.<clinit>():void");
        }
    }

    /* renamed from: o.ɾɹ$ǃ  reason: contains not printable characters */
    public enum C1548 {
        MITER,
        ROUND,
        BEVEL;

        /* renamed from: ı  reason: contains not printable characters */
        public final Paint.Join m9058() {
            int i = AnonymousClass5.f8238[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public C1547(String str, C1282 r2, List<C1282> list, C1292 r4, C1267 r5, C1282 r6, Cif ifVar, C1548 r8, float f, boolean z) {
        this.f8228 = str;
        this.f8231 = r2;
        this.f8230 = list;
        this.f8234 = r4;
        this.f8233 = r5;
        this.f8232 = r6;
        this.f8235 = ifVar;
        this.f8229 = r8;
        this.f8236 = f;
        this.f8237 = z;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0550 m9056(C0379 r2, C1578 r3) {
        return new C0753(r2, r3, this);
    }
}
