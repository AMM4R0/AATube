package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Al */
/* loaded from: classes.dex */
public final class C1082Al implements ProtobufConverter {

    /* renamed from: a */
    public final C1673Yd f4491a = new C1673Yd();

    /* renamed from: b */
    public final C1818ea f4492b = new C1818ea();

    /* renamed from: c */
    public final C1780cm f4493c = new C1780cm();

    /* renamed from: d */
    public final C2285x2 f4494d = new C2285x2();

    /* renamed from: e */
    public final C1214G3 f4495e = new C1214G3();

    /* renamed from: f */
    public final C2185t2 f4496f = new C2185t2();

    /* renamed from: g */
    public final C1067A6 f4497g = new C1067A6();

    /* renamed from: h */
    public final C1681Yl f4498h = new C1681Yl();

    /* renamed from: i */
    public final C1672Yc f4499i = new C1672Yc();

    /* renamed from: j */
    public final C1120C9 f4500j = new C1120C9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1506Rl fromModel(C1157Dl c1157Dl) {
        C1506Rl c1506Rl = new C1506Rl();
        c1506Rl.f5387s = c1157Dl.f4671u;
        c1506Rl.f5388t = c1157Dl.f4672v;
        String str = c1157Dl.f4651a;
        if (str != null) {
            c1506Rl.f5369a = str;
        }
        List list = c1157Dl.f4656f;
        if (list != null) {
            c1506Rl.f5374f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c1157Dl.f4657g;
        if (list2 != null) {
            c1506Rl.f5375g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c1157Dl.f4652b;
        if (list3 != null) {
            c1506Rl.f5371c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c1157Dl.f4658h;
        if (list4 != null) {
            c1506Rl.f5383o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c1157Dl.f4659i;
        if (map != null) {
            c1506Rl.f5376h = this.f4497g.fromModel(map);
        }
        C1648Xd c1648Xd = c1157Dl.f4669s;
        if (c1648Xd != null) {
            c1506Rl.f5390v = this.f4491a.fromModel(c1648Xd);
        }
        String str2 = c1157Dl.f4660j;
        if (str2 != null) {
            c1506Rl.f5378j = str2;
        }
        String str3 = c1157Dl.f4653c;
        if (str3 != null) {
            c1506Rl.f5372d = str3;
        }
        String str4 = c1157Dl.f4654d;
        if (str4 != null) {
            c1506Rl.f5373e = str4;
        }
        String str5 = c1157Dl.f4655e;
        if (str5 != null) {
            c1506Rl.f5386r = str5;
        }
        c1506Rl.f5377i = this.f4492b.fromModel(c1157Dl.f4663m);
        String str6 = c1157Dl.f4661k;
        if (str6 != null) {
            c1506Rl.f5379k = str6;
        }
        String str7 = c1157Dl.f4662l;
        if (str7 != null) {
            c1506Rl.f5380l = str7;
        }
        c1506Rl.f5381m = c1157Dl.f4666p;
        c1506Rl.f5370b = c1157Dl.f4664n;
        c1506Rl.f5385q = c1157Dl.f4665o;
        RetryPolicyConfig retryPolicyConfig = c1157Dl.f4670t;
        c1506Rl.f5391w = retryPolicyConfig.maxIntervalSeconds;
        c1506Rl.f5392x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c1157Dl.f4667q;
        if (str8 != null) {
            c1506Rl.f5382n = str8;
        }
        C1755bm c1755bm = c1157Dl.f4668r;
        if (c1755bm != null) {
            this.f4493c.getClass();
            C1482Ql c1482Ql = new C1482Ql();
            c1482Ql.f5263a = c1755bm.f5953a;
            c1506Rl.f5384p = c1482Ql;
        }
        c1506Rl.f5389u = c1157Dl.f4673w;
        BillingConfig billingConfig = c1157Dl.f4674x;
        if (billingConfig != null) {
            c1506Rl.f5394z = this.f4494d.fromModel(billingConfig);
        }
        C1164E3 c1164e3 = c1157Dl.f4675y;
        if (c1164e3 != null) {
            this.f4495e.getClass();
            C1307Jl c1307Jl = new C1307Jl();
            c1307Jl.f4932a = c1164e3.f4688a;
            c1506Rl.f5393y = c1307Jl;
        }
        C2160s2 c2160s2 = c1157Dl.f4676z;
        if (c2160s2 != null) {
            c1506Rl.f5365A = this.f4496f.fromModel(c2160s2);
        }
        c1506Rl.f5366B = this.f4498h.fromModel(c1157Dl.f4648A);
        c1506Rl.f5367C = this.f4499i.fromModel(c1157Dl.f4649B);
        c1506Rl.f5368D = this.f4500j.fromModel(c1157Dl.f4650C);
        return c1506Rl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1157Dl toModel(C1506Rl c1506Rl) {
        C1132Cl c1132Cl = new C1132Cl(this.f4492b.toModel(c1506Rl.f5377i));
        c1132Cl.f4588a = c1506Rl.f5369a;
        c1132Cl.f4597j = c1506Rl.f5378j;
        c1132Cl.f4590c = c1506Rl.f5372d;
        c1132Cl.f4589b = Arrays.asList(c1506Rl.f5371c);
        c1132Cl.f4594g = Arrays.asList(c1506Rl.f5375g);
        c1132Cl.f4593f = Arrays.asList(c1506Rl.f5374f);
        c1132Cl.f4591d = c1506Rl.f5373e;
        c1132Cl.f4592e = c1506Rl.f5386r;
        c1132Cl.f4595h = Arrays.asList(c1506Rl.f5383o);
        c1132Cl.f4598k = c1506Rl.f5379k;
        c1132Cl.f4599l = c1506Rl.f5380l;
        c1132Cl.f4604q = c1506Rl.f5381m;
        c1132Cl.f4602o = c1506Rl.f5370b;
        c1132Cl.f4603p = c1506Rl.f5385q;
        c1132Cl.f4607t = c1506Rl.f5387s;
        c1132Cl.f4608u = c1506Rl.f5388t;
        c1132Cl.f4605r = c1506Rl.f5382n;
        c1132Cl.f4609v = c1506Rl.f5389u;
        c1132Cl.f4610w = new RetryPolicyConfig(c1506Rl.f5391w, c1506Rl.f5392x);
        c1132Cl.f4596i = this.f4497g.toModel(c1506Rl.f5376h);
        C1432Ol c1432Ol = c1506Rl.f5390v;
        if (c1432Ol != null) {
            this.f4491a.getClass();
            c1132Cl.f4601n = new C1648Xd(c1432Ol.f5189a, c1432Ol.f5190b);
        }
        C1482Ql c1482Ql = c1506Rl.f5384p;
        if (c1482Ql != null) {
            this.f4493c.getClass();
            c1132Cl.f4606s = new C1755bm(c1482Ql.f5263a);
        }
        C1282Il c1282Il = c1506Rl.f5394z;
        if (c1282Il != null) {
            this.f4494d.getClass();
            c1132Cl.f4611x = new BillingConfig(c1282Il.f4883a, c1282Il.f4884b);
        }
        C1307Jl c1307Jl = c1506Rl.f5393y;
        if (c1307Jl != null) {
            this.f4495e.getClass();
            c1132Cl.f4612y = new C1164E3(c1307Jl.f4932a);
        }
        C1257Hl c1257Hl = c1506Rl.f5365A;
        if (c1257Hl != null) {
            c1132Cl.f4613z = this.f4496f.toModel(c1257Hl);
        }
        C1457Pl c1457Pl = c1506Rl.f5366B;
        if (c1457Pl != null) {
            this.f4498h.getClass();
            c1132Cl.f4585A = new C1656Xl(c1457Pl.f5234a);
        }
        c1132Cl.f4586B = this.f4499i.toModel(c1506Rl.f5367C);
        C1357Ll c1357Ll = c1506Rl.f5368D;
        if (c1357Ll != null) {
            this.f4500j.getClass();
            c1132Cl.f4587C = new C1095B9(c1357Ll.f5016a);
        }
        return new C1157Dl(c1132Cl);
    }
}
