package o;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: o.кι  reason: contains not printable characters */
final class C2446 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C0304 f11103;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ ServiceConnection f11104;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C2541 f11105;

    C2446(C2541 r1, C0304 r2, ServiceConnection serviceConnection) {
        this.f11105 = r1;
        this.f11103 = r2;
        this.f11104 = serviceConnection;
    }

    public final void run() {
        C2442 r0 = this.f11105.f11626;
        String r1 = this.f11105.f11625;
        C0304 r2 = this.f11103;
        ServiceConnection serviceConnection = this.f11104;
        Bundle r12 = r0.m12558(r1, r2);
        r0.f11092.u_().y_();
        if (r12 != null) {
            long j = r12.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                r0.f11092.t_().m11714().m11606("Service response is missing Install Referrer install timestamp");
            } else {
                String string = r12.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    r0.f11092.t_().m11714().m11606("No referrer defined in Install Referrer response");
                } else {
                    r0.f11092.t_().m11713().m11603("InstallReferrer API result", string);
                    Bundle r22 = r0.f11092.m14116().m11370(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (r22 == null) {
                        r0.f11092.t_().m11714().m11606("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = r22.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = r12.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                r0.f11092.t_().m11714().m11606("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                r22.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == r0.f11092.m14107().f10782.m13399()) {
                            r0.f11092.q_();
                            r0.f11092.t_().m11713().m11606("Install Referrer campaign has already been logged");
                        } else if (!C0765.m6049() || !r0.f11092.m14090().m13372(C2529.f11572) || r0.f11092.m14094()) {
                            r0.f11092.m14107().f10782.m13398(j);
                            r0.f11092.q_();
                            r0.f11092.t_().m11713().m11603("Logging Install Referrer campaign from sdk with ", "referrer API");
                            r22.putString("_cis", "referrer API");
                            r0.f11092.m14100().m4344("auto", "_cmp", r22);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            C1345.m8433().m8434(r0.f11092.m14117(), serviceConnection);
        }
    }
}
