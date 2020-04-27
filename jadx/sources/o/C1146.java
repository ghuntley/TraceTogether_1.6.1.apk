package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o.C0638;
import o.C1429;
import o.C1483;

/* renamed from: o.ɟ  reason: contains not printable characters */
public final class C1146 implements C1483, AdapterView.OnItemClickListener {

    /* renamed from: ı  reason: contains not printable characters */
    C2328 f6673;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private Context f6674;

    /* renamed from: ǃ  reason: contains not printable characters */
    public LayoutInflater f6675;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f6676;

    /* renamed from: ɹ  reason: contains not printable characters */
    public C1147 f6677;

    /* renamed from: Ι  reason: contains not printable characters */
    public C1105 f6678;

    /* renamed from: ι  reason: contains not printable characters */
    public C1483.C1484 f6679;

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m7592() {
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m7593(C2459 r1) {
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m7595() {
        return 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m7600(C2459 r1) {
        return false;
    }

    public C1146(Context context) {
        this();
        this.f6674 = context;
        this.f6675 = LayoutInflater.from(this.f6674);
    }

    private C1146() {
        this.f6676 = R.layout.f168752131558416;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m7598(Context context, C2328 r3) {
        if (this.f6674 != null) {
            this.f6674 = context;
            if (this.f6675 == null) {
                this.f6675 = LayoutInflater.from(this.f6674);
            }
        }
        this.f6673 = r3;
        C1147 r2 = this.f6677;
        if (r2 != null) {
            r2.notifyDataSetChanged();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m7599(boolean z) {
        C1147 r1 = this.f6677;
        if (r1 != null) {
            r1.notifyDataSetChanged();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m7590(C1483.C1484 r1) {
        this.f6679 = r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m7597(C1653 r9) {
        if (!r9.hasVisibleItems()) {
            return false;
        }
        C2470 r0 = new C2470(r9);
        C2328 r1 = r0.f11246;
        C0638.Cif ifVar = new C0638.Cif(r1.f10808);
        r0.f11245 = new C1146(ifVar.f4628.f1177);
        r0.f11245.f6679 = r0;
        C2328 r3 = r0.f11246;
        C1146 r4 = r0.f11245;
        Context context = r3.f10808;
        r3.f10807.add(new WeakReference(r4));
        r4.m8873(context, r3);
        r3.f10817 = true;
        C1146 r32 = r0.f11245;
        if (r32.f6677 == null) {
            r32.f6677 = new C1147();
        }
        ifVar.f4628.f1176 = r32.f6677;
        ifVar.f4628.f1182 = r0;
        View view = r1.f10805;
        if (view != null) {
            ifVar.f4628.f1173 = view;
        } else {
            ifVar.f4628.f1178 = r1.f10818;
            ifVar.f4628.f1167 = r1.f10801;
        }
        ifVar.f4628.f1172 = r0;
        r0.f11244 = ifVar.m5399();
        r0.f11244.setOnDismissListener(r0);
        WindowManager.LayoutParams attributes = r0.f11244.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        r0.f11244.show();
        C1483.C1484 r02 = this.f6679;
        if (r02 != null) {
            r02.m8877(r9);
        }
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m7591(C2328 r2, boolean z) {
        C1483.C1484 r0 = this.f6679;
        if (r0 != null) {
            r0.m8876(r2, z);
        }
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f6673.m12143(this.f6677.getItem(i), this, 0);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final Parcelable m7596() {
        if (this.f6678 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        C1105 r2 = this.f6678;
        if (r2 != null) {
            r2.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m7594(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f6678.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: o.ɟ$ı  reason: contains not printable characters */
    public class C1147 extends BaseAdapter {

        /* renamed from: ı  reason: contains not printable characters */
        private int f6680 = -1;

        public final long getItemId(int i) {
            return (long) i;
        }

        public C1147() {
            m7601();
        }

        public final int getCount() {
            C2328 r0 = C1146.this.f6673;
            r0.m12144();
            int size = r0.f10819.size();
            return this.f6680 < 0 ? size : size - 1;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C2459 getItem(int i) {
            C2328 r0 = C1146.this.f6673;
            r0.m12144();
            ArrayList<C2459> arrayList = r0.f10819;
            int i2 = this.f6680;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return arrayList.get(i);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C1146.this.f6675.inflate(C1146.this.f6676, viewGroup, false);
            }
            ((C1429.C1430) view).m8662(getItem(i));
            return view;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private void m7601() {
            C2459 r0 = C1146.this.f6673.f10799;
            if (r0 != null) {
                C2328 r1 = C1146.this.f6673;
                r1.m12144();
                ArrayList<C2459> arrayList = r1.f10819;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == r0) {
                        this.f6680 = i;
                        return;
                    }
                }
            }
            this.f6680 = -1;
        }

        public final void notifyDataSetChanged() {
            m7601();
            super.notifyDataSetChanged();
        }
    }
}
