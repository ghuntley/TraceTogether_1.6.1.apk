package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import o.C1483;
import o.C2328;
import o.C2745;

/* renamed from: o.Τ  reason: contains not printable characters */
public final class C1920 implements C2717 {

    /* renamed from: ı  reason: contains not printable characters */
    boolean f9680;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private Drawable f9681;

    /* renamed from: ǃ  reason: contains not printable characters */
    C2026 f9682;

    /* renamed from: ȷ  reason: contains not printable characters */
    private C2348 f9683;

    /* renamed from: ɨ  reason: contains not printable characters */
    private CharSequence f9684;

    /* renamed from: ɩ  reason: contains not printable characters */
    CharSequence f9685;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f9686;

    /* renamed from: ɹ  reason: contains not printable characters */
    private View f9687;

    /* renamed from: ɾ  reason: contains not printable characters */
    private CharSequence f9688;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f9689;

    /* renamed from: ι  reason: contains not printable characters */
    Window.Callback f9690;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f9691;

    /* renamed from: і  reason: contains not printable characters */
    private Drawable f9692;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private Drawable f9693;

    /* renamed from: ӏ  reason: contains not printable characters */
    private Drawable f9694;

    public C1920(C2026 r2, boolean z) {
        this(r2, z, (byte) 0);
    }

    private C1920(C2026 r6, boolean z, byte b) {
        String str;
        Drawable drawable;
        this.f9686 = 0;
        this.f9682 = r6;
        this.f9685 = r6.f10043;
        this.f9688 = r6.f10013;
        this.f9691 = this.f9685 != null;
        CharSequence charSequence = null;
        this.f9681 = r6.f10012 != null ? r6.f10012.getDrawable() : null;
        Context context = r6.getContext();
        C1992 r3 = new C1992(context, context.obtainStyledAttributes((AttributeSet) null, C2745.aux.f12818, R.attr.f148162130968582, 0));
        this.f9694 = r3.m10793(C2745.aux.f13010);
        if (z) {
            int i = C2745.aux.f12964;
            CharSequence text = r3.f9934.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f9691 = true;
                this.f9685 = text;
                if ((this.f9689 & 8) != 0) {
                    this.f9682.setTitle(text);
                }
            }
            int i2 = C2745.aux.f12885;
            CharSequence text2 = r3.f9934.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f9688 = text2;
                if ((this.f9689 & 8) != 0) {
                    this.f9682.setSubtitle(text2);
                }
            }
            Drawable r62 = r3.m10793(C2745.aux.f12852);
            if (r62 != null) {
                this.f9692 = r62;
                m10418();
            }
            Drawable r63 = r3.m10793(C2745.aux.f12837);
            if (r63 != null) {
                this.f9693 = r63;
                m10418();
            }
            if (this.f9681 == null && (drawable = this.f9694) != null) {
                this.f9681 = drawable;
                m10419();
            }
            int i3 = C2745.aux.f13000;
            m10429(r3.f9934.getInt(10, 0));
            int i4 = C2745.aux.f12873;
            int resourceId = r3.f9934.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(this.f9682.getContext()).inflate(resourceId, this.f9682, false);
                View view = this.f9687;
                if (!(view == null || (this.f9689 & 16) == 0)) {
                    this.f9682.removeView(view);
                }
                this.f9687 = inflate;
                if (!(inflate == null || (this.f9689 & 16) == 0)) {
                    this.f9682.addView(this.f9687);
                }
                m10429(this.f9689 | 16);
            }
            int i5 = C2745.aux.f12806;
            int layoutDimension = r3.f9934.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.f9682.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.f9682.setLayoutParams(layoutParams);
            }
            int i6 = C2745.aux.f12980;
            int dimensionPixelOffset = r3.f9934.getDimensionPixelOffset(7, -1);
            int i7 = C2745.aux.f12926;
            int dimensionPixelOffset2 = r3.f9934.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                this.f9682.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int i8 = C2745.aux.f12901;
            int resourceId2 = r3.f9934.getResourceId(28, 0);
            if (resourceId2 != 0) {
                C2026 r7 = this.f9682;
                r7.setTitleTextAppearance(r7.getContext(), resourceId2);
            }
            int i9 = C2745.aux.f12801;
            int resourceId3 = r3.f9934.getResourceId(26, 0);
            if (resourceId3 != 0) {
                C2026 r72 = this.f9682;
                r72.setSubtitleTextAppearance(r72.getContext(), resourceId3);
            }
            int i10 = C2745.aux.f12867;
            int resourceId4 = r3.f9934.getResourceId(22, 0);
            if (resourceId4 != 0) {
                this.f9682.setPopupTheme(resourceId4);
            }
        } else {
            int i11 = 11;
            C2026 r73 = this.f9682;
            if ((r73.f10012 != null ? r73.f10012.getDrawable() : null) != null) {
                i11 = 15;
                C2026 r74 = this.f9682;
                this.f9694 = r74.f10012 != null ? r74.f10012.getDrawable() : null;
            }
            this.f9689 = i11;
        }
        r3.f9934.recycle();
        if (R.string.f170102131886081 != this.f9686) {
            this.f9686 = R.string.f170102131886081;
            C2026 r64 = this.f9682;
            if (TextUtils.isEmpty(r64.f10012 != null ? r64.f10012.getContentDescription() : null)) {
                int i12 = this.f9686;
                if (i12 == 0) {
                    str = null;
                } else {
                    str = this.f9682.getContext().getString(i12);
                }
                this.f9684 = str;
                m10420();
            }
        }
        C2026 r65 = this.f9682;
        this.f9684 = r65.f10012 != null ? r65.f10012.getContentDescription() : charSequence;
        this.f9682.setNavigationOnClickListener(new View.OnClickListener() {

            /* renamed from: ı  reason: contains not printable characters */
            final C0836 f9695 = new C0836(C1920.this.f9682.getContext(), C1920.this.f9685);

            public final void onClick(View view) {
                if (C1920.this.f9690 != null && C1920.this.f9680) {
                    C1920.this.f9690.onMenuItemSelected(0, this.f9695);
                }
            }
        });
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final ViewGroup m10436() {
        return this.f9682;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Context m10424() {
        return this.f9682.getContext();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m10422() {
        C2026 r0 = this.f9682;
        return (r0.f10025 == null || r0.f10025.f10048 == null) ? false : true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m10440() {
        C2026 r0 = this.f9682;
        C2459 r02 = r0.f10025 == null ? null : r0.f10025.f10048;
        if (r02 != null) {
            r02.collapseActionView();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m10431(Window.Callback callback) {
        this.f9690 = callback;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10427(CharSequence charSequence) {
        if (!this.f9691) {
            this.f9685 = charSequence;
            if ((this.f9689 & 8) != 0) {
                this.f9682.setTitle(charSequence);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10438(CharSequence charSequence) {
        this.f9691 = true;
        this.f9685 = charSequence;
        if ((this.f9689 & 8) != 0) {
            this.f9682.setTitle(charSequence);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m10430(Drawable drawable) {
        this.f9693 = drawable;
        m10418();
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    private void m10418() {
        Drawable drawable;
        int i = this.f9689;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f9692;
            if (drawable == null) {
                drawable = this.f9693;
            }
        } else {
            drawable = this.f9693;
        }
        this.f9682.setLogo(drawable);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m10432() {
        C2026 r0 = this.f9682;
        return r0.getVisibility() == 0 && r0.f10004 != null && r0.f10004.f10252;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final boolean m10434() {
        return this.f9682.B_();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[RETURN] */
    /* renamed from: І  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m10442() {
        /*
            r4 = this;
            o.ιι r0 = r4.f9682
            o.τ r1 = r0.f10004
            r2 = 0
            if (r1 == 0) goto L_0x0026
            o.τ r0 = r0.f10004
            o.Г r1 = r0.f10244
            r3 = 1
            if (r1 == 0) goto L_0x0022
            o.Г r0 = r0.f10244
            o.Г$ǃ r1 = r0.f10874
            if (r1 != 0) goto L_0x001d
            boolean r0 = r0.m12286()
            if (r0 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r0 = 0
            goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r0 == 0) goto L_0x0026
            return r3
        L_0x0026:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1920.m10442():boolean");
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final boolean m10444() {
        return this.f9682.m10873();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final boolean m10423() {
        C2026 r0 = this.f9682;
        if (r0.f10004 != null) {
            C2118 r02 = r0.f10004;
            if (r02.f10244 != null && r02.f10244.m12291()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m10443() {
        this.f9680 = true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10426(Menu menu, C1483.C1484 r4) {
        if (this.f9683 == null) {
            this.f9683 = new C2348(this.f9682.getContext());
            this.f9683.f6338 = R.id.f164362131361911;
        }
        C2348 r0 = this.f9683;
        r0.f6330 = r4;
        this.f9682.setMenu((C2328) menu, r0);
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final void m10433() {
        C2026 r0 = this.f9682;
        if (r0.f10004 != null) {
            C2118 r02 = r0.f10004;
            if (r02.f10244 != null) {
                C2348 r03 = r02.f10244;
                r03.m12291();
                if (r03.f10867 != null) {
                    r03.f10867.m14216();
                }
            }
        }
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final int m10435() {
        return this.f9689;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m10429(int i) {
        View view;
        int i2 = this.f9689 ^ i;
        this.f9689 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m10420();
                }
                m10419();
            }
            if ((i2 & 3) != 0) {
                m10418();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f9682.setTitle(this.f9685);
                    this.f9682.setSubtitle(this.f9688);
                } else {
                    this.f9682.setTitle((CharSequence) null);
                    this.f9682.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f9687) != null) {
                if ((i & 16) != 0) {
                    this.f9682.addView(view);
                } else {
                    this.f9682.removeView(view);
                }
            }
        }
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final void m10428() {
        this.f9682.setCollapsible(false);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0358 m10421(final int i, long j) {
        return C0293.m4169(this.f9682).m4526(i == 0 ? 1.0f : 0.0f).m4531(j).m4533((C0300) new C0321() {

            /* renamed from: Ι  reason: contains not printable characters */
            private boolean f9699 = false;

            /* renamed from: Ι  reason: contains not printable characters */
            public final void m10448(View view) {
                C1920.this.f9682.setVisibility(0);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m10447(View view) {
                if (!this.f9699) {
                    C1920.this.f9682.setVisibility(i);
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m10446(View view) {
                this.f9699 = true;
            }
        });
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    private void m10419() {
        if ((this.f9689 & 4) != 0) {
            C2026 r0 = this.f9682;
            Drawable drawable = this.f9681;
            if (drawable == null) {
                drawable = this.f9694;
            }
            r0.setNavigationIcon(drawable);
            return;
        }
        this.f9682.setNavigationIcon((Drawable) null);
    }

    /* renamed from: г  reason: contains not printable characters */
    private void m10420() {
        if ((this.f9689 & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f9684)) {
            this.f9682.setNavigationContentDescription(this.f9686);
        } else {
            this.f9682.setNavigationContentDescription(this.f9684);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10425(int i) {
        this.f9682.setVisibility(i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10439(C1483.C1484 r2, C2328.Cif ifVar) {
        this.f9682.setMenuCallbacks(r2, ifVar);
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final Menu m10445() {
        C2026 r0 = this.f9682;
        r0.m10872();
        return r0.f10004.m11283();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m10441(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C3257Con.m1345(this.f9682.getContext(), i);
        } else {
            drawable = null;
        }
        this.f9693 = drawable;
        m10418();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10437(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C3257Con.m1345(this.f9682.getContext(), i);
        } else {
            drawable = null;
        }
        this.f9692 = drawable;
        m10418();
    }
}
