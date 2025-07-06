package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.sl */
/* loaded from: classes.dex */
public final class C2179sl extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a */
    public final String f7134a;

    /* renamed from: b */
    public final String f7135b;

    /* renamed from: c */
    public final Map<String, String> f7136c;

    /* renamed from: d */
    public final boolean f7137d;

    /* renamed from: e */
    public final List<String> f7138e;

    public C2179sl(C1912i4 c1912i4) {
        this(c1912i4.m3977a().m3656d(), c1912i4.m3977a().m3657e(), c1912i4.m3977a().m3650a(), c1912i4.m3977a().m3661i(), c1912i4.m3977a().m3652b());
    }

    /* renamed from: a */
    public final boolean m4426a(C2179sl c2179sl) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2179sl mergeFrom(C2179sl c2179sl) {
        return new C2179sl((String) WrapUtils.getOrDefaultNullable(this.f7134a, c2179sl.f7134a), (String) WrapUtils.getOrDefaultNullable(this.f7135b, c2179sl.f7135b), (Map) WrapUtils.getOrDefaultNullable(this.f7136c, c2179sl.f7136c), this.f7137d || c2179sl.f7137d, c2179sl.f7137d ? c2179sl.f7138e : this.f7138e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return false;
    }

    public C2179sl(String str, String str2, Map<String, String> map, boolean z2, List<String> list) {
        this.f7134a = str;
        this.f7135b = str2;
        this.f7136c = map;
        this.f7137d = z2;
        this.f7138e = list;
    }

    public C2179sl() {
        this(null, null, null, false, null);
    }
}
