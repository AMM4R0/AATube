package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.p095io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.AbstractC2401e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class NetworkTask {

    /* renamed from: a */
    private int f7744a = 1;

    /* renamed from: b */
    private final Executor f7745b;

    /* renamed from: c */
    private final IExecutionPolicy f7746c;

    /* renamed from: d */
    private final ExponentialBackoffPolicy f7747d;

    /* renamed from: e */
    private final UnderlyingNetworkTask f7748e;

    /* renamed from: f */
    private final List f7749f;

    /* renamed from: g */
    private final String f7750g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int r12);
    }

    public NetworkTask(Executor executor, IExecutionPolicy iExecutionPolicy, ExponentialBackoffPolicy exponentialBackoffPolicy, UnderlyingNetworkTask underlyingNetworkTask, List<ShouldTryNextHostCondition> list, String str) {
        this.f7745b = executor;
        this.f7746c = iExecutionPolicy;
        this.f7747d = exponentialBackoffPolicy;
        this.f7748e = underlyingNetworkTask;
        this.f7749f = list;
        this.f7750g = str;
    }

    /* renamed from: a */
    private synchronized boolean m4759a(int r2) {
        if (!m4760a(r2)) {
            return false;
        }
        this.f7744a = r2;
        return true;
    }

    public String description() {
        return this.f7748e.description();
    }

    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f7746c;
    }

    public Executor getExecutor() {
        return this.f7745b;
    }

    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f7747d;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.f7748e.getRequestDataHolder();
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.f7748e.getResponseDataHolder();
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f7748e.getRetryPolicyConfig();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f7748e.getSslSocketFactory();
    }

    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f7748e;
    }

    public String getUrl() {
        return this.f7748e.getFullUrlFormer().getUrl();
    }

    public String getUserAgent() {
        return this.f7750g;
    }

    public boolean onCreateNetworkTask() {
        if (m4759a(3)) {
            return this.f7748e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean m4759a = m4759a(4);
        if (m4759a) {
            this.f7748e.getFullUrlFormer().incrementAttemptNumber();
            this.f7748e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f7748e.onPerformRequest();
        }
        return m4759a;
    }

    public boolean onRequestComplete() {
        boolean z2;
        boolean z3;
        synchronized (this) {
            try {
                if (m4760a(5, 6)) {
                    z2 = this.f7748e.onRequestComplete();
                    if (z2) {
                        this.f7744a = 5;
                    } else {
                        this.f7744a = 6;
                    }
                    z3 = true;
                } else {
                    z2 = false;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            this.f7748e.onPostRequestComplete(z2);
        }
        return z2;
    }

    public void onRequestError(Throwable th) {
        if (m4759a(6)) {
            this.f7748e.onRequestError(th);
        }
    }

    public void onShouldNotExecute() {
        if (m4759a(7)) {
            this.f7748e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean m4759a = m4759a(2);
        if (m4759a) {
            this.f7748e.onTaskAdded();
        }
        return m4759a;
    }

    public void onTaskFinished() {
        int r02;
        boolean m4759a;
        synchronized (this) {
            r02 = this.f7744a;
            m4759a = m4759a(8);
        }
        if (m4759a) {
            this.f7748e.onTaskFinished();
            if (r02 == 5) {
                this.f7748e.onSuccessfulTaskFinished();
            } else if (r02 == 6 || r02 == 7) {
                this.f7748e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (m4759a(9)) {
            this.f7748e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean hasMoreHosts;
        boolean z2;
        int r2;
        try {
            hasMoreHosts = this.f7748e.getFullUrlFormer().hasMoreHosts();
            int responseCode = this.f7748e.getResponseDataHolder().getResponseCode();
            Iterator it = this.f7749f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = true;
                    break;
                }
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z2 = false;
                    break;
                }
            }
            r2 = this.f7744a;
        } catch (Throwable th) {
            throw th;
        }
        return r2 != 9 && r2 != 8 && hasMoreHosts && z2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private synchronized boolean m4760a(int... r14) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        try {
            bool = Boolean.TRUE;
            int r12 = this.f7744a;
            int length = r14.length;
            int r4 = 0;
            while (true) {
                if (r4 < length) {
                    boolean z2 = true;
                    switch (AbstractC2401e.m4757a(r14[r4])) {
                        case 0:
                            bool3 = null;
                            break;
                        case 1:
                            if (r12 != 1) {
                                z2 = false;
                            }
                            bool3 = Boolean.valueOf(z2);
                            break;
                        case 2:
                        case 6:
                            if (r12 != 2) {
                                if (r12 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            } else {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                        case 3:
                            if (r12 != 3 && r12 != 5 && r12 != 6) {
                                if (r12 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            }
                            bool3 = Boolean.TRUE;
                        case 4:
                        case 5:
                            if (r12 != 4) {
                                if (r12 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            } else {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                        case 7:
                            if (r12 != 5 && r12 != 6 && r12 != 7 && r12 != 2 && r12 != 3 && r12 != 4) {
                                if (r12 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            }
                            bool3 = Boolean.TRUE;
                        case 8:
                            if (r12 != 1) {
                                if (r12 == 9) {
                                    z2 = false;
                                }
                                bool3 = Boolean.valueOf(z2);
                                break;
                            } else {
                                bool3 = null;
                                break;
                            }
                        default:
                            bool3 = Boolean.FALSE;
                            break;
                    }
                    if (Boolean.TRUE.equals(bool3)) {
                        r4++;
                    } else {
                        bool = bool3;
                    }
                }
            }
            bool2 = Boolean.TRUE;
            bool2.equals(bool);
        } catch (Throwable th) {
            throw th;
        }
        return bool2.equals(bool);
    }
}
