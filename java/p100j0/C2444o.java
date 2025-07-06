package p100j0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: j0.o */
/* loaded from: classes.dex */
public final class C2444o extends Drawable.ConstantState {

    /* renamed from: a */
    public int f7952a;

    /* renamed from: b */
    public C2443n f7953b;

    /* renamed from: c */
    public ColorStateList f7954c;

    /* renamed from: d */
    public PorterDuff.Mode f7955d;

    /* renamed from: e */
    public boolean f7956e;

    /* renamed from: f */
    public Bitmap f7957f;

    /* renamed from: g */
    public ColorStateList f7958g;

    /* renamed from: h */
    public PorterDuff.Mode f7959h;

    /* renamed from: i */
    public int f7960i;

    /* renamed from: j */
    public boolean f7961j;

    /* renamed from: k */
    public boolean f7962k;

    /* renamed from: l */
    public Paint f7963l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f7952a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C2446q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C2446q(this);
    }
}
