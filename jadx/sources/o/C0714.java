package o;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: o.ƚ  reason: contains not printable characters */
public class C0714 implements Window.Callback {

    /* renamed from: ı  reason: contains not printable characters */
    final Window.Callback f4923;

    public C0714(Window.Callback callback) {
        if (callback != null) {
            this.f4923 = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f4923.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f4923.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f4923.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f4923.dispatchTrackballEvent(motionEvent);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f4923.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f4923.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public View onCreatePanelView(int i) {
        return this.f4923.onCreatePanelView(i);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f4923.onCreatePanelMenu(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f4923.onPreparePanel(i, view, menu);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f4923.onMenuOpened(i, menu);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f4923.onMenuItemSelected(i, menuItem);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f4923.onWindowAttributesChanged(layoutParams);
    }

    public void onContentChanged() {
        this.f4923.onContentChanged();
    }

    public void onWindowFocusChanged(boolean z) {
        this.f4923.onWindowFocusChanged(z);
    }

    public void onAttachedToWindow() {
        this.f4923.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f4923.onDetachedFromWindow();
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f4923.onPanelClosed(i, menu);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f4923.onSearchRequested(searchEvent);
    }

    public boolean onSearchRequested() {
        return this.f4923.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f4923.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f4923.onWindowStartingActionMode(callback, i);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f4923.onActionModeStarted(actionMode);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f4923.onActionModeFinished(actionMode);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f4923.onProvideKeyboardShortcuts(list, menu, i);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f4923.onPointerCaptureChanged(z);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Window.Callback m5831() {
        return this.f4923;
    }
}
