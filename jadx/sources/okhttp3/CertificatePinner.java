package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.jM;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;

public final class CertificatePinner {
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner2) {
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        if (!Util.equal(this.certificateChainCleaner, certificatePinner.certificateChainCleaner) || !this.pins.equals(certificatePinner.pins)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        CertificateChainCleaner certificateChainCleaner2 = this.certificateChainCleaner;
        return ((certificateChainCleaner2 != null ? certificateChainCleaner2.hashCode() : 0) * 31) + this.pins.hashCode();
    }

    public final void check(String str, List<Certificate> list) {
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (!findMatchingPins.isEmpty()) {
            CertificateChainCleaner certificateChainCleaner2 = this.certificateChainCleaner;
            if (certificateChainCleaner2 != null) {
                list = certificateChainCleaner2.clean(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = findMatchingPins.size();
                jM jMVar = null;
                jM jMVar2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    Pin pin = findMatchingPins.get(i2);
                    if (pin.hashAlgorithm.equals("sha256/")) {
                        if (jMVar == null) {
                            jMVar = sha256(x509Certificate);
                        }
                        if (pin.hash.equals(jMVar)) {
                            return;
                        }
                    } else if (pin.hashAlgorithm.equals("sha1/")) {
                        if (jMVar2 == null) {
                            jMVar2 = sha1(x509Certificate);
                        }
                        if (pin.hash.equals(jMVar2)) {
                            return;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("unsupported hashAlgorithm: ");
                        sb.append(pin.hashAlgorithm);
                        throw new AssertionError(sb.toString());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb2.append("\n    ");
                sb2.append(pin(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            int size4 = findMatchingPins.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb2.append("\n    ");
                sb2.append(findMatchingPins.get(i4));
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }

    public final void check(String str, Certificate... certificateArr) {
        check(str, (List<Certificate>) Arrays.asList(certificateArr));
    }

    /* access modifiers changed from: package-private */
    public final List<Pin> findMatchingPins(String str) {
        List<Pin> emptyList = Collections.emptyList();
        for (Pin next : this.pins) {
            if (next.matches(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(next);
            }
        }
        return emptyList;
    }

    /* access modifiers changed from: package-private */
    public final CertificatePinner withCertificateChainCleaner(CertificateChainCleaner certificateChainCleaner2) {
        if (Util.equal(this.certificateChainCleaner, certificateChainCleaner2)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner2);
    }

    public static String pin(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder("sha256/");
            sb.append(sha256((X509Certificate) certificate).m2957());
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static jM sha1(X509Certificate x509Certificate) {
        return jM.m2947(x509Certificate.getPublicKey().getEncoded()).m2959();
    }

    static jM sha256(X509Certificate x509Certificate) {
        return jM.m2947(x509Certificate.getPublicKey().getEncoded()).m2964();
    }

    static final class Pin {
        private static final String WILDCARD = "*.";
        final String canonicalHostname;
        final jM hash;
        final String hashAlgorithm;
        final String pattern;

        Pin(String str, String str2) {
            String str3;
            this.pattern = str;
            if (str.startsWith(WILDCARD)) {
                StringBuilder sb = new StringBuilder("http://");
                sb.append(str.substring(2));
                str3 = HttpUrl.get(sb.toString()).host();
            } else {
                str3 = HttpUrl.get("http://".concat(str)).host();
            }
            this.canonicalHostname = str3;
            if (str2.startsWith("sha1/")) {
                this.hashAlgorithm = "sha1/";
                this.hash = jM.m2951(str2.substring(5));
            } else if (str2.startsWith("sha256/")) {
                this.hashAlgorithm = "sha256/";
                this.hash = jM.m2951(str2.substring(7));
            } else {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
            }
            if (this.hash == null) {
                throw new IllegalArgumentException("pins must be base64: ".concat(str2));
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean matches(String str) {
            if (!this.pattern.startsWith(WILDCARD)) {
                return str.equals(this.canonicalHostname);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 != this.canonicalHostname.length()) {
                return false;
            }
            String str2 = this.canonicalHostname;
            if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                return true;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return this.pattern.equals(pin.pattern) && this.hashAlgorithm.equals(pin.hashAlgorithm) && this.hash.equals(pin.hash);
        }

        public final int hashCode() {
            return ((((this.pattern.hashCode() + 527) * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.hashAlgorithm);
            sb.append(this.hash.m2957());
            return sb.toString();
        }
    }

    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            if (str != null) {
                for (String pin : strArr) {
                    this.pins.add(new Pin(str, pin));
                }
                return this;
            }
            throw new NullPointerException("pattern == null");
        }

        public final CertificatePinner build() {
            return new CertificatePinner(new LinkedHashSet(this.pins), (CertificateChainCleaner) null);
        }
    }
}
