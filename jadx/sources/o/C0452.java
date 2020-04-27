package o;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import o.C0311;
import o.C2552;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ıӿ  reason: contains not printable characters */
public class C0452 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean f4061 = false;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C3203<Void> f4062 = new C3203<>();
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final C2036 f4063 = new C2036();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final String f4064;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C0554 f4065;

    /* renamed from: ɹ  reason: contains not printable characters */
    private String f4066 = "https://%1$s-%2$s.cloudfunctions.net/%3$s";

    /* renamed from: ι  reason: contains not printable characters */
    private final OkHttpClient f4067 = new OkHttpClient();

    /* renamed from: і  reason: contains not printable characters */
    private final String f4068;

    C0452(Context context, String str, String str2, C0554 r5) {
        if (r5 != null) {
            this.f4065 = r5;
            if (str != null) {
                this.f4064 = str;
                if (str2 != null) {
                    this.f4068 = str2;
                    synchronized (f4062) {
                        if (!f4061) {
                            f4061 = true;
                            new Handler(context.getMainLooper()).post(new C0344(context));
                            return;
                        }
                        return;
                    }
                }
                throw new NullPointerException("null reference");
            }
            throw new NullPointerException("null reference");
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static /* synthetic */ void m4771(Context context) {
        AnonymousClass5 r0 = new C2552.C2553() {
            /* renamed from: Ι  reason: contains not printable characters */
            public final void m4775() {
                C0452.f4062.f14555.m6079(null);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m4774(int i, Intent intent) {
                C0452.f4062.f14555.m6079(null);
            }
        };
        if (context == null) {
            throw new NullPointerException("Context must not be null");
        } else if (C2396.m12409()) {
            new C2555(context, r0).execute(new Void[0]);
        } else {
            throw new IllegalStateException("Must be called on the UI thread");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C0452 m4766(String str) {
        FirebaseApp instance = FirebaseApp.getInstance();
        if (instance != null) {
            C0709 r0 = (C0709) instance.m1077(C0709.class);
            if (r0 != null) {
                return r0.m5821(str);
            }
            throw new NullPointerException("Functions component does not exist.");
        }
        throw new NullPointerException("You must call FirebaseApp.initializeApp first.");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3139 m4773(String str) {
        return new C3139(this, str);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private URL m4769(String str) {
        try {
            return new URL(String.format(this.f4066, new Object[]{this.f4068, this.f4064, str}));
        } catch (MalformedURLException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0329<C0757> m4772(String str, Object obj, C0804 r5) {
        return f4062.f14555.m4419(new C1400(this)).m4419(new C1596(this, str, obj, r5));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static /* synthetic */ C0329 m4768(C0452 r2, String str, Object obj, C0804 r5, C0329 r6) {
        if (!r6.m4421()) {
            Exception r22 = r6.m4406();
            C0770 r3 = new C0770();
            r3.m6073(r22);
            return r3;
        }
        C2398 r62 = (C2398) r6.m4401();
        if (str != null) {
            URL r32 = r2.m4769(str);
            HashMap hashMap = new HashMap();
            hashMap.put("data", r2.f4063.m10909(obj));
            Request.Builder post = new Request.Builder().url(r32).post(RequestBody.create(MediaType.parse(C3273am.f1530), new JSONObject(hashMap).toString()));
            if (r62.f10954 != null) {
                StringBuilder sb = new StringBuilder("Bearer ");
                sb.append(r62.f10954);
                post = post.header("Authorization", sb.toString());
            }
            if (r62.f10953 != null) {
                post = post.header("Firebase-Instance-ID-Token", r62.f10953);
            }
            Call newCall = r2.f4067.newBuilder().callTimeout(r5.f5285, r5.f5284).readTimeout(r5.f5285, r5.f5284).build().newCall(post.build());
            final C3203 r4 = new C3203();
            newCall.enqueue(new Callback() {
                public final void onFailure(Call call, IOException iOException) {
                    if (iOException instanceof InterruptedIOException) {
                        String name = C0311.C0312.DEADLINE_EXCEEDED.name();
                        C0311.C0312 r1 = C0311.C0312.DEADLINE_EXCEEDED;
                        r4.f14555.m6073((Exception) new C0311(name, (Throwable) iOException));
                        return;
                    }
                    String name2 = C0311.C0312.INTERNAL.name();
                    C0311.C0312 r12 = C0311.C0312.INTERNAL;
                    r4.f14555.m6073((Exception) new C0311(name2, (Throwable) iOException));
                }

                public final void onResponse(Call call, Response response) {
                    C0311.C0312 r2 = C0311.C0312.m4382(response.code());
                    String string = response.body().string();
                    C0311 r22 = C0311.m4381(r2, string, C0452.this.f4063);
                    if (r22 != null) {
                        r4.f14555.m6073((Exception) r22);
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        Object opt = jSONObject.opt("data");
                        if (opt == null) {
                            opt = jSONObject.opt("result");
                        }
                        if (opt == null) {
                            C0311.C0312 r3 = C0311.C0312.INTERNAL;
                            r4.f14555.m6073((Exception) new C0311("Response is missing data field."));
                            return;
                        }
                        r4.f14555.m6079(new C0757(C0452.this.f4063.m10908(opt)));
                    } catch (JSONException e) {
                        C0311.C0312 r0 = C0311.C0312.INTERNAL;
                        r4.f14555.m6073((Exception) new C0311("Response is not valid JSON object.", (Throwable) e));
                    }
                }
            });
            return r4.f14555;
        }
        throw new NullPointerException("name cannot be null");
    }
}
