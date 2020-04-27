package o;

import java.util.Map;
import o.C2071;
import o.C2071.C2072;
import o.C3015;
import o.C3076;

/* renamed from: o.ιҝ  reason: contains not printable characters */
final class C2071<FieldDescriptorType extends C2072<FieldDescriptorType>> {

    /* renamed from: ı  reason: contains not printable characters */
    boolean f10145 = false;

    /* renamed from: Ι  reason: contains not printable characters */
    final C3015<FieldDescriptorType, Object> f10146 = new C3015<FieldDescriptorType, Object>(16) {
        public final /* synthetic */ Object put(Object obj, Object obj2) {
            return C3015.super.put((C2071.C2072) obj, obj2);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m15455() {
            Iterable<Map.Entry> iterable;
            if (!this.f13909) {
                for (int i = 0; i < this.f13906.size(); i++) {
                    this.f13906.get(i).getKey();
                }
                if (this.f13908.isEmpty()) {
                    iterable = C3016.m15458();
                } else {
                    iterable = this.f13908.entrySet();
                }
                for (Map.Entry key : iterable) {
                    key.getKey();
                }
            }
            C3015.super.m15452();
        }
    };

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f10147;

    /* renamed from: o.ιҝ$ı  reason: contains not printable characters */
    public interface C2072<T extends C2072<T>> extends Comparable<T> {
    }

    private C2071() {
    }

    private C2071(byte b) {
        if (!this.f10147) {
            this.f10146.m15452();
            this.f10147 = true;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static <T extends C2072<T>> C2071<T> m11000() {
        return new C2071<>();
    }

    static {
        new C2071((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2071)) {
            return false;
        }
        return this.f10146.equals(((C2071) obj).f10146);
    }

    public final int hashCode() {
        return this.f10146.hashCode();
    }

    /* renamed from: o.ιҝ$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: Ι  reason: contains not printable characters */
        private static /* synthetic */ int[] f10148 = new int[C3076.C3077.values().length];

        /* renamed from: ι  reason: contains not printable characters */
        static final /* synthetic */ int[] f10149 = new int[C3076.If.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(57:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(63:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(64:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00ed */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x010b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0115 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0129 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0133 */
        static {
            /*
                o.էӀ$ǃ[] r0 = o.C3076.C3077.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10148 = r0
                r0 = 1
                int[] r1 = f10148     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.էӀ$ǃ r2 = o.C3076.C3077.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f10148     // Catch:{ NoSuchFieldError -> 0x001f }
                o.էӀ$ǃ r3 = o.C3076.C3077.FLOAT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f10148     // Catch:{ NoSuchFieldError -> 0x002a }
                o.էӀ$ǃ r4 = o.C3076.C3077.INT64     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f10148     // Catch:{ NoSuchFieldError -> 0x0035 }
                o.էӀ$ǃ r5 = o.C3076.C3077.UINT64     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = f10148     // Catch:{ NoSuchFieldError -> 0x0040 }
                o.էӀ$ǃ r6 = o.C3076.C3077.INT32     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                r5 = 6
                int[] r6 = f10148     // Catch:{ NoSuchFieldError -> 0x004b }
                o.էӀ$ǃ r7 = o.C3076.C3077.FIXED64     // Catch:{ NoSuchFieldError -> 0x004b }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                r6 = 7
                int[] r7 = f10148     // Catch:{ NoSuchFieldError -> 0x0056 }
                o.էӀ$ǃ r8 = o.C3076.C3077.FIXED32     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                r7 = 8
                int[] r8 = f10148     // Catch:{ NoSuchFieldError -> 0x0062 }
                o.էӀ$ǃ r9 = o.C3076.C3077.BOOL     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                r8 = 9
                int[] r9 = f10148     // Catch:{ NoSuchFieldError -> 0x006e }
                o.էӀ$ǃ r10 = o.C3076.C3077.GROUP     // Catch:{ NoSuchFieldError -> 0x006e }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r9 = f10148     // Catch:{ NoSuchFieldError -> 0x007a }
                o.էӀ$ǃ r10 = o.C3076.C3077.MESSAGE     // Catch:{ NoSuchFieldError -> 0x007a }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r9 = f10148     // Catch:{ NoSuchFieldError -> 0x0086 }
                o.էӀ$ǃ r10 = o.C3076.C3077.STRING     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r9 = f10148     // Catch:{ NoSuchFieldError -> 0x0092 }
                o.էӀ$ǃ r10 = o.C3076.C3077.BYTES     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r9 = f10148     // Catch:{ NoSuchFieldError -> 0x009e }
                o.էӀ$ǃ r10 = o.C3076.C3077.UINT32     // Catch:{ NoSuchFieldError -> 0x009e }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r9 = f10148     // Catch:{ NoSuchFieldError -> 0x00aa }
                o.էӀ$ǃ r10 = o.C3076.C3077.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                int[] r9 = f10148     // Catch:{ NoSuchFieldError -> 0x00b6 }
                o.էӀ$ǃ r10 = o.C3076.C3077.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                int[] r9 = f10148     // Catch:{ NoSuchFieldError -> 0x00c2 }
                o.էӀ$ǃ r10 = o.C3076.C3077.SINT32     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                int[] r9 = f10148     // Catch:{ NoSuchFieldError -> 0x00ce }
                o.էӀ$ǃ r10 = o.C3076.C3077.SINT64     // Catch:{ NoSuchFieldError -> 0x00ce }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ce }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00ce }
            L_0x00ce:
                int[] r9 = f10148     // Catch:{ NoSuchFieldError -> 0x00da }
                o.էӀ$ǃ r10 = o.C3076.C3077.ENUM     // Catch:{ NoSuchFieldError -> 0x00da }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00da }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00da }
            L_0x00da:
                o.էӀ$If[] r9 = o.C3076.If.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f10149 = r9
                int[] r9 = f10149     // Catch:{ NoSuchFieldError -> 0x00ed }
                o.էӀ$If r10 = o.C3076.If.INT     // Catch:{ NoSuchFieldError -> 0x00ed }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ed }
                r9[r10] = r0     // Catch:{ NoSuchFieldError -> 0x00ed }
            L_0x00ed:
                int[] r0 = f10149     // Catch:{ NoSuchFieldError -> 0x00f7 }
                o.էӀ$If r9 = o.C3076.If.LONG     // Catch:{ NoSuchFieldError -> 0x00f7 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f7 }
                r0[r9] = r1     // Catch:{ NoSuchFieldError -> 0x00f7 }
            L_0x00f7:
                int[] r0 = f10149     // Catch:{ NoSuchFieldError -> 0x0101 }
                o.էӀ$If r1 = o.C3076.If.FLOAT     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                int[] r0 = f10149     // Catch:{ NoSuchFieldError -> 0x010b }
                o.էӀ$If r1 = o.C3076.If.DOUBLE     // Catch:{ NoSuchFieldError -> 0x010b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010b }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x010b }
            L_0x010b:
                int[] r0 = f10149     // Catch:{ NoSuchFieldError -> 0x0115 }
                o.էӀ$If r1 = o.C3076.If.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0115 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0115 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0115 }
            L_0x0115:
                int[] r0 = f10149     // Catch:{ NoSuchFieldError -> 0x011f }
                o.էӀ$If r1 = o.C3076.If.STRING     // Catch:{ NoSuchFieldError -> 0x011f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011f }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011f }
            L_0x011f:
                int[] r0 = f10149     // Catch:{ NoSuchFieldError -> 0x0129 }
                o.էӀ$If r1 = o.C3076.If.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0129 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0129 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0129 }
            L_0x0129:
                int[] r0 = f10149     // Catch:{ NoSuchFieldError -> 0x0133 }
                o.էӀ$If r1 = o.C3076.If.ENUM     // Catch:{ NoSuchFieldError -> 0x0133 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0133 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0133 }
            L_0x0133:
                int[] r0 = f10149     // Catch:{ NoSuchFieldError -> 0x013d }
                o.էӀ$If r1 = o.C3076.If.MESSAGE     // Catch:{ NoSuchFieldError -> 0x013d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x013d }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x013d }
            L_0x013d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C2071.AnonymousClass5.<clinit>():void");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if ((r5 instanceof o.C2702.C2703) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if ((r5 instanceof byte[]) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if ((r5 instanceof o.C2705) == false) goto L_0x0041;
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10999(FieldDescriptorType r4, java.lang.Object r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L_0x0057
            int[] r0 = o.C2071.AnonymousClass5.f10149
            r1 = 0
            o.էӀ$If r1 = r1.f14064
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x003e;
                case 2: goto L_0x003b;
                case 3: goto L_0x0038;
                case 4: goto L_0x0035;
                case 5: goto L_0x0032;
                case 6: goto L_0x002f;
                case 7: goto L_0x0026;
                case 8: goto L_0x001c;
                case 9: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0041
        L_0x0013:
            boolean r0 = r5 instanceof o.C2993
            if (r0 != 0) goto L_0x0024
            boolean r0 = r5 instanceof o.C2705
            if (r0 == 0) goto L_0x0041
            goto L_0x0024
        L_0x001c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0024
            boolean r0 = r5 instanceof o.C2702.C2703
            if (r0 == 0) goto L_0x0041
        L_0x0024:
            r2 = 1
            goto L_0x0041
        L_0x0026:
            boolean r0 = r5 instanceof o.C1767
            if (r0 != 0) goto L_0x0024
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L_0x0041
            goto L_0x0024
        L_0x002f:
            boolean r0 = r5 instanceof java.lang.String
            goto L_0x0040
        L_0x0032:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L_0x0040
        L_0x0035:
            boolean r0 = r5 instanceof java.lang.Double
            goto L_0x0040
        L_0x0038:
            boolean r0 = r5 instanceof java.lang.Float
            goto L_0x0040
        L_0x003b:
            boolean r0 = r5 instanceof java.lang.Long
            goto L_0x0040
        L_0x003e:
            boolean r0 = r5 instanceof java.lang.Integer
        L_0x0040:
            r2 = r0
        L_0x0041:
            if (r2 == 0) goto L_0x004f
            boolean r0 = r5 instanceof o.C2705
            if (r0 == 0) goto L_0x0049
            r3.f10145 = r1
        L_0x0049:
            o.Ե<FieldDescriptorType, java.lang.Object> r0 = r3.f10146
            r0.put(r4, r5)
            return
        L_0x004f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Wrong object type used with protocol message reflection."
            r4.<init>(r5)
            throw r4
        L_0x0057:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2071.m10999(o.ιҝ$ı, java.lang.Object):void");
    }

    public final /* synthetic */ Object clone() {
        Iterable<Map.Entry> iterable;
        C2071 r0 = new C2071();
        for (int i = 0; i < this.f10146.f13906.size(); i++) {
            Map.Entry entry = this.f10146.f13906.get(i);
            r0.m10999((C2072) entry.getKey(), entry.getValue());
        }
        C3015<FieldDescriptorType, Object> r1 = this.f10146;
        if (r1.f13908.isEmpty()) {
            iterable = C3015.C3016.m15458();
        } else {
            iterable = r1.f13908.entrySet();
        }
        for (Map.Entry entry2 : iterable) {
            r0.m10999((C2072) entry2.getKey(), entry2.getValue());
        }
        r0.f10145 = this.f10145;
        return r0;
    }
}
