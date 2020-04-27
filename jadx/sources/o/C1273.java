package o;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: o.ɩʌ  reason: contains not printable characters */
public final class C1273 {

    /* renamed from: ı  reason: contains not printable characters */
    public Integer f7179;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final Set<Scope> f7180;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2562 f7181;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Account f7182;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final String f7183;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Set<Scope> f7184;

    /* renamed from: ι  reason: contains not printable characters */
    public final String f7185;

    /* renamed from: І  reason: contains not printable characters */
    private final View f7186;

    /* renamed from: і  reason: contains not printable characters */
    private final int f7187;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Map<C3024<?>, C1275> f7188;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final boolean f7189;

    /* renamed from: o.ɩʌ$ǃ  reason: contains not printable characters */
    public static final class C1275 {

        /* renamed from: ι  reason: contains not printable characters */
        public final Set<Scope> f7195;
    }

    /* renamed from: o.ɩʌ$ı  reason: contains not printable characters */
    public static final class C1274 {

        /* renamed from: ı  reason: contains not printable characters */
        private String f7190;

        /* renamed from: ǃ  reason: contains not printable characters */
        private C0639<Scope> f7191;

        /* renamed from: ɩ  reason: contains not printable characters */
        private Account f7192;

        /* renamed from: Ι  reason: contains not printable characters */
        private String f7193;

        /* renamed from: ι  reason: contains not printable characters */
        private C2562 f7194 = C2562.f11679;

        /* renamed from: Ι  reason: contains not printable characters */
        public final C1274 m8183(Account account) {
            this.f7192 = account;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C1274 m8184(Collection<Scope> collection) {
            if (this.f7191 == null) {
                this.f7191 = new C0639<>();
            }
            this.f7191.addAll(collection);
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C1274 m8185(String str) {
            this.f7190 = str;
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C1274 m8181(String str) {
            this.f7193 = str;
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C1273 m8182() {
            return new C1273(this.f7192, this.f7191, this.f7190, this.f7193, this.f7194);
        }
    }

    public C1273(Account account, Set<Scope> set, String str, String str2, C2562 r5) {
        this.f7182 = account;
        this.f7184 = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f7188 = Collections.emptyMap();
        this.f7186 = null;
        this.f7187 = 0;
        this.f7185 = str;
        this.f7183 = str2;
        this.f7181 = r5;
        this.f7189 = false;
        HashSet hashSet = new HashSet(this.f7184);
        for (C1275 r3 : this.f7188.values()) {
            hashSet.addAll(r3.f7195);
        }
        this.f7180 = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Account m8177() {
        return this.f7182;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Set<Scope> m8180() {
        return this.f7184;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Set<Scope> m8175() {
        return this.f7180;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m8178() {
        return this.f7183;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2562 m8179() {
        return this.f7181;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m8176(Integer num) {
        this.f7179 = num;
    }
}
