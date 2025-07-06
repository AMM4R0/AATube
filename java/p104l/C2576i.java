package p104l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0580g;
import com.carwizard.p075li.youtube.R;
import p009D.AbstractC0095a;
import p102k.C2455b;

/* renamed from: l.i */
/* loaded from: classes.dex */
public final class C2576i extends C2624y implements InterfaceC2585l {

    /* renamed from: d */
    public final /* synthetic */ C2582k f8373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2576i(C2582k c2582k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f8373d = c2582k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0580g.m1459z(this, getContentDescription());
        setOnTouchListener(new C2455b(this, this));
    }

    @Override // p104l.InterfaceC2585l
    /* renamed from: a */
    public final boolean mo1486a() {
        return false;
    }

    @Override // p104l.InterfaceC2585l
    /* renamed from: b */
    public final boolean mo1487b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f8373d.m5039l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int r5, int r6, int r7, int r8) {
        boolean frame = super.setFrame(r5, r6, r7, r8);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC0095a.m317f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
