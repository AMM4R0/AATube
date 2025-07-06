package p099j;

import android.support.v4.media.session.AbstractC0580g;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p028K.C0291Y;

/* renamed from: j.k */
/* loaded from: classes.dex */
public final class C2426k {

    /* renamed from: c */
    public BaseInterpolator f7881c;

    /* renamed from: d */
    public AbstractC0580g f7882d;

    /* renamed from: e */
    public boolean f7883e;

    /* renamed from: b */
    public long f7880b = -1;

    /* renamed from: f */
    public final C2425j f7884f = new C2425j(this);

    /* renamed from: a */
    public final ArrayList f7879a = new ArrayList();

    /* renamed from: a */
    public final void m4782a() {
        if (this.f7883e) {
            Iterator it = this.f7879a.iterator();
            while (it.hasNext()) {
                ((C0291Y) it.next()).m796b();
            }
            this.f7883e = false;
        }
    }

    /* renamed from: b */
    public final void m4783b() {
        View view;
        if (this.f7883e) {
            return;
        }
        Iterator it = this.f7879a.iterator();
        while (it.hasNext()) {
            C0291Y c0291y = (C0291Y) it.next();
            long j2 = this.f7880b;
            if (j2 >= 0) {
                c0291y.m797c(j2);
            }
            BaseInterpolator baseInterpolator = this.f7881c;
            if (baseInterpolator != null && (view = (View) c0291y.f853a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f7882d != null) {
                c0291y.m798d(this.f7884f);
            }
            View view2 = (View) c0291y.f853a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f7883e = true;
    }
}
