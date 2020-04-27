package o;

import android.net.Uri;

/* renamed from: o.ƨΙ  reason: contains not printable characters */
final class C0772 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ Uri f5174;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ boolean f5175;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C0620 f5176;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ String f5177;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ String f5178;

    C0772(C0620 r1, boolean z, Uri uri, String str, String str2) {
        this.f5176 = r1;
        this.f5175 = z;
        this.f5174 = uri;
        this.f5178 = str;
        this.f5177 = str2;
    }

    public final void run() {
        this.f5176.m5328(this.f5175, this.f5174, this.f5178, this.f5177);
    }
}
