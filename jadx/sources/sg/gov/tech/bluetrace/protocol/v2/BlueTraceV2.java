package sg.gov.tech.bluetrace.protocol.v2;

import kotlin.Metadata;
import sg.gov.tech.bluetrace.protocol.BlueTraceProtocol;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0003B\u0007¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsg/gov/tech/bluetrace/protocol/v2/BlueTraceV2;", "<init>", "()V", "Lsg/gov/tech/bluetrace/protocol/BlueTraceProtocol;"}, k = 1, mv = {1, 1, 16})
public final class BlueTraceV2 extends BlueTraceProtocol {
    public BlueTraceV2() {
        super(2, new V2Central(), new V2Peripheral());
    }
}
