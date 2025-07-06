package com.carwizard.p075li.youtube;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC2492i;

@Keep
/* loaded from: classes.dex */
public final class RoundedCornersProvider extends ViewOutlineProvider {
    private float cornersRadius;

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        AbstractC2492i.m4915e(view, "view");
        AbstractC2492i.m4915e(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.cornersRadius);
    }

    public final void setCornersRadius(float f) {
        this.cornersRadius = f;
    }
}
