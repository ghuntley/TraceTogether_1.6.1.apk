package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C2745;
import o.C2864;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: o.ǃɨ  reason: contains not printable characters */
public class C0904 {

    /* renamed from: o.ǃɨ$ı  reason: contains not printable characters */
    public interface C0905 {
    }

    /* renamed from: o.ǃɨ$if  reason: invalid class name */
    public static final class Cif implements C0905 {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C2745.C2748 f5764;

        /* renamed from: Ι  reason: contains not printable characters */
        private final int f5765;

        /* renamed from: ι  reason: contains not printable characters */
        private final int f5766;

        public Cif(C2745.C2748 r1, int i, int i2) {
            this.f5764 = r1;
            this.f5766 = i;
            this.f5765 = i2;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2745.C2748 m6697() {
            return this.f5764;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m6698() {
            return this.f5766;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final int m6699() {
            return this.f5765;
        }
    }

    /* renamed from: o.ǃɨ$ǃ  reason: contains not printable characters */
    public static final class C0906 {

        /* renamed from: ı  reason: contains not printable characters */
        private int f5767;

        /* renamed from: ǃ  reason: contains not printable characters */
        private int f5768;

        /* renamed from: ɩ  reason: contains not printable characters */
        private String f5769;

        /* renamed from: Ι  reason: contains not printable characters */
        private final String f5770;

        /* renamed from: ι  reason: contains not printable characters */
        private boolean f5771;

        /* renamed from: І  reason: contains not printable characters */
        private int f5772;

        public C0906(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f5770 = str;
            this.f5768 = i;
            this.f5771 = z;
            this.f5769 = str2;
            this.f5767 = i2;
            this.f5772 = i3;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final String m6705() {
            return this.f5770;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final int m6704() {
            return this.f5768;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m6702() {
            return this.f5771;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final String m6700() {
            return this.f5769;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m6703() {
            return this.f5767;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public final int m6701() {
            return this.f5772;
        }
    }

    /* renamed from: o.ǃɨ$ɩ  reason: contains not printable characters */
    public static final class C0907 implements C0905 {

        /* renamed from: ι  reason: contains not printable characters */
        private final C0906[] f5773;

        public C0907(C0906[] r1) {
            this.f5773 = r1;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C0906[] m6706() {
            return this.f5773;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: ι  reason: contains not printable characters */
    public static o.C0904.C0905 m6696(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000a
            r2 = 1
            if (r0 != r2) goto L_0x0000
        L_0x000a:
            if (r0 != r1) goto L_0x0011
            o.ǃɨ$ı r3 = m6693(r3, r4)
            return r3
        L_0x0011:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0904.m6696(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):o.ǃɨ$ı");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C0905 m6693(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m6694(xmlPullParser, resources);
        }
        m6692(xmlPullParser);
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static C0905 m6694(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C2864.C2865.f13365);
        String string = obtainAttributes.getString(C2864.C2865.f13376);
        String string2 = obtainAttributes.getString(C2864.C2865.f13356);
        String string3 = obtainAttributes.getString(C2864.C2865.f13355);
        int resourceId = obtainAttributes.getResourceId(C2864.C2865.f13374, 0);
        int integer = obtainAttributes.getInteger(C2864.C2865.f13344, 1);
        int integer2 = obtainAttributes.getInteger(C2864.C2865.f13368, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m6691(xmlPullParser, resources));
                    } else {
                        m6692(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0907((C0906[]) arrayList.toArray(new C0906[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m6692(xmlPullParser);
        }
        return new Cif(new C2745.C2748(string, string2, string3, m6695(resources, resourceId)), integer, integer2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m6689(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static List<List<byte[]>> m6695(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m6689(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m6690(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m6690(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static List<byte[]> m6690(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static C0906 m6691(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C2864.C2865.f13349);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C2864.C2865.f13361) ? C2864.C2865.f13361 : C2864.C2865.f13377, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C2864.C2865.f13370) ? C2864.C2865.f13370 : C2864.C2865.f13353, 0);
        int i2 = obtainAttributes.hasValue(C2864.C2865.f13350) ? C2864.C2865.f13350 : C2864.C2865.f13342;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C2864.C2865.f13341) ? C2864.C2865.f13341 : C2864.C2865.f13362);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C2864.C2865.f13360) ? C2864.C2865.f13360 : C2864.C2865.f13359;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m6692(xmlPullParser);
        }
        return new C0906(string2, i, z, string, i3, resourceId);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m6692(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
