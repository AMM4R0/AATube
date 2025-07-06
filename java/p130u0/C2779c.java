package p130u0;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.AbstractC0580g;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import io.appmetrica.analytics.impl.C1842f9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.AbstractC0005b;
import p010D0.C0113k;
import p013E0.AbstractC0126c;
import p013E0.AbstractC0127d;
import p013E0.HandlerC0128e;
import p015F0.AbstractC0132c;
import p044P0.C0422f;
import p104l.C2579j;
import p112o.C2683c;
import p112o.C2687g;
import p124s0.AbstractC2737h;
import p124s0.C2731b;
import p124s0.C2733d;
import p124s0.C2734e;
import p124s0.C2735f;
import p127t0.AbstractC2769f;
import p127t0.C2768e;
import p127t0.C2774k;
import p127t0.InterfaceC2766c;
import p133v0.AbstractC2863r;
import p133v0.C2842B;
import p133v0.C2851f;
import p133v0.C2852g;
import p133v0.C2853h;
import p133v0.C2854i;
import p133v0.C2855j;
import p139x0.C2887b;

/* renamed from: u0.c */
/* loaded from: classes.dex */
public final class C2779c implements Handler.Callback {

    /* renamed from: o */
    public static final Status f9083o = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: p */
    public static final Status f9084p = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: q */
    public static final Object f9085q = new Object();

    /* renamed from: r */
    public static C2779c f9086r;

    /* renamed from: a */
    public long f9087a;

    /* renamed from: b */
    public boolean f9088b;

    /* renamed from: c */
    public C2854i f9089c;

    /* renamed from: d */
    public C2887b f9090d;

    /* renamed from: e */
    public final Context f9091e;

    /* renamed from: f */
    public final C2734e f9092f;

    /* renamed from: g */
    public final C0113k f9093g;

    /* renamed from: h */
    public final AtomicInteger f9094h;

    /* renamed from: i */
    public final AtomicInteger f9095i;

    /* renamed from: j */
    public final ConcurrentHashMap f9096j;

    /* renamed from: k */
    public final C2683c f9097k;

    /* renamed from: l */
    public final C2683c f9098l;

    /* renamed from: m */
    public final HandlerC0128e f9099m;

    /* renamed from: n */
    public volatile boolean f9100n;

    public C2779c(Context context, Looper looper) {
        C2734e c2734e = C2734e.f8982d;
        this.f9087a = 10000L;
        this.f9088b = false;
        this.f9094h = new AtomicInteger(1);
        this.f9095i = new AtomicInteger(0);
        this.f9096j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f9097k = new C2683c(0);
        this.f9098l = new C2683c(0);
        this.f9100n = true;
        this.f9091e = context;
        HandlerC0128e handlerC0128e = new HandlerC0128e(looper, this);
        this.f9099m = handlerC0128e;
        this.f9092f = c2734e;
        this.f9093g = new C0113k(14);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC0580g.f1641d == null) {
            AbstractC0580g.f1641d = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC0580g.f1641d.booleanValue()) {
            this.f9100n = false;
        }
        handlerC0128e.sendMessage(handlerC0128e.obtainMessage(6));
    }

    /* renamed from: c */
    public static Status m5393c(C2777a c2777a, C2731b c2731b) {
        String str = (String) c2777a.f9075b.f348c;
        String valueOf = String.valueOf(c2731b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(1, 17, sb.toString(), c2731b.f8973c, c2731b);
    }

    /* renamed from: e */
    public static C2779c m5394e(Context context) {
        C2779c c2779c;
        synchronized (f9085q) {
            try {
                if (f9086r == null) {
                    Looper looper = C2842B.m5455a().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = C2734e.f8981c;
                    f9086r = new C2779c(applicationContext, looper);
                }
                c2779c = f9086r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2779c;
    }

    /* renamed from: a */
    public final boolean m5395a() {
        if (this.f9088b) {
            return false;
        }
        C2853h c2853h = (C2853h) C2852g.m5459b().f9426a;
        if (c2853h != null && !c2853h.f9428b) {
            return false;
        }
        int r02 = ((SparseIntArray) this.f9093g.f347b).get(203400000, -1);
        return r02 == -1 || r02 == 0;
    }

    /* renamed from: b */
    public final boolean m5396b(C2731b c2731b, int r11) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        C2734e c2734e = this.f9092f;
        Context context = this.f9091e;
        c2734e.getClass();
        synchronized (AbstractC0005b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = AbstractC0005b.f0a;
            if (context2 != null && (bool = AbstractC0005b.f1b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            AbstractC0005b.f1b = null;
            if (Build.VERSION.SDK_INT >= 26) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                AbstractC0005b.f1b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    AbstractC0005b.f1b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    AbstractC0005b.f1b = Boolean.FALSE;
                }
            }
            AbstractC0005b.f0a = applicationContext;
            booleanValue = AbstractC0005b.f1b.booleanValue();
        }
        if (!booleanValue) {
            int r2 = c2731b.f8972b;
            if (r2 == 0 || (activity = c2731b.f8973c) == null) {
                Intent m5328a = c2734e.m5328a(context, null, r2);
                activity = m5328a != null ? PendingIntent.getActivity(context, 0, m5328a, AbstractC0132c.f380a | 134217728) : null;
            }
            if (activity != null) {
                int r10 = c2731b.f8972b;
                int r22 = GoogleApiActivity.f2689b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", r11);
                intent.putExtra("notify_manager", true);
                c2734e.m5326f(context, r10, PendingIntent.getActivity(context, 0, intent, AbstractC0127d.f376a | 134217728));
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final C2787k m5397d(AbstractC2769f abstractC2769f) {
        C2777a c2777a = abstractC2769f.f9068e;
        ConcurrentHashMap concurrentHashMap = this.f9096j;
        C2787k c2787k = (C2787k) concurrentHashMap.get(c2777a);
        if (c2787k == null) {
            c2787k = new C2787k(this, abstractC2769f);
            concurrentHashMap.put(c2777a, c2787k);
        }
        if (c2787k.f9103c.mo594k()) {
            this.f9098l.add(c2777a);
        }
        c2787k.m5410m();
        return c2787k;
    }

    /* renamed from: f */
    public final void m5398f(C2731b c2731b, int r5) {
        if (m5396b(c2731b, r5)) {
            return;
        }
        HandlerC0128e handlerC0128e = this.f9099m;
        handlerC0128e.sendMessage(handlerC0128e.obtainMessage(5, r5, 0, c2731b));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C2733d[] mo5418b;
        int r02 = message.what;
        C2787k c2787k = null;
        switch (r02) {
            case 1:
                this.f9087a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f9099m.removeMessages(12);
                for (C2777a c2777a : this.f9096j.keySet()) {
                    HandlerC0128e handlerC0128e = this.f9099m;
                    handlerC0128e.sendMessageDelayed(handlerC0128e.obtainMessage(12, c2777a), this.f9087a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (C2787k c2787k2 : this.f9096j.values()) {
                    AbstractC2863r.m5472a(c2787k2.f9114n.f9099m);
                    c2787k2.f9112l = null;
                    c2787k2.m5410m();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C2795s c2795s = (C2795s) message.obj;
                C2787k c2787k3 = (C2787k) this.f9096j.get(c2795s.f9137c.f9068e);
                if (c2787k3 == null) {
                    c2787k3 = m5397d(c2795s.f9137c);
                }
                if (!c2787k3.f9103c.mo594k() || this.f9095i.get() == c2795s.f9136b) {
                    c2787k3.m5411n(c2795s.f9135a);
                } else {
                    c2795s.f9135a.mo5419c(f9083o);
                    c2787k3.m5413p();
                }
                return true;
            case 5:
                int r03 = message.arg1;
                C2731b c2731b = (C2731b) message.obj;
                Iterator it = this.f9096j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C2787k c2787k4 = (C2787k) it.next();
                        if (c2787k4.f9108h == r03) {
                            c2787k = c2787k4;
                        }
                    }
                }
                if (c2787k != null) {
                    int r04 = c2731b.f8972b;
                    if (r04 == 13) {
                        this.f9092f.getClass();
                        int r2 = AbstractC2737h.f8987c;
                        String m5321a = C2731b.m5321a(r04);
                        String str = c2731b.f8974d;
                        StringBuilder sb = new StringBuilder(String.valueOf(m5321a).length() + 69 + String.valueOf(str).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(m5321a);
                        sb.append(": ");
                        sb.append(str);
                        c2787k.m5402e(new Status(17, sb.toString()));
                    } else {
                        c2787k.m5402e(m5393c(c2787k.f9104d, c2731b));
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(r03);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                }
                return true;
            case 6:
                if (this.f9091e.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f9091e.getApplicationContext();
                    ComponentCallbacks2C2778b componentCallbacks2C2778b = ComponentCallbacks2C2778b.f9078e;
                    synchronized (componentCallbacks2C2778b) {
                        try {
                            if (!componentCallbacks2C2778b.f9082d) {
                                application.registerActivityLifecycleCallbacks(componentCallbacks2C2778b);
                                application.registerComponentCallbacks(componentCallbacks2C2778b);
                                componentCallbacks2C2778b.f9082d = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    componentCallbacks2C2778b.m5391a(new C2786j(this));
                    AtomicBoolean atomicBoolean = componentCallbacks2C2778b.f9080b;
                    boolean z2 = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C2778b.f9079a;
                    if (!z2) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.f9087a = 300000L;
                    }
                }
                return true;
            case 7:
                m5397d((AbstractC2769f) message.obj);
                return true;
            case 9:
                if (this.f9096j.containsKey(message.obj)) {
                    C2787k c2787k5 = (C2787k) this.f9096j.get(message.obj);
                    AbstractC2863r.m5472a(c2787k5.f9114n.f9099m);
                    if (c2787k5.f9110j) {
                        c2787k5.m5410m();
                    }
                }
                return true;
            case 10:
                Iterator it2 = this.f9098l.iterator();
                while (true) {
                    C2687g c2687g = (C2687g) it2;
                    if (!c2687g.hasNext()) {
                        this.f9098l.clear();
                        return true;
                    }
                    C2787k c2787k6 = (C2787k) this.f9096j.remove((C2777a) c2687g.next());
                    if (c2787k6 != null) {
                        c2787k6.m5413p();
                    }
                }
            case 11:
                if (this.f9096j.containsKey(message.obj)) {
                    C2787k c2787k7 = (C2787k) this.f9096j.get(message.obj);
                    C2779c c2779c = c2787k7.f9114n;
                    AbstractC2863r.m5472a(c2779c.f9099m);
                    boolean z3 = c2787k7.f9110j;
                    if (z3) {
                        if (z3) {
                            C2779c c2779c2 = c2787k7.f9114n;
                            HandlerC0128e handlerC0128e2 = c2779c2.f9099m;
                            C2777a c2777a2 = c2787k7.f9104d;
                            handlerC0128e2.removeMessages(11, c2777a2);
                            c2779c2.f9099m.removeMessages(9, c2777a2);
                            c2787k7.f9110j = false;
                        }
                        c2787k7.m5402e(c2779c.f9092f.m5329b(c2779c.f9091e, C2735f.f8983a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
                        c2787k7.f9103c.mo2037i("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.f9096j.containsKey(message.obj)) {
                    C2787k c2787k8 = (C2787k) this.f9096j.get(message.obj);
                    AbstractC2863r.m5472a(c2787k8.f9114n.f9099m);
                    InterfaceC2766c interfaceC2766c = c2787k8.f9103c;
                    if (interfaceC2766c.mo2031c() && c2787k8.f9107g.size() == 0) {
                        C0113k c0113k = c2787k8.f9105e;
                        if (((Map) c0113k.f347b).isEmpty() && ((Map) c0113k.f348c).isEmpty()) {
                            interfaceC2766c.mo2037i("Timing out service connection.");
                        } else {
                            c2787k8.m5407j();
                        }
                    }
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                C2788l c2788l = (C2788l) message.obj;
                if (this.f9096j.containsKey(c2788l.f9115a)) {
                    C2787k c2787k9 = (C2787k) this.f9096j.get(c2788l.f9115a);
                    if (c2787k9.f9111k.contains(c2788l) && !c2787k9.f9110j) {
                        if (c2787k9.f9103c.mo2031c()) {
                            c2787k9.m5404g();
                        } else {
                            c2787k9.m5410m();
                        }
                    }
                }
                return true;
            case 16:
                C2788l c2788l2 = (C2788l) message.obj;
                if (this.f9096j.containsKey(c2788l2.f9115a)) {
                    C2787k c2787k10 = (C2787k) this.f9096j.get(c2788l2.f9115a);
                    if (c2787k10.f9111k.remove(c2788l2)) {
                        C2779c c2779c3 = c2787k10.f9114n;
                        c2779c3.f9099m.removeMessages(15, c2788l2);
                        c2779c3.f9099m.removeMessages(16, c2788l2);
                        C2733d c2733d = c2788l2.f9116b;
                        LinkedList<AbstractC2792p> linkedList = c2787k10.f9102a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (AbstractC2792p abstractC2792p : linkedList) {
                            if ((abstractC2792p instanceof AbstractC2792p) && (mo5418b = abstractC2792p.mo5418b(c2787k10)) != null) {
                                int length = mo5418b.length;
                                int r9 = 0;
                                while (true) {
                                    if (r9 >= length) {
                                        break;
                                    }
                                    if (!AbstractC2863r.m5476e(mo5418b[r9], c2733d)) {
                                        r9++;
                                    } else if (r9 >= 0) {
                                        arrayList.add(abstractC2792p);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int r6 = 0; r6 < size; r6++) {
                            AbstractC2792p abstractC2792p2 = (AbstractC2792p) arrayList.get(r6);
                            linkedList.remove(abstractC2792p2);
                            abstractC2792p2.mo5420d(new C2774k(c2733d));
                        }
                    }
                }
                return true;
            case 17:
                C2854i c2854i = this.f9089c;
                if (c2854i != null) {
                    if (c2854i.f9432a > 0 || m5395a()) {
                        if (this.f9090d == null) {
                            this.f9090d = new C2887b(this.f9091e, C2887b.f9509i, C2855j.f9434b, C2768e.f9062b);
                        }
                        C2887b c2887b = this.f9090d;
                        c2887b.getClass();
                        C0422f c0422f = new C0422f();
                        c0422f.f1093b = 0;
                        c0422f.f1096e = new C2733d[]{AbstractC0126c.f374a};
                        c0422f.f1094c = false;
                        c0422f.f1095d = new C2579j(c2854i);
                        c2887b.m5387b(2, c0422f.m1155a());
                    }
                    this.f9089c = null;
                }
                return true;
            case 18:
                C2794r c2794r = (C2794r) message.obj;
                if (c2794r.f9133c == 0) {
                    C2854i c2854i2 = new C2854i(c2794r.f9132b, Arrays.asList(c2794r.f9131a));
                    if (this.f9090d == null) {
                        this.f9090d = new C2887b(this.f9091e, C2887b.f9509i, C2855j.f9434b, C2768e.f9062b);
                    }
                    C2887b c2887b2 = this.f9090d;
                    c2887b2.getClass();
                    C0422f c0422f2 = new C0422f();
                    c0422f2.f1093b = 0;
                    c0422f2.f1096e = new C2733d[]{AbstractC0126c.f374a};
                    c0422f2.f1094c = false;
                    c0422f2.f1095d = new C2579j(c2854i2);
                    c2887b2.m5387b(2, c0422f2.m1155a());
                } else {
                    C2854i c2854i3 = this.f9089c;
                    if (c2854i3 != null) {
                        List list = c2854i3.f9433b;
                        if (c2854i3.f9432a != c2794r.f9132b || (list != null && list.size() >= c2794r.f9134d)) {
                            this.f9099m.removeMessages(17);
                            C2854i c2854i4 = this.f9089c;
                            if (c2854i4 != null) {
                                if (c2854i4.f9432a > 0 || m5395a()) {
                                    if (this.f9090d == null) {
                                        this.f9090d = new C2887b(this.f9091e, C2887b.f9509i, C2855j.f9434b, C2768e.f9062b);
                                    }
                                    C2887b c2887b3 = this.f9090d;
                                    c2887b3.getClass();
                                    C0422f c0422f3 = new C0422f();
                                    c0422f3.f1093b = 0;
                                    c0422f3.f1096e = new C2733d[]{AbstractC0126c.f374a};
                                    c0422f3.f1094c = false;
                                    c0422f3.f1095d = new C2579j(c2854i4);
                                    c2887b3.m5387b(2, c0422f3.m1155a());
                                }
                                this.f9089c = null;
                            }
                        } else {
                            C2854i c2854i5 = this.f9089c;
                            C2851f c2851f = c2794r.f9131a;
                            if (c2854i5.f9433b == null) {
                                c2854i5.f9433b = new ArrayList();
                            }
                            c2854i5.f9433b.add(c2851f);
                        }
                    }
                    if (this.f9089c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c2794r.f9131a);
                        this.f9089c = new C2854i(c2794r.f9132b, arrayList2);
                        HandlerC0128e handlerC0128e3 = this.f9099m;
                        handlerC0128e3.sendMessageDelayed(handlerC0128e3.obtainMessage(17), c2794r.f9133c);
                    }
                }
                return true;
            case C1842f9.f6208E /* 19 */:
                this.f9088b = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(r02);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }
}
