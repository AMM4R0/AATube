package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;

/* loaded from: classes.dex */
public interface IParamsAppender<T> {
    void appendParams(Uri.Builder builder, T t2);
}
