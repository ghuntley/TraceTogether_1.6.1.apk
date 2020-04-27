package o;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: o.υɪ  reason: contains not printable characters */
final class C2127 extends SSLSocket {

    /* renamed from: ı  reason: contains not printable characters */
    private final SSLSocket f10275;

    C2127(C2271 r1, SSLSocket sSLSocket) {
        this.f10275 = sSLSocket;
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f10275.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f10275.setEnabledProtocols(strArr);
    }

    public final String[] getSupportedCipherSuites() {
        return this.f10275.getSupportedCipherSuites();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f10275.getEnabledCipherSuites();
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f10275.setEnabledCipherSuites(strArr);
    }

    public final String[] getSupportedProtocols() {
        return this.f10275.getSupportedProtocols();
    }

    public final String[] getEnabledProtocols() {
        return this.f10275.getEnabledProtocols();
    }

    public final SSLSession getSession() {
        return this.f10275.getSession();
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f10275.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f10275.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void startHandshake() {
        this.f10275.startHandshake();
    }

    public final void setUseClientMode(boolean z) {
        this.f10275.setUseClientMode(z);
    }

    public final boolean getUseClientMode() {
        return this.f10275.getUseClientMode();
    }

    public final void setNeedClientAuth(boolean z) {
        this.f10275.setNeedClientAuth(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f10275.setWantClientAuth(z);
    }

    public final boolean getNeedClientAuth() {
        return this.f10275.getNeedClientAuth();
    }

    public final boolean getWantClientAuth() {
        return this.f10275.getWantClientAuth();
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f10275.setEnableSessionCreation(z);
    }

    public final boolean getEnableSessionCreation() {
        return this.f10275.getEnableSessionCreation();
    }

    public final void bind(SocketAddress socketAddress) {
        this.f10275.bind(socketAddress);
    }

    public final synchronized void close() {
        this.f10275.close();
    }

    public final void connect(SocketAddress socketAddress) {
        this.f10275.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) {
        this.f10275.connect(socketAddress, i);
    }

    public final SocketChannel getChannel() {
        return this.f10275.getChannel();
    }

    public final InetAddress getInetAddress() {
        return this.f10275.getInetAddress();
    }

    public final InputStream getInputStream() {
        return this.f10275.getInputStream();
    }

    public final boolean getKeepAlive() {
        return this.f10275.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f10275.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f10275.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f10275.getLocalSocketAddress();
    }

    public final boolean getOOBInline() {
        return this.f10275.getOOBInline();
    }

    public final OutputStream getOutputStream() {
        return this.f10275.getOutputStream();
    }

    public final int getPort() {
        return this.f10275.getPort();
    }

    public final synchronized int getReceiveBufferSize() {
        return this.f10275.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f10275.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() {
        return this.f10275.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() {
        return this.f10275.getSendBufferSize();
    }

    public final int getSoLinger() {
        return this.f10275.getSoLinger();
    }

    public final synchronized int getSoTimeout() {
        return this.f10275.getSoTimeout();
    }

    public final boolean getTcpNoDelay() {
        return this.f10275.getTcpNoDelay();
    }

    public final int getTrafficClass() {
        return this.f10275.getTrafficClass();
    }

    public final boolean isBound() {
        return this.f10275.isBound();
    }

    public final boolean isClosed() {
        return this.f10275.isClosed();
    }

    public final boolean isConnected() {
        return this.f10275.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f10275.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f10275.isOutputShutdown();
    }

    public final void sendUrgentData(int i) {
        this.f10275.sendUrgentData(i);
    }

    public final void setKeepAlive(boolean z) {
        this.f10275.setKeepAlive(z);
    }

    public final void setOOBInline(boolean z) {
        this.f10275.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f10275.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) {
        this.f10275.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) {
        this.f10275.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) {
        this.f10275.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) {
        this.f10275.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) {
        this.f10275.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) {
        this.f10275.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) {
        this.f10275.setTrafficClass(i);
    }

    public final void shutdownInput() {
        this.f10275.shutdownInput();
    }

    public final void shutdownOutput() {
        this.f10275.shutdownOutput();
    }

    public final String toString() {
        return this.f10275.toString();
    }

    public final boolean equals(Object obj) {
        return this.f10275.equals(obj);
    }
}
