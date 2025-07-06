package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.Log;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: io.appmetrica.analytics.impl.P7 */
/* loaded from: classes.dex */
public abstract class AbstractC1443P7 {

    /* renamed from: a */
    public final Context f5203a;

    /* renamed from: b */
    public final ProtobufStateStorage f5204b;

    /* renamed from: c */
    public final AbstractC1492R7 f5205c;

    /* renamed from: d */
    public final InterfaceC2106pn f5206d;

    /* renamed from: e */
    public final InterfaceC1805dm f5207e;

    /* renamed from: f */
    public final InterfaceC2301xi f5208f;

    /* renamed from: g */
    public final InterfaceC2251vi f5209g;

    /* renamed from: h */
    public final InterfaceC1142D6 f5210h;

    /* renamed from: i */
    public InterfaceC1468Q7 f5211i;

    public AbstractC1443P7(Context context, ProtobufStateStorage protobufStateStorage, AbstractC1492R7 abstractC1492R7, InterfaceC2106pn interfaceC2106pn, InterfaceC1805dm interfaceC1805dm, InterfaceC2301xi interfaceC2301xi, InterfaceC2251vi interfaceC2251vi, InterfaceC1142D6 interfaceC1142D6, InterfaceC1468Q7 interfaceC1468Q7) {
        this.f5203a = context;
        this.f5204b = protobufStateStorage;
        this.f5205c = abstractC1492R7;
        this.f5206d = interfaceC2106pn;
        this.f5207e = interfaceC1805dm;
        this.f5208f = interfaceC2301xi;
        this.f5209g = interfaceC2251vi;
        this.f5210h = interfaceC1142D6;
        this.f5211i = interfaceC1468Q7;
    }

    /* renamed from: a */
    public final synchronized InterfaceC1468Q7 m3195a() {
        return this.f5211i;
    }

    /* renamed from: b */
    public final synchronized boolean m3198b(InterfaceC1542T7 interfaceC1542T7) {
        boolean z2;
        try {
            if (interfaceC1542T7.mo3259a() == EnumC1517S7.f5404b) {
                return false;
            }
            if (interfaceC1542T7.equals(this.f5211i.mo2858b())) {
                return false;
            }
            List list = (List) this.f5206d.invoke(this.f5211i.mo2857a(), interfaceC1542T7);
            boolean z3 = list != null;
            if (list == null) {
                list = this.f5211i.mo2857a();
            }
            if (this.f5205c.mo3052a(interfaceC1542T7, this.f5211i.mo2858b())) {
                z2 = true;
            } else {
                interfaceC1542T7 = (InterfaceC1542T7) this.f5211i.mo2858b();
                z2 = false;
            }
            if (z2 || z3) {
                InterfaceC1468Q7 interfaceC1468Q7 = this.f5211i;
                InterfaceC1468Q7 interfaceC1468Q72 = (InterfaceC1468Q7) this.f5207e.invoke(interfaceC1542T7, list);
                this.f5211i = interfaceC1468Q72;
                this.f5204b.save(interfaceC1468Q72);
                Object[] objArr = {interfaceC1468Q7, this.f5211i};
                Pattern pattern = AbstractC1329Ki.f4968a;
                Log.i("AppMetrica-Attribution", String.format("Update distribution data: %s -> %s", objArr));
            }
            return z2;
        } finally {
        }
    }

    /* renamed from: c */
    public final synchronized InterfaceC1542T7 m3199c() {
        try {
            if (!this.f5209g.mo3204a()) {
                InterfaceC1542T7 interfaceC1542T7 = (InterfaceC1542T7) this.f5208f.invoke();
                this.f5209g.mo3205b();
                if (interfaceC1542T7 != null) {
                    m3198b(interfaceC1542T7);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC1542T7) this.f5211i.mo2858b();
    }

    /* renamed from: a */
    public final InterfaceC1542T7 m3196a(InterfaceC1542T7 interfaceC1542T7) {
        InterfaceC1542T7 m3199c;
        this.f5210h.mo2827a(this.f5203a);
        synchronized (this) {
            m3198b(interfaceC1542T7);
            m3199c = m3199c();
        }
        return m3199c;
    }

    /* renamed from: b */
    public final InterfaceC1542T7 m3197b() {
        this.f5210h.mo2827a(this.f5203a);
        return m3199c();
    }
}
