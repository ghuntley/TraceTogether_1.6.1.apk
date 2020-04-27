package sg.gov.tech.bluetrace.streetpass;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C3588ma;
import o.fM;
import o.lZ;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\b\u0018\u00002\u00020>BA\u0012\u0006\u0010(\u001a\u00020\u0012\u0012\u0006\u0010)\u001a\u00020\u0006\u0012\u0006\u0010*\u001a\u00020\u0006\u0012\u0006\u0010+\u001a\u00020\r\u0012\u0006\u0010,\u001a\u00020\u0001\u0012\u0006\u0010-\u001a\u00020\u0012\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b<\u0010=J\u0010\u0010!\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\nJ\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\nJ\u0010\u0010$\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b$\u0010\u0011J\u0010\u0010%\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b%\u0010\u0005J\u0010\u0010&\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b&\u0010\u0016J\u0012\u0010'\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJX\u0010/\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020\r2\b\b\u0002\u0010,\u001a\u00020\u00012\b\b\u0002\u0010-\u001a\u00020\u00122\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b1\u0010\u0016J\u001a\u00104\u001a\u0002032\b\u0010(\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b6\u0010\u0016J\u000f\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u0010\nJ \u0010:\u001a\u0002092\u0006\u0010(\u001a\u0002082\u0006\u0010)\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b:\u0010;R\u0019\u0010\u0002\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u0019\u0010\u000e\u001a\u00020\r8\u0007@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0019\u0010\u001f\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016"}, d2 = {"Lsg/gov/tech/bluetrace/streetpass/ConnectionRecord;", "Lo/ma;", "central", "Lo/ma;", "getCentral", "()Lo/ma;", "", "msg", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "org", "getOrg", "Lo/lZ;", "peripheral", "Lo/lZ;", "getPeripheral", "()Lo/lZ;", "", "rssi", "I", "getRssi", "()I", "setRssi", "(I)V", "txPower", "Ljava/lang/Integer;", "getTxPower", "()Ljava/lang/Integer;", "setTxPower", "(Ljava/lang/Integer;)V", "version", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "copy", "(ILjava/lang/String;Ljava/lang/String;Lo/lZ;Lo/ma;ILjava/lang/Integer;)Lsg/gov/tech/bluetrace/streetpass/ConnectionRecord;", "describeContents", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lo/lZ;Lo/ma;ILjava/lang/Integer;)V", "Landroid/os/Parcelable;"}, k = 1, mv = {1, 1, 16})
public final class ConnectionRecord implements Parcelable {
    public static final Parcelable.Creator CREATOR = new If();
    private final C3588ma central;
    private final String msg;
    private final String org;
    private final lZ peripheral;
    private int rssi;
    private Integer txPower;
    private final int version;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    public static class If implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            fM.m2254(parcel, "");
            return new ConnectionRecord(parcel.readInt(), parcel.readString(), parcel.readString(), (lZ) lZ.CREATOR.createFromParcel(parcel), (C3588ma) C3588ma.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        public final Object[] newArray(int i) {
            return new ConnectionRecord[i];
        }
    }

    public static /* synthetic */ ConnectionRecord copy$default(ConnectionRecord connectionRecord, int i, String str, String str2, lZ lZVar, C3588ma maVar, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = connectionRecord.version;
        }
        if ((i3 & 2) != 0) {
            str = connectionRecord.msg;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            str2 = connectionRecord.org;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            lZVar = connectionRecord.peripheral;
        }
        lZ lZVar2 = lZVar;
        if ((i3 & 16) != 0) {
            maVar = connectionRecord.central;
        }
        C3588ma maVar2 = maVar;
        if ((i3 & 32) != 0) {
            i2 = connectionRecord.rssi;
        }
        int i4 = i2;
        if ((i3 & 64) != 0) {
            num = connectionRecord.txPower;
        }
        return connectionRecord.copy(i, str3, str4, lZVar2, maVar2, i4, num);
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.msg;
    }

    public final String component3() {
        return this.org;
    }

    public final lZ component4() {
        return this.peripheral;
    }

    public final C3588ma component5() {
        return this.central;
    }

    public final int component6() {
        return this.rssi;
    }

    public final Integer component7() {
        return this.txPower;
    }

    public final ConnectionRecord copy(int i, String str, String str2, lZ lZVar, C3588ma maVar, int i2, Integer num) {
        fM.m2254(str, "");
        fM.m2254(str2, "");
        fM.m2254(lZVar, "");
        fM.m2254(maVar, "");
        return new ConnectionRecord(i, str, str2, lZVar, maVar, i2, num);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectionRecord)) {
            return false;
        }
        ConnectionRecord connectionRecord = (ConnectionRecord) obj;
        return this.version == connectionRecord.version && fM.m2257(this.msg, connectionRecord.msg) && fM.m2257(this.org, connectionRecord.org) && fM.m2257(this.peripheral, connectionRecord.peripheral) && fM.m2257(this.central, connectionRecord.central) && this.rssi == connectionRecord.rssi && fM.m2257(this.txPower, connectionRecord.txPower);
    }

    public final int hashCode() {
        int i = this.version * 31;
        String str = this.msg;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.org;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        lZ lZVar = this.peripheral;
        int hashCode3 = (hashCode2 + (lZVar != null ? lZVar.hashCode() : 0)) * 31;
        C3588ma maVar = this.central;
        int hashCode4 = (((hashCode3 + (maVar != null ? maVar.hashCode() : 0)) * 31) + this.rssi) * 31;
        Integer num = this.txPower;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode4 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        fM.m2254(parcel, "");
        parcel.writeInt(this.version);
        parcel.writeString(this.msg);
        parcel.writeString(this.org);
        this.peripheral.writeToParcel(parcel, 0);
        this.central.writeToParcel(parcel, 0);
        parcel.writeInt(this.rssi);
        Integer num = this.txPower;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
            return;
        }
        parcel.writeInt(0);
    }

    public ConnectionRecord(int i, String str, String str2, lZ lZVar, C3588ma maVar, int i2, Integer num) {
        fM.m2254(str, "");
        fM.m2254(str2, "");
        fM.m2254(lZVar, "");
        fM.m2254(maVar, "");
        this.version = i;
        this.msg = str;
        this.org = str2;
        this.peripheral = lZVar;
        this.central = maVar;
        this.rssi = i2;
        this.txPower = num;
    }

    public final int getVersion() {
        return this.version;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getOrg() {
        return this.org;
    }

    @JvmName(name = "getPeripheral")
    public final lZ getPeripheral() {
        return this.peripheral;
    }

    @JvmName(name = "getCentral")
    public final C3588ma getCentral() {
        return this.central;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public final void setRssi(int i) {
        this.rssi = i;
    }

    public final Integer getTxPower() {
        return this.txPower;
    }

    public final void setTxPower(Integer num) {
        this.txPower = num;
    }

    public final String toString() {
        return "Central " + this.central.m3806() + " - " + this.central.m3805() + " ---> Peripheral " + this.peripheral.m3550() + " - " + this.peripheral.m3549();
    }
}
