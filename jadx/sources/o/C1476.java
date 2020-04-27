package o;

import java.io.File;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o.ɺı  reason: contains not printable characters */
public final class C1476 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Map<String, Lock> f7930 = new HashMap();

    /* renamed from: ǃ  reason: contains not printable characters */
    public FileChannel f7931;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean f7932;

    /* renamed from: Ι  reason: contains not printable characters */
    public final Lock f7933 = m8845(this.f7934.getAbsolutePath());

    /* renamed from: ι  reason: contains not printable characters */
    public final File f7934;

    public C1476(String str, File file, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".lck");
        this.f7934 = new File(file, sb.toString());
        this.f7932 = z;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Lock m8845(String str) {
        Lock lock;
        synchronized (f7930) {
            lock = f7930.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                f7930.put(str, lock);
            }
        }
        return lock;
    }
}
