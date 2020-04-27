package o;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import sg.gov.tech.bluetrace.BuildConfig;
import zendesk.core.AnonymousIdentity;
import zendesk.core.Zendesk;
import zendesk.support.Support;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u0000 \u00012\u00020\u000b:\u0001\u0001B\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0001\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003"}, d2 = {"Lo/lt;", "ı", "", "Ljava/lang/String;", "ǃ", "ι", "ɩ", "", "onCreate", "()V", "<init>", "Landroid/app/Application;"}, k = 1, mv = {1, 1, 16})
/* renamed from: o.lt  reason: case insensitive filesystem */
public final class C3577lt extends Application {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C0228 f2990 = new C0228((fL) null);

    /* renamed from: Ι  reason: contains not printable characters */
    public static Context f2991 = null;
    /* access modifiers changed from: private */

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static final String f2992 = f2992;

    /* renamed from: ı  reason: contains not printable characters and collision with other field name */
    private final String f2993 = BuildConfig.ZENDESK_APP_ID;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f2994 = BuildConfig.ZENDESK_URL;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f2995 = BuildConfig.ZENDESK_CLIENT_ID;

    public final void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        fM.m2252((Object) applicationContext, "");
        f2991 = applicationContext;
        try {
            Zendesk.INSTANCE.init(this, this.f2994, this.f2993, this.f2995);
            Support.INSTANCE.init(Zendesk.INSTANCE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        m3683();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m3683() {
        Throwable cause;
        try {
            try {
                ((Class) C3166.m16013(4, 4, 0)).getMethod("ı", (Class[]) null).invoke(((Class) C3166.m16013(4, 4, 0)).getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{this}), (Object[]) null);
            } catch (Throwable th) {
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } finally {
            cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0017B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\n\u0010\fJ\r\u0010\u0006\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eJ!\u0010\n\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u00020\u00018\u0007@\u0006X&¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lo/lt$ı;", "Landroid/content/Context;", "Ι", "Landroid/content/Context;", "ı", "()Landroid/content/Context;", "ι", "", "Ӏ", "Ljava/lang/String;", "ǃ", "Lo/ma;", "()Lo/ma;", "Lo/lZ;", "()Lo/lZ;", "p0", "p1", "", "(Ljava/lang/String;Ljava/lang/String;)V", "ɩ", "()Ljava/lang/String;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.lt$ı  reason: contains not printable characters */
    public static final class C0228 {
        private C0228() {
        }

        public /* synthetic */ C0228(fL fLVar) {
            this();
        }

        @JvmName(name = "ı")
        /* renamed from: ı  reason: contains not printable characters */
        public final Context m3684() {
            Context r0 = C3577lt.f2991;
            if (r0 == null) {
                fM.m2253("AppContext");
            }
            return r0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0066, code lost:
            r0 = r0.getTempID();
         */
        /* renamed from: ɩ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String m3687() {
            /*
                r5 = this;
                o.lR$ı r0 = o.lR.f2769
                sg.gov.tech.bluetrace.idmanager.TemporaryID r0 = r0.m3507()
                if (r0 == 0) goto L_0x0053
                o.lA$ǃ r1 = o.lA.f2728
                java.lang.String r2 = o.C3577lt.f2992
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Retrieved BM for storage: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r1.m3369(r2, r3)
                boolean r0 = r0.isValidForCurrentTime()
                if (r0 != 0) goto L_0x0053
                sg.gov.tech.bluetrace.idmanager.TempIDManager r0 = sg.gov.tech.bluetrace.idmanager.TempIDManager.INSTANCE
                o.lt$ı r1 = o.C3577lt.f2990
                android.content.Context r1 = r1.m3684()
                sg.gov.tech.bluetrace.idmanager.TemporaryID r0 = r0.retrieveTemporaryID(r1)
                if (r0 == 0) goto L_0x0046
                o.lA$ǃ r1 = o.lA.f2728
                java.lang.String r2 = o.C3577lt.f2992
                java.lang.String r3 = "Grab New Temp ID"
                r1.m3369(r2, r3)
                o.lR$ı r1 = o.lR.f2769
                r1.m3509(r0)
            L_0x0046:
                if (r0 != 0) goto L_0x0053
                o.lA$ǃ r0 = o.lA.f2728
                java.lang.String r1 = o.C3577lt.f2992
                java.lang.String r2 = "Failed to grab new Temp ID"
                r0.m3375(r1, r2)
            L_0x0053:
                o.lA$ǃ r0 = o.lA.f2728
                java.lang.String r1 = o.C3577lt.f2992
                java.lang.String r2 = "No local Broadcast Message"
                r0.m3375(r1, r2)
                o.lR$ı r0 = o.lR.f2769
                sg.gov.tech.bluetrace.idmanager.TemporaryID r0 = r0.m3507()
                if (r0 == 0) goto L_0x006d
                java.lang.String r0 = r0.getTempID()
                if (r0 == 0) goto L_0x006d
                goto L_0x006f
            L_0x006d:
                java.lang.String r0 = "Missing TempID"
            L_0x006f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3577lt.C0228.m3687():java.lang.String");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final lZ m3688() {
            String str = Build.MODEL;
            fM.m2252((Object) str, "");
            return new lZ(str, "SELF");
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C3588ma m3685() {
            String str = Build.MODEL;
            fM.m2252((Object) str, "");
            return new C3588ma(str, "SELF");
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m3686(String str, String str2) {
            Zendesk.INSTANCE.setIdentity(new AnonymousIdentity.Builder().withNameIdentifier(str).withEmailIdentifier(str2).build());
        }
    }
}
