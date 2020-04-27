package o;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class mH {

    /* renamed from: ǃ  reason: contains not printable characters */
    mK f3097;

    /* renamed from: ɩ  reason: contains not printable characters */
    public Cif f3098 = null;

    /* renamed from: o.mH$if  reason: invalid class name */
    public interface Cif {
        /* renamed from: Ι  reason: contains not printable characters */
        void m3746(Map<String, Boolean> map, List<String> list);
    }

    /* renamed from: o.mH$ɩ  reason: contains not printable characters */
    public interface C0236 {
        /* renamed from: ı  reason: contains not printable characters */
        void m3747(List<mE> list);

        /* renamed from: Ι  reason: contains not printable characters */
        void m3748();
    }

    public mH(Context context) {
        this.f3097 = new mK(context);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static List<mE> m3741(Context context, List<mE> list) {
        ArrayList arrayList = new ArrayList();
        for (mE next : list) {
            if (next.f3078) {
                if (TextUtils.isEmpty(next.f3079)) {
                    arrayList.add(next);
                } else {
                    if (C0651.m5452(context, next.f3079) == 0) {
                        arrayList.add(next);
                    }
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<String> m3743(List<mE> list) {
        ArrayList arrayList = new ArrayList();
        for (mE next : list) {
            if (!TextUtils.isEmpty(next.f3079)) {
                mK mKVar = this.f3097;
                if (!mKVar.f3110.contains(next.f3079) && next.f3078) {
                    arrayList.add(next.f3079);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean m3742(Context context) {
        return (Build.VERSION.SDK_INT < 19) || (C0651.m5452(context, "android.permission.READ_EXTERNAL_STORAGE") == 0);
    }
}
