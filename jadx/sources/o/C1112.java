package o;

import java.io.File;
import java.util.Map;

/* renamed from: o.ɔΙ  reason: contains not printable characters */
class C1112 extends C3273am implements C1045 {

    /* renamed from: ı  reason: contains not printable characters */
    static final String f6587 = "application/octet-stream";

    /* renamed from: ǃ  reason: contains not printable characters */
    static final String f6588 = "report[file";

    /* renamed from: ɩ  reason: contains not printable characters */
    static final String f6589 = "report[identifier]";

    /* renamed from: ι  reason: contains not printable characters */
    static final String f6590 = "report[file]";

    public C1112(C3269ai aiVar, String str, String str2, C3301bl blVar) {
        super(aiVar, str, str2, blVar, C3302bm.POST);
    }

    C1112(C3269ai aiVar, String str, String str2, C3301bl blVar, C3302bm bmVar) {
        super(aiVar, str, str2, blVar, bmVar);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m7515(C1034 r3) {
        C3298bi r32 = m7514(m7513(m1606(), r3), r3.f6285);
        C3263ac.m1563();
        m1608();
        int r0 = r32.m1799();
        C3263ac.m1563();
        r32.m1800();
        if (r32.f1751 == null) {
            r32.f1751 = r32.m1802();
        }
        r32.f1751.getHeaderField(C3273am.f1529);
        C3263ac.m1563();
        return C0336.m4438(r0) == 0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private C3298bi m7513(C3298bi biVar, C1034 r5) {
        String str = r5.f6284;
        if (biVar.f1751 == null) {
            biVar.f1751 = biVar.m1802();
        }
        biVar.f1751.setRequestProperty(C3273am.f1523, str);
        if (biVar.f1751 == null) {
            biVar.f1751 = biVar.m1802();
        }
        biVar.f1751.setRequestProperty(C3273am.f1528, C3273am.f1518);
        String r0 = this.f1532.m1597();
        if (biVar.f1751 == null) {
            biVar.f1751 = biVar.m1802();
        }
        biVar.f1751.setRequestProperty(C3273am.f1519, r0);
        for (Map.Entry next : r5.f6285.m8552().entrySet()) {
            String str2 = (String) next.getKey();
            String str3 = (String) next.getValue();
            if (biVar.f1751 == null) {
                biVar.f1751 = biVar.m1802();
            }
            biVar.f1751.setRequestProperty(str2, str3);
        }
        return biVar;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private C3298bi m7514(C3298bi biVar, C1390 r11) {
        biVar.m1797(f6589, r11.m8555());
        if (r11.m8554().length == 1) {
            C3263ac.m1563();
            r11.m8551();
            r11.m8555();
            return biVar.m1801(f6590, r11.m8551(), f6587, r11.m8550());
        }
        int i = 0;
        for (File file : r11.m8554()) {
            C3263ac.m1563();
            file.getName();
            r11.m8555();
            StringBuilder sb = new StringBuilder(f6588);
            sb.append(i);
            sb.append("]");
            biVar.m1801(sb.toString(), file.getName(), f6587, file);
            i++;
        }
        return biVar;
    }
}
