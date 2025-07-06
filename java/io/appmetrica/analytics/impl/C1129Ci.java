package io.appmetrica.analytics.impl;

import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.reflect.Method;

/* renamed from: io.appmetrica.analytics.impl.Ci */
/* loaded from: classes.dex */
public final class C1129Ci implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        int width;
        int height;
        int r02;
        int r6;
        Display display = (Display) obj;
        if (AndroidUtils.isApiAchieved(17)) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getRealMetrics(displayMetrics);
            r6 = displayMetrics.widthPixels;
            r02 = displayMetrics.heightPixels;
        } else {
            try {
                Method method = Display.class.getMethod("getRawHeight", null);
                width = ((Integer) Display.class.getMethod("getRawWidth", null).invoke(display, null)).intValue();
                height = ((Integer) method.invoke(display, null)).intValue();
            } catch (Throwable unused) {
                width = display.getWidth();
                height = display.getHeight();
            }
            int r4 = width;
            r02 = height;
            r6 = r4;
        }
        return new Point(r6, r02);
    }
}
