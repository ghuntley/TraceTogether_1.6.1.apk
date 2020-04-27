package o;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: o.ɿȷ  reason: contains not printable characters */
final class C1563 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final FilenameFilter f8315 = new FilenameFilter() {
        public final boolean accept(File file, String str) {
            return true;
        }
    };

    private C1563() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static int m9196(File file, int i, Comparator<File> comparator) {
        return m9195(file, f8315, i, comparator);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static int m9195(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles == null) {
            return 0;
        }
        int length = listFiles.length;
        Arrays.sort(listFiles, comparator);
        for (File file2 : listFiles) {
            if (length <= i) {
                return length;
            }
            file2.delete();
            length--;
        }
        return length;
    }
}
