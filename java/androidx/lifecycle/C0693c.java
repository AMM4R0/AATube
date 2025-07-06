package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
public final class C0693c {

    /* renamed from: c */
    public static final C0693c f2400c = new C0693c();

    /* renamed from: a */
    public final HashMap f2401a = new HashMap();

    /* renamed from: b */
    public final HashMap f2402b = new HashMap();

    /* renamed from: b */
    public static void m1786b(HashMap hashMap, C0692b c0692b, EnumC0702l enumC0702l, Class cls) {
        EnumC0702l enumC0702l2 = (EnumC0702l) hashMap.get(c0692b);
        if (enumC0702l2 == null || enumC0702l == enumC0702l2) {
            if (enumC0702l2 == null) {
                hashMap.put(c0692b, enumC0702l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0692b.f2399b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0702l2 + ", new value " + enumC0702l);
    }

    /* renamed from: a */
    public final C0691a m1787a(Class cls, Method[] methodArr) {
        int r8;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f2401a;
        if (superclass != null) {
            C0691a c0691a = (C0691a) hashMap2.get(superclass);
            if (c0691a == null) {
                c0691a = m1787a(superclass, null);
            }
            hashMap.putAll(c0691a.f2397b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0691a c0691a2 = (C0691a) hashMap2.get(cls2);
            if (c0691a2 == null) {
                c0691a2 = m1787a(cls2, null);
            }
            for (Map.Entry entry : c0691a2.f2397b.entrySet()) {
                m1786b(hashMap, (C0692b) entry.getKey(), (EnumC0702l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            InterfaceC0715y interfaceC0715y = (InterfaceC0715y) method.getAnnotation(InterfaceC0715y.class);
            if (interfaceC0715y != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    r8 = 0;
                } else {
                    if (!InterfaceC0708r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    r8 = 1;
                }
                EnumC0702l value = interfaceC0715y.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0702l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0702l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    r8 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m1786b(hashMap, new C0692b(r8, method), value, cls);
                z2 = true;
            }
        }
        C0691a c0691a3 = new C0691a(hashMap);
        hashMap2.put(cls, c0691a3);
        this.f2402b.put(cls, Boolean.valueOf(z2));
        return c0691a3;
    }
}
