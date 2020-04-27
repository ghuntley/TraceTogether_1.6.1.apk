package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class mU extends FrameLayout {

    /* renamed from: і  reason: contains not printable characters */
    private static final String f3166 = "9+";

    /* renamed from: ı  reason: contains not printable characters */
    View f3167;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f3168;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f3169;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f3170;

    /* renamed from: Ι  reason: contains not printable characters */
    ImageView f3171;

    /* renamed from: ι  reason: contains not printable characters */
    TextView f3172;

    public mU(Context context) {
        super(context);
        m3786(context);
    }

    public mU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3786(context);
    }

    public mU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3786(context);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m3786(Context context) {
        inflate(context, R.layout.f170002131558582, this);
        if (!isInEditMode()) {
            this.f3171 = (ImageView) findViewById(R.id.f164652131361948);
            this.f3167 = findViewById(R.id.f164632131361946);
            this.f3172 = (TextView) findViewById(R.id.f164642131361947);
            this.f3168 = mY.m3796(context);
            this.f3170 = C0651.m5450(context, R.color.f157502131099952);
            ((GradientDrawable) ((LayerDrawable) this.f3172.getBackground()).findDrawableByLayerId(R.id.f165542131362099)).setColor(this.f3168);
            setContentDescription(m3787(getContext(), this.f3169));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m3788(int i) {
        String str;
        this.f3169 = i;
        int i2 = i > 9 ? R.dimen.f160012131165638 : R.dimen.f160022131165639;
        ViewGroup.LayoutParams layoutParams = this.f3172.getLayoutParams();
        layoutParams.width = getResources().getDimensionPixelSize(i2);
        this.f3172.setLayoutParams(layoutParams);
        TextView textView = this.f3172;
        if (i > 9) {
            str = f3166;
        } else {
            str = String.valueOf(i);
        }
        textView.setText(str);
        int i3 = 0;
        boolean z = i > 0;
        this.f3172.setVisibility(z ? 0 : 4);
        View view = this.f3167;
        if (!z) {
            i3 = 4;
        }
        view.setVisibility(i3);
        int i4 = z ? this.f3168 : this.f3170;
        Drawable drawable = this.f3171.getDrawable();
        ImageView imageView = this.f3171;
        if (drawable == null) {
            F.m1358();
        } else {
            C1266.m8148(C1266.m8158(drawable).mutate(), i4);
            if (imageView != null) {
                imageView.invalidate();
            }
        }
        setContentDescription(m3787(getContext(), i));
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static String m3787(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.f172022131886398));
        sb.append(". ");
        if (i == 0) {
            sb.append(context.getString(R.string.f172042131886400));
        } else if (i == 1) {
            sb.append(context.getString(R.string.f172052131886401));
        } else {
            sb.append(context.getString(R.string.f172032131886399, new Object[]{Integer.valueOf(i)}));
        }
        return sb.toString();
    }
}
