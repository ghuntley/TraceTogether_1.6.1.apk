package o;

import o.C2745;

/* renamed from: o.кı  reason: contains not printable characters */
final class C2440 {

    /* renamed from: ı  reason: contains not printable characters */
    final long f11077;

    /* renamed from: Ɩ  reason: contains not printable characters */
    final Long f11078;

    /* renamed from: ǃ  reason: contains not printable characters */
    final long f11079;

    /* renamed from: ȷ  reason: contains not printable characters */
    final Boolean f11080;

    /* renamed from: ɩ  reason: contains not printable characters */
    final long f11081;

    /* renamed from: ɹ  reason: contains not printable characters */
    final Long f11082;

    /* renamed from: Ι  reason: contains not printable characters */
    final String f11083;

    /* renamed from: ι  reason: contains not printable characters */
    final String f11084;

    /* renamed from: І  reason: contains not printable characters */
    final Long f11085;

    /* renamed from: і  reason: contains not printable characters */
    final long f11086;

    /* renamed from: Ӏ  reason: contains not printable characters */
    final long f11087;

    C2440(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C2745.C2746.m14562(str);
        C2745.C2746.m14562(str2);
        boolean z = true;
        C2745.C2746.m14563(j6 >= 0);
        C2745.C2746.m14563(j7 >= 0);
        C2745.C2746.m14563(j8 >= 0);
        C2745.C2746.m14563(j9 < 0 ? false : z);
        this.f11083 = str;
        this.f11084 = str2;
        this.f11079 = j6;
        this.f11077 = j7;
        this.f11081 = j8;
        this.f11086 = j4;
        this.f11087 = j9;
        this.f11082 = l;
        this.f11078 = l2;
        this.f11085 = l3;
        this.f11080 = bool;
    }

    C2440(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, j, j2, 0, j3, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final C2440 m12554(long j) {
        return new C2440(this.f11083, this.f11084, this.f11079, this.f11077, this.f11081, j, this.f11087, this.f11082, this.f11078, this.f11085, this.f11080);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final C2440 m12553(long j, long j2) {
        return new C2440(this.f11083, this.f11084, this.f11079, this.f11077, this.f11081, this.f11086, j, Long.valueOf(j2), this.f11078, this.f11085, this.f11080);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2440 m12552(Long l, Long l2, Boolean bool) {
        return new C2440(this.f11083, this.f11084, this.f11079, this.f11077, this.f11081, this.f11086, this.f11087, this.f11082, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
