package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.C0457;
import o.C0489;

/* renamed from: o.ıԑ  reason: contains not printable characters */
public abstract class C0457<MessageType extends C0457<MessageType, BuilderType>, BuilderType extends C0489<MessageType, BuilderType>> implements C1637 {
    protected int zza = 0;

    /* renamed from: ɉ  reason: contains not printable characters */
    public final C0510 m4782() {
        try {
            C0551 r0 = C0510.m4960(m9436());
            m9439(r0.m5137());
            return r0.m5138();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: ıɩ  reason: contains not printable characters */
    public final byte[] m4781() {
        try {
            byte[] bArr = new byte[m9436()];
            C0692 r1 = C0692.m5637(bArr);
            m9439(r1);
            r1.m5688();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ς  reason: contains not printable characters */
    public int m4784() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public void m4783(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    protected static <T> void m4780(Iterable<T> iterable, List<? super T> list) {
        C0936.m6809(iterable);
        if (iterable instanceof C1183) {
            List<?> r6 = ((C1183) iterable).m7715();
            C1183 r0 = (C1183) list;
            int size = list.size();
            for (Object next : r6) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(r0.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = r0.size() - 1; size2 >= size; size2--) {
                        r0.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof C0510) {
                    r0.m7717((C0510) next);
                } else {
                    r0.add((String) next);
                }
            }
        } else if (iterable instanceof C2061) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }
}
