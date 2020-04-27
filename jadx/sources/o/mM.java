package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import o.C3139;
import o.C3154;

public final class mM implements Callable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3154 f3113;

    mM() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static void m3754(View view, boolean z) {
        int i = 0;
        view.findViewById(R.id.f165472131362092).setVisibility(z ? 0 : 8);
        View findViewById = view.findViewById(R.id.f165482131362093);
        if (findViewById != null) {
            if (!z) {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    static int m3752(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return -16777216;
        }
        if (typedValue.resourceId == 0) {
            return typedValue.data;
        }
        return C0651.m5450(context, typedValue.resourceId);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean m3753(String str, Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 128).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    static class If implements C3625y {

        /* renamed from: ι  reason: contains not printable characters */
        private final int f3114;

        If(int i) {
            this.f3114 = i;
        }

        public final Bitmap transform(Bitmap bitmap) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
            int i = this.f3114;
            canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }

        public final String key() {
            return String.format(Locale.US, "rounded-%s-%s", new Object[]{Integer.valueOf(this.f3114), 0});
        }
    }

    public mM(C3154 r1) {
        this.f3113 = r1;
    }

    public final Object call() {
        C3154 r0 = this.f3113;
        boolean z = true;
        if (r0.f14361.getBoolean("save_legacy_configs", true)) {
            C3139.C3143 r1 = r0.m15966();
            HashMap hashMap = new HashMap();
            if (r1 != null) {
                Map<String, C2832> r6 = C3154.m15965(r1.f14344 == null ? C3139.Cif.m15916() : r1.f14344);
                Map<String, C2832> r7 = C3154.m15965(r1.f14347 == null ? C3139.Cif.m15916() : r1.f14347);
                Map<String, C2832> r12 = C3154.m15965(r1.f14349 == null ? C3139.Cif.m15916() : r1.f14349);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.addAll(r6.keySet());
                hashSet.addAll(r7.keySet());
                hashSet.addAll(r12.keySet());
                for (String str : hashSet) {
                    C3154.C3155 r10 = new C3154.C3155((byte) 0);
                    if (r6.containsKey(str)) {
                        r10.f14364 = r6.get(str);
                    }
                    if (r7.containsKey(str)) {
                        r10.f14365 = r7.get(str);
                    }
                    if (r12.containsKey(str)) {
                        r10.f14366 = r12.get(str);
                    }
                    hashMap.put(str, r10);
                }
            }
            r0.m15967((Map<String, C3154.C3155>) hashMap);
            r0.f14361.edit().putBoolean("save_legacy_configs", false).commit();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
