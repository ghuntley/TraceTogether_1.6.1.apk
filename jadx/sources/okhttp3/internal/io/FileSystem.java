package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import o.jP;
import o.jY;
import o.jZ;

public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() {
        public jY source(File file) {
            return jP.m2973(file);
        }

        public jZ sink(File file) {
            try {
                return jP.m2980(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return jP.m2980(file);
            }
        }

        public jZ appendingSink(File file) {
            try {
                return jP.m2976(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return jP.m2976(file);
            }
        }

        public void delete(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete ".concat(String.valueOf(file)));
            }
        }

        public boolean exists(File file) {
            return file.exists();
        }

        public long size(File file) {
            return file.length();
        }

        public void rename(File file, File file2) {
            delete(file2);
            if (!file.renameTo(file2)) {
                StringBuilder sb = new StringBuilder("failed to rename ");
                sb.append(file);
                sb.append(" to ");
                sb.append(file2);
                throw new IOException(sb.toString());
            }
        }

        public void deleteContents(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        throw new IOException("failed to delete ".concat(String.valueOf(file2)));
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }
    };

    jZ appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    jZ sink(File file);

    long size(File file);

    jY source(File file);
}
