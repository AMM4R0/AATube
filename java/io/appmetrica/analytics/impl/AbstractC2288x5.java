package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.x5 */
/* loaded from: classes.dex */
public abstract class AbstractC2288x5 implements InterfaceC1279Ii {

    /* renamed from: a */
    public BaseRequestConfig f7416a;

    /* renamed from: b */
    public final BaseRequestConfig.RequestConfigLoader f7417b;

    /* renamed from: c */
    public C1490R5 f7418c;

    public AbstractC2288x5(BaseRequestConfig.RequestConfigLoader<Object, C1490R5> requestConfigLoader, C2354zl c2354zl, ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f7417b = requestConfigLoader;
        C2018ma.m4192h().m4212s().m2990a(this);
        m4599a(new C1490R5(c2354zl, C2018ma.m4192h().m4212s(), C2018ma.m4192h().m4209p(), argumentsMerger));
    }

    /* renamed from: a */
    public final synchronized void m4599a(C1490R5 c1490r5) {
        this.f7418c = c1490r5;
    }

    /* renamed from: b */
    public final synchronized ArgumentsMerger<Object, Object> m4601b() {
        return (ArgumentsMerger) this.f7418c.componentArguments;
    }

    /* renamed from: c */
    public final synchronized C2354zl m4602c() {
        return this.f7418c.f5309a;
    }

    /* renamed from: d */
    public final void m4603d() {
        synchronized (this) {
            this.f7416a = null;
        }
    }

    /* renamed from: e */
    public final synchronized void m4604e() {
        this.f7416a = null;
    }

    /* renamed from: a */
    public synchronized void mo3597a(Object obj) {
        if (!((ArgumentsMerger) this.f7418c.componentArguments).compareWithOtherArguments(obj)) {
            m4599a(new C1490R5(m4602c(), C2018ma.f6725C.m4212s(), C2018ma.f6725C.m4209p(), ((ArgumentsMerger) this.f7418c.componentArguments).mergeFrom(obj)));
            m4604e();
        }
    }

    /* renamed from: a */
    public final synchronized void m4600a(C2354zl c2354zl) {
        m4599a(new C1490R5(c2354zl, C2018ma.f6725C.m4212s(), C2018ma.f6725C.m4209p(), m4601b()));
        m4604e();
    }

    /* renamed from: a */
    public final synchronized BaseRequestConfig m4598a() {
        try {
            if (this.f7416a == null) {
                this.f7416a = this.f7417b.load(this.f7418c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7416a;
    }
}
