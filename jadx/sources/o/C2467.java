package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: o.сι  reason: contains not printable characters */
public final class C2467 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Path f11238 = new Path();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final PathMeasure f11239 = new PathMeasure();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Path f11240 = new Path();

    /* renamed from: Ι  reason: contains not printable characters */
    private static final float f11241 = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: ι  reason: contains not printable characters */
    private static final float[] f11242 = new float[4];

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static float f11243 = -1.0f;

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m12709(int i, int i2, int i3) {
        if (i < 4) {
            return false;
        }
        if (i > 4) {
            return true;
        }
        if (i2 < 4) {
            return false;
        }
        return i2 > 4 || i3 >= 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m12719(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Path m12707(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            Path path2 = path;
            path2.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m12716(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static float m12712(Matrix matrix) {
        float[] fArr = f11242;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f11241;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        float[] fArr2 = f11242;
        return (float) Math.hypot((double) (fArr2[2] - fArr2[0]), (double) (fArr2[3] - fArr2[1]));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m12717(Matrix matrix) {
        float[] fArr = f11242;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        float[] fArr2 = f11242;
        return fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3];
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m12715(Path path, float f, float f2, float f3) {
        C2921.m15081();
        f11239.setPath(path, false);
        float length = f11239.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C2921.m15080();
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C2921.m15080();
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C2493.m13238(min, length);
                max = (float) C2493.m13238(max, length);
            }
            if (min < 0.0f) {
                min = (float) C2493.m13238(min, length);
            }
            if (max < 0.0f) {
                max = (float) C2493.m13238(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C2921.m15080();
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            f11238.reset();
            f11239.getSegment(min, max, f11238, true);
            if (max > length) {
                f11240.reset();
                f11239.getSegment(0.0f, max % length, f11240, true);
                f11238.addPath(f11240);
            } else if (min < 0.0f) {
                f11240.reset();
                f11239.getSegment(min + length, length, f11240, true);
                f11238.addPath(f11240);
            }
            path.set(f11238);
            C2921.m15080();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static float m12711() {
        if (f11243 == -1.0f) {
            f11243 = Resources.getSystem().getDisplayMetrics().density;
        }
        return f11243;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static float m12713(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        return Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static Bitmap m12720(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m12718(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m12714(Canvas canvas, RectF rectF, Paint paint) {
        m12710(canvas, rectF, paint, 31);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m12710(Canvas canvas, RectF rectF, Paint paint, int i) {
        C2921.m15081();
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        C2921.m15080();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m12708(Path path, C0851 r4) {
        if (r4 != null && !r4.f5562) {
            m12715(path, ((C0965) r4.f5565).m6884() / 100.0f, ((C0965) r4.f5564).m6884() / 100.0f, ((C0965) r4.f5566).m6884() / 360.0f);
        }
    }
}
