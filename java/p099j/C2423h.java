package p099j;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p012E.InterfaceMenuItemC0123a;
import p028K.AbstractC0315l;
import p102k.ActionProviderVisibilityListenerC2469p;
import p102k.C2468o;
import p102k.MenuItemC2473t;

/* renamed from: j.h */
/* loaded from: classes.dex */
public final class C2423h {

    /* renamed from: A */
    public CharSequence f7838A;

    /* renamed from: B */
    public CharSequence f7839B;

    /* renamed from: E */
    public final /* synthetic */ C2424i f7842E;

    /* renamed from: a */
    public final Menu f7843a;

    /* renamed from: h */
    public boolean f7850h;

    /* renamed from: i */
    public int f7851i;

    /* renamed from: j */
    public int f7852j;

    /* renamed from: k */
    public CharSequence f7853k;

    /* renamed from: l */
    public CharSequence f7854l;

    /* renamed from: m */
    public int f7855m;

    /* renamed from: n */
    public char f7856n;

    /* renamed from: o */
    public int f7857o;

    /* renamed from: p */
    public char f7858p;

    /* renamed from: q */
    public int f7859q;

    /* renamed from: r */
    public int f7860r;

    /* renamed from: s */
    public boolean f7861s;

    /* renamed from: t */
    public boolean f7862t;

    /* renamed from: u */
    public boolean f7863u;

    /* renamed from: v */
    public int f7864v;

    /* renamed from: w */
    public int f7865w;

    /* renamed from: x */
    public String f7866x;

    /* renamed from: y */
    public String f7867y;

    /* renamed from: z */
    public ActionProviderVisibilityListenerC2469p f7868z;

    /* renamed from: C */
    public ColorStateList f7840C = null;

    /* renamed from: D */
    public PorterDuff.Mode f7841D = null;

    /* renamed from: b */
    public int f7844b = 0;

    /* renamed from: c */
    public int f7845c = 0;

    /* renamed from: d */
    public int f7846d = 0;

    /* renamed from: e */
    public int f7847e = 0;

    /* renamed from: f */
    public boolean f7848f = true;

    /* renamed from: g */
    public boolean f7849g = true;

    public C2423h(C2424i c2424i, Menu menu) {
        this.f7842E = c2424i;
        this.f7843a = menu;
    }

    /* renamed from: a */
    public final Object m4778a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f7842E.f7873c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    /* renamed from: b */
    public final void m4779b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f7861s).setVisible(this.f7862t).setEnabled(this.f7863u).setCheckable(this.f7860r >= 1).setTitleCondensed(this.f7854l).setIcon(this.f7855m);
        int r02 = this.f7864v;
        if (r02 >= 0) {
            menuItem.setShowAsAction(r02);
        }
        String str = this.f7867y;
        C2424i c2424i = this.f7842E;
        if (str != null) {
            if (c2424i.f7873c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c2424i.f7874d == null) {
                c2424i.f7874d = C2424i.m4780a(c2424i.f7873c);
            }
            Object obj = c2424i.f7874d;
            String str2 = this.f7867y;
            MenuItemOnMenuItemClickListenerC2422g menuItemOnMenuItemClickListenerC2422g = new MenuItemOnMenuItemClickListenerC2422g();
            menuItemOnMenuItemClickListenerC2422g.f7836a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC2422g.f7837b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC2422g.f7835c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC2422g);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f7860r >= 2) {
            if (menuItem instanceof C2468o) {
                C2468o c2468o = (C2468o) menuItem;
                c2468o.f8118x = (c2468o.f8118x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC2473t) {
                MenuItemC2473t menuItemC2473t = (MenuItemC2473t) menuItem;
                try {
                    Method method = menuItemC2473t.f8130d;
                    InterfaceMenuItemC0123a interfaceMenuItemC0123a = menuItemC2473t.f8129c;
                    if (method == null) {
                        menuItemC2473t.f8130d = interfaceMenuItemC0123a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC2473t.f8130d.invoke(interfaceMenuItemC0123a, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f7866x;
        if (str3 != null) {
            menuItem.setActionView((View) m4778a(str3, C2424i.f7869e, c2424i.f7871a));
            z2 = true;
        }
        int r03 = this.f7865w;
        if (r03 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(r03);
            }
        }
        ActionProviderVisibilityListenerC2469p actionProviderVisibilityListenerC2469p = this.f7868z;
        if (actionProviderVisibilityListenerC2469p != null) {
            if (menuItem instanceof InterfaceMenuItemC0123a) {
                ((InterfaceMenuItemC0123a) menuItem).mo421a(actionProviderVisibilityListenerC2469p);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f7838A;
        boolean z3 = menuItem instanceof InterfaceMenuItemC0123a;
        if (z3) {
            ((InterfaceMenuItemC0123a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0315l.m885h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f7839B;
        if (z3) {
            ((InterfaceMenuItemC0123a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0315l.m890m(menuItem, charSequence2);
        }
        char c = this.f7856n;
        int r3 = this.f7857o;
        if (z3) {
            ((InterfaceMenuItemC0123a) menuItem).setAlphabeticShortcut(c, r3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0315l.m884g(menuItem, c, r3);
        }
        char c2 = this.f7858p;
        int r32 = this.f7859q;
        if (z3) {
            ((InterfaceMenuItemC0123a) menuItem).setNumericShortcut(c2, r32);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0315l.m888k(menuItem, c2, r32);
        }
        PorterDuff.Mode mode = this.f7841D;
        if (mode != null) {
            if (z3) {
                ((InterfaceMenuItemC0123a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0315l.m887j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f7840C;
        if (colorStateList != null) {
            if (z3) {
                ((InterfaceMenuItemC0123a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0315l.m886i(menuItem, colorStateList);
            }
        }
    }
}
