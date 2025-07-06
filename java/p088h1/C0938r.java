package p088h1;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import p104l.C2520J0;
import p104l.C2529O;
import p104l.C2536S;

/* renamed from: h1.r */
/* loaded from: classes.dex */
public final class C0938r implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f3937a;

    /* renamed from: b */
    public final /* synthetic */ Object f3938b;

    public /* synthetic */ C0938r(int r12, Object obj) {
        this.f3937a = r12;
        this.f3938b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int r11, long j2) {
        Object item;
        switch (this.f3937a) {
            case 0:
                C0940t c0940t = (C0940t) this.f3938b;
                if (r11 < 0) {
                    C2520J0 c2520j0 = c0940t.f3942e;
                    item = !c2520j0.f8254z.isShowing() ? null : c2520j0.f8231c.getSelectedItem();
                } else {
                    item = c0940t.getAdapter().getItem(r11);
                }
                C0940t.m2518a(c0940t, item);
                AdapterView.OnItemClickListener onItemClickListener = c0940t.getOnItemClickListener();
                C2520J0 c2520j02 = c0940t.f3942e;
                if (onItemClickListener != null) {
                    if (view == null || r11 < 0) {
                        view = c2520j02.f8254z.isShowing() ? c2520j02.f8231c.getSelectedView() : null;
                        r11 = !c2520j02.f8254z.isShowing() ? -1 : c2520j02.f8231c.getSelectedItemPosition();
                        j2 = !c2520j02.f8254z.isShowing() ? Long.MIN_VALUE : c2520j02.f8231c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c2520j02.f8231c, view, r11, j2);
                }
                c2520j02.dismiss();
                break;
            case 1:
                C2529O c2529o = (C2529O) this.f3938b;
                c2529o.f8267H.setSelection(r11);
                C2536S c2536s = c2529o.f8267H;
                if (c2536s.getOnItemClickListener() != null) {
                    c2536s.performItemClick(view, r11, c2529o.f8264E.getItemId(r11));
                }
                c2529o.dismiss();
                break;
            default:
                ((SearchView) this.f3938b).m1521p(r11);
                break;
        }
    }
}
