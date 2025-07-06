package p101j1;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p099j.C2419d;

/* renamed from: j1.a */
/* loaded from: classes.dex */
public abstract class AbstractC2447a {

    /* renamed from: a */
    public static final int[] f7974a = {R.attr.theme, com.carwizard.p075li.youtube.R.attr.theme};

    /* renamed from: b */
    public static final int[] f7975b = {com.carwizard.p075li.youtube.R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static Context m4797a(Context context, AttributeSet attributeSet, int r4, int r5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7975b, r4, r5);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z2 = (context instanceof C2419d) && ((C2419d) context).f7822a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        C2419d c2419d = new C2419d(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f7974a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c2419d.getTheme().applyStyle(resourceId2, true);
        }
        return c2419d;
    }
}
