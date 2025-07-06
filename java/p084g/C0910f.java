package p084g;

import android.graphics.drawable.Drawable;
import p100j0.C2434e;

/* renamed from: g.f */
/* loaded from: classes.dex */
public final class C0910f implements Drawable.Callback {

    /* renamed from: a */
    public final /* synthetic */ int f3819a = 0;

    /* renamed from: b */
    public Object f3820b;

    public /* synthetic */ C0910f() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f3819a) {
            case 0:
                break;
            default:
                ((C2434e) this.f3820b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        switch (this.f3819a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f3820b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j2);
                    break;
                }
                break;
            default:
                ((C2434e) this.f3820b).scheduleSelf(runnable, j2);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f3819a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f3820b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            default:
                ((C2434e) this.f3820b).unscheduleSelf(runnable);
                break;
        }
    }

    public C0910f(C2434e c2434e) {
        this.f3820b = c2434e;
    }

    /* renamed from: a */
    private final void m2461a(Drawable drawable) {
    }
}
