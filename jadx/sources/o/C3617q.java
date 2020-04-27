package o;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.C3616p;

/* renamed from: o.q  reason: case insensitive filesystem */
public final class C3617q {

    /* renamed from: ı  reason: contains not printable characters */
    public final Uri f3474;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final List<C3625y> f3475;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int f3476;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final Bitmap.Config f3477;

    /* renamed from: Ι  reason: contains not printable characters */
    int f3478;

    /* renamed from: ι  reason: contains not printable characters */
    public final int f3479;

    /* renamed from: І  reason: contains not printable characters */
    public final C3616p.Cif f3480;

    /* renamed from: і  reason: contains not printable characters */
    public final int f3481;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final boolean f3482;

    /* synthetic */ C3617q(Uri uri, List list, int i, int i2, boolean z, Bitmap.Config config, C3616p.Cif ifVar) {
        this(uri, 0, list, i, i2, z, config, ifVar);
    }

    static {
        TimeUnit.SECONDS.toNanos(5);
    }

    private C3617q(Uri uri, int i, List<C3625y> list, int i2, int i3, boolean z, Bitmap.Config config, C3616p.Cif ifVar) {
        this.f3474 = uri;
        this.f3476 = 0;
        if (list == null) {
            this.f3475 = null;
        } else {
            this.f3475 = Collections.unmodifiableList(list);
        }
        this.f3479 = i2;
        this.f3481 = i3;
        this.f3482 = z;
        this.f3477 = config;
        this.f3480 = ifVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f3476;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f3474);
        }
        List<C3625y> list = this.f3475;
        if (list != null && !list.isEmpty()) {
            for (C3625y key : this.f3475) {
                sb.append(' ');
                sb.append(key.key());
            }
        }
        if (this.f3479 > 0) {
            sb.append(" resize(");
            sb.append(this.f3479);
            sb.append(',');
            sb.append(this.f3481);
            sb.append(')');
        }
        if (this.f3482) {
            sb.append(" centerCrop");
        }
        if (this.f3477 != null) {
            sb.append(' ');
            sb.append(this.f3477);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: o.q$ǃ  reason: contains not printable characters */
    public static final class C0274 {

        /* renamed from: ı  reason: contains not printable characters */
        int f3483;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private C3616p.Cif f3484;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f3485;

        /* renamed from: ɩ  reason: contains not printable characters */
        Uri f3486;

        /* renamed from: Ι  reason: contains not printable characters */
        public boolean f3487;

        /* renamed from: ι  reason: contains not printable characters */
        List<C3625y> f3488;

        /* renamed from: І  reason: contains not printable characters */
        private Bitmap.Config f3489;

        C0274(Uri uri, Bitmap.Config config) {
            this.f3486 = uri;
            this.f3489 = config;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C0274 m4066(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f3485 = i;
                this.f3483 = i2;
                return this;
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C3617q m4065() {
            if (this.f3487 && this.f3485 == 0 && this.f3483 == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (this.f3484 == null) {
                this.f3484 = C3616p.Cif.NORMAL;
            }
            return new C3617q(this.f3486, this.f3488, this.f3485, this.f3483, this.f3487, this.f3489, this.f3484);
        }
    }
}
