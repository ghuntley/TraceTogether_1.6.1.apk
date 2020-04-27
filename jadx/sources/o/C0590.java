package o;

import com.crashlytics.android.answers.Answers;

/* renamed from: o.ſɹ  reason: contains not printable characters */
class C0590 implements C0641 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final String f4505 = "AnswersKitEventLogger";

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Answers f4506;

    private C0590(Answers answers) {
        this.f4506 = answers;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C0590 m5226() {
        return m5225(Answers.m651());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static C0590 m5225(Answers answers) {
        if (answers != null) {
            return new C0590(answers);
        }
        throw new IllegalStateException("Answers must be initialized before logging kit events");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m5227(C0644 r2) {
        try {
            this.f4506.m659(r2.m5427());
        } catch (Throwable unused) {
        }
    }
}
