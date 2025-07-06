package p137w1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.AbstractC2492i;
import p134v1.AbstractC2872a;

/* renamed from: w1.a */
/* loaded from: classes.dex */
public final class C2878a extends AbstractC2872a {
    @Override // p134v1.AbstractC2872a
    /* renamed from: a */
    public final Random mo5478a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        AbstractC2492i.m4914d(current, "current(...)");
        return current;
    }
}
