package p102k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.fragment.app.AbstractC0656f;
import p012E.InterfaceMenuItemC0123a;
import p112o.C2691k;

/* renamed from: k.C */
/* loaded from: classes.dex */
public class MenuC2450C extends AbstractC0656f implements Menu {

    /* renamed from: c */
    public final MenuC2466m f7976c;

    public MenuC2450C(Context context, MenuC2466m menuC2466m) {
        super(context);
        if (menuC2466m == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f7976c = menuC2466m;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1741g(this.f7976c.m4834a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int r13, int r14, int r15, ComponentName componentName, Intent[] intentArr, Intent intent, int r19, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f7976c.addIntentOptions(r13, r14, r15, componentName, intentArr, intent, r19, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int r5 = 0; r5 < length; r5++) {
                menuItemArr[r5] = m1741g(menuItemArr2[r5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f7976c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C2691k c2691k = (C2691k) this.f2259b;
        if (c2691k != null) {
            c2691k.clear();
        }
        this.f7976c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f7976c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int r2) {
        return m1741g(this.f7976c.findItem(r2));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int r2) {
        return m1741g(this.f7976c.getItem(r2));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f7976c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int r2, KeyEvent keyEvent) {
        return this.f7976c.isShortcutKey(r2, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int r2, int r3) {
        return this.f7976c.performIdentifierAction(r2, r3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int r2, KeyEvent keyEvent, int r4) {
        return this.f7976c.performShortcut(r2, keyEvent, r4);
    }

    @Override // android.view.Menu
    public final void removeGroup(int r4) {
        if (((C2691k) this.f2259b) != null) {
            int r02 = 0;
            while (true) {
                C2691k c2691k = (C2691k) this.f2259b;
                if (r02 >= c2691k.f8683c) {
                    break;
                }
                if (((InterfaceMenuItemC0123a) c2691k.m5179h(r02)).getGroupId() == r4) {
                    ((C2691k) this.f2259b).m5180i(r02);
                    r02--;
                }
                r02++;
            }
        }
        this.f7976c.removeGroup(r4);
    }

    @Override // android.view.Menu
    public final void removeItem(int r4) {
        if (((C2691k) this.f2259b) != null) {
            int r02 = 0;
            while (true) {
                C2691k c2691k = (C2691k) this.f2259b;
                if (r02 >= c2691k.f8683c) {
                    break;
                }
                if (((InterfaceMenuItemC0123a) c2691k.m5179h(r02)).getItemId() == r4) {
                    ((C2691k) this.f2259b).m5180i(r02);
                    break;
                }
                r02++;
            }
        }
        this.f7976c.removeItem(r4);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int r2, boolean z2, boolean z3) {
        this.f7976c.setGroupCheckable(r2, z2, z3);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int r2, boolean z2) {
        this.f7976c.setGroupEnabled(r2, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int r2, boolean z2) {
        this.f7976c.setGroupVisible(r2, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f7976c.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f7976c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2) {
        return this.f7976c.addSubMenu(r2);
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2) {
        return m1741g(this.f7976c.add(r2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2, int r3, int r4, CharSequence charSequence) {
        return this.f7976c.addSubMenu(r2, r3, r4, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2, int r3, int r4, CharSequence charSequence) {
        return m1741g(this.f7976c.m4834a(r2, r3, r4, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
        return this.f7976c.addSubMenu(r2, r3, r4, r5);
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2, int r3, int r4, int r5) {
        return m1741g(this.f7976c.add(r2, r3, r4, r5));
    }
}
