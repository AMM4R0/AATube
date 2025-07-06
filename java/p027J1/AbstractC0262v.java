package p027J1;

import java.io.IOException;
import p000A.AbstractC0002c;

/* renamed from: J1.v */
/* loaded from: classes.dex */
public abstract class AbstractC0262v {
    /* renamed from: a */
    public static int m680a(int r2, int r3, int r4) {
        if ((r3 & 8) != 0) {
            r2--;
        }
        if (r4 <= r2) {
            return r2 - r4;
        }
        throw new IOException(AbstractC0002c.m12g("PROTOCOL_ERROR padding ", r4, r2, " > remaining length "));
    }
}
