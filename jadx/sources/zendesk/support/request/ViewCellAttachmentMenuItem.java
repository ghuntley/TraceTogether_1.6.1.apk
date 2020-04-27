package zendesk.support.request;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import o.R;
import zendesk.support.UiUtils;

class ViewCellAttachmentMenuItem extends FrameLayout {
    private TextView badge;
    private View badgeContainer;
    private View shadow;

    public ViewCellAttachmentMenuItem(Context context) {
        super(context);
        viewInit();
    }

    public ViewCellAttachmentMenuItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viewInit();
    }

    public ViewCellAttachmentMenuItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        viewInit();
    }

    /* access modifiers changed from: package-private */
    public void setBadgeCount(int i) {
        if (i > 0) {
            this.badgeContainer.setVisibility(0);
            this.badge.setText(String.valueOf(i));
        } else {
            this.badgeContainer.setVisibility(8);
        }
        setContentDescription(UtilsAttachment.getContentDescriptionForAttachmentButton(getContext(), i));
    }

    private void viewInit() {
        inflate(getContext(), R.layout.f169752131558554, this);
        bindViews();
        tintBadge();
        if (Build.VERSION.SDK_INT < 21) {
            this.shadow.setVisibility(0);
        }
        setContentDescription(UtilsAttachment.getContentDescriptionForAttachmentButton(getContext(), 0));
    }

    private void tintBadge() {
        UiUtils.setTint(UiUtils.themeAttributeToColor(R.attr.f150212130968801, getContext(), R.color.f157402131099939), this.badge.getBackground(), this.badge);
    }

    private void bindViews() {
        this.badgeContainer = findViewById(R.id.f166422131362223);
        this.badge = (TextView) findViewById(R.id.f166412131362222);
        this.shadow = findViewById(R.id.f166432131362224);
    }
}
