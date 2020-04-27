package o;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: o.Іͱ  reason: contains not printable characters */
final class C2271 extends SSLSocketFactory {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final SSLSocketFactory f10627;

    C2271() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private C2271(SSLSocketFactory sSLSocketFactory) {
        this.f10627 = sSLSocketFactory;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m11834((SSLSocket) this.f10627.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.f10627.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f10627.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i) {
        return m11834((SSLSocket) this.f10627.createSocket(str, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m11834((SSLSocket) this.f10627.createSocket(inetAddress, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m11834((SSLSocket) this.f10627.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m11834((SSLSocket) this.f10627.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket() {
        return m11834((SSLSocket) this.f10627.createSocket());
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final SSLSocket m11834(SSLSocket sSLSocket) {
        return new C2127(this, sSLSocket);
    }
}
