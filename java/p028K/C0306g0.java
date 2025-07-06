package p028K;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p006C.C0051c;

/* renamed from: K.g0 */
/* loaded from: classes.dex */
public final class C0306g0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a */
    public final C0301e f878a;

    /* renamed from: b */
    public List f879b;

    /* renamed from: c */
    public ArrayList f880c;

    /* renamed from: d */
    public final HashMap f881d;

    public C0306g0(C0301e c0301e) {
        super(0);
        this.f881d = new HashMap();
        this.f878a = c0301e;
    }

    /* renamed from: a */
    public final C0312j0 m866a(WindowInsetsAnimation windowInsetsAnimation) {
        C0312j0 c0312j0 = (C0312j0) this.f881d.get(windowInsetsAnimation);
        if (c0312j0 == null) {
            c0312j0 = new C0312j0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c0312j0.f896a = new C0308h0(windowInsetsAnimation);
            }
            this.f881d.put(windowInsetsAnimation, c0312j0);
        }
        return c0312j0;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0301e c0301e = this.f878a;
        m866a(windowInsetsAnimation);
        ((View) c0301e.f872e).setTranslationY(0.0f);
        this.f881d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0301e c0301e = this.f878a;
        m866a(windowInsetsAnimation);
        View view = (View) c0301e.f872e;
        int[] r12 = (int[]) c0301e.f873f;
        view.getLocationOnScreen(r12);
        c0301e.f870c = r12[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f880c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f880c = arrayList2;
            this.f879b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation m849j = AbstractC0304f0.m849j(list.get(size));
            C0312j0 m866a = m866a(m849j);
            fraction = m849j.getFraction();
            m866a.f896a.mo870d(fraction);
            this.f880c.add(m866a);
        }
        C0301e c0301e = this.f878a;
        C0340x0 m975g = C0340x0.m975g(null, windowInsets);
        c0301e.m829b(m975g, this.f879b);
        return m975g.m980f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0301e c0301e = this.f878a;
        m866a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        C0051c m198c = C0051c.m198c(lowerBound);
        upperBound = bounds.getUpperBound();
        C0051c m198c2 = C0051c.m198c(upperBound);
        View view = (View) c0301e.f872e;
        int[] r2 = (int[]) c0301e.f873f;
        view.getLocationOnScreen(r2);
        int r3 = c0301e.f870c - r2[1];
        c0301e.f871d = r3;
        view.setTranslationY(r3);
        AbstractC0304f0.m852m();
        return AbstractC0304f0.m847h(m198c.m199d(), m198c2.m199d());
    }
}
