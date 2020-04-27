package o;

import java.util.List;
import o.C3074;

/* renamed from: o.դ  reason: contains not printable characters */
public final class C3064 implements C1086 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f14004;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f14005;

    C3064() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0123, code lost:
        if (((java.lang.Boolean) r9).booleanValue() == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0135, code lost:
        if (((java.lang.Integer) r9).intValue() == 0) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0146, code lost:
        if (((java.lang.Float) r9).floatValue() == 0.0f) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0158, code lost:
        if (((java.lang.Double) r9).doubleValue() == 0.0d) goto L_0x0125;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018f  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m15636(o.C2993 r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01a8
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = ""
            java.lang.String r3 = r3.replaceFirst(r7, r4)
            java.lang.String r6 = "List"
            boolean r6 = r3.endsWith(r6)
            r8 = 1
            if (r6 == 0) goto L_0x00ab
            java.lang.String r6 = "OrBuilderList"
            boolean r6 = r3.endsWith(r6)
            if (r6 != 0) goto L_0x00ab
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = r3.substring(r5, r8)
            java.lang.String r9 = r9.toLowerCase()
            r6.append(r9)
            int r9 = r3.length()
            int r9 = r9 + -4
            java.lang.String r9 = r3.substring(r8, r9)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r9 = r7.concat(r3)
            java.lang.Object r9 = r0.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00ab
            java.lang.String r3 = m15635(r6)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = o.C2669.m14153((java.lang.reflect.Method) r9, (java.lang.Object) r13, (java.lang.Object[]) r4)
            m15634(r14, r15, r3, r4)
            goto L_0x004d
        L_0x00ab:
            java.lang.String r6 = "set"
            java.lang.String r6 = r6.concat(r3)
            java.lang.Object r6 = r1.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L_0x004d
            java.lang.String r6 = "Bytes"
            boolean r6 = r3.endsWith(r6)
            if (r6 == 0) goto L_0x00dd
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r7)
            int r9 = r3.length()
            int r9 = r9 + -5
            java.lang.String r9 = r3.substring(r5, r9)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            boolean r6 = r0.containsKey(r6)
            if (r6 != 0) goto L_0x004d
        L_0x00dd:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = r3.substring(r5, r8)
            java.lang.String r9 = r9.toLowerCase()
            r6.append(r9)
            java.lang.String r9 = r3.substring(r8)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r9 = r7.concat(r3)
            java.lang.Object r9 = r0.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.String r10 = "has"
            java.lang.String r3 = r10.concat(r3)
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r9 == 0) goto L_0x004d
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Object r9 = o.C2669.m14153((java.lang.reflect.Method) r9, (java.lang.Object) r13, (java.lang.Object[]) r10)
            if (r3 != 0) goto L_0x0191
            boolean r3 = r9 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x012a
            r3 = r9
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0128
        L_0x0125:
            r3 = 1
            goto L_0x018b
        L_0x0128:
            r3 = 0
            goto L_0x018b
        L_0x012a:
            boolean r3 = r9 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x0138
            r3 = r9
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x0128
            goto L_0x0125
        L_0x0138:
            boolean r3 = r9 instanceof java.lang.Float
            if (r3 == 0) goto L_0x0149
            r3 = r9
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0128
            goto L_0x0125
        L_0x0149:
            boolean r3 = r9 instanceof java.lang.Double
            if (r3 == 0) goto L_0x015b
            r3 = r9
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r10 = 0
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0128
            goto L_0x0125
        L_0x015b:
            boolean r3 = r9 instanceof java.lang.String
            if (r3 == 0) goto L_0x0164
            boolean r3 = r9.equals(r4)
            goto L_0x018b
        L_0x0164:
            boolean r3 = r9 instanceof o.C1767
            if (r3 == 0) goto L_0x016f
            o.Β r3 = o.C1767.f9079
            boolean r3 = r9.equals(r3)
            goto L_0x018b
        L_0x016f:
            boolean r3 = r9 instanceof o.C2993
            if (r3 == 0) goto L_0x017d
            r3 = r9
            o.ԟι r3 = (o.C2993) r3
            o.ԟι r3 = r3.m15523()
            if (r9 != r3) goto L_0x0128
            goto L_0x0125
        L_0x017d:
            boolean r3 = r9 instanceof java.lang.Enum
            if (r3 == 0) goto L_0x0128
            r3 = r9
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r3 = r3.ordinal()
            if (r3 != 0) goto L_0x0128
            goto L_0x0125
        L_0x018b:
            if (r3 != 0) goto L_0x018f
            r3 = 1
            goto L_0x019d
        L_0x018f:
            r3 = 0
            goto L_0x019d
        L_0x0191:
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r3 = o.C2669.m14153((java.lang.reflect.Method) r3, (java.lang.Object) r13, (java.lang.Object[]) r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
        L_0x019d:
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = m15635(r6)
            m15634(r14, r15, r3, r9)
            goto L_0x004d
        L_0x01a8:
            boolean r0 = r13 instanceof o.C2669.C2670
            if (r0 == 0) goto L_0x01fe
            r0 = r13
            o.ҏ$ı r0 = (o.C2669.C2670) r0
            o.ιҝ<o.ҏ$if> r0 = r0.f12296
            boolean r1 = r0.f10145
            if (r1 == 0) goto L_0x01c5
            o.ҝι$if r1 = new o.ҝι$if
            o.Ե<FieldDescriptorType, java.lang.Object> r0 = r0.f10146
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            goto L_0x01cf
        L_0x01c5:
            o.Ե<FieldDescriptorType, java.lang.Object> r0 = r0.f10146
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L_0x01cf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01fe
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "["
            r2.<init>(r3)
            java.lang.Object r3 = r0.getKey()
            o.ҏ$if r3 = (o.C2669.Cif) r3
            int r3 = r3.f12295
            r2.append(r3)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.getValue()
            m15634(r14, r15, r2, r0)
            goto L_0x01cf
        L_0x01fe:
            o.ҏ r13 = (o.C2669) r13
            o.ղ r0 = r13.f12289
            if (r0 == 0) goto L_0x0209
            o.ղ r13 = r13.f12289
            r13.m15883((java.lang.StringBuilder) r14, (int) r15)
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3064.m15636(o.ԟι, java.lang.StringBuilder, int):void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    static final void m15634(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object r0 : (List) obj) {
                m15634(sb, i, str, r0);
            }
            return;
        }
        sb.append(10);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(C3074.m15677((C3074.C3075) new C3074.C3075(C1767.m9854((String) obj)) {

                /* renamed from: ǃ  reason: contains not printable characters */
                private /* synthetic */ C1767 f14033;

                {
                    this.f14033 = r1;
                }

                /* renamed from: ı  reason: contains not printable characters */
                public final int m15682() {
                    return this.f14033.m9861();
                }

                /* renamed from: ι  reason: contains not printable characters */
                public final byte m15683(int i) {
                    return this.f14033.m9864(i);
                }
            }));
            sb.append('\"');
        } else if (obj instanceof C1767) {
            sb.append(": \"");
            sb.append(C3074.m15677((C3074.C3075) new C3074.C3075((C1767) obj) {

                /* renamed from: ǃ  reason: contains not printable characters */
                private /* synthetic */ C1767 f14033;

                {
                    this.f14033 = r1;
                }

                /* renamed from: ı  reason: contains not printable characters */
                public final int m15682() {
                    return this.f14033.m9861();
                }

                /* renamed from: ι  reason: contains not printable characters */
                public final byte m15683(int i) {
                    return this.f14033.m9864(i);
                }
            }));
            sb.append('\"');
        } else if (obj instanceof C2669) {
            sb.append(" {");
            m15636((C2669) obj, sb, i + 2);
            sb.append("\n");
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append("}");
        } else {
            sb.append(": ");
            sb.append(obj.toString());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final String m15635(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append(C3292bc.f1729);
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public C3064(String str, String str2) {
        this.f14005 = str;
        this.f14004 = str2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m15637() {
        return this.f14005;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m15638() {
        return this.f14004;
    }
}
