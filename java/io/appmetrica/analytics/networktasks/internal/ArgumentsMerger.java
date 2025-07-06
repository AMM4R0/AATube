package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public interface ArgumentsMerger<I, O> {
    boolean compareWithOtherArguments(I r12);

    O mergeFrom(I r12);
}
