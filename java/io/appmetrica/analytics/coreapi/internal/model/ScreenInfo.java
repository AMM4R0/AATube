package io.appmetrica.analytics.coreapi.internal.model;

/* loaded from: classes.dex */
public final class ScreenInfo {

    /* renamed from: a */
    private final int f4261a;

    /* renamed from: b */
    private final int f4262b;

    /* renamed from: c */
    private final int f4263c;

    /* renamed from: d */
    private final float f4264d;

    public ScreenInfo(int r12, int r2, int r3, float f) {
        this.f4261a = r12;
        this.f4262b = r2;
        this.f4263c = r3;
        this.f4264d = f;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int r12, int r2, int r3, float f, int r5, Object obj) {
        if ((r5 & 1) != 0) {
            r12 = screenInfo.f4261a;
        }
        if ((r5 & 2) != 0) {
            r2 = screenInfo.f4262b;
        }
        if ((r5 & 4) != 0) {
            r3 = screenInfo.f4263c;
        }
        if ((r5 & 8) != 0) {
            f = screenInfo.f4264d;
        }
        return screenInfo.copy(r12, r2, r3, f);
    }

    public final int component1() {
        return this.f4261a;
    }

    public final int component2() {
        return this.f4262b;
    }

    public final int component3() {
        return this.f4263c;
    }

    public final float component4() {
        return this.f4264d;
    }

    public final ScreenInfo copy(int r2, int r3, int r4, float f) {
        return new ScreenInfo(r2, r3, r4, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenInfo)) {
            return false;
        }
        ScreenInfo screenInfo = (ScreenInfo) obj;
        return this.f4261a == screenInfo.f4261a && this.f4262b == screenInfo.f4262b && this.f4263c == screenInfo.f4263c && Float.valueOf(this.f4264d).equals(Float.valueOf(screenInfo.f4264d));
    }

    public final int getDpi() {
        return this.f4263c;
    }

    public final int getHeight() {
        return this.f4262b;
    }

    public final float getScaleFactor() {
        return this.f4264d;
    }

    public final int getWidth() {
        return this.f4261a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f4264d) + (((((this.f4261a * 31) + this.f4262b) * 31) + this.f4263c) * 31);
    }

    public String toString() {
        return "ScreenInfo(width=" + this.f4261a + ", height=" + this.f4262b + ", dpi=" + this.f4263c + ", scaleFactor=" + this.f4264d + ')';
    }
}
