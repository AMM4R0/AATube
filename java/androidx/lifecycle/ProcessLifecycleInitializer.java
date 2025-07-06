package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.jvm.internal.AbstractC2492i;
import p085g0.C0911a;
import p085g0.InterfaceC0912b;
import p108m1.C2668r;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0912b {
    @Override // p085g0.InterfaceC0912b
    /* renamed from: a */
    public final List mo1607a() {
        return C2668r.f8607a;
    }

    @Override // p085g0.InterfaceC0912b
    /* renamed from: b */
    public final Object mo1608b(Context context) {
        AbstractC2492i.m4915e(context, "context");
        C0911a m2462c = C0911a.m2462c(context);
        AbstractC2492i.m4914d(m2462c, "getInstance(context)");
        if (!m2462c.f3824b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0705o.f2411a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC2492i.m4913c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0704n());
        }
        C0678B c0678b = C0678B.f2364i;
        c0678b.getClass();
        c0678b.f2369e = new Handler();
        c0678b.f2370f.m1794d(EnumC0702l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC2492i.m4913c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0677A(c0678b));
        return c0678b;
    }
}
