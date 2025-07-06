package p008C1;

import kotlin.jvm.internal.AbstractC2493j;
import p006C.C0055g;
import p011D1.AbstractC0119f;
import p018G1.C0155f;

/* renamed from: C1.y */
/* loaded from: classes.dex */
public final class C0093y {

    /* renamed from: a */
    public C0091w f301a;

    /* renamed from: b */
    public EnumC0089u f302b;

    /* renamed from: d */
    public String f304d;

    /* renamed from: e */
    public C0082n f305e;

    /* renamed from: h */
    public C0094z f308h;

    /* renamed from: i */
    public C0094z f309i;

    /* renamed from: j */
    public C0094z f310j;

    /* renamed from: k */
    public long f311k;

    /* renamed from: l */
    public long f312l;

    /* renamed from: m */
    public C0155f f313m;

    /* renamed from: c */
    public int f303c = -1;

    /* renamed from: g */
    public AbstractC0066A f307g = AbstractC0119f.f364c;

    /* renamed from: n */
    public AbstractC2493j f314n = C0092x.f300e;

    /* renamed from: f */
    public C0055g f306f = new C0055g(2);

    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.jvm.internal.j, u1.a] */
    /* renamed from: a */
    public final C0094z m310a() {
        int r5 = this.f303c;
        if (r5 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f303c).toString());
        }
        C0091w c0091w = this.f301a;
        if (c0091w == null) {
            throw new IllegalStateException("request == null");
        }
        EnumC0089u enumC0089u = this.f302b;
        if (enumC0089u == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f304d;
        if (str != null) {
            return new C0094z(c0091w, enumC0089u, str, r5, this.f305e, this.f306f.m218q(), this.f307g, this.f308h, this.f309i, this.f310j, this.f311k, this.f312l, this.f313m, this.f314n);
        }
        throw new IllegalStateException("message == null");
    }
}
