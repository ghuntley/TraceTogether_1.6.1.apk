package o;

public enum aL {
    LOW,
    NORMAL,
    HIGH,
    IMMEDIATE;

    /* renamed from: ι  reason: contains not printable characters */
    static <Y> int m1502(aO aOVar, Y y) {
        aL aLVar;
        if (y instanceof aO) {
            aLVar = ((aO) y).m1520();
        } else {
            aLVar = NORMAL;
        }
        return aLVar.ordinal() - aOVar.m1520().ordinal();
    }
}
