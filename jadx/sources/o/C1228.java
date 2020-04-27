package o;

/* renamed from: o.ɨӏ  reason: contains not printable characters */
public final class C1228 {

    /* renamed from: ı  reason: contains not printable characters */
    public final Cif f6957;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final float f6958;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final float f6959;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f6960;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final float f6961;

    /* renamed from: ɾ  reason: contains not printable characters */
    public final boolean f6962;

    /* renamed from: Ι  reason: contains not printable characters */
    public final String f6963;

    /* renamed from: ι  reason: contains not printable characters */
    public final int f6964;

    /* renamed from: І  reason: contains not printable characters */
    public final int f6965;

    /* renamed from: і  reason: contains not printable characters */
    public final float f6966;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final int f6967;

    /* renamed from: o.ɨӏ$if  reason: invalid class name */
    public enum Cif {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public C1228(String str, String str2, float f, Cif ifVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.f6963 = str;
        this.f6960 = str2;
        this.f6959 = f;
        this.f6957 = ifVar;
        this.f6964 = i;
        this.f6958 = f2;
        this.f6966 = f3;
        this.f6965 = i2;
        this.f6967 = i3;
        this.f6961 = f4;
        this.f6962 = z;
    }

    public final int hashCode() {
        int hashCode = (((((int) (((float) (((this.f6963.hashCode() * 31) + this.f6960.hashCode()) * 31)) + this.f6959)) * 31) + this.f6957.ordinal()) * 31) + this.f6964;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f6958);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f6965;
    }
}
