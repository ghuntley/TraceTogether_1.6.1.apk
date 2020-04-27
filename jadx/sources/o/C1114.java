package o;

import android.content.Context;

/* renamed from: o.ɔІ  reason: contains not printable characters */
class C1114 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final String f6594 = "com.crashlytics.CrashSubmissionCancelTitle";

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final String f6595 = "com.crashlytics.CrashSubmissionPromptMessage";

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final String f6596 = "com.crashlytics.CrashSubmissionPromptTitle";

    /* renamed from: Ι  reason: contains not printable characters */
    private static final String f6597 = "com.crashlytics.CrashSubmissionAlwaysSendTitle";

    /* renamed from: ι  reason: contains not printable characters */
    private static final String f6598 = "com.crashlytics.CrashSubmissionSendTitle";

    /* renamed from: і  reason: contains not printable characters */
    private final Context f6599;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final bL f6600;

    public C1114(Context context, bL bLVar) {
        this.f6599 = context;
        this.f6600 = bLVar;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public String m7524() {
        return m7520(f6596, this.f6600.f1612);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public String m7523() {
        return m7520(f6595, this.f6600.f1609);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public String m7526() {
        return m7520(f6598, this.f6600.f1610);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public String m7525() {
        return m7520(f6597, this.f6600.f1614);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public String m7522() {
        return m7520(f6594, this.f6600.f1611);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private String m7520(String str, String str2) {
        return m7519(C3285aw.m1660(this.f6599, str), str2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private String m7519(String str, String str2) {
        return m7521(str) ? str2 : str;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m7521(String str) {
        return str == null || str.length() == 0;
    }
}
