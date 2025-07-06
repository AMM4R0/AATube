package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import p002A1.AbstractC0008a;

/* renamed from: io.appmetrica.analytics.impl.he */
/* loaded from: classes.dex */
public final class C1897he implements Converter {
    /* renamed from: a */
    public final String m3944a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(String str) {
        if (PluginErrorDetails.Platform.NATIVE.equals(str)) {
            str = "JVM";
        }
        return str.getBytes(AbstractC0008a.f6a);
    }
}
