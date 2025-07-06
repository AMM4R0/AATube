package p010D0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.AbstractC0580g;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AnimationAnimationListenerC0654d;
import androidx.fragment.app.C0638E;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0662l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.carwizard.p075li.youtube.MainActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.appmetrica.analytics.impl.C1842f9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2492i;
import p006C.C0055g;
import p016F1.AbstractC0133a;
import p016F1.C0135c;
import p016F1.C0136d;
import p018G1.C0169t;
import p026J0.C0226g;
import p026J0.C0227h;
import p028K.AbstractC0283P;
import p044P0.C0422f;
import p046Q.C0427a;
import p046Q.ViewOnTouchListenerC0433g;
import p055T.C0516e;
import p080e0.AbstractC0820C;
import p080e0.AbstractC0838V;
import p080e0.C0847c;
import p080e0.C0853f;
import p080e0.C0855g;
import p080e0.C0856h;
import p080e0.C0859k;
import p080e0.RunnableC0845b;
import p084g.C0909e;
import p104l.C2579j;
import p104l.C2582k;
import p104l.C2622x0;
import p124s0.C2731b;
import p127t0.InterfaceC2766c;
import p130u0.AbstractDialogInterfaceOnCancelListenerC2785i;
import p130u0.BinderC2796t;
import p130u0.C2787k;

/* renamed from: D0.e */
/* loaded from: classes.dex */
public final class RunnableC0107e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f334a;

    /* renamed from: b */
    public final Object f335b;

    public /* synthetic */ RunnableC0107e(int r12, Object obj) {
        this.f334a = r12;
        this.f335b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j2;
        int r4;
        C2582k c2582k;
        switch (this.f334a) {
            case 0:
                C0109g c0109g = (C0109g) this.f335b;
                long j3 = C0109g.m342F((Context) c0109g.f338b).getLong("app_set_id_last_used_time", -1L);
                long j4 = j3 != -1 ? j3 + 33696000000L : -1L;
                if (j4 == -1 || System.currentTimeMillis() <= j4) {
                    return;
                }
                Context context = (Context) c0109g.f338b;
                if (!C0109g.m342F(context).edit().remove(CommonUrlParts.APP_SET_ID).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 1:
                break;
            case 2:
                synchronized (((C0227h) this.f335b).f661c) {
                    try {
                        C0226g c0226g = ((C0227h) this.f335b).f662d;
                        if (c0226g != null) {
                            c0226g.m614b();
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                C0422f c0422f = (C0422f) this.f335b;
                c0422f.f1094c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0422f.f1096e;
                C0516e c0516e = bottomSheetBehavior.f2761M;
                if (c0516e != null && c0516e.m1337f()) {
                    c0422f.m1156b(c0422f.f1093b);
                    return;
                } else {
                    if (bottomSheetBehavior.f2760L == 2) {
                        bottomSheetBehavior.m2061C(c0422f.f1093b);
                        return;
                    }
                    return;
                }
            case 4:
                ViewOnTouchListenerC0433g viewOnTouchListenerC0433g = (ViewOnTouchListenerC0433g) this.f335b;
                if (viewOnTouchListenerC0433g.f1124o) {
                    boolean z2 = viewOnTouchListenerC0433g.f1122m;
                    C0427a c0427a = viewOnTouchListenerC0433g.f1110a;
                    if (z2) {
                        viewOnTouchListenerC0433g.f1122m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0427a.f1104e = currentAnimationTimeMillis;
                        c0427a.f1106g = -1L;
                        c0427a.f1105f = currentAnimationTimeMillis;
                        c0427a.f1107h = 0.5f;
                    }
                    if ((c0427a.f1106g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0427a.f1106g + c0427a.f1108i) || !viewOnTouchListenerC0433g.m1179e()) {
                        viewOnTouchListenerC0433g.f1124o = false;
                        return;
                    }
                    boolean z3 = viewOnTouchListenerC0433g.f1123n;
                    ListView listView = viewOnTouchListenerC0433g.f1112c;
                    if (z3) {
                        viewOnTouchListenerC0433g.f1123n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (c0427a.f1105f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float m1161a = c0427a.m1161a(currentAnimationTimeMillis2);
                    long j5 = currentAnimationTimeMillis2 - c0427a.f1105f;
                    c0427a.f1105f = currentAnimationTimeMillis2;
                    viewOnTouchListenerC0433g.f1126q.scrollListBy((int) (j5 * ((m1161a * 4.0f) + ((-4.0f) * m1161a * m1161a)) * c0427a.f1103d));
                    WeakHashMap weakHashMap = AbstractC0283P.f842a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                ((C0516e) this.f335b).m1345n(0);
                return;
            case 6:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!TextUtils.equals(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
            case 7:
                AnimationAnimationListenerC0654d animationAnimationListenerC0654d = (AnimationAnimationListenerC0654d) this.f335b;
                animationAnimationListenerC0654d.f2252a.endViewTransition(animationAnimationListenerC0654d.f2253b);
                animationAnimationListenerC0654d.f2254c.m1738d();
                return;
            case 8:
                DialogInterfaceOnCancelListenerC0662l dialogInterfaceOnCancelListenerC0662l = (DialogInterfaceOnCancelListenerC0662l) this.f335b;
                dialogInterfaceOnCancelListenerC0662l.f2270S.onDismiss(dialogInterfaceOnCancelListenerC0662l.f2278a0);
                return;
            case 9:
                ((C0638E) this.f335b).m1697w(true);
                return;
            case 10:
                C0859k c0859k = (C0859k) this.f335b;
                int r2 = c0859k.f3536A;
                ValueAnimator valueAnimator = c0859k.f3563z;
                if (r2 != 1) {
                    r4 = 2;
                    if (r2 != 2) {
                        return;
                    }
                } else {
                    r4 = 2;
                    valueAnimator.cancel();
                }
                c0859k.f3536A = 3;
                float[] fArr = new float[r4];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 11:
                RecyclerView recyclerView = (RecyclerView) this.f335b;
                AbstractC0820C abstractC0820C = recyclerView.f2493H;
                if (abstractC0820C != null) {
                    C0856h c0856h = (C0856h) abstractC0820C;
                    ArrayList arrayList = c0856h.f3520h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0856h.f3522j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0856h.f3523k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0856h.f3521i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j6 = c0856h.f3352d;
                            if (hasNext) {
                                AbstractC0838V abstractC0838V = (AbstractC0838V) it.next();
                                View view = abstractC0838V.f3424a;
                                ViewPropertyAnimator animate = view.animate();
                                c0856h.f3529q.add(abstractC0838V);
                                animate.setDuration(j6).alpha(0.0f).setListener(new C0847c(c0856h, abstractC0838V, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0856h.f3525m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0845b runnableC0845b = new RunnableC0845b(c0856h, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0845b.run();
                                    } else {
                                        View view2 = ((C0855g) arrayList5.get(0)).f3513a.f3424a;
                                        WeakHashMap weakHashMap2 = AbstractC0283P.f842a;
                                        view2.postOnAnimationDelayed(runnableC0845b, j6);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0856h.f3526n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0845b runnableC0845b2 = new RunnableC0845b(c0856h, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0845b2.run();
                                    } else {
                                        View view3 = ((C0853f) arrayList6.get(0)).f3503a.f3424a;
                                        WeakHashMap weakHashMap3 = AbstractC0283P.f842a;
                                        view3.postOnAnimationDelayed(runnableC0845b2, j6);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0856h.f3524l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0845b runnableC0845b3 = new RunnableC0845b(c0856h, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0845b3.run();
                                    } else {
                                        if (isEmpty) {
                                            j6 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0856h.f3353e : 0L, !isEmpty3 ? c0856h.f3354f : 0L) + j6;
                                        View view4 = ((AbstractC0838V) arrayList7.get(0)).f3424a;
                                        WeakHashMap weakHashMap4 = AbstractC0283P.f842a;
                                        view4.postOnAnimationDelayed(runnableC0845b3, max);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.f2526i0 = false;
                return;
            case 12:
                ((StaggeredGridLayoutManager) this.f335b).m1947B0();
                return;
            case 13:
                C0909e c0909e = (C0909e) this.f335b;
                c0909e.m2452a(true);
                c0909e.invalidateSelf();
                return;
            case 14:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f335b).f3022c.f3883g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 15:
                C2622x0 c2622x0 = (C2622x0) this.f335b;
                c2622x0.f8532l = null;
                c2622x0.drawableStateChanged();
                return;
            case 16:
                ActionMenuView actionMenuView = ((Toolbar) this.f335b).f1934a;
                if (actionMenuView == null || (c2582k = actionMenuView.f1808t) == null) {
                    return;
                }
                c2582k.m5039l();
                return;
            case 17:
                MainActivity mainActivity = (MainActivity) this.f335b;
                if (mainActivity.isDestroyed() || mainActivity.isFinishing()) {
                    Handler m2022v = mainActivity.m2022v();
                    if (m2022v != null) {
                        m2022v.removeCallbacks(this);
                        return;
                    }
                    return;
                }
                WebView webView = mainActivity.f2666v;
                if (webView != null) {
                    webView.evaluateJavascript("var video = document.getElementsByTagName('video')[0];if (video) {ytAA.hasVideoTag(!video.paused, video.currentTime, video.duration);} else {ytAA.noVideoTag();}", null);
                }
                Handler m2022v2 = mainActivity.m2022v();
                if (m2022v2 != null) {
                    m2022v2.postDelayed(this, 1000L);
                    return;
                }
                return;
            case 18:
                ((C2787k) this.f335b).m5405h();
                return;
            case C1842f9.f6208E /* 19 */:
                InterfaceC2766c interfaceC2766c = ((C2787k) ((C2579j) this.f335b).f8381a).f9103c;
                interfaceC2766c.mo2037i(interfaceC2766c.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case C1842f9.f6209F /* 20 */:
                ((BinderC2796t) this.f335b).f9145i.m5415b(new C2731b(4));
                return;
            default:
                throw null;
        }
        while (true) {
            C0136d c0136d = (C0136d) this.f335b;
            c0136d.f397c.lock();
            try {
                AbstractC0133a m435c = c0136d.m435c();
                if (m435c == null) {
                    return;
                }
                Logger logger = c0136d.f396b;
                C0135c c0135c = m435c.f383c;
                AbstractC2492i.m4912b(c0135c);
                boolean isLoggable = logger.isLoggable(Level.FINE);
                C0136d c0136d2 = c0135c.f387a;
                if (isLoggable) {
                    C0055g c0055g = c0136d2.f395a;
                    j2 = System.nanoTime();
                    AbstractC0580g.m1440d(logger, m435c, c0135c, "starting");
                } else {
                    j2 = -1;
                }
                try {
                    C0136d.m433a(c0136d, m435c);
                    if (isLoggable) {
                        C0055g c0055g2 = c0136d2.f395a;
                        AbstractC0580g.m1440d(logger, m435c, c0135c, "finished run in ".concat(AbstractC0580g.m1447l(System.nanoTime() - j2)));
                    }
                } catch (Throwable th) {
                    try {
                        c0136d.f397c.lock();
                        try {
                            ((ThreadPoolExecutor) c0136d.f395a.f107b).execute(this);
                            throw th;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        if (isLoggable) {
                            C0055g c0055g3 = c0136d2.f395a;
                            AbstractC0580g.m1440d(logger, m435c, c0135c, "failed a run in ".concat(AbstractC0580g.m1447l(System.nanoTime() - j2)));
                        }
                        throw th2;
                    }
                }
            } finally {
            }
        }
    }

    public RunnableC0107e(AbstractDialogInterfaceOnCancelListenerC2785i abstractDialogInterfaceOnCancelListenerC2785i, C0169t c0169t) {
        this.f334a = 21;
        this.f335b = c0169t;
    }
}
