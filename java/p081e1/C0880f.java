package p081e1;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;
import p063X0.C0541a;

/* renamed from: e1.f */
/* loaded from: classes.dex */
public class C0880f extends Drawable.ConstantState {

    /* renamed from: a */
    public C0885k f3642a;

    /* renamed from: b */
    public C0541a f3643b;

    /* renamed from: c */
    public ColorStateList f3644c;

    /* renamed from: d */
    public ColorStateList f3645d;

    /* renamed from: e */
    public ColorStateList f3646e;

    /* renamed from: f */
    public PorterDuff.Mode f3647f;

    /* renamed from: g */
    public Rect f3648g;

    /* renamed from: h */
    public final float f3649h;

    /* renamed from: i */
    public float f3650i;

    /* renamed from: j */
    public float f3651j;

    /* renamed from: k */
    public int f3652k;

    /* renamed from: l */
    public float f3653l;

    /* renamed from: m */
    public float f3654m;

    /* renamed from: n */
    public int f3655n;

    /* renamed from: o */
    public int f3656o;

    /* renamed from: p */
    public final Paint.Style f3657p;

    public C0880f(C0885k c0885k) {
        this.f3644c = null;
        this.f3645d = null;
        this.f3646e = null;
        this.f3647f = PorterDuff.Mode.SRC_IN;
        this.f3648g = null;
        this.f3649h = 1.0f;
        this.f3650i = 1.0f;
        this.f3652k = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f3653l = 0.0f;
        this.f3654m = 0.0f;
        this.f3655n = 0;
        this.f3656o = 0;
        this.f3657p = Paint.Style.FILL_AND_STROKE;
        this.f3642a = c0885k;
        this.f3643b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C0881g c0881g = new C0881g(this);
        c0881g.f3663e = true;
        return c0881g;
    }

    public C0880f(C0880f c0880f) {
        this.f3644c = null;
        this.f3645d = null;
        this.f3646e = null;
        this.f3647f = PorterDuff.Mode.SRC_IN;
        this.f3648g = null;
        this.f3649h = 1.0f;
        this.f3650i = 1.0f;
        this.f3652k = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f3653l = 0.0f;
        this.f3654m = 0.0f;
        this.f3655n = 0;
        this.f3656o = 0;
        this.f3657p = Paint.Style.FILL_AND_STROKE;
        this.f3642a = c0880f.f3642a;
        this.f3643b = c0880f.f3643b;
        this.f3651j = c0880f.f3651j;
        this.f3644c = c0880f.f3644c;
        this.f3645d = c0880f.f3645d;
        this.f3647f = c0880f.f3647f;
        this.f3646e = c0880f.f3646e;
        this.f3652k = c0880f.f3652k;
        this.f3649h = c0880f.f3649h;
        this.f3656o = c0880f.f3656o;
        this.f3650i = c0880f.f3650i;
        this.f3653l = c0880f.f3653l;
        this.f3654m = c0880f.f3654m;
        this.f3655n = c0880f.f3655n;
        this.f3657p = c0880f.f3657p;
        if (c0880f.f3648g != null) {
            this.f3648g = new Rect(c0880f.f3648g);
        }
    }
}
