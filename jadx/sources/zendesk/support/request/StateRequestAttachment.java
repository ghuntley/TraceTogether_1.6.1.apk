package zendesk.support.request;

import android.net.Uri;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C2311;
import o.O;
import o.P;
import o.mF;
import zendesk.support.Attachment;
import zendesk.support.CommentResponse;
import zendesk.support.IdUtil;

class StateRequestAttachment implements Serializable, Comparable<StateRequestAttachment> {
    private final int height;
    private final long id;
    private final transient File localFile;
    private final String localUri;
    private final String mimeType;
    private final String name;
    private final long size;
    private final String thumbnailUrl;
    private final String token;
    private final String url;
    private final int width;

    public static C2311<Map<Long, StateRequestAttachment>, StateIdMapper> convert(List<CommentResponse> list, Map<Long, mF> map, StateIdMapper stateIdMapper) {
        ArrayList arrayList = new ArrayList();
        for (CommentResponse attachments : list) {
            arrayList.addAll(attachments.getAttachments());
        }
        return convert((List<Attachment>) arrayList, stateIdMapper, map);
    }

    static C2311<Map<Long, StateRequestAttachment>, StateIdMapper> convert(List<Attachment> list, StateIdMapper stateIdMapper, Map<Long, mF> map) {
        long j;
        File file;
        String str;
        StateIdMapper stateIdMapper2 = stateIdMapper;
        Map<Long, mF> map2 = map;
        HashMap hashMap = new HashMap(list.size());
        for (Attachment next : list) {
            if (next.getId() != null) {
                if (stateIdMapper2.hasLocalId(next.getId())) {
                    j = stateIdMapper2.getLocalId(next.getId()).longValue();
                } else {
                    j = IdUtil.newLongId();
                    stateIdMapper2.addIdMapping(next.getId(), Long.valueOf(j));
                }
                long j2 = j;
                if (map2.containsKey(next.getId())) {
                    mF mFVar = map2.get(next.getId());
                    File file2 = mFVar.f3087;
                    str = mFVar.f3090.toString();
                    file = file2;
                } else {
                    str = null;
                    file = null;
                }
                long j3 = -1;
                long longValue = next.getSize() != null ? next.getSize().longValue() : -1;
                long longValue2 = next.getWidth() != null ? next.getWidth().longValue() : -1;
                if (next.getHeight() != null) {
                    j3 = next.getHeight().longValue();
                }
                hashMap.put(next.getId(), new StateRequestAttachment(j2, str, file, next.getContentUrl(), "", next.getContentType(), next.getFileName(), longValue, (int) longValue2, (int) j3, O.m1394(next.getThumbnails()) ? next.getThumbnails().get(0).getContentUrl() : ""));
            }
        }
        return C2311.m12057(hashMap, stateIdMapper2);
    }

    static StateRequestAttachment convert(mF mFVar) {
        return new StateRequestAttachment(IdUtil.newLongId(), mFVar.f3090.toString(), mFVar.f3087, "", "", mFVar.f3089, mFVar.f3093, mFVar.f3091, (int) mFVar.f3088, (int) mFVar.f3094, "");
    }

    static mF convert(StateRequestAttachment stateRequestAttachment) {
        return new mF(stateRequestAttachment.getLocalFile(), stateRequestAttachment.getParsedLocalUri(), stateRequestAttachment.getParsedLocalUri(), stateRequestAttachment.getName(), stateRequestAttachment.getMimeType(), stateRequestAttachment.getSize(), (long) stateRequestAttachment.getWidth(), (long) stateRequestAttachment.getHeight());
    }

    StateRequestAttachment(long j, String str, File file, String str2, String str3, String str4, String str5, long j2, int i, int i2, String str6) {
        this.id = j;
        this.localUri = str;
        this.localFile = file;
        this.url = str2;
        this.token = str3;
        this.mimeType = str4;
        this.name = str5;
        this.size = j2;
        this.width = i;
        this.height = i2;
        this.thumbnailUrl = str6;
    }

    private StateRequestAttachment(Builder builder) {
        this.localFile = builder.localFile;
        this.localUri = builder.localUri;
        this.mimeType = builder.mimeType;
        this.name = builder.name;
        this.id = builder.id;
        this.url = builder.url;
        this.token = builder.token;
        this.size = builder.size;
        this.width = builder.width;
        this.height = builder.height;
        this.thumbnailUrl = builder.thumbnailUrl;
    }

    /* access modifiers changed from: package-private */
    public boolean isAvailableLocally() {
        return (this.localUri == null || getParsedLocalUri() == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public String getUrl() {
        return this.url;
    }

    /* access modifiers changed from: package-private */
    public String getMimeType() {
        return P.m1406(this.mimeType) ? this.mimeType : "application/octet-stream";
    }

    /* access modifiers changed from: package-private */
    public String getName() {
        return this.name;
    }

    /* access modifiers changed from: package-private */
    public long getId() {
        return this.id;
    }

    /* access modifiers changed from: package-private */
    public String getLocalUri() {
        return this.localUri;
    }

    /* access modifiers changed from: package-private */
    public Uri getParsedLocalUri() {
        return Uri.parse(this.localUri);
    }

    /* access modifiers changed from: package-private */
    public File getLocalFile() {
        return this.localFile;
    }

    /* access modifiers changed from: package-private */
    public String getToken() {
        return this.token;
    }

    /* access modifiers changed from: package-private */
    public long getSize() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public int getWidth() {
        return this.width;
    }

    /* access modifiers changed from: package-private */
    public int getHeight() {
        return this.height;
    }

    /* access modifiers changed from: package-private */
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* access modifiers changed from: package-private */
    public Builder newBuilder() {
        return new Builder();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RequestAttachment{id=");
        sb.append(this.id);
        sb.append(", localUri='");
        sb.append(this.localUri);
        sb.append('\'');
        sb.append(", localFile=");
        sb.append(this.localFile);
        sb.append(", url='");
        sb.append(this.url);
        sb.append('\'');
        sb.append(", token='");
        sb.append(this.token);
        sb.append('\'');
        sb.append(", mimeType='");
        sb.append(this.mimeType);
        sb.append('\'');
        sb.append(", name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", size='");
        sb.append(this.size);
        sb.append('\'');
        sb.append(", width='");
        sb.append(this.width);
        sb.append('\'');
        sb.append(", height='");
        sb.append(this.height);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int compareTo(StateRequestAttachment stateRequestAttachment) {
        return (int) (this.id - stateRequestAttachment.id);
    }

    static class Builder {
        /* access modifiers changed from: private */
        public int height;
        /* access modifiers changed from: private */
        public long id;
        /* access modifiers changed from: private */
        public File localFile;
        /* access modifiers changed from: private */
        public String localUri;
        /* access modifiers changed from: private */
        public String mimeType;
        /* access modifiers changed from: private */
        public String name;
        /* access modifiers changed from: private */
        public long size;
        /* access modifiers changed from: private */
        public String thumbnailUrl;
        /* access modifiers changed from: private */
        public String token;
        /* access modifiers changed from: private */
        public String url;
        /* access modifiers changed from: private */
        public int width;

        private Builder(StateRequestAttachment stateRequestAttachment) {
            this.id = stateRequestAttachment.getId();
            this.localFile = stateRequestAttachment.getLocalFile();
            this.localUri = stateRequestAttachment.getLocalUri();
            this.url = stateRequestAttachment.getUrl();
            this.token = stateRequestAttachment.getToken();
            this.mimeType = stateRequestAttachment.getMimeType();
            this.name = stateRequestAttachment.getName();
            this.size = stateRequestAttachment.getSize();
            this.width = stateRequestAttachment.getWidth();
            this.height = stateRequestAttachment.getHeight();
            this.thumbnailUrl = stateRequestAttachment.getThumbnailUrl();
        }

        /* access modifiers changed from: package-private */
        public Builder setLocalUri(String str) {
            this.localUri = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setLocalFile(File file) {
            this.localFile = file;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setUrl(String str) {
            this.url = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setToken(String str) {
            this.token = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setMimeType(String str) {
            this.mimeType = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setName(String str) {
            this.name = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public StateRequestAttachment build() {
            return new StateRequestAttachment(this);
        }
    }
}
