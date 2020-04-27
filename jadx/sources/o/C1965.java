package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: o.ιƾ  reason: contains not printable characters */
public final class C1965 implements Parcelable {
    public static final Parcelable.Creator<C1965> CREATOR = new Parcelable.Creator<C1965>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C1965[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C1965((C2326) parcel.readParcelable(C2326.class.getClassLoader()), (C2326) parcel.readParcelable(C2326.class.getClassLoader()), (C2326) parcel.readParcelable(C2326.class.getClassLoader()), (C1966) parcel.readParcelable(C1966.class.getClassLoader()), (byte) 0);
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    final int f9859;

    /* renamed from: Ɩ  reason: contains not printable characters */
    final int f9860;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1966 f9861;

    /* renamed from: ɩ  reason: contains not printable characters */
    final C2326 f9862;

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2326 f9863;

    /* renamed from: ι  reason: contains not printable characters */
    public final C2326 f9864;

    /* renamed from: o.ιƾ$ı  reason: contains not printable characters */
    public interface C1966 extends Parcelable {
        /* renamed from: ı  reason: contains not printable characters */
        boolean m10691(long j);
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ C1965(C2326 r1, C2326 r2, C2326 r3, C1966 r4, byte b) {
        this(r1, r2, r3, r4);
    }

    private C1965(C2326 r2, C2326 r3, C2326 r4, C1966 r5) {
        this.f9863 = r2;
        this.f9862 = r3;
        this.f9864 = r4;
        this.f9861 = r5;
        if (r2.f10765.compareTo(r4.f10765) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (r4.f10765.compareTo(r3.f10765) <= 0) {
            this.f9860 = r2.m12106(r3) + 1;
            this.f9859 = (r3.f10767 - r2.f10767) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1965)) {
            return false;
        }
        C1965 r5 = (C1965) obj;
        return this.f9863.equals(r5.f9863) && this.f9862.equals(r5.f9862) && this.f9864.equals(r5.f9864) && this.f9861.equals(r5.f9861);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9863, this.f9862, this.f9864, this.f9861});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f9863, 0);
        parcel.writeParcelable(this.f9862, 0);
        parcel.writeParcelable(this.f9864, 0);
        parcel.writeParcelable(this.f9861, 0);
    }

    /* renamed from: o.ιƾ$ǃ  reason: contains not printable characters */
    public static final class C1967 {

        /* renamed from: Ɩ  reason: contains not printable characters */
        private static long f9865;

        /* renamed from: ǃ  reason: contains not printable characters */
        private static long f9866;

        /* renamed from: ı  reason: contains not printable characters */
        public Long f9867;

        /* renamed from: ɩ  reason: contains not printable characters */
        public long f9868 = f9866;

        /* renamed from: Ι  reason: contains not printable characters */
        public long f9869 = f9865;

        /* renamed from: ι  reason: contains not printable characters */
        public C1966 f9870 = new C1983(Long.MIN_VALUE);

        public C1967() {
        }

        public C1967(C1965 r4) {
            this.f9868 = r4.f9863.f10766;
            this.f9869 = r4.f9862.f10766;
            this.f9867 = Long.valueOf(r4.f9864.f10766);
            this.f9870 = r4.f9861;
        }

        static {
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance.clear();
            instance.set(1, 1900);
            instance.set(2, 0);
            long j = new C2326(instance).f10766;
            Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance2.clear();
            instance2.setTimeInMillis(j);
            Calendar instance3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance3.setTimeInMillis(instance2.getTimeInMillis());
            Calendar instance4 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance4.clear();
            instance4.set(instance3.get(1), instance3.get(2), instance3.get(5));
            f9866 = instance4.getTimeInMillis();
            Calendar instance5 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance5.clear();
            instance5.set(1, 2100);
            instance5.set(2, 11);
            long j2 = new C2326(instance5).f10766;
            Calendar instance6 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance6.clear();
            instance6.setTimeInMillis(j2);
            Calendar instance7 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance7.setTimeInMillis(instance6.getTimeInMillis());
            Calendar instance8 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance8.clear();
            instance8.set(instance7.get(1), instance7.get(2), instance7.get(5));
            f9865 = instance8.getTimeInMillis();
        }
    }
}
