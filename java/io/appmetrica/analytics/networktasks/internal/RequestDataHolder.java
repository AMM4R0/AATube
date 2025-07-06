package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class RequestDataHolder {

    /* renamed from: a */
    private NetworkTask.Method f7754a = NetworkTask.Method.GET;

    /* renamed from: b */
    private final HashMap f7755b = new HashMap();

    /* renamed from: c */
    private byte[] f7756c = null;

    /* renamed from: d */
    private Long f7757d;

    /* renamed from: e */
    private Integer f7758e;

    public void applySendTime(long j2) {
        this.f7757d = Long.valueOf(j2);
        this.f7758e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j2) * 1000) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
    }

    public Map<String, List<String>> getHeaders() {
        return this.f7755b;
    }

    public NetworkTask.Method getMethod() {
        return this.f7754a;
    }

    public byte[] getPostData() {
        return this.f7756c;
    }

    public Long getSendTimestamp() {
        return this.f7757d;
    }

    public Integer getSendTimezoneSec() {
        return this.f7758e;
    }

    public void setHeader(String str, String... strArr) {
        this.f7755b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f7754a = NetworkTask.Method.POST;
        this.f7756c = bArr;
    }
}
