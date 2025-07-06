package p104l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.carwizard.p075li.youtube.R;

/* renamed from: l.F */
/* loaded from: classes.dex */
public final class C2511F extends SeekBar {

    /* renamed from: a */
    public final C2513G f8213a;

    public C2511F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC2578i1.m5030a(this, getContext());
        C2513G c2513g = new C2513G(this);
        this.f8213a = c2513g;
        c2513g.mo4924b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2513G c2513g = this.f8213a;
        Drawable drawable = c2513g.f8215f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C2511F c2511f = c2513g.f8214e;
        if (drawable.setState(c2511f.getDrawableState())) {
            c2511f.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8213a.f8215f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f8213a.m4939g(canvas);
    }
}
