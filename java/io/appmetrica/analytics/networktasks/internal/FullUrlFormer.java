package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import io.appmetrica.analytics.networktasks.impl.C2399c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FullUrlFormer<T> {

    /* renamed from: a */
    private List f7732a = new ArrayList();

    /* renamed from: b */
    private int f7733b = -1;

    /* renamed from: c */
    private String f7734c;

    /* renamed from: d */
    private final IParamsAppender f7735d;

    /* renamed from: e */
    private final ConfigProvider f7736e;

    public FullUrlFormer(IParamsAppender<T> iParamsAppender, ConfigProvider<T> configProvider) {
        this.f7735d = iParamsAppender;
        this.f7736e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder buildUpon = Uri.parse((String) this.f7732a.get(this.f7733b)).buildUpon();
        this.f7735d.appendParams(buildUpon, this.f7736e.getConfig());
        this.f7734c = buildUpon.build().toString();
    }

    public List<String> getAllHosts() {
        return this.f7732a;
    }

    public String getUrl() {
        return new C2399c(this.f7734c).f7706a;
    }

    public boolean hasMoreHosts() {
        return this.f7733b + 1 < this.f7732a.size();
    }

    public void incrementAttemptNumber() {
        this.f7733b++;
    }

    public void setHosts(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f7732a = list;
    }
}
