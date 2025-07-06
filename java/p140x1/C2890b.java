package p140x1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: x1.b */
/* loaded from: classes.dex */
public final class C2890b implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f9514a = 0;

    /* renamed from: b */
    public final int f9515b;

    /* renamed from: c */
    public final int f9516c;

    /* renamed from: d */
    public boolean f9517d;

    /* renamed from: e */
    public int f9518e;

    public C2890b(char c, char c2, int r5) {
        this.f9515b = r5;
        this.f9516c = c2;
        boolean z2 = false;
        if (r5 <= 0 ? AbstractC2492i.m4916f(c, c2) >= 0 : AbstractC2492i.m4916f(c, c2) <= 0) {
            z2 = true;
        }
        this.f9517d = z2;
        this.f9518e = z2 ? c : c2;
    }

    /* renamed from: a */
    public int m5481a() {
        int r02 = this.f9518e;
        if (r02 != this.f9516c) {
            this.f9518e = this.f9515b + r02;
        } else {
            if (!this.f9517d) {
                throw new NoSuchElementException();
            }
            this.f9517d = false;
        }
        return r02;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9514a) {
        }
        return this.f9517d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9514a) {
            case 0:
                int r02 = this.f9518e;
                if (r02 != this.f9516c) {
                    this.f9518e = this.f9515b + r02;
                } else {
                    if (!this.f9517d) {
                        throw new NoSuchElementException();
                    }
                    this.f9517d = false;
                }
                return Character.valueOf((char) r02);
            default:
                return Integer.valueOf(m5481a());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9514a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2890b(int r3, int r4, int r5) {
        this.f9515b = r5;
        this.f9516c = r4;
        boolean z2 = false;
        if (r5 <= 0 ? r3 >= r4 : r3 <= r4) {
            z2 = true;
        }
        this.f9517d = z2;
        this.f9518e = z2 ? r3 : r4;
    }
}
