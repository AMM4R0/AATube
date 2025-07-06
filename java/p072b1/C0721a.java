package p072b1;

import android.graphics.Typeface;
import android.support.v4.media.session.AbstractC0580g;
import p006C.C0055g;
import p065Y0.C0547b;

/* renamed from: b1.a */
/* loaded from: classes.dex */
public final class C0721a extends AbstractC0580g {

    /* renamed from: e */
    public final Typeface f2590e;

    /* renamed from: f */
    public final C0055g f2591f;

    /* renamed from: g */
    public boolean f2592g;

    public C0721a(C0055g c0055g, Typeface typeface) {
        this.f2590e = typeface;
        this.f2591f = c0055g;
    }

    @Override // android.support.v4.media.session.AbstractC0580g
    /* renamed from: r */
    public final void mo1350r(int r2) {
        if (this.f2592g) {
            return;
        }
        C0547b c0547b = (C0547b) this.f2591f.f107b;
        if (c0547b.m1400j(this.f2590e)) {
            c0547b.m1398h(false);
        }
    }

    @Override // android.support.v4.media.session.AbstractC0580g
    /* renamed from: s */
    public final void mo1351s(Typeface typeface, boolean z2) {
        if (this.f2592g) {
            return;
        }
        C0547b c0547b = (C0547b) this.f2591f.f107b;
        if (c0547b.m1400j(typeface)) {
            c0547b.m1398h(false);
        }
    }
}
