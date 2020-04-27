package sg.gov.tech.bluetrace.protocol.v2;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C0995;
import o.C3057;
import o.C3122;
import o.C3588ma;
import o.bW;
import o.dA;
import o.fL;
import o.fM;
import o.gL;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\u0018\u0000 \u00012\u00020\u001d:\u0001\u0001B/\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f"}, d2 = {"Lsg/gov/tech/bluetrace/protocol/v2/V2WriteRequestPayload;", "Companion", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "mc", "getMc", "o", "getO", "", "rs", "I", "getRs", "()I", "v", "getV", "", "getPayload", "()[B", "p0", "p1", "p2", "Lo/ma;", "p3", "p4", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lo/ma;I)V", ""}, k = 1, mv = {1, 1, 16})
public final class V2WriteRequestPayload {
    public static final Companion Companion = new Companion((fL) null);
    /* access modifiers changed from: private */
    public static final C3122 gson;
    public String id;
    public String mc;

    /* renamed from: o  reason: collision with root package name */
    public String f17595o;
    public int rs;
    public int v;

    public /* synthetic */ V2WriteRequestPayload() {
    }

    public V2WriteRequestPayload(int i, String str, String str2, C3588ma maVar, int i2) {
        fM.m2254(str, "");
        fM.m2254(str2, "");
        fM.m2254(maVar, "");
        this.v = i;
        this.id = str;
        this.f17595o = str2;
        this.rs = i2;
        this.mc = maVar.m3806();
    }

    public final int getV() {
        return this.v;
    }

    public final String getId() {
        return this.id;
    }

    public final String getO() {
        return this.f17595o;
    }

    public final int getRs() {
        return this.rs;
    }

    public final String getMc() {
        return this.mc;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\rB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0002\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsg/gov/tech/bluetrace/protocol/v2/V2WriteRequestPayload$Companion;", "Lo/լј;", "gson", "Lo/լј;", "getGson", "()Lo/լј;", "", "p0", "Lsg/gov/tech/bluetrace/protocol/v2/V2WriteRequestPayload;", "fromPayload", "([B)Lsg/gov/tech/bluetrace/protocol/v2/V2WriteRequestPayload;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(fL fLVar) {
            this();
        }

        @JvmName(name = "getGson")
        public final C3122 getGson() {
            return V2WriteRequestPayload.gson;
        }

        public final V2WriteRequestPayload fromPayload(byte[] bArr) {
            fM.m2254(bArr, "");
            Object r4 = getGson().m15829(new String(bArr, gL.f2204), V2WriteRequestPayload.class);
            fM.m2252(r4, "");
            return (V2WriteRequestPayload) r4;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public static /* synthetic */ void m16299(C0995 r1, C3057 r2) {
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
