package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.activity.InterfaceC0605u;
import androidx.activity.result.InterfaceC0602c;
import androidx.lifecycle.C0688L;
import androidx.lifecycle.C0710t;
import androidx.lifecycle.InterfaceC0689M;
import com.carwizard.p075li.youtube.MainActivity;
import p001A0.AbstractC0005b;
import p079e.AbstractActivityC0798g;

/* renamed from: androidx.fragment.app.s */
/* loaded from: classes.dex */
public final class C0669s extends AbstractC0005b implements InterfaceC0689M, InterfaceC0605u, InterfaceC0602c, InterfaceC0641H {

    /* renamed from: d */
    public final AbstractActivityC0798g f2342d;

    /* renamed from: e */
    public final AbstractActivityC0798g f2343e;

    /* renamed from: f */
    public final Handler f2344f;

    /* renamed from: g */
    public final C0638E f2345g;

    /* renamed from: h */
    public final /* synthetic */ MainActivity f2346h;

    public C0669s(MainActivity mainActivity) {
        this.f2346h = mainActivity;
        Handler handler = new Handler();
        this.f2345g = new C0638E();
        this.f2342d = mainActivity;
        this.f2343e = mainActivity;
        this.f2344f = handler;
    }

    @Override // androidx.lifecycle.InterfaceC0689M
    /* renamed from: d */
    public final C0688L mo1474d() {
        return this.f2346h.mo1474d();
    }

    @Override // androidx.lifecycle.InterfaceC0708r
    /* renamed from: e */
    public final C0710t mo1475e() {
        return this.f2346h.f3244q;
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: y */
    public final View mo93y(int r2) {
        return this.f2346h.findViewById(r2);
    }

    @Override // p001A0.AbstractC0005b
    /* renamed from: z */
    public final boolean mo94z() {
        Window window = this.f2346h.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.fragment.app.InterfaceC0641H
    /* renamed from: a */
    public final void mo1703a() {
    }
}
