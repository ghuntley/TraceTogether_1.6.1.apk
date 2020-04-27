package o;

import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: o.bp  reason: case insensitive filesystem */
public final class C3305bp implements X509TrustManager {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final X509Certificate[] f1775 = new X509Certificate[0];

    /* renamed from: ı  reason: contains not printable characters */
    private final long f1776;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final List<byte[]> f1777 = new LinkedList();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C3307br f1778;

    /* renamed from: ι  reason: contains not printable characters */
    private final TrustManager[] f1779;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Set<X509Certificate> f1780 = Collections.synchronizedSet(new HashSet());

    public C3305bp(C3307br brVar, C3299bj bjVar) {
        this.f1779 = m1827(brVar);
        this.f1778 = brVar;
        this.f1776 = bjVar.m1813();
        for (String r1 : bjVar.m1810()) {
            this.f1777.add(m1826(r1));
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static TrustManager[] m1827(C3307br brVar) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(brVar.f1782);
            return instance.getTrustManagers();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        } catch (KeyStoreException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m1825(X509Certificate x509Certificate) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            for (byte[] equals : this.f1777) {
                if (Arrays.equals(equals, digest)) {
                    return true;
                }
            }
            return false;
        } catch (NoSuchAlgorithmException e) {
            throw new CertificateException(e);
        }
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (!this.f1780.contains(x509CertificateArr[0])) {
            for (TrustManager trustManager : this.f1779) {
                ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
            }
            if (this.f1776 == -1 || System.currentTimeMillis() - this.f1776 <= 15552000000L) {
                X509Certificate[] r8 = C2745.m14516(x509CertificateArr, this.f1778);
                int length = r8.length;
                int i = 0;
                while (i < length) {
                    if (!m1825(r8[i])) {
                        i++;
                    }
                }
                throw new CertificateException("No valid pins found in chain!");
            }
            C3263ac.m1563();
            this.f1780.add(x509CertificateArr[0]);
        }
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return f1775;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static byte[] m1826(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
