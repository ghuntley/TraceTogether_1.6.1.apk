package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import o.mT;

public class mS extends FrameLayout {
    public mS(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public mS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public mS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, R.layout.f170012131558583, this);
        Resources resources = getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.f160032131165640);
        int r1 = mY.m3796(context);
        findViewById(R.id.f168362131362468);
        findViewById(R.id.f168372131362469);
        C3616p.m4040(context);
        resources.getDimensionPixelSize(R.dimen.f160042131165641);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mT.aux.f3157);
        resources.getIntArray(obtainStyledAttributes.getResourceId(mT.aux.f3158, R.array.f148092130903040));
        obtainStyledAttributes.getDimensionPixelSize(mT.aux.f3159, dimensionPixelOffset);
        obtainStyledAttributes.getColor(mT.aux.f3156, r1);
        obtainStyledAttributes.recycle();
    }
}
