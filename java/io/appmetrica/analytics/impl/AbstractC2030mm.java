package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.mm */
/* loaded from: classes.dex */
public abstract class AbstractC2030mm {
    /* renamed from: a */
    public final ProtobufStateStorage<Object> m4227a(Context context) {
        return mo3837a(context, mo3838c(context));
    }

    /* renamed from: a */
    public abstract ProtobufStateStorage<Object> mo3837a(Context context, IBinaryDataHelper iBinaryDataHelper);

    /* renamed from: b */
    public final ProtobufStateStorage<Object> m4228b(Context context) {
        return mo3837a(context, mo3839d(context));
    }

    /* renamed from: c */
    public abstract IBinaryDataHelper mo3838c(Context context);

    /* renamed from: d */
    public abstract IBinaryDataHelper mo3839d(Context context);
}
