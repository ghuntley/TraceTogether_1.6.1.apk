package o;

import android.content.Context;
import android.os.AsyncTask;
import o.C2552;

/* renamed from: o.ѕІ  reason: contains not printable characters */
public final class C2555 extends AsyncTask<Void, Void, Integer> {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ Context f11656;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C2552.C2553 f11657;

    public C2555(Context context, C2552.C2553 r2) {
        this.f11656 = context;
        this.f11657 = r2;
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public final Integer doInBackground(Void... voidArr) {
        try {
            C2552.m13621(this.f11656);
            return 0;
        } catch (C2878 e) {
            return Integer.valueOf(e.m14942());
        } catch (C2845 e2) {
            return Integer.valueOf(e2.f13290);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f11657.m13623();
            return;
        }
        this.f11657.m13622(num.intValue(), C2552.f11650.m14808(this.f11656, num.intValue(), "pi"));
    }
}
