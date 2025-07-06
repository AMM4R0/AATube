package p132v;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import p123s.C2726g;

/* renamed from: v.t */
/* loaded from: classes.dex */
public abstract class AbstractC2840t extends AbstractC2823c {

    /* renamed from: h */
    public boolean f9380h;

    /* renamed from: i */
    public boolean f9381i;

    @Override // p132v.AbstractC2823c
    /* renamed from: e */
    public final void mo5431e(ConstraintLayout constraintLayout) {
        m5430d(constraintLayout);
    }

    @Override // p132v.AbstractC2823c
    /* renamed from: g */
    public void mo5433g(AttributeSet attributeSet) {
        super.mo5433g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2838r.f9371b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int r12 = 0; r12 < indexCount; r12++) {
                int index = obtainStyledAttributes.getIndex(r12);
                if (index == 6) {
                    this.f9380h = true;
                } else if (index == 22) {
                    this.f9381i = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    public abstract void mo1562j(C2726g c2726g, int r2, int r3);

    @Override // p132v.AbstractC2823c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9380h || this.f9381i) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int r3 = 0; r3 < this.f9161b; r3++) {
                    View view = (View) constraintLayout.f1969a.get(this.f9160a[r3]);
                    if (view != null) {
                        if (this.f9380h) {
                            view.setVisibility(visibility);
                        }
                        if (this.f9381i && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m5430d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
        super.setVisibility(r2);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m5430d((ConstraintLayout) parent);
    }
}
