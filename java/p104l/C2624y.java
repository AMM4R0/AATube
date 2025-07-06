package p104l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.support.v4.media.session.AbstractC0580g;
import android.util.AttributeSet;
import android.widget.ImageView;
import p003B.C0030d;
import p008C1.C0077i;

/* renamed from: l.y */
/* loaded from: classes.dex */
public class C2624y extends ImageView {

    /* renamed from: a */
    public final C2597p f8540a;

    /* renamed from: b */
    public final C0030d f8541b;

    /* renamed from: c */
    public boolean f8542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2624y(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        AbstractC2581j1.m5035a(context);
        this.f8542c = false;
        AbstractC2578i1.m5030a(this, getContext());
        C2597p c2597p = new C2597p(this);
        this.f8540a = c2597p;
        c2597p.m5058d(attributeSet, r3);
        C0030d c0030d = new C0030d(this);
        this.f8541b = c0030d;
        c0030d.m181d(attributeSet, r3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2597p c2597p = this.f8540a;
        if (c2597p != null) {
            c2597p.m5055a();
        }
        C0030d c0030d = this.f8541b;
        if (c0030d != null) {
            c0030d.m179a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2597p c2597p = this.f8540a;
        if (c2597p != null) {
            return c2597p.m5056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2597p c2597p = this.f8540a;
        if (c2597p != null) {
            return c2597p.m5057c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0077i c0077i;
        C0030d c0030d = this.f8541b;
        if (c0030d == null || (c0077i = (C0077i) c0030d.f49d) == null) {
            return null;
        }
        return (ColorStateList) c0077i.f197c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0077i c0077i;
        C0030d c0030d = this.f8541b;
        if (c0030d == null || (c0077i = (C0077i) c0030d.f49d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0077i.f198d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f8541b.f48c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2597p c2597p = this.f8540a;
        if (c2597p != null) {
            c2597p.m5059e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C2597p c2597p = this.f8540a;
        if (c2597p != null) {
            c2597p.m5060f(r2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0030d c0030d = this.f8541b;
        if (c0030d != null) {
            c0030d.m179a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0030d c0030d = this.f8541b;
        if (c0030d != null && drawable != null && !this.f8542c) {
            c0030d.f47b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0030d != null) {
            c0030d.m179a();
            if (this.f8542c) {
                return;
            }
            ImageView imageView = (ImageView) c0030d.f48c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0030d.f47b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int r12) {
        super.setImageLevel(r12);
        this.f8542c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r4) {
        C0030d c0030d = this.f8541b;
        if (c0030d != null) {
            ImageView imageView = (ImageView) c0030d.f48c;
            if (r4 != 0) {
                Drawable m1449n = AbstractC0580g.m1449n(imageView.getContext(), r4);
                if (m1449n != null) {
                    AbstractC2604r0.m5065a(m1449n);
                }
                imageView.setImageDrawable(m1449n);
            } else {
                imageView.setImageDrawable(null);
            }
            c0030d.m179a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0030d c0030d = this.f8541b;
        if (c0030d != null) {
            c0030d.m179a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2597p c2597p = this.f8540a;
        if (c2597p != null) {
            c2597p.m5062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2597p c2597p = this.f8540a;
        if (c2597p != null) {
            c2597p.m5063i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0030d c0030d = this.f8541b;
        if (c0030d != null) {
            if (((C0077i) c0030d.f49d) == null) {
                c0030d.f49d = new C0077i();
            }
            C0077i c0077i = (C0077i) c0030d.f49d;
            c0077i.f197c = colorStateList;
            c0077i.f196b = true;
            c0030d.m179a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0030d c0030d = this.f8541b;
        if (c0030d != null) {
            if (((C0077i) c0030d.f49d) == null) {
                c0030d.f49d = new C0077i();
            }
            C0077i c0077i = (C0077i) c0030d.f49d;
            c0077i.f198d = mode;
            c0077i.f195a = true;
            c0030d.m179a();
        }
    }
}
