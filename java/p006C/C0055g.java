package p006C;

import android.animation.Animator;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.C0649P;
import androidx.fragment.app.C0669s;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.tasks.Task;
import com.google.android.material.behavior.SwipeDismissBehavior;
import io.appmetrica.analytics.impl.C1842f9;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2492i;
import p001A0.AbstractC0005b;
import p002A1.C0015h;
import p008C1.C0070b;
import p008C1.C0076h;
import p008C1.C0083o;
import p010D0.C0109g;
import p010D0.C0113k;
import p010D0.RunnableC0106d;
import p011D1.ThreadFactoryC0121h;
import p016F1.C0136d;
import p017G.InterfaceC0139c;
import p018G1.C0163n;
import p018G1.C0164o;
import p018G1.C0165p;
import p018G1.C0167r;
import p018G1.InterfaceC0156g;
import p018G1.InterfaceC0168s;
import p026J0.C0224e;
import p026J0.C0232m;
import p028K.AbstractC0283P;
import p028K.AbstractC0297c;
import p028K.C0305g;
import p028K.InterfaceC0299d;
import p028K.InterfaceC0303f;
import p031L.C0356j;
import p031L.C0357k;
import p031L.C0358l;
import p031L.InterfaceC0366t;
import p043P.C0415g;
import p047Q0.InterfaceC0446a;
import p058V.C0531g;
import p073c0.InterfaceC0729e;
import p086g1.C0917e;
import p102k.C2459f;
import p102k.C2468o;
import p102k.MenuC2466m;
import p102k.RunnableC2458e;
import p102k.ViewOnKeyListenerC2460g;
import p104l.InterfaceC2522K0;
import p127t0.C2767d;

/* renamed from: C.g */
/* loaded from: classes.dex */
public class C0055g implements InterfaceC0156g, InterfaceC0299d, InterfaceC0303f, InterfaceC0366t, InterfaceC0446a, InterfaceC0139c, InterfaceC0729e, InterfaceC2522K0 {

    /* renamed from: c */
    public static C0055g f105c;

    /* renamed from: a */
    public final /* synthetic */ int f106a;

    /* renamed from: b */
    public Object f107b;

    public /* synthetic */ C0055g(int r12, Object obj) {
        this.f106a = r12;
        this.f107b = obj;
    }

    @Override // p028K.InterfaceC0303f
    /* renamed from: a */
    public ClipData mo203a() {
        ClipData clip;
        clip = ((ContentInfo) this.f107b).getClip();
        return clip;
    }

    @Override // p031L.InterfaceC0366t
    /* renamed from: b */
    public boolean mo204b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f107b;
        if (!swipeDismissBehavior.mo2056r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC0283P.f842a;
        boolean z2 = view.getLayoutDirection() == 1;
        int r02 = swipeDismissBehavior.f2745d;
        view.offsetLeftAndRight((!(r02 == 0 && z2) && (r02 != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // p104l.InterfaceC2522K0
    /* renamed from: c */
    public void mo205c(MenuC2466m menuC2466m, C2468o c2468o) {
        ViewOnKeyListenerC2460g viewOnKeyListenerC2460g = (ViewOnKeyListenerC2460g) this.f107b;
        viewOnKeyListenerC2460g.f8029f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC2460g.f8031h;
        int size = arrayList.size();
        int r4 = 0;
        while (true) {
            if (r4 >= size) {
                r4 = -1;
                break;
            } else if (menuC2466m == ((C2459f) arrayList.get(r4)).f8023b) {
                break;
            } else {
                r4++;
            }
        }
        if (r4 == -1) {
            return;
        }
        int r42 = r4 + 1;
        viewOnKeyListenerC2460g.f8029f.postAtTime(new RunnableC2458e(this, r42 < arrayList.size() ? (C2459f) arrayList.get(r42) : null, c2468o, menuC2466m), menuC2466m, SystemClock.uptimeMillis() + 200);
    }

    @Override // p028K.InterfaceC0299d
    /* renamed from: d */
    public C0305g mo206d() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f107b).build();
        return new C0305g(new C0055g(build));
    }

    @Override // p073c0.InterfaceC0729e
    /* renamed from: e */
    public void mo207e(int r4, Serializable serializable) {
        String str;
        switch (r4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (r4 == 6 || r4 == 7 || r4 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f107b).setResultCode(r4);
    }

    @Override // p028K.InterfaceC0303f
    /* renamed from: f */
    public int mo208f() {
        int flags;
        flags = ((ContentInfo) this.f107b).getFlags();
        return flags;
    }

    @Override // p073c0.InterfaceC0729e
    /* renamed from: g */
    public void mo209g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p018G1.InterfaceC0156g
    /* renamed from: h */
    public C0163n mo210h() {
        InterfaceC0168s m528e;
        IOException iOException = null;
        while (true) {
            C0165p c0165p = (C0165p) this.f107b;
            if (!c0165p.m527d()) {
                try {
                    m528e = c0165p.m528e();
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    } else {
                        AbstractC0005b.m63f(iOException, e2);
                    }
                    if (!c0165p.m526c(null)) {
                        throw iOException;
                    }
                }
                if (m528e.mo484c()) {
                    break;
                }
                C0167r mo486e = m528e.mo486e();
                if (mo486e.f530b == null && mo486e.f531c == null) {
                    mo486e = m528e.mo487f();
                }
                InterfaceC0168s interfaceC0168s = mo486e.f530b;
                Throwable th = mo486e.f531c;
                if (th != null) {
                    throw th;
                }
                if (interfaceC0168s == null) {
                    break;
                }
                c0165p.f527p.m5097c(interfaceC0168s);
            } else {
                throw new IOException("Canceled");
            }
        }
        return m528e.mo488g();
    }

    @Override // p028K.InterfaceC0303f
    /* renamed from: i */
    public ContentInfo mo211i() {
        return (ContentInfo) this.f107b;
    }

    @Override // p028K.InterfaceC0299d
    /* renamed from: j */
    public void mo212j(Bundle bundle) {
        ((ContentInfo.Builder) this.f107b).setExtras(bundle);
    }

    @Override // p028K.InterfaceC0299d
    /* renamed from: k */
    public void mo213k(Uri uri) {
        ((ContentInfo.Builder) this.f107b).setLinkUri(uri);
    }

    @Override // p028K.InterfaceC0303f
    /* renamed from: l */
    public int mo214l() {
        int source;
        source = ((ContentInfo) this.f107b).getSource();
        return source;
    }

    @Override // p018G1.InterfaceC0156g
    /* renamed from: m */
    public C0165p mo215m() {
        return (C0165p) this.f107b;
    }

    @Override // p017G.InterfaceC0139c
    /* renamed from: n */
    public void mo119n() {
        switch (this.f106a) {
            case 17:
                ((Animator) this.f107b).end();
                break;
            default:
                ((C0649P) this.f107b).m1727a();
                break;
        }
    }

    @Override // p104l.InterfaceC2522K0
    /* renamed from: o */
    public void mo216o(MenuC2466m menuC2466m, C2468o c2468o) {
        ((ViewOnKeyListenerC2460g) this.f107b).f8029f.removeCallbacksAndMessages(menuC2466m);
    }

    @Override // p028K.InterfaceC0299d
    /* renamed from: p */
    public void mo217p(int r2) {
        ((ContentInfo.Builder) this.f107b).setFlags(r2);
    }

    /* renamed from: q */
    public C0083o m218q() {
        return new C0083o((String[]) ((ArrayList) this.f107b).toArray(new String[0]));
    }

    /* renamed from: r */
    public C0356j mo219r(int r12) {
        return null;
    }

    /* renamed from: s */
    public C0356j mo220s(int r12) {
        return null;
    }

    /* renamed from: t */
    public void m221t() {
        ((C0669s) this.f107b).f2345g.m1661H();
    }

    public String toString() {
        switch (this.f106a) {
            case 8:
                return "ContentInfoCompat{" + ((ContentInfo) this.f107b) + "}";
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m222u() {
        synchronized (this.f107b) {
        }
    }

    /* renamed from: v */
    public boolean mo223v(int r12, int r2, Bundle bundle) {
        return false;
    }

    /* renamed from: w */
    public void m224w(String str) {
        int r02 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f107b;
            if (r02 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(r02))) {
                arrayList.remove(r02);
                arrayList.remove(r02);
                r02 -= 2;
            }
            r02 += 2;
        }
    }

    /* renamed from: x */
    public Task m225x(Task task) {
        C0113k c0113k = (C0113k) this.f107b;
        if (!task.mo624d() && !((C0232m) task).f672d) {
            Exception mo622b = task.mo622b();
            if (mo622b instanceof C2767d) {
                int r12 = ((C2767d) mo622b).f9061a.f2694b;
                if (r12 == 43001 || r12 == 43002 || r12 == 43003 || r12 == 17) {
                    C0109g c0109g = (C0109g) c0113k.f348c;
                    c0109g.getClass();
                    C0224e c0224e = new C0224e();
                    ((ExecutorService) c0109g.f339c).execute(new RunnableC0106d(c0109g, 0, c0224e));
                    task = c0224e.f652a;
                } else if (r12 == 43000) {
                    Exception exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
                    C0232m c0232m = new C0232m();
                    c0232m.m625e(exc);
                    task = c0232m;
                } else if (r12 == 15) {
                    Exception exc2 = new Exception("The operation to get app set ID timed out. Please try again later.");
                    C0232m c0232m2 = new C0232m();
                    c0232m2.m625e(exc2);
                    return c0232m2;
                }
            }
        }
        return task;
    }

    public C0055g(C0055g c0055g) {
        this.f106a = 1;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        C0136d taskRunner = C0136d.f394l;
        C0070b c0070b = C0070b.f151b;
        AbstractC2492i.m4915e(timeUnit, "timeUnit");
        AbstractC2492i.m4915e(taskRunner, "taskRunner");
        this.f107b = new C0164o(taskRunner, 5, 5L, timeUnit, c0070b, new C0076h(3));
    }

    public C0055g(int r3) {
        this.f106a = r3;
        switch (r3) {
            case 2:
                this.f107b = new ArrayList(20);
                break;
            case 5:
                this.f107b = new LinkedHashSet();
                break;
            case 9:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f107b = new C0358l(this);
                    break;
                } else {
                    this.f107b = new C0357k(this);
                    break;
                }
            case C1842f9.f6213J /* 27 */:
                this.f107b = new Object();
                new Handler(Looper.getMainLooper(), new C0917e(this));
                break;
        }
    }

    public C0055g(TextView textView) {
        this.f106a = 15;
        this.f107b = new C0531g(textView);
    }

    public C0055g(EditText editText) {
        this.f106a = 14;
        this.f107b = new C0109g(editText);
    }

    public C0055g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f106a = 11;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f107b = new C0415g(uri, clipDescription, uri2);
        } else {
            this.f107b = new C0015h(uri, clipDescription, uri2, 1);
        }
    }

    public C0055g(ThreadFactoryC0121h threadFactoryC0121h) {
        this.f106a = 4;
        this.f107b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC0121h);
    }

    public C0055g(ContentInfo contentInfo) {
        this.f106a = 8;
        contentInfo.getClass();
        this.f107b = AbstractC0297c.m820h(contentInfo);
    }

    public C0055g(ClipData clipData, int r3) {
        this.f106a = 7;
        this.f107b = AbstractC0297c.m818f(clipData, r3);
    }
}
