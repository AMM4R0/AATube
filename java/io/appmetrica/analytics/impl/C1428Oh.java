package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Oh */
/* loaded from: classes.dex */
public final class C1428Oh implements InterfaceC1495Ra {

    /* renamed from: a */
    public final Context f5177a;

    /* renamed from: b */
    public final C1748bf f5178b;

    /* renamed from: c */
    public final C1726ai f5179c;

    /* renamed from: d */
    public final Handler f5180d;

    /* renamed from: e */
    public final C1904hl f5181e;

    /* renamed from: f */
    public final HashMap f5182f;

    /* renamed from: g */
    public final C1532Sm f5183g;

    /* renamed from: h */
    public final List f5184h;

    public C1428Oh(Context context, C1748bf c1748bf, C1726ai c1726ai, Handler handler, C1904hl c1904hl) {
        HashMap hashMap = new HashMap();
        this.f5182f = hashMap;
        this.f5183g = new C1532Sm(new C1478Qh(hashMap));
        this.f5184h = Arrays.asList("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
        this.f5177a = context;
        this.f5178b = c1748bf;
        this.f5179c = c1726ai;
        this.f5180d = handler;
        this.f5181e = c1904hl;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1495Ra, io.appmetrica.analytics.impl.InterfaceC1520Sa
    /* renamed from: a */
    public final InterfaceC1495Ra mo2749a() {
        return this;
    }

    /* renamed from: b */
    public final C1428Oh m3183b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1495Ra
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1795dc mo3180a(AppMetricaConfig appMetricaConfig, boolean z2) {
        this.f5183g.mo2706a(appMetricaConfig.apiKey);
        C1795dc c1795dc = new C1795dc(this.f5177a, this.f5178b, appMetricaConfig, this.f5179c, this.f5181e, new C1981kn(this, "20799a27-fa80-4b36-b2db-0f8141f24180"), new C1981kn(this, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"));
        c1795dc.f5843i = new C1944jb(this.f5180d, c1795dc);
        C1904hl c1904hl = this.f5181e;
        C2000lh c2000lh = c1795dc.f5836b;
        if (c1904hl != null) {
            c2000lh.f6458b.setUuid(c1904hl.m3971g());
        } else {
            c2000lh.getClass();
        }
        if (z2) {
            c1795dc.clearAppEnvironment();
        }
        c1795dc.m3588a(appMetricaConfig.appEnvironment);
        c1795dc.m3590b(appMetricaConfig.errorEnvironment);
        c1795dc.mo3595j();
        this.f5179c.f5887f.f7534c = new C1403Nh(c1795dc);
        this.f5182f.put(appMetricaConfig.apiKey, c1795dc);
        return c1795dc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1495Ra
    /* renamed from: a */
    public final synchronized void mo3182a(ReporterConfig reporterConfig) {
        try {
            if (this.f5182f.containsKey(reporterConfig.apiKey)) {
                C2123qf m3315a = AbstractC1521Sb.m3315a(reporterConfig.apiKey);
                if (m3315a.f5471b) {
                    m3315a.m3359a(5, "Reporter with apiKey=%s already exists.", reporterConfig.apiKey);
                }
            } else {
                mo3184b(reporterConfig);
                Log.i("AppMetrica", "Activate reporter with APIKey " + AbstractC2356zn.m4696a(reporterConfig.apiKey));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1495Ra
    /* renamed from: a */
    public final synchronized InterfaceC1545Ta mo3181a(AppMetricaConfig appMetricaConfig) {
        InterfaceC1471Qa interfaceC1471Qa;
        try {
            InterfaceC1471Qa interfaceC1471Qa2 = (InterfaceC1471Qa) this.f5182f.get(appMetricaConfig.apiKey);
            interfaceC1471Qa = interfaceC1471Qa2;
            if (interfaceC1471Qa2 == null) {
                Context context = this.f5177a;
                C2164s6 c2164s6 = new C2164s6(context, this.f5178b, appMetricaConfig, this.f5179c, new C1370M9(context));
                c2164s6.f5843i = new C1944jb(this.f5180d, c2164s6);
                C1904hl c1904hl = this.f5181e;
                C2000lh c2000lh = c2164s6.f5836b;
                if (c1904hl != null) {
                    c2000lh.f6458b.setUuid(c1904hl.m3971g());
                } else {
                    c2000lh.getClass();
                }
                c2164s6.m3590b(appMetricaConfig.errorEnvironment);
                c2164s6.mo3595j();
                interfaceC1471Qa = c2164s6;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC1471Qa;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1495Ra
    /* renamed from: b */
    public final synchronized InterfaceC1471Qa mo3184b(ReporterConfig reporterConfig) {
        InterfaceC1471Qa interfaceC1471Qa;
        try {
            interfaceC1471Qa = (InterfaceC1471Qa) this.f5182f.get(reporterConfig.apiKey);
            if (interfaceC1471Qa == null) {
                if (!this.f5184h.contains(reporterConfig.apiKey)) {
                    this.f5181e.m3973i();
                }
                Context context = this.f5177a;
                C2095pc c2095pc = new C2095pc(context, this.f5178b, reporterConfig, this.f5179c, new C1370M9(context));
                c2095pc.f5843i = new C1944jb(this.f5180d, c2095pc);
                C1904hl c1904hl = this.f5181e;
                C2000lh c2000lh = c2095pc.f5836b;
                if (c1904hl != null) {
                    c2000lh.f6458b.setUuid(c1904hl.m3971g());
                } else {
                    c2000lh.getClass();
                }
                c2095pc.mo3595j();
                this.f5182f.put(reporterConfig.apiKey, c2095pc);
                interfaceC1471Qa = c2095pc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC1471Qa;
    }
}
