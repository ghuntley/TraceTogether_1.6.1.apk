package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.HashMap;
import o.C0420;
import o.C0665;
import o.C0736;
import o.C2745;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.Ŧ  reason: contains not printable characters */
public final class C0557 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final ThreadLocal<TypedValue> f4453 = new ThreadLocal<>();

    /* renamed from: Ι  reason: contains not printable characters */
    private C0699 f4454;

    /* renamed from: ι  reason: contains not printable characters */
    private Context f4455;

    public C0557(Context context, C0699 r2) {
        this.f4455 = context;
        this.f4454 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045 A[Catch:{ Exception -> 0x004f, all -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a A[Catch:{ Exception -> 0x004f, all -> 0x004d }] */
    @android.annotation.SuppressLint({"ResourceType"})
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.C0643 m5155(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f4455
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x000e:
            int r3 = r1.next()     // Catch:{ Exception -> 0x004f }
            r4 = 2
            if (r3 == r4) goto L_0x0018
            r5 = 1
            if (r3 != r5) goto L_0x000e
        L_0x0018:
            if (r3 != r4) goto L_0x0045
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x004f }
            o.ſι r2 = r6.m5151(r0, r1, r2, r7)     // Catch:{ Exception -> 0x004f }
            boolean r4 = r2 instanceof o.C0643     // Catch:{ Exception -> 0x004f }
            if (r4 == 0) goto L_0x002c
            o.ƖƖ r2 = (o.C0643) r2     // Catch:{ Exception -> 0x004f }
            r1.close()
            return r2
        L_0x002c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x004f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004f }
            java.lang.String r5 = "Root element <"
            r4.<init>(r5)     // Catch:{ Exception -> 0x004f }
            r4.append(r3)     // Catch:{ Exception -> 0x004f }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r4.append(r3)     // Catch:{ Exception -> 0x004f }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x004f }
            r2.<init>(r3)     // Catch:{ Exception -> 0x004f }
            throw r2     // Catch:{ Exception -> 0x004f }
        L_0x0045:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x004f }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x004f }
            throw r2     // Catch:{ Exception -> 0x004f }
        L_0x004d:
            r7 = move-exception
            goto L_0x0074
        L_0x004f:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            java.lang.String r5 = "Exception inflating "
            r4.<init>(r5)     // Catch:{ all -> 0x004d }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x004d }
            r4.append(r7)     // Catch:{ all -> 0x004d }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x004d }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x004d }
            r4.append(r7)     // Catch:{ all -> 0x004d }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x004d }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x004d }
            throw r3     // Catch:{ all -> 0x004d }
        L_0x0074:
            r1.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0557.m5155(int):o.ƖƖ");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private C0593 m5151(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) {
        int depth;
        C0593 r0 = this.f4454.m5753(xmlResourceParser.getName()).m5825();
        r0.m5242(this.f4455, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                return r0;
            }
            if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0736.C0737.f4972);
                    String string = obtainAttributes.getString(C0736.C0737.f4986);
                    if (string != null) {
                        C0420 r5 = m5154(obtainAttributes, resources, i);
                        if (r0.f4519 == null) {
                            r0.f4519 = new HashMap<>();
                        }
                        r0.f4519.put(string, r5);
                        obtainAttributes.recycle();
                    } else {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                } else if ("deepLink".equals(name)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, C0736.C0737.f4977);
                    String string2 = obtainAttributes2.getString(C0736.C0737.f4980);
                    if (!TextUtils.isEmpty(string2)) {
                        String replace = string2.replace("${applicationId}", this.f4455.getPackageName());
                        if (r0.f4525 == null) {
                            r0.f4525 = new ArrayList<>();
                        }
                        r0.f4525.add(new C0504(replace));
                        obtainAttributes2.recycle();
                    } else {
                        throw new IllegalArgumentException("Every <deepLink> must include an app:uri");
                    }
                } else if ("action".equals(name)) {
                    m5152(resources, r0, attributeSet, xmlResourceParser, i);
                } else if ("include".equals(name) && (r0 instanceof C0643)) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(attributeSet, C0736.C0737.f4974);
                    ((C0643) r0).m5425(m5155(obtainAttributes3.getResourceId(C0736.C0737.f4987, 0)));
                    obtainAttributes3.recycle();
                } else if (r0 instanceof C0643) {
                    ((C0643) r0).m5425(m5151(resources, xmlResourceParser, attributeSet, i));
                }
            }
        }
        return r0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static C0420 m5154(TypedArray typedArray, Resources resources, int i) {
        C0420.If ifR = new C0420.If();
        boolean z = false;
        ifR.f3997 = typedArray.getBoolean(C0736.C0737.f4976, false);
        TypedValue typedValue = f4453.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f4453.set(typedValue);
        }
        String string = typedArray.getString(C0736.C0737.f4988);
        int i2 = null;
        C0686 r11 = string != null ? C0686.m5563(string, resources.getResourcePackageName(i)) : null;
        if (typedArray.getValue(C0736.C0737.f4992, typedValue)) {
            if (r11 == C0686.f4837) {
                if (typedValue.resourceId != 0) {
                    i2 = Integer.valueOf(typedValue.resourceId);
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    i2 = 0;
                } else {
                    StringBuilder sb = new StringBuilder("unsupported value '");
                    sb.append(typedValue.string);
                    sb.append("' for ");
                    sb.append(r11.m5567());
                    sb.append(". Must be a reference to a resource.");
                    throw new XmlPullParserException(sb.toString());
                }
            } else if (typedValue.resourceId != 0) {
                if (r11 == null) {
                    r11 = C0686.f4837;
                    i2 = Integer.valueOf(typedValue.resourceId);
                } else {
                    StringBuilder sb2 = new StringBuilder("unsupported value '");
                    sb2.append(typedValue.string);
                    sb2.append("' for ");
                    sb2.append(r11.m5567());
                    sb2.append(". You must use a \"");
                    sb2.append(C0686.f4837.m5567());
                    sb2.append("\" type to reference other resources.");
                    throw new XmlPullParserException(sb2.toString());
                }
            } else if (r11 == C0686.f4840) {
                i2 = typedArray.getString(C0736.C0737.f4992);
            } else {
                int i3 = typedValue.type;
                if (i3 == 3) {
                    String charSequence = typedValue.string.toString();
                    if (r11 == null) {
                        r11 = C0686.m5562(charSequence);
                    }
                    i2 = r11.m5564(charSequence);
                } else if (i3 == 4) {
                    r11 = m5153(typedValue, r11, C0686.f4834, string, "float");
                    i2 = Float.valueOf(typedValue.getFloat());
                } else if (i3 == 5) {
                    r11 = m5153(typedValue, r11, C0686.f4838, string, "dimension");
                    i2 = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                } else if (i3 == 18) {
                    r11 = m5153(typedValue, r11, C0686.f4833, string, "boolean");
                    if (typedValue.data != 0) {
                        z = true;
                    }
                    i2 = Boolean.valueOf(z);
                } else if (typedValue.type < 16 || typedValue.type > 31) {
                    StringBuilder sb3 = new StringBuilder("unsupported argument type ");
                    sb3.append(typedValue.type);
                    throw new XmlPullParserException(sb3.toString());
                } else {
                    r11 = m5153(typedValue, r11, C0686.f4838, string, "integer");
                    i2 = Integer.valueOf(typedValue.data);
                }
            }
        }
        if (i2 != null) {
            ifR.f3999 = i2;
            ifR.f3998 = true;
        }
        if (r11 != null) {
            ifR.f4000 = r11;
        }
        return ifR.m4712();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C0686 m5153(TypedValue typedValue, C0686 r2, C0686 r3, String str, String str2) {
        if (r2 == null || r2 == r3) {
            return r2 != null ? r2 : r3;
        }
        StringBuilder sb = new StringBuilder("Type is ");
        sb.append(str);
        sb.append(" but found ");
        sb.append(str2);
        sb.append(": ");
        sb.append(typedValue.data);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m5152(Resources resources, C0593 r11, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i) {
        int depth;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0736.C0737.f4975);
        int resourceId = obtainAttributes.getResourceId(C0736.C0737.f4984, 0);
        C2745.C3657iF iFVar = new C2745.C3657iF(obtainAttributes.getResourceId(C0736.C0737.f4994, 0), (byte) 0);
        C0665.Cif ifVar = new C0665.Cif();
        ifVar.f4749 = obtainAttributes.getBoolean(C0736.C0737.f4985, false);
        int resourceId2 = obtainAttributes.getResourceId(C0736.C0737.f4995, -1);
        boolean z = obtainAttributes.getBoolean(C0736.C0737.f4973, false);
        ifVar.f4752 = resourceId2;
        ifVar.f4746 = z;
        ifVar.f4748 = obtainAttributes.getResourceId(C0736.C0737.f4991, -1);
        ifVar.f4751 = obtainAttributes.getResourceId(C0736.C0737.f4983, -1);
        ifVar.f4750 = obtainAttributes.getResourceId(C0736.C0737.f4981, -1);
        ifVar.f4747 = obtainAttributes.getResourceId(C0736.C0737.f4979, -1);
        ifVar.m5495();
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                bundle.isEmpty();
            } else if (next == 2 && depth <= depth2 && "argument".equals(xmlResourceParser.getName())) {
                TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, C0736.C0737.f4972);
                String string = obtainAttributes2.getString(C0736.C0737.f4986);
                if (string != null) {
                    C0420 r8 = m5154(obtainAttributes2, resources, i);
                    if (r8.f3995 && r8.f3995) {
                        r8.f3994.m5566(bundle, string, r8.f3993);
                    }
                    obtainAttributes2.recycle();
                } else {
                    throw new XmlPullParserException("Arguments must have a name");
                }
            }
        }
        bundle.isEmpty();
        if (!r11.m5243()) {
            StringBuilder sb = new StringBuilder("Cannot add action ");
            sb.append(resourceId);
            sb.append(" to ");
            sb.append(r11);
            sb.append(" as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            throw new UnsupportedOperationException(sb.toString());
        } else if (resourceId != 0) {
            if (r11.f4524 == null) {
                r11.f4524 = new C1286<>();
            }
            r11.f4524.m8219(resourceId, iFVar);
            obtainAttributes.recycle();
        } else {
            throw new IllegalArgumentException("Cannot have an action with actionId 0");
        }
    }
}
