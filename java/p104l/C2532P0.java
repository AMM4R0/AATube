package p104l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p006C.C0055g;
import p102k.C2468o;
import p102k.MenuC2466m;

/* renamed from: l.P0 */
/* loaded from: classes.dex */
public final class C2532P0 extends C2520J0 implements InterfaceC2522K0 {

    /* renamed from: E */
    public static final Method f8273E;

    /* renamed from: D */
    public C0055g f8274D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f8273E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p104l.InterfaceC2522K0
    /* renamed from: c */
    public final void mo205c(MenuC2466m menuC2466m, C2468o c2468o) {
        C0055g c0055g = this.f8274D;
        if (c0055g != null) {
            c0055g.mo205c(menuC2466m, c2468o);
        }
    }

    @Override // p104l.InterfaceC2522K0
    /* renamed from: o */
    public final void mo216o(MenuC2466m menuC2466m, C2468o c2468o) {
        C0055g c0055g = this.f8274D;
        if (c0055g != null) {
            c0055g.mo216o(menuC2466m, c2468o);
        }
    }

    @Override // p104l.C2520J0
    /* renamed from: q */
    public final C2622x0 mo4952q(Context context, boolean z2) {
        C2530O0 c2530o0 = new C2530O0(context, z2);
        c2530o0.setHoverListener(this);
        return c2530o0;
    }
}
