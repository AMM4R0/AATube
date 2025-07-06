package p008C1;

/* renamed from: C1.u */
/* loaded from: classes.dex */
public enum EnumC0089u {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");


    /* renamed from: b */
    public static final C0070b f277b = new C0070b();

    /* renamed from: a */
    public final String f286a;

    EnumC0089u(String str) {
        this.f286a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f286a;
    }
}
