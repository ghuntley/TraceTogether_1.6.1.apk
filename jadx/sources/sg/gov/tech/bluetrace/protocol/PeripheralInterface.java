package sg.gov.tech.bluetrace.protocol;

import kotlin.Metadata;
import sg.gov.tech.bluetrace.streetpass.ConnectionRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u000bJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lsg/gov/tech/bluetrace/protocol/PeripheralInterface;", "", "p0", "", "prepareReadRequestData", "(I)[B", "", "p1", "Lsg/gov/tech/bluetrace/streetpass/ConnectionRecord;", "processWriteRequestDataReceived", "([BLjava/lang/String;)Lsg/gov/tech/bluetrace/streetpass/ConnectionRecord;", ""}, k = 1, mv = {1, 1, 16})
public interface PeripheralInterface {
    byte[] prepareReadRequestData(int i);

    ConnectionRecord processWriteRequestDataReceived(byte[] bArr, String str);
}
