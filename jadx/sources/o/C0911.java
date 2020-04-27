package o;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.ǃɺ  reason: contains not printable characters */
public final class C0911 {

    /* renamed from: ı  reason: contains not printable characters */
    public int f5786;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public boolean f5787;

    /* renamed from: ǃ  reason: contains not printable characters */
    public int f5788;

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f5789;

    /* renamed from: ɹ  reason: contains not printable characters */
    public boolean f5790;

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean f5791 = true;

    /* renamed from: ι  reason: contains not printable characters */
    public int f5792;

    /* renamed from: і  reason: contains not printable characters */
    public int f5793 = 0;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public int f5794 = 0;

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m6724(RecyclerView.C0033 r3) {
        int i = this.f5789;
        if (i < 0) {
            return false;
        }
        return i < (r3.f378 ? r3.f375 - r3.f374 : r3.f366);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
        sb.append(this.f5788);
        sb.append(", mCurrentPosition=");
        sb.append(this.f5789);
        sb.append(", mItemDirection=");
        sb.append(this.f5792);
        sb.append(", mLayoutDirection=");
        sb.append(this.f5786);
        sb.append(", mStartLine=");
        sb.append(this.f5793);
        sb.append(", mEndLine=");
        sb.append(this.f5794);
        sb.append('}');
        return sb.toString();
    }
}
