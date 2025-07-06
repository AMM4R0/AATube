package p019H;

import java.util.concurrent.ThreadFactory;

/* renamed from: H.k */
/* loaded from: classes.dex */
public final class ThreadFactoryC0181k implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C0180j(runnable);
    }
}
