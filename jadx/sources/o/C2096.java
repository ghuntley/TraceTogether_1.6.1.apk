package o;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: o.κǃ  reason: contains not printable characters */
final class C2096 extends C2063<FieldDescriptorType, Object> {
    C2096(int i) {
        super(i, (C2096) null);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11185() {
        if (!m10977()) {
            for (int i = 0; i < m10979(); i++) {
                Map.Entry r1 = m10980(i);
                if (((C0750) r1.getKey()).m5992()) {
                    r1.setValue(Collections.unmodifiableList((List) r1.getValue()));
                }
            }
            for (Map.Entry entry : m10982()) {
                if (((C0750) entry.getKey()).m5992()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.m10978();
    }
}
