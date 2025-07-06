package p003B;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0580g;
import android.util.AttributeSet;
import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.C0015h;
import p008C1.C0077i;
import p008C1.EnumC0089u;
import p028K.AbstractC0283P;
import p046Q.AbstractC0432f;
import p076d.AbstractC0780a;
import p104l.AbstractC2604r0;
import p104l.C2609t;

/* renamed from: B.d */
/* loaded from: classes.dex */
public final class C0030d {

    /* renamed from: a */
    public final /* synthetic */ int f46a;

    /* renamed from: b */
    public int f47b;

    /* renamed from: c */
    public final Object f48c;

    /* renamed from: d */
    public Object f49d;

    public C0030d(EnumC0089u enumC0089u, int r3, String str) {
        this.f46a = 1;
        this.f48c = enumC0089u;
        this.f47b = r3;
        this.f49d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p003B.C0030d m178b(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p003B.C0030d.m178b(android.content.res.Resources, int, android.content.res.Resources$Theme):B.d");
    }

    /* renamed from: a */
    public void m179a() {
        C0077i c0077i;
        ImageView imageView = (ImageView) this.f48c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC2604r0.m5065a(drawable);
        }
        if (drawable == null || (c0077i = (C0077i) this.f49d) == null) {
            return;
        }
        C2609t.m5072e(drawable, c0077i, imageView.getDrawableState());
    }

    /* renamed from: c */
    public boolean m180c() {
        ColorStateList colorStateList;
        return ((Shader) this.f48c) == null && (colorStateList = (ColorStateList) this.f49d) != null && colorStateList.isStateful();
    }

    /* renamed from: d */
    public void m181d(AttributeSet attributeSet, int r10) {
        int resourceId;
        ImageView imageView = (ImageView) this.f48c;
        Context context = imageView.getContext();
        int[] r3 = AbstractC0780a.f3119f;
        C0015h m100A = C0015h.m100A(context, attributeSet, r3, r10);
        AbstractC0283P.m778k(imageView, imageView.getContext(), r3, attributeSet, (TypedArray) m100A.f26c, r10);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) m100A.f26c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0580g.m1449n(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC2604r0.m5065a(drawable);
            }
            if (typedArray.hasValue(2)) {
                AbstractC0432f.m1173c(imageView, m100A.m120o(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0432f.m1174d(imageView, AbstractC2604r0.m5067c(typedArray.getInt(3, -1), null));
            }
            m100A.m102C();
        } catch (Throwable th) {
            m100A.m102C();
            throw th;
        }
    }

    public String toString() {
        switch (this.f46a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                if (((EnumC0089u) this.f48c) == EnumC0089u.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f47b);
                sb.append(' ');
                sb.append((String) this.f49d);
                String sb2 = sb.toString();
                AbstractC2492i.m4914d(sb2, "toString(...)");
                return sb2;
            default:
                return super.toString();
        }
    }

    public C0030d(ImageView imageView) {
        this.f46a = 2;
        this.f47b = 0;
        this.f48c = imageView;
    }

    public C0030d(Shader shader, ColorStateList colorStateList, int r4) {
        this.f46a = 0;
        this.f48c = shader;
        this.f49d = colorStateList;
        this.f47b = r4;
    }
}
