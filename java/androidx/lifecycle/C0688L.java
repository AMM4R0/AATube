package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: androidx.lifecycle.L */
/* loaded from: classes.dex */
public final class C0688L {

    /* renamed from: a */
    public final LinkedHashMap f2391a = new LinkedHashMap();

    /* renamed from: a */
    public final void m1782a() {
        for (AbstractC0686J abstractC0686J : this.f2391a.values()) {
            HashMap hashMap = abstractC0686J.f2387a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        for (Object obj : abstractC0686J.f2387a.values()) {
                            if (obj instanceof Closeable) {
                                try {
                                    ((Closeable) obj).close();
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC0686J.f2388b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : abstractC0686J.f2388b) {
                            if (closeable instanceof Closeable) {
                                try {
                                    closeable.close();
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            abstractC0686J.mo1414a();
        }
        this.f2391a.clear();
    }
}
