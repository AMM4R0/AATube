package p132v;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: v.p */
/* loaded from: classes.dex */
public final class C2836p extends View {

    /* renamed from: a */
    public boolean f9369a;

    public C2836p(Context context) {
        super(context);
        this.f9369a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int r12, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f9369a = z2;
    }

    public void setGuidelineBegin(int r3) {
        C2825e c2825e = (C2825e) getLayoutParams();
        if (this.f9369a && c2825e.f9194a == r3) {
            return;
        }
        c2825e.f9194a = r3;
        setLayoutParams(c2825e);
    }

    public void setGuidelineEnd(int r3) {
        C2825e c2825e = (C2825e) getLayoutParams();
        if (this.f9369a && c2825e.f9196b == r3) {
            return;
        }
        c2825e.f9196b = r3;
        setLayoutParams(c2825e);
    }

    public void setGuidelinePercent(float f) {
        C2825e c2825e = (C2825e) getLayoutParams();
        if (this.f9369a && c2825e.f9198c == f) {
            return;
        }
        c2825e.f9198c = f;
        setLayoutParams(c2825e);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int r12) {
    }
}
