package sg.gov.tech.bluetrace.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import o.C0329;
import o.C0452;
import o.C0757;
import o.C0779;
import o.C0949;
import o.C0950;
import o.C1277;
import o.C2424;
import o.C3122;
import o.C3149;
import o.C3153;
import o.C3166;
import o.C3191;
import o.C3326cg;
import o.C3330ck;
import o.C3338cq;
import o.C3339cr;
import o.C3401fc;
import o.C3577lt;
import o.C3583lz;
import o.R;
import o.bZ;
import o.cV;
import o.dA;
import o.dN;
import o.fM;
import o.fU;
import o.gL;
import o.lA;
import sg.gov.tech.bluetrace.BuildConfig;
import sg.gov.tech.bluetrace.status.persistence.StatusRecord;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u00002\u00020&B\u0007¢\u0006\u0004\b%\u0010\u001bJ\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0011J-\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u001d¢\u0006\u0004\b\f\u0010\u001fJ;\u0010\b\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001c2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\"0 2\b\u0010#\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010$R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lsg/gov/tech/bluetrace/fragment/EnterPinFragment;", "", "ǃ", "Ljava/lang/String;", "Lo/cg;", "Ι", "Lo/cg;", "Landroid/widget/TextView;", "ɩ", "Landroid/widget/TextView;", "ι", "Landroid/view/LayoutInflater;", "ı", "Landroid/view/LayoutInflater;", "p0", "Lo/ıə;", "Lo/ƚյ;", "(Ljava/lang/String;)Lo/ıə;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroy", "()V", "Landroid/content/Context;", "Ljava/io/File;", "Lo/ж;", "(Landroid/content/Context;Ljava/io/File;)Lo/ж;", "", "Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;", "Lsg/gov/tech/bluetrace/status/persistence/StatusRecord;", "p3", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lo/ж;", "<init>", "Lo/ɩʟ;"}, k = 1, mv = {1, 1, 16})
public final class EnterPinFragment extends C1277 {

    /* renamed from: ı  reason: contains not printable characters */
    private LayoutInflater f14591;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public String f14592 = "UploadFragment";

    /* renamed from: ɩ  reason: contains not printable characters */
    private TextView f14593;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public C3326cg f14594;

    /* renamed from: ι  reason: contains not printable characters */
    private HashMap f14595;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m16177();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m16177() {
        HashMap hashMap = this.f14595;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final /* synthetic */ TextView m16172(EnterPinFragment enterPinFragment) {
        TextView textView = enterPinFragment.f14593;
        if (textView == null) {
            fM.m2253("errorMessage");
        }
        return textView;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fM.m2254(layoutInflater, "");
        this.f14591 = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.f169262131558470, viewGroup, false);
        final fU.C0174 r2 = new fU.C0174();
        r2.f2170 = (EditText) inflate.findViewById(R.id.f168072131362431);
        View findViewById = inflate.findViewById(R.id.f165162131362034);
        fM.m2252((Object) findViewById, "");
        this.f14593 = (TextView) findViewById;
        ((EditText) r2.f2170).addTextChangedListener(new C3220(inflate));
        ((Button) inflate.findViewById(R.id.f164402131361916)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: ı  reason: contains not printable characters */
            final /* synthetic */ EnterPinFragment f14599;

            {
                this.f14599 = r1;
            }

            public final void onClick(View view) {
                System.out.println("onclick is pressed");
                EnterPinFragment.m16172(this.f14599).setVisibility(4);
                C1277 parentFragment = this.f14599.getParentFragment();
                if (parentFragment != null) {
                    ((UploadFragment) parentFragment).m16225();
                    bZ r4 = bZ.m1737(AnonymousClass1.f14600);
                    fM.m2252((Object) r4, "");
                    bZ r1 = bZ.m1737(AnonymousClass4.f14607);
                    fM.m2252((Object) r1, "");
                    this.f14599.f14594 = bZ.m1736(r4, r1, new C3339cr<List<? extends StreetPassRecord>, List<? extends StatusRecord>, C3583lz>() {
                        /* renamed from: ι  reason: contains not printable characters */
                        public final C3583lz m16185(List<StreetPassRecord> list, List<StatusRecord> list2) {
                            fM.m2254(list, "");
                            fM.m2254(list2, "");
                            return new C3583lz(list, list2);
                        }
                    }).m1740(C3330ck.m1971()).m1738(cV.m1934()).m1741(new C3338cq<C3583lz>(this) {

                        /* renamed from: ι  reason: contains not printable characters */
                        final /* synthetic */ AnonymousClass3 f14601;

                        {
                            this.f14601 = r1;
                        }

                        /* renamed from: ı  reason: contains not printable characters */
                        public final void m16181(final C3583lz lzVar) {
                            String r0 = this.f14601.f14599.f14592;
                            Log.d(r0, "records: " + lzVar.m3718());
                            String r02 = this.f14601.f14599.f14592;
                            Log.d(r02, "status: " + lzVar.m3717());
                            EnterPinFragment enterPinFragment = this.f14601.f14599;
                            EditText editText = (EditText) r2.f2170;
                            fM.m2252((Object) editText, "");
                            enterPinFragment.m16178(editText.getText().toString()).m4420(new C3153<C0757>(this) {

                                /* renamed from: ɩ  reason: contains not printable characters */
                                final /* synthetic */ AnonymousClass2 f14603;

                                {
                                    this.f14603 = r1;
                                }

                                /* renamed from: ɩ  reason: contains not printable characters */
                                public final void onSuccess(C0757 r5) {
                                    fM.m2252((Object) r5, "");
                                    Object r52 = r5.m6030();
                                    if (r52 != null) {
                                        try {
                                            String str = (String) ((HashMap) r52).get("token");
                                            lA.C0215 r0 = lA.f2728;
                                            String r1 = this.f14603.f14601.f14599.f14592;
                                            r0.m3368(r1, "uploadToken: " + str);
                                            this.f14603.f14601.f14599.m16176(C3577lt.f2990.m3684(), lzVar.m3718(), lzVar.m3717(), str).m7065((C3191) new C3191(this) {

                                                /* renamed from: ɩ  reason: contains not printable characters */
                                                final /* synthetic */ AnonymousClass2 f14605;

                                                {
                                                    this.f14605 = r1;
                                                }

                                                public final void onFailure(Exception exc) {
                                                    fM.m2254(exc, "");
                                                    lA.f2728.m3368(this.f14605.f14603.f14601.f14599.f14592, "failed to upload");
                                                    C1277 parentFragment = this.f14605.f14603.f14601.f14599.getParentFragment();
                                                    if (parentFragment != null) {
                                                        ((UploadFragment) parentFragment).m16220();
                                                        EnterPinFragment.m16172(this.f14605.f14603.f14601.f14599).setVisibility(0);
                                                        return;
                                                    }
                                                    throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.fragment.UploadFragment");
                                                }
                                            }).m7072(new C3153<C2424.If>(this) {

                                                /* renamed from: ɩ  reason: contains not printable characters */
                                                final /* synthetic */ AnonymousClass2 f14604;

                                                {
                                                    this.f14604 = r1;
                                                }

                                                /* renamed from: ǃ  reason: contains not printable characters */
                                                public final void onSuccess(C2424.If ifR) {
                                                    lA.f2728.m3368(this.f14604.f14603.f14601.f14599.f14592, "uploaded successfully");
                                                    C1277 parentFragment = this.f14604.f14603.f14601.f14599.getParentFragment();
                                                    if (parentFragment != null) {
                                                        UploadFragment uploadFragment = (UploadFragment) parentFragment;
                                                        uploadFragment.m16220();
                                                        uploadFragment.m16223();
                                                        return;
                                                    }
                                                    throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.fragment.UploadFragment");
                                                }
                                            });
                                        } catch (Throwable th) {
                                            lA.C0215 r02 = lA.f2728;
                                            String r12 = this.f14603.f14601.f14599.f14592;
                                            r02.m3368(r12, "Failed to upload data: " + th.getMessage());
                                            C1277 parentFragment = this.f14603.f14601.f14599.getParentFragment();
                                            if (parentFragment != null) {
                                                ((UploadFragment) parentFragment).m16220();
                                                EnterPinFragment.m16172(this.f14603.f14601.f14599).setVisibility(0);
                                                return;
                                            }
                                            throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.fragment.UploadFragment");
                                        }
                                    } else {
                                        throw new dA("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
                                    }
                                }
                            }).m4414((C3191) new C3191(this) {

                                /* renamed from: ǃ  reason: contains not printable characters */
                                final /* synthetic */ AnonymousClass2 f14606;

                                {
                                    this.f14606 = r1;
                                }

                                public final void onFailure(Exception exc) {
                                    fM.m2254(exc, "");
                                    lA.f2728.m3368(this.f14606.f14601.f14599.f14592, "Invalid code");
                                    C1277 parentFragment = this.f14606.f14601.f14599.getParentFragment();
                                    if (parentFragment != null) {
                                        ((UploadFragment) parentFragment).m16220();
                                        EnterPinFragment.m16172(this.f14606.f14601.f14599).setVisibility(0);
                                        return;
                                    }
                                    throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.fragment.UploadFragment");
                                }
                            });
                        }
                    });
                    return;
                }
                throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.fragment.UploadFragment");
            }
        });
        ((LinearLayout) inflate.findViewById(R.id.f164672131361952)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: ǃ  reason: contains not printable characters */
            final /* synthetic */ EnterPinFragment f14608;

            {
                this.f14608 = r1;
            }

            public final void onClick(View view) {
                System.out.println("onclick is pressed");
                C1277 parentFragment = this.f14608.getParentFragment();
                if (parentFragment != null) {
                    ((UploadFragment) parentFragment).m16226();
                    return;
                }
                throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.fragment.UploadFragment");
            }
        });
        ((ImageButton) inflate.findViewById(R.id.f164662131361951)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: ι  reason: contains not printable characters */
            final /* synthetic */ EnterPinFragment f14609;

            {
                this.f14609 = r1;
            }

            public final void onClick(View view) {
                System.out.println("onclick is pressed");
                C1277 parentFragment = this.f14609.getParentFragment();
                if (parentFragment != null) {
                    ((UploadFragment) parentFragment).m16226();
                    return;
                }
                throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.fragment.UploadFragment");
            }
        });
        return inflate;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u000eJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lsg/gov/tech/bluetrace/fragment/EnterPinFragment$ı;", "Landroid/text/Editable;", "p0", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "p1", "p2", "p3", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "onTextChanged", "Landroid/text/TextWatcher;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: sg.gov.tech.bluetrace.fragment.EnterPinFragment$ı  reason: contains not printable characters */
    public static final class C3220 implements TextWatcher {

        /* renamed from: ι  reason: contains not printable characters */
        final /* synthetic */ View f14610;

        public final void afterTextChanged(Editable editable) {
            fM.m2254(editable, "");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            fM.m2254(charSequence, "");
        }

        C3220(View view) {
            this.f14610 = view;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            fM.m2254(charSequence, "");
            if (charSequence.length() == 6) {
                Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                View view = this.f14610;
                fM.m2252((Object) view, "");
                Context context = view.getContext();
                fM.m2252((Object) context, "");
                View view2 = this.f14610;
                fM.m2252((Object) view2, "");
                try {
                    Object[] objArr = new Object[2];
                    objArr[1] = view2;
                    objArr[0] = context;
                    ((Class) C3166.m16013(4, 12, 45444)).getMethod("ι", new Class[]{Context.class, View.class}).invoke(obj, objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C3326cg cgVar = this.f14594;
        if (cgVar != null) {
            cgVar.m1959();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<C0757> m16178(String str) {
        fM.m2254(str, "");
        C0452 r1 = C0452.m4766("asia-east2");
        fM.m2252((Object) r1, "");
        C0329<C0757> r4 = r1.m4773("getUploadToken").m15906(str);
        fM.m2252((Object) r4, "");
        return r4;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2424 m16176(Context context, List<StreetPassRecord> list, List<StatusRecord> list2, String str) {
        List<StreetPassRecord> list3 = list;
        List<StatusRecord> list4 = list2;
        fM.m2254(context, "");
        fM.m2254(list3, "");
        fM.m2254(list4, "");
        try {
            String str2 = (String) ((Class) C3166.m16013(4, 12, 45444)).getMethod("ι", new Class[]{Long.TYPE}).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), new Object[]{Long.valueOf(System.currentTimeMillis())});
            C3122 r6 = new C3122();
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            Iterable<StreetPassRecord> iterable = list3;
            Collection arrayList = new ArrayList(dN.m2074(iterable, 10));
            for (StreetPassRecord streetPassRecord : iterable) {
                streetPassRecord.setTimestamp(streetPassRecord.getTimestamp() / ((long) 1000));
                arrayList.add(streetPassRecord);
                Context context2 = context;
            }
            List list5 = (List) arrayList;
            Iterable<StatusRecord> iterable2 = list4;
            Collection arrayList2 = new ArrayList(dN.m2074(iterable2, 10));
            for (StatusRecord statusRecord : iterable2) {
                statusRecord.setTimestamp(statusRecord.getTimestamp() / ((long) 1000));
                arrayList2.add(statusRecord);
            }
            List list6 = (List) arrayList2;
            Map hashMap = new HashMap();
            if (str != null) {
                hashMap.put("token", str);
                hashMap.put("records", list5);
                hashMap.put("events", list6);
                String r0 = r6.m15836(hashMap);
                String str5 = "StreetPassRecord_" + str3 + '_' + str4 + '_' + str2 + ".json";
                File file = new File(context.getFilesDir(), "upload");
                if (file.exists()) {
                    C3401fc.m2295(file);
                }
                file.mkdirs();
                File file2 = new File(file, str5);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fM.m2252((Object) r0, "");
                Charset charset = gL.f2204;
                if (r0 != null) {
                    byte[] bytes = r0.getBytes(charset);
                    fM.m2252((Object) bytes, "");
                    fileOutputStream.write(bytes);
                    fileOutputStream.close();
                    lA.f2728.m3369(this.f14592, "File wrote: " + file2.getAbsolutePath());
                    return m16175(context, file2);
                }
                throw new dA("null cannot be cast to non-null type java.lang.String");
            }
            throw new dA("null cannot be cast to non-null type java.lang.Object");
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C2424 m16175(Context context, final File file) {
        fM.m2254(context, "");
        fM.m2254(file, "");
        lA.f2728.m3368(this.f14592, "Uploading to Cloud Storage");
        C0949 r1 = C0949.m6849("gs://" + BuildConfig.FIREBASE_UPLOAD_BUCKET);
        fM.m2252((Object) r1, "");
        C0950 r12 = r1.m6851("gs://" + BuildConfig.FIREBASE_UPLOAD_BUCKET);
        fM.m2252((Object) r12, "");
        String format = new SimpleDateFormat("YYYYMMdd").format(new Date());
        C0950 r13 = r12.m6853("streetPassRecords/" + format + '/' + file.getName());
        fM.m2252((Object) r13, "");
        Uri r6 = C0779.m6107(context, "sg.gov.tech.bluetrace.fileprovider", file);
        fM.m2252((Object) r6, "");
        C2424 r62 = r13.m6852(r6);
        fM.m2252((Object) r62, "");
        r62.m7057(new C3149<C2424.If>(this) {

            /* renamed from: ı  reason: contains not printable characters */
            final /* synthetic */ EnterPinFragment f14597;

            {
                this.f14597 = r1;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m16179(C0329<C2424.If> r3) {
                fM.m2254(r3, "");
                try {
                    file.delete();
                    lA.f2728.m3369(this.f14597.f14592, "upload file deleted");
                } catch (Exception unused) {
                    lA.f2728.m3375(this.f14597.f14592, "Failed to delete upload file");
                }
            }
        });
        return r62;
    }
}
