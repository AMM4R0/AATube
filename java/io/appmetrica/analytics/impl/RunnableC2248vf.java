package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.vf */
/* loaded from: classes.dex */
public final class RunnableC2248vf implements Runnable {

    /* renamed from: a */
    public final File f7304a;

    /* renamed from: b */
    public final Function f7305b;

    /* renamed from: c */
    public final Consumer f7306c;

    /* renamed from: d */
    public final Consumer f7307d;

    public RunnableC2248vf(File file, Function function, Consumer consumer, Consumer consumer2) {
        this.f7304a = file;
        this.f7305b = function;
        this.f7306c = consumer;
        this.f7307d = consumer2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7304a.exists()) {
            try {
                Object apply = this.f7305b.apply(this.f7304a);
                if (apply != null) {
                    this.f7307d.consume(apply);
                }
            } catch (Throwable unused) {
            }
            this.f7306c.consume(this.f7304a);
        }
    }
}
