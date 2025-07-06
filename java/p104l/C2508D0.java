package p104l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: l.D0 */
/* loaded from: classes.dex */
public final class C2508D0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public final /* synthetic */ int f8211a;

    /* renamed from: b */
    public final /* synthetic */ Object f8212b;

    public /* synthetic */ C2508D0(int r12, Object obj) {
        this.f8211a = r12;
        this.f8212b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int r3, long j2) {
        C2622x0 c2622x0;
        switch (this.f8211a) {
            case 0:
                if (r3 != -1 && (c2622x0 = ((C2520J0) this.f8212b).f8231c) != null) {
                    c2622x0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f8212b).m1522q(r3);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int r12 = this.f8211a;
    }

    /* renamed from: a */
    private final void m4931a(AdapterView adapterView) {
    }

    /* renamed from: b */
    private final void m4932b(AdapterView adapterView) {
    }
}
