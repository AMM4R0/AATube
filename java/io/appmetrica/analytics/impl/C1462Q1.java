package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Q1 */
/* loaded from: classes.dex */
public final class C1462Q1 {

    /* renamed from: a */
    public final C2068oa f5237a = new C2068oa();

    /* renamed from: b */
    public final LinkedHashMap f5238b = new LinkedHashMap();

    /* renamed from: c */
    public final LinkedHashMap f5239c = new LinkedHashMap();

    /* renamed from: a */
    public final void m3221a(Intent intent, int r2) {
    }

    /* renamed from: b */
    public final void m3225b() {
    }

    /* renamed from: c */
    public final void m3227c() {
    }

    /* renamed from: d */
    public final void m3230d(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f5237a.m4264a(action, Integer.valueOf(m3218a(intent)));
            }
            for (Map.Entry entry : this.f5238b.entrySet()) {
                if (((InterfaceC1412O1) entry.getValue()).mo3037a(intent)) {
                    ((InterfaceC1437P1) entry.getKey()).mo2867a(intent);
                }
            }
        }
    }

    /* renamed from: e */
    public final void m3231e(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                C2068oa c2068oa = this.f5237a;
                Integer valueOf = Integer.valueOf(m3218a(intent));
                Collection collection = (Collection) c2068oa.f6854a.get(action);
                if (collection != null && collection.remove(valueOf)) {
                    if (collection.isEmpty() && c2068oa.f6855b) {
                        c2068oa.f6854a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f5239c.entrySet()) {
                if (((InterfaceC1412O1) entry.getValue()).mo3037a(intent)) {
                    ((InterfaceC1437P1) entry.getKey()).mo2867a(intent);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m3222a(Intent intent, int r2, int r3) {
    }

    /* renamed from: b */
    public final void m3226b(InterfaceC1437P1 interfaceC1437P1) {
        this.f5238b.put(interfaceC1437P1, new C1337L1(this));
    }

    /* renamed from: c */
    public final void m3228c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f5237a.m4264a(action, Integer.valueOf(m3218a(intent)));
            }
            for (Map.Entry entry : this.f5238b.entrySet()) {
                if (((InterfaceC1412O1) entry.getValue()).mo3037a(intent)) {
                    ((InterfaceC1437P1) entry.getKey()).mo2867a(intent);
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m3219b(Intent intent) {
        if ("io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction())) {
            return !(m3218a(intent) == Process.myPid());
        }
        return false;
    }

    /* renamed from: a */
    public final void m3223a(Configuration configuration) {
    }

    /* renamed from: a */
    public final void m3224a(InterfaceC1437P1 interfaceC1437P1) {
        this.f5239c.put(interfaceC1437P1, new C1387N1(this));
    }

    /* renamed from: a */
    public final int m3220a() {
        Collection collection = (Collection) this.f5237a.f6854a.get("io.appmetrica.analytics.IAppMetricaService");
        int r2 = 0;
        if (!AbstractC2356zn.m4702a(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((Integer) it.next()).intValue() != Process.myPid()) {
                    r2++;
                }
            }
        }
        return r2;
    }

    /* renamed from: c */
    public final void m3229c(InterfaceC1437P1 interfaceC1437P1) {
        this.f5238b.put(interfaceC1437P1, new C1362M1(this));
    }

    /* renamed from: a */
    public static int m3218a(Intent intent) {
        Uri data = intent.getData();
        if (data != null && data.getPath().equals("/client")) {
            try {
                return Integer.parseInt(data.getQueryParameter("pid"));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }
}
