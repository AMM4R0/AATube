package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p002A1.C0015h;
import p102k.C2468o;
import p102k.InterfaceC2449B;
import p102k.InterfaceC2465l;
import p102k.MenuC2466m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC2465l, InterfaceC2449B, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public static final int[] f1728b = {R.attr.background, R.attr.divider};

    /* renamed from: a */
    public MenuC2466m f1729a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0015h m100A = C0015h.m100A(context, attributeSet, f1728b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) m100A.f26c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(m100A.m121p(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(m100A.m121p(1));
        }
        m100A.m102C();
    }

    @Override // p102k.InterfaceC2465l
    /* renamed from: a */
    public final boolean mo1491a(C2468o c2468o) {
        return this.f1729a.m4842q(c2468o, null, 0);
    }

    @Override // p102k.InterfaceC2449B
    /* renamed from: d */
    public final void mo1492d(MenuC2466m menuC2466m) {
        this.f1729a = menuC2466m;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int r3, long j2) {
        mo1491a((C2468o) getAdapter().getItem(r3));
    }
}
