package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import kotlin.Metadata;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u0018\u0000 \u00012\u00020\u0012:\u0001\u0001B\u001d\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u000e\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R#\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0001\u0010\t"}, d2 = {"Lo/lN;", "ɩ", "", "Ι", "Ljava/lang/String;", "ı", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Lo/fo;", "ǃ", "p0", "Landroid/content/Intent;", "p1", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "<init>", "(Lo/fo;)V", "Landroid/content/BroadcastReceiver;"}, k = 1, mv = {1, 1, 16})
public final class lN extends BroadcastReceiver {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C0218 f2755 = new C0218((fL) null);

    /* renamed from: ɩ  reason: contains not printable characters and collision with other field name */
    public final C3413fo<Context, dF> f2756;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f2757 = "PackageInstalledReceiver";

    public lN(C3413fo<? super Context, dF> foVar) {
        fM.m2254(foVar, "");
        this.f2756 = foVar;
    }

    public final void onReceive(Context context, Intent intent) {
        lA.C0215 r0 = lA.f2728;
        String str = this.f2757;
        StringBuilder sb = new StringBuilder();
        sb.append("ACTION: ");
        String str2 = null;
        sb.append(intent != null ? intent.getAction() : null);
        r0.m3369(str, sb.toString());
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == 1544582882 && action.equals("android.intent.action.PACKAGE_ADDED")) {
            Uri data = intent.getData();
            if (data != null) {
                str2 = data.getEncodedSchemeSpecificPart();
            }
            if (fM.m2257(str2, "com.swiftoffice.swiftmed")) {
                lA.C0215 r7 = lA.f2728;
                r7.m3369("PackageChanged", "App availability changed for " + str2 + " to true");
                this.f2756.m2298(context);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/lN$ɩ;", "Landroid/content/IntentFilter;", "ǃ", "()Landroid/content/IntentFilter;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.lN$ɩ  reason: contains not printable characters */
    public static final class C0218 {
        private C0218() {
        }

        public /* synthetic */ C0218(fL fLVar) {
            this();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final IntentFilter m3405() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            return intentFilter;
        }
    }
}
