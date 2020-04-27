package o;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.C3608mu;
import o.C3609mv;
import o.C3611mx;
import zendesk.belvedere.ImageStream;

final class mA implements View.OnClickListener, C3609mv.C0259 {

    /* renamed from: ǃ  reason: contains not printable characters */
    final C3611mx.Cif f3037;

    /* renamed from: ɩ  reason: contains not printable characters */
    final ImageStream f3038;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3609mv.C0259 f3039 = this;

    /* renamed from: ι  reason: contains not printable characters */
    final C3611mx.C0262 f3040;

    mA(C3611mx.Cif ifVar, C3611mx.C0262 r2, ImageStream imageStream) {
        this.f3037 = ifVar;
        this.f3040 = r2;
        this.f3038 = imageStream;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3719() {
        boolean z = this.f3037.m3947() || this.f3040.m3952();
        this.f3040.m3956(z);
        this.f3040.m3951(this.f3037.m3942(), this.f3037.m3939(), z, this.f3037.m3938(), this.f3039);
        for (WeakReference<ImageStream.Cif> weakReference : this.f3038.f14757) {
            ImageStream.Cif ifVar = (ImageStream.Cif) weakReference.get();
            if (ifVar != null) {
                ifVar.onVisible();
            }
        }
        if (this.f3037.m3946()) {
            this.f3040.m3954((View.OnClickListener) this);
        }
        if (this.f3037.m3941()) {
            this.f3040.m3950(new View.OnClickListener() {
                public final void onClick(View view) {
                    mA.this.f3040.m3955(mA.this.f3037.m3948(), mA.this.f3038);
                }
            });
        }
        this.f3040.m3953(this.f3037.m3939().size());
    }

    public final void onClick(View view) {
        this.f3040.m3955(this.f3037.m3949(), this.f3038);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3721() {
        if (this.f3037.m3938()) {
            this.f3040.m3955(this.f3037.m3945(), this.f3038);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m3720(C3608mu.Cif ifVar) {
        List<mF> list;
        mF mFVar = ifVar.f3339;
        long r1 = this.f3037.m3943();
        if ((mFVar == null || mFVar.f3091 > r1) && r1 != -1) {
            this.f3040.m3957();
            return false;
        }
        ifVar.f3338 = !ifVar.f3338;
        if (ifVar.f3338) {
            list = this.f3037.m3940(mFVar);
        } else {
            list = this.f3037.m3944(mFVar);
        }
        this.f3040.m3953(list.size());
        ArrayList arrayList = new ArrayList();
        arrayList.add(mFVar);
        if (ifVar.f3338) {
            this.f3038.m16354(arrayList);
            return true;
        }
        this.f3038.m16352(arrayList);
        return true;
    }
}
