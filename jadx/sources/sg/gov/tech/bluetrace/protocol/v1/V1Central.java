package sg.gov.tech.bluetrace.protocol.v1;

import kotlin.Metadata;
import o.C3577lt;
import o.fM;
import o.lA;
import o.lZ;
import sg.gov.tech.bluetrace.BuildConfig;
import sg.gov.tech.bluetrace.protocol.CentralInterface;
import sg.gov.tech.bluetrace.streetpass.ConnectionRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0018\u00002\u00020\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ3\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsg/gov/tech/bluetrace/protocol/v1/V1Central;", "", "TAG", "Ljava/lang/String;", "", "p0", "p1", "p2", "", "prepareWriteRequestData", "(IILjava/lang/Integer;)[B", "p3", "Lsg/gov/tech/bluetrace/streetpass/ConnectionRecord;", "processReadRequestDataReceived", "([BLjava/lang/String;ILjava/lang/Integer;)Lsg/gov/tech/bluetrace/streetpass/ConnectionRecord;", "<init>", "()V", "Lsg/gov/tech/bluetrace/protocol/CentralInterface;"}, k = 1, mv = {1, 1, 16})
public final class V1Central implements CentralInterface {
    private final String TAG = "V1Central";

    public final byte[] prepareWriteRequestData(int i, int i2, Integer num) {
        return new V1WriteRequestPayload(i, C3577lt.f2990.m3687(), BuildConfig.ORG, C3577lt.f2990.m3685(), i2, num).getEncryptedPayload();
    }

    public final ConnectionRecord processReadRequestDataReceived(byte[] bArr, String str, int i, Integer num) {
        fM.m2254(bArr, "");
        fM.m2254(str, "");
        try {
            V1ReadRequestPayload fromEncryptedPayload = V1ReadRequestPayload.Companion.fromEncryptedPayload(bArr);
            return new ConnectionRecord(fromEncryptedPayload.getV(), fromEncryptedPayload.getMsg(), fromEncryptedPayload.getOrg(), new lZ(fromEncryptedPayload.getModelP(), str), C3577lt.f2990.m3685(), i, num);
        } catch (Throwable th) {
            lA.C0215 r10 = lA.f2728;
            String str2 = this.TAG;
            r10.m3375(str2, "Failed to deserialize read payload " + th.getMessage());
            return null;
        }
    }
}
