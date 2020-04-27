package o;

import android.util.SparseArray;

/* renamed from: o.η  reason: contains not printable characters */
public abstract class C1943 {

    /* renamed from: o.η$If */
    public static abstract class If {
        /* renamed from: ı  reason: contains not printable characters */
        public abstract If m10571(C1944 r1);

        /* renamed from: ı  reason: contains not printable characters */
        public abstract If m10572(C1945 r1);

        /* renamed from: ι  reason: contains not printable characters */
        public abstract C1943 m10573();
    }

    /* renamed from: o.η$ı  reason: contains not printable characters */
    public enum C1944 {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: ι  reason: contains not printable characters */
        public static final SparseArray<C1944> f9799 = null;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final int f9805;

        static {
            UNKNOWN_MOBILE_SUBTYPE = new C1944("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
            GPRS = new C1944("GPRS", 1, 1);
            EDGE = new C1944("EDGE", 2, 2);
            UMTS = new C1944("UMTS", 3, 3);
            CDMA = new C1944("CDMA", 4, 4);
            EVDO_0 = new C1944("EVDO_0", 5, 5);
            EVDO_A = new C1944("EVDO_A", 6, 6);
            RTT = new C1944("RTT", 7, 7);
            HSDPA = new C1944("HSDPA", 8, 8);
            HSUPA = new C1944("HSUPA", 9, 9);
            HSPA = new C1944("HSPA", 10, 10);
            IDEN = new C1944("IDEN", 11, 11);
            EVDO_B = new C1944("EVDO_B", 12, 12);
            LTE = new C1944("LTE", 13, 13);
            EHRPD = new C1944("EHRPD", 14, 14);
            HSPAP = new C1944("HSPAP", 15, 15);
            GSM = new C1944("GSM", 16, 16);
            TD_SCDMA = new C1944("TD_SCDMA", 17, 17);
            IWLAN = new C1944("IWLAN", 18, 18);
            LTE_CA = new C1944("LTE_CA", 19, 19);
            COMBINED = new C1944("COMBINED", 20, 100);
            C1944[] r0 = {UNKNOWN_MOBILE_SUBTYPE, GPRS, EDGE, UMTS, CDMA, EVDO_0, EVDO_A, RTT, HSDPA, HSUPA, HSPA, IDEN, EVDO_B, LTE, EHRPD, HSPAP, GSM, TD_SCDMA, IWLAN, LTE_CA, COMBINED};
            SparseArray<C1944> sparseArray = new SparseArray<>();
            f9799 = sparseArray;
            sparseArray.put(0, UNKNOWN_MOBILE_SUBTYPE);
            f9799.put(1, GPRS);
            f9799.put(2, EDGE);
            f9799.put(3, UMTS);
            f9799.put(4, CDMA);
            f9799.put(5, EVDO_0);
            f9799.put(6, EVDO_A);
            f9799.put(7, RTT);
            f9799.put(8, HSDPA);
            f9799.put(9, HSUPA);
            f9799.put(10, HSPA);
            f9799.put(11, IDEN);
            f9799.put(12, EVDO_B);
            f9799.put(13, LTE);
            f9799.put(14, EHRPD);
            f9799.put(15, HSPAP);
            f9799.put(16, GSM);
            f9799.put(17, TD_SCDMA);
            f9799.put(18, IWLAN);
            f9799.put(19, LTE_CA);
        }

        private C1944(int i) {
            this.f9805 = i;
        }
    }

    /* renamed from: o.η$ǃ  reason: contains not printable characters */
    public enum C1945 {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: Ι  reason: contains not printable characters */
        public static final SparseArray<C1945> f9819 = null;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int f9826;

        static {
            MOBILE = new C1945("MOBILE", 0, 0);
            WIFI = new C1945("WIFI", 1, 1);
            MOBILE_MMS = new C1945("MOBILE_MMS", 2, 2);
            MOBILE_SUPL = new C1945("MOBILE_SUPL", 3, 3);
            MOBILE_DUN = new C1945("MOBILE_DUN", 4, 4);
            MOBILE_HIPRI = new C1945("MOBILE_HIPRI", 5, 5);
            WIMAX = new C1945("WIMAX", 6, 6);
            BLUETOOTH = new C1945("BLUETOOTH", 7, 7);
            DUMMY = new C1945("DUMMY", 8, 8);
            ETHERNET = new C1945("ETHERNET", 9, 9);
            MOBILE_FOTA = new C1945("MOBILE_FOTA", 10, 10);
            MOBILE_IMS = new C1945("MOBILE_IMS", 11, 11);
            MOBILE_CBS = new C1945("MOBILE_CBS", 12, 12);
            WIFI_P2P = new C1945("WIFI_P2P", 13, 13);
            MOBILE_IA = new C1945("MOBILE_IA", 14, 14);
            MOBILE_EMERGENCY = new C1945("MOBILE_EMERGENCY", 15, 15);
            PROXY = new C1945("PROXY", 16, 16);
            VPN = new C1945("VPN", 17, 17);
            NONE = new C1945("NONE", 18, -1);
            C1945[] r0 = {MOBILE, WIFI, MOBILE_MMS, MOBILE_SUPL, MOBILE_DUN, MOBILE_HIPRI, WIMAX, BLUETOOTH, DUMMY, ETHERNET, MOBILE_FOTA, MOBILE_IMS, MOBILE_CBS, WIFI_P2P, MOBILE_IA, MOBILE_EMERGENCY, PROXY, VPN, NONE};
            SparseArray<C1945> sparseArray = new SparseArray<>();
            f9819 = sparseArray;
            sparseArray.put(0, MOBILE);
            f9819.put(1, WIFI);
            f9819.put(2, MOBILE_MMS);
            f9819.put(3, MOBILE_SUPL);
            f9819.put(4, MOBILE_DUN);
            f9819.put(5, MOBILE_HIPRI);
            f9819.put(6, WIMAX);
            f9819.put(7, BLUETOOTH);
            f9819.put(8, DUMMY);
            f9819.put(9, ETHERNET);
            f9819.put(10, MOBILE_FOTA);
            f9819.put(11, MOBILE_IMS);
            f9819.put(12, MOBILE_CBS);
            f9819.put(13, WIFI_P2P);
            f9819.put(14, MOBILE_IA);
            f9819.put(15, MOBILE_EMERGENCY);
            f9819.put(16, PROXY);
            f9819.put(17, VPN);
            f9819.put(-1, NONE);
        }

        private C1945(int i) {
            this.f9826 = i;
        }
    }
}
