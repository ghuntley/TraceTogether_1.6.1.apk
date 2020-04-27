package o;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: o.br  reason: case insensitive filesystem */
public final class C3307br {

    /* renamed from: ı  reason: contains not printable characters */
    private final HashMap<Principal, X509Certificate> f1781;

    /* renamed from: Ι  reason: contains not printable characters */
    final KeyStore f1782;

    public C3307br(InputStream inputStream, String str) {
        KeyStore r1 = m1831(inputStream, str);
        this.f1781 = m1832(r1);
        this.f1782 = r1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m1834(X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = this.f1781.get(x509Certificate.getSubjectX500Principal());
        return x509Certificate2 != null && x509Certificate2.getPublicKey().equals(x509Certificate.getPublicKey());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final X509Certificate m1833(X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = this.f1781.get(x509Certificate.getIssuerX500Principal());
        if (x509Certificate2 == null || x509Certificate2.getSubjectX500Principal().equals(x509Certificate.getSubjectX500Principal())) {
            return null;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return x509Certificate2;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static HashMap<Principal, X509Certificate> m1832(KeyStore keyStore) {
        try {
            HashMap<Principal, X509Certificate> hashMap = new HashMap<>();
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(aliases.nextElement());
                if (x509Certificate != null) {
                    hashMap.put(x509Certificate.getSubjectX500Principal(), x509Certificate);
                }
            }
            return hashMap;
        } catch (KeyStoreException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static KeyStore m1831(InputStream inputStream, String str) {
        BufferedInputStream bufferedInputStream;
        try {
            KeyStore instance = KeyStore.getInstance("BKS");
            bufferedInputStream = new BufferedInputStream(inputStream);
            instance.load(bufferedInputStream, str.toCharArray());
            bufferedInputStream.close();
            return instance;
        } catch (KeyStoreException e) {
            throw new AssertionError(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        } catch (CertificateException e3) {
            throw new AssertionError(e3);
        } catch (IOException e4) {
            throw new AssertionError(e4);
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }
}
