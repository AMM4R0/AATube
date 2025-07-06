package androidx.activity;

import androidx.fragment.app.C0674x;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC2492i;
import kotlin.jvm.internal.AbstractC2493j;
import p105l1.C2636g;
import p108m1.C2657g;
import p131u1.InterfaceC2810l;

/* renamed from: androidx.activity.l */
/* loaded from: classes.dex */
public final class C0593l extends AbstractC2493j implements InterfaceC2810l {

    /* renamed from: e */
    public final /* synthetic */ int f1689e;

    /* renamed from: f */
    public final /* synthetic */ C0604t f1690f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0593l(C0604t c0604t, int r2) {
        super(1);
        this.f1689e = r2;
        this.f1690f = c0604t;
    }

    @Override // p131u1.InterfaceC2810l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1689e) {
            case 0:
                C0583b backEvent = (C0583b) obj;
                AbstractC2492i.m4915e(backEvent, "backEvent");
                C0604t c0604t = this.f1690f;
                C2657g c2657g = c0604t.f1709b;
                ListIterator listIterator = c2657g.listIterator(c2657g.mo5095a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((C0674x) obj2).f2357a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                c0604t.f1710c = (C0674x) obj2;
                break;
            default:
                C0583b backEvent2 = (C0583b) obj;
                AbstractC2492i.m4915e(backEvent2, "backEvent");
                C2657g c2657g2 = this.f1690f.f1709b;
                ListIterator listIterator2 = c2657g2.listIterator(c2657g2.mo5095a());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj3 = listIterator2.previous();
                        if (((C0674x) obj3).f2357a) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                break;
        }
        return C2636g.f8557a;
    }
}
