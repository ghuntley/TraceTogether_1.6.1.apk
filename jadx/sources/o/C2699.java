package o;

/* renamed from: o.ҝı  reason: contains not printable characters */
public final class C2699 implements C2638 {

    /* renamed from: ι  reason: contains not printable characters */
    private final C3062 f12447;

    public C2699(C3062 r1) {
        this.f12447 = r1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final <T> C3011<T> m14315(C3122 r3, C3101<T> r4) {
        C2401 r0 = (C2401) r4.getRawType().getAnnotation(C2401.class);
        if (r0 == null) {
            return null;
        }
        return m14314(this.f12447, r3, r4, r0);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static C3011<?> m14314(C3062 r3, C3122 r4, C3101<?> r5, C2401 r6) {
        C3011<?> r32;
        Object r33 = r3.m15617(C3101.get(r6.m12424())).m8998();
        if (r33 instanceof C3011) {
            r32 = (C3011) r33;
        } else if (r33 instanceof C2638) {
            r32 = ((C2638) r33).m13979(r4, r5);
        } else {
            boolean z = r33 instanceof C1665;
            if (z || (r33 instanceof C0398)) {
                C0398 r1 = null;
                C1665 r0 = z ? (C1665) r33 : null;
                if (r33 instanceof C0398) {
                    r1 = (C0398) r33;
                }
                r32 = new C2990<>(r0, r1, r4, r5);
            } else {
                StringBuilder sb = new StringBuilder("Invalid attempt to bind an instance of ");
                sb.append(r33.getClass().getName());
                sb.append(" as a @JsonAdapter for ");
                sb.append(r5.toString());
                sb.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (r32 == null || !r6.m12425()) ? r32 : new C3011<T>() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m15437(C0815 r2, T t) {
                if (t == null) {
                    r2.m6224();
                } else {
                    C3011.this.m15435(r2, t);
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final T m15436(C0995 r3) {
                if (r3.m7095() != C0313.NULL) {
                    return C3011.this.m15434(r3);
                }
                r3.m7105();
                return null;
            }
        };
    }
}
