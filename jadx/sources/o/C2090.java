package o;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import o.C2274;
import o.C2477;
import o.C2745;

/* renamed from: o.ιս  reason: contains not printable characters */
public final class C2090 extends C2042 {
    C2090(C1924 r1) {
        super(r1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m11115() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m11107(C2477.C2490.If ifR, Object obj) {
        C2745.C2746.m14555(obj);
        ifR.m13223().m13226().m13220();
        if (obj instanceof String) {
            ifR.m13222((String) obj);
        } else if (obj instanceof Long) {
            ifR.m13225(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            ifR.m13224(((Double) obj).doubleValue());
        } else {
            t_().m11714().m11603("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m11120(C2477.C2483.C2484 r11, Object obj) {
        C2745.C2746.m14555(obj);
        r11.m13130().m13127().m13134().m13133();
        if (obj instanceof String) {
            r11.m13136((String) obj);
        } else if (obj instanceof Long) {
            r11.m13131(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            r11.m13128(((Double) obj).doubleValue());
        } else if (!C0369.m4560() || !r_().m13372(C2529.f11577) || !(obj instanceof Bundle[])) {
            t_().m11714().m11603("Ignoring invalid (type) event param value", obj);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C2477.C2483.C2484 r4 = C2477.C2483.m13106();
                    for (String str : bundle.keySet()) {
                        C2477.C2483.C2484 r7 = C2477.C2483.m13106().m13132(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            r7.m13131(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            r7.m13136((String) obj2);
                        } else if (obj2 instanceof Double) {
                            r7.m13128(((Double) obj2).doubleValue());
                        }
                        r4.m13137(r7);
                    }
                    if (r4.m13129() > 0) {
                        arrayList.add((C2477.C2483) ((C0987) r4.m7011()));
                    }
                }
            }
            r11.m13135((Iterable<? extends C2477.C2483>) arrayList);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static C2477.C2483 m11101(C2477.C2481 r2, String str) {
        for (C2477.C2483 next : r2.m13067()) {
            if (next.m13123().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final Object m11112(C2477.C2481 r7, String str) {
        C2477.C2483 r72 = m11101(r7, str);
        if (r72 == null) {
            return null;
        }
        if (r72.m13122()) {
            return r72.m13119();
        }
        if (r72.m13116()) {
            return Long.valueOf(r72.m13125());
        }
        if (r72.m13124()) {
            return Double.valueOf(r72.m13126());
        }
        if (!C0369.m4560() || !r_().m13372(C2529.f11577) || r72.m13117() <= 0) {
            return null;
        }
        List<C2477.C2483> r73 = r72.m13121();
        ArrayList arrayList = new ArrayList();
        for (C2477.C2483 next : r73) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (C2477.C2483 next2 : next.m13121()) {
                    if (next2.m13122()) {
                        bundle.putString(next2.m13123(), next2.m13119());
                    } else if (next2.m13116()) {
                        bundle.putLong(next2.m13123(), next2.m13125());
                    } else if (next2.m13124()) {
                        bundle.putDouble(next2.m13123(), next2.m13126());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11114(C2477.C2481.C2482 r5, String str, Object obj) {
        List<C2477.C2483> r0 = r5.m13079();
        int i = 0;
        while (true) {
            if (i >= r0.size()) {
                i = -1;
                break;
            } else if (str.equals(r0.get(i).m13123())) {
                break;
            } else {
                i++;
            }
        }
        C2477.C2483.C2484 r6 = C2477.C2483.m13106().m13132(str);
        if (obj instanceof Long) {
            r6.m13131(((Long) obj).longValue());
        } else if (obj instanceof String) {
            r6.m13136((String) obj);
        } else if (obj instanceof Double) {
            r6.m13128(((Double) obj).doubleValue());
        } else if (C0369.m4560()) {
            r_().m13372(C2529.f11577);
        }
        if (i >= 0) {
            r5.m13088(i, r6);
        } else {
            r5.m13078(r6);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final String m11121(C2477.C2487 r13) {
        if (r13 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C2477.aux next : r13.m13166()) {
            if (next != null) {
                m11102(sb, 1);
                sb.append("bundle {\n");
                if (next.m12946()) {
                    m11104(sb, 1, "protocol_version", Integer.valueOf(next.m12926()));
                }
                m11104(sb, 1, "platform", next.m12907());
                if (next.m12913()) {
                    m11104(sb, 1, "gmp_version", Long.valueOf(next.m12924()));
                }
                if (next.m12931()) {
                    m11104(sb, 1, "uploading_gmp_version", Long.valueOf(next.m12923()));
                }
                if (next.m12918()) {
                    m11104(sb, 1, "dynamite_version", Long.valueOf(next.m12936()));
                }
                if (next.m12948()) {
                    m11104(sb, 1, "config_version", Long.valueOf(next.m12905()));
                }
                m11104(sb, 1, "gmp_app_id", next.m12957());
                m11104(sb, 1, "admob_app_id", next.m12921());
                m11104(sb, 1, "app_id", next.m12911());
                m11104(sb, 1, "app_version", next.m12922());
                if (next.m12932()) {
                    m11104(sb, 1, "app_version_major", Integer.valueOf(next.m12938()));
                }
                m11104(sb, 1, "firebase_instance_id", next.m12940());
                if (next.m12955()) {
                    m11104(sb, 1, "dev_cert_hash", Long.valueOf(next.m12949()));
                }
                m11104(sb, 1, "app_store", next.m12937());
                if (next.m12961()) {
                    m11104(sb, 1, "upload_timestamp_millis", Long.valueOf(next.m12910()));
                }
                if (next.m12958()) {
                    m11104(sb, 1, "start_timestamp_millis", Long.valueOf(next.m12930()));
                }
                if (next.m12919()) {
                    m11104(sb, 1, "end_timestamp_millis", Long.valueOf(next.m12925()));
                }
                if (next.m12934()) {
                    m11104(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.m12928()));
                }
                if (next.m12962()) {
                    m11104(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.m12954()));
                }
                m11104(sb, 1, "app_instance_id", next.m12943());
                m11104(sb, 1, "resettable_device_id", next.m12933());
                m11104(sb, 1, "device_id", next.m12945());
                m11104(sb, 1, "ds_id", next.m12920());
                if (next.m12952()) {
                    m11104(sb, 1, "limited_ad_tracking", Boolean.valueOf(next.m12950()));
                }
                m11104(sb, 1, "os_version", next.m12908());
                m11104(sb, 1, "device_model", next.m12942());
                m11104(sb, 1, "user_default_language", next.m12935());
                if (next.m12912()) {
                    m11104(sb, 1, "time_zone_offset_minutes", Integer.valueOf(next.m12909()));
                }
                if (next.m12959()) {
                    m11104(sb, 1, "bundle_sequential_index", Integer.valueOf(next.m12929()));
                }
                if (next.m12956()) {
                    m11104(sb, 1, "service_upload", Boolean.valueOf(next.m12939()));
                }
                m11104(sb, 1, "health_monitor", next.m12960());
                if (next.m12963() && next.m12953() != 0) {
                    m11104(sb, 1, "android_id", Long.valueOf(next.m12953()));
                }
                if (next.m12917()) {
                    m11104(sb, 1, "retry_counter", Integer.valueOf(next.m12906()));
                }
                List<C2477.C2490> r4 = next.m12947();
                if (r4 != null) {
                    for (C2477.C2490 next2 : r4) {
                        if (next2 != null) {
                            m11102(sb, 2);
                            sb.append("user_property {\n");
                            Double d = null;
                            m11104(sb, 2, "set_timestamp_millis", next2.m13215() ? Long.valueOf(next2.m13212()) : null);
                            m11104(sb, 2, "name", v_().m11222(next2.m13210()));
                            m11104(sb, 2, "string_value", next2.m13216());
                            m11104(sb, 2, "int_value", next2.m13217() ? Long.valueOf(next2.m13219()) : null);
                            if (next2.m13218()) {
                                d = Double.valueOf(next2.m13211());
                            }
                            m11104(sb, 2, "double_value", d);
                            m11102(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C2477.C2485> r42 = next.m12941();
                String r7 = next.m12911();
                if (r42 != null) {
                    for (C2477.C2485 next3 : r42) {
                        if (next3 != null) {
                            m11102(sb, 2);
                            sb.append("audience_membership {\n");
                            if (next3.m13150()) {
                                m11104(sb, 2, "audience_id", Integer.valueOf(next3.m13148()));
                            }
                            if (next3.m13152()) {
                                m11104(sb, 2, "new_audience", Boolean.valueOf(next3.m13155()));
                            }
                            m11095(sb, 2, "current_data", next3.m13153(), r7);
                            if (!C1140.m7582() || !r_().m13372(C2529.f11567) || next3.m13154()) {
                                m11095(sb, 2, "previous_data", next3.m13151(), r7);
                            }
                            m11102(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C2477.C2481> r1 = next.m12904();
                if (r1 != null) {
                    for (C2477.C2481 next4 : r1) {
                        if (next4 != null) {
                            m11102(sb, 2);
                            sb.append("event {\n");
                            m11104(sb, 2, "name", v_().m11216(next4.m13068()));
                            if (next4.m13070()) {
                                m11104(sb, 2, "timestamp_millis", Long.valueOf(next4.m13065()));
                            }
                            if (next4.m13073()) {
                                m11104(sb, 2, "previous_timestamp_millis", Long.valueOf(next4.m13069()));
                            }
                            if (next4.m13075()) {
                                m11104(sb, 2, "count", Integer.valueOf(next4.m13074()));
                            }
                            if (next4.m13071() != 0) {
                                m11096(sb, 2, next4.m13067());
                            }
                            m11102(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m11102(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final String m11105(C2274.If ifR) {
        if (ifR == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (ifR.m11851()) {
            m11104(sb, 0, "filter_id", Integer.valueOf(ifR.m11846()));
        }
        m11104(sb, 0, "event_name", v_().m11216(ifR.m11848()));
        String r1 = m11099(ifR.m11852(), ifR.m11845(), ifR.m11855());
        if (!r1.isEmpty()) {
            m11104(sb, 0, "filter_type", r1);
        }
        if (!C1140.m7582() || !r_().m13372(C2529.f11567) || ifR.m11854()) {
            m11094(sb, 1, "event_count_filter", ifR.m11849());
        }
        if (!C1140.m7582() || !r_().m13372(C2529.f11567) || ifR.m11843() > 0) {
            sb.append("  filters {\n");
            for (C2274.C2277 r12 : ifR.m11850()) {
                m11097(sb, 2, r12);
            }
        }
        m11102(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final String m11106(C2274.C2278 r6) {
        if (r6 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (r6.m11918()) {
            m11104(sb, 0, "filter_id", Integer.valueOf(r6.m11913()));
        }
        m11104(sb, 0, "property_name", v_().m11222(r6.m11916()));
        String r1 = m11099(r6.m11915(), r6.m11917(), r6.m11921());
        if (!r1.isEmpty()) {
            m11104(sb, 0, "filter_type", r1);
        }
        m11097(sb, 1, r6.m11919());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static String m11099(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m11096(StringBuilder sb, int i, List<C2477.C2483> list) {
        if (list != null) {
            int i2 = i + 1;
            for (C2477.C2483 next : list) {
                if (next != null) {
                    m11102(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    if (!C0369.m4560() || !r_().m13372(C2529.f11565)) {
                        m11104(sb, i2, "name", v_().m11219(next.m13123()));
                        m11104(sb, i2, "string_value", next.m13119());
                        m11104(sb, i2, "int_value", next.m13116() ? Long.valueOf(next.m13125()) : null);
                        if (next.m13124()) {
                            d = Double.valueOf(next.m13126());
                        }
                        m11104(sb, i2, "double_value", d);
                    } else {
                        m11104(sb, i2, "name", next.m13120() ? v_().m11219(next.m13123()) : null);
                        m11104(sb, i2, "string_value", next.m13122() ? next.m13119() : null);
                        m11104(sb, i2, "int_value", next.m13116() ? Long.valueOf(next.m13125()) : null);
                        if (next.m13124()) {
                            d = Double.valueOf(next.m13126());
                        }
                        m11104(sb, i2, "double_value", d);
                        if (next.m13117() > 0) {
                            m11096(sb, i2, next.m13121());
                        }
                    }
                    m11102(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m11095(StringBuilder sb, int i, String str, C2477.IF ifR, String str2) {
        if (ifR != null) {
            m11102(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (ifR.m12765() != 0) {
                m11102(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long next : ifR.m12769()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (ifR.m12764() != 0) {
                m11102(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long next2 : ifR.m12771()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (ifR.m12768() != 0) {
                m11102(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C2477.C3645If next3 : ifR.m12767()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next3.m12792() ? Integer.valueOf(next3.m12790()) : null);
                    sb.append(":");
                    sb.append(next3.m12789() ? Long.valueOf(next3.m12793()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (ifR.m12774() != 0) {
                m11102(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C2477.C2489 next4 : ifR.m12773()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next4.m13186() ? Integer.valueOf(next4.m13182()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : next4.m13184()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            m11102(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m11094(StringBuilder sb, int i, String str, C2274.C2279 r5) {
        if (r5 != null) {
            m11102(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (r5.m11932()) {
                m11104(sb, i, "comparison_type", r5.m11928().name());
            }
            if (r5.m11925()) {
                m11104(sb, i, "match_as_float", Boolean.valueOf(r5.m11929()));
            }
            if (!C1140.m7582() || !r_().m13372(C2529.f11567) || r5.m11931()) {
                m11104(sb, i, "comparison_value", r5.m11926());
            }
            if (!C1140.m7582() || !r_().m13372(C2529.f11567) || r5.m11930()) {
                m11104(sb, i, "min_comparison_value", r5.m11933());
            }
            if (!C1140.m7582() || !r_().m13372(C2529.f11567) || r5.m11935()) {
                m11104(sb, i, "max_comparison_value", r5.m11934());
            }
            m11102(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m11097(StringBuilder sb, int i, C2274.C2277 r8) {
        if (r8 != null) {
            m11102(sb, i);
            sb.append("filter {\n");
            if (r8.m11905()) {
                m11104(sb, i, "complement", Boolean.valueOf(r8.m11907()));
            }
            if (!C1140.m7582() || !r_().m13372(C2529.f11567) || r8.m11903()) {
                m11104(sb, i, "param_name", v_().m11219(r8.m11906()));
            }
            if (!C1140.m7582() || !r_().m13372(C2529.f11567) || r8.m11904()) {
                int i2 = i + 1;
                C2274.aux r2 = r8.m11899();
                if (r2 != null) {
                    m11102(sb, i2);
                    sb.append("string_filter");
                    sb.append(" {\n");
                    if (r2.m11863()) {
                        m11104(sb, i2, "match_type", r2.m11869().name());
                    }
                    if (!C1140.m7582() || !r_().m13372(C2529.f11567) || r2.m11868()) {
                        m11104(sb, i2, "expression", r2.m11866());
                    }
                    if (r2.m11865()) {
                        m11104(sb, i2, "case_sensitive", Boolean.valueOf(r2.m11867()));
                    }
                    if (r2.m11870() > 0) {
                        m11102(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : r2.m11871()) {
                            m11102(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m11102(sb, i2);
                    sb.append("}\n");
                }
            }
            if (!C1140.m7582() || !r_().m13372(C2529.f11567) || r8.m11901()) {
                m11094(sb, i + 1, "number_filter", r8.m11902());
            }
            m11102(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m11102(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m11104(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m11102(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        t_().m11714().m11606("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T m11111(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ɩ -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ɩ -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ɩ -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ɩ -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ɩ -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            o.Іɛ r5 = r4.t_()     // Catch:{ all -> 0x001a }
            o.ϵı r5 = r5.m11714()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.m11606(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2090.m11111(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m11108(C2441 r3, C2270 r4) {
        C2745.C2746.m14555(r3);
        C2745.C2746.m14555(r4);
        if (!C3133.m15876() || !r_().m13372(C2529.f11504)) {
            if (!TextUtils.isEmpty(r4.f10620) || !TextUtils.isEmpty(r4.f10606)) {
                return true;
            }
            q_();
            return false;
        } else if (!TextUtils.isEmpty(r4.f10620) || !TextUtils.isEmpty(r4.f10606)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static boolean m11098(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static boolean m11092(List<Long> list, int i) {
        if (i >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static List<Long> m11103(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<Long> m11113(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                t_().A_().m11603("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    t_().A_().m11605("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (next.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m11116(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(w_().m10846() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m11110(byte[] bArr) {
        C2745.C2746.m14555(bArr);
        m15901().y_();
        MessageDigest r0 = C2151.m11355();
        if (r0 != null) {
            return C2151.m11337(r0.digest(bArr));
        }
        t_().m11714().m11606("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final byte[] m11117(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            t_().m11714().m11603("Failed to ungzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final byte[] m11123(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            t_().m11714().m11603("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final List<Integer> m11122() {
        Map<String, String> r0 = C2529.m13420(this.f10106.m10523());
        if (r0 == null || r0.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = C2529.f11591.m10833(null).intValue();
        Iterator<Map.Entry<String, String>> it = r0.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (((String) next.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            t_().A_().m11603("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    t_().A_().m11603("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static <Builder extends C1761> Builder m11100(Builder builder, byte[] bArr) {
        C0705 r0 = C0705.m5816();
        if (r0 != null) {
            return builder.m9848(bArr, r0);
        }
        return builder.m9846(bArr);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m11093(C2477.aux.Cif ifVar, String str) {
        if (ifVar == null) {
            return -1;
        }
        for (int i = 0; i < ifVar.m13009(); i++) {
            if (str.equals(ifVar.m13014(i).m13210())) {
                return i;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ C2090 p_() {
        return super.p_();
    }

    public final /* bridge */ /* synthetic */ C2217 o_() {
        return super.o_();
    }

    public final /* bridge */ /* synthetic */ C2309 n_() {
        return super.n_();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2593 m11119() {
        return super.m10945();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11109() {
        super.m15900();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11125() {
        super.m15903();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11124() {
        super.m15902();
    }

    public final /* bridge */ /* synthetic */ void y_() {
        super.y_();
    }

    public final /* bridge */ /* synthetic */ C2337 x_() {
        return super.x_();
    }

    public final /* bridge */ /* synthetic */ C2023 w_() {
        return super.w_();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Context m11126() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m11118() {
        return super.m15901();
    }

    public final /* bridge */ /* synthetic */ C2570 u_() {
        return super.u_();
    }

    public final /* bridge */ /* synthetic */ C2244 t_() {
        return super.t_();
    }

    public final /* bridge */ /* synthetic */ C2327 s_() {
        return super.s_();
    }

    public final /* bridge */ /* synthetic */ C2518 r_() {
        return super.r_();
    }

    public final /* bridge */ /* synthetic */ C2448 q_() {
        return super.q_();
    }
}
