package o;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import o.C2911;

/* renamed from: o.ɭІ  reason: contains not printable characters */
public final class C1444 extends C2911<C1414> {

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C1444 f7786 = new C1444();

    private C1444() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final View m8706(Context context, int i, int i2) {
        try {
            C1446 r0 = new C1446(i, i2);
            return (View) C2813.m14731(((C1414) m15068(context)).m8627(new C2813(context), r0));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new C2911.If(sb.toString(), e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ Object m8707(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof C1414) {
            return (C1414) queryLocalInterface;
        }
        return new C1629(iBinder);
    }
}
