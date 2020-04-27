package o;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.іΙ  reason: contains not printable characters */
public final class C2596 {

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean f11763 = false;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean f11764 = false;

    /* renamed from: Ι  reason: contains not printable characters */
    private static Method f11765;

    /* renamed from: ι  reason: contains not printable characters */
    private static Field f11766;

    /* renamed from: o.іΙ$if  reason: invalid class name */
    public interface Cif {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m13766(View view, KeyEvent keyEvent) {
        return C0293.m4181(view, keyEvent);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m13767(Cif ifVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (ifVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return ifVar.superDispatchKeyEvent(keyEvent);
        }
        KeyEvent.DispatcherState dispatcherState = null;
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null && m13769(actionBar, keyEvent)) {
                    return true;
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (C0293.m4168(decorView, keyEvent)) {
                return true;
            }
            if (decorView != null) {
                dispatcherState = decorView.getKeyDispatcherState();
            }
            return keyEvent.dispatch(activity, dispatcherState, activity);
        } else if (callback instanceof Dialog) {
            Dialog dialog = (Dialog) callback;
            DialogInterface.OnKeyListener r4 = m13768(dialog);
            if (r4 != null && r4.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window2 = dialog.getWindow();
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window2.getDecorView();
            if (C0293.m4168(decorView2, keyEvent)) {
                return true;
            }
            if (decorView2 != null) {
                dispatcherState = decorView2.getKeyDispatcherState();
            }
            return keyEvent.dispatch(dialog, dispatcherState, dialog);
        } else if ((view == null || !C0293.m4168(view, keyEvent)) && !ifVar.superDispatchKeyEvent(keyEvent)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean m13769(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f11764) {
            try {
                f11765 = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f11764 = true;
        }
        Method method = f11765;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static DialogInterface.OnKeyListener m13768(Dialog dialog) {
        if (!f11763) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f11766 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f11763 = true;
        }
        Field field = f11766;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
