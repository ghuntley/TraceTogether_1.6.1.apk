package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.C0778;
import o.C2745;

/* renamed from: o.ſι  reason: contains not printable characters */
public class C0593 {

    /* renamed from: ı  reason: contains not printable characters */
    final String f4518;

    /* renamed from: Ɩ  reason: contains not printable characters */
    HashMap<String, C0420> f4519;

    /* renamed from: ǃ  reason: contains not printable characters */
    C0643 f4520;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f4521;

    /* renamed from: Ι  reason: contains not printable characters */
    public int f4522;

    /* renamed from: ι  reason: contains not printable characters */
    private CharSequence f4523;

    /* renamed from: І  reason: contains not printable characters */
    C1286<C2745.C3657iF> f4524;

    /* renamed from: і  reason: contains not printable characters */
    ArrayList<C0504> f4525;

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m5243() {
        return true;
    }

    /* renamed from: o.ſι$if  reason: invalid class name */
    static class Cif implements Comparable<Cif> {

        /* renamed from: ı  reason: contains not printable characters */
        private final boolean f4526;

        /* renamed from: ǃ  reason: contains not printable characters */
        final Bundle f4527;

        /* renamed from: ɩ  reason: contains not printable characters */
        final C0593 f4528;

        Cif(C0593 r1, Bundle bundle, boolean z) {
            this.f4528 = r1;
            this.f4527 = bundle;
            this.f4526 = z;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final int compareTo(Cif ifVar) {
            if (this.f4526 && !ifVar.f4526) {
                return 1;
            }
            if (this.f4526 || !ifVar.f4526) {
                return this.f4527.size() - ifVar.f4527.size();
            }
            return -1;
        }
    }

    static {
        new HashMap();
    }

    /* renamed from: ι  reason: contains not printable characters */
    static String m5240(Context context, int i) {
        if (i <= 16777215) {
            return Integer.toString(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i);
        }
    }

    public C0593(C0712<? extends C0593> r1) {
        this(C0699.m5750((Class<? extends C0712>) r1.getClass()));
    }

    private C0593(String str) {
        this.f4518 = str;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m5242(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0778.Cif.f5191);
        this.f4522 = obtainAttributes.getResourceId(C0778.Cif.f5187, 0);
        this.f4521 = null;
        this.f4521 = m5240(context, this.f4522);
        this.f4523 = obtainAttributes.getText(C0778.Cif.f5188);
        obtainAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public String m5246() {
        if (this.f4521 == null) {
            this.f4521 = Integer.toString(this.f4522);
        }
        return this.f4521;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.util.regex.Matcher} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f4 A[LOOP:3: B:28:0x00a4->B:48:0x00f4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f2 A[SYNTHETIC] */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.C0593.Cif m5245(android.net.Uri r17) {
        /*
            r16 = this;
            r0 = r16
            java.util.ArrayList<o.ŀɩ> r1 = r0.f4525
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.util.Iterator r1 = r1.iterator()
            r3 = r2
        L_0x000d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0110
            java.lang.Object r4 = r1.next()
            o.ŀɩ r4 = (o.C0504) r4
            java.util.HashMap<java.lang.String, o.ıс> r5 = r0.f4519
            if (r5 != 0) goto L_0x0022
            java.util.Map r5 = java.util.Collections.emptyMap()
            goto L_0x0026
        L_0x0022:
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)
        L_0x0026:
            java.util.regex.Pattern r6 = r4.f4208
            java.lang.String r7 = r17.toString()
            java.util.regex.Matcher r6 = r6.matcher(r7)
            boolean r7 = r6.matches()
            if (r7 != 0) goto L_0x003a
        L_0x0036:
            r11 = r17
            goto L_0x00fb
        L_0x003a:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.util.ArrayList<java.lang.String> r8 = r4.f4204
            int r8 = r8.size()
            r10 = 0
        L_0x0046:
            if (r10 >= r8) goto L_0x0067
            java.util.ArrayList<java.lang.String> r11 = r4.f4204
            java.lang.Object r11 = r11.get(r10)
            java.lang.String r11 = (java.lang.String) r11
            int r10 = r10 + 1
            java.lang.String r12 = r6.group(r10)
            java.lang.String r12 = android.net.Uri.decode(r12)
            java.lang.Object r13 = r5.get(r11)
            o.ıс r13 = (o.C0420) r13
            boolean r11 = o.C0504.m4907(r7, r11, r12, r13)
            if (r11 == 0) goto L_0x0046
            goto L_0x0036
        L_0x0067:
            boolean r6 = r4.f4206
            if (r6 == 0) goto L_0x00f8
            java.util.Map<java.lang.String, o.ŀɩ$ı> r6 = r4.f4207
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0075:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00f8
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map<java.lang.String, o.ŀɩ$ı> r10 = r4.f4207
            java.lang.Object r10 = r10.get(r8)
            o.ŀɩ$ı r10 = (o.C0504.C0505) r10
            r11 = r17
            java.lang.String r8 = r11.getQueryParameter(r8)
            if (r8 == 0) goto L_0x00a2
            java.lang.String r12 = r10.f4209
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r12)
            java.util.regex.Matcher r8 = r12.matcher(r8)
            boolean r12 = r8.matches()
            if (r12 != 0) goto L_0x00a3
            goto L_0x00fb
        L_0x00a2:
            r8 = r2
        L_0x00a3:
            r12 = 0
        L_0x00a4:
            java.util.ArrayList<java.lang.String> r13 = r10.f4210
            int r13 = r13.size()
            if (r12 >= r13) goto L_0x0075
            if (r8 == 0) goto L_0x00b9
            int r13 = r12 + 1
            java.lang.String r13 = r8.group(r13)
            java.lang.String r13 = android.net.Uri.decode(r13)
            goto L_0x00ba
        L_0x00b9:
            r13 = r2
        L_0x00ba:
            java.util.ArrayList<java.lang.String> r14 = r10.f4210
            java.lang.Object r14 = r14.get(r12)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r5.get(r14)
            o.ıс r15 = (o.C0420) r15
            if (r15 == 0) goto L_0x00eb
            if (r13 == 0) goto L_0x00da
            java.lang.String r2 = "[{}]"
            java.lang.String r9 = ""
            java.lang.String r2 = r13.replaceAll(r2, r9)
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x00eb
        L_0x00da:
            java.lang.Object r2 = r15.f3993
            if (r2 == 0) goto L_0x00e5
            java.lang.Object r2 = r15.f3993
            java.lang.String r2 = r2.toString()
            goto L_0x00ec
        L_0x00e5:
            boolean r2 = r15.f3996
            if (r2 == 0) goto L_0x00eb
            r2 = 0
            goto L_0x00ec
        L_0x00eb:
            r2 = r13
        L_0x00ec:
            boolean r2 = o.C0504.m4907(r7, r14, r2, r15)
            if (r2 == 0) goto L_0x00f4
            r2 = 0
            goto L_0x00fb
        L_0x00f4:
            int r12 = r12 + 1
            r2 = 0
            goto L_0x00a4
        L_0x00f8:
            r11 = r17
            r2 = r7
        L_0x00fb:
            if (r2 == 0) goto L_0x010d
            o.ſι$if r5 = new o.ſι$if
            boolean r4 = r4.f4205
            r5.<init>(r0, r2, r4)
            if (r3 == 0) goto L_0x010c
            int r2 = r5.compareTo(r3)
            if (r2 <= 0) goto L_0x010d
        L_0x010c:
            r3 = r5
        L_0x010d:
            r2 = 0
            goto L_0x000d
        L_0x0110:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0593.m5245(android.net.Uri):o.ſι$if");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final int[] m5241() {
        ArrayDeque arrayDeque = new ArrayDeque();
        C0643 r1 = this;
        while (true) {
            C0643 r2 = r1.f4520;
            if (r2 == null || r2.f4640 != r1.f4522) {
                arrayDeque.addFirst(r1);
            }
            if (r2 == null) {
                break;
            }
            r1 = r2;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i = 0;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            iArr[i] = ((C0593) it.next()).f4522;
            i++;
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Bundle m5244(Bundle bundle) {
        HashMap<String, C0420> hashMap;
        if (bundle == null && ((hashMap = this.f4519) == null || hashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, C0420> hashMap2 = this.f4519;
        if (hashMap2 != null) {
            for (Map.Entry next : hashMap2.entrySet()) {
                C0420 r3 = (C0420) next.getValue();
                String str = (String) next.getKey();
                if (r3.f3995) {
                    r3.f3994.m5566(bundle2, str, r3.f3993);
                }
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, C0420> hashMap3 = this.f4519;
            if (hashMap3 != null) {
                for (Map.Entry next2 : hashMap3.entrySet()) {
                    if (!((C0420) next2.getValue()).m4711((String) next2.getKey(), bundle)) {
                        StringBuilder sb = new StringBuilder("Wrong argument type for '");
                        sb.append((String) next2.getKey());
                        sb.append("' in argument bundle. ");
                        sb.append(((C0420) next2.getValue()).f3994.m5567());
                        sb.append(" expected.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return bundle2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f4521;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f4522));
        } else {
            sb.append(str);
        }
        sb.append(")");
        if (this.f4523 != null) {
            sb.append(" label=");
            sb.append(this.f4523);
        }
        return sb.toString();
    }
}
