package o;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o.C1555;

/* renamed from: o.ս  reason: contains not printable characters */
public final class C3180 {

    /* renamed from: ǃ  reason: contains not printable characters */
    final Map<String, Object> f14442;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Map<String, Object<?>> f14443;

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1555.C1557 f14444;

    private C3180(Map<String, Object> map) {
        this.f14443 = new HashMap();
        this.f14444 = new C1555.C1557() {
            /* renamed from: Ι  reason: contains not printable characters */
            public final Bundle m16053() {
                Set<String> keySet = C3180.this.f14442.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String next : keySet) {
                    arrayList.add(next);
                    arrayList2.add(C3180.this.f14442.get(next));
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("keys", arrayList);
                bundle.putParcelableArrayList("values", arrayList2);
                return bundle;
            }
        };
        this.f14442 = new HashMap(map);
    }

    public C3180() {
        this.f14443 = new HashMap();
        this.f14444 = new C1555.C1557() {
            /* renamed from: Ι  reason: contains not printable characters */
            public final Bundle m16053() {
                Set<String> keySet = C3180.this.f14442.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String next : keySet) {
                    arrayList.add(next);
                    arrayList2.add(C3180.this.f14442.get(next));
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("keys", arrayList);
                bundle.putParcelableArrayList("values", arrayList2);
                return bundle;
            }
        };
        this.f14442 = new HashMap();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C3180 m16052(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new C3180();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new C3180(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new C3180(hashMap);
    }

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        clsArr[4] = Integer.TYPE;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        clsArr[27] = Build.VERSION.SDK_INT >= 21 ? Size.class : Integer.TYPE;
        clsArr[28] = Build.VERSION.SDK_INT >= 21 ? SizeF.class : Integer.TYPE;
    }
}
