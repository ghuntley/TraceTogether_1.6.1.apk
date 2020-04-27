package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatViewInflater;
import o.C0881;
import o.C0898;
import o.C0983;
import o.C1297;
import o.C1372;
import o.C1514;
import o.C1579;
import o.C1713;
import o.C1905;
import o.C3212;
import o.C3273am;

public class MaterialComponentsViewInflater extends AppCompatViewInflater {

    /* renamed from: ι  reason: contains not printable characters */
    private static int f915 = -1;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public C1905 m1048(Context context, AttributeSet attributeSet) {
        return new C1713(context, attributeSet);
    }

    /* renamed from: І  reason: contains not printable characters */
    public C0983 m1046(Context context, AttributeSet attributeSet) {
        return new C3212(context, attributeSet);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C1514 m1045(Context context, AttributeSet attributeSet) {
        return new C1372(context, attributeSet);
    }

    /* renamed from: і  reason: contains not printable characters */
    public C0898 m1047(Context context, AttributeSet attributeSet) {
        return new C1297(context, attributeSet);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public C0881 m1044(Context context, AttributeSet attributeSet) {
        boolean z = false;
        if (Build.VERSION.SDK_INT == 23 || Build.VERSION.SDK_INT == 24 || Build.VERSION.SDK_INT == 25) {
            if (f915 == -1) {
                f915 = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", C3273am.f1518);
            }
            int i = f915;
            if (i != 0 && i != -1) {
                int i2 = 0;
                while (true) {
                    if (i2 < attributeSet.getAttributeCount()) {
                        if (attributeSet.getAttributeNameResource(i2) == 16842964 && f915 == attributeSet.getAttributeListValue(i2, (String[]) null, 0)) {
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
        }
        if (z) {
            return new C0881(context, attributeSet);
        }
        return new C1579(context, attributeSet);
    }
}
