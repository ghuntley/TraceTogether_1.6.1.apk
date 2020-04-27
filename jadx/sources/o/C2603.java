package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* renamed from: o.іг  reason: contains not printable characters */
public final class C2603 extends C2620 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final int f11850;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Parcel f11851;

    /* renamed from: ȷ  reason: contains not printable characters */
    private int f11852;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f11853;

    /* renamed from: ι  reason: contains not printable characters */
    private final SparseIntArray f11854;

    /* renamed from: І  reason: contains not printable characters */
    private final int f11855;

    /* renamed from: і  reason: contains not printable characters */
    private int f11856;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final String f11857;

    public C2603(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0299(), new C0299(), new C0299());
    }

    private C2603(Parcel parcel, int i, int i2, String str, C0299<String, Method> r5, C0299<String, Method> r6, C0299<String, Class> r7) {
        super(r5, r6, r7);
        this.f11854 = new SparseIntArray();
        this.f11853 = -1;
        this.f11856 = 0;
        this.f11852 = -1;
        this.f11851 = parcel;
        this.f11850 = i;
        this.f11855 = i2;
        this.f11856 = this.f11850;
        this.f11857 = str;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m13810(int i) {
        while (this.f11856 < this.f11855) {
            int i2 = this.f11852;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f11851.setDataPosition(this.f11856);
            int readInt = this.f11851.readInt();
            this.f11852 = this.f11851.readInt();
            this.f11856 += readInt;
        }
        return this.f11852 == i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m13804(int i) {
        m13802();
        this.f11853 = i;
        this.f11854.put(i, this.f11851.dataPosition());
        this.f11851.writeInt(0);
        this.f11851.writeInt(i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m13802() {
        int i = this.f11853;
        if (i >= 0) {
            int i2 = this.f11854.get(i);
            int dataPosition = this.f11851.dataPosition();
            this.f11851.setDataPosition(i2);
            this.f11851.writeInt(dataPosition - i2);
            this.f11851.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final C2620 m13800() {
        Parcel parcel = this.f11851;
        int dataPosition = parcel.dataPosition();
        int i = this.f11856;
        if (i == this.f11850) {
            i = this.f11855;
        }
        int i2 = i;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11857);
        sb.append("  ");
        return new C2603(parcel, dataPosition, i2, sb.toString(), this.f11955, this.f11954, this.f11956);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m13809(byte[] bArr) {
        if (bArr != null) {
            this.f11851.writeInt(bArr.length);
            this.f11851.writeByteArray(bArr);
            return;
        }
        this.f11851.writeInt(-1);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m13812(int i) {
        this.f11851.writeInt(i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m13813(String str) {
        this.f11851.writeString(str);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m13803(Parcelable parcelable) {
        this.f11851.writeParcelable(parcelable, 0);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m13801(boolean z) {
        this.f11851.writeInt(z ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m13805(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f11851, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: І  reason: contains not printable characters */
    public final CharSequence m13814() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f11851);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m13811() {
        return this.f11851.readInt();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m13808() {
        return this.f11851.readString();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final byte[] m13806() {
        int readInt = this.f11851.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f11851.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final <T extends Parcelable> T m13815() {
        return this.f11851.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final boolean m13807() {
        return this.f11851.readInt() != 0;
    }
}
