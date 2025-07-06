package p090i0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: i0.b */
/* loaded from: classes.dex */
public final class C0956b extends Property {

    /* renamed from: a */
    public final /* synthetic */ int f3996a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0956b(Class cls, String str, int r3) {
        super(cls, str);
        this.f3996a = r3;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3996a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(AbstractC0977w.f4066a.mo1092r((View) obj));
            case 6:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f1916z);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f3996a) {
            case 0:
                C0959e c0959e = (C0959e) obj;
                PointF pointF = (PointF) obj2;
                c0959e.getClass();
                c0959e.f3999a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0959e.f4000b = round;
                int r02 = c0959e.f4004f + 1;
                c0959e.f4004f = r02;
                if (r02 == c0959e.f4005g) {
                    AbstractC0977w.m2586a(c0959e.f4003e, c0959e.f3999a, round, c0959e.f4001c, c0959e.f4002d);
                    c0959e.f4004f = 0;
                    c0959e.f4005g = 0;
                    break;
                }
                break;
            case 1:
                C0959e c0959e2 = (C0959e) obj;
                PointF pointF2 = (PointF) obj2;
                c0959e2.getClass();
                c0959e2.f4001c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0959e2.f4002d = round2;
                int r03 = c0959e2.f4005g + 1;
                c0959e2.f4005g = r03;
                if (c0959e2.f4004f == r03) {
                    AbstractC0977w.m2586a(c0959e2.f4003e, c0959e2.f3999a, c0959e2.f4000b, c0959e2.f4001c, round2);
                    c0959e2.f4004f = 0;
                    c0959e2.f4005g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC0977w.m2586a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC0977w.m2586a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                AbstractC0977w.m2586a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                AbstractC0977w.f4066a.mo1089A((View) obj, floatValue);
                break;
            case 6:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}
