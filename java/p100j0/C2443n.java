package p100j0;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.KotlinVersion;
import p112o.C2682b;

/* renamed from: j0.n */
/* loaded from: classes.dex */
public final class C2443n {

    /* renamed from: p */
    public static final Matrix f7936p = new Matrix();

    /* renamed from: a */
    public final Path f7937a;

    /* renamed from: b */
    public final Path f7938b;

    /* renamed from: c */
    public final Matrix f7939c;

    /* renamed from: d */
    public Paint f7940d;

    /* renamed from: e */
    public Paint f7941e;

    /* renamed from: f */
    public PathMeasure f7942f;

    /* renamed from: g */
    public final C2440k f7943g;

    /* renamed from: h */
    public float f7944h;

    /* renamed from: i */
    public float f7945i;

    /* renamed from: j */
    public float f7946j;

    /* renamed from: k */
    public float f7947k;

    /* renamed from: l */
    public int f7948l;

    /* renamed from: m */
    public String f7949m;

    /* renamed from: n */
    public Boolean f7950n;

    /* renamed from: o */
    public final C2682b f7951o;

    public C2443n() {
        this.f7939c = new Matrix();
        this.f7944h = 0.0f;
        this.f7945i = 0.0f;
        this.f7946j = 0.0f;
        this.f7947k = 0.0f;
        this.f7948l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f7949m = null;
        this.f7950n = null;
        this.f7951o = new C2682b();
        this.f7943g = new C2440k();
        this.f7937a = new Path();
        this.f7938b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f7917j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4795a(p100j0.C2440k r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p100j0.C2443n.m4795a(j0.k, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f7948l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int r12) {
        this.f7948l = r12;
    }

    public C2443n(C2443n c2443n) {
        this.f7939c = new Matrix();
        this.f7944h = 0.0f;
        this.f7945i = 0.0f;
        this.f7946j = 0.0f;
        this.f7947k = 0.0f;
        this.f7948l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f7949m = null;
        this.f7950n = null;
        C2682b c2682b = new C2682b();
        this.f7951o = c2682b;
        this.f7943g = new C2440k(c2443n.f7943g, c2682b);
        this.f7937a = new Path(c2443n.f7937a);
        this.f7938b = new Path(c2443n.f7938b);
        this.f7944h = c2443n.f7944h;
        this.f7945i = c2443n.f7945i;
        this.f7946j = c2443n.f7946j;
        this.f7947k = c2443n.f7947k;
        this.f7948l = c2443n.f7948l;
        this.f7949m = c2443n.f7949m;
        String str = c2443n.f7949m;
        if (str != null) {
            c2682b.put(str, this);
        }
        this.f7950n = c2443n.f7950n;
    }
}
