package p024I1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2492i;
import p051R1.C0469F;
import p051R1.C0477g;
import p051R1.C0484n;
import p051R1.InterfaceC0467D;

/* renamed from: I1.b */
/* loaded from: classes.dex */
public abstract class AbstractC0210b implements InterfaceC0467D {

    /* renamed from: a */
    public final C0484n f624a;

    /* renamed from: b */
    public boolean f625b;

    /* renamed from: c */
    public final /* synthetic */ C0217i f626c;

    public AbstractC0210b(C0217i c0217i) {
        this.f626c = c0217i;
        this.f624a = new C0484n(c0217i.f643c.f1249a.mo391d());
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: a */
    public long mo390a(C0477g sink, long j2) {
        C0217i c0217i = this.f626c;
        AbstractC2492i.m4915e(sink, "sink");
        try {
            return c0217i.f643c.mo390a(sink, j2);
        } catch (IOException e2) {
            c0217i.f642b.mo489h();
            m605b();
            throw e2;
        }
    }

    /* renamed from: b */
    public final void m605b() {
        C0217i c0217i = this.f626c;
        int r12 = c0217i.f645e;
        if (r12 == 6) {
            return;
        }
        if (r12 != 5) {
            throw new IllegalStateException("state: " + c0217i.f645e);
        }
        C0484n c0484n = this.f624a;
        C0469F c0469f = c0484n.f1228e;
        c0484n.f1228e = C0469F.f1191d;
        c0469f.mo1237a();
        c0469f.mo1238b();
        c0217i.f645e = 6;
    }

    @Override // p051R1.InterfaceC0467D
    /* renamed from: d */
    public final C0469F mo391d() {
        return this.f624a;
    }
}
