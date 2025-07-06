package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.p097io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2492i;
import p103k0.AbstractC2480a;
import p108m1.C2668r;

/* renamed from: io.appmetrica.analytics.impl.G1 */
/* loaded from: classes.dex */
public final class C1212G1 implements InterfaceC2159s1, InterfaceC1958k0 {

    /* renamed from: a */
    public boolean f4751a;

    /* renamed from: b */
    public final Context f4752b;

    /* renamed from: c */
    public volatile InterfaceC2134r1 f4753c;

    /* renamed from: d */
    public final C2287x4 f4754d;

    /* renamed from: e */
    public final C1462Q1 f4755e;

    /* renamed from: f */
    public C1077Ag f4756f;

    /* renamed from: g */
    public final C1793da f4757g;

    /* renamed from: h */
    public final C2196td f4758h;

    /* renamed from: i */
    public final C2035n2 f4759i;

    /* renamed from: j */
    public final ICommonExecutor f4760j;

    /* renamed from: k */
    public final C1237H1 f4761k;

    /* renamed from: l */
    public final C1162E1 f4762l;

    /* renamed from: m */
    public final C1327Kg f4763m;

    /* renamed from: n */
    public C1964k6 f4764n;

    public C1212G1(Context context, InterfaceC2134r1 interfaceC2134r1) {
        this(context, interfaceC2134r1, new C2163s5(context));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    /* renamed from: a */
    public final void mo2812a(Intent intent, int r2) {
        m2887b(intent, r2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    /* renamed from: b */
    public final void mo2815b(Intent intent) {
        this.f4755e.m3231e(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if ("io.appmetrica.analytics.IAppMetricaService".equals(action) && data != null && data.getPath().equals("/client")) {
                int parseInt = Integer.parseInt(data.getQueryParameter("pid"));
                this.f4754d.m4597a(parseInt, encodedAuthority, data.getQueryParameter("psid"));
                this.f4759i.m4231a(parseInt);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    /* renamed from: c */
    public final void mo2816c(Intent intent) {
        C1462Q1 c1462q1 = this.f4755e;
        if (intent == null) {
            c1462q1.getClass();
            return;
        }
        c1462q1.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            c1462q1.f5237a.m4264a(action, Integer.valueOf(C1462Q1.m3218a(intent)));
        }
        for (Map.Entry entry : c1462q1.f5238b.entrySet()) {
            if (((InterfaceC1412O1) entry.getValue()).mo3037a(intent)) {
                ((InterfaceC1437P1) entry.getKey()).mo2867a(intent);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    public final void onConfigurationChanged(Configuration configuration) {
        C2018ma.f6725C.m4212s().m2988a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    public final void onCreate() {
        if (this.f4751a) {
            C2018ma.f6725C.m4212s().m2988a(this.f4752b.getResources().getConfiguration());
        } else {
            this.f4757g.m3743b(this.f4752b);
            C2018ma c2018ma = C2018ma.f6725C;
            synchronized (c2018ma) {
                c2018ma.f6727B.initAsync();
                c2018ma.f6748u.m2781b(c2018ma.f6728a);
                c2018ma.f6748u.m2779a(new C2306xn(c2018ma.f6727B));
                NetworkServiceLocator.init();
                c2018ma.m4202i().m4608a(c2018ma.f6744q);
                c2018ma.m4194B();
            }
            AbstractC2302xj.f7461a.m4668e();
            C1107Bl c1107Bl = C2018ma.f6725C.f6748u;
            C2354zl m2778a = c1107Bl.m2778a();
            C2354zl m2778a2 = c1107Bl.m2778a();
            C1405Nj m4206m = C2018ma.f6725C.m4206m();
            m4206m.m3126a(new C1105Bj(new C1448Pc(this.f4755e)), m2778a2);
            c1107Bl.m2779a(m4206m);
            ((C1555Tk) C2018ma.f6725C.m4217x()).getClass();
            C1462Q1 c1462q1 = this.f4755e;
            c1462q1.f5238b.put(new C1187F1(this), new C1362M1(c1462q1));
            C2018ma.f6725C.m4203j().init();
            C1534T m4215v = C2018ma.f6725C.m4215v();
            Context context = this.f4752b;
            m4215v.f5440c = m2778a;
            m4215v.mo3337b(context);
            C1237H1 c1237h1 = this.f4761k;
            Context context2 = this.f4752b;
            C2287x4 c2287x4 = this.f4754d;
            c1237h1.getClass();
            this.f4756f = new C1077Ag(context2, c2287x4, C2018ma.f6725C.f6731d.m2966e(), new C1718aa());
            AppMetrica.getReporter(this.f4752b, "20799a27-fa80-4b36-b2db-0f8141f24180");
            File crashesDirectory = FileUtils.getCrashesDirectory(this.f4752b);
            if (crashesDirectory != null) {
                C1237H1 c1237h12 = this.f4761k;
                C1162E1 c1162e1 = this.f4762l;
                c1237h12.getClass();
                this.f4764n = new C1964k6(new FileObserverC1989l6(crashesDirectory, c1162e1, new C1718aa()), crashesDirectory, new C2014m6());
                this.f4760j.execute(new RunnableC2273wf(crashesDirectory, this.f4762l, C1693Z9.m3573a(this.f4752b)));
                C1964k6 c1964k6 = this.f4764n;
                C2014m6 c2014m6 = c1964k6.f6565c;
                File file = c1964k6.f6564b;
                c2014m6.getClass();
                if (file != null) {
                    if (!file.exists()) {
                        file.mkdir();
                    } else if (!file.isDirectory() && file.delete()) {
                        file.mkdir();
                    }
                }
                c1964k6.f6563a.startWatching();
            }
            C2196td c2196td = this.f4758h;
            Context context3 = this.f4752b;
            C1077Ag c1077Ag = this.f4756f;
            c2196td.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                c2196td.f7167a.init(context3, new NativeCrashServiceConfig(absolutePath));
                C2146rd c2146rd = new C2146rd(c1077Ag, new C2171sd(c2196td));
                c2196td.f7168b = c2146rd;
                c2146rd.m4401a(c2196td.f7167a.getAllCrashes());
                NativeCrashServiceModule nativeCrashServiceModule = c2196td.f7167a;
                C2146rd c2146rd2 = c2196td.f7168b;
                if (c2146rd2 == null) {
                    AbstractC2492i.m4918h("crashReporter");
                    throw null;
                }
                nativeCrashServiceModule.setDefaultCrashHandler(c2146rd2);
            }
            new RunnableC1466Q5(AbstractC2480a.m4863D(new RunnableC1202Fg())).run();
            this.f4751a = true;
        }
        C2018ma.f6725C.m4202i().m4607a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    public final void onDestroy() {
        C2294xb m4202i = C2018ma.f6725C.m4202i();
        synchronized (m4202i) {
            Iterator it = m4202i.f7429c.iterator();
            while (it.hasNext()) {
                ((InterfaceC1305Jj) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    public final void pauseUserSession(Bundle bundle) {
        C1748bf c1748bf;
        bundle.setClassLoader(C1748bf.class.getClassLoader());
        String str = C1748bf.f5920c;
        try {
            c1748bf = (C1748bf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            c1748bf = null;
        }
        Integer asInteger = c1748bf != null ? c1748bf.f5921a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f4759i.m4232b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    public final void reportData(int r3, Bundle bundle) {
        this.f4763m.getClass();
        List list = (List) C2018ma.f6725C.f6749v.f4647a.get(Integer.valueOf(r3));
        if (list == null) {
            list = C2668r.f8607a;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC1130Cj) it.next()).reportData(r3, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    public final void resumeUserSession(Bundle bundle) {
        C1748bf c1748bf;
        bundle.setClassLoader(C1748bf.class.getClassLoader());
        String str = C1748bf.f5920c;
        try {
            c1748bf = (C1748bf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            c1748bf = null;
        }
        Integer asInteger = c1748bf != null ? c1748bf.f5921a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f4759i.m4233c(asInteger.intValue());
        }
    }

    public C1212G1(Context context, InterfaceC2134r1 interfaceC2134r1, C2163s5 c2163s5) {
        this(context, interfaceC2134r1, new C2287x4(context, c2163s5), new C1462Q1(), C1793da.f6086d, C2018ma.m4192h().m4197c(), C2018ma.m4192h().m4214u().m2966e(), new C1237H1());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    /* renamed from: a */
    public final void mo2813a(Intent intent, int r2, int r3) {
        m2887b(intent, r3);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    /* renamed from: a */
    public final void mo2811a(Intent intent) {
        C1462Q1 c1462q1 = this.f4755e;
        if (intent != null) {
            c1462q1.getClass();
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                c1462q1.f5237a.m4264a(action, Integer.valueOf(C1462Q1.m3218a(intent)));
            }
            for (Map.Entry entry : c1462q1.f5238b.entrySet()) {
                if (((InterfaceC1412O1) entry.getValue()).mo3037a(intent)) {
                    ((InterfaceC1437P1) entry.getKey()).mo2867a(intent);
                }
            }
            return;
        }
        c1462q1.getClass();
    }

    public C1212G1(Context context, InterfaceC2134r1 interfaceC2134r1, C2287x4 c2287x4, C1462Q1 c1462q1, C1793da c1793da, C2035n2 c2035n2, IHandlerExecutor iHandlerExecutor, C1237H1 c1237h1) {
        this.f4751a = false;
        this.f4762l = new C1162E1(this);
        this.f4752b = context;
        this.f4753c = interfaceC2134r1;
        this.f4754d = c2287x4;
        this.f4755e = c1462q1;
        this.f4757g = c1793da;
        this.f4759i = c2035n2;
        this.f4760j = iHandlerExecutor;
        this.f4761k = c1237h1;
        this.f4758h = C2018ma.m4192h().m4208o();
        this.f4763m = new C1327Kg();
    }

    /* renamed from: b */
    public final void m2887b(Intent intent, int r6) {
        Bundle extras;
        C1912i4 m3976a;
        if (intent != null) {
            intent.getExtras().setClassLoader(CounterConfiguration.class.getClassLoader());
            if (intent.getData() != null && (m3976a = C1912i4.m3976a(this.f4752b, (extras = intent.getExtras()))) != null) {
                C1615W5 m3465b = C1615W5.m3465b(extras);
                if (!(m3465b.m3491l() | m3465b.m3492m())) {
                    try {
                        C1077Ag c1077Ag = this.f4756f;
                        C2062o4 m4253a = C2062o4.m4253a(m3976a);
                        C1290J4 c1290j4 = new C1290J4(m3976a);
                        c1077Ag.f4483c.m4596a(m4253a, c1290j4).mo2692a(m3465b, c1290j4);
                        c1077Ag.f4483c.m4597a(m4253a.f6839c.intValue(), m4253a.f6838b, m4253a.f6840d);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        ((C2084p1) this.f4753c).f6881a.stopSelfResult(r6);
    }

    /* renamed from: a */
    public final void m2885a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        C1615W5.m3465b(bundle);
        C1077Ag c1077Ag = this.f4756f;
        C1615W5 m3465b = C1615W5.m3465b(bundle);
        c1077Ag.getClass();
        if (m3465b.m3492m()) {
            return;
        }
        c1077Ag.f4482b.execute(new RunnableC1526Sg(c1077Ag.f4481a, m3465b, bundle, c1077Ag.f4483c));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2159s1
    /* renamed from: a */
    public final void mo2814a(InterfaceC2134r1 interfaceC2134r1) {
        this.f4753c = interfaceC2134r1;
    }

    /* renamed from: a */
    public final void m2886a(File file) {
        C1077Ag c1077Ag = this.f4756f;
        c1077Ag.getClass();
        C1919ib c1919ib = new C1919ib();
        c1077Ag.f4482b.execute(new RunnableC2248vf(file, c1919ib, c1919ib, new C2274wg(c1077Ag)));
    }
}
