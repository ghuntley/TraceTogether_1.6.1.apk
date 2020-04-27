package o;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* renamed from: o.łӀ  reason: contains not printable characters */
public final class C0552 extends Paint {
    public final void setTextLocales(LocaleList localeList) {
    }

    public C0552() {
    }

    public C0552(int i) {
        super(i);
    }

    public C0552(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C0552(PorterDuff.Mode mode, byte b) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
