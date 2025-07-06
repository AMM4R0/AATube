package p002A1;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC2492i;

/* renamed from: A1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0008a {

    /* renamed from: a */
    public static final Charset f6a;

    static {
        Charset forName = Charset.forName("UTF-8");
        AbstractC2492i.m4914d(forName, "forName(...)");
        f6a = forName;
        AbstractC2492i.m4914d(Charset.forName("UTF-16"), "forName(...)");
        AbstractC2492i.m4914d(Charset.forName("UTF-16BE"), "forName(...)");
        AbstractC2492i.m4914d(Charset.forName("UTF-16LE"), "forName(...)");
        AbstractC2492i.m4914d(Charset.forName("US-ASCII"), "forName(...)");
        AbstractC2492i.m4914d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
