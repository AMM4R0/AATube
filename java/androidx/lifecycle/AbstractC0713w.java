package androidx.lifecycle;

import p006C.C0055g;

/* renamed from: androidx.lifecycle.w */
/* loaded from: classes.dex */
public abstract class AbstractC0713w {

    /* renamed from: a */
    public final C0055g f2424a;

    /* renamed from: b */
    public boolean f2425b;

    /* renamed from: c */
    public int f2426c = -1;

    /* renamed from: d */
    public final /* synthetic */ C0714x f2427d;

    public AbstractC0713w(C0714x c0714x, C0055g c0055g) {
        this.f2427d = c0714x;
        this.f2424a = c0055g;
    }

    /* renamed from: c */
    public final void m1801c(boolean z2) {
        if (z2 == this.f2425b) {
            return;
        }
        this.f2425b = z2;
        int r4 = z2 ? 1 : -1;
        C0714x c0714x = this.f2427d;
        int r2 = c0714x.f2431c;
        c0714x.f2431c = r4 + r2;
        if (!c0714x.f2432d) {
            c0714x.f2432d = true;
            while (true) {
                try {
                    int r02 = c0714x.f2431c;
                    if (r2 == r02) {
                        break;
                    } else {
                        r2 = r02;
                    }
                } finally {
                    c0714x.f2432d = false;
                }
            }
        }
        if (this.f2425b) {
            c0714x.m1804c(this);
        }
    }

    /* renamed from: d */
    public void mo1783d() {
    }

    /* renamed from: e */
    public abstract boolean mo1784e();
}
