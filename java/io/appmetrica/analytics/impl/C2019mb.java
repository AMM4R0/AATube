package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.mb */
/* loaded from: classes.dex */
public final class C2019mb extends InterruptionSafeThread {

    /* renamed from: a */
    public final /* synthetic */ C2044nb f6754a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2019mb(C2044nb c2044nb, String str) {
        super(str);
        this.f6754a = c2044nb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        synchronized (this.f6754a.f6806a) {
            C2044nb.m4242a(this.f6754a);
            this.f6754a.f6810e = true;
            this.f6754a.f6806a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f6754a.f6807b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                hashMap = new HashMap(this.f6754a.f6807b);
                this.f6754a.f6807b.clear();
            }
            if (hashMap.size() > 0) {
                C2044nb.m4243a(this.f6754a, hashMap);
                hashMap.clear();
            }
        }
    }
}
