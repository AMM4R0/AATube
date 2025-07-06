package io.appmetrica.analytics.networktasks.internal;

import kotlin.jvm.internal.AbstractC2489f;
import kotlin.jvm.internal.AbstractC2492i;

/* loaded from: classes.dex */
public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    private static volatile NetworkServiceLocator f7742b;

    /* renamed from: a */
    private final NetworkCore f7743a;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2489f abstractC2489f) {
            this();
        }

        public final NetworkServiceLocator getInstance() {
            NetworkServiceLocator networkServiceLocator = NetworkServiceLocator.f7742b;
            if (networkServiceLocator != null) {
                return networkServiceLocator;
            }
            AbstractC2492i.m4918h("instance");
            throw null;
        }

        public final void init() {
            if (NetworkServiceLocator.f7742b == null) {
                synchronized (NetworkServiceLocator.class) {
                    if (NetworkServiceLocator.f7742b == null) {
                        NetworkServiceLocator.f7742b = new NetworkServiceLocator();
                    }
                }
            }
        }

        private Companion() {
        }

        public final void init(NetworkServiceLocator networkServiceLocator) {
            NetworkServiceLocator.f7742b = networkServiceLocator;
        }
    }

    public NetworkServiceLocator() {
        NetworkCore networkCore = new NetworkCore();
        networkCore.setName("IAA-NC");
        networkCore.start();
        this.f7743a = networkCore;
    }

    public static final NetworkServiceLocator getInstance() {
        return Companion.getInstance();
    }

    public static final void init() {
        Companion.init();
    }

    public final NetworkCore getNetworkCore() {
        return this.f7743a;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onCreate() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onDestroy() {
        this.f7743a.stopTasks();
    }

    public static final void init(NetworkServiceLocator networkServiceLocator) {
        Companion.init(networkServiceLocator);
    }
}
