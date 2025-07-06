package io.appmetrica.analytics.plugins;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class PluginErrorDetails {

    /* renamed from: a */
    private final String f7769a;

    /* renamed from: b */
    private final String f7770b;

    /* renamed from: c */
    private final ArrayList f7771c;

    /* renamed from: d */
    private final String f7772d;

    /* renamed from: e */
    private final String f7773e;

    /* renamed from: f */
    private final Map f7774f;

    public static class Builder {

        /* renamed from: a */
        private String f7775a;

        /* renamed from: b */
        private String f7776b;

        /* renamed from: c */
        private List f7777c;

        /* renamed from: d */
        private String f7778d;

        /* renamed from: e */
        private String f7779e;

        /* renamed from: f */
        private Map f7780f;

        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f7775a, this.f7776b, (List) WrapUtils.getOrDefault(this.f7777c, new ArrayList()), this.f7778d, this.f7779e, (Map) WrapUtils.getOrDefault(this.f7780f, new HashMap()), 0);
        }

        public Builder withExceptionClass(String str) {
            this.f7775a = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.f7776b = str;
            return this;
        }

        public Builder withPlatform(String str) {
            this.f7778d = str;
            return this;
        }

        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f7780f = map;
            return this;
        }

        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f7777c = list;
            return this;
        }

        public Builder withVirtualMachineVersion(String str) {
            this.f7779e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int r7) {
        this(str, str2, list, str3, str4, map);
    }

    public String getExceptionClass() {
        return this.f7769a;
    }

    public String getMessage() {
        return this.f7770b;
    }

    public String getPlatform() {
        return this.f7772d;
    }

    public Map<String, String> getPluginEnvironment() {
        return this.f7774f;
    }

    public List<StackTraceItem> getStacktrace() {
        return this.f7771c;
    }

    public String getVirtualMachineVersion() {
        return this.f7773e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f7769a = str;
        this.f7770b = str2;
        this.f7771c = new ArrayList(list);
        this.f7772d = str3;
        this.f7773e = str4;
        this.f7774f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
