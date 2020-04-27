package o;

import android.app.ActivityManager;
import java.util.List;
import java.util.Map;
import o.aD;

/* renamed from: o.ɹɍ  reason: contains not printable characters */
class C1464 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C0754 f7889 = C0754.m6006(f7890);

    /* renamed from: Ι  reason: contains not printable characters */
    private static final String f7890 = "0";

    /* renamed from: ι  reason: contains not printable characters */
    private static final C0754 f7891 = C0754.m6006("Unity");

    private C1464() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m8788(C0872 r1, String str, String str2, long j) {
        r1.m6531(1, C0754.m6006(str2));
        r1.m6531(2, C0754.m6006(str));
        r1.m6495(3, j);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m8773(C0872 r8, String str, String str2, String str3, String str4, String str5, int i, String str6) {
        C0754 r9 = C0754.m6006(str);
        C0754 r10 = C0754.m6006(str2);
        C0754 r11 = C0754.m6006(str3);
        C0754 r12 = C0754.m6006(str4);
        C0754 r13 = C0754.m6006(str5);
        C0754 r15 = str6 != null ? C0754.m6006(str6) : null;
        r8.m6517(7, 2);
        r8.m6518(m8762(r9, r10, r11, r12, r13, i, r15));
        r8.m6531(1, r9);
        r8.m6531(2, r11);
        r8.m6531(3, r12);
        r8.m6517(5, 2);
        r8.m6518(m8780(r10));
        r8.m6531(1, r10);
        r8.m6531(6, r13);
        if (r15 != null) {
            r8.m6531(8, f7891);
            r8.m6531(9, r15);
        }
        r8.m6529(10, i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m8774(C0872 r3, String str, String str2, boolean z) {
        C0754 r4 = C0754.m6006(str);
        C0754 r5 = C0754.m6006(str2);
        r3.m6517(8, 2);
        r3.m6518(m8763(r4, r5, z));
        r3.m6529(1, 3);
        r3.m6531(2, r4);
        r3.m6531(3, r5);
        r3.m6513(4, z);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m8771(C0872 r16, int i, String str, int i2, long j, long j2, boolean z, Map<aD.C0107, String> map, int i3, String str2, String str3) {
        C0872 r0 = r16;
        C0754 r13 = m8783(str);
        C0754 r14 = m8783(str3);
        C0754 r15 = m8783(str2);
        r0.m6517(9, 2);
        C0754 r18 = r15;
        r0.m6518(m8766(i, r13, i2, j, j2, z, map, i3, r15, r14));
        r0.m6529(3, i);
        r0.m6531(4, r13);
        r0.m6494(5, i2);
        r0.m6495(6, j);
        r0.m6495(7, j2);
        r0.m6513(10, z);
        for (Map.Entry next : map.entrySet()) {
            r0.m6517(11, 2);
            r0.m6518(m8760((aD.C0107) next.getKey(), (String) next.getValue()));
            r0.m6529(1, ((aD.C0107) next.getKey()).f1409);
            r0.m6531(2, C0754.m6006((String) next.getValue()));
        }
        r0.m6494(12, i3);
        if (r18 != null) {
            r0.m6531(13, r18);
        }
        if (r14 != null) {
            r0.m6531(14, r14);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m8772(C0872 r7, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        C0754 r8 = C0754.m6006(str);
        C0754 r0 = m8783(str2);
        C0754 r1 = m8783(str3);
        int r3 = C0872.m6465(1, r8) + 0;
        if (str2 != null) {
            r3 += C0872.m6465(2, r0);
        }
        if (str3 != null) {
            r3 += C0872.m6465(3, r1);
        }
        r7.m6517(6, 2);
        r7.m6518(r3);
        r7.m6531(1, r8);
        if (str2 != null) {
            r7.m6531(2, r0);
        }
        if (str3 != null) {
            r7.m6531(3, r1);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m8784(C0872 r35, long j, String str, C1500 r39, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, Map<String, String> map, C1163 r45, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i, String str2, String str3, Float f, int i2, boolean z, long j2, long j3) {
        C0754 r0;
        C0872 r12 = r35;
        String str4 = str3;
        C0754 r7 = C0754.m6006(str2);
        if (str4 == null) {
            r0 = null;
        } else {
            r0 = C0754.m6006(str4.replace("-", ""));
        }
        C0754 r8 = r0;
        C0754 r11 = r45.m7649();
        if (r11 == null) {
            C3263ac.m1563();
        }
        r45.m7653();
        r12.m6517(10, 2);
        r12.m6518(m8777(j, str, r39, thread, stackTraceElementArr, threadArr, list, 8, map, runningAppProcessInfo, i, r7, r8, f, i2, z, j2, j3, r11));
        r12.m6495(1, j);
        r12.m6531(2, C0754.m6006(str));
        m8765(r35, r39, thread, stackTraceElementArr, threadArr, list, 8, r7, r8, map, runningAppProcessInfo, i);
        m8785(r35, f, i2, z, i, j2, j3);
        m8782(r12, r11);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m8765(C0872 r2, C1500 r3, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C0754 r9, C0754 r10, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) {
        r2.m6517(3, 2);
        r2.m6518(m8781(r3, thread, stackTraceElementArr, threadArr, list, i, r9, r10, map, runningAppProcessInfo, i2));
        m8776(r2, r3, thread, stackTraceElementArr, threadArr, list, i, r9, r10);
        if (map != null && !map.isEmpty()) {
            m8790(r2, map);
        }
        if (runningAppProcessInfo != null) {
            r2.m6513(3, runningAppProcessInfo.importance != 100);
        }
        r2.m6494(4, i2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m8776(C0872 r6, C1500 r7, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C0754 r13, C0754 r14) {
        r6.m6517(1, 2);
        r6.m6518(m8769(r7, thread, stackTraceElementArr, threadArr, list, i, r13, r14));
        m8789(r6, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            m8789(r6, threadArr[i2], list.get(i2), 0, false);
        }
        m8775(r6, r7, 1, i, 2);
        r6.m6517(3, 2);
        r6.m6518(m8786());
        r6.m6531(1, f7889);
        r6.m6531(2, f7889);
        r6.m6495(3, 0);
        r6.m6517(4, 2);
        r6.m6518(m8761(r13, r14));
        r6.m6495(1, 0);
        r6.m6495(2, 0);
        r6.m6531(3, r13);
        if (r14 != null) {
            r6.m6531(4, r14);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m8790(C0872 r4, Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            r4.m6517(2, 2);
            r4.m6518(m8779((String) next.getKey(), (String) next.getValue()));
            r4.m6531(1, C0754.m6006((String) next.getKey()));
            String str = (String) next.getValue();
            if (str == null) {
                str = "";
            }
            r4.m6531(2, C0754.m6006(str));
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m8775(C0872 r6, C1500 r7, int i, int i2, int i3) {
        while (true) {
            r6.m6517(i3, 2);
            r6.m6518(m8764(r7, 1, i2));
            r6.m6531(1, C0754.m6006(r7.f8003));
            String str = r7.f8004;
            if (str != null) {
                r6.m6531(3, C0754.m6006(str));
            }
            int i4 = 0;
            for (StackTraceElement r4 : r7.f8005) {
                m8770(r6, 4, r4, true);
            }
            r7 = r7.f8002;
            if (r7 == null) {
                return;
            }
            if (i < i2) {
                i++;
                i3 = 6;
            } else {
                while (r7 != null) {
                    r7 = r7.f8002;
                    i4++;
                }
                r6.m6494(7, i4);
                return;
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m8789(C0872 r3, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        r3.m6517(1, 2);
        r3.m6518(m8768(thread, stackTraceElementArr, i, z));
        r3.m6531(1, C0754.m6006(thread.getName()));
        r3.m6494(2, i);
        for (StackTraceElement r0 : stackTraceElementArr) {
            m8770(r3, 3, r0, z);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m8770(C0872 r5, int i, StackTraceElement stackTraceElement, boolean z) {
        r5.m6517(i, 2);
        r5.m6518(m8778(stackTraceElement, z));
        if (stackTraceElement.isNativeMethod()) {
            r5.m6495(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            r5.m6495(1, 0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        r5.m6531(2, C0754.m6006(sb.toString()));
        if (stackTraceElement.getFileName() != null) {
            r5.m6531(3, C0754.m6006(stackTraceElement.getFileName()));
        }
        int i2 = 4;
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            r5.m6495(4, (long) stackTraceElement.getLineNumber());
        }
        if (!z) {
            i2 = 0;
        }
        r5.m6494(5, i2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m8785(C0872 r3, Float f, int i, boolean z, int i2, long j, long j2) {
        r3.m6517(5, 2);
        r3.m6518(m8767(f, i, z, i2, j, j2));
        if (f != null) {
            r3.m6522(1, f.floatValue());
        }
        r3.m6534(2, i);
        r3.m6513(3, z);
        r3.m6494(4, i2);
        r3.m6495(5, j);
        r3.m6495(6, j2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m8782(C0872 r2, C0754 r3) {
        if (r3 != null) {
            r2.m6517(6, 2);
            r2.m6518(m8787(r3));
            r2.m6531(1, r3);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m8762(C0754 r1, C0754 r2, C0754 r3, C0754 r4, C0754 r5, int i, C0754 r7) {
        int r22 = m8780(r2);
        int r12 = C0872.m6465(1, r1) + 0 + C0872.m6465(2, r3) + C0872.m6465(3, r4) + C0872.m6462(5) + C0872.m6484(r22) + r22 + C0872.m6465(6, r5);
        if (r7 != null) {
            r12 = r12 + C0872.m6465(8, f7891) + C0872.m6465(9, r7);
        }
        return r12 + C0872.m6453(10, i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int m8780(C0754 r1) {
        return C0872.m6465(1, r1) + 0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m8763(C0754 r3, C0754 r4, boolean z) {
        return C0872.m6453(1, 3) + 0 + C0872.m6465(2, r3) + C0872.m6465(3, r4) + C0872.m6477(4, z);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m8760(aD.C0107 r1, String str) {
        return C0872.m6453(1, r1.f1409) + C0872.m6465(2, C0754.m6006(str));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m8766(int i, C0754 r3, int i2, long j, long j2, boolean z, Map<aD.C0107, String> map, int i3, C0754 r12, C0754 r13) {
        int i4;
        int i5;
        int i6 = 0;
        int r2 = C0872.m6453(3, i) + 0;
        if (r3 == null) {
            i4 = 0;
        } else {
            i4 = C0872.m6465(4, r3);
        }
        int r22 = r2 + i4 + C0872.m6469(5, i2) + C0872.m6454(6, j) + C0872.m6454(7, j2) + C0872.m6477(10, z);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                int r4 = m8760((aD.C0107) next.getKey(), (String) next.getValue());
                r22 += C0872.m6462(11) + C0872.m6484(r4) + r4;
            }
        }
        int r23 = r22 + C0872.m6469(12, i3);
        if (r12 == null) {
            i5 = 0;
        } else {
            i5 = C0872.m6465(13, r12);
        }
        int i7 = r23 + i5;
        if (r13 != null) {
            i6 = C0872.m6465(14, r13);
        }
        return i7 + i6;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m8761(C0754 r4, C0754 r5) {
        int r2 = C0872.m6454(1, 0) + 0 + C0872.m6454(2, 0) + C0872.m6465(3, r4);
        return r5 != null ? r2 + C0872.m6465(4, r5) : r2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int m8777(long j, String str, C1500 r15, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2, C0754 r24, C0754 r25, Float f, int i3, boolean z, long j2, long j3, C0754 r33) {
        long j4 = j;
        int r0 = C0872.m6454(1, j) + 0 + C0872.m6465(2, C0754.m6006(str));
        int r1 = m8781(r15, thread, stackTraceElementArr, threadArr, list, i, r24, r25, map, runningAppProcessInfo, i2);
        int r12 = m8767(f, i3, z, i2, j2, j3);
        int r02 = r0 + C0872.m6462(3) + C0872.m6484(r1) + r1 + C0872.m6462(5) + C0872.m6484(r12) + r12;
        if (r33 == null) {
            return r02;
        }
        int r13 = m8787(r33);
        return r02 + C0872.m6462(6) + C0872.m6484(r13) + r13;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int m8781(C1500 r0, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C0754 r6, C0754 r7, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int r02 = m8769(r0, thread, stackTraceElementArr, threadArr, list, i, r6, r7);
        int r2 = C0872.m6462(1) + C0872.m6484(r02) + r02;
        boolean z = false;
        int i3 = r2 + 0;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                int r4 = m8779((String) next.getKey(), (String) next.getValue());
                i3 += C0872.m6462(2) + C0872.m6484(r4) + r4;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z = true;
            }
            i3 += C0872.m6477(3, z);
        }
        return i3 + C0872.m6469(4, i2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m8769(C1500 r6, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C0754 r12, C0754 r13) {
        int r7 = m8768(thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        int r2 = C0872.m6462(1) + C0872.m6484(r7) + r7 + 0;
        for (int i2 = 0; i2 < length; i2++) {
            int r3 = m8768(threadArr[i2], list.get(i2), 0, false);
            r2 += C0872.m6462(1) + C0872.m6484(r3) + r3;
        }
        int r62 = m8764(r6, 1, i);
        int r63 = m8786();
        int r64 = m8761(r12, r13);
        return r2 + C0872.m6462(2) + C0872.m6484(r62) + r62 + C0872.m6462(3) + C0872.m6484(r63) + r63 + C0872.m6462(3) + C0872.m6484(r64) + r64;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int m8779(String str, String str2) {
        int r1 = C0872.m6465(1, C0754.m6006(str));
        if (str2 == null) {
            str2 = "";
        }
        return r1 + C0872.m6465(2, C0754.m6006(str2));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m8767(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            i3 = 0 + C0872.m6458(1, f.floatValue());
        }
        return i3 + C0872.m6467(2, i) + C0872.m6477(3, z) + C0872.m6469(4, i2) + C0872.m6454(5, j) + C0872.m6454(6, j2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static int m8787(C0754 r1) {
        return C0872.m6465(1, r1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m8764(C1500 r9, int i, int i2) {
        int i3 = 0;
        int r0 = C0872.m6465(1, C0754.m6006(r9.f8003)) + 0;
        String str = r9.f8004;
        if (str != null) {
            r0 += C0872.m6465(3, C0754.m6006(str));
        }
        int i4 = r0;
        for (StackTraceElement r6 : r9.f8005) {
            int r62 = m8778(r6, true);
            i4 += C0872.m6462(4) + C0872.m6484(r62) + r62;
        }
        C1500 r92 = r9.f8002;
        if (r92 == null) {
            return i4;
        }
        if (i < i2) {
            int r93 = m8764(r92, i + 1, i2);
            return i4 + C0872.m6462(6) + C0872.m6484(r93) + r93;
        }
        while (r92 != null) {
            r92 = r92.f8002;
            i3++;
        }
        return i4 + C0872.m6469(7, i3);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static int m8786() {
        return C0872.m6465(1, f7889) + 0 + C0872.m6465(2, f7889) + C0872.m6454(3, 0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int m8778(StackTraceElement stackTraceElement, boolean z) {
        int i;
        int i2 = 0;
        if (stackTraceElement.isNativeMethod()) {
            i = C0872.m6454(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            i = C0872.m6454(1, 0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        int r0 = i + 0 + C0872.m6465(2, C0754.m6006(sb.toString()));
        if (stackTraceElement.getFileName() != null) {
            r0 += C0872.m6465(3, C0754.m6006(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            r0 += C0872.m6454(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i2 = 2;
        }
        return r0 + C0872.m6469(5, i2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m8768(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int r4 = C0872.m6465(1, C0754.m6006(thread.getName())) + C0872.m6469(2, i);
        for (StackTraceElement r1 : stackTraceElementArr) {
            int r12 = m8778(r1, z);
            r4 += C0872.m6462(3) + C0872.m6484(r12) + r12;
        }
        return r4;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static C0754 m8783(String str) {
        if (str == null) {
            return null;
        }
        return C0754.m6006(str);
    }
}
