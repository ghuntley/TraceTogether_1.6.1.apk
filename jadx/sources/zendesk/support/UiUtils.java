package zendesk.support;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import o.C0651;
import o.C1266;
import o.F;

public class UiUtils {
    private static UiUtils IMPL = new UiUtils();

    private UiUtils() {
    }

    public static int themeAttributeToColor(int i, Context context, int i2) {
        return IMPL.internalThemeAttributeToColor(i, context, i2);
    }

    public static int resolveColor(int i, Context context) {
        return IMPL.internalResolveColor(i, context);
    }

    public static void setVisibility(View view, int i) {
        if (view == null) {
            F.m1361();
        } else {
            view.setVisibility(i);
        }
    }

    public static void dismissKeyboard(Activity activity) {
        IMPL.internalDismissKeyboard(activity);
    }

    public static void dismissKeyboard(View view) {
        IMPL.internalDismissKeyboard(view);
    }

    public static void setTint(int i, Drawable drawable, View view) {
        IMPL.internalSetTint(i, drawable, view);
    }

    public void internalSetTint(int i, Drawable drawable, View view) {
        if (drawable == null) {
            F.m1358();
            return;
        }
        C1266.m8148(C1266.m8158(drawable).mutate(), i);
        if (view != null) {
            view.invalidate();
        }
    }

    public int internalThemeAttributeToColor(int i, Context context, int i2) {
        if (i == 0 || context == null || i2 == 0) {
            F.m1359();
            return -16777216;
        }
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            new Object[1][0] = Integer.valueOf(i);
            F.m1358();
            return resolveColor(i2, context);
        } else if (typedValue.resourceId == 0) {
            return typedValue.data;
        } else {
            return resolveColor(typedValue.resourceId, context);
        }
    }

    public int internalResolveColor(int i, Context context) {
        return C0651.m5450(context, i);
    }

    public void internalDismissKeyboard(Activity activity) {
        if (activity == null) {
            F.m1361();
            return;
        }
        Object systemService = activity.getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            } else {
                F.m1361();
            }
        } else {
            F.m1361();
        }
    }

    public void internalDismissKeyboard(View view) {
        if (view == null) {
            F.m1361();
            return;
        }
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } else {
            F.m1361();
        }
    }

    public static CharSequence decodeHtmlEntities(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }
}
