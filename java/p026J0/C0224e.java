package p026J0;

import p133v0.AbstractC2863r;

/* renamed from: J0.e */
/* loaded from: classes.dex */
public final class C0224e {

    /* renamed from: a */
    public final C0232m f652a = new C0232m();

    /* renamed from: a */
    public final void m611a(Exception exc) {
        C0232m c0232m = this.f652a;
        c0232m.getClass();
        AbstractC2863r.m5475d(exc, "Exception must not be null");
        synchronized (c0232m.f669a) {
            try {
                if (c0232m.f671c) {
                    return;
                }
                c0232m.f671c = true;
                c0232m.f674f = exc;
                c0232m.f670b.m620e(c0232m);
            } finally {
            }
        }
    }
}
