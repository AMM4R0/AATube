package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.K7 */
/* loaded from: classes.dex */
public final class C1318K7 {

    /* renamed from: a */
    public final Map f4948a;

    /* renamed from: b */
    public final String f4949b;

    /* renamed from: c */
    public final String f4950c;

    public C1318K7(String str, HashMap hashMap, String str2) {
        this.f4949b = str;
        this.f4948a = hashMap;
        this.f4950c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb.append(this.f4948a);
        sb.append(", mDeeplink='");
        sb.append(this.f4949b);
        sb.append("', mUnparsedReferrer='");
        return AbstractC0002c.m17l(sb, this.f4950c, "'}");
    }
}
