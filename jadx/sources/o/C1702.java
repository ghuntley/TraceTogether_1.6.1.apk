package o;

import java.io.IOException;
import o.C1702;
import o.C1702.If;
import o.C1767;
import o.C2993;

/* renamed from: o.ʬΙ  reason: contains not printable characters */
public abstract class C1702<MessageType extends C1702<MessageType, BuilderType>, BuilderType extends If<MessageType, BuilderType>> implements C2993 {

    /* renamed from: Ι  reason: contains not printable characters */
    protected int f8879 = 0;

    /* renamed from: і  reason: contains not printable characters */
    public final C1767 m9670() {
        try {
            C1767.Cif r0 = C1767.m9852(I_());
            m15339(r0.f9086);
            if (r0.f9086.m12254() == 0) {
                return new C1767.C3643iF(r0.f9085);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Serializing ");
            sb.append(getClass().getName());
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: o.ʬΙ$If */
    public static abstract class If<MessageType extends C1702<MessageType, BuilderType>, BuilderType extends If<MessageType, BuilderType>> implements C2993.C2994 {
        /* renamed from: ı  reason: contains not printable characters */
        public abstract BuilderType clone();

        /* access modifiers changed from: protected */
        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract BuilderType m9672(MessageType messagetype);

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ C2993.C2994 m9673(C2993 r2) {
            if (m15523().getClass().isInstance(r2)) {
                return m9672((C1702) r2);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }
}
