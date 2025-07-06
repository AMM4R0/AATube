package p019H;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.C0649P;
import androidx.fragment.app.C0658h;
import java.util.ArrayList;
import p000A.AbstractC0002c;
import p010D0.C0113k;
import p010D0.RunnableC0106d;
import p028K.C0302e0;
import p028K.C0312j0;

/* renamed from: H.l */
/* loaded from: classes.dex */
public final class RunnableC0182l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f567a = 0;

    /* renamed from: b */
    public Object f568b;

    /* renamed from: c */
    public Object f569c;

    /* renamed from: d */
    public Object f570d;

    public /* synthetic */ RunnableC0182l() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f567a) {
            case 0:
                try {
                    obj = ((CallableC0175e) this.f568b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f570d).post(new RunnableC0106d((C0176f) this.f569c, 2, obj));
                break;
            case 1:
                C0302e0.m833h((View) this.f568b, (C0113k) this.f569c);
                ((ValueAnimator) this.f570d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f568b;
                C0649P c0649p = (C0649P) this.f569c;
                if (arrayList.contains(c0649p)) {
                    arrayList.remove(c0649p);
                    ((C0658h) this.f570d).getClass();
                    AbstractC0002c.m6a(c0649p.f2209c.f2300E, c0649p.f2207a);
                    break;
                }
                break;
        }
    }

    public RunnableC0182l(C0658h c0658h, ArrayList arrayList, C0649P c0649p) {
        this.f570d = c0658h;
        this.f568b = arrayList;
        this.f569c = c0649p;
    }

    public RunnableC0182l(View view, C0312j0 c0312j0, C0113k c0113k, ValueAnimator valueAnimator) {
        this.f568b = view;
        this.f569c = c0113k;
        this.f570d = valueAnimator;
    }
}
