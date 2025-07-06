package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Be */
/* loaded from: classes.dex */
public final class C1100Be implements ProtobufConverter {

    /* renamed from: a */
    public final C1475Qe f4530a;

    public C1100Be() {
        this(new C1475Qe());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1400Ne fromModel(C1150De c1150De) {
        C1400Ne c1400Ne = new C1400Ne();
        if (!TextUtils.isEmpty(c1150De.f4640a)) {
            c1400Ne.f5124a = c1150De.f4640a;
        }
        c1400Ne.f5125b = c1150De.f4641b.toString();
        c1400Ne.f5126c = this.f4530a.fromModel(c1150De.f4642c).intValue();
        return c1400Ne;
    }

    public C1100Be(C1475Qe c1475Qe) {
        this.f4530a = c1475Qe;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1150De toModel(C1400Ne c1400Ne) {
        JSONObject jSONObject;
        String str = c1400Ne.f5124a;
        String str2 = c1400Ne.f5125b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C1150De(str, jSONObject, this.f4530a.toModel(Integer.valueOf(c1400Ne.f5126c)));
        }
        jSONObject = new JSONObject();
        return new C1150De(str, jSONObject, this.f4530a.toModel(Integer.valueOf(c1400Ne.f5126c)));
    }
}
