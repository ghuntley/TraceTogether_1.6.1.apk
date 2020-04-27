package o;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: o.էі  reason: contains not printable characters */
public final class C3074 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C3074 f14028;

    /* renamed from: ı  reason: contains not printable characters */
    private C1588 f14029 = new C1588(this, (byte) 0);

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Context f14030;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f14031 = 1;

    /* renamed from: ι  reason: contains not printable characters */
    public final ScheduledExecutorService f14032;

    /* renamed from: o.էі$ǃ  reason: contains not printable characters */
    interface C3075 {
        /* renamed from: ı  reason: contains not printable characters */
        int m15684();

        /* renamed from: ι  reason: contains not printable characters */
        byte m15685(int i);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static String m15677(C3075 r5) {
        StringBuilder sb = new StringBuilder(r5.m15684());
        for (int i = 0; i < r5.m15684(); i++) {
            byte r2 = r5.m15685(i);
            if (r2 == 34) {
                sb.append("\\\"");
            } else if (r2 == 39) {
                sb.append("\\'");
            } else if (r2 != 92) {
                switch (r2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (r2 >= 32 && r2 <= 126) {
                            sb.append((char) r2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((r2 >>> 6) & 3) + 48));
                            sb.append((char) (((r2 >>> 3) & 7) + 48));
                            sb.append((char) ((r2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static synchronized C3074 m15678(Context context) {
        C3074 r7;
        synchronized (C3074.class) {
            if (f14028 == null) {
                f14028 = new C3074(context, C1752.m9828().m9832(1, new C1252("MessengerIpcClient", (byte) 0), C1778.f9108));
            }
            r7 = f14028;
        }
        return r7;
    }

    private C3074(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f14032 = scheduledExecutorService;
        this.f14030 = context.getApplicationContext();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<Void> m15680(int i, Bundle bundle) {
        return m15679(new C1340(m15681(), bundle));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized <T> C0329<T> m15679(C1404<T> r3) {
        if (!this.f14029.m9274(r3)) {
            this.f14029 = new C1588(this, (byte) 0);
            this.f14029.m9274(r3);
        }
        return r3.f7668.f14555;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final synchronized int m15681() {
        int i;
        i = this.f14031;
        this.f14031 = i + 1;
        return i;
    }
}
