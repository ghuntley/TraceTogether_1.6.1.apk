package sg.gov.tech.bluetrace.protocol.v1;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C0995;
import o.C3057;
import o.C3122;
import o.C3568li;
import o.bW;
import o.dA;
import o.fL;
import o.fM;
import o.gL;
import o.lA;
import o.lZ;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\u0018\u0000 \u00012\u00020\u001b:\u0001\u0001B'\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lsg/gov/tech/bluetrace/protocol/v1/V1ReadRequestPayload;", "Companion", "", "modelP", "Ljava/lang/String;", "getModelP", "()Ljava/lang/String;", "msg", "getMsg", "org", "getOrg", "", "v", "I", "getV", "()I", "", "getEncryptedPayload", "()[B", "getPayload", "p0", "p1", "p2", "Lo/lZ;", "p3", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lo/lZ;)V", ""}, k = 1, mv = {1, 1, 16})
public final class V1ReadRequestPayload {
    public static final Companion Companion = new Companion((fL) null);
    /* access modifiers changed from: private */
    public static final C3122 gson;
    public String modelP;
    public String msg;
    public String org;
    public int v;

    public /* synthetic */ V1ReadRequestPayload() {
    }

    public V1ReadRequestPayload(int i, String str, String str2, lZ lZVar) {
        fM.m2254(str, "");
        fM.m2254(str2, "");
        fM.m2254(lZVar, "");
        this.v = i;
        this.msg = str;
        this.org = str2;
        this.modelP = lZVar.m3550();
    }

    public final int getV() {
        return this.v;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getOrg() {
        return this.org;
    }

    public final String getModelP() {
        return this.modelP;
    }

    public final byte[] getPayload() {
        String r0 = gson.m15836(this);
        fM.m2252((Object) r0, "");
        Charset charset = gL.f2204;
        if (r0 != null) {
            byte[] bytes = r0.getBytes(charset);
            fM.m2252((Object) bytes, "");
            return bytes;
        }
        throw new dA("null cannot be cast to non-null type java.lang.String");
    }

    public final byte[] getEncryptedPayload() {
        return C3568li.f2880.m3559(getPayload());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\rB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0002\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsg/gov/tech/bluetrace/protocol/v1/V1ReadRequestPayload$Companion;", "Lo/լј;", "gson", "Lo/լј;", "getGson", "()Lo/լј;", "", "p0", "Lsg/gov/tech/bluetrace/protocol/v1/V1ReadRequestPayload;", "fromEncryptedPayload", "([B)Lsg/gov/tech/bluetrace/protocol/v1/V1ReadRequestPayload;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(fL fLVar) {
            this();
        }

        @JvmName(name = "getGson")
        public final C3122 getGson() {
            return V1ReadRequestPayload.gson;
        }

        public final V1ReadRequestPayload fromEncryptedPayload(byte[] bArr) {
            fM.m2254(bArr, "");
            String str = new String(C3568li.f2880.m3560(bArr), gL.f2204);
            lA.C0215 r5 = lA.f2728;
            r5.m3369("ReadRequestPayload", "decrypted data: " + str);
            Object r52 = getGson().m15829(str, V1ReadRequestPayload.class);
            fM.m2252(r52, "");
            return (V1ReadRequestPayload) r52;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static /* synthetic */ void m16296(C0995 r1, C3057 r2) {
            r1.m7096();
            while (r1.m7092()) {
                r2.m15608(r1);
                r1.m7097();
            }
            r1.m7103();
        }
    }

    static {
        C3122 r0 = new bW().m1732().m1733();
        fM.m2252((Object) r0, "");
        gson = r0;
    }
}
