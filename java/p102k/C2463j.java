package p102k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.j */
/* loaded from: classes.dex */
public final class C2463j extends BaseAdapter {

    /* renamed from: a */
    public final MenuC2466m f8058a;

    /* renamed from: b */
    public int f8059b = -1;

    /* renamed from: c */
    public boolean f8060c;

    /* renamed from: d */
    public final boolean f8061d;

    /* renamed from: e */
    public final LayoutInflater f8062e;

    /* renamed from: f */
    public final int f8063f;

    public C2463j(MenuC2466m menuC2466m, LayoutInflater layoutInflater, boolean z2, int r5) {
        this.f8061d = z2;
        this.f8062e = layoutInflater;
        this.f8058a = menuC2466m;
        this.f8063f = r5;
        m4832a();
    }

    /* renamed from: a */
    public final void m4832a() {
        MenuC2466m menuC2466m = this.f8058a;
        C2468o c2468o = menuC2466m.f8086v;
        if (c2468o != null) {
            menuC2466m.m4839i();
            ArrayList arrayList = menuC2466m.f8074j;
            int size = arrayList.size();
            for (int r3 = 0; r3 < size; r3++) {
                if (((C2468o) arrayList.get(r3)) == c2468o) {
                    this.f8059b = r3;
                    return;
                }
            }
        }
        this.f8059b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2468o getItem(int r3) {
        ArrayList m4840l;
        MenuC2466m menuC2466m = this.f8058a;
        if (this.f8061d) {
            menuC2466m.m4839i();
            m4840l = menuC2466m.f8074j;
        } else {
            m4840l = menuC2466m.m4840l();
        }
        int r12 = this.f8059b;
        if (r12 >= 0 && r3 >= r12) {
            r3++;
        }
        return (C2468o) m4840l.get(r3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList m4840l;
        MenuC2466m menuC2466m = this.f8058a;
        if (this.f8061d) {
            menuC2466m.m4839i();
            m4840l = menuC2466m.f8074j;
        } else {
            m4840l = menuC2466m.m4840l();
        }
        return this.f8059b < 0 ? m4840l.size() : m4840l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        return r3;
    }

    @Override // android.widget.Adapter
    public final View getView(int r6, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f8062e.inflate(this.f8063f, viewGroup, false);
        }
        int r8 = getItem(r6).f8096b;
        int r12 = r6 - 1;
        int r13 = r12 >= 0 ? getItem(r12).f8096b : r8;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f8058a.mo4819m() && r8 != r13) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC2448A interfaceC2448A = (InterfaceC2448A) view;
        if (this.f8060c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC2448A.mo1488c(getItem(r6));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m4832a();
        super.notifyDataSetChanged();
    }
}
