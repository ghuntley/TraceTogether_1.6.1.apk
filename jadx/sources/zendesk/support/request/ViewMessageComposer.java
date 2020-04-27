package zendesk.support.request;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.LinkedList;
import java.util.List;
import o.C1991;
import o.C2000;
import o.P;
import o.R;
import zendesk.belvedere.ImageStream;
import zendesk.support.UiUtils;

class ViewMessageComposer extends FrameLayout implements View.OnClickListener, View.OnFocusChangeListener, View.OnLayoutChangeListener, TextView.OnEditorActionListener, TextWatcher {
    private ViewAttachmentsIndicator attachmentsIndicator;
    private AnimatorSet attachmentsOffCollapseAnimatorSet;
    private AnimatorSet attachmentsOffExpandAnimatorSet;
    private AnimatorSet attachmentsOnCollapseAnimatorSet;
    private AnimatorSet attachmentsOnExpandAnimatorSet;
    private ImageStream imageStream;
    private List<InputListener> inputListenerList = new LinkedList();
    private EditText inputTextField;
    private boolean isAttachmentsButtonDisabled = true;
    private boolean isSendButtonDisabled = true;
    private List<View.OnFocusChangeListener> onFocusChangeListenerList = new LinkedList();
    private OnHeightChangeListener onHeightChangeListener;
    private ImageView sendButton;
    private MessageComposerStateHelper stateHelper;

    interface InputListener {
        void onAddAttachmentsRequested();

        void onSendMessageRequested(String str);
    }

    interface OnHeightChangeListener {
        void onHeightChange(int i);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewMessageComposer(Context context) {
        super(context);
        viewInit(context);
    }

    public ViewMessageComposer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viewInit(context);
    }

    public ViewMessageComposer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        viewInit(context);
    }

    private void viewInit(Context context) {
        inflate(context, R.layout.f169992131558578, this);
        if (!isInEditMode()) {
            bindViews();
            initListener();
            initAnimationsAndAdjustLeftMargin();
            this.stateHelper = new MessageComposerStateHelper();
        }
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            this.inputTextField.clearFocus();
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public void setOnHeightChangeListener(OnHeightChangeListener onHeightChangeListener2) {
        this.onHeightChangeListener = onHeightChangeListener2;
    }

    public void addOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.onFocusChangeListenerList.add(onFocusChangeListener);
    }

    public void addListener(InputListener inputListener) {
        this.inputListenerList.add(inputListener);
    }

    public void setAttachmentsCount(int i) {
        this.attachmentsIndicator.setAttachmentsCount(i);
        triggerStateUpdate();
    }

    public void init(ImageStream imageStream2) {
        this.imageStream = imageStream2;
        triggerStateUpdate();
    }

    public void hide(boolean z) {
        if (z) {
            setVisibility(8);
            this.onHeightChangeListener.onHeightChange(0);
            return;
        }
        setVisibility(0);
        requestLayout();
    }

    private void bindViews() {
        this.inputTextField = (EditText) findViewById(R.id.f165832131362139);
        this.attachmentsIndicator = (ViewAttachmentsIndicator) findViewById(R.id.f165822131362138);
        this.sendButton = (ImageView) findViewById(R.id.f165842131362140);
    }

    private void initListener() {
        this.attachmentsIndicator.setOnClickListener(this);
        this.sendButton.setOnClickListener(this);
        this.inputTextField.addTextChangedListener(this);
        this.inputTextField.setOnEditorActionListener(this);
        this.inputTextField.setOnFocusChangeListener(this);
        addOnLayoutChangeListener(this);
    }

    private void initAnimationsAndAdjustLeftMargin() {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f159842131165614);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f159882131165618);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.f159892131165619);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.f159852131165615);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.f159902131165620);
        int dimensionPixelSize6 = resources.getDimensionPixelSize(R.dimen.f159862131165616);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.f159872131165617);
        this.attachmentsOnExpandAnimatorSet = new AnimatorSet();
        this.attachmentsOffExpandAnimatorSet = new AnimatorSet();
        this.attachmentsOnCollapseAnimatorSet = new AnimatorSet();
        this.attachmentsOffCollapseAnimatorSet = new AnimatorSet();
        C2000 r7 = new C2000();
        C1991 r8 = new C1991();
        this.attachmentsOnExpandAnimatorSet.setInterpolator(r7);
        this.attachmentsOffExpandAnimatorSet.setInterpolator(r7);
        this.attachmentsOnCollapseAnimatorSet.setInterpolator(r8);
        this.attachmentsOffCollapseAnimatorSet.setInterpolator(r8);
        this.attachmentsOnExpandAnimatorSet.play(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize, dimensionPixelSize2, 200)).with(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize4, dimensionPixelSize3, 200)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize6, dimensionPixelSize5, 200)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, 0, dimensionPixelOffset, 200));
        this.attachmentsOnCollapseAnimatorSet.play(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize3, dimensionPixelSize4, 200)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize5, dimensionPixelSize6, 200)).with(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize2, dimensionPixelSize, 200)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, dimensionPixelOffset, 0, 200));
        this.attachmentsOffExpandAnimatorSet.play(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize, dimensionPixelSize2, 200)).with(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize3, dimensionPixelSize3, 200)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize6, dimensionPixelSize5, 200)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, 0, dimensionPixelOffset, 200));
        this.attachmentsOffCollapseAnimatorSet.play(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize3, dimensionPixelSize3, 200)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize5, dimensionPixelSize6, 200)).with(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize2, dimensionPixelSize, 200)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, dimensionPixelOffset, 0, 200));
        updateAttachmentButtonPosition();
    }

    private void updateAttachmentButtonPosition() {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f159892131165619);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f159852131165615);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.inputTextField.getLayoutParams();
        if (this.isAttachmentsButtonDisabled) {
            dimensionPixelSize2 = dimensionPixelSize;
        }
        layoutParams.leftMargin = dimensionPixelSize2;
        this.inputTextField.setLayoutParams(layoutParams);
    }

    public void onClick(View view) {
        if (view.getId() == this.attachmentsIndicator.getId()) {
            applyState(this.stateHelper.onAttachmentClicked(this.isSendButtonDisabled, this.isAttachmentsButtonDisabled, this.inputTextField, this.imageStream.f14758.get().f3070, this.attachmentsIndicator));
            notifyAddAttachmentsRequested();
        } else if (view.getId() == this.sendButton.getId()) {
            String trim = this.inputTextField.getText().toString().trim();
            this.inputTextField.setText("");
            this.attachmentsIndicator.reset();
            triggerStateUpdate();
            notifySendMessageRequested(trim);
        }
    }

    public void onFocusChange(View view, boolean z) {
        if (view.getId() == this.inputTextField.getId()) {
            notifyOnFocusChangeListeners(view, z);
            triggerStateUpdate();
        }
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (textView.getId() != this.inputTextField.getId() || i != 6) {
            return false;
        }
        this.inputTextField.clearFocus();
        UiUtils.dismissKeyboard((View) this.inputTextField);
        triggerStateUpdate();
        return false;
    }

    public void afterTextChanged(Editable editable) {
        triggerStateUpdate();
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        OnHeightChangeListener onHeightChangeListener2;
        int i9 = i4 - i2;
        if (i9 != i8 - i6 && (onHeightChangeListener2 = this.onHeightChangeListener) != null) {
            onHeightChangeListener2.onHeightChange(i9);
        }
    }

    public void requestFocusForInput() {
        this.inputTextField.requestFocus();
    }

    public String getMessage() {
        return this.inputTextField.getText().toString();
    }

    /* access modifiers changed from: package-private */
    public void enableSendButton(boolean z) {
        this.isSendButtonDisabled = !z;
        triggerStateUpdate();
    }

    /* access modifiers changed from: package-private */
    public void enableAttachmentsButton(boolean z) {
        this.isAttachmentsButtonDisabled = !z;
        triggerStateUpdate();
    }

    /* access modifiers changed from: package-private */
    public void triggerStateUpdate() {
        ImageStream imageStream2 = this.imageStream;
        if (imageStream2 != null) {
            applyState(this.stateHelper.getState(this.inputTextField, imageStream2.f14758.get().f3070, this.attachmentsIndicator, this.imageStream.f14760 != null, this.isSendButtonDisabled, this.isAttachmentsButtonDisabled));
        }
    }

    private void applyState(MessageComposerState messageComposerState) {
        if (messageComposerState.getFieldState() != 1 || isExpanded()) {
            if (messageComposerState.getFieldState() == 2 && isExpanded()) {
                if (this.isAttachmentsButtonDisabled) {
                    this.attachmentsOffCollapseAnimatorSet.start();
                } else {
                    this.attachmentsOnCollapseAnimatorSet.start();
                }
            }
        } else if (this.isAttachmentsButtonDisabled) {
            this.attachmentsOffExpandAnimatorSet.start();
        } else {
            this.attachmentsOnExpandAnimatorSet.start();
        }
        int i = 0;
        if (messageComposerState.getSendButtonState() == 10) {
            updateSendBtn(false, false);
        } else if (messageComposerState.getSendButtonState() == 11) {
            updateSendBtn(true, false);
        } else if (messageComposerState.getSendButtonState() == 12) {
            updateSendBtn(true, true);
        }
        if (!messageComposerState.isAttachmentButtonEnabled()) {
            i = 8;
        }
        if (this.attachmentsIndicator.getVisibility() != i) {
            updateAttachmentButtonPosition();
            this.attachmentsIndicator.setVisibility(i);
        }
        if (messageComposerState.isAttachmentButtonEnabled() && this.attachmentsIndicator.getAttachmentsCount() == 0) {
            this.attachmentsIndicator.enableActiveState(messageComposerState.isAttachmentButtonActivated());
            this.attachmentsIndicator.setBottomBorderVisible(messageComposerState.isAttachmentButtonActivated());
        }
    }

    private boolean isExpanded() {
        return this.inputTextField.getHeight() > this.inputTextField.getResources().getDimensionPixelSize(R.dimen.f159842131165614);
    }

    private void updateSendBtn(boolean z, boolean z2) {
        int i;
        Context context = getContext();
        if (z2) {
            i = UiUtils.themeAttributeToColor(R.attr.f150312130968815, context, R.color.f157402131099939);
        } else {
            i = UiUtils.resolveColor(R.color.f157462131099947, context);
        }
        int i2 = 0;
        this.sendButton.setEnabled(z && z2);
        ImageView imageView = this.sendButton;
        if (!z) {
            i2 = 4;
        }
        imageView.setVisibility(i2);
        UiUtils.setTint(i, this.sendButton.getDrawable(), this.sendButton);
    }

    private void notifyOnFocusChangeListeners(View view, boolean z) {
        for (View.OnFocusChangeListener onFocusChange : this.onFocusChangeListenerList) {
            onFocusChange.onFocusChange(view, z);
        }
    }

    private void notifyAddAttachmentsRequested() {
        for (InputListener onAddAttachmentsRequested : this.inputListenerList) {
            onAddAttachmentsRequested.onAddAttachmentsRequested();
        }
    }

    private void notifySendMessageRequested(String str) {
        for (InputListener onSendMessageRequested : this.inputListenerList) {
            onSendMessageRequested.onSendMessageRequested(str);
        }
    }

    static class MessageComposerState {
        private final int attachmentButtonState;
        private final int fieldState;
        private final int sendButtonState;

        MessageComposerState(int i, int i2, int i3) {
            this.fieldState = i;
            this.sendButtonState = i2;
            this.attachmentButtonState = i3;
        }

        /* access modifiers changed from: package-private */
        public int getFieldState() {
            return this.fieldState;
        }

        /* access modifiers changed from: package-private */
        public int getSendButtonState() {
            return this.sendButtonState;
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachmentButtonEnabled() {
            return this.attachmentButtonState != 10;
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachmentButtonActivated() {
            return this.attachmentButtonState == 12;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MessageComposerState{fieldState=");
            sb.append(this.fieldState);
            sb.append(", sendButtonState=");
            sb.append(this.sendButtonState);
            sb.append(", attachmentButtonEnabled=");
            sb.append(this.attachmentButtonState);
            sb.append('}');
            return sb.toString();
        }
    }

    static class MessageComposerStateHelper {
        /* access modifiers changed from: package-private */
        public int getAttachmentButtonState(boolean z, boolean z2) {
            if (z) {
                return 10;
            }
            return z2 ? 12 : 11;
        }

        /* access modifiers changed from: package-private */
        public int getFieldState(boolean z, boolean z2, boolean z3, boolean z4) {
            return (z || z2 || z4 || z3) ? 1 : 2;
        }

        /* access modifiers changed from: package-private */
        public int getSendButtonState(boolean z, boolean z2, boolean z3, int i) {
            if (z2) {
                return 12;
            }
            if (z3 && !z) {
                return 12;
            }
            if (i == 1) {
                return 11;
            }
            if (i == 2) {
            }
            return 10;
        }

        MessageComposerStateHelper() {
        }

        /* access modifiers changed from: package-private */
        public MessageComposerState onAttachmentClicked(boolean z, boolean z2, EditText editText, EditText editText2, ViewAttachmentsIndicator viewAttachmentsIndicator) {
            int i;
            MessageComposerState state = getState(editText, editText2, viewAttachmentsIndicator, true, z, z2);
            if (state.getSendButtonState() == 10) {
                i = 11;
            } else {
                i = state.getSendButtonState();
            }
            return new MessageComposerState(1, i, getAttachmentButtonState(z2, true));
        }

        /* access modifiers changed from: package-private */
        public MessageComposerState getState(EditText editText, EditText editText2, ViewAttachmentsIndicator viewAttachmentsIndicator, boolean z, boolean z2, boolean z3) {
            String obj = editText.getText().toString();
            boolean hasLength = hasLength(obj);
            boolean hasValidText = hasValidText(obj);
            boolean hasFocus = editText.hasFocus();
            boolean hasFocus2 = editText2.hasFocus();
            boolean hasAttachments = hasAttachments(viewAttachmentsIndicator);
            int fieldState = getFieldState(hasFocus, hasLength, hasFocus2, hasAttachments);
            return new MessageComposerState(fieldState, getSendButtonState(z2, hasValidText, hasAttachments, fieldState), getAttachmentButtonState(z3, z));
        }

        private boolean hasValidText(String str) {
            return P.m1406(str);
        }

        private boolean hasLength(String str) {
            return str != null && str.length() > 0;
        }

        private boolean hasAttachments(ViewAttachmentsIndicator viewAttachmentsIndicator) {
            return viewAttachmentsIndicator.getAttachmentsCount() > 0;
        }
    }
}
