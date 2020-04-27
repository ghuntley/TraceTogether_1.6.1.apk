package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0015R\u00020\u00000\":\u0002\n\u001eB\u0011\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000eJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\r\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\r\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u0002\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0010\u001a\u00020\u00162\n\u0010\r\u001a\u00060\u0015R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0017J#\u0010\u0010\u001a\u00060\u0015R\u00020\u00002\u0006\u0010\r\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0019J!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u0004\u0010\u001aJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u0010\u0010\u001aJ\u0015\u0010\u0002\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u001bJ\u001f\u0010\n\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u001cJ\u001d\u0010\u0002\u001a\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\u0002\u0010\u001dJ\u001d\u0010\n\u001a\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0000¢\u0006\u0004\b\n\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b"}, d2 = {"Lo/ls;", "Landroid/view/LayoutInflater;", "ι", "Landroid/view/LayoutInflater;", "Ι", "Lo/ls$ı;", "ǃ", "Lo/ls$ı;", "", "Lo/ml;", "ı", "Ljava/util/List;", "Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecord;", "p0", "(Lo/ml;)Ljava/util/List;", "p1", "ɩ", "(Lo/ml;Ljava/util/List;)Ljava/util/List;", "", "getItemCount", "()I", "Lo/ls$If;", "", "(Lo/ls$If;I)V", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;I)Lo/ls$If;", "(Ljava/util/List;)Ljava/util/List;", "(Lo/ls$ı;)V", "(Lo/ls$ı;Lo/ml;)V", "(Ljava/util/List;)V", "If", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView$ɩ;"}, k = 1, mv = {1, 1, 16})
/* renamed from: o.ls  reason: case insensitive filesystem */
public final class C3576ls extends RecyclerView.C0035<If> {

    /* renamed from: ı  reason: contains not printable characters */
    private List<C3599ml> f2967 = dN.m2075();

    /* renamed from: ǃ  reason: contains not printable characters */
    private C0227 f2968 = C0227.ALL;

    /* renamed from: Ι  reason: contains not printable characters */
    private List<StreetPassRecord> f2969 = dN.m2075();

    /* renamed from: ι  reason: contains not printable characters */
    private final LayoutInflater f2970;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lo/ls$ı;", "ǃ", "Ι", "ι", "ı", "<init>", "(Ljava/lang/String;I)V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.ls$ı  reason: contains not printable characters */
    public enum C0227 {
        ALL,
        COLLAPSE,
        MODEL_P,
        MODEL_C
    }

    public C3576ls(Context context) {
        fM.m2254(context, "");
        LayoutInflater from = LayoutInflater.from(context);
        fM.m2252((Object) from, "");
        this.f2970 = from;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020\u0017B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0019\u0010\b\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0007\u0010\u0005R\u0019\u0010\r\u001a\u00020\t8\u0007@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u000e\u001a\u00020\t8\u0007@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u0006\u0010\fR\u0019\u0010\n\u001a\u00020\t8\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\b\u0010\fR\u0019\u0010\u0002\u001a\u00020\t8\u0007@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0002\u0010\fR\u0019\u0010\u000f\u001a\u00020\t8\u0007@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0010\u0010\fR\u0019\u0010\u0004\u001a\u00020\t8\u0007@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0011\u001a\u00020\t8\u0007@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0007\u001a\u00020\t8\u0007@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0013\u001a\u00020\t8\u0007@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0011\u0010\f"}, d2 = {"Lo/ls$If;", "Landroid/view/View;", "Ɩ", "Landroid/view/View;", "І", "()Landroid/view/View;", "ı", "і", "ɩ", "Landroid/widget/TextView;", "Ι", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "ǃ", "ι", "Ӏ", "ɪ", "ɹ", "ȷ", "ɨ", "p0", "<init>", "(Lo/ls;Landroid/view/View;)V", "Landroidx/recyclerview/widget/RecyclerView$con;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.ls$If */
    public final class If extends RecyclerView.con {

        /* renamed from: ı  reason: contains not printable characters */
        private final TextView f2973;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private final View f2974;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final TextView f2975;

        /* renamed from: ȷ  reason: contains not printable characters */
        private final TextView f2976;

        /* renamed from: ɩ  reason: contains not printable characters */
        final /* synthetic */ C3576ls f2977;

        /* renamed from: ɪ  reason: contains not printable characters */
        private final TextView f2978;

        /* renamed from: ɹ  reason: contains not printable characters */
        private final TextView f2979;

        /* renamed from: Ι  reason: contains not printable characters */
        private final TextView f2980;

        /* renamed from: ι  reason: contains not printable characters */
        private final TextView f2981;

        /* renamed from: І  reason: contains not printable characters */
        private final TextView f2982;

        /* renamed from: і  reason: contains not printable characters */
        private final View f2983;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private final TextView f2984;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public If(C3576ls lsVar, View view) {
            super(view);
            fM.m2254(view, "");
            this.f2977 = lsVar;
            View findViewById = view.findViewById(R.id.f165872131362145);
            fM.m2252((Object) findViewById, "");
            this.f2975 = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.f165882131362146);
            fM.m2252((Object) findViewById2, "");
            this.f2973 = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.f167832131362398);
            fM.m2252((Object) findViewById3, "");
            this.f2981 = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.f165252131362055);
            fM.m2252((Object) findViewById4, "");
            this.f2980 = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.f168052131362426);
            fM.m2252((Object) findViewById5, "");
            this.f2982 = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.f167412131362335);
            fM.m2252((Object) findViewById6, "");
            this.f2979 = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.f165242131362054);
            fM.m2252((Object) findViewById7, "");
            this.f2983 = findViewById7;
            View findViewById8 = view.findViewById(R.id.f165232131362053);
            fM.m2252((Object) findViewById8, "");
            this.f2974 = findViewById8;
            View findViewById9 = view.findViewById(R.id.f165952131362153);
            fM.m2252((Object) findViewById9, "");
            this.f2984 = (TextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.f168112131362437);
            fM.m2252((Object) findViewById10, "");
            this.f2976 = (TextView) findViewById10;
            View findViewById11 = view.findViewById(R.id.f166232131362193);
            fM.m2252((Object) findViewById11, "");
            this.f2978 = (TextView) findViewById11;
        }

        @JvmName(name = "ı")
        /* renamed from: ı  reason: contains not printable characters */
        public final TextView m3670() {
            return this.f2975;
        }

        @JvmName(name = "ɩ")
        /* renamed from: ɩ  reason: contains not printable characters */
        public final TextView m3673() {
            return this.f2973;
        }

        @JvmName(name = "ǃ")
        /* renamed from: ǃ  reason: contains not printable characters */
        public final TextView m3672() {
            return this.f2981;
        }

        @JvmName(name = "Ι")
        /* renamed from: Ι  reason: contains not printable characters */
        public final TextView m3676() {
            return this.f2980;
        }

        @JvmName(name = "ι")
        /* renamed from: ι  reason: contains not printable characters */
        public final TextView m3677() {
            return this.f2982;
        }

        @JvmName(name = "Ӏ")
        /* renamed from: Ӏ  reason: contains not printable characters */
        public final TextView m3680() {
            return this.f2979;
        }

        @JvmName(name = "і")
        /* renamed from: і  reason: contains not printable characters */
        public final View m3679() {
            return this.f2983;
        }

        @JvmName(name = "І")
        /* renamed from: І  reason: contains not printable characters */
        public final View m3678() {
            return this.f2974;
        }

        @JvmName(name = "Ɩ")
        /* renamed from: Ɩ  reason: contains not printable characters */
        public final TextView m3671() {
            return this.f2984;
        }

        @JvmName(name = "ɹ")
        /* renamed from: ɹ  reason: contains not printable characters */
        public final TextView m3675() {
            return this.f2976;
        }

        @JvmName(name = "ɪ")
        /* renamed from: ɪ  reason: contains not printable characters */
        public final TextView m3674() {
            return this.f2978;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final If onCreateViewHolder(ViewGroup viewGroup, int i) {
        fM.m2254(viewGroup, "");
        View inflate = this.f2970.inflate(R.layout.f169572131558524, viewGroup, false);
        fM.m2252((Object) inflate, "");
        return new If(this, inflate);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void onBindViewHolder(If ifR, int i) {
        fM.m2254(ifR, "");
        C3599ml mlVar = this.f2967.get(i);
        ifR.m3671().setText(mlVar.m3904());
        ifR.m3670().setText(mlVar.m3901());
        ifR.m3673().setText(mlVar.m3907());
        TextView r0 = ifR.m3676();
        r0.setText("Detections: " + mlVar.m3908());
        Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
        try {
            ifR.m3672().setText((CharSequence) ((Class) C3166.m16013(4, 12, 45444)).getMethod("Ι", new Class[]{Long.TYPE}).invoke(obj, new Object[]{Long.valueOf(mlVar.m3906())}));
            TextView r02 = ifR.m3675();
            r02.setText("v: " + mlVar.m3903());
            TextView r03 = ifR.m3674();
            r03.setText("ORG: " + mlVar.m3909());
            ifR.m3679().setTag(mlVar);
            ifR.m3678().setTag(mlVar);
            TextView r04 = ifR.m3680();
            r04.setText("Signal Strength: " + mlVar.m3902());
            TextView r05 = ifR.m3677();
            r05.setText("Tx Power: " + mlVar.m3905());
            ifR.m3679().setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: ǃ  reason: contains not printable characters */
                final /* synthetic */ C3576ls f2972;

                {
                    this.f2972 = r1;
                }

                public final void onClick(View view) {
                    fM.m2252((Object) view, "");
                    Object tag = view.getTag();
                    if (tag != null) {
                        this.f2972.m3660(C0227.MODEL_P, (C3599ml) tag);
                        return;
                    }
                    throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.streetpass.view.StreetPassRecordViewModel");
                }
            });
            ifR.m3678().setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: Ι  reason: contains not printable characters */
                final /* synthetic */ C3576ls f2971;

                {
                    this.f2971 = r1;
                }

                public final void onClick(View view) {
                    fM.m2252((Object) view, "");
                    Object tag = view.getTag();
                    if (tag != null) {
                        this.f2971.m3660(C0227.MODEL_C, (C3599ml) tag);
                        return;
                    }
                    throw new dA("null cannot be cast to non-null type sg.gov.tech.bluetrace.streetpass.view.StreetPassRecordViewModel");
                }
            });
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final List<C3599ml> m3666(C3599ml mlVar) {
        int i = C3574lp$WhenMappings.f2947[this.f2968.ordinal()];
        if (i == 1) {
            return m3665(this.f2969);
        }
        if (i == 2) {
            return m3661(this.f2969);
        }
        if (i == 3) {
            return m3667(mlVar, this.f2969);
        }
        if (i != 4) {
            return m3661(this.f2969);
        }
        return m3662(mlVar, this.f2969);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C3599ml> m3662(C3599ml mlVar, List<StreetPassRecord> list) {
        fM.m2254(list, "");
        if (mlVar == null) {
            return m3661(list);
        }
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (fM.m2257(((StreetPassRecord) next).getModelC(), mlVar.m3901())) {
                arrayList.add(next);
            }
        }
        return m3661((List) arrayList);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final List<C3599ml> m3667(C3599ml mlVar, List<StreetPassRecord> list) {
        fM.m2254(list, "");
        if (mlVar == null) {
            return m3661(list);
        }
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (fM.m2257(((StreetPassRecord) next).getModelP(), mlVar.m3907())) {
                arrayList.add(next);
            }
        }
        return m3661((List) arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<o.C3599ml> m3665(java.util.List<sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord> r13) {
        /*
            r12 = this;
            java.lang.String r0 = ""
            o.fM.m2254(r13, r0)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r1 = r13.iterator()
        L_0x0012:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r1.next()
            r3 = r2
            sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord r3 = (sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord) r3
            java.lang.String r3 = r3.getModelC()
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L_0x0031
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.put(r3, r4)
        L_0x0031:
            java.util.List r4 = (java.util.List) r4
            r4.add(r2)
            goto L_0x0012
        L_0x0037:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0045:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x0060
            java.lang.Object r3 = r13.next()
            r4 = r3
            sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord r4 = (sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord) r4
            java.lang.String r4 = r4.getModelC()
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L_0x0045
            r2.add(r3)
            goto L_0x0045
        L_0x0060:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r13 = new java.util.ArrayList
            r1 = 10
            int r1 = o.dN.m2074(r2, r1)
            r13.<init>(r1)
            java.util.Collection r13 = (java.util.Collection) r13
            java.util.Iterator r1 = r2.iterator()
        L_0x0075:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00fe
            java.lang.Object r2 = r1.next()
            sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord r2 = (sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord) r2
            java.lang.String r3 = r2.getModelC()
            java.lang.Object r3 = r0.get(r3)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            if (r3 == 0) goto L_0x0097
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0098
        L_0x0097:
            r3 = r4
        L_0x0098:
            if (r3 == 0) goto L_0x00f3
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r5 = r2.getModelC()
            java.lang.Object r5 = r0.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x00e4
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x00b9
            goto L_0x00e2
        L_0x00b9:
            java.lang.Object r4 = r5.next()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x00c4
            goto L_0x00e2
        L_0x00c4:
            r6 = r4
            sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord r6 = (sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord) r6
            long r6 = r6.getTimestamp()
        L_0x00cb:
            java.lang.Object r8 = r5.next()
            r9 = r8
            sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord r9 = (sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord) r9
            long r9 = r9.getTimestamp()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x00dc
            r4 = r8
            r6 = r9
        L_0x00dc:
            boolean r8 = r5.hasNext()
            if (r8 != 0) goto L_0x00cb
        L_0x00e2:
            sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord r4 = (sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord) r4
        L_0x00e4:
            if (r4 == 0) goto L_0x00ec
            o.ml r2 = new o.ml
            r2.<init>(r4, r3)
            goto L_0x00f9
        L_0x00ec:
            o.ml r4 = new o.ml
            r4.<init>(r2, r3)
            r2 = r4
            goto L_0x00f9
        L_0x00f3:
            o.ml r3 = new o.ml
            r3.<init>(r2)
            r2 = r3
        L_0x00f9:
            r13.add(r2)
            goto L_0x0075
        L_0x00fe:
            java.util.List r13 = (java.util.List) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3576ls.m3665(java.util.List):java.util.List");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C3599ml> m3661(List<StreetPassRecord> list) {
        fM.m2254(list, "");
        Iterable<StreetPassRecord> r4 = dN.m2198(list);
        Collection arrayList = new ArrayList(dN.m2074(r4, 10));
        for (StreetPassRecord mlVar : r4) {
            arrayList.add(new C3599ml(mlVar));
        }
        return (List) arrayList;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3669(C0227 r2) {
        fM.m2254(r2, "");
        m3660(r2, (C3599ml) null);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3660(C0227 r2, C3599ml mlVar) {
        fM.m2254(r2, "");
        this.f2968 = r2;
        m3668(m3666(mlVar));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3668(List<C3599ml> list) {
        fM.m2254(list, "");
        this.f2967 = list;
        notifyDataSetChanged();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3659(List<StreetPassRecord> list) {
        fM.m2254(list, "");
        this.f2969 = list;
        m3669(this.f2968);
    }

    public final int getItemCount() {
        return this.f2967.size();
    }
}
