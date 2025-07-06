package p081e1;

import p036M1.AbstractC0379e;

/* renamed from: e1.i */
/* loaded from: classes.dex */
public final class C0883i extends AbstractC0379e {
    @Override // p036M1.AbstractC0379e
    /* renamed from: q */
    public final void mo1091q(C0895u c0895u, float f, float f2) {
        c0895u.m2426d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        C0891q c0891q = new C0891q(0.0f, 0.0f, f3, f3);
        c0891q.f3730f = 180.0f;
        c0891q.f3731g = 90.0f;
        c0895u.f3742f.add(c0891q);
        C0889o c0889o = new C0889o(c0891q);
        c0895u.m2423a(180.0f);
        c0895u.f3743g.add(c0889o);
        c0895u.f3740d = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d2 = 270.0f;
        c0895u.f3738b = (((float) Math.cos(Math.toRadians(d2))) * f5) + f4;
        c0895u.f3739c = (f5 * ((float) Math.sin(Math.toRadians(d2)))) + f4;
    }
}
