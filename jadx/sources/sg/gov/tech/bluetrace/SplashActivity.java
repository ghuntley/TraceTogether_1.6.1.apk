package sg.gov.tech.bluetrace;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import kotlin.Metadata;
import o.C1459;
import o.C3166;
import o.C3569lj;
import o.C3573lo;
import o.R;
import o.fM;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u0018\u00002\u00020\u001cB\u0007¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u0002\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0002\u0010\u000fJ)\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001a\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0005\u001a\u00020\b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\t\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0016\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0002¢\u0006\u0006\n\u0004\b\r\u0010\f"}, d2 = {"Lsg/gov/tech/bluetrace/SplashActivity;", "", "ɩ", "I", "", "Ι", "J", "ǃ", "Landroid/os/Handler;", "ı", "Landroid/os/Handler;", "", "Z", "ι", "", "()V", "p0", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "onPause", "onResume", "<init>", "Lo/ɹ;"}, k = 1, mv = {1, 1, 16})
public final class SplashActivity extends C1459 {

    /* renamed from: ı  reason: contains not printable characters */
    private Handler f14585;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f14586;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f14587 = 1;

    /* renamed from: Ι  reason: contains not printable characters */
    private final long f14588 = 2000;

    /* renamed from: ι  reason: contains not printable characters */
    public boolean f14589;

    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView((int) R.layout.f168902131558431);
        this.f14585 = new Handler();
        Intent intent = getIntent();
        fM.m2252((Object) intent, "");
        Bundle extras = intent.getExtras();
        if (extras != null && (string = extras.getString("event", (String) null)) != null && string.equals("update")) {
            this.f14589 = true;
            setIntent(new Intent("android.intent.action.VIEW"));
            getIntent().setData(Uri.parse(BuildConfig.STORE_URL));
            startActivity(getIntent());
            finish();
        }
    }

    public final void onPause() {
        super.onPause();
        Handler handler = this.f14585;
        if (handler == null) {
            fM.m2253("mHandler");
        }
        handler.removeCallbacksAndMessages((Object) null);
    }

    public final void onResume() {
        super.onResume();
        if (!this.f14589) {
            Handler handler = this.f14585;
            if (handler == null) {
                fM.m2253("mHandler");
            }
            handler.postDelayed(new Runnable(this) {

                /* renamed from: Ι  reason: contains not printable characters */
                final /* synthetic */ SplashActivity f14590;

                {
                    this.f14590 = r1;
                }

                public final void run() {
                    this.f14590.m16171();
                    this.f14590.finish();
                }
            }, this.f14588);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m16171() {
        Context context = this;
        try {
            if (!((Boolean) ((Class) C3166.m16013(4, 8, 0)).getMethod("ɩ", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null), new Object[]{context})).booleanValue()) {
                startActivity(new Intent(context, C3569lj.class));
            } else {
                startActivity(new Intent(context, C3573lo.class));
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.f14587) {
            this.f14586 = true;
        }
    }
}
