package o;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: o.ɭΙ  reason: contains not printable characters */
public final class C1442 {

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f7784;

    /* renamed from: ι  reason: contains not printable characters */
    public final Resources f7785;

    public C1442(Context context) {
        if (context != null) {
            this.f7785 = context.getResources();
            this.f7784 = this.f7785.getResourcePackageName(R.string.f170692131886159);
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m8704(String str) {
        int identifier = this.f7785.getIdentifier(str, "string", this.f7784);
        if (identifier == 0) {
            return null;
        }
        return this.f7785.getString(identifier);
    }
}
