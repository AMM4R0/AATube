package io.appmetrica.analytics.coreutils.internal.time;

/* loaded from: classes.dex */
public interface TimeProvider {
    long currentTimeMillis();

    long currentTimeSeconds();

    long elapsedRealtime();

    long systemNanoTime();

    long uptimeMillis();
}
