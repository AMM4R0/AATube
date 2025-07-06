package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Th */
/* loaded from: classes.dex */
public final class C1552Th {

    /* renamed from: a */
    public final HashMap f5482a = new HashMap();

    /* renamed from: b */
    public final C2133r0 f5483b;

    /* renamed from: c */
    public final ICommonExecutor f5484c;

    public C1552Th(ICommonExecutor iCommonExecutor, C2133r0 c2133r0) {
        this.f5484c = iCommonExecutor;
        this.f5483b = c2133r0;
    }

    /* renamed from: a */
    public static C1552Th m3377a() {
        return AbstractC1527Sh.f5430a;
    }

    /* renamed from: a */
    public final C1353Lh m3378a(Context context, String str) {
        C1353Lh c1353Lh = (C1353Lh) this.f5482a.get(str);
        if (c1353Lh == null) {
            synchronized (this.f5482a) {
                try {
                    c1353Lh = (C1353Lh) this.f5482a.get(str);
                    if (c1353Lh == null) {
                        this.f5483b.getClass();
                        if (C2108q0.f6954f == null) {
                            this.f5484c.execute(new RunnableC1502Rh(this, context));
                        }
                        c1353Lh = new C1353Lh(this.f5484c, context.getApplicationContext(), str, new C2133r0());
                        this.f5482a.put(str, c1353Lh);
                        c1353Lh.m3057c(str);
                    }
                } finally {
                }
            }
        }
        return c1353Lh;
    }
}
