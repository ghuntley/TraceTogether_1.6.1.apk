package o;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: o.cp  reason: case insensitive filesystem */
public final class C3337cp extends RuntimeException {

    /* renamed from: ı  reason: contains not printable characters */
    private Throwable f2003;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final List<Throwable> f2004;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f2005;

    public C3337cp(Throwable... thArr) {
        this((Iterable<? extends Throwable>) Arrays.asList(thArr));
    }

    public C3337cp(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof C3337cp) {
                    linkedHashSet.addAll(((C3337cp) th).f2004);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.f2004 = Collections.unmodifiableList(arrayList);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2004.size());
            sb.append(" exceptions occurred. ");
            this.f2005 = sb.toString();
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    public final String getMessage() {
        return this.f2005;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|(4:12|(2:14|32)(2:15|33)|31|10)|16|17|18|19|30) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.f2003     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x005b
            o.cp$ı r0 = new o.cp$ı     // Catch:{ all -> 0x005f }
            r0.<init>()     // Catch:{ all -> 0x005f }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x005f }
            r1.<init>()     // Catch:{ all -> 0x005f }
            java.util.List<java.lang.Throwable> r2 = r8.f2004     // Catch:{ all -> 0x005f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x005f }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x005f }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x005f }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x005f }
            if (r5 != 0) goto L_0x0016
            r1.add(r4)     // Catch:{ all -> 0x005f }
            java.util.List r5 = m2010(r4)     // Catch:{ all -> 0x005f }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x005f }
        L_0x0033:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x005f }
            if (r6 == 0) goto L_0x0051
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x005f }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x005f }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x004d
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x005f }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x005f }
            goto L_0x0033
        L_0x004d:
            r1.add(r6)     // Catch:{ all -> 0x005f }
            goto L_0x0033
        L_0x0051:
            r3.initCause(r4)     // Catch:{ all -> 0x0054 }
        L_0x0054:
            java.lang.Throwable r3 = m2011(r3)     // Catch:{ all -> 0x005f }
            goto L_0x0016
        L_0x0059:
            r8.f2003 = r0     // Catch:{ all -> 0x005f }
        L_0x005b:
            java.lang.Throwable r0 = r8.f2003     // Catch:{ all -> 0x005f }
            monitor-exit(r8)
            return r0
        L_0x005f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3337cp.getCause():java.lang.Throwable");
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        m2009(new If(printStream));
    }

    public final void printStackTrace(PrintWriter printWriter) {
        m2009(new C0150(printWriter));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m2009(Cif ifVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement append : getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append(10);
        }
        int i = 1;
        for (Throwable r4 : this.f2004) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m2012(sb, r4, "\t");
            i++;
        }
        ifVar.m2014(sb.toString());
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m2012(StringBuilder sb, Throwable th, String str) {
        while (true) {
            sb.append(str);
            sb.append(th);
            sb.append(10);
            for (StackTraceElement append : th.getStackTrace()) {
                sb.append("\t\tat ");
                sb.append(append);
                sb.append(10);
            }
            if (th.getCause() != null) {
                sb.append("\tCaused by: ");
                th = th.getCause();
                str = "";
            } else {
                return;
            }
        }
    }

    /* renamed from: o.cp$if  reason: invalid class name */
    static abstract class Cif {
        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract void m2014(Object obj);

        Cif() {
        }
    }

    /* renamed from: o.cp$If */
    static final class If extends Cif {

        /* renamed from: ı  reason: contains not printable characters */
        private final PrintStream f2006;

        If(PrintStream printStream) {
            this.f2006 = printStream;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m2013(Object obj) {
            this.f2006.println(obj);
        }
    }

    /* renamed from: o.cp$ǃ  reason: contains not printable characters */
    static final class C0150 extends Cif {

        /* renamed from: ı  reason: contains not printable characters */
        private final PrintWriter f2007;

        C0150(PrintWriter printWriter) {
            this.f2007 = printWriter;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m2015(Object obj) {
            this.f2007.println(obj);
        }
    }

    /* renamed from: o.cp$ı  reason: contains not printable characters */
    static final class C0149 extends RuntimeException {
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }

        C0149() {
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static List<Throwable> m2010(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Throwable m2011(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return cause;
            }
            cause = cause2;
        }
        return cause;
    }
}
