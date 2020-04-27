package sg.gov.tech.bluetrace.protocol;

import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import o.C3377ee;
import o.dB;
import o.fM;
import sg.gov.tech.bluetrace.BuildConfig;
import sg.gov.tech.bluetrace.protocol.v1.BlueTraceV1;
import sg.gov.tech.bluetrace.protocol.v2.BlueTraceV2;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\bÆ\u0002\u0018\u00002\u00020\u0014B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011R%\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007"}, d2 = {"Lsg/gov/tech/bluetrace/protocol/BlueTrace;", "", "Ljava/util/UUID;", "", "characteristicToProtocolVersionMap", "Ljava/util/Map;", "getCharacteristicToProtocolVersionMap", "()Ljava/util/Map;", "Lsg/gov/tech/bluetrace/protocol/BlueTraceProtocol;", "implementations", "getImplementations", "p0", "getImplementation", "(Ljava/util/UUID;)Lsg/gov/tech/bluetrace/protocol/BlueTraceProtocol;", "(I)Lsg/gov/tech/bluetrace/protocol/BlueTraceProtocol;", "", "supportsCharUUID", "(Ljava/util/UUID;)Z", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
public final class BlueTrace {
    public static final BlueTrace INSTANCE = new BlueTrace();
    private static final Map<UUID, Integer> characteristicToProtocolVersionMap = C3377ee.m2202(dB.m2052(UUID.fromString("B82AB3FC-1595-4F6A-80F0-FE094CC218F9"), 1), dB.m2052(UUID.fromString(BuildConfig.V2_CHARACTERISTIC_ID), 2));
    private static final Map<Integer, BlueTraceProtocol> implementations = C3377ee.m2202(dB.m2052(1, new BlueTraceV1()), dB.m2052(2, new BlueTraceV2()));

    private BlueTrace() {
    }

    public final Map<UUID, Integer> getCharacteristicToProtocolVersionMap() {
        return characteristicToProtocolVersionMap;
    }

    public final Map<Integer, BlueTraceProtocol> getImplementations() {
        return implementations;
    }

    public final boolean supportsCharUUID(UUID uuid) {
        Integer num;
        if (uuid == null || (num = characteristicToProtocolVersionMap.get(uuid)) == null) {
            return false;
        }
        if (implementations.get(Integer.valueOf(num.intValue())) != null) {
            return true;
        }
        return false;
    }

    public final BlueTraceProtocol getImplementation(UUID uuid) {
        fM.m2254(uuid, "");
        Integer num = characteristicToProtocolVersionMap.get(uuid);
        return getImplementation(num != null ? num.intValue() : 1);
    }

    public final BlueTraceProtocol getImplementation(int i) {
        BlueTraceProtocol blueTraceProtocol = implementations.get(Integer.valueOf(i));
        return blueTraceProtocol != null ? blueTraceProtocol : new BlueTraceV1();
    }
}
