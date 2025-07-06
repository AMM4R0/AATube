package p008C1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.C0567b;
import android.support.v4.media.C0568c;
import android.support.v4.media.C0570e;
import android.util.Log;
import com.carwizard.p075li.youtube.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2492i;
import kotlin.jvm.internal.C2484a;
import p000A.AbstractC0002c;
import p001A0.AbstractC0005b;
import p006C.AbstractC0049a;
import p006C.C0055g;
import p010D0.C0109g;
import p011D1.AbstractC0119f;
import p011D1.C0117d;
import p020H0.C0183a;
import p104l.AbstractC2578i1;
import p104l.AbstractC2604r0;
import p104l.C2537S0;
import p104l.C2609t;
import p105l1.C2632c;
import p108m1.AbstractC2660j;
import p108m1.AbstractC2671u;
import p108m1.C2669s;

/* renamed from: C1.w */
/* loaded from: classes.dex */
public final class C0091w {

    /* renamed from: a */
    public final /* synthetic */ int f293a;

    /* renamed from: b */
    public final Object f294b;

    /* renamed from: c */
    public Object f295c;

    /* renamed from: d */
    public final Object f296d;

    /* renamed from: e */
    public final Object f297e;

    /* renamed from: f */
    public final Object f298f;

    /* renamed from: g */
    public Object f299g;

    public C0091w(Set set, String str, String str2) {
        this.f293a = 3;
        C0183a c0183a = C0183a.f571b;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f294b = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.f295c = str;
        this.f297e = str2;
        this.f298f = c0183a;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        if (it.hasNext()) {
            throw AbstractC0002c.m10e(it);
        }
        this.f296d = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public static boolean m303a(int[] r4, int r5) {
        for (int r02 : r4) {
            if (r02 == r5) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static ColorStateList m304b(Context context, int r6) {
        int m5032c = AbstractC2578i1.m5032c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{AbstractC2578i1.f8375b, AbstractC2578i1.f8377d, AbstractC2578i1.f8376c, AbstractC2578i1.f8379f}, new int[]{AbstractC2578i1.m5031b(context, R.attr.colorButtonNormal), AbstractC0049a.m192b(m5032c, r6), AbstractC0049a.m192b(m5032c, r6), r6});
    }

    /* renamed from: d */
    public static LayerDrawable m305d(C2537S0 c2537s0, Context context, int r8) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(r8);
        Drawable m4980f = c2537s0.m4980f(context, R.drawable.abc_star_black_48dp);
        Drawable m4980f2 = c2537s0.m4980f(context, R.drawable.abc_star_half_black_48dp);
        if ((m4980f instanceof BitmapDrawable) && m4980f.getIntrinsicWidth() == dimensionPixelSize && m4980f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) m4980f;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            m4980f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            m4980f.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((m4980f2 instanceof BitmapDrawable) && m4980f2.getIntrinsicWidth() == dimensionPixelSize && m4980f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) m4980f2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            m4980f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            m4980f2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* renamed from: g */
    public static void m306g(Drawable drawable, int r2, PorterDuff.Mode mode) {
        int[] r02 = AbstractC2604r0.f8459a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C2609t.f8470b;
        }
        mutate.setColorFilter(C2609t.m5070c(r2, mode));
    }

    /* renamed from: c */
    public void m307c() {
        Messenger messenger;
        C0568c c0568c = ((C0570e) this.f299g).f1601a;
        C0109g c0109g = c0568c.f1597f;
        if (c0109g != null && (messenger = c0568c.f1598g) != null) {
            try {
                c0109g.m349D(7, null, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        c0568c.f1593b.disconnect();
        ((BroadcastReceiver.PendingResult) this.f298f).finish();
    }

    /* renamed from: e */
    public ColorStateList m308e(Context context, int r10) {
        if (r10 == R.drawable.abc_edit_text_material) {
            return AbstractC0005b.m75u(context, R.color.abc_tint_edittext);
        }
        if (r10 == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC0005b.m75u(context, R.color.abc_tint_switch_track);
        }
        if (r10 != R.drawable.abc_switch_thumb_material) {
            if (r10 == R.drawable.abc_btn_default_mtrl_shape) {
                return m304b(context, AbstractC2578i1.m5032c(context, R.attr.colorButtonNormal));
            }
            if (r10 == R.drawable.abc_btn_borderless_material) {
                return m304b(context, 0);
            }
            if (r10 == R.drawable.abc_btn_colored_material) {
                return m304b(context, AbstractC2578i1.m5032c(context, R.attr.colorAccent));
            }
            if (r10 == R.drawable.abc_spinner_mtrl_am_alpha || r10 == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0005b.m75u(context, R.color.abc_tint_spinner);
            }
            if (m303a((int[]) this.f295c, r10)) {
                return AbstractC2578i1.m5033d(context, R.attr.colorControlNormal);
            }
            if (m303a((int[]) this.f298f, r10)) {
                return AbstractC0005b.m75u(context, R.color.abc_tint_default);
            }
            if (m303a((int[]) this.f299g, r10)) {
                return AbstractC0005b.m75u(context, R.color.abc_tint_btn_checkable);
            }
            if (r10 == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0005b.m75u(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] r02 = new int[3][];
        int[] r102 = new int[3];
        ColorStateList m5033d = AbstractC2578i1.m5033d(context, R.attr.colorSwitchThumbNormal);
        if (m5033d == null || !m5033d.isStateful()) {
            r02[0] = AbstractC2578i1.f8375b;
            r102[0] = AbstractC2578i1.m5031b(context, R.attr.colorSwitchThumbNormal);
            r02[1] = AbstractC2578i1.f8378e;
            r102[1] = AbstractC2578i1.m5032c(context, R.attr.colorControlActivated);
            r02[2] = AbstractC2578i1.f8379f;
            r102[2] = AbstractC2578i1.m5032c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] r2 = AbstractC2578i1.f8375b;
            r02[0] = r2;
            r102[0] = m5033d.getColorForState(r2, 0);
            r02[1] = AbstractC2578i1.f8378e;
            r102[1] = AbstractC2578i1.m5032c(context, R.attr.colorControlActivated);
            r02[2] = AbstractC2578i1.f8379f;
            r102[2] = m5033d.getDefaultColor();
        }
        return new ColorStateList(r02, r102);
    }

    /* renamed from: f */
    public C0090v m309f() {
        C0090v c0090v = new C0090v(false);
        Object obj = C2669s.f8608a;
        c0090v.f292f = obj;
        c0090v.f289c = (C0085q) this.f294b;
        c0090v.f288b = (String) this.f295c;
        c0090v.f291e = (C0117d) this.f297e;
        Map map = (Map) this.f298f;
        if (!map.isEmpty()) {
            obj = new LinkedHashMap(map);
        }
        c0090v.f292f = obj;
        c0090v.f290d = ((C0083o) this.f296d).m276c();
        return c0090v;
    }

    public String toString() {
        switch (this.f293a) {
            case 0:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f295c);
                sb.append(", url=");
                sb.append((C0085q) this.f294b);
                C0083o c0083o = (C0083o) this.f296d;
                if (c0083o.size() != 0) {
                    sb.append(", headers=[");
                    Iterator it = c0083o.iterator();
                    int r2 = 0;
                    while (true) {
                        C2484a c2484a = (C2484a) it;
                        if (c2484a.hasNext()) {
                            Object next = c2484a.next();
                            int r4 = r2 + 1;
                            if (r2 < 0) {
                                AbstractC2660j.m5121Y();
                                throw null;
                            }
                            C2632c c2632c = (C2632c) next;
                            String str = (String) c2632c.f8550a;
                            String str2 = (String) c2632c.f8551b;
                            if (r2 > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            if (AbstractC0119f.m404j(str)) {
                                str2 = "██";
                            }
                            sb.append(str2);
                            r2 = r4;
                        } else {
                            sb.append(']');
                        }
                    }
                }
                Map map = (Map) this.f298f;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String sb2 = sb.toString();
                AbstractC2492i.m4914d(sb2, "toString(...)");
                return sb2;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public C0091w(C0090v c0090v) {
        this.f293a = 0;
        C0085q c0085q = (C0085q) c0090v.f289c;
        if (c0085q != null) {
            this.f294b = c0085q;
            this.f295c = (String) c0090v.f288b;
            this.f296d = ((C0055g) c0090v.f290d).m218q();
            this.f297e = (C0117d) c0090v.f291e;
            this.f298f = AbstractC2671u.m5130g0(c0090v.f292f);
            return;
        }
        throw new IllegalStateException("url == null");
    }

    public C0091w() {
        this.f293a = 2;
        this.f294b = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f295c = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f296d = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f297e = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f298f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f299g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public C0091w(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f293a = 1;
        this.f294b = new C0567b(this);
        this.f296d = context;
        this.f297e = intent;
        this.f298f = pendingResult;
    }
}
