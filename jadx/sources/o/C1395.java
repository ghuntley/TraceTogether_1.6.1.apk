package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.ViewGroup;
import o.C1349;
import o.C1483;

/* renamed from: o.ɪь  reason: contains not printable characters */
public class C1395 implements C1483 {

    /* renamed from: ı  reason: contains not printable characters */
    private C2328 f7645;

    /* renamed from: ǃ  reason: contains not printable characters */
    C1379 f7646;

    /* renamed from: Ι  reason: contains not printable characters */
    int f7647;

    /* renamed from: ι  reason: contains not printable characters */
    boolean f7648 = false;

    /* renamed from: ı  reason: contains not printable characters */
    public final void m8563(C1483.C1484 r1) {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m8564(C2328 r1, boolean z) {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m8565() {
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m8566(C2459 r1) {
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m8570(C1653 r1) {
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m8573(C2459 r1) {
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8571(Context context, C2328 r2) {
        this.f7645 = r2;
        this.f7646.f7597 = this.f7645;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8572(boolean z) {
        if (!this.f7648) {
            if (z) {
                this.f7646.m8522();
                return;
            }
            C1379 r8 = this.f7646;
            if (r8.f7597 != null && r8.f7596 != null) {
                int size = r8.f7597.size();
                if (size != r8.f7596.length) {
                    r8.m8522();
                    return;
                }
                int i = r8.f7584;
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItem item = r8.f7597.getItem(i2);
                    if (item.isChecked()) {
                        r8.f7584 = item.getItemId();
                        r8.f7599 = i2;
                    }
                }
                if (i != r8.f7584) {
                    C2183.m11566((ViewGroup) r8, (C1976) r8.f7577);
                }
                int i3 = r8.f7595;
                boolean z2 = i3 != -1 ? i3 == 0 : r8.f7597.m12145().size() > 3;
                for (int i4 = 0; i4 < size; i4++) {
                    r8.f7589.f7648 = true;
                    r8.f7596[i4].setLabelVisibilityMode(r8.f7595);
                    r8.f7596[i4].setShifting(z2);
                    r8.f7596[i4].m8589((C2459) r8.f7597.getItem(i4));
                    r8.f7589.f7648 = false;
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m8568() {
        return this.f7647;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final Parcelable m8569() {
        C1396 r0 = new C1396();
        r0.f7650 = this.f7646.f7584;
        SparseArray<C1349> sparseArray = this.f7646.f7581;
        C3049 r2 = new C3049();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            C1349 valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                r2.put(keyAt, valueAt.f7481);
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        r0.f7649 = r2;
        return r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8567(Parcelable parcelable) {
        int max;
        if (parcelable instanceof C1396) {
            C1379 r0 = this.f7646;
            C1396 r15 = (C1396) parcelable;
            int i = r15.f7650;
            int size = r0.f7597.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = r0.f7597.getItem(i2);
                if (i == item.getItemId()) {
                    r0.f7584 = i;
                    r0.f7599 = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.f7646.getContext();
            C3049 r152 = r15.f7649;
            SparseArray<C1349> sparseArray = new SparseArray<>(r152.size());
            int i3 = 0;
            while (i3 < r152.size()) {
                int keyAt = r152.keyAt(i3);
                C1349.C1350 r6 = (C1349.C1350) r152.valueAt(i3);
                if (r6 != null) {
                    C1349 r7 = new C1349(context);
                    int i4 = r6.f7501;
                    if (r7.f7481.f7501 != i4) {
                        r7.f7481.f7501 = i4;
                        r7.f7490 = ((int) Math.pow(10.0d, ((double) r7.f7481.f7501) - 1.0d)) - 1;
                        r7.f7484.f14432 = true;
                        r7.m8450();
                        r7.invalidateSelf();
                    }
                    if (!(r6.f7495 == -1 || r7.f7481.f7495 == (max = Math.max(0, r6.f7495)))) {
                        r7.f7481.f7495 = max;
                        r7.f7484.f14432 = true;
                        r7.m8450();
                        r7.invalidateSelf();
                    }
                    int i5 = r6.f7500;
                    r7.f7481.f7500 = i5;
                    ColorStateList valueOf = ColorStateList.valueOf(i5);
                    if (r7.f7489.f4785.f4804 != valueOf) {
                        C0671 r9 = r7.f7489;
                        if (r9.f4785.f4804 != valueOf) {
                            r9.f4785.f4804 = valueOf;
                            r9.onStateChange(r9.getState());
                        }
                        r7.invalidateSelf();
                    }
                    int i6 = r6.f7498;
                    r7.f7481.f7498 = i6;
                    if (r7.f7484.f14435.getColor() != i6) {
                        r7.f7484.f14435.setColor(i6);
                        r7.invalidateSelf();
                    }
                    int i7 = r6.f7504;
                    if (r7.f7481.f7504 != i7) {
                        r7.f7481.f7504 = i7;
                        if (!(r7.f7492 == null || r7.f7492.get() == null)) {
                            r7.m8451(r7.f7492.get(), r7.f7491 != null ? r7.f7491.get() : null);
                        }
                    }
                    r7.f7481.f7499 = r6.f7499;
                    r7.m8450();
                    r7.f7481.f7502 = r6.f7502;
                    r7.m8450();
                    sparseArray.put(keyAt, r7);
                    i3++;
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            C1379 r153 = this.f7646;
            r153.f7581 = sparseArray;
            if (r153.f7596 != null) {
                for (C1407 r2 : r153.f7596) {
                    r2.m8591(sparseArray.get(r2.getId()));
                }
            }
        }
    }

    /* renamed from: o.ɪь$ı  reason: contains not printable characters */
    static class C1396 implements Parcelable {
        public static final Parcelable.Creator<C1396> CREATOR = new Parcelable.Creator<C1396>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C1396[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C1396(parcel);
            }
        };

        /* renamed from: ǃ  reason: contains not printable characters */
        C3049 f7649;

        /* renamed from: Ι  reason: contains not printable characters */
        int f7650;

        public final int describeContents() {
            return 0;
        }

        C1396() {
        }

        C1396(Parcel parcel) {
            this.f7650 = parcel.readInt();
            this.f7649 = (C3049) parcel.readParcelable(getClass().getClassLoader());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7650);
            parcel.writeParcelable(this.f7649, 0);
        }
    }
}
