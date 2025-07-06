package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.Bd */
/* loaded from: classes.dex */
public final class C1099Bd implements InterfaceC1234Gn {

    /* renamed from: a */
    public final String f4529a;

    public C1099Bd(String str) {
        this.f4529a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1234Gn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1184En mo2706a(String str) {
        return TextUtils.isEmpty(str) ? new C1184En(this, false, AbstractC0002c.m17l(new StringBuilder(), this.f4529a, " is empty.")) : new C1184En(this, true, "");
    }
}
