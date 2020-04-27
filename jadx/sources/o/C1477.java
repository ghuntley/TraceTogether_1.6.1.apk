package o;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import o.C2622;
import o.C2745;

/* renamed from: o.ɺǃ  reason: contains not printable characters */
public final class C1477 implements C2622.C2624 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2291 f7935;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final long f7936;

    @SuppressLint({"LambdaLast"})
    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m8846(ReadableByteChannel readableByteChannel, FileChannel fileChannel) {
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream newInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream newOutputStream = Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[C0872.f5653];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    newOutputStream.write(bArr, 0, read);
                }
            } else {
                fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            }
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }

    public C1477(long j, C2291 r3) {
        this.f7936 = j;
        this.f7935 = r3;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m8847(Object obj) {
        long j = this.f7936;
        C2291 r2 = this.f7935;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{r2.m11959(), String.valueOf(C2745.C3657iF.m14550(r2.m11961()))}) <= 0) {
            contentValues.put("backend_name", r2.m11959());
            contentValues.put("priority", Integer.valueOf(C2745.C3657iF.m14550(r2.m11961())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}
