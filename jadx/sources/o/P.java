package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class P {

    /* renamed from: ı  reason: contains not printable characters */
    public static final String f1278 = System.getProperty("line.separator");

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Map<Character, String> f1279;

    static {
        HashMap hashMap = new HashMap();
        f1279 = hashMap;
        hashMap.put('\'', "\\'");
        f1279.put('\"', "\\\"");
        f1279.put('\\', "\\\\");
        f1279.put('/', "\\/");
        f1279.put(8, "\\b");
        f1279.put(10, "\\n");
        f1279.put(9, "\\t");
        f1279.put(12, "\\f");
        f1279.put(13, "\\r");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m1406(String str) {
        return str != null && str.trim().length() > 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m1411(String... strArr) {
        if (strArr.length == 0) {
            return false;
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (true ^ (str != null && str.trim().length() > 0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static String m1407(String... strArr) {
        return m1410((List<String>) strArr == null ? null : Arrays.asList(strArr));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static String m1410(List<String> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str != null && str.trim().length() > 0) {
                sb.append(list.get(i));
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static String m1405(List<? extends Number> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Number number : list) {
                if (number != null) {
                    arrayList.add(number.toString());
                }
            }
        } else {
            arrayList = null;
        }
        return m1410((List<String>) arrayList);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m1409(String str) {
        return !(str != null && str.trim().length() > 0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static List<String> m1408(String str) {
        if (!(str != null && str.trim().length() > 0)) {
            return O.m1395(new ArrayList(0));
        }
        String[] split = str.split(",");
        ArrayList arrayList = new ArrayList();
        int length = split.length;
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            if (str2 != null && str2.trim().length() > 0) {
                arrayList.add(str2);
            }
        }
        return O.m1395(arrayList);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m1404(String str) {
        if (!(str != null && str.trim().length() > 0)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
