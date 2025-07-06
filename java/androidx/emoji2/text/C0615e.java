package androidx.emoji2.text;

import java.util.ArrayList;
import p008C1.C0080l;
import p010D0.C0109g;
import p019H.RunnableC0171a;
import p036M1.AbstractC0387m;
import p081e1.C0879e;

/* renamed from: androidx.emoji2.text.e */
/* loaded from: classes.dex */
public final class C0615e extends AbstractC0387m {

    /* renamed from: e */
    public final /* synthetic */ C0616f f2062e;

    public C0615e(C0616f c0616f) {
        this.f2062e = c0616f;
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: H */
    public final void mo1129H(Throwable th) {
        this.f2062e.f2063a.m1632d(th);
    }

    @Override // p036M1.AbstractC0387m
    /* renamed from: I */
    public final void mo1130I(C0080l c0080l) {
        C0616f c0616f = this.f2062e;
        c0616f.f2065c = c0080l;
        c0616f.f2064b = new C0109g(c0616f.f2065c, new C0879e(), c0616f.f2063a.f2078h);
        C0620j c0620j = c0616f.f2063a;
        c0620j.getClass();
        ArrayList arrayList = new ArrayList();
        c0620j.f2071a.writeLock().lock();
        try {
            c0620j.f2073c = 1;
            arrayList.addAll(c0620j.f2072b);
            c0620j.f2072b.clear();
            c0620j.f2071a.writeLock().unlock();
            c0620j.f2074d.post(new RunnableC0171a(arrayList, c0620j.f2073c, (Throwable) null));
        } catch (Throwable th) {
            c0620j.f2071a.writeLock().unlock();
            throw th;
        }
    }
}
