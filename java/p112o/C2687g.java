package p112o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.g */
/* loaded from: classes.dex */
public final class C2687g implements Iterator {

    /* renamed from: a */
    public final int f8665a;

    /* renamed from: b */
    public int f8666b;

    /* renamed from: c */
    public int f8667c;

    /* renamed from: d */
    public boolean f8668d = false;

    /* renamed from: e */
    public final /* synthetic */ C2681a f8669e;

    public C2687g(C2681a c2681a, int r3) {
        this.f8669e = c2681a;
        this.f8665a = r3;
        this.f8666b = c2681a.m5149d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8667c < this.f8666b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object m5147b = this.f8669e.m5147b(this.f8667c, this.f8665a);
        this.f8667c++;
        this.f8668d = true;
        return m5147b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8668d) {
            throw new IllegalStateException();
        }
        int r02 = this.f8667c - 1;
        this.f8667c = r02;
        this.f8666b--;
        this.f8668d = false;
        this.f8669e.m5152g(r02);
    }
}
