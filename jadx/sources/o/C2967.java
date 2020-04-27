package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.C0379;
import o.C0514;
import o.C3282auX;

/* renamed from: o.Ԑ  reason: contains not printable characters */
public class C2967 extends C2147 {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public static final C0406<Throwable> f13707 = new C0406<Throwable>() {
        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m15250(Object obj) {
            Throwable th = (Throwable) obj;
            if (C2467.m12718(th)) {
                C2414.m12462("Unable to load composition.");
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    };

    /* renamed from: ŀ  reason: contains not printable characters */
    private C0518<C0343> f13708;

    /* renamed from: ł  reason: contains not printable characters */
    private int f13709 = 0;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean f13710 = false;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public int f13711 = 0;

    /* renamed from: ȷ  reason: contains not printable characters */
    private boolean f13712 = true;

    /* renamed from: ɨ  reason: contains not printable characters */
    private boolean f13713 = false;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public C0406<Throwable> f13714;

    /* renamed from: ɪ  reason: contains not printable characters */
    private boolean f13715 = false;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f13716;

    /* renamed from: ɾ  reason: contains not printable characters */
    private boolean f13717 = false;

    /* renamed from: ʟ  reason: contains not printable characters */
    private C0343 f13718;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0406<C0343> f13719 = new C0406<C0343>() {
        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m15251(Object obj) {
            C2967.this.setComposition((C0343) obj);
        }
    };

    /* renamed from: ι  reason: contains not printable characters */
    private final C0406<Throwable> f13720 = new C0406<Throwable>() {
        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ void m15252(Object obj) {
            Throwable th = (Throwable) obj;
            if (C2967.this.f13711 != 0) {
                C2967 r0 = C2967.this;
                r0.setImageResource(r0.f13711);
            }
            (C2967.this.f13714 == null ? C2967.f13707 : C2967.this.f13714).m4688(th);
        }
    };

    /* renamed from: І  reason: contains not printable characters */
    private String f13721;

    /* renamed from: г  reason: contains not printable characters */
    private Set<C3282auX.Cif> f13722 = new HashSet();

    /* renamed from: і  reason: contains not printable characters */
    private boolean f13723;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C0379 f13724 = new C0379();

    /* renamed from: ӏ  reason: contains not printable characters */
    private C0511 f13725 = C0511.AUTOMATIC;

    public void setFontAssetDelegate(C2798 r1) {
    }

    public C2967(Context context) {
        super(context);
        m15244((AttributeSet) null);
    }

    public C2967(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15244(attributeSet);
    }

    public C2967(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15244(attributeSet);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m15244(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0514.Cif.f4260);
        boolean z = false;
        if (!isInEditMode()) {
            this.f13712 = obtainStyledAttributes.getBoolean(C0514.Cif.f4272, true);
            boolean hasValue = obtainStyledAttributes.hasValue(C0514.Cif.f4264);
            boolean hasValue2 = obtainStyledAttributes.hasValue(C0514.Cif.f4262);
            boolean hasValue3 = obtainStyledAttributes.hasValue(C0514.Cif.f4261);
            if (!hasValue || !hasValue2) {
                if (hasValue) {
                    int resourceId = obtainStyledAttributes.getResourceId(C0514.Cif.f4264, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else if (hasValue2) {
                    String string2 = obtainStyledAttributes.getString(C0514.Cif.f4262);
                    if (string2 != null) {
                        setAnimation(string2);
                    }
                } else if (hasValue3 && (string = obtainStyledAttributes.getString(C0514.Cif.f4261)) != null) {
                    setAnimationFromUrl(string);
                }
                setFallbackResource(obtainStyledAttributes.getResourceId(C0514.Cif.f4273, 0));
            } else {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        }
        if (obtainStyledAttributes.getBoolean(C0514.Cif.f4266, false)) {
            this.f13715 = true;
            this.f13717 = true;
        }
        if (obtainStyledAttributes.getBoolean(C0514.Cif.f4275, false)) {
            this.f13724.f3874.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(C0514.Cif.f4269)) {
            setRepeatMode(obtainStyledAttributes.getInt(C0514.Cif.f4269, 1));
        }
        if (obtainStyledAttributes.hasValue(C0514.Cif.f4265)) {
            setRepeatCount(obtainStyledAttributes.getInt(C0514.Cif.f4265, -1));
        }
        if (obtainStyledAttributes.hasValue(C0514.Cif.f4270)) {
            setSpeed(obtainStyledAttributes.getFloat(C0514.Cif.f4270, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(C0514.Cif.f4274));
        setProgress(obtainStyledAttributes.getFloat(C0514.Cif.f4268, 0.0f));
        this.f13724.m4613(obtainStyledAttributes.getBoolean(C0514.Cif.f4263, false));
        if (obtainStyledAttributes.hasValue(C0514.Cif.f4271)) {
            C0516 r0 = new C0516(obtainStyledAttributes.getColor(C0514.Cif.f4271, 0));
            m15247(new C1695("**"), C0349.f3761, new C2476(r0));
        }
        if (obtainStyledAttributes.hasValue(C0514.Cif.f4267)) {
            C0379 r02 = this.f13724;
            r02.f3889 = obtainStyledAttributes.getFloat(C0514.Cif.f4267, 1.0f);
            r02.m4602();
        }
        if (obtainStyledAttributes.hasValue(C0514.Cif.f4276)) {
            int i = obtainStyledAttributes.getInt(C0514.Cif.f4276, C0511.AUTOMATIC.ordinal());
            if (i >= C0511.values().length) {
                i = C0511.AUTOMATIC.ordinal();
            }
            setRenderMode(C0511.values()[i]);
        }
        if (getScaleType() != null) {
            this.f13724.f3890 = getScaleType();
        }
        obtainStyledAttributes.recycle();
        C0379 r8 = this.f13724;
        if (C2467.m12713(getContext()) != 0.0f) {
            z = true;
        }
        r8.f3888 = z;
        m15243();
        this.f13723 = true;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C0379 r1 = this.f13724;
        if (drawable2 == r1) {
            super.invalidateDrawable(r1);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z;
        C2968 r1 = new C2968(super.onSaveInstanceState());
        r1.f13731 = this.f13721;
        r1.f13730 = this.f13716;
        r1.f13729 = this.f13724.f3874.m13639();
        C0379 r0 = this.f13724;
        boolean z2 = false;
        if (r0.f3874 == null) {
            z = false;
        } else {
            z = r0.f3874.isRunning();
        }
        if (z || (!C0293.m4187(this) && this.f13715)) {
            z2 = true;
        }
        r1.f13732 = z2;
        r1.f13733 = this.f13724.f3877;
        r1.f13735 = this.f13724.f3874.getRepeatMode();
        r1.f13734 = this.f13724.f3874.getRepeatCount();
        return r1;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2968)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2968 r3 = (C2968) parcelable;
        super.onRestoreInstanceState(r3.getSuperState());
        this.f13721 = r3.f13731;
        if (!TextUtils.isEmpty(this.f13721)) {
            setAnimation(this.f13721);
        }
        this.f13716 = r3.f13730;
        int i = this.f13716;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(r3.f13729);
        if (r3.f13732) {
            if (isShown()) {
                this.f13724.m4597();
                m15243();
            } else {
                this.f13710 = true;
            }
        }
        this.f13724.f3877 = r3.f13733;
        setRepeatMode(r3.f13735);
        setRepeatCount(r3.f13734);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        boolean z;
        if (this.f13723) {
            if (isShown()) {
                if (this.f13713) {
                    if (isShown()) {
                        this.f13724.m4611();
                        m15243();
                    } else {
                        this.f13710 = false;
                        this.f13713 = true;
                    }
                } else if (this.f13710) {
                    if (isShown()) {
                        this.f13724.m4597();
                        m15243();
                    } else {
                        this.f13710 = true;
                    }
                }
                this.f13713 = false;
                this.f13710 = false;
                return;
            }
            C0379 r3 = this.f13724;
            if (r3.f3874 == null) {
                z = false;
            } else {
                z = r3.f3874.isRunning();
            }
            if (z) {
                this.f13717 = false;
                this.f13715 = false;
                this.f13713 = false;
                this.f13710 = false;
                C0379 r32 = this.f13724;
                r32.f3892.clear();
                C2560 r33 = r32.f3874;
                Choreographer.getInstance().removeFrameCallback(r33);
                r33.f11677 = false;
                m15243();
                this.f13713 = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13717 || this.f13715) {
            if (isShown()) {
                this.f13724.m4597();
                m15243();
            } else {
                this.f13710 = true;
            }
            this.f13717 = false;
            this.f13715 = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    public void setCacheComposition(boolean z) {
        this.f13712 = z;
    }

    public void setAnimation(int i) {
        this.f13716 = i;
        this.f13721 = null;
        C0518<C0343> r3 = this.f13712 ? C3048.m15548(getContext(), i) : C3048.m15551(getContext(), i);
        this.f13718 = null;
        this.f13724.m4606();
        C0518<C0343> r0 = this.f13708;
        if (r0 != null) {
            r0.m4988(this.f13719);
            this.f13708.m4989(this.f13720);
        }
        this.f13708 = r3.m4987(this.f13719).m4986(this.f13720);
    }

    public void setAnimation(String str) {
        this.f13721 = str;
        this.f13716 = 0;
        C0518<C0343> r3 = this.f13712 ? C3048.m15552(getContext(), str) : C3048.m15558(getContext(), str);
        this.f13718 = null;
        this.f13724.m4606();
        C0518<C0343> r0 = this.f13708;
        if (r0 != null) {
            r0.m4988(this.f13719);
            this.f13708.m4989(this.f13720);
        }
        this.f13708 = r3.m4987(this.f13719).m4986(this.f13720);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, (String) null);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimation(InputStream inputStream, String str) {
        C0518<C0343> r2 = C3048.m15554(inputStream, str);
        this.f13718 = null;
        this.f13724.m4606();
        C0518<C0343> r3 = this.f13708;
        if (r3 != null) {
            r3.m4988(this.f13719);
            this.f13708.m4989(this.f13720);
        }
        this.f13708 = r2.m4987(this.f13719).m4986(this.f13720);
    }

    public void setAnimationFromUrl(String str) {
        C0518<C0343> r3 = this.f13712 ? C3048.m15549(getContext(), str) : C3048.m15553(getContext(), str, (String) null);
        this.f13718 = null;
        this.f13724.m4606();
        C0518<C0343> r0 = this.f13708;
        if (r0 != null) {
            r0.m4988(this.f13719);
            this.f13708.m4989(this.f13720);
        }
        this.f13708 = r3.m4987(this.f13719).m4986(this.f13720);
    }

    public void setAnimationFromUrl(String str, String str2) {
        C0518<C0343> r2 = C3048.m15553(getContext(), str, str2);
        this.f13718 = null;
        this.f13724.m4606();
        C0518<C0343> r3 = this.f13708;
        if (r3 != null) {
            r3.m4988(this.f13719);
            this.f13708.m4989(this.f13720);
        }
        this.f13708 = r2.m4987(this.f13719).m4986(this.f13720);
    }

    public void setFailureListener(C0406<Throwable> r1) {
        this.f13714 = r1;
    }

    public void setFallbackResource(int i) {
        this.f13711 = i;
    }

    public void setComposition(C0343 r8) {
        boolean z = C2921.f13541;
        this.f13724.setCallback(this);
        this.f13718 = r8;
        C0379 r0 = this.f13724;
        boolean z2 = true;
        boolean z3 = false;
        if (r0.f3879 == r8) {
            z2 = false;
        } else {
            r0.f3876 = false;
            r0.m4606();
            r0.f3879 = r8;
            r0.f3881 = new C1646(r0, C2056.m10952(r0.f3879), r0.f3879.f3723, r0.f3879);
            C2560 r1 = r0.f3874;
            if (r1.f11675 == null) {
                z3 = true;
            }
            r1.f11675 = r8;
            if (z3) {
                r1.m13641((float) ((int) Math.max(r1.f11670, r8.f3725)), (float) ((int) Math.min(r1.f11676, r8.f3730)));
            } else {
                r1.m13641((float) ((int) r8.f3725), (float) ((int) r8.f3730));
            }
            float f = r1.f11673;
            r1.f11673 = 0.0f;
            r1.m13640((float) ((int) f));
            r1.m12364();
            r0.m4598(r0.f3874.getAnimatedFraction());
            r0.f3889 = r0.f3889;
            r0.m4602();
            r0.m4602();
            Iterator it = new ArrayList(r0.f3892).iterator();
            while (it.hasNext()) {
                ((C0379.C0380) it.next()).m4628();
                it.remove();
            }
            r0.f3892.clear();
            r8.f3731.f4059 = r0.f3880;
            Drawable.Callback callback = r0.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable((Drawable) null);
                imageView.setImageDrawable(r0);
            }
        }
        m15243();
        if (getDrawable() != this.f13724 || z2) {
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<C3282auX.Cif> it2 = this.f13722.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15248() {
        if (isShown()) {
            this.f13724.m4597();
            m15243();
            return;
        }
        this.f13710 = true;
    }

    public void setMinFrame(int i) {
        this.f13724.m4599(i);
    }

    public void setMinProgress(float f) {
        this.f13724.m4607(f);
    }

    public void setMaxFrame(int i) {
        this.f13724.m4609(i);
    }

    public void setMaxProgress(float f) {
        this.f13724.m4603(f);
    }

    public void setMinFrame(String str) {
        this.f13724.m4610(str);
    }

    public void setMaxFrame(String str) {
        this.f13724.m4595(str);
    }

    public void setMinAndMaxFrame(String str) {
        this.f13724.m4600(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.f13724.m4605(str, str2, z);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.f13724.m4604(i, i2);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.f13724.m4608(f, f2);
    }

    public void setSpeed(float f) {
        this.f13724.f3874.f11672 = f;
    }

    public void setRepeatMode(int i) {
        this.f13724.f3874.setRepeatMode(i);
    }

    public void setRepeatCount(int i) {
        this.f13724.f3874.setRepeatCount(i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m15249() {
        C0379 r0 = this.f13724;
        if (r0.f3874 == null) {
            return false;
        }
        return r0.f3874.isRunning();
    }

    public void setImageAssetsFolder(String str) {
        this.f13724.f3877 = str;
    }

    public void setImageAssetDelegate(C2998 r3) {
        C0379 r0 = this.f13724;
        r0.f3884 = r3;
        if (r0.f3893 != null) {
            r0.f3893.f7093 = r3;
        }
    }

    public void setTextDelegate(C0548 r2) {
        this.f13724.f3885 = r2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private <T> void m15247(C1695 r2, T t, C2476<T> r4) {
        this.f13724.m4596(r2, t, r4);
    }

    public void setScale(float f) {
        C0379 r0 = this.f13724;
        r0.f3889 = f;
        r0.m4602();
        if (getDrawable() == this.f13724) {
            setImageDrawable((Drawable) null);
            setImageDrawable(this.f13724);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        C0379 r0 = this.f13724;
        if (r0 != null) {
            r0.f3890 = scaleType;
        }
    }

    public void setFrame(int i) {
        this.f13724.m4612(i);
    }

    public void setProgress(float f) {
        this.f13724.m4598(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        C0379 r0 = this.f13724;
        r0.f3880 = z;
        if (r0.f3879 != null) {
            r0.f3879.f3731.f4059 = z;
        }
    }

    public void setSafeMode(boolean z) {
        this.f13724.f3882 = z;
    }

    public void buildDrawingCache(boolean z) {
        C2921.m15081();
        this.f13709++;
        super.buildDrawingCache(z);
        if (this.f13709 == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(C0511.HARDWARE);
        }
        this.f13709--;
        C2921.m15080();
    }

    public void setRenderMode(C0511 r1) {
        this.f13725 = r1;
        m15243();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f13724.f3887 = z;
    }

    /* renamed from: o.Ԑ$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: ı  reason: contains not printable characters */
        static final /* synthetic */ int[] f13728 = new int[C0511.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                o.ŀΙ[] r0 = o.C0511.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13728 = r0
                int[] r0 = f13728     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.ŀΙ r1 = o.C0511.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f13728     // Catch:{ NoSuchFieldError -> 0x001f }
                o.ŀΙ r1 = o.C0511.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f13728     // Catch:{ NoSuchFieldError -> 0x002a }
                o.ŀΙ r1 = o.C0511.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C2967.AnonymousClass5.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (r3 != false) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: Ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15243() {
        /*
            r5 = this;
            int[] r0 = o.C2967.AnonymousClass5.f13728
            o.ŀΙ r1 = r5.f13725
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x0038
            if (r0 == r1) goto L_0x0039
            r3 = 3
            if (r0 == r3) goto L_0x0014
            goto L_0x0039
        L_0x0014:
            o.ıɭ r0 = r5.f13718
            r3 = 0
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.f3728
            if (r0 == 0) goto L_0x0024
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L_0x0024
            goto L_0x0036
        L_0x0024:
            o.ıɭ r0 = r5.f13718
            if (r0 == 0) goto L_0x002e
            int r0 = r0.f3736
            r4 = 4
            if (r0 <= r4) goto L_0x002e
            goto L_0x0036
        L_0x002e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 >= r4) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r3 = 1
        L_0x0036:
            if (r3 == 0) goto L_0x0039
        L_0x0038:
            r2 = 2
        L_0x0039:
            int r0 = r5.getLayerType()
            if (r2 == r0) goto L_0x0043
            r0 = 0
            r5.setLayerType(r2, r0)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2967.m15243():void");
    }

    /* renamed from: o.Ԑ$ı  reason: contains not printable characters */
    static class C2968 extends View.BaseSavedState {
        public static final Parcelable.Creator<C2968> CREATOR = new Parcelable.Creator<C2968>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C2968[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C2968(parcel, (byte) 0);
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        float f13729;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f13730;

        /* renamed from: ɩ  reason: contains not printable characters */
        String f13731;

        /* renamed from: Ι  reason: contains not printable characters */
        boolean f13732;

        /* renamed from: ι  reason: contains not printable characters */
        String f13733;

        /* renamed from: І  reason: contains not printable characters */
        int f13734;

        /* renamed from: і  reason: contains not printable characters */
        int f13735;

        /* synthetic */ C2968(Parcel parcel, byte b) {
            this(parcel);
        }

        C2968(Parcelable parcelable) {
            super(parcelable);
        }

        private C2968(Parcel parcel) {
            super(parcel);
            this.f13731 = parcel.readString();
            this.f13729 = parcel.readFloat();
            this.f13732 = parcel.readInt() != 1 ? false : true;
            this.f13733 = parcel.readString();
            this.f13735 = parcel.readInt();
            this.f13734 = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f13731);
            parcel.writeFloat(this.f13729);
            parcel.writeInt(this.f13732 ? 1 : 0);
            parcel.writeString(this.f13733);
            parcel.writeInt(this.f13735);
            parcel.writeInt(this.f13734);
        }
    }

    public void setImageResource(int i) {
        C0518<C0343> r0 = this.f13708;
        if (r0 != null) {
            r0.m4988(this.f13719);
            this.f13708.m4989(this.f13720);
        }
        super.setImageResource(i);
    }

    public void setImageDrawable(Drawable drawable) {
        C0518<C0343> r0 = this.f13708;
        if (r0 != null) {
            r0.m4988(this.f13719);
            this.f13708.m4989(this.f13720);
        }
        super.setImageDrawable(drawable);
    }

    public void setImageBitmap(Bitmap bitmap) {
        C0518<C0343> r0 = this.f13708;
        if (r0 != null) {
            r0.m4988(this.f13719);
            this.f13708.m4989(this.f13720);
        }
        super.setImageBitmap(bitmap);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        boolean z;
        C0379 r0 = this.f13724;
        if (r0.f3874 == null) {
            z = false;
        } else {
            z = r0.f3874.isRunning();
        }
        if (z) {
            this.f13715 = false;
            this.f13713 = false;
            this.f13710 = false;
            C0379 r02 = this.f13724;
            r02.f3892.clear();
            r02.f3874.cancel();
            m15243();
            this.f13715 = true;
        }
        super.onDetachedFromWindow();
    }
}
