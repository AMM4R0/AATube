package p028K;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: K.Y */
/* loaded from: classes.dex */
public final class C0291Y {

    /* renamed from: a */
    public final WeakReference f853a;

    public C0291Y(View view) {
        this.f853a = new WeakReference(view);
    }

    /* renamed from: a */
    public final void m795a(float f) {
        View view = (View) this.f853a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* renamed from: b */
    public final void m796b() {
        View view = (View) this.f853a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public final void m797c(long j2) {
        View view = (View) this.f853a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    /* renamed from: d */
    public final void m798d(InterfaceC0292Z interfaceC0292Z) {
        View view = (View) this.f853a.get();
        if (view != null) {
            if (interfaceC0292Z != null) {
                view.animate().setListener(new C0290X(interfaceC0292Z, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* renamed from: e */
    public final void m799e(float f) {
        View view = (View) this.f853a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
