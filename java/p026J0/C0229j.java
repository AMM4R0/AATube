package p026J0;

import android.os.Bundle;
import androidx.activity.C0585d;
import androidx.activity.ExecutorC0591j;
import androidx.lifecycle.C0710t;
import androidx.lifecycle.EnumC0702l;
import androidx.lifecycle.EnumC0703m;
import androidx.lifecycle.InterfaceC0706p;
import androidx.lifecycle.InterfaceC0708r;
import androidx.savedstate.Recreator;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2492i;
import p082f0.C0900d;
import p082f0.InterfaceC0899c;
import p082f0.InterfaceC0901e;
import p109n.C2675d;
import p109n.C2677f;

/* renamed from: J0.j */
/* loaded from: classes.dex */
public final class C0229j {

    /* renamed from: a */
    public final Object f663a;

    /* renamed from: b */
    public boolean f664b;

    /* renamed from: c */
    public Object f665c;

    public C0229j() {
        this.f663a = new Object();
    }

    /* renamed from: a */
    public void m616a() {
        InterfaceC0901e interfaceC0901e = (InterfaceC0901e) this.f663a;
        C0710t mo1475e = interfaceC0901e.mo1475e();
        if (mo1475e.f2416c != EnumC0703m.f2406b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        mo1475e.m1791a(new Recreator(interfaceC0901e));
        final C0900d c0900d = (C0900d) this.f665c;
        c0900d.getClass();
        if (c0900d.f3745a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        mo1475e.m1791a(new InterfaceC0706p() { // from class: f0.a
            @Override // androidx.lifecycle.InterfaceC0706p
            /* renamed from: b */
            public final void mo1460b(InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l) {
                C0900d this$0 = C0900d.this;
                AbstractC2492i.m4915e(this$0, "this$0");
                if (enumC0702l == EnumC0702l.ON_START) {
                    this$0.f3747c = true;
                } else if (enumC0702l == EnumC0702l.ON_STOP) {
                    this$0.f3747c = false;
                }
            }
        });
        c0900d.f3745a = true;
        this.f664b = true;
    }

    /* renamed from: b */
    public void m617b(Bundle bundle) {
        if (!this.f664b) {
            m616a();
        }
        C0710t mo1475e = ((InterfaceC0901e) this.f663a).mo1475e();
        if (mo1475e.f2416c.compareTo(EnumC0703m.f2408d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + mo1475e.f2416c).toString());
        }
        C0900d c0900d = (C0900d) this.f665c;
        if (!c0900d.f3745a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0900d.f3746b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0900d.f3749e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0900d.f3746b = true;
    }

    /* renamed from: c */
    public void m618c(Bundle outBundle) {
        AbstractC2492i.m4915e(outBundle, "outBundle");
        C0900d c0900d = (C0900d) this.f665c;
        c0900d.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = (Bundle) c0900d.f3749e;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C2677f c2677f = (C2677f) c0900d.f3748d;
        c2677f.getClass();
        C2675d c2675d = new C2675d(c2677f);
        c2677f.f8623c.put(c2675d, Boolean.FALSE);
        while (c2675d.hasNext()) {
            Map.Entry entry = (Map.Entry) c2675d.next();
            bundle.putBundle((String) entry.getKey(), ((InterfaceC0899c) entry.getValue()).mo1466a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    /* renamed from: d */
    public void m619d(InterfaceC0228i interfaceC0228i) {
        synchronized (this.f663a) {
            try {
                if (((ArrayDeque) this.f665c) == null) {
                    this.f665c = new ArrayDeque();
                }
                ((ArrayDeque) this.f665c).add(interfaceC0228i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public void m620e(Task task) {
        InterfaceC0228i interfaceC0228i;
        synchronized (this.f663a) {
            if (((ArrayDeque) this.f665c) != null && !this.f664b) {
                this.f664b = true;
                while (true) {
                    synchronized (this.f663a) {
                        try {
                            interfaceC0228i = (InterfaceC0228i) ((ArrayDeque) this.f665c).poll();
                            if (interfaceC0228i == null) {
                                this.f664b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    interfaceC0228i.mo613a(task);
                }
            }
        }
    }

    public C0229j(InterfaceC0901e interfaceC0901e) {
        this.f663a = interfaceC0901e;
        this.f665c = new C0900d();
    }

    public C0229j(ExecutorC0591j executorC0591j, C0585d c0585d) {
        this.f663a = new Object();
        this.f665c = new ArrayList();
    }
}
