package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.ŧ  reason: contains not printable characters */
public final class C0558 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final ColorStateList f4456;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f4457;

    /* renamed from: ι  reason: contains not printable characters */
    private final Shader f4458;

    private C0558(Shader shader, ColorStateList colorStateList, int i) {
        this.f4458 = shader;
        this.f4456 = colorStateList;
        this.f4457 = i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static C0558 m5157(Shader shader) {
        return new C0558(shader, (ColorStateList) null, 0);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static C0558 m5158(ColorStateList colorStateList) {
        return new C0558((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static C0558 m5159(int i) {
        return new C0558((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Shader m5166() {
        return this.f4458;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m5163() {
        return this.f4457;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5167(int i) {
        this.f4457 = i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m5161() {
        return this.f4458 != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f4456;
     */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m5164() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f4458
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f4456
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0558.m5164():boolean");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m5165(int[] iArr) {
        if (m5164()) {
            ColorStateList colorStateList = this.f4456;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f4457) {
                this.f4457 = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m5162() {
        return m5161() || this.f4457 != 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C0558 m5160(Resources resources, int i, Resources.Theme theme) {
        try {
            return m5156(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static C0558 m5156(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return m5158(C0763.m6039(resources, xml, asAttributeSet, theme));
            }
            if (c == 1) {
                return m5157(C0909.m6714(resources, xml, asAttributeSet, theme));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": unsupported complex color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
