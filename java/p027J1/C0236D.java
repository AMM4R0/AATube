package p027J1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p132v.AbstractC2838r;
import p132v.C2834n;

/* renamed from: J1.D */
/* loaded from: classes.dex */
public final class C0236D {

    /* renamed from: a */
    public final int f695a;

    /* renamed from: b */
    public final int f696b;

    /* renamed from: c */
    public final Object f697c;

    public C0236D(Context context, XmlResourceParser xmlResourceParser) {
        this.f697c = new ArrayList();
        this.f696b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2838r.f9377h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int r12 = 0; r12 < indexCount; r12++) {
            int index = obtainStyledAttributes.getIndex(r12);
            if (index == 0) {
                this.f695a = obtainStyledAttributes.getResourceId(index, this.f695a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f696b);
                this.f696b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C2834n().m5453b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public C0236D() {
        this.f697c = new C0236D[256];
        this.f695a = 0;
        this.f696b = 0;
    }

    public C0236D(int r2, int r3) {
        this.f697c = null;
        this.f695a = r2;
        int r22 = r3 & 7;
        this.f696b = r22 == 0 ? 8 : r22;
    }
}
