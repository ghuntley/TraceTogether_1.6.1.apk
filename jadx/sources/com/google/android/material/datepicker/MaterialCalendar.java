package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.TimeZone;
import o.C0293;
import o.C0520;
import o.C0972;
import o.C1579;
import o.C1936;
import o.C1965;
import o.C2032;
import o.C2117;
import o.C2215;
import o.C2294;
import o.C2311;
import o.C2326;
import o.C2382;
import o.C2430;
import o.C2444;
import o.C2449;
import o.R;

public final class MaterialCalendar<S> extends C2294<S> {

    /* renamed from: ȷ  reason: contains not printable characters */
    private static Object f761 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: ɨ  reason: contains not printable characters */
    private static Object f762 = "NAVIGATION_NEXT_TAG";

    /* renamed from: І  reason: contains not printable characters */
    private static Object f763 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: ӏ  reason: contains not printable characters */
    private static Object f764 = "NAVIGATION_PREV_TAG";

    /* renamed from: ı  reason: contains not printable characters */
    public C2326 f765;

    /* renamed from: Ɩ  reason: contains not printable characters */
    RecyclerView f766;

    /* renamed from: ǃ  reason: contains not printable characters */
    public C2117<S> f767;

    /* renamed from: ɩ  reason: contains not printable characters */
    public C1936 f768;

    /* renamed from: ɪ  reason: contains not printable characters */
    private View f769;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f770;

    /* renamed from: Ι  reason: contains not printable characters */
    C0066 f771;

    /* renamed from: ι  reason: contains not printable characters */
    public C1965 f772;

    /* renamed from: і  reason: contains not printable characters */
    RecyclerView f773;

    /* renamed from: Ӏ  reason: contains not printable characters */
    View f774;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$ı  reason: contains not printable characters */
    public enum C0066 {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$ɩ  reason: contains not printable characters */
    public interface C0067 {
        /* renamed from: ı  reason: contains not printable characters */
        void m942(long j);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static <T> MaterialCalendar<T> m933(C2117<T> r3, int i, C1965 r5) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", r3);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", r5);
        bundle.putParcelable("CURRENT_MONTH_KEY", r5.f9864);
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f770);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f767);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f772);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f765);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f770 = bundle.getInt("THEME_RES_ID_KEY");
        this.f767 = (C2117) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f772 = (C1965) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f765 = (C2326) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f770);
        this.f768 = new C1936(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C2326 r0 = this.f772.f9863;
        if (MaterialDatePicker.m944(contextThemeWrapper)) {
            i2 = R.layout.f169452131558495;
            i = 1;
        } else {
            i2 = R.layout.f169402131558490;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.f165972131362155);
        C0293.m4151((View) gridView, (C2449) new C2449() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m938(View view, C0520 r2) {
                super.m12579(view, r2);
                r2.m5035((Object) null);
            }
        });
        gridView.setAdapter(new C2032());
        gridView.setNumColumns(r0.f10762);
        gridView.setEnabled(false);
        this.f773 = (RecyclerView) inflate.findViewById(R.id.f166002131362158);
        getContext();
        this.f773.setLayoutManager(new C2430(i) {
            /* renamed from: Ι  reason: contains not printable characters */
            public final void m936(RecyclerView.C0033 r3, int[] iArr) {
                if (i == 0) {
                    iArr[0] = MaterialCalendar.this.f773.getWidth();
                    iArr[1] = MaterialCalendar.this.f773.getWidth();
                    return;
                }
                iArr[0] = MaterialCalendar.this.f773.getHeight();
                iArr[1] = MaterialCalendar.this.f773.getHeight();
            }
        });
        this.f773.setTag(f763);
        final C2215 r7 = new C2215(contextThemeWrapper, this.f767, this.f772, new C0067() {
            /* renamed from: ı  reason: contains not printable characters */
            public final void m939(long j) {
                if (MaterialCalendar.this.f772.f9861.m10691(j)) {
                    Iterator<C2382<S>> it = MaterialCalendar.this.f10691.iterator();
                    while (it.hasNext()) {
                        it.next().m12378(MaterialCalendar.this.f767.m11273());
                    }
                    MaterialCalendar.this.f773.getAdapter().notifyDataSetChanged();
                    if (MaterialCalendar.this.f766 != null) {
                        MaterialCalendar.this.f766.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
        this.f773.setAdapter(r7);
        this.f766 = (RecyclerView) inflate.findViewById(R.id.f166022131362161);
        RecyclerView recyclerView = this.f766;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f766.setLayoutManager(new GridLayoutManager());
            this.f766.setAdapter(new C2444(this));
            this.f766.addItemDecoration(new RecyclerView.C0037() {

                /* renamed from: ı  reason: contains not printable characters */
                private final Calendar f781;

                /* renamed from: ɩ  reason: contains not printable characters */
                private final Calendar f783;

                {
                    Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    instance.clear();
                    this.f781 = instance;
                    Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    instance2.clear();
                    this.f783 = instance2;
                }

                public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0033 r22) {
                    int i;
                    if ((recyclerView.getAdapter() instanceof C2444) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                        C2444 r1 = (C2444) recyclerView.getAdapter();
                        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                        for (C2311 next : MaterialCalendar.this.f767.m11276()) {
                            if (!(next.f10733 == null || next.f10734 == null)) {
                                this.f781.setTimeInMillis(((Long) next.f10733).longValue());
                                this.f783.setTimeInMillis(((Long) next.f10734).longValue());
                                int i2 = this.f781.get(1) - r1.f11093.f772.f9863.f10767;
                                int i3 = this.f783.get(1) - r1.f11093.f772.f9863.f10767;
                                View r6 = gridLayoutManager.m411(i2);
                                View r7 = gridLayoutManager.m411(i3);
                                int i4 = i2 / gridLayoutManager.f271;
                                int i5 = i3 / gridLayoutManager.f271;
                                int i6 = i4;
                                while (i6 <= i5) {
                                    View r9 = gridLayoutManager.m411(gridLayoutManager.f271 * i6);
                                    if (r9 != null) {
                                        int top = r9.getTop() + MaterialCalendar.this.f768.f9771.f9924.top;
                                        int bottom = r9.getBottom() - MaterialCalendar.this.f768.f9771.f9924.bottom;
                                        int left = i6 == i4 ? r6.getLeft() + (r6.getWidth() / 2) : 0;
                                        if (i6 == i5) {
                                            i = r7.getLeft() + (r7.getWidth() / 2);
                                        } else {
                                            i = recyclerView.getWidth();
                                        }
                                        canvas.drawRect((float) left, (float) top, (float) i, (float) bottom, MaterialCalendar.this.f768.f9776);
                                    }
                                    i6++;
                                }
                            }
                        }
                    }
                }
            });
        }
        if (inflate.findViewById(R.id.f165912131362149) != null) {
            final C1579 r1 = (C1579) inflate.findViewById(R.id.f165912131362149);
            r1.setTag(f761);
            C0293.m4151((View) r1, (C2449) new C2449() {
                /* renamed from: ǃ  reason: contains not printable characters */
                public final void m937(View view, C0520 r3) {
                    String str;
                    super.m12579(view, r3);
                    if (MaterialCalendar.this.f774.getVisibility() == 0) {
                        str = MaterialCalendar.this.getString(R.string.f170962131886244);
                    } else {
                        str = MaterialCalendar.this.getString(R.string.f170952131886242);
                    }
                    r3.m5039((CharSequence) str);
                }
            });
            C1579 r2 = (C1579) inflate.findViewById(R.id.f165932131362151);
            r2.setTag(f764);
            C1579 r3 = (C1579) inflate.findViewById(R.id.f165922131362150);
            r3.setTag(f762);
            this.f769 = inflate.findViewById(R.id.f166022131362161);
            this.f774 = inflate.findViewById(R.id.f165962131362154);
            m935(C0066.DAY);
            r1.setText(this.f765.f10768);
            this.f773.addOnScrollListener(new RecyclerView.C3243aUx() {
                /* renamed from: ι  reason: contains not printable characters */
                public final void m941(RecyclerView recyclerView, int i, int i2) {
                    int i3;
                    if (i < 0) {
                        i3 = ((LinearLayoutManager) MaterialCalendar.this.f773.getLayoutManager()).m297();
                    } else {
                        i3 = ((LinearLayoutManager) MaterialCalendar.this.f773.getLayoutManager()).m304();
                    }
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    Calendar calendar = r7.f10483.f9863.f10765;
                    Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    if (calendar == null) {
                        instance.clear();
                    } else {
                        instance.setTimeInMillis(calendar.getTimeInMillis());
                    }
                    Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    instance2.clear();
                    instance2.set(instance.get(1), instance.get(2), instance.get(5));
                    instance2.add(2, i3);
                    materialCalendar.f765 = new C2326(instance2);
                    C1579 r11 = r1;
                    Calendar calendar2 = r7.f10483.f9863.f10765;
                    Calendar instance3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    if (calendar2 == null) {
                        instance3.clear();
                    } else {
                        instance3.setTimeInMillis(calendar2.getTimeInMillis());
                    }
                    Calendar instance4 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    instance4.clear();
                    instance4.set(instance3.get(1), instance3.get(2), instance3.get(5));
                    instance4.add(2, i3);
                    r11.setText(new C2326(instance4).f10768);
                }

                /* renamed from: ı  reason: contains not printable characters */
                public final void m940(RecyclerView recyclerView, int i) {
                    if (i == 0) {
                        CharSequence text = r1.getText();
                        if (Build.VERSION.SDK_INT >= 16) {
                            recyclerView.announceForAccessibility(text);
                        } else {
                            recyclerView.sendAccessibilityEvent(2048);
                        }
                    }
                }
            });
            r1.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    if (materialCalendar.f771 == C0066.YEAR) {
                        materialCalendar.m935(C0066.DAY);
                    } else if (materialCalendar.f771 == C0066.DAY) {
                        materialCalendar.m935(C0066.YEAR);
                    }
                }
            });
            r3.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    int r8 = ((LinearLayoutManager) MaterialCalendar.this.f773.getLayoutManager()).m297() + 1;
                    if (r8 < MaterialCalendar.this.f773.getAdapter().getItemCount()) {
                        MaterialCalendar materialCalendar = MaterialCalendar.this;
                        Calendar calendar = r7.f10483.f9863.f10765;
                        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                        if (calendar == null) {
                            instance.clear();
                        } else {
                            instance.setTimeInMillis(calendar.getTimeInMillis());
                        }
                        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                        instance2.clear();
                        instance2.set(instance.get(1), instance.get(2), instance.get(5));
                        instance2.add(2, r8);
                        materialCalendar.m934(new C2326(instance2));
                    }
                }
            });
            r2.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    int r8 = ((LinearLayoutManager) MaterialCalendar.this.f773.getLayoutManager()).m304() - 1;
                    if (r8 >= 0) {
                        MaterialCalendar materialCalendar = MaterialCalendar.this;
                        Calendar calendar = r7.f10483.f9863.f10765;
                        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                        if (calendar == null) {
                            instance.clear();
                        } else {
                            instance.setTimeInMillis(calendar.getTimeInMillis());
                        }
                        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                        instance2.clear();
                        instance2.set(instance.get(1), instance.get(2), instance.get(5));
                        instance2.add(2, r8);
                        materialCalendar.m934(new C2326(instance2));
                    }
                }
            });
        }
        if (!MaterialDatePicker.m944(contextThemeWrapper)) {
            new C0972().m7404(this.f773);
        }
        this.f773.scrollToPosition(r7.f10483.f9863.m12106(this.f765));
        return inflate;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m934(C2326 r7) {
        C2215 r0 = (C2215) this.f773.getAdapter();
        final int r1 = r0.f10483.f9863.m12106(r7);
        int r02 = r1 - r0.f10483.f9863.m12106(this.f765);
        boolean z = true;
        boolean z2 = Math.abs(r02) > 3;
        if (r02 <= 0) {
            z = false;
        }
        this.f765 = r7;
        if (z2 && z) {
            this.f773.scrollToPosition(r1 - 3);
            this.f773.post(new Runnable() {
                public final void run() {
                    MaterialCalendar.this.f773.smoothScrollToPosition(r1);
                }
            });
        } else if (z2) {
            this.f773.scrollToPosition(r1 + 3);
            this.f773.post(new Runnable() {
                public final void run() {
                    MaterialCalendar.this.f773.smoothScrollToPosition(r1);
                }
            });
        } else {
            this.f773.post(new Runnable() {
                public final void run() {
                    MaterialCalendar.this.f773.smoothScrollToPosition(r1);
                }
            });
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m935(C0066 r5) {
        this.f771 = r5;
        if (r5 == C0066.YEAR) {
            this.f766.getLayoutManager().m424(this.f765.f10767 - ((C2444) this.f766.getAdapter()).f11093.f772.f9863.f10767);
            this.f769.setVisibility(0);
            this.f774.setVisibility(8);
        } else if (r5 == C0066.DAY) {
            this.f769.setVisibility(8);
            this.f774.setVisibility(0);
            m934(this.f765);
        }
    }
}
