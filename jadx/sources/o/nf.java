package o;

import java.util.Collection;
import java.util.Iterator;

public final class nf implements nn {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Collection<nn> f3394;

    public nf(Collection<nn> collection) {
        if (collection == null || collection.size() == 0) {
            this.f3394 = null;
        } else {
            this.f3394 = collection;
        }
    }

    public final void onAction(nc<?> ncVar, no noVar, nk nkVar, nh nhVar) {
        Collection<nn> collection = this.f3394;
        if (collection != null) {
            m3986(ncVar, noVar, nkVar, nhVar, collection.iterator());
            return;
        }
        nhVar.m3989(ncVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m3986(nc<?> ncVar, no noVar, nk nkVar, nh nhVar, Iterator<nn> it) {
        if (it.hasNext()) {
            final no noVar2 = noVar;
            final nk nkVar2 = nkVar;
            final nh nhVar2 = nhVar;
            final Iterator<nn> it2 = it;
            it.next().onAction(ncVar, noVar, nkVar, new nh() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m3987(nc<?> ncVar) {
                    nf.this.m3986(ncVar, noVar2, nkVar2, nhVar2, it2);
                }
            });
            return;
        }
        nhVar.m3989(ncVar);
    }
}
