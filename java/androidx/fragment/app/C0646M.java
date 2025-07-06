package androidx.fragment.app;

import androidx.lifecycle.C0688L;
import androidx.lifecycle.C0710t;
import androidx.lifecycle.EnumC0702l;
import androidx.lifecycle.InterfaceC0689M;
import androidx.lifecycle.InterfaceC0698h;
import p026J0.C0229j;
import p064Y.AbstractC0543b;
import p064Y.C0542a;
import p082f0.C0900d;
import p082f0.InterfaceC0901e;

/* renamed from: androidx.fragment.app.M */
/* loaded from: classes.dex */
public final class C0646M implements InterfaceC0698h, InterfaceC0901e, InterfaceC0689M {

    /* renamed from: a */
    public final C0688L f2199a;

    /* renamed from: b */
    public C0710t f2200b = null;

    /* renamed from: c */
    public C0229j f2201c = null;

    public C0646M(C0688L c0688l) {
        this.f2199a = c0688l;
    }

    @Override // androidx.lifecycle.InterfaceC0698h
    /* renamed from: a */
    public final AbstractC0543b mo1472a() {
        return C0542a.f1473b;
    }

    @Override // p082f0.InterfaceC0901e
    /* renamed from: b */
    public final C0900d mo1473b() {
        m1725f();
        return (C0900d) this.f2201c.f665c;
    }

    /* renamed from: c */
    public final void m1724c(EnumC0702l enumC0702l) {
        this.f2200b.m1794d(enumC0702l);
    }

    @Override // androidx.lifecycle.InterfaceC0689M
    /* renamed from: d */
    public final C0688L mo1474d() {
        m1725f();
        return this.f2199a;
    }

    @Override // androidx.lifecycle.InterfaceC0708r
    /* renamed from: e */
    public final C0710t mo1475e() {
        m1725f();
        return this.f2200b;
    }

    /* renamed from: f */
    public final void m1725f() {
        if (this.f2200b == null) {
            this.f2200b = new C0710t(this);
            this.f2201c = new C0229j(this);
        }
    }
}
