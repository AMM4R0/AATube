package io.appmetrica.analytics.impl;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.T1 */
/* loaded from: classes.dex */
public final class C1536T1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: f */
    public static final AtomicBoolean f5453f = new AtomicBoolean();

    /* renamed from: a */
    public final List f5454a;

    /* renamed from: b */
    public final Thread.UncaughtExceptionHandler f5455b;

    /* renamed from: c */
    public final C1507Rm f5456c;

    /* renamed from: d */
    public final InterfaceC1773cf f5457d;

    /* renamed from: e */
    public final C2214u6 f5458e;

    public C1536T1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ArrayList arrayList, C1671Yb c1671Yb, C2214u6 c2214u6, C1507Rm c1507Rm) {
        this.f5454a = arrayList;
        this.f5455b = uncaughtExceptionHandler;
        this.f5457d = c1671Yb;
        this.f5458e = c2214u6;
        this.f5456c = c1507Rm;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        try {
            f5453f.set(true);
            C1383Mm apply = this.f5458e.apply(thread);
            C1507Rm c1507Rm = this.f5456c;
            Thread m3191a = ((C1433Om) c1507Rm.f5395a).m3191a();
            ArrayList m3307a = c1507Rm.m3307a(m3191a, thread);
            if (thread != m3191a) {
                try {
                    stackTraceElementArr = m3191a.getStackTrace();
                } catch (SecurityException unused) {
                    stackTraceElementArr = null;
                }
                m3307a.add(0, (C1383Mm) c1507Rm.f5396b.apply(m3191a, stackTraceElementArr));
            }
            C1559U c1559u = new C1559U(apply, m3307a, ((C1671Yb) this.f5457d).m3543c());
            Iterator it = this.f5454a.iterator();
            while (it.hasNext()) {
                ((AbstractC2089p6) ((InterfaceC1171Ea) it.next())).m4278a(th, c1559u);
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f5455b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
