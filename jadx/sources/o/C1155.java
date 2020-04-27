package o;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.ɟɩ  reason: contains not printable characters */
public final class C1155 {

    /* renamed from: ı  reason: contains not printable characters */
    public final Map<String, Typeface> f6695 = new HashMap();

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Map<C1291<String>, Typeface> f6696 = new HashMap();

    /* renamed from: ɩ  reason: contains not printable characters */
    public String f6697 = ".ttf";

    /* renamed from: Ι  reason: contains not printable characters */
    public final AssetManager f6698;

    /* renamed from: ι  reason: contains not printable characters */
    public final C1291<String> f6699 = new C1291<>();

    public C1155(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            C2414.m12460("LottieDrawable must be inside of a view for images to work.");
            this.f6698 = null;
            return;
        }
        this.f6698 = ((View) callback).getContext().getAssets();
    }
}
