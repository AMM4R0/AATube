package p099j;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: j.l */
/* loaded from: classes.dex */
public abstract class AbstractC2427l {
    /* renamed from: a */
    public static boolean m4784a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    /* renamed from: b */
    public static ActionMode m4785b(Window.Callback callback, ActionMode.Callback callback2, int r2) {
        return callback.onWindowStartingActionMode(callback2, r2);
    }
}
