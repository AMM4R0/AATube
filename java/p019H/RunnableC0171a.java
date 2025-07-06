package p019H;

import android.util.Log;
import androidx.emoji2.text.AbstractC0618h;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C0755k;
import java.util.ArrayList;
import java.util.List;
import p003B.AbstractC0028b;
import p006C.C0055g;
import p036M1.AbstractC0379e;
import p080e0.AbstractC0824G;
import p130u0.C2787k;

/* renamed from: H.a */
/* loaded from: classes.dex */
public final class RunnableC0171a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f542a;

    /* renamed from: b */
    public final int f543b;

    /* renamed from: c */
    public final Object f544c;

    public /* synthetic */ RunnableC0171a(int r12, int r2, Object obj) {
        this.f542a = r2;
        this.f544c = obj;
        this.f543b = r12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f542a) {
            case 0:
                AbstractC0028b abstractC0028b = (AbstractC0028b) ((C0055g) this.f544c).f107b;
                if (abstractC0028b != null) {
                    abstractC0028b.mo174j(this.f543b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f544c;
                int size = arrayList.size();
                int r4 = 0;
                if (this.f543b == 1) {
                    while (r4 < size) {
                        ((AbstractC0618h) arrayList.get(r4)).mo1386b();
                        r4++;
                    }
                    break;
                } else {
                    while (r4 < size) {
                        ((AbstractC0618h) arrayList.get(r4)).mo1387a();
                        r4++;
                    }
                    break;
                }
            case 2:
                RecyclerView recyclerView = ((C0755k) this.f544c).f2890Y;
                if (!recyclerView.f2547u) {
                    AbstractC0824G abstractC0824G = recyclerView.f2531l;
                    if (abstractC0824G != null) {
                        abstractC0824G.mo1890x0(recyclerView, this.f543b);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
            default:
                ((C2787k) this.f544c).m5406i(this.f543b);
                break;
        }
    }

    public RunnableC0171a(List list, int r2, Throwable th) {
        this.f542a = 1;
        AbstractC0379e.m1073d(list, "initCallbacks cannot be null");
        this.f544c = new ArrayList(list);
        this.f543b = r2;
    }
}
