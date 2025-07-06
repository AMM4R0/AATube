package p104l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.carwizard.p075li.youtube.R;

/* renamed from: l.D */
/* loaded from: classes.dex */
public final class C2507D extends RatingBar {

    /* renamed from: a */
    public final C2503B f8210a;

    public C2507D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC2578i1.m5030a(this, getContext());
        C2503B c2503b = new C2503B(this);
        this.f8210a = c2503b;
        c2503b.mo4924b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        Bitmap bitmap = (Bitmap) this.f8210a.f8190c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), r2, 0), getMeasuredHeight());
        }
    }
}
