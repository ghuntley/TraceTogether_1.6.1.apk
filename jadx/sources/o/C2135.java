package o;

import android.widget.BaseAdapter;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: o.ψ  reason: contains not printable characters */
public class C2135 extends BaseAdapter {

    /* renamed from: ı  reason: contains not printable characters */
    public static final int f10281;

    /* renamed from: ǃ  reason: contains not printable characters */
    final C2117<?> f10282;

    /* renamed from: ɩ  reason: contains not printable characters */
    C1936 f10283;

    /* renamed from: Ι  reason: contains not printable characters */
    final C2326 f10284;

    /* renamed from: ι  reason: contains not printable characters */
    private C1965 f10285;

    public boolean hasStableIds() {
        return true;
    }

    C2135(C2326 r1, C2117<?> r2, C1965 r3) {
        this.f10284 = r1;
        this.f10282 = r2;
        this.f10285 = r3;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Long getItem(int i) {
        C2326 r0 = this.f10284;
        int firstDayOfWeek = r0.f10765.get(7) - r0.f10765.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            firstDayOfWeek += r0.f10762;
        }
        if (i < firstDayOfWeek) {
            return null;
        }
        C2326 r02 = this.f10284;
        int firstDayOfWeek2 = r02.f10765.get(7) - r02.f10765.getFirstDayOfWeek();
        if (firstDayOfWeek2 < 0) {
            firstDayOfWeek2 += r02.f10762;
        }
        if (i > (firstDayOfWeek2 + this.f10284.f10763) - 1) {
            return null;
        }
        C2326 r03 = this.f10284;
        int firstDayOfWeek3 = r03.f10765.get(7) - r03.f10765.getFirstDayOfWeek();
        if (firstDayOfWeek3 < 0) {
            firstDayOfWeek3 += r03.f10762;
        }
        return Long.valueOf(r03.m12107((i - firstDayOfWeek3) + 1));
    }

    public long getItemId(int i) {
        return (long) (i / this.f10284.f10762);
    }

    public int getCount() {
        int i = this.f10284.f10763;
        C2326 r1 = this.f10284;
        int firstDayOfWeek = r1.f10765.get(7) - r1.f10765.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            firstDayOfWeek += r1.f10762;
        }
        return i + firstDayOfWeek;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m11307() {
        C2326 r0 = this.f10284;
        int firstDayOfWeek = r0.f10765.get(7) - r0.f10765.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + r0.f10762 : firstDayOfWeek;
    }

    /* JADX WARNING: type inference failed for: r14v31, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            r12 = this;
            android.content.Context r0 = r15.getContext()
            o.εɪ r1 = r12.f10283
            if (r1 != 0) goto L_0x000f
            o.εɪ r1 = new o.εɪ
            r1.<init>(r0)
            r12.f10283 = r1
        L_0x000f:
            r0 = r14
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r14 != 0) goto L_0x0027
            android.content.Context r14 = r15.getContext()
            android.view.LayoutInflater r14 = android.view.LayoutInflater.from(r14)
            r0 = 2131558487(0x7f0d0057, float:1.8742291E38)
            android.view.View r14 = r14.inflate(r0, r15, r1)
            r0 = r14
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r14 = r12.m11307()
            int r14 = r13 - r14
            r15 = 5
            r2 = 2
            r3 = 1
            java.lang.String r4 = "UTC"
            if (r14 < 0) goto L_0x0105
            o.Іյ r5 = r12.f10284
            int r5 = r5.f10763
            if (r14 < r5) goto L_0x003c
            goto L_0x0105
        L_0x003c:
            int r14 = r14 + r3
            o.Іյ r5 = r12.f10284
            r0.setTag(r5)
            java.lang.String r5 = java.lang.String.valueOf(r14)
            r0.setText(r5)
            o.Іյ r5 = r12.f10284
            long r5 = r5.m12107(r14)
            o.Іյ r14 = r12.f10284
            int r14 = r14.f10767
            o.Іյ r7 = new o.Іյ
            java.util.Calendar r8 = java.util.Calendar.getInstance()
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r4)
            java.util.Calendar r9 = java.util.Calendar.getInstance(r9)
            if (r8 != 0) goto L_0x0067
            r9.clear()
            goto L_0x006e
        L_0x0067:
            long r10 = r8.getTimeInMillis()
            r9.setTimeInMillis(r10)
        L_0x006e:
            java.util.TimeZone r8 = java.util.TimeZone.getTimeZone(r4)
            java.util.Calendar r8 = java.util.Calendar.getInstance(r8)
            r8.clear()
            int r10 = r9.get(r3)
            int r11 = r9.get(r2)
            int r9 = r9.get(r15)
            r8.set(r10, r11, r9)
            r7.<init>(r8)
            int r7 = r7.f10767
            r8 = 24
            if (r14 != r7) goto L_0x00c8
            java.util.Locale r14 = java.util.Locale.getDefault()
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r8) goto L_0x00b0
            java.lang.String r7 = "MMMEd"
            android.icu.text.DateFormat r14 = android.icu.text.DateFormat.getInstanceForSkeleton(r7, r14)
            android.icu.util.TimeZone r7 = android.icu.util.TimeZone.getTimeZone(r4)
            r14.setTimeZone(r7)
            java.util.Date r7 = new java.util.Date
            r7.<init>(r5)
            java.lang.String r14 = r14.format(r7)
            goto L_0x00c4
        L_0x00b0:
            java.text.DateFormat r14 = java.text.DateFormat.getDateInstance(r1, r14)
            java.util.TimeZone r7 = java.util.TimeZone.getTimeZone(r4)
            r14.setTimeZone(r7)
            java.util.Date r7 = new java.util.Date
            r7.<init>(r5)
            java.lang.String r14 = r14.format(r7)
        L_0x00c4:
            r0.setContentDescription(r14)
            goto L_0x00fe
        L_0x00c8:
            java.util.Locale r14 = java.util.Locale.getDefault()
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r8) goto L_0x00e7
            java.lang.String r7 = "yMMMEd"
            android.icu.text.DateFormat r14 = android.icu.text.DateFormat.getInstanceForSkeleton(r7, r14)
            android.icu.util.TimeZone r7 = android.icu.util.TimeZone.getTimeZone(r4)
            r14.setTimeZone(r7)
            java.util.Date r7 = new java.util.Date
            r7.<init>(r5)
            java.lang.String r14 = r14.format(r7)
            goto L_0x00fb
        L_0x00e7:
            java.text.DateFormat r14 = java.text.DateFormat.getDateInstance(r1, r14)
            java.util.TimeZone r7 = java.util.TimeZone.getTimeZone(r4)
            r14.setTimeZone(r7)
            java.util.Date r7 = new java.util.Date
            r7.<init>(r5)
            java.lang.String r14 = r14.format(r7)
        L_0x00fb:
            r0.setContentDescription(r14)
        L_0x00fe:
            r0.setVisibility(r1)
            r0.setEnabled(r3)
            goto L_0x010d
        L_0x0105:
            r14 = 8
            r0.setVisibility(r14)
            r0.setEnabled(r1)
        L_0x010d:
            java.lang.Long r13 = r12.getItem(r13)
            if (r13 != 0) goto L_0x0114
            return r0
        L_0x0114:
            o.ιƾ r14 = r12.f10285
            o.ιƾ$ı r14 = r14.f9861
            long r5 = r13.longValue()
            boolean r14 = r14.m10691(r5)
            if (r14 == 0) goto L_0x0214
            r0.setEnabled(r3)
            o.σı<?> r14 = r12.f10282
            java.util.Collection r14 = r14.m11274()
            java.util.Iterator r14 = r14.iterator()
        L_0x012f:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x01c5
            java.lang.Object r1 = r14.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            long r7 = r13.longValue()
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r4)
            java.util.Calendar r1 = java.util.Calendar.getInstance(r1)
            r1.clear()
            r1.setTimeInMillis(r7)
            java.util.TimeZone r7 = java.util.TimeZone.getTimeZone(r4)
            java.util.Calendar r7 = java.util.Calendar.getInstance(r7)
            long r8 = r1.getTimeInMillis()
            r7.setTimeInMillis(r8)
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r4)
            java.util.Calendar r1 = java.util.Calendar.getInstance(r1)
            r1.clear()
            int r8 = r7.get(r3)
            int r9 = r7.get(r2)
            int r7 = r7.get(r15)
            r1.set(r8, r9, r7)
            long r7 = r1.getTimeInMillis()
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r4)
            java.util.Calendar r1 = java.util.Calendar.getInstance(r1)
            r1.clear()
            r1.setTimeInMillis(r5)
            java.util.TimeZone r5 = java.util.TimeZone.getTimeZone(r4)
            java.util.Calendar r5 = java.util.Calendar.getInstance(r5)
            long r9 = r1.getTimeInMillis()
            r5.setTimeInMillis(r9)
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r4)
            java.util.Calendar r1 = java.util.Calendar.getInstance(r1)
            r1.clear()
            int r6 = r5.get(r3)
            int r9 = r5.get(r2)
            int r5 = r5.get(r15)
            r1.set(r6, r9, r5)
            long r5 = r1.getTimeInMillis()
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x012f
            o.εɪ r13 = r12.f10283
            o.ιɒ r13 = r13.f9769
            r13.m10773(r0)
            return r0
        L_0x01c5:
            java.util.Calendar r14 = java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r4)
            java.util.Calendar r1 = java.util.Calendar.getInstance(r1)
            if (r14 != 0) goto L_0x01d7
            r1.clear()
            goto L_0x01de
        L_0x01d7:
            long r5 = r14.getTimeInMillis()
            r1.setTimeInMillis(r5)
        L_0x01de:
            java.util.TimeZone r14 = java.util.TimeZone.getTimeZone(r4)
            java.util.Calendar r14 = java.util.Calendar.getInstance(r14)
            r14.clear()
            int r3 = r1.get(r3)
            int r2 = r1.get(r2)
            int r15 = r1.get(r15)
            r14.set(r3, r2, r15)
            long r14 = r14.getTimeInMillis()
            long r1 = r13.longValue()
            int r13 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r13 != 0) goto L_0x020c
            o.εɪ r13 = r12.f10283
            o.ιɒ r13 = r13.f9772
            r13.m10773(r0)
            return r0
        L_0x020c:
            o.εɪ r13 = r12.f10283
            o.ιɒ r13 = r13.f9770
            r13.m10773(r0)
            return r0
        L_0x0214:
            r0.setEnabled(r1)
            o.εɪ r13 = r12.f10283
            o.ιɒ r13 = r13.f9774
            r13.m10773(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2135.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    static {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.clear();
        f10281 = instance.getMaximum(4);
    }
}
