package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0580g;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.carwizard.p075li.youtube.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p002A1.C0015h;
import p028K.AbstractC0283P;
import p041O0.ViewOnLayoutChangeListenerC0407a;
import p049R.AbstractC0455c;
import p076d.AbstractC0780a;
import p088h1.C0938r;
import p099j.InterfaceC2417b;
import p104l.AbstractC2506C0;
import p104l.C2508D0;
import p104l.C2545W0;
import p104l.C2551Z0;
import p104l.C2563d1;
import p104l.C2566e1;
import p104l.C2594o;
import p104l.InterfaceC2554a1;
import p104l.InterfaceC2557b1;
import p104l.InterfaceC2560c1;
import p104l.RunnableC2547X0;
import p104l.ViewOnClickListenerC2572g1;
import p104l.ViewOnFocusChangeListenerC2549Y0;

/* loaded from: classes.dex */
public class SearchView extends AbstractC2506C0 implements InterfaceC2417b {

    /* renamed from: g0 */
    public static final C0015h f1827g0;

    /* renamed from: A */
    public final Rect f1828A;

    /* renamed from: B */
    public final int[] f1829B;

    /* renamed from: C */
    public final int[] f1830C;

    /* renamed from: D */
    public final ImageView f1831D;

    /* renamed from: E */
    public final Drawable f1832E;

    /* renamed from: F */
    public final int f1833F;

    /* renamed from: G */
    public final int f1834G;

    /* renamed from: H */
    public final Intent f1835H;

    /* renamed from: I */
    public final Intent f1836I;

    /* renamed from: J */
    public final CharSequence f1837J;

    /* renamed from: K */
    public View.OnFocusChangeListener f1838K;

    /* renamed from: L */
    public View.OnClickListener f1839L;

    /* renamed from: M */
    public boolean f1840M;

    /* renamed from: N */
    public boolean f1841N;

    /* renamed from: O */
    public AbstractC0455c f1842O;

    /* renamed from: P */
    public boolean f1843P;

    /* renamed from: Q */
    public CharSequence f1844Q;

    /* renamed from: R */
    public boolean f1845R;

    /* renamed from: S */
    public boolean f1846S;

    /* renamed from: T */
    public int f1847T;

    /* renamed from: U */
    public boolean f1848U;

    /* renamed from: V */
    public CharSequence f1849V;

    /* renamed from: W */
    public boolean f1850W;

    /* renamed from: a0 */
    public int f1851a0;

    /* renamed from: b0 */
    public SearchableInfo f1852b0;

    /* renamed from: c0 */
    public Bundle f1853c0;

    /* renamed from: d0 */
    public final RunnableC2547X0 f1854d0;

    /* renamed from: e0 */
    public final RunnableC2547X0 f1855e0;

    /* renamed from: f0 */
    public final WeakHashMap f1856f0;

    /* renamed from: p */
    public final SearchAutoComplete f1857p;

    /* renamed from: q */
    public final View f1858q;

    /* renamed from: r */
    public final View f1859r;

    /* renamed from: s */
    public final View f1860s;

    /* renamed from: t */
    public final ImageView f1861t;

    /* renamed from: u */
    public final ImageView f1862u;

    /* renamed from: v */
    public final ImageView f1863v;

    /* renamed from: w */
    public final ImageView f1864w;

    /* renamed from: x */
    public final View f1865x;

    /* renamed from: y */
    public C2566e1 f1866y;

    /* renamed from: z */
    public final Rect f1867z;

    public static class SearchAutoComplete extends C2594o {

        /* renamed from: e */
        public int f1868e;

        /* renamed from: f */
        public SearchView f1869f;

        /* renamed from: g */
        public boolean f1870g;

        /* renamed from: h */
        public final RunnableC0609d f1871h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1871h = new RunnableC0609d(this);
            this.f1868e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int r12 = configuration.screenWidthDp;
            int r2 = configuration.screenHeightDp;
            if (r12 >= 960 && r2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (r12 < 600) {
                return (r12 < 640 || r2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        public final void m1531a() {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC0608c.m1560b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0015h c0015h = SearchView.f1827g0;
            c0015h.getClass();
            C0015h.m101B();
            Method method = (Method) c0015h.f27d;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f1868e <= 0 || super.enoughToFilter();
        }

        @Override // p104l.C2594o, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1870g) {
                RunnableC0609d runnableC0609d = this.f1871h;
                removeCallbacks(runnableC0609d);
                post(runnableC0609d);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z2, int r2, Rect rect) {
            super.onFocusChanged(z2, r2, rect);
            SearchView searchView = this.f1869f;
            searchView.m1530y(searchView.f1841N);
            searchView.post(searchView.f1854d0);
            if (searchView.f1857p.hasFocus()) {
                searchView.m1519n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int r3, KeyEvent keyEvent) {
            if (r3 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1869f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(r3, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f1869f.hasFocus() && getVisibility() == 0) {
                this.f1870g = true;
                Context context = getContext();
                C0015h c0015h = SearchView.f1827g0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    m1531a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            RunnableC0609d runnableC0609d = this.f1871h;
            if (!z2) {
                this.f1870g = false;
                removeCallbacks(runnableC0609d);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1870g = true;
                    return;
                }
                this.f1870g = false;
                removeCallbacks(runnableC0609d);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1869f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int r12) {
            super.setThreshold(r12);
            this.f1868e = r12;
        }
    }

    static {
        C0015h c0015h = null;
        if (Build.VERSION.SDK_INT < 29) {
            C0015h c0015h2 = new C0015h(6);
            c0015h2.f25b = null;
            c0015h2.f26c = null;
            c0015h2.f27d = null;
            C0015h.m101B();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                c0015h2.f25b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                c0015h2.f26c = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                c0015h2.f27d = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            c0015h = c0015h2;
        }
        f1827g0 = c0015h;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f1857p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // p099j.InterfaceC2417b
    /* renamed from: b */
    public final void mo1515b() {
        if (this.f1850W) {
            return;
        }
        this.f1850W = true;
        SearchAutoComplete searchAutoComplete = this.f1857p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f1851a0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1846S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f1857p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1846S = false;
    }

    @Override // p099j.InterfaceC2417b
    /* renamed from: e */
    public final void mo1516e() {
        SearchAutoComplete searchAutoComplete = this.f1857p;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f1849V = "";
        clearFocus();
        m1530y(true);
        searchAutoComplete.setImeOptions(this.f1851a0);
        this.f1850W = false;
    }

    public int getImeOptions() {
        return this.f1857p.getImeOptions();
    }

    public int getInputType() {
        return this.f1857p.getInputType();
    }

    public int getMaxWidth() {
        return this.f1847T;
    }

    public CharSequence getQuery() {
        return this.f1857p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1844Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1852b0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1837J : getContext().getText(this.f1852b0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1834G;
    }

    public int getSuggestionRowLayout() {
        return this.f1833F;
    }

    public AbstractC0455c getSuggestionsAdapter() {
        return this.f1842O;
    }

    /* renamed from: l */
    public final Intent m1517l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1849V);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1853c0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1852b0.getSearchActivity());
        return intent;
    }

    /* renamed from: m */
    public final Intent m1518m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1853c0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: n */
    public final void m1519n() {
        int r02 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f1857p;
        if (r02 >= 29) {
            AbstractC0608c.m1559a(searchAutoComplete);
            return;
        }
        C0015h c0015h = f1827g0;
        c0015h.getClass();
        C0015h.m101B();
        Method method = (Method) c0015h.f25b;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        c0015h.getClass();
        C0015h.m101B();
        Method method2 = (Method) c0015h.f26c;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: o */
    public final void m1520o() {
        SearchAutoComplete searchAutoComplete = this.f1857p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f1840M) {
            clearFocus();
            m1530y(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1854d0);
        post(this.f1855e0);
        super.onDetachedFromWindow();
    }

    @Override // p104l.AbstractC2506C0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int r6, int r7, int r8, int r9) {
        super.onLayout(z2, r6, r7, r8, r9);
        if (z2) {
            int[] r5 = this.f1829B;
            SearchAutoComplete searchAutoComplete = this.f1857p;
            searchAutoComplete.getLocationInWindow(r5);
            int[] r82 = this.f1830C;
            getLocationInWindow(r82);
            int r12 = r5[1] - r82[1];
            int r52 = r5[0] - r82[0];
            int width = searchAutoComplete.getWidth() + r52;
            int height = searchAutoComplete.getHeight() + r12;
            Rect rect = this.f1867z;
            rect.set(r52, r12, width, height);
            int r53 = rect.left;
            int r83 = rect.right;
            int r92 = r9 - r7;
            Rect rect2 = this.f1828A;
            rect2.set(r53, 0, r83, r92);
            C2566e1 c2566e1 = this.f1866y;
            if (c2566e1 == null) {
                C2566e1 c2566e12 = new C2566e1(rect2, rect, searchAutoComplete);
                this.f1866y = c2566e12;
                setTouchDelegate(c2566e12);
            } else {
                c2566e1.f8341b.set(rect2);
                Rect rect3 = c2566e1.f8343d;
                rect3.set(rect2);
                int r72 = -c2566e1.f8344e;
                rect3.inset(r72, r72);
                c2566e1.f8342c.set(rect);
            }
        }
    }

    @Override // p104l.AbstractC2506C0, android.view.View
    public final void onMeasure(int r4, int r5) {
        int r02;
        if (this.f1841N) {
            super.onMeasure(r4, r5);
            return;
        }
        int mode = View.MeasureSpec.getMode(r4);
        int size = View.MeasureSpec.getSize(r4);
        if (mode == Integer.MIN_VALUE) {
            int r03 = this.f1847T;
            size = r03 > 0 ? Math.min(r03, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1847T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (r02 = this.f1847T) > 0) {
            size = Math.min(r02, size);
        }
        int mode2 = View.MeasureSpec.getMode(r5);
        int size2 = View.MeasureSpec.getSize(r5);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2563d1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2563d1 c2563d1 = (C2563d1) parcelable;
        super.onRestoreInstanceState(c2563d1.f1263a);
        m1530y(c2563d1.f8339c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2563d1 c2563d1 = new C2563d1(super.onSaveInstanceState());
        c2563d1.f8339c = this.f1841N;
        return c2563d1;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f1854d0);
    }

    /* renamed from: p */
    public final void m1521p(int r7) {
        int r12;
        String m5023h;
        Cursor cursor = this.f1842O.f1170c;
        if (cursor != null && cursor.moveToPosition(r7)) {
            Intent intent = null;
            try {
                int r2 = ViewOnClickListenerC2572g1.f8354x;
                String m5023h2 = ViewOnClickListenerC2572g1.m5023h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (m5023h2 == null) {
                    m5023h2 = this.f1852b0.getSuggestIntentAction();
                }
                if (m5023h2 == null) {
                    m5023h2 = "android.intent.action.SEARCH";
                }
                String m5023h3 = ViewOnClickListenerC2572g1.m5023h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (m5023h3 == null) {
                    m5023h3 = this.f1852b0.getSuggestIntentData();
                }
                if (m5023h3 != null && (m5023h = ViewOnClickListenerC2572g1.m5023h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    m5023h3 = m5023h3 + "/" + Uri.encode(m5023h);
                }
                intent = m1517l(m5023h2, m5023h3 == null ? null : Uri.parse(m5023h3), ViewOnClickListenerC2572g1.m5023h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC2572g1.m5023h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    r12 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    r12 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + r12 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f1857p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* renamed from: q */
    public final void m1522q(int r3) {
        Editable text = this.f1857p.getText();
        Cursor cursor = this.f1842O.f1170c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(r3)) {
            setQuery(text);
            return;
        }
        String mo1210c = this.f1842O.mo1210c(cursor);
        if (mo1210c != null) {
            setQuery(mo1210c);
        } else {
            setQuery(text);
        }
    }

    /* renamed from: r */
    public final void m1523r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int r3, Rect rect) {
        if (this.f1846S || !isFocusable()) {
            return false;
        }
        if (this.f1841N) {
            return super.requestFocus(r3, rect);
        }
        boolean requestFocus = this.f1857p.requestFocus(r3, rect);
        if (requestFocus) {
            m1530y(false);
        }
        return requestFocus;
    }

    /* renamed from: s */
    public final void m1524s() {
        SearchAutoComplete searchAutoComplete = this.f1857p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1852b0 != null) {
            getContext().startActivity(m1517l("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1853c0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            m1520o();
            return;
        }
        m1530y(false);
        SearchAutoComplete searchAutoComplete = this.f1857p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1839L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f1840M == z2) {
            return;
        }
        this.f1840M = z2;
        m1530y(z2);
        m1527v();
    }

    public void setImeOptions(int r2) {
        this.f1857p.setImeOptions(r2);
    }

    public void setInputType(int r2) {
        this.f1857p.setInputType(r2);
    }

    public void setMaxWidth(int r12) {
        this.f1847T = r12;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1838K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1839L = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1844Q = charSequence;
        m1527v();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.f1845R = z2;
        AbstractC0455c abstractC0455c = this.f1842O;
        if (abstractC0455c instanceof ViewOnClickListenerC2572g1) {
            ((ViewOnClickListenerC2572g1) abstractC0455c).f8363p = z2 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1852b0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f1857p;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f1852b0.getImeOptions());
            int inputType = this.f1852b0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f1852b0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            AbstractC0455c abstractC0455c = this.f1842O;
            if (abstractC0455c != null) {
                abstractC0455c.mo1209b(null);
            }
            if (this.f1852b0.getSuggestAuthority() != null) {
                ViewOnClickListenerC2572g1 viewOnClickListenerC2572g1 = new ViewOnClickListenerC2572g1(getContext(), this, this.f1852b0, this.f1856f0);
                this.f1842O = viewOnClickListenerC2572g1;
                searchAutoComplete.setAdapter(viewOnClickListenerC2572g1);
                ((ViewOnClickListenerC2572g1) this.f1842O).f8363p = this.f1845R ? 2 : 1;
            }
            m1527v();
        }
        SearchableInfo searchableInfo2 = this.f1852b0;
        boolean z2 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f1852b0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f1835H;
            } else if (this.f1852b0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f1836I;
            }
            if (intent != null) {
                z2 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f1848U = z2;
        if (z2) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        m1530y(this.f1841N);
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.f1843P = z2;
        m1530y(this.f1841N);
    }

    public void setSuggestionsAdapter(AbstractC0455c abstractC0455c) {
        this.f1842O = abstractC0455c;
        this.f1857p.setAdapter(abstractC0455c);
    }

    /* renamed from: t */
    public final void m1525t() {
        boolean isEmpty = TextUtils.isEmpty(this.f1857p.getText());
        int r12 = (!isEmpty || (this.f1840M && !this.f1850W)) ? 0 : 8;
        ImageView imageView = this.f1863v;
        imageView.setVisibility(r12);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: u */
    public final void m1526u() {
        int[] r02 = this.f1857p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1859r.getBackground();
        if (background != null) {
            background.setState(r02);
        }
        Drawable background2 = this.f1860s.getBackground();
        if (background2 != null) {
            background2.setState(r02);
        }
        invalidate();
    }

    /* renamed from: v */
    public final void m1527v() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z2 = this.f1840M;
        SearchAutoComplete searchAutoComplete = this.f1857p;
        if (z2 && (drawable = this.f1832E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: w */
    public final void m1528w() {
        this.f1860s.setVisibility(((this.f1843P || this.f1848U) && !this.f1841N && (this.f1862u.getVisibility() == 0 || this.f1864w.getVisibility() == 0)) ? 0 : 8);
    }

    /* renamed from: x */
    public final void m1529x(boolean z2) {
        boolean z3 = this.f1843P;
        this.f1862u.setVisibility((!z3 || !(z3 || this.f1848U) || this.f1841N || !hasFocus() || (!z2 && this.f1848U)) ? 8 : 0);
    }

    /* renamed from: y */
    public final void m1530y(boolean z2) {
        this.f1841N = z2;
        int r02 = 8;
        int r2 = z2 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f1857p.getText());
        this.f1861t.setVisibility(r2);
        m1529x(!isEmpty);
        this.f1858q.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.f1831D;
        imageView.setVisibility((imageView.getDrawable() == null || this.f1840M) ? 8 : 0);
        m1525t();
        if (this.f1848U && !this.f1841N && isEmpty) {
            this.f1862u.setVisibility(8);
            r02 = 0;
        }
        this.f1864w.setVisibility(r02);
        m1528w();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int r22) {
        super(context, attributeSet, r22);
        this.f1867z = new Rect();
        this.f1828A = new Rect();
        this.f1829B = new int[2];
        this.f1830C = new int[2];
        this.f1854d0 = new RunnableC2547X0(this, 0);
        this.f1855e0 = new RunnableC2547X0(this, 1);
        this.f1856f0 = new WeakHashMap();
        ViewOnClickListenerC0606a viewOnClickListenerC0606a = new ViewOnClickListenerC0606a(this);
        ViewOnKeyListenerC0607b viewOnKeyListenerC0607b = new ViewOnKeyListenerC0607b(this);
        C2551Z0 c2551z0 = new C2551Z0(this);
        C0938r c0938r = new C0938r(2, this);
        C2508D0 c2508d0 = new C2508D0(1, this);
        C2545W0 c2545w0 = new C2545W0(this);
        int[] r2 = AbstractC0780a.f3134u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r2, r22, 0);
        C0015h c0015h = new C0015h(context, obtainStyledAttributes);
        AbstractC0283P.m778k(this, context, r2, attributeSet, obtainStyledAttributes, r22);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1857p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1858q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f1859r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f1860s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f1861t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1862u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f1863v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1864w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f1831D = imageView5;
        findViewById.setBackground(c0015h.m121p(20));
        findViewById2.setBackground(c0015h.m121p(25));
        imageView.setImageDrawable(c0015h.m121p(23));
        imageView2.setImageDrawable(c0015h.m121p(15));
        imageView3.setImageDrawable(c0015h.m121p(12));
        imageView4.setImageDrawable(c0015h.m121p(28));
        imageView5.setImageDrawable(c0015h.m121p(23));
        this.f1832E = c0015h.m121p(22);
        AbstractC0580g.m1459z(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f1833F = obtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f1834G = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(viewOnClickListenerC0606a);
        imageView3.setOnClickListener(viewOnClickListenerC0606a);
        imageView2.setOnClickListener(viewOnClickListenerC0606a);
        imageView4.setOnClickListener(viewOnClickListenerC0606a);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0606a);
        searchAutoComplete.addTextChangedListener(c2545w0);
        searchAutoComplete.setOnEditorActionListener(c2551z0);
        searchAutoComplete.setOnItemClickListener(c0938r);
        searchAutoComplete.setOnItemSelectedListener(c2508d0);
        searchAutoComplete.setOnKeyListener(viewOnKeyListenerC0607b);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2549Y0(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f1837J = obtainStyledAttributes.getText(14);
        this.f1844Q = obtainStyledAttributes.getText(21);
        int r23 = obtainStyledAttributes.getInt(6, -1);
        if (r23 != -1) {
            setImeOptions(r23);
        }
        int r24 = obtainStyledAttributes.getInt(5, -1);
        if (r24 != -1) {
            setInputType(r24);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        c0015h.m102C();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1835H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1836I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1865x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0407a(1, this));
        }
        m1530y(this.f1840M);
        m1527v();
    }

    public void setOnCloseListener(InterfaceC2554a1 interfaceC2554a1) {
    }

    public void setOnQueryTextListener(InterfaceC2557b1 interfaceC2557b1) {
    }

    public void setOnSuggestionListener(InterfaceC2560c1 interfaceC2560c1) {
    }
}
