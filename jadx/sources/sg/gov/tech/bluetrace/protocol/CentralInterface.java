package sg.gov.tech.bluetrace.protocol;

import kotlin.Metadata;
import sg.gov.tech.bluetrace.streetpass.ConnectionRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\rJ)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lsg/gov/tech/bluetrace/protocol/CentralInterface;", "", "p0", "p1", "p2", "", "prepareWriteRequestData", "(IILjava/lang/Integer;)[B", "", "p3", "Lsg/gov/tech/bluetrace/streetpass/ConnectionRecord;", "processReadRequestDataReceived", "([BLjava/lang/String;ILjava/lang/Integer;)Lsg/gov/tech/bluetrace/streetpass/ConnectionRecord;", ""}, k = 1, mv = {1, 1, 16})
public interface CentralInterface {
    byte[] prepareWriteRequestData(int i, int i2, Integer num);

    ConnectionRecord processReadRequestDataReceived(byte[] bArr, String str, int i, Integer num);
}
