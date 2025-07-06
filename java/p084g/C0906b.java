package p084g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import p009D.AbstractC0095a;
import p009D.AbstractC0096b;
import p112o.C2685e;
import p112o.C2692l;

/* renamed from: g.b */
/* loaded from: classes.dex */
public final class C0906b extends Drawable.ConstantState {

    /* renamed from: A */
    public boolean f3758A;

    /* renamed from: B */
    public ColorFilter f3759B;

    /* renamed from: C */
    public boolean f3760C;

    /* renamed from: D */
    public ColorStateList f3761D;

    /* renamed from: E */
    public PorterDuff.Mode f3762E;

    /* renamed from: F */
    public boolean f3763F;

    /* renamed from: G */
    public boolean f3764G;

    /* renamed from: H */
    public int[][] f3765H;

    /* renamed from: I */
    public C2685e f3766I;

    /* renamed from: J */
    public C2692l f3767J;

    /* renamed from: a */
    public final C0909e f3768a;

    /* renamed from: b */
    public Resources f3769b;

    /* renamed from: c */
    public int f3770c;

    /* renamed from: d */
    public int f3771d;

    /* renamed from: e */
    public int f3772e;

    /* renamed from: f */
    public SparseArray f3773f;

    /* renamed from: g */
    public Drawable[] f3774g;

    /* renamed from: h */
    public int f3775h;

    /* renamed from: i */
    public boolean f3776i;

    /* renamed from: j */
    public boolean f3777j;

    /* renamed from: k */
    public Rect f3778k;

    /* renamed from: l */
    public boolean f3779l;

    /* renamed from: m */
    public boolean f3780m;

    /* renamed from: n */
    public int f3781n;

    /* renamed from: o */
    public int f3782o;

    /* renamed from: p */
    public int f3783p;

    /* renamed from: q */
    public int f3784q;

    /* renamed from: r */
    public boolean f3785r;

    /* renamed from: s */
    public int f3786s;

    /* renamed from: t */
    public boolean f3787t;

    /* renamed from: u */
    public boolean f3788u;

    /* renamed from: v */
    public boolean f3789v;

    /* renamed from: w */
    public boolean f3790w;

    /* renamed from: x */
    public int f3791x;

    /* renamed from: y */
    public int f3792y;

    /* renamed from: z */
    public int f3793z;

    public C0906b(C0906b c0906b, C0909e c0909e, Resources resources) {
        this.f3776i = false;
        this.f3779l = false;
        this.f3790w = true;
        this.f3792y = 0;
        this.f3793z = 0;
        this.f3768a = c0909e;
        this.f3769b = resources != null ? resources : c0906b != null ? c0906b.f3769b : null;
        int r2 = c0906b != null ? c0906b.f3770c : 0;
        int r3 = C0909e.f3799t;
        r2 = resources != null ? resources.getDisplayMetrics().densityDpi : r2;
        r2 = r2 == 0 ? 160 : r2;
        this.f3770c = r2;
        if (c0906b != null) {
            this.f3771d = c0906b.f3771d;
            this.f3772e = c0906b.f3772e;
            this.f3788u = true;
            this.f3789v = true;
            this.f3776i = c0906b.f3776i;
            this.f3779l = c0906b.f3779l;
            this.f3790w = c0906b.f3790w;
            this.f3791x = c0906b.f3791x;
            this.f3792y = c0906b.f3792y;
            this.f3793z = c0906b.f3793z;
            this.f3758A = c0906b.f3758A;
            this.f3759B = c0906b.f3759B;
            this.f3760C = c0906b.f3760C;
            this.f3761D = c0906b.f3761D;
            this.f3762E = c0906b.f3762E;
            this.f3763F = c0906b.f3763F;
            this.f3764G = c0906b.f3764G;
            if (c0906b.f3770c == r2) {
                if (c0906b.f3777j) {
                    this.f3778k = c0906b.f3778k != null ? new Rect(c0906b.f3778k) : null;
                    this.f3777j = true;
                }
                if (c0906b.f3780m) {
                    this.f3781n = c0906b.f3781n;
                    this.f3782o = c0906b.f3782o;
                    this.f3783p = c0906b.f3783p;
                    this.f3784q = c0906b.f3784q;
                    this.f3780m = true;
                }
            }
            if (c0906b.f3785r) {
                this.f3786s = c0906b.f3786s;
                this.f3785r = true;
            }
            if (c0906b.f3787t) {
                this.f3787t = true;
            }
            Drawable[] drawableArr = c0906b.f3774g;
            this.f3774g = new Drawable[drawableArr.length];
            this.f3775h = c0906b.f3775h;
            SparseArray sparseArray = c0906b.f3773f;
            if (sparseArray != null) {
                this.f3773f = sparseArray.clone();
            } else {
                this.f3773f = new SparseArray(this.f3775h);
            }
            int r7 = this.f3775h;
            for (int r12 = 0; r12 < r7; r12++) {
                Drawable drawable = drawableArr[r12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f3773f.put(r12, constantState);
                    } else {
                        this.f3774g[r12] = drawableArr[r12];
                    }
                }
            }
        } else {
            this.f3774g = new Drawable[10];
            this.f3775h = 0;
        }
        if (c0906b != null) {
            this.f3765H = c0906b.f3765H;
        } else {
            this.f3765H = new int[this.f3774g.length][];
        }
        if (c0906b != null) {
            this.f3766I = c0906b.f3766I;
            this.f3767J = c0906b.f3767J;
        } else {
            this.f3766I = new C2685e();
            this.f3767J = new C2692l();
        }
    }

    /* renamed from: a */
    public final int m2446a(Drawable drawable) {
        int r02 = this.f3775h;
        if (r02 >= this.f3774g.length) {
            int r12 = r02 + 10;
            Drawable[] drawableArr = new Drawable[r12];
            Drawable[] drawableArr2 = this.f3774g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, r02);
            }
            this.f3774g = drawableArr;
            int[][] r13 = new int[r12][];
            System.arraycopy(this.f3765H, 0, r13, 0, r02);
            this.f3765H = r13;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f3768a);
        this.f3774g[r02] = drawable;
        this.f3775h++;
        this.f3772e = drawable.getChangingConfigurations() | this.f3772e;
        this.f3785r = false;
        this.f3787t = false;
        this.f3778k = null;
        this.f3777j = false;
        this.f3780m = false;
        this.f3788u = false;
        return r02;
    }

    /* renamed from: b */
    public final void m2447b() {
        this.f3780m = true;
        m2448c();
        int r02 = this.f3775h;
        Drawable[] drawableArr = this.f3774g;
        this.f3782o = -1;
        this.f3781n = -1;
        this.f3784q = 0;
        this.f3783p = 0;
        for (int r2 = 0; r2 < r02; r2++) {
            Drawable drawable = drawableArr[r2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f3781n) {
                this.f3781n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f3782o) {
                this.f3782o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f3783p) {
                this.f3783p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f3784q) {
                this.f3784q = minimumHeight;
            }
        }
    }

    /* renamed from: c */
    public final void m2448c() {
        SparseArray sparseArray = this.f3773f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int r12 = 0; r12 < size; r12++) {
                int keyAt = this.f3773f.keyAt(r12);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f3773f.valueAt(r12);
                Drawable[] drawableArr = this.f3774g;
                Drawable newDrawable = constantState.newDrawable(this.f3769b);
                AbstractC0096b.m322b(newDrawable, this.f3791x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f3768a);
                drawableArr[keyAt] = mutate;
            }
            this.f3773f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int r02 = this.f3775h;
        Drawable[] drawableArr = this.f3774g;
        for (int r3 = 0; r3 < r02; r3++) {
            Drawable drawable = drawableArr[r3];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f3773f.get(r3);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (AbstractC0095a.m313b(drawable)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m2449d(int r5) {
        int indexOfKey;
        Drawable drawable = this.f3774g[r5];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f3773f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(r5)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f3773f.valueAt(indexOfKey)).newDrawable(this.f3769b);
        AbstractC0096b.m322b(newDrawable, this.f3791x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f3768a);
        this.f3774g[r5] = mutate;
        this.f3773f.removeAt(indexOfKey);
        if (this.f3773f.size() == 0) {
            this.f3773f = null;
        }
        return mutate;
    }

    /* renamed from: e */
    public final int m2450e(int[] r5) {
        int[][] r02 = this.f3765H;
        int r12 = this.f3775h;
        for (int r2 = 0; r2 < r12; r2++) {
            if (StateSet.stateSetMatches(r02[r2], r5)) {
                return r2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3771d | this.f3772e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0909e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0909e(this, resources);
    }
}
