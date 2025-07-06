package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i5 */
/* loaded from: classes.dex */
public abstract class AbstractC1913i5 {

    /* renamed from: a */
    public final C2013m5 f6459a;

    /* renamed from: b */
    public final String f6460b = "[ComponentMigrationToV113]";

    public AbstractC1913i5(C2013m5 c2013m5) {
        this.f6459a = c2013m5;
    }

    /* renamed from: a */
    public final C2013m5 m3979a() {
        return this.f6459a;
    }

    /* renamed from: b */
    public final String m3981b() {
        return this.f6460b;
    }

    /* renamed from: b */
    public abstract boolean mo3982b(int r12);

    /* renamed from: c */
    public abstract void mo3983c();

    /* renamed from: a */
    public final void m3980a(int r12) {
        if (mo3982b(r12)) {
            mo3983c();
        }
    }
}
