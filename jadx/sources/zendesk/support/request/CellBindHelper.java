package zendesk.support.request;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import o.C0585;
import o.C0651;
import o.C3602mo;
import o.C3616p;
import o.R;
import o.mP;
import o.nk;
import zendesk.support.request.CellType;

class CellBindHelper {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("d MMMM yyyy", Locale.getDefault());
    /* access modifiers changed from: private */
    public final ActionFactory af;
    private final CellAttachmentLoadingUtil attachmentUtil;
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final nk dispatcher;
    private final String today;
    private final String yesterday;

    CellBindHelper(Context context2, C3616p pVar, ActionFactory actionFactory, nk nkVar) {
        this.context = context2;
        this.af = actionFactory;
        this.dispatcher = nkVar;
        this.attachmentUtil = new CellAttachmentLoadingUtil(pVar, context2);
        this.today = context2.getString(R.string.f171262131886291);
        this.yesterday = context2.getString(R.string.f171272131886292);
    }

    /* access modifiers changed from: package-private */
    public void addOnClickListenerForFileAttachment(View view, final StateRequestAttachment stateRequestAttachment) {
        if (stateRequestAttachment.isAvailableLocally()) {
            view.setAlpha(1.0f);
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    CellBindHelper.this.openAttachment(view.getContext(), stateRequestAttachment);
                }
            });
            return;
        }
        view.setAlpha(0.3f);
        view.setOnClickListener(new View.OnClickListener() {
            private final String toastMessage = CellBindHelper.this.context.getString(R.string.f171152131886280);

            public void onClick(View view) {
                Toast.makeText(view.getContext(), this.toastMessage, 0).show();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void addOnClickListenerForImageAttachment(View view, final StateRequestAttachment stateRequestAttachment) {
        if (stateRequestAttachment.isAvailableLocally()) {
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    CellBindHelper.this.openAttachment(view.getContext(), stateRequestAttachment);
                }
            });
        } else {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* access modifiers changed from: private */
    public void openAttachment(Context context2, StateRequestAttachment stateRequestAttachment) {
        C3602mo r0 = C3602mo.m3911(context2);
        Uri parsedLocalUri = stateRequestAttachment.getParsedLocalUri();
        String mimeType = stateRequestAttachment.getMimeType();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(mimeType)) {
            intent.setDataAndType(parsedLocalUri, mimeType);
        }
        Object[] objArr = {intent, parsedLocalUri};
        mP.m3773(r0.f3291, intent, parsedLocalUri);
        if (context2.getPackageManager().queryIntentActivities(intent, 0).size() > 0) {
            context2.startActivity(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public ResolveInfo getAppInfo(String str) {
        return UtilsAttachment.getAppInfoForFile(this.context, str);
    }

    /* access modifiers changed from: package-private */
    public void bindAppInfo(ResolveInfo resolveInfo, TextView textView, ImageView imageView) {
        textView.setText(UtilsAttachment.getAppName(this.context, resolveInfo));
        imageView.setImageDrawable(UtilsAttachment.getAppIcon(this.context, resolveInfo));
    }

    /* access modifiers changed from: package-private */
    public void bindStatusLabel(TextView textView, boolean z, boolean z2) {
        int i;
        int i2 = -1;
        int i3 = 0;
        if (z) {
            i2 = R.color.f157392131099938;
            i = R.string.f171302131886296;
        } else if (z2) {
            i2 = R.color.f157382131099937;
            i = R.string.f171292131886295;
        } else {
            i3 = 4;
            i = -1;
        }
        if (i2 > 0) {
            textView.setTextColor(C0651.m5450(this.context, i2));
        }
        if (i > 0) {
            textView.setText(i);
        }
        textView.clearAnimation();
        if (i3 == 0 && textView.getVisibility() != 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(250);
            alphaAnimation.setInterpolator(C0585.m5211(0.0f, 0.0f, 0.2f, 1.0f));
            textView.startAnimation(alphaAnimation);
        }
        textView.setVisibility(i3);
    }

    /* access modifiers changed from: package-private */
    public void bindAgentName(TextView textView, boolean z, StateRequestUser stateRequestUser) {
        if (z) {
            textView.setVisibility(0);
            textView.setText(stateRequestUser.getName());
            return;
        }
        textView.setVisibility(4);
    }

    /* access modifiers changed from: package-private */
    public int colorForError(boolean z) {
        return C0651.m5450(this.context, z ? R.color.f157482131099950 : R.color.f157472131099949);
    }

    /* access modifiers changed from: package-private */
    public int colorForErrorImage(boolean z) {
        if (z) {
            return C0651.m5450(this.context, R.color.f157492131099951);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener errorClickListener(boolean z, final List<StateMessage> list) {
        if (z) {
            return new View.OnClickListener() {
                public void onClick(View view) {
                    CellBindHelper.this.dispatcher.m3992(CellBindHelper.this.af.showRetryDialog(list));
                }
            };
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void bindImage(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
        this.attachmentUtil.bindImage(imageView, stateRequestAttachment);
    }

    /* access modifiers changed from: package-private */
    public boolean areMessageContentsTheSame(CellType.Message message, CellType.Base base) {
        if (basicCellChecks(message, base) && (base instanceof CellType.Message)) {
            return message.getMessage().equals(((CellType.Message) base).getMessage());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean areStatefulCellContentsTheSame(CellType.Stateful stateful, CellType.Base base) {
        if (!basicCellChecks(stateful, base) || !(base instanceof CellType.Stateful)) {
            return false;
        }
        CellType.Stateful stateful2 = (CellType.Stateful) base;
        boolean z = stateful.isErrorShown() == stateful2.isErrorShown();
        boolean z2 = stateful.isMarkedAsDelivered() == stateful2.isMarkedAsDelivered();
        boolean z3 = stateful.getErrorGroupMessages().size() == stateful2.getErrorGroupMessages().size();
        boolean z4 = stateful.isLastErrorCellOfBlock() == stateful2.isLastErrorCellOfBlock();
        if (!z || !z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean areAttachmentCellContentsTheSame(CellType.Attachment attachment, CellType.Base base) {
        if (!basicCellChecks(attachment, base) || !(base instanceof CellType.Attachment)) {
            return false;
        }
        StateRequestAttachment attachment2 = attachment.getAttachment();
        StateRequestAttachment attachment3 = ((CellType.Attachment) base).getAttachment();
        boolean nullSafeEquals = nullSafeEquals(attachment2.getLocalFile(), attachment3.getLocalFile());
        boolean nullSafeEquals2 = nullSafeEquals(attachment2.getLocalUri(), attachment3.getLocalUri());
        boolean nullSafeEquals3 = nullSafeEquals(attachment2.getUrl(), attachment3.getUrl());
        if (!nullSafeEquals || !nullSafeEquals2 || !nullSafeEquals3) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean areAgentCellContentsTheSame(CellType.Agent agent, CellType.Base base) {
        if (!basicCellChecks(agent, base) || !(base instanceof CellType.Agent)) {
            return false;
        }
        CellType.Agent agent2 = (CellType.Agent) base;
        boolean z = agent.getAgent().getId() == agent2.getAgent().getId();
        boolean equals = agent.getAgent().getName().equals(agent2.getAgent().getName());
        boolean z2 = agent.isAgentNameVisible() == agent2.isAgentNameVisible();
        if (!z || !equals || !z2) {
            return false;
        }
        return true;
    }

    private boolean basicCellChecks(CellType.Base base, CellType.Base base2) {
        if (base == base2) {
            return true;
        }
        return base.getPositionType() == base2.getPositionType() && base.getClass().isInstance(base2);
    }

    private boolean nullSafeEquals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* access modifiers changed from: package-private */
    public void bindDate(TextView textView, Date date) {
        String str;
        if (UtilsDate.isToday(date)) {
            str = this.today;
        } else if (UtilsDate.isYesterday(date)) {
            str = this.yesterday;
        } else {
            str = DATE_FORMAT.format(date);
        }
        textView.setText(str.toUpperCase(Locale.getDefault()));
    }

    /* access modifiers changed from: package-private */
    public Rect getInsets(int i, int i2, int i3, int i4) {
        return new Rect(getPixelForDp(i), getPixelForDp(i2), getPixelForDp(i3), getPixelForDp(i4));
    }

    private int getPixelForDp(int i) {
        if (i != 0) {
            return this.context.getResources().getDimensionPixelOffset(i);
        }
        return 0;
    }
}
