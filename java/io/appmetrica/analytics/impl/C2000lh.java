package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.lh */
/* loaded from: classes.dex */
public class C2000lh extends C1912i4 {

    /* renamed from: c */
    protected C1144D8 f6655c;

    /* renamed from: d */
    protected C1599Ve f6656d;

    /* renamed from: e */
    public boolean f6657e;

    /* renamed from: f */
    public final String f6658f;

    public C2000lh(C1748bf c1748bf, CounterConfiguration counterConfiguration) {
        this(c1748bf, counterConfiguration, null);
    }

    /* renamed from: a */
    public final void m4106a(C1331Kk c1331Kk) {
        this.f6655c = new C1144D8(c1331Kk);
    }

    /* renamed from: c */
    public final Bundle m4108c() {
        Bundle bundle = new Bundle();
        this.f6458b.toBundle(bundle);
        C1748bf c1748bf = this.f6457a;
        synchronized (c1748bf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", c1748bf);
        }
        return bundle;
    }

    /* renamed from: d */
    public final String m4109d() {
        C1144D8 c1144d8 = this.f6655c;
        if (c1144d8.f4633a.isEmpty()) {
            return null;
        }
        return new JSONObject(c1144d8.f4633a).toString();
    }

    /* renamed from: e */
    public final String m4110e() {
        return this.f6658f;
    }

    /* renamed from: f */
    public boolean mo3562f() {
        return this.f6657e;
    }

    public C2000lh(C1748bf c1748bf, CounterConfiguration counterConfiguration, String str) {
        super(c1748bf, counterConfiguration);
        this.f6657e = true;
        this.f6658f = str;
    }

    /* renamed from: a */
    public final void m4107a(C1599Ve c1599Ve) {
        this.f6656d = c1599Ve;
    }
}
