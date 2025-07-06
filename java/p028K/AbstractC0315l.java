package p028K;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: K.l */
/* loaded from: classes.dex */
public abstract class AbstractC0315l {
    /* renamed from: a */
    public static int m878a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* renamed from: b */
    public static CharSequence m879b(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* renamed from: c */
    public static ColorStateList m880c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* renamed from: d */
    public static PorterDuff.Mode m881d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    /* renamed from: e */
    public static int m882e(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* renamed from: f */
    public static CharSequence m883f(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* renamed from: g */
    public static MenuItem m884g(MenuItem menuItem, char c, int r2) {
        return menuItem.setAlphabeticShortcut(c, r2);
    }

    /* renamed from: h */
    public static MenuItem m885h(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* renamed from: i */
    public static MenuItem m886i(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* renamed from: j */
    public static MenuItem m887j(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* renamed from: k */
    public static MenuItem m888k(MenuItem menuItem, char c, int r2) {
        return menuItem.setNumericShortcut(c, r2);
    }

    /* renamed from: l */
    public static MenuItem m889l(MenuItem menuItem, char c, char c2, int r3, int r4) {
        return menuItem.setShortcut(c, c2, r3, r4);
    }

    /* renamed from: m */
    public static MenuItem m890m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
