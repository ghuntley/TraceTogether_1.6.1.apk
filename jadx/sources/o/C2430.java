package o;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.зɪ  reason: contains not printable characters */
public class C2430 extends LinearLayoutManager {
    public C2430(int i) {
        super(i);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m12519(RecyclerView recyclerView, int i) {
        AnonymousClass2 r0 = new C0974(recyclerView.getContext()) {
            public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }
        };
        r0.setTargetPosition(i);
        m403((RecyclerView.C3240AuX) r0);
    }
}
