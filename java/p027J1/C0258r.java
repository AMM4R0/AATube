package p027J1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2493j;
import p105l1.C2636g;
import p131u1.InterfaceC2799a;

/* renamed from: J1.r */
/* loaded from: classes.dex */
public final class C0258r extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: e */
    public final /* synthetic */ C0259s f767e;

    /* renamed from: f */
    public final /* synthetic */ int f768f;

    /* renamed from: g */
    public final /* synthetic */ long f769g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0258r(C0259s c0259s, int r2, long j2) {
        super(0);
        this.f767e = c0259s;
        this.f768f = r2;
        this.f769g = j2;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        C0259s c0259s = this.f767e;
        try {
            c0259s.f794x.m650n(this.f768f, this.f769g);
        } catch (IOException e2) {
            c0259s.m671g(e2);
        }
        return C2636g.f8557a;
    }
}
