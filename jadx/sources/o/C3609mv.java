package o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import o.C3608mu;

/* renamed from: o.mv  reason: case insensitive filesystem */
final class C3609mv extends RecyclerView.C0035<RecyclerView.con> {

    /* renamed from: ǃ  reason: contains not printable characters */
    List<C3608mu.Cif> f3348 = new ArrayList();

    /* renamed from: Ι  reason: contains not printable characters */
    private List<C3608mu.Cif> f3349 = new ArrayList();

    /* renamed from: ι  reason: contains not printable characters */
    List<C3608mu.Cif> f3350 = new ArrayList();

    /* renamed from: o.mv$ı  reason: contains not printable characters */
    interface C0259 {
        /* renamed from: ı  reason: contains not printable characters */
        boolean m3932(C3608mu.Cif ifVar);

        /* renamed from: ɩ  reason: contains not printable characters */
        void m3933();
    }

    C3609mv() {
    }

    public final RecyclerView.con onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerView.con(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false)) {
        };
    }

    public final void onBindViewHolder(RecyclerView.con con, int i) {
        this.f3349.get(i).m3925(con.itemView);
    }

    public final long getItemId(int i) {
        return this.f3349.get(i).f3337;
    }

    public final int getItemViewType(int i) {
        return this.f3349.get(i).f3336;
    }

    public final int getItemCount() {
        return this.f3349.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3931(List<C3608mu.Cif> list, List<C3608mu.Cif> list2) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.f3348 = list;
        this.f3350 = list2;
        this.f3349 = arrayList;
    }
}
