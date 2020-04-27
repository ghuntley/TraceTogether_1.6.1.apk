package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jP {

    /* renamed from: Ι  reason: contains not printable characters */
    static final Logger f2434 = Logger.getLogger(jP.class.getName());

    private jP() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static jI m2972(jY jYVar) {
        return new jW(jYVar);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static jK m2979(jZ jZVar) {
        return new jU(jZVar);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static jZ m2977(final OutputStream outputStream) {
        final C3533kb kbVar = new C3533kb();
        if (outputStream != null) {
            return new jZ() {
                public final void write(jH jHVar, long j) {
                    jX.m3051(jHVar.f2411, 0, j);
                    while (j > 0) {
                        C3533kb.this.throwIfReached();
                        jS jSVar = jHVar.f2412;
                        int min = (int) Math.min(j, (long) (jSVar.f2447 - jSVar.f2449));
                        r0.write(jSVar.f2446, jSVar.f2449, min);
                        jSVar.f2449 += min;
                        long j2 = (long) min;
                        j -= j2;
                        jHVar.f2411 -= j2;
                        if (jSVar.f2449 == jSVar.f2447) {
                            jHVar.f2412 = jSVar.m2984();
                            jV.m3018(jSVar);
                        }
                    }
                }

                public final void flush() {
                    r0.flush();
                }

                public final void close() {
                    r0.close();
                }

                public final C3533kb timeout() {
                    return C3533kb.this;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("sink(");
                    sb.append(r0);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static jZ m2975(final Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            final AnonymousClass2 r0 = new jE() {
                /* access modifiers changed from: protected */
                public final IOException newTimeoutException(IOException iOException) {
                    SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                    if (iOException != null) {
                        socketTimeoutException.initCause(iOException);
                    }
                    return socketTimeoutException;
                }

                /* access modifiers changed from: protected */
                public final void timedOut() {
                    try {
                        r2.close();
                    } catch (Exception e) {
                        Logger logger = jP.f2434;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder("Failed to close timed out socket ");
                        sb.append(r2);
                        logger.log(level, sb.toString(), e);
                    } catch (AssertionError e2) {
                        if (jP.m2982(e2)) {
                            Logger logger2 = jP.f2434;
                            Level level2 = Level.WARNING;
                            StringBuilder sb2 = new StringBuilder("Failed to close timed out socket ");
                            sb2.append(r2);
                            logger2.log(level2, sb2.toString(), e2);
                            return;
                        }
                        throw e2;
                    }
                }
            };
            final OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return r0.sink(new jZ() {
                    public final void write(jH jHVar, long j) {
                        jX.m3051(jHVar.f2411, 0, j);
                        while (j > 0) {
                            C3533kb.this.throwIfReached();
                            jS jSVar = jHVar.f2412;
                            int min = (int) Math.min(j, (long) (jSVar.f2447 - jSVar.f2449));
                            r0.write(jSVar.f2446, jSVar.f2449, min);
                            jSVar.f2449 += min;
                            long j2 = (long) min;
                            j -= j2;
                            jHVar.f2411 -= j2;
                            if (jSVar.f2449 == jSVar.f2447) {
                                jHVar.f2412 = jSVar.m2984();
                                jV.m3018(jSVar);
                            }
                        }
                    }

                    public final void flush() {
                        r0.flush();
                    }

                    public final void close() {
                        r0.close();
                    }

                    public final C3533kb timeout() {
                        return C3533kb.this;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("sink(");
                        sb.append(r0);
                        sb.append(")");
                        return sb.toString();
                    }
                });
            }
            throw new IllegalArgumentException("out == null");
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static jY m2974(final InputStream inputStream) {
        final C3533kb kbVar = new C3533kb();
        if (inputStream != null) {
            return new jY() {
                public final long read(jH jHVar, long j) {
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i < 0) {
                        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                    } else if (i == 0) {
                        return 0;
                    } else {
                        try {
                            C3533kb.this.throwIfReached();
                            jS r0 = jHVar.m2853(1);
                            int read = r2.read(r0.f2446, r0.f2447, (int) Math.min(j, (long) (8192 - r0.f2447)));
                            if (read == -1) {
                                return -1;
                            }
                            r0.f2447 += read;
                            long j2 = (long) read;
                            jHVar.f2411 += j2;
                            return j2;
                        } catch (AssertionError e) {
                            if (jP.m2982(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                }

                public final void close() {
                    r2.close();
                }

                public final C3533kb timeout() {
                    return C3533kb.this;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("source(");
                    sb.append(r2);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("in == null");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static jY m2973(File file) {
        if (file != null) {
            final FileInputStream fileInputStream = new FileInputStream(file);
            final C3533kb kbVar = new C3533kb();
            return new jY() {
                public final long read(jH jHVar, long j) {
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i < 0) {
                        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                    } else if (i == 0) {
                        return 0;
                    } else {
                        try {
                            C3533kb.this.throwIfReached();
                            jS r0 = jHVar.m2853(1);
                            int read = r2.read(r0.f2446, r0.f2447, (int) Math.min(j, (long) (8192 - r0.f2447)));
                            if (read == -1) {
                                return -1;
                            }
                            r0.f2447 += read;
                            long j2 = (long) read;
                            jHVar.f2411 += j2;
                            return j2;
                        } catch (AssertionError e) {
                            if (jP.m2982(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                }

                public final void close() {
                    r2.close();
                }

                public final C3533kb timeout() {
                    return C3533kb.this;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("source(");
                    sb.append(r2);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static jZ m2980(File file) {
        if (file != null) {
            final FileOutputStream fileOutputStream = new FileOutputStream(file);
            final C3533kb kbVar = new C3533kb();
            return new jZ() {
                public final void write(jH jHVar, long j) {
                    jX.m3051(jHVar.f2411, 0, j);
                    while (j > 0) {
                        C3533kb.this.throwIfReached();
                        jS jSVar = jHVar.f2412;
                        int min = (int) Math.min(j, (long) (jSVar.f2447 - jSVar.f2449));
                        fileOutputStream.write(jSVar.f2446, jSVar.f2449, min);
                        jSVar.f2449 += min;
                        long j2 = (long) min;
                        j -= j2;
                        jHVar.f2411 -= j2;
                        if (jSVar.f2449 == jSVar.f2447) {
                            jHVar.f2412 = jSVar.m2984();
                            jV.m3018(jSVar);
                        }
                    }
                }

                public final void flush() {
                    fileOutputStream.flush();
                }

                public final void close() {
                    fileOutputStream.close();
                }

                public final C3533kb timeout() {
                    return C3533kb.this;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("sink(");
                    sb.append(fileOutputStream);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static jZ m2976(File file) {
        if (file != null) {
            final FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            final C3533kb kbVar = new C3533kb();
            return new jZ() {
                public final void write(jH jHVar, long j) {
                    jX.m3051(jHVar.f2411, 0, j);
                    while (j > 0) {
                        C3533kb.this.throwIfReached();
                        jS jSVar = jHVar.f2412;
                        int min = (int) Math.min(j, (long) (jSVar.f2447 - jSVar.f2449));
                        fileOutputStream.write(jSVar.f2446, jSVar.f2449, min);
                        jSVar.f2449 += min;
                        long j2 = (long) min;
                        j -= j2;
                        jHVar.f2411 -= j2;
                        if (jSVar.f2449 == jSVar.f2447) {
                            jHVar.f2412 = jSVar.m2984();
                            jV.m3018(jSVar);
                        }
                    }
                }

                public final void flush() {
                    fileOutputStream.flush();
                }

                public final void close() {
                    fileOutputStream.close();
                }

                public final C3533kb timeout() {
                    return C3533kb.this;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("sink(");
                    sb.append(fileOutputStream);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static jZ m2978() {
        return new jZ() {
            public final void close() {
            }

            public final void flush() {
            }

            public final void write(jH jHVar, long j) {
                jHVar.m2896(j);
            }

            public final C3533kb timeout() {
                return C3533kb.NONE;
            }
        };
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static jY m2981(final Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            final AnonymousClass2 r0 = new jE() {
                /* access modifiers changed from: protected */
                public final IOException newTimeoutException(IOException iOException) {
                    SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                    if (iOException != null) {
                        socketTimeoutException.initCause(iOException);
                    }
                    return socketTimeoutException;
                }

                /* access modifiers changed from: protected */
                public final void timedOut() {
                    try {
                        socket.close();
                    } catch (Exception e) {
                        Logger logger = jP.f2434;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder("Failed to close timed out socket ");
                        sb.append(socket);
                        logger.log(level, sb.toString(), e);
                    } catch (AssertionError e2) {
                        if (jP.m2982(e2)) {
                            Logger logger2 = jP.f2434;
                            Level level2 = Level.WARNING;
                            StringBuilder sb2 = new StringBuilder("Failed to close timed out socket ");
                            sb2.append(socket);
                            logger2.log(level2, sb2.toString(), e2);
                            return;
                        }
                        throw e2;
                    }
                }
            };
            final InputStream inputStream = socket.getInputStream();
            if (inputStream != null) {
                return r0.source(new jY() {
                    public final long read(jH jHVar, long j) {
                        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                        if (i < 0) {
                            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                        } else if (i == 0) {
                            return 0;
                        } else {
                            try {
                                C3533kb.this.throwIfReached();
                                jS r0 = jHVar.m2853(1);
                                int read = inputStream.read(r0.f2446, r0.f2447, (int) Math.min(j, (long) (8192 - r0.f2447)));
                                if (read == -1) {
                                    return -1;
                                }
                                r0.f2447 += read;
                                long j2 = (long) read;
                                jHVar.f2411 += j2;
                                return j2;
                            } catch (AssertionError e) {
                                if (jP.m2982(e)) {
                                    throw new IOException(e);
                                }
                                throw e;
                            }
                        }
                    }

                    public final void close() {
                        inputStream.close();
                    }

                    public final C3533kb timeout() {
                        return C3533kb.this;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("source(");
                        sb.append(inputStream);
                        sb.append(")");
                        return sb.toString();
                    }
                });
            }
            throw new IllegalArgumentException("in == null");
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static boolean m2982(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
