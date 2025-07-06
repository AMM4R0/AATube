package p102k;

import android.view.MenuItem;

/* renamed from: k.r */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC2471r implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    public final MenuItem.OnActionExpandListener f8125a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC2473t f8126b;

    public MenuItemOnActionExpandListenerC2471r(MenuItemC2473t menuItemC2473t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8126b = menuItemC2473t;
        this.f8125a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f8125a.onMenuItemActionCollapse(this.f8126b.m1741g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f8125a.onMenuItemActionExpand(this.f8126b.m1741g(menuItem));
    }
}
