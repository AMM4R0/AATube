package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p076d.AbstractC0780a;
import p104l.InterfaceC2629z1;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    public int f1960a;

    /* renamed from: b */
    public int f1961b;

    /* renamed from: c */
    public WeakReference f1962c;

    /* renamed from: d */
    public LayoutInflater f1963d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1960a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0780a.f3113B, 0, 0);
        this.f1961b = obtainStyledAttributes.getResourceId(2, -1);
        this.f1960a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public final View m1558a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1960a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f1963d;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f1960a, viewGroup, false);
        int r2 = this.f1961b;
        if (r2 != -1) {
            inflate.setId(r2);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f1962c = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1961b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1963d;
    }

    public int getLayoutResource() {
        return this.f1960a;
    }

    @Override // android.view.View
    public final void onMeasure(int r12, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int r12) {
        this.f1961b = r12;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1963d = layoutInflater;
    }

    public void setLayoutResource(int r12) {
        this.f1960a = r12;
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
        WeakReference weakReference = this.f1962c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(r2);
            return;
        }
        super.setVisibility(r2);
        if (r2 == 0 || r2 == 4) {
            m1558a();
        }
    }

    public void setOnInflateListener(InterfaceC2629z1 interfaceC2629z1) {
    }
}
