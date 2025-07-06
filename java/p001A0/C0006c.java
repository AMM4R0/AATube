package p001A0;

import android.content.Context;
import androidx.emoji2.text.InterfaceC0619i;
import androidx.emoji2.text.ThreadFactoryC0611a;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001A0.C0006c;
import p036M1.AbstractC0379e;
import p036M1.AbstractC0387m;

/* renamed from: A0.c */
/* loaded from: classes.dex */
public final class C0006c implements InterfaceC0619i {

    /* renamed from: a */
    public final Context f3a;

    public C0006c(Context context, int r2) {
        switch (r2) {
            case 1:
                this.f3a = context.getApplicationContext();
                break;
            default:
                this.f3a = context;
                break;
        }
    }

    @Override // androidx.emoji2.text.InterfaceC0619i
    /* renamed from: a */
    public void mo95a(final AbstractC0387m abstractC0387m) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0611a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.k
            @Override // java.lang.Runnable
            public final void run() {
                C0006c c0006c = C0006c.this;
                AbstractC0387m abstractC0387m2 = abstractC0387m;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                c0006c.getClass();
                try {
                    C0627q m1077h = AbstractC0379e.m1077h(c0006c.f3a);
                    if (m1077h == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0626p c0626p = (C0626p) ((InterfaceC0619i) m1077h.f2067b);
                    synchronized (c0626p.f2097d) {
                        c0626p.f2099f = threadPoolExecutor2;
                    }
                    ((InterfaceC0619i) m1077h.f2067b).mo95a(new C0622l(abstractC0387m2, threadPoolExecutor2));
                } catch (Throwable th) {
                    abstractC0387m2.mo1129H(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }
}
