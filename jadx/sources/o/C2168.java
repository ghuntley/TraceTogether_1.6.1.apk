package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: o.ϲ  reason: contains not printable characters */
public abstract class C2168 implements C2257, C1483, AdapterView.OnItemClickListener {

    /* renamed from: ı  reason: contains not printable characters */
    Rect f10332;

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m11480(int i);

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m11481(View view);

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m11482(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m11483(boolean z);

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m11484(C2459 r1) {
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m11485(int i);

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m11486(C2328 r1);

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m11487() {
        return 0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m11488(int i);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m11489(boolean z);

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11490(Context context, C2328 r2) {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m11491(C2459 r1) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public boolean m11492() {
        return true;
    }

    C2168() {
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C1487 r2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            r2 = (C1487) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            r2 = (C1487) listAdapter;
        }
        r2.f7948.m12143((MenuItem) listAdapter.getItem(i), this, m11492() ? 0 : 4);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    protected static int m11479(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    protected static boolean m11478(C2328 r5) {
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = r5.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
