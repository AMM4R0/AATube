package p102k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: k.u */
/* loaded from: classes.dex */
public abstract class AbstractC2474u implements InterfaceC2451D, InterfaceC2479z, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Rect f8131a;

    /* renamed from: m */
    public static int m4855m(ListAdapter listAdapter, Context context, int r12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int r5 = 0;
        int r6 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int r02 = 0; r02 < count; r02++) {
            int itemViewType = listAdapter.getItemViewType(r02);
            if (itemViewType != r6) {
                view = null;
                r6 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(r02, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= r12) {
                return r12;
            }
            if (measuredWidth > r5) {
                r5 = measuredWidth;
            }
        }
        return r5;
    }

    /* renamed from: u */
    public static boolean m4856u(MenuC2466m menuC2466m) {
        int size = menuC2466m.f8070f.size();
        for (int r2 = 0; r2 < size; r2++) {
            MenuItem item = menuC2466m.getItem(r2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: c */
    public final boolean mo4829c(C2468o c2468o) {
        return false;
    }

    @Override // p102k.InterfaceC2479z
    /* renamed from: e */
    public final boolean mo4830e(C2468o c2468o) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo4806l(MenuC2466m menuC2466m);

    /* renamed from: n */
    public abstract void mo4807n(View view);

    /* renamed from: o */
    public abstract void mo4808o(boolean z2);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int r3, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C2463j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C2463j) listAdapter).f8058a.m4842q((MenuItem) listAdapter.getItem(r3), this, !(this instanceof ViewOnKeyListenerC2460g) ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo4809p(int r12);

    /* renamed from: q */
    public abstract void mo4810q(int r12);

    /* renamed from: r */
    public abstract void mo4811r(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: s */
    public abstract void mo4812s(boolean z2);

    /* renamed from: t */
    public abstract void mo4813t(int r12);

    @Override // p102k.InterfaceC2479z
    /* renamed from: g */
    public final void mo4831g(Context context, MenuC2466m menuC2466m) {
    }
}
