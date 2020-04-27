package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;
import o.A;

/* renamed from: o.ѭ  reason: contains not printable characters */
final class C2648 extends C3618r {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final UriMatcher f12139;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Context f12140;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f12139 = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f12139.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f12139.addURI("com.android.contacts", "contacts/#/photo", 2);
        f12139.addURI("com.android.contacts", "contacts/#", 3);
        f12139.addURI("com.android.contacts", "display_photo/#", 4);
    }

    C2648(Context context) {
        this.f12140 = context;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m14009(C3617q qVar) {
        Uri uri = qVar.f3474;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f12139.match(qVar.f3474) != -1;
    }

    @TargetApi(14)
    /* renamed from: o.ѭ$ǃ  reason: contains not printable characters */
    public static class C2649 {

        /* renamed from: Ι  reason: contains not printable characters */
        private final Executor f12141;

        /* renamed from: ι  reason: contains not printable characters */
        private final Map<Pair<String, String>, C0329<C1086>> f12142 = new C0299();

        public C2649(Executor executor) {
            this.f12141 = executor;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final synchronized C0329<C1086> m14011(String str, String str2, C1604 r4) {
            Pair pair = new Pair(str, str2);
            C0329<C1086> r2 = this.f12142.get(pair);
            if (r2 != null) {
                return r2;
            }
            C0329<TContinuationResult> r22 = r4.m9315().m4404(this.f12141, new A.C0079(this, pair));
            this.f12142.put(pair, r22);
            return r22;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ C0329 m14010(Pair pair, C0329 r3) {
            synchronized (this) {
                this.f12142.remove(pair);
            }
            return r3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[RETURN] */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.C3618r.C0275 m14008(o.C3617q r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.f12140
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r6 = r6.f3474
            android.content.UriMatcher r1 = f12139
            int r1 = r1.match(r6)
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L_0x0031
            r4 = 2
            if (r1 == r4) goto L_0x002c
            r4 = 3
            if (r1 == r4) goto L_0x0039
            r3 = 4
            if (r1 != r3) goto L_0x001c
            goto L_0x002c
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Invalid uri: "
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
        L_0x002c:
            java.io.InputStream r6 = r0.openInputStream(r6)
            goto L_0x0048
        L_0x0031:
            android.net.Uri r6 = android.provider.ContactsContract.Contacts.lookupContact(r0, r6)
            if (r6 != 0) goto L_0x0039
            r6 = r2
            goto L_0x0048
        L_0x0039:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 14
            if (r1 >= r4) goto L_0x0044
            java.io.InputStream r6 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r0, r6)
            goto L_0x0048
        L_0x0044:
            java.io.InputStream r6 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r0, r6, r3)
        L_0x0048:
            if (r6 == 0) goto L_0x0052
            o.r$ǃ r0 = new o.r$ǃ
            o.p$ɩ r1 = o.C3616p.C0272.DISK
            r0.<init>((java.io.InputStream) r6, (o.C3616p.C0272) r1)
            return r0
        L_0x0052:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2648.m14008(o.q):o.r$ǃ");
    }
}
