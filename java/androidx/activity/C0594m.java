package androidx.activity;

import androidx.fragment.app.C0674x;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC2493j;
import p105l1.C2636g;
import p108m1.C2657g;
import p131u1.InterfaceC2799a;

/* renamed from: androidx.activity.m */
/* loaded from: classes.dex */
public final class C0594m extends AbstractC2493j implements InterfaceC2799a {

    /* renamed from: e */
    public final /* synthetic */ int f1691e;

    /* renamed from: f */
    public final /* synthetic */ C0604t f1692f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0594m(C0604t c0604t, int r2) {
        super(0);
        this.f1691e = r2;
        this.f1692f = c0604t;
    }

    @Override // p131u1.InterfaceC2799a
    public final Object invoke() {
        Object obj;
        switch (this.f1691e) {
            case 0:
                this.f1692f.m1483b();
                break;
            case 1:
                C0604t c0604t = this.f1692f;
                C2657g c2657g = c0604t.f1709b;
                ListIterator listIterator = c2657g.listIterator(c2657g.mo5095a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((C0674x) obj).f2357a) {
                        }
                    } else {
                        obj = null;
                    }
                }
                c0604t.f1710c = null;
                break;
            default:
                this.f1692f.m1483b();
                break;
        }
        return C2636g.f8557a;
    }
}
