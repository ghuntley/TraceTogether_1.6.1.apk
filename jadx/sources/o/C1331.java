package o;

import android.content.Context;
import android.util.SparseIntArray;
import o.C3024;

/* renamed from: o.ɪł  reason: contains not printable characters */
public final class C1331 {

    /* renamed from: ı  reason: contains not printable characters */
    private C2837 f7351;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final SparseIntArray f7352;

    public C1331(C2837 r2) {
        this.f7352 = new SparseIntArray();
        if (r2 != null) {
            this.f7351 = r2;
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m8365(Context context, C3024.C3030 r8) {
        if (context == null) {
            throw new NullPointerException("null reference");
        } else if (r8 == null) {
            throw new NullPointerException("null reference");
        } else if (!r8.m15488()) {
            return 0;
        } else {
            int r82 = r8.m15492();
            int i = this.f7352.get(r82, -1);
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            while (true) {
                if (i2 < this.f7352.size()) {
                    int keyAt = this.f7352.keyAt(i2);
                    if (keyAt > r82 && this.f7352.get(keyAt) == 0) {
                        i = 0;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            if (i == -1) {
                i = this.f7351.m14807(context, r82);
            }
            this.f7352.put(r82, i);
            return i;
        }
    }

    public C1331() {
        this(C2835.f13281);
    }
}
