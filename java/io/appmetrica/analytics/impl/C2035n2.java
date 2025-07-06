package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.appmetrica.analytics.impl.n2 */
/* loaded from: classes.dex */
public final class C2035n2 implements InterfaceC1305Jj, ApplicationStateProvider {

    /* renamed from: a */
    public final HashSet f6791a = new HashSet();

    /* renamed from: b */
    public final HashSet f6792b = new HashSet();

    /* renamed from: c */
    public volatile ApplicationState f6793c = ApplicationState.UNKNOWN;

    /* renamed from: d */
    public final CopyOnWriteArraySet f6794d = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final void m4231a(int r2) {
        this.f6791a.remove(Integer.valueOf(r2));
        m4230a();
    }

    /* renamed from: b */
    public final void m4232b(int r3) {
        this.f6792b.add(Integer.valueOf(r3));
        this.f6791a.remove(Integer.valueOf(r3));
        m4230a();
    }

    /* renamed from: c */
    public final void m4233c(int r3) {
        this.f6791a.add(Integer.valueOf(r3));
        this.f6792b.remove(Integer.valueOf(r3));
        m4230a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState getCurrentState() {
        return this.f6793c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1305Jj
    public final void onCreate() {
        m4230a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1305Jj
    public final void onDestroy() {
        if (this.f6793c == ApplicationState.VISIBLE) {
            this.f6793c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState registerStickyObserver(ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f6794d.add(applicationStateObserver);
        }
        return this.f6793c;
    }

    /* renamed from: a */
    public final void m4230a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f6791a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f6792b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f6793c != applicationState) {
            this.f6793c = applicationState;
            Iterator it = this.f6794d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f6793c);
            }
        }
    }
}
