package p102k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p079e.DialogC0797f;

/* renamed from: k.n */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC2467n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC2478y {

    /* renamed from: a */
    public SubMenuC2453F f8089a;

    /* renamed from: b */
    public DialogC0797f f8090b;

    /* renamed from: c */
    public C2462i f8091c;

    @Override // p102k.InterfaceC2478y
    /* renamed from: a */
    public final void mo2226a(MenuC2466m menuC2466m, boolean z2) {
        DialogC0797f dialogC0797f;
        if ((z2 || menuC2466m == this.f8089a) && (dialogC0797f = this.f8090b) != null) {
            dialogC0797f.dismiss();
        }
    }

    @Override // p102k.InterfaceC2478y
    /* renamed from: b */
    public final boolean mo2227b(MenuC2466m menuC2466m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int r4) {
        C2462i c2462i = this.f8091c;
        if (c2462i.f8057f == null) {
            c2462i.f8057f = new C2461h(c2462i);
        }
        this.f8089a.m4842q(c2462i.f8057f.getItem(r4), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f8091c.mo4801a(this.f8089a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int r5, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC2453F subMenuC2453F = this.f8089a;
        if (r5 == 82 || r5 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f8090b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f8090b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC2453F.m4836c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC2453F.performShortcut(r5, keyEvent, 0);
    }
}
