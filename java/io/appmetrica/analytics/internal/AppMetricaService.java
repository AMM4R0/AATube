package io.appmetrica.analytics.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.impl.AbstractC1546Tb;
import io.appmetrica.analytics.impl.BinderC2109q1;
import io.appmetrica.analytics.impl.C1137D1;
import io.appmetrica.analytics.impl.C1155Dj;
import io.appmetrica.analytics.impl.C1212G1;
import io.appmetrica.analytics.impl.C1287J1;
import io.appmetrica.analytics.impl.C1503Ri;
import io.appmetrica.analytics.impl.C1528Si;
import io.appmetrica.analytics.impl.C2018ma;
import io.appmetrica.analytics.impl.C2084p1;
import io.appmetrica.analytics.impl.C2163s5;
import io.appmetrica.analytics.impl.C2184t1;
import io.appmetrica.analytics.impl.C2234v1;
import io.appmetrica.analytics.impl.C2259w1;
import io.appmetrica.analytics.impl.C2284x1;
import io.appmetrica.analytics.impl.C2309y1;
import io.appmetrica.analytics.impl.C2334z1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public class AppMetricaService extends Service {

    /* renamed from: c */
    private static C1137D1 f7570c;

    /* renamed from: a */
    private final C2084p1 f7571a = new C2084p1(this);

    /* renamed from: b */
    private final BinderC2357a f7572b = new BinderC2357a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        IBinder binderC2109q1 = (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) ? this.f7572b : new BinderC2109q1();
        C1137D1 c1137d1 = f7570c;
        c1137d1.f4620a.execute(new C2284x1(c1137d1, intent));
        return binderC2109q1;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1137D1 c1137d1 = f7570c;
        c1137d1.f4620a.execute(new C2184t1(c1137d1, configuration));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C2018ma.m4191a(getApplicationContext());
        AbstractC1546Tb.m3356a(getApplicationContext());
        C1137D1 c1137d1 = f7570c;
        if (c1137d1 == null) {
            Context applicationContext = getApplicationContext();
            C1212G1 c1212g1 = new C1212G1(applicationContext, this.f7571a, new C2163s5(applicationContext));
            C1155Dj c1155Dj = C2018ma.f6725C.f6749v;
            C1287J1 c1287j1 = new C1287J1(c1212g1);
            LinkedHashMap linkedHashMap = c1155Dj.f4647a;
            Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((List) obj).add(c1287j1);
            f7570c = new C1137D1(C2018ma.f6725C.f6731d.m2963b(), c1212g1);
        } else {
            c1137d1.f4621b.mo2814a(this.f7571a);
        }
        C2018ma c2018ma = C2018ma.f6725C;
        C1528Si c1528Si = new C1528Si(f7570c);
        synchronized (c2018ma) {
            c2018ma.f6733f = new C1503Ri(c2018ma.f6728a, c1528Si);
        }
        f7570c.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f7570c.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        C1137D1 c1137d1 = f7570c;
        c1137d1.f4620a.execute(new C2309y1(c1137d1, intent));
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int r5) {
        C1137D1 c1137d1 = f7570c;
        c1137d1.f4620a.execute(new C2234v1(c1137d1, intent, r5));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int r5, int r6) {
        C1137D1 c1137d1 = f7570c;
        c1137d1.f4620a.execute(new C2259w1(c1137d1, intent, r5, r6));
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        C1137D1 c1137d1 = f7570c;
        c1137d1.f4620a.execute(new C2334z1(c1137d1, intent));
        String action = intent.getAction();
        return (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) && intent.getData() != null;
    }
}
