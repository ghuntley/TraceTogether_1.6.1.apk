package o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\u001a!\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0007\u0010\n\"\u001e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "Ι", "[Ljava/lang/Object;", "ι", "", "p0", "ı", "(Ljava/util/Collection;)[Ljava/lang/Object;", "p1", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;"}, k = 2, mv = {1, 1, 15})
public final class fJ {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Object[] f2159 = new Object[0];

    /* renamed from: ı  reason: contains not printable characters */
    public static final Object[] m2248(Collection<?> collection) {
        fM.m2254(collection, "");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 < 2147483645) {
                                i3 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        fM.m2252((Object) objArr, "");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        fM.m2252((Object) copyOf, "");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return f2159;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final Object[] m2249(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        fM.m2254(collection, "");
        if (objArr != null) {
            int size = collection.size();
            int i = 0;
            if (size != 0) {
                Iterator<?> it = collection.iterator();
                if (it.hasNext()) {
                    if (size <= objArr.length) {
                        objArr2 = objArr;
                    } else {
                        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                        if (newInstance != null) {
                            objArr2 = (Object[]) newInstance;
                        } else {
                            throw new dA("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        }
                    }
                    while (true) {
                        int i2 = i + 1;
                        objArr2[i] = it.next();
                        if (i2 >= objArr2.length) {
                            if (!it.hasNext()) {
                                return objArr2;
                            }
                            int i3 = ((i2 * 3) + 1) >>> 1;
                            if (i3 <= i2) {
                                if (i2 < 2147483645) {
                                    i3 = 2147483645;
                                } else {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i3);
                            fM.m2252((Object) objArr2, "");
                        } else if (!it.hasNext()) {
                            if (objArr2 == objArr) {
                                objArr[i2] = null;
                                return objArr;
                            }
                            Object[] copyOf = Arrays.copyOf(objArr2, i2);
                            fM.m2252((Object) copyOf, "");
                            return copyOf;
                        }
                        i = i2;
                    }
                } else if (objArr.length <= 0) {
                    return objArr;
                } else {
                    objArr[0] = null;
                    return objArr;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else {
            throw new NullPointerException();
        }
    }
}
