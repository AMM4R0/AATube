package p127t0;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC0744a;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import p002A1.C0015h;
import p010D0.C0113k;
import p013E0.HandlerC0128e;
import p026J0.C0224e;
import p026J0.C0226g;
import p026J0.C0232m;
import p026J0.ExecutorC0231l;
import p044P0.C0422f;
import p081e1.C0879e;
import p112o.C2683c;
import p130u0.C2777a;
import p130u0.C2779c;
import p130u0.C2787k;
import p130u0.C2793q;
import p130u0.C2795s;
import p130u0.C2797u;
import p133v0.AbstractC2863r;
import p133v0.C2848c;
import p133v0.C2852g;
import p133v0.C2853h;

/* renamed from: t0.f */
/* loaded from: classes.dex */
public abstract class AbstractC2769f {

    /* renamed from: a */
    public final Context f9064a;

    /* renamed from: b */
    public final String f9065b;

    /* renamed from: c */
    public final C0113k f9066c;

    /* renamed from: d */
    public final InterfaceC2765b f9067d;

    /* renamed from: e */
    public final C2777a f9068e;

    /* renamed from: f */
    public final int f9069f;

    /* renamed from: g */
    public final C0879e f9070g;

    /* renamed from: h */
    public final C2779c f9071h;

    public AbstractC2769f(Context context, C0113k c0113k, InterfaceC2765b interfaceC2765b, C2768e c2768e) {
        AbstractC2863r.m5475d(context, "Null context is not permitted.");
        AbstractC2863r.m5475d(c0113k, "Api must not be null.");
        AbstractC2863r.m5475d(c2768e, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f9064a = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f9065b = str;
        this.f9066c = c0113k;
        this.f9067d = interfaceC2765b;
        this.f9068e = new C2777a(c0113k, interfaceC2765b, str);
        C2779c m5394e = C2779c.m5394e(this.f9064a);
        this.f9071h = m5394e;
        this.f9069f = m5394e.f9094h.getAndIncrement();
        this.f9070g = c2768e.f9063a;
        HandlerC0128e handlerC0128e = m5394e.f9099m;
        handlerC0128e.sendMessage(handlerC0128e.obtainMessage(7, this));
    }

    /* renamed from: a */
    public final C0015h m5386a() {
        C0015h c0015h = new C0015h(10);
        Set emptySet = Collections.emptySet();
        if (((C2683c) c0015h.f25b) == null) {
            c0015h.f25b = new C2683c(0);
        }
        ((C2683c) c0015h.f25b).addAll(emptySet);
        Context context = this.f9064a;
        c0015h.f27d = context.getClass().getName();
        c0015h.f26c = context.getPackageName();
        return c0015h;
    }

    /* renamed from: b */
    public final C0232m m5387b(int r18, C0422f c0422f) {
        C0224e c0224e = new C0224e();
        C2779c c2779c = this.f9071h;
        c2779c.getClass();
        int r5 = c0422f.f1093b;
        HandlerC0128e handlerC0128e = c2779c.f9099m;
        C0232m c0232m = c0224e.f652a;
        if (r5 != 0) {
            C2793q c2793q = null;
            if (c2779c.m5395a()) {
                C2853h c2853h = (C2853h) C2852g.m5459b().f9426a;
                C2777a c2777a = this.f9068e;
                boolean z2 = true;
                if (c2853h != null) {
                    if (c2853h.f9428b) {
                        C2787k c2787k = (C2787k) c2779c.f9096j.get(c2777a);
                        if (c2787k != null) {
                            InterfaceC2766c interfaceC2766c = c2787k.f9103c;
                            if (interfaceC2766c instanceof AbstractC0744a) {
                                AbstractC0744a abstractC0744a = (AbstractC0744a) interfaceC2766c;
                                if (abstractC0744a.f2719u != null && !abstractC0744a.mo2029a()) {
                                    C2848c m5423a = C2793q.m5423a(c2787k, abstractC0744a, r5);
                                    if (m5423a != null) {
                                        c2787k.f9113m++;
                                        z2 = m5423a.f9397c;
                                    }
                                }
                            }
                        }
                        z2 = c2853h.f9429c;
                    }
                }
                c2793q = new C2793q(c2779c, r5, c2777a, z2 ? System.currentTimeMillis() : 0L, z2 ? SystemClock.elapsedRealtime() : 0L);
            }
            if (c2793q != null) {
                handlerC0128e.getClass();
                ExecutorC0231l executorC0231l = new ExecutorC0231l(handlerC0128e);
                c0232m.getClass();
                c0232m.f670b.m619d(new C0226g(executorC0231l, c2793q));
                c0232m.m628h();
            }
        }
        handlerC0128e.sendMessage(handlerC0128e.obtainMessage(4, new C2795s(new C2797u(r18, c0422f, c0224e, this.f9070g), c2779c.f9095i.get(), this)));
        return c0232m;
    }
}
