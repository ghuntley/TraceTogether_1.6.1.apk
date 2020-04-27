package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o.кɹ  reason: contains not printable characters */
public final class C2444 extends RecyclerView.C0035<Cif> {

    /* renamed from: Ι  reason: contains not printable characters */
    public final MaterialCalendar<?> f11093;

    public final /* synthetic */ void onBindViewHolder(RecyclerView.con con, int i) {
        Cif ifVar = (Cif) con;
        final int i2 = this.f11093.f772.f9863.f10767 + i;
        ifVar.f11096.getContext();
        ifVar.f11096.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)}));
        ifVar.f11096.setContentDescription(String.format("Navigate to year %1$s", new Object[]{Integer.valueOf(i2)}));
        C1936 r9 = this.f11093.f768;
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (instance == null) {
            instance2.clear();
        } else {
            instance2.setTimeInMillis(instance.getTimeInMillis());
        }
        Calendar instance3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance3.clear();
        instance3.set(instance2.get(1), instance2.get(2), instance2.get(5));
        C1981 r3 = instance3.get(1) == i2 ? r9.f9775 : r9.f9771;
        for (Long longValue : this.f11093.f767.m11274()) {
            instance3.setTimeInMillis(longValue.longValue());
            if (instance3.get(1) == i2) {
                r3 = r9.f9773;
            }
        }
        r3.m10773(ifVar.f11096);
        ifVar.f11096.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C2444.this.f11093.m934(C2326.m12105(i2, C2444.this.f11093.f765.f10764));
                C2444.this.f11093.m935(MaterialCalendar.C0066.DAY);
            }
        });
    }

    /* renamed from: o.кɹ$if  reason: invalid class name */
    public static class Cif extends RecyclerView.con {

        /* renamed from: Ι  reason: contains not printable characters */
        final TextView f11096;

        Cif(TextView textView) {
            super(textView);
            this.f11096 = textView;
        }
    }

    public C2444(MaterialCalendar<?> materialCalendar) {
        this.f11093 = materialCalendar;
    }

    public final int getItemCount() {
        return this.f11093.f772.f9859;
    }

    public final /* synthetic */ RecyclerView.con onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new Cif((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f169462131558496, viewGroup, false));
    }
}
