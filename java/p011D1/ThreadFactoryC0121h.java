package p011D1;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: D1.h */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0121h implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f366a;

    /* renamed from: b */
    public final /* synthetic */ boolean f367b;

    public /* synthetic */ ThreadFactoryC0121h(String str, boolean z2) {
        this.f366a = str;
        this.f367b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f366a;
        AbstractC2492i.m4915e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f367b);
        return thread;
    }
}
