package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: Ɩ  reason: contains not printable characters */
    static final PorterDuff.Mode f185 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ı  reason: contains not printable characters */
    Object f186;

    /* renamed from: ǃ  reason: contains not printable characters */
    public byte[] f187 = null;

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f188 = 0;

    /* renamed from: ɹ  reason: contains not printable characters */
    public int f189 = 0;

    /* renamed from: Ι  reason: contains not printable characters */
    public Parcelable f190 = null;

    /* renamed from: ι  reason: contains not printable characters */
    public int f191 = -1;

    /* renamed from: І  reason: contains not printable characters */
    PorterDuff.Mode f192 = f185;

    /* renamed from: і  reason: contains not printable characters */
    public ColorStateList f193 = null;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public String f194 = null;

    /* renamed from: ı  reason: contains not printable characters */
    private static String m161(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    /* renamed from: ı  reason: contains not printable characters */
    public String m164() {
        if (this.f191 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m162((Icon) this.f186);
        }
        if (this.f191 == 2) {
            return ((String) this.f186).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on ".concat(String.valueOf(this)));
    }

    public int c_() {
        if (this.f191 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m163((Icon) this.f186);
        }
        if (this.f191 == 2) {
            return this.f188;
        }
        throw new IllegalStateException("called getResId() on ".concat(String.valueOf(this)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != 5) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f191
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f186
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f191
            java.lang.String r1 = m161(r1)
            r0.append(r1)
            int r1 = r4.f191
            r2 = 1
            if (r1 == r2) goto L_0x007a
            r3 = 2
            if (r1 == r3) goto L_0x0052
            r2 = 3
            if (r1 == r2) goto L_0x0039
            r2 = 4
            if (r1 == r2) goto L_0x002e
            r2 = 5
            if (r1 == r2) goto L_0x007a
            goto L_0x009a
        L_0x002e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f186
            r0.append(r1)
            goto L_0x009a
        L_0x0039:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f188
            r0.append(r1)
            int r1 = r4.f189
            if (r1 == 0) goto L_0x009a
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f189
            r0.append(r1)
            goto L_0x009a
        L_0x0052:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.m164()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.c_()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x009a
        L_0x007a:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f186
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f186
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        L_0x009a:
            android.content.res.ColorStateList r1 = r4.f193
            if (r1 == 0) goto L_0x00a8
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f193
            r0.append(r1)
        L_0x00a8:
            android.graphics.PorterDuff$Mode r1 = r4.f192
            android.graphics.PorterDuff$Mode r2 = f185
            if (r1 == r2) goto L_0x00b8
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f192
            r0.append(r1)
        L_0x00b8:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m165(boolean z) {
        this.f194 = this.f192.name();
        int i = this.f191;
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    this.f187 = ((String) this.f186).getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i == 3) {
                    this.f187 = (byte[]) this.f186;
                    return;
                } else if (i == 4) {
                    this.f187 = this.f186.toString().getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            if (z) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((Bitmap) this.f186).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f187 = byteArrayOutputStream.toByteArray();
                return;
            }
            this.f190 = (Parcelable) this.f186;
        } else if (!z) {
            this.f190 = (Parcelable) this.f186;
        } else {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m166() {
        this.f192 = PorterDuff.Mode.valueOf(this.f194);
        int i = this.f191;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f186 = this.f187;
                        return;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                this.f186 = new String(this.f187, Charset.forName("UTF-16"));
                return;
            }
            Parcelable parcelable = this.f190;
            if (parcelable != null) {
                this.f186 = parcelable;
                return;
            }
            byte[] bArr = this.f187;
            this.f186 = bArr;
            this.f191 = 3;
            this.f188 = 0;
            this.f189 = bArr.length;
            return;
        }
        Parcelable parcelable2 = this.f190;
        if (parcelable2 != null) {
            this.f186 = parcelable2;
            return;
        }
        throw new IllegalArgumentException("Invalid icon");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m162(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static int m163(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }
}
