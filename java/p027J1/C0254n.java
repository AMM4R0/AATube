package p027J1;

import java.io.IOException;
import p011D1.AbstractC0119f;
import p105l1.C2636g;
import p131u1.InterfaceC2799a;

/* renamed from: J1.n */
/* loaded from: classes.dex */
public final class C0254n implements InterfaceC2799a {

    /* renamed from: a */
    public final C0264x f755a;

    /* renamed from: b */
    public final /* synthetic */ C0259s f756b;

    public C0254n(C0259s c0259s, C0264x c0264x) {
        this.f756b = c0259s;
        this.f755a = c0264x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [J1.s] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [J1.b] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        Throwable th;
        EnumC0242b enumC0242b;
        ?? r02 = this.f756b;
        C0264x c0264x = this.f755a;
        EnumC0242b enumC0242b2 = EnumC0242b.INTERNAL_ERROR;
        ?? r3 = 1;
        IOException e2 = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e3) {
                e2 = e3;
                enumC0242b = enumC0242b2;
            }
            if (!c0264x.m681b(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    r3 = enumC0242b2;
                    r02.m670b(r3, enumC0242b2, e2);
                    AbstractC0119f.m396b(c0264x);
                    throw th;
                }
            } while (c0264x.m681b(false, this));
            enumC0242b = EnumC0242b.NO_ERROR;
            try {
                enumC0242b2 = EnumC0242b.CANCEL;
                r02.m670b(enumC0242b, enumC0242b2, null);
                r3 = enumC0242b;
            } catch (IOException e4) {
                e2 = e4;
                enumC0242b2 = EnumC0242b.PROTOCOL_ERROR;
                r02.m670b(enumC0242b2, enumC0242b2, e2);
                r3 = enumC0242b;
                AbstractC0119f.m396b(c0264x);
                return C2636g.f8557a;
            }
            AbstractC0119f.m396b(c0264x);
            return C2636g.f8557a;
        } catch (Throwable th4) {
            th = th4;
            r02.m670b(r3, enumC0242b2, e2);
            AbstractC0119f.m396b(c0264x);
            throw th;
        }
    }
}
