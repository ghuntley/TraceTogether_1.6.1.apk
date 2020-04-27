package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.C1483;

/* renamed from: o.ͻ  reason: contains not printable characters */
final class C1735 extends C2168 implements View.OnKeyListener, PopupWindow.OnDismissListener, ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: ŀ  reason: contains not printable characters */
    private boolean f8966;

    /* renamed from: ł  reason: contains not printable characters */
    private int f8967;

    /* renamed from: ſ  reason: contains not printable characters */
    private int f8968;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final int f8969;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private int f8970;

    /* renamed from: ƚ  reason: contains not printable characters */
    private boolean f8971;

    /* renamed from: ǃ  reason: contains not printable characters */
    final List<Cif> f8972 = new ArrayList();

    /* renamed from: ȷ  reason: contains not printable characters */
    private int f8973 = 0;

    /* renamed from: ɍ  reason: contains not printable characters */
    private boolean f8974;

    /* renamed from: ɔ  reason: contains not printable characters */
    private ViewTreeObserver f8975;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final View.OnAttachStateChangeListener f8976 = this;

    /* renamed from: ɩ  reason: contains not printable characters */
    final ViewTreeObserver.OnGlobalLayoutListener f8977 = this;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final List<C2328> f8978 = new ArrayList();

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Context f8979;

    /* renamed from: ɼ  reason: contains not printable characters */
    private PopupWindow.OnDismissListener f8980;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f8981 = 0;

    /* renamed from: ɿ  reason: contains not printable characters */
    private View f8982;

    /* renamed from: ʅ  reason: contains not printable characters */
    private C1483.C1484 f8983;

    /* renamed from: ʟ  reason: contains not printable characters */
    private View f8984;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f8985;

    /* renamed from: ι  reason: contains not printable characters */
    final Handler f8986;

    /* renamed from: І  reason: contains not printable characters */
    private final int f8987;

    /* renamed from: г  reason: contains not printable characters */
    private boolean f8988;

    /* renamed from: і  reason: contains not printable characters */
    private final boolean f8989;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final int f8990;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final C0919 f8991 = new C0919() {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m9781(C2328 r1, MenuItem menuItem) {
            C1735.this.f8986.removeCallbacksAndMessages(r1);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m9782(final C2328 r6, final MenuItem menuItem) {
            final Cif ifVar = null;
            C1735.this.f8986.removeCallbacksAndMessages((Object) null);
            int size = C1735.this.f8972.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (r6 == C1735.this.f8972.get(i).f8999) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C1735.this.f8972.size()) {
                    ifVar = C1735.this.f8972.get(i2);
                }
                C1735.this.f8986.postAtTime(new Runnable() {
                    public final void run() {
                        if (ifVar != null) {
                            C1735.this.f8985 = true;
                            ifVar.f8999.m12133(false);
                            C1735.this.f8985 = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            r6.m12143(menuItem, (C1483) null, 4);
                        }
                    }
                }, r6, SystemClock.uptimeMillis() + 200);
            }
        }
    };

    public final void onViewAttachedToWindow(View view) {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m9768() {
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9770(Parcelable parcelable) {
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final Parcelable m9774() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final boolean m9780() {
        return false;
    }

    public C1735(Context context, View view, int i, int i2, boolean z) {
        this.f8979 = context;
        this.f8984 = view;
        this.f8987 = i;
        this.f8990 = i2;
        this.f8989 = z;
        this.f8971 = false;
        this.f8967 = C0293.m4156(this.f8984) == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f8969 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.f157682131165207));
        this.f8986 = new Handler();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9767(boolean z) {
        this.f8971 = z;
    }

    /* renamed from: І  reason: contains not printable characters */
    private C0445 m9761() {
        C0445 r0 = new C0445(this.f8979, this.f8987, this.f8990);
        r0.f4036 = this.f8991;
        r0.m15379((AdapterView.OnItemClickListener) this);
        r0.m15376((PopupWindow.OnDismissListener) this);
        r0.m15369(this.f8984);
        r0.m15362(this.f8981);
        r0.m15380(true);
        r0.m15371(2);
        return r0;
    }

    public final void b_() {
        if (!m9772()) {
            for (C2328 r1 : this.f8978) {
                m9759(r1);
            }
            this.f8978.clear();
            this.f8982 = this.f8984;
            if (this.f8982 != null) {
                boolean z = this.f8975 == null;
                this.f8975 = this.f8982.getViewTreeObserver();
                if (z) {
                    this.f8975.addOnGlobalLayoutListener(this.f8977);
                }
                this.f8982.addOnAttachStateChangeListener(this.f8976);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9775() {
        int size = this.f8972.size();
        if (size > 0) {
            Cif[] ifVarArr = (Cif[]) this.f8972.toArray(new Cif[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    Cif ifVar = ifVarArr[size];
                    if (ifVar.f8998.m15364()) {
                        ifVar.f8998.m15373();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        m9775();
        return true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private int m9760(int i) {
        List<Cif> list = this.f8972;
        ListView r0 = list.get(list.size() - 1).f8998.m15384();
        int[] iArr = new int[2];
        r0.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f8982.getWindowVisibleDisplayFrame(rect);
        if (this.f8967 == 1) {
            if (iArr[0] + r0.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9771(C2328 r4) {
        Context context = this.f8979;
        r4.f10807.add(new WeakReference(this));
        m8873(context, r4);
        r4.f10817 = true;
        if (m9772()) {
            m9759(r4);
        } else {
            this.f8978.add(r4);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m9759(C2328 r15) {
        View view;
        Cif ifVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f8979);
        C1487 r1 = new C1487(r15, from, this.f8989, R.layout.f168702131558411);
        if (!m9772() && this.f8971) {
            r1.f7945 = true;
        } else if (m9772()) {
            r1.f7945 = C2168.m11478(r15);
        }
        int r2 = m11479(r1, (ViewGroup) null, this.f8979, this.f8969);
        C0445 r4 = m9761();
        r4.m15357((ListAdapter) r1);
        r4.m15385(r2);
        r4.m15362(this.f8981);
        if (this.f8972.size() > 0) {
            List<Cif> list = this.f8972;
            ifVar = list.get(list.size() - 1);
            view = m9758(ifVar, r15);
        } else {
            ifVar = null;
            view = null;
        }
        if (view != null) {
            r4.m4741();
            if (Build.VERSION.SDK_INT >= 23) {
                r4.f13819.setEnterTransition((Transition) null);
            }
            int r8 = m9760(r2);
            boolean z = r8 == 1;
            this.f8967 = r8;
            if (Build.VERSION.SDK_INT >= 26) {
                r4.m15369(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f8984.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f8981 & 7) == 5) {
                    iArr[0] = iArr[0] + this.f8984.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f8981 & 5) != 5) {
                if (z) {
                    r2 = view.getWidth();
                }
                i3 = i - r2;
                r4.m15363(i3);
                r4.m15358(true);
                r4.m15374(i2);
            } else if (!z) {
                r2 = view.getWidth();
                i3 = i - r2;
                r4.m15363(i3);
                r4.m15358(true);
                r4.m15374(i2);
            }
            i3 = i + r2;
            r4.m15363(i3);
            r4.m15358(true);
            r4.m15374(i2);
        } else {
            if (this.f8966) {
                r4.m15363(this.f8970);
            }
            if (this.f8988) {
                r4.m15374(this.f8968);
            }
            r4.m15375(this.f10332);
        }
        this.f8972.add(new Cif(r4, r15, this.f8967));
        r4.b_();
        ListView r22 = r4.m15384();
        r22.setOnKeyListener(this);
        if (ifVar == null && this.f8974 && r15.f10801 != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.f168772131558418, r22, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(r15.f10801);
            r22.addHeaderView(frameLayout, (Object) null, false);
            r4.b_();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static MenuItem m9757(C2328 r4, C2328 r5) {
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = r4.getItem(i);
            if (item.hasSubMenu() && r5 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static View m9758(Cif ifVar, C2328 r8) {
        int i;
        C1487 r1;
        int firstVisiblePosition;
        MenuItem r82 = m9757(ifVar.f8999, r8);
        if (r82 == null) {
            return null;
        }
        ListView r7 = ifVar.f8998.m15384();
        ListAdapter adapter = r7.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            r1 = (C1487) headerViewListAdapter.getWrappedAdapter();
        } else {
            r1 = (C1487) adapter;
            i = 0;
        }
        int count = r1.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (r82 == r1.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - r7.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < r7.getChildCount()) {
            return r7.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m9772() {
        return this.f8972.size() > 0 && this.f8972.get(0).f8998.m15364();
    }

    public final void onDismiss() {
        Cif ifVar;
        int size = this.f8972.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ifVar = null;
                break;
            }
            ifVar = this.f8972.get(i);
            if (!ifVar.f8998.m15364()) {
                break;
            }
            i++;
        }
        if (ifVar != null) {
            ifVar.f8999.m12133(false);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9778(boolean z) {
        for (Cif ifVar : this.f8972) {
            ListAdapter adapter = ifVar.f8998.m15384().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1487) adapter).notifyDataSetChanged();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9765(C1483.C1484 r1) {
        this.f8983 = r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m9777(C1653 r5) {
        for (Cif next : this.f8972) {
            if (r5 == next.f8999) {
                next.f8998.m15384().requestFocus();
                return true;
            }
        }
        if (!r5.hasVisibleItems()) {
            return false;
        }
        m11486((C2328) r5);
        C1483.C1484 r0 = this.f8983;
        if (r0 != null) {
            r0.m8877(r5);
        }
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9762(int i) {
        if (this.f8973 != i) {
            this.f8973 = i;
            this.f8981 = C2409.m12455(i, C0293.m4156(this.f8984));
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9763(View view) {
        if (this.f8984 != view) {
            this.f8984 = view;
            this.f8981 = C2409.m12455(this.f8973, C0293.m4156(this.f8984));
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9764(PopupWindow.OnDismissListener onDismissListener) {
        this.f8980 = onDismissListener;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final ListView m9779() {
        if (this.f8972.isEmpty()) {
            return null;
        }
        List<Cif> list = this.f8972;
        return list.get(list.size() - 1).f8998.m15384();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9769(int i) {
        this.f8966 = true;
        this.f8970 = i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9773(int i) {
        this.f8988 = true;
        this.f8968 = i;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9776(boolean z) {
        this.f8974 = z;
    }

    /* renamed from: o.ͻ$if  reason: invalid class name */
    static class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        public final int f8997;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C0445 f8998;

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2328 f8999;

        public Cif(C0445 r1, C2328 r2, int i) {
            this.f8998 = r1;
            this.f8999 = r2;
            this.f8997 = i;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9766(C2328 r7, boolean z) {
        int i;
        int size = this.f8972.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (r7 == this.f8972.get(i2).f8999) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < this.f8972.size()) {
                this.f8972.get(i3).f8999.m12133(false);
            }
            Cif remove = this.f8972.remove(i2);
            remove.f8999.m12138((C1483) this);
            if (this.f8985) {
                C0445 r2 = remove.f8998;
                if (Build.VERSION.SDK_INT >= 23) {
                    r2.f13819.setExitTransition((Transition) null);
                }
                remove.f8998.m15378(0);
            }
            remove.f8998.m15373();
            int size2 = this.f8972.size();
            if (size2 > 0) {
                i = this.f8972.get(size2 - 1).f8997;
            } else {
                i = C0293.m4156(this.f8984) == 1 ? 0 : 1;
            }
            this.f8967 = i;
            if (size2 == 0) {
                m9775();
                C1483.C1484 r8 = this.f8983;
                if (r8 != null) {
                    r8.m8876(r7, true);
                }
                ViewTreeObserver viewTreeObserver = this.f8975;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f8975.removeGlobalOnLayoutListener(this.f8977);
                    }
                    this.f8975 = null;
                }
                this.f8982.removeOnAttachStateChangeListener(this.f8976);
                this.f8980.onDismiss();
            } else if (z) {
                this.f8972.get(0).f8999.m12133(false);
            }
        }
    }

    public final void onGlobalLayout() {
        if (m9772() && this.f8972.size() > 0 && !this.f8972.get(0).f8998.m15382()) {
            View view = this.f8982;
            if (view == null || !view.isShown()) {
                m9775();
                return;
            }
            for (Cif ifVar : this.f8972) {
                ifVar.f8998.b_();
            }
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f8975;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f8975 = view.getViewTreeObserver();
            }
            this.f8975.removeGlobalOnLayoutListener(this.f8977);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
