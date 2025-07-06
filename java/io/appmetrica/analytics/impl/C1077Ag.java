package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.Ag */
/* loaded from: classes.dex */
public final class C1077Ag {

    /* renamed from: a */
    public final Context f4481a;

    /* renamed from: b */
    public final ICommonExecutor f4482b;

    /* renamed from: c */
    public final C2287x4 f4483c;

    /* renamed from: d */
    public final C1718aa f4484d;

    public C1077Ag(Context context, C2287x4 c2287x4, IHandlerExecutor iHandlerExecutor, C1718aa c1718aa) {
        this.f4481a = context;
        this.f4482b = iHandlerExecutor;
        this.f4483c = c2287x4;
        this.f4484d = c1718aa;
    }

    /* renamed from: a */
    public final void m2733a(C2233v0 c2233v0, Consumer consumer, Function function) {
        ICommonExecutor iCommonExecutor = this.f4482b;
        C1718aa c1718aa = this.f4484d;
        String str = c2233v0.f7249d;
        c1718aa.getClass();
        iCommonExecutor.execute(new RunnableC2248vf(new File(str), new C2021md(new C2046nd(c2233v0.f7246a, c2233v0.f7247b), new C1996ld()), consumer, new C2349zg(this, c2233v0.f7251f, function)));
    }
}
