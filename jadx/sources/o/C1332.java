package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import o.C1336;

/* renamed from: o.ɪŧ  reason: contains not printable characters */
final class C1332 extends C1097 implements TextWatcher, C1336.C1339, View.OnClickListener {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1336.If f7353 = new C1336.If() {
        /* renamed from: ı  reason: contains not printable characters */
        public final void m8368(C1336 r2, int i) {
            EditText editText = r2.f7418;
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    };

    /* renamed from: ɩ  reason: contains not printable characters */
    private TextWatcher f7354 = this;

    /* renamed from: ι  reason: contains not printable characters */
    private final C1336.C1339 f7355 = this;

    public final void afterTextChanged(Editable editable) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    C1332(C1336 r1) {
        super(r1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m8366() {
        this.f6533.setEndIconDrawable(C3257Con.m1345(this.f6534, R.drawable.f160952131230871));
        this.f6533.setEndIconContentDescription(this.f6533.getResources().getText(R.string.f171022131886255));
        this.f6533.setEndIconOnClickListener(this);
        C1336 r0 = this.f6533;
        C1336.C1339 r1 = this.f7355;
        r0.f7370.add(r1);
        if (r0.f7418 != null) {
            r1.m8419(r0);
        }
        this.f6533.f7432.add(this.f7353);
        EditText editText = this.f6533.f7418;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C2861 r1 = this.f6535;
        EditText editText = this.f6533.f7418;
        r1.setChecked(!(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8367(C1336 r4) {
        EditText editText = r4.f7418;
        r4.setEndIconVisible(true);
        C2861 r42 = this.f6535;
        EditText editText2 = this.f6533.f7418;
        r42.setChecked(true ^ (editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod)));
        editText.removeTextChangedListener(this.f7354);
        editText.addTextChangedListener(this.f7354);
    }

    public final void onClick(View view) {
        EditText editText = this.f6533.f7418;
        if (editText != null) {
            int selectionEnd = editText.getSelectionEnd();
            EditText editText2 = this.f6533.f7418;
            if (editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                editText.setTransformationMethod((TransformationMethod) null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
        }
    }
}
