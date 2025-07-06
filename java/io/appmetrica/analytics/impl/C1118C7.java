package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.C7 */
/* loaded from: classes.dex */
public final class C1118C7 {

    /* renamed from: a */
    public final InterfaceC1246Ha f4568a;

    /* renamed from: b */
    public String f4569b = "";

    public C1118C7(InterfaceC1246Ha interfaceC1246Ha) {
        this.f4568a = interfaceC1246Ha;
    }

    /* renamed from: a */
    public final void m2792a(String str, boolean z2) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || AbstractC2492i.m4911a(this.f4569b, str)) {
                return;
            }
            this.f4569b = str;
            this.f4568a.mo2932a(str, z2);
        }
    }
}
