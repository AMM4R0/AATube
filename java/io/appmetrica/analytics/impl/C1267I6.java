package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.I6 */
/* loaded from: classes.dex */
public final class C1267I6 implements DataSendingRestrictionController {

    /* renamed from: a */
    public final InterfaceC1217G6 f4851a;

    /* renamed from: b */
    public Boolean f4852b;

    /* renamed from: c */
    public final HashSet f4853c = new HashSet();

    /* renamed from: d */
    public final HashSet f4854d = new HashSet();

    public C1267I6(InterfaceC1217G6 interfaceC1217G6) {
        this.f4851a = interfaceC1217G6;
        this.f4852b = ((C1242H6) interfaceC1217G6).m2924a();
    }

    /* renamed from: a */
    public final synchronized void m2951a(Boolean bool) {
        try {
            if (!AbstractC2356zn.m4700a(bool)) {
                if (this.f4852b == null) {
                }
            }
            boolean equals = Boolean.FALSE.equals(bool);
            this.f4852b = Boolean.valueOf(equals);
            ((C1242H6) this.f4851a).f4815a.m2718b(equals).m4658b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final boolean isRestrictedForBackgroundDataCollection() {
        Boolean bool = this.f4852b;
        return bool == null ? !this.f4853c.isEmpty() || this.f4854d.isEmpty() : bool.booleanValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter() {
        Boolean bool;
        try {
            bool = this.f4852b;
        } finally {
        }
        return bool == null ? this.f4854d.isEmpty() && this.f4853c.isEmpty() : bool.booleanValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f4852b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.f4854d.isEmpty() : bool.booleanValue();
    }

    /* renamed from: a */
    public final synchronized void m2952a(String str, Boolean bool) {
        try {
            if (!AbstractC2356zn.m4700a(bool)) {
                if (!this.f4854d.contains(str) && !this.f4853c.contains(str)) {
                }
            }
            if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                this.f4854d.add(str);
                this.f4853c.remove(str);
            } else {
                this.f4853c.add(str);
                this.f4854d.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
