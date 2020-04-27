package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import o.C0520;
import o.C1483;

/* renamed from: o.լı  reason: contains not printable characters */
public final class C3086 implements C1483, View.OnClickListener {

    /* renamed from: ı  reason: contains not printable characters */
    C2328 f14136;

    /* renamed from: ŀ  reason: contains not printable characters */
    public int f14137;

    /* renamed from: ł  reason: contains not printable characters */
    public boolean f14138 = true;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public ColorStateList f14139;

    /* renamed from: ƚ  reason: contains not printable characters */
    final View.OnClickListener f14140 = this;

    /* renamed from: ǃ  reason: contains not printable characters */
    public int f14141;

    /* renamed from: ȷ  reason: contains not printable characters */
    public int f14142;

    /* renamed from: ɍ  reason: contains not printable characters */
    private C1483.C1484 f14143;

    /* renamed from: ɨ  reason: contains not printable characters */
    public int f14144;

    /* renamed from: ɩ  reason: contains not printable characters */
    public C3099 f14145;

    /* renamed from: ɪ  reason: contains not printable characters */
    public Drawable f14146;

    /* renamed from: ɹ  reason: contains not printable characters */
    int f14147;

    /* renamed from: ɾ  reason: contains not printable characters */
    public boolean f14148;

    /* renamed from: ɿ  reason: contains not printable characters */
    public int f14149;

    /* renamed from: ʟ  reason: contains not printable characters */
    int f14150;

    /* renamed from: Ι  reason: contains not printable characters */
    public LinearLayout f14151;

    /* renamed from: ι  reason: contains not printable characters */
    public C3089 f14152;

    /* renamed from: І  reason: contains not printable characters */
    public LayoutInflater f14153;

    /* renamed from: г  reason: contains not printable characters */
    public int f14154 = -1;

    /* renamed from: і  reason: contains not printable characters */
    boolean f14155;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public ColorStateList f14156;

    /* renamed from: ӏ  reason: contains not printable characters */
    public int f14157;

    /* renamed from: o.լı$ǃ  reason: contains not printable characters */
    interface C3088 {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m15703() {
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m15704(C2459 r1) {
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m15713(C1653 r1) {
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m15717(C2459 r1) {
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m15714(Context context, C2328 r3) {
        this.f14153 = LayoutInflater.from(context);
        this.f14136 = r3;
        this.f14150 = context.getResources().getDimensionPixelOffset(R.dimen.f158212131165310);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m15716(boolean z) {
        C3089 r1 = this.f14152;
        if (r1 != null) {
            r1.m15720();
            r1.notifyDataSetChanged();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m15701(C1483.C1484 r1) {
        this.f14143 = r1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m15702(C2328 r2, boolean z) {
        C1483.C1484 r0 = this.f14143;
        if (r0 != null) {
            r0.m8876(r2, z);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m15709() {
        return this.f14141;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final Parcelable m15711() {
        Bundle bundle = new Bundle();
        if (this.f14145 != null) {
            SparseArray sparseArray = new SparseArray();
            this.f14145.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C3089 r1 = this.f14152;
        if (r1 != null) {
            bundle.putBundle("android:menu:adapter", r1.m15719());
        }
        if (this.f14151 != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f14151.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m15708(Parcelable parcelable) {
        C2459 r4;
        View actionView;
        C3049 r42;
        C2459 r6;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f14145.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C3089 r1 = this.f14152;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    r1.f14163 = true;
                    int size = r1.f14164.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        C3088 r62 = r1.f14164.get(i2);
                        if ((r62 instanceof C3090) && (r6 = ((C3090) r62).f14165) != null && r6.getItemId() == i) {
                            r1.m15721(r6);
                            break;
                        }
                        i2++;
                    }
                    r1.f14163 = false;
                    r1.m15720();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = r1.f14164.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        C3088 r43 = r1.f14164.get(i3);
                        if (!(!(r43 instanceof C3090) || (r4 = ((C3090) r43).f14165) == null || (actionView = r4.getActionView()) == null || (r42 = (C3049) sparseParcelableArray2.get(r4.getItemId())) == null)) {
                            actionView.restoreHierarchyState(r42);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f14151.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m15707(ColorStateList colorStateList) {
        this.f14156 = colorStateList;
        C3089 r1 = this.f14152;
        if (r1 != null) {
            r1.m15720();
            r1.notifyDataSetChanged();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m15715(ColorStateList colorStateList) {
        this.f14139 = colorStateList;
        C3089 r1 = this.f14152;
        if (r1 != null) {
            r1.m15720();
            r1.notifyDataSetChanged();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m15712(int i) {
        this.f14147 = i;
        this.f14155 = true;
        C3089 r1 = this.f14152;
        if (r1 != null) {
            r1.m15720();
            r1.notifyDataSetChanged();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m15700(Drawable drawable) {
        this.f14146 = drawable;
        C3089 r1 = this.f14152;
        if (r1 != null) {
            r1.m15720();
            r1.notifyDataSetChanged();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m15706(int i) {
        this.f14142 = i;
        C3089 r1 = this.f14152;
        if (r1 != null) {
            r1.m15720();
            r1.notifyDataSetChanged();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15710(int i) {
        this.f14144 = i;
        C3089 r1 = this.f14152;
        if (r1 != null) {
            r1.m15720();
            r1.notifyDataSetChanged();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m15705() {
        int i = (this.f14151.getChildCount() != 0 || !this.f14138) ? 0 : this.f14137;
        C3099 r2 = this.f14145;
        r2.setPadding(0, i, 0, r2.getPaddingBottom());
    }

    /* renamed from: o.լı$І  reason: contains not printable characters */
    static abstract class C3092 extends RecyclerView.con {
        public C3092(View view) {
            super(view);
        }
    }

    /* renamed from: o.լı$IF */
    static class IF extends C3092 {
        public IF(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.f169082131558451, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: o.լı$ι  reason: contains not printable characters */
    static class C3091 extends C3092 {
        public C3091(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.f169112131558454, viewGroup, false));
        }
    }

    /* renamed from: o.լı$aux */
    static class aux extends C3092 {
        public aux(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.f169102131558453, viewGroup, false));
        }
    }

    /* renamed from: o.լı$If  reason: case insensitive filesystem */
    static class C3662If extends C3092 {
        public C3662If(View view) {
            super(view);
        }
    }

    /* renamed from: o.լı$ɩ  reason: contains not printable characters */
    public class C3089 extends RecyclerView.C0035<C3092> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private C2459 f14162;

        /* renamed from: ɩ  reason: contains not printable characters */
        public boolean f14163;

        /* renamed from: ι  reason: contains not printable characters */
        final ArrayList<C3088> f14164 = new ArrayList<>();

        public final long getItemId(int i) {
            return (long) i;
        }

        public final /* synthetic */ void onBindViewHolder(RecyclerView.con con, int i) {
            C3092 r4 = (C3092) con;
            int itemViewType = getItemViewType(i);
            boolean z = true;
            if (itemViewType == 0) {
                C2907 r42 = (C2907) r4.itemView;
                r42.f13531 = C3086.this.f14156;
                if (r42.f13531 == null) {
                    z = false;
                }
                r42.f13532 = z;
                if (r42.f13527 != null) {
                    r42.setIcon(r42.f13527.getIcon());
                }
                if (C3086.this.f14155) {
                    r42.setTextAppearance(C3086.this.f14147);
                }
                if (C3086.this.f14139 != null) {
                    r42.setTextColor(C3086.this.f14139);
                }
                C0293.m4199((View) r42, C3086.this.f14146 != null ? C3086.this.f14146.getConstantState().newDrawable() : null);
                C3090 r5 = (C3090) this.f14164.get(i);
                r42.setNeedsEmptyIcon(r5.f14166);
                r42.setHorizontalPadding(C3086.this.f14142);
                r42.setIconPadding(C3086.this.f14144);
                if (C3086.this.f14148) {
                    r42.setIconSize(C3086.this.f14157);
                }
                r42.setMaxLines(C3086.this.f14149);
                r42.m15062(r5.f14165);
            } else if (itemViewType == 1) {
                ((TextView) r4.itemView).setText(((C3090) this.f14164.get(i)).f14165.getTitle());
            } else if (itemViewType == 2) {
                C3087 r52 = (C3087) this.f14164.get(i);
                r4.itemView.setPadding(0, r52.f14159, 0, r52.f14160);
            }
        }

        public final /* synthetic */ void onViewRecycled(RecyclerView.con con) {
            C3092 r2 = (C3092) con;
            if (r2 instanceof IF) {
                C2907 r22 = (C2907) r2.itemView;
                if (r22.f13524 != null) {
                    r22.f13524.removeAllViews();
                }
                r22.f13526.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }

        public C3089() {
            m15720();
        }

        public final int getItemCount() {
            return this.f14164.size();
        }

        public final int getItemViewType(int i) {
            C3088 r2 = this.f14164.get(i);
            if (r2 instanceof C3087) {
                return 2;
            }
            if (r2 instanceof Cif) {
                return 3;
            }
            if (r2 instanceof C3090) {
                return ((C3090) r2).f14165.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m15720() {
            if (!this.f14163) {
                this.f14163 = true;
                this.f14164.clear();
                this.f14164.add(new Cif());
                int size = C3086.this.f14136.m12145().size();
                int i = 0;
                int i2 = 0;
                int i3 = -1;
                boolean z = false;
                int i4 = 0;
                while (i2 < size) {
                    C2459 r8 = C3086.this.f14136.m12145().get(i2);
                    if (r8.isChecked()) {
                        m15721(r8);
                    }
                    if (r8.isCheckable()) {
                        r8.f11183 &= -5;
                    }
                    if (r8.hasSubMenu()) {
                        SubMenu subMenu = r8.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i2 != 0) {
                                this.f14164.add(new C3087(C3086.this.f14150, i));
                            }
                            this.f14164.add(new C3090(r8));
                            int size2 = subMenu.size();
                            boolean z2 = false;
                            for (int i5 = 0; i5 < size2; i5++) {
                                C2459 r14 = (C2459) subMenu.getItem(i5);
                                if (r14.isVisible()) {
                                    if (!z2 && r14.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (r14.isCheckable()) {
                                        r14.f11183 &= -5;
                                    }
                                    if (r8.isChecked()) {
                                        m15721(r8);
                                    }
                                    this.f14164.add(new C3090(r14));
                                }
                            }
                            if (z2) {
                                int size3 = this.f14164.size();
                                for (int size4 = this.f14164.size(); size4 < size3; size4++) {
                                    ((C3090) this.f14164.get(size4)).f14166 = true;
                                }
                            }
                        }
                    } else {
                        int groupId = r8.getGroupId();
                        if (groupId != i3) {
                            i4 = this.f14164.size();
                            boolean z3 = r8.getIcon() != null;
                            if (i2 != 0) {
                                i4++;
                                this.f14164.add(new C3087(C3086.this.f14150, C3086.this.f14150));
                            }
                            z = z3;
                        } else if (!z && r8.getIcon() != null) {
                            int size5 = this.f14164.size();
                            for (int i6 = i4; i6 < size5; i6++) {
                                ((C3090) this.f14164.get(i6)).f14166 = true;
                            }
                            z = true;
                        }
                        C3090 r5 = new C3090(r8);
                        r5.f14166 = z;
                        this.f14164.add(r5);
                        i3 = groupId;
                    }
                    i2++;
                    i = 0;
                }
                this.f14163 = false;
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m15721(C2459 r3) {
            if (this.f14162 != r3 && r3.isCheckable()) {
                C2459 r0 = this.f14162;
                if (r0 != null) {
                    r0.setChecked(false);
                }
                this.f14162 = r3;
                r3.setChecked(true);
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Bundle m15719() {
            Bundle bundle = new Bundle();
            C2459 r1 = this.f14162;
            if (r1 != null) {
                bundle.putInt("android:menu:checked", r1.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f14164.size();
            for (int i = 0; i < size; i++) {
                C3088 r4 = this.f14164.get(i);
                if (r4 instanceof C3090) {
                    C2459 r42 = ((C3090) r4).f14165;
                    View actionView = r42 != null ? r42.getActionView() : null;
                    if (actionView != null) {
                        C3049 r6 = new C3049();
                        actionView.saveHierarchyState(r6);
                        sparseArray.put(r42.getItemId(), r6);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public final /* synthetic */ RecyclerView.con onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new IF(C3086.this.f14153, viewGroup, C3086.this.f14140);
            }
            if (i == 1) {
                return new C3091(C3086.this.f14153, viewGroup);
            }
            if (i == 2) {
                return new aux(C3086.this.f14153, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new C3662If(C3086.this.f14151);
        }
    }

    /* renamed from: o.լı$Ι  reason: contains not printable characters */
    static class C3090 implements C3088 {

        /* renamed from: Ι  reason: contains not printable characters */
        final C2459 f14165;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f14166;

        C3090(C2459 r1) {
            this.f14165 = r1;
        }
    }

    /* renamed from: o.լı$ı  reason: contains not printable characters */
    static class C3087 implements C3088 {

        /* renamed from: ǃ  reason: contains not printable characters */
        final int f14159;

        /* renamed from: Ι  reason: contains not printable characters */
        final int f14160;

        public C3087(int i, int i2) {
            this.f14159 = i;
            this.f14160 = i2;
        }
    }

    /* renamed from: o.լı$if  reason: invalid class name */
    static class Cif implements C3088 {
        Cif() {
        }
    }

    /* renamed from: o.լı$iF  reason: case insensitive filesystem */
    public class C3663iF extends C1102 {
        public C3663iF(RecyclerView recyclerView) {
            super(recyclerView);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m15718(View view, C0520 r6) {
            super.m7483(view, r6);
            C3089 r5 = C3086.this.f14152;
            int i = C3086.this.f14151.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < C3086.this.f14152.getItemCount(); i2++) {
                if (C3086.this.f14152.getItemViewType(i2) == 0) {
                    i++;
                }
            }
            r6.m5035((Object) C0520.C0521.m5077(i, 0, false));
        }
    }

    public final void onClick(View view) {
        C3089 r5;
        C2907 r52 = (C2907) view;
        C3089 r0 = this.f14152;
        boolean z = true;
        if (r0 != null) {
            r0.f14163 = true;
        }
        C2459 r53 = r52.f13527;
        boolean r02 = this.f14136.m12143(r53, this, 0);
        if (r53 == null || !r53.isCheckable() || !r02) {
            z = false;
        } else {
            this.f14152.m15721(r53);
        }
        C3089 r54 = this.f14152;
        if (r54 != null) {
            r54.f14163 = false;
        }
        if (z && (r5 = this.f14152) != null) {
            r5.m15720();
            r5.notifyDataSetChanged();
        }
    }
}
