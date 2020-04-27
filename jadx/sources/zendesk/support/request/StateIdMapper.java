package zendesk.support.request;

import android.annotation.SuppressLint;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o.O;

class StateIdMapper implements Serializable {
    private final Map<Long, Long> localToRemote;
    private final Map<Long, Long> remoteToLocal;

    private StateIdMapper(Map<Long, Long> map, Map<Long, Long> map2) {
        this.remoteToLocal = map;
        this.localToRemote = map2;
    }

    @SuppressLint({"UseSparseArrays"})
    StateIdMapper() {
        this.localToRemote = new HashMap();
        this.remoteToLocal = new HashMap();
    }

    /* access modifiers changed from: package-private */
    public boolean hasRemoteId(Long l) {
        return this.localToRemote.containsKey(l) && this.remoteToLocal.containsValue(l);
    }

    /* access modifiers changed from: package-private */
    public boolean hasLocalId(Long l) {
        return this.remoteToLocal.containsKey(l) && this.localToRemote.containsValue(l);
    }

    /* access modifiers changed from: package-private */
    public Long getLocalId(Long l) {
        return this.remoteToLocal.get(l);
    }

    /* access modifiers changed from: package-private */
    public Long getRemoteId(Long l) {
        return this.localToRemote.get(l);
    }

    /* access modifiers changed from: package-private */
    public StateIdMapper addIdMapping(Long l, Long l2) {
        this.remoteToLocal.put(l, l2);
        this.localToRemote.put(l2, l);
        return copy();
    }

    /* access modifiers changed from: package-private */
    public StateIdMapper copy() {
        return new StateIdMapper(O.m1396(this.remoteToLocal), O.m1396(this.localToRemote));
    }

    /* access modifiers changed from: package-private */
    public Set<Long> getRemoteIds() {
        return this.remoteToLocal.keySet();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdMapper{ remoteToLocal=");
        sb.append(this.remoteToLocal);
        sb.append(" localToRemote=");
        sb.append(this.localToRemote);
        sb.append('}');
        return sb.toString();
    }
}
