package o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;

@SuppressLint({"InlinedApi"})
/* renamed from: o.ιƖ  reason: contains not printable characters */
public final class C1955 {
    /* renamed from: ι  reason: contains not printable characters */
    public static Spanned m10678(String str, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, i);
        }
        return Html.fromHtml(str);
    }
}
