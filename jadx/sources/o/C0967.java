package o;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: o.ȷι  reason: contains not printable characters */
final class C0967 extends Filter {

    /* renamed from: ɩ  reason: contains not printable characters */
    private C0968 f5975;

    /* renamed from: o.ȷι$ǃ  reason: contains not printable characters */
    interface C0968 {
        /* renamed from: ǃ  reason: contains not printable characters */
        void m6928(Cursor cursor);

        /* renamed from: ɩ  reason: contains not printable characters */
        Cursor m6929(CharSequence charSequence);

        /* renamed from: ɩ  reason: contains not printable characters */
        CharSequence m6930(Cursor cursor);

        /* renamed from: ι  reason: contains not printable characters */
        Cursor m6931();
    }

    C0967(C0968 r1) {
        this.f5975 = r1;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.f5975.m6930((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor r3 = this.f5975.m6929(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (r3 != null) {
            filterResults.count = r3.getCount();
            filterResults.values = r3;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor r2 = this.f5975.m6931();
        if (filterResults.values != null && filterResults.values != r2) {
            this.f5975.m6928((Cursor) filterResults.values);
        }
    }
}
