package p085g0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.fragment.app.C0665o;
import com.carwizard.p075li.youtube.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p036M1.AbstractC0379e;

/* renamed from: g0.a */
/* loaded from: classes.dex */
public final class C0911a {

    /* renamed from: d */
    public static volatile C0911a f3821d;

    /* renamed from: e */
    public static final Object f3822e = new Object();

    /* renamed from: c */
    public final Context f3825c;

    /* renamed from: b */
    public final HashSet f3824b = new HashSet();

    /* renamed from: a */
    public final HashMap f3823a = new HashMap();

    public C0911a(Context context) {
        this.f3825c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C0911a m2462c(Context context) {
        if (f3821d == null) {
            synchronized (f3822e) {
                try {
                    if (f3821d == null) {
                        f3821d = new C0911a(context);
                    }
                } finally {
                }
            }
        }
        return f3821d;
    }

    /* renamed from: a */
    public final void m2463a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f3825c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f3824b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0912b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m2464b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new C0665o(e2);
            }
        }
    }

    /* renamed from: b */
    public final Object m2464b(Class cls, HashSet hashSet) {
        Object obj;
        if (AbstractC0379e.m1082t()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f3823a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0912b interfaceC0912b = (InterfaceC0912b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> mo1607a = interfaceC0912b.mo1607a();
                if (!mo1607a.isEmpty()) {
                    for (Class cls2 : mo1607a) {
                        if (!hashMap.containsKey(cls2)) {
                            m2464b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0912b.mo1608b(this.f3825c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new C0665o(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
