package o;

/* renamed from: o.ІȽ  reason: contains not printable characters */
final class C2236 {
    /* renamed from: Ι  reason: contains not printable characters */
    static String m11687(C0510 r5) {
        C2264 r0 = new C2264(r5);
        StringBuilder sb = new StringBuilder(r0.m12518());
        for (int i = 0; i < r0.m12518(); i++) {
            byte r2 = r0.m12517(i);
            if (r2 == 34) {
                sb.append("\\\"");
            } else if (r2 == 39) {
                sb.append("\\'");
            } else if (r2 != 92) {
                switch (r2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (r2 >= 32 && r2 <= 126) {
                            sb.append((char) r2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((r2 >>> 6) & 3) + 48));
                            sb.append((char) (((r2 >>> 3) & 7) + 48));
                            sb.append((char) ((r2 & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
