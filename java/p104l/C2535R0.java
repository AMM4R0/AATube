package p104l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import p087h.AbstractC0919b;
import p100j0.C2434e;
import p100j0.C2446q;

/* renamed from: l.R0 */
/* loaded from: classes.dex */
public final class C2535R0 {

    /* renamed from: a */
    public final /* synthetic */ int f8275a;

    public /* synthetic */ C2535R0(int r12) {
        this.f8275a = r12;
    }

    /* renamed from: a */
    public final Drawable m4971a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f8275a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute != null) {
                    try {
                        Drawable drawable = (Drawable) C2535R0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                        AbstractC0919b.m2468c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                        break;
                    } catch (Exception e2) {
                        Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                        return null;
                    }
                }
                break;
            case 1:
                try {
                    break;
                } catch (Exception e3) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e3);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    C2434e c2434e = new C2434e(context);
                    c2434e.inflate(resources, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e4) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e4);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    C2446q c2446q = new C2446q();
                    c2446q.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e5) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e5);
                    return null;
                }
        }
        return null;
    }
}
