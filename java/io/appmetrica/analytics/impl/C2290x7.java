package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.AbstractC2489f;

/* renamed from: io.appmetrica.analytics.impl.x7 */
/* loaded from: classes.dex */
public final class C2290x7 implements Converter {

    /* renamed from: a */
    public final C2215u7 f7422a;

    public C2290x7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C2265w7 c2265w7) {
        ContentValues contentValues = new ContentValues();
        Long l2 = c2265w7.f7339a;
        if (l2 != null) {
            contentValues.put("id", Long.valueOf(l2.longValue()));
        }
        EnumC2003lk enumC2003lk = c2265w7.f7340b;
        if (enumC2003lk != null) {
            contentValues.put("type", Integer.valueOf(enumC2003lk.f6668a));
        }
        String str = c2265w7.f7341c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C2215u7 c2215u7 = this.f7422a;
        contentValues.put("session_description", MessageNano.toByteArray(c2215u7.f7214a.fromModel(c2265w7.f7342d)));
        return contentValues;
    }

    public C2290x7(C2215u7 c2215u7) {
        this.f7422a = c2215u7;
    }

    public /* synthetic */ C2290x7(C2215u7 c2215u7, int r2, AbstractC2489f abstractC2489f) {
        this((r2 & 1) != 0 ? new C2215u7(null, 1, null) : c2215u7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2265w7 toModel(ContentValues contentValues) {
        EnumC2003lk enumC2003lk;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            enumC2003lk = EnumC2003lk.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                enumC2003lk = EnumC2003lk.BACKGROUND;
            }
        } else {
            enumC2003lk = null;
        }
        return new C2265w7(asLong, enumC2003lk, contentValues.getAsString("report_request_parameters"), this.f7422a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
