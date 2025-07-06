package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.Vm */
/* loaded from: classes.dex */
public abstract class AbstractC1607Vm {
    /* renamed from: a */
    public static C1582Um m3446a(Throwable th, int r10, int r11) {
        StackTraceElement[] stackTraceElementArr;
        C1582Um c1582Um;
        ArrayList arrayList;
        String name = th.getClass().getName();
        String message = th.getMessage();
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (Throwable unused) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ArrayList arrayList2 = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList2.add(new C1630Wk(stackTraceElement));
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            if (r11 >= r10) {
                cause = null;
            }
            if (cause != null) {
                c1582Um = m3446a(cause, 30, r11 + 1);
                if (AndroidUtils.isApiAchieved(19) || r11 >= r10) {
                    arrayList = null;
                } else {
                    Throwable[] suppressed = th.getSuppressed();
                    arrayList = new ArrayList(suppressed.length);
                    for (Throwable th2 : suppressed) {
                        arrayList.add(m3446a(th2, 1, r11));
                    }
                }
                return new C1582Um(name, message, arrayList2, c1582Um, arrayList);
            }
        }
        c1582Um = null;
        if (AndroidUtils.isApiAchieved(19)) {
        }
        arrayList = null;
        return new C1582Um(name, message, arrayList2, c1582Um, arrayList);
    }
}
