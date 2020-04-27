package o;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import o.C0288;
import o.C1190;
import o.C2745;
import o.C3024;

/* renamed from: o.ɨƚ  reason: contains not printable characters */
public abstract class C1202<T extends IInterface> extends C1190<T> implements C3024.C3030 {

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Account f6857;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1273 f6858;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Set<Scope> f6859;

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public Set<Scope> m7821(Set<Scope> set) {
        return set;
    }

    public C1202(Context context, Looper looper, int i, C1273 r13, C0484 r14, C0586 r15) {
        this(context, looper, C1283.m8197(context), C2835.m14786(), i, r13, (C0484) C2745.C2746.m14555(r14), (C0586) C2745.C2746.m14555(r15));
    }

    @Deprecated
    public C1202(Context context, Looper looper, int i, C1273 r4, C0288.C0290 r5, C0288.C0289 r6) {
        this(context, looper, i, r4, (C0484) r5, (C0586) r6);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C1202(Context context, Looper looper, C1283 r13, C2835 r14, int i, C1273 r16, C0484 r17, C0586 r18) {
        super(context, looper, r13, r14, i, m7818(r17), m7816(r18), r16.m8178());
        this.f6858 = r16;
        this.f6857 = r16.m8177();
        this.f6859 = m7817(r16.m8175());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Set<Scope> m7817(Set<Scope> set) {
        Set<Scope> r0 = m7821(set);
        for (Scope contains : r0) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return r0;
    }

    /* renamed from: ł  reason: contains not printable characters */
    public final Account m7819() {
        return this.f6857;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ƚ  reason: contains not printable characters */
    public final Set<Scope> m7820() {
        return this.f6859;
    }

    /* renamed from: І  reason: contains not printable characters */
    public Set<Scope> m7822() {
        return m7756() ? this.f6859 : Collections.emptySet();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C1190.C1191 m7818(C0484 r1) {
        if (r1 == null) {
            return null;
        }
        return new C1614(r1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static C1190.C1193 m7816(C0586 r1) {
        if (r1 == null) {
            return null;
        }
        return new C1564(r1);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public int m7823() {
        return super.m7786();
    }
}
