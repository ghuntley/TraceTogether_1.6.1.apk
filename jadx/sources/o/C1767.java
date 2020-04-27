package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.C0712;

/* renamed from: o.Β  reason: contains not printable characters */
public abstract class C1767 implements Iterable<Byte>, Serializable {

    /* renamed from: ı  reason: contains not printable characters */
    private static final If f9078;

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C1767 f9079 = new C3643iF(C2702.f12517);

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f9080 = 0;

    /* renamed from: o.Β$If */
    interface If {
        /* renamed from: ɩ  reason: contains not printable characters */
        byte[] m9868(byte[] bArr, int i, int i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract String m9857(Charset charset);

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m9858(byte[] bArr, int i);

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract C1767 m9860(int i);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract int m9861();

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m9862(C1703 r1);

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract int m9863(int i, int i2);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract byte m9864(int i);

    static {
        boolean z;
        try {
            Class.forName("android.content.Context");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f9078 = z ? new aux((byte) 0) : new C1768((byte) 0);
    }

    /* renamed from: o.Β$aux */
    static final class aux implements If {
        private aux() {
        }

        /* synthetic */ aux(byte b) {
            this();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final byte[] m9869(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    /* renamed from: o.Β$ı  reason: contains not printable characters */
    static final class C1768 implements If {
        private C1768() {
        }

        /* synthetic */ C1768(byte b) {
            this();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final byte[] m9878(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    C1767() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C1767 m9856(byte[] bArr, int i, int i2) {
        return new C3643iF(f9078.m9868(bArr, i, i2));
    }

    /* renamed from: ı  reason: contains not printable characters */
    static C1767 m9853(byte[] bArr) {
        return new C3643iF(bArr);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C1767 m9854(String str) {
        return new C3643iF(str.getBytes(C2702.f12516));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final byte[] m9866() {
        int r0 = m9861();
        if (r0 == 0) {
            return C2702.f12517;
        }
        byte[] bArr = new byte[r0];
        m9858(bArr, r0);
        return bArr;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m9865(Charset charset) {
        return m9861() == 0 ? "" : m9857(charset);
    }

    /* renamed from: o.Β$ɩ  reason: contains not printable characters */
    static abstract class C1770 extends C1767 {
        C1770() {
        }

        public /* synthetic */ Iterator iterator() {
            return new C0712.C0713() {

                /* renamed from: ǃ  reason: contains not printable characters */
                private int f9082 = 0;

                /* renamed from: Ι  reason: contains not printable characters */
                private final int f9083 = C1767.this.m9861();

                public final boolean hasNext() {
                    return this.f9082 < this.f9083;
                }

                /* renamed from: Ι  reason: contains not printable characters */
                private byte m9867() {
                    try {
                        C1767 r0 = C1767.this;
                        int i = this.f9082;
                        this.f9082 = i + 1;
                        return r0.m9864(i);
                    } catch (IndexOutOfBoundsException e) {
                        throw new NoSuchElementException(e.getMessage());
                    }
                }

                public final void remove() {
                    throw new UnsupportedOperationException();
                }

                public final /* synthetic */ Object next() {
                    return Byte.valueOf(m9867());
                }
            };
        }
    }

    public final int hashCode() {
        int i = this.f9080;
        if (i == 0) {
            int r0 = m9861();
            i = m9863(r0, r0);
            if (i == 0) {
                i = 1;
            }
            this.f9080 = i;
        }
        return i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static Cif m9852(int i) {
        return new Cif(i, (byte) 0);
    }

    /* renamed from: o.Β$if  reason: invalid class name */
    static final class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        final byte[] f9085;

        /* renamed from: ι  reason: contains not printable characters */
        final C2346 f9086;

        /* synthetic */ Cif(int i, byte b) {
            this(i);
        }

        private Cif(int i) {
            this.f9085 = new byte[i];
            this.f9086 = C2346.m12247(this.f9085);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m9859() {
        return this.f9080;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static int m9855(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(m9861())});
    }

    /* renamed from: o.Β$iF  reason: case insensitive filesystem */
    static class C3643iF extends C1770 {

        /* renamed from: ι  reason: contains not printable characters */
        protected final byte[] f9084;

        /* access modifiers changed from: protected */
        /* renamed from: Ι  reason: contains not printable characters */
        public int m9875() {
            return 0;
        }

        C3643iF(byte[] bArr) {
            this.f9084 = bArr;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public byte m9877(int i) {
            return this.f9084[i];
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public int m9873() {
            return this.f9084.length;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C1767 m9872(int i) {
            int r4 = m9855(0, i, m9861());
            if (r4 == 0) {
                return C1767.f9079;
            }
            return new C1769(this.f9084, m9875(), r4);
        }

        /* access modifiers changed from: protected */
        /* renamed from: ı  reason: contains not printable characters */
        public void m9871(byte[] bArr, int i) {
            System.arraycopy(this.f9084, 0, bArr, 0, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m9874(C1703 r4) {
            r4.m9674(this.f9084, m9875(), m9861());
        }

        /* access modifiers changed from: protected */
        /* renamed from: ı  reason: contains not printable characters */
        public final String m9870(Charset charset) {
            return new String(this.f9084, m9875(), m9861(), charset);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1767) || m9861() != ((C1767) obj).m9861()) {
                return false;
            }
            if (m9861() == 0) {
                return true;
            }
            if (!(obj instanceof C3643iF)) {
                return obj.equals(this);
            }
            C3643iF iFVar = (C3643iF) obj;
            int r1 = m9859();
            int r3 = iFVar.m9859();
            if (r1 != 0 && r3 != 0 && r1 != r3) {
                return false;
            }
            int r12 = m9861();
            if (r12 > iFVar.m9861()) {
                StringBuilder sb = new StringBuilder("Length too large: ");
                sb.append(r12);
                sb.append(m9861());
                throw new IllegalArgumentException(sb.toString());
            } else if (r12 > iFVar.m9861()) {
                StringBuilder sb2 = new StringBuilder("Ran off end of other: 0, ");
                sb2.append(r12);
                sb2.append(", ");
                sb2.append(iFVar.m9861());
                throw new IllegalArgumentException(sb2.toString());
            } else if (!(iFVar instanceof C3643iF)) {
                return iFVar.m9860(r12).equals(m9860(r12));
            } else {
                C3643iF iFVar2 = iFVar;
                byte[] bArr = this.f9084;
                byte[] bArr2 = iFVar2.f9084;
                int r5 = m9875() + r12;
                int r13 = m9875();
                int r9 = iFVar2.m9875();
                while (r13 < r5) {
                    if (bArr[r13] != bArr2[r9]) {
                        return false;
                    }
                    r13++;
                    r9++;
                }
                return true;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: Ι  reason: contains not printable characters */
        public final int m9876(int i, int i2) {
            return C2702.m14398(i, this.f9084, m9875(), i2);
        }
    }

    /* renamed from: o.Β$ǃ  reason: contains not printable characters */
    static final class C1769 extends C3643iF {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final int f9087;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final int f9088;

        C1769(byte[] bArr, int i, int i2) {
            super(bArr);
            m9855(i, i + i2, bArr.length);
            this.f9088 = i;
            this.f9087 = i2;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m9880() {
            return this.f9087;
        }

        /* access modifiers changed from: protected */
        /* renamed from: Ι  reason: contains not printable characters */
        public final int m9881() {
            return this.f9088;
        }

        /* access modifiers changed from: protected */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m9879(byte[] bArr, int i) {
            System.arraycopy(this.f9084, this.f9088, bArr, 0, i);
        }

        /* access modifiers changed from: package-private */
        public final Object writeReplace() {
            return new C3643iF(m9866());
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final byte m9882(int i) {
            int i2 = this.f9087;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.f9084[this.f9088 + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: ".concat(String.valueOf(i)));
            }
            StringBuilder sb = new StringBuilder("Index > length: ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    public /* synthetic */ Iterator iterator() {
        return new C0712.C0713() {

            /* renamed from: ǃ  reason: contains not printable characters */
            private int f9082 = 0;

            /* renamed from: Ι  reason: contains not printable characters */
            private final int f9083 = C1767.this.m9861();

            public final boolean hasNext() {
                return this.f9082 < this.f9083;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            private byte m9867() {
                try {
                    C1767 r0 = C1767.this;
                    int i = this.f9082;
                    this.f9082 = i + 1;
                    return r0.m9864(i);
                } catch (IndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }

            public final void remove() {
                throw new UnsupportedOperationException();
            }

            public final /* synthetic */ Object next() {
                return Byte.valueOf(m9867());
            }
        };
    }
}
