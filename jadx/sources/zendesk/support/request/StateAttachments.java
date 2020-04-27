package zendesk.support.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import o.O;
import o.nt;

class StateAttachments implements Serializable {
    private final Set<StateRequestAttachment> allSelectedAttachments;
    private final List<StateRequestAttachment> selectedAttachments;

    static StateAttachments fromState(nt ntVar) {
        Object obj = ntVar.f3432.get(StateAttachments.class.getSimpleName());
        if (obj instanceof StateAttachments) {
            return (StateAttachments) obj;
        }
        return new StateAttachments();
    }

    StateAttachments(List<StateRequestAttachment> list, Set<StateRequestAttachment> set) {
        this.selectedAttachments = list;
        this.allSelectedAttachments = set;
    }

    StateAttachments() {
        this.selectedAttachments = new ArrayList();
        this.allSelectedAttachments = new TreeSet(new UriComparator());
    }

    /* access modifiers changed from: package-private */
    public List<StateRequestAttachment> getSelectedAttachments() {
        return this.selectedAttachments;
    }

    /* access modifiers changed from: package-private */
    public Set<StateRequestAttachment> getAllSelectedAttachments() {
        return this.allSelectedAttachments;
    }

    /* access modifiers changed from: package-private */
    public Builder newBuilder() {
        return new Builder();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Attachments{selectedAttachments=");
        sb.append(this.selectedAttachments);
        sb.append(", allSelectedAttachments=");
        sb.append(this.allSelectedAttachments);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {
        private Set<StateRequestAttachment> attachmentNotSelectedButVisible;
        private List<StateRequestAttachment> selectedAttachments;

        private Builder(StateAttachments stateAttachments) {
            this.selectedAttachments = O.m1393(stateAttachments.getSelectedAttachments());
            this.attachmentNotSelectedButVisible = new TreeSet(new UriComparator());
            this.attachmentNotSelectedButVisible.addAll(stateAttachments.getAllSelectedAttachments());
        }

        /* access modifiers changed from: package-private */
        public Builder setSelectedAttachments(List<StateRequestAttachment> list) {
            this.selectedAttachments = O.m1393(list);
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder addAllSelectedAttachments(List<StateRequestAttachment> list) {
            Collections.reverse(list);
            this.attachmentNotSelectedButVisible.addAll(list);
            return this;
        }

        /* access modifiers changed from: package-private */
        public StateAttachments build() {
            return new StateAttachments(this.selectedAttachments, this.attachmentNotSelectedButVisible);
        }
    }

    static class UriComparator implements Comparator<StateRequestAttachment>, Serializable {
        UriComparator() {
        }

        public int compare(StateRequestAttachment stateRequestAttachment, StateRequestAttachment stateRequestAttachment2) {
            return stateRequestAttachment.getLocalUri().compareTo(stateRequestAttachment2.getLocalUri());
        }
    }
}
