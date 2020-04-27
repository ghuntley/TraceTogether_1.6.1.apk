package o;

import android.content.Context;
import java.io.File;
import java.util.Collection;
import java.util.concurrent.ExecutorService;

/* renamed from: o.ai  reason: case insensitive filesystem */
public abstract class C3269ai<Result> implements Comparable<C3269ai> {

    /* renamed from: ȷ  reason: contains not printable characters */
    final aK f1511 = ((aK) getClass().getAnnotation(aK.class));

    /* renamed from: ɨ  reason: contains not printable characters */
    public aD f1512;

    /* renamed from: ɪ  reason: contains not printable characters */
    Context f1513;

    /* renamed from: ɾ  reason: contains not printable characters */
    C3267ag<Result> f1514;

    /* renamed from: і  reason: contains not printable characters */
    C3263ac f1515;

    /* renamed from: Ӏ  reason: contains not printable characters */
    C3268ah<Result> f1516 = new C3268ah<>(this);

    /* access modifiers changed from: protected */
    public boolean e_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public abstract Result m1587();

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract String m1591();

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m1594(Result result) {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract String m1597();

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public void m1598(Result result) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m1592(Context context, C3263ac acVar, C3267ag<Result> agVar, aD aDVar) {
        this.f1515 = acVar;
        this.f1513 = new C3261aa(context, m1591(), m1593());
        this.f1514 = agVar;
        this.f1512 = aDVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: г  reason: contains not printable characters */
    public final void m1600() {
        C3268ah<Result> ahVar = this.f1516;
        ExecutorService executorService = this.f1515.f1491;
        new Void[1][0] = null;
        ahVar.m1512(executorService);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɿ  reason: contains not printable characters */
    public aD m1595() {
        return this.f1512;
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    public Context m1589() {
        return this.f1513;
    }

    /* renamed from: Ɨ  reason: contains not printable characters */
    public C3263ac m1588() {
        return this.f1515;
    }

    /* renamed from: ɍ  reason: contains not printable characters */
    public String m1593() {
        StringBuilder sb = new StringBuilder(".Fabric");
        sb.append(File.separator);
        sb.append(m1591());
        return sb.toString();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public int compareTo(C3269ai aiVar) {
        if (m1599(aiVar)) {
            return 1;
        }
        if (aiVar.m1599(this)) {
            return -1;
        }
        if (m1586() && !aiVar.m1586()) {
            return 1;
        }
        if (m1586() || !aiVar.m1586()) {
            return 0;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public boolean m1599(C3269ai aiVar) {
        if (m1586()) {
            for (Class isAssignableFrom : this.f1511.m1501()) {
                if (isAssignableFrom.isAssignableFrom(aiVar.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ſ  reason: contains not printable characters */
    public boolean m1586() {
        return this.f1511 != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ʅ  reason: contains not printable characters */
    public Collection<aW> m1596() {
        return this.f1516.m1514();
    }
}
