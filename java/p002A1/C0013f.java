package p002A1;

import kotlin.jvm.internal.AbstractC2492i;
import kotlin.jvm.internal.AbstractC2493j;
import p108m1.AbstractC2651a;
import p131u1.InterfaceC2810l;
import p140x1.C2893e;

/* renamed from: A1.f */
/* loaded from: classes.dex */
public final class C0013f extends AbstractC2493j implements InterfaceC2810l {

    /* renamed from: e */
    public final /* synthetic */ int f20e;

    /* renamed from: f */
    public final /* synthetic */ Object f21f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0013f(int r12, Object obj) {
        super(1);
        this.f20e = r12;
        this.f21f = obj;
    }

    @Override // p131u1.InterfaceC2810l
    public final Object invoke(Object obj) {
        switch (this.f20e) {
            case 0:
                return ((C0014g) this.f21f).m99b(((Number) obj).intValue());
            case 1:
                C2893e it = (C2893e) obj;
                AbstractC2492i.m4915e(it, "it");
                String str = (String) this.f21f;
                AbstractC2492i.m4915e(str, "<this>");
                return str.subSequence(it.f9519a, it.f9520b + 1).toString();
            default:
                return obj == ((AbstractC2651a) this.f21f) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
