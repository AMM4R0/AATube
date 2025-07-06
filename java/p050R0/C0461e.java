package p050R0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: R0.e */
/* loaded from: classes.dex */
public final class C0461e {

    /* renamed from: a */
    public final int f1183a;

    /* renamed from: b */
    public final /* synthetic */ int f1184b;

    /* renamed from: c */
    public final /* synthetic */ CarouselLayoutManager f1185c;

    public C0461e(int r12) {
        this.f1183a = r12;
    }

    /* renamed from: a */
    public final int m1219a() {
        switch (this.f1184b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f1185c;
                if (carouselLayoutManager.m2089B0()) {
                    return carouselLayoutManager.f3374n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'thıs' call moved to the top of the method (can break code semantics) */
    public C0461e(CarouselLayoutManager carouselLayoutManager, int r2) {
        this(1);
        this.f1184b = r2;
        switch (r2) {
            case 1:
                this.f1185c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f1185c = carouselLayoutManager;
                break;
        }
    }
}
