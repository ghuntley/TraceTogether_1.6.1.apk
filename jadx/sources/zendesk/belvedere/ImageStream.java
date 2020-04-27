package zendesk.belvedere;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C1277;
import o.C3602mo;
import o.C3604mq;
import o.C3607mt;
import o.R;
import o.mB;
import o.mC;
import o.mD;
import o.mF;
import o.mH;
import o.mL;
import o.mP;

public class ImageStream extends C1277 {

    /* renamed from: ı  reason: contains not printable characters */
    public C3604mq.C0256 f14756 = null;

    /* renamed from: ǃ  reason: contains not printable characters */
    public List<WeakReference<Cif>> f14757 = new ArrayList();

    /* renamed from: ɩ  reason: contains not printable characters */
    public WeakReference<mC> f14758 = new WeakReference<>((Object) null);

    /* renamed from: ɹ  reason: contains not printable characters */
    public boolean f14759 = false;

    /* renamed from: Ι  reason: contains not printable characters */
    public mB f14760 = null;

    /* renamed from: ι  reason: contains not printable characters */
    public List<WeakReference<C3236>> f14761 = new ArrayList();

    /* renamed from: Ӏ  reason: contains not printable characters */
    public mH f14762;

    /* renamed from: zendesk.belvedere.ImageStream$if  reason: invalid class name */
    public interface Cif {
        void onDismissed();

        void onMediaDeselected(List<mF> list);

        void onMediaSelected(List<mF> list);

        void onVisible();
    }

    /* renamed from: zendesk.belvedere.ImageStream$ɩ  reason: contains not printable characters */
    public interface C3236 {
        void onScroll(int i, int i2, float f);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f14762 = new mH(getContext());
    }

    public void onPause() {
        super.onPause();
        mB mBVar = this.f14760;
        if (mBVar != null) {
            mBVar.dismiss();
            this.f14759 = true;
            return;
        }
        this.f14759 = false;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        mH mHVar = this.f14762;
        int i2 = 0;
        if (i == 9842) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            while (i2 < length) {
                if (iArr[i2] == 0) {
                    hashMap.put(strArr[i2], Boolean.TRUE);
                } else if (iArr[i2] == -1) {
                    hashMap.put(strArr[i2], Boolean.FALSE);
                    if (!shouldShowRequestPermissionRationale(strArr[i2])) {
                        arrayList.add(strArr[i2]);
                    }
                }
                i2++;
            }
            if (mHVar.f3098 != null) {
                mHVar.f3098.m3746(hashMap, arrayList);
            }
            i2 = 1;
        }
        if (i2 == 0) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass1 r0;
        AnonymousClass1 r24;
        int i3 = i2;
        super.onActivityResult(i, i2, intent);
        C3602mo r2 = C3602mo.m3911(getContext());
        AnonymousClass1 r3 = new C3607mt<List<mF>>() {
            public final /* synthetic */ void success(Object obj) {
                List<mF> list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                for (mF mFVar : list) {
                    if (mFVar.f3091 <= ImageStream.this.f14756.f3316 || ImageStream.this.f14756.f3316 == -1) {
                        arrayList.add(mFVar);
                    }
                }
                if (arrayList.size() != list.size()) {
                    Toast.makeText(ImageStream.this.getContext(), R.string.f170432131886127, 0).show();
                }
                ImageStream.this.m16354(arrayList);
            }
        };
        mL mLVar = r2.f3289;
        Context context = r2.f3291;
        ArrayList arrayList = new ArrayList();
        mF r7 = mLVar.f3112.m3737(i);
        if (r7 != null) {
            if (r7.f3087 == null || r7.f3090 == null) {
                r24 = r3;
                new Object[1][0] = Boolean.valueOf(i3 == -1);
                if (i3 == -1) {
                    List<Uri> r1 = mL.m3750(intent);
                    new Object[1][0] = Integer.valueOf(r1.size());
                    for (Uri r12 : r1) {
                        arrayList.add(mP.m3770(context, r12));
                    }
                }
            } else {
                new Object[1][0] = Boolean.valueOf(i3 == -1);
                context.revokeUriPermission(r7.f3090, 3);
                if (i3 == -1) {
                    mF r13 = mP.m3770(context, r7.f3090);
                    r24 = r3;
                    arrayList.add(new mF(r7.f3087, r7.f3090, r7.f3092, r7.f3093, r13.f3089, r13.f3091, r13.f3088, r13.f3094));
                    new Object[1][0] = r7.f3087;
                } else {
                    r24 = r3;
                }
                mD mDVar = mLVar.f3112;
                synchronized (mDVar) {
                    mDVar.f3074.remove(i);
                }
            }
            r0 = r24;
        } else {
            r0 = r3;
        }
        r0.internalSuccess(arrayList);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16353(int i, int i2, float f) {
        for (WeakReference<C3236> weakReference : this.f14761) {
            C3236 r1 = (C3236) weakReference.get();
            if (r1 != null) {
                r1.onScroll(i, i2, f);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16354(List<mF> list) {
        for (WeakReference<Cif> weakReference : this.f14757) {
            Cif ifVar = (Cif) weakReference.get();
            if (ifVar != null) {
                ifVar.onMediaSelected(list);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m16352(List<mF> list) {
        for (WeakReference<Cif> weakReference : this.f14757) {
            Cif ifVar = (Cif) weakReference.get();
            if (ifVar != null) {
                ifVar.onMediaDeselected(list);
            }
        }
    }
}
