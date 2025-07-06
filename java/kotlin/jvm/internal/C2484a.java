package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p108m1.AbstractC2654d;
import p145z1.C2919b;

/* renamed from: kotlin.jvm.internal.a */
/* loaded from: classes.dex */
public class C2484a implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f8163a = 1;

    /* renamed from: b */
    public int f8164b;

    /* renamed from: c */
    public final Object f8165c;

    public C2484a(Object[] array) {
        AbstractC2492i.m4915e(array, "array");
        this.f8165c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f8163a) {
            case 0:
                return this.f8164b < ((Object[]) this.f8165c).length;
            case 1:
                return this.f8164b < ((AbstractC2654d) this.f8165c).mo98a();
        }
        while (true) {
            int r02 = this.f8164b;
            it = (Iterator) this.f8165c;
            if (r02 > 0 && it.hasNext()) {
                it.next();
                this.f8164b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f8163a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f8165c;
                    int r12 = this.f8164b;
                    this.f8164b = r12 + 1;
                    return objArr[r12];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f8164b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int r02 = this.f8164b;
                this.f8164b = r02 + 1;
                return ((AbstractC2654d) this.f8165c).get(r02);
        }
        while (true) {
            int r03 = this.f8164b;
            it = (Iterator) this.f8165c;
            if (r03 > 0 && it.hasNext()) {
                it.next();
                this.f8164b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8163a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2484a(AbstractC2654d abstractC2654d) {
        this.f8165c = abstractC2654d;
    }

    public C2484a(C2919b c2919b) {
        this.f8165c = c2919b.f9570a.iterator();
        this.f8164b = c2919b.f9571b;
    }
}
