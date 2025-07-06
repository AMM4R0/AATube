package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import p028K.AbstractC0283P;
import p047Q0.C0450e;
import p065Y0.C0546a;
import p104l.C2621x;

/* loaded from: classes.dex */
public class CheckableImageButton extends C2621x implements Checkable {

    /* renamed from: g */
    public static final int[] f2947g = {R.attr.state_checked};

    /* renamed from: d */
    public boolean f2948d;

    /* renamed from: e */
    public boolean f2949e;

    /* renamed from: f */
    public boolean f2950f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.carwizard.p075li.youtube.R.attr.imageButtonStyle);
        this.f2949e = true;
        this.f2950f = true;
        AbstractC0283P.m779l(this, new C0450e(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2948d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        return this.f2948d ? View.mergeDrawableStates(super.onCreateDrawableState(r2 + 1), f2947g) : super.onCreateDrawableState(r2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0546a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0546a c0546a = (C0546a) parcelable;
        super.onRestoreInstanceState(c0546a.f1263a);
        setChecked(c0546a.f1476c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0546a c0546a = new C0546a(super.onSaveInstanceState());
        c0546a.f1476c = this.f2948d;
        return c0546a;
    }

    public void setCheckable(boolean z2) {
        if (this.f2949e != z2) {
            this.f2949e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f2949e || this.f2948d == z2) {
            return;
        }
        this.f2948d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f2950f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f2950f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2948d);
    }
}
