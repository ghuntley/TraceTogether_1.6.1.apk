package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C3396ex;
import o.C3503iy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\b\u0018\u0000 \u00012\b\u0012\u0004\u0012\u00020\u00110\u001a2\u00020\u001b:\u0001\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0003\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0003\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0007\u0010\u0017R\u0019\u0010\u0007\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/hs;", "ǃ", "", "ı", "J", "Ι", "()J", "ι", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lo/ex;", "", "p1", "", "(Lo/ex;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "(Lo/ex;)Ljava/lang/String;", "<init>", "(J)V", "Lo/iy;", "Lo/ev;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.hs  reason: case insensitive filesystem */
public final class C3471hs extends C3394ev implements C3503iy<String> {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C0183 f2292 = new C0183((fL) null);

    /* renamed from: ı  reason: contains not printable characters */
    private final long f2293;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3471hs) {
                if (this.f2293 == ((C3471hs) obj).f2293) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f2293;
        return (int) (j ^ (j >>> 32));
    }

    public final <R> R fold(R r, C3423fy<? super R, ? super C3396ex.C0169, ? extends R> fyVar) {
        fM.m2254(fyVar, "");
        return C3503iy.DefaultImpls.m2815(this, r, fyVar);
    }

    public final <E extends C3396ex.C0169> E get(C3396ex.C0170<E> r2) {
        fM.m2254(r2, "");
        return C3503iy.DefaultImpls.m2814(this, r2);
    }

    public final C3396ex minusKey(C3396ex.C0170<?> r2) {
        fM.m2254(r2, "");
        return C3503iy.DefaultImpls.m2812(this, r2);
    }

    public final C3396ex plus(C3396ex exVar) {
        fM.m2254(exVar, "");
        return C3503iy.DefaultImpls.m2813(this, exVar);
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final long m2550() {
        return this.f2293;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00040\u0003B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/hs$ǃ;", "<init>", "()V", "Lo/ex$ǃ;", "Lo/hs;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.hs$ǃ  reason: contains not printable characters */
    public static final class C0183 implements C3396ex.C0170<C3471hs> {
        private C0183() {
        }

        public /* synthetic */ C0183(fL fLVar) {
            this();
        }
    }

    public C3471hs(long j) {
        super(f2292);
        this.f2293 = j;
    }

    public final String toString() {
        return "CoroutineId(" + this.f2293 + ')';
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m2549(C3396ex exVar) {
        String str;
        fM.m2254(exVar, "");
        C3477hz hzVar = (C3477hz) exVar.get(C3477hz.If);
        if (hzVar == null || (str = hzVar.m2558()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        fM.m2252((Object) currentThread, "");
        String name = currentThread.getName();
        fM.m2252((Object) name, "");
        int r3 = gK.m2356$default((CharSequence) name, " @", 0, false, 6, (Object) null);
        if (r3 < 0) {
            r3 = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + r3 + 10);
        String substring = name.substring(0, r3);
        fM.m2252((Object) substring, "");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.f2293);
        String sb2 = sb.toString();
        fM.m2252((Object) sb2, "");
        currentThread.setName(sb2);
        return name;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m2547(C3396ex exVar, String str) {
        fM.m2254(exVar, "");
        fM.m2254(str, "");
        Thread currentThread = Thread.currentThread();
        fM.m2252((Object) currentThread, "");
        currentThread.setName(str);
    }
}
