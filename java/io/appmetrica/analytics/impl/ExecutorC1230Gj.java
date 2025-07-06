package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.Gj */
/* loaded from: classes.dex */
public final class ExecutorC1230Gj implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f4802a;

    public ExecutorC1230Gj(Handler handler) {
        this.f4802a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4802a.post(runnable);
    }
}
