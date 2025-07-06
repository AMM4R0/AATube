package p079e;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p017G.C0144h;
import p026J0.ExecutorC0230k;
import p112o.C2683c;
import p112o.C2687g;

/* renamed from: e.k */
/* loaded from: classes.dex */
public abstract class AbstractC0802k {

    /* renamed from: a */
    public static final ExecutorC0786D f3249a = new ExecutorC0786D(new ExecutorC0230k(1));

    /* renamed from: b */
    public static final int f3250b = -100;

    /* renamed from: c */
    public static C0144h f3251c = null;

    /* renamed from: d */
    public static C0144h f3252d = null;

    /* renamed from: e */
    public static Boolean f3253e = null;

    /* renamed from: f */
    public static boolean f3254f = false;

    /* renamed from: g */
    public static final C2683c f3255g = new C2683c(0);

    /* renamed from: h */
    public static final Object f3256h = new Object();

    /* renamed from: i */
    public static final Object f3257i = new Object();

    /* renamed from: c */
    public static boolean m2215c(Context context) {
        if (f3253e == null) {
            try {
                int r02 = AbstractServiceC0785C.f3161a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0785C.class), Build.VERSION.SDK_INT >= 24 ? AbstractC0784B.m2167a() | 128 : 640).metaData;
                if (bundle != null) {
                    f3253e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f3253e = Boolean.FALSE;
            }
        }
        return f3253e.booleanValue();
    }

    /* renamed from: h */
    public static void m2216h(LayoutInflaterFactory2C0815x layoutInflaterFactory2C0815x) {
        synchronized (f3256h) {
            try {
                Iterator it = f3255g.iterator();
                while (true) {
                    C2687g c2687g = (C2687g) it;
                    if (c2687g.hasNext()) {
                        AbstractC0802k abstractC0802k = (AbstractC0802k) ((WeakReference) c2687g.next()).get();
                        if (abstractC0802k == layoutInflaterFactory2C0815x || abstractC0802k == null) {
                            c2687g.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public abstract void mo2217a();

    /* renamed from: b */
    public abstract void mo2218b();

    /* renamed from: e */
    public abstract void mo2219e();

    /* renamed from: f */
    public abstract void mo2220f();

    /* renamed from: i */
    public abstract boolean mo2221i(int r12);

    /* renamed from: j */
    public abstract void mo2222j(int r12);

    /* renamed from: k */
    public abstract void mo2223k(View view);

    /* renamed from: l */
    public abstract void mo2224l(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: m */
    public abstract void mo2225m(CharSequence charSequence);
}
