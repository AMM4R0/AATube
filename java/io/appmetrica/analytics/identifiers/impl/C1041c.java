package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: io.appmetrica.analytics.identifiers.impl.c */
/* loaded from: classes.dex */
public final class C1041c {

    /* renamed from: a */
    public final IdentifierStatus f4421a;

    /* renamed from: b */
    public final C1039a f4422b;

    /* renamed from: c */
    public final String f4423c;

    public C1041c(IdentifierStatus identifierStatus, C1039a c1039a, String str) {
        this.f4421a = identifierStatus;
        this.f4422b = c1039a;
        this.f4423c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1041c)) {
            return false;
        }
        C1041c c1041c = (C1041c) obj;
        return this.f4421a == c1041c.f4421a && AbstractC2492i.m4911a(this.f4422b, c1041c.f4422b) && AbstractC2492i.m4911a(this.f4423c, c1041c.f4423c);
    }

    public final int hashCode() {
        int hashCode = this.f4421a.hashCode() * 31;
        C1039a c1039a = this.f4422b;
        int hashCode2 = (hashCode + (c1039a == null ? 0 : c1039a.hashCode())) * 31;
        String str = this.f4423c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdResult(status=" + this.f4421a + ", advIdInfo=" + this.f4422b + ", errorExplanation=" + this.f4423c + ')';
    }

    public /* synthetic */ C1041c(IdentifierStatus identifierStatus, C1039a c1039a, String str, int r6) {
        this(identifierStatus, (r6 & 2) != 0 ? null : c1039a, (r6 & 4) != 0 ? null : str);
    }
}
