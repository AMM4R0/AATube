package io.appmetrica.analytics.coreapi.internal.event;

import java.util.Map;

/* loaded from: classes.dex */
public interface CounterReportApi {
    int getBytesTruncated();

    int getCustomType();

    Map<String, byte[]> getExtras();

    String getName();

    int getType();

    String getValue();

    byte[] getValueBytes();

    void setBytesTruncated(int r12);

    void setCustomType(int r12);

    void setExtras(Map<String, byte[]> map);

    void setName(String str);

    void setType(int r12);

    void setValue(String str);

    void setValueBytes(byte[] bArr);
}
