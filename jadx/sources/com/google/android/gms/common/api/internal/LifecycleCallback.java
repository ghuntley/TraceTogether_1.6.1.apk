package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.C0485;
import o.C0502;
import o.C1078;

public class LifecycleCallback {

    /* renamed from: ı  reason: contains not printable characters */
    public final C0485 f555;

    @Keep
    private static C0485 getChimeraLifecycleFragmentImpl(C0502 r1) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m767() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m769() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m770(int i, int i2, Intent intent) {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m771(Bundle bundle) {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m772() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m773(Bundle bundle) {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m774(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m775() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C0485 m765(C0502 r1) {
        if (r1.m4900()) {
            return zzc.m778(r1.m4901());
        }
        if (r1.m4898()) {
            return C1078.m7429(r1.m4899());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C0485 m766(Activity activity) {
        return m765(new C0502(activity));
    }

    public LifecycleCallback(C0485 r1) {
        this.f555 = r1;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public Activity m768() {
        return this.f555.m4846();
    }
}
