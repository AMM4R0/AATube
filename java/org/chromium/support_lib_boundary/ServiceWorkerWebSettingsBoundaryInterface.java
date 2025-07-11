package org.chromium.support_lib_boundary;

import java.util.Set;

/* loaded from: classes.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z2);

    void setAllowFileAccess(boolean z2);

    void setBlockNetworkLoads(boolean z2);

    void setCacheMode(int r12);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
