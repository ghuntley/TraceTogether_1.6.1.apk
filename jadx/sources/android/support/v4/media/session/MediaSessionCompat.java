package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;
import o.C1947;
import o.C3283aux;

public class MediaSessionCompat {
    /* renamed from: ι  reason: contains not printable characters */
    public static void m73(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() {
            /* renamed from: Ι  reason: contains not printable characters */
            public final Token createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable((ClassLoader) null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final Token[] newArray(int i) {
                return new Token[i];
            }
        };

        /* renamed from: ǃ  reason: contains not printable characters */
        private C1947 f59;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Object f60;

        /* renamed from: ι  reason: contains not printable characters */
        private Bundle f61;

        public final int describeContents() {
            return 0;
        }

        Token(Object obj) {
            this(obj, (C1947) null, (Bundle) null);
        }

        Token(Object obj, C1947 r2, Bundle bundle) {
            this.f60 = obj;
            this.f59 = r2;
            this.f61 = bundle;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f60, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f60);
            }
        }

        public final int hashCode() {
            Object obj = this.f60;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f60;
            if (obj2 == null) {
                return token.f60 == null;
            }
            Object obj3 = token.f60;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C1947 m80() {
            return this.f59;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m81(C1947 r1) {
            this.f59 = r1;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m82(Bundle bundle) {
            this.f61 = bundle;
        }
    }

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() {
            /* renamed from: ı  reason: contains not printable characters */
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        private final long f55;

        /* renamed from: ɩ  reason: contains not printable characters */
        private Object f56;

        /* renamed from: Ι  reason: contains not printable characters */
        private final MediaDescriptionCompat f57;

        public final int describeContents() {
            return 0;
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f57 = mediaDescriptionCompat;
                this.f55 = j;
                this.f56 = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        QueueItem(Parcel parcel) {
            this.f57 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f55 = parcel.readLong();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f57.writeToParcel(parcel, i);
            parcel.writeLong(this.f55);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static QueueItem m75(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m14(C3283aux.If.m1653(obj)), C3283aux.If.m1654(obj));
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public static List<QueueItem> m74(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object r1 : list) {
                arrayList.add(m75(r1));
            }
            return arrayList;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.f57);
            sb.append(", Id=");
            sb.append(this.f55);
            sb.append(" }");
            return sb.toString();
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() {
            /* renamed from: ı  reason: contains not printable characters */
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };

        /* renamed from: ι  reason: contains not printable characters */
        ResultReceiver f58;

        public final int describeContents() {
            return 0;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f58 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f58.writeToParcel(parcel, i);
        }
    }
}
