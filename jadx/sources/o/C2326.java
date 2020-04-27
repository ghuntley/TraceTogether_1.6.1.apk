package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o.Іյ  reason: contains not printable characters */
public final class C2326 implements Comparable<C2326>, Parcelable {
    public static final Parcelable.Creator<C2326> CREATOR = new Parcelable.Creator<C2326>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C2326[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return C2326.m12105(parcel.readInt(), parcel.readInt());
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    public final int f10762 = this.f10765.getMaximum(7);

    /* renamed from: Ɩ  reason: contains not printable characters */
    final int f10763 = this.f10765.getActualMaximum(5);

    /* renamed from: ǃ  reason: contains not printable characters */
    final int f10764 = this.f10765.get(2);

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Calendar f10765;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final long f10766;

    /* renamed from: Ι  reason: contains not printable characters */
    public final int f10767 = this.f10765.get(1);

    /* renamed from: ι  reason: contains not printable characters */
    public final String f10768;

    public final int describeContents() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f10765.compareTo(((C2326) obj).f10765);
    }

    public C2326(Calendar calendar) {
        calendar.set(5, 1);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.setTimeInMillis(calendar.getTimeInMillis());
        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance2.clear();
        instance2.set(instance.get(1), instance.get(2), instance.get(5));
        this.f10765 = instance2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f10768 = simpleDateFormat.format(this.f10765.getTime());
        this.f10766 = this.f10765.getTimeInMillis();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2326)) {
            return false;
        }
        C2326 r5 = (C2326) obj;
        return this.f10764 == r5.f10764 && this.f10767 == r5.f10767;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10764), Integer.valueOf(this.f10767)});
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m12106(C2326 r3) {
        if (this.f10765 instanceof GregorianCalendar) {
            return ((r3.f10767 - this.f10767) * 12) + (r3.f10764 - this.f10764);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m12107(int i) {
        Calendar calendar = this.f10765;
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance2.clear();
        instance2.set(instance.get(1), instance.get(2), instance.get(5));
        instance2.set(5, i);
        return instance2.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final C2326 m12108(int i) {
        Calendar calendar = this.f10765;
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance2.clear();
        instance2.set(instance.get(1), instance.get(2), instance.get(5));
        instance2.add(2, i);
        return new C2326(instance2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10767);
        parcel.writeInt(this.f10764);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static C2326 m12105(int i, int i2) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.clear();
        instance.set(1, i);
        instance.set(2, i2);
        return new C2326(instance);
    }
}
