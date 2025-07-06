package kotlin.jvm.internal;

import p128t1.C2775a;
import p143y1.InterfaceC2897b;
import p143y1.InterfaceC2900e;

/* renamed from: kotlin.jvm.internal.g */
/* loaded from: classes.dex */
public abstract class AbstractC2490g extends AbstractC2486c implements InterfaceC2900e {
    private final int arity;
    private final int flags;

    public AbstractC2490g(int r7, Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, false);
        this.arity = r7;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.AbstractC2486c
    public InterfaceC2897b computeReflected() {
        AbstractC2498o.f8175a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2490g) {
            AbstractC2490g abstractC2490g = (AbstractC2490g) obj;
            return getName().equals(abstractC2490g.getName()) && getSignature().equals(abstractC2490g.getSignature()) && this.flags == abstractC2490g.flags && this.arity == abstractC2490g.arity && AbstractC2492i.m4911a(getBoundReceiver(), abstractC2490g.getBoundReceiver()) && AbstractC2492i.m4911a(getOwner(), abstractC2490g.getOwner());
        }
        if (obj instanceof InterfaceC2900e) {
            return obj.equals(compute());
        }
        return false;
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // p143y1.InterfaceC2900e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p143y1.InterfaceC2900e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p143y1.InterfaceC2900e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p143y1.InterfaceC2900e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // p143y1.InterfaceC2900e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC2897b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC2486c
    public InterfaceC2900e getReflected() {
        InterfaceC2897b compute = compute();
        if (compute != this) {
            return (InterfaceC2900e) compute;
        }
        throw new C2775a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
