package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
import kotlin.Metadata;
import o.C0638;
import o.C3576ls;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0018\u00002\u00020\u0012B\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\r\u0010\u0002\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/ln;", "", "Ι", "I", "ɩ", "Lo/mm;", "ǃ", "Lo/mm;", "ι", "", "ı", "()V", "()I", "Landroid/os/Bundle;", "p0", "onCreate", "(Landroid/os/Bundle;)V", "<init>", "Lo/ɹ;"}, k = 1, mv = {1, 1, 16})
/* renamed from: o.ln  reason: case insensitive filesystem */
public final class C3572ln extends C1459 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3600mm f2922;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f2923;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final /* synthetic */ C3600mm m3624(C3572ln lnVar) {
        C3600mm mmVar = lnVar.f2922;
        if (mmVar == null) {
            fM.m2253("viewModel");
        }
        return mmVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m3626();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3626() {
        setContentView((int) R.layout.f169002131558443);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.f166402131362221);
        Context context = this;
        final C3576ls lsVar = new C3576ls(context);
        fM.m2252((Object) recyclerView, "");
        recyclerView.setAdapter(lsVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new C0918(recyclerView.getContext(), linearLayoutManager.m303()));
        C0326 r0 = new C3169(this).m16018(C3600mm.class);
        fM.m2252((Object) r0, "");
        this.f2922 = (C3600mm) r0;
        C3600mm mmVar = this.f2922;
        if (mmVar == null) {
            fM.m2253("viewModel");
        }
        mmVar.m3910().m196(this, new C2915<List<? extends StreetPassRecord>>() {
            /* renamed from: ι  reason: contains not printable characters */
            public final void m3629(List<StreetPassRecord> list) {
                C3576ls lsVar = lsVar;
                fM.m2252((Object) list, "");
                lsVar.m3659(list);
            }
        });
        ((FloatingActionButton) findViewById(R.id.f165172131362042)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: ı  reason: contains not printable characters */
            final /* synthetic */ C3572ln f2927;

            {
                this.f2927 = r1;
            }

            public final void onClick(View view) {
                if (C3572ln.m3624(this.f2927).m3910().m197() != null) {
                    lsVar.m3669(C3576ls.C0227.ALL);
                }
            }
        });
        ((FloatingActionButton) findViewById(R.id.f164892131361992)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: ι  reason: contains not printable characters */
            final /* synthetic */ C3572ln f2930;

            {
                this.f2930 = r1;
            }

            public final void onClick(View view) {
                if (C3572ln.m3624(this.f2930).m3910().m197() != null) {
                    lsVar.m3669(C3576ls.C0227.COLLAPSE);
                }
            }
        });
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.f167482131362353);
        floatingActionButton.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: Ι  reason: contains not printable characters */
            final /* synthetic */ C3572ln f2924;

            {
                this.f2924 = r1;
            }

            public final void onClick(View view) {
                this.f2924.m3627();
            }
        });
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) findViewById(R.id.f167492131362355);
        floatingActionButton2.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: ı  reason: contains not printable characters */
            final /* synthetic */ C3572ln f2928;

            {
                this.f2928 = r1;
            }

            public final void onClick(View view) {
                this.f2928.m3628();
            }
        });
        FloatingActionButton floatingActionButton3 = (FloatingActionButton) findViewById(R.id.f165042131362010);
        floatingActionButton3.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: ɩ  reason: contains not printable characters */
            final /* synthetic */ C3572ln f2932;

            {
                this.f2932 = r1;
            }

            public final void onClick(final View view) {
                fM.m2252((Object) view, "");
                view.setEnabled(false);
                C0638.Cif ifVar = new C0638.Cif(this.f2932);
                ifVar.m5397("Are you sure?").m5396(false).m5400("Deleting the DB records is irreversible").m5395("DELETE", new DialogInterface.OnClickListener(this) {

                    /* renamed from: ı  reason: contains not printable characters */
                    final /* synthetic */ AnonymousClass6 f2935;

                    {
                        this.f2935 = r1;
                    }

                    public final void onClick(final DialogInterface dialogInterface, int i) {
                        bZ.m1737(new C3323cd<T>(this) {

                            /* renamed from: Ι  reason: contains not printable characters */
                            final /* synthetic */ AnonymousClass3 f2938;

                            {
                                this.f2938 = r1;
                            }

                            /* renamed from: ı  reason: contains not printable characters */
                            public final void m3633(C3325cf<Boolean> cfVar) {
                                fM.m2254(cfVar, "");
                                new C3596mi(this.f2938.f2935.f2932).m3879();
                                cfVar.m1734(true);
                            }
                        }).m1740(C3330ck.m1971()).m1738(cV.m1934()).m1741(new C3338cq<Boolean>(this) {

                            /* renamed from: ı  reason: contains not printable characters */
                            final /* synthetic */ AnonymousClass3 f2937;

                            {
                                this.f2937 = r1;
                            }

                            /* renamed from: ι  reason: contains not printable characters */
                            public final void m3631(Boolean bool) {
                                Toast.makeText(this.f2937.f2935.f2932, "Database nuked: " + bool, 0).show();
                                View view = view;
                                fM.m2252((Object) view, "");
                                view.setEnabled(true);
                                dialogInterface.cancel();
                            }
                        });
                    }
                }).m5398("DON'T DELETE", new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        View view = view;
                        fM.m2252((Object) view, "");
                        view.setEnabled(true);
                        dialogInterface.cancel();
                    }
                });
                C0638 r6 = ifVar.m5399();
                fM.m2252((Object) r6, "");
                r6.show();
            }
        });
        ((FloatingActionButton) findViewById(R.id.f166322131362211)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: ǃ  reason: contains not printable characters */
            final /* synthetic */ C3572ln f2925;

            {
                this.f2925 = r1;
            }

            public final void onClick(View view) {
                Intent intent = new Intent(this.f2925, C3571lm.class);
                intent.putExtra("time_period", this.f2925.m3625());
                this.f2925.startActivity(intent);
            }
        });
        FirebaseAuth instance = FirebaseAuth.getInstance();
        fM.m2252((Object) instance, "");
        C2164 r4 = instance.m1090();
        if (r4 == null) {
            fM.m2256();
        }
        fM.m2252((Object) r4, "");
        String r42 = r4.m11461();
        fM.m2252((Object) r42, "");
        TextView textView = (TextView) findViewById(R.id.f165522131362097);
        fM.m2252((Object) textView, "");
        StringBuilder sb = new StringBuilder();
        sb.append("UID: ");
        String substring = r42.substring(r42.length() - 4);
        fM.m2252((Object) substring, "");
        sb.append(substring);
        sb.append("   SSID: ");
        String substring2 = "B82AB3FC-1595-4F6A-80F0-FE094CC218F9".substring(32);
        fM.m2252((Object) substring2, "");
        sb.append(substring2);
        textView.setText(sb.toString());
        fM.m2252((Object) floatingActionButton, "");
        floatingActionButton.setVisibility(8);
        fM.m2252((Object) floatingActionButton2, "");
        floatingActionButton2.setVisibility(8);
        fM.m2252((Object) floatingActionButton3, "");
        floatingActionButton3.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public final int m3625() {
        int i = this.f2923;
        int i2 = 12;
        if (i == 1) {
            i2 = 3;
        } else if (i == 3) {
            i2 = 6;
        } else if (i != 6) {
            i2 = i != 12 ? 1 : 24;
        }
        this.f2923 = i2;
        return this.f2923;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3627() {
        try {
            ((Class) C3166.m16013(4, 12, 45444)).getMethod("ɩ", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), new Object[]{this});
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3628() {
        try {
            ((Class) C3166.m16013(4, 12, 45444)).getMethod("ı", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), new Object[]{this});
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
