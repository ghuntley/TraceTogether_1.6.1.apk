package o;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.C2477;
import o.C2745;

/* renamed from: o.ƾı  reason: contains not printable characters */
final class C0822 extends C2042 {
    public C0822(C1924 r1) {
        super(r1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m6242() {
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final byte[] m6243(C2441 r29, String str) {
        C2152 r7;
        C2477.C2487.C2488 r27;
        C2477.aux.Cif ifVar;
        C2457 r25;
        byte[] bArr;
        Bundle bundle;
        C2440 r12;
        long j;
        C2441 r0 = r29;
        String str2 = str;
        y_();
        this.f14314.m14113();
        C2745.C2746.m14555(r29);
        C2745.C2746.m14562(str);
        if (!r_().m13384(str2, C2529.f11527)) {
            t_().m11711().m11603("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if ("_iap".equals(r0.f11089) || "_iapx".equals(r0.f11089)) {
            C2477.C2487.C2488 r13 = C2477.C2487.m13162();
            n_().m12045();
            try {
                C2457 r11 = n_().m12038(str2);
                if (r11 == null) {
                    t_().m11711().m11603("Log and bundle not available. package_name", str2);
                    return new byte[0];
                } else if (!r11.m12603()) {
                    t_().m11711().m11603("Log and bundle disabled. package_name", str2);
                    byte[] bArr2 = new byte[0];
                    n_().m12018();
                    return bArr2;
                } else {
                    C2477.aux.Cif r122 = C2477.aux.m12856().m12965(1).m12990(C3273am.f1518);
                    if (!TextUtils.isEmpty(r11.m12610())) {
                        r122.m13021(r11.m12610());
                    }
                    if (!TextUtils.isEmpty(r11.m12625())) {
                        r122.m13012(r11.m12625());
                    }
                    if (!TextUtils.isEmpty(r11.m12614())) {
                        r122.m13025(r11.m12614());
                    }
                    if (r11.m12660() != -2147483648L) {
                        r122.m12996((int) r11.m12660());
                    }
                    r122.m12997(r11.m12632()).m12981(r11.m12652());
                    if (!C1306.m8256() || !r_().m13384(r11.m12610(), C2529.f11605)) {
                        if (!TextUtils.isEmpty(r11.m12597())) {
                            r122.m13000(r11.m12597());
                        } else if (!TextUtils.isEmpty(r11.m12657())) {
                            r122.m13027(r11.m12657());
                        }
                    } else if (!TextUtils.isEmpty(r11.m12597())) {
                        r122.m13000(r11.m12597());
                    } else if (!TextUtils.isEmpty(r11.m12648())) {
                        r122.m13001(r11.m12648());
                    } else if (!TextUtils.isEmpty(r11.m12657())) {
                        r122.m13027(r11.m12657());
                    }
                    r122.m13020(r11.m12636());
                    if (this.f14314.m14094() && r_().m13386(r122.m13015())) {
                        r122.m13015();
                        if (!TextUtils.isEmpty((CharSequence) null)) {
                            r122.m12994((String) null);
                        }
                    }
                    Pair<String, Boolean> r3 = s_().m12122(r11.m12610());
                    if (r11.m12651() && r3 != null && !TextUtils.isEmpty((CharSequence) r3.first)) {
                        r122.m12998(m6241((String) r3.first, Long.toString(r0.f11091)));
                        if (r3.second != null) {
                            r122.m13013(((Boolean) r3.second).booleanValue());
                        }
                    }
                    x_().m15649();
                    C2477.aux.Cif r32 = r122.m13006(Build.MODEL);
                    x_().m15649();
                    r32.m12967(Build.VERSION.RELEASE).m13016((int) x_().m12187()).m12977(x_().m12184());
                    try {
                        r122.m13018(m6241(r11.m12621(), Long.toString(r0.f11091)));
                        if (!TextUtils.isEmpty(r11.m12627())) {
                            r122.m12982(r11.m12627());
                        }
                        String r33 = r11.m12610();
                        List<C2152> r5 = n_().m12017(r33);
                        Iterator<C2152> it = r5.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                r7 = null;
                                break;
                            }
                            r7 = it.next();
                            if ("_lte".equals(r7.f10313)) {
                                break;
                            }
                        }
                        if (r7 == null || r7.f10314 == null) {
                            C2152 r16 = new C2152(r33, "auto", "_lte", w_().m10846(), 0L);
                            r5.add(r16);
                            n_().m12021(r16);
                        }
                        if (r_().m13384(r33, C2529.f11526)) {
                            C2090 p_ = p_();
                            p_.t_().m11713().m11606("Checking account type status for ad personalization signals");
                            if (p_.x_().m12186()) {
                                String r8 = r11.m12610();
                                if (r11.m12651() && p_.m10945().m13748(r8)) {
                                    p_.t_().m11711().m11606("Turning off ad personalization due to account type");
                                    Iterator<C2152> it2 = r5.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        } else if ("_npa".equals(it2.next().f10313)) {
                                            it2.remove();
                                            break;
                                        }
                                    }
                                    r5.add(new C2152(r8, "auto", "_npa", p_.w_().m10846(), 1L));
                                }
                            }
                        }
                        C2477.C2490[] r34 = new C2477.C2490[r5.size()];
                        for (int i = 0; i < r5.size(); i++) {
                            C2477.C2490.If r82 = C2477.C2490.m13202().m13221(r5.get(i).f10313).m13227(r5.get(i).f10317);
                            p_().m11107(r82, r5.get(i).f10314);
                            r34[i] = (C2477.C2490) ((C0987) r82.m7011());
                        }
                        r122.m12976((Iterable<? extends C2477.C2490>) Arrays.asList(r34));
                        Bundle r14 = r0.f11090.m12527();
                        r14.putLong("_c", 1);
                        t_().m11711().m11606("Marking in-app purchase as real-time");
                        r14.putLong("_r", 1);
                        r14.putString("_o", r0.f11088);
                        if (m15901().m11410(r122.m13015())) {
                            m15901().m11381(r14, "_dbg", 1L);
                            m15901().m11381(r14, "_r", 1L);
                        }
                        C2440 r2 = n_().m12050(str2, r0.f11089);
                        if (r2 == null) {
                            r25 = r11;
                            ifVar = r122;
                            r27 = r13;
                            bundle = r14;
                            bArr = null;
                            r12 = new C2440(str, r0.f11089, 0, 0, r0.f11091, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                            j = 0;
                        } else {
                            r25 = r11;
                            ifVar = r122;
                            r27 = r13;
                            bundle = r14;
                            bArr = null;
                            j = r2.f11086;
                            r12 = r2.m12554(r0.f11091);
                        }
                        n_().m12020(r12);
                        C2381 r22 = new C2381(this.f14314, r0.f11088, str, r0.f11089, r0.f11091, j, bundle);
                        C2477.C2481.C2482 r23 = C2477.C2481.m13050().m13077(r22.f10910).m13089(r22.f10912).m13084(r22.f10914);
                        Iterator<String> it3 = r22.f10913.iterator();
                        while (it3.hasNext()) {
                            String next = it3.next();
                            C2477.C2483.C2484 r52 = C2477.C2483.m13106().m13132(next);
                            p_().m11120(r52, r22.f10913.m12532(next));
                            r23.m13078(r52);
                        }
                        C2477.aux.Cif ifVar2 = ifVar;
                        ifVar2.m12991(r23).m12978(C2477.C3646iF.m13028().m13036(C2477.Cif.m13042().m13045(r12.f11079).m13044(r0.f11089)));
                        ifVar2.m13005((Iterable<? extends C2477.C2485>) o_().m11658(r25.m12610(), Collections.emptyList(), ifVar2.m13002(), Long.valueOf(r23.m13092()), Long.valueOf(r23.m13092())));
                        if (r23.m13085()) {
                            ifVar2.m13004(r23.m13092()).m12975(r23.m13092());
                        }
                        long r4 = r25.m12619();
                        int i2 = (r4 > 0 ? 1 : (r4 == 0 ? 0 : -1));
                        if (i2 != 0) {
                            ifVar2.m12966(r4);
                        }
                        long r6 = r25.m12605();
                        if (r6 != 0) {
                            ifVar2.m13010(r6);
                        } else if (i2 != 0) {
                            ifVar2.m13010(r4);
                        }
                        r25.m12616();
                        ifVar2.m12970((int) r25.m12602()).m12971(r_().m13369()).m12988(w_().m10846()).m13008(Boolean.TRUE.booleanValue());
                        C2477.C2487.C2488 r02 = r27;
                        r02.m13170(ifVar2);
                        C2457 r24 = r25;
                        r24.m12611(ifVar2.m13022());
                        r24.m12643(ifVar2.m12995());
                        n_().m12051(r24);
                        n_().m12030();
                        n_().m12018();
                        try {
                            return p_().m11123(((C2477.C2487) ((C0987) r02.m7011())).m4781());
                        } catch (IOException e) {
                            t_().m11714().m11605("Data loss. Failed to bundle and serialize. appId", C2244.m11698(str), e);
                            return bArr;
                        }
                    } catch (SecurityException e2) {
                        t_().m11711().m11603("app instance id encryption failed", e2.getMessage());
                        byte[] bArr3 = new byte[0];
                        n_().m12018();
                        return bArr3;
                    }
                }
            } catch (SecurityException e3) {
                t_().m11711().m11603("Resettable device id encryption failed", e3.getMessage());
                return new byte[0];
            } finally {
                n_().m12018();
            }
        } else {
            t_().m11711().m11605("Generating a payload for this event is not available. package_name, event_name", str2, r0.f11089);
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static String m6241(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }
}
