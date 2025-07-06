package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.wf */
/* loaded from: classes.dex */
public final class RunnableC2273wf implements Runnable {

    /* renamed from: a */
    public final File f7369a;

    /* renamed from: b */
    public final Consumer f7370b;

    /* renamed from: c */
    public final C1693Z9 f7371c;

    public RunnableC2273wf(File file, C1162E1 c1162e1, C1693Z9 c1693z9) {
        this.f7369a = file;
        this.f7370b = c1162e1;
        this.f7371c = c1693z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (this.f7369a.exists() && this.f7369a.isDirectory() && (listFiles = this.f7369a.listFiles()) != null) {
            for (File file : listFiles) {
                C2267w9 m3574a = this.f7371c.m3574a(file.getName());
                try {
                    m3574a.f7343a.lock();
                    m3574a.f7344b.m3536a();
                    this.f7370b.consume(file);
                    m3574a.m4536c();
                } catch (Throwable unused) {
                    m3574a.m4536c();
                }
            }
        }
    }
}
