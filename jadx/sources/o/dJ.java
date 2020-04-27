package o;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import o.C1260;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\r\u001a\u00020\f*\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\n\u001a\u00020\f*\u00020\f2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\n\u0010\u000f\u001a;\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0010j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0011¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"", "", "T", "ı", "([Ljava/lang/Object;)Ljava/util/List;", "p0", "", "p1", "p2", "p3", "ǃ", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "", "ι", "([BII)[B", "([B[B)[B", "Ljava/util/Comparator;", "Lo/ɩ;", "", "Ι", "([Ljava/lang/Object;Ljava/util/Comparator;)V"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/dM")
public class dJ extends dI {
    /* renamed from: ı  reason: contains not printable characters */
    public static final <T> List<T> m2059(T[] tArr) {
        fM.m2254(tArr, "");
        List<T> r1 = C1260.C1261.m8098(tArr);
        fM.m2252((Object) r1, "");
        return r1;
    }

    /* renamed from: ǃ$default  reason: contains not printable characters */
    public static /* synthetic */ Object[] m2062$default(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return dM.m2061(objArr, objArr2, i, i2, i3);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final <T> T[] m2061(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        fM.m2254(tArr, "");
        fM.m2254(tArr2, "");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final byte[] m2064(byte[] bArr, int i, int i2) {
        fM.m2254(bArr, "");
        dM.m2072(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        fM.m2252((Object) copyOfRange, "");
        return copyOfRange;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final byte[] m2060(byte[] bArr, byte[] bArr2) {
        fM.m2254(bArr, "");
        fM.m2254(bArr2, "");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        fM.m2252((Object) copyOf, "");
        return copyOf;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final <T> void m2063(T[] tArr, Comparator<? super T> comparator) {
        fM.m2254(tArr, "");
        fM.m2254(comparator, "");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
