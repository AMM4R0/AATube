package p079e;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0580g;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.AbstractActivityC0592k;
import androidx.fragment.app.AbstractComponentCallbacksC0666p;
import androidx.fragment.app.C0638E;
import androidx.fragment.app.C0646M;
import androidx.fragment.app.C0667q;
import androidx.fragment.app.C0668r;
import androidx.fragment.app.C0669s;
import androidx.lifecycle.C0710t;
import androidx.lifecycle.EnumC0702l;
import androidx.lifecycle.EnumC0703m;
import com.carwizard.p075li.youtube.MainActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC2492i;
import p003B.AbstractC0028b;
import p006C.C0055g;
import p010D0.C0113k;
import p017G.AbstractC0138b;
import p017G.C0144h;
import p036M1.AbstractC0387m;
import p073c0.RunnableC0731g;
import p082f0.C0900d;
import p099j.C2419d;
import p099j.C2424i;
import p099j.C2426k;
import p104l.AbstractC2626y1;
import p104l.C2609t;
import p104l.C2611t1;

/* renamed from: e.g */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0798g extends AbstractActivityC0592k implements InterfaceC0799h {

    /* renamed from: p */
    public final C0055g f3243p;

    /* renamed from: r */
    public boolean f3245r;

    /* renamed from: s */
    public boolean f3246s;

    /* renamed from: u */
    public LayoutInflaterFactory2C0815x f3248u;

    /* renamed from: q */
    public final C0710t f3244q = new C0710t(this);

    /* renamed from: t */
    public boolean f3247t = true;

    public AbstractActivityC0798g() {
        MainActivity mainActivity = (MainActivity) this;
        this.f3243p = new C0055g(19, new C0669s(mainActivity));
        ((C0900d) this.f1678e.f665c).m2431e("android:support:fragments", new C0667q(mainActivity, 0));
        m1476g(new C0668r(mainActivity, 0));
        ((C0900d) this.f1678e.f665c).m2431e("androidx:appcompat", new C0667q(mainActivity, 1));
        m1476g(new C0668r(mainActivity, 1));
    }

    /* renamed from: k */
    public static boolean m2202k(C0638E c0638e) {
        boolean z2 = false;
        for (AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p : c0638e.f2128c.m124s()) {
            if (abstractComponentCallbacksC0666p != null) {
                C0669s c0669s = abstractComponentCallbacksC0666p.f2330s;
                if ((c0669s == null ? null : c0669s.f2346h) != null) {
                    z2 |= m2202k(abstractComponentCallbacksC0666p.m1764g());
                }
                C0646M c0646m = abstractComponentCallbacksC0666p.f2308M;
                EnumC0703m enumC0703m = EnumC0703m.f2408d;
                if (c0646m != null) {
                    c0646m.m1725f();
                    if (c0646m.f2200b.f2416c.compareTo(enumC0703m) >= 0) {
                        abstractComponentCallbacksC0666p.f2308M.f2200b.m1797g();
                        z2 = true;
                    }
                }
                if (abstractComponentCallbacksC0666p.f2307L.f2416c.compareTo(enumC0703m) >= 0) {
                    abstractComponentCallbacksC0666p.f2307L.m1797g();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2204j();
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = (LayoutInflaterFactory2C0815x) m2203i();
        layoutInflaterFactory2C0815x.m2262w();
        ((ViewGroup) layoutInflaterFactory2C0815x.f3294A.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0815x.f3330m.m2238a(layoutInflaterFactory2C0815x.f3329l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int r3;
        int r6;
        int r32;
        int r62;
        int r33;
        int r63;
        int r34;
        int r64;
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = (LayoutInflaterFactory2C0815x) m2203i();
        layoutInflaterFactory2C0815x.f3308O = true;
        int r2 = layoutInflaterFactory2C0815x.f3312S;
        if (r2 == -100) {
            r2 = AbstractC0802k.f3250b;
        }
        int m2248D = layoutInflaterFactory2C0815x.m2248D(context, r2);
        if (AbstractC0802k.m2215c(context) && AbstractC0802k.m2215c(context)) {
            if (!AbstractC0138b.m439a()) {
                synchronized (AbstractC0802k.f3257i) {
                    try {
                        C0144h c0144h = AbstractC0802k.f3251c;
                        if (c0144h == null) {
                            if (AbstractC0802k.f3252d == null) {
                                AbstractC0802k.f3252d = C0144h.m449b(AbstractC0580g.m1455v(context));
                            }
                            if (!AbstractC0802k.f3252d.f411a.isEmpty()) {
                                AbstractC0802k.f3251c = AbstractC0802k.f3252d;
                            }
                        } else if (!c0144h.equals(AbstractC0802k.f3252d)) {
                            C0144h c0144h2 = AbstractC0802k.f3251c;
                            AbstractC0802k.f3252d = c0144h2;
                            AbstractC0580g.m1453t(context, c0144h2.f411a.mo451b());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC0802k.f3254f) {
                AbstractC0802k.f3249a.execute(new RunnableC0731g(context, 2));
            }
        }
        C0144h m2242p = LayoutInflaterFactory2C0815x.m2242p(context);
        Configuration configuration = null;
        if (LayoutInflaterFactory2C0815x.f3293k0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0815x.m2243t(context, m2248D, m2242p, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C2419d) {
            try {
                ((C2419d) context).m4776a(LayoutInflaterFactory2C0815x.m2243t(context, m2248D, m2242p, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C0815x.f3292j0) {
            int r35 = Build.VERSION.SDK_INT;
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int r65 = configuration3.mcc;
                    int r8 = configuration4.mcc;
                    if (r65 != r8) {
                        configuration.mcc = r8;
                    }
                    int r66 = configuration3.mnc;
                    int r82 = configuration4.mnc;
                    if (r66 != r82) {
                        configuration.mnc = r82;
                    }
                    if (r35 >= 24) {
                        AbstractC0808q.m2231a(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int r67 = configuration3.touchscreen;
                    int r83 = configuration4.touchscreen;
                    if (r67 != r83) {
                        configuration.touchscreen = r83;
                    }
                    int r68 = configuration3.keyboard;
                    int r84 = configuration4.keyboard;
                    if (r68 != r84) {
                        configuration.keyboard = r84;
                    }
                    int r69 = configuration3.keyboardHidden;
                    int r85 = configuration4.keyboardHidden;
                    if (r69 != r85) {
                        configuration.keyboardHidden = r85;
                    }
                    int r610 = configuration3.navigation;
                    int r86 = configuration4.navigation;
                    if (r610 != r86) {
                        configuration.navigation = r86;
                    }
                    int r611 = configuration3.navigationHidden;
                    int r87 = configuration4.navigationHidden;
                    if (r611 != r87) {
                        configuration.navigationHidden = r87;
                    }
                    int r612 = configuration3.orientation;
                    int r88 = configuration4.orientation;
                    if (r612 != r88) {
                        configuration.orientation = r88;
                    }
                    int r613 = configuration3.screenLayout & 15;
                    int r89 = configuration4.screenLayout & 15;
                    if (r613 != r89) {
                        configuration.screenLayout |= r89;
                    }
                    int r614 = configuration3.screenLayout & 192;
                    int r810 = configuration4.screenLayout & 192;
                    if (r614 != r810) {
                        configuration.screenLayout |= r810;
                    }
                    int r615 = configuration3.screenLayout & 48;
                    int r811 = configuration4.screenLayout & 48;
                    if (r615 != r811) {
                        configuration.screenLayout |= r811;
                    }
                    int r616 = configuration3.screenLayout & 768;
                    int r812 = configuration4.screenLayout & 768;
                    if (r616 != r812) {
                        configuration.screenLayout |= r812;
                    }
                    if (r35 >= 26) {
                        r3 = configuration3.colorMode;
                        int r36 = r3 & 3;
                        r6 = configuration4.colorMode;
                        if (r36 != (r6 & 3)) {
                            r34 = configuration.colorMode;
                            r64 = configuration4.colorMode;
                            configuration.colorMode = r34 | (r64 & 3);
                        }
                        r32 = configuration3.colorMode;
                        int r37 = r32 & 12;
                        r62 = configuration4.colorMode;
                        if (r37 != (r62 & 12)) {
                            r33 = configuration.colorMode;
                            r63 = configuration4.colorMode;
                            configuration.colorMode = r33 | (r63 & 12);
                        }
                    }
                    int r38 = configuration3.uiMode & 15;
                    int r617 = configuration4.uiMode & 15;
                    if (r38 != r617) {
                        configuration.uiMode |= r617;
                    }
                    int r39 = configuration3.uiMode & 48;
                    int r618 = configuration4.uiMode & 48;
                    if (r39 != r618) {
                        configuration.uiMode |= r618;
                    }
                    int r310 = configuration3.screenWidthDp;
                    int r619 = configuration4.screenWidthDp;
                    if (r310 != r619) {
                        configuration.screenWidthDp = r619;
                    }
                    int r311 = configuration3.screenHeightDp;
                    int r620 = configuration4.screenHeightDp;
                    if (r311 != r620) {
                        configuration.screenHeightDp = r620;
                    }
                    int r312 = configuration3.smallestScreenWidthDp;
                    int r621 = configuration4.smallestScreenWidthDp;
                    if (r312 != r621) {
                        configuration.smallestScreenWidthDp = r621;
                    }
                    int r313 = configuration3.densityDpi;
                    int r4 = configuration4.densityDpi;
                    if (r313 != r4) {
                        configuration.densityDpi = r4;
                    }
                }
            }
            Configuration m2243t = LayoutInflaterFactory2C0815x.m2243t(context, m2248D, m2242p, configuration, true);
            C2419d c2419d = new C2419d(context, com.carwizard.p075li.youtube.R.style.Theme_AppCompat_Empty);
            c2419d.m4776a(m2243t);
            try {
                if (context.getTheme() != null) {
                    AbstractC0028b.m170n(c2419d.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = c2419d;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C0815x) m2203i()).m2246B();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p144z.AbstractActivityC2907e, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C0815x) m2203i()).m2246B();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f3245r);
        printWriter.print(" mResumed=");
        printWriter.print(this.f3246s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3247t);
        if (getApplication() != null) {
            new C0113k(this, mo1474d()).m378b(str2, printWriter);
        }
        ((C0669s) this.f3243p.f107b).f2345g.m1694t(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int r2) {
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = (LayoutInflaterFactory2C0815x) m2203i();
        layoutInflaterFactory2C0815x.m2262w();
        return layoutInflaterFactory2C0815x.f3329l.findViewById(r2);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = (LayoutInflaterFactory2C0815x) m2203i();
        if (layoutInflaterFactory2C0815x.f3333p == null) {
            layoutInflaterFactory2C0815x.m2246B();
            C0791I r2 = layoutInflaterFactory2C0815x.f3332o;
            layoutInflaterFactory2C0815x.f3333p = new C2424i(r2 != null ? r2.m2187G() : layoutInflaterFactory2C0815x.f3328k);
        }
        return layoutInflaterFactory2C0815x.f3333p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int r02 = AbstractC2626y1.f8543a;
        return super.getResources();
    }

    /* renamed from: i */
    public final AbstractC0802k m2203i() {
        if (this.f3248u == null) {
            ExecutorC0786D executorC0786D = AbstractC0802k.f3249a;
            this.f3248u = new LayoutInflaterFactory2C0815x(this, null, this, this);
        }
        return this.f3248u;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m2203i().mo2218b();
    }

    /* renamed from: j */
    public final void m2204j() {
        View decorView = getWindow().getDecorView();
        AbstractC2492i.m4915e(decorView, "<this>");
        decorView.setTag(com.carwizard.p075li.youtube.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC2492i.m4915e(decorView2, "<this>");
        decorView2.setTag(com.carwizard.p075li.youtube.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC2492i.m4915e(decorView3, "<this>");
        decorView3.setTag(com.carwizard.p075li.youtube.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC2492i.m4915e(decorView4, "<this>");
        decorView4.setTag(com.carwizard.p075li.youtube.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    /* renamed from: l */
    public final void m2205l(Configuration configuration) {
        C0055g c0055g = this.f3243p;
        c0055g.m221t();
        super.onConfigurationChanged(configuration);
        ((C0669s) c0055g.f107b).f2345g.m1682h();
    }

    /* renamed from: m */
    public final void m2206m() {
        super.onDestroy();
        ((C0669s) this.f3243p.f107b).f2345g.m1685k();
        this.f3244q.m1794d(EnumC0702l.ON_DESTROY);
    }

    /* renamed from: n */
    public final boolean m2207n(int r2, MenuItem menuItem) {
        if (super.onMenuItemSelected(r2, menuItem)) {
            return true;
        }
        C0055g c0055g = this.f3243p;
        if (r2 == 0) {
            return ((C0669s) c0055g.f107b).f2345g.m1688n();
        }
        if (r2 != 6) {
            return false;
        }
        return ((C0669s) c0055g.f107b).f2345g.m1683i();
    }

    /* renamed from: o */
    public final void m2208o(int r2, Menu menu) {
        if (r2 == 0) {
            ((C0669s) this.f3243p.f107b).f2345g.m1689o();
        }
        super.onPanelClosed(r2, menu);
    }

    @Override // androidx.activity.AbstractActivityC0592k, android.app.Activity
    public final void onActivityResult(int r2, int r3, Intent intent) {
        this.f3243p.m221t();
        super.onActivityResult(r2, r3, intent);
    }

    @Override // androidx.activity.AbstractActivityC0592k, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        m2205l(configuration);
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = (LayoutInflaterFactory2C0815x) m2203i();
        if (layoutInflaterFactory2C0815x.f3299F && layoutInflaterFactory2C0815x.f3343z) {
            layoutInflaterFactory2C0815x.m2246B();
            C0791I r02 = layoutInflaterFactory2C0815x.f3332o;
            if (r02 != null) {
                r02.m2190J(r02.f3180f.getResources().getBoolean(com.carwizard.p075li.youtube.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C2609t m5069a = C2609t.m5069a();
        Context context = layoutInflaterFactory2C0815x.f3328k;
        synchronized (m5069a) {
            m5069a.f8472a.m4984l(context);
        }
        layoutInflaterFactory2C0815x.f3311R = new Configuration(layoutInflaterFactory2C0815x.f3328k.getResources().getConfiguration());
        layoutInflaterFactory2C0815x.m2255n(false, false);
    }

    @Override // androidx.activity.AbstractActivityC0592k, p144z.AbstractActivityC2907e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3244q.m1794d(EnumC0702l.ON_CREATE);
        C0638E c0638e = ((C0669s) this.f3243p.f107b).f2345g;
        c0638e.f2150y = false;
        c0638e.f2151z = false;
        c0638e.f2124F.f2170h = false;
        c0638e.m1693s(1);
    }

    @Override // androidx.activity.AbstractActivityC0592k, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, Menu menu) {
        if (r2 != 0) {
            super.onCreatePanelMenu(r2, menu);
            return true;
        }
        super.onCreatePanelMenu(r2, menu);
        getMenuInflater();
        ((C0669s) this.f3243p.f107b).f2345g.m1684j();
        return true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0669s) this.f3243p.f107b).f2345g.f2131f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        m2206m();
        m2203i().mo2220f();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r3, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(r3, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ((C0669s) this.f3243p.f107b).f2345g.m1686l();
    }

    @Override // androidx.activity.AbstractActivityC0592k, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r5, MenuItem menuItem) {
        Intent m1123v;
        if (m2207n(r5, menuItem)) {
            return true;
        }
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = (LayoutInflaterFactory2C0815x) m2203i();
        layoutInflaterFactory2C0815x.m2246B();
        C0791I r52 = layoutInflaterFactory2C0815x.f3332o;
        if (menuItem.getItemId() == 16908332 && r52 != null && (((C2611t1) r52.f3184j).f8478b & 4) != 0 && (m1123v = AbstractC0387m.m1123v(this)) != null) {
            if (!shouldUpRecreateTask(m1123v)) {
                navigateUpTo(m1123v);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent m1123v2 = AbstractC0387m.m1123v(this);
            if (m1123v2 == null) {
                m1123v2 = AbstractC0387m.m1123v(this);
            }
            if (m1123v2 != null) {
                ComponentName component = m1123v2.getComponent();
                if (component == null) {
                    component = m1123v2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent m1124w = AbstractC0387m.m1124w(this, component);
                    while (m1124w != null) {
                        arrayList.add(size, m1124w);
                        m1124w = AbstractC0387m.m1124w(this, m1124w.getComponent());
                    }
                    arrayList.add(m1123v2);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e2);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        ((C0669s) this.f3243p.f107b).f2345g.m1687m(z2);
    }

    @Override // androidx.activity.AbstractActivityC0592k, android.app.Activity
    public final void onNewIntent(Intent intent) {
        this.f3243p.m221t();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.AbstractActivityC0592k, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int r12, Menu menu) {
        m2208o(r12, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f3246s = false;
        ((C0669s) this.f3243p.f107b).f2345g.m1693s(5);
        this.f3244q.m1794d(EnumC0702l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        ((C0669s) this.f3243p.f107b).f2345g.m1691q(z2);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0815x) m2203i()).m2262w();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        m2209p();
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = (LayoutInflaterFactory2C0815x) m2203i();
        layoutInflaterFactory2C0815x.m2246B();
        C0791I r02 = layoutInflaterFactory2C0815x.f3332o;
        if (r02 != null) {
            r02.f3199y = true;
        }
    }

    @Override // androidx.activity.AbstractActivityC0592k, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int r2, View view, Menu menu) {
        if (r2 != 0) {
            super.onPreparePanel(r2, view, menu);
            return true;
        }
        super.onPreparePanel(0, view, menu);
        ((C0669s) this.f3243p.f107b).f2345g.m1692r();
        return true;
    }

    @Override // androidx.activity.AbstractActivityC0592k, android.app.Activity
    public final void onRequestPermissionsResult(int r2, String[] strArr, int[] r4) {
        this.f3243p.m221t();
        super.onRequestPermissionsResult(r2, strArr, r4);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0055g c0055g = this.f3243p;
        c0055g.m221t();
        super.onResume();
        this.f3246s = true;
        ((C0669s) c0055g.f107b).f2345g.m1697w(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        m2210q();
        ((LayoutInflaterFactory2C0815x) m2203i()).m2255n(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f3243p.m221t();
    }

    @Override // android.app.Activity
    public void onStop() {
        m2211r();
        LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = (LayoutInflaterFactory2C0815x) m2203i();
        layoutInflaterFactory2C0815x.m2246B();
        C0791I r02 = layoutInflaterFactory2C0815x.f3332o;
        if (r02 != null) {
            r02.f3199y = false;
            C2426k c2426k = r02.f3198x;
            if (c2426k != null) {
                c2426k.m4782a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int r2) {
        super.onTitleChanged(charSequence, r2);
        m2203i().mo2225m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C0815x) m2203i()).m2246B();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    /* renamed from: p */
    public final void m2209p() {
        super.onPostResume();
        this.f3244q.m1794d(EnumC0702l.ON_RESUME);
        C0638E c0638e = ((C0669s) this.f3243p.f107b).f2345g;
        c0638e.f2150y = false;
        c0638e.f2151z = false;
        c0638e.f2124F.f2170h = false;
        c0638e.m1693s(7);
    }

    /* renamed from: q */
    public final void m2210q() {
        C0055g c0055g = this.f3243p;
        c0055g.m221t();
        super.onStart();
        this.f3247t = false;
        boolean z2 = this.f3245r;
        C0669s c0669s = (C0669s) c0055g.f107b;
        if (!z2) {
            this.f3245r = true;
            C0638E c0638e = c0669s.f2345g;
            c0638e.f2150y = false;
            c0638e.f2151z = false;
            c0638e.f2124F.f2170h = false;
            c0638e.m1693s(4);
        }
        c0669s.f2345g.m1697w(true);
        this.f3244q.m1794d(EnumC0702l.ON_START);
        C0638E c0638e2 = c0669s.f2345g;
        c0638e2.f2150y = false;
        c0638e2.f2151z = false;
        c0638e2.f2124F.f2170h = false;
        c0638e2.m1693s(5);
    }

    /* renamed from: r */
    public final void m2211r() {
        C0055g c0055g;
        super.onStop();
        this.f3247t = true;
        do {
            c0055g = this.f3243p;
        } while (m2202k(((C0669s) c0055g.f107b).f2345g));
        C0638E c0638e = ((C0669s) c0055g.f107b).f2345g;
        c0638e.f2151z = true;
        c0638e.f2124F.f2170h = true;
        c0638e.m1693s(4);
        this.f3244q.m1794d(EnumC0702l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int r2) {
        m2204j();
        m2203i().mo2222j(r2);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r2) {
        super.setTheme(r2);
        ((LayoutInflaterFactory2C0815x) m2203i()).f3313T = r2;
    }

    @Override // androidx.activity.AbstractActivityC0592k, android.app.Activity
    public void setContentView(View view) {
        m2204j();
        m2203i().mo2223k(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0669s) this.f3243p.f107b).f2345g.f2131f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2204j();
        m2203i().mo2224l(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
