package o;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.Set;

/* renamed from: o.ıʟ  reason: contains not printable characters */
public final class C0370 {

    /* renamed from: ı  reason: contains not printable characters */
    final boolean f3831;

    /* renamed from: Ɩ  reason: contains not printable characters */
    final Set<String> f3832;

    /* renamed from: ǃ  reason: contains not printable characters */
    final CharSequence[] f3833;

    /* renamed from: ɩ  reason: contains not printable characters */
    final Bundle f3834;

    /* renamed from: Ι  reason: contains not printable characters */
    final String f3835;

    /* renamed from: ι  reason: contains not printable characters */
    final CharSequence f3836;

    /* renamed from: ǃ  reason: contains not printable characters */
    static RemoteInput[] m4566(C0370[] r5) {
        if (r5 == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[r5.length];
        for (int i = 0; i < r5.length; i++) {
            C0370 r2 = r5[i];
            remoteInputArr[i] = new RemoteInput.Builder(r2.f3835).setLabel(r2.f3836).setChoices(r2.f3833).setAllowFreeFormInput(r2.f3831).addExtras(r2.f3834).build();
        }
        return remoteInputArr;
    }
}
