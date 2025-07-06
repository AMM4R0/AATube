package p104l;

import androidx.appcompat.widget.Toolbar;
import p102k.C2468o;

/* renamed from: l.l1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2587l1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8422a;

    /* renamed from: b */
    public final /* synthetic */ Toolbar f8423b;

    public /* synthetic */ RunnableC2587l1(Toolbar toolbar, int r2) {
        this.f8422a = r2;
        this.f8423b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8422a) {
            case 0:
                C2596o1 c2596o1 = this.f8423b.f1928L;
                C2468o c2468o = c2596o1 == null ? null : c2596o1.f8436b;
                if (c2468o != null) {
                    c2468o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f8423b.m1550o();
                break;
        }
    }
}
