package p088h1;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import p006C.AbstractC0049a;
import p009D.AbstractC0095a;
import p028K.AbstractC0283P;

/* renamed from: h1.s */
/* loaded from: classes.dex */
public final class C0939s extends ArrayAdapter {

    /* renamed from: a */
    public ColorStateList f3939a;

    /* renamed from: b */
    public ColorStateList f3940b;

    /* renamed from: c */
    public final /* synthetic */ C0940t f3941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0939s(C0940t c0940t, Context context, int r3, String[] strArr) {
        super(context, r3, strArr);
        this.f3941c = c0940t;
        m2517a();
    }

    /* renamed from: a */
    public final void m2517a() {
        ColorStateList colorStateList;
        C0940t c0940t = this.f3941c;
        ColorStateList colorStateList2 = c0940t.f3949l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] r5 = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{r5, new int[0]}, new int[]{colorStateList2.getColorForState(r5, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f3940b = colorStateList;
        if (c0940t.f3948k != 0 && c0940t.f3949l != null) {
            int[] r4 = {R.attr.state_hovered, -16842919};
            int[] r52 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{r52, r4, new int[0]}, new int[]{AbstractC0049a.m192b(c0940t.f3949l.getColorForState(r52, 0), c0940t.f3948k), AbstractC0049a.m192b(c0940t.f3949l.getColorForState(r4, 0), c0940t.f3948k), c0940t.f3948k});
        }
        this.f3939a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int r4, View view, ViewGroup viewGroup) {
        View view2 = super.getView(r4, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C0940t c0940t = this.f3941c;
            Drawable drawable = null;
            if (c0940t.getText().toString().contentEquals(textView.getText()) && c0940t.f3948k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c0940t.f3948k);
                if (this.f3940b != null) {
                    AbstractC0095a.m319h(colorDrawable, this.f3939a);
                    drawable = new RippleDrawable(this.f3940b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = AbstractC0283P.f842a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
