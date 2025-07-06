package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p076d.AbstractC0780a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a */
    public final int f1715a;

    /* renamed from: b */
    public final int f1716b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0780a.f3133t);
        this.f1716b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1715a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
