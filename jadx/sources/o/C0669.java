package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Ɨŀ  reason: contains not printable characters */
public final class C0669 {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final C0579 f4766;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C0716 f4767;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean f4768;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public final int f4769;

    private C0669(C0716 r4) {
        this(r4, false, C0530.f4360, Integer.MAX_VALUE);
    }

    private C0669(C0716 r1, boolean z, C0579 r3, int i) {
        this.f4767 = r1;
        this.f4768 = false;
        this.f4766 = r3;
        this.f4769 = Integer.MAX_VALUE;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C0669 m5507(char c) {
        C0537 r2 = new C0537('.');
        C0672.m5540(r2);
        return new C0669(new C0717(r2));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<String> m5510(CharSequence charSequence) {
        C0672.m5540(charSequence);
        Iterator<String> r3 = this.f4767.m5833(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (r3.hasNext()) {
            arrayList.add(r3.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
