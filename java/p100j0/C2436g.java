package p100j0;

import android.animation.TypeEvaluator;
import kotlin.KotlinVersion;

/* renamed from: j0.g */
/* loaded from: classes.dex */
public final class C2436g implements TypeEvaluator {

    /* renamed from: a */
    public static final C2436g f7909a = new C2436g();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((intValue >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f3 = ((intValue >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f4 = ((intValue >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f5 = ((intValue2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f6 = ((intValue2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f7 = ((intValue2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float pow = (float) Math.pow(f3, 2.2d);
        float pow2 = (float) Math.pow(f4, 2.2d);
        float pow3 = (float) Math.pow((intValue & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(f6, 2.2d);
        float pow5 = ((((float) Math.pow(f7, 2.2d)) - pow2) * f) + pow2;
        float pow6 = ((((float) Math.pow((intValue2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d)) - pow3) * f) + pow3;
        float f8 = (((f5 - f2) * f) + f2) * 255.0f;
        return Integer.valueOf((Math.round(((float) Math.pow(((pow4 - pow) * f) + pow, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f8) << 24) | (Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow6, 0.45454545454545453d)) * 255.0f));
    }
}
