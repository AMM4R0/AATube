package p027J1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2493j;
import p105l1.C2636g;
import p131u1.InterfaceC2799a;

/* renamed from: J1.m */
/* loaded from: classes.dex */
public final class C0253m extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: e */
    public final /* synthetic */ C0259s f752e;

    /* renamed from: f */
    public final /* synthetic */ int f753f;

    /* renamed from: g */
    public final /* synthetic */ int f754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0253m(C0259s c0259s, int r2, int r3) {
        super(0);
        this.f752e = c0259s;
        this.f753f = r2;
        this.f754g = r3;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        int r02 = this.f753f;
        int r12 = this.f754g;
        C0259s c0259s = this.f752e;
        c0259s.getClass();
        try {
            c0259s.f794x.m647k(r02, r12, true);
        } catch (IOException e2) {
            c0259s.m671g(e2);
        }
        return C2636g.f8557a;
    }
}
