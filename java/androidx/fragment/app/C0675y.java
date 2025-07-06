package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;
import p000A.AbstractC0002c;
import p112o.C2691k;

/* renamed from: androidx.fragment.app.y */
/* loaded from: classes.dex */
public final class C0675y {

    /* renamed from: b */
    public static final C2691k f2361b = new C2691k();

    /* renamed from: a */
    public final /* synthetic */ C0638E f2362a;

    public C0675y(C0638E c0638e) {
        this.f2362a = c0638e;
    }

    /* renamed from: b */
    public static Class m1775b(ClassLoader classLoader, String str) {
        C2691k c2691k = f2361b;
        C2691k c2691k2 = (C2691k) c2691k.getOrDefault(classLoader, null);
        if (c2691k2 == null) {
            c2691k2 = new C2691k();
            c2691k.put(classLoader, c2691k2);
        }
        Class cls = (Class) c2691k2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c2691k2.put(str, cls2);
        return cls2;
    }

    /* renamed from: c */
    public static Class m1776c(ClassLoader classLoader, String str) {
        try {
            return m1775b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new C0665o(AbstractC0002c.m16k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e3) {
            throw new C0665o(AbstractC0002c.m16k("Unable to instantiate fragment ", str, ": make sure class name exists"), e3);
        }
    }

    /* renamed from: a */
    public final AbstractComponentCallbacksC0666p m1777a(String str) {
        try {
            return (AbstractComponentCallbacksC0666p) m1776c(this.f2362a.f2139n.f2343e.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new C0665o(AbstractC0002c.m16k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new C0665o(AbstractC0002c.m16k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new C0665o(AbstractC0002c.m16k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new C0665o(AbstractC0002c.m16k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }
}
