package androidx.lifecycle;

import android.os.Bundle;
import androidx.activity.AbstractActivityC0592k;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2492i;
import p008C1.C0081m;
import p082f0.C0900d;
import p082f0.InterfaceC0899c;
import p105l1.C2634e;

/* renamed from: androidx.lifecycle.H */
/* loaded from: classes.dex */
public final class C0684H implements InterfaceC0899c {

    /* renamed from: a */
    public final C0900d f2382a;

    /* renamed from: b */
    public boolean f2383b;

    /* renamed from: c */
    public Bundle f2384c;

    /* renamed from: d */
    public final C2634e f2385d;

    public C0684H(C0900d savedStateRegistry, AbstractActivityC0592k abstractActivityC0592k) {
        AbstractC2492i.m4915e(savedStateRegistry, "savedStateRegistry");
        this.f2382a = savedStateRegistry;
        this.f2385d = new C2634e(new C0081m(6, abstractActivityC0592k));
    }

    @Override // p082f0.InterfaceC0899c
    /* renamed from: a */
    public final Bundle mo1466a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2384c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((C0685I) this.f2385d.m5093a()).f2386c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f2383b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue().getClass();
        throw new ClassCastException();
    }
}
