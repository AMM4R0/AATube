package androidx.activity;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0702l;
import androidx.lifecycle.InterfaceC0706p;
import androidx.lifecycle.InterfaceC0708r;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0706p {

    /* renamed from: b */
    public static int f1646b;

    /* renamed from: c */
    public static Field f1647c;

    /* renamed from: d */
    public static Field f1648d;

    /* renamed from: e */
    public static Field f1649e;

    /* renamed from: a */
    public AbstractActivityC0592k f1650a;

    @Override // androidx.lifecycle.InterfaceC0706p
    /* renamed from: b */
    public final void mo1460b(InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l) {
        if (enumC0702l != EnumC0702l.ON_DESTROY) {
            return;
        }
        if (f1646b == 0) {
            try {
                f1646b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f1648d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f1649e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f1647c = declaredField3;
                declaredField3.setAccessible(true);
                f1646b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f1646b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f1650a.getSystemService("input_method");
            try {
                Object obj = f1647c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f1648d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f1649e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
