package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import p000A.AbstractC0002c;
import p002A1.C0015h;
import p060W.AbstractC0536a;
import p079e.AbstractActivityC0798g;

/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0672v implements LayoutInflater.Factory2 {

    /* renamed from: a */
    public final C0638E f2354a;

    public LayoutInflaterFactory2C0672v(C0638E c0638e) {
        this.f2354a = c0638e;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        C0644K m1680f;
        View view2;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        C0638E c0638e = this.f2354a;
        if (equals) {
            FragmentContainerView fragmentContainerView = new FragmentContainerView(context, attributeSet);
            fragmentContainerView.f2164d = true;
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0536a.f1461b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
            }
            String string = obtainStyledAttributes.getString(1);
            obtainStyledAttributes.recycle();
            int id = fragmentContainerView.getId();
            AbstractComponentCallbacksC0666p m1699y = c0638e.m1699y(id);
            if (classAttribute != null && m1699y == null) {
                if (id <= 0) {
                    throw new IllegalStateException(AbstractC0002c.m16k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                }
                C0675y m1657A = c0638e.m1657A();
                context.getClassLoader();
                AbstractComponentCallbacksC0666p m1777a = m1657A.m1777a(classAttribute);
                m1777a.f2298C = true;
                C0669s c0669s = m1777a.f2330s;
                if ((c0669s == null ? null : c0669s.f2342d) != null) {
                    m1777a.f2298C = true;
                }
                C0651a c0651a = new C0651a(c0638e);
                c0651a.f2229o = true;
                m1777a.f2299D = fragmentContainerView;
                c0651a.m1734e(fragmentContainerView.getId(), m1777a, string, 1);
                if (c0651a.f2221g) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                C0638E c0638e2 = c0651a.f2230p;
                if (c0638e2.f2139n != null && !c0638e2.f2119A) {
                    c0638e2.m1696v(true);
                    c0651a.mo1652a(c0638e2.f2121C, c0638e2.f2122D);
                    c0638e2.f2127b = true;
                    try {
                        c0638e2.m1665L(c0638e2.f2121C, c0638e2.f2122D);
                        c0638e2.m1678d();
                        c0638e2.m1674V();
                        if (c0638e2.f2120B) {
                            c0638e2.f2120B = false;
                            c0638e2.m1673U();
                        }
                        ((HashMap) c0638e2.f2128c.f26c).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        c0638e2.m1678d();
                        throw th;
                    }
                }
            }
            Iterator it = c0638e.f2128c.m116k().iterator();
            while (it.hasNext()) {
                C0644K c0644k = (C0644K) it.next();
                AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p = c0644k.f2188c;
                if (abstractComponentCallbacksC0666p.f2334w == fragmentContainerView.getId() && (view2 = abstractComponentCallbacksC0666p.f2300E) != null && view2.getParent() == null) {
                    abstractComponentCallbacksC0666p.f2299D = fragmentContainerView;
                    c0644k.m1708b();
                }
            }
            return fragmentContainerView;
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0536a.f1460a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes2.getString(0);
        }
        int resourceId = obtainStyledAttributes2.getResourceId(1, -1);
        String string2 = obtainStyledAttributes2.getString(2);
        obtainStyledAttributes2.recycle();
        if (attributeValue != null) {
            try {
                z2 = AbstractComponentCallbacksC0666p.class.isAssignableFrom(C0675y.m1775b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z2 = false;
            }
            if (z2) {
                int id2 = view != null ? view.getId() : 0;
                if (id2 == -1 && resourceId == -1 && string2 == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0666p m1699y2 = resourceId != -1 ? c0638e.m1699y(resourceId) : null;
                if (m1699y2 == null && string2 != null) {
                    C0015h c0015h = c0638e.f2128c;
                    ArrayList arrayList = (ArrayList) c0015h.f25b;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p2 = (AbstractComponentCallbacksC0666p) arrayList.get(size);
                            if (abstractComponentCallbacksC0666p2 != null && string2.equals(abstractComponentCallbacksC0666p2.f2335x)) {
                                m1699y2 = abstractComponentCallbacksC0666p2;
                                break;
                            }
                            size--;
                        } else {
                            Iterator it2 = ((HashMap) c0015h.f26c).values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    m1699y2 = null;
                                    break;
                                }
                                C0644K c0644k2 = (C0644K) it2.next();
                                if (c0644k2 != null) {
                                    AbstractComponentCallbacksC0666p abstractComponentCallbacksC0666p3 = c0644k2.f2188c;
                                    if (string2.equals(abstractComponentCallbacksC0666p3.f2335x)) {
                                        m1699y2 = abstractComponentCallbacksC0666p3;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (m1699y2 == null && id2 != -1) {
                    m1699y2 = c0638e.m1699y(id2);
                }
                if (m1699y2 == null) {
                    C0675y m1657A2 = c0638e.m1657A();
                    context.getClassLoader();
                    m1699y2 = m1657A2.m1777a(attributeValue);
                    m1699y2.f2324m = true;
                    m1699y2.f2333v = resourceId != 0 ? resourceId : id2;
                    m1699y2.f2334w = id2;
                    m1699y2.f2335x = string2;
                    m1699y2.f2325n = true;
                    m1699y2.f2329r = c0638e;
                    C0669s c0669s2 = c0638e.f2139n;
                    m1699y2.f2330s = c0669s2;
                    AbstractActivityC0798g abstractActivityC0798g = c0669s2.f2343e;
                    m1699y2.f2298C = true;
                    if ((c0669s2 == null ? null : c0669s2.f2342d) != null) {
                        m1699y2.f2298C = true;
                    }
                    m1680f = c0638e.m1675a(m1699y2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + m1699y2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (m1699y2.f2325n) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                    }
                    m1699y2.f2325n = true;
                    m1699y2.f2329r = c0638e;
                    C0669s c0669s3 = c0638e.f2139n;
                    m1699y2.f2330s = c0669s3;
                    AbstractActivityC0798g abstractActivityC0798g2 = c0669s3.f2343e;
                    m1699y2.f2298C = true;
                    if ((c0669s3 == null ? null : c0669s3.f2342d) != null) {
                        m1699y2.f2298C = true;
                    }
                    m1680f = c0638e.m1680f(m1699y2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + m1699y2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                m1699y2.f2299D = (ViewGroup) view;
                m1680f.m1717k();
                m1680f.m1716j();
                View view3 = m1699y2.f2300E;
                if (view3 == null) {
                    throw new IllegalStateException(AbstractC0002c.m16k("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view3.setId(resourceId);
                }
                if (m1699y2.f2300E.getTag() == null) {
                    m1699y2.f2300E.setTag(string2);
                }
                m1699y2.f2300E.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0671u(this, m1680f));
                return m1699y2.f2300E;
            }
        }
        return null;
    }
}
