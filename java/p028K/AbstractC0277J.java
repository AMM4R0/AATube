package p028K;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import p040O.AbstractC0406a;

/* renamed from: K.J */
/* loaded from: classes.dex */
public abstract class AbstractC0277J {
    /* renamed from: a */
    public static View.AccessibilityDelegate m753a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* renamed from: b */
    public static ContentCaptureSession m754b(View view) {
        return view.getContentCaptureSession();
    }

    /* renamed from: c */
    public static List<Rect> m755c(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* renamed from: d */
    public static void m756d(View view, Context context, int[] r2, AttributeSet attributeSet, TypedArray typedArray, int r5, int r6) {
        view.saveAttributeDataForStyleable(context, r2, attributeSet, typedArray, r5, r6);
    }

    /* renamed from: e */
    public static void m757e(View view, AbstractC0406a abstractC0406a) {
        view.setContentCaptureSession(null);
    }

    /* renamed from: f */
    public static void m758f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
