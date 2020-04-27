package o;

import java.io.PrintWriter;
import java.util.ArrayList;
import o.C1277;
import o.C1550;
import o.C1795;
import o.C2319;

/* renamed from: o.ɩɪ  reason: contains not printable characters */
public final class C1265 extends C1795 implements C1550.C1553 {

    /* renamed from: ŀ  reason: contains not printable characters */
    private boolean f7153;

    /* renamed from: Ι  reason: contains not printable characters */
    int f7154;

    /* renamed from: ι  reason: contains not printable characters */
    final C1550 f7155;

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f7154 >= 0) {
            sb.append(" #");
            sb.append(this.f7154);
        }
        if (this.f9212 != null) {
            sb.append(" ");
            sb.append(this.f9212);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m8134(String str, PrintWriter printWriter) {
        m8135(str, printWriter, true);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m8135(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f9212);
            printWriter.print(" mIndex=");
            printWriter.print(this.f7154);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f7153);
            if (this.f9205 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f9205));
            }
            if (!(this.f9209 == 0 && this.f9203 == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9209));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9203));
            }
            if (!(this.f9217 == 0 && this.f9219 == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9217));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9219));
            }
            if (!(this.f9208 == 0 && this.f9220 == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9208));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f9220);
            }
            if (!(this.f9207 == 0 && this.f9210 == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9207));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f9210);
            }
        }
        if (!this.f9206.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f9206.size();
            for (int i = 0; i < size; i++) {
                C1795.If ifR = this.f9206.get(i);
                switch (ifR.f9226) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("cmd=");
                        sb.append(ifR.f9226);
                        str2 = sb.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(ifR.f9227);
                if (z) {
                    if (!(ifR.f9224 == 0 && ifR.f9221 == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(ifR.f9224));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(ifR.f9221));
                    }
                    if (ifR.f9223 != 0 || ifR.f9228 != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(ifR.f9223));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(ifR.f9228));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m8133(int i, C1277 r2, String str, int i2) {
        super.m9968(i, r2, str, i2);
        r2.mFragmentManager = this.f7155;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1795 m8127(C1277 r4) {
        if (r4.mFragmentManager == null || r4.mFragmentManager == this.f7155) {
            return super.m9965(r4);
        }
        StringBuilder sb = new StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sb.append(r4.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1795 m8124(C1277 r4) {
        if (r4.mFragmentManager == null || r4.mFragmentManager == this.f7155) {
            return super.m9962(r4);
        }
        StringBuilder sb = new StringBuilder("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        sb.append(r4.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1795 m8137(C1277 r4) {
        if (r4.mFragmentManager == null || r4.mFragmentManager == this.f7155) {
            return super.m9969(r4);
        }
        StringBuilder sb = new StringBuilder("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        sb.append(r4.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1795 m8132(C1277 r4) {
        if (r4 == null || r4.mFragmentManager == null || r4.mFragmentManager == this.f7155) {
            return super.m9967(r4);
        }
        StringBuilder sb = new StringBuilder("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        sb.append(r4.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C1795 m8121(C1277 r3, C2319.Cif ifVar) {
        if (r3.mFragmentManager == this.f7155) {
            if (ifVar.compareTo(C2319.Cif.CREATED) >= 0) {
                return super.m9961(r3, ifVar);
            }
            StringBuilder sb = new StringBuilder("Cannot set maximum Lifecycle below ");
            sb.append(C2319.Cif.CREATED);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
        sb2.append(this.f7155);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m8139(int i) {
        if (this.f9211) {
            C1550.m9081(2);
            int size = this.f9206.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1795.If ifR = this.f9206.get(i2);
                if (ifR.f9227 != null) {
                    ifR.f9227.mBackStackNesting += i;
                    C1550.m9081(2);
                }
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m8131() {
        return m8119(false);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m8120() {
        return m8119(true);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private int m8119(boolean z) {
        if (!this.f7153) {
            if (C1550.m9081(2)) {
                PrintWriter printWriter = new PrintWriter(new C2295("FragmentManager"));
                m8134("  ", printWriter);
                printWriter.close();
            }
            this.f7153 = true;
            if (this.f9211) {
                this.f7154 = this.f7155.f8254.getAndIncrement();
            } else {
                this.f7154 = -1;
            }
            this.f7155.m9092((C1550.C1553) this, z);
            return this.f7154;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m8140(ArrayList<C1265> arrayList, ArrayList<Boolean> arrayList2) {
        C1550.m9081(2);
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f9211) {
            return true;
        }
        C1550 r2 = this.f7155;
        if (r2.f8250 == null) {
            r2.f8250 = new ArrayList<>();
        }
        r2.f8250.add(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m8123(int i) {
        int size = this.f9206.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1795.If ifR = this.f9206.get(i2);
            int i3 = ifR.f9227 != null ? ifR.f9227.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m8130(ArrayList<C1265> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f9206.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C1795.If ifR = this.f9206.get(i4);
            int i5 = ifR.f9227 != null ? ifR.f9227.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C1265 r5 = arrayList.get(i6);
                    int size2 = r5.f9206.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C1795.If ifR2 = r5.f9206.get(i7);
                        if ((ifR2.f9227 != null ? ifR2.f9227.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8128() {
        int size = this.f9206.size();
        for (int i = 0; i < size; i++) {
            C1795.If ifR = this.f9206.get(i);
            C1277 r5 = ifR.f9227;
            if (r5 != null) {
                r5.setNextTransition(this.f9205);
            }
            switch (ifR.f9226) {
                case 1:
                    r5.setNextAnim(ifR.f9224);
                    this.f7155.m9119(r5, false);
                    this.f7155.m9150(r5);
                    break;
                case 3:
                    r5.setNextAnim(ifR.f9221);
                    this.f7155.m9111(r5);
                    break;
                case 4:
                    r5.setNextAnim(ifR.f9221);
                    this.f7155.m9109(r5);
                    break;
                case 5:
                    r5.setNextAnim(ifR.f9224);
                    this.f7155.m9119(r5, false);
                    C1550.m9077(r5);
                    break;
                case 6:
                    r5.setNextAnim(ifR.f9221);
                    this.f7155.m9125(r5);
                    break;
                case 7:
                    r5.setNextAnim(ifR.f9224);
                    this.f7155.m9119(r5, false);
                    this.f7155.m9132(r5);
                    break;
                case 8:
                    this.f7155.m9130(r5);
                    break;
                case 9:
                    this.f7155.m9130((C1277) null);
                    break;
                case 10:
                    this.f7155.m9136(r5, ifR.f9225);
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown cmd: ");
                    sb.append(ifR.f9226);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.f9214 || ifR.f9226 == 1 || r5 == null)) {
                this.f7155.m9143(r5);
            }
        }
        if (!this.f9214) {
            C1550 r0 = this.f7155;
            r0.m9116(r0.f8266, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m8122(boolean z) {
        for (int size = this.f9206.size() - 1; size >= 0; size--) {
            C1795.If ifR = this.f9206.get(size);
            C1277 r3 = ifR.f9227;
            if (r3 != null) {
                r3.setNextTransition(C1550.m9060(this.f9205));
            }
            switch (ifR.f9226) {
                case 1:
                    r3.setNextAnim(ifR.f9228);
                    this.f7155.m9119(r3, true);
                    this.f7155.m9111(r3);
                    break;
                case 3:
                    r3.setNextAnim(ifR.f9223);
                    this.f7155.m9150(r3);
                    break;
                case 4:
                    r3.setNextAnim(ifR.f9223);
                    C1550.m9077(r3);
                    break;
                case 5:
                    r3.setNextAnim(ifR.f9228);
                    this.f7155.m9119(r3, true);
                    this.f7155.m9109(r3);
                    break;
                case 6:
                    r3.setNextAnim(ifR.f9223);
                    this.f7155.m9132(r3);
                    break;
                case 7:
                    r3.setNextAnim(ifR.f9228);
                    this.f7155.m9119(r3, true);
                    this.f7155.m9125(r3);
                    break;
                case 8:
                    this.f7155.m9130((C1277) null);
                    break;
                case 9:
                    this.f7155.m9130(r3);
                    break;
                case 10:
                    this.f7155.m9136(r3, ifR.f9222);
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown cmd: ");
                    sb.append(ifR.f9226);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.f9214 || ifR.f9226 == 3 || r3 == null)) {
                this.f7155.m9143(r3);
            }
        }
        if (!this.f9214 && z) {
            C1550 r7 = this.f7155;
            r7.m9116(r7.f8266, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1277 m8126(ArrayList<C1277> arrayList, C1277 r18) {
        int i;
        ArrayList<C1277> arrayList2 = arrayList;
        C1277 r4 = r18;
        int i2 = 0;
        while (i < this.f9206.size()) {
            C1795.If ifR = this.f9206.get(i);
            int i3 = ifR.f9226;
            if (i3 != 1) {
                if (i3 == 2) {
                    C1277 r6 = ifR.f9227;
                    int i4 = r6.mContainerId;
                    C1277 r13 = r4;
                    int i5 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C1277 r14 = arrayList2.get(size);
                        if (r14.mContainerId == i4) {
                            if (r14 == r6) {
                                z = true;
                            } else {
                                if (r14 == r13) {
                                    this.f9206.add(i5, new C1795.If(9, r14));
                                    i5++;
                                    r13 = null;
                                }
                                C1795.If ifR2 = new C1795.If(3, r14);
                                ifR2.f9224 = ifR.f9224;
                                ifR2.f9223 = ifR.f9223;
                                ifR2.f9221 = ifR.f9221;
                                ifR2.f9228 = ifR.f9228;
                                this.f9206.add(i5, ifR2);
                                arrayList2.remove(r14);
                                i5++;
                            }
                        }
                    }
                    if (z) {
                        this.f9206.remove(i5);
                        i = i5 - 1;
                    } else {
                        ifR.f9226 = 1;
                        arrayList2.add(r6);
                        i = i5;
                    }
                    r4 = r13;
                } else if (i3 == 3 || i3 == 6) {
                    arrayList2.remove(ifR.f9227);
                    if (ifR.f9227 == r4) {
                        this.f9206.add(i, new C1795.If(9, ifR.f9227));
                        i++;
                        r4 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.f9206.add(i, new C1795.If(9, r4));
                        i++;
                        r4 = ifR.f9227;
                    }
                }
                i2 = i + 1;
            }
            arrayList2.add(ifR.f9227);
            i2 = i + 1;
        }
        return r4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final C1277 m8136(ArrayList<C1277> arrayList, C1277 r7) {
        for (int size = this.f9206.size() - 1; size >= 0; size--) {
            C1795.If ifR = this.f9206.get(size);
            int i = ifR.f9226;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            r7 = null;
                            break;
                        case 9:
                            r7 = ifR.f9227;
                            break;
                        case 10:
                            ifR.f9225 = ifR.f9222;
                            break;
                    }
                }
                arrayList.add(ifR.f9227);
            }
            arrayList.remove(ifR.f9227);
        }
        return r7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8129(C1277.If ifR) {
        for (int i = 0; i < this.f9206.size(); i++) {
            C1795.If ifR2 = this.f9206.get(i);
            if (m8118(ifR2)) {
                ifR2.f9227.setOnStartEnterTransitionListener(ifR);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    static boolean m8118(C1795.If ifR) {
        C1277 r1 = ifR.f9227;
        return r1 != null && r1.mAdded && r1.mView != null && !r1.mDetached && !r1.mHidden && r1.isPostponed();
    }

    /* renamed from: І  reason: contains not printable characters */
    public final boolean m8141() {
        return this.f9206.isEmpty();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1265(o.C1550 r3) {
        /*
            r2 = this;
            o.ɩʟ r0 = r3.f8259
            if (r0 == 0) goto L_0x000d
            o.ɩʟ r0 = r3.f8259
            o.ɾι r0 = r0.mFragmentManager
            o.ɹΙ r0 = r0.m9131()
            goto L_0x000f
        L_0x000d:
            o.ɹΙ r0 = r3.f8279
        L_0x000f:
            o.ɹі<?> r1 = r3.f8263
            if (r1 == 0) goto L_0x001c
            o.ɹі<?> r1 = r3.f8263
            android.content.Context r1 = r1.f7905
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f7154 = r0
            r2.f7155 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1265.<init>(o.ɾι):void");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8138() {
        if (!this.f9211) {
            this.f9218 = false;
            this.f7155.m9121((C1550.C1553) this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8125() {
        if (!this.f9211) {
            this.f9218 = false;
            this.f7155.m9121((C1550.C1553) this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
}
