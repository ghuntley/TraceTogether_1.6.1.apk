package zendesk.support.request;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import o.C0651;
import o.C3602mo;
import o.O;
import o.P;
import o.R;
import o.mF;
import zendesk.support.IdUtil;

class UtilsAttachment {
    private static final AttachmentNameComparator REQUEST_ATTACHMENT_COMPARATOR = new AttachmentNameComparator();
    private static final String REQUEST_BELVEDERE_PATH = String.format(Locale.US, "%s%s%s", new Object[]{SUPPORT_BELVEDERE_BASE_PATH, File.separator, "request"});
    private static final String SUPPORT_BELVEDERE_BASE_PATH = String.format(Locale.US, "%s%s%s", new Object[]{"zendesk", File.separator, "support"});

    static String getAttachmentSubDir(String str, long j) {
        return String.format(Locale.US, "%s%s%s", new Object[]{str, File.separator, Long.valueOf(j)});
    }

    static String getTemporaryRequestCacheDir() {
        return String.format(Locale.US, "%s%s%s", new Object[]{REQUEST_BELVEDERE_PATH, File.separator, IdUtil.newStringId()});
    }

    static String getCacheDirForRequestId(String str) {
        return String.format(Locale.US, "%s%s%s", new Object[]{REQUEST_BELVEDERE_PATH, File.separator, str});
    }

    static mF getLocalFile(C3602mo moVar, String str, long j, String str2) {
        return moVar.m3912(getAttachmentSubDir(getCacheDirForRequestId(str), j), str2);
    }

    static String getMessageBodyForAttachments(List<StateRequestAttachment> list) {
        List<Type> r5 = O.m1393(list);
        Collections.sort(r5, REQUEST_ATTACHMENT_COMPARATOR);
        StringBuilder sb = new StringBuilder();
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            sb.append(((StateRequestAttachment) r5.get(i)).getName());
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        return String.format(Locale.US, "[%s]", new Object[]{sb.toString()});
    }

    static boolean hasAttachmentBody(StateMessage stateMessage) {
        if (!O.m1394(stateMessage.getAttachments())) {
            return false;
        }
        return stateMessage.getBody().equals(getMessageBodyForAttachments(stateMessage.getAttachments()));
    }

    static boolean isImageAttachment(StateRequestAttachment stateRequestAttachment) {
        String mimeType = stateRequestAttachment.getMimeType();
        return P.m1406(mimeType) && mimeType.toLowerCase(Locale.US).startsWith("image");
    }

    static ResolveInfo getAppInfoForFile(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        mF r3 = C3602mo.m3911(context).m3912("tmp", str);
        if (r3 == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(r3.f3090);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!O.m1399(queryIntentActivities)) {
            return queryIntentActivities.get(0);
        }
        return null;
    }

    static CharSequence getAppName(Context context, ResolveInfo resolveInfo) {
        String loadLabel = resolveInfo != null ? resolveInfo.loadLabel(context.getPackageManager()) : "";
        if (!TextUtils.isEmpty(loadLabel)) {
            return loadLabel;
        }
        return context.getString(R.string.f171072131886272);
    }

    static Drawable getAppIcon(Context context, ResolveInfo resolveInfo) {
        Drawable loadIcon = resolveInfo != null ? resolveInfo.loadIcon(context.getPackageManager()) : null;
        if (loadIcon != null) {
            return loadIcon;
        }
        return C0651.m5458(context, 17301651);
    }

    static String getContentDescriptionForAttachmentButton(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.f171242131886289));
        sb.append(". ");
        if (i == 0) {
            sb.append(context.getString(R.string.f171772131886372));
        } else if (i == 1) {
            sb.append(context.getString(R.string.f171782131886373));
        } else {
            sb.append(context.getString(R.string.f171762131886371, new Object[]{Integer.valueOf(i)}));
        }
        return sb.toString();
    }

    static class AttachmentNameComparator implements Comparator<StateRequestAttachment> {
        private AttachmentNameComparator() {
        }

        public int compare(StateRequestAttachment stateRequestAttachment, StateRequestAttachment stateRequestAttachment2) {
            return stateRequestAttachment.getName().compareTo(stateRequestAttachment2.getName());
        }
    }
}
