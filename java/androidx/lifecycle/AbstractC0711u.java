package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC2492i;
import p002A1.AbstractC0025r;
import p103k0.AbstractC2480a;

/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public abstract class AbstractC0711u {

    /* renamed from: a */
    public static final HashMap f2422a = new HashMap();

    /* renamed from: b */
    public static final HashMap f2423b = new HashMap();

    /* renamed from: a */
    public static void m1799a(Constructor constructor, InterfaceC0707q interfaceC0707q) {
        try {
            AbstractC2492i.m4914d(constructor.newInstance(interfaceC0707q), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static int m1800b(Class cls) {
        Constructor constructor;
        boolean z2;
        int r12 = 1;
        HashMap hashMap = f2422a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String name = cls.getCanonicalName();
                String fullPackage = r4 != null ? r4.getName() : "";
                AbstractC2492i.m4914d(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    AbstractC2492i.m4914d(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    AbstractC2492i.m4914d(name, "this as java.lang.String).substring(startIndex)");
                }
                AbstractC2492i.m4914d(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = AbstractC0025r.m154G(name, ".", "_").concat("_LifecycleAdapter");
                if (fullPackage.length() != 0) {
                    concat = fullPackage + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            HashMap hashMap2 = f2423b;
            if (constructor != null) {
                hashMap2.put(cls, AbstractC2480a.m4863D(constructor));
            } else {
                C0693c c0693c = C0693c.f2400c;
                HashMap hashMap3 = c0693c.f2402b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int r10 = 0;
                        while (true) {
                            if (r10 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z2 = false;
                                break;
                            }
                            if (((InterfaceC0715y) declaredMethods[r10].getAnnotation(InterfaceC0715y.class)) != null) {
                                c0693c.m1787a(cls, declaredMethods);
                                z2 = true;
                                break;
                            }
                            r10++;
                        }
                    } catch (NoClassDefFoundError e3) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
                    }
                }
                if (!z2) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0707q.class.isAssignableFrom(superclass)) {
                        AbstractC2492i.m4914d(superclass, "superclass");
                        if (m1800b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            AbstractC2492i.m4912b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    AbstractC2492i.m4914d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int r9 = 0;
                    while (true) {
                        if (r9 < length2) {
                            Class<?> intrface = interfaces[r9];
                            if (intrface != null && InterfaceC0707q.class.isAssignableFrom(intrface)) {
                                AbstractC2492i.m4914d(intrface, "intrface");
                                if (m1800b(intrface) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(intrface);
                                AbstractC2492i.m4912b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            r9++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            r12 = 2;
        }
        hashMap.put(cls, Integer.valueOf(r12));
        return r12;
    }
}
