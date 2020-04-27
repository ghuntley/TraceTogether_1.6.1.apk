package zendesk.core;

import android.os.Build;
import java.net.InetAddress;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.Collections;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import o.F;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;

class Tls12SocketFactory extends SSLSocketFactory {
    private static final String[] TLS_V12_ONLY = {TlsVersion.TLS_1_2.javaName()};
    final SSLSocketFactory delegate;

    public static OkHttpClient.Builder enableTls12OnPreLollipop(OkHttpClient.Builder builder) {
        if (Build.VERSION.SDK_INT < 16 || Build.VERSION.SDK_INT >= 21) {
            F.m1359();
            builder.connectionSpecs(Collections.singletonList(new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2, TlsVersion.TLS_1_3).build()));
        } else {
            try {
                SSLContext instance = SSLContext.getInstance("TLSv1.2");
                instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
                builder.sslSocketFactory(new Tls12SocketFactory(instance.getSocketFactory()));
                builder.connectionSpecs(Collections.singletonList(new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build()));
                F.m1359();
            } catch (Exception unused) {
                F.m1355();
            }
        }
        return builder;
    }

    public Tls12SocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.delegate = sSLSocketFactory;
    }

    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return patch(this.delegate.createSocket(socket, str, i, z));
    }

    public Socket createSocket(String str, int i) {
        return patch(this.delegate.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return patch(this.delegate.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        return patch(this.delegate.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return patch(this.delegate.createSocket(inetAddress, i, inetAddress2, i2));
    }

    private static Socket patch(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(TLS_V12_ONLY);
        }
        return socket;
    }
}
