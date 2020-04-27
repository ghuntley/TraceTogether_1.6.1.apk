package o;

import android.util.SparseArray;

/* renamed from: o.Ιɟ  reason: contains not printable characters */
public enum C1817 {
    DEFAULT,
    UNMETERED_ONLY,
    UNMETERED_OR_DAILY,
    FAST_IF_RADIO_AWAKE,
    NEVER,
    UNRECOGNIZED;
    

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final SparseArray<C1817> f9273 = null;

    static {
        DEFAULT = new C1817("DEFAULT", 0);
        UNMETERED_ONLY = new C1817("UNMETERED_ONLY", 1);
        UNMETERED_OR_DAILY = new C1817("UNMETERED_OR_DAILY", 2);
        FAST_IF_RADIO_AWAKE = new C1817("FAST_IF_RADIO_AWAKE", 3);
        NEVER = new C1817("NEVER", 4);
        UNRECOGNIZED = new C1817("UNRECOGNIZED", 5);
        C1817[] r0 = {DEFAULT, UNMETERED_ONLY, UNMETERED_OR_DAILY, FAST_IF_RADIO_AWAKE, NEVER, UNRECOGNIZED};
        SparseArray<C1817> sparseArray = new SparseArray<>();
        f9273 = sparseArray;
        sparseArray.put(0, DEFAULT);
        f9273.put(1, UNMETERED_ONLY);
        f9273.put(2, UNMETERED_OR_DAILY);
        f9273.put(3, FAST_IF_RADIO_AWAKE);
        f9273.put(4, NEVER);
        f9273.put(-1, UNRECOGNIZED);
    }
}
