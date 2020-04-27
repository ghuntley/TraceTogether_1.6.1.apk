package o;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: o.ҍ  reason: contains not printable characters */
class C2662 {

    /* renamed from: ı  reason: contains not printable characters */
    final Map<String, Object> f12247 = new ConcurrentHashMap();

    /* renamed from: ɩ  reason: contains not printable characters */
    final C2651 f12248;

    public C2662(C2651 r2) {
        this.f12248 = r2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m14120(String str, String str2) {
        if (!this.f12248.m14018((Object) str, "key") && !this.f12248.m14018((Object) str2, "value")) {
            m14121(this.f12248.m14017(str), this.f12248.m14017(str2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m14119(String str, Number number) {
        if (!this.f12248.m14018((Object) str, "key") && !this.f12248.m14018((Object) number, "value")) {
            m14121(this.f12248.m14017(str), number);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m14121(String str, Object obj) {
        if (!this.f12248.m14019(this.f12247, str)) {
            this.f12247.put(str, obj);
        }
    }

    public String toString() {
        return new JSONObject(this.f12247).toString();
    }
}
