package p108m1;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: m1.k */
/* loaded from: classes.dex */
public abstract class AbstractC2661k extends AbstractC2660j {
    /* renamed from: Z */
    public static int m5122Z(Iterable iterable) {
        AbstractC2492i.m4915e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
