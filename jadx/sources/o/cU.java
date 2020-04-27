package o;

public final class cU<T> {

    /* renamed from: ı  reason: contains not printable characters */
    public int f1933;

    /* renamed from: ǃ  reason: contains not printable characters */
    public T[] f1934;

    /* renamed from: Ι  reason: contains not printable characters */
    public int f1935;

    /* renamed from: ι  reason: contains not printable characters */
    public int f1936;

    public cU() {
        this((byte) 0);
    }

    private cU(byte b) {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.f1936 = numberOfLeadingZeros - 1;
        this.f1933 = (int) (((float) numberOfLeadingZeros) * 0.75f);
        this.f1934 = (Object[]) new Object[numberOfLeadingZeros];
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m1933(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f1935--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int hashCode = t.hashCode() * -1640531527;
                int i5 = (hashCode ^ (hashCode >>> 16)) & i2;
                if (i <= i3) {
                    if (i >= i5 || i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }
}
