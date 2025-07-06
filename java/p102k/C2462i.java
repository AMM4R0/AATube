package p102k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p018G1.C0169t;
import p079e.C0793b;
import p079e.DialogC0797f;

/* renamed from: k.i */
/* loaded from: classes.dex */
public final class C2462i implements InterfaceC2479z, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Context f8052a;

    /* renamed from: b */
    public LayoutInflater f8053b;

    /* renamed from: c */
    public MenuC2466m f8054c;

    /* renamed from: d */
    public ExpandedMenuView f8055d;

    /* renamed from: e */
    public InterfaceC2478y f8056e;

    /* renamed from: f */
    public C2461h f8057f;

    public C2462i(ContextWrapper contextWrapper) {
        this.f8052a = contextWrapper;
        this.f8053b = LayoutInflater.from(contextWrapper);
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: a */
    public final void mo4801a(MenuC2466m menuC2466m, boolean z2) {
        InterfaceC2478y interfaceC2478y = this.f8056e;
        if (interfaceC2478y != null) {
            interfaceC2478y.mo2226a(menuC2466m, z2);
        }
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: c */
    public final boolean mo4829c(C2468o c2468o) {
        return false;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: d */
    public final boolean mo4802d(SubMenuC2453F subMenuC2453F) {
        if (!subMenuC2453F.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC2467n dialogInterfaceOnKeyListenerC2467n = new DialogInterfaceOnKeyListenerC2467n();
        dialogInterfaceOnKeyListenerC2467n.f8089a = subMenuC2453F;
        Context context = subMenuC2453F.f8065a;
        C0169t c0169t = new C0169t(context);
        C0793b c0793b = (C0793b) c0169t.f533b;
        C2462i c2462i = new C2462i(c0793b.f3203a);
        dialogInterfaceOnKeyListenerC2467n.f8091c = c2462i;
        c2462i.f8056e = dialogInterfaceOnKeyListenerC2467n;
        subMenuC2453F.m4835b(c2462i, context);
        C2462i c2462i2 = dialogInterfaceOnKeyListenerC2467n.f8091c;
        if (c2462i2.f8057f == null) {
            c2462i2.f8057f = new C2461h(c2462i2);
        }
        c0793b.f3209g = c2462i2.f8057f;
        c0793b.f3210h = dialogInterfaceOnKeyListenerC2467n;
        View view = subMenuC2453F.f8079o;
        if (view != null) {
            c0793b.f3207e = view;
        } else {
            c0793b.f3205c = subMenuC2453F.f8078n;
            c0793b.f3206d = subMenuC2453F.f8077m;
        }
        c0793b.f3208f = dialogInterfaceOnKeyListenerC2467n;
        DialogC0797f m533a = c0169t.m533a();
        dialogInterfaceOnKeyListenerC2467n.f8090b = m533a;
        m533a.setOnDismissListener(dialogInterfaceOnKeyListenerC2467n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC2467n.f8090b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC2467n.f8090b.show();
        InterfaceC2478y interfaceC2478y = this.f8056e;
        if (interfaceC2478y == null) {
            return true;
        }
        interfaceC2478y.mo2227b(subMenuC2453F);
        return true;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: e */
    public final boolean mo4830e(C2468o c2468o) {
        return false;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: g */
    public final void mo4831g(Context context, MenuC2466m menuC2466m) {
        if (this.f8052a != null) {
            this.f8052a = context;
            if (this.f8053b == null) {
                this.f8053b = LayoutInflater.from(context);
            }
        }
        this.f8054c = menuC2466m;
        C2461h c2461h = this.f8057f;
        if (c2461h != null) {
            c2461h.notifyDataSetChanged();
        }
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: h */
    public final boolean mo4803h() {
        return false;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: i */
    public final void mo4804i() {
        C2461h c2461h = this.f8057f;
        if (c2461h != null) {
            c2461h.notifyDataSetChanged();
        }
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: k */
    public final void mo4805k(InterfaceC2478y interfaceC2478y) {
        throw null;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int r3, long j2) {
        this.f8054c.m4842q(this.f8057f.getItem(r3), this, 0);
    }
}
