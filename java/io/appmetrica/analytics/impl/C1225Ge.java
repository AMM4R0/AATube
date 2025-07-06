package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Ge */
/* loaded from: classes.dex */
public final class C1225Ge implements ProtobufConverter {

    /* renamed from: a */
    public final C1524Se f4785a;

    /* renamed from: b */
    public final C1100Be f4786b;

    public C1225Ge() {
        this(new C1524Se(), new C1100Be());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1425Oe fromModel(C1175Ee c1175Ee) {
        C1425Oe c1425Oe = new C1425Oe();
        c1425Oe.f5175a = this.f4785a.fromModel(c1175Ee.f4696a);
        c1425Oe.f5176b = new C1400Ne[c1175Ee.f4697b.size()];
        Iterator<C1150De> it = c1175Ee.f4697b.iterator();
        int r12 = 0;
        while (it.hasNext()) {
            c1425Oe.f5176b[r12] = this.f4786b.fromModel(it.next());
            r12++;
        }
        return c1425Oe;
    }

    public C1225Ge(C1524Se c1524Se, C1100Be c1100Be) {
        this.f4785a = c1524Se;
        this.f4786b = c1100Be;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1175Ee toModel(C1425Oe c1425Oe) {
        C1499Re model;
        ArrayList arrayList = new ArrayList(c1425Oe.f5176b.length);
        for (C1400Ne c1400Ne : c1425Oe.f5176b) {
            arrayList.add(this.f4786b.toModel(c1400Ne));
        }
        C1375Me c1375Me = c1425Oe.f5175a;
        if (c1375Me == null) {
            model = this.f4785a.toModel(new C1375Me());
        } else {
            model = this.f4785a.toModel(c1375Me);
        }
        return new C1175Ee(model, arrayList);
    }
}
