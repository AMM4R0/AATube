package p105l1;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC2492i;
import p131u1.InterfaceC2799a;

/* renamed from: l1.e */
/* loaded from: classes.dex */
public final class C2634e implements InterfaceC2631b, Serializable {

    /* renamed from: a */
    public InterfaceC2799a f8553a;

    /* renamed from: b */
    public volatile Object f8554b = C2635f.f8556a;

    /* renamed from: c */
    public final Object f8555c = this;

    public C2634e(InterfaceC2799a interfaceC2799a) {
        this.f8553a = interfaceC2799a;
    }

    /* renamed from: a */
    public final Object m5093a() {
        Object obj;
        Object obj2 = this.f8554b;
        C2635f c2635f = C2635f.f8556a;
        if (obj2 != c2635f) {
            return obj2;
        }
        synchronized (this.f8555c) {
            obj = this.f8554b;
            if (obj == c2635f) {
                InterfaceC2799a interfaceC2799a = this.f8553a;
                AbstractC2492i.m4912b(interfaceC2799a);
                obj = interfaceC2799a.invoke();
                this.f8554b = obj;
                this.f8553a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f8554b != C2635f.f8556a ? String.valueOf(m5093a()) : "Lazy value not initialized yet.";
    }
}
