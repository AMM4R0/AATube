package p108m1;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C2484a;
import p000A.AbstractC0002c;

/* renamed from: m1.b */
/* loaded from: classes.dex */
public final class C2652b extends C2484a implements ListIterator {

    /* renamed from: d */
    public final /* synthetic */ AbstractC2654d f8594d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2652b(AbstractC2654d abstractC2654d, int r5) {
        super(abstractC2654d);
        this.f8594d = abstractC2654d;
        int mo98a = abstractC2654d.mo98a();
        if (r5 < 0 || r5 > mo98a) {
            throw new IndexOutOfBoundsException(AbstractC0002c.m12g("index: ", r5, mo98a, ", size: "));
        }
        this.f8164b = r5;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8164b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8164b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int r02 = this.f8164b - 1;
        this.f8164b = r02;
        return this.f8594d.get(r02);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8164b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
