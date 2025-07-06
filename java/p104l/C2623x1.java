package p104l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.carwizard.p075li.youtube.R;

/* renamed from: l.x1 */
/* loaded from: classes.dex */
public final class C2623x1 {

    /* renamed from: a */
    public final Context f8533a;

    /* renamed from: b */
    public final View f8534b;

    /* renamed from: c */
    public final TextView f8535c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f8536d;

    /* renamed from: e */
    public final Rect f8537e;

    /* renamed from: f */
    public final int[] f8538f;

    /* renamed from: g */
    public final int[] f8539g;

    public C2623x1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f8536d = layoutParams;
        this.f8537e = new Rect();
        this.f8538f = new int[2];
        this.f8539g = new int[2];
        this.f8533a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f8534b = inflate;
        this.f8535c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(C2623x1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
