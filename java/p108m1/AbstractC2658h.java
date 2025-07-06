package p108m1;

import android.support.v4.media.session.AbstractC0580g;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC2492i;
import p103k0.AbstractC2480a;

/* renamed from: m1.h */
/* loaded from: classes.dex */
public abstract class AbstractC2658h extends AbstractC0580g {
    /* renamed from: B */
    public static List m5104B(Object[] objArr) {
        AbstractC2492i.m4915e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        AbstractC2492i.m4914d(asList, "asList(...)");
        return asList;
    }

    /* renamed from: C */
    public static void m5105C(int r12, int r2, int r3, byte[] bArr, byte[] destination) {
        AbstractC2492i.m4915e(bArr, "<this>");
        AbstractC2492i.m4915e(destination, "destination");
        System.arraycopy(bArr, r2, destination, r12, r3 - r2);
    }

    /* renamed from: D */
    public static void m5106D(Object[] objArr, Object[] destination, int r3, int r4, int r5) {
        AbstractC2492i.m4915e(objArr, "<this>");
        AbstractC2492i.m4915e(destination, "destination");
        System.arraycopy(objArr, r4, destination, r3, r5 - r4);
    }

    /* renamed from: E */
    public static byte[] m5107E(byte[] bArr, int r2, int r3) {
        AbstractC2492i.m4915e(bArr, "<this>");
        AbstractC0580g.m1445j(r3, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, r2, r3);
        AbstractC2492i.m4914d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    /* renamed from: F */
    public static void m5108F(Object[] objArr, int r2, int r3) {
        AbstractC2492i.m4915e(objArr, "<this>");
        Arrays.fill(objArr, r2, r3, (Object) null);
    }

    /* renamed from: G */
    public static ArrayList m5109G(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: H */
    public static Object m5110H(Object[] objArr, int r2) {
        AbstractC2492i.m4915e(objArr, "<this>");
        if (r2 < 0 || r2 > objArr.length - 1) {
            return null;
        }
        return objArr[r2];
    }

    /* renamed from: I */
    public static final void m5111I(Object[] objArr, AbstractSet abstractSet) {
        AbstractC2492i.m4915e(objArr, "<this>");
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    /* renamed from: J */
    public static List m5112J(Object[] objArr) {
        AbstractC2492i.m4915e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C2656f(objArr, false)) : AbstractC2480a.m4863D(objArr[0]) : C2668r.f8607a;
    }
}
