package o;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: o.ҳ  reason: contains not printable characters */
public interface C2722 extends IInterface {

    /* renamed from: o.ҳ$If */
    public static abstract class If extends C0495 implements C2722 {

        /* renamed from: o.ҳ$If$ɩ  reason: contains not printable characters */
        public static class C2723 extends C0480 implements C2722 {
            C2723(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public If() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static C2722 m14456(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof C2722) {
                return (C2722) queryLocalInterface;
            }
            return new C2723(iBinder);
        }
    }
}
