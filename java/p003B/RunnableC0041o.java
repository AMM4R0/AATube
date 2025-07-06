package p003B;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: B.o */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0041o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f69a;

    /* renamed from: b */
    public final /* synthetic */ int f70b;

    /* renamed from: c */
    public final /* synthetic */ Object f71c;

    public /* synthetic */ RunnableC0041o(int r12, int r2, Object obj) {
        this.f69a = r2;
        this.f71c = obj;
        this.f70b = r12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f69a) {
            case 0:
                ((AbstractC0028b) this.f71c).mo174j(this.f70b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f71c;
                View view = (View) sideSheetBehavior.f2979p.get();
                if (view != null) {
                    sideSheetBehavior.m2128t(view, this.f70b, false);
                    break;
                }
                break;
        }
    }
}
