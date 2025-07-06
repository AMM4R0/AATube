package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.AbstractC2489f;

/* renamed from: io.appmetrica.analytics.impl.j7 */
/* loaded from: classes.dex */
public final class C1940j7 implements Converter {

    /* renamed from: a */
    public final C1865g7 f6527a;

    public C1940j7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C1915i7 c1915i7) {
        ContentValues contentValues = new ContentValues();
        Long l2 = c1915i7.f6467a;
        if (l2 != null) {
            contentValues.put("session_id", Long.valueOf(l2.longValue()));
        }
        EnumC2003lk enumC2003lk = c1915i7.f6468b;
        if (enumC2003lk != null) {
            contentValues.put("session_type", Integer.valueOf(enumC2003lk.f6668a));
        }
        Long l3 = c1915i7.f6469c;
        if (l3 != null) {
            contentValues.put("number_in_session", Long.valueOf(l3.longValue()));
        }
        EnumC1670Ya enumC1670Ya = c1915i7.f6470d;
        if (enumC1670Ya != null) {
            contentValues.put("type", Integer.valueOf(enumC1670Ya.f5766a));
        }
        Long l4 = c1915i7.f6471e;
        if (l4 != null) {
            contentValues.put("global_number", Long.valueOf(l4.longValue()));
        }
        Long l5 = c1915i7.f6472f;
        if (l5 != null) {
            contentValues.put("time", Long.valueOf(l5.longValue()));
        }
        C1865g7 c1865g7 = this.f6527a;
        contentValues.put("event_description", MessageNano.toByteArray(c1865g7.f6302a.fromModel(c1915i7.f6473g)));
        return contentValues;
    }

    public C1940j7(C1865g7 c1865g7) {
        this.f6527a = c1865g7;
    }

    public /* synthetic */ C1940j7(C1865g7 c1865g7, int r2, AbstractC2489f abstractC2489f) {
        this((r2 & 1) != 0 ? new C1865g7(null, 1, 0 == true ? 1 : 0) : c1865g7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1915i7 toModel(ContentValues contentValues) {
        EnumC2003lk enumC2003lk;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            enumC2003lk = EnumC2003lk.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                enumC2003lk = EnumC2003lk.BACKGROUND;
            }
        } else {
            enumC2003lk = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C1915i7(asLong, enumC2003lk, asLong2, asInteger2 != null ? EnumC1670Ya.m3538a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.f6527a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
