package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.UUID;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.a0 */
/* loaded from: classes.dex */
public final class C1708a0 implements InterfaceC1234Gn {
    @Override // io.appmetrica.analytics.impl.InterfaceC1234Gn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1184En mo2706a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C1184En(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new C1184En(this, true, "");
        } catch (Throwable unused) {
            return new C1184En(this, false, AbstractC0002c.m16k("Invalid ApiKey=", str, ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html"));
        }
    }
}
