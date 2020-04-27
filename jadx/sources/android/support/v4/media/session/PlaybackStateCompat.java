package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import o.C1784;
import o.IF;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    final long f67;

    /* renamed from: Ɩ  reason: contains not printable characters */
    final long f68;

    /* renamed from: ǃ  reason: contains not printable characters */
    final long f69;

    /* renamed from: ɨ  reason: contains not printable characters */
    private Object f70;

    /* renamed from: ɩ  reason: contains not printable characters */
    final float f71;

    /* renamed from: ɹ  reason: contains not printable characters */
    final CharSequence f72;

    /* renamed from: ɾ  reason: contains not printable characters */
    final Bundle f73;

    /* renamed from: Ι  reason: contains not printable characters */
    final int f74;

    /* renamed from: ι  reason: contains not printable characters */
    final long f75;

    /* renamed from: І  reason: contains not printable characters */
    List<CustomAction> f76;

    /* renamed from: і  reason: contains not printable characters */
    final int f77;

    /* renamed from: Ӏ  reason: contains not printable characters */
    final long f78;

    public final int describeContents() {
        return 0;
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f74 = i;
        this.f67 = j;
        this.f69 = j2;
        this.f71 = f;
        this.f75 = j3;
        this.f77 = i2;
        this.f72 = charSequence;
        this.f78 = j4;
        this.f76 = new ArrayList(list);
        this.f68 = j5;
        this.f73 = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f74 = parcel.readInt();
        this.f67 = parcel.readLong();
        this.f71 = parcel.readFloat();
        this.f78 = parcel.readLong();
        this.f69 = parcel.readLong();
        this.f75 = parcel.readLong();
        this.f72 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f76 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f68 = parcel.readLong();
        this.f73 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f77 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.f74);
        sb.append(", position=");
        sb.append(this.f67);
        sb.append(", buffered position=");
        sb.append(this.f69);
        sb.append(", speed=");
        sb.append(this.f71);
        sb.append(", updated=");
        sb.append(this.f78);
        sb.append(", actions=");
        sb.append(this.f75);
        sb.append(", error code=");
        sb.append(this.f77);
        sb.append(", error message=");
        sb.append(this.f72);
        sb.append(", custom actions=");
        sb.append(this.f76);
        sb.append(", active item id=");
        sb.append(this.f68);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f74);
        parcel.writeLong(this.f67);
        parcel.writeFloat(this.f71);
        parcel.writeLong(this.f78);
        parcel.writeLong(this.f69);
        parcel.writeLong(this.f75);
        TextUtils.writeToParcel(this.f72, parcel, i);
        parcel.writeTypedList(this.f76);
        parcel.writeLong(this.f68);
        parcel.writeBundle(this.f73);
        parcel.writeInt(this.f77);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static PlaybackStateCompat m85(Object obj) {
        ArrayList arrayList;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> r2 = C1784.m9903(obj);
        if (r2 != null) {
            ArrayList arrayList2 = new ArrayList(r2.size());
            for (Object r4 : r2) {
                arrayList2.add(CustomAction.m88(r4));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = IF.m1373(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C1784.m9901(obj), C1784.m9899(obj), C1784.m9902(obj), C1784.m9905(obj), C1784.m9904(obj), 0, C1784.m9906(obj), C1784.m9907(obj), arrayList, C1784.m9900(obj), bundle);
        playbackStateCompat.f70 = obj2;
        return playbackStateCompat;
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        private final CharSequence f79;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Bundle f80;

        /* renamed from: ɩ  reason: contains not printable characters */
        private Object f81;

        /* renamed from: Ι  reason: contains not printable characters */
        private final int f82;

        /* renamed from: ι  reason: contains not printable characters */
        private final String f83;

        public final int describeContents() {
            return 0;
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f83 = str;
            this.f79 = charSequence;
            this.f82 = i;
            this.f80 = bundle;
        }

        CustomAction(Parcel parcel) {
            this.f83 = parcel.readString();
            this.f79 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f82 = parcel.readInt();
            this.f80 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f83);
            TextUtils.writeToParcel(this.f79, parcel, i);
            parcel.writeInt(this.f82);
            parcel.writeBundle(this.f80);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static CustomAction m88(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C1784.C1785.m9908(obj), C1784.C1785.m9910(obj), C1784.C1785.m9911(obj), C1784.C1785.m9909(obj));
            customAction.f81 = obj;
            return customAction;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Action:mName='");
            sb.append(this.f79);
            sb.append(", mIcon=");
            sb.append(this.f82);
            sb.append(", mExtras=");
            sb.append(this.f80);
            return sb.toString();
        }
    }
}
