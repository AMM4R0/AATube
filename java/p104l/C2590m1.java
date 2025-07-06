package p104l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.AbstractC0002c;
import p102k.InterfaceC2464k;
import p102k.MenuC2466m;

/* renamed from: l.m1 */
/* loaded from: classes.dex */
public final class C2590m1 implements InterfaceC2591n, InterfaceC2464k {

    /* renamed from: a */
    public final /* synthetic */ Toolbar f8430a;

    public /* synthetic */ C2590m1(Toolbar toolbar) {
        this.f8430a = toolbar;
    }

    @Override // p102k.InterfaceC2464k
    /* renamed from: d */
    public boolean mo2173d(MenuC2466m menuC2466m, MenuItem menuItem) {
        this.f8430a.getClass();
        return false;
    }

    @Override // p102k.InterfaceC2464k
    /* renamed from: g */
    public void mo2176g(MenuC2466m menuC2466m) {
        Toolbar toolbar = this.f8430a;
        C2582k c2582k = toolbar.f1934a.f1808t;
        if (c2582k == null || !c2582k.m5038j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1923G.f339c).iterator();
            if (it.hasNext()) {
                throw AbstractC0002c.m10e(it);
            }
        }
    }
}
