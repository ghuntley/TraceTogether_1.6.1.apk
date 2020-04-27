package zendesk.belvedere;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialogFragment;
import java.util.ArrayList;
import java.util.List;
import o.C0651;
import o.C1269;
import o.C1277;
import o.C3604mq;
import o.R;
import o.mE;
import o.mK;

public class BelvedereDialog extends AppCompatDialogFragment {

    /* renamed from: ȷ  reason: contains not printable characters */
    private List<mE> f14745;

    /* renamed from: ɪ  reason: contains not printable characters */
    private ListView f14746;

    /* renamed from: ɾ  reason: contains not printable characters */
    private mK f14747;

    /* renamed from: ӏ  reason: contains not printable characters */
    private mE f14748;

    /* renamed from: zendesk.belvedere.BelvedereDialog$ɩ  reason: contains not printable characters */
    interface C3235 {
        /* renamed from: ı  reason: contains not printable characters */
        Context m16349();

        /* renamed from: ı  reason: contains not printable characters */
        void m16350(mE mEVar);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f168912131558433, viewGroup, false);
        this.f14746 = (ListView) inflate.findViewById(R.id.f164692131361956);
        return inflate;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14747 = new mK(getContext());
        if (bundle != null) {
            this.f14748 = (mE) bundle.getParcelable("waiting_for_permission");
        }
        m174(1, m170());
    }

    public void onStart() {
        super.onStart();
        this.f14745 = m16344();
        m16341(this.f14745);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        mE mEVar;
        if (i != 1212 || (mEVar = this.f14748) == null || TextUtils.isEmpty(mEVar.f3079)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        } else if (strArr.length > 0 && strArr[0].equals(this.f14748.f3079)) {
            if (iArr.length > 0 && iArr[0] == 0) {
                if (getParentFragment() != null) {
                    mE mEVar2 = this.f14748;
                    getParentFragment().startActivityForResult(mEVar2.f3076, mEVar2.f3075);
                } else if (getActivity() != null) {
                    mE mEVar3 = this.f14748;
                    getActivity().startActivityForResult(mEVar3.f3076, mEVar3.f3075);
                }
                m173();
            } else if (iArr.length > 0 && iArr[0] == -1 && !shouldShowRequestPermissionRationale(this.f14748.f3079)) {
                mK mKVar = this.f14747;
                mKVar.f3110.edit().putBoolean(this.f14748.f3079, true).apply();
                this.f14745 = m16344();
                m16341(this.f14745);
            }
            this.f14748 = null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("waiting_for_permission", this.f14748);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m16341(List<mE> list) {
        if (getParentFragment() != null) {
            final C1277 parentFragment = getParentFragment();
            m16342(new C3235() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m16348(mE mEVar) {
                    C1277.this.startActivityForResult(mEVar.f3076, mEVar.f3075);
                }

                /* renamed from: ı  reason: contains not printable characters */
                public final Context m16347() {
                    return C1277.this.getContext();
                }
            }, list);
        } else if (getActivity() != null) {
            final C1269 activity = getActivity();
            m16342(new C3235() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m16346(mE mEVar) {
                    C1269.this.startActivityForResult(mEVar.f3076, mEVar.f3075);
                }

                /* renamed from: ı  reason: contains not printable characters */
                public final Context m16345() {
                    return C1269.this;
                }
            }, list);
        } else if (getFragmentManager() != null) {
            m167();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m16342(final C3235 r4, List<mE> list) {
        this.f14746.setAdapter(new Cif(r4.m16349(), list));
        this.f14746.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (view.getTag() instanceof mE) {
                    BelvedereDialog.m16343(BelvedereDialog.this, (mE) view.getTag(), r4);
                }
            }
        });
        if (list.size() == 0) {
            m173();
        } else if (list.size() == 1) {
            mE mEVar = list.get(0);
            if (TextUtils.isEmpty(mEVar.f3079)) {
                r4.m16350(mEVar);
                m167();
                return;
            }
            this.f14748 = mEVar;
            requestPermissions(new String[]{mEVar.f3079}, 1212);
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private List<mE> m16344() {
        C3604mq.C0256 r0 = (C3604mq.C0256) getArguments().getParcelable("extra_intent");
        if (r0 == null) {
            r0 = new C3604mq.C0256();
        }
        List<mE> list = r0.f3314;
        ArrayList arrayList = new ArrayList();
        for (mE next : list) {
            if (!TextUtils.isEmpty(next.f3079)) {
                mK mKVar = this.f14747;
                if (mKVar.f3110.contains(next.f3079) && !next.f3078) {
                }
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    /* renamed from: zendesk.belvedere.BelvedereDialog$if  reason: invalid class name */
    static class Cif extends ArrayAdapter<mE> {

        /* renamed from: ı  reason: contains not printable characters */
        private Context f14753;

        Cif(Context context, List<mE> list) {
            super(context, R.layout.f168922131558434, list);
            this.f14753 = context;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            C3234 r0;
            if (view == null) {
                view = LayoutInflater.from(this.f14753).inflate(R.layout.f168922131558434, viewGroup, false);
            }
            mE mEVar = (mE) getItem(i);
            Context context = this.f14753;
            if (mEVar.f3077 == 2) {
                r0 = new C3234(2131230821, context.getString(R.string.f170372131886121));
            } else if (mEVar.f3077 == 1) {
                r0 = new C3234(2131230828, context.getString(R.string.f170382131886122));
            } else {
                r0 = new C3234(-1, "");
            }
            ((ImageView) view.findViewById(R.id.f164702131361957)).setImageDrawable(C0651.m5458(this.f14753, r0.f14754));
            ((TextView) view.findViewById(R.id.f164712131361958)).setText(r0.f14755);
            view.setTag(mEVar);
            return view;
        }
    }

    /* renamed from: zendesk.belvedere.BelvedereDialog$ı  reason: contains not printable characters */
    static class C3234 {

        /* renamed from: ı  reason: contains not printable characters */
        final int f14754;

        /* renamed from: ǃ  reason: contains not printable characters */
        final String f14755;

        C3234(int i, String str) {
            this.f14754 = i;
            this.f14755 = str;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static /* synthetic */ void m16343(BelvedereDialog belvedereDialog, mE mEVar, C3235 r3) {
        if (TextUtils.isEmpty(mEVar.f3079)) {
            r3.m16350(mEVar);
            belvedereDialog.m167();
            return;
        }
        belvedereDialog.f14748 = mEVar;
        belvedereDialog.requestPermissions(new String[]{mEVar.f3079}, 1212);
    }
}
