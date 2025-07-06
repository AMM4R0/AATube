package kotlin.jvm.internal;

import androidx.fragment.app.C0665o;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p000A.AbstractC0002c;

/* renamed from: kotlin.jvm.internal.i */
/* loaded from: classes.dex */
public abstract class AbstractC2492i {

    /* renamed from: a */
    public static final Object[] f8170a = new Object[0];

    /* renamed from: a */
    public static boolean m4911a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m4912b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m4917g(nullPointerException, AbstractC2492i.class.getName());
        throw nullPointerException;
    }

    /* renamed from: c */
    public static void m4913c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m4917g(nullPointerException, AbstractC2492i.class.getName());
        throw nullPointerException;
    }

    /* renamed from: d */
    public static void m4914d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m4917g(nullPointerException, AbstractC2492i.class.getName());
        throw nullPointerException;
    }

    /* renamed from: e */
    public static void m4915e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC2492i.class.getName();
            int r3 = 0;
            while (!stackTrace[r3].getClassName().equals(name)) {
                r3++;
            }
            while (stackTrace[r3].getClassName().equals(name)) {
                r3++;
            }
            StackTraceElement stackTraceElement = stackTrace[r3];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            m4917g(nullPointerException, AbstractC2492i.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: f */
    public static int m4916f(int r02, int r12) {
        if (r02 < r12) {
            return -1;
        }
        return r02 == r12 ? 0 : 1;
    }

    /* renamed from: g */
    public static void m4917g(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int r2 = -1;
        for (int r3 = 0; r3 < length; r3++) {
            if (str.equals(stackTrace[r3].getClassName())) {
                r2 = r3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, r2 + 1, length));
    }

    /* renamed from: h */
    public static void m4918h(String str) {
        C0665o c0665o = new C0665o(AbstractC0002c.m16k("lateinit property ", str, " has not been initialized"));
        m4917g(c0665o, AbstractC2492i.class.getName());
        throw c0665o;
    }

    /* renamed from: i */
    public static final Object[] m4919i(Collection collection) {
        int size = collection.size();
        Object[] objArr = f8170a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int r02 = 0;
        while (true) {
            int r2 = r02 + 1;
            objArr2[r02] = it.next();
            if (r2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int r03 = ((r2 * 3) + 1) >>> 1;
                if (r03 <= r2) {
                    r03 = 2147483645;
                    if (r2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, r03);
                m4914d(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, r2);
                m4914d(copyOf, "copyOf(...)");
                return copyOf;
            }
            r02 = r2;
        }
    }

    /* renamed from: j */
    public static final Object[] m4920j(Collection collection, Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int size = collection.size();
        int r2 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            m4913c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int r3 = r2 + 1;
            objArr2[r2] = it.next();
            if (r3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int r22 = ((r3 * 3) + 1) >>> 1;
                if (r22 <= r3) {
                    r22 = 2147483645;
                    if (r3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, r22);
                m4914d(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[r3] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, r3);
                m4914d(copyOf, "copyOf(...)");
                return copyOf;
            }
            r2 = r3;
        }
    }
}
