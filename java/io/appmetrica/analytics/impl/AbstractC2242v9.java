package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.v9 */
/* loaded from: classes.dex */
public abstract class AbstractC2242v9 {

    /* renamed from: a */
    public static final Set f7279a;

    /* renamed from: b */
    public static final EnumSet f7280b;

    /* renamed from: c */
    public static final EnumSet f7281c;

    /* renamed from: d */
    public static final EnumSet f7282d;

    /* renamed from: e */
    public static final EnumSet f7283e;

    /* renamed from: f */
    public static final EnumSet f7284f;

    /* renamed from: g */
    public static final EnumSet f7285g;

    /* renamed from: h */
    public static final List f7286h;

    /* renamed from: i */
    public static final List f7287i;

    static {
        EnumC1670Ya enumC1670Ya = EnumC1670Ya.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        f7279a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC1670Ya enumC1670Ya2 = EnumC1670Ya.EVENT_TYPE_UNDEFINED;
        EnumC1670Ya enumC1670Ya3 = EnumC1670Ya.EVENT_TYPE_PURGE_BUFFER;
        EnumC1670Ya enumC1670Ya4 = EnumC1670Ya.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC1670Ya enumC1670Ya5 = EnumC1670Ya.EVENT_TYPE_SET_SESSION_EXTRA;
        f7280b = EnumSet.of(enumC1670Ya2, enumC1670Ya3, EnumC1670Ya.EVENT_TYPE_SEND_REFERRER, EnumC1670Ya.EVENT_TYPE_APP_ENVIRONMENT_UPDATED, EnumC1670Ya.EVENT_TYPE_APP_ENVIRONMENT_CLEARED, EnumC1670Ya.EVENT_TYPE_ACTIVATION, enumC1670Ya4, enumC1670Ya5);
        f7281c = EnumSet.of(EnumC1670Ya.EVENT_TYPE_UPDATE_FOREGROUND_TIME, enumC1670Ya);
        EnumC1670Ya enumC1670Ya6 = EnumC1670Ya.EVENT_TYPE_REGULAR;
        f7282d = EnumSet.of(enumC1670Ya, EnumC1670Ya.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, EnumC1670Ya.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, EnumC1670Ya.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, EnumC1670Ya.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, EnumC1670Ya.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, enumC1670Ya4, enumC1670Ya6, EnumC1670Ya.EVENT_CLIENT_EXTERNAL_ATTRIBUTION);
        f7283e = EnumSet.of(enumC1670Ya6);
        f7284f = EnumSet.of(enumC1670Ya4);
        f7285g = EnumSet.of(EnumC1670Ya.EVENT_TYPE_ALIVE, enumC1670Ya3, enumC1670Ya5);
        f7286h = Arrays.asList(0, 6145, 4097, 8224);
        f7287i = Arrays.asList(12290);
    }
}
