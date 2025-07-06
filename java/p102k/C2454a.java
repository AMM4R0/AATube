package p102k;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000A.AbstractC0000a;
import p009D.AbstractC0095a;
import p012E.InterfaceMenuItemC0123a;

/* renamed from: k.a */
/* loaded from: classes.dex */
public final class C2454a implements InterfaceMenuItemC0123a {

    /* renamed from: a */
    public CharSequence f7998a;

    /* renamed from: b */
    public CharSequence f7999b;

    /* renamed from: c */
    public Intent f8000c;

    /* renamed from: d */
    public char f8001d;

    /* renamed from: e */
    public int f8002e;

    /* renamed from: f */
    public char f8003f;

    /* renamed from: g */
    public int f8004g;

    /* renamed from: h */
    public Drawable f8005h;

    /* renamed from: i */
    public Context f8006i;

    /* renamed from: j */
    public CharSequence f8007j;

    /* renamed from: k */
    public CharSequence f8008k;

    /* renamed from: l */
    public ColorStateList f8009l;

    /* renamed from: m */
    public PorterDuff.Mode f8010m;

    /* renamed from: n */
    public boolean f8011n;

    /* renamed from: o */
    public boolean f8012o;

    /* renamed from: p */
    public int f8013p;

    @Override // p012E.InterfaceMenuItemC0123a
    /* renamed from: a */
    public final InterfaceMenuItemC0123a mo421a(ActionProviderVisibilityListenerC2469p actionProviderVisibilityListenerC2469p) {
        throw new UnsupportedOperationException();
    }

    @Override // p012E.InterfaceMenuItemC0123a
    /* renamed from: b */
    public final ActionProviderVisibilityListenerC2469p mo422b() {
        return null;
    }

    /* renamed from: c */
    public final void m4822c() {
        Drawable drawable = this.f8005h;
        if (drawable != null) {
            if (this.f8011n || this.f8012o) {
                this.f8005h = drawable;
                Drawable mutate = drawable.mutate();
                this.f8005h = mutate;
                if (this.f8011n) {
                    AbstractC0095a.m319h(mutate, this.f8009l);
                }
                if (this.f8012o) {
                    AbstractC0095a.m320i(this.f8005h, this.f8010m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f8004g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f8003f;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f8007j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f8005h;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f8009l;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f8010m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f8000c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f8002e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f8001d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f7998a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f7999b;
        return charSequence != null ? charSequence : this.f7998a;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f8008k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f8013p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f8013p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f8013p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f8013p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f8003f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f8013p = (z2 ? 1 : 0) | (this.f8013p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f8013p = (z2 ? 2 : 0) | (this.f8013p & (-3));
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final InterfaceMenuItemC0123a setContentDescription(CharSequence charSequence) {
        this.f8007j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f8013p = (z2 ? 16 : 0) | (this.f8013p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f8005h = drawable;
        m4822c();
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8009l = colorStateList;
        this.f8011n = true;
        m4822c();
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8010m = mode;
        this.f8012o = true;
        m4822c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f8000c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f8001d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f8001d = c;
        this.f8003f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f7998a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7999b = charSequence;
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final InterfaceMenuItemC0123a setTooltipText(CharSequence charSequence) {
        this.f8008k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f8013p = (this.f8013p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int r12) {
        throw new UnsupportedOperationException();
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int r2) {
        this.f8003f = Character.toLowerCase(c);
        this.f8004g = KeyEvent.normalizeMetaState(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f8007j = charSequence;
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int r2) {
        this.f8001d = c;
        this.f8002e = KeyEvent.normalizeMetaState(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int r2) {
        this.f7998a = this.f8006i.getResources().getString(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f8008k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int r2) {
        this.f8005h = AbstractC0000a.m1b(this.f8006i, r2);
        m4822c();
        return this;
    }

    @Override // p012E.InterfaceMenuItemC0123a, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int r3, int r4) {
        this.f8001d = c;
        this.f8002e = KeyEvent.normalizeMetaState(r3);
        this.f8003f = Character.toLowerCase(c2);
        this.f8004g = KeyEvent.normalizeMetaState(r4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r12) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int r12) {
        return this;
    }
}
