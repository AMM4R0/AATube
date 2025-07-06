package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.List;
import kotlin.jvm.internal.AbstractC2492i;
import p131u1.InterfaceC2810l;

/* renamed from: io.appmetrica.analytics.impl.rd */
/* loaded from: classes.dex */
public final class C2146rd implements NativeCrashHandler {

    /* renamed from: a */
    public final C1077Ag f7063a;

    /* renamed from: b */
    public final InterfaceC2810l f7064b;

    public C2146rd(C1077Ag c1077Ag, InterfaceC2810l interfaceC2810l) {
        this.f7063a = c1077Ag;
        this.f7064b = interfaceC2810l;
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(NativeCrash nativeCrash) {
        C2233v0 c2233v0;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String uuid = nativeCrash.getUuid();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            C2258w0 m4591a = C2283x0.m4591a(nativeCrash.getMetadata());
            AbstractC2492i.m4912b(m4591a);
            c2233v0 = new C2233v0(source, handlerVersion, uuid, dumpFile, creationTime, m4591a);
        } catch (Throwable unused) {
            c2233v0 = null;
        }
        if (c2233v0 == null) {
            this.f7064b.invoke(nativeCrash.getUuid());
            return;
        }
        C1077Ag c1077Ag = this.f7063a;
        C2096pd c2096pd = new C2096pd(this, nativeCrash);
        c1077Ag.getClass();
        c1077Ag.m2733a(c2233v0, c2096pd, new C2299xg(c2233v0));
    }

    /* renamed from: a */
    public final void m4401a(List<NativeCrash> list) {
        C2233v0 c2233v0;
        for (NativeCrash nativeCrash : list) {
            try {
                NativeCrashSource source = nativeCrash.getSource();
                String handlerVersion = nativeCrash.getHandlerVersion();
                String uuid = nativeCrash.getUuid();
                String dumpFile = nativeCrash.getDumpFile();
                long creationTime = nativeCrash.getCreationTime();
                C2258w0 m4591a = C2283x0.m4591a(nativeCrash.getMetadata());
                AbstractC2492i.m4912b(m4591a);
                c2233v0 = new C2233v0(source, handlerVersion, uuid, dumpFile, creationTime, m4591a);
            } catch (Throwable unused) {
                c2233v0 = null;
            }
            if (c2233v0 != null) {
                C1077Ag c1077Ag = this.f7063a;
                C2121qd c2121qd = new C2121qd(this, nativeCrash);
                c1077Ag.getClass();
                c1077Ag.m2733a(c2233v0, c2121qd, new C2324yg(c2233v0));
            } else {
                this.f7064b.invoke(nativeCrash.getUuid());
            }
        }
    }
}
