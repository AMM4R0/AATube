package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.I2 */
/* loaded from: classes.dex */
public final class C1263I2 extends BroadcastReceiver {

    /* renamed from: a */
    public final BiConsumer f4831a;

    /* renamed from: b */
    public final ICommonExecutor f4832b;

    public C1263I2(C1836f3 c1836f3, ICommonExecutor iCommonExecutor) {
        this.f4831a = c1836f3;
        this.f4832b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f4832b.execute(new RunnableC1238H2(this, context, intent));
    }
}
