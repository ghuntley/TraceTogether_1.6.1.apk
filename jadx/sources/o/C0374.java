package o;

import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: o.ıͷ  reason: contains not printable characters */
public final class C0374 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static final int[] f3843 = new int[3];

    /* renamed from: І  reason: contains not printable characters */
    public static final int[] f3844 = new int[4];

    /* renamed from: і  reason: contains not printable characters */
    public static final float[] f3845 = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static final float[] f3846 = {0.0f, 0.5f, 1.0f};

    /* renamed from: ı  reason: contains not printable characters */
    public final Paint f3847;

    /* renamed from: ǃ  reason: contains not printable characters */
    public int f3848;

    /* renamed from: ɨ  reason: contains not printable characters */
    public Paint f3849;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Paint f3850;

    /* renamed from: ɹ  reason: contains not printable characters */
    public int f3851;

    /* renamed from: Ι  reason: contains not printable characters */
    public int f3852;

    /* renamed from: ι  reason: contains not printable characters */
    public final Paint f3853;

    /* renamed from: ӏ  reason: contains not printable characters */
    public final Path f3854;

    public C0374() {
        this((byte) 0);
    }

    private C0374(byte b) {
        this.f3854 = new Path();
        this.f3849 = new Paint();
        this.f3847 = new Paint();
        m4582(-16777216);
        this.f3849.setColor(0);
        this.f3853 = new Paint(4);
        this.f3853.setStyle(Paint.Style.FILL);
        this.f3850 = new Paint(this.f3853);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m4582(int i) {
        int i2 = i & 16777215;
        this.f3852 = 1140850688 | i2;
        this.f3848 = 335544320 | i2;
        this.f3851 = i2;
        this.f3847.setColor(this.f3852);
    }
}
