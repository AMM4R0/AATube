package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0002c;

/* renamed from: io.appmetrica.analytics.impl.ve */
/* loaded from: classes.dex */
public final class C2247ve implements InterfaceC1173Ec {

    /* renamed from: a */
    public final Context f7301a;

    /* renamed from: b */
    public final String f7302b;

    /* renamed from: c */
    public final String f7303c;

    public C2247ve(Context context, String str, String str2) {
        this.f7301a = context;
        this.f7302b = str;
        this.f7303c = str2;
    }

    /* renamed from: a */
    public final C2247ve m4522a(Context context, String str, String str2) {
        return new C2247ve(context, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2247ve)) {
            return false;
        }
        C2247ve c2247ve = (C2247ve) obj;
        return AbstractC2492i.m4911a(this.f7301a, c2247ve.f7301a) && AbstractC2492i.m4911a(this.f7302b, c2247ve.f7302b) && AbstractC2492i.m4911a(this.f7303c, c2247ve.f7303c);
    }

    public final int hashCode() {
        return this.f7303c.hashCode() + AbstractC0002c.m9d(this.f7302b, this.f7301a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f7301a + ", prefName=" + this.f7302b + ", prefValueName=" + this.f7303c + ')';
    }

    /* renamed from: a */
    public static C2247ve m4521a(C2247ve c2247ve, Context context, String str, String str2, int r4, Object obj) {
        if ((r4 & 1) != 0) {
            context = c2247ve.f7301a;
        }
        if ((r4 & 2) != 0) {
            str = c2247ve.f7302b;
        }
        if ((r4 & 4) != 0) {
            str2 = c2247ve.f7303c;
        }
        c2247ve.getClass();
        return new C2247ve(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1173Ec
    /* renamed from: a */
    public final String mo2855a() {
        String string = this.f7301a.getSharedPreferences(this.f7302b, 0).getString(this.f7303c, "");
        return string == null ? "" : string;
    }
}
