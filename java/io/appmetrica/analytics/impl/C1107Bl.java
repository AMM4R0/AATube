package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.impl.Bl */
/* loaded from: classes.dex */
public final class C1107Bl implements InterfaceC1182El {

    /* renamed from: a */
    public volatile C2354zl f4547a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f4548b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC1182El
    /* renamed from: a */
    public final void mo2780a(C2354zl c2354zl) {
        this.f4547a = c2354zl;
        Iterator it = this.f4548b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1182El) it.next()).mo2780a(c2354zl);
        }
    }

    /* renamed from: b */
    public final void m2782b(InterfaceC1182El interfaceC1182El) {
        this.f4548b.remove(interfaceC1182El);
    }

    /* renamed from: b */
    public final void m2781b(Context context) {
        String optStringOrNull;
        ProtobufStateStorage<Object> m4227a = C2005lm.m4116a(C1157Dl.class).m4227a(context);
        C1359Ln m3244a = C2018ma.m4192h().m4193A().m3244a();
        synchronized (m3244a) {
            optStringOrNull = JsonUtils.optStringOrNull(m3244a.f5018a.m3193a(), "device_id");
        }
        mo2780a(new C2354zl(optStringOrNull, m3244a.m3067a(), (C1157Dl) m4227a.read()));
    }

    /* renamed from: a */
    public final C2354zl m2778a() {
        C2354zl c2354zl = this.f4547a;
        if (c2354zl != null) {
            return c2354zl;
        }
        AbstractC2492i.m4918h("startupState");
        throw null;
    }

    /* renamed from: a */
    public final void m2779a(InterfaceC1182El interfaceC1182El) {
        this.f4548b.add(interfaceC1182El);
        if (this.f4547a != null) {
            C2354zl c2354zl = this.f4547a;
            if (c2354zl != null) {
                interfaceC1182El.mo2780a(c2354zl);
            } else {
                AbstractC2492i.m4918h("startupState");
                throw null;
            }
        }
    }
}
