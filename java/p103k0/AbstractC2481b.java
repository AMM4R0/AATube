package p103k0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p112o.C2682b;

/* renamed from: k0.b */
/* loaded from: classes.dex */
public abstract class AbstractC2481b {

    /* renamed from: a */
    public final C2682b f8152a;

    /* renamed from: b */
    public final C2682b f8153b;

    /* renamed from: c */
    public final C2682b f8154c;

    public AbstractC2481b(C2682b c2682b, C2682b c2682b2, C2682b c2682b3) {
        this.f8152a = c2682b;
        this.f8153b = c2682b2;
        this.f8154c = c2682b3;
    }

    /* renamed from: a */
    public abstract C2482c mo4897a();

    /* renamed from: b */
    public final Class m4898b(Class cls) {
        String name = cls.getName();
        C2682b c2682b = this.f8154c;
        Class cls2 = (Class) c2682b.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c2682b.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: c */
    public final Method m4899c(String str) {
        C2682b c2682b = this.f8152a;
        Method method = (Method) c2682b.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC2481b.class.getClassLoader()).getDeclaredMethod("read", AbstractC2481b.class);
        c2682b.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final Method m4900d(Class cls) {
        String name = cls.getName();
        C2682b c2682b = this.f8153b;
        Method method = (Method) c2682b.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class m4898b = m4898b(cls);
        System.currentTimeMillis();
        Method declaredMethod = m4898b.getDeclaredMethod("write", cls, AbstractC2481b.class);
        c2682b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public abstract boolean mo4901e(int r12);

    /* renamed from: f */
    public final int m4902f(int r12, int r2) {
        return !mo4901e(r2) ? r12 : ((C2482c) this).f8156e.readInt();
    }

    /* renamed from: g */
    public final Parcelable m4903g(Parcelable parcelable, int r2) {
        if (!mo4901e(r2)) {
            return parcelable;
        }
        return ((C2482c) this).f8156e.readParcelable(C2482c.class.getClassLoader());
    }

    /* renamed from: h */
    public final InterfaceC2483d m4904h() {
        String readString = ((C2482c) this).f8156e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC2483d) m4899c(readString).invoke(null, mo4897a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    /* renamed from: i */
    public abstract void mo4905i(int r12);

    /* renamed from: j */
    public final void m4906j(int r12, int r2) {
        mo4905i(r2);
        ((C2482c) this).f8156e.writeInt(r12);
    }

    /* renamed from: k */
    public final void m4907k(Parcelable parcelable, int r3) {
        mo4905i(r3);
        ((C2482c) this).f8156e.writeParcelable(parcelable, 0);
    }

    /* renamed from: l */
    public final void m4908l(InterfaceC2483d interfaceC2483d) {
        if (interfaceC2483d == null) {
            ((C2482c) this).f8156e.writeString(null);
            return;
        }
        try {
            ((C2482c) this).f8156e.writeString(m4898b(interfaceC2483d.getClass()).getName());
            C2482c mo4897a = mo4897a();
            try {
                m4900d(interfaceC2483d.getClass()).invoke(null, interfaceC2483d, mo4897a);
                int r6 = mo4897a.f8160i;
                if (r6 >= 0) {
                    int r62 = mo4897a.f8155d.get(r6);
                    Parcel parcel = mo4897a.f8156e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(r62);
                    parcel.writeInt(dataPosition - r62);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(interfaceC2483d.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}
