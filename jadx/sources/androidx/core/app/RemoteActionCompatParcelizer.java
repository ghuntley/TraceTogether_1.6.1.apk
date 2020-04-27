package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import o.C0712;
import o.C2620;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C2620 r3) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f179 = (IconCompat) r3.m13898(remoteActionCompat.f179);
        remoteActionCompat.f182 = r3.m13903(remoteActionCompat.f182, 2);
        remoteActionCompat.f181 = r3.m13903(remoteActionCompat.f181, 3);
        remoteActionCompat.f183 = (PendingIntent) r3.m13908(remoteActionCompat.f183, 4);
        remoteActionCompat.f180 = r3.m13921(remoteActionCompat.f180, 5);
        remoteActionCompat.f184 = r3.m13921(remoteActionCompat.f184, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C2620 r3) {
        r3.m13912((C0712.C0713) remoteActionCompat.f179);
        r3.m13917(remoteActionCompat.f182, 2);
        r3.m13917(remoteActionCompat.f181, 3);
        r3.m13906((Parcelable) remoteActionCompat.f183, 4);
        r3.m13901(remoteActionCompat.f180, 5);
        r3.m13901(remoteActionCompat.f184, 6);
    }
}
