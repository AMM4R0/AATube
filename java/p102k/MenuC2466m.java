package p102k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.AbstractC0000a;
import p028K.AbstractC0285S;
import p028K.AbstractC0287U;

/* renamed from: k.m */
/* loaded from: classes.dex */
public class MenuC2466m implements Menu {

    /* renamed from: y */
    public static final int[] f8064y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f8065a;

    /* renamed from: b */
    public final Resources f8066b;

    /* renamed from: c */
    public boolean f8067c;

    /* renamed from: d */
    public final boolean f8068d;

    /* renamed from: e */
    public InterfaceC2464k f8069e;

    /* renamed from: f */
    public final ArrayList f8070f;

    /* renamed from: g */
    public final ArrayList f8071g;

    /* renamed from: h */
    public boolean f8072h;

    /* renamed from: i */
    public final ArrayList f8073i;

    /* renamed from: j */
    public final ArrayList f8074j;

    /* renamed from: k */
    public boolean f8075k;

    /* renamed from: m */
    public CharSequence f8077m;

    /* renamed from: n */
    public Drawable f8078n;

    /* renamed from: o */
    public View f8079o;

    /* renamed from: v */
    public C2468o f8086v;

    /* renamed from: x */
    public boolean f8088x;

    /* renamed from: l */
    public int f8076l = 0;

    /* renamed from: p */
    public boolean f8080p = false;

    /* renamed from: q */
    public boolean f8081q = false;

    /* renamed from: r */
    public boolean f8082r = false;

    /* renamed from: s */
    public boolean f8083s = false;

    /* renamed from: t */
    public final ArrayList f8084t = new ArrayList();

    /* renamed from: u */
    public final CopyOnWriteArrayList f8085u = new CopyOnWriteArrayList();

    /* renamed from: w */
    public boolean f8087w = false;

    public MenuC2466m(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f8065a = context;
        Resources resources = context.getResources();
        this.f8066b = resources;
        this.f8070f = new ArrayList();
        this.f8071g = new ArrayList();
        this.f8072h = true;
        this.f8073i = new ArrayList();
        this.f8074j = new ArrayList();
        this.f8075k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC0287U.f848a;
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = AbstractC0285S.m784b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", ConstantDeviceInfo.APP_PLATFORM);
                z2 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z2) {
                z3 = true;
            }
        }
        this.f8068d = z3;
    }

    /* renamed from: a */
    public final C2468o m4834a(int r11, int r12, int r13, CharSequence charSequence) {
        int r122;
        int r02 = ((-65536) & r13) >> 16;
        if (r02 < 0 || r02 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int r03 = (f8064y[r02] << 16) | (65535 & r13);
        C2468o c2468o = new C2468o(this, r11, r12, r13, r03, charSequence, this.f8076l);
        ArrayList arrayList = this.f8070f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                r122 = 0;
                break;
            }
            if (((C2468o) arrayList.get(size)).f8098d <= r03) {
                r122 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(r122, c2468o);
        m4841p(true);
        return c2468o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m4834a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int r8, int r9, int r10, ComponentName componentName, Intent[] intentArr, Intent intent, int r14, MenuItem[] menuItemArr) {
        int r142;
        PackageManager packageManager = this.f8065a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((r14 & 1) == 0) {
            removeGroup(r8);
        }
        for (int r12 = 0; r12 < size; r12++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(r12);
            int r4 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(r4 < 0 ? intent : intentArr[r4]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C2468o m4834a = m4834a(r8, r9, r10, resolveInfo.loadLabel(packageManager));
            m4834a.setIcon(resolveInfo.loadIcon(packageManager));
            m4834a.f8101g = intent2;
            if (menuItemArr != null && (r142 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[r142] = m4834a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void m4835b(InterfaceC2479z interfaceC2479z, Context context) {
        this.f8085u.add(new WeakReference(interfaceC2479z));
        interfaceC2479z.mo4831g(context, this);
        this.f8075k = true;
    }

    /* renamed from: c */
    public final void m4836c(boolean z2) {
        if (this.f8083s) {
            return;
        }
        this.f8083s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8085u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2479z interfaceC2479z = (InterfaceC2479z) weakReference.get();
            if (interfaceC2479z == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC2479z.mo4801a(this, z2);
            }
        }
        this.f8083s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C2468o c2468o = this.f8086v;
        if (c2468o != null) {
            mo4814d(c2468o);
        }
        this.f8070f.clear();
        m4841p(true);
    }

    public final void clearHeader() {
        this.f8078n = null;
        this.f8077m = null;
        this.f8079o = null;
        m4841p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m4836c(true);
    }

    /* renamed from: d */
    public boolean mo4814d(C2468o c2468o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8085u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f8086v == c2468o) {
            m4848w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC2479z interfaceC2479z = (InterfaceC2479z) weakReference.get();
                if (interfaceC2479z == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = interfaceC2479z.mo4830e(c2468o);
                    if (z2) {
                        break;
                    }
                }
            }
            m4847v();
            if (z2) {
                this.f8086v = null;
            }
        }
        return z2;
    }

    /* renamed from: e */
    public boolean mo4815e(MenuC2466m menuC2466m, MenuItem menuItem) {
        InterfaceC2464k interfaceC2464k = this.f8069e;
        return interfaceC2464k != null && interfaceC2464k.mo2173d(menuC2466m, menuItem);
    }

    /* renamed from: f */
    public boolean mo4816f(C2468o c2468o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8085u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m4848w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2479z interfaceC2479z = (InterfaceC2479z) weakReference.get();
            if (interfaceC2479z == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = interfaceC2479z.mo4829c(c2468o);
                if (z2) {
                    break;
                }
            }
        }
        m4847v();
        if (z2) {
            this.f8086v = c2468o;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int r6) {
        MenuItem findItem;
        ArrayList arrayList = this.f8070f;
        int size = arrayList.size();
        for (int r2 = 0; r2 < size; r2++) {
            C2468o c2468o = (C2468o) arrayList.get(r2);
            if (c2468o.f8095a == r6) {
                return c2468o;
            }
            if (c2468o.hasSubMenu() && (findItem = c2468o.f8109o.findItem(r6)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C2468o m4837g(int r12, KeyEvent keyEvent) {
        ArrayList arrayList = this.f8084t;
        arrayList.clear();
        m4838h(arrayList, r12, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C2468o) arrayList.get(0);
        }
        boolean mo4820n = mo4820n();
        for (int r6 = 0; r6 < size; r6++) {
            C2468o c2468o = (C2468o) arrayList.get(r6);
            char c = mo4820n ? c2468o.f8104j : c2468o.f8102h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (mo4820n && c == '\b' && r12 == 67))) {
                return c2468o;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int r2) {
        return (MenuItem) this.f8070f.get(r2);
    }

    /* renamed from: h */
    public final void m4838h(ArrayList arrayList, int r18, KeyEvent keyEvent) {
        int r11;
        boolean mo4820n = mo4820n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || r18 == 67) {
            ArrayList arrayList2 = this.f8070f;
            int size = arrayList2.size();
            for (0; r11 < size; r11 + 1) {
                C2468o c2468o = (C2468o) arrayList2.get(r11);
                if (c2468o.hasSubMenu()) {
                    c2468o.f8109o.m4838h(arrayList, r18, keyEvent);
                }
                char c = mo4820n ? c2468o.f8104j : c2468o.f8102h;
                if ((modifiers & 69647) == ((mo4820n ? c2468o.f8105k : c2468o.f8103i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if (c != cArr[0] && c != cArr[2]) {
                        if (mo4820n && c == '\b') {
                            r11 = r18 != 67 ? r11 + 1 : 0;
                        }
                    }
                    if (c2468o.isEnabled()) {
                        arrayList.add(c2468o);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f8088x) {
            return true;
        }
        ArrayList arrayList = this.f8070f;
        int size = arrayList.size();
        for (int r4 = 0; r4 < size; r4++) {
            if (((C2468o) arrayList.get(r4)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m4839i() {
        ArrayList m4840l = m4840l();
        if (this.f8075k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f8085u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC2479z interfaceC2479z = (InterfaceC2479z) weakReference.get();
                if (interfaceC2479z == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= interfaceC2479z.mo4803h();
                }
            }
            ArrayList arrayList = this.f8073i;
            ArrayList arrayList2 = this.f8074j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = m4840l.size();
                for (int r5 = 0; r5 < size; r5++) {
                    C2468o c2468o = (C2468o) m4840l.get(r5);
                    if (c2468o.m4852f()) {
                        arrayList.add(c2468o);
                    } else {
                        arrayList2.add(c2468o);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m4840l());
            }
            this.f8075k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int r12, KeyEvent keyEvent) {
        return m4837g(r12, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo4817j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: l */
    public final ArrayList m4840l() {
        boolean z2 = this.f8072h;
        ArrayList arrayList = this.f8071g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f8070f;
        int size = arrayList2.size();
        for (int r4 = 0; r4 < size; r4++) {
            C2468o c2468o = (C2468o) arrayList2.get(r4);
            if (c2468o.isVisible()) {
                arrayList.add(c2468o);
            }
        }
        this.f8072h = false;
        this.f8075k = true;
        return arrayList;
    }

    /* renamed from: m */
    public boolean mo4819m() {
        return this.f8087w;
    }

    /* renamed from: n */
    public boolean mo4820n() {
        return this.f8067c;
    }

    /* renamed from: o */
    public boolean mo4821o() {
        return this.f8068d;
    }

    /* renamed from: p */
    public final void m4841p(boolean z2) {
        if (this.f8080p) {
            this.f8081q = true;
            if (z2) {
                this.f8082r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f8072h = true;
            this.f8075k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8085u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m4848w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2479z interfaceC2479z = (InterfaceC2479z) weakReference.get();
            if (interfaceC2479z == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC2479z.mo4804i();
            }
        }
        m4847v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int r2, int r3) {
        return m4842q(findItem(r2), null, r3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int r12, KeyEvent keyEvent, int r3) {
        C2468o m4837g = m4837g(r12, keyEvent);
        boolean m4842q = m4837g != null ? m4842q(m4837g, null, r3) : false;
        if ((r3 & 2) != 0) {
            m4836c(true);
        }
        return m4842q;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4842q(android.view.MenuItem r7, p102k.InterfaceC2479z r8, int r9) {
        /*
            r6 = this;
            k.o r7 = (p102k.C2468o) r7
            r0 = 0
            if (r7 == 0) goto Ld7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld7
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f8110p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L43
        L1a:
            k.m r1 = r7.f8108n
            boolean r3 = r1.mo4815e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f8101g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f8065a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            k.p r1 = r7.f8092A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f8121a
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L18
        L42:
            r1 = r0
        L43:
            k.p r3 = r7.f8092A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f8121a
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.m4851e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld6
            r6.m4836c(r2)
            goto Ld6
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld6
            r6.m4836c(r2)
            goto Ld6
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.m4836c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            k.F r9 = new k.F
            android.content.Context r5 = r6.f8065a
            r9.<init>(r5, r6, r7)
            r7.f8109o = r9
            java.lang.CharSequence r5 = r7.f8099e
            r9.setHeaderTitle(r5)
        L90:
            k.F r7 = r7.f8109o
            if (r4 == 0) goto L9e
            k.t r9 = r3.f8122b
            r9.getClass()
            android.view.ActionProvider r9 = r3.f8121a
            r9.onPrepareSubMenu(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f8085u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La7
            goto Ld0
        La7:
            if (r8 == 0) goto Lad
            boolean r0 = r8.mo4802d(r7)
        Lad:
            java.util.Iterator r8 = r9.iterator()
        Lb1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            k.z r4 = (p102k.InterfaceC2479z) r4
            if (r4 != 0) goto Lc9
            r9.remove(r3)
            goto Lb1
        Lc9:
            if (r0 != 0) goto Lb1
            boolean r0 = r4.mo4802d(r7)
            goto Lb1
        Ld0:
            r1 = r1 | r0
            if (r1 != 0) goto Ld6
            r6.m4836c(r2)
        Ld6:
            return r1
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p102k.MenuC2466m.m4842q(android.view.MenuItem, k.z, int):boolean");
    }

    /* renamed from: r */
    public final void m4843r(InterfaceC2479z interfaceC2479z) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8085u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2479z interfaceC2479z2 = (InterfaceC2479z) weakReference.get();
            if (interfaceC2479z2 == null || interfaceC2479z2 == interfaceC2479z) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int r7) {
        ArrayList arrayList = this.f8070f;
        int size = arrayList.size();
        int r2 = 0;
        int r3 = 0;
        while (true) {
            if (r3 >= size) {
                r3 = -1;
                break;
            } else if (((C2468o) arrayList.get(r3)).f8096b == r7) {
                break;
            } else {
                r3++;
            }
        }
        if (r3 >= 0) {
            int size2 = arrayList.size() - r3;
            while (true) {
                int r4 = r2 + 1;
                if (r2 >= size2 || ((C2468o) arrayList.get(r3)).f8096b != r7) {
                    break;
                }
                if (r3 >= 0) {
                    ArrayList arrayList2 = this.f8070f;
                    if (r3 < arrayList2.size()) {
                        arrayList2.remove(r3);
                    }
                }
                r2 = r4;
            }
            m4841p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int r5) {
        ArrayList arrayList = this.f8070f;
        int size = arrayList.size();
        int r2 = 0;
        while (true) {
            if (r2 >= size) {
                r2 = -1;
                break;
            } else if (((C2468o) arrayList.get(r2)).f8095a == r5) {
                break;
            } else {
                r2++;
            }
        }
        if (r2 >= 0) {
            ArrayList arrayList2 = this.f8070f;
            if (r2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(r2);
            m4841p(true);
        }
    }

    /* renamed from: s */
    public final void m4844s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo4817j());
        int size = this.f8070f.size();
        for (int r2 = 0; r2 < size; r2++) {
            MenuItem item = getItem(r2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC2453F) item.getSubMenu()).m4844s(bundle);
            }
        }
        int r8 = bundle.getInt("android:menu:expandedactionview");
        if (r8 <= 0 || (findItem = findItem(r8)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int r8, boolean z2, boolean z3) {
        ArrayList arrayList = this.f8070f;
        int size = arrayList.size();
        for (int r3 = 0; r3 < size; r3++) {
            C2468o c2468o = (C2468o) arrayList.get(r3);
            if (c2468o.f8096b == r8) {
                c2468o.f8118x = (c2468o.f8118x & (-5)) | (z3 ? 4 : 0);
                c2468o.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f8087w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int r6, boolean z2) {
        ArrayList arrayList = this.f8070f;
        int size = arrayList.size();
        for (int r2 = 0; r2 < size; r2++) {
            C2468o c2468o = (C2468o) arrayList.get(r2);
            if (c2468o.f8096b == r6) {
                c2468o.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int r11, boolean z2) {
        ArrayList arrayList = this.f8070f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int r3 = 0; r3 < size; r3++) {
            C2468o c2468o = (C2468o) arrayList.get(r3);
            if (c2468o.f8096b == r11) {
                int r7 = c2468o.f8118x;
                int r8 = (r7 & (-9)) | (z2 ? 0 : 8);
                c2468o.f8118x = r8;
                if (r7 != r8) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            m4841p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f8067c = z2;
        m4841p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f8070f.size();
    }

    /* renamed from: t */
    public final void m4845t(Bundle bundle) {
        int size = this.f8070f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int r2 = 0; r2 < size; r2++) {
            MenuItem item = getItem(r2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC2453F) item.getSubMenu()).m4845t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo4817j(), sparseArray);
        }
    }

    /* renamed from: u */
    public final void m4846u(int r2, CharSequence charSequence, int r4, Drawable drawable, View view) {
        if (view != null) {
            this.f8079o = view;
            this.f8077m = null;
            this.f8078n = null;
        } else {
            if (r2 > 0) {
                this.f8077m = this.f8066b.getText(r2);
            } else if (charSequence != null) {
                this.f8077m = charSequence;
            }
            if (r4 > 0) {
                this.f8078n = AbstractC0000a.m1b(this.f8065a, r4);
            } else if (drawable != null) {
                this.f8078n = drawable;
            }
            this.f8079o = null;
        }
        m4841p(false);
    }

    /* renamed from: v */
    public final void m4847v() {
        this.f8080p = false;
        if (this.f8081q) {
            this.f8081q = false;
            m4841p(this.f8082r);
        }
    }

    /* renamed from: w */
    public final void m4848w() {
        if (this.f8080p) {
            return;
        }
        this.f8080p = true;
        this.f8081q = false;
        this.f8082r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2) {
        return m4834a(0, 0, 0, this.f8066b.getString(r2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2) {
        return addSubMenu(0, 0, 0, this.f8066b.getString(r2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int r12, int r2, int r3, CharSequence charSequence) {
        return m4834a(r12, r2, r3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r12, int r2, int r3, CharSequence charSequence) {
        C2468o m4834a = m4834a(r12, r2, r3, charSequence);
        SubMenuC2453F subMenuC2453F = new SubMenuC2453F(this.f8065a, this, m4834a);
        m4834a.f8109o = subMenuC2453F;
        subMenuC2453F.setHeaderTitle(m4834a.f8099e);
        return subMenuC2453F;
    }

    @Override // android.view.Menu
    public final MenuItem add(int r2, int r3, int r4, int r5) {
        return m4834a(r2, r3, r4, this.f8066b.getString(r5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
        return addSubMenu(r2, r3, r4, this.f8066b.getString(r5));
    }

    /* renamed from: k */
    public MenuC2466m mo4818k() {
        return this;
    }
}
