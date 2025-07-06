package p090i0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: i0.i */
/* loaded from: classes.dex */
public abstract class AbstractC0963i {
    /* renamed from: a */
    public static <T, V> ObjectAnimator m2566a(T t2, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t2, property, (TypeConverter) null, path);
    }
}
