package p049R;

import android.database.DataSetObserver;
import p104l.C2520J0;
import p104l.ViewOnClickListenerC2572g1;

/* renamed from: R.b */
/* loaded from: classes.dex */
public final class C0454b extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ int f1166a;

    /* renamed from: b */
    public final /* synthetic */ Object f1167b;

    public /* synthetic */ C0454b(int r12, Object obj) {
        this.f1166a = r12;
        this.f1167b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f1166a) {
            case 0:
                ViewOnClickListenerC2572g1 viewOnClickListenerC2572g1 = (ViewOnClickListenerC2572g1) this.f1167b;
                viewOnClickListenerC2572g1.f1168a = true;
                viewOnClickListenerC2572g1.notifyDataSetChanged();
                break;
            default:
                C2520J0 c2520j0 = (C2520J0) this.f1167b;
                if (c2520j0.f8254z.isShowing()) {
                    c2520j0.mo4799f();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f1166a) {
            case 0:
                ViewOnClickListenerC2572g1 viewOnClickListenerC2572g1 = (ViewOnClickListenerC2572g1) this.f1167b;
                viewOnClickListenerC2572g1.f1168a = false;
                viewOnClickListenerC2572g1.notifyDataSetInvalidated();
                break;
            default:
                ((C2520J0) this.f1167b).dismiss();
                break;
        }
    }
}
