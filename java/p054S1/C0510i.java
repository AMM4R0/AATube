package p054S1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC2493j;
import kotlin.jvm.internal.C2497n;
import p051R1.C0494x;
import p105l1.C2636g;
import p131u1.InterfaceC2814p;

/* renamed from: S1.i */
/* loaded from: classes.dex */
public final class C0510i extends AbstractC2493j implements InterfaceC2814p {

    /* renamed from: e */
    public final /* synthetic */ C2497n f1314e;

    /* renamed from: f */
    public final /* synthetic */ C0494x f1315f;

    /* renamed from: g */
    public final /* synthetic */ C2497n f1316g;

    /* renamed from: h */
    public final /* synthetic */ C2497n f1317h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0510i(C2497n c2497n, C0494x c0494x, C2497n c2497n2, C2497n c2497n3) {
        super(2);
        this.f1314e = c2497n;
        this.f1315f = c0494x;
        this.f1316g = c2497n2;
        this.f1317h = c2497n3;
    }

    @Override // p131u1.InterfaceC2814p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            C2497n c2497n = this.f1314e;
            if (c2497n.f8174a != null) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (longValue != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            C0494x c0494x = this.f1315f;
            c2497n.f8174a = Long.valueOf(c0494x.m1296l());
            this.f1316g.f8174a = Long.valueOf(c0494x.m1296l());
            this.f1317h.f8174a = Long.valueOf(c0494x.m1296l());
        }
        return C2636g.f8557a;
    }
}
