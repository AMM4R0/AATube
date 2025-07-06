package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: androidx.lifecycle.j */
/* loaded from: classes.dex */
public final class C0700j {
    /* renamed from: a */
    public static EnumC0702l m1788a(EnumC0703m state) {
        AbstractC2492i.m4915e(state, "state");
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            return EnumC0702l.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0702l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0702l.ON_RESUME;
    }
}
