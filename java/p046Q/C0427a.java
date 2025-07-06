package p046Q;

/* renamed from: Q.a */
/* loaded from: classes.dex */
public final class C0427a {

    /* renamed from: a */
    public int f1100a;

    /* renamed from: b */
    public int f1101b;

    /* renamed from: c */
    public float f1102c;

    /* renamed from: d */
    public float f1103d;

    /* renamed from: e */
    public long f1104e;

    /* renamed from: f */
    public long f1105f;

    /* renamed from: g */
    public long f1106g;

    /* renamed from: h */
    public float f1107h;

    /* renamed from: i */
    public int f1108i;

    /* renamed from: a */
    public final float m1161a(long j2) {
        if (j2 < this.f1104e) {
            return 0.0f;
        }
        long j3 = this.f1106g;
        if (j3 < 0 || j2 < j3) {
            return ViewOnTouchListenerC0433g.m1175b((j2 - r0) / this.f1100a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f1107h;
        return (ViewOnTouchListenerC0433g.m1175b((j2 - j3) / this.f1108i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
