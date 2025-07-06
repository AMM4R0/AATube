package p130u0;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0744a;
import com.google.android.gms.tasks.Task;
import p013E0.HandlerC0128e;
import p026J0.C0232m;
import p026J0.InterfaceC0221b;
import p124s0.C2731b;
import p127t0.C2767d;
import p127t0.InterfaceC2766c;
import p133v0.C2848c;
import p133v0.C2851f;
import p133v0.C2852g;
import p133v0.C2853h;

/* renamed from: u0.q */
/* loaded from: classes.dex */
public final class C2793q implements InterfaceC0221b {

    /* renamed from: a */
    public final C2779c f9126a;

    /* renamed from: b */
    public final int f9127b;

    /* renamed from: c */
    public final C2777a f9128c;

    /* renamed from: d */
    public final long f9129d;

    /* renamed from: e */
    public final long f9130e;

    public C2793q(C2779c c2779c, int r2, C2777a c2777a, long j2, long j3) {
        this.f9126a = c2779c;
        this.f9127b = r2;
        this.f9128c = c2777a;
        this.f9129d = j2;
        this.f9130e = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p133v0.C2848c m5423a(p130u0.C2787k r5, com.google.android.gms.common.internal.AbstractC0744a r6, int r7) {
        /*
            v0.x r6 = r6.f2719u
            r0 = 0
            if (r6 != 0) goto L7
            r6 = r0
            goto L9
        L7:
            v0.c r6 = r6.f9471d
        L9:
            if (r6 == 0) goto L36
            boolean r1 = r6.f9396b
            if (r1 == 0) goto L36
            int[] r1 = r6.f9398d
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r6.f9400f
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
        L1a:
            if (r2 >= r3) goto L2b
            r4 = r1[r2]
            if (r4 != r7) goto L21
            goto L36
        L21:
            int r2 = r2 + 1
            goto L1a
        L24:
            int r3 = r1.length
        L25:
            if (r2 >= r3) goto L36
            r4 = r1[r2]
            if (r4 != r7) goto L33
        L2b:
            int r5 = r5.f9113m
            int r7 = r6.f9399e
            if (r5 >= r7) goto L32
            return r6
        L32:
            return r0
        L33:
            int r2 = r2 + 1
            goto L25
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p130u0.C2793q.m5423a(u0.k, com.google.android.gms.common.internal.a, int):v0.c");
    }

    @Override // p026J0.InterfaceC0221b
    public final void onComplete(Task task) {
        int r12;
        int r21;
        int r2;
        int r11;
        int r122;
        long j2;
        long j3;
        int r20;
        if (this.f9126a.m5395a()) {
            C2853h c2853h = (C2853h) C2852g.m5459b().f9426a;
            if (c2853h == null || c2853h.f9428b) {
                C2787k c2787k = (C2787k) this.f9126a.f9096j.get(this.f9128c);
                if (c2787k != null) {
                    InterfaceC2766c interfaceC2766c = c2787k.f9103c;
                    if (interfaceC2766c instanceof AbstractC0744a) {
                        AbstractC0744a abstractC0744a = (AbstractC0744a) interfaceC2766c;
                        boolean z2 = this.f9129d > 0;
                        int r15 = abstractC0744a.f2714p;
                        if (c2853h != null) {
                            z2 &= c2853h.f9429c;
                            int r10 = c2853h.f9430d;
                            int r112 = c2853h.f9431e;
                            r12 = c2853h.f9427a;
                            if (abstractC0744a.f2719u != null && !abstractC0744a.mo2029a()) {
                                C2848c m5423a = m5423a(c2787k, abstractC0744a, this.f9127b);
                                if (m5423a == null) {
                                    return;
                                }
                                boolean z3 = m5423a.f9397c && this.f9129d > 0;
                                r112 = m5423a.f9399e;
                                z2 = z3;
                            }
                            r2 = r10;
                            r21 = r112;
                        } else {
                            r12 = 0;
                            r21 = 100;
                            r2 = 5000;
                        }
                        C2779c c2779c = this.f9126a;
                        if (task.mo624d()) {
                            r11 = 0;
                            r122 = 0;
                        } else {
                            if (((C0232m) task).f672d) {
                                r11 = 100;
                            } else {
                                Exception mo622b = task.mo622b();
                                if (mo622b instanceof C2767d) {
                                    Status status = ((C2767d) mo622b).f9061a;
                                    int r8 = status.f2694b;
                                    C2731b c2731b = status.f2697e;
                                    r122 = c2731b == null ? -1 : c2731b.f8972b;
                                    r11 = r8;
                                } else {
                                    r11 = 101;
                                }
                            }
                            r122 = -1;
                        }
                        if (z2) {
                            long j4 = this.f9129d;
                            j2 = System.currentTimeMillis();
                            j3 = j4;
                            r20 = (int) (SystemClock.elapsedRealtime() - this.f9130e);
                        } else {
                            j2 = 0;
                            j3 = 0;
                            r20 = -1;
                        }
                        C2851f c2851f = new C2851f(this.f9127b, r11, r122, j3, j2, null, null, r15, r20);
                        long j5 = r2;
                        HandlerC0128e handlerC0128e = c2779c.f9099m;
                        handlerC0128e.sendMessage(handlerC0128e.obtainMessage(18, new C2794r(c2851f, r12, j5, r21)));
                    }
                }
            }
        }
    }
}
