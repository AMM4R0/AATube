package p132v;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p123s.AbstractC2728i;
import p123s.C2723d;

/* renamed from: v.c */
/* loaded from: classes.dex */
public abstract class AbstractC2823c extends View {

    /* renamed from: a */
    public int[] f9160a;

    /* renamed from: b */
    public int f9161b;

    /* renamed from: c */
    public Context f9162c;

    /* renamed from: d */
    public AbstractC2728i f9163d;

    /* renamed from: e */
    public String f9164e;

    /* renamed from: f */
    public String f9165f;

    /* renamed from: g */
    public HashMap f9166g;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5427a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto La7
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto La7
        La:
            android.content.Context r0 = r5.f9162c
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L21:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L31
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5b
            if (r1 == 0) goto L5b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.f1981m
            if (r3 == 0) goto L4f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.f1981m
            java.lang.Object r3 = r3.get(r6)
            goto L50
        L4f:
            r3 = r2
        L50:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5c
        L5b:
            r3 = 0
        L5c:
            if (r3 != 0) goto L64
            if (r1 == 0) goto L64
            int r3 = r5.m5432f(r1, r6)
        L64:
            if (r3 != 0) goto L70
            java.lang.Class<v.q> r1 = p132v.AbstractC2837q.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L70
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L70
        L70:
            if (r3 != 0) goto L80
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L80:
            if (r3 == 0) goto L8f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f9166g
            r1.put(r0, r6)
            r5.m5428b(r3)
            goto La7
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p132v.AbstractC2823c.m5427a(java.lang.String):void");
    }

    /* renamed from: b */
    public final void m5428b(int r4) {
        if (r4 == getId()) {
            return;
        }
        int r02 = this.f9161b + 1;
        int[] r12 = this.f9160a;
        if (r02 > r12.length) {
            this.f9160a = Arrays.copyOf(r12, r12.length * 2);
        }
        int[] r03 = this.f9160a;
        int r13 = this.f9161b;
        r03[r13] = r4;
        this.f9161b = r13 + 1;
    }

    /* renamed from: c */
    public final void m5429c(String str) {
        if (str == null || str.length() == 0 || this.f9162c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int r3 = 0; r3 < childCount; r3++) {
            View childAt = constraintLayout.getChildAt(r3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C2825e) && trim.equals(((C2825e) layoutParams).f9192Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m5428b(childAt.getId());
                }
            }
        }
    }

    /* renamed from: d */
    public final void m5430d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int r2 = 0; r2 < this.f9161b; r2++) {
            View view = (View) constraintLayout.f1969a.get(this.f9160a[r2]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: f */
    public final int m5432f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f9162c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int r3 = 0; r3 < childCount; r3++) {
            View childAt = constraintLayout.getChildAt(r3);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    public void mo5433g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2838r.f9371b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int r12 = 0; r12 < indexCount; r12++) {
                int index = obtainStyledAttributes.getIndex(r12);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f9164e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f9165f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f9160a, this.f9161b);
    }

    /* renamed from: h */
    public abstract void mo1561h(C2723d c2723d, boolean z2);

    /* renamed from: i */
    public final void m5434i() {
        if (this.f9163d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C2825e) {
            ((C2825e) layoutParams).f9225p0 = this.f9163d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f9164e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f9165f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int r12, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f9164e = str;
        if (str == null) {
            return;
        }
        int r02 = 0;
        this.f9161b = 0;
        while (true) {
            int indexOf = str.indexOf(44, r02);
            if (indexOf == -1) {
                m5427a(str.substring(r02));
                return;
            } else {
                m5427a(str.substring(r02, indexOf));
                r02 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f9165f = str;
        if (str == null) {
            return;
        }
        int r02 = 0;
        this.f9161b = 0;
        while (true) {
            int indexOf = str.indexOf(44, r02);
            if (indexOf == -1) {
                m5429c(str.substring(r02));
                return;
            } else {
                m5429c(str.substring(r02, indexOf));
                r02 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] r3) {
        this.f9164e = null;
        this.f9161b = 0;
        for (int r02 : r3) {
            m5428b(r02);
        }
    }

    @Override // android.view.View
    public final void setTag(int r12, Object obj) {
        super.setTag(r12, obj);
        if (obj == null && this.f9164e == null) {
            m5428b(r12);
        }
    }

    /* renamed from: e */
    public void mo5431e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
