package o;

import java.util.Locale;

/* renamed from: o.ϒ  reason: contains not printable characters */
public final class C2139 {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C2075 f10289 = new C2142(Cif.f10297, false);

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static final C2075 f10290 = IF.f10295;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C2075 f10291 = new C2142((C2141) null, false);

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C2075 f10292 = new C2142(C2140.f10299, true);

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C2075 f10293 = new C2142((C2141) null, true);

    /* renamed from: ι  reason: contains not printable characters */
    public static final C2075 f10294 = new C2142(C2140.f10299, false);

    /* renamed from: o.ϒ$ǃ  reason: contains not printable characters */
    interface C2141 {
        /* renamed from: ı  reason: contains not printable characters */
        int m11324(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static int m11316(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static int m11317(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }

    /* renamed from: o.ϒ$If  reason: case insensitive filesystem */
    static abstract class C3644If implements C2075 {

        /* renamed from: Ι  reason: contains not printable characters */
        private final C2141 f10296;

        /* access modifiers changed from: protected */
        /* renamed from: ι  reason: contains not printable characters */
        public abstract boolean m11321();

        C3644If(C2141 r1) {
            this.f10296 = r1;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public boolean m11320(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f10296 == null) {
                return m11321();
            } else {
                return m11319(charSequence, i, i2);
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        private boolean m11319(CharSequence charSequence, int i, int i2) {
            int r2 = this.f10296.m11324(charSequence, i, i2);
            if (r2 == 0) {
                return true;
            }
            if (r2 != 1) {
                return m11321();
            }
            return false;
        }
    }

    /* renamed from: o.ϒ$ɩ  reason: contains not printable characters */
    static class C2142 extends C3644If {

        /* renamed from: ı  reason: contains not printable characters */
        private final boolean f10300;

        C2142(C2141 r1, boolean z) {
            super(r1);
            this.f10300 = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: ι  reason: contains not printable characters */
        public boolean m11325() {
            return this.f10300;
        }
    }

    /* renamed from: o.ϒ$ı  reason: contains not printable characters */
    static class C2140 implements C2141 {

        /* renamed from: ɩ  reason: contains not printable characters */
        static final C2140 f10299 = new C2140();

        /* renamed from: ı  reason: contains not printable characters */
        public int m11323(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C2139.m11317(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }

        private C2140() {
        }
    }

    /* renamed from: o.ϒ$if  reason: invalid class name */
    static class Cif implements C2141 {

        /* renamed from: ǃ  reason: contains not printable characters */
        static final Cif f10297 = new Cif(true);

        /* renamed from: ɩ  reason: contains not printable characters */
        private final boolean f10298;

        /* renamed from: ı  reason: contains not printable characters */
        public int m11322(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int r3 = C2139.m11316(Character.getDirectionality(charSequence.charAt(i)));
                if (r3 != 0) {
                    if (r3 != 1) {
                        continue;
                        i++;
                    } else if (!this.f10298) {
                        return 1;
                    }
                } else if (this.f10298) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f10298 ? 1 : 0;
            }
            return 2;
        }

        private Cif(boolean z) {
            this.f10298 = z;
        }
    }

    /* renamed from: o.ϒ$IF */
    static class IF extends C3644If {

        /* renamed from: Ι  reason: contains not printable characters */
        static final IF f10295 = new IF();

        IF() {
            super((C2141) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: ι  reason: contains not printable characters */
        public boolean m11318() {
            return C2148.m11333(Locale.getDefault()) == 1;
        }
    }
}
