package o;

import android.os.Bundle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.concurrent.Callable;
import o.C0593;

/* renamed from: o.ƙ  reason: contains not printable characters */
public abstract class C0712<D extends C0593> {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: o.ƙ$if  reason: invalid class name */
    public @interface Cif {
        /* renamed from: ı  reason: contains not printable characters */
        String m5830();
    }

    /* renamed from: o.ƙ$ɩ  reason: contains not printable characters */
    public interface C0713 extends C3132, C0287, C1511, C3040, Callable, cC, Iterator {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public abstract D m5825();

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract C0593 m5826(D d, Bundle bundle, C0665 r3, C0713 r4);

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m5827(Bundle bundle) {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public Bundle m5828() {
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract boolean m5829();
}
