package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public final class C0583b {

    /* renamed from: a */
    public final float f1656a;

    /* renamed from: b */
    public final float f1657b;

    /* renamed from: c */
    public final float f1658c;

    /* renamed from: d */
    public final int f1659d;

    public C0583b(BackEvent backEvent) {
        AbstractC2492i.m4915e(backEvent, "backEvent");
        C0582a c0582a = C0582a.f1655a;
        float m1464d = c0582a.m1464d(backEvent);
        float m1465e = c0582a.m1465e(backEvent);
        float m1462b = c0582a.m1462b(backEvent);
        int m1463c = c0582a.m1463c(backEvent);
        this.f1656a = m1464d;
        this.f1657b = m1465e;
        this.f1658c = m1462b;
        this.f1659d = m1463c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1656a + ", touchY=" + this.f1657b + ", progress=" + this.f1658c + ", swipeEdge=" + this.f1659d + '}';
    }
}
