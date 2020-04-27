package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.MaterialDatePicker;

/* renamed from: o.ІŁ  reason: contains not printable characters */
public final class C2215 extends RecyclerView.C0035<Cif> {

    /* renamed from: ı  reason: contains not printable characters */
    public final C1965 f10483;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2117<?> f10484;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f10485;

    /* renamed from: ι  reason: contains not printable characters */
    final MaterialCalendar.C0067 f10486;

    public final /* synthetic */ void onBindViewHolder(RecyclerView.con con, int i) {
        Cif ifVar = (Cif) con;
        C2326 r5 = this.f10483.f9863.m12108(i);
        ifVar.f10490.setText(r5.f10768);
        final C2073 r4 = (C2073) ifVar.f10489.findViewById(R.id.f165892131362147);
        if (r4.m11001() == null || !r5.equals(r4.m11001().f10284)) {
            C2135 r0 = new C2135(r5, this.f10484, this.f10483);
            r4.setNumColumns(r5.f10762);
            r4.setAdapter(r0);
        } else {
            r4.m11001().notifyDataSetChanged();
        }
        r4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
                if (r4 <= ((r6 + r2.f10284.f10763) - 1)) goto L_0x002c;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onItemClick(android.widget.AdapterView<?> r2, android.view.View r3, int r4, long r5) {
                /*
                    r1 = this;
                    o.ιҹ r2 = r4
                    o.ψ r2 = r2.m11001()
                    int r3 = r2.m11307()
                    r5 = 1
                    if (r4 < r3) goto L_0x002b
                    o.Іյ r3 = r2.f10284
                    java.util.Calendar r6 = r3.f10765
                    r0 = 7
                    int r6 = r6.get(r0)
                    java.util.Calendar r0 = r3.f10765
                    int r0 = r0.getFirstDayOfWeek()
                    int r6 = r6 - r0
                    if (r6 >= 0) goto L_0x0022
                    int r3 = r3.f10762
                    int r6 = r6 + r3
                L_0x0022:
                    o.Іյ r2 = r2.f10284
                    int r2 = r2.f10763
                    int r6 = r6 + r2
                    int r6 = r6 - r5
                    if (r4 > r6) goto L_0x002b
                    goto L_0x002c
                L_0x002b:
                    r5 = 0
                L_0x002c:
                    if (r5 == 0) goto L_0x0043
                    o.ІŁ r2 = o.C2215.this
                    com.google.android.material.datepicker.MaterialCalendar$ɩ r2 = r2.f10486
                    o.ιҹ r3 = r4
                    o.ψ r3 = r3.m11001()
                    java.lang.Long r3 = r3.getItem(r4)
                    long r3 = r3.longValue()
                    r2.m942(r3)
                L_0x0043:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C2215.AnonymousClass1.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
    }

    public C2215(Context context, C2117<?> r6, C1965 r7, MaterialCalendar.C0067 r8) {
        C2326 r0 = r7.f9863;
        C2326 r1 = r7.f9862;
        C2326 r2 = r7.f9864;
        if (r0.f10765.compareTo(r2.f10765) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (r2.f10765.compareTo(r1.f10765) <= 0) {
            this.f10485 = (C2135.f10281 * context.getResources().getDimensionPixelSize(R.dimen.f158692131165400)) + (MaterialDatePicker.m944(context) ? context.getResources().getDimensionPixelSize(R.dimen.f158692131165400) : 0);
            this.f10483 = r7;
            this.f10484 = r6;
            this.f10486 = r8;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* renamed from: o.ІŁ$if  reason: invalid class name */
    public static class Cif extends RecyclerView.con {

        /* renamed from: ǃ  reason: contains not printable characters */
        final C2073 f10489;

        /* renamed from: ι  reason: contains not printable characters */
        final TextView f10490;

        Cif(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            this.f10490 = (TextView) linearLayout.findViewById(R.id.f165942131362152);
            C0293.m4180((View) this.f10490, true);
            this.f10489 = (C2073) linearLayout.findViewById(R.id.f165892131362147);
            if (!z) {
                this.f10490.setVisibility(8);
            }
        }
    }

    public final long getItemId(int i) {
        return this.f10483.f9863.m12108(i).f10765.getTimeInMillis();
    }

    public final int getItemCount() {
        return this.f10483.f9860;
    }

    public final /* synthetic */ RecyclerView.con onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f169422131558492, viewGroup, false);
        if (!MaterialDatePicker.m944(viewGroup.getContext())) {
            return new Cif(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C0038(-1, this.f10485));
        return new Cif(linearLayout, true);
    }
}
