package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class bT {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Map<Character, Character> f1702;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final String f1703;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final Logger f1704 = Logger.getLogger(bT.class.getName());

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final String f1705;

    /* renamed from: Ι  reason: contains not printable characters */
    static final Pattern f1706 = Pattern.compile("[+＋]+");

    /* renamed from: ι  reason: contains not printable characters */
    private static final String f1707;

    /* renamed from: І  reason: contains not printable characters */
    private static final Pattern f1708 = Pattern.compile("\\(?\\$1\\)?");

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(52, "1");
        hashMap.put(54, "9");
        Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        f1702 = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(f1702);
        hashMap4.putAll(hashMap2);
        Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character charValue : f1702.keySet()) {
            char charValue2 = charValue.charValue();
            hashMap6.put(Character.valueOf(Character.toLowerCase(charValue2)), Character.valueOf(charValue2));
            hashMap6.put(Character.valueOf(charValue2), Character.valueOf(charValue2));
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put(65293, '-');
        hashMap6.put(8208, '-');
        hashMap6.put(8209, '-');
        hashMap6.put(8210, '-');
        hashMap6.put(8211, '-');
        hashMap6.put(8212, '-');
        hashMap6.put(8213, '-');
        hashMap6.put(8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put(65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put(12288, ' ');
        hashMap6.put(8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put(65294, '.');
        Collections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(f1702.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(f1702.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        f1705 = sb.toString();
        Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
        Pattern.compile("(\\p{Nd})");
        Pattern.compile("[+＋\\p{Nd}]");
        Pattern.compile("[\\\\/] *x");
        Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        StringBuilder sb2 = new StringBuilder("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*");
        sb2.append(f1705);
        sb2.append("\\p{Nd}]*");
        f1707 = sb2.toString();
        String concat = ",;".concat("xｘ#＃~～");
        StringBuilder sb3 = new StringBuilder(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[");
        sb3.append(concat);
        sb3.append("]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#");
        f1703 = sb3.toString();
        StringBuilder sb4 = new StringBuilder("(?:");
        sb4.append(f1703);
        sb4.append(")$");
        Pattern.compile(sb4.toString(), 66);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(f1707);
        sb5.append("(?:");
        sb5.append(f1703);
        sb5.append(")?");
        Pattern.compile(sb5.toString(), 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean m1720(String str) {
        return str.length() == 0 || f1708.matcher(str).matches();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map, java.lang.StringBuilder] */
    /* renamed from: ɩ  reason: contains not printable characters */
    static int m1721(StringBuilder sb) {
        ? r0 = 0;
        if (!(r0.length() == 0 || r0.charAt(0) == '0')) {
            int length = r0.length();
            int i = 1;
            while (i <= 3 && i <= length) {
                int parseInt = Integer.parseInt(r0.substring(0, i));
                if (r0.containsKey(Integer.valueOf(parseInt))) {
                    sb.append(r0.substring(i));
                    return parseInt;
                }
                i++;
            }
        }
        return 0;
    }
}
