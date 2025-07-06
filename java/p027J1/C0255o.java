package p027J1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2493j;
import p051R1.C0477g;
import p105l1.C2636g;
import p131u1.InterfaceC2799a;

/* renamed from: J1.o */
/* loaded from: classes.dex */
public final class C0255o extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: e */
    public final /* synthetic */ C0259s f757e;

    /* renamed from: f */
    public final /* synthetic */ int f758f;

    /* renamed from: g */
    public final /* synthetic */ C0477g f759g;

    /* renamed from: h */
    public final /* synthetic */ int f760h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0255o(C0259s c0259s, int r2, C0477g c0477g, int r4, boolean z2) {
        super(0);
        this.f757e = c0259s;
        this.f758f = r2;
        this.f759g = c0477g;
        this.f760h = r4;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        C0259s c0259s = this.f757e;
        int r12 = this.f758f;
        C0477g c0477g = this.f759g;
        int r3 = this.f760h;
        try {
            c0259s.f781k.getClass();
            c0477g.m1268t(r3);
            c0259s.f794x.m648l(r12, EnumC0242b.CANCEL);
            synchronized (c0259s) {
                c0259s.f796z.remove(Integer.valueOf(r12));
            }
        } catch (IOException unused) {
        }
        return C2636g.f8557a;
    }
}
