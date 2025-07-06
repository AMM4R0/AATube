package p002A1;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: A1.i */
/* loaded from: classes.dex */
public final class C0016i implements Serializable {

    /* renamed from: a */
    public final Pattern f28a;

    public C0016i(String str) {
        Pattern compile = Pattern.compile(str);
        AbstractC2492i.m4914d(compile, "compile(...)");
        this.f28a = compile;
    }

    public final String toString() {
        String pattern = this.f28a.toString();
        AbstractC2492i.m4914d(pattern, "toString(...)");
        return pattern;
    }
}
