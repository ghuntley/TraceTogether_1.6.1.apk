package o;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.ҹɹ  reason: contains not printable characters */
final class C2734 extends C2020 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Set<Class<?>> f12728;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Set<Class<?>> f12729;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Set<Class<?>> f12730;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2298 f12731;

    /* renamed from: ι  reason: contains not printable characters */
    private final Set<Class<?>> f12732;

    /* renamed from: o.ҹɹ$ı  reason: contains not printable characters */
    static class C2735 implements C3147 {
    }

    C2734(C2344<?> r11, C2298 r12) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (C2393 next : r11.f10843) {
            boolean z = true;
            if (next.f10945 == 0) {
                if (next.f10946 != 2 ? false : z) {
                    hashSet3.add(next.f10944);
                } else {
                    hashSet.add(next.f10944);
                }
            } else {
                if (next.f10946 != 2 ? false : z) {
                    hashSet4.add(next.f10944);
                } else {
                    hashSet2.add(next.f10944);
                }
            }
        }
        if (!r11.f10846.isEmpty()) {
            hashSet.add(C3147.class);
        }
        this.f12732 = Collections.unmodifiableSet(hashSet);
        this.f12728 = Collections.unmodifiableSet(hashSet2);
        this.f12730 = Collections.unmodifiableSet(hashSet3);
        this.f12729 = Collections.unmodifiableSet(hashSet4);
        this.f12731 = r12;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <T> T m14478(Class<T> cls) {
        if (this.f12732.contains(cls)) {
            T r0 = this.f12731.m11973(cls);
            if (!cls.equals(C3147.class)) {
                return r0;
            }
            return new C2735();
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> C2841<T> m14475(Class<T> cls) {
        if (this.f12728.contains(cls)) {
            return this.f12731.m11970(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final <T> C2841<Set<T>> m14477(Class<T> cls) {
        if (this.f12729.contains(cls)) {
            return this.f12731.m11972(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final <T> Set<T> m14476(Class<T> cls) {
        if (this.f12730.contains(cls)) {
            return this.f12731.m11971(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }
}
