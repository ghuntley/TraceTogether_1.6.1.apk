package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import o.C1540;

/* renamed from: o.ɼӀ  reason: contains not printable characters */
public class C1510 extends LinearLayout {

    /* renamed from: ı  reason: contains not printable characters */
    View f8065;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f8066;

    /* renamed from: ǃ  reason: contains not printable characters */
    RecyclerView f8067;
    /* access modifiers changed from: private */

    /* renamed from: ȷ  reason: contains not printable characters */
    public C1650 f8068;

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f8069;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f8070;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C1684 f8071;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f8072;
    /* access modifiers changed from: package-private */

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean f8073;
    /* access modifiers changed from: package-private */

    /* renamed from: ι  reason: contains not printable characters */
    public C1566 f8074;

    /* renamed from: І  reason: contains not printable characters */
    private View f8075;

    /* renamed from: і  reason: contains not printable characters */
    private int f8076;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private TextView f8077;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f8078;

    public C1510(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1510(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public C1510(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8071 = new C1684(this);
        setClipChildren(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1540.IF.f8210, R.attr.f151522130968941, 0);
        try {
            this.f8078 = obtainStyledAttributes.getColor(C1540.IF.f8211, -1);
            this.f8076 = obtainStyledAttributes.getColor(C1540.IF.f8209, -1);
            this.f8072 = obtainStyledAttributes.getResourceId(C1540.IF.f8208, -1);
            obtainStyledAttributes.recycle();
            this.f8070 = getVisibility();
            setViewProvider(new C1681());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setViewProvider(C1566 r2) {
        removeAllViews();
        this.f8074 = r2;
        r2.f8319 = this;
        this.f8075 = r2.m9199(this);
        this.f8065 = r2.m9198();
        this.f8077 = r2.m9201();
        addView(this.f8075);
        addView(this.f8065);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f8067 = recyclerView;
        if (recyclerView.getAdapter() instanceof C1650) {
            this.f8068 = (C1650) recyclerView.getAdapter();
        }
        recyclerView.addOnScrollListener(this.f8071);
        m8951();
        recyclerView.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() {
            public final void onChildViewAdded(View view, View view2) {
                C1510.this.m8951();
            }

            public final void onChildViewRemoved(View view, View view2) {
                C1510.this.m8951();
            }
        });
    }

    public void setOrientation(int i) {
        this.f8069 = i;
        super.setOrientation(i == 0 ? 1 : 0);
    }

    public void setBubbleColor(int i) {
        this.f8078 = i;
        invalidate();
    }

    public void setHandleColor(int i) {
        this.f8076 = i;
        invalidate();
    }

    public void setBubbleTextAppearance(int i) {
        this.f8072 = i;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f8065.setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C1510.this.requestDisallowInterceptTouchEvent(true);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                    if (C1510.this.f8068 != null && motionEvent.getAction() == 0) {
                        C1510.this.f8074.m9203();
                    }
                    boolean unused = C1510.this.f8073 = true;
                    float r3 = C1510.m8944(C1510.this, motionEvent);
                    C1510.this.m8952(r3);
                    C1510.m8948(C1510.this, r3);
                    return true;
                } else if (motionEvent.getAction() != 1) {
                    return false;
                } else {
                    boolean unused2 = C1510.this.f8073 = false;
                    if (C1510.this.f8068 != null) {
                        C1510.this.f8074.m9205();
                    }
                    return true;
                }
            }
        });
        this.f8066 = this.f8074.m9202();
        int i5 = this.f8078;
        if (i5 != -1) {
            TextView textView = this.f8077;
            Drawable r6 = C1266.m8158(textView.getBackground());
            if (r6 != null) {
                C1266.m8148(r6.mutate(), i5);
                if (Build.VERSION.SDK_INT >= 16) {
                    textView.setBackground(r6);
                } else {
                    textView.setBackgroundDrawable(r6);
                }
            }
        }
        int i6 = this.f8076;
        if (i6 != -1) {
            View view = this.f8065;
            Drawable r62 = C1266.m8158(view.getBackground());
            if (r62 != null) {
                C1266.m8148(r62.mutate(), i6);
                if (Build.VERSION.SDK_INT >= 16) {
                    view.setBackground(r62);
                } else {
                    view.setBackgroundDrawable(r62);
                }
            }
        }
        int i7 = this.f8072;
        if (i7 != -1) {
            C0893.m6632(this.f8077, i7);
        }
        this.f8071.m9579(this.f8067);
    }

    public void setVisibility(int i) {
        this.f8070 = i;
        m8951();
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m8951() {
        if (this.f8067.getAdapter() == null || this.f8067.getAdapter().getItemCount() == 0 || this.f8067.getChildAt(0) == null || m8949() || this.f8070 != 0) {
            super.setVisibility(4);
        } else {
            super.setVisibility(0);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean m8949() {
        return this.f8069 == 1 ? this.f8067.getChildAt(0).getHeight() * this.f8067.getAdapter().getItemCount() <= this.f8067.getHeight() : this.f8067.getChildAt(0).getWidth() * this.f8067.getAdapter().getItemCount() <= this.f8067.getWidth();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m8952(float f) {
        boolean z = true;
        if (this.f8069 != 1) {
            z = false;
        }
        if (z) {
            this.f8075.setY(Math.min(Math.max(0.0f, (((float) (getHeight() - this.f8065.getHeight())) * f) + ((float) this.f8066)), (float) (getHeight() - this.f8075.getHeight())));
            this.f8065.setY(Math.min(Math.max(0.0f, f * ((float) (getHeight() - this.f8065.getHeight()))), (float) (getHeight() - this.f8065.getHeight())));
            return;
        }
        this.f8075.setX(Math.min(Math.max(0.0f, (((float) (getWidth() - this.f8065.getWidth())) * f) + ((float) this.f8066)), (float) (getWidth() - this.f8075.getWidth())));
        this.f8065.setX(Math.min(Math.max(0.0f, f * ((float) (getWidth() - this.f8065.getWidth()))), (float) (getWidth() - this.f8065.getWidth())));
    }

    /* renamed from: ı  reason: contains not printable characters */
    static /* synthetic */ float m8944(C1510 r5, MotionEvent motionEvent) {
        float f;
        int width;
        int width2;
        if (r5.f8069 == 1) {
            float rawY = motionEvent.getRawY();
            View view = r5.f8065;
            int[] iArr = {0, (int) view.getY()};
            ((View) view.getParent()).getLocationInWindow(iArr);
            f = rawY - ((float) iArr[1]);
            width = r5.getHeight();
            width2 = r5.f8065.getHeight();
        } else {
            float rawX = motionEvent.getRawX();
            View view2 = r5.f8065;
            int[] iArr2 = {(int) view2.getX(), 0};
            ((View) view2.getParent()).getLocationInWindow(iArr2);
            f = rawX - ((float) iArr2[0]);
            width = r5.getWidth();
            width2 = r5.f8065.getWidth();
        }
        return f / ((float) (width - width2));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static /* synthetic */ void m8948(C1510 r2, float f) {
        TextView textView;
        RecyclerView recyclerView = r2.f8067;
        if (recyclerView != null) {
            int itemCount = recyclerView.getAdapter().getItemCount();
            int min = (int) Math.min(Math.max(0.0f, (float) ((int) (f * ((float) itemCount)))), (float) (itemCount - 1));
            r2.f8067.scrollToPosition(min);
            C1650 r0 = r2.f8068;
            if (r0 != null && (textView = r2.f8077) != null) {
                textView.setText(r0.m9498(min));
            }
        }
    }
}
