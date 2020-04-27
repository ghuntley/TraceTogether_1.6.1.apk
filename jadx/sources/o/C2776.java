package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import o.C1545;
import o.C1550;
import o.C2319;

/* renamed from: o.Ӏȷ  reason: contains not printable characters */
public abstract class C2776 extends RecyclerView.C0035<C2797> implements C2789 {

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0782<C1277> f13153;

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1550 f13154;

    /* renamed from: ι  reason: contains not printable characters */
    public final C2319 f13155;

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m14667(final C1277 r3, final FrameLayout frameLayout) {
        this.f13154.f8275.f8220.add(new C1545.If(new C1550.C1551() {
            /* renamed from: ι  reason: contains not printable characters */
            public final void m14668(C1550 r4, C1277 r5, View view) {
                if (r5 == r3) {
                    C1545 r42 = r4.f8275;
                    synchronized (r42.f8220) {
                        int i = 0;
                        int size = r42.f8220.size();
                        while (true) {
                            if (i >= size) {
                                break;
                            } else if (r42.f8220.get(i).f8222 == this) {
                                r42.f8220.remove(i);
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    C2776.m14666(view, frameLayout);
                }
            }
        }));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m14666(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    /* renamed from: o.Ӏȷ$ǃ  reason: contains not printable characters */
    public class C2777 {

        /* renamed from: Ι  reason: contains not printable characters */
        final /* synthetic */ C2776 f13159;

        /* renamed from: ι  reason: contains not printable characters */
        private long f13160;

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m14669() {
            int i;
            C1277 r1;
            C1550 r0 = this.f13159.f13154;
            if (!(r0.f8272 || r0.f8276) && null.f13473.f13266 == 0) {
                C0782<C1277> r12 = this.f13159.f13153;
                if (r12.f5199) {
                    r12.m6115();
                }
                if (!(r12.f5201 == 0) && this.f13159.getItemCount() != 0 && (i = null.f13466) < this.f13159.getItemCount()) {
                    long itemId = this.f13159.getItemId(i);
                    if (itemId != this.f13160 && (r1 = this.f13159.f13153.m6119(itemId, null)) != null && r1.isAdded()) {
                        this.f13160 = itemId;
                        C1265 r4 = new C1265(this.f13159.f13154);
                        C1277 r13 = null;
                        int i2 = 0;
                        while (true) {
                            C0782<C1277> r5 = this.f13159.f13153;
                            if (r5.f5199) {
                                r5.m6115();
                            }
                            if (i2 >= r5.f5201) {
                                break;
                            }
                            C0782<C1277> r52 = this.f13159.f13153;
                            if (r52.f5199) {
                                r52.m6115();
                            }
                            long j = r52.f5202[i2];
                            C0782<C1277> r53 = this.f13159.f13153;
                            if (r53.f5199) {
                                r53.m6115();
                            }
                            C1277 r54 = (C1277) r53.f5200[i2];
                            if (r54.isAdded()) {
                                if (j != this.f13160) {
                                    r4.m9961(r54, C2319.Cif.STARTED);
                                } else {
                                    r13 = r54;
                                }
                                r54.setMenuVisibility(j == this.f13160);
                            }
                            i2++;
                        }
                        if (r13 != null) {
                            r4.m9961(r13, C2319.Cif.RESUMED);
                        }
                        if (!r4.m9972()) {
                            r4.m9970();
                        }
                    }
                }
            }
        }
    }
}
