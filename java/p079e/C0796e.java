package p079e;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.carwizard.p075li.youtube.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0754j;
import java.lang.ref.WeakReference;
import p076d.AbstractC0780a;

/* renamed from: e.e */
/* loaded from: classes.dex */
public final class C0796e {

    /* renamed from: a */
    public final Context f3214a;

    /* renamed from: b */
    public final DialogC0797f f3215b;

    /* renamed from: c */
    public final Window f3216c;

    /* renamed from: d */
    public CharSequence f3217d;

    /* renamed from: e */
    public AlertController$RecycleListView f3218e;

    /* renamed from: f */
    public Button f3219f;

    /* renamed from: g */
    public Button f3220g;

    /* renamed from: h */
    public Button f3221h;

    /* renamed from: i */
    public NestedScrollView f3222i;

    /* renamed from: j */
    public Drawable f3223j;

    /* renamed from: k */
    public ImageView f3224k;

    /* renamed from: l */
    public TextView f3225l;

    /* renamed from: m */
    public TextView f3226m;

    /* renamed from: n */
    public View f3227n;

    /* renamed from: o */
    public ListAdapter f3228o;

    /* renamed from: q */
    public final int f3230q;

    /* renamed from: r */
    public final int f3231r;

    /* renamed from: s */
    public final int f3232s;

    /* renamed from: t */
    public final int f3233t;

    /* renamed from: u */
    public final boolean f3234u;

    /* renamed from: v */
    public final HandlerC0794c f3235v;

    /* renamed from: p */
    public int f3229p = -1;

    /* renamed from: w */
    public final ViewOnClickListenerC0754j f3236w = new ViewOnClickListenerC0754j(1, this);

    public C0796e(Context context, DialogC0797f dialogC0797f, Window window) {
        this.f3214a = context;
        this.f3215b = dialogC0797f;
        this.f3216c = window;
        HandlerC0794c handlerC0794c = new HandlerC0794c();
        handlerC0794c.f3213a = new WeakReference(dialogC0797f);
        this.f3235v = handlerC0794c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0780a.f3118e, R.attr.alertDialogStyle, 0);
        this.f3230q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f3231r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f3232s = obtainStyledAttributes.getResourceId(7, 0);
        this.f3233t = obtainStyledAttributes.getResourceId(3, 0);
        this.f3234u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogC0797f.m2195c().mo2221i(1);
    }

    /* renamed from: a */
    public static ViewGroup m2192a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
