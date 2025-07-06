package p019H;

import android.os.Process;

/* renamed from: H.j */
/* loaded from: classes.dex */
public final class C0180j extends Thread {

    /* renamed from: a */
    public final int f566a;

    public C0180j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f566a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f566a);
        super.run();
    }
}
