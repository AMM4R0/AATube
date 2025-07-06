package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fn */
/* loaded from: classes.dex */
public final class C1856fn implements ProtobufConverter {

    /* renamed from: a */
    public final C1557Tm f6279a;

    /* renamed from: b */
    public final C1584V f6280b;

    /* renamed from: c */
    public final C2039n6 f6281c;

    /* renamed from: d */
    public final C1580Uk f6282d;

    /* renamed from: e */
    public final C1897he f6283e;

    /* renamed from: f */
    public final C1922ie f6284f;

    public C1856fn() {
        this(new C1557Tm(), new C1584V(new C1408Nm()), new C2039n6(), new C1580Uk(), new C1897he(), new C1922ie());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1764c6 fromModel(C1831en c1831en) {
        C1764c6 c1764c6 = new C1764c6();
        C1582Um c1582Um = c1831en.f6165a;
        if (c1582Um != null) {
            c1764c6.f5999a = this.f6279a.fromModel(c1582Um);
        }
        C1559U c1559u = c1831en.f6166b;
        if (c1559u != null) {
            c1764c6.f6000b = this.f6280b.fromModel(c1559u);
        }
        List<C1630Wk> list = c1831en.f6167c;
        if (list != null) {
            c1764c6.f6003e = this.f6282d.fromModel(list);
        }
        String str = c1831en.f6171g;
        if (str != null) {
            c1764c6.f6001c = str;
        }
        c1764c6.f6002d = this.f6281c.m3172a(c1831en.f6172h);
        if (!TextUtils.isEmpty(c1831en.f6168d)) {
            c1764c6.f6006h = this.f6283e.fromModel(c1831en.f6168d);
        }
        if (!TextUtils.isEmpty(c1831en.f6169e)) {
            c1764c6.f6007i = c1831en.f6169e.getBytes();
        }
        if (!AbstractC2356zn.m4703a(c1831en.f6170f)) {
            c1764c6.f6008j = this.f6284f.fromModel(c1831en.f6170f);
        }
        return c1764c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1856fn(C1557Tm c1557Tm, C1584V c1584v, C2039n6 c2039n6, C1580Uk c1580Uk, C1897he c1897he, C1922ie c1922ie) {
        this.f6280b = c1584v;
        this.f6279a = c1557Tm;
        this.f6281c = c2039n6;
        this.f6282d = c1580Uk;
        this.f6283e = c1897he;
        this.f6284f = c1922ie;
    }

    /* renamed from: a */
    public final C1831en m3841a(C1764c6 c1764c6) {
        throw new UnsupportedOperationException();
    }
}
