package p079e;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.z */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0817z implements View.OnClickListener {

    /* renamed from: a */
    public final View f3345a;

    /* renamed from: b */
    public final String f3346b;

    /* renamed from: c */
    public Method f3347c;

    /* renamed from: d */
    public Context f3348d;

    public ViewOnClickListenerC0817z(View view, String str) {
        this.f3345a = view;
        this.f3346b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f3347c == null) {
            View view2 = this.f3345a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f3346b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f3347c = method;
                        this.f3348d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f3347c.invoke(this.f3348d, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
