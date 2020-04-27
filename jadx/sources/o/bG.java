package o;

import android.content.SharedPreferences;
import org.json.JSONObject;

final class bG implements bK {

    /* renamed from: ı  reason: contains not printable characters */
    private final bO f1590;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C3281au f1591;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3284av f1592;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final bQ f1593;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C3306bq f1594 = new C3308bs(this.f1597);

    /* renamed from: Ι  reason: contains not printable characters */
    private final bP f1595;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3315bz f1596;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C3269ai f1597;

    public bG(C3269ai aiVar, bQ bQVar, C3284av avVar, bP bPVar, C3315bz bzVar, bO bOVar, C3281au auVar) {
        this.f1597 = aiVar;
        this.f1593 = bQVar;
        this.f1592 = avVar;
        this.f1595 = bPVar;
        this.f1596 = bzVar;
        this.f1590 = bOVar;
        this.f1591 = auVar;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final bM m1707() {
        return m1708(bJ.USE_CACHE);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final bM m1708(bJ bJVar) {
        JSONObject r8;
        bM bMVar = null;
        if (!this.f1591.m1628()) {
            C3263ac.m1563();
            return null;
        }
        try {
            C3263ac.m1558();
            if (!(!this.f1594.m1830().getString("existing_instance_identifier", "").equals(C3285aw.m1676(C3285aw.m1678(this.f1597.m1589()))))) {
                bMVar = m1706(bJVar);
            }
            if (bMVar == null && (r8 = this.f1590.m1716(this.f1593)) != null) {
                bMVar = this.f1595.m1717(this.f1592, r8);
                this.f1596.m1841(bMVar.f1621, r8);
                C3263ac.m1563();
                String r82 = C3285aw.m1676(C3285aw.m1678(this.f1597.m1589()));
                SharedPreferences.Editor r1 = this.f1594.m1828();
                r1.putString("existing_instance_identifier", r82);
                this.f1594.m1829(r1);
            }
            if (bMVar == null) {
                return m1706(bJ.IGNORE_CACHE_EXPIRATION);
            }
            return bMVar;
        } catch (Exception unused) {
            C3263ac.m1563();
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private bM m1706(bJ bJVar) {
        bM bMVar = null;
        try {
            if (bJ.SKIP_CACHE_LOOKUP.equals(bJVar)) {
                return null;
            }
            JSONObject r1 = this.f1596.m1842();
            if (r1 != null) {
                bM r12 = this.f1595.m1717(this.f1592, r1);
                C3263ac.m1563();
                long r2 = this.f1592.m1655();
                if (!bJ.IGNORE_CACHE_EXPIRATION.equals(bJVar)) {
                    if (r12.f1621 < r2) {
                        C3263ac.m1563();
                        return null;
                    }
                }
                try {
                    C3263ac.m1563();
                    return r12;
                } catch (Exception unused) {
                    bMVar = r12;
                    C3263ac.m1563();
                    return bMVar;
                }
            } else {
                C3263ac.m1563();
                return null;
            }
        } catch (Exception unused2) {
        }
    }
}
