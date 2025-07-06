package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.qa */
/* loaded from: classes.dex */
public final class C2118qa extends C2093pa {
    public C2118qa(int r2, int r3) {
        this(r2, new C2143ra(r3));
    }

    /* renamed from: a */
    public final int m4354a(String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.C2093pa
    /* renamed from: b */
    public final int mo3550b(Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    public C2118qa(int r12, C2143ra c2143ra) {
        super(r12, c2143ra);
    }
}
