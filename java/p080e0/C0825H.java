package p080e0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: e0.H */
/* loaded from: classes.dex */
public class C0825H extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC0838V f3376a;

    /* renamed from: b */
    public final Rect f3377b;

    /* renamed from: c */
    public boolean f3378c;

    /* renamed from: d */
    public boolean f3379d;

    public C0825H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3377b = new Rect();
        this.f3378c = true;
        this.f3379d = false;
    }

    public C0825H(int r12, int r2) {
        super(r12, r2);
        this.f3377b = new Rect();
        this.f3378c = true;
        this.f3379d = false;
    }

    public C0825H(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3377b = new Rect();
        this.f3378c = true;
        this.f3379d = false;
    }

    public C0825H(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3377b = new Rect();
        this.f3378c = true;
        this.f3379d = false;
    }

    public C0825H(C0825H c0825h) {
        super((ViewGroup.LayoutParams) c0825h);
        this.f3377b = new Rect();
        this.f3378c = true;
        this.f3379d = false;
    }
}
