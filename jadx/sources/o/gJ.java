package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u000e0\u0016BG\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012&\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00040\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\b\u0010\u000fR6\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00040\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Lo/gJ;", "Lkotlin/Function2;", "", "", "Lo/dr;", "ɩ", "Lo/fy;", "ǃ", "ι", "Ljava/lang/CharSequence;", "ı", "I", "Ι", "", "Lo/gf;", "()Ljava/util/Iterator;", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/CharSequence;IILo/fy;)V", "Lo/gB;"}, k = 1, mv = {1, 1, 15})
final class gJ implements gB<C3431gf> {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final int f2191;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3423fy<CharSequence, Integer, C3363dr<Integer, Integer>> f2192;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public final int f2193;
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public final CharSequence f2194;

    public gJ(CharSequence charSequence, int i, int i2, C3423fy<? super CharSequence, ? super Integer, C3363dr<Integer, Integer>> fyVar) {
        fM.m2254(charSequence, "");
        fM.m2254(fyVar, "");
        this.f2194 = charSequence;
        this.f2193 = i;
        this.f2191 = i2;
        this.f2192 = fyVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00070\u0010J\u000f\u0010\b\u001a\u00020\nH\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0002\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00018\u0006@\u0006X\u0002¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00018\u0006@\u0006X\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0002¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00018\u0006@\u0006X\u0002¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00018\u0006@\u0006X\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003"}, d2 = {"Lo/gJ$ı;", "", "ι", "I", "ǃ", "ɩ", "Ι", "Lo/gf;", "ı", "Lo/gf;", "", "()V", "", "hasNext", "()Z", "()Lo/gf;", ""}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.gJ$ı  reason: contains not printable characters */
    public static final class C0176 implements Iterator<C3431gf> {

        /* renamed from: ı  reason: contains not printable characters */
        public C3431gf f2195;

        /* renamed from: ǃ  reason: contains not printable characters */
        public int f2196;

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f2197;

        /* renamed from: Ι  reason: contains not printable characters */
        public int f2198 = -1;

        /* renamed from: ι  reason: contains not printable characters */
        public int f2199;

        /* renamed from: І  reason: contains not printable characters */
        final /* synthetic */ gJ f2200;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C0176(gJ gJVar) {
            this.f2200 = gJVar;
            this.f2197 = C3435gj.m2410(gJVar.f2193, 0, gJVar.f2194.length());
            this.f2196 = this.f2197;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
            if (r6.f2199 < o.gJ.m2327(r6.f2200)) goto L_0x0027;
         */
        /* renamed from: ı  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m2329() {
            /*
                r6 = this;
                int r0 = r6.f2196
                r1 = 0
                if (r0 >= 0) goto L_0x000e
                r6.f2198 = r1
                r0 = 0
                o.gf r0 = (o.C3431gf) r0
                r6.f2195 = r0
                goto L_0x00a4
            L_0x000e:
                o.gJ r0 = r6.f2200
                int r0 = r0.f2191
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0027
                int r0 = r6.f2199
                int r0 = r0 + r3
                r6.f2199 = r0
                int r0 = r6.f2199
                o.gJ r4 = r6.f2200
                int r4 = r4.f2191
                if (r0 >= r4) goto L_0x0035
            L_0x0027:
                int r0 = r6.f2196
                o.gJ r4 = r6.f2200
                java.lang.CharSequence r4 = r4.f2194
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x004b
            L_0x0035:
                int r0 = r6.f2197
                o.gf r1 = new o.gf
                o.gJ r4 = r6.f2200
                java.lang.CharSequence r4 = r4.f2194
                int r4 = o.gK.m2366(r4)
                r1.<init>(r0, r4)
                r6.f2195 = r1
                r6.f2196 = r2
                goto L_0x00a2
            L_0x004b:
                o.gJ r0 = r6.f2200
                o.fy r0 = r0.f2192
                o.gJ r4 = r6.f2200
                java.lang.CharSequence r4 = r4.f2194
                int r5 = r6.f2196
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.m2299(r4, r5)
                o.dr r0 = (o.C3363dr) r0
                if (r0 != 0) goto L_0x007b
                int r0 = r6.f2197
                o.gf r1 = new o.gf
                o.gJ r4 = r6.f2200
                java.lang.CharSequence r4 = r4.f2194
                int r4 = o.gK.m2366(r4)
                r1.<init>(r0, r4)
                r6.f2195 = r1
                r6.f2196 = r2
                goto L_0x00a2
            L_0x007b:
                java.lang.Object r2 = r0.m2102()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m2103()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f2197
                o.gf r4 = o.C3435gj.m2411(r4, r2)
                r6.f2195 = r4
                int r2 = r2 + r0
                r6.f2197 = r2
                int r2 = r6.f2197
                if (r0 != 0) goto L_0x009f
                r1 = 1
            L_0x009f:
                int r2 = r2 + r1
                r6.f2196 = r2
            L_0x00a2:
                r6.f2198 = r3
            L_0x00a4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.gJ.C0176.m2329():void");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C3431gf next() {
            if (this.f2198 == -1) {
                m2329();
            }
            if (this.f2198 != 0) {
                C3431gf gfVar = this.f2195;
                if (gfVar != null) {
                    this.f2195 = null;
                    this.f2198 = -1;
                    return gfVar;
                }
                throw new dA("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            if (this.f2198 == -1) {
                m2329();
            }
            return this.f2198 == 1;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Iterator<C3431gf> m2328() {
        return new C0176(this);
    }
}
