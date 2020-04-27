package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: o.ҝǃ  reason: contains not printable characters */
public final class C2700 {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C3011<Boolean> f12448 = new C3011<Boolean>() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m14357(C0815 r1, Object obj) {
            Boolean bool = (Boolean) obj;
            r1.m6227(bool == null ? "null" : bool.toString());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14356(C0995 r3) {
            if (r3.m7095() != C0313.NULL) {
                return Boolean.valueOf(r3.m7101());
            }
            r3.m7105();
            return null;
        }
    };

    /* renamed from: ıı  reason: contains not printable characters */
    private static C3011<Currency> f12449 = new C3011<T>() {
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

    /* renamed from: ŀ  reason: contains not printable characters */
    public static final C2638 f12450;

    /* renamed from: ł  reason: contains not printable characters */
    public static final C2638 f12451;

    /* renamed from: ſ  reason: contains not printable characters */
    public static final C2638 f12452;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static final C2638 f12453;

    /* renamed from: Ɨ  reason: contains not printable characters */
    public static final C2638 f12454;

    /* renamed from: ƚ  reason: contains not printable characters */
    public static final C2638 f12455;

    /* renamed from: ǀ  reason: contains not printable characters */
    public static final C2638 f12456;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C2638 f12457;

    /* renamed from: ȷ  reason: contains not printable characters */
    public static final C2638 f12458;

    /* renamed from: ɍ  reason: contains not printable characters */
    public static final C2638 f12459;

    /* renamed from: ɔ  reason: contains not printable characters */
    public static final C2638 f12460;

    /* renamed from: ɟ  reason: contains not printable characters */
    private static C3011<Class> f12461 = new C3011<T>() {
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

    /* renamed from: ɨ  reason: contains not printable characters */
    public static final C3011<BigInteger> f12462 = new C3011<BigInteger>() {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14392(C0995 r1) {
            return m14391(r1);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ void m14393(C0815 r1, Object obj) {
            r1.m6230((BigInteger) obj);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private static BigInteger m14391(C0995 r2) {
            if (r2.m7095() == C0313.NULL) {
                r2.m7105();
                return null;
            }
            try {
                return new BigInteger(r2.m7101());
            } catch (NumberFormatException e) {
                throw new C1701((Throwable) e);
            }
        }
    };

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C2638 f12463;

    /* renamed from: ɪ  reason: contains not printable characters */
    public static final C2638 f12464;

    /* renamed from: ɭ  reason: contains not printable characters */
    private static C3011<AtomicInteger> f12465 = new C3011<T>() {
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

    /* renamed from: ɹ  reason: contains not printable characters */
    public static final C2638 f12466;

    /* renamed from: ɺ  reason: contains not printable characters */
    public static final C3011<C1367> f12467 = new C3011<C1367>() {
        /* access modifiers changed from: private */
        /* renamed from: ı  reason: contains not printable characters */
        public C1367 m14342(C0995 r5) {
            switch (AnonymousClass26.f12506[r5.m7095().ordinal()]) {
                case 1:
                    return new C2159((Number) new C0442(r5.m7101()));
                case 2:
                    return new C2159(Boolean.valueOf(r5.m7106()));
                case 3:
                    return new C2159(r5.m7101());
                case 4:
                    r5.m7105();
                    return C0875.f5659;
                case 5:
                    C3135 r0 = new C3135();
                    r5.m7099();
                    while (r5.m7092()) {
                        Object r1 = m14342(r5);
                        if (r1 == null) {
                            r1 = C0875.f5659;
                        }
                        r0.f14299.add(r1);
                    }
                    r5.m7104();
                    return r0;
                case 6:
                    C1389 r02 = new C1389();
                    r5.m7096();
                    while (r5.m7092()) {
                        String r12 = r5.m7107();
                        Object r2 = m14342(r5);
                        if (r2 == null) {
                            r2 = C0875.f5659;
                        }
                        r02.f7635.put(r12, r2);
                    }
                    r5.m7103();
                    return r02;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public void m14343(C0815 r3, C1367 r4) {
            if (r4 == null || (r4 instanceof C0875)) {
                r3.m6224();
                return;
            }
            boolean z = r4 instanceof C2159;
            if (!z) {
                boolean z2 = r4 instanceof C3135;
                if (z2) {
                    r3.m6232();
                    if (z2) {
                        Iterator<C1367> it = ((C3135) r4).iterator();
                        while (it.hasNext()) {
                            m14343(r3, it.next());
                        }
                        r3.m6225(1, 2, "]");
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: ".concat(String.valueOf(r4)));
                }
                boolean z3 = r4 instanceof C1389;
                if (z3) {
                    r3.m6234();
                    if (z3) {
                        for (Map.Entry next : ((C1389) r4).f7635.entrySet()) {
                            r3.m6233((String) next.getKey());
                            m14343(r3, (C1367) next.getValue());
                        }
                        r3.m6225(3, 5, "}");
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(r4)));
                }
                StringBuilder sb = new StringBuilder("Couldn't write ");
                sb.append(r4.getClass());
                throw new IllegalArgumentException(sb.toString());
            } else if (z) {
                C2159 r42 = (C2159) r4;
                if (r42.f10327 instanceof Number) {
                    r3.m6230(r42.m8484());
                } else if (r42.f10327 instanceof Boolean) {
                    r3.m6228(r42.m8485());
                } else {
                    r3.m6227(r42.m8483());
                }
            } else {
                throw new IllegalStateException("Not a JSON Primitive: ".concat(String.valueOf(r4)));
            }
        }
    };

    /* renamed from: ɻ  reason: contains not printable characters */
    private static C3011<URI> f12468 = new C3011<URI>() {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14330(C0995 r1) {
            return m14329(r1);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m14331(C0815 r1, Object obj) {
            URI uri = (URI) obj;
            r1.m6227(uri == null ? null : uri.toASCIIString());
        }

        /* renamed from: ı  reason: contains not printable characters */
        private static URI m14329(C0995 r3) {
            if (r3.m7095() == C0313.NULL) {
                r3.m7105();
                return null;
            }
            try {
                String r32 = r3.m7101();
                if ("null".equals(r32)) {
                    return null;
                }
                return new URI(r32);
            } catch (URISyntaxException e) {
                throw new C1169((Throwable) e);
            }
        }
    };

    /* renamed from: ɼ  reason: contains not printable characters */
    public static final C2638 f12469 = new C2638() {
        /* JADX WARNING: type inference failed for: r2v0, types: [o.լɈ, o.լɈ<T>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: ı  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> o.C3011<T> m14355(o.C3122 r1, o.C3101<T> r2) {
            /*
                r0 = this;
                java.lang.Class r1 = r2.getRawType()
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                boolean r2 = r2.isAssignableFrom(r1)
                if (r2 == 0) goto L_0x0021
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                if (r1 != r2) goto L_0x0011
                goto L_0x0021
            L_0x0011:
                boolean r2 = r1.isEnum()
                if (r2 != 0) goto L_0x001b
                java.lang.Class r1 = r1.getSuperclass()
            L_0x001b:
                o.ҝǃ$ı r2 = new o.ҝǃ$ı
                r2.<init>(r1)
                return r2
            L_0x0021:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C2700.AnonymousClass25.m14355(o.լј, o.լɈ):o.Ա");
        }
    };

    /* renamed from: ɾ  reason: contains not printable characters */
    public static final C3011<Number> f12470 = new C3011<Number>() {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14345(C0995 r1) {
            return m14344(r1);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ void m14346(C0815 r1, Object obj) {
            r1.m6230((Number) obj);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private static Number m14344(C0995 r2) {
            if (r2.m7095() == C0313.NULL) {
                r2.m7105();
                return null;
            }
            try {
                return Long.valueOf(r2.m7100());
            } catch (NumberFormatException e) {
                throw new C1701((Throwable) e);
            }
        }
    };

    /* renamed from: ɿ  reason: contains not printable characters */
    public static final C2638 f12471;

    /* renamed from: ʅ  reason: contains not printable characters */
    public static final C2638 f12472 = new C2638() {
        /* renamed from: ı  reason: contains not printable characters */
        public final <T> C3011<T> m14347(C3122 r2, C3101<T> r3) {
            if (r3.getRawType() != Timestamp.class) {
                return null;
            }
            final C3011<Date> r22 = r2.m15830(C3101.get(Date.class));
            return new C3011<Timestamp>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final /* bridge */ /* synthetic */ void m14349(C0815 r2, Object obj) {
                    C3011.this.m15435(r2, (Timestamp) obj);
                }

                /* renamed from: ǃ  reason: contains not printable characters */
                public final /* synthetic */ Object m14348(C0995 r4) {
                    Date date = (Date) C3011.this.m15434(r4);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }
            };
        }
    };

    /* renamed from: ʏ  reason: contains not printable characters */
    private static C3011<URL> f12473 = new C3011<URL>() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m14328(C0815 r1, Object obj) {
            URL url = (URL) obj;
            r1.m6227(url == null ? null : url.toExternalForm());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14327(C0995 r4) {
            if (r4.m7095() == C0313.NULL) {
                r4.m7105();
                return null;
            }
            String r42 = r4.m7101();
            if ("null".equals(r42)) {
                return null;
            }
            return new URL(r42);
        }
    };

    /* renamed from: ʔ  reason: contains not printable characters */
    private static C3011<StringBuffer> f12474 = new C3011<StringBuffer>() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m14324(C0815 r1, Object obj) {
            StringBuffer stringBuffer = (StringBuffer) obj;
            r1.m6227(stringBuffer == null ? null : stringBuffer.toString());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14323(C0995 r3) {
            if (r3.m7095() != C0313.NULL) {
                return new StringBuffer(r3.m7101());
            }
            r3.m7105();
            return null;
        }
    };

    /* renamed from: ʕ  reason: contains not printable characters */
    private static C3011<StringBuilder> f12475 = new C3011<StringBuilder>() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m14322(C0815 r1, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            r1.m6227(sb == null ? null : sb.toString());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14321(C0995 r3) {
            if (r3.m7095() != C0313.NULL) {
                return new StringBuilder(r3.m7101());
            }
            r3.m7105();
            return null;
        }
    };

    /* renamed from: ʖ  reason: contains not printable characters */
    private static C3011<String> f12476 = new C3011<String>() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m14387(C0815 r1, Object obj) {
            r1.m6227((String) obj);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14386(C0995 r3) {
            C0313 r0 = r3.m7095();
            if (r0 == C0313.NULL) {
                r3.m7105();
                return null;
            } else if (r0 == C0313.BOOLEAN) {
                return Boolean.toString(r3.m7106());
            } else {
                return r3.m7101();
            }
        }
    };

    /* renamed from: ʟ  reason: contains not printable characters */
    public static final C2638 f12477;

    /* renamed from: ͻ  reason: contains not printable characters */
    private static C3011<Number> f12478 = new C3011<Number>() {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14374(C0995 r1) {
            return m14373(r1);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ void m14375(C0815 r1, Object obj) {
            r1.m6230((Number) obj);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private static Number m14373(C0995 r2) {
            if (r2.m7095() == C0313.NULL) {
                r2.m7105();
                return null;
            }
            try {
                return Short.valueOf((short) r2.m7102());
            } catch (NumberFormatException e) {
                throw new C1701((Throwable) e);
            }
        }
    };

    /* renamed from: Γ  reason: contains not printable characters */
    private static C3011<Locale> f12479 = new C3011<Locale>() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m14335(C0815 r1, Object obj) {
            Locale locale = (Locale) obj;
            r1.m6227(locale == null ? null : locale.toString());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14334(C0995 r5) {
            String str = null;
            if (r5.m7095() == C0313.NULL) {
                r5.m7105();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(r5.m7101(), C3292bc.f1729);
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, str);
        }
    };

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C2638 f12480;

    /* renamed from: ι  reason: contains not printable characters */
    public static final C2638 f12481;

    /* renamed from: τ  reason: contains not printable characters */
    private static C3011<UUID> f12482 = new C3011<UUID>() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m14326(C0815 r1, Object obj) {
            UUID uuid = (UUID) obj;
            r1.m6227(uuid == null ? null : uuid.toString());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14325(C0995 r3) {
            if (r3.m7095() != C0313.NULL) {
                return UUID.fromString(r3.m7101());
            }
            r3.m7105();
            return null;
        }
    };

    /* renamed from: ϲ  reason: contains not printable characters */
    private static C3011<BitSet> f12483 = new C3011<T>() {
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

    /* renamed from: ϳ  reason: contains not printable characters */
    private static C3011<Number> f12484 = new C3011<Number>() {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14359(C0995 r1) {
            return m14358(r1);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ void m14360(C0815 r1, Object obj) {
            r1.m6230((Number) obj);
        }

        /* renamed from: ι  reason: contains not printable characters */
        private static Number m14358(C0995 r2) {
            if (r2.m7095() == C0313.NULL) {
                r2.m7105();
                return null;
            }
            try {
                return Byte.valueOf((byte) r2.m7102());
            } catch (NumberFormatException e) {
                throw new C1701((Throwable) e);
            }
        }
    };

    /* renamed from: І  reason: contains not printable characters */
    public static final C2638 f12485;

    /* renamed from: Ј  reason: contains not printable characters */
    private static C3011<Number> f12486 = new C3011<Number>() {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14377(C0995 r1) {
            return m14376(r1);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ void m14378(C0815 r1, Object obj) {
            r1.m6230((Number) obj);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private static Number m14376(C0995 r2) {
            if (r2.m7095() == C0313.NULL) {
                r2.m7105();
                return null;
            }
            try {
                return Integer.valueOf(r2.m7102());
            } catch (NumberFormatException e) {
                throw new C1701((Throwable) e);
            }
        }
    };

    /* renamed from: Г  reason: contains not printable characters */
    private static C3011<Calendar> f12487 = new C3011<Calendar>() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m14339(C0815 r4, Object obj) {
            Calendar calendar = (Calendar) obj;
            if (calendar == null) {
                r4.m6224();
                return;
            }
            r4.m6234();
            r4.m6233("year");
            r4.m6226((long) calendar.get(1));
            r4.m6233("month");
            r4.m6226((long) calendar.get(2));
            r4.m6233("dayOfMonth");
            r4.m6226((long) calendar.get(5));
            r4.m6233("hourOfDay");
            r4.m6226((long) calendar.get(11));
            r4.m6233("minute");
            r4.m6226((long) calendar.get(12));
            r4.m6233("second");
            r4.m6226((long) calendar.get(13));
            r4.m6225(3, 5, "}");
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14338(C0995 r10) {
            if (r10.m7095() == C0313.NULL) {
                r10.m7105();
                return null;
            }
            r10.m7096();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (r10.m7095() != C0313.END_OBJECT) {
                String r0 = r10.m7107();
                int r1 = r10.m7102();
                if ("year".equals(r0)) {
                    i = r1;
                } else if ("month".equals(r0)) {
                    i2 = r1;
                } else if ("dayOfMonth".equals(r0)) {
                    i3 = r1;
                } else if ("hourOfDay".equals(r0)) {
                    i4 = r1;
                } else if ("minute".equals(r0)) {
                    i5 = r1;
                } else if ("second".equals(r0)) {
                    i6 = r1;
                }
            }
            r10.m7103();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }
    };

    /* renamed from: г  reason: contains not printable characters */
    public static final C2638 f12488;

    /* renamed from: с  reason: contains not printable characters */
    private static C3011<Boolean> f12489 = new C3011<Boolean>() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m14353(C0815 r2, Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                r2.m6224();
                return;
            }
            if (r2.f5318 != null) {
                r2.m6229();
                r2.m6235(r2.f5318);
                r2.f5318 = null;
            }
            r2.m6231();
            r2.f5315.write(bool.booleanValue() ? "true" : "false");
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14352(C0995 r3) {
            C0313 r0 = r3.m7095();
            if (r0 == C0313.NULL) {
                r3.m7105();
                return null;
            } else if (r0 == C0313.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(r3.m7101()));
            } else {
                return Boolean.valueOf(r3.m7106());
            }
        }
    };

    /* renamed from: т  reason: contains not printable characters */
    private static C3011<AtomicIntegerArray> f12490 = new C3011<T>() {
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

    /* renamed from: х  reason: contains not printable characters */
    private static C3011<Number> f12491 = new C3011<Number>() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ void m14380(C0815 r1, Object obj) {
            r1.m6230((Number) obj);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14379(C0995 r4) {
            C0313 r0 = r4.m7095();
            int i = AnonymousClass26.f12506[r0.ordinal()];
            if (i == 1 || i == 3) {
                return new C0442(r4.m7101());
            }
            if (i == 4) {
                r4.m7105();
                return null;
            }
            throw new C1701("Expecting number, got: ".concat(String.valueOf(r0)));
        }
    };

    /* renamed from: і  reason: contains not printable characters */
    public static final C2638 f12492;

    /* renamed from: ј  reason: contains not printable characters */
    private static C3011<AtomicBoolean> f12493 = new C3011<T>() {
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

    /* renamed from: ґ  reason: contains not printable characters */
    private static C3011<Character> f12494 = new C3011<Character>() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m14382(C0815 r1, Object obj) {
            Character ch = (Character) obj;
            r1.m6227(ch == null ? null : String.valueOf(ch));
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14381(C0995 r3) {
            if (r3.m7095() == C0313.NULL) {
                r3.m7105();
                return null;
            }
            String r32 = r3.m7101();
            if (r32.length() == 1) {
                return Character.valueOf(r32.charAt(0));
            }
            throw new C1701("Expecting character, got: ".concat(r32));
        }
    };

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static final C2638 f12495;

    /* renamed from: ӏ  reason: contains not printable characters */
    public static final C3011<BigDecimal> f12496 = new C3011<BigDecimal>() {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14384(C0995 r1) {
            return m14383(r1);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ void m14385(C0815 r1, Object obj) {
            r1.m6230((BigDecimal) obj);
        }

        /* renamed from: ı  reason: contains not printable characters */
        private static BigDecimal m14383(C0995 r2) {
            if (r2.m7095() == C0313.NULL) {
                r2.m7105();
                return null;
            }
            try {
                return new BigDecimal(r2.m7101());
            } catch (NumberFormatException e) {
                throw new C1701((Throwable) e);
            }
        }
    };

    /* renamed from: ӷ  reason: contains not printable characters */
    private static C3011<InetAddress> f12497 = new C3011<InetAddress>() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m14333(C0815 r1, Object obj) {
            InetAddress inetAddress = (InetAddress) obj;
            r1.m6227(inetAddress == null ? null : inetAddress.getHostAddress());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14332(C0995 r3) {
            if (r3.m7095() != C0313.NULL) {
                return InetAddress.getByName(r3.m7101());
            }
            r3.m7105();
            return null;
        }
    };

    static {
        final Class<Class> cls = Class.class;
        final C3011<Class> r1 = f12461;
        f12463 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<BitSet> cls2 = BitSet.class;
        final C3011<BitSet> r12 = f12483;
        f12480 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class cls3 = Boolean.TYPE;
        final Class<Boolean> cls4 = Boolean.class;
        final C3011<Boolean> r2 = f12489;
        f12481 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14354(C3122 r1, C3101<T> r2) {
                Class<? super T> rawType = r2.getRawType();
                if (rawType == r1 || rawType == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r2.getName());
                sb.append("+");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r3);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class cls5 = Byte.TYPE;
        final Class<Byte> cls6 = Byte.class;
        final C3011<Number> r22 = f12484;
        f12457 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14354(C3122 r1, C3101<T> r2) {
                Class<? super T> rawType = r2.getRawType();
                if (rawType == r1 || rawType == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r2.getName());
                sb.append("+");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r3);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class cls7 = Short.TYPE;
        final Class<Short> cls8 = Short.class;
        final C3011<Number> r23 = f12478;
        f12453 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14354(C3122 r1, C3101<T> r2) {
                Class<? super T> rawType = r2.getRawType();
                if (rawType == r1 || rawType == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r2.getName());
                sb.append("+");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r3);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class cls9 = Integer.TYPE;
        final Class<Integer> cls10 = Integer.class;
        final C3011<Number> r24 = f12486;
        f12466 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14354(C3122 r1, C3101<T> r2) {
                Class<? super T> rawType = r2.getRawType();
                if (rawType == r1 || rawType == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r2.getName());
                sb.append("+");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r3);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<AtomicInteger> cls11 = AtomicInteger.class;
        final C3011<AtomicInteger> r13 = f12465;
        f12485 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<AtomicBoolean> cls12 = AtomicBoolean.class;
        final C3011<AtomicBoolean> r14 = f12493;
        f12495 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<AtomicIntegerArray> cls13 = AtomicIntegerArray.class;
        final C3011<AtomicIntegerArray> r15 = f12490;
        f12492 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<Number> cls14 = Number.class;
        final C3011<Number> r16 = f12491;
        f12464 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class cls15 = Character.TYPE;
        final Class<Character> cls16 = Character.class;
        final C3011<Character> r25 = f12494;
        f12458 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14354(C3122 r1, C3101<T> r2) {
                Class<? super T> rawType = r2.getRawType();
                if (rawType == r1 || rawType == r2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r2.getName());
                sb.append("+");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r3);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<String> cls17 = String.class;
        final C3011<String> r17 = f12476;
        f12488 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<StringBuilder> cls18 = StringBuilder.class;
        final C3011<StringBuilder> r18 = f12475;
        f12471 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<StringBuffer> cls19 = StringBuffer.class;
        final C3011<StringBuffer> r19 = f12474;
        f12450 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<URL> cls20 = URL.class;
        final C3011<URL> r110 = f12473;
        f12451 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<URI> cls21 = URI.class;
        final C3011<URI> r111 = f12468;
        f12477 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<InetAddress> cls22 = InetAddress.class;
        final C3011<InetAddress> r112 = f12497;
        f12455 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T2> C3011<T2> m14365(C3122 r1, C3101<T2> r2) {
                final Class<? super T2> rawType = r2.getRawType();
                if (!r0.isAssignableFrom(rawType)) {
                    return null;
                }
                return new C3011<T1>() {
                    /* renamed from: ɩ  reason: contains not printable characters */
                    public final void m14367(C0815 r2, T1 t1) {
                        r1.m15435(r2, t1);
                    }

                    /* renamed from: ǃ  reason: contains not printable characters */
                    public final T1 m14366(C0995 r4) {
                        T1 r42 = r1.m15434(r4);
                        if (r42 == null || rawType.isInstance(r42)) {
                            return r42;
                        }
                        StringBuilder sb = new StringBuilder("Expected a ");
                        sb.append(rawType.getName());
                        sb.append(" but was ");
                        sb.append(r42.getClass().getName());
                        throw new C1701(sb.toString());
                    }
                };
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
                sb.append(r0.getName());
                sb.append(",adapter=");
                sb.append(r1);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<UUID> cls23 = UUID.class;
        final C3011<UUID> r113 = f12482;
        f12459 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<Currency> cls24 = Currency.class;
        final C3011<Currency> r114 = f12449;
        f12452 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<Calendar> cls25 = Calendar.class;
        final Class<GregorianCalendar> cls26 = GregorianCalendar.class;
        final C3011<Calendar> r26 = f12487;
        f12454 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14361(C3122 r1, C3101<T> r2) {
                Class<? super T> rawType = r2.getRawType();
                if (rawType == cls25 || rawType == cls26) {
                    return r26;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls25.getName());
                sb.append("+");
                sb.append(cls26.getName());
                sb.append(",adapter=");
                sb.append(r26);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<Locale> cls27 = Locale.class;
        final C3011<Locale> r115 = f12479;
        f12456 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
        final Class<C1367> cls28 = C1367.class;
        final C3011<C1367> r116 = f12467;
        f12460 = new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T2> C3011<T2> m14365(C3122 r1, C3101<T2> r2) {
                final Class<? super T2> rawType = r2.getRawType();
                if (!cls28.isAssignableFrom(rawType)) {
                    return null;
                }
                return new C3011<T1>() {
                    /* renamed from: ɩ  reason: contains not printable characters */
                    public final void m14367(C0815 r2, T1 t1) {
                        r116.m15435(r2, t1);
                    }

                    /* renamed from: ǃ  reason: contains not printable characters */
                    public final T1 m14366(C0995 r4) {
                        T1 r42 = r116.m15434(r4);
                        if (r42 == null || rawType.isInstance(r42)) {
                            return r42;
                        }
                        StringBuilder sb = new StringBuilder("Expected a ");
                        sb.append(rawType.getName());
                        sb.append(" but was ");
                        sb.append(r42.getClass().getName());
                        throw new C1701(sb.toString());
                    }
                };
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
                sb.append(cls28.getName());
                sb.append(",adapter=");
                sb.append(r116);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    /* renamed from: o.ҝǃ$26  reason: invalid class name */
    static /* synthetic */ class AnonymousClass26 {

        /* renamed from: ǃ  reason: contains not printable characters */
        static final /* synthetic */ int[] f12506 = new int[C0313.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                o.ıȶ[] r0 = o.C0313.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12506 = r0
                int[] r0 = f12506     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.ıȶ r1 = o.C0313.NUMBER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f12506     // Catch:{ NoSuchFieldError -> 0x001f }
                o.ıȶ r1 = o.C0313.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f12506     // Catch:{ NoSuchFieldError -> 0x002a }
                o.ıȶ r1 = o.C0313.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f12506     // Catch:{ NoSuchFieldError -> 0x0035 }
                o.ıȶ r1 = o.C0313.NULL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f12506     // Catch:{ NoSuchFieldError -> 0x0040 }
                o.ıȶ r1 = o.C0313.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f12506     // Catch:{ NoSuchFieldError -> 0x004b }
                o.ıȶ r1 = o.C0313.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f12506     // Catch:{ NoSuchFieldError -> 0x0056 }
                o.ıȶ r1 = o.C0313.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f12506     // Catch:{ NoSuchFieldError -> 0x0062 }
                o.ıȶ r1 = o.C0313.NAME     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f12506     // Catch:{ NoSuchFieldError -> 0x006e }
                o.ıȶ r1 = o.C0313.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f12506     // Catch:{ NoSuchFieldError -> 0x007a }
                o.ıȶ r1 = o.C0313.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C2700.AnonymousClass26.<clinit>():void");
        }
    }

    /* renamed from: o.ҝǃ$ı  reason: contains not printable characters */
    static final class C2701<T extends Enum<T>> extends C3011<T> {

        /* renamed from: ı  reason: contains not printable characters */
        private final Map<T, String> f12514 = new HashMap();

        /* renamed from: ɩ  reason: contains not printable characters */
        private final Map<String, T> f12515 = new HashMap();

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m14395(C0815 r2, Object obj) {
            Enum enumR = (Enum) obj;
            r2.m6227(enumR == null ? null : this.f12514.get(enumR));
        }

        public C2701(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    C2709 r6 = (C2709) cls.getField(name).getAnnotation(C2709.class);
                    if (r6 != null) {
                        name = r6.m14406();
                        for (String put : r6.m14405()) {
                            this.f12515.put(put, enumR);
                        }
                    }
                    this.f12515.put(name, enumR);
                    this.f12514.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m14394(C0995 r3) {
            if (r3.m7095() != C0313.NULL) {
                return (Enum) this.f12515.get(r3.m7101());
            }
            r3.m7105();
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <TT> C2638 m14317(final C3101<TT> r1, final C3011<TT> r2) {
        return new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14351(C3122 r1, C3101<T> r2) {
                if (r2.equals(r1)) {
                    return r2;
                }
                return null;
            }
        };
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static <TT> C2638 m14318(final Class<TT> cls, final C3011<TT> r2) {
        return new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14350(C3122 r1, C3101<T> r2) {
                if (r2.getRawType() == cls) {
                    return r2;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(r2);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <TT> C2638 m14316(final Class<TT> cls, final Class<TT> cls2, final C3011<? super TT> r3) {
        return new C2638() {
            /* renamed from: ı  reason: contains not printable characters */
            public final <T> C3011<T> m14354(C3122 r1, C3101<T> r2) {
                Class<? super T> rawType = r2.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return r3;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls2.getName());
                sb.append("+");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(r3);
                sb.append("]");
                return sb.toString();
            }
        };
    }
}
