package p010D0;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.google.android.material.behavior.SwipeDismissBehavior;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import p003B.AbstractC0028b;
import p006C.C0055g;
import p019H.C0176f;
import p023I0.C0208f;
import p026J0.AbstractC0225f;
import p026J0.C0223d;
import p026J0.C0224e;
import p026J0.C0226g;
import p026J0.C0227h;
import p026J0.C0229j;
import p026J0.C0232m;
import p026J0.ExecutorC0230k;
import p026J0.InterfaceC0221b;
import p026J0.InterfaceC0222c;
import p028K.AbstractC0283P;
import p055T.C0516e;
import p116p0.C2706a;
import p124s0.C2731b;
import p127t0.InterfaceC2766c;
import p130u0.BinderC2796t;
import p130u0.C2787k;
import p130u0.C2789m;
import p133v0.AbstractBinderC2846a;
import p133v0.AbstractC2863r;
import p133v0.C2844D;
import p133v0.C2860o;
import p133v0.InterfaceC2850e;
import p144z.AbstractC2904b;
import p144z.C2903a;

/* renamed from: D0.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0106d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f331a;

    /* renamed from: b */
    public final Object f332b;

    /* renamed from: c */
    public final /* synthetic */ Object f333c;

    public /* synthetic */ RunnableC0106d(Object obj, int r2, Object obj2) {
        this.f331a = r2;
        this.f332b = obj;
        this.f333c = obj2;
    }

    /* renamed from: a */
    private final void m340a() {
        synchronized (((C0227h) this.f333c).f661c) {
            try {
                C0226g c0226g = ((C0227h) this.f333c).f662d;
                if (c0226g != null) {
                    Exception mo622b = ((Task) this.f332b).mo622b();
                    AbstractC2863r.m5474c(mo622b);
                    ((C0232m) c0226g.f658d).m625e(mo622b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    private final void m341b() {
        synchronized (((C0226g) this.f333c).f657c) {
            try {
                InterfaceC0222c interfaceC0222c = (InterfaceC0222c) ((C0226g) this.f333c).f658d;
                if (interfaceC0222c != null) {
                    interfaceC0222c.onSuccess(((Task) this.f332b).mo623c());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2850e interfaceC2850e;
        Set set;
        InterfaceC2850e interfaceC2850e2 = null;
        switch (this.f331a) {
            case 0:
                C0109g c0109g = (C0109g) this.f332b;
                Context context = (Context) c0109g.f338b;
                String string = C0109g.m342F(context).getString(CommonUrlParts.APP_SET_ID, null);
                long j2 = C0109g.m342F((Context) c0109g.f338b).getLong("app_set_id_last_used_time", -1L);
                long j3 = j2 != -1 ? 33696000000L + j2 : -1L;
                C0232m c0232m = ((C0224e) this.f333c).f652a;
                if (string == null || System.currentTimeMillis() > j3) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString(CommonUrlParts.APP_SET_ID, string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                            throw new C0108f("Failed to store the app set ID.");
                        }
                        C0109g.m343G(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new C0108f("Failed to store the app set ID creation time.");
                        }
                    } catch (C0108f e2) {
                        c0232m.m625e(e2);
                        return;
                    }
                } else {
                    try {
                        C0109g.m343G(context);
                    } catch (C0108f e3) {
                        c0232m.m625e(e3);
                        return;
                    }
                }
                c0232m.m626f(new C2706a(string, 1));
                return;
            case 1:
                AbstractC0028b abstractC0028b = (AbstractC0028b) ((C0055g) this.f332b).f107b;
                if (abstractC0028b != null) {
                    abstractC0028b.mo175k((Typeface) this.f333c);
                    return;
                }
                return;
            case 2:
                ((C0176f) this.f332b).m537a(this.f333c);
                return;
            case 3:
                C0226g c0226g = (C0226g) this.f333c;
                try {
                    Task m225x = ((C0055g) c0226g.f657c).m225x((Task) this.f332b);
                    if (m225x == null) {
                        ((C0232m) c0226g.f658d).m625e(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC0230k executorC0230k = AbstractC0225f.f654b;
                    m225x.mo621a(executorC0230k, c0226g);
                    C0232m c0232m2 = (C0232m) m225x;
                    C0227h c0227h = new C0227h(executorC0230k, c0226g, 1);
                    C0229j c0229j = c0232m2.f670b;
                    c0229j.m619d(c0227h);
                    c0232m2.m628h();
                    c0229j.m619d(new C0227h(executorC0230k, c0226g, 0));
                    c0232m2.m628h();
                    return;
                } catch (C0223d e4) {
                    if (e4.getCause() instanceof Exception) {
                        ((C0232m) c0226g.f658d).m625e((Exception) e4.getCause());
                        return;
                    } else {
                        ((C0232m) c0226g.f658d).m625e(e4);
                        return;
                    }
                } catch (Exception e5) {
                    ((C0232m) c0226g.f658d).m625e(e5);
                    return;
                }
            case 4:
                synchronized (((C0226g) this.f333c).f657c) {
                    ((InterfaceC0221b) ((C0226g) this.f333c).f658d).onComplete((Task) this.f332b);
                }
                return;
            case 5:
                m340a();
                return;
            case 6:
                m341b();
                return;
            case 7:
                C0516e c0516e = ((SwipeDismissBehavior) this.f333c).f2742a;
                if (c0516e == null || !c0516e.m1337f()) {
                    return;
                }
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                ((View) this.f332b).postOnAnimation(this);
                return;
            case 8:
                C2789m c2789m = (C2789m) this.f333c;
                C2787k c2787k = (C2787k) c2789m.f9122f.f9096j.get(c2789m.f9118b);
                if (c2787k == null) {
                    return;
                }
                C2731b c2731b = (C2731b) this.f332b;
                if (!(c2731b.f8972b == 0)) {
                    c2787k.m5412o(c2731b, null);
                    return;
                }
                c2789m.f9121e = true;
                InterfaceC2766c interfaceC2766c = c2789m.f9117a;
                if (interfaceC2766c.mo594k()) {
                    if (!c2789m.f9121e || (interfaceC2850e = c2789m.f9119c) == null) {
                        return;
                    }
                    interfaceC2766c.mo2039l(interfaceC2850e, c2789m.f9120d);
                    return;
                }
                try {
                    interfaceC2766c.mo2039l(null, interfaceC2766c.mo2034f());
                    return;
                } catch (SecurityException e6) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e6);
                    interfaceC2766c.mo2037i("Failed to get service from broker.");
                    c2787k.m5412o(new C2731b(10), null);
                    return;
                }
            case 9:
                C0208f c0208f = (C0208f) this.f332b;
                C2731b c2731b2 = c0208f.f619b;
                boolean z2 = c2731b2.f8972b == 0;
                BinderC2796t binderC2796t = (BinderC2796t) this.f333c;
                if (z2) {
                    C2860o c2860o = c0208f.f620c;
                    AbstractC2863r.m5474c(c2860o);
                    C2731b c2731b3 = c2860o.f9447c;
                    if (c2731b3.f8972b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c2731b3)), new Exception());
                        binderC2796t.f9145i.m5415b(c2731b3);
                        binderC2796t.f9144h.mo2036h();
                        return;
                    }
                    C2789m c2789m2 = binderC2796t.f9145i;
                    IBinder iBinder = c2860o.f9446b;
                    if (iBinder != null) {
                        int r12 = AbstractBinderC2846a.f9394c;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        interfaceC2850e2 = queryLocalInterface instanceof InterfaceC2850e ? (InterfaceC2850e) queryLocalInterface : new C2844D(iBinder);
                    }
                    c2789m2.getClass();
                    if (interfaceC2850e2 == null || (set = binderC2796t.f9142f) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        c2789m2.m5415b(new C2731b(4));
                    } else {
                        c2789m2.f9119c = interfaceC2850e2;
                        c2789m2.f9120d = set;
                        if (c2789m2.f9121e) {
                            c2789m2.f9117a.mo2039l(interfaceC2850e2, set);
                        }
                    }
                } else {
                    binderC2796t.f9145i.m5415b(c2731b2);
                }
                binderC2796t.f9144h.mo2036h();
                return;
            case 10:
                ((C2903a) this.f332b).f9532a = this.f333c;
                return;
            case 11:
                ((Application) this.f332b).unregisterActivityLifecycleCallbacks((C2903a) this.f333c);
                return;
            default:
                try {
                    Method method = AbstractC2904b.f9541d;
                    Object obj = this.f333c;
                    Object obj2 = this.f332b;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC2904b.f9542e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e7) {
                    if (e7.getClass() == RuntimeException.class && e7.getMessage() != null && e7.getMessage().startsWith("Unable to stop")) {
                        throw e7;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC0106d(Object obj, Object obj2, int r3, boolean z2) {
        this.f331a = r3;
        this.f333c = obj;
        this.f332b = obj2;
    }

    public RunnableC0106d(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f331a = 7;
        this.f333c = swipeDismissBehavior;
        this.f332b = view;
    }
}
