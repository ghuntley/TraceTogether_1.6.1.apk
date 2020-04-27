package o;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: o.ʇ  reason: contains not printable characters */
final class C1612 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private TextClassifier f8522;

    /* renamed from: ι  reason: contains not printable characters */
    private TextView f8523;

    C1612(TextView textView) {
        if (textView != null) {
            this.f8523 = textView;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9350(TextClassifier textClassifier) {
        this.f8522 = textClassifier;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final TextClassifier m9349() {
        TextClassifier textClassifier = this.f8522;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f8523.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
