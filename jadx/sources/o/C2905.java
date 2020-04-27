package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.ӏʄ  reason: contains not printable characters */
public final class C2905 {

    /* renamed from: ɪ  reason: contains not printable characters */
    private static volatile C2906 f13512 = new C2988();

    /* renamed from: і  reason: contains not printable characters */
    public static ScheduledExecutorService f13513;

    /* renamed from: ı  reason: contains not printable characters */
    public final Object f13514;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public AtomicInteger f13515;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String f13516;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Context f13517;

    /* renamed from: ɹ  reason: contains not printable characters */
    private WorkSource f13518;

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean f13519;

    /* renamed from: ι  reason: contains not printable characters */
    public final PowerManager.WakeLock f13520;

    /* renamed from: І  reason: contains not printable characters */
    public int f13521;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final Map<String, Integer[]> f13522;

    /* renamed from: o.ӏʄ$ɩ  reason: contains not printable characters */
    public interface C2906 {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2905(Context context, String str) {
        this(context, str, context == null ? null : context.getPackageName(), (byte) 0);
    }

    private C2905(Context context, String str, String str2, byte b) {
        this(context, str, str2);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private C2905(Context context, String str, String str2) {
        this.f13514 = this;
        boolean z = true;
        this.f13519 = true;
        this.f13522 = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.f13515 = new AtomicInteger(0);
        if (context == null) {
            throw new NullPointerException("WakeLock: context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            this.f13517 = context.getApplicationContext();
            if (!"com.google.android.gms".equals(context.getPackageName())) {
                String valueOf = String.valueOf(str);
                this.f13516 = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
            } else {
                this.f13516 = str;
            }
            this.f13520 = ((PowerManager) context.getSystemService("power")).newWakeLock(1, str);
            if (C2209.m11645(context)) {
                if (str2 != null && !str2.trim().isEmpty()) {
                    z = false;
                }
                this.f13518 = C2209.m11640(context, z ? context.getPackageName() : str2);
                WorkSource workSource = this.f13518;
                if (workSource != null && C2209.m11645(this.f13517)) {
                    WorkSource workSource2 = this.f13518;
                    if (workSource2 != null) {
                        workSource2.add(workSource);
                    } else {
                        this.f13518 = workSource;
                    }
                    try {
                        this.f13520.setWorkSource(this.f13518);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            if (f13513 == null) {
                f13513 = C2022.m10840().m10845();
            }
        } else {
            throw new IllegalArgumentException("WakeLock: wakeLockName must not be empty");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final List<String> m15061() {
        WorkSource workSource = this.f13518;
        int r2 = workSource == null ? 0 : C2209.m11642(workSource);
        if (r2 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < r2; i++) {
            String r5 = C2209.m11638(workSource, i);
            if (!(r5 == null || r5.trim().isEmpty())) {
                arrayList.add(r5);
            }
        }
        return arrayList;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m15060() {
        if (this.f13520.isHeld()) {
            try {
                this.f13520.release();
            } catch (RuntimeException e) {
                if (!e.getClass().equals(RuntimeException.class)) {
                    throw e;
                }
            }
            this.f13520.isHeld();
        }
    }
}
