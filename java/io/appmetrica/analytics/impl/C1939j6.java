package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import p105l1.C2636g;

/* renamed from: io.appmetrica.analytics.impl.j6 */
/* loaded from: classes.dex */
public final class C1939j6 extends C2199tg {

    /* renamed from: f */
    public final Context f6523f;

    /* renamed from: g */
    public final C1775ch f6524g;

    /* renamed from: h */
    public final C1671Yb f6525h;

    /* renamed from: i */
    public final C2189t6 f6526i;

    public C1939j6(Context context, C1883h0 c1883h0, InterfaceC2178sk interfaceC2178sk, C1775ch c1775ch) {
        super(c1883h0, interfaceC2178sk, c1775ch);
        this.f6523f = context;
        this.f6524g = c1775ch;
        this.f6525h = C2312y4.m4633h().m4642i();
        this.f6526i = new C2189t6(context);
    }

    /* renamed from: a */
    public final void m4024a(C1775ch c1775ch) {
        if (c1775ch.f6050a.f5627g != 0) {
            this.f6526i.m4443a(c1775ch);
            return;
        }
        Intent m3212a = AbstractC1455Pj.m3212a(this.f6523f);
        C1615W5 c1615w5 = c1775ch.f6050a;
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        c1615w5.f5624d = 5890;
        m3212a.putExtras(c1615w5.m3483d(c1775ch.f6054e.m4108c()));
        try {
            this.f6523f.startService(m3212a);
        } catch (Throwable unused) {
            this.f6526i.m4443a(c1775ch);
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1825eh
    /* renamed from: c */
    public final boolean mo3795c() {
        m4024a(this.f6524g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1825eh, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        mo3791a();
        return C2636g.f8557a;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1825eh
    /* renamed from: a */
    public final synchronized void mo3791a() {
        try {
            if (this.f6158c) {
                return;
            }
            this.f6158c = true;
            if (this.f6525h.m3541a("AppMetrica")) {
                this.f6526i.m4443a(this.f6524g);
            } else {
                this.f6156a.m3905c();
                this.f6158c = false;
                super.mo3791a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
