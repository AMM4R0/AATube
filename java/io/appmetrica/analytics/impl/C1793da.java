package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.da */
/* loaded from: classes.dex */
public final class C1793da {

    /* renamed from: d */
    public static final C1793da f6086d = new C1793da();

    /* renamed from: a */
    public final C1746bd f6087a = new C1746bd();

    /* renamed from: b */
    public final ServiceComponentsInitializer f6088b = AbstractC1080Aj.m2735a();

    /* renamed from: c */
    public boolean f6089c = false;

    /* renamed from: a */
    public final void m3742a(Context context) {
        C2018ma.m4191a(context);
        this.f6088b.onCreate(context);
        this.f6087a.getClass();
        Iterator it = C2018ma.f6725C.f6746s.m2874a().iterator();
        while (it.hasNext()) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String) it.next(), ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor != null) {
                C2018ma.f6725C.m4206m().m3125a((ModuleServiceEntryPoint<Object>) loadAndInstantiateClassWithDefaultConstructor);
            }
        }
        new C1330Kj(C2018ma.m4192h().m4193A().m3245b()).m4684a(context);
        C2018ma.f6725C.m4207n().m3764a();
    }

    /* renamed from: b */
    public final void m3743b(Context context) {
        if (this.f6089c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f6089c) {
                    m3742a(context);
                    this.f6089c = true;
                }
            } finally {
            }
        }
    }
}
