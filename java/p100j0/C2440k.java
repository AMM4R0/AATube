package p100j0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import p112o.C2682b;

/* renamed from: j0.k */
/* loaded from: classes.dex */
public final class C2440k extends AbstractC2441l {

    /* renamed from: a */
    public final Matrix f7922a;

    /* renamed from: b */
    public final ArrayList f7923b;

    /* renamed from: c */
    public float f7924c;

    /* renamed from: d */
    public float f7925d;

    /* renamed from: e */
    public float f7926e;

    /* renamed from: f */
    public float f7927f;

    /* renamed from: g */
    public float f7928g;

    /* renamed from: h */
    public float f7929h;

    /* renamed from: i */
    public float f7930i;

    /* renamed from: j */
    public final Matrix f7931j;

    /* renamed from: k */
    public String f7932k;

    public C2440k() {
        this.f7922a = new Matrix();
        this.f7923b = new ArrayList();
        this.f7924c = 0.0f;
        this.f7925d = 0.0f;
        this.f7926e = 0.0f;
        this.f7927f = 1.0f;
        this.f7928g = 1.0f;
        this.f7929h = 0.0f;
        this.f7930i = 0.0f;
        this.f7931j = new Matrix();
        this.f7932k = null;
    }

    @Override // p100j0.AbstractC2441l
    /* renamed from: a */
    public final boolean mo4792a() {
        int r12 = 0;
        while (true) {
            ArrayList arrayList = this.f7923b;
            if (r12 >= arrayList.size()) {
                return false;
            }
            if (((AbstractC2441l) arrayList.get(r12)).mo4792a()) {
                return true;
            }
            r12++;
        }
    }

    @Override // p100j0.AbstractC2441l
    /* renamed from: b */
    public final boolean mo4793b(int[] r5) {
        int r02 = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f7923b;
            if (r02 >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC2441l) arrayList.get(r02)).mo4793b(r5);
            r02++;
        }
    }

    /* renamed from: c */
    public final void m4794c() {
        Matrix matrix = this.f7931j;
        matrix.reset();
        matrix.postTranslate(-this.f7925d, -this.f7926e);
        matrix.postScale(this.f7927f, this.f7928g);
        matrix.postRotate(this.f7924c, 0.0f, 0.0f);
        matrix.postTranslate(this.f7929h + this.f7925d, this.f7930i + this.f7926e);
    }

    public String getGroupName() {
        return this.f7932k;
    }

    public Matrix getLocalMatrix() {
        return this.f7931j;
    }

    public float getPivotX() {
        return this.f7925d;
    }

    public float getPivotY() {
        return this.f7926e;
    }

    public float getRotation() {
        return this.f7924c;
    }

    public float getScaleX() {
        return this.f7927f;
    }

    public float getScaleY() {
        return this.f7928g;
    }

    public float getTranslateX() {
        return this.f7929h;
    }

    public float getTranslateY() {
        return this.f7930i;
    }

    public void setPivotX(float f) {
        if (f != this.f7925d) {
            this.f7925d = f;
            m4794c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f7926e) {
            this.f7926e = f;
            m4794c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f7924c) {
            this.f7924c = f;
            m4794c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f7927f) {
            this.f7927f = f;
            m4794c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f7928g) {
            this.f7928g = f;
            m4794c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f7929h) {
            this.f7929h = f;
            m4794c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f7930i) {
            this.f7930i = f;
            m4794c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2440k(C2440k c2440k, C2682b c2682b) {
        C2438i c2438i;
        this.f7922a = new Matrix();
        this.f7923b = new ArrayList();
        this.f7924c = 0.0f;
        this.f7925d = 0.0f;
        this.f7926e = 0.0f;
        this.f7927f = 1.0f;
        this.f7928g = 1.0f;
        this.f7929h = 0.0f;
        this.f7930i = 0.0f;
        Matrix matrix = new Matrix();
        this.f7931j = matrix;
        this.f7932k = null;
        this.f7924c = c2440k.f7924c;
        this.f7925d = c2440k.f7925d;
        this.f7926e = c2440k.f7926e;
        this.f7927f = c2440k.f7927f;
        this.f7928g = c2440k.f7928g;
        this.f7929h = c2440k.f7929h;
        this.f7930i = c2440k.f7930i;
        String str = c2440k.f7932k;
        this.f7932k = str;
        if (str != null) {
            c2682b.put(str, this);
        }
        matrix.set(c2440k.f7931j);
        ArrayList arrayList = c2440k.f7923b;
        for (int r2 = 0; r2 < arrayList.size(); r2++) {
            Object obj = arrayList.get(r2);
            if (obj instanceof C2440k) {
                this.f7923b.add(new C2440k((C2440k) obj, c2682b));
            } else {
                if (obj instanceof C2439j) {
                    C2439j c2439j = (C2439j) obj;
                    C2439j c2439j2 = new C2439j(c2439j);
                    c2439j2.f7912e = 0.0f;
                    c2439j2.f7914g = 1.0f;
                    c2439j2.f7915h = 1.0f;
                    c2439j2.f7916i = 0.0f;
                    c2439j2.f7917j = 1.0f;
                    c2439j2.f7918k = 0.0f;
                    c2439j2.f7919l = Paint.Cap.BUTT;
                    c2439j2.f7920m = Paint.Join.MITER;
                    c2439j2.f7921n = 4.0f;
                    c2439j2.f7911d = c2439j.f7911d;
                    c2439j2.f7912e = c2439j.f7912e;
                    c2439j2.f7914g = c2439j.f7914g;
                    c2439j2.f7913f = c2439j.f7913f;
                    c2439j2.f7935c = c2439j.f7935c;
                    c2439j2.f7915h = c2439j.f7915h;
                    c2439j2.f7916i = c2439j.f7916i;
                    c2439j2.f7917j = c2439j.f7917j;
                    c2439j2.f7918k = c2439j.f7918k;
                    c2439j2.f7919l = c2439j.f7919l;
                    c2439j2.f7920m = c2439j.f7920m;
                    c2439j2.f7921n = c2439j.f7921n;
                    c2438i = c2439j2;
                } else if (obj instanceof C2438i) {
                    c2438i = new C2438i((C2438i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f7923b.add(c2438i);
                Object obj2 = c2438i.f7934b;
                if (obj2 != null) {
                    c2682b.put(obj2, c2438i);
                }
            }
        }
    }
}
