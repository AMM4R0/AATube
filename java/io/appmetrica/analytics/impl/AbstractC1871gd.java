package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gd */
/* loaded from: classes.dex */
public abstract class AbstractC1871gd extends AbstractC2322ye implements InterfaceC1406Nk {
    public AbstractC1871gd(InterfaceC1221Ga interfaceC1221Ga, String str) {
        super(interfaceC1221Ga, str);
    }

    /* renamed from: c */
    public final String m3884c(String str, String str2) {
        return this.f7497a.getString(mo2727f(str), str2);
    }

    /* renamed from: d */
    public final InterfaceC1406Nk m3888d(String str, String str2) {
        return (InterfaceC1406Nk) m4656b(mo2727f(str), str2);
    }

    /* renamed from: e */
    public final boolean m3890e(String str) {
        return this.f7497a.mo2905a(mo2727f(str));
    }

    /* renamed from: f */
    public abstract String mo2727f(String str);

    /* renamed from: g */
    public final InterfaceC1406Nk m3891g(String str) {
        return (InterfaceC1406Nk) m4661d(mo2727f(str));
    }

    public AbstractC1871gd(InterfaceC1221Ga interfaceC1221Ga) {
        this(interfaceC1221Ga, null);
    }

    /* renamed from: d */
    public final InterfaceC1406Nk m3886d(String str, int r2) {
        return (InterfaceC1406Nk) m4654b(mo2727f(str), r2);
    }

    /* renamed from: c */
    public final int m3882c(String str, int r3) {
        return this.f7497a.getInt(mo2727f(str), r3);
    }

    /* renamed from: d */
    public final InterfaceC1406Nk m3887d(String str, long j2) {
        return (InterfaceC1406Nk) m4655b(mo2727f(str), j2);
    }

    /* renamed from: d */
    public final InterfaceC1406Nk m3889d(String str, boolean z2) {
        return (InterfaceC1406Nk) m4657b(mo2727f(str), z2);
    }

    /* renamed from: c */
    public final long m3883c(String str, long j2) {
        return this.f7497a.getLong(mo2727f(str), j2);
    }

    /* renamed from: c */
    public final boolean m3885c(String str, boolean z2) {
        return this.f7497a.getBoolean(mo2727f(str), z2);
    }
}
