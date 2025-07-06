package p012E;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p102k.ActionProviderVisibilityListenerC2469p;

/* renamed from: E.a */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC0123a extends MenuItem {
    /* renamed from: a */
    InterfaceMenuItemC0123a mo421a(ActionProviderVisibilityListenerC2469p actionProviderVisibilityListenerC2469p);

    /* renamed from: b */
    ActionProviderVisibilityListenerC2469p mo422b();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c, int r2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0123a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c, int r2);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c, char c2, int r3, int r4);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0123a setTooltipText(CharSequence charSequence);
}
