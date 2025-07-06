package p099j;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: j.g */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC2422g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c */
    public static final Class[] f7835c = {MenuItem.class};

    /* renamed from: a */
    public Object f7836a;

    /* renamed from: b */
    public Method f7837b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f7837b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f7836a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
