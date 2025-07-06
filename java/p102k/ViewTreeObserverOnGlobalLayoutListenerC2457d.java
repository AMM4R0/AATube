package p102k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p028K.AbstractC0283P;
import p104l.AbstractC2517I;
import p104l.AbstractC2519J;
import p104l.C2529O;
import p104l.C2532P0;
import p104l.C2536S;

/* renamed from: k.d */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2457d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ int f8016a;

    /* renamed from: b */
    public final /* synthetic */ Object f8017b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2457d(int r12, Object obj) {
        this.f8016a = r12;
        this.f8017b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object obj = this.f8017b;
        switch (this.f8016a) {
            case 0:
                ViewOnKeyListenerC2460g viewOnKeyListenerC2460g = (ViewOnKeyListenerC2460g) obj;
                if (viewOnKeyListenerC2460g.mo4798b()) {
                    ArrayList arrayList = viewOnKeyListenerC2460g.f8031h;
                    if (arrayList.size() > 0 && !((C2459f) arrayList.get(0)).f8022a.f8253y) {
                        View view = viewOnKeyListenerC2460g.f8038o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C2459f) it.next()).f8022a.mo4799f();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC2460g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC2452E viewOnKeyListenerC2452E = (ViewOnKeyListenerC2452E) obj;
                if (viewOnKeyListenerC2452E.mo4798b()) {
                    C2532P0 c2532p0 = viewOnKeyListenerC2452E.f7983h;
                    if (!c2532p0.f8253y) {
                        View view2 = viewOnKeyListenerC2452E.f7988m;
                        if (view2 != null && view2.isShown()) {
                            c2532p0.mo4799f();
                            break;
                        } else {
                            viewOnKeyListenerC2452E.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C2536S c2536s = (C2536S) obj;
                if (!c2536s.getInternalPopup().mo4956b()) {
                    c2536s.f8282f.mo4958e(AbstractC2519J.m4942b(c2536s), AbstractC2519J.m4941a(c2536s));
                }
                ViewTreeObserver viewTreeObserver = c2536s.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    AbstractC2517I.m4940a(viewTreeObserver, this);
                    break;
                }
                break;
            default:
                C2529O c2529o = (C2529O) obj;
                C2536S c2536s2 = c2529o.f8267H;
                c2529o.getClass();
                WeakHashMap weakHashMap = AbstractC0283P.f842a;
                if (!c2536s2.isAttachedToWindow() || !c2536s2.getGlobalVisibleRect(c2529o.f8265F)) {
                    c2529o.dismiss();
                    break;
                } else {
                    c2529o.m4970s();
                    c2529o.mo4799f();
                    break;
                }
                break;
        }
    }
}
