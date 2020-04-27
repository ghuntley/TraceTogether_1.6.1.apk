package zendesk.support;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import o.C0651;
import o.C3289b;
import o.C3616p;
import o.C3620t;
import o.P;
import o.R;

public class ZendeskAvatarView extends FrameLayout {
    private static final int[] AVATAR_COLORS = {R.color.f157102131099907, R.color.f157112131099908, R.color.f157122131099909, R.color.f157132131099910, R.color.f157142131099911, R.color.f157152131099912, R.color.f157162131099913, R.color.f157172131099914, R.color.f157182131099915, R.color.f157192131099916, R.color.f157202131099917, R.color.f157212131099918, R.color.f157222131099919, R.color.f157232131099920, R.color.f157242131099921, R.color.f157252131099922, R.color.f157262131099923, R.color.f157272131099924, R.color.f157282131099925};
    private boolean enableOutline;
    private ImageView imageView;
    private int strokeColor;
    private int strokeWidth;
    private TextView textView;

    public ZendeskAvatarView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public ZendeskAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ZendeskAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.enableOutline = false;
        this.strokeColor = 0;
        this.strokeWidth = 0;
        initViews();
    }

    private void initViews() {
        this.textView = new TextView(getContext());
        this.textView.setId(R.id.f168302131362461);
        this.textView.setTextColor(C0651.m5450(getContext(), R.color.f157092131099906));
        this.textView.setGravity(17);
        this.textView.setTextSize(2, 16.0f);
        this.imageView = new ImageView(getContext());
        this.imageView.setId(R.id.f168292131362460);
        addView(this.textView);
        addView(this.imageView);
    }

    public void setStroke(int i, int i2) {
        this.strokeColor = i;
        this.strokeWidth = i2;
        this.enableOutline = true;
    }

    public void showUserWithAvatarImage(C3616p pVar, String str, String str2, int i) {
        this.imageView.setVisibility(0);
        this.imageView.setImageResource(R.color.f157302131099927);
        if (P.m1406(str2)) {
            this.textView.setVisibility(0);
            setTextView(str2);
        }
        this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C3620t r4 = pVar.m4041(str);
        int i2 = i << 1;
        r4.f3496.m4066(i2, i2);
        r4.f3496.f3487 = true;
        r4.f3495 = false;
        r4.m4074(PicassoTransformations.getRoundWithBorderTransformation(i, this.strokeColor, this.strokeWidth)).m4076(this.imageView, (C3289b) null);
    }

    public void showUserWithName(String str) {
        if (P.m1406(str)) {
            setTextView(str);
            this.textView.setVisibility(0);
            this.imageView.setVisibility(4);
        }
    }

    public void showUserWithIdentifier(Object obj) {
        if (obj != null) {
            setBackground(getBackgroundShape(getColorId(obj)));
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setImageResource(2131231236);
            this.textView.setVisibility(4);
            this.imageView.setVisibility(0);
        }
    }

    private void setTextView(String str) {
        setBackground(getBackgroundShape(getColorId(str)));
        this.textView.setText(String.valueOf(Character.toUpperCase(str.charAt(0))));
    }

    private int getColorId(Object obj) {
        return AVATAR_COLORS[Math.abs(obj.hashCode() % AVATAR_COLORS.length)];
    }

    private Drawable getBackgroundShape(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(C0651.m5450(getContext(), i));
        if (!this.enableOutline) {
            return shapeDrawable;
        }
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable2.getPaint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(this.strokeColor);
        paint.setStrokeWidth((float) this.strokeWidth);
        return new LayerDrawable(new Drawable[]{shapeDrawable, new InsetDrawable(shapeDrawable2, this.strokeWidth / 2)});
    }
}
