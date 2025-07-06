package p002A1;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2492i;
import kotlin.jvm.internal.AbstractC2493j;
import p105l1.C2632c;
import p131u1.InterfaceC2814p;
import p140x1.C2893e;

/* renamed from: A1.s */
/* loaded from: classes.dex */
public final class C0026s extends AbstractC2493j implements InterfaceC2814p {

    /* renamed from: e */
    public final /* synthetic */ int f29e;

    /* renamed from: f */
    public final /* synthetic */ boolean f30f;

    /* renamed from: g */
    public final /* synthetic */ Object f31g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0026s(Object obj, boolean z2, int r3) {
        super(2);
        this.f29e = r3;
        this.f31g = obj;
        this.f30f = z2;
    }

    @Override // p131u1.InterfaceC2814p
    public final Object invoke(Object obj, Object obj2) {
        int r14;
        int r15;
        boolean z2;
        Object obj3;
        C2632c c2632c;
        Object obj4;
        switch (this.f29e) {
            case 0:
                CharSequence $receiver = (CharSequence) obj;
                int intValue = ((Number) obj2).intValue();
                AbstractC2492i.m4915e($receiver, "$this$$receiver");
                int m138P = AbstractC0017j.m138P($receiver, (char[]) this.f31g, intValue, this.f30f);
                if (m138P < 0) {
                    return null;
                }
                return new C2632c(Integer.valueOf(m138P), 1);
            default:
                CharSequence $receiver2 = (CharSequence) obj;
                int intValue2 = ((Number) obj2).intValue();
                AbstractC2492i.m4915e($receiver2, "$this$$receiver");
                List list = (List) this.f31g;
                boolean z3 = this.f30f;
                if (z3 || list.size() != 1) {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    C2893e c2893e = new C2893e(intValue2, $receiver2.length(), 1);
                    boolean z4 = $receiver2 instanceof String;
                    int r6 = c2893e.f9521c;
                    int r5 = c2893e.f9520b;
                    if (z4) {
                        if ((r6 > 0 && intValue2 <= r5) || (r6 < 0 && r5 <= intValue2)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str = (String) obj4;
                                        if (AbstractC0025r.m153F(0, intValue2, str.length(), str, (String) $receiver2, z3)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str2 = (String) obj4;
                                if (str2 != null) {
                                    c2632c = new C2632c(Integer.valueOf(intValue2), str2);
                                } else if (intValue2 != r5) {
                                    intValue2 += r6;
                                }
                            }
                        }
                        c2632c = null;
                    } else {
                        if ((r6 > 0 && intValue2 <= r5) || (r6 < 0 && r5 <= intValue2)) {
                            int r10 = intValue2;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str3 = (String) obj3;
                                        r14 = r5;
                                        r15 = r6;
                                        z2 = z3;
                                        if (!AbstractC0017j.m141S(str3, 0, $receiver2, r10, str3.length(), z3)) {
                                            z3 = z2;
                                            r5 = r14;
                                            r6 = r15;
                                        }
                                    } else {
                                        r14 = r5;
                                        r15 = r6;
                                        z2 = z3;
                                        obj3 = null;
                                    }
                                }
                                String str4 = (String) obj3;
                                if (str4 != null) {
                                    c2632c = new C2632c(Integer.valueOf(r10), str4);
                                } else if (r10 != r14) {
                                    r10 += r15;
                                    z3 = z2;
                                    r5 = r14;
                                    r6 = r15;
                                }
                            }
                        }
                        c2632c = null;
                    }
                } else {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str5 = (String) list.get(0);
                    int m137O = AbstractC0017j.m137O($receiver2, str5, intValue2, false, 4);
                    if (m137O >= 0) {
                        c2632c = new C2632c(Integer.valueOf(m137O), str5);
                    }
                    c2632c = null;
                }
                if (c2632c == null) {
                    return null;
                }
                return new C2632c(c2632c.f8550a, Integer.valueOf(((String) c2632c.f8551b).length()));
        }
    }
}
