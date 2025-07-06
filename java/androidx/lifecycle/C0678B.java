package androidx.lifecycle;

import android.os.Handler;
import kotlin.jvm.internal.AbstractC2492i;
import p006C.C0055g;
import p050R0.RunnableC0458b;

/* renamed from: androidx.lifecycle.B */
/* loaded from: classes.dex */
public final class C0678B implements InterfaceC0708r {

    /* renamed from: i */
    public static final C0678B f2364i = new C0678B();

    /* renamed from: a */
    public int f2365a;

    /* renamed from: b */
    public int f2366b;

    /* renamed from: e */
    public Handler f2369e;

    /* renamed from: c */
    public boolean f2367c = true;

    /* renamed from: d */
    public boolean f2368d = true;

    /* renamed from: f */
    public final C0710t f2370f = new C0710t(this);

    /* renamed from: g */
    public final RunnableC0458b f2371g = new RunnableC0458b(6, this);

    /* renamed from: h */
    public final C0055g f2372h = new C0055g(21, this);

    /* renamed from: a */
    public final void m1778a() {
        int r02 = this.f2366b + 1;
        this.f2366b = r02;
        if (r02 == 1) {
            if (this.f2367c) {
                this.f2370f.m1794d(EnumC0702l.ON_RESUME);
                this.f2367c = false;
            } else {
                Handler handler = this.f2369e;
                AbstractC2492i.m4912b(handler);
                handler.removeCallbacks(this.f2371g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0708r
    /* renamed from: e */
    public final C0710t mo1475e() {
        return this.f2370f;
    }
}
