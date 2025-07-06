package p079e;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractC0656f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p002A1.C0015h;
import p017G.C0144h;
import p017G.InterfaceC0146j;
import p028K.AbstractC0272E;
import p028K.AbstractC0283P;
import p028K.C0291Y;
import p036M1.AbstractC0387m;
import p076d.AbstractC0780a;
import p099j.AbstractC2416a;
import p099j.C2419d;
import p099j.C2424i;
import p102k.C2462i;
import p102k.C2468o;
import p102k.InterfaceC2464k;
import p102k.MenuC2466m;
import p104l.AbstractC2502A1;
import p104l.C2567f;
import p104l.C2582k;
import p104l.C2596o1;
import p104l.C2609t;
import p104l.C2611t1;
import p104l.InterfaceC2592n0;
import p104l.InterfaceC2595o0;
import p112o.C2691k;

/* renamed from: e.x */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0815x extends AbstractC0802k implements InterfaceC2464k, LayoutInflater.Factory2 {

    /* renamed from: h0 */
    public static final C2691k f3290h0 = new C2691k();

    /* renamed from: i0 */
    public static final int[] f3291i0 = {R.attr.windowBackground};

    /* renamed from: j0 */
    public static final boolean f3292j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: k0 */
    public static final boolean f3293k0 = true;

    /* renamed from: A */
    public ViewGroup f3294A;

    /* renamed from: B */
    public TextView f3295B;

    /* renamed from: C */
    public View f3296C;

    /* renamed from: D */
    public boolean f3297D;

    /* renamed from: E */
    public boolean f3298E;

    /* renamed from: F */
    public boolean f3299F;

    /* renamed from: G */
    public boolean f3300G;

    /* renamed from: H */
    public boolean f3301H;

    /* renamed from: I */
    public boolean f3302I;

    /* renamed from: J */
    public boolean f3303J;

    /* renamed from: K */
    public boolean f3304K;

    /* renamed from: L */
    public C0814w[] f3305L;

    /* renamed from: M */
    public C0814w f3306M;

    /* renamed from: N */
    public boolean f3307N;

    /* renamed from: O */
    public boolean f3308O;

    /* renamed from: P */
    public boolean f3309P;

    /* renamed from: Q */
    public boolean f3310Q;

    /* renamed from: R */
    public Configuration f3311R;

    /* renamed from: S */
    public final int f3312S;

    /* renamed from: T */
    public int f3313T;

    /* renamed from: U */
    public int f3314U;

    /* renamed from: V */
    public boolean f3315V;

    /* renamed from: W */
    public C0811t f3316W;

    /* renamed from: X */
    public C0811t f3317X;

    /* renamed from: Y */
    public boolean f3318Y;

    /* renamed from: Z */
    public int f3319Z;

    /* renamed from: b0 */
    public boolean f3321b0;

    /* renamed from: c0 */
    public Rect f3322c0;

    /* renamed from: d0 */
    public Rect f3323d0;

    /* renamed from: e0 */
    public C0783A f3324e0;

    /* renamed from: f0 */
    public OnBackInvokedDispatcher f3325f0;

    /* renamed from: g0 */
    public OnBackInvokedCallback f3326g0;

    /* renamed from: j */
    public final Object f3327j;

    /* renamed from: k */
    public final Context f3328k;

    /* renamed from: l */
    public Window f3329l;

    /* renamed from: m */
    public WindowCallbackC0810s f3330m;

    /* renamed from: n */
    public final Object f3331n;

    /* renamed from: o */
    public C0791I f3332o;

    /* renamed from: p */
    public C2424i f3333p;

    /* renamed from: q */
    public CharSequence f3334q;

    /* renamed from: r */
    public InterfaceC2592n0 f3335r;

    /* renamed from: s */
    public C0804m f3336s;

    /* renamed from: t */
    public C0804m f3337t;

    /* renamed from: u */
    public AbstractC2416a f3338u;

    /* renamed from: v */
    public ActionBarContextView f3339v;

    /* renamed from: w */
    public PopupWindow f3340w;

    /* renamed from: x */
    public RunnableC0803l f3341x;

    /* renamed from: z */
    public boolean f3343z;

    /* renamed from: y */
    public C0291Y f3342y = null;

    /* renamed from: a0 */
    public final RunnableC0803l f3320a0 = new RunnableC0803l(this, 0);

    public LayoutInflaterFactory2C0815x(Context context, Window window, InterfaceC0799h interfaceC0799h, Object obj) {
        AbstractActivityC0798g abstractActivityC0798g;
        this.f3312S = -100;
        this.f3328k = context;
        this.f3327j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0798g)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0798g = (AbstractActivityC0798g) context;
                    break;
                }
            }
            abstractActivityC0798g = null;
            if (abstractActivityC0798g != null) {
                this.f3312S = ((LayoutInflaterFactory2C0815x) abstractActivityC0798g.m2203i()).f3312S;
            }
        }
        if (this.f3312S == -100) {
            C2691k c2691k = f3290h0;
            Integer num = (Integer) c2691k.getOrDefault(this.f3327j.getClass().getName(), null);
            if (num != null) {
                this.f3312S = num.intValue();
                c2691k.remove(this.f3327j.getClass().getName());
            }
        }
        if (window != null) {
            m2256o(window);
        }
        C2609t.m5071d();
    }

    /* renamed from: p */
    public static C0144h m2242p(Context context) {
        C0144h c0144h;
        C0144h m449b;
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 33 || (c0144h = AbstractC0802k.f3251c) == null) {
            return null;
        }
        C0144h m2244z = m2244z(context.getApplicationContext().getResources().getConfiguration());
        InterfaceC0146j interfaceC0146j = c0144h.f411a;
        int r3 = 0;
        if (r02 < 24) {
            m449b = interfaceC0146j.isEmpty() ? C0144h.f410b : C0144h.m449b(interfaceC0146j.get(0).toString());
        } else if (interfaceC0146j.isEmpty()) {
            m449b = C0144h.f410b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (r3 < m2244z.f411a.size() + interfaceC0146j.size()) {
                Locale locale = r3 < interfaceC0146j.size() ? interfaceC0146j.get(r3) : m2244z.f411a.get(r3 - interfaceC0146j.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                r3++;
            }
            m449b = C0144h.m448a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return m449b.f411a.isEmpty() ? m2244z : m449b;
    }

    /* renamed from: t */
    public static Configuration m2243t(Context context, int r3, C0144h c0144h, Configuration configuration, boolean z2) {
        int r2 = r3 != 1 ? r3 != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = r2 | (configuration2.uiMode & (-49));
        if (c0144h != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC0808q.m2234d(configuration2, c0144h);
            } else {
                InterfaceC0146j interfaceC0146j = c0144h.f411a;
                AbstractC0806o.m2229b(configuration2, interfaceC0146j.get(0));
                AbstractC0806o.m2228a(configuration2, interfaceC0146j.get(0));
            }
        }
        return configuration2;
    }

    /* renamed from: z */
    public static C0144h m2244z(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC0808q.m2232b(configuration) : C0144h.m449b(AbstractC0807p.m2230a(configuration.locale));
    }

    /* renamed from: A */
    public final C0814w m2245A(int r5) {
        C0814w[] c0814wArr = this.f3305L;
        if (c0814wArr == null || c0814wArr.length <= r5) {
            C0814w[] c0814wArr2 = new C0814w[r5 + 1];
            if (c0814wArr != null) {
                System.arraycopy(c0814wArr, 0, c0814wArr2, 0, c0814wArr.length);
            }
            this.f3305L = c0814wArr2;
            c0814wArr = c0814wArr2;
        }
        C0814w c0814w = c0814wArr[r5];
        if (c0814w != null) {
            return c0814w;
        }
        C0814w c0814w2 = new C0814w();
        c0814w2.f3274a = r5;
        c0814w2.f3287n = false;
        c0814wArr[r5] = c0814w2;
        return c0814w2;
    }

    /* renamed from: B */
    public final void m2246B() {
        m2262w();
        if (this.f3299F && this.f3332o == null) {
            Object obj = this.f3327j;
            if (obj instanceof Activity) {
                this.f3332o = new C0791I((Activity) obj, this.f3300G);
            } else if (obj instanceof Dialog) {
                this.f3332o = new C0791I((Dialog) obj);
            }
            C0791I r02 = this.f3332o;
            if (r02 != null) {
                r02.m2189I(this.f3321b0);
            }
        }
    }

    /* renamed from: C */
    public final void m2247C(int r4) {
        this.f3319Z = (1 << r4) | this.f3319Z;
        if (this.f3318Y) {
            return;
        }
        View decorView = this.f3329l.getDecorView();
        RunnableC0803l runnableC0803l = this.f3320a0;
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        decorView.postOnAnimation(runnableC0803l);
        this.f3318Y = true;
    }

    /* renamed from: D */
    public final int m2248D(Context context, int r4) {
        if (r4 == -100) {
            return -1;
        }
        if (r4 != -1) {
            if (r4 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return m2264y(context).mo1740f();
            }
            if (r4 != 1 && r4 != 2) {
                if (r4 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f3317X == null) {
                    this.f3317X = new C0811t(this, context);
                }
                return this.f3317X.mo1740f();
            }
        }
        return r4;
    }

    /* renamed from: E */
    public final boolean m2249E() {
        InterfaceC2595o0 interfaceC2595o0;
        C2596o1 c2596o1;
        boolean z2 = this.f3307N;
        this.f3307N = false;
        C0814w m2245A = m2245A(0);
        if (m2245A.f3286m) {
            if (!z2) {
                m2259s(m2245A, true);
            }
            return true;
        }
        AbstractC2416a abstractC2416a = this.f3338u;
        if (abstractC2416a != null) {
            abstractC2416a.mo2170a();
            return true;
        }
        m2246B();
        C0791I r02 = this.f3332o;
        if (r02 == null || (interfaceC2595o0 = r02.f3184j) == null || (c2596o1 = ((C2611t1) interfaceC2595o0).f8477a.f1928L) == null || c2596o1.f8436b == null) {
            return false;
        }
        C2596o1 c2596o12 = ((C2611t1) interfaceC2595o0).f8477a.f1928L;
        C2468o c2468o = c2596o12 == null ? null : c2596o12.f8436b;
        if (c2468o != null) {
            c2468o.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f8057f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2250F(p079e.C0814w r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p079e.LayoutInflaterFactory2C0815x.m2250F(e.w, android.view.KeyEvent):void");
    }

    /* renamed from: G */
    public final boolean m2251G(C0814w c0814w, int r4, KeyEvent keyEvent) {
        MenuC2466m menuC2466m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0814w.f3284k || m2252H(c0814w, keyEvent)) && (menuC2466m = c0814w.f3281h) != null) {
            return menuC2466m.performShortcut(r4, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: H */
    public final boolean m2252H(C0814w c0814w, KeyEvent keyEvent) {
        InterfaceC2592n0 interfaceC2592n0;
        InterfaceC2592n0 interfaceC2592n02;
        Resources.Theme theme;
        InterfaceC2592n0 interfaceC2592n03;
        InterfaceC2592n0 interfaceC2592n04;
        if (this.f3310Q) {
            return false;
        }
        if (c0814w.f3284k) {
            return true;
        }
        C0814w c0814w2 = this.f3306M;
        if (c0814w2 != null && c0814w2 != c0814w) {
            m2259s(c0814w2, false);
        }
        Window.Callback callback = this.f3329l.getCallback();
        int r3 = c0814w.f3274a;
        if (callback != null) {
            c0814w.f3280g = callback.onCreatePanelView(r3);
        }
        boolean z2 = r3 == 0 || r3 == 108;
        if (z2 && (interfaceC2592n04 = this.f3335r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC2592n04;
            actionBarOverlayLayout.m1506k();
            ((C2611t1) actionBarOverlayLayout.f1782e).f8488l = true;
        }
        if (c0814w.f3280g == null) {
            MenuC2466m menuC2466m = c0814w.f3281h;
            if (menuC2466m == null || c0814w.f3288o) {
                if (menuC2466m == null) {
                    Context context = this.f3328k;
                    if ((r3 == 0 || r3 == 108) && this.f3335r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.carwizard.p075li.youtube.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.carwizard.p075li.youtube.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.carwizard.p075li.youtube.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C2419d c2419d = new C2419d(context, 0);
                            c2419d.getTheme().setTo(theme);
                            context = c2419d;
                        }
                    }
                    MenuC2466m menuC2466m2 = new MenuC2466m(context);
                    menuC2466m2.f8069e = this;
                    MenuC2466m menuC2466m3 = c0814w.f3281h;
                    if (menuC2466m2 != menuC2466m3) {
                        if (menuC2466m3 != null) {
                            menuC2466m3.m4843r(c0814w.f3282i);
                        }
                        c0814w.f3281h = menuC2466m2;
                        C2462i c2462i = c0814w.f3282i;
                        if (c2462i != null) {
                            menuC2466m2.m4835b(c2462i, menuC2466m2.f8065a);
                        }
                    }
                    if (c0814w.f3281h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC2592n02 = this.f3335r) != null) {
                    if (this.f3336s == null) {
                        this.f3336s = new C0804m(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC2592n02).m1507l(c0814w.f3281h, this.f3336s);
                }
                c0814w.f3281h.m4848w();
                if (!callback.onCreatePanelMenu(r3, c0814w.f3281h)) {
                    MenuC2466m menuC2466m4 = c0814w.f3281h;
                    if (menuC2466m4 != null) {
                        if (menuC2466m4 != null) {
                            menuC2466m4.m4843r(c0814w.f3282i);
                        }
                        c0814w.f3281h = null;
                    }
                    if (z2 && (interfaceC2592n0 = this.f3335r) != null) {
                        ((ActionBarOverlayLayout) interfaceC2592n0).m1507l(null, this.f3336s);
                    }
                    return false;
                }
                c0814w.f3288o = false;
            }
            c0814w.f3281h.m4848w();
            Bundle bundle = c0814w.f3289p;
            if (bundle != null) {
                c0814w.f3281h.m4844s(bundle);
                c0814w.f3289p = null;
            }
            if (!callback.onPreparePanel(0, c0814w.f3280g, c0814w.f3281h)) {
                if (z2 && (interfaceC2592n03 = this.f3335r) != null) {
                    ((ActionBarOverlayLayout) interfaceC2592n03).m1507l(null, this.f3336s);
                }
                c0814w.f3281h.m4847v();
                return false;
            }
            c0814w.f3281h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            c0814w.f3281h.m4847v();
        }
        c0814w.f3284k = true;
        c0814w.f3285l = false;
        this.f3306M = c0814w;
        return true;
    }

    /* renamed from: I */
    public final void m2253I() {
        if (this.f3343z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: J */
    public final void m2254J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f3325f0 != null && (m2245A(0).f3286m || this.f3338u != null)) {
                z2 = true;
            }
            if (z2 && this.f3326g0 == null) {
                this.f3326g0 = AbstractC0809r.m2236b(this.f3325f0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f3326g0) == null) {
                    return;
                }
                AbstractC0809r.m2237c(this.f3325f0, onBackInvokedCallback);
            }
        }
    }

    @Override // p079e.AbstractC0802k
    /* renamed from: a */
    public final void mo2217a() {
        LayoutInflater from = LayoutInflater.from(this.f3328k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0815x) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p079e.AbstractC0802k
    /* renamed from: b */
    public final void mo2218b() {
        if (this.f3332o != null) {
            m2246B();
            this.f3332o.getClass();
            m2247C(0);
        }
    }

    @Override // p102k.InterfaceC2464k
    /* renamed from: d */
    public final boolean mo2173d(MenuC2466m menuC2466m, MenuItem menuItem) {
        C0814w c0814w;
        Window.Callback callback = this.f3329l.getCallback();
        if (callback != null && !this.f3310Q) {
            MenuC2466m mo4818k = menuC2466m.mo4818k();
            C0814w[] c0814wArr = this.f3305L;
            int length = c0814wArr != null ? c0814wArr.length : 0;
            int r4 = 0;
            while (true) {
                if (r4 < length) {
                    c0814w = c0814wArr[r4];
                    if (c0814w != null && c0814w.f3281h == mo4818k) {
                        break;
                    }
                    r4++;
                } else {
                    c0814w = null;
                    break;
                }
            }
            if (c0814w != null) {
                return callback.onMenuItemSelected(c0814w.f3274a, menuItem);
            }
        }
        return false;
    }

    @Override // p079e.AbstractC0802k
    /* renamed from: e */
    public final void mo2219e() {
        String str;
        this.f3308O = true;
        m2255n(false, true);
        m2263x();
        Object obj = this.f3327j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0387m.m1125x(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                C0791I r12 = this.f3332o;
                if (r12 == null) {
                    this.f3321b0 = true;
                } else {
                    r12.m2189I(true);
                }
            }
            synchronized (AbstractC0802k.f3256h) {
                AbstractC0802k.m2216h(this);
                AbstractC0802k.f3255g.add(new WeakReference(this));
            }
        }
        this.f3311R = new Configuration(this.f3328k.getResources().getConfiguration());
        this.f3309P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // p079e.AbstractC0802k
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2220f() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f3327j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = p079e.AbstractC0802k.f3256h
            monitor-enter(r0)
            p079e.AbstractC0802k.m2216h(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f3318Y
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f3329l
            android.view.View r0 = r0.getDecorView()
            e.l r1 = r3.f3320a0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f3310Q = r0
            int r0 = r3.f3312S
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f3327j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            o.k r0 = p079e.LayoutInflaterFactory2C0815x.f3290h0
            java.lang.Object r1 = r3.f3327j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f3312S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            o.k r0 = p079e.LayoutInflaterFactory2C0815x.f3290h0
            java.lang.Object r1 = r3.f3327j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            e.t r0 = r3.f3316W
            if (r0 == 0) goto L63
            r0.m1737c()
        L63:
            e.t r0 = r3.f3317X
            if (r0 == 0) goto L6a
            r0.m1737c()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p079e.LayoutInflaterFactory2C0815x.mo2220f():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.m5038j() != false) goto L20;
     */
    @Override // p102k.InterfaceC2464k
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2176g(p102k.MenuC2466m r6) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p079e.LayoutInflaterFactory2C0815x.mo2176g(k.m):void");
    }

    @Override // p079e.AbstractC0802k
    /* renamed from: i */
    public final boolean mo2221i(int r6) {
        if (r6 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            r6 = 108;
        } else if (r6 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            r6 = 109;
        }
        if (this.f3303J && r6 == 108) {
            return false;
        }
        if (this.f3299F && r6 == 1) {
            this.f3299F = false;
        }
        if (r6 == 1) {
            m2253I();
            this.f3303J = true;
            return true;
        }
        if (r6 == 2) {
            m2253I();
            this.f3297D = true;
            return true;
        }
        if (r6 == 5) {
            m2253I();
            this.f3298E = true;
            return true;
        }
        if (r6 == 10) {
            m2253I();
            this.f3301H = true;
            return true;
        }
        if (r6 == 108) {
            m2253I();
            this.f3299F = true;
            return true;
        }
        if (r6 != 109) {
            return this.f3329l.requestFeature(r6);
        }
        m2253I();
        this.f3300G = true;
        return true;
    }

    @Override // p079e.AbstractC0802k
    /* renamed from: j */
    public final void mo2222j(int r3) {
        m2262w();
        ViewGroup viewGroup = (ViewGroup) this.f3294A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f3328k).inflate(r3, viewGroup);
        this.f3330m.m2238a(this.f3329l.getCallback());
    }

    @Override // p079e.AbstractC0802k
    /* renamed from: k */
    public final void mo2223k(View view) {
        m2262w();
        ViewGroup viewGroup = (ViewGroup) this.f3294A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f3330m.m2238a(this.f3329l.getCallback());
    }

    @Override // p079e.AbstractC0802k
    /* renamed from: l */
    public final void mo2224l(View view, ViewGroup.LayoutParams layoutParams) {
        m2262w();
        ViewGroup viewGroup = (ViewGroup) this.f3294A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f3330m.m2238a(this.f3329l.getCallback());
    }

    @Override // p079e.AbstractC0802k
    /* renamed from: m */
    public final void mo2225m(CharSequence charSequence) {
        this.f3334q = charSequence;
        InterfaceC2592n0 interfaceC2592n0 = this.f3335r;
        if (interfaceC2592n0 != null) {
            interfaceC2592n0.setWindowTitle(charSequence);
            return;
        }
        C0791I r02 = this.f3332o;
        if (r02 == null) {
            TextView textView = this.f3295B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C2611t1 c2611t1 = (C2611t1) r02.f3184j;
        if (c2611t1.f8483g) {
            return;
        }
        c2611t1.f8484h = charSequence;
        if ((c2611t1.f8478b & 8) != 0) {
            Toolbar toolbar = c2611t1.f8477a;
            toolbar.setTitle(charSequence);
            if (c2611t1.f8483g) {
                AbstractC0283P.m780m(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0229 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef A[ADDED_TO_REGION] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2255n(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p079e.LayoutInflaterFactory2C0815x.m2255n(boolean, boolean):boolean");
    }

    /* renamed from: o */
    public final void m2256o(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f3329l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC0810s) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        WindowCallbackC0810s windowCallbackC0810s = new WindowCallbackC0810s(this, callback);
        this.f3330m = windowCallbackC0810s;
        window.setCallback(windowCallbackC0810s);
        int[] r02 = f3291i0;
        Context context = this.f3328k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, r02);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C2609t m5069a = C2609t.m5069a();
            synchronized (m5069a) {
                drawable = m5069a.f8472a.m4981g(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f3329l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f3325f0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f3326g0) != null) {
            AbstractC0809r.m2237c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f3326g0 = null;
        }
        Object obj = this.f3327j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f3325f0 = AbstractC0809r.m2235a(activity);
                m2254J();
            }
        }
        this.f3325f0 = null;
        m2254J();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0112, code lost:
    
        if (r2.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r18, java.lang.String r19, android.content.Context r20, android.util.AttributeSet r21) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p079e.LayoutInflaterFactory2C0815x.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: q */
    public final void m2257q(int r4, C0814w c0814w, MenuC2466m menuC2466m) {
        if (menuC2466m == null) {
            if (c0814w == null && r4 >= 0) {
                C0814w[] c0814wArr = this.f3305L;
                if (r4 < c0814wArr.length) {
                    c0814w = c0814wArr[r4];
                }
            }
            if (c0814w != null) {
                menuC2466m = c0814w.f3281h;
            }
        }
        if ((c0814w == null || c0814w.f3286m) && !this.f3310Q) {
            WindowCallbackC0810s windowCallbackC0810s = this.f3330m;
            Window.Callback callback = this.f3329l.getCallback();
            windowCallbackC0810s.getClass();
            try {
                windowCallbackC0810s.f3267d = true;
                callback.onPanelClosed(r4, menuC2466m);
            } finally {
                windowCallbackC0810s.f3267d = false;
            }
        }
    }

    /* renamed from: r */
    public final void m2258r(MenuC2466m menuC2466m) {
        C2582k c2582k;
        if (this.f3304K) {
            return;
        }
        this.f3304K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f3335r;
        actionBarOverlayLayout.m1506k();
        ActionMenuView actionMenuView = ((C2611t1) actionBarOverlayLayout.f1782e).f8477a.f1934a;
        if (actionMenuView != null && (c2582k = actionMenuView.f1808t) != null) {
            c2582k.m5037f();
            C2567f c2567f = c2582k.f8402t;
            if (c2567f != null && c2567f.m4859b()) {
                c2567f.f8141i.dismiss();
            }
        }
        Window.Callback callback = this.f3329l.getCallback();
        if (callback != null && !this.f3310Q) {
            callback.onPanelClosed(108, menuC2466m);
        }
        this.f3304K = false;
    }

    /* renamed from: s */
    public final void m2259s(C0814w c0814w, boolean z2) {
        C0813v c0813v;
        InterfaceC2592n0 interfaceC2592n0;
        C2582k c2582k;
        if (z2 && c0814w.f3274a == 0 && (interfaceC2592n0 = this.f3335r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC2592n0;
            actionBarOverlayLayout.m1506k();
            ActionMenuView actionMenuView = ((C2611t1) actionBarOverlayLayout.f1782e).f8477a.f1934a;
            if (actionMenuView != null && (c2582k = actionMenuView.f1808t) != null && c2582k.m5038j()) {
                m2258r(c0814w.f3281h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f3328k.getSystemService("window");
        if (windowManager != null && c0814w.f3286m && (c0813v = c0814w.f3278e) != null) {
            windowManager.removeView(c0813v);
            if (z2) {
                m2257q(c0814w.f3274a, c0814w, null);
            }
        }
        c0814w.f3284k = false;
        c0814w.f3285l = false;
        c0814w.f3286m = false;
        c0814w.f3279f = null;
        c0814w.f3287n = true;
        if (this.f3306M == c0814w) {
            this.f3306M = null;
        }
        if (c0814w.f3274a == 0) {
            m2254J();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        if (r7.m5037f() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0101, code lost:
    
        if (r7.m5039l() != false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2260u(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p079e.LayoutInflaterFactory2C0815x.m2260u(android.view.KeyEvent):boolean");
    }

    /* renamed from: v */
    public final void m2261v(int r4) {
        C0814w m2245A = m2245A(r4);
        if (m2245A.f3281h != null) {
            Bundle bundle = new Bundle();
            m2245A.f3281h.m4845t(bundle);
            if (bundle.size() > 0) {
                m2245A.f3289p = bundle;
            }
            m2245A.f3281h.m4848w();
            m2245A.f3281h.clear();
        }
        m2245A.f3288o = true;
        m2245A.f3287n = true;
        if ((r4 == 108 || r4 == 0) && this.f3335r != null) {
            C0814w m2245A2 = m2245A(0);
            m2245A2.f3284k = false;
            m2252H(m2245A2, null);
        }
    }

    /* renamed from: w */
    public final void m2262w() {
        ViewGroup viewGroup;
        int r02 = 1;
        int r12 = 0;
        if (this.f3343z) {
            return;
        }
        int[] r2 = AbstractC0780a.f3123j;
        Context context = this.f3328k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(r2);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            mo2221i(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            mo2221i(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            mo2221i(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            mo2221i(10);
        }
        this.f3302I = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        m2263x();
        this.f3329l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f3303J) {
            viewGroup = this.f3301H ? (ViewGroup) from.inflate(com.carwizard.p075li.youtube.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.carwizard.p075li.youtube.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f3302I) {
            viewGroup = (ViewGroup) from.inflate(com.carwizard.p075li.youtube.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f3300G = false;
            this.f3299F = false;
        } else if (this.f3299F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.carwizard.p075li.youtube.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C2419d(context, typedValue.resourceId) : context).inflate(com.carwizard.p075li.youtube.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC2592n0 interfaceC2592n0 = (InterfaceC2592n0) viewGroup.findViewById(com.carwizard.p075li.youtube.R.id.decor_content_parent);
            this.f3335r = interfaceC2592n0;
            interfaceC2592n0.setWindowCallback(this.f3329l.getCallback());
            if (this.f3300G) {
                ((ActionBarOverlayLayout) this.f3335r).m1505j(109);
            }
            if (this.f3297D) {
                ((ActionBarOverlayLayout) this.f3335r).m1505j(2);
            }
            if (this.f3298E) {
                ((ActionBarOverlayLayout) this.f3335r).m1505j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f3299F + ", windowActionBarOverlay: " + this.f3300G + ", android:windowIsFloating: " + this.f3302I + ", windowActionModeOverlay: " + this.f3301H + ", windowNoTitle: " + this.f3303J + " }");
        }
        C0804m c0804m = new C0804m(this, r12);
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        AbstractC0272E.m717u(viewGroup, c0804m);
        if (this.f3335r == null) {
            this.f3295B = (TextView) viewGroup.findViewById(com.carwizard.p075li.youtube.R.id.title);
        }
        Method method = AbstractC2502A1.f8185a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.carwizard.p075li.youtube.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f3329l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f3329l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0804m(this, r02));
        this.f3294A = viewGroup;
        Object obj = this.f3327j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f3334q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC2592n0 interfaceC2592n02 = this.f3335r;
            if (interfaceC2592n02 != null) {
                interfaceC2592n02.setWindowTitle(title);
            } else {
                C0791I r5 = this.f3332o;
                if (r5 != null) {
                    C2611t1 c2611t1 = (C2611t1) r5.f3184j;
                    if (!c2611t1.f8483g) {
                        c2611t1.f8484h = title;
                        if ((c2611t1.f8478b & 8) != 0) {
                            Toolbar toolbar = c2611t1.f8477a;
                            toolbar.setTitle(title);
                            if (c2611t1.f8483g) {
                                AbstractC0283P.m780m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f3295B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f3294A.findViewById(R.id.content);
        View decorView = this.f3329l.getDecorView();
        contentFrameLayout2.f1825g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(r2);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f3343z = true;
        C0814w m2245A = m2245A(0);
        if (this.f3310Q || m2245A.f3281h != null) {
            return;
        }
        m2247C(108);
    }

    /* renamed from: x */
    public final void m2263x() {
        if (this.f3329l == null) {
            Object obj = this.f3327j;
            if (obj instanceof Activity) {
                m2256o(((Activity) obj).getWindow());
            }
        }
        if (this.f3329l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: y */
    public final AbstractC0656f m2264y(Context context) {
        if (this.f3316W == null) {
            if (C0015h.f23e == null) {
                Context applicationContext = context.getApplicationContext();
                C0015h.f23e = new C0015h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f3316W = new C0811t(this, C0015h.f23e);
        }
        return this.f3316W;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
