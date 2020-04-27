package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C3396ex;
import o.C3483id;
import o.iQ;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0016\u0018\u00002\u00020:2\u00020#2\u00020G2\u00020]:\u0002Z\fB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b[\u0010\\J+\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0002¢\u0006\u0004\b\u0002\u0010\u001dJ%\u0010\u0004\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u001eH\u0002¢\u0006\u0004\b\u0004\u0010 J!\u0010\u0002\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001a\u001a\u00020!H\u0014¢\u0006\u0004\b\u0002\u0010\"J\u0015\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020#¢\u0006\u0004\b\f\u0010$J\u001f\u0010\u0006\u001a\u00020\u001f2\u000e\u0010\u0018\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&H\u0016¢\u0006\u0004\b\u0006\u0010'J\u0019\u0010\u0002\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0002\u0010(J\u0019\u0010\u0002\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0002\u0010)J\u0019\u0010\u0005\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0005\u0010(J\u0017\u0010*\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010)J\u0017\u0010\f\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\f\u0010)J)\u0010\u0006\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020+2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020!H\u0002¢\u0006\u0004\b\u0006\u0010,J)\u0010\u0006\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020.2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0006\u0010/J\u0019\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u00101\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0019\u0010\u0006\u001a\u0004\u0018\u00010.2\u0006\u0010\u0018\u001a\u00020+H\u0002¢\u0006\u0004\b\u0006\u00103J\u0011\u00104\u001a\u00060%j\u0002`&¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u00060%j\u0002`&H\u0016¢\u0006\u0004\b6\u00105J'\u0010\u0002\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020-2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u001eH\u0002¢\u0006\u0004\b\u0002\u00107J\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020+H\u0002¢\u0006\u0004\b\u0002\u00108J\u0017\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0005\u0010)J\u0017\u0010\u0006\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0006\u00109J\u0019\u0010\u0004\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010:H\u0000¢\u0006\u0004\b\u0004\u0010;J7\u0010\u0005\u001a\u00020>2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0018\u0010\u001c\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u001f0<j\u0002`=¢\u0006\u0004\b\u0005\u0010?J\u0019\u00101\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b1\u0010(J!\u0010\u0006\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001a\u001a\u00020!H\u0000¢\u0006\u0004\b\u0006\u0010@J5\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0018\u0010\u0018\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u001f0<j\u0002`=2\u0006\u0010\u001a\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010AJ\u000f\u0010\u0014\u001a\u00020BH\u0010¢\u0006\u0004\b\u0014\u0010CJ\u001f\u0010\u0004\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0004\u0010DJ\u0019\u0010\u0004\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0004\u00109J\u0019\u0010\u0004\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0004\u0010EJ\u000f\u0010\r\u001a\u00020\u001fH\u0010¢\u0006\u0004\b\r\u0010FJ\u0015\u0010\u0006\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020G¢\u0006\u0004\b\u0006\u0010HJ\u0017\u0010\u0006\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020IH\u0002¢\u0006\u0004\b\u0006\u0010JJ\u001b\u0010\u0006\u001a\u00020\u001f2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0002¢\u0006\u0004\b\u0006\u0010KJ\u001b\u0010\u0004\u001a\u00020\u001f2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000¢\u0006\u0004\b\u0004\u0010KJ\r\u0010L\u001a\u00020\u0001¢\u0006\u0004\bL\u0010\u0003J\u0019\u0010\f\u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\f\u0010MJ\u0019\u0010\u0014\u001a\u00020B2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010NJ\r\u0010O\u001a\u00020B¢\u0006\u0004\bO\u0010CJ\u000f\u0010P\u001a\u00020BH\u0016¢\u0006\u0004\bP\u0010CJ)\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020-2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020!H\u0002¢\u0006\u0004\b\u0005\u0010QJ)\u0010\f\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020+2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020!H\u0002¢\u0006\u0004\b\f\u0010RJ\u001f\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0006\u0010SJ+\u0010\u0005\u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020!H\u0002¢\u0006\u0004\b\u0005\u0010TJ)\u0010\u0002\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020+2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020!H\u0002¢\u0006\u0004\b\u0002\u0010UJ*\u0010\f\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020.2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0010¢\u0006\u0004\b\f\u0010VJ\u0015\u0010\u0004\u001a\u0004\u0018\u00010.*\u00020WH\u0002¢\u0006\u0004\b\u0004\u0010XJ\u001d\u0010\u0002\u001a\u00020\u001f*\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0002\u0010DJ#\u0010\u0006\u001a\u00060%j\u0002`&*\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010BH\u0004¢\u0006\u0004\b\u0006\u0010YR\u0016\u0010\u0004\u001a\u00020\u00018Q@\u0010X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00018W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003R\u0013\u0010\u0002\u001a\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00018U@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0003R\u0017\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8G@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00018Q@\u0010X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118A@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\u00118C@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0016"}, d2 = {"Lo/ig;", "", "ι", "()Z", "ı", "ɩ", "Ι", "ɾ", "ŀ", "Lo/ex$ǃ;", "getKey", "()Lo/ex$ǃ;", "ǃ", "Ɩ", "Lo/hd;", "parentHandle", "Lo/hd;", "", "ɨ", "()Ljava/lang/Object;", "І", "", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "ɹ", "p0", "Lo/io;", "p1", "Lo/ih;", "p2", "(Ljava/lang/Object;Lo/io;Lo/ih;)Z", "", "", "(Ljava/lang/Throwable;Ljava/util/List;)V", "", "(Ljava/lang/Object;I)V", "Lo/hi;", "(Lo/hi;)Lo/hd;", "Ljava/util/concurrent/CancellationException;", "Lo/Ι;", "(Ljava/util/concurrent/CancellationException;)V", "(Ljava/lang/Object;)Z", "(Ljava/lang/Throwable;)Z", "і", "Lo/hW;", "(Lo/hW;Ljava/lang/Object;I)V", "Lo/ig$ǃ;", "Lo/hg;", "(Lo/ig$ǃ;Lo/hg;Ljava/lang/Object;)V", "Lo/hZ;", "Ӏ", "()Lo/hZ;", "(Lo/hW;)Lo/hg;", "ɪ", "()Ljava/util/concurrent/CancellationException;", "ȷ", "(Lo/ig$ǃ;Ljava/util/List;)Ljava/lang/Throwable;", "(Lo/hW;)Lo/io;", "(Ljava/lang/Throwable;)V", "Lo/id;", "(Lo/id;)V", "Lkotlin/Function1;", "Lo/CompletionHandler;", "Lo/hK;", "(ZZLo/fo;)Lo/hK;", "(Ljava/lang/Object;I)Z", "(Lo/fo;Z)Lo/ih;", "", "()Ljava/lang/String;", "(Lo/io;Ljava/lang/Throwable;)V", "(Ljava/lang/Object;)V", "()V", "Lo/ir;", "(Lo/ir;)V", "Lo/hM;", "(Lo/hM;)V", "(Lo/ih;)V", "ӏ", "(Ljava/lang/Object;)I", "(Ljava/lang/Object;)Ljava/lang/String;", "ł", "toString", "(Lo/ig$ǃ;Ljava/lang/Object;I)Z", "(Lo/hW;Ljava/lang/Object;I)Z", "(Lo/hW;Ljava/lang/Throwable;)Z", "(Ljava/lang/Object;Ljava/lang/Object;I)I", "(Lo/hW;Ljava/lang/Object;I)I", "(Lo/ig$ǃ;Lo/hg;Ljava/lang/Object;)Z", "Lo/iQ;", "(Lo/iQ;)Lo/hg;", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "if", "<init>", "(Z)V", "Lo/jF;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.ig  reason: case insensitive filesystem */
public class C3485ig implements C3461hi, C3496ir, jF {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f2368 = AtomicReferenceFieldUpdater.newUpdater(C3485ig.class, Object.class, "_state");
    private volatile Object _state;
    public volatile C3456hd parentHandle;

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public void m2731(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public void m2732(Throwable th) {
    }

    /* access modifiers changed from: protected */
    @JvmName(name = "ŀ")
    /* renamed from: ŀ  reason: contains not printable characters */
    public boolean m2735() {
        return false;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public void m2737() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m2744(Throwable th) {
        fM.m2254(th, "");
        return false;
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m2751() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public void m2753(Object obj, int i) {
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public boolean m2754() {
        return true;
    }

    public C3485ig(boolean z) {
        this._state = z ? C3490il.f2380 : C3490il.f2381;
    }

    public <R> R fold(R r, C3423fy<? super R, ? super C3396ex.C0169, ? extends R> fyVar) {
        fM.m2254(fyVar, "");
        return C3483id.DefaultImpls.m2679(this, r, fyVar);
    }

    public <E extends C3396ex.C0169> E get(C3396ex.C0170<E> r2) {
        fM.m2254(r2, "");
        return C3483id.DefaultImpls.m2675(this, r2);
    }

    public C3396ex minusKey(C3396ex.C0170<?> r2) {
        fM.m2254(r2, "");
        return C3483id.DefaultImpls.m2677(this, r2);
    }

    public C3396ex plus(C3396ex exVar) {
        fM.m2254(exVar, "");
        return C3483id.DefaultImpls.m2674(this, exVar);
    }

    @JvmName(name = "getKey")
    public final C3396ex.C0170<?> getKey() {
        return C3483id.f2366;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0007J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\b"}, d2 = {"Lo/iQ$ǃ;", "Lo/iQ;", "Lo/ǃ;", "p0", "", "ɩ", "(Lo/iQ;)Ljava/lang/Object;", "Lo/iQ$ɩ;", "o/iQ$ǃ"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.ig$If */
    public static final class If extends iQ.C0187 {

        /* renamed from: ǃ  reason: contains not printable characters */
        final /* synthetic */ Object f2369;

        /* renamed from: ɩ  reason: contains not printable characters */
        final /* synthetic */ C3485ig f2370;

        /* renamed from: Ι  reason: contains not printable characters */
        final /* synthetic */ iQ f2371;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public If(iQ iQVar, iQ iQVar2, C3485ig igVar, Object obj) {
            super(iQVar2);
            this.f2371 = iQVar;
            this.f2370 = igVar;
            this.f2369 = obj;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final Object m2759(iQ iQVar) {
            fM.m2254(iQVar, "");
            if (this.f2370.m2741() == this.f2369) {
                return null;
            }
            return iT.m2655();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m2733(C3483id idVar) {
        if (hA.m2423()) {
            if (!(this.parentHandle == null)) {
                throw new AssertionError();
            }
        }
        if (idVar == null) {
            this.parentHandle = C3492in.f2383;
            return;
        }
        idVar.m2673();
        C3456hd r2 = idVar.m2668(this);
        this.parentHandle = r2;
        if (m2746()) {
            r2.m2456();
            this.parentHandle = C3492in.f2383;
        }
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m2743() {
        Object r0 = m2741();
        return (r0 instanceof hW) && ((hW) r0).m2498();
    }

    @JvmName(name = "ɾ")
    /* renamed from: ɾ  reason: contains not printable characters */
    public final boolean m2746() {
        return !(m2741() instanceof hW);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean m2712(C0189 r8, Object obj, int i) {
        boolean r4;
        Throwable r6;
        boolean z = false;
        if (!(m2741() == r8)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!r8.m2765())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (r8.isCompleting) {
            C3463hk hkVar = (C3463hk) (!(obj instanceof C3463hk) ? null : obj);
            Throwable th = hkVar != null ? hkVar.f2291 : null;
            synchronized (r8) {
                r4 = r8.m2769();
                List<Throwable> r5 = r8.m2764(th);
                r6 = m2722(r8, (List<? extends Throwable>) r5);
                if (r6 != null) {
                    m2703(r6, (List<? extends Throwable>) r5);
                }
            }
            if (!(r6 == null || r6 == th)) {
                obj = new C3463hk(r6, false, 2, (fL) null);
            }
            if (r6 != null) {
                if (m2728(r6) || m2744(r6)) {
                    z = true;
                }
                if (z) {
                    if (obj != null) {
                        ((C3463hk) obj).m2537();
                    } else {
                        throw new dA("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                }
            }
            if (!r4) {
                m2732(r6);
            }
            m2731(obj);
            if (f2368.compareAndSet(this, r8, C3490il.m2781(obj))) {
                m2716((hW) r8, obj, i);
                return true;
            }
            throw new IllegalArgumentException(("Unexpected state: " + this._state + ", expected: " + r8 + ", update: " + obj).toString());
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final Throwable m2722(C0189 r4, List<? extends Throwable> list) {
        Object obj;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) obj;
            return th != null ? th : (Throwable) list.get(0);
        } else if (r4.m2769()) {
            return m2729();
        } else {
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m2703(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set r0 = iO.m2612(list.size());
            Throwable r1 = C3507jb.m3058(th);
            for (Throwable r2 : list) {
                Throwable r22 = C3507jb.m3058(r2);
                if (r22 != th && r22 != r1 && !(r22 instanceof CancellationException) && r0.add(r22)) {
                    C3354df.m2096(th, r22);
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final boolean m2707(hW hWVar, Object obj, int i) {
        if (hA.m2423()) {
            if (!((hWVar instanceof hM) || (hWVar instanceof C3486ih))) {
                throw new AssertionError();
            }
        }
        if (hA.m2423() && !(!(obj instanceof C3463hk))) {
            throw new AssertionError();
        } else if (!f2368.compareAndSet(this, hWVar, C3490il.m2781(obj))) {
            return false;
        } else {
            m2732((Throwable) null);
            m2731(obj);
            m2716(hWVar, obj, i);
            return true;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m2716(hW hWVar, Object obj, int i) {
        C3456hd hdVar = this.parentHandle;
        if (hdVar != null) {
            hdVar.m2456();
            this.parentHandle = C3492in.f2383;
        }
        Throwable th = null;
        C3463hk hkVar = (C3463hk) (!(obj instanceof C3463hk) ? null : obj);
        if (hkVar != null) {
            th = hkVar.f2291;
        }
        if (hWVar instanceof C3486ih) {
            try {
                ((C3486ih) hWVar).m2538(th);
            } catch (Throwable th2) {
                m2748((Throwable) new C3468hp("Exception in completion handler " + hWVar + " for " + this, th2));
            }
        } else {
            C3493io r5 = hWVar.m2499();
            if (r5 != null) {
                m2725(r5, th);
            }
        }
        m2753(obj, i);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m2704(C3493io ioVar, Throwable th) {
        m2732(th);
        Throwable th2 = null;
        Object r1 = ioVar.m2644();
        if (r1 != null) {
            for (iQ iQVar = (iQ) r1; !fM.m2257(iQVar, ioVar); iQVar = iQVar.m2646()) {
                if (iQVar instanceof C3481ib) {
                    C3486ih ihVar = (C3486ih) iQVar;
                    try {
                        ihVar.m2538(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            C3354df.m2096(th2, th3);
                        } else {
                            dF dFVar = dF.f2032;
                            th2 = new C3468hp("Exception in completion handler " + ihVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (th2 != null) {
                m2748(th2);
            }
            m2728(th);
            return;
        }
        throw new dA("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: і  reason: contains not printable characters */
    private final boolean m2728(Throwable th) {
        if (m2735()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C3456hd hdVar = this.parentHandle;
        if (hdVar == null || hdVar == C3492in.f2383) {
            return z;
        }
        if (hdVar.m2511(th) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int m2706(Object obj) {
        if (obj instanceof hM) {
            if (((hM) obj).m2474()) {
                return 0;
            }
            if (!f2368.compareAndSet(this, obj, C3490il.f2380)) {
                return -1;
            }
            m2737();
            return 1;
        } else if (!(obj instanceof hX)) {
            return 0;
        } else {
            if (!f2368.compareAndSet(this, obj, ((hX) obj).m2501())) {
                return -1;
            }
            m2737();
            return 1;
        }
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final CancellationException m2745() {
        Object r0 = m2741();
        if (r0 instanceof C0189) {
            Throwable th = ((C0189) r0).rootCause;
            if (th != null) {
                CancellationException r02 = m2747(th, hB.m2428((Object) this) + " is cancelling");
                if (r02 != null) {
                    return r02;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (r0 instanceof hW) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (r0 instanceof C3463hk) {
            return m2720$default(this, ((C3463hk) r0).f2291, (String) null, 1, (Object) null);
        } else {
            return new hZ(hB.m2428((Object) this) + " has completed normally", (Throwable) null, this);
        }
    }

    /* renamed from: Ι$default  reason: contains not printable characters */
    public static /* synthetic */ CancellationException m2720$default(C3485ig igVar, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return igVar.m2747(th, str);
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final CancellationException m2747(Throwable th, String str) {
        fM.m2254(th, "");
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException != null) {
            return cancellationException;
        }
        if (str == null) {
            str = hB.m2428((Object) th) + " was cancelled";
        }
        return new hZ(str, th, this);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final hK m2742(boolean z, boolean z2, C3413fo<? super Throwable, dF> foVar) {
        fM.m2254(foVar, "");
        Throwable th = null;
        C3486ih<?> ihVar = null;
        while (true) {
            Object r2 = m2741();
            if (r2 instanceof hM) {
                hM hMVar = (hM) r2;
                if (hMVar.m2474()) {
                    if (ihVar == null) {
                        ihVar = m2710(foVar, z);
                    }
                    if (f2368.compareAndSet(this, r2, ihVar)) {
                        return ihVar;
                    }
                } else {
                    m2715(hMVar);
                }
            } else if (r2 instanceof hW) {
                C3493io r3 = ((hW) r2).m2499();
                if (r3 != null) {
                    Throwable th2 = null;
                    hK hKVar = C3492in.f2383;
                    if (z && (r2 instanceof C0189)) {
                        synchronized (r2) {
                            th2 = ((C0189) r2).rootCause;
                            if (th2 == null || ((foVar instanceof C3459hg) && !((C0189) r2).isCompleting)) {
                                if (ihVar == null) {
                                    ihVar = m2710(foVar, z);
                                }
                                if (m2726(r2, r3, ihVar)) {
                                    if (th2 == null) {
                                        hK hKVar2 = ihVar;
                                        return hKVar2;
                                    }
                                    hKVar = ihVar;
                                }
                            }
                            dF dFVar = dF.f2032;
                        }
                    }
                    if (th2 != null) {
                        if (z2) {
                            foVar.m2298(th2);
                        }
                        return hKVar;
                    }
                    if (ihVar == null) {
                        ihVar = m2710(foVar, z);
                    }
                    if (m2726(r2, r3, ihVar)) {
                        return ihVar;
                    }
                } else if (r2 != null) {
                    m2718((C3486ih<?>) (C3486ih) r2);
                } else {
                    throw new dA("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
                }
            } else {
                if (z2) {
                    if (!(r2 instanceof C3463hk)) {
                        r2 = null;
                    }
                    C3463hk hkVar = (C3463hk) r2;
                    if (hkVar != null) {
                        th = hkVar.f2291;
                    }
                    foVar.m2298(th);
                }
                return C3492in.f2383;
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C3486ih<?> m2710(C3413fo<? super Throwable, dF> foVar, boolean z) {
        boolean z2 = true;
        C3481ib ibVar = null;
        if (z) {
            if (foVar instanceof C3481ib) {
                ibVar = foVar;
            }
            C3481ib ibVar2 = ibVar;
            if (ibVar2 == null) {
                return new C3482ic(this, foVar);
            }
            if (ibVar2.f2377 != this) {
                z2 = false;
            }
            if (z2) {
                return ibVar2;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (foVar instanceof C3486ih) {
            ibVar = foVar;
        }
        C3486ih<?> ihVar = ibVar;
        if (ihVar == null) {
            return new C3480ia(this, foVar);
        }
        if (ihVar.f2377 != this || (ihVar instanceof C3481ib)) {
            z2 = false;
        }
        if (z2) {
            return ihVar;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m2715(hM hMVar) {
        C3493io ioVar = new C3493io();
        f2368.compareAndSet(this, hMVar, hMVar.m2474() ? ioVar : new hX(ioVar));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m2718(C3486ih<?> ihVar) {
        ihVar.m2641(new C3493io());
        f2368.compareAndSet(this, ihVar, ihVar.m2646());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m2749(CancellationException cancellationException) {
        m2756((Throwable) cancellationException);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public boolean m2756(Throwable th) {
        return m2755((Object) th) && m2754();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m2750(C3496ir irVar) {
        fM.m2254(irVar, "");
        m2755((Object) irVar);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m2739(Throwable th) {
        fM.m2254(th, "");
        if (th instanceof CancellationException) {
            return true;
        }
        if (!m2755((Object) th) || !m2754()) {
            return false;
        }
        return true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m2755(Object obj) {
        if (!m2751() || !m2711(obj)) {
            return m2730(obj);
        }
        return true;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final hZ m2729() {
        return new hZ("Job was cancelled", (Throwable) null, this);
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public CancellationException m2740() {
        Throwable th;
        Object r0 = m2741();
        CancellationException cancellationException = null;
        if (r0 instanceof C0189) {
            th = ((C0189) r0).rootCause;
        } else if (r0 instanceof C3463hk) {
            th = ((C3463hk) r0).f2291;
        } else if (!(r0 instanceof hW)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + r0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new hZ("Parent job is " + m2727(r0), th, this);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Throwable m2713(Object obj) {
        if (obj != null ? obj instanceof Throwable : true) {
            if (obj == null) {
                obj = m2729();
            }
            return (Throwable) obj;
        } else if (obj != null) {
            return ((C3496ir) obj).m2794();
        } else {
            throw new dA("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r8 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        m2704(((o.C3485ig.C0189) r2).m2767(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        return true;
     */
    /* renamed from: Ӏ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m2730(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
        L_0x0004:
            java.lang.Object r2 = r7.m2741()
            boolean r3 = r2 instanceof o.C3485ig.C0189
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x004d
            monitor-enter(r2)
            r3 = r2
            o.ig$ǃ r3 = (o.C3485ig.C0189) r3     // Catch:{ all -> 0x004a }
            boolean r3 = r3.m2765()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x001a
            monitor-exit(r2)
            return r4
        L_0x001a:
            r3 = r2
            o.ig$ǃ r3 = (o.C3485ig.C0189) r3     // Catch:{ all -> 0x004a }
            boolean r3 = r3.m2769()     // Catch:{ all -> 0x004a }
            if (r8 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0032
        L_0x0025:
            if (r1 == 0) goto L_0x0028
            goto L_0x002c
        L_0x0028:
            java.lang.Throwable r1 = r7.m2713(r8)     // Catch:{ all -> 0x004a }
        L_0x002c:
            r8 = r2
            o.ig$ǃ r8 = (o.C3485ig.C0189) r8     // Catch:{ all -> 0x004a }
            r8.m2768(r1)     // Catch:{ all -> 0x004a }
        L_0x0032:
            r8 = r2
            o.ig$ǃ r8 = (o.C3485ig.C0189) r8     // Catch:{ all -> 0x004a }
            java.lang.Throwable r8 = r8.rootCause     // Catch:{ all -> 0x004a }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r8 = r0
        L_0x003d:
            monitor-exit(r2)
            if (r8 == 0) goto L_0x0049
            o.ig$ǃ r2 = (o.C3485ig.C0189) r2
            o.io r0 = r2.m2767()
            r7.m2704((o.C3493io) r0, (java.lang.Throwable) r8)
        L_0x0049:
            return r5
        L_0x004a:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x004d:
            boolean r3 = r2 instanceof o.hW
            if (r3 == 0) goto L_0x00a8
            if (r1 == 0) goto L_0x0054
            goto L_0x0058
        L_0x0054:
            java.lang.Throwable r1 = r7.m2713(r8)
        L_0x0058:
            r3 = r2
            o.hW r3 = (o.hW) r3
            boolean r6 = r3.m2498()
            if (r6 == 0) goto L_0x0068
            boolean r2 = r7.m2719((o.hW) r3, (java.lang.Throwable) r1)
            if (r2 == 0) goto L_0x0004
            return r5
        L_0x0068:
            o.hk r3 = new o.hk
            r6 = 2
            r3.<init>(r1, r4, r6, r0)
            int r3 = r7.m2709((java.lang.Object) r2, (java.lang.Object) r3, (int) r4)
            if (r3 == 0) goto L_0x008b
            if (r3 == r5) goto L_0x008a
            if (r3 == r6) goto L_0x008a
            r2 = 3
            if (r3 != r2) goto L_0x007c
            goto L_0x0004
        L_0x007c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected result"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L_0x008a:
            return r5
        L_0x008b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Cannot happen in "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00a8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3485ig.m2730(java.lang.Object):boolean");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final C3493io m2723(hW hWVar) {
        C3493io r0 = hWVar.m2499();
        if (r0 != null) {
            return r0;
        }
        if (hWVar instanceof hM) {
            return new C3493io();
        }
        if (hWVar instanceof C3486ih) {
            m2718((C3486ih<?>) (C3486ih) hWVar);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + hWVar).toString());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean m2719(hW hWVar, Throwable th) {
        if (hA.m2423() && !(!(hWVar instanceof C0189))) {
            throw new AssertionError();
        } else if (!hA.m2423() || hWVar.m2498()) {
            C3493io r0 = m2723(hWVar);
            if (r0 == null) {
                return false;
            }
            if (!f2368.compareAndSet(this, hWVar, new C0189(r0, false, th))) {
                return false;
            }
            m2704(r0, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int m2709(Object obj, Object obj2, int i) {
        if (!(obj instanceof hW)) {
            return 0;
        }
        if (((obj instanceof hM) || (obj instanceof C3486ih)) && !(obj instanceof C3459hg) && !(obj2 instanceof C3463hk)) {
            return !m2707((hW) obj, obj2, i) ? 3 : 1;
        }
        return m2721((hW) obj, obj2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0057, code lost:
        if (r3 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0059, code lost:
        m2704(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005c, code lost:
        r8 = m2714(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0060, code lost:
        if (r8 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0066, code lost:
        if (m2708(r2, r8, r9) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0068, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006e, code lost:
        if (m2712(r2, r9, r10) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0070, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0071, code lost:
        return 3;
     */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m2721(o.hW r8, java.lang.Object r9, int r10) {
        /*
            r7 = this;
            o.io r0 = r7.m2723((o.hW) r8)
            r1 = 3
            if (r0 == 0) goto L_0x0083
            boolean r2 = r8 instanceof o.C3485ig.C0189
            r3 = 0
            if (r2 != 0) goto L_0x000e
            r2 = r3
            goto L_0x000f
        L_0x000e:
            r2 = r8
        L_0x000f:
            o.ig$ǃ r2 = (o.C3485ig.C0189) r2
            r4 = 0
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            o.ig$ǃ r2 = new o.ig$ǃ
            r2.<init>(r0, r4, r3)
        L_0x001a:
            r5 = r3
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            monitor-enter(r2)
            boolean r5 = r2.isCompleting     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0024
            monitor-exit(r2)
            return r4
        L_0x0024:
            r4 = 1
            r2.isCompleting = r4     // Catch:{ all -> 0x0080 }
            if (r2 == r8) goto L_0x0033
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f2368     // Catch:{ all -> 0x0080 }
            boolean r5 = r5.compareAndSet(r7, r8, r2)     // Catch:{ all -> 0x0080 }
            if (r5 != 0) goto L_0x0033
            monitor-exit(r2)
            return r1
        L_0x0033:
            boolean r5 = r2.m2765()     // Catch:{ all -> 0x0080 }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x0072
            boolean r5 = r2.m2769()     // Catch:{ all -> 0x0080 }
            boolean r6 = r9 instanceof o.C3463hk     // Catch:{ all -> 0x0080 }
            if (r6 != 0) goto L_0x0044
            r6 = r3
            goto L_0x0045
        L_0x0044:
            r6 = r9
        L_0x0045:
            o.hk r6 = (o.C3463hk) r6     // Catch:{ all -> 0x0080 }
            if (r6 == 0) goto L_0x004e
            java.lang.Throwable r6 = r6.f2291     // Catch:{ all -> 0x0080 }
            r2.m2768(r6)     // Catch:{ all -> 0x0080 }
        L_0x004e:
            java.lang.Throwable r6 = r2.rootCause     // Catch:{ all -> 0x0080 }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x0054
            r3 = r6
        L_0x0054:
            o.dF r5 = o.dF.f2032     // Catch:{ all -> 0x0080 }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x005c
            r7.m2704((o.C3493io) r0, (java.lang.Throwable) r3)
        L_0x005c:
            o.hg r8 = r7.m2714((o.hW) r8)
            if (r8 == 0) goto L_0x006a
            boolean r8 = r7.m2708((o.C3485ig.C0189) r2, (o.C3459hg) r8, (java.lang.Object) r9)
            if (r8 == 0) goto L_0x006a
            r8 = 2
            return r8
        L_0x006a:
            boolean r8 = r7.m2712((o.C3485ig.C0189) r2, (java.lang.Object) r9, (int) r10)
            if (r8 == 0) goto L_0x0071
            return r4
        L_0x0071:
            return r1
        L_0x0072:
            java.lang.String r8 = "Failed requirement."
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0080 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0080 }
            r9.<init>(r8)     // Catch:{ all -> 0x0080 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ all -> 0x0080 }
            throw r9     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x0083:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3485ig.m2721(o.hW, java.lang.Object, int):int");
    }

    @JvmName(name = "Ɩ")
    /* renamed from: Ɩ  reason: contains not printable characters */
    private final Throwable m2705(Object obj) {
        if (!(obj instanceof C3463hk)) {
            obj = null;
        }
        C3463hk hkVar = (C3463hk) obj;
        if (hkVar != null) {
            return hkVar.f2291;
        }
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3459hg m2714(hW hWVar) {
        C3459hg hgVar = (C3459hg) (!(hWVar instanceof C3459hg) ? null : hWVar);
        if (hgVar != null) {
            return hgVar;
        }
        C3493io r3 = hWVar.m2499();
        if (r3 != null) {
            return m2702((iQ) r3);
        }
        return null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final boolean m2708(C0189 r7, C3459hg hgVar, Object obj) {
        while (C3483id.DefaultImpls.m2676$default(hgVar.f2284, false, false, new Cif(this, r7, hgVar, obj), 1, (Object) null) == C3492in.f2383) {
            hgVar = m2702((iQ) hgVar);
            if (hgVar == null) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m2717(C0189 r3, C3459hg hgVar, Object obj) {
        if (m2741() == r3) {
            C3459hg r4 = m2702((iQ) hgVar);
            if ((r4 == null || !m2708(r3, r4, obj)) && m2712(r3, obj, 0)) {
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final C3459hg m2702(iQ iQVar) {
        while (iQVar.m2639()) {
            iQVar = iQVar.m2645();
        }
        while (true) {
            iQVar = iQVar.m2646();
            if (!iQVar.m2639()) {
                if (iQVar instanceof C3459hg) {
                    return (C3459hg) iQVar;
                }
                if (iQVar instanceof C3493io) {
                    return null;
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3456hd m2738(C3461hi hiVar) {
        fM.m2254(hiVar, "");
        hK r8 = C3483id.DefaultImpls.m2676$default(this, true, false, new C3459hg(this, hiVar), 2, (Object) null);
        if (r8 != null) {
            return (C3456hd) r8;
        }
        throw new dA("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m2748(Throwable th) {
        fM.m2254(th, "");
        throw th;
    }

    public String toString() {
        return m2736() + '@' + hB.m2427(this);
    }

    /* renamed from: ł  reason: contains not printable characters */
    public final String m2736() {
        return m2757() + '{' + m2727(m2741()) + '}';
    }

    /* renamed from: І  reason: contains not printable characters */
    public String m2757() {
        return hB.m2428((Object) this);
    }

    /* renamed from: І  reason: contains not printable characters */
    private final String m2727(Object obj) {
        if (obj instanceof C0189) {
            C0189 r3 = (C0189) obj;
            if (r3.m2769()) {
                return "Cancelling";
            }
            if (r3.isCompleting) {
                return "Completing";
            }
            return "Active";
        } else if (!(obj instanceof hW)) {
            return obj instanceof C3463hk ? "Cancelled" : "Completed";
        } else {
            if (((hW) obj).m2498()) {
                return "Active";
            }
            return "New";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\"2\u00020#B!\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b \u0010!J\u0015\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0007\u0010\u0014J\u001f\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0015j\b\u0012\u0004\u0012\u00020\u000f`\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\b\u001a\u00020\u00048G@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u00020\u00048G@\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\u0005\u001a\u00020\f8\u0017@\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\b\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/ig$ǃ;", "", "_exceptionsHolder", "Ljava/lang/Object;", "", "ǃ", "()Z", "Ι", "ɩ", "isCompleting", "Z", "ı", "Lo/io;", "Lo/io;", "()Lo/io;", "", "rootCause", "Ljava/lang/Throwable;", "p0", "", "(Ljava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lo/ǃ;", "ι", "()Ljava/util/ArrayList;", "", "(Ljava/lang/Throwable;)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "p1", "p2", "<init>", "(Lo/io;ZLjava/lang/Throwable;)V", "Lo/SynchronizedObject;", "Lo/hW;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.ig$ǃ  reason: contains not printable characters */
    static final class C0189 implements hW {
        private volatile Object _exceptionsHolder;
        public volatile boolean isCompleting;
        public volatile Throwable rootCause;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C3493io f2376;

        @JvmName(name = "ɩ")
        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3493io m2767() {
            return this.f2376;
        }

        public C0189(C3493io ioVar, boolean z, Throwable th) {
            fM.m2254(ioVar, "");
            this.f2376 = ioVar;
            this.isCompleting = z;
            this.rootCause = th;
        }

        @JvmName(name = "ı")
        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m2765() {
            return this._exceptionsHolder == C3490il.f2382;
        }

        @JvmName(name = "Ι")
        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m2769() {
            return this.rootCause != null;
        }

        @JvmName(name = "ǃ")
        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m2766() {
            return this.rootCause == null;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final List<Throwable> m2764(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = m2763();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> r1 = m2763();
                r1.add(obj);
                arrayList = r1;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable th2 = this.rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && (!fM.m2257(th, th2))) {
                arrayList.add(th);
            }
            this._exceptionsHolder = C3490il.f2382;
            return arrayList;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m2768(Throwable th) {
            fM.m2254(th, "");
            Throwable th2 = this.rootCause;
            if (th2 == null) {
                this.rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList<Throwable> r1 = m2763();
                        r1.add(obj);
                        r1.add(th);
                        this._exceptionsHolder = r1;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        private final ArrayList<Throwable> m2763() {
            return new ArrayList<>(4);
        }

        public final String toString() {
            return "Finishing[cancelling=" + m2769() + ", completing=" + this.isCompleting + ", rootCause=" + this.rootCause + ", exceptions=" + this._exceptionsHolder + ", list=" + m2767() + ']';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u001c0\u001bB)\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0006\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r"}, d2 = {"Lo/ig$if;", "Lo/hg;", "І", "Lo/hg;", "ı", "Lo/ig;", "ǃ", "Lo/ig;", "", "і", "Ljava/lang/Object;", "ι", "Lo/ig$ǃ;", "Lo/ig$ǃ;", "ɩ", "", "p0", "", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "p1", "p2", "p3", "<init>", "(Lo/ig;Lo/ig$ǃ;Lo/hg;Ljava/lang/Object;)V", "Lo/ih;", "Lo/id;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.ig$if  reason: invalid class name */
    static final class Cif extends C3486ih<C3483id> {

        /* renamed from: ı  reason: contains not printable characters */
        private final C0189 f2372;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C3485ig f2373;

        /* renamed from: І  reason: contains not printable characters */
        private final C3459hg f2374;

        /* renamed from: і  reason: contains not printable characters */
        private final Object f2375;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ Object m2762(Object obj) {
            m2761((Throwable) obj);
            return dF.f2032;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Cif(C3485ig igVar, C0189 r3, C3459hg hgVar, Object obj) {
            super(hgVar.f2284);
            fM.m2254(igVar, "");
            fM.m2254(r3, "");
            fM.m2254(hgVar, "");
            this.f2373 = igVar;
            this.f2372 = r3;
            this.f2374 = hgVar;
            this.f2375 = obj;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m2761(Throwable th) {
            this.f2373.m2717(this.f2372, this.f2374, this.f2375);
        }

        public final String toString() {
            return "ChildCompletion[" + this.f2374 + ", " + this.f2375 + ']';
        }
    }

    @JvmName(name = "ɨ")
    /* renamed from: ɨ  reason: contains not printable characters */
    public final Object m2741() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof iV)) {
                return obj;
            }
            ((iV) obj).m2661(this);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m2725(C3493io ioVar, Throwable th) {
        Throwable th2 = null;
        Object r1 = ioVar.m2644();
        if (r1 != null) {
            for (iQ iQVar = (iQ) r1; !fM.m2257(iQVar, ioVar); iQVar = iQVar.m2646()) {
                if (iQVar instanceof C3486ih) {
                    C3486ih ihVar = (C3486ih) iQVar;
                    try {
                        ihVar.m2538(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            C3354df.m2096(th2, th3);
                        } else {
                            dF dFVar = dF.f2032;
                            th2 = new C3468hp("Exception in completion handler " + ihVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (th2 != null) {
                m2748(th2);
                return;
            }
            return;
        }
        throw new dA("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final boolean m2758() {
        int r0;
        do {
            r0 = m2706(m2741());
            if (r0 == 0) {
                return false;
            }
        } while (r0 != 1);
        return true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final boolean m2726(Object obj, C3493io ioVar, C3486ih<?> ihVar) {
        int r3;
        iQ iQVar = ihVar;
        iQ.C0187 r0 = new If(iQVar, iQVar, this, obj);
        do {
            Object r32 = ioVar.m2640();
            if (r32 != null) {
                r3 = ((iQ) r32).m2643(iQVar, ioVar, r0);
                if (r3 == 1) {
                    return true;
                }
            } else {
                throw new dA("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (r3 != 2);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d A[ADDED_TO_REGION] */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m2734(o.C3486ih<?> r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.fM.m2254(r4, r0)
        L_0x0005:
            java.lang.Object r0 = r3.m2741()
            boolean r1 = r0 instanceof o.C3486ih
            if (r1 == 0) goto L_0x001d
            if (r0 == r4) goto L_0x0010
            return
        L_0x0010:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f2368
            o.hM r2 = o.C3490il.f2380
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L_0x0005
            return
        L_0x001d:
            boolean r1 = r0 instanceof o.hW
            if (r1 == 0) goto L_0x002c
            o.hW r0 = (o.hW) r0
            o.io r0 = r0.m2499()
            if (r0 == 0) goto L_0x002c
            r4.P_()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3485ig.m2734(o.ih):void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean m2711(Object obj) {
        int r0;
        do {
            Object r02 = m2741();
            if (!(r02 instanceof hW) || (((r02 instanceof C0189) && ((C0189) r02).isCompleting) || (r0 = m2709(r02, (Object) new C3463hk(m2713(obj), false, 2, (fL) null), 0)) == 0)) {
                return false;
            }
            if (r0 == 1 || r0 == 2) {
                return true;
            }
        } while (r0 == 3);
        throw new IllegalStateException("unexpected result".toString());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m2752(Object obj, int i) {
        int r0;
        do {
            r0 = m2709(m2741(), obj, i);
            if (r0 == 0) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, " + "but is being completed with " + obj, m2705(obj));
            } else if (r0 == 1) {
                return true;
            } else {
                if (r0 == 2) {
                    return false;
                }
            }
        } while (r0 == 3);
        throw new IllegalStateException("unexpected result".toString());
    }
}
