package okhttp3.internal.cache2;

import java.nio.channels.FileChannel;
import o.jH;

final class FileOperator {
    private final FileChannel fileChannel;

    FileOperator(FileChannel fileChannel2) {
        this.fileChannel = fileChannel2;
    }

    public final void read(long j, jH jHVar, long j2) {
        if (j2 >= 0) {
            while (j2 > 0) {
                long transferTo = this.fileChannel.transferTo(j, j2, jHVar);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long j, jH jHVar, long j2) {
        if (j2 < 0 || j2 > jHVar.f2411) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long transferFrom = this.fileChannel.transferFrom(jHVar, j3, j4);
            j3 += transferFrom;
            j4 -= transferFrom;
        }
    }
}
