package okhttp3.internal.cache2;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import o.C3533kb;
import o.jH;
import o.jM;
import o.jY;
import okhttp3.internal.Util;

final class Relay {
    private static final long FILE_HEADER_SIZE = 32;
    static final jM PREFIX_CLEAN = jM.m2946("OkHttp cache v1\n");
    static final jM PREFIX_DIRTY = jM.m2946("OkHttp DIRTY :(\n");
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    final jH buffer = new jH();
    final long bufferMaxSize;
    boolean complete;
    RandomAccessFile file;
    private final jM metadata;
    int sourceCount;
    jY upstream;
    final jH upstreamBuffer = new jH();
    long upstreamPos;
    Thread upstreamReader;

    private Relay(RandomAccessFile randomAccessFile, jY jYVar, long j, jM jMVar, long j2) {
        this.file = randomAccessFile;
        this.upstream = jYVar;
        this.complete = jYVar == null;
        this.upstreamPos = j;
        this.metadata = jMVar;
        this.bufferMaxSize = j2;
    }

    public static Relay edit(File file2, jY jYVar, jM jMVar, long j) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        Relay relay = new Relay(randomAccessFile, jYVar, 0, jMVar, j);
        randomAccessFile.setLength(0);
        relay.writeHeader(PREFIX_DIRTY, -1, -1);
        return relay;
    }

    public static Relay read(File file2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        jH jHVar = new jH();
        fileOperator.read(0, jHVar, FILE_HEADER_SIZE);
        if (jHVar.m2887((long) PREFIX_CLEAN.m2967()).equals(PREFIX_CLEAN)) {
            long r8 = jHVar.m2854();
            long r6 = jHVar.m2854();
            jH jHVar2 = new jH();
            fileOperator.read(r8 + FILE_HEADER_SIZE, jHVar2, r6);
            return new Relay(randomAccessFile, (jY) null, r8, new jM(jHVar2.m2893()), 0);
        }
        throw new IOException("unreadable cache file");
    }

    private void writeHeader(jM jMVar, long j, long j2) {
        jH jHVar = new jH();
        if (jMVar != null) {
            jMVar.m2958(jHVar);
            jHVar.m2891(j);
            jHVar.m2891(j2);
            if (jHVar.f2411 == FILE_HEADER_SIZE) {
                new FileOperator(this.file.getChannel()).write(0, jHVar, FILE_HEADER_SIZE);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("byteString == null");
    }

    private void writeMetadata(long j) {
        jH jHVar = new jH();
        jM jMVar = this.metadata;
        if (jMVar != null) {
            jMVar.m2958(jHVar);
            new FileOperator(this.file.getChannel()).write(FILE_HEADER_SIZE + j, jHVar, (long) this.metadata.m2967());
            return;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* access modifiers changed from: package-private */
    public final void commit(long j) {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, (long) this.metadata.m2967());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Util.closeQuietly((Closeable) this.upstream);
        this.upstream = null;
    }

    /* access modifiers changed from: package-private */
    public final boolean isClosed() {
        return this.file == null;
    }

    public final jM metadata() {
        return this.metadata;
    }

    public final jY newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    class RelaySource implements jY {
        private FileOperator fileOperator = new FileOperator(Relay.this.file.getChannel());
        private long sourcePos;
        private final C3533kb timeout = new C3533kb();

        RelaySource() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            r5 = r7 - r1.this$0.buffer.f2411;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
            if (r1.sourcePos >= r5) goto L_0x0115;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
            r5 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            r2 = java.lang.Math.min(r2, r7 - r1.sourcePos);
            r1.this$0.buffer.m2864(r22, r1.sourcePos - r5, r2);
            r1.sourcePos += r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0130, code lost:
            return r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(o.jH r22, long r23) {
            /*
                r21 = this;
                r1 = r21
                r2 = r23
                okhttp3.internal.cache2.FileOperator r0 = r1.fileOperator
                if (r0 == 0) goto L_0x0134
                okhttp3.internal.cache2.Relay r4 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r4)
            L_0x000b:
                long r5 = r1.sourcePos     // Catch:{ all -> 0x0131 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0131 }
                long r7 = r0.upstreamPos     // Catch:{ all -> 0x0131 }
                r0 = 2
                r9 = -1
                int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r11 != 0) goto L_0x0039
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0131 }
                boolean r5 = r5.complete     // Catch:{ all -> 0x0131 }
                if (r5 == 0) goto L_0x0020
                monitor-exit(r4)     // Catch:{ all -> 0x0131 }
                return r9
            L_0x0020:
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0131 }
                java.lang.Thread r5 = r5.upstreamReader     // Catch:{ all -> 0x0131 }
                if (r5 == 0) goto L_0x002e
                o.kb r0 = r1.timeout     // Catch:{ all -> 0x0131 }
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0131 }
                r0.waitUntilNotified(r5)     // Catch:{ all -> 0x0131 }
                goto L_0x000b
            L_0x002e:
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0131 }
                java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0131 }
                r5.upstreamReader = r6     // Catch:{ all -> 0x0131 }
                r5 = 1
                monitor-exit(r4)     // Catch:{ all -> 0x0131 }
                goto L_0x0049
            L_0x0039:
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0131 }
                o.jH r5 = r5.buffer     // Catch:{ all -> 0x0131 }
                long r5 = r5.f2411     // Catch:{ all -> 0x0131 }
                long r5 = r7 - r5
                long r11 = r1.sourcePos     // Catch:{ all -> 0x0131 }
                int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r13 >= 0) goto L_0x0115
                monitor-exit(r4)     // Catch:{ all -> 0x0131 }
                r5 = 2
            L_0x0049:
                r11 = 32
                if (r5 != r0) goto L_0x0067
                long r4 = r1.sourcePos
                long r7 = r7 - r4
                long r2 = java.lang.Math.min(r2, r7)
                okhttp3.internal.cache2.FileOperator r13 = r1.fileOperator
                long r4 = r1.sourcePos
                long r14 = r4 + r11
                r16 = r22
                r17 = r2
                r13.read(r14, r16, r17)
                long r4 = r1.sourcePos
                long r4 = r4 + r2
                r1.sourcePos = r4
                return r2
            L_0x0067:
                r4 = 0
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0103 }
                o.jY r0 = r0.upstream     // Catch:{ all -> 0x0103 }
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0103 }
                o.jH r5 = r5.upstreamBuffer     // Catch:{ all -> 0x0103 }
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0103 }
                long r13 = r6.bufferMaxSize     // Catch:{ all -> 0x0103 }
                long r5 = r0.read(r5, r13)     // Catch:{ all -> 0x0103 }
                int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r0 != 0) goto L_0x0092
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0103 }
                r0.commit(r7)     // Catch:{ all -> 0x0103 }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x008f }
                r0.upstreamReader = r4     // Catch:{ all -> 0x008f }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x008f }
                r0.notifyAll()     // Catch:{ all -> 0x008f }
                monitor-exit(r2)     // Catch:{ all -> 0x008f }
                return r9
            L_0x008f:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0092:
                long r2 = java.lang.Math.min(r5, r2)     // Catch:{ all -> 0x0103 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0103 }
                o.jH r13 = r0.upstreamBuffer     // Catch:{ all -> 0x0103 }
                r15 = 0
                r14 = r22
                r17 = r2
                r13.m2864((o.jH) r14, (long) r15, (long) r17)     // Catch:{ all -> 0x0103 }
                long r9 = r1.sourcePos     // Catch:{ all -> 0x0103 }
                long r9 = r9 + r2
                r1.sourcePos = r9     // Catch:{ all -> 0x0103 }
                okhttp3.internal.cache2.FileOperator r15 = r1.fileOperator     // Catch:{ all -> 0x0103 }
                long r16 = r7 + r11
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0103 }
                o.jH r0 = r0.upstreamBuffer     // Catch:{ all -> 0x0103 }
                o.jH r18 = r0.clone()     // Catch:{ all -> 0x0103 }
                r19 = r5
                r15.write(r16, r18, r19)     // Catch:{ all -> 0x0103 }
                okhttp3.internal.cache2.Relay r7 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0103 }
                monitor-enter(r7)     // Catch:{ all -> 0x0103 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0100 }
                o.jH r0 = r0.buffer     // Catch:{ all -> 0x0100 }
                okhttp3.internal.cache2.Relay r8 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0100 }
                o.jH r8 = r8.upstreamBuffer     // Catch:{ all -> 0x0100 }
                r0.write(r8, r5)     // Catch:{ all -> 0x0100 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0100 }
                o.jH r0 = r0.buffer     // Catch:{ all -> 0x0100 }
                long r8 = r0.f2411     // Catch:{ all -> 0x0100 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0100 }
                long r10 = r0.bufferMaxSize     // Catch:{ all -> 0x0100 }
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 <= 0) goto L_0x00e7
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0100 }
                o.jH r0 = r0.buffer     // Catch:{ all -> 0x0100 }
                okhttp3.internal.cache2.Relay r8 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0100 }
                o.jH r8 = r8.buffer     // Catch:{ all -> 0x0100 }
                long r8 = r8.f2411     // Catch:{ all -> 0x0100 }
                okhttp3.internal.cache2.Relay r10 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0100 }
                long r10 = r10.bufferMaxSize     // Catch:{ all -> 0x0100 }
                long r8 = r8 - r10
                r0.m2896((long) r8)     // Catch:{ all -> 0x0100 }
            L_0x00e7:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0100 }
                long r8 = r0.upstreamPos     // Catch:{ all -> 0x0100 }
                long r8 = r8 + r5
                r0.upstreamPos = r8     // Catch:{ all -> 0x0100 }
                monitor-exit(r7)     // Catch:{ all -> 0x0100 }
                okhttp3.internal.cache2.Relay r5 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r5)
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x00fd }
                r0.upstreamReader = r4     // Catch:{ all -> 0x00fd }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x00fd }
                r0.notifyAll()     // Catch:{ all -> 0x00fd }
                monitor-exit(r5)     // Catch:{ all -> 0x00fd }
                return r2
            L_0x00fd:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            L_0x0100:
                r0 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0103 }
                throw r0     // Catch:{ all -> 0x0103 }
            L_0x0103:
                r0 = move-exception
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0112 }
                r3.upstreamReader = r4     // Catch:{ all -> 0x0112 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0112 }
                r3.notifyAll()     // Catch:{ all -> 0x0112 }
                monitor-exit(r2)     // Catch:{ all -> 0x0112 }
                throw r0
            L_0x0112:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0115:
                long r9 = r1.sourcePos     // Catch:{ all -> 0x0131 }
                long r7 = r7 - r9
                long r2 = java.lang.Math.min(r2, r7)     // Catch:{ all -> 0x0131 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0131 }
                o.jH r9 = r0.buffer     // Catch:{ all -> 0x0131 }
                long r7 = r1.sourcePos     // Catch:{ all -> 0x0131 }
                long r11 = r7 - r5
                r10 = r22
                r13 = r2
                r9.m2864((o.jH) r10, (long) r11, (long) r13)     // Catch:{ all -> 0x0131 }
                long r5 = r1.sourcePos     // Catch:{ all -> 0x0131 }
                long r5 = r5 + r2
                r1.sourcePos = r5     // Catch:{ all -> 0x0131 }
                monitor-exit(r4)     // Catch:{ all -> 0x0131 }
                return r2
            L_0x0131:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            L_0x0134:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "closed"
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(o.jH, long):long");
        }

        public C3533kb timeout() {
            return this.timeout;
        }

        public void close() {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                synchronized (Relay.this) {
                    Relay relay = Relay.this;
                    relay.sourceCount--;
                    if (Relay.this.sourceCount == 0) {
                        RandomAccessFile randomAccessFile2 = Relay.this.file;
                        Relay.this.file = null;
                        randomAccessFile = randomAccessFile2;
                    }
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly((Closeable) randomAccessFile);
                }
            }
        }
    }
}
