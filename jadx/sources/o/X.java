package o;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.ExecutorService;

public final class X implements C1897 {

    /* renamed from: ι  reason: contains not printable characters */
    private final ExecutorService f1332;

    /* renamed from: o.X$if  reason: invalid class name */
    public static final class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        public static final int[] f1333 = {16842904, R.attr.f148682130968645, R.attr.f148692130968646, R.attr.f148702130968647, R.attr.f148712130968648, R.attr.f148722130968649, R.attr.f148732130968650, R.attr.f148742130968651, R.attr.f148752130968652, R.attr.f148762130968653, R.attr.f148772130968654, R.attr.f148782130968655, R.attr.f149092130968686, R.attr.f149102130968687, R.attr.f149112130968688, R.attr.f149122130968689, R.attr.f149132130968690, R.attr.f151722130968962, R.attr.f151802130968970, R.attr.f151812130968971, R.attr.f152952130969089, R.attr.f153512130969163, R.attr.f153522130969164, R.attr.f153532130969165, R.attr.f153542130969166, R.attr.f153552130969167, R.attr.f153562130969168, R.attr.f153572130969169, R.attr.f155072130969339, R.attr.f155532130969389};

        /* renamed from: ŀ  reason: contains not printable characters */
        public static final int f1334 = 18;

        /* renamed from: ł  reason: contains not printable characters */
        public static final int f1335 = 15;

        /* renamed from: ſ  reason: contains not printable characters */
        public static final int f1336 = 23;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static final int f1337 = 4;

        /* renamed from: Ɨ  reason: contains not printable characters */
        public static final int f1338 = 21;

        /* renamed from: ƚ  reason: contains not printable characters */
        public static final int f1339 = 19;

        /* renamed from: ǀ  reason: contains not printable characters */
        public static final int f1340 = 25;

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final int f1341 = 3;

        /* renamed from: ȷ  reason: contains not printable characters */
        public static final int f1342 = 13;

        /* renamed from: ɍ  reason: contains not printable characters */
        public static final int f1343 = 20;

        /* renamed from: ɔ  reason: contains not printable characters */
        public static final int f1344 = 27;

        /* renamed from: ɟ  reason: contains not printable characters */
        public static final int f1345 = 28;

        /* renamed from: ɨ  reason: contains not printable characters */
        public static final int f1346 = 12;

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final int f1347 = 0;

        /* renamed from: ɪ  reason: contains not printable characters */
        public static final int f1348 = 9;

        /* renamed from: ɹ  reason: contains not printable characters */
        public static final int f1349 = 7;

        /* renamed from: ɺ  reason: contains not printable characters */
        public static final int f1350 = 26;

        /* renamed from: ɼ  reason: contains not printable characters */
        public static final int f1351 = 24;

        /* renamed from: ɾ  reason: contains not printable characters */
        public static final int f1352 = 11;

        /* renamed from: ɿ  reason: contains not printable characters */
        public static final int f1353 = 17;

        /* renamed from: ʅ  reason: contains not printable characters */
        public static final int f1354 = 22;

        /* renamed from: ʟ  reason: contains not printable characters */
        public static final int f1355 = 14;

        /* renamed from: Ι  reason: contains not printable characters */
        public static final int f1356 = 2;

        /* renamed from: ι  reason: contains not printable characters */
        public static final int f1357 = 1;

        /* renamed from: ϲ  reason: contains not printable characters */
        public static final int f1358 = 29;

        /* renamed from: І  reason: contains not printable characters */
        public static final int f1359 = 6;

        /* renamed from: г  reason: contains not printable characters */
        public static final int f1360 = 16;

        /* renamed from: і  reason: contains not printable characters */
        public static final int f1361 = 5;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public static final int f1362 = 8;

        /* renamed from: ӏ  reason: contains not printable characters */
        public static final int f1363 = 10;
    }

    /* renamed from: o.X$ɩ  reason: contains not printable characters */
    public static final class C0105 implements C2855 {

        /* renamed from: ı  reason: contains not printable characters */
        public static final int f1367 = 2131099878;

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final int f1368 = 2131099901;

        /* renamed from: Ι  reason: contains not printable characters */
        public static final int f1369 = 2131099682;

        /* renamed from: ι  reason: contains not printable characters */
        public static final int f1370 = 2131099762;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final IBinder f1371;

        public C0105(IBinder iBinder) {
            this.f1371 = iBinder;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m1429(Message message) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f1371.transact(1, obtain, (Parcel) null, 1);
            } finally {
                obtain.recycle();
            }
        }

        public final IBinder asBinder() {
            return this.f1371;
        }
    }

    public X(ExecutorService executorService) {
        this.f1332 = executorService;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<Integer> m1427(Intent intent) {
        return C0309.m4375(this.f1332, new C3060(intent));
    }

    /* renamed from: o.X$ǃ  reason: contains not printable characters */
    public static final class C0104 {

        /* renamed from: ι  reason: contains not printable characters */
        public static final int f1364 = 2131230831;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final FileChannel f1365;

        /* renamed from: Ι  reason: contains not printable characters */
        public final FileLock f1366;

        private C0104(FileChannel fileChannel, FileLock fileLock) {
            this.f1365 = fileChannel;
            this.f1366 = fileLock;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public static C0104 m1428(Context context, String str) {
            try {
                FileChannel channel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
                return new C0104(channel, channel.lock());
            } catch (IOException e) {
                throw new IllegalStateException("exception while using file locks, should never happen", e);
            }
        }
    }
}
