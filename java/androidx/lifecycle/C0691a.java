package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
public final class C0691a {

    /* renamed from: a */
    public final HashMap f2396a = new HashMap();

    /* renamed from: b */
    public final HashMap f2397b;

    public C0691a(HashMap hashMap) {
        this.f2397b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0702l enumC0702l = (EnumC0702l) entry.getValue();
            List list = (List) this.f2396a.get(enumC0702l);
            if (list == null) {
                list = new ArrayList();
                this.f2396a.put(enumC0702l, list);
            }
            list.add((C0692b) entry.getKey());
        }
    }

    /* renamed from: a */
    public static void m1785a(List list, InterfaceC0708r interfaceC0708r, EnumC0702l enumC0702l, InterfaceC0707q interfaceC0707q) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0692b c0692b = (C0692b) list.get(size);
                c0692b.getClass();
                try {
                    int r5 = c0692b.f2398a;
                    Method method = c0692b.f2399b;
                    if (r5 == 0) {
                        method.invoke(interfaceC0707q, null);
                    } else if (r5 == 1) {
                        method.invoke(interfaceC0707q, interfaceC0708r);
                    } else if (r5 == 2) {
                        method.invoke(interfaceC0707q, interfaceC0708r, enumC0702l);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to call observer method", e3.getCause());
                }
            }
        }
    }
}
