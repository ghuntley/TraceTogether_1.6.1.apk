package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o.jK;
import o.jP;
import o.jY;
import o.jZ;
import okhttp3.internal.Util;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

public final class DiskLruCache implements Closeable, Flushable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final long ANY_SEQUENCE_NUMBER = -1;
    private static final String CLEAN = "CLEAN";
    private static final String DIRTY = "DIRTY";
    static final String JOURNAL_FILE = "journal";
    static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    static final String JOURNAL_FILE_TEMP = "journal.tmp";
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    static final String MAGIC = "libcore.io.DiskLruCache";
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    static final String VERSION_1 = "1";
    private final int appVersion;
    private final Runnable cleanupRunnable = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r5.this$0.mostRecentRebuildFailed = true;
            r5.this$0.journalWriter = o.jP.m2979(o.jP.m2978());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                okhttp3.internal.cache.DiskLruCache r0 = okhttp3.internal.cache.DiskLruCache.this
                monitor-enter(r0)
                okhttp3.internal.cache.DiskLruCache r1 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ all -> 0x0045 }
                boolean r1 = r1.initialized     // Catch:{ all -> 0x0045 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x000d
                r1 = 1
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                okhttp3.internal.cache.DiskLruCache r4 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ all -> 0x0045 }
                boolean r4 = r4.closed     // Catch:{ all -> 0x0045 }
                r1 = r1 | r4
                if (r1 == 0) goto L_0x0017
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0017:
                okhttp3.internal.cache.DiskLruCache r1 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ IOException -> 0x001d }
                r1.trimToSize()     // Catch:{ IOException -> 0x001d }
                goto L_0x0021
            L_0x001d:
                okhttp3.internal.cache.DiskLruCache r1 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ all -> 0x0045 }
                r1.mostRecentTrimFailed = r3     // Catch:{ all -> 0x0045 }
            L_0x0021:
                okhttp3.internal.cache.DiskLruCache r1 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ IOException -> 0x0033 }
                boolean r1 = r1.journalRebuildRequired()     // Catch:{ IOException -> 0x0033 }
                if (r1 == 0) goto L_0x0043
                okhttp3.internal.cache.DiskLruCache r1 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ IOException -> 0x0033 }
                r1.rebuildJournal()     // Catch:{ IOException -> 0x0033 }
                okhttp3.internal.cache.DiskLruCache r1 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ IOException -> 0x0033 }
                r1.redundantOpCount = r2     // Catch:{ IOException -> 0x0033 }
                goto L_0x0043
            L_0x0033:
                okhttp3.internal.cache.DiskLruCache r1 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ all -> 0x0045 }
                r1.mostRecentRebuildFailed = r3     // Catch:{ all -> 0x0045 }
                okhttp3.internal.cache.DiskLruCache r1 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ all -> 0x0045 }
                o.jZ r2 = o.jP.m2978()     // Catch:{ all -> 0x0045 }
                o.jK r2 = o.jP.m2979((o.jZ) r2)     // Catch:{ all -> 0x0045 }
                r1.journalWriter = r2     // Catch:{ all -> 0x0045 }
            L_0x0043:
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0045:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.AnonymousClass1.run():void");
        }
    };
    boolean closed;
    final File directory;
    private final Executor executor;
    final FileSystem fileSystem;
    boolean hasJournalErrors;
    boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    jK journalWriter;
    final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long maxSize;
    boolean mostRecentRebuildFailed;
    boolean mostRecentTrimFailed;
    private long nextSequenceNumber = 0;
    int redundantOpCount;
    private long size = 0;
    final int valueCount;

    DiskLruCache(FileSystem fileSystem2, File file, int i, int i2, long j, Executor executor2) {
        this.fileSystem = fileSystem2;
        this.directory = file;
        this.appVersion = i;
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
        this.valueCount = i2;
        this.maxSize = j;
        this.executor = executor2;
    }

    public final synchronized void initialize() {
        if (!this.initialized) {
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform platform = Platform.get();
                    StringBuilder sb = new StringBuilder("DiskLruCache ");
                    sb.append(this.directory);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    platform.log(5, sb.toString(), e);
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
            rebuildJournal();
            this.initialized = true;
        }
    }

    public static DiskLruCache create(FileSystem fileSystem2, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new DiskLruCache(fileSystem2, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.redundantOpCount = r0 - r9.lruEntries.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.m2925() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        rebuildJournal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.journalWriter = newJournalWriter();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x007a=Splitter:B:23:0x007a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readJournal() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            okhttp3.internal.io.FileSystem r1 = r9.fileSystem
            java.io.File r2 = r9.journalFile
            o.jY r1 = r1.source(r2)
            o.jI r1 = o.jP.m2972((o.jY) r1)
            java.lang.String r2 = r1.m2905()     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = r1.m2905()     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = r1.m2905()     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = r1.m2905()     // Catch:{ all -> 0x00a5 }
            java.lang.String r6 = r1.m2905()     // Catch:{ all -> 0x00a5 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00a5 }
            if (r7 == 0) goto L_0x007a
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00a5 }
            if (r7 == 0) goto L_0x007a
            int r7 = r9.appVersion     // Catch:{ all -> 0x00a5 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00a5 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00a5 }
            if (r4 == 0) goto L_0x007a
            int r4 = r9.valueCount     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00a5 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a5 }
            if (r4 == 0) goto L_0x007a
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00a5 }
            if (r4 == 0) goto L_0x007a
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.m2905()     // Catch:{ EOFException -> 0x005d }
            r9.readJournalLine(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r2 = r9.lruEntries     // Catch:{ all -> 0x00a5 }
            int r2 = r2.size()     // Catch:{ all -> 0x00a5 }
            int r0 = r0 - r2
            r9.redundantOpCount = r0     // Catch:{ all -> 0x00a5 }
            boolean r0 = r1.m2925()     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x0070
            r9.rebuildJournal()     // Catch:{ all -> 0x00a5 }
            goto L_0x0076
        L_0x0070:
            o.jK r0 = r9.newJournalWriter()     // Catch:{ all -> 0x00a5 }
            r9.journalWriter = r0     // Catch:{ all -> 0x00a5 }
        L_0x0076:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
            return
        L_0x007a:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.<init>(r8)     // Catch:{ all -> 0x00a5 }
            r7.append(r2)     // Catch:{ all -> 0x00a5 }
            r7.append(r0)     // Catch:{ all -> 0x00a5 }
            r7.append(r3)     // Catch:{ all -> 0x00a5 }
            r7.append(r0)     // Catch:{ all -> 0x00a5 }
            r7.append(r5)     // Catch:{ all -> 0x00a5 }
            r7.append(r0)     // Catch:{ all -> 0x00a5 }
            r7.append(r6)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00a5 }
            r4.<init>(r0)     // Catch:{ all -> 0x00a5 }
            throw r4     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.readJournal():void");
    }

    private jK newJournalWriter() {
        return jP.m2979((jZ) new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile)) {
            static final /* synthetic */ boolean $assertionsDisabled = false;

            static {
                Class<DiskLruCache> cls = DiskLruCache.class;
            }

            /* access modifiers changed from: protected */
            public void onException(IOException iOException) {
                DiskLruCache.this.hasJournalErrors = true;
            }
        });
    }

    private void readJournalLine(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith(REMOVE)) {
                    this.lruEntries.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            Entry entry = this.lruEntries.get(str2);
            if (entry == null) {
                entry = new Entry(str2);
                this.lruEntries.put(str2, entry);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(CLEAN)) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                entry.readable = true;
                entry.currentEditor = null;
                entry.setLengths(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(DIRTY)) {
                entry.currentEditor = new Editor(entry);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(READ)) {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        } else {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    private void processJournal() {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            int i = 0;
            if (next.currentEditor == null) {
                while (i < this.valueCount) {
                    this.size += next.lengths[i];
                    i++;
                }
            } else {
                next.currentEditor = null;
                while (i < this.valueCount) {
                    this.fileSystem.delete(next.cleanFiles[i]);
                    this.fileSystem.delete(next.dirtyFiles[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final synchronized void rebuildJournal() {
        if (this.journalWriter != null) {
            this.journalWriter.close();
        }
        jK r0 = jP.m2979(this.fileSystem.sink(this.journalFileTmp));
        try {
            r0.m2942(MAGIC).m2945(10);
            r0.m2942(VERSION_1).m2945(10);
            r0.m2936((long) this.appVersion).m2945(10);
            r0.m2936((long) this.valueCount).m2945(10);
            r0.m2945(10);
            for (Entry next : this.lruEntries.values()) {
                if (next.currentEditor != null) {
                    r0.m2942(DIRTY).m2945(32);
                    r0.m2942(next.key);
                    r0.m2945(10);
                } else {
                    r0.m2942(CLEAN).m2945(32);
                    r0.m2942(next.key);
                    next.writeLengths(r0);
                    r0.m2945(10);
                }
            }
            r0.close();
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } catch (Throwable th) {
            r0.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Snapshot get(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.initialize()     // Catch:{ all -> 0x0050 }
            r3.checkNotClosed()     // Catch:{ all -> 0x0050 }
            r3.validateKey(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r3.lruEntries     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.readable     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r0.snapshot()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.redundantOpCount     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.redundantOpCount = r1     // Catch:{ all -> 0x0050 }
            o.jK r1 = r3.journalWriter     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            o.jK r1 = r1.m2942((java.lang.String) r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            o.jK r1 = r1.m2945(r2)     // Catch:{ all -> 0x0050 }
            o.jK r4 = r1.m2942((java.lang.String) r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.m2945(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.journalRebuildRequired()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.executor     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.cleanupRunnable     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.get(java.lang.String):okhttp3.internal.cache.DiskLruCache$Snapshot");
    }

    public final Editor edit(String str) {
        return edit(str, -1);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.initialize()     // Catch:{ all -> 0x0074 }
            r5.checkNotClosed()     // Catch:{ all -> 0x0074 }
            r5.validateKey(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r5.lruEntries     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.sequenceNumber     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            okhttp3.internal.cache.DiskLruCache$Editor r7 = r0.currentEditor     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r7 = r5.mostRecentTrimFailed     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.mostRecentRebuildFailed     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            o.jK r7 = r5.journalWriter     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            o.jK r7 = r7.m2942((java.lang.String) r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            o.jK r7 = r7.m2945(r8)     // Catch:{ all -> 0x0074 }
            o.jK r7 = r7.m2942((java.lang.String) r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.m2945(r8)     // Catch:{ all -> 0x0074 }
            o.jK r7 = r5.journalWriter     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.hasJournalErrors     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            okhttp3.internal.cache.DiskLruCache$Entry r0 = new okhttp3.internal.cache.DiskLruCache$Entry     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r7 = r5.lruEntries     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            okhttp3.internal.cache.DiskLruCache$Editor r6 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.currentEditor = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.executor     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.cleanupRunnable     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.edit(java.lang.String, long):okhttp3.internal.cache.DiskLruCache$Editor");
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            this.executor.execute(this.cleanupRunnable);
        }
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ed, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void completeEdit(okhttp3.internal.cache.DiskLruCache.Editor r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            okhttp3.internal.cache.DiskLruCache$Entry r0 = r10.entry     // Catch:{ all -> 0x00f4 }
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.currentEditor     // Catch:{ all -> 0x00f4 }
            if (r1 != r10) goto L_0x00ee
            r1 = 0
            if (r11 == 0) goto L_0x0040
            boolean r2 = r0.readable     // Catch:{ all -> 0x00f4 }
            if (r2 != 0) goto L_0x0040
            r2 = 0
        L_0x000f:
            int r3 = r9.valueCount     // Catch:{ all -> 0x00f4 }
            if (r2 >= r3) goto L_0x0040
            boolean[] r3 = r10.written     // Catch:{ all -> 0x00f4 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f4 }
            if (r3 == 0) goto L_0x002d
            okhttp3.internal.io.FileSystem r3 = r9.fileSystem     // Catch:{ all -> 0x00f4 }
            java.io.File[] r4 = r0.dirtyFiles     // Catch:{ all -> 0x00f4 }
            r4 = r4[r2]     // Catch:{ all -> 0x00f4 }
            boolean r3 = r3.exists(r4)     // Catch:{ all -> 0x00f4 }
            if (r3 != 0) goto L_0x002a
            r10.abort()     // Catch:{ all -> 0x00f4 }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.abort()     // Catch:{ all -> 0x00f4 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f4 }
            java.lang.String r11 = "Newly created entry didn't create value for index "
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00f4 }
            java.lang.String r11 = r11.concat(r0)     // Catch:{ all -> 0x00f4 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f4 }
            throw r10     // Catch:{ all -> 0x00f4 }
        L_0x0040:
            int r10 = r9.valueCount     // Catch:{ all -> 0x00f4 }
            if (r1 >= r10) goto L_0x0078
            java.io.File[] r10 = r0.dirtyFiles     // Catch:{ all -> 0x00f4 }
            r10 = r10[r1]     // Catch:{ all -> 0x00f4 }
            if (r11 == 0) goto L_0x0070
            okhttp3.internal.io.FileSystem r2 = r9.fileSystem     // Catch:{ all -> 0x00f4 }
            boolean r2 = r2.exists(r10)     // Catch:{ all -> 0x00f4 }
            if (r2 == 0) goto L_0x0075
            java.io.File[] r2 = r0.cleanFiles     // Catch:{ all -> 0x00f4 }
            r2 = r2[r1]     // Catch:{ all -> 0x00f4 }
            okhttp3.internal.io.FileSystem r3 = r9.fileSystem     // Catch:{ all -> 0x00f4 }
            r3.rename(r10, r2)     // Catch:{ all -> 0x00f4 }
            long[] r10 = r0.lengths     // Catch:{ all -> 0x00f4 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f4 }
            okhttp3.internal.io.FileSystem r10 = r9.fileSystem     // Catch:{ all -> 0x00f4 }
            long r5 = r10.size(r2)     // Catch:{ all -> 0x00f4 }
            long[] r10 = r0.lengths     // Catch:{ all -> 0x00f4 }
            r10[r1] = r5     // Catch:{ all -> 0x00f4 }
            long r7 = r9.size     // Catch:{ all -> 0x00f4 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.size = r7     // Catch:{ all -> 0x00f4 }
            goto L_0x0075
        L_0x0070:
            okhttp3.internal.io.FileSystem r2 = r9.fileSystem     // Catch:{ all -> 0x00f4 }
            r2.delete(r10)     // Catch:{ all -> 0x00f4 }
        L_0x0075:
            int r1 = r1 + 1
            goto L_0x0040
        L_0x0078:
            int r10 = r9.redundantOpCount     // Catch:{ all -> 0x00f4 }
            r1 = 1
            int r10 = r10 + r1
            r9.redundantOpCount = r10     // Catch:{ all -> 0x00f4 }
            r10 = 0
            r0.currentEditor = r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r0.readable     // Catch:{ all -> 0x00f4 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00b4
            r0.readable = r1     // Catch:{ all -> 0x00f4 }
            o.jK r10 = r9.journalWriter     // Catch:{ all -> 0x00f4 }
            java.lang.String r1 = "CLEAN"
            o.jK r10 = r10.m2942((java.lang.String) r1)     // Catch:{ all -> 0x00f4 }
            r10.m2945(r3)     // Catch:{ all -> 0x00f4 }
            o.jK r10 = r9.journalWriter     // Catch:{ all -> 0x00f4 }
            java.lang.String r1 = r0.key     // Catch:{ all -> 0x00f4 }
            r10.m2942((java.lang.String) r1)     // Catch:{ all -> 0x00f4 }
            o.jK r10 = r9.journalWriter     // Catch:{ all -> 0x00f4 }
            r0.writeLengths(r10)     // Catch:{ all -> 0x00f4 }
            o.jK r10 = r9.journalWriter     // Catch:{ all -> 0x00f4 }
            r10.m2945(r2)     // Catch:{ all -> 0x00f4 }
            if (r11 == 0) goto L_0x00d2
            long r10 = r9.nextSequenceNumber     // Catch:{ all -> 0x00f4 }
            r1 = 1
            long r1 = r1 + r10
            r9.nextSequenceNumber = r1     // Catch:{ all -> 0x00f4 }
            r0.sequenceNumber = r10     // Catch:{ all -> 0x00f4 }
            goto L_0x00d2
        L_0x00b4:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r10 = r9.lruEntries     // Catch:{ all -> 0x00f4 }
            java.lang.String r11 = r0.key     // Catch:{ all -> 0x00f4 }
            r10.remove(r11)     // Catch:{ all -> 0x00f4 }
            o.jK r10 = r9.journalWriter     // Catch:{ all -> 0x00f4 }
            java.lang.String r11 = "REMOVE"
            o.jK r10 = r10.m2942((java.lang.String) r11)     // Catch:{ all -> 0x00f4 }
            r10.m2945(r3)     // Catch:{ all -> 0x00f4 }
            o.jK r10 = r9.journalWriter     // Catch:{ all -> 0x00f4 }
            java.lang.String r11 = r0.key     // Catch:{ all -> 0x00f4 }
            r10.m2942((java.lang.String) r11)     // Catch:{ all -> 0x00f4 }
            o.jK r10 = r9.journalWriter     // Catch:{ all -> 0x00f4 }
            r10.m2945(r2)     // Catch:{ all -> 0x00f4 }
        L_0x00d2:
            o.jK r10 = r9.journalWriter     // Catch:{ all -> 0x00f4 }
            r10.flush()     // Catch:{ all -> 0x00f4 }
            long r10 = r9.size     // Catch:{ all -> 0x00f4 }
            long r0 = r9.maxSize     // Catch:{ all -> 0x00f4 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00e5
            boolean r10 = r9.journalRebuildRequired()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x00ec
        L_0x00e5:
            java.util.concurrent.Executor r10 = r9.executor     // Catch:{ all -> 0x00f4 }
            java.lang.Runnable r11 = r9.cleanupRunnable     // Catch:{ all -> 0x00f4 }
            r10.execute(r11)     // Catch:{ all -> 0x00f4 }
        L_0x00ec:
            monitor-exit(r9)
            return
        L_0x00ee:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f4 }
            r10.<init>()     // Catch:{ all -> 0x00f4 }
            throw r10     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.completeEdit(okhttp3.internal.cache.DiskLruCache$Editor, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean remove(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.initialize()     // Catch:{ all -> 0x0029 }
            r6.checkNotClosed()     // Catch:{ all -> 0x0029 }
            r6.validateKey(r7)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r6.lruEntries     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0029 }
            okhttp3.internal.cache.DiskLruCache$Entry r7 = (okhttp3.internal.cache.DiskLruCache.Entry) r7     // Catch:{ all -> 0x0029 }
            r0 = 0
            if (r7 != 0) goto L_0x0017
            monitor-exit(r6)
            return r0
        L_0x0017:
            boolean r7 = r6.removeEntry(r7)     // Catch:{ all -> 0x0029 }
            if (r7 == 0) goto L_0x0027
            long r1 = r6.size     // Catch:{ all -> 0x0029 }
            long r3 = r6.maxSize     // Catch:{ all -> 0x0029 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0027
            r6.mostRecentTrimFailed = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r6)
            return r7
        L_0x0029:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.remove(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean removeEntry(Entry entry) {
        if (entry.currentEditor != null) {
            entry.currentEditor.detach();
        }
        for (int i = 0; i < this.valueCount; i++) {
            this.fileSystem.delete(entry.cleanFiles[i]);
            this.size -= entry.lengths[i];
            entry.lengths[i] = 0;
        }
        this.redundantOpCount++;
        this.journalWriter.m2942(REMOVE).m2945(32).m2942(entry.key).m2945(10);
        this.lruEntries.remove(entry.key);
        if (journalRebuildRequired()) {
            this.executor.execute(this.cleanupRunnable);
        }
        return true;
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    private synchronized void checkNotClosed() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            this.journalWriter.flush();
        }
    }

    public final synchronized void close() {
        if (this.initialized) {
            if (!this.closed) {
                for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()])) {
                    if (entry.currentEditor != null) {
                        entry.currentEditor.abort();
                    }
                }
                trimToSize();
                this.journalWriter.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
        }
        this.closed = true;
    }

    /* access modifiers changed from: package-private */
    public final void trimToSize() {
        while (this.size > this.maxSize) {
            removeEntry(this.lruEntries.values().iterator().next());
        }
        this.mostRecentTrimFailed = false;
    }

    public final void delete() {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final synchronized void evictAll() {
        initialize();
        for (Entry removeEntry : (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()])) {
            removeEntry(removeEntry);
        }
        this.mostRecentTrimFailed = false;
    }

    private void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new Iterator<Snapshot>() {
            final Iterator<Entry> delegate = new ArrayList(DiskLruCache.this.lruEntries.values()).iterator();
            Snapshot nextSnapshot;
            Snapshot removeSnapshot;

            public boolean hasNext() {
                if (this.nextSnapshot != null) {
                    return true;
                }
                synchronized (DiskLruCache.this) {
                    if (DiskLruCache.this.closed) {
                        return false;
                    }
                    while (this.delegate.hasNext()) {
                        Snapshot snapshot = this.delegate.next().snapshot();
                        if (snapshot != null) {
                            this.nextSnapshot = snapshot;
                            return true;
                        }
                    }
                    return false;
                }
            }

            public Snapshot next() {
                if (hasNext()) {
                    this.removeSnapshot = this.nextSnapshot;
                    this.nextSnapshot = null;
                    return this.removeSnapshot;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                Snapshot snapshot = this.removeSnapshot;
                if (snapshot != null) {
                    try {
                        DiskLruCache.this.remove(snapshot.key);
                    } catch (IOException unused) {
                    } finally {
                        this.removeSnapshot = null;
                    }
                } else {
                    throw new IllegalStateException("remove() before next()");
                }
            }
        };
    }

    public final class Snapshot implements Closeable {
        /* access modifiers changed from: private */
        public final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final jY[] sources;

        Snapshot(String str, long j, jY[] jYVarArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.sources = jYVarArr;
            this.lengths = jArr;
        }

        public final String key() {
            return this.key;
        }

        public final Editor edit() {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public final jY getSource(int i) {
            return this.sources[i];
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final void close() {
            for (jY closeQuietly : this.sources) {
                Util.closeQuietly((Closeable) closeQuietly);
            }
        }
    }

    public final class Editor {
        private boolean done;
        final Entry entry;
        final boolean[] written;

        Editor(Entry entry2) {
            this.entry = entry2;
            this.written = entry2.readable ? null : new boolean[DiskLruCache.this.valueCount];
        }

        /* access modifiers changed from: package-private */
        public final void detach() {
            if (this.entry.currentEditor == this) {
                for (int i = 0; i < DiskLruCache.this.valueCount; i++) {
                    try {
                        DiskLruCache.this.fileSystem.delete(this.entry.dirtyFiles[i]);
                    } catch (IOException unused) {
                    }
                }
                this.entry.currentEditor = null;
            }
        }

        public final jY newSource(int i) {
            synchronized (DiskLruCache.this) {
                if (this.done) {
                    throw new IllegalStateException();
                } else if (!this.entry.readable || this.entry.currentEditor != this) {
                    return null;
                } else {
                    try {
                        jY source = DiskLruCache.this.fileSystem.source(this.entry.cleanFiles[i]);
                        return source;
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
            }
        }

        public final jZ newSink(int i) {
            synchronized (DiskLruCache.this) {
                if (this.done) {
                    throw new IllegalStateException();
                } else if (this.entry.currentEditor != this) {
                    jZ r4 = jP.m2978();
                    return r4;
                } else {
                    if (!this.entry.readable) {
                        this.written[i] = true;
                    }
                    try {
                        AnonymousClass1 r1 = new FaultHidingSink(DiskLruCache.this.fileSystem.sink(this.entry.dirtyFiles[i])) {
                            /* access modifiers changed from: protected */
                            public void onException(IOException iOException) {
                                synchronized (DiskLruCache.this) {
                                    Editor.this.detach();
                                }
                            }
                        };
                        return r1;
                    } catch (FileNotFoundException unused) {
                        return jP.m2978();
                    }
                }
            }
        }

        public final void commit() {
            synchronized (DiskLruCache.this) {
                if (!this.done) {
                    if (this.entry.currentEditor == this) {
                        DiskLruCache.this.completeEdit(this, true);
                    }
                    this.done = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public final void abort() {
            synchronized (DiskLruCache.this) {
                if (!this.done) {
                    if (this.entry.currentEditor == this) {
                        DiskLruCache.this.completeEdit(this, false);
                    }
                    this.done = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:7|8)|9|10) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void abortUnlessCommitted() {
            /*
                r3 = this;
                okhttp3.internal.cache.DiskLruCache r0 = okhttp3.internal.cache.DiskLruCache.this
                monitor-enter(r0)
                boolean r1 = r3.done     // Catch:{ all -> 0x0015 }
                if (r1 != 0) goto L_0x0013
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.entry     // Catch:{ all -> 0x0015 }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.currentEditor     // Catch:{ all -> 0x0015 }
                if (r1 != r3) goto L_0x0013
                okhttp3.internal.cache.DiskLruCache r1 = okhttp3.internal.cache.DiskLruCache.this     // Catch:{ IOException -> 0x0013 }
                r2 = 0
                r1.completeEdit(r3, r2)     // Catch:{ IOException -> 0x0013 }
            L_0x0013:
                monitor-exit(r0)     // Catch:{ all -> 0x0015 }
                return
            L_0x0015:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.abortUnlessCommitted():void");
        }
    }

    final class Entry {
        final File[] cleanFiles;
        Editor currentEditor;
        final File[] dirtyFiles;
        final String key;
        final long[] lengths;
        boolean readable;
        long sequenceNumber;

        Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
            this.cleanFiles = new File[DiskLruCache.this.valueCount];
            this.dirtyFiles = new File[DiskLruCache.this.valueCount];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < DiskLruCache.this.valueCount; i++) {
                sb.append(i);
                this.cleanFiles[i] = new File(DiskLruCache.this.directory, sb.toString());
                sb.append(".tmp");
                this.dirtyFiles[i] = new File(DiskLruCache.this.directory, sb.toString());
                sb.setLength(length);
            }
        }

        /* access modifiers changed from: package-private */
        public final void setLengths(String[] strArr) {
            if (strArr.length == DiskLruCache.this.valueCount) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.lengths[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw invalidLengths(strArr);
                    }
                }
                return;
            }
            throw invalidLengths(strArr);
        }

        /* access modifiers changed from: package-private */
        public final void writeLengths(jK jKVar) {
            for (long r3 : this.lengths) {
                jKVar.m2945(32).m2936(r3);
            }
        }

        private IOException invalidLengths(String[] strArr) {
            StringBuilder sb = new StringBuilder("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: package-private */
        public final Snapshot snapshot() {
            if (Thread.holdsLock(DiskLruCache.this)) {
                jY[] jYVarArr = new jY[DiskLruCache.this.valueCount];
                long[] jArr = (long[]) this.lengths.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < DiskLruCache.this.valueCount) {
                    try {
                        jYVarArr[i2] = DiskLruCache.this.fileSystem.source(this.cleanFiles[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < DiskLruCache.this.valueCount && jYVarArr[i] != null) {
                            Util.closeQuietly((Closeable) jYVarArr[i]);
                            i++;
                        }
                        try {
                            DiskLruCache.this.removeEntry(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new Snapshot(this.key, this.sequenceNumber, jYVarArr, jArr);
            }
            throw new AssertionError();
        }
    }
}
