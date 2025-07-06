package androidx.fragment.app;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;
import p012E.InterfaceMenuItemC0123a;
import p017G.C0140d;
import p079e.C0812u;
import p079e.LayoutInflaterFactory2C0815x;
import p102k.MenuItemC2473t;
import p112o.C2691k;

/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public abstract class AbstractC0656f {

    /* renamed from: a */
    public Object f2258a;

    /* renamed from: b */
    public Object f2259b;

    public AbstractC0656f(Context context) {
        this.f2258a = context;
    }

    /* renamed from: c */
    public void m1737c() {
        C0812u c0812u = (C0812u) this.f2258a;
        if (c0812u != null) {
            try {
                ((LayoutInflaterFactory2C0815x) this.f2259b).f3328k.unregisterReceiver(c0812u);
            } catch (IllegalArgumentException unused) {
            }
            this.f2258a = null;
        }
    }

    /* renamed from: d */
    public void m1738d() {
        C0649P c0649p = (C0649P) this.f2258a;
        HashSet hashSet = c0649p.f2211e;
        if (hashSet.remove((C0140d) this.f2259b) && hashSet.isEmpty()) {
            c0649p.m1728b();
        }
    }

    /* renamed from: e */
    public abstract IntentFilter mo1739e();

    /* renamed from: f */
    public abstract int mo1740f();

    /* renamed from: g */
    public MenuItem m1741g(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0123a)) {
            return menuItem;
        }
        InterfaceMenuItemC0123a interfaceMenuItemC0123a = (InterfaceMenuItemC0123a) menuItem;
        if (((C2691k) this.f2259b) == null) {
            this.f2259b = new C2691k();
        }
        MenuItem menuItem2 = (MenuItem) ((C2691k) this.f2259b).getOrDefault(interfaceMenuItemC0123a, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC2473t menuItemC2473t = new MenuItemC2473t((Context) this.f2258a, interfaceMenuItemC0123a);
        ((C2691k) this.f2259b).put(interfaceMenuItemC0123a, menuItemC2473t);
        return menuItemC2473t;
    }

    /* renamed from: h */
    public abstract void mo1742h();

    /* renamed from: i */
    public void m1743i() {
        m1737c();
        IntentFilter mo1739e = mo1739e();
        if (mo1739e.countActions() == 0) {
            return;
        }
        if (((C0812u) this.f2258a) == null) {
            this.f2258a = new C0812u(this);
        }
        ((LayoutInflaterFactory2C0815x) this.f2259b).f3328k.registerReceiver((C0812u) this.f2258a, mo1739e);
    }

    public AbstractC0656f(C0649P c0649p, C0140d c0140d) {
        this.f2258a = c0649p;
        this.f2259b = c0140d;
    }

    public AbstractC0656f(LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x) {
        this.f2259b = layoutInflaterFactory2C0815x;
    }
}
