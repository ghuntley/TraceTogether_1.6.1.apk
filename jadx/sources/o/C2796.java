package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: o.Ӏɺ  reason: contains not printable characters */
public class C2796 implements ServiceConnection {

    /* renamed from: ı  reason: contains not printable characters */
    public final BlockingQueue<IBinder> f13213 = new LinkedBlockingQueue();

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean f13214 = false;

    public void onServiceDisconnected(ComponentName componentName) {
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f13213.add(iBinder);
    }
}
