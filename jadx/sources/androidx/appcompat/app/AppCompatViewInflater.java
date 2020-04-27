package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import o.C0293;
import o.C0299;
import o.C0472;
import o.C0522;
import o.C0881;
import o.C0898;
import o.C0917;
import o.C0983;
import o.C1231;
import o.C1514;
import o.C1745;
import o.C1756;
import o.C1786;
import o.C1905;
import o.C1921;
import o.C2115;
import o.C2147;
import o.C2497;
import o.C2745;

public class AppCompatViewInflater {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Class<?>[] f99 = {Context.class, AttributeSet.class};

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int[] f100 = {16843375};

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Map<String, Constructor<? extends View>> f101 = new C0299();

    /* renamed from: ι  reason: contains not printable characters */
    private static final String[] f102 = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: Ι  reason: contains not printable characters */
    private final Object[] f103 = new Object[2];

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public View m112(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final View m113(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m104(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C1786.m9912(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 13;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = m118(context2, attributeSet);
                m106(view2, str);
                break;
            case 1:
                view2 = m109(context2, attributeSet);
                m106(view2, str);
                break;
            case 2:
                view2 = m107(context2, attributeSet);
                m106(view2, str);
                break;
            case 3:
                view2 = m114(context2, attributeSet);
                m106(view2, str);
                break;
            case 4:
                view2 = m119(context2, attributeSet);
                m106(view2, str);
                break;
            case 5:
                view2 = m116(context2, attributeSet);
                m106(view2, str);
                break;
            case 6:
                view2 = m122(context2, attributeSet);
                m106(view2, str);
                break;
            case 7:
                view2 = m120(context2, attributeSet);
                m106(view2, str);
                break;
            case 8:
                view2 = m108(context2, attributeSet);
                m106(view2, str);
                break;
            case 9:
                view2 = m121(context2, attributeSet);
                m106(view2, str);
                break;
            case 10:
                view2 = m111(context2, attributeSet);
                m106(view2, str);
                break;
            case 11:
                view2 = m117(context2, attributeSet);
                m106(view2, str);
                break;
            case 12:
                view2 = m115(context2, attributeSet);
                m106(view2, str);
                break;
            case 13:
                view2 = m110(context2, attributeSet);
                m106(view2, str);
                break;
            default:
                view2 = m112(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = m103(context2, str, attributeSet);
        }
        if (view2 != null) {
            m105(view2, attributeSet);
        }
        return view2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public C1514 m118(Context context, AttributeSet attributeSet) {
        return new C1514(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public C2147 m109(Context context, AttributeSet attributeSet) {
        return new C2147(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public C0881 m107(Context context, AttributeSet attributeSet) {
        return new C0881(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public C1745 m114(Context context, AttributeSet attributeSet) {
        return new C1745(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public C1231 m119(Context context, AttributeSet attributeSet) {
        return new C1231(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɹ  reason: contains not printable characters */
    public C2115 m116(Context context, AttributeSet attributeSet) {
        return new C2115(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public C1905 m122(Context context, AttributeSet attributeSet) {
        return new C1905(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: І  reason: contains not printable characters */
    public C0983 m120(Context context, AttributeSet attributeSet) {
        return new C0983(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public C1756 m108(Context context, AttributeSet attributeSet) {
        return new C1756(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: і  reason: contains not printable characters */
    public C0898 m121(Context context, AttributeSet attributeSet) {
        return new C0898(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɨ  reason: contains not printable characters */
    public C2497 m111(Context context, AttributeSet attributeSet) {
        return new C2497(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɾ  reason: contains not printable characters */
    public C0917 m117(Context context, AttributeSet attributeSet) {
        return new C0917(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɪ  reason: contains not printable characters */
    public C0472 m115(Context context, AttributeSet attributeSet) {
        return new C0472(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ȷ  reason: contains not printable characters */
    public C1921 m110(Context context, AttributeSet attributeSet) {
        return new C1921(context, attributeSet);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m106(View view, String str) {
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(" asked to inflate view for <");
            sb.append(str);
            sb.append(">, but returned null");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private View m103(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            this.f103[0] = context;
            this.f103[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String r3 : f102) {
                    View r32 = m102(context, str, r3);
                    if (r32 != null) {
                        return r32;
                    }
                }
                Object[] objArr = this.f103;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View r5 = m102(context, str, (String) null);
            Object[] objArr2 = this.f103;
            objArr2[0] = null;
            objArr2[1] = null;
            return r5;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.f103;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m105(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C0293.m4172(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f100);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new If(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private View m102(Context context, String str, String str2) {
        String str3;
        Constructor<? extends U> constructor = f101.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f99);
            f101.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f103);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static Context m104(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2745.aux.f13004, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C2745.aux.f12984, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(C2745.aux.f12986, 0);
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof C0522) || ((C0522) context).f4345 != resourceId) ? new C0522(context, resourceId) : context;
        }
        return context;
    }

    static class If implements View.OnClickListener {

        /* renamed from: ı  reason: contains not printable characters */
        private final String f104;

        /* renamed from: ǃ  reason: contains not printable characters */
        private Method f105;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final View f106;

        /* renamed from: Ι  reason: contains not printable characters */
        private Context f107;

        public If(View view, String str) {
            this.f106 = view;
            this.f104 = str;
        }

        public void onClick(View view) {
            if (this.f105 == null) {
                m123(this.f106.getContext(), this.f104);
            }
            try {
                this.f105.invoke(this.f107, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        private void m123(Context context, String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f104, new Class[]{View.class})) != null) {
                        this.f105 = method;
                        this.f107 = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f106.getId();
            if (id == -1) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder(" with id '");
                sb.append(this.f106.getContext().getResources().getResourceEntryName(id));
                sb.append("'");
                str2 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("Could not find method ");
            sb2.append(this.f104);
            sb2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            sb2.append(this.f106.getClass());
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
