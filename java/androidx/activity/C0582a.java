package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: androidx.activity.a */
/* loaded from: classes.dex */
public final class C0582a {

    /* renamed from: a */
    public static final C0582a f1655a = new C0582a();

    /* renamed from: a */
    public final BackEvent m1461a(float f, float f2, float f3, int r5) {
        return new BackEvent(f, f2, f3, r5);
    }

    /* renamed from: b */
    public final float m1462b(BackEvent backEvent) {
        AbstractC2492i.m4915e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* renamed from: c */
    public final int m1463c(BackEvent backEvent) {
        AbstractC2492i.m4915e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* renamed from: d */
    public final float m1464d(BackEvent backEvent) {
        AbstractC2492i.m4915e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* renamed from: e */
    public final float m1465e(BackEvent backEvent) {
        AbstractC2492i.m4915e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
