package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ig */
/* loaded from: classes.dex */
public final class C1924ig implements ProtobufConverter {

    /* renamed from: a */
    public final C1557Tm f6491a;

    /* renamed from: b */
    public final C1584V f6492b;

    /* renamed from: c */
    public final C2039n6 f6493c;

    /* renamed from: d */
    public final C1580Uk f6494d;

    /* renamed from: e */
    public final C1897he f6495e;

    /* renamed from: f */
    public final C1922ie f6496f;

    public C1924ig() {
        this(new C1557Tm(), new C1584V(new C1408Nm()), new C2039n6(), new C1580Uk(), new C1897he(), new C1922ie());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1814e6 fromModel(C1899hg c1899hg) {
        C1814e6 c1814e6 = new C1814e6();
        c1814e6.f6132f = (String) WrapUtils.getOrDefault(c1899hg.f6413a, c1814e6.f6132f);
        C1831en c1831en = c1899hg.f6414b;
        if (c1831en != null) {
            C1582Um c1582Um = c1831en.f6165a;
            if (c1582Um != null) {
                c1814e6.f6127a = this.f6491a.fromModel(c1582Um);
            }
            C1559U c1559u = c1831en.f6166b;
            if (c1559u != null) {
                c1814e6.f6128b = this.f6492b.fromModel(c1559u);
            }
            List<C1630Wk> list = c1831en.f6167c;
            if (list != null) {
                c1814e6.f6131e = this.f6494d.fromModel(list);
            }
            c1814e6.f6129c = (String) WrapUtils.getOrDefault(c1831en.f6171g, c1814e6.f6129c);
            c1814e6.f6130d = this.f6493c.m3172a(c1831en.f6172h);
            if (!TextUtils.isEmpty(c1831en.f6168d)) {
                c1814e6.f6135i = this.f6495e.fromModel(c1831en.f6168d);
            }
            if (!TextUtils.isEmpty(c1831en.f6169e)) {
                c1814e6.f6136j = c1831en.f6169e.getBytes();
            }
            if (!AbstractC2356zn.m4703a(c1831en.f6170f)) {
                c1814e6.f6137k = this.f6496f.fromModel(c1831en.f6170f);
            }
        }
        return c1814e6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1924ig(C1557Tm c1557Tm, C1584V c1584v, C2039n6 c2039n6, C1580Uk c1580Uk, C1897he c1897he, C1922ie c1922ie) {
        this.f6491a = c1557Tm;
        this.f6492b = c1584v;
        this.f6493c = c2039n6;
        this.f6494d = c1580Uk;
        this.f6495e = c1897he;
        this.f6496f = c1922ie;
    }

    /* renamed from: a */
    public final C1899hg m4018a(C1814e6 c1814e6) {
        throw new UnsupportedOperationException();
    }
}
