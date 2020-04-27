package o;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\b\u0000\u0018\u00002\u00020\u0012B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\t\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003R\u0015\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0003"}, d2 = {"Lo/gd;", "", "ı", "I", "ǃ", "", "ɩ", "Z", "ι", "Ι", "hasNext", "()Z", "()I", "p0", "p1", "p2", "<init>", "(III)V", "Lo/ed;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.gd  reason: case insensitive filesystem */
public final class C3429gd extends C3376ed {

    /* renamed from: ı  reason: contains not printable characters */
    private final int f2228;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f2229;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f2230;

    /* renamed from: Ι  reason: contains not printable characters */
    public final int f2231;

    public C3429gd(int i, int i2, int i3) {
        this.f2231 = i3;
        this.f2228 = i2;
        boolean z = true;
        if (this.f2231 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f2230 = z;
        this.f2229 = !this.f2230 ? this.f2228 : i;
    }

    public final boolean hasNext() {
        return this.f2230;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m2392() {
        int i = this.f2229;
        if (i != this.f2228) {
            this.f2229 = this.f2231 + i;
        } else if (this.f2230) {
            this.f2230 = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
