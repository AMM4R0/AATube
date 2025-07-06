package p105l1;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: l1.d */
/* loaded from: classes.dex */
public final class C2633d implements Serializable {

    /* renamed from: a */
    public final Throwable f8552a;

    public C2633d(Throwable th) {
        this.f8552a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2633d) {
            if (AbstractC2492i.m4911a(this.f8552a, ((C2633d) obj).f8552a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8552a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f8552a + ')';
    }
}
