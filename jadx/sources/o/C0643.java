package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.C0593;
import o.C0778;

/* renamed from: o.ƖƖ  reason: contains not printable characters */
public final class C0643 extends C0593 implements Iterable<C0593> {

    /* renamed from: ɩ  reason: contains not printable characters */
    int f4640;

    /* renamed from: ɹ  reason: contains not printable characters */
    String f4641;

    /* renamed from: ι  reason: contains not printable characters */
    final C1286<C0593> f4642 = new C1286<>();

    public C0643(C0712<? extends C0643> r1) {
        super((C0712<? extends C0593>) r1);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5421(Context context, AttributeSet attributeSet) {
        super.m5242(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0778.Cif.f5190);
        this.f4640 = obtainAttributes.getResourceId(C0778.Cif.f5189, 0);
        this.f4641 = null;
        this.f4641 = m5240(context, this.f4640);
        obtainAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final C0593.Cif m5422(Uri uri) {
        C0593.Cif r0 = super.m5245(uri);
        Iterator<C0593> it = iterator();
        while (it.hasNext()) {
            C0593.Cif r2 = it.next().m5245(uri);
            if (r2 != null && (r0 == null || r2.compareTo(r0) > 0)) {
                r0 = r2;
            }
        }
        return r0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final C0593 m5423(int i, boolean z) {
        boolean z2 = z;
        C0643 r4 = this;
        while (true) {
            C0593 r1 = r4.f4642.m8216(i);
            if (r1 != null) {
                return r1;
            }
            if (!z2 || r4.f4520 == null) {
                return null;
            }
            r4 = r4.f4520;
            z2 = true;
        }
    }

    public final Iterator<C0593> iterator() {
        return new Iterator<C0593>() {

            /* renamed from: ı  reason: contains not printable characters */
            private int f4643 = -1;

            /* renamed from: ɩ  reason: contains not printable characters */
            private boolean f4644 = false;

            public final boolean hasNext() {
                return this.f4643 + 1 < C0643.this.f4642.m8210();
            }

            public final void remove() {
                if (this.f4644) {
                    C0643.this.f4642.m8218(this.f4643).f4520 = null;
                    C0643.this.f4642.m8213(this.f4643);
                    this.f4643--;
                    this.f4644 = false;
                    return;
                }
                throw new IllegalStateException("You must call next() before you can remove an element");
            }

            public final /* synthetic */ Object next() {
                if (hasNext()) {
                    this.f4644 = true;
                    C1286<C0593> r1 = C0643.this.f4642;
                    int i = this.f4643 + 1;
                    this.f4643 = i;
                    return r1.m8218(i);
                }
                throw new NoSuchElementException();
            }
        };
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        C0593 r1 = m5423(this.f4640, true);
        if (r1 == null) {
            String str = this.f4641;
            if (str == null) {
                sb.append("0x");
                sb.append(Integer.toHexString(this.f4640));
            } else {
                sb.append(str);
            }
        } else {
            sb.append("{");
            sb.append(r1.toString());
            sb.append("}");
        }
        return sb.toString();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5425(C0593 r3) {
        if (r3.f4522 != 0) {
            C0593 r0 = this.f4642.m8216(r3.f4522);
            if (r0 != r3) {
                if (r3.f4520 == null) {
                    if (r0 != null) {
                        r0.f4520 = null;
                    }
                    r3.f4520 = this;
                    this.f4642.m8219(r3.f4522, r3);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
            return;
        }
        throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final String m5424() {
        return this.f4522 != 0 ? super.m5246() : "the root navigation";
    }
}
