package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/* renamed from: o.ɭӀ  reason: contains not printable characters */
public final class C1448 extends Button {
    public C1448(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1448(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m8711(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
