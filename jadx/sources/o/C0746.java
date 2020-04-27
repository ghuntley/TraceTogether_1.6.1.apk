package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import o.C0712;
import o.C0818;
import o.C1550;

@C0712.Cif(m5830 = "fragment")
/* renamed from: o.ƚι  reason: contains not printable characters */
public final class C0746 extends C0712<Cif> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Context f5014;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f5015;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1550 f5016;

    /* renamed from: ι  reason: contains not printable characters */
    private ArrayDeque<Integer> f5017 = new ArrayDeque<>();

    /* renamed from: o.ƚι$ɩ  reason: contains not printable characters */
    public static final class C0747 implements C0712.C0713 {

        /* renamed from: ι  reason: contains not printable characters */
        final LinkedHashMap<View, String> f5019;
    }

    public C0746(Context context, C1550 r3, int i) {
        this.f5014 = context;
        this.f5016 = r3;
        this.f5015 = i;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m5970() {
        if (this.f5017.isEmpty()) {
            return false;
        }
        C1550 r0 = this.f5016;
        if (r0.f8272 || r0.f8276) {
            return false;
        }
        C1550 r02 = this.f5016;
        int size = this.f5017.size();
        int intValue = this.f5017.peekLast().intValue();
        StringBuilder sb = new StringBuilder();
        sb.append(size);
        sb.append("-");
        sb.append(intValue);
        r02.m9092((C1550.C1553) new C1550.Cif(sb.toString(), -1, 1), false);
        this.f5017.removeLast();
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01fb A[RETURN] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.C0593 m5967(o.C0746.Cif r11, android.os.Bundle r12, o.C0665 r13, o.C0712.C0713 r14) {
        /*
            r10 = this;
            o.ɾι r0 = r10.f5016
            boolean r1 = r0.f8272
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x000f
            boolean r0 = r0.f8276
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r1 = 0
            if (r0 == 0) goto L_0x0014
            return r1
        L_0x0014:
            java.lang.String r0 = r11.f5018
            if (r0 == 0) goto L_0x020a
            java.lang.String r0 = r11.f5018
            char r4 = r0.charAt(r2)
            r5 = 46
            if (r4 != r5) goto L_0x0037
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.Context r5 = r10.f5014
            java.lang.String r5 = r5.getPackageName()
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x0037:
            android.content.Context r4 = r10.f5014
            o.ɾι r5 = r10.f5016
            o.ɩʟ r6 = r5.f8259
            if (r6 == 0) goto L_0x0048
            o.ɩʟ r5 = r5.f8259
            o.ɾι r5 = r5.mFragmentManager
            o.ɹΙ r5 = r5.m9131()
            goto L_0x004a
        L_0x0048:
            o.ɹΙ r5 = r5.f8279
        L_0x004a:
            java.lang.ClassLoader r4 = r4.getClassLoader()
            o.ɩʟ r0 = r5.m8798(r4, r0)
            r0.setArguments(r12)
            o.ɾι r12 = r10.f5016
            o.ɩɪ r4 = new o.ɩɪ
            r4.<init>(r12)
            r12 = -1
            if (r13 == 0) goto L_0x0062
            int r5 = r13.f4741
            goto L_0x0063
        L_0x0062:
            r5 = -1
        L_0x0063:
            if (r13 == 0) goto L_0x0068
            int r6 = r13.f4739
            goto L_0x0069
        L_0x0068:
            r6 = -1
        L_0x0069:
            if (r13 == 0) goto L_0x006e
            int r7 = r13.f4740
            goto L_0x006f
        L_0x006e:
            r7 = -1
        L_0x006f:
            if (r13 == 0) goto L_0x0074
            int r8 = r13.f4745
            goto L_0x0075
        L_0x0074:
            r8 = -1
        L_0x0075:
            if (r5 != r12) goto L_0x007d
            if (r6 != r12) goto L_0x007d
            if (r7 != r12) goto L_0x007d
            if (r8 == r12) goto L_0x0095
        L_0x007d:
            if (r5 == r12) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r5 = 0
        L_0x0081:
            if (r6 == r12) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r6 = 0
        L_0x0085:
            if (r7 == r12) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r7 = 0
        L_0x0089:
            if (r8 == r12) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r8 = 0
        L_0x008d:
            r4.f9209 = r5
            r4.f9203 = r6
            r4.f9217 = r7
            r4.f9219 = r8
        L_0x0095:
            int r5 = r10.f5015
            if (r5 == 0) goto L_0x0202
            r6 = 2
            r4.m9968(r5, r0, r1, r6)
            r4.m9967(r0)
            int r0 = r11.f4522
            java.util.ArrayDeque<java.lang.Integer> r5 = r10.f5017
            boolean r5 = r5.isEmpty()
            if (r13 == 0) goto L_0x00c0
            if (r5 != 0) goto L_0x00c0
            boolean r13 = r13.f4743
            if (r13 == 0) goto L_0x00c0
            java.util.ArrayDeque<java.lang.Integer> r13 = r10.f5017
            java.lang.Object r13 = r13.peekLast()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            if (r13 != r0) goto L_0x00c0
            r13 = 1
            goto L_0x00c1
        L_0x00c0:
            r13 = 0
        L_0x00c1:
            if (r5 == 0) goto L_0x00c6
        L_0x00c3:
            r2 = 1
            goto L_0x014c
        L_0x00c6:
            java.lang.String r5 = "This FragmentTransaction is not allowed to be added to the back stack."
            java.lang.String r6 = "-"
            if (r13 == 0) goto L_0x0129
            java.util.ArrayDeque<java.lang.Integer> r13 = r10.f5017
            int r13 = r13.size()
            if (r13 <= r3) goto L_0x014c
            o.ɾι r13 = r10.f5016
            java.util.ArrayDeque<java.lang.Integer> r7 = r10.f5017
            int r7 = r7.size()
            java.util.ArrayDeque<java.lang.Integer> r8 = r10.f5017
            java.lang.Object r8 = r8.peekLast()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r6)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            o.ɾι$if r8 = new o.ɾι$if
            r8.<init>(r7, r12, r3)
            r13.m9092((o.C1550.C1553) r8, (boolean) r2)
            java.util.ArrayDeque<java.lang.Integer> r12 = r10.f5017
            int r12 = r12.size()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r6)
            r13.append(r0)
            java.lang.String r12 = r13.toString()
            boolean r13 = r4.f9218
            if (r13 == 0) goto L_0x0123
            r4.f9211 = r3
            r4.f9212 = r12
            goto L_0x014c
        L_0x0123:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r5)
            throw r11
        L_0x0129:
            java.util.ArrayDeque<java.lang.Integer> r12 = r10.f5017
            int r12 = r12.size()
            int r12 = r12 + r3
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r6)
            r13.append(r0)
            java.lang.String r12 = r13.toString()
            boolean r13 = r4.f9218
            if (r13 == 0) goto L_0x01fc
            r4.f9211 = r3
            r4.f9212 = r12
            goto L_0x00c3
        L_0x014c:
            boolean r12 = r14 instanceof o.C0746.C0747
            if (r12 == 0) goto L_0x01ea
            o.ƚι$ɩ r14 = (o.C0746.C0747) r14
            java.util.LinkedHashMap<android.view.View, java.lang.String> r12 = r14.f5019
            java.util.Map r12 = java.util.Collections.unmodifiableMap(r12)
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0160:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01ea
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getKey()
            android.view.View r14 = (android.view.View) r14
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            boolean r5 = o.C1827.m10109()
            if (r5 == 0) goto L_0x0160
            java.lang.String r14 = o.C0293.m4215(r14)
            if (r14 == 0) goto L_0x01e2
            java.util.ArrayList<java.lang.String> r5 = r4.f9213
            if (r5 != 0) goto L_0x0197
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f9213 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f9204 = r5
            goto L_0x01a9
        L_0x0197:
            java.util.ArrayList<java.lang.String> r5 = r4.f9204
            boolean r5 = r5.contains(r13)
            java.lang.String r6 = "' has already been added to the transaction."
            if (r5 != 0) goto L_0x01cb
            java.util.ArrayList<java.lang.String> r5 = r4.f9213
            boolean r5 = r5.contains(r14)
            if (r5 != 0) goto L_0x01b4
        L_0x01a9:
            java.util.ArrayList<java.lang.String> r5 = r4.f9213
            r5.add(r14)
            java.util.ArrayList<java.lang.String> r14 = r4.f9204
            r14.add(r13)
            goto L_0x0160
        L_0x01b4:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "A shared element with the source name '"
            r12.<init>(r13)
            r12.append(r14)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x01cb:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "A shared element with the target name '"
            r12.<init>(r14)
            r12.append(r13)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x01e2:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Unique transitionNames are required for all sharedElements"
            r11.<init>(r12)
            throw r11
        L_0x01ea:
            r4.f9214 = r3
            r4.m9966()
            if (r2 == 0) goto L_0x01fb
            java.util.ArrayDeque<java.lang.Integer> r12 = r10.f5017
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r12.add(r13)
            return r11
        L_0x01fb:
            return r1
        L_0x01fc:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r5)
            throw r11
        L_0x0202:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Must use non-zero containerViewId"
            r11.<init>(r12)
            throw r11
        L_0x020a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Fragment class was not set"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0746.m5967(o.ƚι$if, android.os.Bundle, o.Ɩӏ, o.ƙ$ɩ):o.ſι");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Bundle m5969() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f5017.size()];
        Iterator<Integer> it = this.f5017.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5968(Bundle bundle) {
        int[] intArray;
        if (bundle != null && (intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds")) != null) {
            this.f5017.clear();
            for (int valueOf : intArray) {
                this.f5017.add(Integer.valueOf(valueOf));
            }
        }
    }

    /* renamed from: o.ƚι$if  reason: invalid class name */
    public static class Cif extends C0593 {

        /* renamed from: ɩ  reason: contains not printable characters */
        String f5018;

        public Cif(C0712<? extends Cif> r1) {
            super((C0712<? extends C0593>) r1);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m5971(Context context, AttributeSet attributeSet) {
            super.m5242(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0818.Cif.f5336);
            String string = obtainAttributes.getString(C0818.Cif.f5334);
            if (string != null) {
                this.f5018 = string;
            }
            obtainAttributes.recycle();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f5018;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            return sb.toString();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* synthetic */ C0593 m5966() {
        return new Cif(this);
    }
}
