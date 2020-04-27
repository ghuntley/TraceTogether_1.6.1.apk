package zendesk.support.request;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import o.C1266;
import o.R;
import zendesk.support.UiUtils;

public class ViewAttachmentsIndicator extends FrameLayout {
    private static final String COUNT_THRESHOLD_TEXT = "9+";
    private int attachmentsCount;
    private View attachmentsIndicatorBottomBorder;
    private TextView attachmentsIndicatorCounter;
    private ImageView attachmentsIndicatorIcon;
    private int colorActive;
    private int colorInactive;

    public ViewAttachmentsIndicator(Context context) {
        super(context);
        init(context);
    }

    public ViewAttachmentsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ViewAttachmentsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    /* access modifiers changed from: package-private */
    public void init(Context context) {
        inflate(context, R.layout.f169962131558575, this);
        if (!isInEditMode()) {
            this.attachmentsIndicatorIcon = (ImageView) findViewById(R.id.f164652131361948);
            this.attachmentsIndicatorBottomBorder = findViewById(R.id.f164632131361946);
            this.attachmentsIndicatorCounter = (TextView) findViewById(R.id.f164642131361947);
            this.colorActive = UiUtils.themeAttributeToColor(R.attr.f150312130968815, context, R.color.f157402131099939);
            this.colorInactive = UiUtils.resolveColor(R.color.f157372131099936, context);
            ((GradientDrawable) ((LayerDrawable) this.attachmentsIndicatorCounter.getBackground()).findDrawableByLayerId(R.id.f165542131362099)).setColor(this.colorActive);
            getContext().getString(R.string.f171752131886370);
            setContentDescription(UtilsAttachment.getContentDescriptionForAttachmentButton(getContext(), getAttachmentsCount()));
        }
    }

    /* access modifiers changed from: package-private */
    public int getAttachmentsCount() {
        return this.attachmentsCount;
    }

    /* access modifiers changed from: package-private */
    public void setAttachmentsCount(int i) {
        String str;
        this.attachmentsCount = i;
        int i2 = i > 9 ? R.dimen.f159812131165606 : R.dimen.f159822131165607;
        ViewGroup.LayoutParams layoutParams = this.attachmentsIndicatorCounter.getLayoutParams();
        layoutParams.width = getResources().getDimensionPixelSize(i2);
        this.attachmentsIndicatorCounter.setLayoutParams(layoutParams);
        TextView textView = this.attachmentsIndicatorCounter;
        if (i > 9) {
            str = COUNT_THRESHOLD_TEXT;
        } else {
            str = String.valueOf(i);
        }
        textView.setText(str);
        boolean z = i > 0;
        setCounterVisible(z);
        setBottomBorderVisible(z);
        enableActiveState(z);
        setContentDescription(UtilsAttachment.getContentDescriptionForAttachmentButton(getContext(), getAttachmentsCount()));
    }

    /* access modifiers changed from: package-private */
    public void setCounterVisible(boolean z) {
        this.attachmentsIndicatorCounter.setVisibility(z ? 0 : 4);
    }

    /* access modifiers changed from: package-private */
    public void setBottomBorderVisible(boolean z) {
        this.attachmentsIndicatorBottomBorder.setVisibility(z ? 0 : 4);
    }

    /* access modifiers changed from: package-private */
    public void enableActiveState(boolean z) {
        C1266.m8148(C1266.m8158(this.attachmentsIndicatorIcon.getDrawable()).mutate(), z ? this.colorActive : this.colorInactive);
        this.attachmentsIndicatorIcon.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void reset() {
        setCounterVisible(false);
        setAttachmentsCount(0);
        setBottomBorderVisible(false);
        enableActiveState(false);
    }
}
