package zendesk.support.request;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C;
import o.C3602mo;
import o.C3607mt;
import o.D;
import o.F;
import o.G;
import o.O;
import o.P;
import o.mF;
import o.mI;
import zendesk.support.Attachment;
import zendesk.support.UploadProvider;
import zendesk.support.UploadResponse;

class AttachmentUploadService {
    private final C3602mo belvedere;
    private final List<StateRequestAttachment> errorItems;
    private final List<StateRequestAttachment> itemsForUpload;
    /* access modifiers changed from: private */
    public final Map<Long, Long> localToRemoteMap;
    private final Object lock = new Object();
    private final List<StateRequestAttachment> processedItems;
    private List<ResolveCallback> resolveCallbacks;
    private G<AttachmentUploadResult> resultListener;
    private String subDirectory;
    /* access modifiers changed from: private */
    public final UploadProvider uploadProvider;

    @SuppressLint({"UseSparseArrays"})
    AttachmentUploadService(UploadProvider uploadProvider2, C3602mo moVar, List<StateRequestAttachment> list) {
        this.uploadProvider = uploadProvider2;
        this.belvedere = moVar;
        this.itemsForUpload = list;
        this.resolveCallbacks = new ArrayList(list.size());
        this.subDirectory = UtilsAttachment.getTemporaryRequestCacheDir();
        this.processedItems = new ArrayList(list.size());
        this.errorItems = new ArrayList(list.size());
        this.localToRemoteMap = new HashMap();
    }

    /* access modifiers changed from: package-private */
    public void start(String str) {
        if (P.m1406(str)) {
            this.subDirectory = UtilsAttachment.getCacheDirForRequestId(str);
        }
        F.m1359();
        for (StateRequestAttachment uploadAttachment : this.itemsForUpload) {
            uploadAttachment(uploadAttachment);
        }
    }

    /* access modifiers changed from: package-private */
    public void setResultListener(G<AttachmentUploadResult> g) {
        this.resultListener = g;
        notifyIfFinished();
    }

    private void uploadAttachment(StateRequestAttachment stateRequestAttachment) {
        Uri parsedLocalUri = stateRequestAttachment.getParsedLocalUri();
        if (parsedLocalUri == null || isUploadFinished()) {
            new Object[1][0] = stateRequestAttachment.getLocalUri();
            F.m1361();
            errorUpload(stateRequestAttachment);
            return;
        }
        ResolveCallback resolveCallback = new ResolveCallback(stateRequestAttachment);
        this.resolveCallbacks.add(resolveCallback);
        C3602mo moVar = this.belvedere;
        List singletonList = Collections.singletonList(parsedLocalUri);
        String str = this.subDirectory;
        if (singletonList == null || singletonList.size() <= 0) {
            resolveCallback.internalSuccess(new ArrayList(0));
            return;
        }
        new mI(moVar.f3291, resolveCallback, str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Uri[]) singletonList.toArray(new Uri[singletonList.size()]));
    }

    /* access modifiers changed from: private */
    public boolean isUploadFinished() {
        boolean z;
        synchronized (this.lock) {
            boolean r1 = O.m1394(this.errorItems);
            z = true;
            boolean z2 = this.processedItems.size() == this.itemsForUpload.size();
            if (!r1) {
                if (!z2) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    public StateRequestAttachment updateRequestAttachment(StateRequestAttachment stateRequestAttachment, mF mFVar) {
        return stateRequestAttachment.newBuilder().setLocalFile(mFVar.f3087).setName(mFVar.f3093).setMimeType(mFVar.f3089).setLocalUri(mFVar.f3090.toString()).build();
    }

    /* access modifiers changed from: private */
    public void uploadSuccess(StateRequestAttachment stateRequestAttachment, UploadResponse uploadResponse) {
        String str;
        File file;
        Attachment attachment = uploadResponse.getAttachment();
        mF renameFile = renameFile(stateRequestAttachment.getLocalFile(), attachment.getId().longValue());
        if (renameFile != null) {
            str = renameFile.f3090.toString();
            file = renameFile.f3087;
        } else {
            str = stateRequestAttachment.getLocalUri();
            file = stateRequestAttachment.getLocalFile();
        }
        StateRequestAttachment build = stateRequestAttachment.newBuilder().setLocalUri(str).setLocalFile(file).setToken(uploadResponse.getToken()).setUrl(attachment.getContentUrl()).setMimeType(attachment.getContentType()).setName(attachment.getFileName()).build();
        synchronized (this.lock) {
            this.processedItems.add(build);
        }
        notifyIfFinished();
    }

    /* access modifiers changed from: private */
    public void errorUpload(StateRequestAttachment stateRequestAttachment) {
        synchronized (this.lock) {
            this.errorItems.add(stateRequestAttachment);
        }
        notifyIfFinished();
    }

    private void notifyIfFinished() {
        Object[] objArr = {this.resultListener, Boolean.valueOf(isUploadFinished())};
        F.m1359();
        if (isUploadFinished() && this.resultListener != null) {
            if (O.m1399(this.errorItems)) {
                this.resultListener.onSuccess(new AttachmentUploadResult(O.m1393(this.processedItems), this.localToRemoteMap));
            } else {
                this.resultListener.onError(new D("Error uploading attachments."));
            }
            this.resultListener = null;
        }
    }

    private mF renameFile(File file, long j) {
        mF r4 = this.belvedere.m3912(UtilsAttachment.getAttachmentSubDir(this.subDirectory, j), file.getName());
        Object[] objArr = {file.getAbsolutePath(), r4.f3087.getAbsolutePath()};
        F.m1359();
        if (file.renameTo(r4.f3087)) {
            return r4;
        }
        return null;
    }

    class ResolveCallback extends C3607mt<List<mF>> {
        private final StateRequestAttachment requestAttachment;

        private ResolveCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        public void success(List<mF> list) {
            Uri parsedLocalUri = this.requestAttachment.getParsedLocalUri();
            if (list.size() <= 0 || AttachmentUploadService.this.isUploadFinished()) {
                new Object[1][0] = parsedLocalUri;
                F.m1361();
                AttachmentUploadService.this.errorUpload(this.requestAttachment);
                return;
            }
            new Object[1][0] = parsedLocalUri;
            F.m1361();
            StateRequestAttachment access$200 = AttachmentUploadService.this.updateRequestAttachment(this.requestAttachment, list.get(0));
            AttachmentUploadService.this.uploadProvider.uploadAttachment(access$200.getName(), access$200.getLocalFile(), access$200.getMimeType(), new AttachmentsCallback(access$200));
        }
    }

    class AttachmentsCallback extends G<UploadResponse> {
        private final StateRequestAttachment requestAttachment;

        AttachmentsCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        public void onSuccess(UploadResponse uploadResponse) {
            Object[] objArr = {this.requestAttachment, uploadResponse};
            F.m1359();
            AttachmentUploadService.this.localToRemoteMap.put(Long.valueOf(this.requestAttachment.getId()), uploadResponse.getAttachment().getId());
            AttachmentUploadService.this.uploadSuccess(this.requestAttachment, uploadResponse);
        }

        public void onError(C c) {
            Object[] objArr = {this.requestAttachment, c.m1280()};
            F.m1361();
            AttachmentUploadService.this.errorUpload(this.requestAttachment);
        }
    }

    static class AttachmentUploadResult {
        private final Map<Long, Long> localToRemoteIdMap;
        private final List<StateRequestAttachment> requestAttachments;

        AttachmentUploadResult(List<StateRequestAttachment> list, Map<Long, Long> map) {
            this.requestAttachments = list;
            this.localToRemoteIdMap = map;
        }

        /* access modifiers changed from: package-private */
        public List<StateRequestAttachment> getRequestAttachments() {
            return this.requestAttachments;
        }

        /* access modifiers changed from: package-private */
        public Map<Long, Long> getLocalToRemoteIdMap() {
            return this.localToRemoteIdMap;
        }
    }
}
