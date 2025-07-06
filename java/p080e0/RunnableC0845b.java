package p080e0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: e0.b */
/* loaded from: classes.dex */
public final class RunnableC0845b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3459a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f3460b;

    /* renamed from: c */
    public final /* synthetic */ C0856h f3461c;

    public /* synthetic */ RunnableC0845b(C0856h c0856h, ArrayList arrayList, int r3) {
        this.f3459a = r3;
        this.f3461c = c0856h;
        this.f3460b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f3459a) {
            case 0:
                ArrayList arrayList = this.f3460b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0856h c0856h = this.f3461c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0856h.f3525m.remove(arrayList);
                        break;
                    } else {
                        C0855g c0855g = (C0855g) it2.next();
                        AbstractC0838V abstractC0838V = c0855g.f3513a;
                        c0856h.getClass();
                        View view = abstractC0838V.f3424a;
                        int r7 = c0855g.f3516d - c0855g.f3514b;
                        int r9 = c0855g.f3517e - c0855g.f3515c;
                        if (r7 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (r9 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0856h.f3528p.add(abstractC0838V);
                        animate.setDuration(c0856h.f3353e).setListener(new C0849d(c0856h, abstractC0838V, r7, view, r9, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f3460b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0856h c0856h2 = this.f3461c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0856h2.f3526n.remove(arrayList2);
                        break;
                    } else {
                        C0853f c0853f = (C0853f) it3.next();
                        c0856h2.getClass();
                        AbstractC0838V abstractC0838V2 = c0853f.f3503a;
                        View view2 = abstractC0838V2 == null ? null : abstractC0838V2.f3424a;
                        AbstractC0838V abstractC0838V3 = c0853f.f3504b;
                        View view3 = abstractC0838V3 != null ? abstractC0838V3.f3424a : null;
                        ArrayList arrayList3 = c0856h2.f3530r;
                        long j2 = c0856h2.f3354f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0853f.f3503a);
                            duration.translationX(c0853f.f3507e - c0853f.f3505c);
                            duration.translationY(c0853f.f3508f - c0853f.f3506d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0851e(c0856h2, c0853f, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0853f.f3504b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0851e(c0856h2, c0853f, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f3460b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0856h c0856h3 = this.f3461c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0856h3.f3524l.remove(arrayList4);
                        break;
                    } else {
                        AbstractC0838V abstractC0838V4 = (AbstractC0838V) it4.next();
                        c0856h3.getClass();
                        View view4 = abstractC0838V4.f3424a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0856h3.f3527o.add(abstractC0838V4);
                        animate3.alpha(1.0f).setDuration(c0856h3.f3351c).setListener(new C0847c(c0856h3, abstractC0838V4, view4, animate3)).start();
                    }
                }
        }
    }
}
