package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2489f;

/* loaded from: classes.dex */
public abstract class SimpleThreadSafeToggle implements Toggle {

    /* renamed from: a */
    private final String f4379a;

    /* renamed from: b */
    private boolean f4380b;

    /* renamed from: c */
    private final ArrayList f4381c;

    public SimpleThreadSafeToggle(boolean z2, String str) {
        this.f4379a = str;
        this.f4380b = z2;
        this.f4381c = new ArrayList();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized boolean getActualState() {
        return this.f4380b;
    }

    public final String getTag() {
        return this.f4379a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void registerObserver(ToggleObserver toggleObserver, boolean z2) {
        this.f4381c.add(toggleObserver);
        if (z2) {
            toggleObserver.onStateChanged(getActualState());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void removeObserver(ToggleObserver toggleObserver) {
        this.f4381c.remove(toggleObserver);
    }

    public final synchronized void updateState(boolean z2) {
        if (z2 != getActualState()) {
            this.f4380b = z2;
            Iterator it = this.f4381c.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(z2);
            }
        }
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean z2, String str, int r3, AbstractC2489f abstractC2489f) {
        this((r3 & 1) != 0 ? false : z2, str);
    }
}
