package o;

import android.text.format.DateUtils;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.C3107;
import o.mQ;

/* renamed from: o.ժ  reason: contains not printable characters */
public final class C3083 {

    /* renamed from: ı  reason: contains not printable characters */
    public static final long f14118 = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int[] f14119 = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final Random f14120;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Executor f14121;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final Map<String, String> f14122;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C1855 f14123;

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3018 f14124;

    /* renamed from: ι  reason: contains not printable characters */
    public final C3107 f14125;

    /* renamed from: І  reason: contains not printable characters */
    private final FirebaseInstanceId f14126;

    /* renamed from: і  reason: contains not printable characters */
    private final ConfigFetchHttpClient f14127;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C2023 f14128;

    public C3083(FirebaseInstanceId firebaseInstanceId, C1855 r2, Executor executor, C2023 r4, Random random, C3018 r6, ConfigFetchHttpClient configFetchHttpClient, C3107 r8, Map<String, String> map) {
        this.f14126 = firebaseInstanceId;
        this.f14123 = r2;
        this.f14121 = executor;
        this.f14128 = r4;
        this.f14120 = random;
        this.f14124 = r6;
        this.f14127 = configFetchHttpClient;
        this.f14125 = r8;
        this.f14122 = map;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static /* synthetic */ C0329 m15689(C3083 r1, Date date, C0329 r3) {
        if (r3.m4421()) {
            return r1.m15690((C1086) r3.m4401(), date);
        }
        C2163 r12 = new C2163("Failed to get Firebase Instance ID token for fetch.", r3.m4406());
        C0770 r2 = new C0770();
        r2.m6073((Exception) r12);
        return r2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private C0329<C3084> m15690(C1086 r3, Date date) {
        try {
            C3084 r32 = m15692(r3, date);
            if (r32.f14131 == 0) {
                return this.f14124.m15463(r32.f14130).m4410(this.f14121, new mQ.C0242(r32));
            }
            C0770 r4 = new C0770();
            r4.m6079(r32);
            return r4;
        } catch (C2161 e) {
            C0770 r42 = new C0770();
            r42.m6073((Exception) e);
            return r42;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private C3084 m15692(C1086 r11, Date date) {
        String str;
        boolean z = false;
        try {
            HttpURLConnection r3 = this.f14127.m1134();
            ConfigFetchHttpClient configFetchHttpClient = this.f14127;
            String r4 = r11.m7448();
            String r5 = r11.m7449();
            HashMap hashMap = new HashMap();
            if (this.f14123 != null) {
                for (Map.Entry next : this.f14123.m10221().entrySet()) {
                    hashMap.put((String) next.getKey(), next.getValue().toString());
                }
            }
            C3084 fetch = configFetchHttpClient.fetch(r3, r4, r5, hashMap, this.f14125.f14207.getString("last_fetch_etag", (String) null), this.f14122, date);
            if (fetch.f14129 != null) {
                this.f14125.m15764(fetch.f14129);
            }
            this.f14125.m15765(0, C3107.f14204);
            return fetch;
        } catch (C2403 e) {
            int i = e.f10973;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int i2 = this.f14125.m15763().f14209 + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f14119;
                long millis = timeUnit.toMillis((long) iArr[Math.min(i2, iArr.length) - 1]);
                this.f14125.m15765(i2, new Date(date.getTime() + (millis / 2) + ((long) this.f14120.nextInt((int) millis))));
            }
            C3107.If r12 = this.f14125.m15763();
            int i3 = e.f10973;
            if (r12.f14209 > 1 || i3 == 429) {
                z = true;
            }
            if (!z) {
                int i4 = e.f10973;
                if (i4 == 401) {
                    str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                } else if (i4 == 403) {
                    str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                } else if (i4 == 429) {
                    throw new C2163("The throttled response from the server was not handled correctly by the FRC SDK.");
                } else if (i4 != 500) {
                    switch (i4) {
                        case 502:
                        case 503:
                        case 504:
                            str = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str = "There was an internal server error.";
                }
                throw new C2403(e.f10973, "Fetch failed: ".concat(str), e);
            }
            r12.f14208.getTime();
            throw new C2804();
        }
    }

    /* renamed from: o.ժ$ı  reason: contains not printable characters */
    public static class C3084 {

        /* renamed from: ǃ  reason: contains not printable characters */
        final String f14129;

        /* renamed from: ɩ  reason: contains not printable characters */
        final C2832 f14130;

        /* renamed from: Ι  reason: contains not printable characters */
        final int f14131;

        private C3084(int i, C2832 r2, String str) {
            this.f14131 = i;
            this.f14130 = r2;
            this.f14129 = str;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public static C3084 m15694(C2832 r2, String str) {
            return new C3084(0, r2, str);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static C3084 m15693() {
            return new C3084(1, (C2832) null, (String) null);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static C3084 m15695() {
            return new C3084(2, (C2832) null, (String) null);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static /* synthetic */ C0329 m15691(C3084 r1) {
        C0770 r0 = new C0770();
        r0.m6079(r1);
        return r0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static /* synthetic */ C0329 m15687(C3083 r4, Date date, C0329 r6) {
        if (r6.m4421()) {
            C3107 r42 = r4.f14125;
            synchronized (r42.f14205) {
                r42.f14207.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception r5 = r6.m4406();
            if (r5 != null) {
                if (r5 instanceof C2804) {
                    C3107 r43 = r4.f14125;
                    synchronized (r43.f14205) {
                        r43.f14207.edit().putInt("last_fetch_status", 2).apply();
                    }
                } else {
                    C3107 r44 = r4.f14125;
                    synchronized (r44.f14205) {
                        r44.f14207.edit().putInt("last_fetch_status", 1).apply();
                    }
                }
            }
        }
        return r6;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static /* synthetic */ C0329 m15688(C3083 r6, long j, C0329 r9) {
        C0770 r7;
        boolean z;
        Date date = new Date(r6.f14128.m10846());
        if (r9.m4421()) {
            Date date2 = new Date(r6.f14125.f14207.getLong("last_fetch_time_in_millis", -1));
            if (date2.equals(C3107.f14203)) {
                z = false;
            } else {
                z = date.before(new Date(date2.getTime() + TimeUnit.SECONDS.toMillis(j)));
            }
            if (z) {
                C3084 r62 = C3084.m15695();
                C0770 r72 = new C0770();
                r72.m6079(r62);
                return r72;
            }
        }
        Date date3 = r6.f14125.m15763().f14208;
        if (!date.before(date3)) {
            date3 = null;
        }
        if (date3 != null) {
            String format = String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date3.getTime() - date.getTime()))});
            date3.getTime();
            C2804 r8 = new C2804(format);
            C0770 r73 = new C0770();
            r73.m6073((Exception) r8);
            r7 = r73;
        } else {
            r7 = r6.f14126.m1117().m4404(r6.f14121, new mQ.C3585If(r6, date));
        }
        return r7.m4404(r6.f14121, new mQ.C0241(r6, date));
    }
}
