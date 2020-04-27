package o;

import android.content.Intent;
import android.text.TextUtils;

/* renamed from: o.ȷլ  reason: contains not printable characters */
final class C0976 {

    /* renamed from: ɩ  reason: contains not printable characters */
    final String f5988;

    /* renamed from: Ι  reason: contains not printable characters */
    final Intent f5989;

    /* renamed from: o.ȷլ$ı  reason: contains not printable characters */
    static final class C0977 implements C2856<C0979> {
        C0977() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final /* synthetic */ void m6951(Object obj, Object obj2) {
            ((C3043) obj2).m15534("messaging_client_event", (Object) ((C0979) obj).f5990);
        }
    }

    /* renamed from: o.ȷլ$ǃ  reason: contains not printable characters */
    static class C0978 implements C2856<C0976> {
        C0978() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final /* synthetic */ void m6952(Object obj, Object obj2) {
            C0976 r4 = (C0976) obj;
            C3043 r5 = (C3043) obj2;
            Intent intent = r4.f5989;
            r5.m15535("ttl", C1671.m9549(intent));
            r5.m15534("event", (Object) r4.f5988);
            r5.m15534("instanceId", (Object) C1671.m9544());
            r5.m15535("priority", C1671.m9550(intent));
            r5.m15534("packageName", (Object) C1671.m9542());
            r5.m15534("sdkPlatform", (Object) "ANDROID");
            r5.m15534("messageType", (Object) C1671.m9537(intent));
            String r42 = C1671.m9534(intent);
            if (r42 != null) {
                r5.m15534("messageId", (Object) r42);
            }
            String r43 = C1671.m9538(intent);
            if (r43 != null) {
                r5.m15534("topic", (Object) r43);
            }
            String r44 = C1671.m9541(intent);
            if (r44 != null) {
                r5.m15534("collapseKey", (Object) r44);
            }
            if (C1671.m9547(intent) != null) {
                r5.m15534("analyticsLabel", (Object) C1671.m9547(intent));
            }
            if (C1671.m9548(intent) != null) {
                r5.m15534("composerLabel", (Object) C1671.m9548(intent));
            }
            String r45 = C1671.m9535();
            if (r45 != null) {
                r5.m15534("projectNumber", (Object) r45);
            }
        }
    }

    /* renamed from: o.ȷլ$ɩ  reason: contains not printable characters */
    static final class C0979 {

        /* renamed from: Ι  reason: contains not printable characters */
        final C0976 f5990;

        C0979(C0976 r1) {
            this.f5990 = r1;
        }
    }

    C0976(String str, Intent intent) {
        if (!TextUtils.isEmpty(str)) {
            this.f5988 = str;
            if (intent != null) {
                this.f5989 = intent;
                return;
            }
            throw new NullPointerException("intent must be non-null");
        }
        throw new IllegalArgumentException("evenType must be non-null");
    }
}
