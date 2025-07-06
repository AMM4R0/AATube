package p106m;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m.b */
/* loaded from: classes.dex */
public final class ThreadFactoryC2638b implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f8560a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f8560a.getAndIncrement());
        return thread;
    }
}
