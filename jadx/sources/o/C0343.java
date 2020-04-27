package o;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o.C2771;

/* renamed from: o.ıɭ  reason: contains not printable characters */
public class C0343 {

    /* renamed from: ı  reason: contains not printable characters */
    public final HashSet<String> f3722 = new HashSet<>();

    /* renamed from: Ɩ  reason: contains not printable characters */
    public List<C1685> f3723;

    /* renamed from: ǃ  reason: contains not printable characters */
    public Map<String, C2771.If> f3724;

    /* renamed from: ȷ  reason: contains not printable characters */
    public float f3725;

    /* renamed from: ɨ  reason: contains not printable characters */
    public float f3726;

    /* renamed from: ɩ  reason: contains not printable characters */
    public Map<String, List<C1685>> f3727;

    /* renamed from: ɪ  reason: contains not printable characters */
    public boolean f3728;

    /* renamed from: ɹ  reason: contains not printable characters */
    public Rect f3729;

    /* renamed from: ɾ  reason: contains not printable characters */
    public float f3730;

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0451 f3731 = new C0451();

    /* renamed from: ι  reason: contains not printable characters */
    public Map<String, C1311> f3732;

    /* renamed from: І  reason: contains not printable characters */
    public C1286<C1460> f3733;

    /* renamed from: і  reason: contains not printable characters */
    public List<C1248> f3734;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public C0782<C1685> f3735;

    /* renamed from: ӏ  reason: contains not printable characters */
    public int f3736 = 0;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1248 m4472(String str) {
        this.f3734.size();
        for (int i = 0; i < this.f3734.size(); i++) {
            C1248 r2 = this.f3734.get(i);
            boolean z = true;
            if (!r2.f7066.equalsIgnoreCase(str) && (!r2.f7066.endsWith(C1248.f7063) || !r2.f7066.substring(0, r2.f7066.length() - 1).equalsIgnoreCase(str))) {
                z = false;
            }
            if (z) {
                return r2;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C1685 r2 : this.f3723) {
            sb.append(r2.m9582("\t"));
        }
        return sb.toString();
    }
}
