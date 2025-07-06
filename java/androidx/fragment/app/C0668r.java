package androidx.fragment.app;

import android.os.Bundle;
import com.carwizard.p075li.youtube.MainActivity;
import p006C.C0055g;
import p070b.InterfaceC0718b;
import p079e.AbstractC0802k;
import p082f0.C0900d;

/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
public final class C0668r implements InterfaceC0718b {

    /* renamed from: a */
    public final /* synthetic */ int f2340a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f2341b;

    public /* synthetic */ C0668r(MainActivity mainActivity, int r2) {
        this.f2340a = r2;
        this.f2341b = mainActivity;
    }

    @Override // p070b.InterfaceC0718b
    /* renamed from: a */
    public final void mo1467a() {
        switch (this.f2340a) {
            case 0:
                MainActivity mainActivity = this.f2341b;
                C0055g c0055g = mainActivity.f3243p;
                C0669s c0669s = (C0669s) c0055g.f107b;
                c0669s.f2345g.m1676b(c0669s, c0669s, null);
                Bundle m2429c = ((C0900d) mainActivity.f1678e.f665c).m2429c("android:support:fragments");
                if (m2429c != null) {
                    ((C0669s) c0055g.f107b).f2345g.m1666M(m2429c.getParcelable("android:support:fragments"));
                    break;
                }
                break;
            default:
                MainActivity mainActivity2 = this.f2341b;
                AbstractC0802k m2203i = mainActivity2.m2203i();
                m2203i.mo2217a();
                ((C0900d) mainActivity2.f1678e.f665c).m2429c("androidx:appcompat");
                m2203i.mo2219e();
                break;
        }
    }
}
