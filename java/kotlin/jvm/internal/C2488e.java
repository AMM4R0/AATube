package kotlin.jvm.internal;

import android.support.v4.media.session.AbstractC0580g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002A1.AbstractC0017j;
import p008C1.C0076h;
import p105l1.C2632c;
import p108m1.AbstractC2660j;
import p108m1.AbstractC2661k;
import p108m1.AbstractC2671u;
import p131u1.InterfaceC2799a;
import p131u1.InterfaceC2800b;
import p131u1.InterfaceC2801c;
import p131u1.InterfaceC2802d;
import p131u1.InterfaceC2803e;
import p131u1.InterfaceC2804f;
import p131u1.InterfaceC2805g;
import p131u1.InterfaceC2806h;
import p131u1.InterfaceC2807i;
import p131u1.InterfaceC2808j;
import p131u1.InterfaceC2809k;
import p131u1.InterfaceC2810l;
import p131u1.InterfaceC2811m;
import p131u1.InterfaceC2812n;
import p131u1.InterfaceC2813o;
import p131u1.InterfaceC2814p;
import p131u1.InterfaceC2815q;
import p131u1.InterfaceC2816r;
import p131u1.InterfaceC2817s;
import p131u1.InterfaceC2818t;
import p131u1.InterfaceC2819u;
import p131u1.InterfaceC2820v;
import p143y1.InterfaceC2898c;

/* renamed from: kotlin.jvm.internal.e */
/* loaded from: classes.dex */
public final class C2488e implements InterfaceC2898c, InterfaceC2487d {

    /* renamed from: b */
    public static final Map f8167b;

    /* renamed from: c */
    public static final LinkedHashMap f8168c;

    /* renamed from: a */
    public final Class f8169a;

    static {
        int r12 = 0;
        List m5120X = AbstractC2660j.m5120X(InterfaceC2799a.class, InterfaceC2810l.class, InterfaceC2814p.class, C0076h.class, InterfaceC2815q.class, InterfaceC2816r.class, InterfaceC2817s.class, InterfaceC2818t.class, InterfaceC2819u.class, InterfaceC2820v.class, InterfaceC2800b.class, InterfaceC2801c.class, InterfaceC2802d.class, InterfaceC2803e.class, InterfaceC2804f.class, InterfaceC2805g.class, InterfaceC2806h.class, InterfaceC2807i.class, InterfaceC2808j.class, InterfaceC2809k.class, InterfaceC2811m.class, InterfaceC2812n.class, InterfaceC2813o.class);
        ArrayList arrayList = new ArrayList(AbstractC2661k.m5122Z(m5120X));
        for (Object obj : m5120X) {
            int r5 = r12 + 1;
            if (r12 < 0) {
                AbstractC2660j.m5121Y();
                throw null;
            }
            arrayList.add(new C2632c((Class) obj, Integer.valueOf(r12)));
            r12 = r5;
        }
        f8167b = AbstractC2671u.m5129f0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        AbstractC2492i.m4914d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC2492i.m4912b(str);
            sb.append(AbstractC0017j.m146X(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f8167b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2671u.m5125b0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), AbstractC0017j.m146X((String) entry2.getValue()));
        }
        f8168c = linkedHashMap;
    }

    public C2488e(Class jClass) {
        AbstractC2492i.m4915e(jClass, "jClass");
        this.f8169a = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC2487d
    /* renamed from: a */
    public final Class mo4909a() {
        return this.f8169a;
    }

    /* renamed from: b */
    public final String m4910b() {
        String str;
        Class jClass = this.f8169a;
        AbstractC2492i.m4915e(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean isArray = jClass.isArray();
            LinkedHashMap linkedHashMap = f8168c;
            if (!isArray) {
                String str3 = (String) linkedHashMap.get(jClass.getName());
                return str3 == null ? jClass.getSimpleName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC0017j.m145W(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return AbstractC0017j.m145W(simpleName, enclosingConstructor.getName() + '$');
        }
        int m136N = AbstractC0017j.m136N(simpleName, '$', 0, false, 6);
        if (m136N == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(m136N + 1, simpleName.length());
        AbstractC2492i.m4914d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2488e) && AbstractC0580g.m1450o(this).equals(AbstractC0580g.m1450o((InterfaceC2898c) obj));
    }

    public final int hashCode() {
        return AbstractC0580g.m1450o(this).hashCode();
    }

    public final String toString() {
        return this.f8169a.toString() + " (Kotlin reflection is not available)";
    }
}
