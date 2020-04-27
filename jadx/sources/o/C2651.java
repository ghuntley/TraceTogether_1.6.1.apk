package o;

import java.util.Locale;
import java.util.Map;

/* renamed from: o.ѳ  reason: contains not printable characters */
class C2651 {

    /* renamed from: ǃ  reason: contains not printable characters */
    boolean f12144;

    /* renamed from: Ι  reason: contains not printable characters */
    final int f12145;

    /* renamed from: ι  reason: contains not printable characters */
    final int f12146;

    public C2651(int i, int i2, boolean z) {
        this.f12145 = i;
        this.f12146 = i2;
        this.f12144 = z;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public String m14017(String str) {
        if (str.length() <= this.f12146) {
            return str;
        }
        m14016(new IllegalArgumentException(String.format(Locale.US, "String is too long, truncating to %d characters", new Object[]{Integer.valueOf(this.f12146)})));
        return str.substring(0, this.f12146);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m14018(Object obj, String str) {
        if (obj != null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        m14016(new NullPointerException(sb.toString()));
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m14019(Map<String, Object> map, String str) {
        if (map.size() < this.f12145 || map.containsKey(str)) {
            return false;
        }
        m14016(new IllegalArgumentException(String.format(Locale.US, "Limit of %d attributes reached, skipping attribute", new Object[]{Integer.valueOf(this.f12145)})));
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m14016(RuntimeException runtimeException) {
        if (!this.f12144) {
            C3263ac.m1563();
            return;
        }
        throw runtimeException;
    }
}
