package p104l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p102k.C2463j;
import p102k.C2468o;
import p102k.MenuC2466m;

/* renamed from: l.O0 */
/* loaded from: classes.dex */
public final class C2530O0 extends C2622x0 {

    /* renamed from: m */
    public final int f8268m;

    /* renamed from: n */
    public final int f8269n;

    /* renamed from: o */
    public InterfaceC2522K0 f8270o;

    /* renamed from: p */
    public C2468o f8271p;

    public C2530O0(Context context, boolean z2) {
        super(context, z2);
        if (1 == AbstractC2528N0.m4969a(context.getResources().getConfiguration())) {
            this.f8268m = 21;
            this.f8269n = 22;
        } else {
            this.f8268m = 22;
            this.f8269n = 21;
        }
    }

    @Override // p104l.C2622x0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C2463j c2463j;
        int r12;
        int pointToPosition;
        int r2;
        if (this.f8270o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                r12 = headerViewListAdapter.getHeadersCount();
                c2463j = (C2463j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c2463j = (C2463j) adapter;
                r12 = 0;
            }
            C2468o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (r2 = pointToPosition - r12) < 0 || r2 >= c2463j.getCount()) ? null : c2463j.getItem(r2);
            C2468o c2468o = this.f8271p;
            if (c2468o != item) {
                MenuC2466m menuC2466m = c2463j.f8058a;
                if (c2468o != null) {
                    this.f8270o.mo216o(menuC2466m, c2468o);
                }
                this.f8271p = item;
                if (item != null) {
                    this.f8270o.mo205c(menuC2466m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r5, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && r5 == this.f8268m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || r5 != this.f8269n) {
            return super.onKeyDown(r5, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C2463j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C2463j) adapter).f8058a.m4836c(false);
        return true;
    }

    public void setHoverListener(InterfaceC2522K0 interfaceC2522K0) {
        this.f8270o = interfaceC2522K0;
    }

    @Override // p104l.C2622x0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
