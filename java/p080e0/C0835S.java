package p080e0;

/* renamed from: e0.S */
/* loaded from: classes.dex */
public final class C0835S {

    /* renamed from: a */
    public int f3402a;

    /* renamed from: b */
    public int f3403b;

    /* renamed from: c */
    public int f3404c;

    /* renamed from: d */
    public int f3405d;

    /* renamed from: e */
    public int f3406e;

    /* renamed from: f */
    public boolean f3407f;

    /* renamed from: g */
    public boolean f3408g;

    /* renamed from: h */
    public boolean f3409h;

    /* renamed from: i */
    public boolean f3410i;

    /* renamed from: j */
    public boolean f3411j;

    /* renamed from: k */
    public boolean f3412k;

    /* renamed from: l */
    public int f3413l;

    /* renamed from: m */
    public long f3414m;

    /* renamed from: n */
    public int f3415n;

    /* renamed from: a */
    public final void m2320a(int r4) {
        if ((this.f3405d & r4) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(r4) + " but it is " + Integer.toBinaryString(this.f3405d));
    }

    /* renamed from: b */
    public final int m2321b() {
        return this.f3408g ? this.f3403b - this.f3404c : this.f3406e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f3402a + ", mData=null, mItemCount=" + this.f3406e + ", mIsMeasuring=" + this.f3410i + ", mPreviousLayoutItemCount=" + this.f3403b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3404c + ", mStructureChanged=" + this.f3407f + ", mInPreLayout=" + this.f3408g + ", mRunSimpleAnimations=" + this.f3411j + ", mRunPredictiveAnimations=" + this.f3412k + '}';
    }
}
