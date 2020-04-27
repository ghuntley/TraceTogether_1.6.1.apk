package o;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import o.C2319;

/* renamed from: o.ΙƖ  reason: contains not printable characters */
public abstract class C1795 {

    /* renamed from: ı  reason: contains not printable characters */
    public int f9203;

    /* renamed from: ł  reason: contains not printable characters */
    public ArrayList<String> f9204;

    /* renamed from: Ɩ  reason: contains not printable characters */
    int f9205;

    /* renamed from: ǃ  reason: contains not printable characters */
    ArrayList<If> f9206;

    /* renamed from: ȷ  reason: contains not printable characters */
    int f9207;

    /* renamed from: ɨ  reason: contains not printable characters */
    int f9208;

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f9209;

    /* renamed from: ɪ  reason: contains not printable characters */
    CharSequence f9210;

    /* renamed from: ɹ  reason: contains not printable characters */
    public boolean f9211;

    /* renamed from: ɾ  reason: contains not printable characters */
    public String f9212;

    /* renamed from: ɿ  reason: contains not printable characters */
    public ArrayList<String> f9213;

    /* renamed from: ʟ  reason: contains not printable characters */
    public boolean f9214;

    /* renamed from: Ι  reason: contains not printable characters */
    private final ClassLoader f9215;

    /* renamed from: ι  reason: contains not printable characters */
    private final C1469 f9216;

    /* renamed from: І  reason: contains not printable characters */
    public int f9217;

    /* renamed from: і  reason: contains not printable characters */
    public boolean f9218;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public int f9219;

    /* renamed from: ӏ  reason: contains not printable characters */
    CharSequence f9220;

    /* renamed from: ı  reason: contains not printable characters */
    public abstract int m9957();

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m9963();

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract int m9966();

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m9970();

    /* renamed from: o.ΙƖ$If */
    static final class If {

        /* renamed from: ı  reason: contains not printable characters */
        int f9221;

        /* renamed from: Ɩ  reason: contains not printable characters */
        C2319.Cif f9222;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f9223;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f9224;

        /* renamed from: ɹ  reason: contains not printable characters */
        C2319.Cif f9225;

        /* renamed from: Ι  reason: contains not printable characters */
        int f9226;

        /* renamed from: ι  reason: contains not printable characters */
        C1277 f9227;

        /* renamed from: І  reason: contains not printable characters */
        int f9228;

        If() {
        }

        If(int i, C1277 r2) {
            this.f9226 = i;
            this.f9227 = r2;
            this.f9222 = C2319.Cif.RESUMED;
            this.f9225 = C2319.Cif.RESUMED;
        }

        If(C1277 r2, C2319.Cif ifVar) {
            this.f9226 = 10;
            this.f9227 = r2;
            this.f9222 = r2.mMaxState;
            this.f9225 = ifVar;
        }
    }

    @Deprecated
    public C1795() {
        this.f9206 = new ArrayList<>();
        this.f9218 = true;
        this.f9214 = false;
        this.f9216 = null;
        this.f9215 = null;
    }

    C1795(C1469 r2, ClassLoader classLoader) {
        this.f9206 = new ArrayList<>();
        this.f9218 = true;
        this.f9214 = false;
        this.f9216 = r2;
        this.f9215 = classLoader;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m9971(If ifR) {
        this.f9206.add(ifR);
        ifR.f9224 = this.f9209;
        ifR.f9221 = this.f9203;
        ifR.f9223 = this.f9217;
        ifR.f9228 = this.f9219;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C1795 m9960(C1277 r3, String str) {
        m9968(0, r3, str, 1);
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C1795 m9958(int i, C1277 r4) {
        m9968(i, r4, (String) null, 1);
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m9968(int i, C1277 r5, String str, int i2) {
        Class<?> cls = r5.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        if (str != null) {
            if (r5.mTag == null || str.equals(r5.mTag)) {
                r5.mTag = str;
            } else {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(r5);
                sb2.append(": was ");
                sb2.append(r5.mTag);
                sb2.append(" now ");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i == -1) {
                StringBuilder sb3 = new StringBuilder("Can't add fragment ");
                sb3.append(r5);
                sb3.append(" with tag ");
                sb3.append(str);
                sb3.append(" to container view with no id");
                throw new IllegalArgumentException(sb3.toString());
            } else if (r5.mFragmentId == 0 || r5.mFragmentId == i) {
                r5.mFragmentId = i;
                r5.mContainerId = i;
            } else {
                StringBuilder sb4 = new StringBuilder("Can't change container ID of fragment ");
                sb4.append(r5);
                sb4.append(": was ");
                sb4.append(r5.mFragmentId);
                sb4.append(" now ");
                sb4.append(i);
                throw new IllegalStateException(sb4.toString());
            }
        }
        m9971(new If(i2, r5));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1795 m9964(int i, C1277 r3, String str) {
        if (i != 0) {
            m9968(i, r3, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public C1795 m9965(C1277 r3) {
        m9971(new If(3, r3));
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C1795 m9962(C1277 r3) {
        m9971(new If(4, r3));
        return this;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public C1795 m9969(C1277 r3) {
        m9971(new If(5, r3));
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C1795 m9967(C1277 r3) {
        m9971(new If(8, r3));
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public C1795 m9961(C1277 r2, C2319.Cif ifVar) {
        m9971(new If(r2, ifVar));
        return this;
    }

    /* renamed from: І  reason: contains not printable characters */
    public boolean m9972() {
        return this.f9206.isEmpty();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C1795 m9959(String str) {
        if (this.f9218) {
            this.f9211 = true;
            this.f9212 = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }
}
