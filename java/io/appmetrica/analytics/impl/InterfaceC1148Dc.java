package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Dc */
/* loaded from: classes.dex */
public interface InterfaceC1148Dc extends InterfaceC1647Xc {
    /* renamed from: a */
    List<ModuleServicesDatabase> mo2831a();

    /* renamed from: b */
    /* synthetic */ Map mo2832b();

    /* renamed from: c */
    /* synthetic */ Map mo2833c();

    /* renamed from: d */
    List<Consumer<Location>> mo2834d();

    /* renamed from: e */
    ModuleLocationSourcesServiceController mo2835e();

    /* renamed from: f */
    Toggle mo2836f();

    /* renamed from: g */
    /* synthetic */ List mo2837g();
}
