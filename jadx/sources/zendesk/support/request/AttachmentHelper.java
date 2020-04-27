package zendesk.support.request;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.C1459;
import o.C3602mo;
import o.C3604mq;
import o.O;
import o.R;
import o.mE;
import o.mF;
import o.mL;

class AttachmentHelper {
    private List<StateRequestAttachment> additionalAttachments;
    private long maxFileSize = -1;
    private List<StateRequestAttachment> selectedAttachments;
    private final int[] touchableItems;

    AttachmentHelper(int... iArr) {
        this.touchableItems = iArr;
        this.selectedAttachments = new ArrayList();
        this.additionalAttachments = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    public void updateAttachments(Collection<StateRequestAttachment> collection, Collection<StateRequestAttachment> collection2) {
        this.selectedAttachments = O.m1393(new ArrayList(collection));
        this.additionalAttachments = O.m1393(new ArrayList(collection2));
    }

    /* access modifiers changed from: package-private */
    public void updateMaxFileSize(long j) {
        this.maxFileSize = j;
    }

    /* access modifiers changed from: package-private */
    public List<StateRequestAttachment> getSelectedAttachments() {
        return O.m1393(this.selectedAttachments);
    }

    private List<mF> requestAttachmentsToMediaResult(List<StateRequestAttachment> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (StateRequestAttachment convert : list) {
            arrayList.add(StateRequestAttachment.convert(convert));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void showImagePicker(C1459 r13) {
        mE mEVar;
        boolean z = false;
        C3604mq.If r0 = new C3604mq.If(r13, (byte) 0).m3918();
        C3602mo r2 = C3602mo.m3911(r0.f3297);
        mE.C0234 r4 = new mE.C0234(r2.f3290.m3738(), r2.f3289);
        r4.f3085 = true;
        r4.f3084 = "*/*";
        mL mLVar = r4.f3083;
        int i = r4.f3086;
        String str = r4.f3084;
        boolean z2 = r4.f3085;
        if (mL.m3751("*/*", false).resolveActivity(mLVar.f3111.getPackageManager()) != null) {
            z = true;
        }
        if (z) {
            mEVar = new mE(i, mL.m3751(str, z2), (String) null, true, 1);
        } else {
            mEVar = mE.m3739();
        }
        r0.f3302.add(mEVar);
        r0.f3300 = new ArrayList(requestAttachmentsToMediaResult(this.selectedAttachments));
        r0.f3301 = r13.getResources().getBoolean(R.bool.f155692131034116);
        r0.f3299 = new ArrayList(requestAttachmentsToMediaResult(this.additionalAttachments));
        int[] iArr = this.touchableItems;
        if (iArr != null && iArr.length > 0) {
            r0 = r0.m3916(iArr);
        }
        long j = this.maxFileSize;
        if (j > 0) {
            r0.f3304 = j;
        }
        r0.m3917(r13);
    }
}
