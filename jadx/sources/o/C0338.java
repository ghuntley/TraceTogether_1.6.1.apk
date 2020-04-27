package o;

import android.app.Notification;
import android.os.Bundle;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o.C3185;

/* renamed from: o.ıɪ  reason: contains not printable characters */
class C0338 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Object f3705 = new Object();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean f3706;

    /* renamed from: Ι  reason: contains not printable characters */
    private static Field f3707;

    /* renamed from: ι  reason: contains not printable characters */
    private static final Object f3708 = new Object();

    /* renamed from: ǃ  reason: contains not printable characters */
    public static SparseArray<Bundle> m4455(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static Bundle m4457(Notification notification) {
        synchronized (f3705) {
            if (f3706) {
                return null;
            }
            try {
                if (f3707 == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        f3706 = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f3707 = declaredField;
                }
                Bundle bundle = (Bundle) f3707.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f3707.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                f3706 = true;
                return null;
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static Bundle m4459(Notification.Builder builder, C3185.C3186 r4) {
        builder.addAction(r4.m16098(), r4.m16100(), r4.m16095());
        Bundle bundle = new Bundle(r4.m16097());
        if (r4.m16103() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m4456(r4.m16103()));
        }
        if (r4.m16102() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m4456(r4.m16102()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", r4.m16101());
        return bundle;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static Bundle m4458(C3185.C3186 r4) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", r4.m16098());
        bundle2.putCharSequence("title", r4.m16100());
        bundle2.putParcelable("actionIntent", r4.m16095());
        if (r4.m16097() != null) {
            bundle = new Bundle(r4.m16097());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", r4.m16101());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m4456(r4.m16103()));
        bundle2.putBoolean("showsUserInterface", r4.m16096());
        bundle2.putInt("semanticAction", r4.m16099());
        return bundle2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Bundle m4460(C0370 r3) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", r3.f3835);
        bundle.putCharSequence("label", r3.f3836);
        bundle.putCharSequenceArray("choices", r3.f3833);
        bundle.putBoolean("allowFreeFormInput", r3.f3831);
        bundle.putBundle("extras", r3.f3834);
        Set<String> set = r3.f3832;
        if (set != null && !set.isEmpty()) {
            ArrayList arrayList = new ArrayList(set.size());
            for (String add : set) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Bundle[] m4456(C0370[] r3) {
        if (r3 == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[r3.length];
        for (int i = 0; i < r3.length; i++) {
            bundleArr[i] = m4460(r3[i]);
        }
        return bundleArr;
    }
}
