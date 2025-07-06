package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Se */
/* loaded from: classes.dex */
public final class C1524Se implements ProtobufConverter {

    /* renamed from: a */
    public final C1475Qe f5417a = new C1475Qe();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1375Me fromModel(C1499Re c1499Re) {
        C1375Me c1375Me = new C1375Me();
        if (!TextUtils.isEmpty(c1499Re.f5325a)) {
            c1375Me.f5060a = c1499Re.f5325a;
        }
        c1375Me.f5061b = c1499Re.f5326b.toString();
        c1375Me.f5062c = c1499Re.f5327c;
        c1375Me.f5063d = c1499Re.f5328d;
        c1375Me.f5064e = this.f5417a.fromModel(c1499Re.f5329e).intValue();
        return c1375Me;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1499Re toModel(C1375Me c1375Me) {
        JSONObject jSONObject;
        String str = c1375Me.f5060a;
        String str2 = c1375Me.f5061b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C1499Re(str, jSONObject, c1375Me.f5062c, c1375Me.f5063d, this.f5417a.toModel(Integer.valueOf(c1375Me.f5064e)));
        }
        jSONObject = new JSONObject();
        return new C1499Re(str, jSONObject, c1375Me.f5062c, c1375Me.f5063d, this.f5417a.toModel(Integer.valueOf(c1375Me.f5064e)));
    }
}
