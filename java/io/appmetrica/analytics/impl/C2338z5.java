package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.z5 */
/* loaded from: classes.dex */
public final class C2338z5 implements InterfaceC1173Ec {

    /* renamed from: a */
    public final String f7516a;

    public C2338z5(String str) {
        this.f7516a = str;
    }

    /* renamed from: a */
    public final C2338z5 m4675a(String str) {
        return new C2338z5(str);
    }

    /* renamed from: b */
    public final String m4676b() {
        return this.f7516a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2338z5) && AbstractC2492i.m4911a(this.f7516a, ((C2338z5) obj).f7516a);
    }

    public final int hashCode() {
        return this.f7516a.hashCode();
    }

    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f7516a + ')';
    }

    /* renamed from: a */
    public static C2338z5 m4674a(C2338z5 c2338z5, String str, int r2, Object obj) {
        if ((r2 & 1) != 0) {
            str = c2338z5.f7516a;
        }
        c2338z5.getClass();
        return new C2338z5(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1173Ec
    /* renamed from: a */
    public final String mo2855a() {
        return this.f7516a;
    }
}
