package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p143y1.EnumC2902g;
import p143y1.InterfaceC2897b;
import p143y1.InterfaceC2899d;
import p143y1.InterfaceC2901f;

/* renamed from: kotlin.jvm.internal.c */
/* loaded from: classes.dex */
public abstract class AbstractC2486c implements InterfaceC2897b, Serializable {
    public static final Object NO_RECEIVER = C2485b.f8166a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC2897b reflected;
    private final String signature;

    public AbstractC2486c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z2;
    }

    @Override // p143y1.InterfaceC2897b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p143y1.InterfaceC2897b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC2897b compute() {
        InterfaceC2897b interfaceC2897b = this.reflected;
        if (interfaceC2897b != null) {
            return interfaceC2897b;
        }
        InterfaceC2897b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract InterfaceC2897b computeReflected();

    @Override // p143y1.InterfaceC2896a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public InterfaceC2899d getOwner() {
        InterfaceC2899d c2488e;
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            AbstractC2498o.f8175a.getClass();
            c2488e = new C2494k(cls);
        } else {
            AbstractC2498o.f8175a.getClass();
            c2488e = new C2488e(cls);
        }
        return c2488e;
    }

    @Override // p143y1.InterfaceC2897b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC2897b getReflected();

    @Override // p143y1.InterfaceC2897b
    public InterfaceC2901f getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p143y1.InterfaceC2897b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p143y1.InterfaceC2897b
    public EnumC2902g getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p143y1.InterfaceC2897b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p143y1.InterfaceC2897b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p143y1.InterfaceC2897b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
