package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.yl */
/* loaded from: classes.dex */
public final class C2329yl {

    /* renamed from: a */
    public final ProtobufStateStorage f7506a;

    /* renamed from: b */
    public final C1359Ln f7507b;

    public C2329yl(ProtobufStateStorage protobufStateStorage, C1359Ln c1359Ln) {
        this.f7506a = protobufStateStorage;
        this.f7507b = c1359Ln;
    }

    public C2329yl(Context context) {
        this(C2005lm.m4116a(C1157Dl.class).m4227a(context), C2018ma.m4192h().m4193A().m3244a());
    }
}
