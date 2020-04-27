package o;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.bc  reason: case insensitive filesystem */
public abstract class C3292bc<T> {

    /* renamed from: ı  reason: contains not printable characters */
    public static final String f1729 = "_";

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final int f1730 = 8000;

    /* renamed from: Ι  reason: contains not printable characters */
    public static final int f1731 = 100;

    /* renamed from: ι  reason: contains not printable characters */
    public static final int f1732 = 1;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C3284av f1733;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final int f1734;

    /* renamed from: ɩ  reason: contains not printable characters */
    protected final Context f1735;

    /* renamed from: ɹ  reason: contains not printable characters */
    protected volatile long f1736;

    /* renamed from: І  reason: contains not printable characters */
    protected final List<aZ> f1737 = new CopyOnWriteArrayList();

    /* renamed from: і  reason: contains not printable characters */
    protected final C3290ba f1738;

    /* renamed from: Ӏ  reason: contains not printable characters */
    protected final aY<T> f1739;

    /* renamed from: ı  reason: contains not printable characters */
    public int m1754() {
        return f1730;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract String m1756();

    public C3292bc(Context context, aY<T> aYVar, C3284av avVar, C3290ba baVar, int i) {
        this.f1735 = context.getApplicationContext();
        this.f1739 = aYVar;
        this.f1738 = baVar;
        this.f1733 = avVar;
        this.f1736 = this.f1733.m1655();
        this.f1734 = i;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m1757(T t) {
        byte[] r2 = this.f1739.m1547(t);
        m1752(r2.length);
        this.f1738.m1745(r2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m1762(aZ aZVar) {
        if (aZVar != null) {
            this.f1737.add(aZVar);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public boolean m1763() {
        String str;
        boolean z = true;
        if (!this.f1738.m1746()) {
            str = m1756();
            this.f1738.m1749(str);
            C3285aw.m1691(this.f1735, String.format(Locale.US, "generated new file %s", new Object[]{str}));
            this.f1736 = this.f1733.m1655();
        } else {
            str = null;
            z = false;
        }
        m1753(str);
        return z;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m1752(int i) {
        if (!this.f1738.m1751(i, m1754())) {
            C3285aw.m1691(this.f1735, String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.f1738.m1748()), Integer.valueOf(i), Integer.valueOf(m1754())}));
            m1763();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public int m1758() {
        return this.f1734;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public long m1760() {
        return this.f1736;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m1753(String str) {
        for (aZ r1 : this.f1737) {
            try {
                r1.m1548(str);
            } catch (Exception unused) {
                C3285aw.m1663(this.f1735);
            }
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public List<File> m1755() {
        return this.f1738.m1747();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m1761(List<File> list) {
        this.f1738.m1750(list);
    }

    /* renamed from: І  reason: contains not printable characters */
    public void m1764() {
        C3290ba baVar = this.f1738;
        baVar.m1750(baVar.m1744());
        this.f1738.m1743();
    }

    /* renamed from: і  reason: contains not printable characters */
    public void m1765() {
        List<File> r0 = this.f1738.m1744();
        int r1 = m1758();
        if (r0.size() > r1) {
            int size = r0.size() - r1;
            Context context = this.f1735;
            Object[] objArr = {Integer.valueOf(r0.size()), Integer.valueOf(r1), Integer.valueOf(size)};
            C3285aw.m1690(context);
            TreeSet treeSet = new TreeSet(new Comparator<C0124>() {
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    return (int) (((C0124) obj).f1740 - ((C0124) obj2).f1740);
                }
            });
            for (File next : r0) {
                treeSet.add(new C0124(next, m1759(next.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0124) it.next()).f1741);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.f1738.m1750((List<File>) arrayList);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public long m1759(String str) {
        String[] split = str.split(f1729);
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: o.bc$ǃ  reason: contains not printable characters */
    static class C0124 {

        /* renamed from: ǃ  reason: contains not printable characters */
        final long f1740;

        /* renamed from: ι  reason: contains not printable characters */
        final File f1741;

        public C0124(File file, long j) {
            this.f1741 = file;
            this.f1740 = j;
        }
    }
}
