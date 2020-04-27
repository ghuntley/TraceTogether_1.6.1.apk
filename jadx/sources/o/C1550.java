package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o.C1242;
import o.C1277;
import o.C1356;
import o.C1827;
import o.C2319;
import o.C2745;

/* renamed from: o.ɾι  reason: contains not printable characters */
public abstract class C1550 {

    /* renamed from: ı  reason: contains not printable characters */
    ArrayList<C1265> f8250;

    /* renamed from: ŀ  reason: contains not printable characters */
    private final ArrayList<C1553> f8251 = new ArrayList<>();

    /* renamed from: ł  reason: contains not printable characters */
    private boolean f8252;

    /* renamed from: ſ  reason: contains not printable characters */
    private boolean f8253;

    /* renamed from: Ɩ  reason: contains not printable characters */
    final AtomicInteger f8254 = new AtomicInteger();

    /* renamed from: Ɨ  reason: contains not printable characters */
    private final C1827.C1828 f8255 = new C1827.C1828() {
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m9152(C1277 r4, C1562 r5) {
            C1550 r0 = C1550.this;
            if (r0.f8277.get(r4) == null) {
                r0.f8277.put(r4, new HashSet());
            }
            r0.f8277.get(r4).add(r5);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m9151(C1277 r3, C1562 r4) {
            if (!r4.m9193()) {
                C1550 r0 = C1550.this;
                HashSet hashSet = r0.f8277.get(r3);
                if (hashSet != null && hashSet.remove(r4) && hashSet.isEmpty()) {
                    r0.f8277.remove(r3);
                    if (r3.mState < 3) {
                        r0.m9148(r3);
                        r0.m9135(r3, r3.getStateAfterAnimating());
                    }
                }
            }
        }
    };

    /* renamed from: ƚ  reason: contains not printable characters */
    private boolean f8256;

    /* renamed from: ǀ  reason: contains not printable characters */
    private ArrayList<If> f8257;

    /* renamed from: ǃ  reason: contains not printable characters */
    final C1242.C1244 f8258 = new C1242.C1244() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m9153() {
            C1550 r0 = C1550.this;
            r0.m9141(true);
            if (r0.f8258.m8046()) {
                r0.m9103(-1, 0);
            } else {
                r0.f8273.m96();
            }
        }
    };

    /* renamed from: ȷ  reason: contains not printable characters */
    public C1277 f8259;

    /* renamed from: ɍ  reason: contains not printable characters */
    private ArrayList<C1265> f8260;

    /* renamed from: ɔ  reason: contains not printable characters */
    private ArrayList<Boolean> f8261;

    /* renamed from: ɟ  reason: contains not printable characters */
    private C1609 f8262;

    /* renamed from: ɨ  reason: contains not printable characters */
    C1472<?> f8263;

    /* renamed from: ɩ  reason: contains not printable characters */
    final C1565 f8264 = new C1565(this);

    /* renamed from: ɪ  reason: contains not printable characters */
    C1380 f8265;

    /* renamed from: ɹ  reason: contains not printable characters */
    int f8266 = -1;

    /* renamed from: ɺ  reason: contains not printable characters */
    private ArrayList<C1277> f8267;

    /* renamed from: ɼ  reason: contains not printable characters */
    private Runnable f8268 = new Runnable() {
        public final void run() {
            C1550.this.m9141(true);
        }
    };

    /* renamed from: ɾ  reason: contains not printable characters */
    public C1277 f8269;

    /* renamed from: ɿ  reason: contains not printable characters */
    public boolean f8270;

    /* renamed from: ʅ  reason: contains not printable characters */
    private ArrayList<C1277> f8271;

    /* renamed from: ʟ  reason: contains not printable characters */
    public boolean f8272;

    /* renamed from: Ι  reason: contains not printable characters */
    OnBackPressedDispatcher f8273;

    /* renamed from: ι  reason: contains not printable characters */
    final C2745.C2749 f8274 = new C2745.C2749();

    /* renamed from: І  reason: contains not printable characters */
    public final C1545 f8275 = new C1545(this);

    /* renamed from: г  reason: contains not printable characters */
    public boolean f8276;

    /* renamed from: і  reason: contains not printable characters */
    ConcurrentHashMap<C1277, HashSet<C1562>> f8277 = new ConcurrentHashMap<>();

    /* renamed from: Ӏ  reason: contains not printable characters */
    public ArrayList<C1552> f8278;

    /* renamed from: ӏ  reason: contains not printable characters */
    public C1469 f8279 = new C1469() {
        /* renamed from: Ι  reason: contains not printable characters */
        public final C1277 m9154(ClassLoader classLoader, String str) {
            return C1277.instantiate(C1550.this.f8263.f7905, str, (Bundle) null);
        }
    };

    /* renamed from: o.ɾι$ı  reason: contains not printable characters */
    public static abstract class C1551 {
        /* renamed from: ι  reason: contains not printable characters */
        public void m9159(C1550 r1, C1277 r2, View view) {
        }
    }

    /* renamed from: o.ɾι$ǃ  reason: contains not printable characters */
    public interface C1552 {
        void onBackStackChanged();
    }

    /* renamed from: o.ɾι$ɩ  reason: contains not printable characters */
    interface C1553 {
        /* renamed from: ι  reason: contains not printable characters */
        boolean m9160(ArrayList<C1265> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static int m9060(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m9081(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m9082(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C2295("FragmentManager"));
        C1472<?> r0 = this.f8263;
        if (r0 != null) {
            try {
                r0.m8835("  ", printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            m9090("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1795 m9099() {
        return new C1265(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r1 <= 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (m9107(r4.f8259) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r0.m8045(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r4.f8258;
        r1 = r4.f8250;
     */
    /* renamed from: ƚ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9067() {
        /*
            r4 = this;
            java.util.ArrayList<o.ɾι$ɩ> r0 = r4.f8251
            monitor-enter(r0)
            java.util.ArrayList<o.ɾι$ɩ> r1 = r4.f8251     // Catch:{ all -> 0x0031 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0031 }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            o.ɩƚ$ǃ r1 = r4.f8258     // Catch:{ all -> 0x0031 }
            r1.m8045(r2)     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0013:
            monitor-exit(r0)
            o.ɩƚ$ǃ r0 = r4.f8258
            java.util.ArrayList<o.ɩɪ> r1 = r4.f8250
            r3 = 0
            if (r1 == 0) goto L_0x0020
            int r1 = r1.size()
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            if (r1 <= 0) goto L_0x002c
            o.ɩʟ r1 = r4.f8259
            boolean r1 = r4.m9107((o.C1277) r1)
            if (r1 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            r0.m8045(r2)
            return
        L_0x0031:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1550.m9067():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m9107(C1277 r4) {
        if (r4 == null) {
            return true;
        }
        C1550 r1 = r4.mFragmentManager;
        if (!r4.equals(r1.f8269) || !m9107(r1.f8259)) {
            return false;
        }
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9114() {
        m9092((C1553) new Cif((String) null, -1, 0), false);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m9138(int i, int i2) {
        if (i >= 0) {
            return m9103(i, 1);
        }
        throw new IllegalArgumentException("Bad id: ".concat(String.valueOf(i)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m9103(int i, int i2) {
        m9141(false);
        m9080(true);
        C1277 r2 = this.f8269;
        if (r2 != null && i < 0 && r2.getChildFragmentManager().m9103(-1, 0)) {
            return true;
        }
        boolean r10 = m9106(this.f8260, this.f8261, (String) null, i, i2);
        if (r10) {
            this.f8252 = true;
            try {
                m9083(this.f8260, this.f8261);
            } finally {
                this.f8252 = false;
                this.f8261.clear();
                this.f8260.clear();
            }
        }
        m9067();
        if (this.f8256) {
            this.f8256 = false;
            m9066();
        }
        this.f8274.f13048.values().removeAll(Collections.singleton((Object) null));
        return r10;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9100(Bundle bundle, String str, C1277 r6) {
        if (r6.mFragmentManager != this) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(r6);
            sb.append(" is not currently in the FragmentManager");
            m9082((RuntimeException) new IllegalStateException(sb.toString()));
        }
        bundle.putString(str, r6.mWho);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1277 m9113(Bundle bundle, String str) {
        String string = bundle.getString(str);
        C1277 r0 = null;
        if (string == null) {
            return null;
        }
        C1688 r1 = this.f8274.f13048.get(string);
        if (r1 != null) {
            r0 = r1.f8760;
        }
        if (r0 == null) {
            StringBuilder sb = new StringBuilder("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": unique id ");
            sb.append(string);
            m9082((RuntimeException) new IllegalStateException(sb.toString()));
        }
        return r0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static C1277 m9073(View view) {
        Object tag = view.getTag(R.id.f165312131362065);
        if (tag instanceof C1277) {
            return (C1277) tag;
        }
        return null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final List<C1277> m9087() {
        return this.f8274.m14573();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0307 m9112(C1277 r4) {
        C1609 r0 = this.f8262;
        C0307 r1 = r0.f8514.get(r4.mWho);
        if (r1 != null) {
            return r1;
        }
        C0307 r12 = new C0307();
        r0.f8514.put(r4.mWho, r12);
        return r12;
    }

    /* renamed from: ł  reason: contains not printable characters */
    private C1609 m9063(C1277 r4) {
        C1609 r0 = this.f8262;
        C1609 r1 = r0.f8518.get(r4.mWho);
        if (r1 != null) {
            return r1;
        }
        C1609 r12 = new C1609(r0.f8516);
        r0.f8518.put(r4.mWho, r12);
        return r12;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1277.C1280 m9133(C1277 r5) {
        Bundle r52;
        C2745.C2749 r0 = this.f8274;
        C1688 r02 = r0.f13048.get(r5.mWho);
        if (r02 == null || !r02.f8760.equals(r5)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(r5);
            sb.append(" is not currently in the FragmentManager");
            m9082((RuntimeException) new IllegalStateException(sb.toString()));
        }
        if (r02.f8760.mState < 0 || (r52 = r02.m9596()) == null) {
            return null;
        }
        return new C1277.C1280(r52);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m9140() {
        return this.f8270;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C1277 r1 = this.f8259;
        if (r1 != null) {
            sb.append(r1.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f8259)));
            sb.append("}");
        } else {
            C1472<?> r12 = this.f8263;
            if (r12 != null) {
                sb.append(r12.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f8263)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9090(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String obj = sb.toString();
        this.f8274.m14571(str, fileDescriptor, printWriter, strArr);
        ArrayList<C1277> arrayList = this.f8271;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f8271.get(i).toString());
            }
        }
        ArrayList<C1265> arrayList2 = this.f8250;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C1265 r2 = this.f8250.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(r2.toString());
                r2.m8134(obj, printWriter);
            }
        }
        printWriter.print(str);
        StringBuilder sb2 = new StringBuilder("Back Stack Index: ");
        sb2.append(this.f8254.get());
        printWriter.println(sb2.toString());
        synchronized (this.f8251) {
            int size3 = this.f8251.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f8251.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f8263);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f8265);
        if (this.f8259 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f8259);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f8266);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f8272);
        printWriter.print(" mStopped=");
        printWriter.print(this.f8276);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f8270);
        if (this.f8253) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f8253);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m9097(C1277 r2) {
        if (!r2.mDeferStart) {
            return;
        }
        if (this.f8252) {
            this.f8256 = true;
            return;
        }
        r2.mDeferStart = false;
        m9135(r2, this.f8266);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m9102(int i) {
        return this.f8266 > 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r2 != 3) goto L_0x01fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe  */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m9135(o.C1277 r12, int r13) {
        /*
            r11 = this;
            o.Ӏ$Ι r0 = r11.f8274
            java.lang.String r1 = r12.mWho
            java.util.HashMap<java.lang.String, o.ʟι> r0 = r0.f13048
            java.lang.Object r0 = r0.get(r1)
            o.ʟι r0 = (o.C1688) r0
            r1 = 1
            if (r0 != 0) goto L_0x0018
            o.ʟι r0 = new o.ʟι
            o.ɾɩ r2 = r11.f8275
            r0.<init>(r2, r12)
            r0.f8761 = r1
        L_0x0018:
            int r2 = r0.m9588()
            int r13 = java.lang.Math.min(r13, r2)
            int r2 = r12.mState
            r3 = 3
            r4 = 2
            r5 = 0
            if (r2 > r13) goto L_0x0103
            int r2 = r12.mState
            if (r2 >= r13) goto L_0x0036
            java.util.concurrent.ConcurrentHashMap<o.ɩʟ, java.util.HashSet<o.ɿǃ>> r2 = r11.f8277
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0036
            r11.m9086(r12)
        L_0x0036:
            int r2 = r12.mState
            r6 = -1
            if (r2 == r6) goto L_0x0045
            if (r2 == 0) goto L_0x00e0
            if (r2 == r1) goto L_0x00e5
            if (r2 == r4) goto L_0x00f7
            if (r2 == r3) goto L_0x00fc
            goto L_0x01fd
        L_0x0045:
            if (r13 < 0) goto L_0x00e0
            o.ɩʟ r2 = r12.mTarget
            java.lang.String r6 = " that does not belong to this FragmentManager!"
            java.lang.String r7 = " declared target fragment "
            java.lang.String r8 = "Fragment "
            if (r2 == 0) goto L_0x009e
            o.ɩʟ r2 = r12.mTarget
            o.ɩʟ r9 = r12.mTarget
            java.lang.String r9 = r9.mWho
            o.Ӏ$Ι r10 = r11.f8274
            java.util.HashMap<java.lang.String, o.ʟι> r10 = r10.f13048
            java.lang.Object r9 = r10.get(r9)
            o.ʟι r9 = (o.C1688) r9
            if (r9 == 0) goto L_0x0066
            o.ɩʟ r9 = r9.f8760
            goto L_0x0067
        L_0x0066:
            r9 = r5
        L_0x0067:
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x0081
            o.ɩʟ r2 = r12.mTarget
            int r2 = r2.mState
            if (r2 > 0) goto L_0x0078
            o.ɩʟ r2 = r12.mTarget
            r11.m9135((o.C1277) r2, (int) r1)
        L_0x0078:
            o.ɩʟ r2 = r12.mTarget
            java.lang.String r2 = r2.mWho
            r12.mTargetWho = r2
            r12.mTarget = r5
            goto L_0x009e
        L_0x0081:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            r0.append(r12)
            r0.append(r7)
            o.ɩʟ r12 = r12.mTarget
            r0.append(r12)
            r0.append(r6)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x009e:
            java.lang.String r2 = r12.mTargetWho
            if (r2 == 0) goto L_0x00d9
            java.lang.String r2 = r12.mTargetWho
            o.Ӏ$Ι r9 = r11.f8274
            java.util.HashMap<java.lang.String, o.ʟι> r9 = r9.f13048
            java.lang.Object r2 = r9.get(r2)
            o.ʟι r2 = (o.C1688) r2
            if (r2 == 0) goto L_0x00b2
            o.ɩʟ r5 = r2.f8760
        L_0x00b2:
            if (r5 == 0) goto L_0x00bc
            int r2 = r5.mState
            if (r2 > 0) goto L_0x00d9
            r11.m9135((o.C1277) r5, (int) r1)
            goto L_0x00d9
        L_0x00bc:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            r0.append(r12)
            r0.append(r7)
            java.lang.String r12 = r12.mTargetWho
            r0.append(r12)
            r0.append(r6)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x00d9:
            o.ɹі<?> r2 = r11.f8263
            o.ɩʟ r5 = r11.f8259
            r0.m9593(r2, r11, r5)
        L_0x00e0:
            if (r13 <= 0) goto L_0x00e5
            r0.m9592()
        L_0x00e5:
            if (r13 < 0) goto L_0x00ea
            r0.m9584()
        L_0x00ea:
            if (r13 <= r1) goto L_0x00f7
            o.ɪι r1 = r11.f8265
            r0.m9585((o.C1380) r1)
            r0.m9589()
            r0.m9595()
        L_0x00f7:
            if (r13 <= r4) goto L_0x00fc
            r0.m9587()
        L_0x00fc:
            if (r13 <= r3) goto L_0x01fd
            r0.m9597()
            goto L_0x01fd
        L_0x0103:
            int r2 = r12.mState
            if (r2 <= r13) goto L_0x01fd
            int r2 = r12.mState
            if (r2 == 0) goto L_0x01f6
            r6 = 0
            if (r2 == r1) goto L_0x019a
            if (r2 == r4) goto L_0x0121
            if (r2 == r3) goto L_0x011c
            r7 = 4
            if (r2 == r7) goto L_0x0117
            goto L_0x01fd
        L_0x0117:
            if (r13 >= r7) goto L_0x011c
            r0.m9591()
        L_0x011c:
            if (r13 >= r3) goto L_0x0121
            r0.m9598()
        L_0x0121:
            if (r13 >= r4) goto L_0x019a
            android.view.View r2 = r12.mView
            if (r2 == 0) goto L_0x0136
            o.ɹі<?> r2 = r11.f8263
            boolean r2 = r2.m8838()
            if (r2 == 0) goto L_0x0136
            android.util.SparseArray<android.os.Parcelable> r2 = r12.mSavedViewState
            if (r2 != 0) goto L_0x0136
            r0.m9599()
        L_0x0136:
            android.view.View r2 = r12.mView
            if (r2 == 0) goto L_0x018b
            android.view.ViewGroup r2 = r12.mContainer
            if (r2 == 0) goto L_0x018b
            android.view.ViewGroup r2 = r12.mContainer
            android.view.View r3 = r12.mView
            r2.endViewTransition(r3)
            android.view.View r2 = r12.mView
            r2.clearAnimation()
            boolean r2 = r12.isRemovingParent()
            if (r2 != 0) goto L_0x018b
            int r2 = r11.f8266
            r3 = 0
            if (r2 < 0) goto L_0x0172
            boolean r2 = r11.f8270
            if (r2 != 0) goto L_0x0172
            android.view.View r2 = r12.mView
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0172
            float r2 = r12.mPostponedAlpha
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0172
            o.ɹі<?> r2 = r11.f8263
            android.content.Context r2 = r2.f7905
            o.ɪι r4 = r11.f8265
            o.ɪɩ$ı r2 = o.C1356.m8468(r2, r4, r12, r6)
            goto L_0x0173
        L_0x0172:
            r2 = r5
        L_0x0173:
            r12.mPostponedAlpha = r3
            android.view.ViewGroup r3 = r12.mContainer
            android.view.View r4 = r12.mView
            if (r2 == 0) goto L_0x0183
            r12.setStateAfterAnimating(r13)
            o.Ιɹ$ǃ r7 = r11.f8255
            o.C1356.m8469(r12, r2, r7)
        L_0x0183:
            r3.removeView(r4)
            android.view.ViewGroup r2 = r12.mContainer
            if (r3 == r2) goto L_0x018b
            return
        L_0x018b:
            java.util.concurrent.ConcurrentHashMap<o.ɩʟ, java.util.HashSet<o.ɿǃ>> r2 = r11.f8277
            java.lang.Object r2 = r2.get(r12)
            if (r2 != 0) goto L_0x0197
            r11.m9148(r12)
            goto L_0x019a
        L_0x0197:
            r12.setStateAfterAnimating(r13)
        L_0x019a:
            if (r13 > 0) goto L_0x01f6
            boolean r2 = r12.mRemoving
            if (r2 == 0) goto L_0x01a7
            boolean r2 = r12.isInBackStack()
            if (r2 != 0) goto L_0x01a7
            r6 = 1
        L_0x01a7:
            if (r6 != 0) goto L_0x01df
            o.ʅı r2 = r11.f8262
            java.util.HashMap<java.lang.String, o.ɩʟ> r3 = r2.f8515
            java.lang.String r4 = r12.mWho
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x01bc
            boolean r3 = r2.f8516
            if (r3 == 0) goto L_0x01bc
            boolean r2 = r2.f8517
            goto L_0x01bd
        L_0x01bc:
            r2 = 1
        L_0x01bd:
            if (r2 == 0) goto L_0x01c0
            goto L_0x01df
        L_0x01c0:
            java.lang.String r2 = r12.mTargetWho
            if (r2 == 0) goto L_0x01e2
            java.lang.String r2 = r12.mTargetWho
            o.Ӏ$Ι r3 = r11.f8274
            java.util.HashMap<java.lang.String, o.ʟι> r3 = r3.f13048
            java.lang.Object r2 = r3.get(r2)
            o.ʟι r2 = (o.C1688) r2
            if (r2 == 0) goto L_0x01d4
            o.ɩʟ r5 = r2.f8760
        L_0x01d4:
            if (r5 == 0) goto L_0x01e2
            boolean r2 = r5.getRetainInstance()
            if (r2 == 0) goto L_0x01e2
            r12.mTarget = r5
            goto L_0x01e2
        L_0x01df:
            r11.m9085((o.C1688) r0)
        L_0x01e2:
            java.util.concurrent.ConcurrentHashMap<o.ɩʟ, java.util.HashSet<o.ɿǃ>> r2 = r11.f8277
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L_0x01ef
            r12.setStateAfterAnimating(r13)
            r13 = 1
            goto L_0x01f6
        L_0x01ef:
            o.ɹі<?> r1 = r11.f8263
            o.ʅı r2 = r11.f8262
            r0.m9594(r1, r2)
        L_0x01f6:
            if (r13 >= 0) goto L_0x01fd
            o.ʅı r1 = r11.f8262
            r0.m9586((o.C1609) r1)
        L_0x01fd:
            int r0 = r12.mState
            if (r0 == r13) goto L_0x0203
            r12.mState = r13
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1550.m9135(o.ɩʟ, int):void");
    }

    /* renamed from: г  reason: contains not printable characters */
    private void m9086(C1277 r4) {
        HashSet hashSet = this.f8277.get(r4);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C1562) it.next()).m9192();
            }
            hashSet.clear();
            m9148(r4);
            this.f8277.remove(r4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9119(C1277 r2, boolean z) {
        ViewGroup r22 = m9069(r2);
        if (r22 != null && (r22 instanceof C1300)) {
            ((C1300) r22).f7280 = !z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m9148(C1277 r3) {
        r3.performDestroyView();
        this.f8275.m9047(r3);
        r3.mContainer = null;
        r3.mView = null;
        r3.mViewLifecycleOwner = null;
        r3.mViewLifecycleOwnerLiveData.m14290(null);
        r3.mInLayout = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public final void m9146(C1277 r2) {
        m9135(r2, this.f8266);
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    private void m9062(final C1277 r8) {
        if (r8.mView != null) {
            C1356.C1357 r0 = C1356.m8468(this.f8263.f7905, this.f8265, r8, !r8.mHidden);
            if (r0 == null || r0.f7530 == null) {
                if (r0 != null) {
                    r8.mView.startAnimation(r0.f7531);
                    r0.f7531.start();
                }
                r8.mView.setVisibility((!r8.mHidden || r8.isHideReplaced()) ? 0 : 8);
                if (r8.isHideReplaced()) {
                    r8.setHideReplaced(false);
                }
            } else {
                r0.f7530.setTarget(r8.mView);
                if (!r8.mHidden) {
                    r8.mView.setVisibility(0);
                } else if (r8.isHideReplaced()) {
                    r8.setHideReplaced(false);
                } else {
                    final ViewGroup viewGroup = r8.mContainer;
                    final View view = r8.mView;
                    viewGroup.startViewTransition(view);
                    r0.f7530.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (r8.mView != null && r8.mHidden) {
                                r8.mView.setVisibility(8);
                            }
                        }
                    });
                }
                r0.f7530.start();
            }
        }
        if (r8.mAdded) {
            if ((r8.mHasMenu && r8.mMenuVisible) || r8.mChildFragmentManager.m9071()) {
                this.f8253 = true;
            }
        }
        r8.mHiddenChanged = false;
        r8.onHiddenChanged(r8.mHidden);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        r0 = r0.mView;
        r1 = r4.mContainer;
        r0 = r1.indexOfChild(r0);
     */
    /* renamed from: І  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m9143(o.C1277 r4) {
        /*
            r3 = this;
            o.Ӏ$Ι r0 = r3.f8274
            java.lang.String r1 = r4.mWho
            java.util.HashMap<java.lang.String, o.ʟι> r0 = r0.f13048
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            int r0 = r3.f8266
            r3.m9135((o.C1277) r4, (int) r0)
            android.view.View r0 = r4.mView
            if (r0 == 0) goto L_0x0076
            o.Ӏ$Ι r0 = r3.f8274
            o.ɩʟ r0 = r0.m14570(r4)
            if (r0 == 0) goto L_0x0036
            android.view.View r0 = r0.mView
            android.view.ViewGroup r1 = r4.mContainer
            int r0 = r1.indexOfChild(r0)
            android.view.View r2 = r4.mView
            int r2 = r1.indexOfChild(r2)
            if (r2 >= r0) goto L_0x0036
            r1.removeViewAt(r2)
            android.view.View r2 = r4.mView
            r1.addView(r2, r0)
        L_0x0036:
            boolean r0 = r4.mIsNewlyAdded
            if (r0 == 0) goto L_0x0076
            android.view.ViewGroup r0 = r4.mContainer
            if (r0 == 0) goto L_0x0076
            float r0 = r4.mPostponedAlpha
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            android.view.View r0 = r4.mView
            float r2 = r4.mPostponedAlpha
            r0.setAlpha(r2)
        L_0x004c:
            r4.mPostponedAlpha = r1
            r0 = 0
            r4.mIsNewlyAdded = r0
            o.ɹі<?> r0 = r3.f8263
            android.content.Context r0 = r0.f7905
            o.ɪι r1 = r3.f8265
            r2 = 1
            o.ɪɩ$ı r0 = o.C1356.m8468(r0, r1, r4, r2)
            if (r0 == 0) goto L_0x0076
            android.view.animation.Animation r1 = r0.f7531
            if (r1 == 0) goto L_0x006a
            android.view.View r1 = r4.mView
            android.view.animation.Animation r0 = r0.f7531
            r1.startAnimation(r0)
            goto L_0x0076
        L_0x006a:
            android.animation.Animator r1 = r0.f7530
            android.view.View r2 = r4.mView
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f7530
            r0.start()
        L_0x0076:
            boolean r0 = r4.mHiddenChanged
            if (r0 == 0) goto L_0x007d
            r3.m9062(r4)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1550.m9143(o.ɩʟ):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9116(int i, boolean z) {
        C1472<?> r2;
        if (this.f8263 == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f8266) {
            this.f8266 = i;
            for (C1277 r3 : this.f8274.m14573()) {
                m9143(r3);
            }
            for (C1277 next : this.f8274.m14572()) {
                if (next != null && !next.mIsNewlyAdded) {
                    m9143(next);
                }
            }
            m9066();
            if (this.f8253 && (r2 = this.f8263) != null && this.f8266 == 4) {
                r2.m8831();
                this.f8253 = false;
            }
        }
    }

    /* renamed from: Ɨ  reason: contains not printable characters */
    private void m9066() {
        for (C1277 next : this.f8274.m14572()) {
            if (next != null) {
                m9097(next);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m9127(C1277 r4) {
        C2745.C2749 r0 = this.f8274;
        if (!r0.f13048.containsKey(r4.mWho)) {
            C1688 r02 = new C1688(this.f8275, r4);
            r02.m9590(this.f8263.f7905.getClassLoader());
            this.f8274.f13048.put(r02.f8760.mWho, r02);
            if (r4.mRetainInstanceChangedWhileDetached) {
                if (r4.mRetainInstance) {
                    m9139(r4);
                } else {
                    m9091(r4);
                }
                r4.mRetainInstanceChangedWhileDetached = false;
            }
            r02.f8761 = this.f8266;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ӏ  reason: contains not printable characters */
    public final void m9150(C1277 r4) {
        m9127(r4);
        if (!r4.mDetached) {
            this.f8274.m14575(r4);
            boolean z = false;
            r4.mRemoving = false;
            if (r4.mView == null) {
                r4.mHiddenChanged = false;
            }
            if ((r4.mHasMenu && r4.mMenuVisible) || r4.mChildFragmentManager.m9071()) {
                z = true;
            }
            if (z) {
                this.f8253 = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɨ  reason: contains not printable characters */
    public final void m9111(C1277 r4) {
        boolean z = !r4.isInBackStack();
        if (!r4.mDetached || z) {
            C2745.C2749 r0 = this.f8274;
            synchronized (r0.f13049) {
                r0.f13049.remove(r4);
            }
            boolean z2 = false;
            r4.mAdded = false;
            if ((r4.mHasMenu && r4.mMenuVisible) || r4.mChildFragmentManager.m9071()) {
                z2 = true;
            }
            if (z2) {
                this.f8253 = true;
            }
            r4.mRemoving = true;
            m9065(r4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ȷ  reason: contains not printable characters */
    public final void m9109(C1277 r3) {
        if (!r3.mHidden) {
            r3.mHidden = true;
            r3.mHiddenChanged = true ^ r3.mHiddenChanged;
            m9065(r3);
        }
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    static void m9077(C1277 r1) {
        if (r1.mHidden) {
            r1.mHidden = false;
            r1.mHiddenChanged = !r1.mHiddenChanged;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɪ  reason: contains not printable characters */
    public final void m9125(C1277 r4) {
        if (!r4.mDetached) {
            r4.mDetached = true;
            if (r4.mAdded) {
                C2745.C2749 r1 = this.f8274;
                synchronized (r1.f13049) {
                    r1.f13049.remove(r4);
                }
                boolean z = false;
                r4.mAdded = false;
                if ((r4.mHasMenu && r4.mMenuVisible) || r4.mChildFragmentManager.m9071()) {
                    z = true;
                }
                if (z) {
                    this.f8253 = true;
                }
                m9065(r4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ʟ  reason: contains not printable characters */
    public final void m9132(C1277 r4) {
        if (r4.mDetached) {
            boolean z = false;
            r4.mDetached = false;
            if (!r4.mAdded) {
                this.f8274.m14575(r4);
                if ((r4.mHasMenu && r4.mMenuVisible) || r4.mChildFragmentManager.m9071()) {
                    z = true;
                }
                if (z) {
                    this.f8253 = true;
                }
            }
        }
    }

    public C1277 findFragmentById(int i) {
        C2745.C2749 r0 = this.f8274;
        for (int size = r0.f13049.size() - 1; size >= 0; size--) {
            C1277 r2 = r0.f13049.get(size);
            if (r2 != null && r2.mFragmentId == i) {
                return r2;
            }
        }
        for (C1688 next : r0.f13048.values()) {
            if (next != null) {
                C1277 r1 = next.f8760;
                if (r1.mFragmentId == i) {
                    return r1;
                }
            }
        }
        return null;
    }

    public C1277 findFragmentByTag(String str) {
        C2745.C2749 r0 = this.f8274;
        if (str != null) {
            for (int size = r0.f13049.size() - 1; size >= 0; size--) {
                C1277 r2 = r0.f13049.get(size);
                if (r2 != null && str.equals(r2.mTag)) {
                    return r2;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C1688 next : r0.f13048.values()) {
            if (next != null) {
                C1277 r1 = next.f8760;
                if (str.equals(r1.mTag)) {
                    return r1;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final C1277 m9088(String str) {
        return this.f8274.m14569(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1277 m9098(String str) {
        C1688 r2 = this.f8274.f13048.get(str);
        if (r2 != null) {
            return r2.f8760;
        }
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m9137() {
        return this.f8272 || this.f8276;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9092(C1553 r3, boolean z) {
        if (!z) {
            if (this.f8263 != null) {
                m9070();
            } else if (this.f8270) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f8251) {
            if (this.f8263 != null) {
                this.f8251.add(r3);
                m9126();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m9126() {
        synchronized (this.f8251) {
            boolean z = false;
            boolean z2 = this.f8257 != null && !this.f8257.isEmpty();
            if (this.f8251.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f8263.f7907.removeCallbacks(this.f8268);
                this.f8263.f7907.post(this.f8268);
                m9067();
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m9080(boolean z) {
        if (this.f8252) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f8263 == null) {
            if (this.f8270) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f8263.f7907.getLooper()) {
            if (!z) {
                m9070();
            }
            if (this.f8260 == null) {
                this.f8260 = new ArrayList<>();
                this.f8261 = new ArrayList<>();
            }
            this.f8252 = true;
            try {
                m9074((ArrayList<C1265>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f8252 = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9121(C1553 r2, boolean z) {
        if (!z || (this.f8263 != null && !this.f8270)) {
            m9080(z);
            if (r2.m9160(this.f8260, this.f8261)) {
                this.f8252 = true;
                try {
                    m9083(this.f8260, this.f8261);
                } finally {
                    this.f8252 = false;
                    this.f8261.clear();
                    this.f8260.clear();
                }
            }
            m9067();
            if (this.f8256) {
                this.f8256 = false;
                m9066();
            }
            this.f8274.f13048.values().removeAll(Collections.singleton((Object) null));
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m9141(boolean z) {
        m9080(z);
        boolean z2 = false;
        while (m9061(this.f8260, this.f8261)) {
            this.f8252 = true;
            try {
                m9083(this.f8260, this.f8261);
                this.f8252 = false;
                this.f8261.clear();
                this.f8260.clear();
                z2 = true;
            } catch (Throwable th) {
                this.f8252 = false;
                this.f8261.clear();
                this.f8260.clear();
                throw th;
            }
        }
        m9067();
        if (this.f8256) {
            this.f8256 = false;
            m9066();
        }
        this.f8274.f13048.values().removeAll(Collections.singleton((Object) null));
        return z2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m9074(ArrayList<C1265> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<If> arrayList3 = this.f8257;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            If ifR = this.f8257.get(i);
            if (arrayList == null || ifR.f8288 || (indexOf2 = arrayList.indexOf(ifR.f8289)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if ((ifR.f8290 == 0) || (arrayList != null && ifR.f8289.m8130(arrayList, 0, arrayList.size()))) {
                    this.f8257.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || ifR.f8288 || (indexOf = arrayList.indexOf(ifR.f8289)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        ifR.m9155();
                    } else {
                        ifR.f8289.f7155.m9118(ifR.f8289, ifR.f8288, false, false);
                    }
                }
            } else {
                this.f8257.remove(i);
                i--;
                size--;
                ifR.f8289.f7155.m9118(ifR.f8289, ifR.f8288, false, false);
            }
            i++;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m9083(ArrayList<C1265> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                m9074(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f9214) {
                        if (i2 != i) {
                            m9075(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f9214) {
                                i2++;
                            }
                        }
                        m9075(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m9075(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m9075(ArrayList<C1265> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C1265> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = arrayList3.get(i4).f9214;
        ArrayList<C1277> arrayList5 = this.f8267;
        if (arrayList5 == null) {
            this.f8267 = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f8267.addAll(this.f8274.m14573());
        C1277 r2 = this.f8269;
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C1265 r3 = arrayList3.get(i6);
            if (!arrayList4.get(i6).booleanValue()) {
                r2 = r3.m8126(this.f8267, r2);
            } else {
                r2 = r3.m8136(this.f8267, r2);
            }
            z2 = z2 || r3.f9211;
        }
        this.f8267.clear();
        if (!z) {
            C1827.m10101(this, arrayList, arrayList2, i, i2, false, this.f8255);
        }
        m9084(arrayList, arrayList2, i, i2);
        if (z) {
            C0639 r6 = new C0639();
            m9068((C0639<C1277>) r6);
            int r0 = m9072(arrayList, arrayList2, i, i2, r6);
            m9079((C0639<C1277>) r6);
            i3 = r0;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C1827.m10101(this, arrayList, arrayList2, i, i3, true, this.f8255);
            m9116(this.f8266, true);
        }
        while (i4 < i5) {
            C1265 r02 = arrayList3.get(i4);
            if (arrayList4.get(i4).booleanValue() && r02.f7154 >= 0) {
                r02.f7154 = -1;
            }
            i4++;
        }
        if (z2) {
            m9076();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m9079(C0639<C1277> r5) {
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            C1277 r2 = (C1277) r5.f4637[i];
            if (!r2.mAdded) {
                View requireView = r2.requireView();
                r2.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private int m9072(ArrayList<C1265> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0639<C1277> r13) {
        boolean z;
        boolean z2;
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C1265 r2 = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            int i5 = 0;
            while (true) {
                z = true;
                if (i5 >= r2.f9206.size()) {
                    z2 = false;
                    break;
                } else if (C1265.m8118(r2.f9206.get(i5))) {
                    z2 = true;
                    break;
                } else {
                    i5++;
                }
            }
            if (!z2 || r2.m8130(arrayList, i4 + 1, i2)) {
                z = false;
            }
            if (z) {
                if (this.f8257 == null) {
                    this.f8257 = new ArrayList<>();
                }
                If ifR = new If(r2, booleanValue);
                this.f8257.add(ifR);
                r2.m8129((C1277.If) ifR);
                if (booleanValue) {
                    r2.m8128();
                } else {
                    r2.m8122(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, r2);
                }
                m9068(r13);
            }
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9118(C1265 r9, boolean z, boolean z2, boolean z3) {
        if (z) {
            r9.m8122(z3);
        } else {
            r9.m8128();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(r9);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C1827.m10101(this, arrayList, arrayList2, 0, 1, true, this.f8255);
        }
        if (z3) {
            m9116(this.f8266, true);
        }
        for (C1277 next : this.f8274.m14572()) {
            if (next != null && next.mView != null && next.mIsNewlyAdded && r9.m8123(next.mContainerId)) {
                if (next.mPostponedAlpha > 0.0f) {
                    next.mView.setAlpha(next.mPostponedAlpha);
                }
                if (z3) {
                    next.mPostponedAlpha = 0.0f;
                } else {
                    next.mPostponedAlpha = -1.0f;
                    next.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m9084(ArrayList<C1265> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C1265 r0 = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                r0.m8139(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                r0.m8122(z);
            } else {
                r0.m8139(1);
                r0.m8128();
            }
            i++;
        }
    }

    /* renamed from: ſ  reason: contains not printable characters */
    private void m9065(C1277 r4) {
        ViewGroup r0 = m9069(r4);
        if (r0 != null) {
            if (r0.getTag(R.id.f168232131362449) == null) {
                r0.setTag(R.id.f168232131362449, r4);
            }
            ((C1277) r0.getTag(R.id.f168232131362449)).setNextAnim(r4.getNextAnim());
        }
    }

    /* renamed from: ɍ  reason: contains not printable characters */
    private ViewGroup m9069(C1277 r3) {
        if (r3.mContainerId > 0 && this.f8265.m8523()) {
            View r32 = this.f8265.m8524(r3.mContainerId);
            if (r32 instanceof ViewGroup) {
                return (ViewGroup) r32;
            }
        }
        return null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m9068(C0639<C1277> r5) {
        int i = this.f8266;
        if (i > 0) {
            int min = Math.min(i, 3);
            for (C1277 next : this.f8274.m14573()) {
                if (next.mState < min) {
                    m9135(next, min);
                    if (next.mView != null && !next.mHidden && next.mIsNewlyAdded) {
                        r5.add(next);
                    }
                }
            }
        }
    }

    /* renamed from: ſ  reason: contains not printable characters */
    private void m9064() {
        if (this.f8257 != null) {
            while (!this.f8257.isEmpty()) {
                this.f8257.remove(0).m9155();
            }
        }
    }

    /* renamed from: ʅ  reason: contains not printable characters */
    private void m9078() {
        if (!this.f8277.isEmpty()) {
            for (C1277 next : this.f8277.keySet()) {
                m9086(next);
                m9135(next, next.getStateAfterAnimating());
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m9061(ArrayList<C1265> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f8251) {
            if (this.f8251.isEmpty()) {
                return false;
            }
            int size = this.f8251.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f8251.get(i).m9160(arrayList, arrayList2);
            }
            this.f8251.clear();
            this.f8263.f7907.removeCallbacks(this.f8268);
            return z;
        }
    }

    /* renamed from: ɼ  reason: contains not printable characters */
    private void m9076() {
        if (this.f8278 != null) {
            for (int i = 0; i < this.f8278.size(); i++) {
                this.f8278.get(i).onBackStackChanged();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m9106(ArrayList<C1265> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C1265> arrayList3 = this.f8250;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f8250.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                i3 = this.f8250.size() - 1;
                while (i3 >= 0) {
                    C1265 r3 = this.f8250.get(i3);
                    if ((str != null && str.equals(r3.f9212)) || (i >= 0 && i == r3.f7154)) {
                        break;
                    }
                    i3--;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        C1265 r10 = this.f8250.get(i3);
                        if ((str == null || !str.equals(r10.f9212)) && (i < 0 || i != r10.f7154)) {
                            break;
                        }
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.f8250.size() - 1) {
                return false;
            }
            for (int size2 = this.f8250.size() - 1; size2 > i3; size2--) {
                arrayList.add(this.f8250.remove(size2));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: І  reason: contains not printable characters */
    public final Parcelable m9142() {
        int size;
        m9064();
        m9078();
        m9141(true);
        this.f8272 = true;
        ArrayList<C1674> r0 = this.f8274.m14576();
        C1268[] r2 = null;
        if (r0.isEmpty()) {
            return null;
        }
        ArrayList<String> r1 = this.f8274.m14568();
        ArrayList<C1265> arrayList = this.f8250;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            r2 = new C1268[size];
            for (int i = 0; i < size; i++) {
                r2[i] = new C1268(this.f8250.get(i));
                if (Log.isLoggable("FragmentManager", 2)) {
                    this.f8250.get(i);
                }
            }
        }
        C1569 r3 = new C1569();
        r3.f8335 = r0;
        r3.f8337 = r1;
        r3.f8334 = r2;
        r3.f8336 = this.f8254.get();
        C1277 r02 = this.f8269;
        if (r02 != null) {
            r3.f8338 = r02.mWho;
        }
        return r3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9134(Parcelable parcelable) {
        C1277 r7;
        C1277 r4;
        C1688 r3;
        C1469 r5;
        if (parcelable != null) {
            C1569 r72 = (C1569) parcelable;
            if (r72.f8335 != null) {
                this.f8274.f13048.clear();
                Iterator<C1674> it = r72.f8335.iterator();
                while (it.hasNext()) {
                    C1674 next = it.next();
                    if (next != null) {
                        C1277 r2 = this.f8262.f8515.get(next.f8696);
                        if (r2 != null) {
                            r3 = new C1688(this.f8275, r2, next);
                        } else {
                            C1545 r22 = this.f8275;
                            ClassLoader classLoader = this.f8263.f7905.getClassLoader();
                            C1277 r52 = this.f8259;
                            if (r52 != null) {
                                r5 = r52.mFragmentManager.m9131();
                            } else {
                                r5 = this.f8279;
                            }
                            r3 = new C1688(r22, classLoader, r5, next);
                        }
                        r3.f8760.mFragmentManager = this;
                        r3.m9590(this.f8263.f7905.getClassLoader());
                        this.f8274.f13048.put(r3.f8760.mWho, r3);
                        r3.f8761 = this.f8266;
                    }
                }
                for (C1277 next2 : this.f8262.f8515.values()) {
                    if (!this.f8274.f13048.containsKey(next2.mWho)) {
                        m9135(next2, 1);
                        next2.mRemoving = true;
                        m9135(next2, -1);
                    }
                }
                C2745.C2749 r0 = this.f8274;
                ArrayList<String> arrayList = r72.f8337;
                r0.f13049.clear();
                C1277 r23 = null;
                if (arrayList != null) {
                    for (String next3 : arrayList) {
                        C1688 r42 = r0.f13048.get(next3);
                        if (r42 != null) {
                            r4 = r42.f8760;
                        } else {
                            r4 = null;
                        }
                        if (r4 != null) {
                            r0.m14575(r4);
                        } else {
                            StringBuilder sb = new StringBuilder("No instantiated fragment for (");
                            sb.append(next3);
                            sb.append(")");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                }
                if (r72.f8334 != null) {
                    this.f8250 = new ArrayList<>(r72.f8334.length);
                    for (C1268 r32 : r72.f8334) {
                        C1265 r33 = r32.m8163(this);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            PrintWriter printWriter = new PrintWriter(new C2295("FragmentManager"));
                            r33.m8135("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f8250.add(r33);
                    }
                } else {
                    this.f8250 = null;
                }
                this.f8254.set(r72.f8336);
                if (r72.f8338 != null) {
                    C1688 r73 = this.f8274.f13048.get(r72.f8338);
                    if (r73 != null) {
                        r7 = r73.f8760;
                    } else {
                        r7 = null;
                    }
                    this.f8269 = r7;
                    C1277 r74 = this.f8269;
                    if (r74 != null) {
                        C1688 r02 = this.f8274.f13048.get(r74.mWho);
                        if (r02 != null) {
                            r23 = r02.f8760;
                        }
                        if (r74.equals(r23)) {
                            r74.performPrimaryNavigationFragmentChanged();
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: o.Aux} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: o.ɩʟ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: o.ɩʟ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: o.ɩʟ} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m9120(o.C1472<?> r3, o.C1380 r4, o.C1277 r5) {
        /*
            r2 = this;
            o.ɹі<?> r0 = r2.f8263
            if (r0 != 0) goto L_0x004d
            r2.f8263 = r3
            r2.f8265 = r4
            r2.f8259 = r5
            o.ɩʟ r4 = r2.f8259
            if (r4 == 0) goto L_0x0011
            r2.m9067()
        L_0x0011:
            boolean r4 = r3 instanceof o.C3251Aux
            if (r4 == 0) goto L_0x0028
            r4 = r3
            o.Aux r4 = (o.C3251Aux) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.f8273 = r0
            if (r5 == 0) goto L_0x0021
            r4 = r5
        L_0x0021:
            androidx.activity.OnBackPressedDispatcher r0 = r2.f8273
            o.ɩƚ$ǃ r1 = r2.f8258
            r0.m95(r4, r1)
        L_0x0028:
            if (r5 == 0) goto L_0x0033
            o.ɾι r3 = r5.mFragmentManager
            o.ʅı r3 = r3.m9063(r5)
            r2.f8262 = r3
            return
        L_0x0033:
            boolean r4 = r3 instanceof o.C0350
            if (r4 == 0) goto L_0x0044
            o.ıɼ r3 = (o.C0350) r3
            o.ıǀ r3 = r3.getViewModelStore()
            o.ʅı r3 = o.C1609.m9342(r3)
            r2.f8262 = r3
            return
        L_0x0044:
            o.ʅı r3 = new o.ʅı
            r4 = 0
            r3.<init>(r4)
            r2.f8262 = r3
            return
        L_0x004d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1550.m9120(o.ɹі, o.ɪι, o.ɩʟ):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m9147() {
        if (this.f8263 != null) {
            this.f8272 = false;
            this.f8276 = false;
            for (C1277 next : this.f8274.m14573()) {
                if (next != null) {
                    next.noteStateNotSaved();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m9096() {
        this.f8272 = false;
        this.f8276 = false;
        m9115(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public final void m9145() {
        this.f8272 = false;
        this.f8276 = false;
        m9115(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ӏ  reason: contains not printable characters */
    public final void m9149() {
        this.f8272 = false;
        this.f8276 = false;
        m9115(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɾ  reason: contains not printable characters */
    public final void m9128() {
        this.f8272 = false;
        this.f8276 = false;
        m9115(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ȷ  reason: contains not printable characters */
    public final void m9108() {
        m9115(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɨ  reason: contains not printable characters */
    public final void m9110() {
        this.f8276 = true;
        m9115(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɪ  reason: contains not printable characters */
    public final void m9124() {
        m9115(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: г  reason: contains not printable characters */
    public final void m9144() {
        this.f8270 = true;
        m9141(true);
        m9078();
        m9115(-1);
        this.f8263 = null;
        this.f8265 = null;
        this.f8259 = null;
        if (this.f8273 != null) {
            this.f8258.m8044();
            this.f8273 = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9115(int i) {
        try {
            this.f8252 = true;
            this.f8274.m14574(i);
            m9116(i, false);
            this.f8252 = false;
            m9141(true);
        } catch (Throwable th) {
            this.f8252 = false;
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9101(boolean z) {
        for (C1277 next : this.f8274.m14573()) {
            if (next != null) {
                next.performMultiWindowModeChanged(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9093(boolean z) {
        for (C1277 next : this.f8274.m14573()) {
            if (next != null) {
                next.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9089(Configuration configuration) {
        for (C1277 next : this.f8274.m14573()) {
            if (next != null) {
                next.performConfigurationChanged(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɿ  reason: contains not printable characters */
    public final void m9129() {
        for (C1277 next : this.f8274.m14573()) {
            if (next != null) {
                next.performLowMemory();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m9122(Menu menu, MenuInflater menuInflater) {
        if (this.f8266 <= 0) {
            return false;
        }
        ArrayList<C1277> arrayList = null;
        boolean z = false;
        for (C1277 next : this.f8274.m14573()) {
            if (next != null && next.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.f8271 != null) {
            for (int i = 0; i < this.f8271.size(); i++) {
                C1277 r7 = this.f8271.get(i);
                if (arrayList == null || !arrayList.contains(r7)) {
                    r7.onDestroyOptionsMenu();
                }
            }
        }
        this.f8271 = arrayList;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m9104(Menu menu) {
        boolean z = false;
        if (this.f8266 <= 0) {
            return false;
        }
        for (C1277 next : this.f8274.m14573()) {
            if (next != null && next.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m9105(MenuItem menuItem) {
        if (this.f8266 <= 0) {
            return false;
        }
        for (C1277 next : this.f8274.m14573()) {
            if (next != null && next.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m9123(MenuItem menuItem) {
        if (this.f8266 <= 0) {
            return false;
        }
        for (C1277 next : this.f8274.m14573()) {
            if (next != null && next.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9117(Menu menu) {
        if (this.f8266 > 0) {
            for (C1277 next : this.f8274.m14573()) {
                if (next != null) {
                    next.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɿ  reason: contains not printable characters */
    public final void m9130(C1277 r4) {
        C1277 r42;
        C1277 r1;
        C1277 r0 = null;
        if (r4 != null) {
            C1688 r12 = this.f8274.f13048.get(r4.mWho);
            if (r12 != null) {
                r1 = r12.f8760;
            } else {
                r1 = null;
            }
            if (!r4.equals(r1) || !(r4.mHost == null || r4.mFragmentManager == this)) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(r4);
                sb.append(" is not an active fragment of FragmentManager ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        C1277 r13 = this.f8269;
        this.f8269 = r4;
        if (r13 != null) {
            C1688 r43 = this.f8274.f13048.get(r13.mWho);
            if (r43 != null) {
                r42 = r43.f8760;
            } else {
                r42 = null;
            }
            if (r13.equals(r42)) {
                r13.performPrimaryNavigationFragmentChanged();
            }
        }
        C1277 r44 = this.f8269;
        if (r44 != null) {
            C1688 r14 = this.f8274.f13048.get(r44.mWho);
            if (r14 != null) {
                r0 = r14.f8760;
            }
            if (r44.equals(r0)) {
                r44.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ł  reason: contains not printable characters */
    public final void m9095() {
        C1277 r1;
        m9067();
        C1277 r0 = this.f8269;
        if (r0 != null) {
            C1688 r12 = this.f8274.f13048.get(r0.mWho);
            if (r12 != null) {
                r1 = r12.f8760;
            } else {
                r1 = null;
            }
            if (r0.equals(r1)) {
                r0.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9136(C1277 r3, C2319.Cif ifVar) {
        C1277 r0;
        C1688 r02 = this.f8274.f13048.get(r3.mWho);
        if (r02 != null) {
            r0 = r02.f8760;
        } else {
            r0 = null;
        }
        if (!r3.equals(r0) || !(r3.mHost == null || r3.mFragmentManager == this)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(r3);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        r3.mMaxState = ifVar;
    }

    /* renamed from: ʟ  reason: contains not printable characters */
    public final C1469 m9131() {
        C1550 r0 = this;
        while (true) {
            C1277 r1 = r0.f8259;
            if (r1 == null) {
                return r0.f8279;
            }
            r0 = r1.mFragmentManager;
        }
    }

    /* renamed from: ɔ  reason: contains not printable characters */
    private boolean m9071() {
        boolean z = false;
        for (C1277 next : this.f8274.m14572()) {
            if (next != null) {
                if ((!next.mHasMenu || !next.mMenuVisible) && !next.mChildFragmentManager.m9071()) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ŀ  reason: contains not printable characters */
    public final LayoutInflater.Factory2 m9094() {
        return this.f8264;
    }

    /* renamed from: o.ɾι$if  reason: invalid class name */
    public class Cif implements C1553 {

        /* renamed from: ı  reason: contains not printable characters */
        final String f8291;

        /* renamed from: ɩ  reason: contains not printable characters */
        final int f8292;

        /* renamed from: ι  reason: contains not printable characters */
        final int f8294;

        public Cif(String str, int i, int i2) {
            this.f8291 = str;
            this.f8292 = i;
            this.f8294 = i2;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m9158(ArrayList<C1265> arrayList, ArrayList<Boolean> arrayList2) {
            if (C1550.this.f8269 != null && this.f8292 < 0 && this.f8291 == null && C1550.this.f8269.getChildFragmentManager().m9103(-1, 0)) {
                return false;
            }
            return C1550.this.m9106(arrayList, arrayList2, this.f8291, this.f8292, this.f8294);
        }
    }

    /* renamed from: o.ɾι$If */
    static class If implements C1277.If {

        /* renamed from: ǃ  reason: contains not printable characters */
        final boolean f8288;

        /* renamed from: ɩ  reason: contains not printable characters */
        final C1265 f8289;

        /* renamed from: ι  reason: contains not printable characters */
        int f8290;

        If(C1265 r1, boolean z) {
            this.f8288 = z;
            this.f8289 = r1;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m9157() {
            this.f8290--;
            if (this.f8290 == 0) {
                this.f8289.f7155.m9126();
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m9156() {
            this.f8290++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m9155() {
            boolean z = this.f8290 > 0;
            for (C1277 next : this.f8289.f7155.f8274.m14573()) {
                next.setOnStartEnterTransitionListener((C1277.If) null);
                if (z && next.isPostponed()) {
                    next.startPostponedEnterTransition();
                }
            }
            this.f8289.f7155.m9118(this.f8289, this.f8288, !z, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m9139(C1277 r4) {
        if (!(this.f8272 || this.f8276)) {
            C1609 r0 = this.f8262;
            if (!r0.f8515.containsKey(r4.mWho)) {
                r0.f8515.put(r4.mWho, r4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9091(C1277 r2) {
        if (!(this.f8272 || this.f8276)) {
            this.f8262.f8515.remove(r2.mWho);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m9085(C1688 r4) {
        C1277 r0 = r4.f8760;
        C2745.C2749 r1 = this.f8274;
        if (r1.f13048.containsKey(r0.mWho)) {
            this.f8274.m14577(r4);
            m9091(r0);
        }
    }

    /* renamed from: ɍ  reason: contains not printable characters */
    private void m9070() {
        if (this.f8272 || this.f8276) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
