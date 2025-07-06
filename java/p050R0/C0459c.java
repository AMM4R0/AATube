package p050R0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
import p080e0.C0833P;
import p080e0.C0869u;
import p080e0.C0871w;

/* renamed from: R0.c */
/* loaded from: classes.dex */
public final class C0459c extends C0869u {

    /* renamed from: q */
    public final /* synthetic */ int f1179q;

    /* renamed from: r */
    public final /* synthetic */ Object f1180r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0459c(Object obj, Context context, int r3) {
        super(context);
        this.f1179q = r3;
        this.f1180r = obj;
    }

    @Override // p080e0.C0869u
    /* renamed from: b */
    public int mo1212b(View view, int r3) {
        switch (this.f1179q) {
            case 0:
                ((CarouselLayoutManager) this.f1180r).getClass();
                return 0;
            default:
                return super.mo1212b(view, r3);
        }
    }

    @Override // p080e0.C0869u
    /* renamed from: c */
    public int mo1213c(View view, int r3) {
        switch (this.f1179q) {
            case 0:
                ((CarouselLayoutManager) this.f1180r).getClass();
                return 0;
            default:
                return super.mo1213c(view, r3);
        }
    }

    @Override // p080e0.C0869u
    /* renamed from: d */
    public float mo1214d(DisplayMetrics displayMetrics) {
        switch (this.f1179q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo1214d(displayMetrics);
        }
    }

    @Override // p080e0.C0869u
    /* renamed from: e */
    public int mo1215e(int r2) {
        switch (this.f1179q) {
            case 1:
                return Math.min(100, super.mo1215e(r2));
            default:
                return super.mo1215e(r2);
        }
    }

    @Override // p080e0.C0869u
    /* renamed from: f */
    public PointF mo1216f(int r2) {
        switch (this.f1179q) {
            case 0:
                ((CarouselLayoutManager) this.f1180r).getClass();
                return null;
            default:
                return super.mo1216f(r2);
        }
    }

    @Override // p080e0.C0869u
    /* renamed from: h */
    public void mo1217h(View view, C0833P c0833p) {
        switch (this.f1179q) {
            case 1:
                C0871w c0871w = (C0871w) this.f1180r;
                int[] m2379a = c0871w.m2379a(c0871w.f3631a.getLayoutManager(), view);
                int r02 = m2379a[0];
                int r7 = m2379a[1];
                int ceil = (int) Math.ceil(mo1215e(Math.max(Math.abs(r02), Math.abs(r7))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f3623j;
                    c0833p.f3395a = r02;
                    c0833p.f3396b = r7;
                    c0833p.f3397c = ceil;
                    c0833p.f3399e = decelerateInterpolator;
                    c0833p.f3400f = true;
                    break;
                }
                break;
            default:
                super.mo1217h(view, c0833p);
                break;
        }
    }
}
