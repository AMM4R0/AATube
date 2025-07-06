package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p108m1.AbstractC2661k;

/* renamed from: io.appmetrica.analytics.impl.je */
/* loaded from: classes.dex */
public final class C1947je {

    /* renamed from: a */
    public final C1370M9 f6544a;

    public C1947je(C1370M9 c1370m9) {
        this.f6544a = c1370m9;
    }

    /* renamed from: a */
    public final C1831en m4038a(PluginErrorDetails pluginErrorDetails) {
        ArrayList arrayList;
        String exceptionClass = pluginErrorDetails.getExceptionClass();
        String message = pluginErrorDetails.getMessage();
        List<StackTraceItem> stacktrace = pluginErrorDetails.getStacktrace();
        String platform = pluginErrorDetails.getPlatform();
        String virtualMachineVersion = pluginErrorDetails.getVirtualMachineVersion();
        Map<String, String> pluginEnvironment = pluginErrorDetails.getPluginEnvironment();
        String str = (String) this.f6544a.f5051a.m3832a();
        Boolean bool = (Boolean) this.f6544a.f5052b.m3832a();
        if (stacktrace != null) {
            arrayList = new ArrayList(AbstractC2661k.m5122Z(stacktrace));
            for (StackTraceItem stackTraceItem : stacktrace) {
                arrayList.add(new C1630Wk(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), null));
            }
        } else {
            arrayList = null;
        }
        return new C1831en(new C1582Um(exceptionClass, message, arrayList, null, null), null, null, platform, virtualMachineVersion, pluginEnvironment, str, bool);
    }
}
