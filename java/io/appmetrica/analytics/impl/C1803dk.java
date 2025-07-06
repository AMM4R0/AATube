package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.dk */
/* loaded from: classes.dex */
public final class C1803dk {

    /* renamed from: a */
    public final String f6107a;

    /* renamed from: b */
    public final C1679Yj f6108b;

    /* renamed from: c */
    public final C1778ck f6109c;

    /* renamed from: d */
    public final IBinaryDataHelper f6110d;

    public C1803dk(Context context, C1838f5 c1838f5) {
        c1838f5.m3805a();
        this.f6107a = "session_extras";
        this.f6108b = new C1679Yj();
        this.f6109c = new C1778ck();
        this.f6110d = C1765c7.m3695a(context).m3696a(c1838f5);
    }

    /* renamed from: a */
    public final Map m3766a() {
        try {
            byte[] bArr = this.f6110d.get(this.f6107a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f6108b.toModel(this.f6109c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        C1679Yj c1679Yj = this.f6108b;
        this.f6109c.getClass();
        return c1679Yj.toModel(new C1728ak());
    }
}
