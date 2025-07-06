package io.appmetrica.analytics.impl;

import java.security.MessageDigest;

/* renamed from: io.appmetrica.analytics.impl.Li */
/* loaded from: classes.dex */
public abstract class AbstractC1354Li {
    /* renamed from: a */
    public static byte[] m3058a(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(str.getBytes("UTF-8"));
        return messageDigest.digest();
    }
}
