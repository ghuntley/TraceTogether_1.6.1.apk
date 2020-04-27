package o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.ȷΙ  reason: contains not printable characters */
public abstract class C0966 {

    /* renamed from: ı  reason: contains not printable characters */
    protected final RecyclerView.IF f5972;

    /* renamed from: Ι  reason: contains not printable characters */
    public int f5973;

    /* renamed from: ι  reason: contains not printable characters */
    final Rect f5974;

    /* renamed from: ı  reason: contains not printable characters */
    public abstract int m6886();

    /* renamed from: ı  reason: contains not printable characters */
    public abstract int m6887(View view);

    /* renamed from: Ɩ  reason: contains not printable characters */
    public abstract int m6888();

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract int m6889();

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract int m6890(View view);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract int m6891();

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract int m6892(View view);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m6893(int i);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract int m6894();

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract int m6895(View view);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract int m6896();

    /* renamed from: ι  reason: contains not printable characters */
    public abstract int m6897(View view);

    /* renamed from: І  reason: contains not printable characters */
    public abstract int m6898(View view);

    /* renamed from: і  reason: contains not printable characters */
    public abstract int m6899();

    /* synthetic */ C0966(RecyclerView.IF ifR, byte b) {
        this(ifR);
    }

    private C0966(RecyclerView.IF ifR) {
        this.f5973 = RecyclerView.UNDEFINED_DURATION;
        this.f5974 = new Rect();
        this.f5972 = ifR;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C0966 m6885(RecyclerView.IF ifR, int i) {
        if (i == 0) {
            return new C0966(ifR) {
                /* renamed from: ı  reason: contains not printable characters */
                public final int m6914() {
                    int i = this.f5972.f351;
                    RecyclerView.IF ifR = this.f5972;
                    return i - (ifR.f349 != null ? ifR.f349.getPaddingRight() : 0);
                }

                /* renamed from: Ι  reason: contains not printable characters */
                public final int m6922() {
                    return this.f5972.f351;
                }

                /* renamed from: ɩ  reason: contains not printable characters */
                public final void m6921(int i) {
                    this.f5972.m407(i);
                }

                /* renamed from: ǃ  reason: contains not printable characters */
                public final int m6917() {
                    RecyclerView.IF ifR = this.f5972;
                    if (ifR.f349 != null) {
                        return ifR.f349.getPaddingLeft();
                    }
                    return 0;
                }

                /* renamed from: ɩ  reason: contains not printable characters */
                public final int m6920(View view) {
                    RecyclerView.C0038 r0 = (RecyclerView.C0038) view.getLayoutParams();
                    return RecyclerView.IF.m390(view) + r0.leftMargin + r0.rightMargin;
                }

                /* renamed from: І  reason: contains not printable characters */
                public final int m6926(View view) {
                    RecyclerView.C0038 r0 = (RecyclerView.C0038) view.getLayoutParams();
                    return RecyclerView.IF.m378(view) + r0.topMargin + r0.bottomMargin;
                }

                /* renamed from: Ι  reason: contains not printable characters */
                public final int m6923(View view) {
                    return view.getRight() + RecyclerView.IF.m382(view) + ((RecyclerView.C0038) view.getLayoutParams()).rightMargin;
                }

                /* renamed from: ι  reason: contains not printable characters */
                public final int m6925(View view) {
                    return (view.getLeft() - RecyclerView.IF.m384(view)) - ((RecyclerView.C0038) view.getLayoutParams()).leftMargin;
                }

                /* renamed from: ı  reason: contains not printable characters */
                public final int m6915(View view) {
                    this.f5972.m400(view, this.f5974);
                    return this.f5974.right;
                }

                /* renamed from: ǃ  reason: contains not printable characters */
                public final int m6918(View view) {
                    this.f5972.m400(view, this.f5974);
                    return this.f5974.left;
                }

                /* renamed from: ɩ  reason: contains not printable characters */
                public final int m6919() {
                    int i = this.f5972.f351;
                    RecyclerView.IF ifR = this.f5972;
                    int i2 = 0;
                    int paddingLeft = i - (ifR.f349 != null ? ifR.f349.getPaddingLeft() : 0);
                    RecyclerView.IF ifR2 = this.f5972;
                    if (ifR2.f349 != null) {
                        i2 = ifR2.f349.getPaddingRight();
                    }
                    return paddingLeft - i2;
                }

                /* renamed from: ι  reason: contains not printable characters */
                public final int m6924() {
                    RecyclerView.IF ifR = this.f5972;
                    if (ifR.f349 != null) {
                        return ifR.f349.getPaddingRight();
                    }
                    return 0;
                }

                /* renamed from: Ɩ  reason: contains not printable characters */
                public final int m6916() {
                    return this.f5972.f346;
                }

                /* renamed from: і  reason: contains not printable characters */
                public final int m6927() {
                    return this.f5972.f343;
                }
            };
        }
        if (i == 1) {
            return new C0966(ifR) {
                /* renamed from: ı  reason: contains not printable characters */
                public final int m6900() {
                    int i = this.f5972.f341;
                    RecyclerView.IF ifR = this.f5972;
                    return i - (ifR.f349 != null ? ifR.f349.getPaddingBottom() : 0);
                }

                /* renamed from: Ι  reason: contains not printable characters */
                public final int m6908() {
                    return this.f5972.f341;
                }

                /* renamed from: ɩ  reason: contains not printable characters */
                public final void m6907(int i) {
                    this.f5972.m456(i);
                }

                /* renamed from: ǃ  reason: contains not printable characters */
                public final int m6903() {
                    RecyclerView.IF ifR = this.f5972;
                    if (ifR.f349 != null) {
                        return ifR.f349.getPaddingTop();
                    }
                    return 0;
                }

                /* renamed from: ɩ  reason: contains not printable characters */
                public final int m6906(View view) {
                    RecyclerView.C0038 r0 = (RecyclerView.C0038) view.getLayoutParams();
                    return RecyclerView.IF.m378(view) + r0.topMargin + r0.bottomMargin;
                }

                /* renamed from: І  reason: contains not printable characters */
                public final int m6912(View view) {
                    RecyclerView.C0038 r0 = (RecyclerView.C0038) view.getLayoutParams();
                    return RecyclerView.IF.m390(view) + r0.leftMargin + r0.rightMargin;
                }

                /* renamed from: Ι  reason: contains not printable characters */
                public final int m6909(View view) {
                    return view.getBottom() + RecyclerView.IF.m393(view) + ((RecyclerView.C0038) view.getLayoutParams()).bottomMargin;
                }

                /* renamed from: ι  reason: contains not printable characters */
                public final int m6911(View view) {
                    return (view.getTop() - RecyclerView.IF.m383(view)) - ((RecyclerView.C0038) view.getLayoutParams()).topMargin;
                }

                /* renamed from: ı  reason: contains not printable characters */
                public final int m6901(View view) {
                    this.f5972.m400(view, this.f5974);
                    return this.f5974.bottom;
                }

                /* renamed from: ǃ  reason: contains not printable characters */
                public final int m6904(View view) {
                    this.f5972.m400(view, this.f5974);
                    return this.f5974.top;
                }

                /* renamed from: ɩ  reason: contains not printable characters */
                public final int m6905() {
                    int i = this.f5972.f341;
                    RecyclerView.IF ifR = this.f5972;
                    int i2 = 0;
                    int paddingTop = i - (ifR.f349 != null ? ifR.f349.getPaddingTop() : 0);
                    RecyclerView.IF ifR2 = this.f5972;
                    if (ifR2.f349 != null) {
                        i2 = ifR2.f349.getPaddingBottom();
                    }
                    return paddingTop - i2;
                }

                /* renamed from: ι  reason: contains not printable characters */
                public final int m6910() {
                    RecyclerView.IF ifR = this.f5972;
                    if (ifR.f349 != null) {
                        return ifR.f349.getPaddingBottom();
                    }
                    return 0;
                }

                /* renamed from: Ɩ  reason: contains not printable characters */
                public final int m6902() {
                    return this.f5972.f343;
                }

                /* renamed from: і  reason: contains not printable characters */
                public final int m6913() {
                    return this.f5972.f346;
                }
            };
        }
        throw new IllegalArgumentException("invalid orientation");
    }
}
