package o;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import o.C0712;

@TargetApi(21)
/* renamed from: o.ıЈ  reason: contains not printable characters */
public class C0405 implements C0712.C0713 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public int f3963 = -1;

    /* renamed from: ι  reason: contains not printable characters */
    public AudioAttributes f3964;

    public int hashCode() {
        return this.f3964.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0405)) {
            return false;
        }
        return this.f3964.equals(((C0405) obj).f3964);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat: audioattributes=");
        sb.append(this.f3964);
        return sb.toString();
    }
}
