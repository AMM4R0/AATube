package p105l1;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: l1.c */
/* loaded from: classes.dex */
public final class C2632c implements Serializable {

    /* renamed from: a */
    public final Object f8550a;

    /* renamed from: b */
    public final Object f8551b;

    public C2632c(Object obj, Object obj2) {
        this.f8550a = obj;
        this.f8551b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2632c)) {
            return false;
        }
        C2632c c2632c = (C2632c) obj;
        return AbstractC2492i.m4911a(this.f8550a, c2632c.f8550a) && AbstractC2492i.m4911a(this.f8551b, c2632c.f8551b);
    }

    public final int hashCode() {
        Object obj = this.f8550a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f8551b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f8550a + ", " + this.f8551b + ')';
    }
}
