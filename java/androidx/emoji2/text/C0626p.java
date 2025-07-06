package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000A.AbstractC0002c;
import p008C1.C0090v;
import p018G1.C0169t;
import p019H.AbstractC0174d;
import p019H.C0179i;
import p036M1.AbstractC0379e;
import p036M1.AbstractC0387m;
import p050R0.RunnableC0458b;
import p124s0.C2738i;

/* renamed from: androidx.emoji2.text.p */
/* loaded from: classes.dex */
public final class C0626p implements InterfaceC0619i {

    /* renamed from: a */
    public final Context f2094a;

    /* renamed from: b */
    public final C0090v f2095b;

    /* renamed from: c */
    public final C2738i f2096c;

    /* renamed from: d */
    public final Object f2097d;

    /* renamed from: e */
    public Handler f2098e;

    /* renamed from: f */
    public ThreadPoolExecutor f2099f;

    /* renamed from: g */
    public ThreadPoolExecutor f2100g;

    /* renamed from: h */
    public AbstractC0387m f2101h;

    public C0626p(Context context, C0090v c0090v) {
        C2738i c2738i = C0627q.f2102d;
        this.f2097d = new Object();
        AbstractC0379e.m1073d(context, "Context cannot be null");
        this.f2094a = context.getApplicationContext();
        this.f2095b = c0090v;
        this.f2096c = c2738i;
    }

    @Override // androidx.emoji2.text.InterfaceC0619i
    /* renamed from: a */
    public final void mo95a(AbstractC0387m abstractC0387m) {
        synchronized (this.f2097d) {
            this.f2101h = abstractC0387m;
        }
        m1642c();
    }

    /* renamed from: b */
    public final void m1641b() {
        synchronized (this.f2097d) {
            try {
                this.f2101h = null;
                Handler handler = this.f2098e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f2098e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2100g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2099f = null;
                this.f2100g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m1642c() {
        synchronized (this.f2097d) {
            try {
                if (this.f2101h == null) {
                    return;
                }
                if (this.f2099f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0611a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f2100g = threadPoolExecutor;
                    this.f2099f = threadPoolExecutor;
                }
                this.f2099f.execute(new RunnableC0458b(5, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final C0179i m1643d() {
        try {
            C2738i c2738i = this.f2096c;
            Context context = this.f2094a;
            C0090v c0090v = this.f2095b;
            c2738i.getClass();
            C0169t m536a = AbstractC0174d.m536a(context, c0090v);
            int r12 = m536a.f532a;
            if (r12 != 0) {
                throw new RuntimeException(AbstractC0002c.m13h("fetchFonts failed (", r12, ")"));
            }
            C0179i[] c0179iArr = (C0179i[]) m536a.f533b;
            if (c0179iArr == null || c0179iArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0179iArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }
}
