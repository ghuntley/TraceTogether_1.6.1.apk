package o;

import java.util.ArrayList;

/* renamed from: o.Іɩ  reason: contains not printable characters */
public class C2252 extends C1696 {

    /* renamed from: ɫ  reason: contains not printable characters */
    protected ArrayList<C1696> f10574 = new ArrayList<>();

    /* renamed from: ɹ  reason: contains not printable characters */
    public void m11794() {
        this.f10574.clear();
        super.m9641();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11797(C1696 r2) {
        this.f10574.add(r2);
        if (r2.f8828 != null) {
            ((C2252) r2.f8828).f10574.remove(r2);
            r2.f8828 = null;
        }
        r2.f8828 = this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m11790(C1696 r2) {
        this.f10574.remove(r2);
        r2.f8828 = null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11793(int i, int i2) {
        super.m9632(i, i2);
        int size = this.f10574.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f10574.get(i3).m9632(m9640(), m9635());
        }
    }

    /* renamed from: ʟ  reason: contains not printable characters */
    public final void m11795() {
        super.m9644();
        ArrayList<C1696> arrayList = this.f10574;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1696 r2 = this.f10574.get(i);
                r2.m9632(this.f8861 + this.f8832, this.f8864 + this.f8862);
                if (!(r2 instanceof C1821)) {
                    r2.m9644();
                }
            }
        }
    }

    /* renamed from: ſ  reason: contains not printable characters */
    public void m11791() {
        m9644();
        ArrayList<C1696> arrayList = this.f10574;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1696 r2 = this.f10574.get(i);
                if (r2 instanceof C2252) {
                    ((C2252) r2).m11791();
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11796(C1133 r4) {
        super.m9653(r4);
        int size = this.f10574.size();
        for (int i = 0; i < size; i++) {
            this.f10574.get(i).m9653(r4);
        }
    }

    /* renamed from: Ɨ  reason: contains not printable characters */
    public final void m11792() {
        this.f10574.clear();
    }
}
