package p102k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.carwizard.p075li.youtube.R;
import java.util.ArrayList;

/* renamed from: k.h */
/* loaded from: classes.dex */
public final class C2461h extends BaseAdapter {

    /* renamed from: a */
    public int f8050a = -1;

    /* renamed from: b */
    public final /* synthetic */ C2462i f8051b;

    public C2461h(C2462i c2462i) {
        this.f8051b = c2462i;
        m4827a();
    }

    /* renamed from: a */
    public final void m4827a() {
        MenuC2466m menuC2466m = this.f8051b.f8054c;
        C2468o c2468o = menuC2466m.f8086v;
        if (c2468o != null) {
            menuC2466m.m4839i();
            ArrayList arrayList = menuC2466m.f8074j;
            int size = arrayList.size();
            for (int r3 = 0; r3 < size; r3++) {
                if (((C2468o) arrayList.get(r3)) == c2468o) {
                    this.f8050a = r3;
                    return;
                }
            }
        }
        this.f8050a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2468o getItem(int r3) {
        C2462i c2462i = this.f8051b;
        MenuC2466m menuC2466m = c2462i.f8054c;
        menuC2466m.m4839i();
        ArrayList arrayList = menuC2466m.f8074j;
        c2462i.getClass();
        int r02 = this.f8050a;
        if (r02 >= 0 && r3 >= r02) {
            r3++;
        }
        return (C2468o) arrayList.get(r3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C2462i c2462i = this.f8051b;
        MenuC2466m menuC2466m = c2462i.f8054c;
        menuC2466m.m4839i();
        int size = menuC2466m.f8074j.size();
        c2462i.getClass();
        return this.f8050a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        return r3;
    }

    @Override // android.widget.Adapter
    public final View getView(int r3, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f8051b.f8053b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC2448A) view).mo1488c(getItem(r3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m4827a();
        super.notifyDataSetChanged();
    }
}
