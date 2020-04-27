package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import kotlin.Metadata;
import o.X;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0000\u0018\u00002\u00020\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u0005B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\n\u0010\fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000eJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/W;", "Landroid/content/Context;", "p0", "", "ı", "(Landroid/content/Context;)V", "", "p1", "onSelectionChanged", "(II)V", "<init>", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lo/ͼ;"}, k = 1, mv = {1, 1, 15})
public final class W extends C1745 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public W(Context context) {
        super(context);
        fM.m2254(context, "");
        m1426(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public W(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fM.m2254(context, "");
        fM.m2254(attributeSet, "");
        m1426(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public W(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fM.m2254(context, "");
        fM.m2254(attributeSet, "");
        m1426(context);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m1426(Context context) {
        setCursorVisible(false);
        setTextColor(context.getResources().getColor(X.C0105.f1368));
        setBackgroundDrawable((Drawable) null);
        setInputType(2);
        setSelectAllOnFocus(false);
        setTextIsSelectable(false);
    }

    public final void onSelectionChanged(int i, int i2) {
        Editable text = getText();
        if (text == null || (i == text.length() && i2 == text.length())) {
            super.onSelectionChanged(i, i2);
        } else {
            setSelection(text.length(), text.length());
        }
    }
}
