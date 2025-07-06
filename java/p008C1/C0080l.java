package p008C1;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.emoji2.text.C0624n;
import androidx.emoji2.text.C0628r;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2492i;
import p011D1.AbstractC0122i;
import p011D1.ThreadFactoryC0121h;
import p012E.InterfaceMenuItemC0123a;
import p018G1.C0162m;
import p025J.C0218a;
import p036M1.AbstractC0379e;
import p057U.C0523a;
import p057U.C0524b;
import p099j.AbstractC2416a;
import p099j.C2421f;
import p102k.MenuC2450C;
import p102k.MenuC2466m;
import p102k.MenuItemC2473t;
import p112o.C2682b;
import p112o.C2685e;
import p112o.C2691k;

/* renamed from: C1.l */
/* loaded from: classes.dex */
public final class C0080l {

    /* renamed from: a */
    public Object f219a;

    /* renamed from: b */
    public final Object f220b;

    /* renamed from: c */
    public final Object f221c;

    /* renamed from: d */
    public final Object f222d;

    public C0080l(int r2) {
        switch (r2) {
            case 2:
                this.f219a = new C2682b();
                this.f220b = new SparseArray();
                this.f221c = new C2685e();
                this.f222d = new C2682b();
                break;
            case 3:
            default:
                this.f220b = new ArrayDeque();
                this.f221c = new ArrayDeque();
                this.f222d = new ArrayDeque();
                break;
            case 4:
                this.f219a = new C0218a(10);
                this.f220b = new C2691k();
                this.f221c = new ArrayList();
                this.f222d = new HashSet();
                break;
        }
    }

    /* renamed from: a */
    public void m265a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C2691k) this.f220b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int r2 = 0; r2 < size; r2++) {
                m265a(arrayList2.get(r2), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* renamed from: b */
    public synchronized ExecutorService m266b() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f219a) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = AbstractC0122i.f370c + " Dispatcher";
                AbstractC2492i.m4915e(name, "name");
                this.f219a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC0121h(name, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f219a;
            AbstractC2492i.m4912b(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public void m267c(C0162m call) {
        AbstractC2492i.m4915e(call, "call");
        ArrayDeque arrayDeque = (ArrayDeque) this.f222d;
        synchronized (this) {
            if (!arrayDeque.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m271g();
    }

    /* renamed from: d */
    public C2421f m268d(AbstractC2416a abstractC2416a) {
        ArrayList arrayList = (ArrayList) this.f221c;
        int size = arrayList.size();
        for (int r2 = 0; r2 < size; r2++) {
            C2421f c2421f = (C2421f) arrayList.get(r2);
            if (c2421f != null && c2421f.f7834b == abstractC2416a) {
                return c2421f;
            }
        }
        C2421f c2421f2 = new C2421f((Context) this.f220b, abstractC2416a);
        arrayList.add(c2421f2);
        return c2421f2;
    }

    /* renamed from: e */
    public boolean m269e(AbstractC2416a abstractC2416a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f219a).onActionItemClicked(m268d(abstractC2416a), new MenuItemC2473t((Context) this.f220b, (InterfaceMenuItemC0123a) menuItem));
    }

    /* renamed from: f */
    public boolean m270f(AbstractC2416a abstractC2416a, MenuC2466m menuC2466m) {
        C2421f m268d = m268d(abstractC2416a);
        C2691k c2691k = (C2691k) this.f222d;
        Menu menu = (Menu) c2691k.getOrDefault(menuC2466m, null);
        if (menu == null) {
            menu = new MenuC2450C((Context) this.f220b, menuC2466m);
            c2691k.put(menuC2466m, menu);
        }
        return ((ActionMode.Callback) this.f219a).onCreateActionMode(m268d, menu);
    }

    /* renamed from: g */
    public void m271g() {
        C0083o c0083o = AbstractC0122i.f368a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f220b).iterator();
                AbstractC2492i.m4914d(it, "iterator(...)");
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (((ArrayDeque) this.f221c).size() < 64) {
                        throw null;
                    }
                }
                m272h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((ThreadPoolExecutor) m266b()).isShutdown()) {
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        if (arrayList.size() <= 0) {
            return;
        }
        if (arrayList.get(0) != null) {
            throw new ClassCastException();
        }
        m266b();
        throw null;
    }

    /* renamed from: h */
    public synchronized int m272h() {
        return ((ArrayDeque) this.f221c).size() + ((ArrayDeque) this.f222d).size();
    }

    public C0080l(Typeface typeface, C0524b c0524b) {
        int r02;
        int r6;
        this.f222d = typeface;
        this.f219a = c0524b;
        this.f221c = new C0628r(1024);
        int m689a = c0524b.m689a(6);
        if (m689a != 0) {
            int r03 = m689a + c0524b.f830a;
            r02 = ((ByteBuffer) c0524b.f833d).getInt(((ByteBuffer) c0524b.f833d).getInt(r03) + r03);
        } else {
            r02 = 0;
        }
        this.f220b = new char[r02 * 2];
        int m689a2 = c0524b.m689a(6);
        if (m689a2 != 0) {
            int r62 = m689a2 + c0524b.f830a;
            r6 = ((ByteBuffer) c0524b.f833d).getInt(((ByteBuffer) c0524b.f833d).getInt(r62) + r62);
        } else {
            r6 = 0;
        }
        for (int r7 = 0; r7 < r6; r7++) {
            C0624n c0624n = new C0624n(this, r7);
            C0523a m1637c = c0624n.m1637c();
            int m689a3 = m1637c.m689a(4);
            Character.toChars(m689a3 != 0 ? ((ByteBuffer) m1637c.f833d).getInt(m689a3 + m1637c.f830a) : 0, (char[]) this.f220b, r7 * 2);
            AbstractC0379e.m1071b("invalid metadata codepoint length", c0624n.m1636b() > 0);
            ((C0628r) this.f221c).m1644a(c0624n, 0, c0624n.m1636b() - 1);
        }
    }

    public C0080l(Context context, ActionMode.Callback callback) {
        this.f220b = context;
        this.f219a = callback;
        this.f221c = new ArrayList();
        this.f222d = new C2691k();
    }
}
