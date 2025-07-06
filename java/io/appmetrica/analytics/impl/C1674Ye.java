package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.Ye */
/* loaded from: classes.dex */
public final class C1674Ye extends C2093pa {
    public C1674Ye(int r12) {
        super(r12);
    }

    @Override // io.appmetrica.analytics.impl.C2093pa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int mo3550b(C1634X c1634x) {
        if (c1634x == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(c1634x.f5677b) + 12;
    }
}
