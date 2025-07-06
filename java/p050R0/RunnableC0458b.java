package p050R0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.support.v4.media.session.AbstractC0580g;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import androidx.activity.ExecutorC0591j;
import androidx.emoji2.text.C0626p;
import androidx.lifecycle.C0678B;
import androidx.lifecycle.C0710t;
import androidx.lifecycle.EnumC0702l;
import com.carwizard.p075li.youtube.MainActivity;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.AbstractC0775e;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import kotlin.jvm.internal.AbstractC2492i;
import p000A.AbstractC0001b;
import p006C.AbstractC0056h;
import p008C1.C0080l;
import p010D0.RunnableC0106d;
import p017G.AbstractC0149m;
import p019H.C0179i;
import p036M1.AbstractC0387m;
import p044P0.C0422f;
import p055T.C0516e;
import p079e.AbstractActivityC0798g;
import p079e.DialogC0797f;
import p088h1.C0924d;
import p088h1.C0930j;
import p107m0.C2642d;
import p124s0.C2738i;
import p144z.AbstractC2904b;
import p144z.C2903a;

/* renamed from: R0.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0458b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1177a;

    /* renamed from: b */
    public final /* synthetic */ Object f1178b;

    public /* synthetic */ RunnableC0458b(int r12, Object obj) {
        this.f1177a = r12;
        this.f1178b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f1177a) {
            case 0:
                ((CarouselLayoutManager) this.f1178b).m2296l0();
                return;
            case 1:
                View view = (View) this.f1178b;
                ((InputMethodManager) AbstractC0001b.m4b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 2:
                ((AbstractActivityC0798g) this.f1178b).invalidateOptionsMenu();
                return;
            case 3:
                ExecutorC0591j executorC0591j = (ExecutorC0591j) this.f1178b;
                Runnable runnable = executorC0591j.f1672b;
                if (runnable != null) {
                    runnable.run();
                    executorC0591j.f1672b = null;
                    return;
                }
                return;
            case 4:
                DialogC0797f.m2193a((DialogC0797f) this.f1178b);
                return;
            case 5:
                C0626p c0626p = (C0626p) this.f1178b;
                synchronized (c0626p.f2097d) {
                    try {
                        if (c0626p.f2101h == null) {
                            return;
                        }
                        try {
                            C0179i m1643d = c0626p.m1643d();
                            int r4 = m1643d.f565e;
                            if (r4 == 2) {
                                synchronized (c0626p.f2097d) {
                                }
                            }
                            if (r4 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + r4 + ")");
                            }
                            try {
                                int r42 = AbstractC0149m.f416a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C2738i c2738i = c0626p.f2096c;
                                Context context = c0626p.f2094a;
                                c2738i.getClass();
                                Typeface mo231j = AbstractC0056h.f108a.mo231j(context, new C0179i[]{m1643d}, 0);
                                MappedByteBuffer m1102E = AbstractC0387m.m1102E(c0626p.f2094a, m1643d.f561a);
                                if (m1102E == null || mo231j == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    C0080l c0080l = new C0080l(mo231j, AbstractC0580g.m1454u(m1102E));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (c0626p.f2097d) {
                                        try {
                                            AbstractC0387m abstractC0387m = c0626p.f2101h;
                                            if (abstractC0387m != null) {
                                                abstractC0387m.mo1130I(c0080l);
                                            }
                                        } finally {
                                        }
                                    }
                                    c0626p.m1641b();
                                    return;
                                } finally {
                                    int r3 = AbstractC0149m.f416a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (c0626p.f2097d) {
                                try {
                                    AbstractC0387m abstractC0387m2 = c0626p.f2101h;
                                    if (abstractC0387m2 != null) {
                                        abstractC0387m2.mo1129H(th2);
                                    }
                                    c0626p.m1641b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 6:
                C0678B this$0 = (C0678B) this.f1178b;
                AbstractC2492i.m4915e(this$0, "this$0");
                int r2 = this$0.f2366b;
                C0710t c0710t = this$0.f2370f;
                if (r2 == 0) {
                    this$0.f2367c = true;
                    c0710t.m1794d(EnumC0702l.ON_PAUSE);
                }
                if (this$0.f2365a == 0 && this$0.f2367c) {
                    c0710t.m1794d(EnumC0702l.ON_STOP);
                    this$0.f2368d = true;
                    return;
                }
                return;
            case 7:
                ((AbstractC0775e) this.f1178b).mo2161m();
                return;
            case 8:
                C0422f c0422f = (C0422f) this.f1178b;
                c0422f.f1094c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0422f.f1096e;
                C0516e c0516e = sideSheetBehavior.f2972i;
                if (c0516e != null && c0516e.m1337f()) {
                    c0422f.m1156b(c0422f.f1093b);
                    return;
                } else {
                    if (sideSheetBehavior.f2971h == 2) {
                        sideSheetBehavior.m2126r(c0422f.f1093b);
                        return;
                    }
                    return;
                }
            case 9:
                ((C0924d) this.f1178b).m2479t(true);
                return;
            case 10:
                C0930j c0930j = (C0930j) this.f1178b;
                boolean isPopupShowing = c0930j.f3864h.isPopupShowing();
                c0930j.m2488t(isPopupShowing);
                c0930j.f3869m = isPopupShowing;
                return;
            case 11:
                ((TextInputLayout) this.f1178b).f3024d.requestLayout();
                return;
            case 12:
                C2642d this$02 = (C2642d) this.f1178b;
                AbstractC2492i.m4915e(this$02, "this$0");
                int r02 = MainActivity.f2659G;
                this$02.f8566a.m2023w(false, 0L, 0L);
                return;
            case 13:
                Button backButton = (Button) this.f1178b;
                AbstractC2492i.m4915e(backButton, "$backButton");
                backButton.setVisibility(8);
                return;
            default:
                Activity activity = (Activity) this.f1178b;
                if (activity.isFinishing()) {
                    return;
                }
                int r8 = Build.VERSION.SDK_INT;
                if (r8 >= 28) {
                    Class cls = AbstractC2904b.f9538a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC2904b.f9538a;
                boolean z2 = r8 == 26 || r8 == 27;
                Method method = AbstractC2904b.f9543f;
                if ((!z2 || method != null) && (AbstractC2904b.f9542e != null || AbstractC2904b.f9541d != null)) {
                    try {
                        Object obj2 = AbstractC2904b.f9540c.get(activity);
                        if (obj2 != null && (obj = AbstractC2904b.f9539b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C2903a c2903a = new C2903a(activity);
                            application.registerActivityLifecycleCallbacks(c2903a);
                            Handler handler = AbstractC2904b.f9544g;
                            handler.post(new RunnableC0106d(c2903a, 10, obj2));
                            try {
                                if (r8 == 26 || r8 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new RunnableC0106d(application, 11, c2903a));
                                return;
                            } finally {
                                handler.post(new RunnableC0106d(application, 11, c2903a));
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
        }
    }
}
