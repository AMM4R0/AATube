package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.G8 */
/* loaded from: classes.dex */
public final class C1219G8 {

    /* renamed from: a */
    public final C2220uc f4778a;

    /* renamed from: b */
    public final C2220uc f4779b;

    public C1219G8() {
        this(new C1617W7(), new C1345L9(), new C1732b());
    }

    public C1219G8(C1617W7 c1617w7, C1345L9 c1345l9, C1732b c1732b) {
        C2220uc c2220uc = new C2220uc(c1617w7);
        this.f4778a = c2220uc;
        c2220uc.m4483a(EnumC1244H8.NONE, c1617w7);
        c2220uc.m4483a(EnumC1244H8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, c1345l9);
        c2220uc.m4483a(EnumC1244H8.AES_VALUE_ENCRYPTION, c1732b);
        this.f4779b = new C2220uc(c1617w7);
    }
}
