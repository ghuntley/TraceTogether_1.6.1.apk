package o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.ʟɪ  reason: contains not printable characters */
public final class C1684 extends RecyclerView.C3243aUx {

    /* renamed from: ı  reason: contains not printable characters */
    private int f8717 = 0;

    /* renamed from: ǃ  reason: contains not printable characters */
    private List<Object> f8718 = new ArrayList();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1510 f8719;

    public C1684(C1510 r2) {
        this.f8719 = r2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9580(RecyclerView recyclerView, int i) {
        super.m473(recyclerView, i);
        if (i == 0 && this.f8717 != 0) {
            this.f8719.f8074.m9200();
        } else if (i != 0 && this.f8717 == 0) {
            this.f8719.f8074.m9206();
        }
        this.f8717 = i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9581(RecyclerView recyclerView, int i, int i2) {
        C1510 r2 = this.f8719;
        if (r2.f8065 != null && !r2.f8073 && r2.f8067.getChildCount() > 0) {
            m9579(recyclerView);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9579(RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        boolean z = true;
        if (this.f8719.f8069 != 1) {
            z = false;
        }
        if (z) {
            i3 = recyclerView.computeVerticalScrollOffset();
            i2 = recyclerView.computeVerticalScrollExtent();
            i = recyclerView.computeVerticalScrollRange();
        } else {
            i3 = recyclerView.computeHorizontalScrollOffset();
            i2 = recyclerView.computeHorizontalScrollExtent();
            i = recyclerView.computeHorizontalScrollRange();
        }
        this.f8719.m8952(((float) i3) / ((float) (i - i2)));
        Iterator<Object> it = this.f8718.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
