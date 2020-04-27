package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.ƨ  reason: contains not printable characters */
public final class C0763 {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static ColorStateList m6037(Resources resources, int i, Resources.Theme theme) {
        try {
            return m6040(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m6040(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000e
            r3 = 1
            if (r1 != r3) goto L_0x0004
        L_0x000e:
            if (r1 != r2) goto L_0x0015
            android.content.res.ColorStateList r4 = m6039(r4, r5, r0, r6)
            return r4
        L_0x0015:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0763.m6040(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static ColorStateList m6039(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m6041(resources, xmlPullParser, attributeSet, theme);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m6041(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            r0 = r19
            int r1 = r18.getDepth()
            r2 = 1
            int r1 = r1 + r2
            r3 = 20
            int[][] r4 = new int[r3][]
            int[] r3 = new int[r3]
            r5 = 0
            r6 = r3
            r3 = 0
        L_0x0011:
            int r7 = r18.next()
            if (r7 == r2) goto L_0x00b1
            int r8 = r18.getDepth()
            if (r8 >= r1) goto L_0x0020
            r9 = 3
            if (r7 == r9) goto L_0x00b1
        L_0x0020:
            r9 = 2
            if (r7 != r9) goto L_0x00aa
            if (r8 > r1) goto L_0x00aa
            java.lang.String r7 = r18.getName()
            java.lang.String r8 = "item"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00aa
            int[] r7 = o.C2864.C2865.f13354
            r8 = r17
            r9 = r20
            android.content.res.TypedArray r7 = m6042((android.content.res.Resources) r8, (android.content.res.Resources.Theme) r9, (android.util.AttributeSet) r0, (int[]) r7)
            int r10 = o.C2864.C2865.f13364
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r7.getColor(r10, r11)
            int r11 = o.C2864.C2865.f13348
            boolean r11 = r7.hasValue(r11)
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x0055
            int r11 = o.C2864.C2865.f13348
            float r12 = r7.getFloat(r11, r12)
            goto L_0x0063
        L_0x0055:
            int r11 = o.C2864.C2865.f13340
            boolean r11 = r7.hasValue(r11)
            if (r11 == 0) goto L_0x0063
            int r11 = o.C2864.C2865.f13340
            float r12 = r7.getFloat(r11, r12)
        L_0x0063:
            r7.recycle()
            int r7 = r19.getAttributeCount()
            int[] r11 = new int[r7]
            r13 = 0
            r14 = 0
        L_0x006e:
            if (r13 >= r7) goto L_0x0094
            int r15 = r0.getAttributeNameResource(r13)
            r2 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r2) goto L_0x0090
            r2 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r2) goto L_0x0090
            r2 = 2130968617(0x7f040029, float:1.7545893E38)
            if (r15 == r2) goto L_0x0090
            int r2 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r13, r5)
            if (r16 == 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            int r15 = -r15
        L_0x008d:
            r11[r14] = r15
            r14 = r2
        L_0x0090:
            int r13 = r13 + 1
            r2 = 1
            goto L_0x006e
        L_0x0094:
            int[] r2 = android.util.StateSet.trimStateSet(r11, r14)
            int r7 = m6038(r10, r12)
            int[] r6 = o.C0912.m6726(r6, r3, r7)
            java.lang.Object[] r2 = o.C0912.m6725(r4, r3, r2)
            r4 = r2
            int[][] r4 = (int[][]) r4
            int r3 = r3 + 1
            goto L_0x00ae
        L_0x00aa:
            r8 = r17
            r9 = r20
        L_0x00ae:
            r2 = 1
            goto L_0x0011
        L_0x00b1:
            int[] r0 = new int[r3]
            int[][] r1 = new int[r3][]
            java.lang.System.arraycopy(r6, r5, r0, r5, r3)
            java.lang.System.arraycopy(r4, r5, r1, r5, r3)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0763.m6041(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static TypedArray m6042(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int m6038(int i, float f) {
        return (i & 16777215) | (Math.round(((float) Color.alpha(i)) * f) << 24);
    }
}
