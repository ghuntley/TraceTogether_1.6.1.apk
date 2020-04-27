package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import o.C0712;
import o.C1822;

/* renamed from: o.ιɍ  reason: contains not printable characters */
public abstract class C1976 implements Cloneable {

    /* renamed from: ł  reason: contains not printable characters */
    private static ThreadLocal<C0299<Animator, C1978>> f9887 = new ThreadLocal<>();

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final int[] f9888 = {2, 1, 3, 4};

    /* renamed from: І  reason: contains not printable characters */
    private static final C1873 f9889 = new C1873() {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Path m10760(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    C2170 f9890;

    /* renamed from: ŀ  reason: contains not printable characters */
    private boolean f9891;

    /* renamed from: ſ  reason: contains not printable characters */
    private ArrayList<Animator> f9892;

    /* renamed from: Ɩ  reason: contains not printable characters */
    ArrayList<Animator> f9893;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private C1873 f9894;

    /* renamed from: ƚ  reason: contains not printable characters */
    private C1977 f9895;

    /* renamed from: ǃ  reason: contains not printable characters */
    ArrayList<Integer> f9896;

    /* renamed from: ȷ  reason: contains not printable characters */
    private C2771 f9897;

    /* renamed from: ɍ  reason: contains not printable characters */
    private ArrayList<If> f9898;

    /* renamed from: ɨ  reason: contains not printable characters */
    private C2771 f9899;

    /* renamed from: ɩ  reason: contains not printable characters */
    long f9900;

    /* renamed from: ɪ  reason: contains not printable characters */
    private long f9901;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int[] f9902;

    /* renamed from: ɿ  reason: contains not printable characters */
    private int f9903;

    /* renamed from: ʅ  reason: contains not printable characters */
    private boolean f9904;

    /* renamed from: ʟ  reason: contains not printable characters */
    private ArrayList<C2259> f9905;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f9906;

    /* renamed from: ι  reason: contains not printable characters */
    ArrayList<View> f9907;

    /* renamed from: г  reason: contains not printable characters */
    private ArrayList<C2259> f9908;

    /* renamed from: і  reason: contains not printable characters */
    private String f9909;

    /* renamed from: Ӏ  reason: contains not printable characters */
    C2186 f9910;

    /* renamed from: ӏ  reason: contains not printable characters */
    private TimeInterpolator f9911;

    /* renamed from: o.ιɍ$If */
    public interface If {
        /* renamed from: ǃ  reason: contains not printable characters */
        void m10761();

        /* renamed from: ǃ  reason: contains not printable characters */
        void m10762(C1976 r1);

        /* renamed from: ɩ  reason: contains not printable characters */
        void m10763();

        /* renamed from: Ι  reason: contains not printable characters */
        void m10764();

        /* renamed from: ι  reason: contains not printable characters */
        void m10765();
    }

    /* renamed from: o.ιɍ$ı  reason: contains not printable characters */
    public static abstract class C1977 {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m10736(C2259 r1);

    /* renamed from: ǃ  reason: contains not printable characters */
    public String[] m10737() {
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public Animator m10738(ViewGroup viewGroup, C2259 r2, C2259 r3) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public C1976 m10752(ViewGroup viewGroup) {
        return this;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m10755(C2259 r1);

    public C1976() {
        this.f9909 = getClass().getName();
        this.f9901 = -1;
        this.f9900 = -1;
        this.f9911 = null;
        this.f9896 = new ArrayList<>();
        this.f9907 = new ArrayList<>();
        this.f9897 = new C2771();
        this.f9899 = new C2771();
        this.f9890 = null;
        this.f9902 = f9888;
        this.f9906 = false;
        this.f9893 = new ArrayList<>();
        this.f9903 = 0;
        this.f9891 = false;
        this.f9904 = false;
        this.f9898 = null;
        this.f9892 = new ArrayList<>();
        this.f9894 = f9889;
    }

    @SuppressLint({"RestrictedApi"})
    public C1976(Context context, AttributeSet attributeSet) {
        this.f9909 = getClass().getName();
        this.f9901 = -1;
        this.f9900 = -1;
        String str = null;
        this.f9911 = null;
        this.f9896 = new ArrayList<>();
        this.f9907 = new ArrayList<>();
        this.f9897 = new C2771();
        this.f9899 = new C2771();
        this.f9890 = null;
        this.f9902 = f9888;
        boolean z = false;
        this.f9906 = false;
        this.f9893 = new ArrayList<>();
        this.f9903 = 0;
        this.f9891 = false;
        this.f9904 = false;
        this.f9898 = null;
        this.f9892 = new ArrayList<>();
        this.f9894 = f9889;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2004.f9954);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        int i = -1;
        long j = (long) (!(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "duration") != null) ? -1 : obtainStyledAttributes.getInt(1, -1));
        if (j >= 0) {
            m10733(j);
        }
        long j2 = (long) (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startDelay") != null ? obtainStyledAttributes.getInt(2, -1) : i);
        if (j2 > 0) {
            m10740(j2);
        }
        int resourceId = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) ? 0 : obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            m10723((TimeInterpolator) AnimationUtils.loadInterpolator(context, resourceId));
        }
        str = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "matchOrder") != null ? true : z ? obtainStyledAttributes.getString(3) : str;
        if (str != null) {
            m10719(m10717(str));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int[] m10717(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                StringBuilder sb = new StringBuilder("Unknown match type in matchOrder: '");
                sb.append(trim);
                sb.append("'");
                throw new InflateException(sb.toString());
            }
            i++;
        }
        return iArr;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C1976 m10733(long j) {
        this.f9900 = j;
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public C1976 m10740(long j) {
        this.f9901 = j;
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final long m10745() {
        return this.f9901;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public C1976 m10723(TimeInterpolator timeInterpolator) {
        this.f9911 = timeInterpolator;
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final TimeInterpolator m10739() {
        return this.f9911;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m10719(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f9902 = f9888;
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (!(i2 > 0 && i2 <= 4)) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (!m10720(iArr, i)) {
                i++;
            } else {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f9902 = (int[]) iArr.clone();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m10720(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m10718(C2771 r17, C2771 r18) {
        C2259 r7;
        View view;
        View view2;
        C2771 r1 = r17;
        C2771 r2 = r18;
        C0299 r3 = new C0299((C0910) r1.f13115);
        C0299 r4 = new C0299((C0910) r2.f13115);
        int i = 0;
        while (true) {
            int[] iArr = this.f9902;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                for (int size = r3.size() - 1; size >= 0; size--) {
                    View view3 = (View) r3.f5784[size << 1];
                    if (view3 != null && m10742(view3) && (r7 = (C2259) r4.remove(view3)) != null && m10742(r7.f10584)) {
                        this.f9905.add((C2259) r3.m6721(size));
                        this.f9908.add(r7);
                    }
                }
            } else if (i2 == 2) {
                C0299<String, View> r5 = r1.f13113;
                C0299<String, View> r72 = r2.f13113;
                int size2 = r5.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    int i4 = i3 << 1;
                    View view4 = (View) r5.f5784[i4 + 1];
                    if (view4 != null && m10742(view4) && (view = r72.get(r5.f5784[i4])) != null && m10742(view)) {
                        C2259 r12 = (C2259) r3.get(view4);
                        C2259 r13 = (C2259) r4.get(view);
                        if (!(r12 == null || r13 == null)) {
                            this.f9905.add(r12);
                            this.f9908.add(r13);
                            r3.remove(view4);
                            r4.remove(view);
                        }
                    }
                }
            } else if (i2 == 3) {
                SparseArray<View> sparseArray = r1.f13114;
                SparseArray<View> sparseArray2 = r2.f13114;
                int size3 = sparseArray.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    View valueAt = sparseArray.valueAt(i5);
                    if (valueAt != null && m10742(valueAt) && (view2 = sparseArray2.get(sparseArray.keyAt(i5))) != null && m10742(view2)) {
                        C2259 r122 = (C2259) r3.get(valueAt);
                        C2259 r132 = (C2259) r4.get(view2);
                        if (!(r122 == null || r132 == null)) {
                            this.f9905.add(r122);
                            this.f9908.add(r132);
                            r3.remove(valueAt);
                            r4.remove(view2);
                        }
                    }
                }
            } else if (i2 == 4) {
                C0782<View> r73 = r1.f13112;
                C0782<View> r8 = r2.f13112;
                if (r73.f5199) {
                    r73.m6115();
                }
                int i6 = r73.f5201;
                for (int i7 = 0; i7 < i6; i7++) {
                    if (r73.f5199) {
                        r73.m6115();
                    }
                    View view5 = (View) r73.f5200[i7];
                    if (view5 != null && m10742(view5)) {
                        if (r73.f5199) {
                            r73.m6115();
                        }
                        View r133 = r8.m6119(r73.f5202[i7], null);
                        if (r133 != null && m10742(r133)) {
                            C2259 r14 = (C2259) r3.get(view5);
                            C2259 r15 = (C2259) r4.get(r133);
                            if (!(r14 == null || r15 == null)) {
                                this.f9905.add(r14);
                                this.f9908.add(r15);
                                r3.remove(view5);
                                r4.remove(r133);
                            }
                        }
                    }
                }
            }
            i++;
        }
        for (int i8 = 0; i8 < r3.size(); i8++) {
            C2259 r22 = (C2259) r3.f5784[(i8 << 1) + 1];
            if (m10742(r22.f10584)) {
                this.f9905.add(r22);
                this.f9908.add((Object) null);
            }
        }
        for (int i9 = 0; i9 < r4.size(); i9++) {
            C2259 r23 = (C2259) r4.f5784[(i9 << 1) + 1];
            if (m10742(r23.f10584)) {
                this.f9908.add(r23);
                this.f9905.add((Object) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m10742(View view) {
        int id = view.getId();
        if ((this.f9896.size() != 0 || this.f9907.size() != 0) && !this.f9896.contains(Integer.valueOf(id)) && !this.f9907.contains(view)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public void m10753() {
        m10725();
        final C0299 r0 = f9887.get();
        if (r0 == null) {
            r0 = new C0299();
            f9887.set(r0);
        }
        Iterator<Animator> it = this.f9892.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (r0.containsKey(next)) {
                m10725();
                if (next != null) {
                    next.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationStart(Animator animator) {
                            C1976.this.f9893.add(animator);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            r0.remove(animator);
                            C1976.this.f9893.remove(animator);
                        }
                    });
                    long j = this.f9900;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.f9901;
                    if (j2 >= 0) {
                        next.setStartDelay(j2 + next.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.f9911;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            C1976.this.m10744();
                            animator.removeListener(this);
                        }
                    });
                    next.start();
                }
            }
        }
        this.f9892.clear();
        m10744();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C1976 m10734(View view) {
        this.f9907.add(view);
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C1976 m10746(View view) {
        this.f9907.remove(view);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m10728(ViewGroup viewGroup, boolean z) {
        m10731(z);
        if (this.f9896.size() > 0 || this.f9907.size() > 0) {
            for (int i = 0; i < this.f9896.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f9896.get(i).intValue());
                if (findViewById != null) {
                    C2259 r3 = new C2259(findViewById);
                    if (z) {
                        m10755(r3);
                    } else {
                        m10736(r3);
                    }
                    r3.f10583.add(this);
                    m10751(r3);
                    if (z) {
                        m10715(this.f9897, findViewById, r3);
                    } else {
                        m10715(this.f9899, findViewById, r3);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f9907.size(); i2++) {
                View view = this.f9907.get(i2);
                C2259 r1 = new C2259(view);
                if (z) {
                    m10755(r1);
                } else {
                    m10736(r1);
                }
                r1.f10583.add(this);
                m10751(r1);
                if (z) {
                    m10715(this.f9897, view, r1);
                } else {
                    m10715(this.f9899, view, r1);
                }
            }
            return;
        }
        m10721(viewGroup, z);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m10715(C2771 r4, View view, C2259 r6) {
        r4.f13115.put(view, r6);
        int id = view.getId();
        if (id >= 0) {
            if (r4.f13114.indexOfKey(id) >= 0) {
                r4.f13114.put(id, (Object) null);
            } else {
                r4.f13114.put(id, view);
            }
        }
        String r62 = C0293.m4215(view);
        if (r62 != null) {
            if (r4.f13113.containsKey(r62)) {
                r4.f13113.put(r62, null);
            } else {
                r4.f13113.put(r62, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0782<View> r63 = r4.f13112;
                if (r63.f5199) {
                    r63.m6115();
                }
                if (C0647.m5432(r63.f5202, r63.f5201, itemIdAtPosition) >= 0) {
                    View r5 = r4.f13112.m6119(itemIdAtPosition, null);
                    if (r5 != null) {
                        C0293.m4209(r5, false);
                        r4.f13112.m6116(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0293.m4209(view, true);
                r4.f13112.m6116(itemIdAtPosition, view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m10731(boolean z) {
        if (z) {
            this.f9897.f13115.clear();
            this.f9897.f13114.clear();
            this.f9897.f13112.m6117();
            return;
        }
        this.f9899.f13115.clear();
        this.f9899.f13114.clear();
        this.f9899.f13112.m6117();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m10721(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                C2259 r0 = new C2259(view);
                if (z) {
                    m10755(r0);
                } else {
                    m10736(r0);
                }
                r0.f10583.add(this);
                m10751(r0);
                if (z) {
                    m10715(this.f9897, view, r0);
                } else {
                    m10715(this.f9899, view, r0);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m10721(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2259 m10735(View view, boolean z) {
        C2170 r0 = this;
        while (true) {
            C2170 r1 = r0.f9890;
            if (r1 == null) {
                break;
            }
            r0 = r1;
        }
        return (z ? r0.f9897 : r0.f9899).f13115.get(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final C2259 m10724(View view, boolean z) {
        C2170 r0 = this;
        while (true) {
            C2170 r1 = r0.f9890;
            if (r1 == null) {
                break;
            }
            r0 = r1;
        }
        ArrayList<C2259> arrayList = z ? r0.f9905 : r0.f9908;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C2259 r6 = arrayList.get(i2);
            if (r6 == null) {
                return null;
            }
            if (r6.f10584 == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? r0.f9908 : r0.f9905).get(i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m10754(View view) {
        int i;
        if (!this.f9904) {
            C0299 r0 = f9887.get();
            if (r0 == null) {
                r0 = new C0299();
                f9887.set(r0);
            }
            int size = r0.size();
            C0712.C0713 r9 = C2300.m11983(view);
            while (true) {
                size--;
                i = 0;
                if (size < 0) {
                    break;
                }
                int i2 = size << 1;
                C1978 r3 = (C1978) r0.f5784[i2 + 1];
                if (r3.f9916 != null && r9.equals(r3.f9919)) {
                    Animator animator = (Animator) r0.f5784[i2];
                    if (Build.VERSION.SDK_INT >= 19) {
                        animator.pause();
                    } else {
                        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                        if (listeners != null) {
                            int size2 = listeners.size();
                            while (i < size2) {
                                Animator.AnimatorListener animatorListener = listeners.get(i);
                                if (animatorListener instanceof C1822.C1823) {
                                    ((C1822.C1823) animatorListener).onAnimationPause(animator);
                                }
                                i++;
                            }
                        }
                    }
                }
            }
            ArrayList<If> arrayList = this.f9898;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f9898.clone();
                int size3 = arrayList2.size();
                while (i < size3) {
                    ((If) arrayList2.get(i)).m10765();
                    i++;
                }
            }
            this.f9891 = true;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m10726(View view) {
        if (this.f9891) {
            if (!this.f9904) {
                C0299 r0 = f9887.get();
                if (r0 == null) {
                    r0 = new C0299();
                    f9887.set(r0);
                }
                int size = r0.size();
                C0712.C0713 r10 = C2300.m11983(view);
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    int i = size << 1;
                    C1978 r3 = (C1978) r0.f5784[i + 1];
                    if (r3.f9916 != null && r10.equals(r3.f9919)) {
                        Animator animator = (Animator) r0.f5784[i];
                        if (Build.VERSION.SDK_INT >= 19) {
                            animator.resume();
                        } else {
                            ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                            if (listeners != null) {
                                int size2 = listeners.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    Animator.AnimatorListener animatorListener = listeners.get(i2);
                                    if (animatorListener instanceof C1822.C1823) {
                                        ((C1822.C1823) animatorListener).onAnimationResume(animator);
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList<If> arrayList = this.f9898;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f9898.clone();
                    int size3 = arrayList2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((If) arrayList2.get(i3)).m10764();
                    }
                }
            }
            this.f9891 = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10748(ViewGroup viewGroup) {
        C1978 r4;
        this.f9905 = new ArrayList<>();
        this.f9908 = new ArrayList<>();
        m10718(this.f9897, this.f9899);
        C0299 r0 = f9887.get();
        if (r0 == null) {
            r0 = new C0299();
            f9887.set(r0);
        }
        int size = r0.size();
        C0712.C0713 r2 = C2300.m11983(viewGroup);
        while (true) {
            size--;
            if (size >= 0) {
                Animator animator = (Animator) r0.f5784[size << 1];
                if (!(animator == null || (r4 = (C1978) r0.get(animator)) == null || r4.f9916 == null || !r2.equals(r4.f9919))) {
                    C2259 r5 = r4.f9917;
                    View view = r4.f9916;
                    boolean z = true;
                    C2259 r8 = m10735(view, true);
                    C2259 r9 = m10724(view, true);
                    if (r8 == null && r9 == null) {
                        r9 = this.f9899.f13115.get(view);
                    }
                    if ((r8 == null && r9 == null) || !r4.f9915.m10743(r5, r9)) {
                        z = false;
                    }
                    if (z) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            r0.remove(animator);
                        }
                    }
                }
            } else {
                m10749(viewGroup, this.f9897, this.f9899, this.f9905, this.f9908);
                m10753();
                return;
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m10743(C2259 r7, C2259 r8) {
        if (!(r7 == null || r8 == null)) {
            String[] r2 = m10737();
            if (r2 != null) {
                for (String r5 : r2) {
                    if (m10716(r7, r8, r5)) {
                        return true;
                    }
                }
            } else {
                for (String r3 : r7.f10585.keySet()) {
                    if (m10716(r7, r8, r3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean m10716(C2259 r0, C2259 r1, String str) {
        Object obj = r0.f10585.get(str);
        Object obj2 = r1.f10585.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null || !obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m10725() {
        if (this.f9903 == 0) {
            ArrayList<If> arrayList = this.f9898;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f9898.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((If) arrayList2.get(i)).m10763();
                }
            }
            this.f9904 = false;
        }
        this.f9903++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m10744() {
        this.f9903--;
        if (this.f9903 == 0) {
            ArrayList<If> arrayList = this.f9898;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f9898.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((If) arrayList2.get(i)).m10762(this);
                }
            }
            int i2 = 0;
            while (true) {
                C0782<View> r3 = this.f9897.f13112;
                if (r3.f5199) {
                    r3.m6115();
                }
                if (i2 >= r3.f5201) {
                    break;
                }
                C0782<View> r32 = this.f9897.f13112;
                if (r32.f5199) {
                    r32.m6115();
                }
                View view = (View) r32.f5200[i2];
                if (view != null) {
                    C0293.m4209(view, false);
                }
                i2++;
            }
            int i3 = 0;
            while (true) {
                C0782<View> r33 = this.f9899.f13112;
                if (r33.f5199) {
                    r33.m6115();
                }
                if (i3 < r33.f5201) {
                    C0782<View> r34 = this.f9899.f13112;
                    if (r34.f5199) {
                        r34.m6115();
                    }
                    View view2 = (View) r34.f5200[i3];
                    if (view2 != null) {
                        C0293.m4209(view2, false);
                    }
                    i3++;
                } else {
                    this.f9904 = true;
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: І  reason: contains not printable characters */
    public void m10757() {
        for (int size = this.f9893.size() - 1; size >= 0; size--) {
            this.f9893.get(size).cancel();
        }
        ArrayList<If> arrayList = this.f9898;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f9898.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((If) arrayList2.get(i)).m10761();
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C1976 m10747(If ifR) {
        if (this.f9898 == null) {
            this.f9898 = new ArrayList<>();
        }
        this.f9898.add(ifR);
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public C1976 m10741(If ifR) {
        ArrayList<If> arrayList = this.f9898;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(ifR);
        if (this.f9898.size() == 0) {
            this.f9898 = null;
        }
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m10750(C1873 r1) {
        if (r1 == null) {
            this.f9894 = f9889;
        } else {
            this.f9894 = r1;
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C1873 m10732() {
        return this.f9894;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m10729(C1977 r1) {
        this.f9895 = r1;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final C1977 m10758() {
        return this.f9895;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m10730(C2186 r1) {
        this.f9910 = r1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m10751(C2259 r5) {
        String[] r0;
        if (this.f9910 != null && !r5.f10585.isEmpty() && (r0 = this.f9910.m11574()) != null) {
            int i = 0;
            while (i < r0.length && r5.f10585.containsKey(r0[i])) {
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m10756(boolean z) {
        this.f9906 = z;
    }

    public String toString() {
        return m10722("");
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public C1976 clone() {
        try {
            C1976 r1 = (C1976) super.clone();
            r1.f9892 = new ArrayList<>();
            r1.f9897 = new C2771();
            r1.f9899 = new C2771();
            r1.f9905 = null;
            r1.f9908 = null;
            return r1;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public String m10722(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String obj = sb.toString();
        if (this.f9900 != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("dur(");
            sb2.append(this.f9900);
            sb2.append(") ");
            obj = sb2.toString();
        }
        if (this.f9901 != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append("dly(");
            sb3.append(this.f9901);
            sb3.append(") ");
            obj = sb3.toString();
        }
        if (this.f9911 != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj);
            sb4.append("interp(");
            sb4.append(this.f9911);
            sb4.append(") ");
            obj = sb4.toString();
        }
        if (this.f9896.size() <= 0 && this.f9907.size() <= 0) {
            return obj;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj);
        sb5.append("tgts(");
        String obj2 = sb5.toString();
        if (this.f9896.size() > 0) {
            String str2 = obj2;
            for (int i = 0; i < this.f9896.size(); i++) {
                if (i > 0) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str2);
                    sb6.append(", ");
                    str2 = sb6.toString();
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str2);
                sb7.append(this.f9896.get(i));
                str2 = sb7.toString();
            }
            obj2 = str2;
        }
        if (this.f9907.size() > 0) {
            for (int i2 = 0; i2 < this.f9907.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(obj2);
                    sb8.append(", ");
                    obj2 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(obj2);
                sb9.append(this.f9907.get(i2));
                obj2 = sb9.toString();
            }
        }
        StringBuilder sb10 = new StringBuilder();
        sb10.append(obj2);
        sb10.append(")");
        return sb10.toString();
    }

    /* renamed from: o.ιɍ$ɩ  reason: contains not printable characters */
    static class C1978 {

        /* renamed from: ı  reason: contains not printable characters */
        C1976 f9915;

        /* renamed from: ǃ  reason: contains not printable characters */
        View f9916;

        /* renamed from: ɩ  reason: contains not printable characters */
        C2259 f9917;

        /* renamed from: Ι  reason: contains not printable characters */
        String f9918;

        /* renamed from: ι  reason: contains not printable characters */
        C0712.C0713 f9919;

        C1978(View view, String str, C1976 r3, C0712.C0713 r4, C2259 r5) {
            this.f9916 = view;
            this.f9918 = str;
            this.f9917 = r5;
            this.f9919 = r4;
            this.f9915 = r3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m10749(ViewGroup viewGroup, C2771 r22, C2771 r23, ArrayList<C2259> arrayList, ArrayList<C2259> arrayList2) {
        int i;
        Animator animator;
        C2259 r5;
        View view;
        Animator animator2;
        C2259 r15;
        C0299 r0 = f9887.get();
        if (r0 == null) {
            r0 = new C0299();
            f9887.set(r0);
        }
        C0299 r7 = r0;
        long j = Long.MAX_VALUE;
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C2259 r2 = arrayList.get(i2);
            C2259 r3 = arrayList2.get(i2);
            if (r2 != null && !r2.f10583.contains(this)) {
                r2 = null;
            }
            if (r3 != null && !r3.f10583.contains(this)) {
                r3 = null;
            }
            if (!(r2 == null && r3 == null)) {
                if (r2 == null || r3 == null || m10743(r2, r3)) {
                    Animator r52 = m10738(viewGroup, r2, r3);
                    if (r52 != null) {
                        if (r3 != null) {
                            view = r3.f10584;
                            String[] r32 = m10737();
                            if (r32 != null && r32.length > 0) {
                                r15 = new C2259(view);
                                C2259 r4 = r23.f13115.get(view);
                                animator2 = r52;
                                i = size;
                                if (r4 != null) {
                                    int i3 = 0;
                                    while (i3 < r32.length) {
                                        r15.f10585.put(r32[i3], r4.f10585.get(r32[i3]));
                                        i3++;
                                        C2771 r10 = r23;
                                        ArrayList<C2259> arrayList3 = arrayList;
                                        r4 = r4;
                                    }
                                }
                                int size2 = r7.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size2) {
                                        break;
                                    }
                                    C1978 r53 = (C1978) r7.get((Animator) r7.f5784[i4 << 1]);
                                    if (r53.f9917 != null && r53.f9916 == view && r53.f9918.equals(this.f9909) && r53.f9917.equals(r15)) {
                                        r5 = r15;
                                        animator = null;
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                animator2 = r52;
                                i = size;
                                r15 = null;
                            }
                            r5 = r15;
                            animator = animator2;
                        } else {
                            i = size;
                            view = r2.f10584;
                            animator = r52;
                            r5 = null;
                        }
                        if (animator != null) {
                            C2186 r33 = this.f9910;
                            if (r33 != null) {
                                long r34 = r33.m11573();
                                sparseIntArray.put(this.f9892.size(), (int) r34);
                                j = Math.min(r34, j);
                            }
                            r7.put(animator, new C1978(view, this.f9909, this, C2300.m11983(viewGroup), r5));
                            this.f9892.add(animator);
                            j = j;
                        }
                        i2++;
                        size = i;
                    }
                    i = size;
                    i2++;
                    size = i;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator3 = this.f9892.get(sparseIntArray.keyAt(i5));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i5)) - j) + animator3.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m10727(ViewGroup viewGroup) {
        C0299 r0 = f9887.get();
        if (r0 == null) {
            r0 = new C0299();
            f9887.set(r0);
        }
        int size = r0.size();
        if (viewGroup != null && size != 0) {
            C0712.C0713 r6 = C2300.m11983(viewGroup);
            C0299 r2 = new C0299((C0910) r0);
            r0.clear();
            for (int i = size - 1; i >= 0; i--) {
                int i2 = i << 1;
                C1978 r02 = (C1978) r2.f5784[i2 + 1];
                if (r02.f9916 != null && r6.equals(r02.f9919)) {
                    ((Animator) r2.f5784[i2]).end();
                }
            }
        }
    }
}
