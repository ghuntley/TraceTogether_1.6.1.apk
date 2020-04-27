package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o.C0293;
import o.C0898;
import o.C0941;
import o.C1219;
import o.C1421;
import o.C1992;
import o.C2110;
import o.C2373;
import o.C2745;
import o.C2958;
import o.CON;
import o.R;

public class SearchView extends C2958 implements CON {
    static final boolean DBG = false;
    static final C0011 HIDDEN_METHOD_INVOKER = new C0011();
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    static final String LOG_TAG = "SearchView";
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final View.OnClickListener mOnClickListener;
    private C3237If mOnCloseListener;
    private final TextView.OnEditorActionListener mOnEditorActionListener;
    private final AdapterView.OnItemClickListener mOnItemClickListener;
    private final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private Cif mOnQueryChangeListener;
    View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private View.OnClickListener mOnSearchClickListener;
    private C0010 mOnSuggestionListener;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable;
    final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    final IF mSearchSrcTextView;
    private Rect mSearchSrcTextViewBounds;
    private Rect mSearchSrtTextViewBoundsExpanded;
    SearchableInfo mSearchable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    C0941 mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    View.OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private C0013 mTouchDelegate;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    /* renamed from: androidx.appcompat.widget.SearchView$If  reason: case insensitive filesystem */
    public interface C3237If {
        /* renamed from: ǃ  reason: contains not printable characters */
        boolean m125();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$if  reason: invalid class name */
    public interface Cif {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$ı  reason: contains not printable characters */
    public interface C0010 {
        /* renamed from: ı  reason: contains not printable characters */
        boolean m126();

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean m127();
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f154082130969222);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSearchSrcTextViewBounds = new Rect();
        this.mSearchSrtTextViewBoundsExpanded = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.mUpdateDrawableStateRunnable = new Runnable() {
            public final void run() {
                SearchView.this.updateFocusedState();
            }
        };
        this.mReleaseCursorRunnable = new Runnable() {
            public final void run() {
                if (SearchView.this.mSuggestionsAdapter instanceof C1421) {
                    SearchView.this.mSuggestionsAdapter.m6826((Cursor) null);
                }
            }
        };
        this.mOutsideDrawablesCache = new WeakHashMap<>();
        this.mOnClickListener = new View.OnClickListener() {
            public final void onClick(View view) {
                if (view == SearchView.this.mSearchButton) {
                    SearchView.this.onSearchClicked();
                } else if (view == SearchView.this.mCloseButton) {
                    SearchView.this.onCloseClicked();
                } else if (view == SearchView.this.mGoButton) {
                    SearchView.this.onSubmitQuery();
                } else if (view == SearchView.this.mVoiceButton) {
                    SearchView.this.onVoiceClicked();
                } else if (view == SearchView.this.mSearchSrcTextView) {
                    SearchView.this.forceSuggestionQuery();
                }
            }
        };
        this.mTextKeyListener = new View.OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (SearchView.this.mSearchable == null) {
                    return false;
                }
                if (SearchView.this.mSearchSrcTextView.isPopupShowing() && SearchView.this.mSearchSrcTextView.getListSelection() != -1) {
                    return SearchView.this.onSuggestionsKey(view, i, keyEvent);
                }
                if ((TextUtils.getTrimmedLength(SearchView.this.mSearchSrcTextView.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView = SearchView.this;
                searchView.launchQuerySearch(0, (String) null, searchView.mSearchSrcTextView.getText().toString());
                return true;
            }
        };
        this.mOnEditorActionListener = new TextView.OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchView.this.onSubmitQuery();
                return true;
            }
        };
        this.mOnItemClickListener = new AdapterView.OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.onItemClicked(i, 0, (String) null);
            }
        };
        this.mOnItemSelectedListener = new AdapterView.OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.onItemSelected(i);
            }
        };
        this.mTextWatcher = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.onTextChanged(charSequence);
            }
        };
        C1992 r2 = new C1992(context, context.obtainStyledAttributes(attributeSet, C2745.aux.f12967, i, 0));
        LayoutInflater from = LayoutInflater.from(context);
        int i2 = C2745.aux.f13012;
        from.inflate(r2.f9934.getResourceId(9, R.layout.f168842131558425), this, true);
        this.mSearchSrcTextView = (IF) findViewById(R.id.f167332131362323);
        this.mSearchSrcTextView.f119 = this;
        this.mSearchEditFrame = findViewById(R.id.f167292131362319);
        this.mSearchPlate = findViewById(R.id.f167322131362322);
        this.mSubmitArea = findViewById(R.id.f167512131362358);
        this.mSearchButton = (ImageView) findViewById(R.id.f167272131362317);
        this.mGoButton = (ImageView) findViewById(R.id.f167302131362320);
        this.mCloseButton = (ImageView) findViewById(R.id.f167282131362318);
        this.mVoiceButton = (ImageView) findViewById(R.id.f167342131362324);
        this.mCollapsedIcon = (ImageView) findViewById(R.id.f167312131362321);
        C0293.m4199(this.mSearchPlate, r2.m10793(C2745.aux.f13009));
        C0293.m4199(this.mSubmitArea, r2.m10793(C2745.aux.f13018));
        this.mSearchButton.setImageDrawable(r2.m10793(C2745.aux.f13005));
        this.mGoButton.setImageDrawable(r2.m10793(C2745.aux.f12997));
        this.mCloseButton.setImageDrawable(r2.m10793(C2745.aux.f12985));
        this.mVoiceButton.setImageDrawable(r2.m10793(C2745.aux.f13025));
        this.mCollapsedIcon.setImageDrawable(r2.m10793(C2745.aux.f13005));
        this.mSearchHintIcon = r2.m10793(C2745.aux.f13003);
        C2110.m11263(this.mSearchButton, getResources().getString(R.string.f170282131886101));
        int i3 = C2745.aux.f13017;
        this.mSuggestionRowLayout = r2.f9934.getResourceId(15, R.layout.f168832131558424);
        int i4 = C2745.aux.f12998;
        this.mSuggestionCommitIconResId = r2.f9934.getResourceId(5, 0);
        this.mSearchButton.setOnClickListener(this.mOnClickListener);
        this.mCloseButton.setOnClickListener(this.mOnClickListener);
        this.mGoButton.setOnClickListener(this.mOnClickListener);
        this.mVoiceButton.setOnClickListener(this.mOnClickListener);
        this.mSearchSrcTextView.setOnClickListener(this.mOnClickListener);
        this.mSearchSrcTextView.addTextChangedListener(this.mTextWatcher);
        this.mSearchSrcTextView.setOnEditorActionListener(this.mOnEditorActionListener);
        this.mSearchSrcTextView.setOnItemClickListener(this.mOnItemClickListener);
        this.mSearchSrcTextView.setOnItemSelectedListener(this.mOnItemSelectedListener);
        this.mSearchSrcTextView.setOnKeyListener(this.mTextKeyListener);
        this.mSearchSrcTextView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                if (SearchView.this.mOnQueryTextFocusChangeListener != null) {
                    SearchView.this.mOnQueryTextFocusChangeListener.onFocusChange(SearchView.this, z);
                }
            }
        });
        int i5 = C2745.aux.f12994;
        setIconifiedByDefault(r2.f9934.getBoolean(8, true));
        int i6 = C2745.aux.f12956;
        int dimensionPixelSize = r2.f9934.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        int i7 = C2745.aux.f12999;
        this.mDefaultQueryHint = r2.f9934.getText(6);
        int i8 = C2745.aux.f13011;
        this.mQueryHint = r2.f9934.getText(11);
        int i9 = C2745.aux.f12963;
        int i10 = r2.f9934.getInt(3, -1);
        if (i10 != -1) {
            setImeOptions(i10);
        }
        int i11 = C2745.aux.f12983;
        int i12 = r2.f9934.getInt(2, -1);
        if (i12 != -1) {
            setInputType(i12);
        }
        int i13 = C2745.aux.f12976;
        setFocusable(r2.f9934.getBoolean(0, true));
        r2.f9934.recycle();
        this.mVoiceWebSearchIntent = new Intent("android.speech.action.WEB_SEARCH");
        this.mVoiceWebSearchIntent.addFlags(268435456);
        this.mVoiceWebSearchIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.mVoiceAppSearchIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.mVoiceAppSearchIntent.addFlags(268435456);
        this.mDropDownAnchor = findViewById(this.mSearchSrcTextView.getDropDownAnchor());
        View view = this.mDropDownAnchor;
        if (view != null) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    SearchView.this.adjustDropDownSizeAndPosition();
                }
            });
        }
        updateViewsVisibility(this.mIconifiedByDefault);
        updateQueryHint();
    }

    public int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }

    public int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.mSearchable = searchableInfo;
        if (this.mSearchable != null) {
            updateSearchAutoComplete();
            updateQueryHint();
        }
        this.mVoiceButtonEnabled = hasVoiceSearch();
        if (this.mVoiceButtonEnabled) {
            this.mSearchSrcTextView.setPrivateImeOptions(IME_OPTION_NO_MICROPHONE);
        }
        updateViewsVisibility(isIconified());
    }

    public void setAppSearchData(Bundle bundle) {
        this.mAppSearchData = bundle;
    }

    public void setImeOptions(int i) {
        this.mSearchSrcTextView.setImeOptions(i);
    }

    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }

    public void setInputType(int i) {
        this.mSearchSrcTextView.setInputType(i);
    }

    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.mClearingFocus || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.mSearchSrcTextView.requestFocus(i, rect);
        if (requestFocus) {
            updateViewsVisibility(false);
        }
        return requestFocus;
    }

    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.m124(false);
        this.mClearingFocus = false;
    }

    public void setOnQueryTextListener(Cif ifVar) {
        this.mOnQueryChangeListener = ifVar;
    }

    public void setOnCloseListener(C3237If ifR) {
        this.mOnCloseListener = ifR;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnSuggestionListener(C0010 r1) {
        this.mOnSuggestionListener = r1;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            IF ifR = this.mSearchSrcTextView;
            ifR.setSelection(ifR.length());
            this.mUserQuery = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            onSubmitQuery();
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.mQueryHint = charSequence;
        updateQueryHint();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.mQueryHint;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.mDefaultQueryHint;
        }
        return getContext().getText(this.mSearchable.getHintId());
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.mIconifiedByDefault != z) {
            this.mIconifiedByDefault = z;
            updateViewsVisibility(z);
            updateQueryHint();
        }
    }

    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }

    public void setIconified(boolean z) {
        if (z) {
            onCloseClicked();
        } else {
            onSearchClicked();
        }
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.mSubmitButtonEnabled = z;
        updateViewsVisibility(isIconified());
    }

    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.mQueryRefinement = z;
        C0941 r0 = this.mSuggestionsAdapter;
        if (r0 instanceof C1421) {
            ((C1421) r0).f7742 = z ? 2 : 1;
        }
    }

    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }

    public void setSuggestionsAdapter(C0941 r2) {
        this.mSuggestionsAdapter = r2;
        this.mSearchSrcTextView.setAdapter(this.mSuggestionsAdapter);
    }

    public C0941 getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (isIconified()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.mMaxWidth;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.mMaxWidth;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.mMaxWidth) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            getChildBoundsWithinSearchView(this.mSearchSrcTextView, this.mSearchSrcTextViewBounds);
            this.mSearchSrtTextViewBoundsExpanded.set(this.mSearchSrcTextViewBounds.left, 0, this.mSearchSrcTextViewBounds.right, i4 - i2);
            C0013 r2 = this.mTouchDelegate;
            if (r2 == null) {
                this.mTouchDelegate = new C0013(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds, this.mSearchSrcTextView);
                setTouchDelegate(this.mTouchDelegate);
                return;
            }
            r2.m128(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
        }
    }

    private void getChildBoundsWithinSearchView(View view, Rect rect) {
        view.getLocationInWindow(this.mTemp);
        getLocationInWindow(this.mTemp2);
        int[] iArr = this.mTemp;
        int i = iArr[1];
        int[] iArr2 = this.mTemp2;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.f157852131165239);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.f157842131165238);
    }

    private void updateViewsVisibility(boolean z) {
        this.mIconified = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mSearchButton.setVisibility(i2);
        updateSubmitButton(z2);
        this.mSearchEditFrame.setVisibility(z ? 8 : 0);
        if (this.mCollapsedIcon.getDrawable() == null || this.mIconifiedByDefault) {
            i = 8;
        }
        this.mCollapsedIcon.setVisibility(i);
        updateCloseButton();
        updateVoiceButton(!z2);
        updateSubmitArea();
    }

    private boolean hasVoiceSearch() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = null;
            if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
                intent = this.mVoiceWebSearchIntent;
            } else if (this.mSearchable.getVoiceSearchLaunchRecognizer()) {
                intent = this.mVoiceAppSearchIntent;
            }
            if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean isSubmitAreaEnabled() {
        return (this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !isIconified();
    }

    private void updateSubmitButton(boolean z) {
        this.mGoButton.setVisibility((!this.mSubmitButtonEnabled || !isSubmitAreaEnabled() || !hasFocus() || (!z && this.mVoiceButtonEnabled)) ? 8 : 0);
    }

    private void updateSubmitArea() {
        this.mSubmitArea.setVisibility((!isSubmitAreaEnabled() || !(this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) ? 8 : 0);
    }

    private void updateCloseButton() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        int i = 0;
        if (!z2 && (!this.mIconifiedByDefault || this.mExpandedInActionView)) {
            z = false;
        }
        ImageView imageView = this.mCloseButton;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    private void postUpdateFocusedState() {
        post(this.mUpdateDrawableStateRunnable);
    }

    /* access modifiers changed from: package-private */
    public void updateFocusedState() {
        int[] iArr = this.mSearchSrcTextView.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.mSubmitArea.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    public void onQueryRefine(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    public boolean onSuggestionsKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.mSearchable != null && this.mSuggestionsAdapter != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.mSearchSrcTextView.length();
                }
                this.mSearchSrcTextView.setSelection(i2);
                this.mSearchSrcTextView.setListSelection(0);
                this.mSearchSrcTextView.clearListSelection();
                C0011 r4 = HIDDEN_METHOD_INVOKER;
                IF ifR = this.mSearchSrcTextView;
                if (r4.f123 != null) {
                    try {
                        r4.f123.invoke(ifR, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
                return true;
            } else if (i != 19 || this.mSearchSrcTextView.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    private CharSequence getDecoratedHint(CharSequence charSequence) {
        if (!this.mIconifiedByDefault || this.mSearchHintIcon == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.mSearchSrcTextView.getTextSize()) * 1.25d);
        this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void updateQueryHint() {
        CharSequence queryHint = getQueryHint();
        IF ifR = this.mSearchSrcTextView;
        if (queryHint == null) {
            queryHint = "";
        }
        ifR.setHint(getDecoratedHint(queryHint));
    }

    private void updateSearchAutoComplete() {
        this.mSearchSrcTextView.setThreshold(this.mSearchable.getSuggestThreshold());
        this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
        int inputType = this.mSearchable.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.mSearchable.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.mSearchSrcTextView.setInputType(inputType);
        C0941 r0 = this.mSuggestionsAdapter;
        if (r0 != null) {
            r0.m6826((Cursor) null);
        }
        if (this.mSearchable.getSuggestAuthority() != null) {
            this.mSuggestionsAdapter = new C1421(getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
            this.mSearchSrcTextView.setAdapter(this.mSuggestionsAdapter);
            C1421 r02 = (C1421) this.mSuggestionsAdapter;
            if (this.mQueryRefinement) {
                i = 2;
            }
            r02.f7742 = i;
        }
    }

    private void updateVoiceButton(boolean z) {
        int i;
        if (!this.mVoiceButtonEnabled || isIconified() || !z) {
            i = 8;
        } else {
            i = 0;
            this.mGoButton.setVisibility(8);
        }
        this.mVoiceButton.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    public void onTextChanged(CharSequence charSequence) {
        Editable text = this.mSearchSrcTextView.getText();
        this.mUserQuery = text;
        boolean z = !TextUtils.isEmpty(text);
        updateSubmitButton(z);
        updateVoiceButton(!z);
        updateCloseButton();
        updateSubmitArea();
        if (this.mOnQueryChangeListener != null && !TextUtils.equals(charSequence, this.mOldQueryText)) {
            this.mOnQueryChangeListener.onQueryTextChange(charSequence.toString());
        }
        this.mOldQueryText = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public void onSubmitQuery() {
        Editable text = this.mSearchSrcTextView.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            Cif ifVar = this.mOnQueryChangeListener;
            if (ifVar == null || !ifVar.onQueryTextSubmit(text.toString())) {
                if (this.mSearchable != null) {
                    launchQuerySearch(0, (String) null, text.toString());
                }
                this.mSearchSrcTextView.m124(false);
                dismissSuggestions();
            }
        }
    }

    private void dismissSuggestions() {
        this.mSearchSrcTextView.dismissDropDown();
    }

    /* access modifiers changed from: package-private */
    public void onCloseClicked() {
        if (!TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            this.mSearchSrcTextView.setText("");
            this.mSearchSrcTextView.requestFocus();
            this.mSearchSrcTextView.m124(true);
        } else if (this.mIconifiedByDefault) {
            C3237If ifR = this.mOnCloseListener;
            if (ifR == null || !ifR.m125()) {
                clearFocus();
                updateViewsVisibility(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onSearchClicked() {
        updateViewsVisibility(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.m124(true);
        View.OnClickListener onClickListener = this.mOnSearchClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void onVoiceClicked() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onTextFocusChanged() {
        updateViewsVisibility(isIconified());
        postUpdateFocusedState();
        if (this.mSearchSrcTextView.hasFocus()) {
            forceSuggestionQuery();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        postUpdateFocusedState();
    }

    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    public void onActionViewExpanded() {
        if (!this.mExpandedInActionView) {
            this.mExpandedInActionView = true;
            this.mCollapsedImeOptions = this.mSearchSrcTextView.getImeOptions();
            this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions | 33554432);
            this.mSearchSrcTextView.setText("");
            setIconified(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$ɩ  reason: contains not printable characters */
    static class C0012 extends C1219 {
        public static final Parcelable.Creator<C0012> CREATOR = new Parcelable.ClassLoaderCreator<C0012>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0012(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C0012[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C0012(parcel, (ClassLoader) null);
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        boolean f126;

        C0012(Parcelable parcelable) {
            super(parcelable);
        }

        public C0012(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f126 = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f126));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.f126);
            sb.append("}");
            return sb.toString();
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0012 r1 = new C0012(super.onSaveInstanceState());
        r1.f126 = isIconified();
        return r1;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0012)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0012 r2 = (C0012) parcelable;
        super.onRestoreInstanceState(r2.f6905);
        updateViewsVisibility(r2.f126);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void adjustDropDownSizeAndPosition() {
        int i;
        if (this.mDropDownAnchor.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            boolean r3 = C2373.m12363(this);
            int dimensionPixelSize = this.mIconifiedByDefault ? resources.getDimensionPixelSize(R.dimen.f157762131165225) + resources.getDimensionPixelSize(R.dimen.f157772131165226) : 0;
            this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            if (r3) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.mSearchSrcTextView.setDropDownHorizontalOffset(i);
            this.mSearchSrcTextView.setDropDownWidth((((this.mDropDownAnchor.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean onItemClicked(int i, int i2, String str) {
        C0010 r2 = this.mOnSuggestionListener;
        if (r2 != null && r2.m126()) {
            return false;
        }
        launchSuggestion(i, 0, (String) null);
        this.mSearchSrcTextView.m124(false);
        dismissSuggestions();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean onItemSelected(int i) {
        C0010 r0 = this.mOnSuggestionListener;
        if (r0 != null && r0.m127()) {
            return false;
        }
        rewriteQueryFromSuggestion(i);
        return true;
    }

    private void rewriteQueryFromSuggestion(int i) {
        Editable text = this.mSearchSrcTextView.getText();
        Cursor cursor = this.mSuggestionsAdapter.f5925;
        if (cursor != null) {
            if (cursor.moveToPosition(i)) {
                CharSequence r3 = this.mSuggestionsAdapter.m6828(cursor);
                if (r3 != null) {
                    setQuery(r3);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private boolean launchSuggestion(int i, int i2, String str) {
        Cursor cursor = this.mSuggestionsAdapter.f5925;
        if (cursor == null || !cursor.moveToPosition(i)) {
            return false;
        }
        launchIntent(createIntentFromSuggestion(cursor, i2, str));
        return true;
    }

    private void launchIntent(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException unused) {
            }
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.mSearchSrcTextView.setText(charSequence);
        this.mSearchSrcTextView.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    public void launchQuerySearch(int i, String str, String str2) {
        getContext().startActivity(createIntent("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    private Intent createIntent(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.mAppSearchData;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.mAppSearchData;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r10.getPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.Intent createIntentFromSuggestion(android.database.Cursor r10, int r11, java.lang.String r12) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = "suggest_intent_action"
            java.lang.String r1 = o.C1421.m8646((android.database.Cursor) r10, (java.lang.String) r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x000f
            android.app.SearchableInfo r1 = r9.mSearchable     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x000f:
            if (r1 != 0) goto L_0x0013
            java.lang.String r1 = "android.intent.action.SEARCH"
        L_0x0013:
            r3 = r1
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = o.C1421.m8646((android.database.Cursor) r10, (java.lang.String) r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x0022
            android.app.SearchableInfo r1 = r9.mSearchable     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0022:
            if (r1 == 0) goto L_0x0044
            java.lang.String r2 = "suggest_intent_data_id"
            java.lang.String r2 = o.C1421.m8646((android.database.Cursor) r10, (java.lang.String) r2)     // Catch:{ RuntimeException -> 0x0061 }
            if (r2 == 0) goto L_0x0044
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0061 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = android.net.Uri.encode(r2)     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r4.toString()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0044:
            if (r1 != 0) goto L_0x0048
            r4 = r0
            goto L_0x004d
        L_0x0048:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x0061 }
            r4 = r1
        L_0x004d:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r6 = o.C1421.m8646((android.database.Cursor) r10, (java.lang.String) r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "suggest_intent_extra_data"
            java.lang.String r5 = o.C1421.m8646((android.database.Cursor) r10, (java.lang.String) r1)     // Catch:{ RuntimeException -> 0x0061 }
            r2 = r9
            r7 = r11
            r8 = r12
            android.content.Intent r10 = r2.createIntent(r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x0061 }
            return r10
        L_0x0061:
            r10.getPosition()     // Catch:{ RuntimeException -> 0x0064 }
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.createIntentFromSuggestion(android.database.Cursor, int, java.lang.String):android.content.Intent");
    }

    /* access modifiers changed from: package-private */
    public void forceSuggestionQuery() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.mSearchSrcTextView.refreshAutoCompleteResults();
            return;
        }
        C0011 r0 = HIDDEN_METHOD_INVOKER;
        IF ifR = this.mSearchSrcTextView;
        if (r0.f125 != null) {
            try {
                r0.f125.invoke(ifR, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C0011 r02 = HIDDEN_METHOD_INVOKER;
        IF ifR2 = this.mSearchSrcTextView;
        if (r02.f124 != null) {
            try {
                r02.f124.invoke(ifR2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    static boolean isLandscapeMode(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: androidx.appcompat.widget.SearchView$Ι  reason: contains not printable characters */
    static class C0013 extends TouchDelegate {

        /* renamed from: ı  reason: contains not printable characters */
        private final int f127;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Rect f128 = new Rect();

        /* renamed from: ɩ  reason: contains not printable characters */
        private final Rect f129 = new Rect();

        /* renamed from: Ι  reason: contains not printable characters */
        private final Rect f130 = new Rect();

        /* renamed from: ι  reason: contains not printable characters */
        private final View f131;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private boolean f132;

        public C0013(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f127 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            m128(rect, rect2);
            this.f131 = view;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m128(Rect rect, Rect rect2) {
            this.f130.set(rect);
            this.f129.set(rect);
            Rect rect3 = this.f129;
            int i = this.f127;
            rect3.inset(-i, -i);
            this.f128.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x002e
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003a
            L_0x001b:
                boolean r2 = r7.f132
                r7.f132 = r5
                goto L_0x003b
            L_0x0020:
                boolean r2 = r7.f132
                if (r2 == 0) goto L_0x003b
                android.graphics.Rect r6 = r7.f129
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x003b
                r4 = 0
                goto L_0x003b
            L_0x002e:
                android.graphics.Rect r2 = r7.f130
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003a
                r7.f132 = r4
                r2 = 1
                goto L_0x003b
            L_0x003a:
                r2 = 0
            L_0x003b:
                if (r2 == 0) goto L_0x0070
                if (r4 == 0) goto L_0x005b
                android.graphics.Rect r2 = r7.f128
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                android.view.View r0 = r7.f131
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f131
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006a
            L_0x005b:
                android.graphics.Rect r2 = r7.f128
                int r2 = r2.left
                int r0 = r0 - r2
                float r0 = (float) r0
                android.graphics.Rect r2 = r7.f128
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006a:
                android.view.View r0 = r7.f131
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0070:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0013.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public static class IF extends C0898 {

        /* renamed from: ı  reason: contains not printable characters */
        final Runnable f118;

        /* renamed from: ǃ  reason: contains not printable characters */
        SearchView f119;

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean f120;

        /* renamed from: Ι  reason: contains not printable characters */
        private int f121;

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        public IF(Context context) {
            this(context, (AttributeSet) null);
        }

        public IF(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.f148562130968624);
        }

        public IF(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f118 = new Runnable() {
                public final void run() {
                    IF ifR = IF.this;
                    if (ifR.f120) {
                        ((InputMethodManager) ifR.getContext().getSystemService("input_method")).showSoftInput(ifR, 0);
                        ifR.f120 = false;
                    }
                }
            };
            this.f121 = getThreshold();
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            setMinWidth((int) TypedValue.applyDimension(1, (float) ((i < 960 || i2 < 720 || configuration.orientation != 2) ? (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160 : 256), displayMetrics));
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f121 = i;
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f119.hasFocus() && getVisibility() == 0) {
                this.f120 = true;
                if (SearchView.isLandscapeMode(getContext())) {
                    C0011 r0 = SearchView.HIDDEN_METHOD_INVOKER;
                    if (r0.f123 != null) {
                        try {
                            r0.f123.invoke(this, new Object[]{Boolean.TRUE});
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f119.onTextFocusChanged();
        }

        public boolean enoughToFilter() {
            return this.f121 <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f119.clearFocus();
                        m124(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f120) {
                removeCallbacks(this.f118);
                post(this.f118);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m124(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f120 = false;
                removeCallbacks(this.f118);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f120 = false;
                removeCallbacks(this.f118);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f120 = true;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$ǃ  reason: contains not printable characters */
    static class C0011 {

        /* renamed from: ı  reason: contains not printable characters */
        Method f123;

        /* renamed from: Ι  reason: contains not printable characters */
        Method f124;

        /* renamed from: ι  reason: contains not printable characters */
        Method f125;

        C0011() {
            try {
                this.f125 = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f125.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f124 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f124.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                this.f123 = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f123.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }
}
