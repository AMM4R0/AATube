package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.InterfaceC0602c;
import androidx.lifecycle.AbstractC0679C;
import androidx.lifecycle.AbstractC0683G;
import androidx.lifecycle.C0684H;
import androidx.lifecycle.C0687K;
import androidx.lifecycle.C0688L;
import androidx.lifecycle.C0710t;
import androidx.lifecycle.EnumC0702l;
import androidx.lifecycle.EnumC0703m;
import androidx.lifecycle.FragmentC0681E;
import androidx.lifecycle.InterfaceC0689M;
import androidx.lifecycle.InterfaceC0698h;
import androidx.lifecycle.InterfaceC0706p;
import androidx.lifecycle.InterfaceC0708r;
import androidx.lifecycle.SavedStateHandleAttacher;
import com.carwizard.p075li.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p010D0.C0109g;
import p010D0.RunnableC0107e;
import p019H.C0176f;
import p026J0.C0229j;
import p036M1.AbstractC0379e;
import p050R0.RunnableC0458b;
import p064Y.AbstractC0543b;
import p064Y.C0542a;
import p064Y.C0544c;
import p070b.C0717a;
import p070b.InterfaceC0718b;
import p079e.AbstractActivityC0798g;
import p081e1.C0879e;
import p082f0.C0900d;
import p082f0.InterfaceC0899c;
import p082f0.InterfaceC0901e;
import p109n.C2673b;
import p109n.C2677f;
import p124s0.C2738i;
import p131u1.InterfaceC2799a;
import p144z.AbstractActivityC2907e;

/* renamed from: androidx.activity.k */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0592k extends AbstractActivityC2907e implements InterfaceC0689M, InterfaceC0698h, InterfaceC0901e, InterfaceC0605u, InterfaceC0602c {

    /* renamed from: b */
    public final C0717a f1675b = new C0717a();

    /* renamed from: c */
    public final C0109g f1676c;

    /* renamed from: d */
    public final C0710t f1677d;

    /* renamed from: e */
    public final C0229j f1678e;

    /* renamed from: f */
    public C0688L f1679f;

    /* renamed from: g */
    public C0604t f1680g;

    /* renamed from: h */
    public final ExecutorC0591j f1681h;

    /* renamed from: i */
    public final C0229j f1682i;

    /* renamed from: j */
    public final C0588g f1683j;

    /* renamed from: k */
    public final CopyOnWriteArrayList f1684k;

    /* renamed from: l */
    public final CopyOnWriteArrayList f1685l;

    /* renamed from: m */
    public final CopyOnWriteArrayList f1686m;

    /* renamed from: n */
    public final CopyOnWriteArrayList f1687n;

    /* renamed from: o */
    public final CopyOnWriteArrayList f1688o;

    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.activity.d] */
    public AbstractActivityC0592k() {
        final AbstractActivityC0798g abstractActivityC0798g = (AbstractActivityC0798g) this;
        this.f1676c = new C0109g((Runnable) new RunnableC0458b(2, abstractActivityC0798g));
        C0710t c0710t = new C0710t(this);
        this.f1677d = c0710t;
        C0229j c0229j = new C0229j(this);
        this.f1678e = c0229j;
        InterfaceC0899c interfaceC0899c = null;
        this.f1680g = null;
        ExecutorC0591j executorC0591j = new ExecutorC0591j(abstractActivityC0798g);
        this.f1681h = executorC0591j;
        this.f1682i = new C0229j(executorC0591j, new InterfaceC2799a() { // from class: androidx.activity.d
            @Override // p131u1.InterfaceC2799a
            public final Object invoke() {
                AbstractActivityC0798g.this.reportFullyDrawn();
                return null;
            }
        });
        new AtomicInteger();
        this.f1683j = new C0588g(abstractActivityC0798g);
        this.f1684k = new CopyOnWriteArrayList();
        this.f1685l = new CopyOnWriteArrayList();
        this.f1686m = new CopyOnWriteArrayList();
        this.f1687n = new CopyOnWriteArrayList();
        this.f1688o = new CopyOnWriteArrayList();
        c0710t.m1791a(new InterfaceC0706p() { // from class: androidx.activity.ComponentActivity$2
            @Override // androidx.lifecycle.InterfaceC0706p
            /* renamed from: b */
            public final void mo1460b(InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l) {
                if (enumC0702l == EnumC0702l.ON_STOP) {
                    Window window = AbstractActivityC0798g.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        c0710t.m1791a(new InterfaceC0706p() { // from class: androidx.activity.ComponentActivity$3
            @Override // androidx.lifecycle.InterfaceC0706p
            /* renamed from: b */
            public final void mo1460b(InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l) {
                if (enumC0702l == EnumC0702l.ON_DESTROY) {
                    AbstractActivityC0798g.this.f1675b.f2578b = null;
                    if (!AbstractActivityC0798g.this.isChangingConfigurations()) {
                        AbstractActivityC0798g.this.mo1474d().m1782a();
                    }
                    ExecutorC0591j executorC0591j2 = AbstractActivityC0798g.this.f1681h;
                    AbstractActivityC0798g abstractActivityC0798g2 = executorC0591j2.f1674d;
                    abstractActivityC0798g2.getWindow().getDecorView().removeCallbacks(executorC0591j2);
                    abstractActivityC0798g2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC0591j2);
                }
            }
        });
        c0710t.m1791a(new InterfaceC0706p() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.InterfaceC0706p
            /* renamed from: b */
            public final void mo1460b(InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l) {
                AbstractActivityC0798g abstractActivityC0798g2 = AbstractActivityC0798g.this;
                if (abstractActivityC0798g2.f1679f == null) {
                    C0590i c0590i = (C0590i) abstractActivityC0798g2.getLastNonConfigurationInstance();
                    if (c0590i != null) {
                        abstractActivityC0798g2.f1679f = c0590i.f1670a;
                    }
                    if (abstractActivityC0798g2.f1679f == null) {
                        abstractActivityC0798g2.f1679f = new C0688L();
                    }
                }
                abstractActivityC0798g2.f1677d.m1796f(this);
            }
        });
        c0229j.m616a();
        EnumC0703m enumC0703m = c0710t.f2416c;
        if (enumC0703m != EnumC0703m.f2406b && enumC0703m != EnumC0703m.f2407c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C0900d c0900d = (C0900d) c0229j.f665c;
        c0900d.getClass();
        Iterator it = ((C2677f) c0900d.f3748d).iterator();
        while (true) {
            C2673b c2673b = (C2673b) it;
            if (!c2673b.hasNext()) {
                break;
            }
            Map.Entry components = (Map.Entry) c2673b.next();
            AbstractC2492i.m4914d(components, "components");
            String str = (String) components.getKey();
            InterfaceC0899c interfaceC0899c2 = (InterfaceC0899c) components.getValue();
            if (AbstractC2492i.m4911a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                interfaceC0899c = interfaceC0899c2;
                break;
            }
        }
        if (interfaceC0899c == null) {
            C0684H c0684h = new C0684H((C0900d) this.f1678e.f665c, this);
            ((C0900d) this.f1678e.f665c).m2431e("androidx.lifecycle.internal.SavedStateHandlesProvider", c0684h);
            this.f1677d.m1791a(new SavedStateHandleAttacher(c0684h));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            C0710t c0710t2 = this.f1677d;
            ImmLeaksCleaner immLeaksCleaner = new ImmLeaksCleaner();
            immLeaksCleaner.f1650a = this;
            c0710t2.m1791a(immLeaksCleaner);
        }
        ((C0900d) this.f1678e.f665c).m2431e("android:support:activity-result", new InterfaceC0899c() { // from class: androidx.activity.e
            @Override // p082f0.InterfaceC0899c
            /* renamed from: a */
            public final Bundle mo1466a() {
                AbstractActivityC0798g abstractActivityC0798g2 = AbstractActivityC0798g.this;
                Bundle bundle = new Bundle();
                C0588g c0588g = abstractActivityC0798g2.f1683j;
                c0588g.getClass();
                HashMap hashMap = c0588g.f1664b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0588g.f1666d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0588g.f1669g.clone());
                return bundle;
            }
        });
        m1476g(new InterfaceC0718b() { // from class: androidx.activity.f
            @Override // p070b.InterfaceC0718b
            /* renamed from: a */
            public final void mo1467a() {
                AbstractActivityC0798g abstractActivityC0798g2 = AbstractActivityC0798g.this;
                Bundle m2429c = ((C0900d) abstractActivityC0798g2.f1678e.f665c).m2429c("android:support:activity-result");
                if (m2429c != null) {
                    C0588g c0588g = abstractActivityC0798g2.f1683j;
                    c0588g.getClass();
                    ArrayList<Integer> integerArrayList = m2429c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = m2429c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    c0588g.f1666d = m2429c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    Bundle bundle = m2429c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = c0588g.f1669g;
                    bundle2.putAll(bundle);
                    for (int r12 = 0; r12 < stringArrayList.size(); r12++) {
                        String str2 = stringArrayList.get(r12);
                        HashMap hashMap = c0588g.f1664b;
                        boolean containsKey = hashMap.containsKey(str2);
                        HashMap hashMap2 = c0588g.f1663a;
                        if (containsKey) {
                            Integer num = (Integer) hashMap.remove(str2);
                            if (!bundle2.containsKey(str2)) {
                                hashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(r12);
                        num2.intValue();
                        String str3 = stringArrayList.get(r12);
                        hashMap2.put(num2, str3);
                        hashMap.put(str3, num2);
                    }
                }
            }
        });
    }

    @Override // androidx.lifecycle.InterfaceC0698h
    /* renamed from: a */
    public final AbstractC0543b mo1472a() {
        C0544c c0544c = new C0544c(C0542a.f1473b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0544c.f1474a;
        if (application != null) {
            linkedHashMap.put(C0687K.f2389a, getApplication());
        }
        linkedHashMap.put(AbstractC0683G.f2379a, this);
        linkedHashMap.put(AbstractC0683G.f2380b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(AbstractC0683G.f2381c, getIntent().getExtras());
        }
        return c0544c;
    }

    @Override // p082f0.InterfaceC0901e
    /* renamed from: b */
    public final C0900d mo1473b() {
        return (C0900d) this.f1678e.f665c;
    }

    @Override // androidx.lifecycle.InterfaceC0689M
    /* renamed from: d */
    public final C0688L mo1474d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1679f == null) {
            C0590i c0590i = (C0590i) getLastNonConfigurationInstance();
            if (c0590i != null) {
                this.f1679f = c0590i.f1670a;
            }
            if (this.f1679f == null) {
                this.f1679f = new C0688L();
            }
        }
        return this.f1679f;
    }

    @Override // androidx.lifecycle.InterfaceC0708r
    /* renamed from: e */
    public final C0710t mo1475e() {
        return this.f1677d;
    }

    /* renamed from: g */
    public final void m1476g(InterfaceC0718b interfaceC0718b) {
        C0717a c0717a = this.f1675b;
        c0717a.getClass();
        if (c0717a.f2578b != null) {
            interfaceC0718b.mo1467a();
        }
        c0717a.f2577a.add(interfaceC0718b);
    }

    /* renamed from: h */
    public final C0604t m1477h() {
        if (this.f1680g == null) {
            this.f1680g = new C0604t(new RunnableC0107e(6, this));
            this.f1677d.m1791a(new InterfaceC0706p() { // from class: androidx.activity.ComponentActivity$6
                @Override // androidx.lifecycle.InterfaceC0706p
                /* renamed from: b */
                public final void mo1460b(InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l) {
                    if (enumC0702l != EnumC0702l.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    C0604t c0604t = AbstractActivityC0592k.this.f1680g;
                    OnBackInvokedDispatcher invoker = AbstractC0589h.m1470a((AbstractActivityC0592k) interfaceC0708r);
                    c0604t.getClass();
                    AbstractC2492i.m4915e(invoker, "invoker");
                    c0604t.f1712e = invoker;
                    c0604t.m1484c(c0604t.f1714g);
                }
            });
        }
        return this.f1680g;
    }

    @Override // android.app.Activity
    public void onActivityResult(int r2, int r3, Intent intent) {
        if (this.f1683j.m1468a(r2, r3, intent)) {
            return;
        }
        super.onActivityResult(r2, r3, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m1477h().m1483b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f1684k.iterator();
        while (it.hasNext()) {
            ((C0176f) it.next()).m537a(configuration);
        }
    }

    @Override // p144z.AbstractActivityC2907e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1678e.m617b(bundle);
        C0717a c0717a = this.f1675b;
        c0717a.getClass();
        c0717a.f2578b = this;
        Iterator it = c0717a.f2577a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0718b) it.next()).mo1467a();
        }
        super.onCreate(bundle);
        int r3 = FragmentC0681E.f2376b;
        AbstractC0679C.m1780b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r12, Menu menu) {
        if (r12 != 0) {
            return true;
        }
        super.onCreatePanelMenu(r12, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1676c.f339c).iterator();
        if (it.hasNext()) {
            throw AbstractC0002c.m10e(it);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, MenuItem menuItem) {
        if (super.onMenuItemSelected(r2, menuItem)) {
            return true;
        }
        if (r2 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1676c.f339c).iterator();
        if (it.hasNext()) {
            throw AbstractC0002c.m10e(it);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration newConfig) {
        super.onMultiWindowModeChanged(z2, newConfig);
        Iterator it = this.f1687n.iterator();
        while (it.hasNext()) {
            C0176f c0176f = (C0176f) it.next();
            AbstractC2492i.m4915e(newConfig, "newConfig");
            c0176f.m537a(new C2738i());
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f1686m.iterator();
        while (it.hasNext()) {
            ((C0176f) it.next()).m537a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r3, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f1676c.f339c).iterator();
        if (it.hasNext()) {
            throw AbstractC0002c.m10e(it);
        }
        super.onPanelClosed(r3, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration newConfig) {
        super.onPictureInPictureModeChanged(z2, newConfig);
        Iterator it = this.f1688o.iterator();
        while (it.hasNext()) {
            C0176f c0176f = (C0176f) it.next();
            AbstractC2492i.m4915e(newConfig, "newConfig");
            c0176f.m537a(new C0879e());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r12, View view, Menu menu) {
        if (r12 != 0) {
            return true;
        }
        super.onPreparePanel(r12, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1676c.f339c).iterator();
        if (it.hasNext()) {
            throw AbstractC0002c.m10e(it);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r4, String[] strArr, int[] r6) {
        if (this.f1683j.m1468a(r4, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", r6))) {
            return;
        }
        super.onRequestPermissionsResult(r4, strArr, r6);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0590i c0590i;
        C0688L c0688l = this.f1679f;
        if (c0688l == null && (c0590i = (C0590i) getLastNonConfigurationInstance()) != null) {
            c0688l = c0590i.f1670a;
        }
        if (c0688l == null) {
            return null;
        }
        C0590i c0590i2 = new C0590i();
        c0590i2.f1670a = c0688l;
        return c0590i2;
    }

    @Override // p144z.AbstractActivityC2907e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0710t c0710t = this.f1677d;
        if (c0710t instanceof C0710t) {
            c0710t.m1797g();
        }
        super.onSaveInstanceState(bundle);
        this.f1678e.m618c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int r4) {
        super.onTrimMemory(r4);
        Iterator it = this.f1685l.iterator();
        while (it.hasNext()) {
            ((C0176f) it.next()).m537a(Integer.valueOf(r4));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0379e.m1082t()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0229j c0229j = this.f1682i;
            synchronized (c0229j.f663a) {
                try {
                    c0229j.f664b = true;
                    Iterator it = ((ArrayList) c0229j.f665c).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2799a) it.next()).invoke();
                    }
                    ((ArrayList) c0229j.f665c).clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        View decorView = getWindow().getDecorView();
        AbstractC2492i.m4915e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC2492i.m4915e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC2492i.m4915e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC2492i.m4915e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC2492i.m4915e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        ExecutorC0591j executorC0591j = this.f1681h;
        if (!executorC0591j.f1673c) {
            executorC0591j.f1673c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(executorC0591j);
        }
        super.setContentView(view);
    }
}
