package p100j0;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import p001A0.AbstractC0005b;
import p003B.AbstractC0028b;
import p006C.C0054f;

/* renamed from: j0.a */
/* loaded from: classes.dex */
public abstract class AbstractC2430a {

    /* renamed from: a */
    public static final int[] f7885a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: b */
    public static final int[] f7886b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: c */
    public static final int[] f7887c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* renamed from: d */
    public static final int[] f7888d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* renamed from: e */
    public static final int[] f7889e = {R.attr.drawable};

    /* renamed from: f */
    public static final int[] f7890f = {R.attr.name, R.attr.animation};

    /* renamed from: g */
    public static final int[] f7891g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* renamed from: h */
    public static final int[] f7892h = {R.attr.ordering};

    /* renamed from: i */
    public static final int[] f7893i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* renamed from: j */
    public static final int[] f7894j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* renamed from: k */
    public static final int[] f7895k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:10:0x03a8, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r3 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x03b7, code lost:
    
        if (r3.hasNext() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x03b9, code lost:
    
        r1[r14] = (android.animation.Animator) r3.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03c5, code lost:
    
        if (r32 != 0) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03c7, code lost:
    
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x03cb, code lost:
    
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x03ce, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x03a4, code lost:
    
        if (r31 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x03a6, code lost:
    
        if (r13 == null) goto L209;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator m4788a(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p100j0.AbstractC2430a.m4788a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* renamed from: b */
    public static PropertyValuesHolder m4789b(TypedArray typedArray, int r12, int r13, int r14, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(r13);
        boolean z2 = peekValue != null;
        int r15 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(r14);
        boolean z3 = peekValue2 != null;
        int r5 = z3 ? peekValue2.type : 0;
        if (r12 == 4) {
            r12 = ((z2 && m4790c(r15)) || (z3 && m4790c(r5))) ? 3 : 0;
        }
        boolean z4 = r12 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (r12 != 2) {
            C2436g c2436g = r12 == 3 ? C2436g.f7909a : null;
            if (z4) {
                if (z2) {
                    float dimension = r15 == 5 ? typedArray.getDimension(r13, 0.0f) : typedArray.getFloat(r13, 0.0f);
                    if (z3) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, r5 == 5 ? typedArray.getDimension(r14, 0.0f) : typedArray.getFloat(r14, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, r5 == 5 ? typedArray.getDimension(r14, 0.0f) : typedArray.getFloat(r14, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z2) {
                int dimension2 = r15 == 5 ? (int) typedArray.getDimension(r13, 0.0f) : m4790c(r15) ? typedArray.getColor(r13, 0) : typedArray.getInt(r13, 0);
                if (z3) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, r5 == 5 ? (int) typedArray.getDimension(r14, 0.0f) : m4790c(r5) ? typedArray.getColor(r14, 0) : typedArray.getInt(r14, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z3) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, r5 == 5 ? (int) typedArray.getDimension(r14, 0.0f) : m4790c(r5) ? typedArray.getColor(r14, 0) : typedArray.getInt(r14, 0));
            }
            if (propertyValuesHolder == null || c2436g == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(c2436g);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(r13);
        String string2 = typedArray.getString(r14);
        C0054f[] m71q = AbstractC0005b.m71q(string);
        C0054f[] m71q2 = AbstractC0005b.m71q(string2);
        if (m71q == null && m71q2 == null) {
            return null;
        }
        if (m71q == null) {
            if (m71q2 != null) {
                return PropertyValuesHolder.ofObject(str, new C2435f(), m71q2);
            }
            return null;
        }
        C2435f c2435f = new C2435f();
        if (m71q2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, c2435f, m71q);
        } else {
            if (!AbstractC0005b.m64g(m71q, m71q2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, c2435f, m71q, m71q2);
        }
        return ofObject;
    }

    /* renamed from: c */
    public static boolean m4790c(int r12) {
        return r12 >= 28 && r12 <= 31;
    }

    /* renamed from: d */
    public static ValueAnimator m4791d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        int r5 = 0;
        TypedArray m167i = AbstractC0028b.m167i(resources, theme, attributeSet, f7891g);
        TypedArray m167i2 = AbstractC0028b.m167i(resources, theme, attributeSet, f7895k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j2 = AbstractC0028b.m164f(xmlResourceParser, "duration") ? m167i.getInt(1, 300) : 300;
        long j3 = !AbstractC0028b.m164f(xmlResourceParser, "startOffset") ? 0 : m167i.getInt(2, 0);
        int r2 = !AbstractC0028b.m164f(xmlResourceParser, "valueType") ? 4 : m167i.getInt(7, 4);
        if (AbstractC0028b.m164f(xmlResourceParser, "valueFrom") && AbstractC0028b.m164f(xmlResourceParser, "valueTo")) {
            if (r2 == 4) {
                TypedValue peekValue = m167i.peekValue(5);
                boolean z2 = peekValue != null;
                int r22 = z2 ? peekValue.type : 0;
                TypedValue peekValue2 = m167i.peekValue(6);
                boolean z3 = peekValue2 != null;
                r2 = ((z2 && m4790c(r22)) || (z3 && m4790c(z3 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder m4789b = m4789b(m167i, r2, 5, 6, "");
            if (m4789b != null) {
                valueAnimator3.setValues(m4789b);
            }
        }
        valueAnimator3.setDuration(j2);
        valueAnimator3.setStartDelay(j3);
        valueAnimator3.setRepeatCount(!AbstractC0028b.m164f(xmlResourceParser, "repeatCount") ? 0 : m167i.getInt(3, 0));
        valueAnimator3.setRepeatMode(!AbstractC0028b.m164f(xmlResourceParser, "repeatMode") ? 1 : m167i.getInt(4, 1));
        if (m167i2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String m162d = AbstractC0028b.m162d(m167i2, xmlResourceParser, "pathData", 1);
            if (m162d != null) {
                String m162d2 = AbstractC0028b.m162d(m167i2, xmlResourceParser, "propertyXName", 2);
                String m162d3 = AbstractC0028b.m162d(m167i2, xmlResourceParser, "propertyYName", 3);
                if (m162d2 == null && m162d3 == null) {
                    throw new InflateException(m167i2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path m72r = AbstractC0005b.m72r(m162d);
                PathMeasure pathMeasure = new PathMeasure(m72r, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f = 0.0f;
                while (true) {
                    f += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    valueAnimator3 = valueAnimator3;
                }
                PathMeasure pathMeasure2 = new PathMeasure(m72r, false);
                int min = Math.min(100, ((int) (f / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f2 = f / (min - 1);
                valueAnimator = valueAnimator3;
                typedArray = m167i;
                int r12 = 0;
                int r6 = 0;
                float f3 = 0.0f;
                while (true) {
                    if (r6 >= min) {
                        break;
                    }
                    int r23 = min;
                    pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(r12)).floatValue(), fArr3, null);
                    fArr[r6] = fArr3[0];
                    fArr2[r6] = fArr3[1];
                    f3 += f2;
                    int r7 = r12 + 1;
                    if (r7 < arrayList.size() && f3 > ((Float) arrayList.get(r7)).floatValue()) {
                        pathMeasure2.nextContour();
                        r12 = r7;
                    }
                    r6++;
                    min = r23;
                }
                PropertyValuesHolder ofFloat = m162d2 != null ? PropertyValuesHolder.ofFloat(m162d2, fArr) : null;
                PropertyValuesHolder ofFloat2 = m162d3 != null ? PropertyValuesHolder.ofFloat(m162d3, fArr2) : null;
                if (ofFloat == null) {
                    r5 = 0;
                    objectAnimator2.setValues(ofFloat2);
                } else {
                    r5 = 0;
                    if (ofFloat2 == null) {
                        objectAnimator2.setValues(ofFloat);
                    } else {
                        objectAnimator2.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = m167i;
                objectAnimator2.setPropertyName(AbstractC0028b.m162d(m167i2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = m167i;
        }
        if (AbstractC0028b.m164f(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            r5 = typedArray2.getResourceId(r5, r5);
        } else {
            typedArray2 = typedArray;
        }
        if (r5 > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, r5));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (m167i2 != null) {
            m167i2.recycle();
        }
        return valueAnimator2;
    }
}
