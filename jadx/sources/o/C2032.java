package o;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: o.ιπ  reason: contains not printable characters */
public final class C2032 extends BaseAdapter {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int f10058 = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f10059 = this.f10060.getMaximum(7);

    /* renamed from: Ι  reason: contains not printable characters */
    private final Calendar f10060;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f10061 = this.f10060.getFirstDayOfWeek();

    public final long getItemId(int i) {
        return 0;
    }

    public C2032() {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.clear();
        this.f10060 = instance;
    }

    public final int getCount() {
        return this.f10059;
    }

    /* JADX WARNING: type inference failed for: r6v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L_0x0018
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131558488(0x7f0d0058, float:1.8742293E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0018:
            java.util.Calendar r6 = r4.f10060
            int r2 = r4.f10061
            int r5 = r5 + r2
            int r2 = r4.f10059
            if (r5 <= r2) goto L_0x0022
            int r5 = r5 - r2
        L_0x0022:
            r2 = 7
            r6.set(r2, r5)
            java.util.Calendar r5 = r4.f10060
            int r6 = f10058
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getDisplayName(r2, r6, r3)
            r0.setText(r5)
            r7.getContext()
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.util.Calendar r6 = r4.f10060
            r7 = 2
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getDisplayName(r2, r7, r3)
            r5[r1] = r6
            java.lang.String r6 = "Column of days: %1$s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            r0.setContentDescription(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2032.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final /* synthetic */ Object getItem(int i) {
        int i2 = this.f10059;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f10061;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }
}
