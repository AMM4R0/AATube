package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.tc */
/* loaded from: classes.dex */
public final class C2195tc {

    /* renamed from: a */
    public final C2155rm f7162a;

    /* renamed from: b */
    public final C2155rm f7163b;

    /* renamed from: c */
    public final C1215G4 f7164c;

    /* renamed from: d */
    public final C2123qf f7165d;

    /* renamed from: e */
    public final String f7166e;

    public C2195tc(String str, C2123qf c2123qf) {
        this(new C1215G4(30), new C2155rm(50, str.concat("map key"), c2123qf), new C2155rm(4000, str.concat("map value"), c2123qf), str, c2123qf);
    }

    public C2195tc(C1215G4 c1215g4, C2155rm c2155rm, C2155rm c2155rm2, String str, C2123qf c2123qf) {
        this.f7164c = c1215g4;
        this.f7162a = c2155rm;
        this.f7163b = c2155rm2;
        this.f7166e = str;
        this.f7165d = c2123qf;
    }
}
