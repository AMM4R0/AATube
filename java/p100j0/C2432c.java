package p100j0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import p112o.C2682b;

/* renamed from: j0.c */
/* loaded from: classes.dex */
public final class C2432c extends Drawable.ConstantState {

    /* renamed from: a */
    public C2446q f7897a;

    /* renamed from: b */
    public AnimatorSet f7898b;

    /* renamed from: c */
    public ArrayList f7899c;

    /* renamed from: d */
    public C2682b f7900d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
