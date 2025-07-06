package p027J1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2493j;
import p105l1.C2636g;
import p131u1.InterfaceC2799a;

/* renamed from: J1.q */
/* loaded from: classes.dex */
public final class C0257q extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: e */
    public final /* synthetic */ C0259s f764e;

    /* renamed from: f */
    public final /* synthetic */ int f765f;

    /* renamed from: g */
    public final /* synthetic */ EnumC0242b f766g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0257q(C0259s c0259s, int r2, EnumC0242b enumC0242b) {
        super(0);
        this.f764e = c0259s;
        this.f765f = r2;
        this.f766g = enumC0242b;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        C0259s c0259s = this.f764e;
        try {
            c0259s.f794x.m648l(this.f765f, this.f766g);
        } catch (IOException e2) {
            c0259s.m671g(e2);
        }
        return C2636g.f8557a;
    }
}
