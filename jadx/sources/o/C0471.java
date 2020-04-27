package o;

import java.io.File;
import java.util.List;

/* renamed from: o.ĳ  reason: contains not printable characters */
class C0471 extends C3273am implements C3296bg {

    /* renamed from: Ι  reason: contains not printable characters */
    static final String f4092 = "session_analytics_file_";

    /* renamed from: ι  reason: contains not printable characters */
    static final String f4093 = "application/vnd.crashlytics.android.events";

    /* renamed from: ı  reason: contains not printable characters */
    private final String f4094;

    public C0471(C3269ai aiVar, String str, String str2, C3301bl blVar, String str3) {
        super(aiVar, str, str2, blVar, C3302bm.POST);
        this.f4094 = str3;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m4803(List<File> list) {
        C3298bi r0 = m1606();
        if (r0.f1751 == null) {
            r0.f1751 = r0.m1802();
        }
        r0.f1751.setRequestProperty(C3273am.f1528, C3273am.f1518);
        String r1 = this.f1532.m1597();
        if (r0.f1751 == null) {
            r0.f1751 = r0.m1802();
        }
        r0.f1751.setRequestProperty(C3273am.f1519, r1);
        String str = this.f4094;
        if (r0.f1751 == null) {
            r0.f1751 = r0.m1802();
        }
        r0.f1751.setRequestProperty(C3273am.f1523, str);
        int i = 0;
        for (File next : list) {
            r0.m1801(f4092.concat(String.valueOf(i)), next.getName(), f4093, next);
            i++;
        }
        C3263ac.m1563();
        list.size();
        m1608();
        int r10 = r0.m1799();
        C3263ac.m1563();
        return C0336.m4438(r10) == 0;
    }
}
