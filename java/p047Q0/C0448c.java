package p047Q0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import p009D.AbstractC0095a;
import p028K.AbstractC0283P;
import p036M1.AbstractC0379e;
import p074c1.AbstractC0739a;
import p081e1.C0880f;
import p081e1.C0881g;
import p081e1.C0885k;
import p081e1.InterfaceC0896v;

/* renamed from: Q0.c */
/* loaded from: classes.dex */
public final class C0448c {

    /* renamed from: a */
    public final MaterialButton f1136a;

    /* renamed from: b */
    public C0885k f1137b;

    /* renamed from: c */
    public int f1138c;

    /* renamed from: d */
    public int f1139d;

    /* renamed from: e */
    public int f1140e;

    /* renamed from: f */
    public int f1141f;

    /* renamed from: g */
    public int f1142g;

    /* renamed from: h */
    public int f1143h;

    /* renamed from: i */
    public PorterDuff.Mode f1144i;

    /* renamed from: j */
    public ColorStateList f1145j;

    /* renamed from: k */
    public ColorStateList f1146k;

    /* renamed from: l */
    public ColorStateList f1147l;

    /* renamed from: m */
    public C0881g f1148m;

    /* renamed from: q */
    public boolean f1152q;

    /* renamed from: s */
    public RippleDrawable f1154s;

    /* renamed from: t */
    public int f1155t;

    /* renamed from: n */
    public boolean f1149n = false;

    /* renamed from: o */
    public boolean f1150o = false;

    /* renamed from: p */
    public boolean f1151p = false;

    /* renamed from: r */
    public boolean f1153r = true;

    public C0448c(MaterialButton materialButton, C0885k c0885k) {
        this.f1136a = materialButton;
        this.f1137b = c0885k;
    }

    /* renamed from: a */
    public final InterfaceC0896v m1199a() {
        RippleDrawable rippleDrawable = this.f1154s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f1154s.getNumberOfLayers() > 2 ? (InterfaceC0896v) this.f1154s.getDrawable(2) : (InterfaceC0896v) this.f1154s.getDrawable(1);
    }

    /* renamed from: b */
    public final C0881g m1200b(boolean z2) {
        RippleDrawable rippleDrawable = this.f1154s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C0881g) ((LayerDrawable) ((InsetDrawable) this.f1154s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    /* renamed from: c */
    public final void m1201c(C0885k c0885k) {
        this.f1137b = c0885k;
        if (m1200b(false) != null) {
            m1200b(false).setShapeAppearanceModel(c0885k);
        }
        if (m1200b(true) != null) {
            m1200b(true).setShapeAppearanceModel(c0885k);
        }
        if (m1199a() != null) {
            m1199a().setShapeAppearanceModel(c0885k);
        }
    }

    /* renamed from: d */
    public final void m1202d(int r9, int r10) {
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        MaterialButton materialButton = this.f1136a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int r5 = this.f1140e;
        int r6 = this.f1141f;
        this.f1141f = r10;
        this.f1140e = r9;
        if (!this.f1150o) {
            m1203e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + r9) - r5, paddingEnd, (paddingBottom + r10) - r6);
    }

    /* renamed from: e */
    public final void m1203e() {
        C0881g c0881g = new C0881g(this.f1137b);
        MaterialButton materialButton = this.f1136a;
        c0881g.m2405h(materialButton.getContext());
        AbstractC0095a.m319h(c0881g, this.f1145j);
        PorterDuff.Mode mode = this.f1144i;
        if (mode != null) {
            AbstractC0095a.m320i(c0881g, mode);
        }
        float f = this.f1143h;
        ColorStateList colorStateList = this.f1146k;
        c0881g.f3659a.f3651j = f;
        c0881g.invalidateSelf();
        C0880f c0880f = c0881g.f3659a;
        if (c0880f.f3645d != colorStateList) {
            c0880f.f3645d = colorStateList;
            c0881g.onStateChange(c0881g.getState());
        }
        C0881g c0881g2 = new C0881g(this.f1137b);
        c0881g2.setTint(0);
        float f2 = this.f1143h;
        int m1080p = this.f1149n ? AbstractC0379e.m1080p(materialButton, R.attr.colorSurface) : 0;
        c0881g2.f3659a.f3651j = f2;
        c0881g2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(m1080p);
        C0880f c0880f2 = c0881g2.f3659a;
        if (c0880f2.f3645d != valueOf) {
            c0880f2.f3645d = valueOf;
            c0881g2.onStateChange(c0881g2.getState());
        }
        C0881g c0881g3 = new C0881g(this.f1137b);
        this.f1148m = c0881g3;
        AbstractC0095a.m318g(c0881g3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC0739a.m2017a(this.f1147l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c0881g2, c0881g}), this.f1138c, this.f1140e, this.f1139d, this.f1141f), this.f1148m);
        this.f1154s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C0881g m1200b = m1200b(false);
        if (m1200b != null) {
            m1200b.m2406i(this.f1155t);
            m1200b.setState(materialButton.getDrawableState());
        }
    }

    /* renamed from: f */
    public final void m1204f() {
        C0881g m1200b = m1200b(false);
        C0881g m1200b2 = m1200b(true);
        if (m1200b != null) {
            float f = this.f1143h;
            ColorStateList colorStateList = this.f1146k;
            m1200b.f3659a.f3651j = f;
            m1200b.invalidateSelf();
            C0880f c0880f = m1200b.f3659a;
            if (c0880f.f3645d != colorStateList) {
                c0880f.f3645d = colorStateList;
                m1200b.onStateChange(m1200b.getState());
            }
            if (m1200b2 != null) {
                float f2 = this.f1143h;
                int m1080p = this.f1149n ? AbstractC0379e.m1080p(this.f1136a, R.attr.colorSurface) : 0;
                m1200b2.f3659a.f3651j = f2;
                m1200b2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(m1080p);
                C0880f c0880f2 = m1200b2.f3659a;
                if (c0880f2.f3645d != valueOf) {
                    c0880f2.f3645d = valueOf;
                    m1200b2.onStateChange(m1200b2.getState());
                }
            }
        }
    }
}
