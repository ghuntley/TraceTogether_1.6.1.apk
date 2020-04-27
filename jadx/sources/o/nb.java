package o;

import android.content.Context;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;

final class nb extends C1514 {
    public nb(Context context) {
        super(context);
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    public nb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    public nb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart < 0 || selectionEnd < 0) {
            Selection.setSelection((Spannable) getText(), getText().length());
        } else if (selectionStart != selectionEnd && motionEvent.getActionMasked() == 0) {
            CharSequence text = getText();
            setText((CharSequence) null);
            setText(text);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
