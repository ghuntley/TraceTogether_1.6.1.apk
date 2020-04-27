package o;

import com.google.android.gms.common.api.Status;

/* renamed from: o.ռ  reason: contains not printable characters */
final class C3178 extends C3031 {

    /* renamed from: ı  reason: contains not printable characters */
    final /* synthetic */ C3190 f14438;

    C3178(C3190 r1) {
        this.f14438 = r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m16043(C1383 r5) {
        boolean z = true;
        if (this.f14438.f14509 != 1) {
            z = false;
        }
        int i = this.f14438.f14509;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        String obj = sb.toString();
        if (z) {
            C3190 r0 = this.f14438;
            r0.f14522 = r5;
            r0.m16119();
            if (!r0.f14510) {
                throw new IllegalStateException("no success or failure set on method implementation");
            }
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m16044(C1383 r5, C1314 r6) {
        boolean z = this.f14438.f14509 == 2;
        int i = this.f14438.f14509;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        String obj = sb.toString();
        if (z) {
            C3190 r0 = this.f14438;
            r0.f14522 = r5;
            r0.f14518 = r6;
            r0.m16119();
            if (!r0.f14510) {
                throw new IllegalStateException("no success or failure set on method implementation");
            }
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m16038() {
        boolean z = this.f14438.f14509 == 3;
        int i = this.f14438.f14509;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        String obj = sb.toString();
        if (z) {
            C3190 r0 = this.f14438;
            r0.m16119();
            if (!r0.f14510) {
                throw new IllegalStateException("no success or failure set on method implementation");
            }
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16045() {
        boolean z = this.f14438.f14509 == 4;
        int i = this.f14438.f14509;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        String obj = sb.toString();
        if (z) {
            C3190 r0 = this.f14438;
            r0.m16119();
            if (!r0.f14510) {
                throw new IllegalStateException("no success or failure set on method implementation");
            }
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16035() {
        boolean z = this.f14438.f14509 == 5;
        int i = this.f14438.f14509;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        String obj = sb.toString();
        if (z) {
            C3190 r0 = this.f14438;
            r0.m16119();
            if (!r0.f14510) {
                throw new IllegalStateException("no success or failure set on method implementation");
            }
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m16041() {
        boolean z = this.f14438.f14509 == 6;
        int i = this.f14438.f14509;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        String obj = sb.toString();
        if (z) {
            C3190 r0 = this.f14438;
            r0.m16119();
            if (!r0.f14510) {
                throw new IllegalStateException("no success or failure set on method implementation");
            }
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m16039() {
        boolean z = this.f14438.f14509 == 7;
        int i = this.f14438.f14509;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        String obj = sb.toString();
        if (z) {
            C3190 r0 = this.f14438;
            r0.m16119();
            if (!r0.f14510) {
                throw new IllegalStateException("no success or failure set on method implementation");
            }
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16048(String str) {
        boolean z = this.f14438.f14509 == 8;
        int i = this.f14438.f14509;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        String obj = sb.toString();
        if (z) {
            this.f14438.f14511.execute(new C0332(this, new C3196(str)));
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m16040(C2288 r6) {
        boolean z = this.f14438.f14509 == 8;
        int i = this.f14438.f14509;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        String obj = sb.toString();
        if (z) {
            this.f14438.f14510 = true;
            this.f14438.f14511.execute(new C0332(this, new C3192(r6)));
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16036(String str) {
        boolean z = this.f14438.f14509 == 8;
        int i = this.f14438.f14509;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        String obj = sb.toString();
        if (z) {
            this.f14438.f14510 = true;
            this.f14438.f14511.execute(new C0332(this, new C3193(str)));
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16047(Status status, C2288 r6) {
        boolean z = this.f14438.f14509 == 2;
        int i = this.f14438.f14509;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        String obj = sb.toString();
        if (z) {
            m16034(status, r6);
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m16042(C1222 r3) {
        Status r0 = r3.m7902();
        C1630 r1 = r3.m7900();
        r3.m7903();
        r3.m7901();
        m16034(r0, r1);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16049(C1220 r2) {
        C3190 r0 = this.f14438;
        r0.f14514 = r2;
        r0.m16115(C2745.m14525("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m16034(Status status, C1970 r3) {
        C3190.m16112(this.f14438, status);
        C3190 r0 = this.f14438;
        r0.f14516 = r3;
        if (r0.f14523 != null) {
            this.f14438.f14523.m5374(status);
        }
        this.f14438.m16115(status);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m16037() {
        boolean z = this.f14438.f14509 == 9;
        int i = this.f14438.f14509;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        String obj = sb.toString();
        if (z) {
            C3190 r0 = this.f14438;
            r0.m16119();
            if (!r0.f14510) {
                throw new IllegalStateException("no success or failure set on method implementation");
            }
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16046(Status status) {
        String str = status.f537;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        if (this.f14438.f14509 == 8) {
            this.f14438.f14510 = true;
            this.f14438.f14511.execute(new C0332(this, new C0361(status)));
            return;
        }
        C3190.m16112(this.f14438, status);
        this.f14438.m16115(status);
    }
}
