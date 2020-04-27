package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.io.IOException;
import o.C0904;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.ǃɿ  reason: contains not printable characters */
public final class C0913 {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static Drawable m6730(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m6727(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    /* renamed from: o.ǃɿ$If */
    public static abstract class If {
        /* renamed from: ǃ  reason: contains not printable characters */
        public abstract void m6734(int i);

        /* renamed from: ǃ  reason: contains not printable characters */
        public abstract void m6735(Typeface typeface);

        /* renamed from: ı  reason: contains not printable characters */
        public final void m6733(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    If.this.m6735(typeface);
                }
            });
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m6736(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    If.this.m6734(i);
                }
            });
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m6729(Context context, int i, If ifR, Handler handler) {
        if (ifR == null) {
            throw new NullPointerException();
        } else if (context.isRestricted()) {
            ifR.m6736(-4, handler);
        } else {
            m6732(context, i, new TypedValue(), 0, ifR, handler, false);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static Typeface m6728(Context context, int i, TypedValue typedValue, int i2, If ifR) {
        if (context.isRestricted()) {
            return null;
        }
        return m6732(context, i, typedValue, i2, ifR, (Handler) null, true);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Typeface m6732(Context context, int i, TypedValue typedValue, int i2, If ifR, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface r8 = m6731(context, resources, typedValue, i, i2, ifR, handler, z);
        if (r8 != null || ifR != null) {
            return r8;
        }
        StringBuilder sb = new StringBuilder("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new Resources.NotFoundException(sb.toString());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static Typeface m6731(Context context, Resources resources, TypedValue typedValue, int i, int i2, If ifR, Handler handler, boolean z) {
        Resources resources2 = resources;
        TypedValue typedValue2 = typedValue;
        int i3 = i;
        int i4 = i2;
        If ifR2 = ifR;
        Handler handler2 = handler;
        if (typedValue2.string != null) {
            String charSequence = typedValue2.string.toString();
            if (!charSequence.startsWith("res/")) {
                if (ifR2 != null) {
                    ifR2.m6736(-3, handler2);
                }
                return null;
            }
            Typeface r1 = C1173.m7686(resources, i, i4);
            if (r1 != null) {
                if (ifR2 != null) {
                    ifR2.m6733(r1, handler2);
                }
                return r1;
            }
            try {
                if (charSequence.toLowerCase().endsWith(".xml")) {
                    C0904.C0905 r12 = C0904.m6696((XmlPullParser) resources.getXml(i), resources);
                    if (r12 != null) {
                        return C1173.m7689(context, r12, resources, i, i2, ifR, handler, z);
                    }
                    if (ifR2 != null) {
                        ifR2.m6736(-3, handler2);
                    }
                    return null;
                }
                Context context2 = context;
                Typeface r0 = C1173.m7687(context, resources, i, charSequence, i4);
                if (ifR2 != null) {
                    if (r0 != null) {
                        ifR2.m6733(r0, handler2);
                    } else {
                        ifR2.m6736(-3, handler2);
                    }
                }
                return r0;
            } catch (IOException | XmlPullParserException unused) {
                if (ifR2 != null) {
                    ifR2.m6736(-3, handler2);
                }
                return null;
            }
        } else {
            StringBuilder sb = new StringBuilder("Resource \"");
            sb.append(resources.getResourceName(i));
            sb.append("\" (");
            sb.append(Integer.toHexString(i));
            sb.append(") is not a Font: ");
            sb.append(typedValue);
            throw new Resources.NotFoundException(sb.toString());
        }
    }
}
