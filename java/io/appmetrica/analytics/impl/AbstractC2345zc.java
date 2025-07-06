package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* renamed from: io.appmetrica.analytics.impl.zc */
/* loaded from: classes.dex */
public abstract class AbstractC2345zc {
    /* renamed from: a */
    public abstract void mo3026a(int r12);

    /* renamed from: a */
    public final synchronized void m4684a(Context context) {
        try {
            int mo3027b = mo3027b();
            int libraryApiLevel = AppMetrica.getLibraryApiLevel();
            if (mo3027b != libraryApiLevel) {
                if (mo3027b < libraryApiLevel) {
                    SparseArray mo3028c = mo3028c();
                    while (true) {
                        mo3027b++;
                        if (mo3027b > libraryApiLevel) {
                            break;
                        }
                        C1355Lj c1355Lj = (C1355Lj) mo3028c.get(mo3027b);
                        if (c1355Lj != null) {
                            c1355Lj.m3061a(context);
                        }
                    }
                }
                mo3026a(libraryApiLevel);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public abstract int mo3027b();

    /* renamed from: c */
    public abstract SparseArray mo3028c();

    /* renamed from: a */
    public final int m4683a() {
        return AppMetrica.getLibraryApiLevel();
    }
}
