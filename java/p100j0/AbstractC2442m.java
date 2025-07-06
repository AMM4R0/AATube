package p100j0;

import p001A0.AbstractC0005b;
import p006C.C0054f;

/* renamed from: j0.m */
/* loaded from: classes.dex */
public abstract class AbstractC2442m extends AbstractC2441l {

    /* renamed from: a */
    public C0054f[] f7933a;

    /* renamed from: b */
    public String f7934b;

    /* renamed from: c */
    public int f7935c;

    public AbstractC2442m() {
        this.f7933a = null;
        this.f7935c = 0;
    }

    public C0054f[] getPathData() {
        return this.f7933a;
    }

    public String getPathName() {
        return this.f7934b;
    }

    public void setPathData(C0054f[] c0054fArr) {
        if (!AbstractC0005b.m64g(this.f7933a, c0054fArr)) {
            this.f7933a = AbstractC0005b.m74t(c0054fArr);
            return;
        }
        C0054f[] c0054fArr2 = this.f7933a;
        for (int r2 = 0; r2 < c0054fArr.length; r2++) {
            c0054fArr2[r2].f103a = c0054fArr[r2].f103a;
            int r3 = 0;
            while (true) {
                float[] fArr = c0054fArr[r2].f104b;
                if (r3 < fArr.length) {
                    c0054fArr2[r2].f104b[r3] = fArr[r3];
                    r3++;
                }
            }
        }
    }

    public AbstractC2442m(AbstractC2442m abstractC2442m) {
        this.f7933a = null;
        this.f7935c = 0;
        this.f7934b = abstractC2442m.f7934b;
        this.f7933a = AbstractC0005b.m74t(abstractC2442m.f7933a);
    }
}
