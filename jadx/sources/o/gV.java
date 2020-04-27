package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\u001aG\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0002\u0010\u0011\u001a-\u0010\u0013\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00122\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014\u001a=\u0010\u0013\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0016\u001a-\u0010\u0002\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0002\u0010\u0017\u001a)\u0010\b\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u0019\u001a-\u0010\u0013\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0017\u001a\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a*\u00020\u0001¢\u0006\u0004\b\b\u0010\u001b\u001a\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001c*\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001aG\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u001a*\u00020\u00012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u001f2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010 \u001a;\u0010\u0002\u001a\u00020\r*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0002\u0010!\u001a?\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\u001a*\u00020\u00012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u001f\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\"\u001a\u0019\u0010\u0006\u001a\u00020\n*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010#\u001a\u0019\u0010\u0006\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010$\u001a#\u0010\u0002\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0002\u0010%\u001a#\u0010\b\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00122\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\b\u0010&\u001a#\u0010\b\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\b\u0010%\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0001¢\u0006\u0004\b\u0004\u0010'\"\u0017\u0010\u0004\u001a\u00020\u0000*\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0017\u0010\b\u001a\u00020\u0005*\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/gf;", "", "ǃ", "(Ljava/lang/CharSequence;)Lo/gf;", "ι", "", "ɩ", "(Ljava/lang/CharSequence;)I", "Ι", "", "", "p0", "p1", "", "p2", "p3", "Lo/dr;", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lo/dr;", "", "ı", "(Ljava/lang/CharSequence;CIZ)I", "p4", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "", "(Ljava/lang/CharSequence;[CIZ)I", "Lo/gB;", "(Ljava/lang/CharSequence;)Lo/gB;", "", "Ӏ", "(Ljava/lang/CharSequence;)Ljava/util/List;", "", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lo/gB;", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lo/gB;", "(Ljava/lang/CharSequence;Lo/gf;)Ljava/lang/String;", "(Ljava/lang/String;Lo/gf;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/gK")
public class gV extends gT {
    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C3431gf m2361(CharSequence charSequence) {
        fM.m2254(charSequence, "");
        return new C3431gf(0, charSequence.length() - 1);
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public static final int m2366(CharSequence charSequence) {
        fM.m2254(charSequence, "");
        return charSequence.length() - 1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final String m2368(String str, C3431gf gfVar) {
        fM.m2254(str, "");
        fM.m2254(gfVar, "");
        String substring = str.substring(gfVar.m2402().intValue(), gfVar.m2401().intValue() + 1);
        fM.m2252((Object) substring, "");
        return substring;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final String m2367(CharSequence charSequence, C3431gf gfVar) {
        fM.m2254(charSequence, "");
        fM.m2254(gfVar, "");
        return charSequence.subSequence(gfVar.m2402().intValue(), gfVar.m2401().intValue() + 1).toString();
    }

    /* renamed from: Ι$default  reason: contains not printable characters */
    public static /* synthetic */ String m2374$default(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return gK.m2370(str, c, str2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final String m2370(String str, char c, String str2) {
        fM.m2254(str, "");
        fM.m2254(str2, "");
        int r8 = gK.m2354$default((CharSequence) str, c, 0, false, 6, (Object) null);
        if (r8 == -1) {
            return str2;
        }
        String substring = str.substring(0, r8);
        fM.m2252((Object) substring, "");
        return substring;
    }

    /* renamed from: Ι$default  reason: contains not printable characters */
    public static /* synthetic */ String m2375$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return gK.m2371(str, str2, str3);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final String m2371(String str, String str2, String str3) {
        fM.m2254(str, "");
        fM.m2254(str2, "");
        fM.m2254(str3, "");
        int r8 = gK.m2363$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (r8 == -1) {
            return str3;
        }
        String substring = str.substring(0, r8);
        fM.m2252((Object) substring, "");
        return substring;
    }

    /* renamed from: ǃ$default  reason: contains not printable characters */
    public static /* synthetic */ String m2364$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return gK.m2358(str, str2, str3);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final String m2358(String str, String str2, String str3) {
        fM.m2254(str, "");
        fM.m2254(str2, "");
        fM.m2254(str3, "");
        int r1 = gK.m2363$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (r1 == -1) {
            return str3;
        }
        String substring = str.substring(r1 + str2.length(), str.length());
        fM.m2252((Object) substring, "");
        return substring;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final boolean m2362(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        fM.m2254(charSequence, "");
        fM.m2254(charSequence2, "");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!gD.m2323(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final int m2369(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        fM.m2254(charSequence, "");
        fM.m2254(cArr, "");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int r9 = C3435gj.m2407(i, 0);
            int r2 = gK.m2366(charSequence);
            if (r9 > r2) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(r9);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else if (gD.m2323(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return r9;
                }
                if (r9 == r2) {
                    return -1;
                }
                r9++;
            }
        } else {
            return ((String) charSequence).indexOf(dM.m2066(cArr), i);
        }
    }

    /* renamed from: ı$default  reason: contains not printable characters */
    static /* synthetic */ int m2355$default(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m2351(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static final int m2351(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C3430ge geVar;
        if (!z2) {
            geVar = new C3431gf(C3435gj.m2407(i, 0), C3435gj.m2408(i2, charSequence.length()));
        } else {
            geVar = C3435gj.m2412(C3435gj.m2408(i, gK.m2366(charSequence)), C3435gj.m2407(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int r8 = geVar.m2394();
            int r9 = geVar.m2396();
            int r11 = geVar.m2395();
            if (r11 >= 0) {
                if (r8 > r9) {
                    return -1;
                }
            } else if (r8 < r9) {
                return -1;
            }
            while (true) {
                if (gK.m2362(charSequence2, 0, charSequence, r8, charSequence2.length(), z)) {
                    return r8;
                }
                if (r8 == r9) {
                    return -1;
                }
                r8 += r11;
            }
        } else {
            int r82 = geVar.m2394();
            int r92 = geVar.m2396();
            int r112 = geVar.m2395();
            if (r112 >= 0) {
                if (r82 > r92) {
                    return -1;
                }
            } else if (r82 < r92) {
                return -1;
            }
            while (true) {
                if (gK.m2341((String) charSequence2, 0, (String) charSequence, r82, charSequence2.length(), z)) {
                    return r82;
                }
                if (r82 == r92) {
                    return -1;
                }
                r82 += r112;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C3363dr<Integer, String> m2359(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        if (z || collection.size() != 1) {
            C3430ge gfVar = !z2 ? new C3431gf(C3435gj.m2407(i, 0), charSequence.length()) : C3435gj.m2412(C3435gj.m2408(i, gK.m2366(charSequence)), 0);
            if (charSequence instanceof String) {
                int r12 = gfVar.m2394();
                int r1 = gfVar.m2396();
                int r14 = gfVar.m2395();
                if (r14 < 0 ? r12 >= r1 : r12 <= r1) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (gK.m2341(str, 0, (String) charSequence, r12, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (r12 == r1) {
                                break;
                            }
                            r12 += r14;
                        } else {
                            return dB.m2052(Integer.valueOf(r12), str2);
                        }
                    }
                }
            } else {
                int r122 = gfVar.m2394();
                int r13 = gfVar.m2396();
                int r142 = gfVar.m2395();
                if (r142 < 0 ? r122 >= r13 : r122 <= r13) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (gK.m2362(str3, 0, charSequence, r122, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (r122 == r13) {
                                break;
                            }
                            r122 += r142;
                        } else {
                            return dB.m2052(Integer.valueOf(r122), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) dN.m2194(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i2 = i;
        int r10 = !z2 ? gK.m2363$default(charSequence2, str6, i2, false, 4, (Object) null) : gK.m2356$default(charSequence2, str6, i2, false, 4, (Object) null);
        if (r10 < 0) {
            return null;
        }
        return dB.m2052(Integer.valueOf(r10), str5);
    }

    /* renamed from: ı$default  reason: contains not printable characters */
    public static /* synthetic */ int m2354$default(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return gK.m2350(charSequence, c, i, z);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final int m2350(CharSequence charSequence, char c, int i, boolean z) {
        fM.m2254(charSequence, "");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return gK.m2369(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: ǃ$default  reason: contains not printable characters */
    public static /* synthetic */ int m2363$default(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return gK.m2357(charSequence, str, i, z);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final int m2357(CharSequence charSequence, String str, int i, boolean z) {
        fM.m2254(charSequence, "");
        fM.m2254(str, "");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m2355$default(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    /* renamed from: ı$default  reason: contains not printable characters */
    public static /* synthetic */ int m2356$default(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = gK.m2366(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return gK.m2352(charSequence, str, i, z);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final int m2352(CharSequence charSequence, String str, int i, boolean z) {
        fM.m2254(charSequence, "");
        fM.m2254(str, "");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i);
        }
        return m2351(charSequence, str, i, 0, z, true);
    }

    /* renamed from: Ι$default  reason: contains not printable characters */
    static /* synthetic */ gB m2376$default(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m2373(charSequence, strArr, i, z, i2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static final gB<C3431gf> m2373(CharSequence charSequence, String[] strArr, int i, final boolean z, int i2) {
        if (i2 >= 0) {
            final List r3 = dM.m2059(strArr);
            return new gJ(charSequence, i, i2, new C3423fy<CharSequence, Integer, C3363dr<? extends Integer, ? extends Integer>>() {
                /* renamed from: ı  reason: contains not printable characters */
                public final /* synthetic */ Object m2379(Object obj, Object obj2) {
                    return m2380((CharSequence) obj, ((Number) obj2).intValue());
                }

                /* renamed from: ı  reason: contains not printable characters */
                public final C3363dr<Integer, Integer> m2380(CharSequence charSequence, int i) {
                    fM.m2254(charSequence, "");
                    C3363dr r4 = gV.m2359(charSequence, r3, i, z, false);
                    if (r4 != null) {
                        return dB.m2052(r4.m2104(), Integer.valueOf(((String) r4.m2101()).length()));
                    }
                    return null;
                }
            });
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    /* renamed from: ǃ$default  reason: contains not printable characters */
    public static /* synthetic */ gB m2365$default(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return gK.m2360(charSequence, strArr, z, i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final gB<String> m2360(final CharSequence charSequence, String[] strArr, boolean z, int i) {
        fM.m2254(charSequence, "");
        fM.m2254(strArr, "");
        return C3450gy.m2314(m2376$default(charSequence, strArr, 0, z, i, 2, (Object) null), new C3413fo<C3431gf, String>() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final String m2382(C3431gf gfVar) {
                fM.m2254(gfVar, "");
                return gK.m2367(charSequence, gfVar);
            }
        });
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final gB<String> m2372(CharSequence charSequence) {
        fM.m2254(charSequence, "");
        return gK.m2365$default(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static final List<String> m2378(CharSequence charSequence) {
        fM.m2254(charSequence, "");
        return C3450gy.m2319(gK.m2372(charSequence));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final CharSequence m2377(CharSequence charSequence) {
        fM.m2254(charSequence, "");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean r4 = gD.m2321(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!r4) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!r4) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
