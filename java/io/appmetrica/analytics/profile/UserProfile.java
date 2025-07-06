package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC2181sn;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class UserProfile {

    /* renamed from: a */
    private final List f7800a;

    public static class Builder {

        /* renamed from: a */
        private final LinkedList f7801a;

        public /* synthetic */ Builder(int r12) {
            this();
        }

        public Builder apply(UserProfileUpdate<? extends InterfaceC2181sn> userProfileUpdate) {
            this.f7801a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f7801a, 0);
        }

        private Builder() {
            this.f7801a = new LinkedList();
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int r2) {
        this(linkedList);
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public List<UserProfileUpdate<? extends InterfaceC2181sn>> getUserProfileUpdates() {
        return this.f7800a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f7800a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
