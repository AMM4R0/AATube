package p026J0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p013E0.HandlerC0128e;

/* renamed from: J0.l */
/* loaded from: classes.dex */
public final class ExecutorC0231l implements Executor {

    /* renamed from: a */
    public final /* synthetic */ int f667a;

    /* renamed from: b */
    public final Handler f668b;

    public /* synthetic */ ExecutorC0231l(HandlerC0128e handlerC0128e) {
        this.f667a = 1;
        this.f668b = handlerC0128e;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f667a) {
            case 0:
                ((HandlerC0128e) this.f668b).post(runnable);
                break;
            default:
                ((HandlerC0128e) this.f668b).post(runnable);
                break;
        }
    }

    public ExecutorC0231l() {
        this.f667a = 0;
        this.f668b = new HandlerC0128e(Looper.getMainLooper());
    }
}
