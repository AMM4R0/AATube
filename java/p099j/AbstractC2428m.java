package p099j;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* renamed from: j.m */
/* loaded from: classes.dex */
public abstract class AbstractC2428m {
    /* renamed from: a */
    public static void m4786a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int r3) {
        callback.onProvideKeyboardShortcuts(list, menu, r3);
    }
}
