package io.appmetrica.analytics.network.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p001A0.AbstractC0005b;
import p131u1.InterfaceC2799a;

/* renamed from: io.appmetrica.analytics.network.impl.e */
/* loaded from: classes.dex */
public abstract class AbstractC2395e {
    /* renamed from: a */
    public static byte[] m4754a(int r7, InterfaceC2799a interfaceC2799a) {
        try {
            InputStream inputStream = (InputStream) interfaceC2799a.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        int r4 = 0;
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (-1 == read || r4 > r7) {
                                break;
                            }
                            if (read > 0) {
                                byteArrayOutputStream.write(bArr, 0, read);
                                r4 += read;
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        AbstractC0005b.m66l(byteArrayOutputStream, null);
                        AbstractC0005b.m66l(inputStream, null);
                        return byteArray;
                    } catch (Throwable unused) {
                        AbstractC0005b.m66l(byteArrayOutputStream, null);
                        AbstractC0005b.m66l(inputStream, null);
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }

    /* renamed from: a */
    public static final Map m4753a(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }
}
