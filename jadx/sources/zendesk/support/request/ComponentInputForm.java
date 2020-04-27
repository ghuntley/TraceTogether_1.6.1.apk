package zendesk.support.request;

import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import java.util.List;
import o.C1336;
import o.C2283;
import o.O;
import o.P;
import o.R;
import o.mC;
import o.nk;
import o.nl;
import o.nq;
import o.nt;
import zendesk.support.request.RequestViewConversationsDisabled;

class ComponentInputForm implements nl<InputFormModel>, RequestViewConversationsDisabled.MenuItemsDelegate, mC.Cif {
    private final ActionFactory actionFactory;
    private final AttachmentHelper attachmentHelper;
    private final nk dispatcher;
    private final EditText emailField;
    private final C1336 emailLayout;
    private final Validator<String> emailValidator;
    /* access modifiers changed from: private */
    public boolean inlineValidation = false;
    /* access modifiers changed from: private */
    public final View logo;
    private final EditText messageField;
    private final C1336 messageLayout;
    private final EditText nameField;
    private final C1336 nameLayout;
    private MenuItem sendButton;

    interface Validator<T> {
        boolean isValid(T t);
    }

    static ComponentInputForm create(View view, nk nkVar, ActionFactory actionFactory2, AttachmentHelper attachmentHelper2) {
        AnonymousClass1 r6 = new Validator<String>() {
            public final boolean isValid(String str) {
                return C2283.f10663.matcher(str).matches();
            }
        };
        EditText editText = (EditText) view.findViewById(R.id.f166962131362277);
        EditText editText2 = (EditText) view.findViewById(R.id.f166702131362251);
        EditText editText3 = (EditText) view.findViewById(R.id.f166942131362275);
        return new ComponentInputForm(view.findViewById(R.id.f167112131362292), editText, (C1336) view.findViewById(R.id.f166972131362278), editText2, (C1336) view.findViewById(R.id.f166712131362252), r6, editText3, (C1336) view.findViewById(R.id.f166952131362276), nkVar, actionFactory2, attachmentHelper2);
    }

    ComponentInputForm(View view, EditText editText, C1336 r4, EditText editText2, C1336 r6, Validator<String> validator, EditText editText3, C1336 r9, nk nkVar, ActionFactory actionFactory2, AttachmentHelper attachmentHelper2) {
        this.logo = view;
        this.nameField = editText;
        this.emailField = editText2;
        this.messageField = editText3;
        this.nameLayout = r4;
        this.emailLayout = r6;
        this.messageLayout = r9;
        this.emailValidator = validator;
        this.dispatcher = nkVar;
        this.actionFactory = actionFactory2;
        this.attachmentHelper = attachmentHelper2;
        EditTextTextWatcher.install(this, editText, editText2, editText3);
        EmailFieldFocusListener.install(this, editText2);
    }

    public void update(final InputFormModel inputFormModel) {
        this.logo.setVisibility(inputFormModel.getLogoVisibility());
        this.nameLayout.setVisibility(inputFormModel.getNameFieldVisibility());
        this.emailLayout.setVisibility(inputFormModel.getEmailFieldVisibility());
        this.messageLayout.setVisibility(inputFormModel.getMessageFieldVisibility());
        this.nameLayout.setEnabled(!inputFormModel.isLoading());
        this.emailLayout.setEnabled(!inputFormModel.isLoading());
        this.messageLayout.setEnabled(!inputFormModel.isLoading());
        if (inputFormModel.isLoading()) {
            setSendButtonEnabled(false);
            return;
        }
        AnonymousClass2 r0 = null;
        if (inputFormModel.isLogoEnabled() && P.m1406(inputFormModel.getReferrerUrl())) {
            r0 = new View.OnClickListener() {
                public void onClick(View view) {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(inputFormModel.getReferrerUrl())));
                }
            };
        }
        this.logo.setOnClickListener(r0);
        updateSendButton();
    }

    public void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2) {
        this.sendButton = menuItem;
        updateSendButton();
    }

    public void onMenuItemsClicked(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.f166652131362246) {
            onSendMessageRequested();
        }
    }

    public void onKeyboardVisible() {
        if (this.logo.getVisibility() != 8) {
            this.logo.setVisibility(4);
        }
    }

    public void onKeyboardDismissed() {
        if (this.logo.getVisibility() != 8) {
            this.logo.post(new Runnable() {
                public void run() {
                    ComponentInputForm.this.logo.setVisibility(0);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public nq<InputFormModel> getSelector() {
        return new InputFormSelector();
    }

    /* access modifiers changed from: package-private */
    public void onSendMessageRequested() {
        if (!doFieldsContainText() || !isEmailInputValid()) {
            updateEmailValidation();
            updateSendButton();
            return;
        }
        if (isNameFieldVisible() || isEmailFieldVisible()) {
            this.dispatcher.m3992(this.actionFactory.updateNameEmailAsync(this.nameField.getText().toString(), this.emailField.getText().toString()));
        }
        String obj = this.messageField.getText().toString();
        List<Type> r1 = O.m1403(this.attachmentHelper.getSelectedAttachments());
        this.dispatcher.m3992(this.actionFactory.clearMessages());
        this.dispatcher.m3992(this.actionFactory.createCommentAsync(obj, r1));
    }

    /* access modifiers changed from: package-private */
    public boolean hasUnsavedInput() {
        String obj = this.nameField.getText().toString();
        String obj2 = this.emailField.getText().toString();
        String obj3 = this.messageField.getText().toString();
        if (this.nameField.isEnabled() && P.m1406(obj)) {
            return true;
        }
        if ((!this.emailField.isEnabled() || !P.m1406(obj2)) && !P.m1406(obj3) && !O.m1394(this.attachmentHelper.getSelectedAttachments())) {
            return false;
        }
        return true;
    }

    private boolean doFieldsContainText() {
        return (!isNameFieldVisible() || P.m1406(this.nameField.getText().toString())) && (!isEmailFieldVisible() || P.m1406(this.emailField.getText().toString())) && P.m1406(this.messageField.getText().toString());
    }

    private boolean isEmailInputValid() {
        return !isEmailFieldVisible() || this.emailValidator.isValid(this.emailField.getText().toString());
    }

    /* access modifiers changed from: private */
    public void updateSendButton() {
        boolean z;
        if (this.inlineValidation) {
            z = doFieldsContainText() && isEmailInputValid();
        } else {
            z = doFieldsContainText();
        }
        setSendButtonEnabled(z);
    }

    /* access modifiers changed from: private */
    public void updateEmailValidation() {
        if (isEmailInputValid()) {
            this.emailLayout.setError((CharSequence) null);
            return;
        }
        this.inlineValidation = true;
        this.emailLayout.setError(this.emailField.getContext().getString(R.string.f170812131886176));
    }

    private void setSendButtonEnabled(boolean z) {
        int i;
        if (this.sendButton != null) {
            if (z) {
                i = 255;
            } else {
                this.messageLayout.getContext();
                i = 76;
            }
            this.sendButton.getIcon().setAlpha(i);
            this.sendButton.setEnabled(z);
        }
    }

    private boolean isNameFieldVisible() {
        return this.nameLayout.getVisibility() == 0;
    }

    private boolean isEmailFieldVisible() {
        return this.emailLayout.getVisibility() == 0;
    }

    static class EmailFieldFocusListener implements View.OnFocusChangeListener {
        private final ComponentInputForm componentInputForm;
        private final EditText editText;

        static void install(ComponentInputForm componentInputForm2, EditText editText2) {
            editText2.setOnFocusChangeListener(new EmailFieldFocusListener(componentInputForm2, editText2));
        }

        private EmailFieldFocusListener(ComponentInputForm componentInputForm2, EditText editText2) {
            this.componentInputForm = componentInputForm2;
            this.editText = editText2;
        }

        public void onFocusChange(View view, boolean z) {
            if (!z && P.m1406(this.editText.getText().toString())) {
                this.componentInputForm.updateEmailValidation();
                this.componentInputForm.updateSendButton();
            }
        }
    }

    static class EditTextTextWatcher implements TextWatcher {
        private final ComponentInputForm componentInputForm;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        static void install(ComponentInputForm componentInputForm2, EditText... editTextArr) {
            for (EditText addTextChangedListener : editTextArr) {
                addTextChangedListener.addTextChangedListener(new EditTextTextWatcher(componentInputForm2));
            }
        }

        private EditTextTextWatcher(ComponentInputForm componentInputForm2) {
            this.componentInputForm = componentInputForm2;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.componentInputForm.inlineValidation) {
                this.componentInputForm.updateEmailValidation();
            }
            this.componentInputForm.updateSendButton();
        }
    }

    static class InputFormModel {
        private final boolean hasIdentityEmailAddress;
        private final boolean hasIdentityName;
        private final boolean isLoading;
        private final boolean neverRequestEmail;
        private final String referrerUrl;
        private final boolean showZendeskLogo;

        /* access modifiers changed from: package-private */
        public int getMessageFieldVisibility() {
            return 0;
        }

        InputFormModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
            this.neverRequestEmail = z;
            this.hasIdentityEmailAddress = z2;
            this.hasIdentityName = z3;
            this.isLoading = z4;
            this.showZendeskLogo = z5;
            this.referrerUrl = str;
        }

        private boolean isEmailFieldEnabled() {
            return !this.hasIdentityEmailAddress && !this.neverRequestEmail;
        }

        private boolean isNameFieldEnabled() {
            return !this.hasIdentityName;
        }

        /* access modifiers changed from: package-private */
        public int getEmailFieldVisibility() {
            return isEmailFieldEnabled() ? 0 : 8;
        }

        /* access modifiers changed from: package-private */
        public int getNameFieldVisibility() {
            return isNameFieldEnabled() ? 0 : 8;
        }

        /* access modifiers changed from: package-private */
        public int getLogoVisibility() {
            return isLogoEnabled() ? 0 : 8;
        }

        /* access modifiers changed from: package-private */
        public boolean isLogoEnabled() {
            return this.showZendeskLogo;
        }

        /* access modifiers changed from: package-private */
        public String getReferrerUrl() {
            return this.referrerUrl;
        }

        public boolean isLoading() {
            return this.isLoading;
        }
    }

    static class InputFormSelector implements nq<InputFormModel> {
        InputFormSelector() {
        }

        public InputFormModel selectData(nt ntVar) {
            StateSettings settings = StateConfig.fromState(ntVar).getSettings();
            return new InputFormModel(settings.isNeverRequestEmailOn(), settings.hasIdentityEmailAddress(), settings.hasIdentityName(), StateProgress.fomState(ntVar).getRunningRequests() > 0, settings.isShowZendeskLogo(), settings.getReferrerUrl());
        }
    }
}
