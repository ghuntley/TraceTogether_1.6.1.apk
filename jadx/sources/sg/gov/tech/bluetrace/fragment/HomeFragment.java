package sg.gov.tech.bluetrace.fragment;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C0329;
import o.C0353;
import o.C0876;
import o.C1269;
import o.C1277;
import o.C1514;
import o.C1955;
import o.C2039;
import o.C2512;
import o.C2713;
import o.C2915;
import o.C2963;
import o.C2967;
import o.C3148;
import o.C3149;
import o.C3166;
import o.C3357dj;
import o.C3360dn;
import o.C3361dp;
import o.C3377ee;
import o.C3409fk;
import o.C3413fo;
import o.C3428gc;
import o.C3444gs;
import o.C3532ka;
import o.C3538kg;
import o.C3570lk;
import o.C3573lo;
import o.C3575lq;
import o.C3577lt;
import o.R;
import o.dA;
import o.dB;
import o.dF;
import o.fM;
import o.fT;
import o.fV;
import o.lA;
import o.lL;
import o.lN;
import sg.gov.tech.bluetrace.status.persistence.StatusRecord;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecordDatabase;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\u0018\u00002\u00020CB\u0007¢\u0006\u0004\bB\u0010)J\u000f\u0010\u000e\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u000e\u0010'J\u000f\u0010\u001f\u001a\u00020(H\u0002¢\u0006\u0004\b\u001f\u0010)J\u000f\u0010\t\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\t\u0010'J\u0019\u0010,\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J)\u00102\u001a\u00020(2\u0006\u0010+\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J-\u00106\u001a\u0004\u0018\u00010 2\u0006\u0010+\u001a\u0002042\b\u0010/\u001a\u0004\u0018\u0001052\b\u00101\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020(H\u0016¢\u0006\u0004\b8\u0010)J\u000f\u00109\u001a\u00020(H\u0016¢\u0006\u0004\b9\u0010)J/\u0010<\u001a\u00020(2\u0006\u0010+\u001a\u00020.2\u000e\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010:2\u0006\u00101\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020(H\u0016¢\u0006\u0004\b>\u0010)J!\u0010?\u001a\u00020(2\u0006\u0010+\u001a\u00020 2\b\u0010/\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020(H\u0007¢\u0006\u0004\bA\u0010)J\u000f\u0010\u0002\u001a\u00020(H\u0002¢\u0006\u0004\b\u0002\u0010)J\u000f\u0010\u0010\u001a\u00020(H\u0002¢\u0006\u0004\b\u0010\u0010)J\r\u0010\u0015\u001a\u00020(¢\u0006\u0004\b\u0015\u0010)R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u001f\u0010\t\u001a\u0004\u0018\u00010\u00048C@\u0002X\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\u001b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0016\u0010\u0007\u001a\u00020 8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u001a\u0010&\u001a\u00020\u0019*\u00020\u00048C@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010%"}, d2 = {"Lsg/gov/tech/bluetrace/fragment/HomeFragment;", "", "ı", "Ljava/lang/String;", "Landroid/bluetooth/BluetoothAdapter;", "ɪ", "Lo/dj;", "Ӏ", "()Landroid/bluetooth/BluetoothAdapter;", "Ι", "Landroidx/lifecycle/LiveData;", "Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;", "і", "Landroidx/lifecycle/LiveData;", "ɩ", "Lsg/gov/tech/bluetrace/status/persistence/StatusRecord;", "І", "ι", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "ɾ", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "ǃ", "Landroid/content/BroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Ɩ", "", "Z", "Lo/ιϰ;", "Lo/ιϰ;", "Lo/lN;", "Lo/lN;", "ɹ", "Landroid/view/View;", "Landroid/view/View;", "Lo/lL;", "Lo/lL;", "ɨ", "(Landroid/bluetooth/BluetoothAdapter;)Z", "ӏ", "()Z", "", "()V", "Landroid/os/Bundle;", "p0", "onActivityCreated", "(Landroid/os/Bundle;)V", "", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "onPause", "", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setupPermissionsAndSettings", "<init>", "Lo/ɩʟ;"}, k = 1, mv = {1, 1, 16})
public final class HomeFragment extends C1277 {

    /* renamed from: ɩ  reason: contains not printable characters */
    static final /* synthetic */ C3444gs[] f14624 = {C3428gc.m2386((fV) new fT(C3428gc.m2389(HomeFragment.class), "bluetoothAdapter", "getBluetoothAdapter()Landroid/bluetooth/BluetoothAdapter;"))};
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final String f14625 = "HomeFragment";

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final lN f14626 = new lN(new C3413fo<Context, dF>(this) {

        /* renamed from: ı  reason: contains not printable characters */
        final /* synthetic */ HomeFragment f14640;

        {
            this.f14640 = r1;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ Object m16212(Object obj) {
            m16211((Context) obj);
            return dF.f2032;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m16211(Context context) {
            if (HomeFragment.m16201(this.f14640) != null) {
                HomeFragment.m16201(this.f14640).post(new Runnable(this) {

                    /* renamed from: ι  reason: contains not printable characters */
                    final /* synthetic */ AnonymousClass14 f14641;

                    {
                        this.f14641 = r1;
                    }

                    public final void run() {
                        HomeFragment.m16201(this.f14641.f14640).setVisibility(0);
                        HomeFragment.m16201(this.f14641.f14640).setEnabled(true);
                    }
                });
            }
        }
    });

    /* renamed from: ǃ  reason: contains not printable characters */
    private View f14627;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final C3357dj f14628 = C3360dn.m2105(C3361dp.NONE, new C3409fk<BluetoothAdapter>(this) {

        /* renamed from: ǃ  reason: contains not printable characters */
        final /* synthetic */ HomeFragment f14644;

        {
            this.f14644 = r1;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final BluetoothAdapter invoke() {
            C1269 activity = this.f14644.getActivity();
            if (activity != null) {
                Object systemService = ((C3573lo) activity).getSystemService("bluetooth");
                if (systemService != null) {
                    return ((BluetoothManager) systemService).getAdapter();
                }
                throw new dA("null cannot be cast to non-null type android.bluetooth.BluetoothManager");
            }
            throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.NewMainActivity");
        }
    });

    /* renamed from: ɹ  reason: contains not printable characters */
    private final lL f14629 = new lL(new C3413fo<Context, dF>(this) {

        /* renamed from: ι  reason: contains not printable characters */
        final /* synthetic */ HomeFragment f14642;

        {
            this.f14642 = r1;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ Object m16213(Object obj) {
            m16214((Context) obj);
            return dF.f2032;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m16214(Context context) {
            if (HomeFragment.m16201(this.f14642) != null) {
                HomeFragment.m16201(this.f14642).post(new Runnable(this) {

                    /* renamed from: ǃ  reason: contains not printable characters */
                    final /* synthetic */ AnonymousClass15 f14643;

                    {
                        this.f14643 = r1;
                    }

                    public final void run() {
                        HomeFragment.m16201(this.f14643.f14642).setVisibility(8);
                        HomeFragment.m16201(this.f14643.f14642).setEnabled(true);
                    }
                });
            }
        }
    });

    /* renamed from: ɾ  reason: contains not printable characters */
    private SharedPreferences.OnSharedPreferenceChangeListener f14630 = new SharedPreferences.OnSharedPreferenceChangeListener(this) {

        /* renamed from: ǃ  reason: contains not printable characters */
        final /* synthetic */ HomeFragment f14647;

        {
            this.f14647 = r1;
        }

        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (str != null && str.hashCode() == -1820904121 && str.equals("ANNOUNCEMENT")) {
                this.f14647.m16202();
            }
        }
    };

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean f14631;

    /* renamed from: ι  reason: contains not printable characters */
    private C2039 f14632;

    /* renamed from: І  reason: contains not printable characters */
    private LiveData<StatusRecord> f14633;

    /* renamed from: і  reason: contains not printable characters */
    private LiveData<StreetPassRecord> f14634;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final BroadcastReceiver f14635 = new If(this);

    /* renamed from: ӏ  reason: contains not printable characters */
    private HashMap f14636;

    @JvmName(name = "Ӏ")
    /* renamed from: Ӏ  reason: contains not printable characters */
    private final BluetoothAdapter m16203() {
        C3357dj djVar = this.f14628;
        C3444gs gsVar = f14624[0];
        return (BluetoothAdapter) djVar.m2098();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final View m16204(int i) {
        if (this.f14636 == null) {
            this.f14636 = new HashMap();
        }
        View view = (View) this.f14636.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f14636.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16206() {
        HashMap hashMap = this.f14636;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final /* synthetic */ View m16201(HomeFragment homeFragment) {
        View view = homeFragment.f14627;
        if (view == null) {
            fM.m2253("swiftmedRunning");
        }
        return view;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        fM.m2254(view, "");
        super.onViewCreated(view, bundle);
        StreetPassRecordDatabase.If ifR = StreetPassRecordDatabase.If;
        Context context = view.getContext();
        fM.m2252((Object) context, "");
        StreetPassRecordDatabase r8 = ifR.m16307(context);
        this.f14634 = r8.m16303().m3827();
        LiveData<StreetPassRecord> liveData = this.f14634;
        if (liveData == null) {
            fM.m2253("lastKnownRecord");
        }
        liveData.m196(getViewLifecycleOwner(), new C2915<StreetPassRecord>(this) {

            /* renamed from: ɩ  reason: contains not printable characters */
            final /* synthetic */ HomeFragment f14638;

            {
                this.f14638 = r1;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final void m16208(StreetPassRecord streetPassRecord) {
                if (streetPassRecord != null) {
                    C2967 r2 = (C2967) this.f14638.m16204(C3575lq.C0226.f2949);
                    fM.m2252((Object) r2, "");
                    if (!r2.m15249()) {
                        ((C2967) this.f14638.m16204(C3575lq.C0226.f2949)).m15248();
                    }
                }
            }
        });
        this.f14633 = r8.m16304().m3543("Scanning Started");
        LiveData<StatusRecord> liveData2 = this.f14633;
        if (liveData2 == null) {
            fM.m2253("lastKnownScanningStarted");
        }
        liveData2.m196(getViewLifecycleOwner(), new C2915<StatusRecord>(this) {

            /* renamed from: ǃ  reason: contains not printable characters */
            final /* synthetic */ HomeFragment f14639;

            {
                this.f14639 = r1;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m16210(StatusRecord statusRecord) {
                if (statusRecord != null) {
                    C1514 r0 = (C1514) this.f14639.m16204(C3575lq.C0226.f2953);
                    fM.m2252((Object) r0, "");
                    r0.setVisibility(0);
                    C1514 r02 = (C1514) this.f14639.m16204(C3575lq.C0226.f2953);
                    fM.m2252((Object) r02, "");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Last updated: ");
                    try {
                        sb.append((String) ((Class) C3166.m16013(4, 12, 45444)).getMethod("ɩ", new Class[]{Long.TYPE}).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), new Object[]{Long.valueOf(statusRecord.getTimestamp())}));
                        r02.setText(sb.toString());
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
        });
        m16205();
        Object obj = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
        C1269 activity = getActivity();
        if (activity == null) {
            fM.m2256();
        }
        fM.m2252((Object) activity, "");
        Context applicationContext = activity.getApplicationContext();
        fM.m2252((Object) applicationContext, "");
        try {
            Object[] objArr = new Object[2];
            objArr[1] = this.f14630;
            objArr[0] = applicationContext;
            ((Class) C3166.m16013(4, 8, 0)).getMethod("ı", new Class[]{Context.class, SharedPreferences.OnSharedPreferenceChangeListener.class}).invoke(obj, objArr);
            m16202();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fM.m2254(layoutInflater, "");
        View inflate = layoutInflater.inflate(R.layout.f169202131558463, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.f167552131362362);
        fM.m2252((Object) findViewById, "");
        this.f14627 = findViewById;
        View view = this.f14627;
        if (view == null) {
            fM.m2253("swiftmedRunning");
        }
        TextView textView = (TextView) view.findViewById(R.id.f167842131362399);
        if (textView != null) {
            textView.setText(C1955.m10678("<font color=\"#499dd6\">Trace</font><font color=\"#274a9f\">Together</font> is paused", 0));
        }
        View view2 = this.f14627;
        if (view2 == null) {
            fM.m2253("swiftmedRunning");
        }
        view2.setOnClickListener(AnonymousClass7.f14649);
        Object obj = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
        C1269 activity = getActivity();
        if (activity == null) {
            fM.m2256();
        }
        fM.m2252((Object) activity, "");
        Context applicationContext = activity.getApplicationContext();
        fM.m2252((Object) applicationContext, "");
        try {
            Object[] objArr = new Object[2];
            objArr[1] = this.f14630;
            objArr[0] = applicationContext;
            ((Class) C3166.m16013(4, 8, 0)).getMethod("ı", new Class[]{Context.class, SharedPreferences.OnSharedPreferenceChangeListener.class}).invoke(obj, objArr);
            return inflate;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((C2963) m16204(C3575lq.C0226.f2950)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: ɩ  reason: contains not printable characters */
            final /* synthetic */ HomeFragment f14645;

            {
                this.f14645 = r1;
            }

            public final void onClick(View view) {
                this.f14645.m16192();
            }
        });
        ((C2967) m16204(C3575lq.C0226.f2949)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: ɩ  reason: contains not printable characters */
            final /* synthetic */ HomeFragment f14637;

            {
                this.f14637 = r1;
            }

            public final void onClick(View view) {
            }
        });
        ((Button) m16204(C3575lq.C0226.f2951)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: ı  reason: contains not printable characters */
            final /* synthetic */ HomeFragment f14646;

            {
                this.f14646 = r1;
            }

            public final void onClick(View view) {
                Intent intent = new Intent(this.f14646.getContext(), C3570lk.class);
                intent.putExtra("page", 3);
                Context context = this.f14646.getContext();
                if (context != null) {
                    context.startActivity(intent);
                }
            }
        });
        ((ImageButton) m16204(C3575lq.C0226.f2958)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: ι  reason: contains not printable characters */
            final /* synthetic */ HomeFragment f14648;

            {
                this.f14648 = r1;
            }

            public final void onClick(View view) {
                this.f14648.m16198();
            }
        });
        this.f14632 = C3148.m15934(C0876.f5660);
        C2713 r4 = C3148.m15935(AnonymousClass8.f14650);
        C2039 r0 = this.f14632;
        if (r0 == null) {
            fM.m2253("remoteConfig");
        }
        r0.m10917(r4);
        C2039 r42 = this.f14632;
        if (r42 == null) {
            fM.m2253("remoteConfig");
        }
        r42.m10919((Map<String, Object>) C3377ee.m2208(dB.m2052("ShareText", getString(R.string.f171462131886320))));
        C2039 r43 = this.f14632;
        if (r43 == null) {
            fM.m2253("remoteConfig");
        }
        C0329<Boolean> r44 = r43.m10920();
        C1269 activity = getActivity();
        if (activity != null) {
            r44.m4417((Activity) activity, (C3149<Boolean>) new C3149<Boolean>(this) {

                /* renamed from: ι  reason: contains not printable characters */
                final /* synthetic */ HomeFragment f14651;

                {
                    this.f14651 = r1;
                }

                /* renamed from: ǃ  reason: contains not printable characters */
                public final void m16218(C0329<Boolean> r5) {
                    fM.m2254(r5, "");
                    if (r5.m4421()) {
                        lA.C0215 r0 = lA.f2728;
                        String r1 = this.f14651.f14625;
                        r0.m3368(r1, "Remote config fetch - success: " + r5.m4401());
                        return;
                    }
                    lA.f2728.m3368(this.f14651.f14625, "Remote config fetch - failed");
                }
            });
            return;
        }
        throw new dA("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean m16200() {
        if (m16196()) {
            ImageView imageView = (ImageView) m16204(C3575lq.C0226.f2960);
            fM.m2252((Object) imageView, "");
            if (!imageView.isSelected()) {
                return true;
            }
            ImageView imageView2 = (ImageView) m16204(C3575lq.C0226.f2961);
            fM.m2252((Object) imageView2, "");
            if (!imageView2.isSelected()) {
                return true;
            }
            ImageView imageView3 = (ImageView) m16204(C3575lq.C0226.f2959);
            fM.m2252((Object) imageView3, "");
            if (imageView3.isSelected()) {
                return false;
            }
            return true;
        }
        ImageView imageView4 = (ImageView) m16204(C3575lq.C0226.f2960);
        fM.m2252((Object) imageView4, "");
        if (!imageView4.isSelected()) {
            return true;
        }
        ImageView imageView5 = (ImageView) m16204(C3575lq.C0226.f2961);
        fM.m2252((Object) imageView5, "");
        if (imageView5.isSelected()) {
            return false;
        }
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean m16196() {
        Throwable cause;
        if (Build.VERSION.SDK_INT >= 23) {
            Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
            Object obj2 = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
            String packageName = C3577lt.f2990.m3684().getPackageName();
            fM.m2252((Object) packageName, "");
            try {
                Object invoke = ((Class) C3166.m16013(4, 12, 45444)).getMethod("ɩ", new Class[]{String.class}).invoke(obj2, new Object[]{packageName});
                try {
                    Object[] objArr = new Object[2];
                    objArr[1] = C3577lt.f2990.m3684().getPackageManager();
                    objArr[0] = invoke;
                    if (((Boolean) ((Class) C3166.m16013(4, 12, 45444)).getMethod("Ι", new Class[]{Intent.class, PackageManager.class}).invoke(obj, objArr)).booleanValue()) {
                        return true;
                    }
                } catch (Throwable th) {
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } finally {
                cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
            }
        }
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m16205() {
        Throwable cause;
        LinearLayout linearLayout = (LinearLayout) m16204(C3575lq.C0226.f2963);
        fM.m2252((Object) linearLayout, "");
        linearLayout.setVisibility(m16200() ? 0 : 8);
        LinearLayout linearLayout2 = (LinearLayout) m16204(C3575lq.C0226.f2957);
        fM.m2252((Object) linearLayout2, "");
        linearLayout2.setVisibility(m16200() ^ true ? 0 : 8);
        try {
            if (((Boolean) ((Class) C3166.m16013(4, 12, 45444)).getMethod("Ɩ", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), new Object[]{C3577lt.f2990.m3684()})).booleanValue()) {
                Context context = getContext();
                if (context != null) {
                    View view = this.f14627;
                    if (view == null) {
                        fM.m2253("swiftmedRunning");
                    }
                    view.setVisibility(0);
                    View view2 = this.f14627;
                    if (view2 == null) {
                        fM.m2253("swiftmedRunning");
                    }
                    view2.setEnabled(true);
                    Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                    fM.m2252((Object) context, "");
                    try {
                        ((Class) C3166.m16013(4, 12, 45444)).getMethod("І", new Class[]{Context.class}).invoke(obj, new Object[]{context});
                    } catch (Throwable th) {
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            } else if (getContext() != null) {
                View view3 = this.f14627;
                if (view3 == null) {
                    fM.m2253("swiftmedRunning");
                }
                view3.setVisibility(8);
                View view4 = this.f14627;
                if (view4 == null) {
                    fM.m2253("swiftmedRunning");
                }
                view4.setEnabled(true);
            }
        } finally {
            cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
        }
    }

    public final void onResume() {
        super.onResume();
        if (!this.f14631) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            C1269 activity = getActivity();
            if (activity == null) {
                fM.m2256();
            }
            activity.registerReceiver(this.f14635, intentFilter);
            C1269 activity2 = getActivity();
            if (activity2 == null) {
                fM.m2256();
            }
            activity2.registerReceiver(this.f14626, lN.f2755.m3405());
            C1269 activity3 = getActivity();
            if (activity3 == null) {
                fM.m2256();
            }
            activity3.registerReceiver(this.f14629, lL.f2750if.m3402());
            this.f14631 = true;
        }
        if (getView() != null) {
            try {
                Object[] objArr = (Object[]) ((Class) C3166.m16013(4, 12, 45444)).getMethod("ı", (Class[]) null).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), (Object[]) null);
                ImageView imageView = (ImageView) m16204(C3575lq.C0226.f2961);
                fM.m2252((Object) imageView, "");
                C1269 activity4 = getActivity();
                if (activity4 != null) {
                    imageView.setSelected(C3538kg.m3271((C3573lo) activity4, (String[]) Arrays.copyOf(objArr, objArr.length)));
                    ImageView imageView2 = (ImageView) m16204(C3575lq.C0226.f2956);
                    fM.m2252((Object) imageView2, "");
                    C1269 activity5 = getActivity();
                    if (activity5 != null) {
                        imageView2.setSelected(C0353.m4510((C3573lo) activity5).m4511());
                        BluetoothAdapter r0 = m16203();
                        if (r0 != null) {
                            ImageView imageView3 = (ImageView) m16204(C3575lq.C0226.f2960);
                            fM.m2252((Object) imageView3, "");
                            imageView3.setSelected(!m16197(r0));
                        }
                        C1269 activity6 = getActivity();
                        if (activity6 != null) {
                            Object systemService = ((C3573lo) activity6).getSystemService("power");
                            if (systemService != null) {
                                PowerManager powerManager = (PowerManager) systemService;
                                C1269 activity7 = getActivity();
                                if (activity7 != null) {
                                    String packageName = ((C3573lo) activity7).getPackageName();
                                    if (Build.VERSION.SDK_INT >= 23) {
                                        C2963 r4 = (C2963) m16204(C3575lq.C0226.f2954);
                                        fM.m2252((Object) r4, "");
                                        r4.setVisibility(0);
                                        if (!powerManager.isIgnoringBatteryOptimizations(packageName)) {
                                            ImageView imageView4 = (ImageView) m16204(C3575lq.C0226.f2959);
                                            fM.m2252((Object) imageView4, "");
                                            imageView4.setSelected(false);
                                            lA.f2728.m3368(this.f14625, "Not on Battery Optimization whitelist");
                                        } else {
                                            ImageView imageView5 = (ImageView) m16204(C3575lq.C0226.f2959);
                                            fM.m2252((Object) imageView5, "");
                                            imageView5.setSelected(true);
                                            lA.f2728.m3368(this.f14625, "On Battery Optimization whitelist");
                                        }
                                    } else {
                                        C2963 r02 = (C2963) m16204(C3575lq.C0226.f2954);
                                        fM.m2252((Object) r02, "");
                                        r02.setVisibility(8);
                                    }
                                    m16205();
                                    return;
                                }
                                throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.NewMainActivity");
                            }
                            throw new dA("null cannot be cast to non-null type android.os.PowerManager");
                        }
                        throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.NewMainActivity");
                    }
                    throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.NewMainActivity");
                }
                throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.NewMainActivity");
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.f14631) {
            C1269 activity = getActivity();
            if (activity == null) {
                fM.m2256();
            }
            activity.unregisterReceiver(this.f14635);
            C1269 activity2 = getActivity();
            if (activity2 == null) {
                fM.m2256();
            }
            activity2.unregisterReceiver(this.f14626);
            C1269 activity3 = getActivity();
            if (activity3 == null) {
                fM.m2256();
            }
            activity3.unregisterReceiver(this.f14629);
            this.f14631 = false;
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        Object obj = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
        C1269 activity = getActivity();
        if (activity == null) {
            fM.m2256();
        }
        fM.m2252((Object) activity, "");
        Context applicationContext = activity.getApplicationContext();
        fM.m2252((Object) applicationContext, "");
        try {
            Object[] objArr = new Object[2];
            objArr[1] = this.f14630;
            objArr[0] = applicationContext;
            ((Class) C3166.m16013(4, 8, 0)).getMethod("ι", new Class[]{Context.class, SharedPreferences.OnSharedPreferenceChangeListener.class}).invoke(obj, objArr);
            LiveData<StreetPassRecord> liveData = this.f14634;
            if (liveData == null) {
                fM.m2253("lastKnownRecord");
            }
            liveData.m192(getViewLifecycleOwner());
            LiveData<StatusRecord> liveData2 = this.f14633;
            if (liveData2 == null) {
                fM.m2253("lastKnownScanningStarted");
            }
            liveData2.m192(getViewLifecycleOwner());
            m16206();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m16192() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", getString(R.string.f170322131886110));
        C2039 r1 = this.f14632;
        if (r1 == null) {
            fM.m2253("remoteConfig");
        }
        String r12 = r1.m10918("ShareText");
        fM.m2252((Object) r12, "");
        intent.putExtra("android.intent.extra.TEXT", r12);
        startActivity(Intent.createChooser(intent, "choose one"));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\bJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsg/gov/tech/bluetrace/fragment/HomeFragment$If;", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Landroid/content/BroadcastReceiver;"}, k = 1, mv = {1, 1, 16})
    public static final class If extends BroadcastReceiver {

        /* renamed from: Ι  reason: contains not printable characters */
        final /* synthetic */ HomeFragment f14652;

        If(HomeFragment homeFragment) {
            this.f14652 = homeFragment;
        }

        public final void onReceive(Context context, Intent intent) {
            fM.m2254(context, "");
            fM.m2254(intent, "");
            if (fM.m2257(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                if (intExtra == 10) {
                    ImageView imageView = (ImageView) this.f14652.m16204(C3575lq.C0226.f2960);
                    fM.m2252((Object) imageView, "");
                    imageView.setSelected(false);
                } else if (intExtra == 13) {
                    ImageView imageView2 = (ImageView) this.f14652.m16204(C3575lq.C0226.f2960);
                    fM.m2252((Object) imageView2, "");
                    imageView2.setSelected(false);
                } else if (intExtra == 12) {
                    ImageView imageView3 = (ImageView) this.f14652.m16204(C3575lq.C0226.f2960);
                    fM.m2252((Object) imageView3, "");
                    imageView3.setSelected(true);
                }
                this.f14652.m16205();
            }
        }
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean m16197(BluetoothAdapter bluetoothAdapter) {
        return !bluetoothAdapter.isEnabled();
    }

    @C3532ka(m3258 = 456)
    public final void setupPermissionsAndSettings() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Object[] objArr = (Object[]) ((Class) C3166.m16013(4, 12, 45444)).getMethod("ı", (Class[]) null).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), (Object[]) null);
                C1269 activity = getActivity();
                if (activity == null) {
                    throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.NewMainActivity");
                } else if (!C3538kg.m3271((C3573lo) activity, (String[]) Arrays.copyOf(objArr, objArr.length))) {
                    C3538kg.m3268(this, getString(R.string.f171032131886260), 456, (String[]) Arrays.copyOf(objArr, objArr.length));
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 123) {
            ImageView imageView = (ImageView) m16204(C3575lq.C0226.f2960);
            fM.m2252((Object) imageView, "");
            imageView.setSelected(i2 == -1);
        }
        m16205();
        super.onActivityResult(i, i2, intent);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        fM.m2254(strArr, "");
        fM.m2254(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        lA.C0215 r7 = lA.f2728;
        String str = this.f14625;
        r7.m3368(str, "[onRequestPermissionsResult]requestCode " + i);
        if (i == 456) {
            ImageView imageView = (ImageView) m16204(C3575lq.C0226.f2961);
            fM.m2252((Object) imageView, "");
            imageView.setSelected(!(strArr.length == 0));
        }
        m16205();
    }

    /* access modifiers changed from: private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m16198() {
        C2512 r0 = (C2512) m16204(C3575lq.C0226.f2952);
        fM.m2252((Object) r0, "");
        r0.setVisibility(8);
        Object obj = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
        C1269 activity = getActivity();
        if (activity == null) {
            fM.m2256();
        }
        fM.m2252((Object) activity, "");
        Context applicationContext = activity.getApplicationContext();
        fM.m2252((Object) applicationContext, "");
        try {
            Object[] objArr = new Object[2];
            objArr[1] = "";
            objArr[0] = applicationContext;
            ((Class) C3166.m16013(4, 8, 0)).getMethod("ɩ", new Class[]{Context.class, String.class}).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: І  reason: contains not printable characters */
    public final void m16202() {
        Object obj = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
        C1269 activity = getActivity();
        if (activity == null) {
            fM.m2256();
        }
        fM.m2252((Object) activity, "");
        Context applicationContext = activity.getApplicationContext();
        fM.m2252((Object) applicationContext, "");
        boolean z = true;
        try {
            String str = (String) ((Class) C3166.m16013(4, 8, 0)).getMethod("І", new Class[]{Context.class}).invoke(obj, new Object[]{applicationContext});
            if (str.length() != 0) {
                z = false;
            }
            if (!z) {
                lA.C0215 r1 = lA.f2728;
                String str2 = this.f14625;
                r1.m3368(str2, "FCM Announcement Changed to " + str + '!');
                C1514 r12 = (C1514) m16204(C3575lq.C0226.f2955);
                fM.m2252((Object) r12, "");
                r12.setText(C1955.m10678(str, 63));
                C1514 r0 = (C1514) m16204(C3575lq.C0226.f2955);
                fM.m2252((Object) r0, "");
                r0.setMovementMethod(new C3221(this));
                C2512 r02 = (C2512) m16204(C3575lq.C0226.f2952);
                fM.m2252((Object) r02, "");
                r02.setVisibility(0);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\nJ-\u0010\b\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lsg/gov/tech/bluetrace/fragment/HomeFragment$ɩ;", "Landroid/widget/TextView;", "p0", "Landroid/text/Spannable;", "p1", "Landroid/view/MotionEvent;", "p2", "", "onTouchEvent", "(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z", "Landroid/text/method/LinkMovementMethod;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.fragment.HomeFragment$ɩ  reason: contains not printable characters */
    public static final class C3221 extends LinkMovementMethod {

        /* renamed from: Ι  reason: contains not printable characters */
        final /* synthetic */ HomeFragment f14653;

        C3221(HomeFragment homeFragment) {
            this.f14653 = homeFragment;
        }

        public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            if (!(motionEvent == null || motionEvent.getAction() != 1 || textView == null || spannable == null)) {
                float x = (motionEvent.getX() - ((float) textView.getTotalPaddingLeft())) + ((float) textView.getScrollX());
                float y = (motionEvent.getY() - ((float) textView.getTotalPaddingTop())) + ((float) textView.getScrollY());
                Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) y), x);
                Object[] spans = spannable.getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
                fM.m2252((Object) spans, "");
                if (!(((URLSpan[]) spans).length == 0)) {
                    this.f14653.m16198();
                }
            }
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
    }
}
