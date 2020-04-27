package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.OnBackPressedDispatcher;
import androidx.navigation.NavController$1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.C0593;
import o.C0665;
import o.C1242;
import o.C2319;

/* renamed from: o.łɩ  reason: contains not printable characters */
public class C0540 {

    /* renamed from: ı  reason: contains not printable characters */
    public Parcelable[] f4374;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C2851 f4375;

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean f4376;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final CopyOnWriteArrayList<Object> f4377 = new CopyOnWriteArrayList<>();

    /* renamed from: ɨ  reason: contains not printable characters */
    private boolean f4378 = true;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Context f4379;

    /* renamed from: ɪ  reason: contains not printable characters */
    private C0512 f4380;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final C0699 f4381 = new C0699();

    /* renamed from: ɾ  reason: contains not printable characters */
    private final C2608 f4382 = new NavController$1(this);

    /* renamed from: Ι  reason: contains not printable characters */
    public Bundle f4383;

    /* renamed from: ι  reason: contains not printable characters */
    public C0643 f4384;

    /* renamed from: І  reason: contains not printable characters */
    private C0557 f4385;

    /* renamed from: і  reason: contains not printable characters */
    public final Deque<C0546> f4386 = new ArrayDeque();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private Activity f4387;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final C1242.C1244 f4388 = new C1242.C1244() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m5121() {
            C0540.this.m5119();
        }
    };

    public C0540(Context context) {
        this.f4379 = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.f4387 = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        C0699 r5 = this.f4381;
        C0618 r0 = new C0618(r5);
        String r1 = C0699.m5750((Class<? extends C0712>) r0.getClass());
        if (C0699.m5751(r1)) {
            r5.f4881.put(r1, r0);
            C0699 r52 = this.f4381;
            C0433 r02 = new C0433(this.f4379);
            String r12 = C0699.m5750((Class<? extends C0712>) r02.getClass());
            if (C0699.m5751(r12)) {
                r52.f4881.put(r12, r02);
                return;
            }
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m5119() {
        C0593 r0;
        if (this.f4386.isEmpty()) {
            return false;
        }
        if (this.f4386.isEmpty()) {
            r0 = null;
        } else {
            r0 = this.f4386.getLast().f4428;
        }
        if (!m5110(r0.f4522, true) || !m5113()) {
            return false;
        }
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m5110(int i, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.f4386.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C0546> descendingIterator = this.f4386.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            C0593 r3 = descendingIterator.next().f4428;
            C0712 r5 = this.f4381.m5753(r3.f4518);
            if (z || r3.f4522 != i) {
                arrayList.add(r5);
            }
            if (r3.f4522 == i) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            C0593.m5240(this.f4379, i);
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((C0712) it.next()).m5829()) {
            C0546 removeLast = this.f4386.removeLast();
            removeLast.f4430 = C2319.Cif.DESTROYED;
            removeLast.m5133();
            C0512 r0 = this.f4380;
            if (r0 != null) {
                r0.m4972(removeLast.f4429);
            }
            z3 = true;
        }
        m5111();
        return z3;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private int m5107() {
        int i = 0;
        for (C0546 r2 : this.f4386) {
            if (!(r2.f4428 instanceof C0643)) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:5:0x0027, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m5113() {
        /*
            r10 = this;
        L_0x0000:
            java.util.Deque<o.łι> r0 = r10.f4386
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x0029
            java.util.Deque<o.łι> r0 = r10.f4386
            java.lang.Object r0 = r0.peekLast()
            o.łι r0 = (o.C0546) r0
            o.ſι r0 = r0.f4428
            boolean r0 = r0 instanceof o.C0643
            if (r0 == 0) goto L_0x0029
            java.util.Deque<o.łι> r0 = r10.f4386
            java.lang.Object r0 = r0.peekLast()
            o.łι r0 = (o.C0546) r0
            o.ſι r0 = r0.f4428
            int r0 = r0.f4522
            boolean r0 = r10.m5110(r0, r1)
            if (r0 != 0) goto L_0x0000
        L_0x0029:
            java.util.Deque<o.łι> r0 = r10.f4386
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ea
            java.util.Deque<o.łι> r0 = r10.f4386
            java.lang.Object r0 = r0.peekLast()
            o.łι r0 = (o.C0546) r0
            o.ſι r0 = r0.f4428
            r2 = 0
            boolean r3 = r0 instanceof o.C0422
            if (r3 == 0) goto L_0x005d
            java.util.Deque<o.łι> r3 = r10.f4386
            java.util.Iterator r3 = r3.descendingIterator()
        L_0x0046:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005d
            java.lang.Object r4 = r3.next()
            o.łι r4 = (o.C0546) r4
            o.ſι r4 = r4.f4428
            boolean r5 = r4 instanceof o.C0643
            if (r5 != 0) goto L_0x0046
            boolean r5 = r4 instanceof o.C0422
            if (r5 != 0) goto L_0x0046
            r2 = r4
        L_0x005d:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Deque<o.łι> r4 = r10.f4386
            java.util.Iterator r4 = r4.descendingIterator()
        L_0x0068:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b4
            java.lang.Object r5 = r4.next()
            o.łι r5 = (o.C0546) r5
            o.Іӏ$if r6 = r5.f4430
            o.ſι r7 = r5.f4428
            if (r0 == 0) goto L_0x008c
            int r8 = r7.f4522
            int r9 = r0.f4522
            if (r8 != r9) goto L_0x008c
            o.Іӏ$if r7 = o.C2319.Cif.RESUMED
            if (r6 == r7) goto L_0x0089
            o.Іӏ$if r6 = o.C2319.Cif.RESUMED
            r3.put(r5, r6)
        L_0x0089:
            o.ƖƖ r0 = r0.f4520
            goto L_0x0068
        L_0x008c:
            if (r2 == 0) goto L_0x00ac
            int r7 = r7.f4522
            int r8 = r2.f4522
            if (r7 != r8) goto L_0x00ac
            o.Іӏ$if r7 = o.C2319.Cif.RESUMED
            if (r6 != r7) goto L_0x00a0
            o.Іӏ$if r6 = o.C2319.Cif.STARTED
            r5.f4430 = r6
            r5.m5133()
            goto L_0x00a9
        L_0x00a0:
            o.Іӏ$if r7 = o.C2319.Cif.STARTED
            if (r6 == r7) goto L_0x00a9
            o.Іӏ$if r6 = o.C2319.Cif.STARTED
            r3.put(r5, r6)
        L_0x00a9:
            o.ƖƖ r2 = r2.f4520
            goto L_0x0068
        L_0x00ac:
            o.Іӏ$if r6 = o.C2319.Cif.CREATED
            r5.f4430 = r6
            r5.m5133()
            goto L_0x0068
        L_0x00b4:
            java.util.Deque<o.łι> r0 = r10.f4386
            java.util.Iterator r0 = r0.iterator()
        L_0x00ba:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00d4
            java.lang.Object r2 = r0.next()
            o.łι r2 = (o.C0546) r2
            java.lang.Object r4 = r3.get(r2)
            o.Іӏ$if r4 = (o.C2319.Cif) r4
            if (r4 == 0) goto L_0x00ba
            r2.f4430 = r4
            r2.m5133()
            goto L_0x00ba
        L_0x00d4:
            java.util.Deque<o.łι> r0 = r10.f4386
            r0.peekLast()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Object> r0 = r10.f4377
            java.util.Iterator r0 = r0.iterator()
        L_0x00df:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00e9
            r0.next()
            goto L_0x00df
        L_0x00e9:
            return r1
        L_0x00ea:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0540.m5113():boolean");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean m5114(Intent intent) {
        C0593 r7;
        C0643 r72;
        C0593.Cif r1;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        Bundle bundle = null;
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle2 = new Bundle();
        if (extras != null) {
            bundle = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (!((intArray != null && intArray.length != 0) || intent.getData() == null || (r1 = this.f4384.m5422(intent.getData())) == null)) {
            intArray = r1.f4528.m5241();
            bundle2.putAll(r1.f4527);
        }
        if (intArray == null || intArray.length == 0 || m5112(intArray) != null) {
            return false;
        }
        bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int flags = intent.getFlags();
        int i = 268435456 & flags;
        if (i != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            C0656.m5471(this.f4379).m5473(intent).m5474();
            Activity activity = this.f4387;
            if (activity != null) {
                activity.finish();
                this.f4387.overridePendingTransition(0, 0);
            }
            return true;
        } else if (i != 0) {
            if (!this.f4386.isEmpty()) {
                m5110(this.f4384.f4522, true);
            }
            int i2 = 0;
            while (i2 < intArray.length) {
                int i3 = i2 + 1;
                int i4 = intArray[i2];
                C0593 r6 = m5108(i4);
                if (r6 != null) {
                    C0665.Cif ifVar = new C0665.Cif();
                    ifVar.f4748 = 0;
                    ifVar.f4751 = 0;
                    m5109(r6, bundle2, ifVar.m5495());
                    i2 = i3;
                } else {
                    StringBuilder sb = new StringBuilder("unknown destination during deep link: ");
                    sb.append(C0593.m5240(this.f4379, i4));
                    throw new IllegalStateException(sb.toString());
                }
            }
            return true;
        } else {
            C0643 r2 = this.f4384;
            int i5 = 0;
            while (i5 < intArray.length) {
                int i6 = intArray[i5];
                if (i5 == 0) {
                    r7 = this.f4384;
                } else {
                    r7 = r2.m5423(i6, true);
                }
                if (r7 != null) {
                    if (i5 != intArray.length - 1) {
                        while (true) {
                            r72 = (C0643) r7;
                            if (!(r72.m5423(r72.f4640, true) instanceof C0643)) {
                                break;
                            }
                            r7 = r72.m5423(r72.f4640, true);
                        }
                        r2 = r72;
                    } else {
                        Bundle r62 = r7.m5244(bundle2);
                        C0665.Cif ifVar2 = new C0665.Cif();
                        ifVar2.f4752 = this.f4384.f4522;
                        ifVar2.f4746 = true;
                        ifVar2.f4748 = 0;
                        ifVar2.f4751 = 0;
                        m5109(r7, r62, ifVar2.m5495());
                    }
                    i5++;
                } else {
                    StringBuilder sb2 = new StringBuilder("unknown destination during deep link: ");
                    sb2.append(C0593.m5240(this.f4379, i6));
                    throw new IllegalStateException(sb2.toString());
                }
            }
            this.f4376 = true;
            return true;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private String m5112(int[] iArr) {
        C0593 r4;
        C0643 r42;
        C0643 r0 = this.f4384;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i == 0) {
                r4 = this.f4384;
            } else {
                r4 = r0.m5423(i2, true);
            }
            if (r4 == null) {
                return C0593.m5240(this.f4379, i2);
            }
            if (i != iArr.length - 1) {
                while (true) {
                    r42 = (C0643) r4;
                    if (!(r42.m5423(r42.f4640, true) instanceof C0643)) {
                        break;
                    }
                    r4 = r42.m5423(r42.f4640, true);
                }
                r0 = r42;
            }
        }
        return null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private C0593 m5108(int i) {
        C0593 r0;
        C0643 r02 = this.f4384;
        if (r02 == null) {
            return null;
        }
        if (r02.f4522 == i) {
            return this.f4384;
        }
        if (this.f4386.isEmpty()) {
            r0 = this.f4384;
        } else {
            r0 = this.f4386.getLast().f4428;
        }
        return (r0 instanceof C0643 ? (C0643) r0 : r0.f4520).m5423(i, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m5116(C2851 r2) {
        this.f4375 = r2;
        this.f4375.getLifecycle().m12098(this.f4382);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m5115(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.f4375 != null) {
            this.f4388.m8044();
            onBackPressedDispatcher.m95(this.f4375, this.f4388);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m5118(boolean z) {
        this.f4378 = z;
        C1242.C1244 r3 = this.f4388;
        boolean z2 = true;
        if (!this.f4378 || m5107() <= 1) {
            z2 = false;
        }
        r3.m8045(z2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m5111() {
        C1242.C1244 r0 = this.f4388;
        boolean z = true;
        if (!this.f4378 || m5107() <= 1) {
            z = false;
        }
        r0.m8045(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m5117(C0307 r2) {
        if (this.f4386.isEmpty()) {
            this.f4380 = C0512.m4971(r2);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5120(int i, Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        if (this.f4385 == null) {
            this.f4385 = new C0557(this.f4379, this.f4381);
        }
        C0643 r1 = this.f4385.m5155(i);
        C0643 r2 = this.f4384;
        boolean z = true;
        if (r2 != null) {
            m5110(r2.f4522, true);
        }
        this.f4384 = r1;
        Bundle bundle2 = this.f4383;
        if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) == null)) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C0712 r4 = this.f4381.m5753(next);
                Bundle bundle3 = this.f4383.getBundle(next);
                if (bundle3 != null) {
                    r4.m5827(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f4374;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i2 = 0;
            while (i2 < length) {
                C0440 r7 = (C0440) parcelableArr[i2];
                C0593 r11 = m5108(r7.f4027);
                if (r11 != null) {
                    Bundle bundle4 = r7.f4029;
                    if (bundle4 != null) {
                        bundle4.setClassLoader(this.f4379.getClassLoader());
                    }
                    this.f4386.add(new C0546(this.f4379, r11, bundle4, this.f4375, this.f4380, r7.f4030, r7.f4028));
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder("unknown destination during restore: ");
                    sb.append(this.f4379.getResources().getResourceName(r7.f4027));
                    throw new IllegalStateException(sb.toString());
                }
            }
            m5111();
            this.f4374 = null;
        }
        if (this.f4384 != null && this.f4386.isEmpty()) {
            if (this.f4376 || (activity = this.f4387) == null || !m5114(activity.getIntent())) {
                z = false;
            }
            if (!z) {
                m5109(this.f4384, bundle, (C0665) null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028 A[LOOP:0: B:9:0x0028->B:14:0x004f, LOOP_START] */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5109(o.C0593 r10, android.os.Bundle r11, o.C0665 r12) {
        /*
            r9 = this;
            if (r12 == 0) goto L_0x0010
            int r0 = r12.f4744
            r1 = -1
            if (r0 == r1) goto L_0x0010
            int r0 = r12.f4744
            boolean r1 = r12.f4742
            boolean r0 = r9.m5110(r0, r1)
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            o.Ɨι r1 = r9.f4381
            java.lang.String r2 = r10.f4518
            o.ƙ r1 = r1.m5753(r2)
            android.os.Bundle r11 = r10.m5244((android.os.Bundle) r11)
            r2 = 0
            o.ſι r10 = r1.m5826(r10, r11, r12, r2)
            if (r10 == 0) goto L_0x00ae
            boolean r12 = r10 instanceof o.C0422
            if (r12 != 0) goto L_0x0051
        L_0x0028:
            java.util.Deque<o.łι> r12 = r9.f4386
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x0051
            java.util.Deque<o.łι> r12 = r9.f4386
            java.lang.Object r12 = r12.peekLast()
            o.łι r12 = (o.C0546) r12
            o.ſι r12 = r12.f4428
            boolean r12 = r12 instanceof o.C0422
            if (r12 == 0) goto L_0x0051
            java.util.Deque<o.łι> r12 = r9.f4386
            java.lang.Object r12 = r12.peekLast()
            o.łι r12 = (o.C0546) r12
            o.ſι r12 = r12.f4428
            int r12 = r12.f4522
            r1 = 1
            boolean r12 = r9.m5110(r12, r1)
            if (r12 != 0) goto L_0x0028
        L_0x0051:
            java.util.Deque<o.łι> r12 = r9.f4386
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x006d
            o.łι r12 = new o.łι
            android.content.Context r3 = r9.f4379
            o.ƖƖ r4 = r9.f4384
            o.Ӏӏ r6 = r9.f4375
            o.ŀι r7 = r9.f4380
            r2 = r12
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.Deque<o.łι> r1 = r9.f4386
            r1.add(r12)
        L_0x006d:
            java.util.ArrayDeque r12 = new java.util.ArrayDeque
            r12.<init>()
            r1 = r10
        L_0x0073:
            if (r1 == 0) goto L_0x0093
            int r2 = r1.f4522
            o.ſι r2 = r9.m5108((int) r2)
            if (r2 != 0) goto L_0x0093
            o.ƖƖ r1 = r1.f4520
            if (r1 == 0) goto L_0x0073
            o.łι r8 = new o.łι
            android.content.Context r3 = r9.f4379
            o.Ӏӏ r6 = r9.f4375
            o.ŀι r7 = r9.f4380
            r2 = r8
            r4 = r1
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r12.addFirst(r8)
            goto L_0x0073
        L_0x0093:
            java.util.Deque<o.łι> r1 = r9.f4386
            r1.addAll(r12)
            o.łι r12 = new o.łι
            android.content.Context r4 = r9.f4379
            android.os.Bundle r6 = r10.m5244((android.os.Bundle) r11)
            o.Ӏӏ r7 = r9.f4375
            o.ŀι r8 = r9.f4380
            r3 = r12
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Deque<o.łι> r11 = r9.f4386
            r11.add(r12)
        L_0x00ae:
            r9.m5111()
            if (r0 != 0) goto L_0x00b5
            if (r10 == 0) goto L_0x00b8
        L_0x00b5:
            r9.m5113()
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0540.m5109(o.ſι, android.os.Bundle, o.Ɩӏ):void");
    }
}
