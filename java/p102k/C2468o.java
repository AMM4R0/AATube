package p102k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0580g;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import io.appmetrica.analytics.coreutils.internal.p097io.Base64Utils;
import java.util.ArrayList;
import p006C.C0055g;
import p009D.AbstractC0095a;
import p012E.InterfaceMenuItemC0123a;

/* renamed from: k.o */
/* loaded from: classes.dex */
public final class C2468o implements InterfaceMenuItemC0123a {

    /* renamed from: A */
    public ActionProviderVisibilityListenerC2469p f8092A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f8093B;

    /* renamed from: a */
    public final int f8095a;

    /* renamed from: b */
    public final int f8096b;

    /* renamed from: c */
    public final int f8097c;

    /* renamed from: d */
    public final int f8098d;

    /* renamed from: e */
    public CharSequence f8099e;

    /* renamed from: f */
    public CharSequence f8100f;

    /* renamed from: g */
    public Intent f8101g;

    /* renamed from: h */
    public char f8102h;

    /* renamed from: j */
    public char f8104j;

    /* renamed from: l */
    public Drawable f8106l;

    /* renamed from: n */
    public final MenuC2466m f8108n;

    /* renamed from: o */
    public SubMenuC2453F f8109o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f8110p;

    /* renamed from: q */
    public CharSequence f8111q;

    /* renamed from: r */
    public CharSequence f8112r;

    /* renamed from: y */
    public int f8119y;

    /* renamed from: z */
    public View f8120z;

    /* renamed from: i */
    public int f8103i = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: k */
    public int f8105k = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: m */
    public int f8107m = 0;

    /* renamed from: s */
    public ColorStateList f8113s = null;

    /* renamed from: t */
    public PorterDuff.Mode f8114t = null;

    /* renamed from: u */
    public boolean f8115u = false;

    /* renamed from: v */
    public boolean f8116v = false;

    /* renamed from: w */
    public boolean f8117w = false;

    /* renamed from: x */
    public int f8118x = 16;

    /* renamed from: C */
    public boolean f8094C = false;

    public C2468o(MenuC2466m menuC2466m, int r4, int r5, int r6, int r7, CharSequence charSequence, int r9) {
        this.f8108n = menuC2466m;
        this.f8095a = r5;
        this.f8096b = r4;
        this.f8097c = r6;
        this.f8098d = r7;
        this.f8099e = charSequence;
        this.f8119y = r9;
    }

    /* renamed from: c */
    public static void m4849c(int r02, int r12, String str, StringBuilder sb) {
        if ((r02 & r12) == r12) {
            sb.append(str);
        }
    }

    @Override // p012E.InterfaceMenuItemC0123a
    /* renamed from: a */
    public final InterfaceMenuItemC0123a mo421a(ActionProviderVisibilityListenerC2469p actionProviderVisibilityListenerC2469p) {
        this.f8120z = null;
        this.f8092A = actionProviderVisibilityListenerC2469p;
        this.f8108n.m4841p(true);
        ActionProviderVisibilityListenerC2469p actionProviderVisibilityListenerC2469p2 = this.f8092A;
        if (actionProviderVisibilityListenerC2469p2 != null) {
            actionProviderVisibilityListenerC2469p2.f8123c = new C0055g(29, this);
            actionProviderVisibilityListenerC2469p2.f8121a.setVisibilityListener(actionProviderVisibilityListenerC2469p2);
        }
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0123a
    /* renamed from: b */
    public final ActionProviderVisibilityListenerC2469p mo422b() {
        return this.f8092A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f8119y & 8) == 0) {
            return false;
        }
        if (this.f8120z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f8093B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f8108n.mo4814d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m4850d(Drawable drawable) {
        if (drawable != null && this.f8117w && (this.f8115u || this.f8116v)) {
            drawable = drawable.mutate();
            if (this.f8115u) {
                AbstractC0095a.m319h(drawable, this.f8113s);
            }
            if (this.f8116v) {
                AbstractC0095a.m320i(drawable, this.f8114t);
            }
            this.f8117w = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public final boolean m4851e() {
        ActionProviderVisibilityListenerC2469p actionProviderVisibilityListenerC2469p;
        if ((this.f8119y & 8) == 0) {
            return false;
        }
        if (this.f8120z == null && (actionProviderVisibilityListenerC2469p = this.f8092A) != null) {
            this.f8120z = actionProviderVisibilityListenerC2469p.m4854a(this);
        }
        return this.f8120z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m4851e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f8093B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f8108n.mo4816f(this);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m4852f() {
        return (this.f8118x & 32) == 32;
    }

    /* renamed from: g */
    public final void m4853g(boolean z2) {
        if (z2) {
            this.f8118x |= 32;
        } else {
            this.f8118x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f8120z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC2469p actionProviderVisibilityListenerC2469p = this.f8092A;
        if (actionProviderVisibilityListenerC2469p == null) {
            return null;
        }
        View m4854a = actionProviderVisibilityListenerC2469p.m4854a(this);
        this.f8120z = m4854a;
        return m4854a;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f8105k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f8104j;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f8111q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f8096b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f8106l;
        if (drawable != null) {
            return m4850d(drawable);
        }
        int r02 = this.f8107m;
        if (r02 == 0) {
            return null;
        }
        Drawable m1449n = AbstractC0580g.m1449n(this.f8108n.f8065a, r02);
        this.f8107m = 0;
        this.f8106l = m1449n;
        return m4850d(m1449n);
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f8113s;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f8114t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f8101g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f8095a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f8103i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f8102h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f8097c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f8109o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f8099e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8100f;
        return charSequence != null ? charSequence : this.f8099e;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f8112r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f8109o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f8094C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f8118x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f8118x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f8118x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC2469p actionProviderVisibilityListenerC2469p = this.f8092A;
        return (actionProviderVisibilityListenerC2469p == null || !actionProviderVisibilityListenerC2469p.f8121a.overridesItemVisibility()) ? (this.f8118x & 8) == 0 : (this.f8118x & 8) == 0 && this.f8092A.f8121a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int r02;
        this.f8120z = view;
        this.f8092A = null;
        if (view != null && view.getId() == -1 && (r02 = this.f8095a) > 0) {
            view.setId(r02);
        }
        MenuC2466m menuC2466m = this.f8108n;
        menuC2466m.f8075k = true;
        menuC2466m.m4841p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f8104j == c) {
            return this;
        }
        this.f8104j = Character.toLowerCase(c);
        this.f8108n.m4841p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int r02 = this.f8118x;
        int r3 = (z2 ? 1 : 0) | (r02 & (-2));
        this.f8118x = r3;
        if (r02 != r3) {
            this.f8108n.m4841p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int r02 = this.f8118x;
        if ((r02 & 4) != 0) {
            MenuC2466m menuC2466m = this.f8108n;
            menuC2466m.getClass();
            ArrayList arrayList = menuC2466m.f8070f;
            int size = arrayList.size();
            menuC2466m.m4848w();
            for (int r4 = 0; r4 < size; r4++) {
                C2468o c2468o = (C2468o) arrayList.get(r4);
                if (c2468o.f8096b == this.f8096b && (c2468o.f8118x & 4) != 0 && c2468o.isCheckable()) {
                    boolean z3 = c2468o == this;
                    int r7 = c2468o.f8118x;
                    int r6 = (z3 ? 2 : 0) | (r7 & (-3));
                    c2468o.f8118x = r6;
                    if (r7 != r6) {
                        c2468o.f8108n.m4841p(false);
                    }
                }
            }
            menuC2466m.m4847v();
        } else {
            int r10 = (r02 & (-3)) | (z2 ? 2 : 0);
            this.f8118x = r10;
            if (r02 != r10) {
                this.f8108n.m4841p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f8118x |= 16;
        } else {
            this.f8118x &= -17;
        }
        this.f8108n.m4841p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f8107m = 0;
        this.f8106l = drawable;
        this.f8117w = true;
        this.f8108n.m4841p(false);
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8113s = colorStateList;
        this.f8115u = true;
        this.f8117w = true;
        this.f8108n.m4841p(false);
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8114t = mode;
        this.f8116v = true;
        this.f8117w = true;
        this.f8108n.m4841p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f8101g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f8102h == c) {
            return this;
        }
        this.f8102h = c;
        this.f8108n.m4841p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8093B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8110p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f8102h = c;
        this.f8104j = Character.toLowerCase(c2);
        this.f8108n.m4841p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r4) {
        int r02 = r4 & 3;
        if (r02 != 0 && r02 != 1 && r02 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f8119y = r4;
        MenuC2466m menuC2466m = this.f8108n;
        menuC2466m.f8075k = true;
        menuC2466m.m4841p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int r12) {
        setShowAsAction(r12);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8099e = charSequence;
        this.f8108n.m4841p(false);
        SubMenuC2453F subMenuC2453F = this.f8109o;
        if (subMenuC2453F != null) {
            subMenuC2453F.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8100f = charSequence;
        this.f8108n.m4841p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int r02 = this.f8118x;
        int r3 = (z2 ? 0 : 8) | (r02 & (-9));
        this.f8118x = r3;
        if (r02 != r3) {
            MenuC2466m menuC2466m = this.f8108n;
            menuC2466m.f8072h = true;
            menuC2466m.m4841p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f8099e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final InterfaceMenuItemC0123a setContentDescription(CharSequence charSequence) {
        this.f8111q = charSequence;
        this.f8108n.m4841p(false);
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final InterfaceMenuItemC0123a setTooltipText(CharSequence charSequence) {
        this.f8112r = charSequence;
        this.f8108n.m4841p(false);
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int r3) {
        if (this.f8104j == c && this.f8105k == r3) {
            return this;
        }
        this.f8104j = Character.toLowerCase(c);
        this.f8105k = KeyEvent.normalizeMetaState(r3);
        this.f8108n.m4841p(false);
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int r3) {
        if (this.f8102h == c && this.f8103i == r3) {
            return this;
        }
        this.f8102h = c;
        this.f8103i = KeyEvent.normalizeMetaState(r3);
        this.f8108n.m4841p(false);
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int r3, int r4) {
        this.f8102h = c;
        this.f8103i = KeyEvent.normalizeMetaState(r3);
        this.f8104j = Character.toLowerCase(c2);
        this.f8105k = KeyEvent.normalizeMetaState(r4);
        this.f8108n.m4841p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int r2) {
        this.f8106l = null;
        this.f8107m = r2;
        this.f8117w = true;
        this.f8108n.m4841p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int r2) {
        setTitle(this.f8108n.f8065a.getString(r2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int r4) {
        int r02;
        Context context = this.f8108n.f8065a;
        View inflate = LayoutInflater.from(context).inflate(r4, (ViewGroup) new LinearLayout(context), false);
        this.f8120z = inflate;
        this.f8092A = null;
        if (inflate != null && inflate.getId() == -1 && (r02 = this.f8095a) > 0) {
            inflate.setId(r02);
        }
        MenuC2466m menuC2466m = this.f8108n;
        menuC2466m.f8075k = true;
        menuC2466m.m4841p(true);
        return this;
    }
}
