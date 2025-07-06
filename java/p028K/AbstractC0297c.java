package p028K;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.ClipData;
import android.view.ContentInfo;

/* renamed from: K.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0297c {
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException m816d(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    /* renamed from: f */
    public static /* synthetic */ ContentInfo.Builder m818f(ClipData clipData, int r2) {
        return new ContentInfo.Builder(clipData, r2);
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ ContentInfo m820h(Object obj) {
        return (ContentInfo) obj;
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ boolean m826n(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }
}
