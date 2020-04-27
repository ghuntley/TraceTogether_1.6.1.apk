package o;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: o.ҩı  reason: contains not printable characters */
public final class C2714 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static SparseArray<C2714> f12547;

    /* renamed from: ı  reason: contains not printable characters */
    HashMap<String, String> f12548;

    /* renamed from: Ι  reason: contains not printable characters */
    String f12549;

    /* renamed from: ι  reason: contains not printable characters */
    int f12550;

    private C2714(String str, int i, HashMap<String, String> hashMap) {
        this.f12549 = str;
        this.f12550 = i;
        this.f12548 = hashMap;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C2714 m14417(int i) {
        if (f12547 == null) {
            f12547 = new SparseArray<>();
            HashMap hashMap = new HashMap();
            hashMap.put("ag", "268");
            hashMap.put("ai", "264");
            hashMap.put("as", "684");
            hashMap.put("bb", "246");
            hashMap.put("bm", "441");
            hashMap.put("bs", "242");
            hashMap.put("ca", "204/226/236/249/250/289/306/343/365/403/416/418/431/437/438/450/506/514/519/579/581/587/600/601/604/613/639/647/705/709/769/778/780/782/807/819/825/867/873/902/905/");
            hashMap.put("dm", "767");
            hashMap.put("do", "809/829/849");
            hashMap.put("gd", "473");
            hashMap.put("gu", "671");
            hashMap.put("jm", "876");
            hashMap.put("kn", "869");
            hashMap.put("ky", "345");
            hashMap.put("lc", "758");
            hashMap.put("mp", "670");
            hashMap.put("ms", "664");
            hashMap.put("pr", "787");
            hashMap.put("sx", "721");
            hashMap.put("tc", "649");
            hashMap.put("tt", "868");
            hashMap.put("vc", "784");
            hashMap.put("vg", "284");
            hashMap.put("vi", "340");
            f12547.put(1, new C2714("us", 3, hashMap));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("gg", "1481");
            hashMap2.put("im", "1624");
            hashMap2.put("je", "1534");
            f12547.put(44, new C2714("gb", 4, hashMap2));
            HashMap hashMap3 = new HashMap();
            hashMap3.put("ax", "18");
            f12547.put(358, new C2714("fi", 2, hashMap3));
        }
        return f12547.get(i);
    }
}
