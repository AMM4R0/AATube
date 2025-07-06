package p132v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: v.g */
/* loaded from: classes.dex */
public final class C2827g {

    /* renamed from: a */
    public final float f9244a;

    /* renamed from: b */
    public final float f9245b;

    /* renamed from: c */
    public final float f9246c;

    /* renamed from: d */
    public final float f9247d;

    /* renamed from: e */
    public final int f9248e;

    public C2827g(Context context, XmlResourceParser xmlResourceParser) {
        this.f9244a = Float.NaN;
        this.f9245b = Float.NaN;
        this.f9246c = Float.NaN;
        this.f9247d = Float.NaN;
        this.f9248e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2838r.f9379j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int r12 = 0; r12 < indexCount; r12++) {
            int index = obtainStyledAttributes.getIndex(r12);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f9248e);
                this.f9248e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C2834n().m5453b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f9247d = obtainStyledAttributes.getDimension(index, this.f9247d);
            } else if (index == 2) {
                this.f9245b = obtainStyledAttributes.getDimension(index, this.f9245b);
            } else if (index == 3) {
                this.f9246c = obtainStyledAttributes.getDimension(index, this.f9246c);
            } else if (index == 4) {
                this.f9244a = obtainStyledAttributes.getDimension(index, this.f9244a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
