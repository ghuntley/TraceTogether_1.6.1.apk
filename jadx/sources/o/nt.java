package o;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class nt implements Serializable {

    /* renamed from: Ι  reason: contains not printable characters */
    public final Map<String, Object> f3432;

    /* renamed from: ɩ  reason: contains not printable characters */
    static String m4028(Class cls) {
        return cls.getSimpleName();
    }

    nt(Map<String, Object> map) {
        this.f3432 = new HashMap(map);
    }

    public nt() {
        this.f3432 = new HashMap();
    }

    public String toString() {
        return this.f3432.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f3432.equals(((nt) obj).f3432);
    }

    public int hashCode() {
        return this.f3432.hashCode();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static nt m4027(nt ntVar, nt ntVar2) {
        if (ntVar2 == null) {
            return ntVar;
        }
        nt ntVar3 = new nt(new HashMap(ntVar2.f3432));
        for (String next : ntVar.f3432.keySet()) {
            if (ntVar3.f3432.get(next) == null) {
                ntVar3.f3432.put(next, ntVar.f3432.get(next));
            }
        }
        return ntVar3;
    }
}
