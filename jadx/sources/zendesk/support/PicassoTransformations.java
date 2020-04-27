package zendesk.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.renderscript.RenderScript;
import java.util.Locale;
import o.C3625y;

public class PicassoTransformations {
    public static C3625y getRoundedTransformation(int i) {
        return new RoundedTransformation(i);
    }

    public static C3625y getBlurTransformation(Context context) {
        return new BlurTransformation(context);
    }

    public static C3625y getRoundWithBorderTransformation(int i, int i2, int i3) {
        return new RoundedTransformation(i, i2, i3);
    }

    static class BlurTransformation implements C3625y {
        private final RenderScript rs;

        public String key() {
            return "blur";
        }

        BlurTransformation(Context context) {
            this.rs = RenderScript.create(context);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap transform(android.graphics.Bitmap r7) {
            /*
                r6 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 17
                if (r0 < r1) goto L_0x0075
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                r1 = 1
                android.graphics.Bitmap r0 = r7.copy(r0, r1)
                android.renderscript.RenderScript r2 = r6.rs
                android.renderscript.Element r3 = android.renderscript.Element.U8_4(r2)
                android.renderscript.ScriptIntrinsicBlur r2 = android.renderscript.ScriptIntrinsicBlur.create(r2, r3)
                r3 = 0
                int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x005d }
                r5 = 18
                if (r4 < r5) goto L_0x0029
                android.renderscript.RenderScript r1 = r6.rs     // Catch:{ all -> 0x005d }
                android.renderscript.Allocation$MipmapControl r4 = android.renderscript.Allocation.MipmapControl.MIPMAP_FULL     // Catch:{ all -> 0x005d }
                r5 = 128(0x80, float:1.794E-43)
                android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r1, r0, r4, r5)     // Catch:{ all -> 0x005d }
                goto L_0x0031
            L_0x0029:
                android.renderscript.RenderScript r4 = r6.rs     // Catch:{ all -> 0x005d }
                android.renderscript.Allocation$MipmapControl r5 = android.renderscript.Allocation.MipmapControl.MIPMAP_FULL     // Catch:{ all -> 0x005d }
                android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r4, r0, r5, r1)     // Catch:{ all -> 0x005d }
            L_0x0031:
                android.renderscript.RenderScript r4 = r6.rs     // Catch:{ all -> 0x005b }
                android.renderscript.Type r5 = r1.getType()     // Catch:{ all -> 0x005b }
                android.renderscript.Allocation r3 = android.renderscript.Allocation.createTyped(r4, r5)     // Catch:{ all -> 0x005b }
                r2.setInput(r1)     // Catch:{ all -> 0x005b }
                r4 = 1103626240(0x41c80000, float:25.0)
                r2.setRadius(r4)     // Catch:{ all -> 0x005b }
                r2.forEach(r3)     // Catch:{ all -> 0x005b }
                r3.copyTo(r0)     // Catch:{ all -> 0x005b }
                r7.recycle()
                android.renderscript.RenderScript r7 = r6.rs
                r7.destroy()
                r2.destroy()
                r1.destroy()
                r3.destroy()
                return r0
            L_0x005b:
                r0 = move-exception
                goto L_0x005f
            L_0x005d:
                r0 = move-exception
                r1 = r3
            L_0x005f:
                r7.recycle()
                android.renderscript.RenderScript r7 = r6.rs
                r7.destroy()
                r2.destroy()
                if (r1 == 0) goto L_0x006f
                r1.destroy()
            L_0x006f:
                if (r3 == 0) goto L_0x0074
                r3.destroy()
            L_0x0074:
                throw r0
            L_0x0075:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.PicassoTransformations.BlurTransformation.transform(android.graphics.Bitmap):android.graphics.Bitmap");
        }
    }

    static class RoundedTransformation implements C3625y {
        private final int radius;
        private final int strokeColor;
        private final int strokeWidth;

        RoundedTransformation(int i) {
            this(i, 0, -1);
        }

        RoundedTransformation(int i, int i2, int i3) {
            this.radius = i;
            this.strokeColor = i2;
            this.strokeWidth = i3;
        }

        public Bitmap transform(Bitmap bitmap) {
            if (this.strokeWidth > 0) {
                if (!bitmap.isMutable()) {
                    Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                    if (copy != bitmap) {
                        bitmap.recycle();
                    }
                    bitmap = copy;
                }
                Canvas canvas = new Canvas(bitmap);
                Paint strokePaint = strokePaint();
                Path path = new Path();
                path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
                RectF mask = getMask(bitmap.getWidth(), bitmap.getHeight(), this.strokeWidth);
                int i = this.radius;
                path.addRoundRect(mask, (float) i, (float) i, Path.Direction.CW);
                canvas.drawPath(path, strokePaint);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            Paint shapePaint = shapePaint(bitmap);
            RectF mask2 = getMask(bitmap.getWidth(), bitmap.getHeight(), 0);
            int i2 = this.radius;
            canvas2.drawRoundRect(mask2, (float) i2, (float) i2, shapePaint);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }

        private RectF getMask(int i, int i2, int i3) {
            float f = (float) i3;
            return new RectF(f, f, (float) (i - i3), (float) (i2 - i3));
        }

        private Paint shapePaint(Bitmap bitmap) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            return paint;
        }

        private Paint strokePaint() {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.strokeColor);
            return paint;
        }

        public String key() {
            return String.format(Locale.US, "rounded-%s-%s-%s", new Object[]{Integer.valueOf(this.radius), Integer.valueOf(this.strokeColor), Integer.valueOf(this.strokeWidth)});
        }
    }
}
