package o;

import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import o.C2887;

/* renamed from: o.ɩҹ  reason: contains not printable characters */
public final class C1315 implements Runnable, C3191 {

    /* renamed from: ι  reason: contains not printable characters */
    public static final boolean f7313 = (Build.VERSION.SDK_INT < 18);

    /* renamed from: ı  reason: contains not printable characters */
    private final String f7314;

    /* renamed from: ɩ  reason: contains not printable characters */
    private /* synthetic */ C0408 f7315;

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m8286(C1349 r2, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        (f7313 ? frameLayout : view).getDrawingRect(rect);
        r2.setBounds(rect);
        r2.m8451(view, frameLayout);
    }

    public C1315(C0408 r1, String str) {
        this.f7315 = r1;
        if (!TextUtils.isEmpty(str)) {
            this.f7314 = str;
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public final void run() {
        FirebaseAuth instance = FirebaseAuth.getInstance(FirebaseApp.m1069(this.f7314));
        if (instance.f965 != null) {
            C0329<C2552> r0 = instance.m1095(instance.f965, true);
            C2887.Cif unused = C0408.f3968;
            r0.m4414((C3191) this);
        }
    }

    public final void onFailure(Exception exc) {
        long j;
        if (exc instanceof C1600) {
            C2887.Cif unused = C0408.f3968;
            C0408 r7 = this.f7315;
            int i = (int) r7.f3971;
            if (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) {
                j = 2 * r7.f3971;
            } else {
                j = i != 960 ? 30 : 960;
            }
            r7.f3971 = j;
            r7.f3973 = C2022.f9992.m10846() + (r7.f3971 * 1000);
            C2887.Cif ifVar = C0408.f3968;
            long j2 = r7.f3973;
            r7.f3969.postDelayed(r7.f3972, r7.f3971 * 1000);
        }
    }
}
