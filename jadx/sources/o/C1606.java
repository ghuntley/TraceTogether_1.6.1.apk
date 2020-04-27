package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: o.ʃ  reason: contains not printable characters */
class C1606 {

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f8481 = false;

    /* renamed from: ǃ  reason: contains not printable characters */
    private ColorStateList f8482 = null;

    /* renamed from: ɩ  reason: contains not printable characters */
    private PorterDuff.Mode f8483 = null;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f8484;

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean f8485 = false;

    /* renamed from: ι  reason: contains not printable characters */
    private final CompoundButton f8486;

    C1606(CompoundButton compoundButton) {
        this.f8486 = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[SYNTHETIC, Splitter:B:12:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[Catch:{ all -> 0x0080 }] */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m9327(android.util.AttributeSet r4, int r5) {
        /*
            r3 = this;
            android.widget.CompoundButton r0 = r3.f8486
            android.content.Context r0 = r0.getContext()
            int[] r1 = o.C2745.aux.f12832
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = o.C2745.aux.f12796     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            int r5 = o.C2745.aux.f12796     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            android.widget.CompoundButton r0 = r3.f8486     // Catch:{ NotFoundException -> 0x002e }
            android.widget.CompoundButton r1 = r3.f8486     // Catch:{ NotFoundException -> 0x002e }
            android.content.Context r1 = r1.getContext()     // Catch:{ NotFoundException -> 0x002e }
            android.graphics.drawable.Drawable r5 = o.C3257Con.m1345(r1, r5)     // Catch:{ NotFoundException -> 0x002e }
            r0.setButtonDrawable(r5)     // Catch:{ NotFoundException -> 0x002e }
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r5 != 0) goto L_0x0050
            int r5 = o.C2745.aux.f12830     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            int r5 = o.C2745.aux.f12830     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            android.widget.CompoundButton r0 = r3.f8486     // Catch:{ all -> 0x0080 }
            android.widget.CompoundButton r1 = r3.f8486     // Catch:{ all -> 0x0080 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0080 }
            android.graphics.drawable.Drawable r5 = o.C3257Con.m1345(r1, r5)     // Catch:{ all -> 0x0080 }
            r0.setButtonDrawable(r5)     // Catch:{ all -> 0x0080 }
        L_0x0050:
            int r5 = o.C2745.aux.f12871     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0063
            android.widget.CompoundButton r5 = r3.f8486     // Catch:{ all -> 0x0080 }
            int r0 = o.C2745.aux.f12871     // Catch:{ all -> 0x0080 }
            android.content.res.ColorStateList r0 = r4.getColorStateList(r0)     // Catch:{ all -> 0x0080 }
            o.C0729.m5866(r5, r0)     // Catch:{ all -> 0x0080 }
        L_0x0063:
            int r5 = o.C2745.aux.f12851     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x007c
            android.widget.CompoundButton r5 = r3.f8486     // Catch:{ all -> 0x0080 }
            int r0 = o.C2745.aux.f12851     // Catch:{ all -> 0x0080 }
            r1 = -1
            int r0 = r4.getInt(r0, r1)     // Catch:{ all -> 0x0080 }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = o.C2674.m14214(r0, r1)     // Catch:{ all -> 0x0080 }
            o.C0729.m5868(r5, r0)     // Catch:{ all -> 0x0080 }
        L_0x007c:
            r4.recycle()
            return
        L_0x0080:
            r5 = move-exception
            r4.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1606.m9327(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m9329(ColorStateList colorStateList) {
        this.f8482 = colorStateList;
        this.f8481 = true;
        m9328();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public ColorStateList m9324() {
        return this.f8482;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m9326(PorterDuff.Mode mode) {
        this.f8483 = mode;
        this.f8485 = true;
        m9328();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m9325() {
        if (this.f8484) {
            this.f8484 = false;
            return;
        }
        this.f8484 = true;
        m9328();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m9328() {
        Drawable r0 = C0729.m5865(this.f8486);
        if (r0 == null) {
            return;
        }
        if (this.f8481 || this.f8485) {
            Drawable mutate = C1266.m8158(r0).mutate();
            if (this.f8481) {
                C1266.m8152(mutate, this.f8482);
            }
            if (this.f8485) {
                C1266.m8153(mutate, this.f8483);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f8486.getDrawableState());
            }
            this.f8486.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = o.C0729.m5865(r2.f8486);
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int m9323(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f8486
            android.graphics.drawable.Drawable r0 = o.C0729.m5865(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1606.m9323(int):int");
    }
}
