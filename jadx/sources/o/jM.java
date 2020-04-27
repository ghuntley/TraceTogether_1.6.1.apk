package o;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class jM implements Serializable, Comparable<jM> {

    /* renamed from: ı  reason: contains not printable characters */
    private static char[] f2422 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: Ι  reason: contains not printable characters */
    public static final jM f2423 = new jM((byte[]) new byte[0].clone());

    /* renamed from: ǃ  reason: contains not printable characters */
    transient int f2424;

    /* renamed from: ɩ  reason: contains not printable characters */
    private transient String f2425;

    /* renamed from: ι  reason: contains not printable characters */
    final byte[] f2426;

    public /* synthetic */ int compareTo(Object obj) {
        jM jMVar = (jM) obj;
        int r0 = m2967();
        int r1 = jMVar.m2967();
        int min = Math.min(r0, r1);
        for (int i = 0; i < min; i++) {
            byte r7 = m2956(i) & 255;
            byte r8 = jMVar.m2956(i) & 255;
            if (r7 != r8) {
                return r7 < r8 ? -1 : 1;
            }
        }
        if (r0 == r1) {
            return 0;
        }
        return r0 < r1 ? -1 : 1;
    }

    public jM(byte[] bArr) {
        this.f2426 = bArr;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static jM m2947(byte... bArr) {
        if (bArr != null) {
            return new jM((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static jM m2946(String str) {
        if (str != null) {
            jM jMVar = new jM(str.getBytes(jX.f2464));
            jMVar.f2425 = str;
            return jMVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static jM m2950(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        } else if (charset != null) {
            return new jM(str.getBytes(charset));
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public String m2961() {
        String str = this.f2425;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f2426, jX.f2464);
        this.f2425 = str2;
        return str2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public String m2957() {
        return jD.m2821(this.f2426);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public jM m2953() {
        return m2949("MD5");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public jM m2959() {
        return m2949("SHA-1");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public jM m2964() {
        return m2949("SHA-256");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private jM m2949(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(str).digest(this.f2426);
            if (digest != null) {
                return new jM((byte[]) digest.clone());
            }
            throw new IllegalArgumentException("data == null");
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static jM m2951(String str) {
        if (str != null) {
            byte[] r1 = jD.m2823(str);
            if (r1 != null) {
                return new jM(r1);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    /* renamed from: І  reason: contains not printable characters */
    public String m2965() {
        byte[] bArr = this.f2426;
        char[] cArr = new char[(bArr.length << 1)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f2422;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static jM m2952(String str) {
        if (str.length() % 2 == 0) {
            byte[] bArr = new byte[(str.length() / 2)];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = i << 1;
                bArr[i] = (byte) ((m2948(str.charAt(i2)) << 4) + m2948(str.charAt(i2 + 1)));
            }
            return new jM((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m2948(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c)));
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public jM m2955() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f2426;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new jM(bArr2);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public jM m2962(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f2426;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f2426, i, bArr2, 0, i3);
                    return new jM(bArr2);
                }
            } else {
                StringBuilder sb = new StringBuilder("endIndex > length(");
                sb.append(this.f2426.length);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public byte m2956(int i) {
        return this.f2426[i];
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public int m2967() {
        return this.f2426.length;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public byte[] m2960() {
        return (byte[]) this.f2426.clone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public byte[] m2966() {
        return this.f2426;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m2958(jH jHVar) {
        byte[] bArr = this.f2426;
        jHVar.m2840(bArr, 0, bArr.length);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m2963(int i, jM jMVar, int i2, int i3) {
        return jMVar.m2954(0, this.f2426, 0, i3);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m2954(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f2426;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && jX.m3052(bArr2, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jM) {
            jM jMVar = (jM) obj;
            int r1 = jMVar.m2967();
            byte[] bArr = this.f2426;
            return r1 == bArr.length && jMVar.m2954(0, bArr, 0, bArr.length);
        }
    }

    public int hashCode() {
        int i = this.f2424;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f2426);
        this.f2424 = hashCode;
        return hashCode;
    }

    public String toString() {
        if (this.f2426.length == 0) {
            return "[size=0]";
        }
        String r0 = m2961();
        int length = r0.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = r0.length();
                break;
            } else if (i2 == 64) {
                break;
            } else {
                int codePointAt = r0.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            }
        }
        i = -1;
        if (i != -1) {
            String replace = r0.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < r0.length()) {
                StringBuilder sb = new StringBuilder("[size=");
                sb.append(this.f2426.length);
                sb.append(" text=");
                sb.append(replace);
                sb.append("…]");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("[text=");
            sb2.append(replace);
            sb2.append("]");
            return sb2.toString();
        } else if (this.f2426.length <= 64) {
            StringBuilder sb3 = new StringBuilder("[hex=");
            sb3.append(m2965());
            sb3.append("]");
            return sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder("[size=");
            sb4.append(this.f2426.length);
            sb4.append(" hex=");
            sb4.append(m2962(0, 64).m2965());
            sb4.append("…]");
            return sb4.toString();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            jM jMVar = new jM(bArr);
            try {
                Field declaredField = jM.class.getDeclaredField("ι");
                declaredField.setAccessible(true);
                declaredField.set(this, jMVar.f2426);
            } catch (NoSuchFieldException unused) {
                throw new AssertionError();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(readInt)));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f2426.length);
        objectOutputStream.write(this.f2426);
    }
}
