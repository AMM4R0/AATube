package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import p028K.AbstractC0283P;
import p046Q.C0434h;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    public final boolean f2856a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC0767w.m2124c(null);
        if (C0757m.m2109D(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.carwizard.p075li.youtube.R.id.cancel_button);
            setNextFocusRightId(com.carwizard.p075li.youtube.R.id.confirm_button);
        }
        this.f2856a = C0757m.m2109D(getContext(), com.carwizard.p075li.youtube.R.attr.nestedScrollable);
        AbstractC0283P.m779l(this, new C0434h(3));
    }

    /* renamed from: a */
    public final C0760p m2102a() {
        return (C0760p) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C0760p) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C0760p) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0760p c0760p = (C0760p) super.getAdapter();
        c0760p.getClass();
        int max = Math.max(c0760p.m2115a(), getFirstVisiblePosition());
        int min = Math.min(c0760p.m2117c(), getLastVisiblePosition());
        c0760p.getItem(max);
        c0760p.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z2, int r2, Rect rect) {
        if (!z2) {
            super.onFocusChanged(false, r2, rect);
            return;
        }
        if (r2 == 33) {
            setSelection(((C0760p) super.getAdapter()).m2117c());
        } else if (r2 == 130) {
            setSelection(((C0760p) super.getAdapter()).m2115a());
        } else {
            super.onFocusChanged(true, r2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r4, KeyEvent keyEvent) {
        if (!super.onKeyDown(r4, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C0760p) super.getAdapter()).m2115a()) {
            return true;
        }
        if (19 != r4) {
            return false;
        }
        setSelection(((C0760p) super.getAdapter()).m2115a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int r2, int r3) {
        if (!this.f2856a) {
            super.onMeasure(r2, r3);
            return;
        }
        super.onMeasure(r2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int r2) {
        if (r2 < ((C0760p) super.getAdapter()).m2115a()) {
            super.setSelection(((C0760p) super.getAdapter()).m2115a());
        } else {
            super.setSelection(r2);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (C0760p) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C0760p)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C0760p.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
