package o;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o.ŀɩ  reason: contains not printable characters */
final class C0504 {

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final Pattern f4203 = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: ı  reason: contains not printable characters */
    final ArrayList<String> f4204 = new ArrayList<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    final boolean f4205;

    /* renamed from: ɩ  reason: contains not printable characters */
    final boolean f4206;

    /* renamed from: Ι  reason: contains not printable characters */
    final Map<String, C0505> f4207 = new HashMap();

    /* renamed from: ι  reason: contains not printable characters */
    final Pattern f4208;

    C0504(String str) {
        String str2 = str;
        Uri parse = Uri.parse(str);
        int i = 1;
        this.f4206 = parse.getQuery() != null;
        StringBuilder sb = new StringBuilder("^");
        if (!f4203.matcher(str2).find()) {
            sb.append("http[s]?://");
        }
        Pattern compile = Pattern.compile("\\{(.+?)\\}");
        if (this.f4206) {
            Matcher matcher = Pattern.compile("(\\?)").matcher(str2);
            if (matcher.find()) {
                m4906(str2.substring(0, matcher.start()), sb, compile);
            }
            this.f4205 = false;
            for (String next : parse.getQueryParameterNames()) {
                StringBuilder sb2 = new StringBuilder();
                String queryParameter = parse.getQueryParameter(next);
                Matcher matcher2 = compile.matcher(queryParameter);
                C0505 r13 = new C0505();
                int i2 = 0;
                while (matcher2.find()) {
                    r13.f4210.add(matcher2.group(i));
                    sb2.append(Pattern.quote(queryParameter.substring(i2, matcher2.start())));
                    sb2.append("(.+?)?");
                    i2 = matcher2.end();
                    i = 1;
                }
                if (i2 < queryParameter.length()) {
                    sb2.append(Pattern.quote(queryParameter.substring(i2)));
                }
                r13.f4209 = sb2.toString().replace(".*", "\\E.*\\Q");
                this.f4207.put(next, r13);
                i = 1;
            }
        } else {
            this.f4205 = m4906(str2, sb, compile);
        }
        this.f4208 = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m4906(java.lang.String r7, java.lang.StringBuilder r8, java.util.regex.Pattern r9) {
        /*
            r6 = this;
            java.util.regex.Matcher r9 = r9.matcher(r7)
            java.lang.String r0 = ".*"
            boolean r0 = r7.contains(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0014
            r3 = r6
            r0 = r7
            r4 = r8
            r7 = 1
            r8 = 0
            goto L_0x001d
        L_0x0014:
            r0 = r6
            r3 = r8
            r8 = r7
            r7 = 0
        L_0x0018:
            r4 = r3
            r3 = r0
            r0 = r8
            r8 = r7
            r7 = 0
        L_0x001d:
            boolean r5 = r9.find()
            if (r5 == 0) goto L_0x0048
            java.lang.String r7 = r9.group(r1)
            java.util.ArrayList<java.lang.String> r5 = r3.f4204
            r5.add(r7)
            int r7 = r9.start()
            java.lang.String r7 = r0.substring(r8, r7)
            java.lang.String r7 = java.util.regex.Pattern.quote(r7)
            r4.append(r7)
            java.lang.String r7 = "(.+?)"
            r4.append(r7)
            int r7 = r9.end()
            r8 = r0
            r0 = r3
            r3 = r4
            goto L_0x0018
        L_0x0048:
            int r9 = r0.length()
            if (r8 >= r9) goto L_0x0059
            java.lang.String r8 = r0.substring(r8)
            java.lang.String r8 = java.util.regex.Pattern.quote(r8)
            r4.append(r8)
        L_0x0059:
            java.lang.String r8 = "($|(\\?(.)*))"
            r4.append(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0504.m4906(java.lang.String, java.lang.StringBuilder, java.util.regex.Pattern):boolean");
    }

    /* renamed from: o.ŀɩ$ı  reason: contains not printable characters */
    static class C0505 {

        /* renamed from: ı  reason: contains not printable characters */
        String f4209;

        /* renamed from: ɩ  reason: contains not printable characters */
        ArrayList<String> f4210 = new ArrayList<>();

        C0505() {
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static boolean m4907(Bundle bundle, String str, String str2, C0420 r3) {
        if (r3 != null) {
            C0686 r32 = r3.f3994;
            try {
                r32.m5566(bundle, str, r32.m5564(str2));
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        } else {
            bundle.putString(str, str2);
            return false;
        }
    }
}
