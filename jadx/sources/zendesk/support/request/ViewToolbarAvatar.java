package zendesk.support.request;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C2311;
import o.C3616p;
import o.O;
import o.P;
import o.R;
import zendesk.support.UiUtils;
import zendesk.support.ZendeskAvatarView;

class ViewToolbarAvatar extends FrameLayout {
    private static final int[] IMAGE_VIEW_IDS = {R.id.f168312131362462, R.id.f168322131362463, R.id.f168332131362464, R.id.f168342131362465, R.id.f168352131362466};
    private final List<ZendeskAvatarView> avatarViews;
    private int imageRadius;
    private int strokeColor;
    private int strokeWidth;
    private List<C2311<String, String>> userInfo;

    public ViewToolbarAvatar(Context context) {
        this(context, (AttributeSet) null);
    }

    public ViewToolbarAvatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewToolbarAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.avatarViews = new ArrayList(5);
        this.userInfo = new ArrayList(5);
        this.imageRadius = context.getResources().getDimensionPixelOffset(R.dimen.f159992131165630);
        this.strokeWidth = context.getResources().getDimensionPixelOffset(R.dimen.f160002131165631);
        this.strokeColor = UiUtils.themeAttributeToColor(R.attr.f150312130968815, getContext(), R.color.f157402131099939);
        for (int i2 = 0; i2 < 5; i2++) {
            ZendeskAvatarView createAndAddView = createAndAddView(i2);
            createAndAddView.setVisibility(8);
            this.avatarViews.add(createAndAddView);
        }
    }

    /* access modifiers changed from: package-private */
    public void setImageUrls(C3616p pVar, List<C2311<String, String>> list) {
        if (list.size() > 5) {
            this.userInfo = list.subList(0, 5);
        } else {
            this.userInfo = O.m1393(list);
        }
        Collections.reverse(this.userInfo);
        bindData(pVar);
    }

    private void bindData(C3616p pVar) {
        for (int i = 0; i < this.avatarViews.size(); i++) {
            ZendeskAvatarView zendeskAvatarView = this.avatarViews.get(i);
            if (i < this.userInfo.size()) {
                C2311 r3 = this.userInfo.get(i);
                if (P.m1406((String) r3.f10733)) {
                    zendeskAvatarView.showUserWithAvatarImage(pVar, (String) r3.f10733, (String) r3.f10734, this.imageRadius);
                } else {
                    zendeskAvatarView.showUserWithName((String) r3.f10734);
                }
                zendeskAvatarView.setVisibility(0);
            } else {
                zendeskAvatarView.setVisibility(8);
            }
        }
    }

    private ZendeskAvatarView createAndAddView(int i) {
        ZendeskAvatarView zendeskAvatarView = new ZendeskAvatarView(getContext());
        zendeskAvatarView.setId(IMAGE_VIEW_IDS[i]);
        zendeskAvatarView.setStroke(this.strokeColor, this.strokeWidth);
        int i2 = this.imageRadius << 1;
        int i3 = (i << 1) * (i2 / 3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 8388613;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd(i3);
        } else {
            layoutParams.setMargins(0, 0, i3, 0);
        }
        addView(zendeskAvatarView, layoutParams);
        return zendeskAvatarView;
    }
}
