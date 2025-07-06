package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.ed */
/* loaded from: classes.dex */
public abstract class AbstractC1821ed {

    /* renamed from: a */
    public static C2267w9 f6148a;

    /* renamed from: a */
    public static final synchronized C2267w9 m3787a(Context context) {
        C2267w9 c2267w9;
        synchronized (AbstractC1821ed.class) {
            c2267w9 = f6148a;
            if (c2267w9 == null) {
                c2267w9 = new C2267w9(context, "uuid.dat");
                f6148a = c2267w9;
            }
        }
        return c2267w9;
    }
}
