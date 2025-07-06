package p027J1;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC2493j;
import p105l1.C2636g;
import p131u1.InterfaceC2799a;

/* renamed from: J1.p */
/* loaded from: classes.dex */
public final class C0256p extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: e */
    public final /* synthetic */ int f761e;

    /* renamed from: f */
    public final /* synthetic */ C0259s f762f;

    /* renamed from: g */
    public final /* synthetic */ int f763g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0256p(C0259s c0259s, int r2, Object obj, int r4) {
        super(0);
        this.f761e = r4;
        this.f762f = c0259s;
        this.f763g = r2;
    }

    /* renamed from: a */
    private final Object m668a() {
        this.f762f.f781k.getClass();
        C0259s c0259s = this.f762f;
        int r12 = this.f763g;
        try {
            c0259s.f794x.m648l(r12, EnumC0242b.CANCEL);
            synchronized (c0259s) {
                c0259s.f796z.remove(Integer.valueOf(r12));
            }
        } catch (IOException unused) {
        }
        return C2636g.f8557a;
    }

    /* renamed from: b */
    private final Object m669b() {
        this.f762f.f781k.getClass();
        C0259s c0259s = this.f762f;
        int r12 = this.f763g;
        try {
            c0259s.f794x.m648l(r12, EnumC0242b.CANCEL);
            synchronized (c0259s) {
                c0259s.f796z.remove(Integer.valueOf(r12));
            }
        } catch (IOException unused) {
        }
        return C2636g.f8557a;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        switch (this.f761e) {
            case 0:
                return m668a();
            case 1:
                return m669b();
            default:
                this.f762f.f781k.getClass();
                C0259s c0259s = this.f762f;
                int r12 = this.f763g;
                synchronized (c0259s) {
                    c0259s.f796z.remove(Integer.valueOf(r12));
                }
                return C2636g.f8557a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0256p(C0259s c0259s, int r2, List list, boolean z2) {
        super(0);
        this.f761e = 0;
        this.f762f = c0259s;
        this.f763g = r2;
    }
}
