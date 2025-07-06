package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;

/* renamed from: io.appmetrica.analytics.impl.Ei */
/* loaded from: classes.dex */
public final class C1179Ei implements InterfaceC1982l {

    /* renamed from: g */
    public static volatile C1179Ei f4702g;

    /* renamed from: a */
    public final Context f4703a;

    /* renamed from: b */
    public ScreenInfo f4704b;

    /* renamed from: c */
    public WeakReference f4705c = new WeakReference(null);

    /* renamed from: d */
    public final C2272we f4706d;

    /* renamed from: e */
    public final C1154Di f4707e;

    /* renamed from: f */
    public boolean f4708f;

    public C1179Ei(Context context, C2272we c2272we, C1154Di c1154Di) {
        this.f4703a = context;
        this.f4706d = c2272we;
        this.f4707e = c1154Di;
        this.f4704b = c2272we.m4575o();
        this.f4708f = c2272we.m4579s();
        C2312y4.m4633h().m4635a().m4118a(this);
    }

    /* renamed from: a */
    public static C1179Ei m2862a(Context context) {
        if (f4702g == null) {
            synchronized (C1179Ei.class) {
                try {
                    if (f4702g == null) {
                        f4702g = new C1179Ei(context, new C2272we(C1765c7.m3695a(context).m3697a()), new C1154Di());
                    }
                } finally {
                }
            }
        }
        return f4702g;
    }

    /* renamed from: b */
    public final void m2865b(Context context) {
        if (context != null) {
            this.f4707e.getClass();
            ScreenInfo m2839a = C1154Di.m2839a(context);
            if (m2839a == null || m2839a.equals(this.f4704b)) {
                return;
            }
            this.f4704b = m2839a;
            this.f4706d.m4544a(m2839a);
        }
    }

    /* renamed from: a */
    public final synchronized ScreenInfo m2863a() {
        try {
            m2865b((Context) this.f4705c.get());
            if (this.f4704b == null) {
                if (AndroidUtils.isApiAchieved(30)) {
                    if (!this.f4708f) {
                        m2865b(this.f4703a);
                        this.f4708f = true;
                        this.f4706d.m4581u();
                    }
                } else {
                    m2865b(this.f4703a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4704b;
    }

    /* renamed from: a */
    public final synchronized void m2864a(Activity activity) {
        this.f4705c = new WeakReference(activity);
        if (this.f4704b == null) {
            m2865b(activity);
        }
    }
}
