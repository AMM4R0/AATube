package p140x1;

import android.support.v4.media.session.AbstractC0580g;
import java.util.Iterator;

/* renamed from: x1.a */
/* loaded from: classes.dex */
public abstract class AbstractC2889a implements Iterable {

    /* renamed from: a */
    public final char f9511a;

    /* renamed from: b */
    public final char f9512b;

    /* renamed from: c */
    public final int f9513c = 1;

    public AbstractC2889a(char c, char c2) {
        this.f9511a = c;
        this.f9512b = (char) AbstractC0580g.m1451p(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2890b(this.f9511a, this.f9512b, this.f9513c);
    }
}
