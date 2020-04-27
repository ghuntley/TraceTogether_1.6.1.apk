package o;

import java.io.File;

/* renamed from: o.ɟӀ  reason: contains not printable characters */
class C1167 extends C3273am implements C1045 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final String f6723 = "crash_meta_file";

    /* renamed from: ſ  reason: contains not printable characters */
    private static final String f6724 = "device_meta_file";

    /* renamed from: Ɨ  reason: contains not printable characters */
    private static final String f6725 = "os_meta_file";

    /* renamed from: ƚ  reason: contains not printable characters */
    private static final String f6726 = "user_meta_file";

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final String f6727 = "minidump_file";

    /* renamed from: ɍ  reason: contains not printable characters */
    private static final String f6728 = "keys_file";

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final String f6729 = "application/octet-stream";

    /* renamed from: ɿ  reason: contains not printable characters */
    private static final String f6730 = "session_meta_file";

    /* renamed from: ʅ  reason: contains not printable characters */
    private static final String f6731 = "logs_file";

    /* renamed from: ʟ  reason: contains not printable characters */
    private static final String f6732 = "app_meta_file";

    /* renamed from: Ι  reason: contains not printable characters */
    private static final String f6733 = "report_id";

    /* renamed from: ι  reason: contains not printable characters */
    private static final String f6734 = "binary_images_file";

    public C1167(C3269ai aiVar, String str, String str2, C3301bl blVar) {
        super(aiVar, str, str2, blVar, C3302bm.POST);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m7666(C1034 r3) {
        C3298bi r32 = m7665(m7664(m1606(), r3.f6284), r3.f6285);
        C3263ac.m1563();
        m1608();
        int r33 = r32.m1799();
        C3263ac.m1563();
        return C0336.m4438(r33) == 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3298bi m7664(C3298bi biVar, String str) {
        StringBuilder sb = new StringBuilder(C3273am.f1524);
        sb.append(this.f1532.m1597());
        String obj = sb.toString();
        if (biVar.f1751 == null) {
            biVar.f1751 = biVar.m1802();
        }
        biVar.f1751.setRequestProperty(C3273am.f1522, obj);
        if (biVar.f1751 == null) {
            biVar.f1751 = biVar.m1802();
        }
        biVar.f1751.setRequestProperty(C3273am.f1528, C3273am.f1518);
        String r0 = this.f1532.m1597();
        if (biVar.f1751 == null) {
            biVar.f1751 = biVar.m1802();
        }
        biVar.f1751.setRequestProperty(C3273am.f1519, r0);
        if (biVar.f1751 == null) {
            biVar.f1751 = biVar.m1802();
        }
        biVar.f1751.setRequestProperty(C3273am.f1523, str);
        return biVar;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3298bi m7665(C3298bi biVar, C1390 r8) {
        biVar.m1797(f6733, r8.m8555());
        for (File file : r8.m8554()) {
            if (file.getName().equals("minidump")) {
                biVar.m1801(f6727, file.getName(), f6729, file);
            } else if (file.getName().equals("metadata")) {
                biVar.m1801(f6723, file.getName(), f6729, file);
            } else if (file.getName().equals("binaryImages")) {
                biVar.m1801(f6734, file.getName(), f6729, file);
            } else if (file.getName().equals("session")) {
                biVar.m1801(f6730, file.getName(), f6729, file);
            } else if (file.getName().equals("app")) {
                biVar.m1801(f6732, file.getName(), f6729, file);
            } else if (file.getName().equals("device")) {
                biVar.m1801(f6724, file.getName(), f6729, file);
            } else if (file.getName().equals("os")) {
                biVar.m1801(f6725, file.getName(), f6729, file);
            } else if (file.getName().equals("user")) {
                biVar.m1801(f6726, file.getName(), f6729, file);
            } else if (file.getName().equals("logs")) {
                biVar.m1801(f6731, file.getName(), f6729, file);
            } else if (file.getName().equals("keys")) {
                biVar.m1801(f6728, file.getName(), f6729, file);
            }
        }
        return biVar;
    }
}
