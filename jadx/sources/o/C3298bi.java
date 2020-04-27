package o;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: o.bi  reason: case insensitive filesystem */
public final class C3298bi {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C0125 f1750 = C0125.f1761;

    /* renamed from: ı  reason: contains not printable characters */
    public HttpURLConnection f1751 = null;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean f1752;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f1753;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f1754 = true;

    /* renamed from: Ι  reason: contains not printable characters */
    private C0127 f1755;

    /* renamed from: ι  reason: contains not printable characters */
    private URL f1756;
    /* access modifiers changed from: private */

    /* renamed from: і  reason: contains not printable characters */
    public int f1757 = 8192;

    /* renamed from: o.bi$ı  reason: contains not printable characters */
    public interface C0125 {

        /* renamed from: Ι  reason: contains not printable characters */
        public static final C0125 f1761 = new C0125() {
            /* renamed from: ι  reason: contains not printable characters */
            public final HttpURLConnection m1807(URL url) {
                return (HttpURLConnection) url.openConnection();
            }
        };

        /* renamed from: ι  reason: contains not printable characters */
        HttpURLConnection m1806(URL url);
    }

    /* renamed from: o.bi$if  reason: invalid class name */
    public static class Cif extends RuntimeException {
        protected Cif(IOException iOException) {
            super(iOException);
        }

        public final /* bridge */ /* synthetic */ Throwable getCause() {
            return (IOException) super.getCause();
        }
    }

    /* renamed from: o.bi$If */
    public static abstract class If<V> implements Callable<V> {
        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public abstract void m1804();

        /* access modifiers changed from: protected */
        /* renamed from: ι  reason: contains not printable characters */
        public abstract V m1805();

        protected If() {
        }

        public V call() {
            boolean z = true;
            try {
                V r0 = m1805();
                try {
                    m1804();
                    return r0;
                } catch (IOException e) {
                    throw new Cif(e);
                }
            } catch (Cif e2) {
                throw e2;
            } catch (IOException e3) {
                throw new Cif(e3);
            } catch (Throwable th) {
                th = th;
                m1804();
                throw th;
            }
        }
    }

    /* renamed from: o.bi$ǃ  reason: contains not printable characters */
    public static abstract class C0126<V> extends If<V> {

        /* renamed from: ı  reason: contains not printable characters */
        private final boolean f1762;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Closeable f1763;

        protected C0126(Closeable closeable, boolean z) {
            this.f1763 = closeable;
            this.f1762 = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m1808() {
            Closeable closeable = this.f1763;
            if (closeable instanceof Flushable) {
                ((Flushable) closeable).flush();
            }
            if (this.f1762) {
                try {
                    this.f1763.close();
                } catch (IOException unused) {
                }
            } else {
                this.f1763.close();
            }
        }
    }

    /* renamed from: o.bi$ɩ  reason: contains not printable characters */
    public static class C0127 extends BufferedOutputStream {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final CharsetEncoder f1764;

        public C0127(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.f1764 = Charset.forName(C3298bi.m1792(str)).newEncoder();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0127 m1809(String str) {
            ByteBuffer encode = this.f1764.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m1781(CharSequence charSequence) {
        int i;
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            int port = url.getPort();
            if (port != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(host);
                sb.append(':');
                sb.append(Integer.toString(port));
                host = sb.toString();
            }
            try {
                String aSCIIString = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0 || (i = indexOf + 1) >= aSCIIString.length()) {
                    return aSCIIString;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aSCIIString.substring(0, i));
                sb2.append(aSCIIString.substring(i).replace("+", "%2B").replace("#", "%23"));
                return sb2.toString();
            } catch (URISyntaxException e) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e);
                throw new Cif(iOException);
            }
        } catch (IOException e2) {
            throw new Cif(e2);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m1782(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return charSequence2;
        }
        StringBuilder sb = new StringBuilder(charSequence2);
        if (charSequence2.indexOf(58) + 2 == charSequence2.lastIndexOf(47)) {
            sb.append('/');
        }
        int indexOf = charSequence2.indexOf(63);
        int length = sb.length() - 1;
        if (indexOf == -1) {
            sb.append('?');
        } else if (indexOf < length && charSequence2.charAt(length) != '&') {
            sb.append('&');
        }
        Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
        Map.Entry next = it.next();
        sb.append(next.getKey().toString());
        sb.append('=');
        Object value = next.getValue();
        if (value != null) {
            sb.append(value);
        }
        while (it.hasNext()) {
            sb.append('&');
            Map.Entry next2 = it.next();
            sb.append(next2.getKey().toString());
            sb.append('=');
            Object value2 = next2.getValue();
            if (value2 != null) {
                sb.append(value2);
            }
        }
        return sb.toString();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C3298bi m1794(CharSequence charSequence, Map<?, ?> map) {
        return new C3298bi(m1781((CharSequence) m1782(charSequence, map)), "GET");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C3298bi m1786(CharSequence charSequence, Map<?, ?> map) {
        return new C3298bi(m1781((CharSequence) m1782(charSequence, map)), "POST");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C3298bi m1790(CharSequence charSequence) {
        return new C3298bi(charSequence, "PUT");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C3298bi m1785(CharSequence charSequence) {
        return new C3298bi(charSequence, "DELETE");
    }

    private C3298bi(CharSequence charSequence, String str) {
        try {
            this.f1756 = new URL(charSequence.toString());
            this.f1753 = str;
        } catch (MalformedURLException e) {
            throw new Cif(e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final HttpURLConnection m1802() {
        try {
            HttpURLConnection r0 = f1750.m1806(this.f1756);
            r0.setRequestMethod(this.f1753);
            return r0;
        } catch (IOException e) {
            throw new Cif(e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f1751 == null) {
            this.f1751 = m1802();
        }
        sb.append(this.f1751.getRequestMethod());
        sb.append(' ');
        if (this.f1751 == null) {
            this.f1751 = m1802();
        }
        sb.append(this.f1751.getURL());
        return sb.toString();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m1799() {
        try {
            m1795();
            if (this.f1751 == null) {
                this.f1751 = m1802();
            }
            return this.f1751.getResponseCode();
        } catch (IOException e) {
            throw new Cif(e);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private InputStream m1791() {
        if (m1799() < 400) {
            try {
                if (this.f1751 == null) {
                    this.f1751 = m1802();
                }
                return this.f1751.getInputStream();
            } catch (IOException e) {
                throw new Cif(e);
            }
        } else {
            if (this.f1751 == null) {
                this.f1751 = m1802();
            }
            InputStream errorStream = this.f1751.getErrorStream();
            if (errorStream != null) {
                return errorStream;
            }
            try {
                if (this.f1751 == null) {
                    this.f1751 = m1802();
                }
                return this.f1751.getInputStream();
            } catch (IOException e2) {
                throw new Cif(e2);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f A[EDGE_INSN: B:30:0x006f->B:29:0x006f ?: BREAK  , SYNTHETIC] */
    /* renamed from: Ι  reason: contains not printable characters */
    private static java.lang.String m1789(java.lang.String r8, java.lang.String r9) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x006f
            int r1 = r8.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x006f
        L_0x000a:
            int r1 = r8.length()
            r2 = 59
            int r3 = r8.indexOf(r2)
            r4 = 1
            int r3 = r3 + r4
            if (r3 == 0) goto L_0x006f
            if (r3 != r1) goto L_0x001b
            goto L_0x006f
        L_0x001b:
            int r5 = r8.indexOf(r2, r3)
            r6 = -1
            if (r5 != r6) goto L_0x0023
        L_0x0022:
            r5 = r1
        L_0x0023:
            if (r3 >= r5) goto L_0x006f
            r7 = 61
            int r7 = r8.indexOf(r7, r3)
            if (r7 == r6) goto L_0x0066
            if (r7 >= r5) goto L_0x0066
            java.lang.String r3 = r8.substring(r3, r7)
            java.lang.String r3 = r3.trim()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0066
            int r7 = r7 + 1
            java.lang.String r3 = r8.substring(r7, r5)
            java.lang.String r3 = r3.trim()
            int r7 = r3.length()
            if (r7 == 0) goto L_0x0066
            r8 = 2
            if (r7 <= r8) goto L_0x0065
            r8 = 0
            char r8 = r3.charAt(r8)
            r9 = 34
            if (r9 != r8) goto L_0x0065
            int r7 = r7 - r4
            char r8 = r3.charAt(r7)
            if (r9 != r8) goto L_0x0065
            java.lang.String r8 = r3.substring(r4, r7)
            return r8
        L_0x0065:
            return r3
        L_0x0066:
            int r3 = r5 + 1
            int r5 = r8.indexOf(r2, r3)
            if (r5 != r6) goto L_0x0023
            goto L_0x0022
        L_0x006f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3298bi.m1789(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: і  reason: contains not printable characters */
    private C3298bi m1795() {
        C0127 r0 = this.f1755;
        if (r0 == null) {
            return this;
        }
        if (this.f1752) {
            r0.m1809("\r\n--00content0boundary00--\r\n");
        }
        if (this.f1754) {
            try {
                this.f1755.close();
            } catch (IOException unused) {
            }
        } else {
            this.f1755.close();
        }
        this.f1755 = null;
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3298bi m1800() {
        try {
            return m1795();
        } catch (IOException e) {
            throw new Cif(e);
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private C3298bi m1788() {
        if (this.f1755 != null) {
            return this;
        }
        if (this.f1751 == null) {
            this.f1751 = m1802();
        }
        this.f1751.setDoOutput(true);
        if (this.f1751 == null) {
            this.f1751 = m1802();
        }
        String r0 = m1789(this.f1751.getRequestProperty("Content-Type"), "charset");
        if (this.f1751 == null) {
            this.f1751 = m1802();
        }
        this.f1755 = new C0127(this.f1751.getOutputStream(), r0, this.f1757);
        return this;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C3298bi m1783() {
        if (!this.f1752) {
            this.f1752 = true;
            if (this.f1751 == null) {
                this.f1751 = m1802();
            }
            this.f1751.setRequestProperty("Content-Type", "multipart/form-data; boundary=00content0boundary00");
            m1788();
            this.f1755.m1809("--00content0boundary00\r\n");
        } else {
            this.f1755.m1809("\r\n--00content0boundary00\r\n");
        }
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3298bi m1787(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(str);
        if (str2 != null) {
            sb.append("\"; filename=\"");
            sb.append(str2);
        }
        sb.append('\"');
        m1793((CharSequence) "Content-Disposition").m1793((CharSequence) ": ").m1793((CharSequence) sb.toString()).m1793((CharSequence) "\r\n");
        if (str3 != null) {
            m1793((CharSequence) "Content-Type").m1793((CharSequence) ": ").m1793((CharSequence) str3).m1793((CharSequence) "\r\n");
        }
        return m1793((CharSequence) "\r\n");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C3298bi m1797(String str, String str2) {
        try {
            m1783();
            m1787(str, (String) null, (String) null);
            this.f1755.m1809(str2);
            return this;
        } catch (IOException e) {
            throw new Cif(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0024 A[SYNTHETIC, Splitter:B:19:0x0024] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.C3298bi m1801(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7) {
        /*
            r3 = this;
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x001b }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x001b }
            r2.<init>(r7)     // Catch:{ IOException -> 0x001b }
            r1.<init>(r2)     // Catch:{ IOException -> 0x001b }
            o.bi r4 = r3.m1798(r4, r5, r6, r1)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r1.close()     // Catch:{ IOException -> 0x0012 }
        L_0x0012:
            return r4
        L_0x0013:
            r4 = move-exception
            r0 = r1
            goto L_0x0022
        L_0x0016:
            r4 = move-exception
            r0 = r1
            goto L_0x001c
        L_0x0019:
            r4 = move-exception
            goto L_0x0022
        L_0x001b:
            r4 = move-exception
        L_0x001c:
            o.bi$if r5 = new o.bi$if     // Catch:{ all -> 0x0019 }
            r5.<init>(r4)     // Catch:{ all -> 0x0019 }
            throw r5     // Catch:{ all -> 0x0019 }
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3298bi.m1801(java.lang.String, java.lang.String, java.lang.String, java.io.File):o.bi");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C3298bi m1798(String str, String str2, String str3, InputStream inputStream) {
        try {
            m1783();
            m1787(str, str2, str3);
            final C0127 r5 = this.f1755;
            final InputStream inputStream2 = inputStream;
            new C0126<C3298bi>(inputStream, this.f1754) {
                /* renamed from: ι  reason: contains not printable characters */
                public final /* synthetic */ Object m1803() {
                    byte[] bArr = new byte[C3298bi.this.f1757];
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read == -1) {
                            return C3298bi.this;
                        }
                        r5.write(bArr, 0, read);
                    }
                }
            }.call();
            return this;
        } catch (IOException e) {
            throw new Cif(e);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private C3298bi m1793(CharSequence charSequence) {
        try {
            m1788();
            this.f1755.m1809(charSequence.toString());
            return this;
        } catch (IOException e) {
            throw new Cif(e);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private String m1784(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        m1800();
        if (this.f1751 == null) {
            this.f1751 = m1802();
        }
        int headerFieldInt = this.f1751.getHeaderFieldInt("Content-Length", -1);
        if (headerFieldInt > 0) {
            byteArrayOutputStream = new ByteArrayOutputStream(headerFieldInt);
        } else {
            byteArrayOutputStream = new ByteArrayOutputStream();
        }
        try {
            final BufferedInputStream bufferedInputStream = new BufferedInputStream(m1791(), this.f1757);
            final ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            new C0126<C3298bi>(bufferedInputStream, this.f1754) {
                /* renamed from: ι  reason: contains not printable characters */
                public final /* synthetic */ Object m1803() {
                    byte[] bArr = new byte[C3298bi.this.f1757];
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read == -1) {
                            return C3298bi.this;
                        }
                        r5.write(bArr, 0, read);
                    }
                }
            }.call();
            if (str == null || str.length() <= 0) {
                str = "UTF-8";
            }
            return byteArrayOutputStream.toString(str);
        } catch (IOException e) {
            throw new Cif(e);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m1796() {
        m1800();
        if (this.f1751 == null) {
            this.f1751 = m1802();
        }
        return m1784(m1789(this.f1751.getHeaderField("Content-Type"), "charset"));
    }

    /* renamed from: ι  reason: contains not printable characters */
    static /* synthetic */ String m1792(String str) {
        return (str == null || str.length() <= 0) ? "UTF-8" : str;
    }
}
