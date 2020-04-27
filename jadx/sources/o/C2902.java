package o;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.C0496;

/* renamed from: o.ӏɾ  reason: contains not printable characters */
public class C2902 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final String f13505 = "rating";

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final String f13506 = "level_name";

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Set<String> f13507 = new HashSet(Arrays.asList(new String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"}));

    /* renamed from: Ι  reason: contains not printable characters */
    private static final String f13508 = "success";

    /* renamed from: ι  reason: contains not printable characters */
    private static final String f13509 = "method";

    /* renamed from: ɩ  reason: contains not printable characters */
    public C2926 m15055(C0496 r6) {
        Bundle bundle;
        String str;
        boolean z = true;
        boolean z2 = C0496.C0497.CUSTOM.equals(r6.f4169) && r6.f4171 != null;
        boolean z3 = C0496.C0497.PREDEFINED.equals(r6.f4169) && r6.f4170 != null;
        if (!z2 && !z3) {
            return null;
        }
        if (z3) {
            bundle = m15052(r6);
        } else {
            bundle = new Bundle();
            if (r6.f4172 != null) {
                m15054(bundle, r6.f4172);
            }
        }
        if (z3) {
            String str2 = (String) r6.f4167.get(f13508);
            if (str2 == null || Boolean.parseBoolean(str2)) {
                z = false;
            }
            str = m15051(r6.f4170, z);
        } else {
            str = m15044(r6.f4171);
        }
        C3263ac.m1563();
        return new C2926(str, bundle);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private String m15044(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_event";
        }
        if (f13507.contains(str)) {
            return "fabric_".concat(str);
        }
        String replaceAll = str.replaceAll("[^\\p{Alnum}_]+", C3292bc.f1729);
        if (replaceAll.startsWith("ga_") || replaceAll.startsWith("google_") || replaceAll.startsWith("firebase_") || !Character.isLetter(replaceAll.charAt(0))) {
            replaceAll = "fabric_".concat(replaceAll);
        }
        return replaceAll.length() > 40 ? replaceAll.substring(0, 40) : replaceAll;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private String m15050(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_parameter";
        }
        String replaceAll = str.replaceAll("[^\\p{Alnum}_]+", C3292bc.f1729);
        if (replaceAll.startsWith("ga_") || replaceAll.startsWith("google_") || replaceAll.startsWith("firebase_") || !Character.isLetter(replaceAll.charAt(0))) {
            replaceAll = "fabric_".concat(replaceAll);
        }
        return replaceAll.length() > 40 ? replaceAll.substring(0, 40) : replaceAll;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r11.equals("purchase") != false) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[RETURN] */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m15051(java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "purchase"
            java.lang.String r2 = "signUp"
            r3 = -1
            r4 = 2
            r5 = 1
            java.lang.String r6 = "login"
            if (r12 == 0) goto L_0x0049
            int r12 = r11.hashCode()
            r7 = -902468296(0xffffffffca356d38, float:-2972494.0)
            if (r12 == r7) goto L_0x0030
            r7 = 103149417(0x625ef69, float:3.1208942E-35)
            if (r12 == r7) goto L_0x0028
            r7 = 1743324417(0x67e90501, float:2.2008074E24)
            if (r12 == r7) goto L_0x0020
            goto L_0x0038
        L_0x0020:
            boolean r12 = r11.equals(r1)
            if (r12 == 0) goto L_0x0038
            r12 = 0
            goto L_0x0039
        L_0x0028:
            boolean r12 = r11.equals(r6)
            if (r12 == 0) goto L_0x0038
            r12 = 2
            goto L_0x0039
        L_0x0030:
            boolean r12 = r11.equals(r2)
            if (r12 == 0) goto L_0x0038
            r12 = 1
            goto L_0x0039
        L_0x0038:
            r12 = -1
        L_0x0039:
            if (r12 == 0) goto L_0x0046
            if (r12 == r5) goto L_0x0043
            if (r12 == r4) goto L_0x0040
            goto L_0x0049
        L_0x0040:
            java.lang.String r11 = "failed_login"
            return r11
        L_0x0043:
            java.lang.String r11 = "failed_sign_up"
            return r11
        L_0x0046:
            java.lang.String r11 = "failed_ecommerce_purchase"
            return r11
        L_0x0049:
            int r12 = r11.hashCode()
            java.lang.String r7 = "share"
            java.lang.String r8 = "search"
            java.lang.String r9 = "invite"
            switch(r12) {
                case -2131650889: goto L_0x00be;
                case -1183699191: goto L_0x00b5;
                case -938102371: goto L_0x00ab;
                case -906336856: goto L_0x00a3;
                case -902468296: goto L_0x009b;
                case -389087554: goto L_0x0091;
                case 23457852: goto L_0x0087;
                case 103149417: goto L_0x007e;
                case 109400031: goto L_0x0076;
                case 196004670: goto L_0x006b;
                case 1664021448: goto L_0x0060;
                case 1743324417: goto L_0x0058;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x00c9
        L_0x0058:
            boolean r12 = r11.equals(r1)
            if (r12 == 0) goto L_0x00c9
            goto L_0x00ca
        L_0x0060:
            java.lang.String r12 = "startCheckout"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 2
            goto L_0x00ca
        L_0x006b:
            java.lang.String r12 = "levelStart"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 10
            goto L_0x00ca
        L_0x0076:
            boolean r12 = r11.equals(r7)
            if (r12 == 0) goto L_0x00c9
            r0 = 5
            goto L_0x00ca
        L_0x007e:
            boolean r12 = r11.equals(r6)
            if (r12 == 0) goto L_0x00c9
            r0 = 8
            goto L_0x00ca
        L_0x0087:
            java.lang.String r12 = "addToCart"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 1
            goto L_0x00ca
        L_0x0091:
            java.lang.String r12 = "contentView"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 3
            goto L_0x00ca
        L_0x009b:
            boolean r12 = r11.equals(r2)
            if (r12 == 0) goto L_0x00c9
            r0 = 7
            goto L_0x00ca
        L_0x00a3:
            boolean r12 = r11.equals(r8)
            if (r12 == 0) goto L_0x00c9
            r0 = 4
            goto L_0x00ca
        L_0x00ab:
            java.lang.String r12 = "rating"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 6
            goto L_0x00ca
        L_0x00b5:
            boolean r12 = r11.equals(r9)
            if (r12 == 0) goto L_0x00c9
            r0 = 9
            goto L_0x00ca
        L_0x00be:
            java.lang.String r12 = "levelEnd"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 11
            goto L_0x00ca
        L_0x00c9:
            r0 = -1
        L_0x00ca:
            switch(r0) {
                case 0: goto L_0x00eb;
                case 1: goto L_0x00e8;
                case 2: goto L_0x00e5;
                case 3: goto L_0x00e2;
                case 4: goto L_0x00e1;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00dd;
                case 7: goto L_0x00da;
                case 8: goto L_0x00d9;
                case 9: goto L_0x00d8;
                case 10: goto L_0x00d5;
                case 11: goto L_0x00d2;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            java.lang.String r11 = r10.m15044(r11)
            return r11
        L_0x00d2:
            java.lang.String r11 = "level_end"
            return r11
        L_0x00d5:
            java.lang.String r11 = "level_start"
            return r11
        L_0x00d8:
            return r9
        L_0x00d9:
            return r6
        L_0x00da:
            java.lang.String r11 = "sign_up"
            return r11
        L_0x00dd:
            java.lang.String r11 = "rate_content"
            return r11
        L_0x00e0:
            return r7
        L_0x00e1:
            return r8
        L_0x00e2:
            java.lang.String r11 = "select_content"
            return r11
        L_0x00e5:
            java.lang.String r11 = "begin_checkout"
            return r11
        L_0x00e8:
            java.lang.String r11 = "add_to_cart"
            return r11
        L_0x00eb:
            java.lang.String r11 = "ecommerce_purchase"
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2902.m15051(java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private Bundle m15052(C0496 r13) {
        Bundle bundle = new Bundle();
        if ("purchase".equals(r13.f4170)) {
            m15046(bundle, "item_id", (String) r13.f4167.get("itemId"));
            m15046(bundle, "item_name", (String) r13.f4167.get("itemName"));
            m15046(bundle, "item_category", (String) r13.f4167.get("itemType"));
            m15045(bundle, "value", m15043(r13.f4167.get("itemPrice")));
            m15046(bundle, "currency", (String) r13.f4167.get("currency"));
        } else if ("addToCart".equals(r13.f4170)) {
            m15046(bundle, "item_id", (String) r13.f4167.get("itemId"));
            m15046(bundle, "item_name", (String) r13.f4167.get("itemName"));
            m15046(bundle, "item_category", (String) r13.f4167.get("itemType"));
            m15045(bundle, "price", m15043(r13.f4167.get("itemPrice")));
            m15045(bundle, "value", m15043(r13.f4167.get("itemPrice")));
            m15046(bundle, "currency", (String) r13.f4167.get("currency"));
            bundle.putLong("quantity", 1);
        } else if ("startCheckout".equals(r13.f4170)) {
            m15049(bundle, "quantity", Long.valueOf((long) ((Integer) r13.f4167.get("itemCount")).intValue()));
            m15045(bundle, "value", m15043(r13.f4167.get("totalPrice")));
            m15046(bundle, "currency", (String) r13.f4167.get("currency"));
        } else if ("contentView".equals(r13.f4170)) {
            m15046(bundle, "content_type", (String) r13.f4167.get("contentType"));
            m15046(bundle, "item_id", (String) r13.f4167.get("contentId"));
            m15046(bundle, "item_name", (String) r13.f4167.get("contentName"));
        } else if ("search".equals(r13.f4170)) {
            m15046(bundle, "search_term", (String) r13.f4167.get("query"));
        } else if ("share".equals(r13.f4170)) {
            m15046(bundle, f13509, (String) r13.f4167.get(f13509));
            m15046(bundle, "content_type", (String) r13.f4167.get("contentType"));
            m15046(bundle, "item_id", (String) r13.f4167.get("contentId"));
            m15046(bundle, "item_name", (String) r13.f4167.get("contentName"));
        } else if (f13505.equals(r13.f4170)) {
            m15046(bundle, f13505, String.valueOf(r13.f4167.get(f13505)));
            m15046(bundle, "content_type", (String) r13.f4167.get("contentType"));
            m15046(bundle, "item_id", (String) r13.f4167.get("contentId"));
            m15046(bundle, "item_name", (String) r13.f4167.get("contentName"));
        } else if ("signUp".equals(r13.f4170)) {
            m15046(bundle, f13509, (String) r13.f4167.get(f13509));
        } else if ("login".equals(r13.f4170)) {
            m15046(bundle, f13509, (String) r13.f4167.get(f13509));
        } else if ("invite".equals(r13.f4170)) {
            m15046(bundle, f13509, (String) r13.f4167.get(f13509));
        } else if ("levelStart".equals(r13.f4170)) {
            m15046(bundle, f13506, (String) r13.f4167.get("levelName"));
        } else if ("levelEnd".equals(r13.f4170)) {
            m15045(bundle, "score", m15047(r13.f4167.get("score")));
            m15046(bundle, f13506, (String) r13.f4167.get("levelName"));
            m15048(bundle, f13508, m15053((String) r13.f4167.get(f13508)));
        }
        m15054(bundle, r13.f4172);
        return bundle;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m15049(Bundle bundle, String str, Long l) {
        if (l != null) {
            bundle.putLong(str, l.longValue());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m15048(Bundle bundle, String str, Integer num) {
        if (num != null) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m15046(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m15045(Bundle bundle, String str, Double d) {
        Double r5 = m15047((Object) d);
        if (r5 != null) {
            bundle.putDouble(str, r5.doubleValue());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private Double m15047(Object obj) {
        return Double.valueOf(String.valueOf(obj));
    }

    /* renamed from: ι  reason: contains not printable characters */
    private Integer m15053(String str) {
        if (str == null) {
            return null;
        }
        return Integer.valueOf(str.equals("true") ? 1 : 0);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private Double m15043(Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            return null;
        }
        return Double.valueOf(new BigDecimal(l.longValue()).divide(C2568.f11686).doubleValue());
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m15054(Bundle bundle, Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            String r2 = m15050((String) next.getKey());
            if (value instanceof String) {
                bundle.putString(r2, next.getValue().toString());
            } else if (value instanceof Double) {
                bundle.putDouble(r2, ((Double) next.getValue()).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(r2, ((Long) next.getValue()).longValue());
            } else if (value instanceof Integer) {
                bundle.putInt(r2, ((Integer) next.getValue()).intValue());
            }
        }
    }
}
