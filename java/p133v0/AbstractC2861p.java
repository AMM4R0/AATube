package p133v0;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC0744a;
import p124s0.C2731b;

/* renamed from: v0.p */
/* loaded from: classes.dex */
public abstract class AbstractC2861p {

    /* renamed from: a */
    public Boolean f9450a;

    /* renamed from: b */
    public boolean f9451b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0744a f9452c;

    /* renamed from: d */
    public final int f9453d;

    /* renamed from: e */
    public final Bundle f9454e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC0744a f9455f;

    public AbstractC2861p(AbstractC0744a abstractC0744a, int r3, Bundle bundle) {
        this.f9455f = abstractC0744a;
        Boolean bool = Boolean.TRUE;
        this.f9452c = abstractC0744a;
        this.f9450a = bool;
        this.f9451b = false;
        this.f9453d = r3;
        this.f9454e = bundle;
    }

    /* renamed from: a */
    public abstract void mo5467a(C2731b c2731b);

    /* renamed from: b */
    public abstract boolean mo5468b();

    /* renamed from: c */
    public final void m5469c() {
        synchronized (this) {
            this.f9450a = null;
        }
    }

    /* renamed from: d */
    public final void m5470d() {
        m5469c();
        synchronized (this.f9452c.f2709k) {
            this.f9452c.f2709k.remove(this);
        }
    }
}
