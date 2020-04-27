package o;

import androidx.media.AudioAttributesCompat;
import java.util.Arrays;
import o.C0712;

/* renamed from: o.ıт  reason: contains not printable characters */
public class C0421 implements C0712.C0713 {

    /* renamed from: ı  reason: contains not printable characters */
    public int f4001 = 0;

    /* renamed from: ǃ  reason: contains not printable characters */
    public int f4002 = -1;

    /* renamed from: Ι  reason: contains not printable characters */
    public int f4003 = 0;

    /* renamed from: ι  reason: contains not printable characters */
    public int f4004 = 0;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4004), Integer.valueOf(this.f4001), Integer.valueOf(this.f4003), Integer.valueOf(this.f4002)});
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0421)) {
            return false;
        }
        C0421 r6 = (C0421) obj;
        if (this.f4004 == r6.f4004) {
            int i = this.f4001;
            int i2 = r6.f4001;
            int i3 = r6.f4002;
            if (i3 == -1) {
                i3 = AudioAttributesCompat.m218(false, i2, r6.f4003);
            }
            if (i3 == 6) {
                i2 |= 4;
            } else if (i3 == 7) {
                i2 |= 1;
            }
            if (i == (i2 & 273) && this.f4003 == r6.f4003 && this.f4002 == r6.f4002) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f4002 != -1) {
            sb.append(" stream=");
            sb.append(this.f4002);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m217(this.f4003));
        sb.append(" content=");
        sb.append(this.f4004);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f4001).toUpperCase());
        return sb.toString();
    }
}
