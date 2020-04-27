package o;

import android.text.TextUtils;

/* renamed from: o.ʀι  reason: contains not printable characters */
public class C1590 extends Exception {
    @Deprecated
    public C1590() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1590(String str) {
        super(str);
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1590(String str, Throwable th) {
        super(str, th);
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Detail message must not be empty");
    }

    public C1590(String str, String str2) {
        this(str2);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }
}
