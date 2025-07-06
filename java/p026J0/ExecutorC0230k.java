package p026J0;

import java.util.concurrent.Executor;

/* renamed from: J0.k */
/* loaded from: classes.dex */
public final class ExecutorC0230k implements Executor {

    /* renamed from: a */
    public final /* synthetic */ int f666a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f666a) {
            case 0:
                runnable.run();
                break;
            default:
                new Thread(runnable).start();
                break;
        }
    }
}
