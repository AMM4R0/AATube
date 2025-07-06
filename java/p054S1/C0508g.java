package p054S1;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC2492i;
import p051R1.C0492v;

/* renamed from: S1.g */
/* loaded from: classes.dex */
public final class C0508g {

    /* renamed from: a */
    public final C0492v f1307a;

    /* renamed from: b */
    public final long f1308b;

    /* renamed from: c */
    public final long f1309c;

    /* renamed from: d */
    public final int f1310d;

    /* renamed from: e */
    public final long f1311e;

    /* renamed from: f */
    public final ArrayList f1312f;

    public C0508g(C0492v c0492v, boolean z2, String str, long j2, long j3, long j4, int r20, long j5, int r23, int r24, Long l2, Long l3, Long l4, int r28) {
        String comment = (r28 & 4) != 0 ? "" : str;
        long j6 = (r28 & 16) != 0 ? -1L : j3;
        long j7 = (r28 & 32) != 0 ? -1L : j4;
        int r3 = (r28 & 64) != 0 ? -1 : r20;
        long j8 = (r28 & 128) == 0 ? j5 : -1L;
        AbstractC2492i.m4915e(comment, "comment");
        this.f1307a = c0492v;
        this.f1308b = j6;
        this.f1309c = j7;
        this.f1310d = r3;
        this.f1311e = j8;
        this.f1312f = new ArrayList();
    }
}
