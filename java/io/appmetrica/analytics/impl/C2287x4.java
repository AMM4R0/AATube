package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.x4 */
/* loaded from: classes.dex */
public final class C2287x4 {

    /* renamed from: a */
    public final Object f7410a;

    /* renamed from: b */
    public final C2163s5 f7411b;

    /* renamed from: c */
    public final HashMap f7412c;

    /* renamed from: d */
    public final C2068oa f7413d;

    /* renamed from: e */
    public final Context f7414e;

    /* renamed from: f */
    public final C1115C4 f7415f;

    public C2287x4(Context context, C2163s5 c2163s5) {
        this(context, c2163s5, new C1115C4());
    }

    /* renamed from: a */
    public final InterfaceC1065A4 m4596a(C2062o4 c2062o4, C1290J4 c1290j4) {
        InterfaceC1065A4 interfaceC1065A4;
        synchronized (this.f7410a) {
            try {
                interfaceC1065A4 = (InterfaceC1065A4) this.f7412c.get(c2062o4);
                if (interfaceC1065A4 == null) {
                    this.f7415f.getClass();
                    interfaceC1065A4 = C1115C4.m2789a(c2062o4).mo2746a(this.f7414e, this.f7411b, c2062o4, c1290j4);
                    this.f7412c.put(c2062o4, interfaceC1065A4);
                    this.f7413d.m4264a(new C2262w4(c2062o4.f6838b, c2062o4.f6839c, c2062o4.f6840d), c2062o4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1065A4;
    }

    public C2287x4(Context context, C2163s5 c2163s5, C1115C4 c1115c4) {
        this.f7410a = new Object();
        this.f7412c = new HashMap();
        this.f7413d = new C2068oa();
        this.f7414e = context.getApplicationContext();
        this.f7411b = c2163s5;
        this.f7415f = c1115c4;
    }

    /* renamed from: a */
    public final void m4597a(int r4, String str, String str2) {
        Integer valueOf = Integer.valueOf(r4);
        synchronized (this.f7410a) {
            try {
                C2068oa c2068oa = this.f7413d;
                Collection collection = (Collection) c2068oa.f6854a.remove(new C2262w4(str, valueOf, str2));
                if (!AbstractC2356zn.m4702a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.f7412c.remove((C2062o4) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1065A4) it2.next()).mo2691a();
                    }
                }
            } finally {
            }
        }
    }
}
