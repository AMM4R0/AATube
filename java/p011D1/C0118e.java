package p011D1;

import p008C1.AbstractC0066A;
import p008C1.C0087s;
import p051R1.C0477g;
import p051R1.C0494x;
import p051R1.InterfaceC0479i;

/* renamed from: D1.e */
/* loaded from: classes.dex */
public final class C0118e extends AbstractC0066A {

    /* renamed from: a */
    public final /* synthetic */ int f358a;

    /* renamed from: b */
    public final long f359b;

    /* renamed from: c */
    public final Object f360c;

    /* renamed from: d */
    public final InterfaceC0479i f361d;

    public /* synthetic */ C0118e(Object obj, long j2, InterfaceC0479i interfaceC0479i, int r5) {
        this.f358a = r5;
        this.f360c = obj;
        this.f359b = j2;
        this.f361d = interfaceC0479i;
    }

    @Override // p008C1.AbstractC0066A
    /* renamed from: b */
    public final long mo248b() {
        switch (this.f358a) {
        }
        return this.f359b;
    }

    @Override // p008C1.AbstractC0066A
    /* renamed from: g */
    public final C0087s mo249g() {
        switch (this.f358a) {
            case 0:
                return (C0087s) this.f360c;
            default:
                String str = (String) this.f360c;
                if (str == null) {
                    return null;
                }
                try {
                    return AbstractC0116c.m394a(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }

    @Override // p008C1.AbstractC0066A
    /* renamed from: h */
    public final InterfaceC0479i mo250h() {
        switch (this.f358a) {
            case 0:
                return (C0477g) this.f361d;
            default:
                return (C0494x) this.f361d;
        }
    }
}
