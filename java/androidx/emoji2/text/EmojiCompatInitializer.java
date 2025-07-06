package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0710t;
import androidx.lifecycle.InterfaceC0694d;
import androidx.lifecycle.InterfaceC0708r;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p001A0.C0006c;
import p085g0.C0911a;
import p085g0.InterfaceC0912b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0912b {
    @Override // p085g0.InterfaceC0912b
    /* renamed from: a */
    public final List mo1607a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p085g0.InterfaceC0912b
    /* renamed from: b */
    public final Object mo1608b(Context context) {
        C0627q c0627q = new C0627q(new C0006c(context, 1));
        c0627q.f2066a = 1;
        if (C0620j.f2070j == null) {
            synchronized (C0620j.f2069i) {
                try {
                    if (C0620j.f2070j == null) {
                        C0620j.f2070j = new C0620j(c0627q);
                    }
                } finally {
                }
            }
        }
        m1609c(context);
        return Boolean.TRUE;
    }

    /* renamed from: c */
    public final void m1609c(Context context) {
        Object obj;
        C0911a m2462c = C0911a.m2462c(context);
        m2462c.getClass();
        synchronized (C0911a.f3822e) {
            try {
                obj = m2462c.f3823a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = m2462c.m2464b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final C0710t mo1475e = ((InterfaceC0708r) obj).mo1475e();
        mo1475e.m1791a(new InterfaceC0694d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0694d
            /* renamed from: a */
            public final void mo1610a() {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0612b.m1611a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0623m(), 500L);
                mo1475e.m1796f(this);
            }
        });
    }
}
