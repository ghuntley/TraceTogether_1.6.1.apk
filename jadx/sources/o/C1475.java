package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import o.C1429;
import o.C2745;

/* renamed from: o.ɺ  reason: contains not printable characters */
public class C1475 extends LinearLayout implements C1429.C1430, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: ı  reason: contains not printable characters */
    private TextView f7913;

    /* renamed from: ł  reason: contains not printable characters */
    private boolean f7914;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private ImageView f7915;

    /* renamed from: ǃ  reason: contains not printable characters */
    private RadioButton f7916;

    /* renamed from: ȷ  reason: contains not printable characters */
    private Context f7917;

    /* renamed from: ɨ  reason: contains not printable characters */
    private boolean f7918;

    /* renamed from: ɩ  reason: contains not printable characters */
    private CheckBox f7919;

    /* renamed from: ɪ  reason: contains not printable characters */
    private Drawable f7920;

    /* renamed from: ɹ  reason: contains not printable characters */
    private TextView f7921;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f7922;

    /* renamed from: ɿ  reason: contains not printable characters */
    private LayoutInflater f7923;

    /* renamed from: Ι  reason: contains not printable characters */
    private ImageView f7924;

    /* renamed from: ι  reason: contains not printable characters */
    public C2459 f7925;

    /* renamed from: І  reason: contains not printable characters */
    private LinearLayout f7926;

    /* renamed from: і  reason: contains not printable characters */
    private ImageView f7927;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private Drawable f7928;

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f7929;

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m8844() {
        return false;
    }

    public C1475(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f153062130969100);
    }

    public C1475(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Context context2 = getContext();
        C1992 r2 = new C1992(context2, context2.obtainStyledAttributes(attributeSet, C2745.aux.f12875, i, 0));
        this.f7928 = r2.m10793(C2745.aux.f12915);
        int i2 = C2745.aux.f12932;
        this.f7922 = r2.f9934.getResourceId(1, -1);
        int i3 = C2745.aux.f12925;
        this.f7918 = r2.f9934.getBoolean(7, false);
        this.f7917 = context;
        this.f7920 = r2.m10793(C2745.aux.f12917);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.f150992130968888, 0);
        this.f7929 = obtainStyledAttributes.hasValue(0);
        r2.f9934.recycle();
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0293.m4199((View) this, this.f7928);
        this.f7913 = (TextView) findViewById(R.id.f167842131362399);
        int i = this.f7922;
        if (i != -1) {
            this.f7913.setTextAppearance(this.f7917, i);
        }
        this.f7921 = (TextView) findViewById(R.id.f167402131362331);
        this.f7915 = (ImageView) findViewById(R.id.f167502131362357);
        ImageView imageView = this.f7915;
        if (imageView != null) {
            imageView.setImageDrawable(this.f7920);
        }
        this.f7927 = (ImageView) findViewById(R.id.f165362131362073);
        this.f7926 = (LinearLayout) findViewById(R.id.f164932131361997);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m8842(o.C2459 r5) {
        /*
            r4 = this;
            r4.f7925 = r5
            boolean r0 = r5.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r0 = 0
            goto L_0x000f
        L_0x000d:
            r0 = 8
        L_0x000f:
            r4.setVisibility(r0)
            boolean r0 = r4.m8664()
            if (r0 == 0) goto L_0x001d
            java.lang.CharSequence r0 = r5.getTitleCondensed()
            goto L_0x0021
        L_0x001d:
            java.lang.CharSequence r0 = r5.getTitle()
        L_0x0021:
            r4.setTitle(r0)
            boolean r0 = r5.isCheckable()
            r4.setCheckable(r0)
            o.Ј r0 = r5.f11193
            boolean r0 = r0.m12142()
            if (r0 == 0) goto L_0x0044
            o.Ј r0 = r5.f11193
            boolean r0 = r0.m12134()
            if (r0 == 0) goto L_0x003e
            char r0 = r5.f11190
            goto L_0x0040
        L_0x003e:
            char r0 = r5.f11175
        L_0x0040:
            if (r0 == 0) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            o.Ј r3 = r5.f11193
            boolean r3 = r3.m12134()
            if (r3 == 0) goto L_0x0050
            char r3 = r5.f11190
            goto L_0x0052
        L_0x0050:
            char r3 = r5.f11175
        L_0x0052:
            r4.setShortcut(r0, r3)
            android.graphics.drawable.Drawable r0 = r5.getIcon()
            r4.setIcon(r0)
            boolean r0 = r5.isEnabled()
            r4.setEnabled(r0)
            boolean r0 = r5.hasSubMenu()
            android.widget.ImageView r3 = r4.f7915
            if (r3 == 0) goto L_0x0071
            if (r0 == 0) goto L_0x006e
            r1 = 0
        L_0x006e:
            r3.setVisibility(r1)
        L_0x0071:
            java.lang.CharSequence r5 = r5.getContentDescription()
            r4.setContentDescription(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1475.m8842(o.с):void");
    }

    public void setForceShowIcon(boolean z) {
        this.f7914 = z;
        this.f7918 = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f7913.setText(charSequence);
            if (this.f7913.getVisibility() != 0) {
                this.f7913.setVisibility(0);
            }
        } else if (this.f7913.getVisibility() != 8) {
            this.f7913.setVisibility(8);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2459 m8843() {
        return this.f7925;
    }

    public void setCheckable(boolean z) {
        View view;
        CompoundButton compoundButton;
        if (z || this.f7916 != null || this.f7919 != null) {
            if ((this.f7925.f11183 & 4) != 0) {
                if (this.f7916 == null) {
                    if (this.f7923 == null) {
                        this.f7923 = LayoutInflater.from(getContext());
                    }
                    this.f7916 = (RadioButton) this.f7923.inflate(R.layout.f168762131558417, this, false);
                    RadioButton radioButton = this.f7916;
                    LinearLayout linearLayout = this.f7926;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f7916;
                view = this.f7919;
            } else {
                if (this.f7919 == null) {
                    if (this.f7923 == null) {
                        this.f7923 = LayoutInflater.from(getContext());
                    }
                    this.f7919 = (CheckBox) this.f7923.inflate(R.layout.f168732131558414, this, false);
                    CheckBox checkBox = this.f7919;
                    LinearLayout linearLayout2 = this.f7926;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f7919;
                view = this.f7916;
            }
            if (z) {
                compoundButton.setChecked(this.f7925.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f7919;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f7916;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f7925.f11183 & 4) != 0) {
            if (this.f7916 == null) {
                if (this.f7923 == null) {
                    this.f7923 = LayoutInflater.from(getContext());
                }
                this.f7916 = (RadioButton) this.f7923.inflate(R.layout.f168762131558417, this, false);
                RadioButton radioButton = this.f7916;
                LinearLayout linearLayout = this.f7926;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f7916;
        } else {
            if (this.f7919 == null) {
                if (this.f7923 == null) {
                    this.f7923 = LayoutInflater.from(getContext());
                }
                this.f7919 = (CheckBox) this.f7923.inflate(R.layout.f168732131558414, this, false);
                CheckBox checkBox = this.f7919;
                LinearLayout linearLayout2 = this.f7926;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f7919;
        }
        compoundButton.setChecked(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r10 == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setShortcut(boolean r10, char r11) {
        /*
            r9 = this;
            r11 = 0
            r0 = 1
            r1 = 8
            if (r10 == 0) goto L_0x0025
            o.с r10 = r9.f7925
            o.Ј r2 = r10.f11193
            boolean r2 = r2.m12142()
            if (r2 == 0) goto L_0x0021
            o.Ј r2 = r10.f11193
            boolean r2 = r2.m12134()
            if (r2 == 0) goto L_0x001b
            char r10 = r10.f11190
            goto L_0x001d
        L_0x001b:
            char r10 = r10.f11175
        L_0x001d:
            if (r10 == 0) goto L_0x0021
            r10 = 1
            goto L_0x0022
        L_0x0021:
            r10 = 0
        L_0x0022:
            if (r10 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r11 = 8
        L_0x0027:
            if (r11 != 0) goto L_0x0100
            android.widget.TextView r10 = r9.f7921
            o.с r2 = r9.f7925
            o.Ј r3 = r2.f11193
            boolean r3 = r3.m12134()
            if (r3 == 0) goto L_0x0038
            char r3 = r2.f11190
            goto L_0x003a
        L_0x0038:
            char r3 = r2.f11175
        L_0x003a:
            if (r3 != 0) goto L_0x0040
            java.lang.String r0 = ""
            goto L_0x00fd
        L_0x0040:
            o.Ј r4 = r2.f11193
            android.content.Context r4 = r4.f10808
            android.content.res.Resources r4 = r4.getResources()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            o.Ј r6 = r2.f11193
            android.content.Context r6 = r6.f10808
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L_0x0065
            r6 = 2131886097(0x7f120011, float:1.9406763E38)
            java.lang.String r6 = r4.getString(r6)
            r5.append(r6)
        L_0x0065:
            o.Ј r6 = r2.f11193
            boolean r6 = r6.m12134()
            if (r6 == 0) goto L_0x0070
            int r2 = r2.f11189
            goto L_0x0072
        L_0x0070:
            int r2 = r2.f11167
        L_0x0072:
            r6 = 2131886093(0x7f12000d, float:1.9406755E38)
            java.lang.String r6 = r4.getString(r6)
            r7 = 65536(0x10000, float:9.18355E-41)
            r8 = r2 & r7
            if (r8 != r7) goto L_0x0082
            r5.append(r6)
        L_0x0082:
            r6 = 2131886089(0x7f120009, float:1.9406747E38)
            java.lang.String r6 = r4.getString(r6)
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r8 = 4096(0x1000, float:5.74E-42)
            if (r7 != r8) goto L_0x0092
            r5.append(r6)
        L_0x0092:
            r6 = 2131886088(0x7f120008, float:1.9406745E38)
            java.lang.String r6 = r4.getString(r6)
            r7 = r2 & 2
            r8 = 2
            if (r7 != r8) goto L_0x00a1
            r5.append(r6)
        L_0x00a1:
            r6 = 2131886094(0x7f12000e, float:1.9406757E38)
            java.lang.String r6 = r4.getString(r6)
            r7 = r2 & 1
            if (r7 != r0) goto L_0x00af
            r5.append(r6)
        L_0x00af:
            r0 = 2131886096(0x7f120010, float:1.9406761E38)
            java.lang.String r0 = r4.getString(r0)
            r6 = r2 & 4
            r7 = 4
            if (r6 != r7) goto L_0x00be
            r5.append(r0)
        L_0x00be:
            r0 = 2131886092(0x7f12000c, float:1.9406753E38)
            java.lang.String r0 = r4.getString(r0)
            r2 = r2 & r1
            if (r2 != r1) goto L_0x00cb
            r5.append(r0)
        L_0x00cb:
            if (r3 == r1) goto L_0x00ef
            r0 = 10
            if (r3 == r0) goto L_0x00e4
            r0 = 32
            if (r3 == r0) goto L_0x00d9
            r5.append(r3)
            goto L_0x00f9
        L_0x00d9:
            r0 = 2131886095(0x7f12000f, float:1.940676E38)
            java.lang.String r0 = r4.getString(r0)
            r5.append(r0)
            goto L_0x00f9
        L_0x00e4:
            r0 = 2131886091(0x7f12000b, float:1.9406751E38)
            java.lang.String r0 = r4.getString(r0)
            r5.append(r0)
            goto L_0x00f9
        L_0x00ef:
            r0 = 2131886090(0x7f12000a, float:1.940675E38)
            java.lang.String r0 = r4.getString(r0)
            r5.append(r0)
        L_0x00f9:
            java.lang.String r0 = r5.toString()
        L_0x00fd:
            r10.setText(r0)
        L_0x0100:
            android.widget.TextView r10 = r9.f7921
            int r10 = r10.getVisibility()
            if (r10 == r11) goto L_0x010d
            android.widget.TextView r10 = r9.f7921
            r10.setVisibility(r11)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1475.setShortcut(boolean, char):void");
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f7914;
        if (!z && !this.f7918) {
            return;
        }
        if (this.f7924 != null || drawable != null || this.f7918) {
            if (this.f7924 == null) {
                if (this.f7923 == null) {
                    this.f7923 = LayoutInflater.from(getContext());
                }
                this.f7924 = (ImageView) this.f7923.inflate(R.layout.f168742131558415, this, false);
                ImageView imageView = this.f7924;
                LinearLayout linearLayout = this.f7926;
                if (linearLayout != null) {
                    linearLayout.addView(imageView, 0);
                } else {
                    addView(imageView, 0);
                }
            }
            if (drawable != null || this.f7918) {
                ImageView imageView2 = this.f7924;
                if (!z) {
                    drawable = null;
                }
                imageView2.setImageDrawable(drawable);
                if (this.f7924.getVisibility() != 0) {
                    this.f7924.setVisibility(0);
                    return;
                }
                return;
            }
            this.f7924.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f7924 != null && this.f7918) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f7924.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f7927;
        if (imageView != null) {
            imageView.setVisibility((this.f7929 || !z) ? 8 : 0);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f7927;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7927.getLayoutParams();
            rect.top += this.f7927.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }
}
