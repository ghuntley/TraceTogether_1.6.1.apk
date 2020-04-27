package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o.C2745;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.ŀ  reason: contains not printable characters */
public final class C0491 extends MenuInflater {

    /* renamed from: ɩ  reason: contains not printable characters */
    static final Class<?>[] f4119;

    /* renamed from: ι  reason: contains not printable characters */
    static final Class<?>[] f4120;

    /* renamed from: ı  reason: contains not printable characters */
    Context f4121;

    /* renamed from: Ɩ  reason: contains not printable characters */
    Object f4122;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Object[] f4123 = this.f4124;

    /* renamed from: Ι  reason: contains not printable characters */
    final Object[] f4124;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r2 = 0
            r0[r2] = r1
            f4120 = r0
            f4119 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0491.<clinit>():void");
    }

    public C0491(Context context) {
        super(context);
        this.f4121 = context;
        this.f4124 = new Object[]{context};
    }

    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof C1539)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f4121.getResources().getLayout(i);
            m4862(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m4862(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0492 r0 = new C0492(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            }
        }
        int i = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            r0.f4152 = 0;
                            r0.f4128 = 0;
                            r0.f4136 = 0;
                            r0.f4151 = 0;
                            r0.f4142 = true;
                            r0.f4157 = true;
                        } else if (name2.equals("item")) {
                            if (!r0.f4158) {
                                if (r0.f4144 == null || !r0.f4144.m12544()) {
                                    r0.m4868();
                                } else {
                                    r0.m4867();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        r0.m4866(attributeSet);
                    } else if (name3.equals("item")) {
                        r0.m4865(attributeSet);
                    } else if (name3.equals("menu")) {
                        m4862(xmlPullParser, attributeSet, r0.m4867());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                i = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static Object m4861(Object obj) {
        while (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return obj;
    }

    /* renamed from: o.ŀ$if  reason: invalid class name */
    static class Cif implements MenuItem.OnMenuItemClickListener {

        /* renamed from: ı  reason: contains not printable characters */
        private static final Class<?>[] f4125 = {MenuItem.class};

        /* renamed from: ǃ  reason: contains not printable characters */
        private Method f4126;

        /* renamed from: Ι  reason: contains not printable characters */
        private Object f4127;

        public Cif(Object obj, String str) {
            this.f4127 = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f4126 = cls.getMethod(str, f4125);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f4126.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f4126.invoke(this.f4127, new Object[]{menuItem})).booleanValue();
                }
                this.f4126.invoke(this.f4127, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: o.ŀ$ǃ  reason: contains not printable characters */
    class C0492 {

        /* renamed from: ı  reason: contains not printable characters */
        int f4128;

        /* renamed from: ŀ  reason: contains not printable characters */
        private char f4129;

        /* renamed from: ł  reason: contains not printable characters */
        private int f4130;

        /* renamed from: ſ  reason: contains not printable characters */
        private boolean f4131;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private Menu f4132;

        /* renamed from: Ɨ  reason: contains not printable characters */
        private int f4133;

        /* renamed from: ƚ  reason: contains not printable characters */
        private boolean f4134;

        /* renamed from: ǀ  reason: contains not printable characters */
        private CharSequence f4135;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f4136;

        /* renamed from: ȷ  reason: contains not printable characters */
        private CharSequence f4137;

        /* renamed from: ɍ  reason: contains not printable characters */
        private int f4138;

        /* renamed from: ɔ  reason: contains not printable characters */
        private String f4139;

        /* renamed from: ɟ  reason: contains not printable characters */
        private String f4140;

        /* renamed from: ɨ  reason: contains not printable characters */
        private int f4141;

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean f4142;

        /* renamed from: ɪ  reason: contains not printable characters */
        private int f4143;

        /* renamed from: ɹ  reason: contains not printable characters */
        C2438 f4144;

        /* renamed from: ɺ  reason: contains not printable characters */
        private CharSequence f4145;

        /* renamed from: ɼ  reason: contains not printable characters */
        private String f4146;

        /* renamed from: ɾ  reason: contains not printable characters */
        private CharSequence f4147;

        /* renamed from: ɿ  reason: contains not printable characters */
        private int f4148;

        /* renamed from: ʅ  reason: contains not printable characters */
        private boolean f4149;

        /* renamed from: ʟ  reason: contains not printable characters */
        private char f4150;

        /* renamed from: Ι  reason: contains not printable characters */
        int f4151;

        /* renamed from: ι  reason: contains not printable characters */
        int f4152;

        /* renamed from: ϲ  reason: contains not printable characters */
        private ColorStateList f4153 = null;

        /* renamed from: Ј  reason: contains not printable characters */
        private PorterDuff.Mode f4155 = null;

        /* renamed from: г  reason: contains not printable characters */
        private int f4156;

        /* renamed from: і  reason: contains not printable characters */
        boolean f4157;

        /* renamed from: Ӏ  reason: contains not printable characters */
        boolean f4158;

        /* renamed from: ӏ  reason: contains not printable characters */
        private int f4159;

        public C0492(Menu menu) {
            this.f4132 = menu;
            this.f4152 = 0;
            this.f4128 = 0;
            this.f4136 = 0;
            this.f4151 = 0;
            this.f4142 = true;
            this.f4157 = true;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m4866(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0491.this.f4121.obtainStyledAttributes(attributeSet, C2745.aux.f12978);
            this.f4152 = obtainStyledAttributes.getResourceId(C2745.aux.f13002, 0);
            this.f4128 = obtainStyledAttributes.getInt(C2745.aux.f13001, 0);
            this.f4136 = obtainStyledAttributes.getInt(C2745.aux.f13015, 0);
            this.f4151 = obtainStyledAttributes.getInt(C2745.aux.f13020, 0);
            this.f4142 = obtainStyledAttributes.getBoolean(C2745.aux.f12982, true);
            this.f4157 = obtainStyledAttributes.getBoolean(C2745.aux.f12977, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m4865(AttributeSet attributeSet) {
            Context context = C0491.this.f4121;
            C1992 r2 = new C1992(context, context.obtainStyledAttributes(attributeSet, C2745.aux.f12788));
            int i = C2745.aux.f12805;
            this.f4141 = r2.f9934.getResourceId(2, 0);
            int i2 = C2745.aux.f12807;
            int i3 = r2.f9934.getInt(5, this.f4128);
            int i4 = C2745.aux.f12820;
            this.f4159 = (i3 & -65536) | (r2.f9934.getInt(6, this.f4136) & 65535);
            int i5 = C2745.aux.f12808;
            this.f4147 = r2.f9934.getText(7);
            int i6 = C2745.aux.f12816;
            this.f4137 = r2.f9934.getText(8);
            int i7 = C2745.aux.f13026;
            this.f4143 = r2.f9934.getResourceId(0, 0);
            int i8 = C2745.aux.f12848;
            String string = r2.f9934.getString(9);
            this.f4150 = string == null ? 0 : string.charAt(0);
            int i9 = C2745.aux.f12864;
            this.f4156 = r2.f9934.getInt(16, C0872.f5653);
            int i10 = C2745.aux.f12826;
            String string2 = r2.f9934.getString(10);
            this.f4129 = string2 == null ? 0 : string2.charAt(0);
            int i11 = C2745.aux.f12905;
            this.f4148 = r2.f9934.getInt(20, C0872.f5653);
            int i12 = C2745.aux.f12836;
            if (r2.f9934.hasValue(11)) {
                int i13 = C2745.aux.f12836;
                this.f4130 = r2.f9934.getBoolean(11, false) ? 1 : 0;
            } else {
                this.f4130 = this.f4151;
            }
            int i14 = C2745.aux.f12782;
            this.f4134 = r2.f9934.getBoolean(3, false);
            int i15 = C2745.aux.f12815;
            this.f4149 = r2.f9934.getBoolean(4, this.f4142);
            int i16 = C2745.aux.f12798;
            boolean z = true;
            this.f4131 = r2.f9934.getBoolean(1, this.f4157);
            int i17 = C2745.aux.f12904;
            this.f4138 = r2.f9934.getInt(21, -1);
            int i18 = C2745.aux.f12847;
            this.f4140 = r2.f9934.getString(12);
            int i19 = C2745.aux.f12841;
            this.f4133 = r2.f9934.getResourceId(13, 0);
            int i20 = C2745.aux.f12874;
            this.f4146 = r2.f9934.getString(15);
            int i21 = C2745.aux.f12861;
            this.f4139 = r2.f9934.getString(14);
            if (this.f4139 == null) {
                z = false;
            }
            if (z && this.f4133 == 0 && this.f4146 == null) {
                this.f4144 = (C2438) m4863(this.f4139, C0491.f4119, C0491.this.f4123);
            } else {
                this.f4144 = null;
            }
            int i22 = C2745.aux.f12863;
            this.f4145 = r2.f9934.getText(17);
            int i23 = C2745.aux.f12889;
            this.f4135 = r2.f9934.getText(22);
            int i24 = C2745.aux.f12892;
            if (r2.f9934.hasValue(19)) {
                int i25 = C2745.aux.f12892;
                this.f4155 = C2674.m14214(r2.f9934.getInt(19, -1), this.f4155);
            } else {
                this.f4155 = null;
            }
            int i26 = C2745.aux.f12865;
            if (r2.f9934.hasValue(18)) {
                this.f4153 = r2.m10792(C2745.aux.f12865);
            } else {
                this.f4153 = null;
            }
            r2.f9934.recycle();
            this.f4158 = false;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private void m4864(MenuItem menuItem) {
            boolean z = true;
            menuItem.setChecked(this.f4134).setVisible(this.f4149).setEnabled(this.f4131).setCheckable(this.f4130 > 0).setTitleCondensed(this.f4137).setIcon(this.f4143);
            int i = this.f4138;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f4140 != null) {
                if (!C0491.this.f4121.isRestricted()) {
                    C0491 r1 = C0491.this;
                    if (r1.f4122 == null) {
                        Object obj = r1.f4121;
                        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                            obj = C0491.m4861(((ContextWrapper) obj).getBaseContext());
                        }
                        r1.f4122 = obj;
                    }
                    menuItem.setOnMenuItemClickListener(new Cif(r1.f4122, this.f4140));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f4130 >= 2) {
                if (menuItem instanceof C2459) {
                    C2459 r0 = (C2459) menuItem;
                    r0.f11183 = (r0.f11183 & -5) | 4;
                } else if (menuItem instanceof C2179) {
                    C2179 r02 = (C2179) menuItem;
                    try {
                        if (r02.f10381 == null) {
                            r02.f10381 = r02.f10382.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        r02.f10381.invoke(r02.f10382, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
            }
            String str = this.f4146;
            if (str != null) {
                menuItem.setActionView((View) m4863(str, C0491.f4120, C0491.this.f4124));
            } else {
                z = false;
            }
            int i2 = this.f4133;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            C2438 r03 = this.f4144;
            if (r03 != null) {
                C2604.m13816(menuItem, r03);
            }
            C2604.m13819(menuItem, this.f4145);
            C2604.m13820(menuItem, this.f4135);
            C2604.m13817(menuItem, this.f4150, this.f4156);
            C2604.m13821(menuItem, this.f4129, this.f4148);
            PorterDuff.Mode mode = this.f4155;
            if (mode != null) {
                C2604.m13818(menuItem, mode);
            }
            ColorStateList colorStateList = this.f4153;
            if (colorStateList != null) {
                C2604.m13822(menuItem, colorStateList);
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m4868() {
            this.f4158 = true;
            m4864(this.f4132.add(this.f4152, this.f4141, this.f4159, this.f4147));
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final SubMenu m4867() {
            this.f4158 = true;
            SubMenu addSubMenu = this.f4132.addSubMenu(this.f4152, this.f4141, this.f4159, this.f4147);
            m4864(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private <T> T m4863(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0491.this.f4121.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
