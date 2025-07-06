package p079e;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import p099j.AbstractC2427l;
import p099j.AbstractC2428m;
import p099j.AbstractC2429n;
import p102k.MenuC2466m;

/* renamed from: e.s */
/* loaded from: classes.dex */
public final class WindowCallbackC0810s implements Window.Callback {

    /* renamed from: a */
    public final Window.Callback f3264a;

    /* renamed from: b */
    public boolean f3265b;

    /* renamed from: c */
    public boolean f3266c;

    /* renamed from: d */
    public boolean f3267d;

    /* renamed from: e */
    public final /* synthetic */ LayoutInflaterFactory2C0815x f3268e;

    public WindowCallbackC0810s(LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x, Window.Callback callback) {
        this.f3268e = layoutInflaterFactory2C0815x;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f3264a = callback;
    }

    /* renamed from: a */
    public final void m2238a(Window.Callback callback) {
        try {
            this.f3265b = true;
            callback.onContentChanged();
        } finally {
            this.f3265b = false;
        }
    }

    /* renamed from: b */
    public final boolean m2239b(int r2, Menu menu) {
        return this.f3264a.onMenuOpened(r2, menu);
    }

    /* renamed from: c */
    public final void m2240c(int r2, Menu menu) {
        this.f3264a.onPanelClosed(r2, menu);
    }

    /* renamed from: d */
    public final void m2241d(List list, Menu menu, int r4) {
        AbstractC2428m.m4786a(this.f3264a, list, menu, r4);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f3264a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f3266c;
        Window.Callback callback = this.f3264a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f3268e.m2260u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f3264a
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            e.x r2 = r6.f3268e
            r2.m2246B()
            e.I r3 = r2.f3332o
            r4 = 0
            if (r3 == 0) goto L3d
            e.H r3 = r3.f3188n
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            k.m r3 = r3.f3171d
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            e.w r0 = r2.f3306M
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.m2251G(r0, r3, r7)
            if (r0 == 0) goto L52
            e.w r7 = r2.f3306M
            if (r7 == 0) goto L3b
            r7.f3285l = r1
            goto L3b
        L52:
            e.w r0 = r2.f3306M
            if (r0 != 0) goto L6a
            e.w r0 = r2.m2245A(r4)
            r2.m2252H(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.m2251G(r0, r3, r7)
            r0.f3284k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            r1 = r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p079e.WindowCallbackC0810s.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f3264a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f3264a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f3264a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f3264a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f3264a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f3264a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f3265b) {
            this.f3264a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, Menu menu) {
        if (r2 != 0 || (menu instanceof MenuC2466m)) {
            return this.f3264a.onCreatePanelMenu(r2, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int r2) {
        return this.f3264a.onCreatePanelView(r2);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f3264a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, MenuItem menuItem) {
        return this.f3264a.onMenuItemSelected(r2, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int r3, Menu menu) {
        m2239b(r3, menu);
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = this.f3268e;
        if (r3 == 108) {
            layoutInflaterFactory2C0815x.m2246B();
            C0791I r32 = layoutInflaterFactory2C0815x.f3332o;
            if (r32 != null && true != r32.f3191q) {
                r32.f3191q = true;
                ArrayList arrayList = r32.f3192r;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C0815x.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int r3, Menu menu) {
        if (this.f3267d) {
            this.f3264a.onPanelClosed(r3, menu);
            return;
        }
        m2240c(r3, menu);
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = this.f3268e;
        if (r3 != 108) {
            if (r3 != 0) {
                layoutInflaterFactory2C0815x.getClass();
                return;
            }
            C0814w m2245A = layoutInflaterFactory2C0815x.m2245A(r3);
            if (m2245A.f3286m) {
                layoutInflaterFactory2C0815x.m2259s(m2245A, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0815x.m2246B();
        C0791I r32 = layoutInflaterFactory2C0815x.f3332o;
        if (r32 == null || !r32.f3191q) {
            return;
        }
        r32.f3191q = false;
        ArrayList arrayList = r32.f3192r;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        AbstractC2429n.m4787a(this.f3264a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int r4, View view, Menu menu) {
        MenuC2466m menuC2466m = menu instanceof MenuC2466m ? (MenuC2466m) menu : null;
        if (r4 == 0 && menuC2466m == null) {
            return false;
        }
        if (menuC2466m != null) {
            menuC2466m.f8088x = true;
        }
        boolean onPreparePanel = this.f3264a.onPreparePanel(r4, view, menu);
        if (menuC2466m != null) {
            menuC2466m.f8088x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int r5) {
        MenuC2466m menuC2466m = this.f3268e.m2245A(0).f3281h;
        if (menuC2466m != null) {
            m2241d(list, menuC2466m, r5);
        } else {
            m2241d(list, menu, r5);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC2427l.m4784a(this.f3264a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f3264a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f3264a.onWindowFocusChanged(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01af  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r9, int r10) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p079e.WindowCallbackC0810s.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f3264a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
