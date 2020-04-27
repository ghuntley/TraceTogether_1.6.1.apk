package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.C2104;

/* renamed from: o.ǃƚ  reason: contains not printable characters */
public final class C0893 {

    /* renamed from: ı  reason: contains not printable characters */
    private static Field f5717;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean f5718;

    /* renamed from: Ι  reason: contains not printable characters */
    private static Field f5719;

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean f5720;

    /* renamed from: ı  reason: contains not printable characters */
    private static Field m6618(String str) {
        try {
            Field declaredField = TextView.class.getDeclaredField(str);
            try {
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                return declaredField;
            }
        } catch (NoSuchFieldException unused2) {
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m6617(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            field.getName();
            return -1;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m6621(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (Build.VERSION.SDK_INT >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m6631(TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f5720) {
            f5719 = m6618("mMaxMode");
            f5720 = true;
        }
        Field field = f5719;
        if (field == null || m6617(field, textView) != 1) {
            return -1;
        }
        if (!f5718) {
            f5717 = m6618("mMaximum");
            f5718 = true;
        }
        Field field2 = f5717;
        if (field2 != null) {
            return m6617(field2, textView);
        }
        return -1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m6632(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static Drawable[] m6630(TextView textView) {
        if (Build.VERSION.SDK_INT >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static ActionMode.Callback m6623(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof If)) ? callback : new If(callback, textView);
    }

    /* renamed from: o.ǃƚ$If */
    static class If implements ActionMode.Callback {

        /* renamed from: ı  reason: contains not printable characters */
        private Class f5721;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private boolean f5722 = false;

        /* renamed from: ǃ  reason: contains not printable characters */
        private Method f5723;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final TextView f5724;

        /* renamed from: Ι  reason: contains not printable characters */
        private final ActionMode.Callback f5725;

        /* renamed from: ι  reason: contains not printable characters */
        private boolean f5726;

        If(ActionMode.Callback callback, TextView textView) {
            this.f5725 = callback;
            this.f5724 = textView;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f5725.onCreateActionMode(actionMode, menu);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m6637(menu);
            return this.f5725.onPrepareActionMode(actionMode, menu);
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f5725.onActionItemClicked(actionMode, menuItem);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f5725.onDestroyActionMode(actionMode);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private void m6637(Menu menu) {
            Method method;
            Context context = this.f5724.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f5722) {
                this.f5722 = true;
                try {
                    this.f5721 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f5723 = this.f5721.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f5726 = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f5721 = null;
                    this.f5723 = null;
                    this.f5726 = false;
                }
            }
            try {
                if (!this.f5726 || !this.f5721.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f5723;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List<ResolveInfo> r0 = m6636(context, packageManager);
                for (int i = 0; i < r0.size(); i++) {
                    ResolveInfo resolveInfo = r0.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m6640(resolveInfo, this.f5724)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private List<ResolveInfo> m6636(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(m6635(), 0)) {
                if (m6638(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private boolean m6638(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            if (!resolveInfo.activityInfo.exported) {
                return false;
            }
            if (resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private Intent m6640(ResolveInfo resolveInfo, TextView textView) {
            return m6635().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m6639(textView)).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private boolean m6639(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private Intent m6635() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m6624(TextView textView, int i) {
        int i2;
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
        } else {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.top;
            } else {
                i2 = fontMetricsInt.ascent;
            }
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m6629(TextView textView, int i) {
        int i2;
        if (i >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.bottom;
            } else {
                i2 = fontMetricsInt.descent;
            }
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m6622(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m6616(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m6619(TextView textView, int i) {
        if (i >= 0) {
            int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
            if (i != fontMetricsInt) {
                textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C2104.C2105 m6627(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C2104.C2105(textView.getTextMetricsParams());
        }
        C2104.C2105.If ifR = new C2104.C2105.If(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            ifR.m11249(textView.getBreakStrategy());
            ifR.m11250(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            ifR.m11252(m6634(textView));
        }
        return ifR.m11251();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m6625(TextView textView, C2104.C2105 r3) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m6628(r3.m11247()));
        }
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = r3.m11244().getTextScaleX();
            textView.getPaint().set(r3.m11244());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(r3.m11244());
        textView.setBreakStrategy(r3.m11248());
        textView.setHyphenationFrequency(r3.m11246());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m6626(TextView textView, C2104 r3) {
        if (m6627(textView).m11245(r3.m11243())) {
            textView.setText(r3);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    /* renamed from: і  reason: contains not printable characters */
    private static TextDirectionHeuristic m6634(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int m6628(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m6633(TextView textView, ColorStateList colorStateList) {
        if (textView == null) {
            throw new NullPointerException();
        } else if (Build.VERSION.SDK_INT >= 23) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof C0963) {
            ((C0963) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m6620(TextView textView, PorterDuff.Mode mode) {
        if (textView == null) {
            throw new NullPointerException();
        } else if (Build.VERSION.SDK_INT >= 23) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof C0963) {
            ((C0963) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }
}
