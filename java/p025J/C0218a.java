package p025J;

import kotlin.jvm.internal.AbstractC2492i;
import p118q.C2711b;

/* renamed from: J.a */
/* loaded from: classes.dex */
public class C0218a {

    /* renamed from: a */
    public final Object[] f648a;

    /* renamed from: b */
    public int f649b;

    public C0218a(int r2) {
        if (r2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f648a = new Object[r2];
    }

    /* renamed from: a */
    public Object mo608a() {
        int r02 = this.f649b;
        if (r02 <= 0) {
            return null;
        }
        int r03 = r02 - 1;
        Object[] objArr = this.f648a;
        Object obj = objArr[r03];
        AbstractC2492i.m4913c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[r03] = null;
        this.f649b--;
        return obj;
    }

    /* renamed from: b */
    public void m609b(C2711b c2711b) {
        int r02 = this.f649b;
        Object[] objArr = this.f648a;
        if (r02 < objArr.length) {
            objArr[r02] = c2711b;
            this.f649b = r02 + 1;
        }
    }

    /* renamed from: c */
    public boolean mo610c(Object instance) {
        Object[] objArr;
        boolean z2;
        AbstractC2492i.m4915e(instance, "instance");
        int r02 = this.f649b;
        int r2 = 0;
        while (true) {
            objArr = this.f648a;
            if (r2 >= r02) {
                z2 = false;
                break;
            }
            if (objArr[r2] == instance) {
                z2 = true;
                break;
            }
            r2++;
        }
        if (z2) {
            throw new IllegalStateException("Already in the pool!");
        }
        int r03 = this.f649b;
        if (r03 >= objArr.length) {
            return false;
        }
        objArr[r03] = instance;
        this.f649b = r03 + 1;
        return true;
    }

    public C0218a() {
        this.f648a = new Object[256];
    }
}
