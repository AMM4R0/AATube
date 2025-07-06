package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import p105l1.C2632c;
import p108m1.AbstractC2671u;

/* renamed from: io.appmetrica.analytics.impl.Fg */
/* loaded from: classes.dex */
public final class RunnableC1202Fg implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C1075Ae m4216w = C2018ma.f6725C.m4216w();
        if (timePassedChecker.didTimePassMillis(m4216w.m2726f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            C2632c c2632c = new C2632c("major", Integer.valueOf(kotlinVersion.getMajor()));
            C2632c c2632c2 = new C2632c("minor", Integer.valueOf(kotlinVersion.getMinor()));
            C2632c c2632c3 = new C2632c("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb = new StringBuilder();
            sb.append(kotlinVersion.getMajor());
            sb.append('.');
            sb.append(kotlinVersion.getMinor());
            sb.append('.');
            sb.append(kotlinVersion.getPatch());
            Map m5127d0 = AbstractC2671u.m5127d0(c2632c, c2632c2, c2632c3, new C2632c("version", sb.toString()));
            C2202tj c2202tj = AbstractC1553Ti.f5485a;
            c2202tj.getClass();
            c2202tj.m4458a(new C2152rj("kotlin_version", m5127d0));
            m4216w.m2719c(systemTimeProvider.currentTimeMillis()).m4658b();
        }
    }
}
