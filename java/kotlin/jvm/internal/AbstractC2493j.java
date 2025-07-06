package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.j */
/* loaded from: classes.dex */
public abstract class AbstractC2493j implements Serializable {
    private final int arity;

    public AbstractC2493j(int r12) {
        this.arity = r12;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        AbstractC2498o.f8175a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        AbstractC2492i.m4914d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
