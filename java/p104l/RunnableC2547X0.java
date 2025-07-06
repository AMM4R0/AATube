package p104l;

import androidx.appcompat.widget.SearchView;
import p049R.AbstractC0455c;

/* renamed from: l.X0 */
/* loaded from: classes.dex */
public final class RunnableC2547X0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8308a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f8309b;

    public /* synthetic */ RunnableC2547X0(SearchView searchView, int r2) {
        this.f8308a = r2;
        this.f8309b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8308a) {
            case 0:
                this.f8309b.m1526u();
                break;
            default:
                AbstractC0455c abstractC0455c = this.f8309b.f1842O;
                if (abstractC0455c instanceof ViewOnClickListenerC2572g1) {
                    abstractC0455c.mo1209b(null);
                    break;
                }
                break;
        }
    }
}
