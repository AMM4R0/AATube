package p050R0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p006C.AbstractC0049a;
import p080e0.AbstractC0821D;

/* renamed from: R0.d */
/* loaded from: classes.dex */
public final class C0460d extends AbstractC0821D {

    /* renamed from: a */
    public final Paint f1181a;

    /* renamed from: b */
    public final List f1182b;

    public C0460d() {
        Paint paint = new Paint();
        this.f1181a = paint;
        this.f1182b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p080e0.AbstractC0821D
    /* renamed from: b */
    public final void mo1218b(Canvas canvas, RecyclerView recyclerView) {
        int r12;
        int r2;
        int m2286E;
        int m2287F;
        Paint paint = this.f1181a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f1182b.iterator();
        while (it.hasNext()) {
            ((AbstractC0462f) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC0049a.f96a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m2088A0()) {
                C0461e c0461e = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2833q;
                switch (c0461e.f1184b) {
                    case 0:
                        r12 = 0;
                        break;
                    default:
                        r12 = c0461e.f1185c.m2288G();
                        break;
                }
                float f2 = r12;
                C0461e c0461e2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2833q;
                switch (c0461e2.f1184b) {
                    case 0:
                        r2 = c0461e2.f1185c.f3375o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c0461e2.f1185c;
                        r2 = carouselLayoutManager.f3375o - carouselLayoutManager.m2285D();
                        break;
                }
                canvas.drawLine(0.0f, f2, 0.0f, r2, paint);
            } else {
                C0461e c0461e3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2833q;
                switch (c0461e3.f1184b) {
                    case 0:
                        m2286E = c0461e3.f1185c.m2286E();
                        break;
                    default:
                        m2286E = 0;
                        break;
                }
                float f3 = m2286E;
                C0461e c0461e4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2833q;
                switch (c0461e4.f1184b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c0461e4.f1185c;
                        m2287F = carouselLayoutManager2.f3374n - carouselLayoutManager2.m2287F();
                        break;
                    default:
                        m2287F = c0461e4.f1185c.f3374n;
                        break;
                }
                canvas.drawLine(f3, 0.0f, m2287F, 0.0f, paint);
            }
        }
    }
}
