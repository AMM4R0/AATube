package p055T;

import android.graphics.Rect;
import java.util.Comparator;
import p031L.C0356j;
import p124s0.C2738i;

/* renamed from: T.c */
/* loaded from: classes.dex */
public final class C0514c implements Comparator {

    /* renamed from: a */
    public final Rect f1341a = new Rect();

    /* renamed from: b */
    public final Rect f1342b = new Rect();

    /* renamed from: c */
    public final boolean f1343c;

    /* renamed from: d */
    public final C2738i f1344d;

    public C0514c(boolean z2, C2738i c2738i) {
        this.f1343c = z2;
        this.f1344d = c2738i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f1344d.getClass();
        Rect rect = this.f1341a;
        ((C0356j) obj).m1029f(rect);
        Rect rect2 = this.f1342b;
        ((C0356j) obj2).m1029f(rect2);
        int r7 = rect.top;
        int r12 = rect2.top;
        if (r7 < r12) {
            return -1;
        }
        if (r7 > r12) {
            return 1;
        }
        int r72 = rect.left;
        int r13 = rect2.left;
        boolean z2 = this.f1343c;
        if (r72 < r13) {
            return z2 ? 1 : -1;
        }
        if (r72 > r13) {
            return z2 ? -1 : 1;
        }
        int r73 = rect.bottom;
        int r14 = rect2.bottom;
        if (r73 < r14) {
            return -1;
        }
        if (r73 > r14) {
            return 1;
        }
        int r74 = rect.right;
        int r6 = rect2.right;
        if (r74 < r6) {
            return z2 ? 1 : -1;
        }
        if (r74 > r6) {
            return z2 ? -1 : 1;
        }
        return 0;
    }
}
