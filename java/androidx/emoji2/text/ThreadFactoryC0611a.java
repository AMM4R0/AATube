package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.emoji2.text.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0611a implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f2059a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f2059a);
        thread.setPriority(10);
        return thread;
    }
}
