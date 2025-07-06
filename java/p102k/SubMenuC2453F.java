package p102k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000A.AbstractC0002c;

/* renamed from: k.F */
/* loaded from: classes.dex */
public final class SubMenuC2453F extends MenuC2466m implements SubMenu {

    /* renamed from: A */
    public final C2468o f7996A;

    /* renamed from: z */
    public final MenuC2466m f7997z;

    public SubMenuC2453F(Context context, MenuC2466m menuC2466m, C2468o c2468o) {
        super(context);
        this.f7997z = menuC2466m;
        this.f7996A = c2468o;
    }

    @Override // p102k.MenuC2466m
    /* renamed from: d */
    public final boolean mo4814d(C2468o c2468o) {
        return this.f7997z.mo4814d(c2468o);
    }

    @Override // p102k.MenuC2466m
    /* renamed from: e */
    public final boolean mo4815e(MenuC2466m menuC2466m, MenuItem menuItem) {
        return super.mo4815e(menuC2466m, menuItem) || this.f7997z.mo4815e(menuC2466m, menuItem);
    }

    @Override // p102k.MenuC2466m
    /* renamed from: f */
    public final boolean mo4816f(C2468o c2468o) {
        return this.f7997z.mo4816f(c2468o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f7996A;
    }

    @Override // p102k.MenuC2466m
    /* renamed from: j */
    public final String mo4817j() {
        C2468o c2468o = this.f7996A;
        int r02 = c2468o != null ? c2468o.f8095a : 0;
        if (r02 == 0) {
            return null;
        }
        return AbstractC0002c.m11f(r02, "android:menu:actionviewstates:");
    }

    @Override // p102k.MenuC2466m
    /* renamed from: k */
    public final MenuC2466m mo4818k() {
        return this.f7997z.mo4818k();
    }

    @Override // p102k.MenuC2466m
    /* renamed from: m */
    public final boolean mo4819m() {
        return this.f7997z.mo4819m();
    }

    @Override // p102k.MenuC2466m
    /* renamed from: n */
    public final boolean mo4820n() {
        return this.f7997z.mo4820n();
    }

    @Override // p102k.MenuC2466m
    /* renamed from: o */
    public final boolean mo4821o() {
        return this.f7997z.mo4821o();
    }

    @Override // p102k.MenuC2466m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f7997z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m4846u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m4846u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m4846u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f7996A.setIcon(drawable);
        return this;
    }

    @Override // p102k.MenuC2466m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f7997z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int r7) {
        m4846u(0, null, r7, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int r7) {
        m4846u(r7, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int r2) {
        this.f7996A.setIcon(r2);
        return this;
    }
}
