package p008C1;

import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: C1.s */
/* loaded from: classes.dex */
public final class C0087s {

    /* renamed from: a */
    public final String f247a;

    public C0087s(String mediaType, String str, String str2, String[] parameterNamesAndValues) {
        AbstractC2492i.m4915e(mediaType, "mediaType");
        AbstractC2492i.m4915e(parameterNamesAndValues, "parameterNamesAndValues");
        this.f247a = mediaType;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0087s) && AbstractC2492i.m4911a(((C0087s) obj).f247a, this.f247a);
    }

    public final int hashCode() {
        return this.f247a.hashCode();
    }

    public final String toString() {
        return this.f247a;
    }
}
