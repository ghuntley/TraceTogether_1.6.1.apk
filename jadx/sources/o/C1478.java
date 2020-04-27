package o;

import java.util.HashMap;

/* renamed from: o.ɺΙ  reason: contains not printable characters */
class C1478 implements C1504 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f7937;

    public C1478() {
        this(1);
    }

    public C1478(int i) {
        this.f7937 = i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public StackTraceElement[] m8850(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] r0 = m8849(stackTraceElementArr, this.f7937);
        return r0.length < stackTraceElementArr.length ? r0 : stackTraceElementArr;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static StackTraceElement[] m8849(StackTraceElement[] stackTraceElementArr, int i) {
        int i2;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num == null || !m8848(stackTraceElementArr, num.intValue(), i3)) {
                stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                i4++;
                i2 = i3;
                i5 = 1;
            } else {
                int intValue = i3 - num.intValue();
                if (i5 < i) {
                    System.arraycopy(stackTraceElementArr, i3, stackTraceElementArr2, i4, intValue);
                    i4 += intValue;
                    i5++;
                }
                i2 = (intValue - 1) + i3;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i3));
            i3 = i2 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, stackTraceElementArr3.length);
        return stackTraceElementArr3;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean m8848(StackTraceElement[] stackTraceElementArr, int i, int i2) {
        int i3 = i2 - i;
        if (i2 + i3 > stackTraceElementArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!stackTraceElementArr[i + i4].equals(stackTraceElementArr[i2 + i4])) {
                return false;
            }
        }
        return true;
    }
}
