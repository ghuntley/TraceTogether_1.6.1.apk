package o;

import o.C2745;

/* renamed from: o.ǃƾ  reason: contains not printable characters */
public final class C0895 {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[Catch:{ IOException | ClassNotFoundException -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c A[Catch:{ IOException | ClassNotFoundException -> 0x0040 }] */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m6645(java.lang.Object r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0032 }
            r2.<init>(r1)     // Catch:{ all -> 0x0032 }
            r2.writeObject(r4)     // Catch:{ all -> 0x002f }
            r2.flush()     // Catch:{ all -> 0x002f }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ all -> 0x002f }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x002f }
            byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x002f }
            r3.<init>(r1)     // Catch:{ all -> 0x002f }
            r4.<init>(r3)     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r4.readObject()     // Catch:{ all -> 0x002d }
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
            return r1
        L_0x002d:
            r1 = move-exception
            goto L_0x0035
        L_0x002f:
            r1 = move-exception
            r4 = r0
            goto L_0x0035
        L_0x0032:
            r1 = move-exception
            r4 = r0
            r2 = r4
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x003a:
            if (r4 == 0) goto L_0x003f
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x003f:
            throw r1     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0895.m6645(java.lang.Object):java.lang.Object");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static String m6644(String str, String[] strArr, String[] strArr2) {
        C2745.C2746.m14555(strArr);
        C2745.C2746.m14555(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i];
            }
        }
        return null;
    }
}
