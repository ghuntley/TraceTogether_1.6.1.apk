package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;

/* renamed from: o.mo  reason: case insensitive filesystem */
public class C3602mo {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: Ι  reason: contains not printable characters */
    private static C3602mo f3288;

    /* renamed from: ǃ  reason: contains not printable characters */
    public mL f3289 = new mL(this.f3291, this.f3290);

    /* renamed from: ɩ  reason: contains not printable characters */
    public mD f3290 = new mD();

    /* renamed from: ι  reason: contains not printable characters */
    public final Context f3291;

    private C3602mo(C0255 r3) {
        this.f3291 = r3.f3292;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C3602mo m3911(Context context) {
        synchronized (C3602mo.class) {
            if (f3288 == null) {
                if (context == null || context.getApplicationContext() == null) {
                    throw new IllegalArgumentException("Invalid context provided");
                }
                f3288 = new C3602mo(new C0255(context.getApplicationContext()));
            }
        }
        return f3288;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final mF m3912(String str, String str2) {
        File file;
        Uri r4;
        long j;
        long j2;
        Context context = this.f3291;
        String str3 = "user";
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder(str3);
            sb.append(File.separator);
            sb.append(str);
            str3 = sb.toString();
        }
        File r14 = mP.m3767(context, str3);
        if (r14 == null) {
            file = null;
        } else {
            file = mP.m3772(r14, str2, (String) null);
        }
        new Object[1][0] = file;
        if (file == null || (r4 = mP.m3771(this.f3291, file)) == null) {
            return null;
        }
        mF r0 = mP.m3770(this.f3291, r4);
        if (r0.f3089.contains("image")) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            Pair create = Pair.create(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            j2 = (long) ((Integer) create.first).intValue();
            j = (long) ((Integer) create.second).intValue();
        } else {
            j2 = -1;
            j = -1;
        }
        return new mF(file, r4, r4, str2, r0.f3089, r0.f3091, j2, j);
    }

    /* renamed from: o.mo$ı  reason: contains not printable characters */
    public static class C0255 {

        /* renamed from: ι  reason: contains not printable characters */
        Context f3292;

        public C0255(Context context) {
            this.f3292 = context;
        }
    }
}
