package io.appmetrica.analytics.coreapi.internal.permission;

/* loaded from: classes.dex */
public class PermissionState {
    public final boolean granted;
    public final String name;

    public PermissionState(String str, boolean z2) {
        this.name = str;
        this.granted = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionState permissionState = (PermissionState) obj;
        if (this.granted != permissionState.granted) {
            return false;
        }
        return this.name.equals(permissionState.name);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + (this.granted ? 1 : 0);
    }

    public String toString() {
        return "PermissionState{name='" + this.name + "', granted=" + this.granted + '}';
    }
}
