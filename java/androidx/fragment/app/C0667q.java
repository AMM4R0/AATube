package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC0702l;
import com.carwizard.p075li.youtube.MainActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC2492i;
import p006C.C0055g;
import p079e.AbstractActivityC0798g;
import p082f0.C0900d;
import p082f0.InterfaceC0899c;

/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public final class C0667q implements InterfaceC0899c {

    /* renamed from: a */
    public final /* synthetic */ int f2338a;

    /* renamed from: b */
    public final Object f2339b;

    public /* synthetic */ C0667q(MainActivity mainActivity, int r2) {
        this.f2338a = r2;
        this.f2339b = mainActivity;
    }

    @Override // p082f0.InterfaceC0899c
    /* renamed from: a */
    public final Bundle mo1466a() {
        C0055g c0055g;
        switch (this.f2338a) {
            case 0:
                Bundle bundle = new Bundle();
                MainActivity mainActivity = (MainActivity) this.f2339b;
                do {
                    c0055g = mainActivity.f3243p;
                } while (AbstractActivityC0798g.m2202k(((C0669s) c0055g.f107b).f2345g));
                mainActivity.f3244q.m1794d(EnumC0702l.ON_STOP);
                C0639F m1667N = ((C0669s) c0055g.f107b).f2345g.m1667N();
                if (m1667N != null) {
                    bundle.putParcelable("android:support:fragments", m1667N);
                }
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                ((MainActivity) this.f2339b).m2203i().getClass();
                return bundle2;
            default:
                Bundle bundle3 = new Bundle();
                bundle3.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2339b));
                return bundle3;
        }
    }

    public C0667q(C0900d registry) {
        this.f2338a = 2;
        AbstractC2492i.m4915e(registry, "registry");
        this.f2339b = new LinkedHashSet();
        registry.m2431e("androidx.savedstate.Restarter", this);
    }
}
