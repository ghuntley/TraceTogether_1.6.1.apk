package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: o.ɩͼ  reason: contains not printable characters */
public abstract class C1283 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Object f7221 = new Object();

    /* renamed from: ι  reason: contains not printable characters */
    private static C1283 f7222;

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract boolean m8198(If ifR, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m8200(If ifR, ServiceConnection serviceConnection, String str);

    /* renamed from: ı  reason: contains not printable characters */
    public static C1283 m8197(Context context) {
        synchronized (f7221) {
            if (f7222 == null) {
                f7222 = new C1682(context.getApplicationContext());
            }
        }
        return f7222;
    }

    /* renamed from: o.ɩͼ$If */
    public static final class If {

        /* renamed from: ı  reason: contains not printable characters */
        private final String f7223;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final ComponentName f7224;

        /* renamed from: Ι  reason: contains not printable characters */
        private final int f7225;

        /* renamed from: ι  reason: contains not printable characters */
        private final String f7226;

        public If(String str, String str2, int i) {
            if (!TextUtils.isEmpty(str)) {
                this.f7223 = str;
                if (!TextUtils.isEmpty(str2)) {
                    this.f7226 = str2;
                    this.f7224 = null;
                    this.f7225 = i;
                    return;
                }
                throw new IllegalArgumentException("Given String is empty or null");
            }
            throw new IllegalArgumentException("Given String is empty or null");
        }

        public final String toString() {
            String str = this.f7223;
            return str == null ? this.f7224.flattenToString() : str;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final String m8204() {
            return this.f7226;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final ComponentName m8201() {
            return this.f7224;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final int m8202() {
            return this.f7225;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Intent m8203(Context context) {
            String str = this.f7223;
            if (str != null) {
                return new Intent(str).setPackage(this.f7226);
            }
            return new Intent().setComponent(this.f7224);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f7223, this.f7226, this.f7224, Integer.valueOf(this.f7225)});
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof If)) {
                return false;
            }
            If ifR = (If) obj;
            String str = this.f7223;
            String str2 = ifR.f7223;
            if (str == str2 || (str != null && str.equals(str2))) {
                String str3 = this.f7226;
                String str4 = ifR.f7226;
                if (str3 == str4 || (str3 != null && str3.equals(str4))) {
                    ComponentName componentName = this.f7224;
                    ComponentName componentName2 = ifR.f7224;
                    return (componentName == componentName2 || (componentName != null && componentName.equals(componentName2))) && this.f7225 == ifR.f7225;
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8199(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        m8200(new If(str, str2, i), serviceConnection, str3);
    }
}
