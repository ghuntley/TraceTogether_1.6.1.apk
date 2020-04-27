package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import o.C1429;

/* renamed from: o.ɼ  reason: contains not printable characters */
public final class C1487 extends BaseAdapter {

    /* renamed from: ı  reason: contains not printable characters */
    boolean f7945;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f7946 = -1;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean f7947;

    /* renamed from: Ι  reason: contains not printable characters */
    public C2328 f7948;

    /* renamed from: ι  reason: contains not printable characters */
    private final LayoutInflater f7949;

    /* renamed from: і  reason: contains not printable characters */
    private final int f7950;

    public final long getItemId(int i) {
        return (long) i;
    }

    public C1487(C2328 r2, LayoutInflater layoutInflater, boolean z, int i) {
        this.f7947 = z;
        this.f7949 = layoutInflater;
        this.f7948 = r2;
        this.f7950 = i;
        m8878();
    }

    public final int getCount() {
        ArrayList<C2459> arrayList;
        if (this.f7947) {
            C2328 r0 = this.f7948;
            r0.m12144();
            arrayList = r0.f10819;
        } else {
            arrayList = this.f7948.m12145();
        }
        if (this.f7946 < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2459 getItem(int i) {
        ArrayList<C2459> arrayList;
        if (this.f7947) {
            C2328 r0 = this.f7948;
            r0.m12144();
            arrayList = r0.f10819;
        } else {
            arrayList = this.f7948.m12145();
        }
        int i2 = this.f7946;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayList.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f7949.inflate(this.f7950, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        int groupId2 = i2 >= 0 ? getItem(i2).getGroupId() : groupId;
        C1475 r2 = (C1475) view;
        if (this.f7948.m12157() && groupId != groupId2) {
            z = true;
        }
        r2.setGroupDividerEnabled(z);
        C1429.C1430 r8 = (C1429.C1430) view;
        if (this.f7945) {
            r2.setForceShowIcon(true);
        }
        r8.m8662(getItem(i));
        return view;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m8878() {
        C2459 r0 = this.f7948.f10799;
        if (r0 != null) {
            C2328 r1 = this.f7948;
            r1.m12144();
            ArrayList<C2459> arrayList = r1.f10819;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == r0) {
                    this.f7946 = i;
                    return;
                }
            }
        }
        this.f7946 = -1;
    }

    public final void notifyDataSetChanged() {
        m8878();
        super.notifyDataSetChanged();
    }
}
