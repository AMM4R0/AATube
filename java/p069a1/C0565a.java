package p069a1;

import android.R;
import android.content.res.ColorStateList;
import p036M1.AbstractC0379e;
import p046Q.AbstractC0428b;
import p104l.C2505C;

/* renamed from: a1.a */
/* loaded from: classes.dex */
public final class C0565a extends C2505C {

    /* renamed from: g */
    public static final int[][] f1572g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    public ColorStateList f1573e;

    /* renamed from: f */
    public boolean f1574f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1573e == null) {
            int m1080p = AbstractC0379e.m1080p(this, com.carwizard.p075li.youtube.R.attr.colorControlActivated);
            int m1080p2 = AbstractC0379e.m1080p(this, com.carwizard.p075li.youtube.R.attr.colorOnSurface);
            int m1080p3 = AbstractC0379e.m1080p(this, com.carwizard.p075li.youtube.R.attr.colorSurface);
            this.f1573e = new ColorStateList(f1572g, new int[]{AbstractC0379e.m1085w(m1080p3, m1080p, 1.0f), AbstractC0379e.m1085w(m1080p3, m1080p2, 0.54f), AbstractC0379e.m1085w(m1080p3, m1080p2, 0.38f), AbstractC0379e.m1085w(m1080p3, m1080p2, 0.38f)});
        }
        return this.f1573e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1574f && AbstractC0428b.m1162a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f1574f = z2;
        if (z2) {
            AbstractC0428b.m1164c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0428b.m1164c(this, null);
        }
    }
}
