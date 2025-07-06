package p108m1;

import java.util.AbstractList;
import java.util.List;

/* renamed from: m1.e */
/* loaded from: classes.dex */
public abstract class AbstractC2655e extends AbstractList implements List {
    /* renamed from: a */
    public abstract int mo5095a();

    /* renamed from: b */
    public abstract Object mo5096b(int r12);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int r12) {
        return mo5096b(r12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo5095a();
    }
}
