package p028K;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p006C.C0051c;

/* renamed from: K.v0 */
/* loaded from: classes.dex */
public class C0336v0 {

    /* renamed from: b */
    public static final C0340x0 f935b;

    /* renamed from: a */
    public final C0340x0 f936a;

    static {
        int r02 = Build.VERSION.SDK_INT;
        f935b = (r02 >= 30 ? new C0322o0() : r02 >= 29 ? new C0320n0() : new C0316l0()).mo892b().f944a.mo964a().f944a.mo958b().f944a.mo959c();
    }

    public C0336v0(C0340x0 c0340x0) {
        this.f936a = c0340x0;
    }

    /* renamed from: a */
    public C0340x0 mo964a() {
        return this.f936a;
    }

    /* renamed from: b */
    public C0340x0 mo958b() {
        return this.f936a;
    }

    /* renamed from: c */
    public C0340x0 mo959c() {
        return this.f936a;
    }

    /* renamed from: e */
    public C0311j mo965e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0336v0)) {
            return false;
        }
        C0336v0 c0336v0 = (C0336v0) obj;
        return mo953n() == c0336v0.mo953n() && mo961m() == c0336v0.mo961m() && Objects.equals(mo951j(), c0336v0.mo951j()) && Objects.equals(mo960h(), c0336v0.mo960h()) && Objects.equals(mo965e(), c0336v0.mo965e());
    }

    /* renamed from: f */
    public C0051c mo950f(int r12) {
        return C0051c.f97e;
    }

    /* renamed from: g */
    public C0051c mo967g() {
        return mo951j();
    }

    /* renamed from: h */
    public C0051c mo960h() {
        return C0051c.f97e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo953n()), Boolean.valueOf(mo961m()), mo951j(), mo960h(), mo965e());
    }

    /* renamed from: i */
    public C0051c mo968i() {
        return mo951j();
    }

    /* renamed from: j */
    public C0051c mo951j() {
        return C0051c.f97e;
    }

    /* renamed from: k */
    public C0051c mo969k() {
        return mo951j();
    }

    /* renamed from: l */
    public C0340x0 mo952l(int r12, int r2, int r3, int r4) {
        return f935b;
    }

    /* renamed from: m */
    public boolean mo961m() {
        return false;
    }

    /* renamed from: n */
    public boolean mo953n() {
        return false;
    }

    /* renamed from: d */
    public void mo949d(View view) {
    }

    /* renamed from: o */
    public void mo954o(C0051c[] c0051cArr) {
    }

    /* renamed from: p */
    public void mo955p(C0340x0 c0340x0) {
    }

    /* renamed from: q */
    public void mo962q(C0051c c0051c) {
    }
}
