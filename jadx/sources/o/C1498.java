package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: o.ɼɹ  reason: contains not printable characters */
public final class C1498 {

    /* renamed from: ı  reason: contains not printable characters */
    private static Boolean f7999;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Executor f8000;

    /* renamed from: ι  reason: contains not printable characters */
    private final Handler f8001;

    /* renamed from: o.ɼɹ$ɩ  reason: contains not printable characters */
    public static class C1499 extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C1499(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1498.C1499.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m8898(int i) {
        return i & 65535;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m8909(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m8911(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(i);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C1499(sb.toString(), parcel);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m8896(Parcel parcel, int i) {
        m8908(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m8907(Parcel parcel, int i) {
        m8908(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static long m8899(Parcel parcel, int i) {
        m8908(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: і  reason: contains not printable characters */
    public static float m8914(Parcel parcel, int i) {
        m8908(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public static void m8901(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new C1499(sb.toString(), parcel);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m8910(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + ((i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt()));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m8908(Parcel parcel, int i, int i2) {
        int readInt = (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
        if (readInt != i2) {
            String hexString = Integer.toHexString(readInt);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(readInt);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C1499(sb.toString(), parcel);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m8906(Parcel parcel) {
        int i;
        int readInt = parcel.readInt();
        if ((readInt & -65536) != -65536) {
            i = (readInt >> 16) & 65535;
        } else {
            i = parcel.readInt();
        }
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new C1499(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = i + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new C1499(sb.toString(), parcel);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Boolean m8903(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
        if (readInt == 0) {
            return null;
        }
        m8911(parcel, readInt, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: І  reason: contains not printable characters */
    public static Long m8913(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
        if (readInt == 0) {
            return null;
        }
        m8911(parcel, readInt, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static Float m8915(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
        if (readInt == 0) {
            return null;
        }
        m8911(parcel, readInt, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static Double m8897(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
        if (readInt == 0) {
            return null;
        }
        m8911(parcel, readInt, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static String m8904(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + readInt);
        return readString;
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public static IBinder m8900(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + readInt);
        return readStrongBinder;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <T extends Parcelable> T m8902(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int readInt = (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + readInt);
        return t;
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public static Bundle m8916(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + readInt);
        return readBundle;
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public static ArrayList<String> m8905(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + readInt);
        return createStringArrayList;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static <T> T[] m8912(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int readInt = (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + readInt);
        return createTypedArray;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <T> ArrayList<T> m8894(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int readInt = (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + readInt);
        return createTypedArrayList;
    }

    public C1498() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m8895(Context context, String str, int i, String str2, int i2, List<String> list, long j) {
        int i3 = i;
        List<String> list2 = list;
        if (f7999 == null) {
            f7999 = Boolean.FALSE;
        }
        if (!f7999.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
            long currentTimeMillis = System.currentTimeMillis();
            if (list2 != null && list.size() == 1 && "com.google.android.gms".equals(list2.get(0))) {
                list2 = null;
            }
            List<String> list3 = list2;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int r11 = C2282.m11939(context);
            String packageName = context.getPackageName();
            WakeLockEvent wakeLockEvent = r1;
            WakeLockEvent wakeLockEvent2 = new WakeLockEvent(currentTimeMillis, i, str2, 1, list3, str, elapsedRealtime, r11, "com.google.android.gms".equals(packageName) ? null : packageName, C2282.m11940(context), j);
            try {
                context.startService(new Intent().setComponent(C2745.f12769).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
            } catch (Exception e) {
                Log.wtf("WakeLockTracker", e);
            }
        }
    }

    public C1498(Executor executor) {
        this.f8000 = executor;
        if (this.f8000 == null) {
            this.f8001 = new Handler(Looper.getMainLooper());
        } else {
            this.f8001 = null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8917(Runnable runnable) {
        Handler handler = this.f8001;
        if (handler == null) {
            Executor executor = this.f8000;
            if (executor != null) {
                executor.execute(runnable);
                return;
            }
            C1666.m9526();
            C1666.m9529(runnable);
            return;
        }
        handler.post(runnable);
    }
}
