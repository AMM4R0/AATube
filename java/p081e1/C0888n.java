package p081e1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import p078d1.C0782a;

/* renamed from: e1.n */
/* loaded from: classes.dex */
public final class C0888n extends AbstractC0894t {

    /* renamed from: c */
    public final /* synthetic */ ArrayList f3719c;

    /* renamed from: d */
    public final /* synthetic */ Matrix f3720d;

    public C0888n(ArrayList arrayList, Matrix matrix) {
        this.f3719c = arrayList;
        this.f3720d = matrix;
    }

    @Override // p081e1.AbstractC0894t
    /* renamed from: a */
    public final void mo2420a(Matrix matrix, C0782a c0782a, int r5, Canvas canvas) {
        Iterator it = this.f3719c.iterator();
        while (it.hasNext()) {
            ((AbstractC0894t) it.next()).mo2420a(this.f3720d, c0782a, r5, canvas);
        }
    }
}
