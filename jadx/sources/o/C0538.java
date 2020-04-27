package o;

import java.util.NoSuchElementException;

/* renamed from: o.łɟ  reason: contains not printable characters */
final class C0538 extends C0543 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C0510 f4371;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f4372 = this.f4371.m4967();

    /* renamed from: ι  reason: contains not printable characters */
    private int f4373 = 0;

    C0538(C0510 r1) {
        this.f4371 = r1;
    }

    public final boolean hasNext() {
        return this.f4373 < this.f4372;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final byte m5105() {
        int i = this.f4373;
        if (i < this.f4372) {
            this.f4373 = i + 1;
            return this.f4371.m4961(i);
        }
        throw new NoSuchElementException();
    }
}
