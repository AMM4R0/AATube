package p073c0;

import android.view.Choreographer;

/* renamed from: c0.i */
/* loaded from: classes.dex */
public abstract class AbstractC0733i {
    /* renamed from: a */
    public static void m2009a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: c0.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                runnable.run();
            }
        });
    }
}
