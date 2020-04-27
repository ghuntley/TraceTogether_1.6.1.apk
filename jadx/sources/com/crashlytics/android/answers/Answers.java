package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import o.C0318;
import o.C0356;
import o.C0363;
import o.C0423;
import o.C0528;
import o.C0553;
import o.C0555;
import o.C0581;
import o.C2568;
import o.C2863;
import o.C2884;
import o.C2930;
import o.C3085;
import o.C3168;
import o.C3263ac;
import o.C3269ai;
import o.C3281au;
import o.C3285aw;
import o.C3286ax;
import o.aA;
import o.bH;
import o.bM;

public class Answers extends C3269ai<Boolean> {

    /* renamed from: ı  reason: contains not printable characters */
    static final String f469 = "com.crashlytics.ApiEndpoint";

    /* renamed from: ι  reason: contains not printable characters */
    public static final String f470 = "Answers";

    /* renamed from: ǃ  reason: contains not printable characters */
    C0528 f471;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f472 = false;

    /* renamed from: ǃ  reason: contains not printable characters */
    public String m655() {
        return "com.crashlytics.sdk.android:answers";
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public String m665() {
        return "1.4.7.32";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Answers m651() {
        return (Answers) C3263ac.m1559(Answers.class);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m659(C2863 r2) {
        if (r2 == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.f472) {
            m652("logCustom");
        } else {
            C0528 r0 = this.f471;
            if (r0 != null) {
                r0.m5092(r2);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m658(C0363 r2) {
        if (r2 == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.f472) {
            m652("logPurchase");
        } else {
            C0528 r0 = this.f471;
            if (r0 != null) {
                r0.m5094(r2);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m663(C2930 r2) {
        if (r2 == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.f472) {
            m652("logLogin");
        } else {
            C0528 r0 = this.f471;
            if (r0 != null) {
                r0.m5094(r2);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m661(C0555 r2) {
        if (r2 == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.f472) {
            m652("logShare");
        } else {
            C0528 r0 = this.f471;
            if (r0 != null) {
                r0.m5094(r2);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m669(C3168 r2) {
        if (r2 == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.f472) {
            m652("logInvite");
        } else {
            C0528 r0 = this.f471;
            if (r0 != null) {
                r0.m5094(r2);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m662(C0581 r2) {
        if (r2 == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.f472) {
            m652("logSignUp");
        } else {
            C0528 r0 = this.f471;
            if (r0 != null) {
                r0.m5094(r2);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m657(C0318 r2) {
        if (r2 == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.f472) {
            m652("logLevelStart");
        } else {
            C0528 r0 = this.f471;
            if (r0 != null) {
                r0.m5094(r2);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m664(C3085 r2) {
        if (r2 == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.f472) {
            m652("logLevelEnd");
        } else {
            C0528 r0 = this.f471;
            if (r0 != null) {
                r0.m5094(r2);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m668(C2568 r2) {
        if (r2 == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.f472) {
            m652("logAddToCart");
        } else {
            C0528 r0 = this.f471;
            if (r0 != null) {
                r0.m5094(r2);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m660(C0553 r2) {
        if (r2 == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.f472) {
            m652("logStartCheckout");
        } else {
            C0528 r0 = this.f471;
            if (r0 != null) {
                r0.m5094(r2);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m666(C0356 r2) {
        if (r2 == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.f472) {
            m652("logRating");
        } else {
            C0528 r0 = this.f471;
            if (r0 != null) {
                r0.m5094(r2);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m653(C2884 r2) {
        if (r2 == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.f472) {
            m652("logContentView");
        } else {
            C0528 r0 = this.f471;
            if (r0 != null) {
                r0.m5094(r2);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m667(C0423 r2) {
        if (r2 == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.f472) {
            m652("logSearch");
        } else {
            C0528 r0 = this.f471;
            if (r0 != null) {
                r0.m5094(r2);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m656(C3286ax.Cif ifVar) {
        C0528 r0 = this.f471;
        if (r0 != null) {
            r0.m5090(ifVar.f1568);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m671(C3286ax.C0121 r3) {
        C0528 r0 = this.f471;
        if (r0 != null) {
            r0.m5086(r3.f1568, r3.f1569);
        }
    }

    @SuppressLint({"NewApi"})
    public boolean e_() {
        long lastModified;
        try {
            Context r8 = m1589();
            PackageManager packageManager = r8.getPackageManager();
            String packageName = r8.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String num = Integer.toString(packageInfo.versionCode);
            String str = packageInfo.versionName == null ? "0.0" : packageInfo.versionName;
            if (Build.VERSION.SDK_INT >= 9) {
                lastModified = packageInfo.firstInstallTime;
            } else {
                lastModified = new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified();
            }
            this.f471 = C0528.m5083(this, r8, m1595(), num, str, lastModified);
            this.f471.m5084();
            this.f472 = aA.m1450(r8);
            return true;
        } catch (Exception unused) {
            C3263ac.m1563();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public Boolean m654() {
        if (!C3281au.m1627(m1589()).m1628()) {
            C3263ac.m1563();
            this.f471.m5087();
            return Boolean.FALSE;
        }
        try {
            bM r0 = bH.C0122.f1602.m1709();
            if (r0 == null) {
                C3263ac.m1563();
                return Boolean.FALSE;
            } else if (r0.f1618.f1582) {
                C3263ac.m1563();
                this.f471.m5091(r0.f1620, m672());
                return Boolean.TRUE;
            } else {
                C3263ac.m1563();
                this.f471.m5087();
                return Boolean.FALSE;
            }
        } catch (Exception unused) {
            C3263ac.m1563();
            return Boolean.FALSE;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public String m672() {
        return C3285aw.m1660(m1589(), f469);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m652(String str) {
        C3263ac.m1563();
    }
}
