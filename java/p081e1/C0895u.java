package p081e1;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: e1.u */
/* loaded from: classes.dex */
public final class C0895u {

    /* renamed from: a */
    public float f3737a;

    /* renamed from: b */
    public float f3738b;

    /* renamed from: c */
    public float f3739c;

    /* renamed from: d */
    public float f3740d;

    /* renamed from: e */
    public float f3741e;

    /* renamed from: f */
    public final ArrayList f3742f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f3743g = new ArrayList();

    public C0895u() {
        m2426d(0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public final void m2423a(float f) {
        float f2 = this.f3740d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f3738b;
        float f5 = this.f3739c;
        C0891q c0891q = new C0891q(f4, f5, f4, f5);
        c0891q.f3730f = this.f3740d;
        c0891q.f3731g = f3;
        this.f3743g.add(new C0889o(c0891q));
        this.f3740d = f;
    }

    /* renamed from: b */
    public final void m2424b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f3742f;
        int size = arrayList.size();
        for (int r2 = 0; r2 < size; r2++) {
            ((AbstractC0893s) arrayList.get(r2)).mo2422a(matrix, path);
        }
    }

    /* renamed from: c */
    public final void m2425c(float f, float f2) {
        C0892r c0892r = new C0892r();
        c0892r.f3732b = f;
        c0892r.f3733c = f2;
        this.f3742f.add(c0892r);
        C0890p c0890p = new C0890p(c0892r, this.f3738b, this.f3739c);
        float m2421b = c0890p.m2421b() + 270.0f;
        float m2421b2 = c0890p.m2421b() + 270.0f;
        m2423a(m2421b);
        this.f3743g.add(c0890p);
        this.f3740d = m2421b2;
        this.f3738b = f;
        this.f3739c = f2;
    }

    /* renamed from: d */
    public final void m2426d(float f, float f2, float f3) {
        this.f3737a = f;
        this.f3738b = 0.0f;
        this.f3739c = f;
        this.f3740d = f2;
        this.f3741e = (f2 + f3) % 360.0f;
        this.f3742f.clear();
        this.f3743g.clear();
    }
}
