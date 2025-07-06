package androidx.fragment.app;

import java.util.ArrayList;
import p000A.AbstractC0002c;

/* renamed from: androidx.fragment.app.O */
/* loaded from: classes.dex */
public final class RunnableC0648O implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2204a;

    /* renamed from: b */
    public final /* synthetic */ C0649P f2205b;

    /* renamed from: c */
    public final /* synthetic */ C0658h f2206c;

    public /* synthetic */ RunnableC0648O(C0658h c0658h, C0649P c0649p, int r3) {
        this.f2204a = r3;
        this.f2206c = c0658h;
        this.f2205b = c0649p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2204a) {
            case 0:
                ArrayList arrayList = this.f2206c.f2261b;
                C0649P c0649p = this.f2205b;
                if (arrayList.contains(c0649p)) {
                    AbstractC0002c.m6a(c0649p.f2209c.f2300E, c0649p.f2207a);
                    break;
                }
                break;
            default:
                C0658h c0658h = this.f2206c;
                ArrayList arrayList2 = c0658h.f2261b;
                C0649P c0649p2 = this.f2205b;
                arrayList2.remove(c0649p2);
                c0658h.f2262c.remove(c0649p2);
                break;
        }
    }
}
