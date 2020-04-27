package o;

import java.io.IOException;
import o.C0457;
import o.C0489;

/* renamed from: o.ĿӀ  reason: contains not printable characters */
public abstract class C0489<MessageType extends C0457<MessageType, BuilderType>, BuilderType extends C0489<MessageType, BuilderType>> implements C1761 {
    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract BuilderType m4851(MessageType messagetype);

    /* renamed from: ʟ  reason: contains not printable characters */
    public abstract BuilderType clone();

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract BuilderType m4854(C0598 r1, C0705 r2);

    /* renamed from: ι  reason: contains not printable characters */
    public BuilderType m4856(byte[] bArr, int i, int i2) {
        try {
            C0598 r1 = C0598.m5272(bArr, 0, i2, false);
            m4854(r1, C0705.m5817());
            r1.m5290(0);
            return this;
        } catch (C1124 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m4850("byte array"), e2);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public BuilderType m4855(byte[] bArr, int i, int i2, C0705 r4) {
        try {
            C0598 r1 = C0598.m5272(bArr, 0, i2, false);
            m4854(r1, r4);
            r1.m5290(0);
            return this;
        } catch (C1124 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m4850("byte array"), e2);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final String m4850(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 60 + String.valueOf(str).length());
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* synthetic */ C1761 m4857(C1637 r2) {
        if (m10162().getClass().isInstance(r2)) {
            return m4851((C0457) r2);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* synthetic */ C1761 m4858(byte[] bArr, C0705 r4) {
        return m4855(bArr, 0, bArr.length, r4);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* synthetic */ C1761 m4852(byte[] bArr) {
        return m4856(bArr, 0, bArr.length);
    }
}
