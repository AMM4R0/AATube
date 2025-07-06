package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.e */
/* loaded from: classes.dex */
public final class C1807e extends Thread {

    /* renamed from: a */
    public final /* synthetic */ C1832f f6112a;

    public C1807e(C1832f c1832f) {
        this.f6112a = c1832f;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted()) {
            this.f6112a.f6179e.set(false);
            C1832f c1832f = this.f6112a;
            c1832f.f6177c.postAtFrontOfQueue(c1832f.f6180f);
            int r02 = this.f6112a.f6176b;
            while (r02 > 0) {
                try {
                    Thread.sleep(C1832f.f6173g);
                    if (this.f6112a.f6179e.get()) {
                        break;
                    } else {
                        r02--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (r02 == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f6112a.f6175a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1782d) it.next()).onAppNotResponding();
                }
            }
            while (!this.f6112a.f6179e.get()) {
                try {
                    Thread.sleep(C1832f.f6173g);
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }
}
