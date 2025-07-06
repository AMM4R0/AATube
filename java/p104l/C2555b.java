package p104l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: l.b */
/* loaded from: classes.dex */
public final class C2555b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f8328a;

    public C2555b(ActionBarContainer actionBarContainer) {
        this.f8328a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f8328a;
        if (actionBarContainer.f1753g) {
            Drawable drawable = actionBarContainer.f1752f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1750d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f1751e;
        if (drawable3 == null || !actionBarContainer.f1754h) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f8328a;
        if (actionBarContainer.f1753g) {
            if (actionBarContainer.f1752f != null) {
                actionBarContainer.f1750d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f1750d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r12) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
