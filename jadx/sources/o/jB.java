package o;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import sg.gov.tech.bluetrace.BuildConfig;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\"\u0016\u0010\u0003\u001a\u00020\u00008\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0016\u0010\t\u001a\u00020\u00068\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0016\u0010\u0001\u001a\u00020\u00008\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00008\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0016\u0010\n\u001a\u00020\u00068\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b\"\u0016\u0010\u0007\u001a\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\f"}, d2 = {"", "ɩ", "I", "ı", "ǃ", "Ι", "", "і", "J", "ι", "І", "Lo/jC;", "Lo/jC;"}, k = 2, mv = {1, 1, 15})
public final class jB {

    /* renamed from: ı  reason: contains not printable characters */
    public static final long f2394 = C3514ji.m3094$default("kotlinx.coroutines.scheduler.resolution.ns", BuildConfig.BLACKLIST_DURATION, 0, 0, 12, (Object) null);

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final int f2395 = C3514ji.m3091$default("kotlinx.coroutines.scheduler.core.pool.size", C3435gj.m2407(C3511jf.m3076(), 2), 1, 0, 8, (Object) null);

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final int f2396 = C3514ji.m3091$default("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);

    /* renamed from: Ι  reason: contains not printable characters */
    public static final int f2397 = C3514ji.m3091$default("kotlinx.coroutines.scheduler.offload.threshold", 96, 0, 128, 4, (Object) null);

    /* renamed from: ι  reason: contains not printable characters */
    public static final int f2398 = C3514ji.m3091$default("kotlinx.coroutines.scheduler.max.pool.size", C3435gj.m2410(C3511jf.m3076() * 128, f2395, 2097150), 0, 2097150, 4, (Object) null);

    /* renamed from: І  reason: contains not printable characters */
    public static jC f2399 = C3527jw.f2530;

    /* renamed from: і  reason: contains not printable characters */
    public static final long f2400 = TimeUnit.SECONDS.toNanos(C3514ji.m3094$default("kotlinx.coroutines.scheduler.keep.alive.sec", 5, 0, 0, 12, (Object) null));
}
