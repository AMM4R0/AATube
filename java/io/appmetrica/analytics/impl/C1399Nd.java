package io.appmetrica.analytics.impl;

import androidx.fragment.app.C0665o;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.Nd */
/* loaded from: classes.dex */
public final class C1399Nd implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(Boolean bool) {
        int r2;
        if (bool == null) {
            r2 = -1;
        } else if (bool.equals(Boolean.TRUE)) {
            r2 = 1;
        } else {
            if (!bool.equals(Boolean.FALSE)) {
                throw new C0665o();
            }
            r2 = 0;
        }
        return Integer.valueOf(r2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return m3112a(((Number) obj).intValue());
    }

    /* renamed from: a */
    public final Boolean m3112a(int r2) {
        if (r2 != -1) {
            if (r2 == 0) {
                return Boolean.FALSE;
            }
            if (r2 == 1) {
                return Boolean.TRUE;
            }
        }
        return null;
    }
}
