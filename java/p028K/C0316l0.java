package p028K;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p006C.C0051c;

/* renamed from: K.l0 */
/* loaded from: classes.dex */
public final class C0316l0 extends AbstractC0324p0 {

    /* renamed from: e */
    public static Field f901e = null;

    /* renamed from: f */
    public static boolean f902f = false;

    /* renamed from: g */
    public static Constructor f903g = null;

    /* renamed from: h */
    public static boolean f904h = false;

    /* renamed from: c */
    public WindowInsets f905c;

    /* renamed from: d */
    public C0051c f906d;

    public C0316l0() {
        this.f905c = m891i();
    }

    /* renamed from: i */
    private static WindowInsets m891i() {
        if (!f902f) {
            try {
                f901e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f902f = true;
        }
        Field field = f901e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f904h) {
            try {
                f903g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f904h = true;
        }
        Constructor constructor = f903g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // p028K.AbstractC0324p0
    /* renamed from: b */
    public C0340x0 mo892b() {
        m944a();
        C0340x0 m975g = C0340x0.m975g(null, this.f905c);
        C0051c[] c0051cArr = this.f916b;
        C0336v0 c0336v0 = m975g.f944a;
        c0336v0.mo954o(c0051cArr);
        c0336v0.mo962q(this.f906d);
        return m975g;
    }

    @Override // p028K.AbstractC0324p0
    /* renamed from: e */
    public void mo893e(C0051c c0051c) {
        this.f906d = c0051c;
    }

    @Override // p028K.AbstractC0324p0
    /* renamed from: g */
    public void mo894g(C0051c c0051c) {
        WindowInsets windowInsets = this.f905c;
        if (windowInsets != null) {
            this.f905c = windowInsets.replaceSystemWindowInsets(c0051c.f98a, c0051c.f99b, c0051c.f100c, c0051c.f101d);
        }
    }

    public C0316l0(C0340x0 c0340x0) {
        super(c0340x0);
        this.f905c = c0340x0.m980f();
    }
}
