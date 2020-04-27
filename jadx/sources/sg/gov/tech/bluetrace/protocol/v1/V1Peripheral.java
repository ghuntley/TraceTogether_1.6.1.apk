package sg.gov.tech.bluetrace.protocol.v1;

import kotlin.Metadata;
import o.C3577lt;
import o.C3588ma;
import o.fM;
import o.lA;
import sg.gov.tech.bluetrace.BuildConfig;
import sg.gov.tech.bluetrace.protocol.PeripheralInterface;
import sg.gov.tech.bluetrace.streetpass.ConnectionRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0018\u00002\u00020\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsg/gov/tech/bluetrace/protocol/v1/V1Peripheral;", "", "TAG", "Ljava/lang/String;", "", "p0", "", "prepareReadRequestData", "(I)[B", "p1", "Lsg/gov/tech/bluetrace/streetpass/ConnectionRecord;", "processWriteRequestDataReceived", "([BLjava/lang/String;)Lsg/gov/tech/bluetrace/streetpass/ConnectionRecord;", "<init>", "()V", "Lsg/gov/tech/bluetrace/protocol/PeripheralInterface;"}, k = 1, mv = {1, 1, 16})
public final class V1Peripheral implements PeripheralInterface {
    private final String TAG = "V1Peripheral";

    public final byte[] prepareReadRequestData(int i) {
        return new V1ReadRequestPayload(i, C3577lt.f2990.m3687(), BuildConfig.ORG, C3577lt.f2990.m3688()).getEncryptedPayload();
    }

    public final ConnectionRecord processWriteRequestDataReceived(byte[] bArr, String str) {
        fM.m2254(bArr, "");
        fM.m2254(str, "");
        try {
            V1WriteRequestPayload fromEncryptedPayload = V1WriteRequestPayload.Companion.fromEncryptedPayload(bArr);
            return new ConnectionRecord(fromEncryptedPayload.getV(), fromEncryptedPayload.getMsg(), fromEncryptedPayload.getOrg(), C3577lt.f2990.m3688(), new C3588ma(fromEncryptedPayload.getModelC(), str), fromEncryptedPayload.getRssi(), fromEncryptedPayload.getTxPower());
        } catch (Throwable th) {
            lA.C0215 r11 = lA.f2728;
            String str2 = this.TAG;
            r11.m3375(str2, "Failed to deserialize write payload " + th.getMessage());
            return null;
        }
    }
}
