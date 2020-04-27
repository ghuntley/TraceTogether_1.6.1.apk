package o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

public final class mL {

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Context f3111;

    /* renamed from: Ι  reason: contains not printable characters */
    public final mD f3112;

    mL(Context context, mD mDVar) {
        this.f3111 = context;
        this.f3112 = mDVar;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: Ι  reason: contains not printable characters */
    public static List<Uri> m3750(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 16 && intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                ClipData.Item itemAt = clipData.getItemAt(i);
                if (itemAt.getUri() != null) {
                    arrayList.add(itemAt.getUri());
                }
            }
        } else if (intent.getData() != null) {
            arrayList.add(intent.getData());
        }
        return arrayList;
    }

    @TargetApi(19)
    /* renamed from: ι  reason: contains not printable characters */
    public static Intent m3751(String str, boolean z) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 19) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
        }
        intent.setType(str);
        intent.addCategory("android.intent.category.OPENABLE");
        if (Build.VERSION.SDK_INT >= 18) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        }
        return intent;
    }
}
