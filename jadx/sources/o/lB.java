package o;

import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\u0018\u0000 \u00012\u00020\u0012:\u0001\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/lB;", "ɩ", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "", "", "", "p1", "", "p2", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "requestWritePermissionAndExecute", "()V", "<init>", "Lo/ɹ;"}, k = 1, mv = {1, 1, 16})
public final class lB extends C1459 {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C0216 f2730 = new C0216((fL) null);

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWritePermissionAndExecute();
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        fM.m2254(strArr, "");
        fM.m2254(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        C3538kg.m3270(i, strArr, iArr, this);
    }

    @C3532ka(m3258 = 743)
    private final void requestWritePermissionAndExecute() {
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
        Context context = this;
        if (C3538kg.m3271(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            try {
                ((Class) C3166.m16013(4, 12, 45444)).getMethod("ɩ", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), new Object[]{context});
                finish();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            C3538kg.m3264(this, getString(R.string.f171042131886261), 743, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/lB$ɩ;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.lB$ɩ  reason: contains not printable characters */
    public static final class C0216 {
        private C0216() {
        }

        public /* synthetic */ C0216(fL fLVar) {
            this();
        }
    }
}
