package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C1215G4;
import io.appmetrica.analytics.impl.C1994lb;
import io.appmetrica.analytics.impl.C2123qf;
import io.appmetrica.analytics.impl.C2155rm;
import io.appmetrica.analytics.impl.C2319yb;
import p000A.AbstractC0002c;

/* loaded from: classes.dex */
public final class Attribute {
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    public static BooleanAttribute customBoolean(String str) {
        return new BooleanAttribute(str, new C1994lb(), new C2319yb(new C1215G4(100)));
    }

    public static CounterAttribute customCounter(String str) {
        return new CounterAttribute(str, new C1994lb(), new C2319yb(new C1215G4(100)));
    }

    public static NumberAttribute customNumber(String str) {
        return new NumberAttribute(str, new C1994lb(), new C2319yb(new C1215G4(100)));
    }

    public static StringAttribute customString(String str) {
        return new StringAttribute(str, new C2155rm(200, AbstractC0002c.m16k("String attribute \"", str, "\""), C2123qf.f6997e), new C1994lb(), new C2319yb(new C1215G4(100)));
    }

    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    public static NameAttribute name() {
        return new NameAttribute();
    }

    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }
}
