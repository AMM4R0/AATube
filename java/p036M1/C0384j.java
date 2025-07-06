package p036M1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: M1.j */
/* loaded from: classes.dex */
public final class C0384j implements InvocationHandler {

    /* renamed from: a */
    public final ArrayList f1034a;

    /* renamed from: b */
    public boolean f1035b;

    /* renamed from: c */
    public String f1036c;

    public C0384j(ArrayList arrayList) {
        this.f1034a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        AbstractC2492i.m4915e(proxy, "proxy");
        AbstractC2492i.m4915e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC2492i.m4911a(name, "supports") && AbstractC2492i.m4911a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC2492i.m4911a(name, "unsupported") && AbstractC2492i.m4911a(Void.TYPE, returnType)) {
            this.f1035b = true;
            return null;
        }
        boolean m4911a = AbstractC2492i.m4911a(name, "protocols");
        ArrayList arrayList = this.f1034a;
        if (m4911a && objArr.length == 0) {
            return arrayList;
        }
        if ((AbstractC2492i.m4911a(name, "selectProtocol") || AbstractC2492i.m4911a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                AbstractC2492i.m4913c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                int size = list.size();
                if (size >= 0) {
                    int r10 = 0;
                    while (true) {
                        Object obj2 = list.get(r10);
                        AbstractC2492i.m4913c(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj2;
                        if (!arrayList.contains(str)) {
                            if (r10 == size) {
                                break;
                            }
                            r10++;
                        } else {
                            this.f1036c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f1036c = str2;
                return str2;
            }
        }
        if ((!AbstractC2492i.m4911a(name, "protocolSelected") && !AbstractC2492i.m4911a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj3 = objArr[0];
        AbstractC2492i.m4913c(obj3, "null cannot be cast to non-null type kotlin.String");
        this.f1036c = (String) obj3;
        return null;
    }
}
