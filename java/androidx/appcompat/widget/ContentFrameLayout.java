package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p028K.C0291Y;
import p079e.C0804m;
import p079e.LayoutInflaterFactory2C0815x;
import p102k.MenuC2466m;
import p104l.C2567f;
import p104l.C2582k;
import p104l.C2611t1;
import p104l.InterfaceC2589m0;
import p104l.InterfaceC2592n0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    public TypedValue f1819a;

    /* renamed from: b */
    public TypedValue f1820b;

    /* renamed from: c */
    public TypedValue f1821c;

    /* renamed from: d */
    public TypedValue f1822d;

    /* renamed from: e */
    public TypedValue f1823e;

    /* renamed from: f */
    public TypedValue f1824f;

    /* renamed from: g */
    public final Rect f1825g;

    /* renamed from: h */
    public InterfaceC2589m0 f1826h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1825g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1823e == null) {
            this.f1823e = new TypedValue();
        }
        return this.f1823e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1824f == null) {
            this.f1824f = new TypedValue();
        }
        return this.f1824f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1821c == null) {
            this.f1821c = new TypedValue();
        }
        return this.f1821c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1822d == null) {
            this.f1822d = new TypedValue();
        }
        return this.f1822d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1819a == null) {
            this.f1819a = new TypedValue();
        }
        return this.f1819a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1820b == null) {
            this.f1820b = new TypedValue();
        }
        return this.f1820b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2589m0 interfaceC2589m0 = this.f1826h;
        if (interfaceC2589m0 != null) {
            interfaceC2589m0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2582k c2582k;
        super.onDetachedFromWindow();
        InterfaceC2589m0 interfaceC2589m0 = this.f1826h;
        if (interfaceC2589m0 != null) {
            LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x = ((C0804m) interfaceC2589m0).f3261b;
            InterfaceC2592n0 interfaceC2592n0 = layoutInflaterFactory2C0815x.f3335r;
            if (interfaceC2592n0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC2592n0;
                actionBarOverlayLayout.m1506k();
                ActionMenuView actionMenuView = ((C2611t1) actionBarOverlayLayout.f1782e).f8477a.f1934a;
                if (actionMenuView != null && (c2582k = actionMenuView.f1808t) != null) {
                    c2582k.m5037f();
                    C2567f c2567f = c2582k.f8402t;
                    if (c2567f != null && c2567f.m4859b()) {
                        c2567f.f8141i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0815x.f3340w != null) {
                layoutInflaterFactory2C0815x.f3329l.getDecorView().removeCallbacks(layoutInflaterFactory2C0815x.f3341x);
                if (layoutInflaterFactory2C0815x.f3340w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0815x.f3340w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0815x.f3340w = null;
            }
            C0291Y c0291y = layoutInflaterFactory2C0815x.f3342y;
            if (c0291y != null) {
                c0291y.m796b();
            }
            MenuC2466m menuC2466m = layoutInflaterFactory2C0815x.m2245A(0).f3281h;
            if (menuC2466m != null) {
                menuC2466m.m4836c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC2589m0 interfaceC2589m0) {
        this.f1826h = interfaceC2589m0;
    }
}
