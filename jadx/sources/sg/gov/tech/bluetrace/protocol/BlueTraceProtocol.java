package sg.gov.tech.bluetrace.protocol;

import kotlin.Metadata;
import o.fM;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\b\u0016\u0018\u00002\u00020\u0015B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0002\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lsg/gov/tech/bluetrace/protocol/BlueTraceProtocol;", "Lsg/gov/tech/bluetrace/protocol/CentralInterface;", "central", "Lsg/gov/tech/bluetrace/protocol/CentralInterface;", "getCentral", "()Lsg/gov/tech/bluetrace/protocol/CentralInterface;", "Lsg/gov/tech/bluetrace/protocol/PeripheralInterface;", "peripheral", "Lsg/gov/tech/bluetrace/protocol/PeripheralInterface;", "getPeripheral", "()Lsg/gov/tech/bluetrace/protocol/PeripheralInterface;", "", "versionInt", "I", "getVersionInt", "()I", "p0", "p1", "p2", "<init>", "(ILsg/gov/tech/bluetrace/protocol/CentralInterface;Lsg/gov/tech/bluetrace/protocol/PeripheralInterface;)V", ""}, k = 1, mv = {1, 1, 16})
public class BlueTraceProtocol {
    private final CentralInterface central;
    private final PeripheralInterface peripheral;
    private final int versionInt;

    public BlueTraceProtocol(int i, CentralInterface centralInterface, PeripheralInterface peripheralInterface) {
        fM.m2254(centralInterface, "");
        fM.m2254(peripheralInterface, "");
        this.versionInt = i;
        this.central = centralInterface;
        this.peripheral = peripheralInterface;
    }

    public final int getVersionInt() {
        return this.versionInt;
    }

    public final CentralInterface getCentral() {
        return this.central;
    }

    public final PeripheralInterface getPeripheral() {
        return this.peripheral;
    }
}
