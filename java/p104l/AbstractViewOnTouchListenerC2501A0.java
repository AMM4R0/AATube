package p104l;

import android.view.View;
import android.view.ViewConfiguration;
import p102k.InterfaceC2451D;

/* renamed from: l.A0 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC2501A0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final float f8176a;

    /* renamed from: b */
    public final int f8177b;

    /* renamed from: c */
    public final int f8178c;

    /* renamed from: d */
    public final View f8179d;

    /* renamed from: e */
    public RunnableC2628z0 f8180e;

    /* renamed from: f */
    public RunnableC2628z0 f8181f;

    /* renamed from: g */
    public boolean f8182g;

    /* renamed from: h */
    public int f8183h;

    /* renamed from: i */
    public final int[] f8184i = new int[2];

    public AbstractViewOnTouchListenerC2501A0(View view) {
        this.f8179d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f8176a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f8177b = tapTimeout;
        this.f8178c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void m4921a() {
        RunnableC2628z0 runnableC2628z0 = this.f8181f;
        View view = this.f8179d;
        if (runnableC2628z0 != null) {
            view.removeCallbacks(runnableC2628z0);
        }
        RunnableC2628z0 runnableC2628z02 = this.f8180e;
        if (runnableC2628z02 != null) {
            view.removeCallbacks(runnableC2628z02);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC2451D mo4823b();

    /* renamed from: c */
    public abstract boolean mo4824c();

    /* renamed from: d */
    public boolean mo4825d() {
        InterfaceC2451D mo4823b = mo4823b();
        if (mo4823b == null || !mo4823b.mo4798b()) {
            return true;
        }
        mo4823b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l.AbstractViewOnTouchListenerC2501A0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f8182g = false;
        this.f8183h = -1;
        RunnableC2628z0 runnableC2628z0 = this.f8180e;
        if (runnableC2628z0 != null) {
            this.f8179d.removeCallbacks(runnableC2628z0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
