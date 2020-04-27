package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: o.ιɉ  reason: contains not printable characters */
public final class C1975 {

    /* renamed from: ι  reason: contains not printable characters */
    private static volatile int f9883 = -1;

    /* renamed from: ı  reason: contains not printable characters */
    private final View f9884;

    /* renamed from: ǃ  reason: contains not printable characters */
    public int f9885;

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean f9886;

    public C1975() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static MessageDigest m10712(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static byte[] m10713(Context context, String str) {
        MessageDigest r2;
        PackageInfo packageInfo = C2059.f10120.m10963(context).f10837.getPackageManager().getPackageInfo(str, 64);
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1 || (r2 = m10712("SHA1")) == null) {
            return null;
        }
        return r2.digest(packageInfo.signatures[0].toByteArray());
    }

    public C1975(C2732 r2) {
        this.f9886 = false;
        this.f9885 = 0;
        this.f9884 = (View) r2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10714(Bundle bundle) {
        this.f9886 = bundle.getBoolean("expanded", false);
        this.f9885 = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f9886) {
            ViewParent parent = this.f9884.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).m141(this.f9884);
            }
        }
    }
}
