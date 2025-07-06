package p102k;

import android.view.MenuItem;

/* renamed from: k.s */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC2472s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final MenuItem.OnMenuItemClickListener f8127a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC2473t f8128b;

    public MenuItemOnMenuItemClickListenerC2472s(MenuItemC2473t menuItemC2473t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8128b = menuItemC2473t;
        this.f8127a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f8127a.onMenuItemClick(this.f8128b.m1741g(menuItem));
    }
}
