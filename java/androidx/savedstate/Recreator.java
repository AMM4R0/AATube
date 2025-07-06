package androidx.savedstate;

import android.os.Bundle;
import androidx.fragment.app.C0667q;
import androidx.lifecycle.AbstractC0686J;
import androidx.lifecycle.C0688L;
import androidx.lifecycle.C0699i;
import androidx.lifecycle.C0710t;
import androidx.lifecycle.EnumC0702l;
import androidx.lifecycle.InterfaceC0689M;
import androidx.lifecycle.InterfaceC0706p;
import androidx.lifecycle.InterfaceC0708r;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;
import p082f0.C0900d;
import p082f0.InterfaceC0898b;
import p082f0.InterfaceC0901e;

/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0706p {

    /* renamed from: a */
    public final InterfaceC0901e f2575a;

    public Recreator(InterfaceC0901e interfaceC0901e) {
        this.f2575a = interfaceC0901e;
    }

    @Override // androidx.lifecycle.InterfaceC0706p
    /* renamed from: b */
    public final void mo1460b(InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l) {
        Object obj;
        boolean z2;
        if (enumC0702l != EnumC0702l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0708r.mo1475e().m1796f(this);
        Bundle m2429c = this.f2575a.mo1473b().m2429c("androidx.savedstate.Restarter");
        if (m2429c == null) {
            return;
        }
        ArrayList<String> stringArrayList = m2429c.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC0898b.class);
                AbstractC2492i.m4914d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(null);
                        AbstractC2492i.m4914d(newInstance, "{\n                constr…wInstance()\n            }");
                        InterfaceC0901e interfaceC0901e = this.f2575a;
                        if (!(interfaceC0901e instanceof InterfaceC0689M)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        C0688L mo1474d = ((InterfaceC0689M) interfaceC0901e).mo1474d();
                        C0900d registry = interfaceC0901e.mo1473b();
                        mo1474d.getClass();
                        Iterator it = new HashSet(mo1474d.f2391a.keySet()).iterator();
                        while (it.hasNext()) {
                            String key = (String) it.next();
                            AbstractC2492i.m4915e(key, "key");
                            AbstractC0686J abstractC0686J = (AbstractC0686J) mo1474d.f2391a.get(key);
                            AbstractC2492i.m4912b(abstractC0686J);
                            C0710t lifecycle = interfaceC0901e.mo1475e();
                            AbstractC2492i.m4915e(registry, "registry");
                            AbstractC2492i.m4915e(lifecycle, "lifecycle");
                            HashMap hashMap = abstractC0686J.f2387a;
                            if (hashMap == null) {
                                obj = null;
                            } else {
                                synchronized (hashMap) {
                                    obj = abstractC0686J.f2387a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !(z2 = savedStateHandleController.f2395a)) {
                                if (z2) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f2395a = true;
                                lifecycle.m1791a(savedStateHandleController);
                                throw null;
                            }
                        }
                        if (!new HashSet(mo1474d.f2391a.keySet()).isEmpty()) {
                            if (!registry.f3747c) {
                                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                            }
                            C0667q c0667q = (C0667q) registry.f3750f;
                            if (c0667q == null) {
                                c0667q = new C0667q(registry);
                            }
                            registry.f3750f = c0667q;
                            try {
                                C0699i.class.getDeclaredConstructor(null);
                                C0667q c0667q2 = (C0667q) registry.f3750f;
                                if (c0667q2 != null) {
                                    ((LinkedHashSet) c0667q2.f2339b).add(C0699i.class.getName());
                                }
                            } catch (NoSuchMethodException e2) {
                                throw new IllegalArgumentException("Class " + C0699i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                            }
                        }
                    } catch (Exception e3) {
                        throw new RuntimeException("Failed to instantiate " + str, e3);
                    }
                } catch (NoSuchMethodException e4) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException(AbstractC0002c.m16k("Class ", str, " wasn't found"), e5);
            }
        }
    }
}
