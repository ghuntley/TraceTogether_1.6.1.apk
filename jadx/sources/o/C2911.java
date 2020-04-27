package o;

import android.content.Context;
import android.os.IBinder;

/* renamed from: o.ӏϳ  reason: contains not printable characters */
public abstract class C2911<T> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f13535;

    /* renamed from: ι  reason: contains not printable characters */
    private T f13536;

    public C2911(String str) {
        this.f13535 = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract T m15069(IBinder iBinder);

    /* renamed from: o.ӏϳ$If */
    public static class If extends Exception {
        public If(String str) {
            super(str);
        }

        public If(String str, Throwable th) {
            super(str, th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final T m15068(Context context) {
        if (this.f13536 == null) {
            if (context != null) {
                Context remoteContext = C2877.getRemoteContext(context);
                if (remoteContext != null) {
                    try {
                        this.f13536 = m15069((IBinder) remoteContext.getClassLoader().loadClass(this.f13535).newInstance());
                    } catch (ClassNotFoundException e) {
                        throw new If("Could not load creator class.", e);
                    } catch (InstantiationException e2) {
                        throw new If("Could not instantiate creator.", e2);
                    } catch (IllegalAccessException e3) {
                        throw new If("Could not access creator.", e3);
                    }
                } else {
                    throw new If("Could not get remote context.");
                }
            } else {
                throw new NullPointerException("null reference");
            }
        }
        return this.f13536;
    }
}
