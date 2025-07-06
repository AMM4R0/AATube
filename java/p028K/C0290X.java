package p028K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import p009D.AbstractC0095a;
import p053S0.C0499a;
import p053S0.C0501c;
import p088h1.C0930j;
import p090i0.AbstractC0967m;
import p100j0.C2434e;

/* renamed from: K.X */
/* loaded from: classes.dex */
public final class C0290X extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f851a;

    /* renamed from: b */
    public final /* synthetic */ Object f852b;

    public /* synthetic */ C0290X(int r12, Object obj) {
        this.f851a = r12;
        this.f852b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f851a) {
            case 0:
                ((InterfaceC0292Z) this.f852b).mo801b();
                break;
            case 5:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f852b;
                actionBarOverlayLayout.f1800w = null;
                actionBarOverlayLayout.f1788k = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f851a) {
            case 0:
                ((InterfaceC0292Z) this.f852b).mo800a();
                break;
            case 1:
                ((HideBottomViewOnScrollBehavior) this.f852b).f2741h = null;
                break;
            case 2:
                C0930j c0930j = (C0930j) this.f852b;
                c0930j.m2507q();
                c0930j.f3874r.start();
                break;
            case 3:
                ((AbstractC0967m) this.f852b).m2575m();
                animator.removeListener(this);
                break;
            case 4:
                C2434e c2434e = (C2434e) this.f852b;
                ArrayList arrayList = new ArrayList(c2434e.f7906e);
                int size = arrayList.size();
                for (int r2 = 0; r2 < size; r2++) {
                    ColorStateList colorStateList = ((C0499a) arrayList.get(r2)).f1265b.f1281o;
                    if (colorStateList != null) {
                        AbstractC0095a.m319h(c2434e, colorStateList);
                    }
                }
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f852b;
                actionBarOverlayLayout.f1800w = null;
                actionBarOverlayLayout.f1788k = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f851a) {
            case 0:
                ((InterfaceC0292Z) this.f852b).mo802c();
                break;
            case 4:
                C2434e c2434e = (C2434e) this.f852b;
                ArrayList arrayList = new ArrayList(c2434e.f7906e);
                int size = arrayList.size();
                for (int r2 = 0; r2 < size; r2++) {
                    C0501c c0501c = ((C0499a) arrayList.get(r2)).f1265b;
                    ColorStateList colorStateList = c0501c.f1281o;
                    if (colorStateList != null) {
                        AbstractC0095a.m318g(c2434e, colorStateList.getColorForState(c0501c.f1285s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0290X(InterfaceC0292Z interfaceC0292Z, View view) {
        this.f851a = 0;
        this.f852b = interfaceC0292Z;
    }
}
