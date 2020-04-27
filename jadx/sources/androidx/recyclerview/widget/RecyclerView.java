package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.C0293;
import o.C0297;
import o.C0301;
import o.C0520;
import o.C0523;
import o.C0819;
import o.C0837;
import o.C0878;
import o.C0896;
import o.C0903;
import o.C0928;
import o.C1102;
import o.C1106;
import o.C1151;
import o.C1219;
import o.C1679;
import o.C2449;
import o.C2601;
import o.C2607;
import o.C2814;
import o.R;

public class RecyclerView extends ViewGroup implements C2607 {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = (Build.VERSION.SDK_INT >= 23);
    static final boolean ALLOW_THREAD_GAP_WORK = (Build.VERSION.SDK_INT >= 21);
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = (Build.VERSION.SDK_INT <= 15);
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = (Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20);
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = (Build.VERSION.SDK_INT <= 15);
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = (Build.VERSION.SDK_INT >= 16);
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    C1102 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public C0035 mAdapter;
    public C0896 mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private C3242If mChildDrawingOrderCallback;
    public C0878 mChildHelper;
    boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C0030 mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    C0903 mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private C3241Aux mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    C3246iF mItemAnimator;
    private C3246iF.C0028 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<C0037> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    public IF mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C3244auX mObserver;
    private List<C0039> mOnChildAttachStateListeners;
    private C0042 mOnFlingListener;
    private final ArrayList<C3241Aux> mOnItemTouchListeners;
    final List<con> mPendingAccessibilityImportanceChange;
    private C0036 mPendingSavedState;
    boolean mPostedAnimatorRunner;
    public C0903.If mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final AUx mRecycler;
    C0031 mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private C3243aUx mScrollListener;
    private List<C3243aUx> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C2601 mScrollingChildHelper;
    public final C0033 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final C0034 mViewFlinger;
    private final C1151.Cif mViewInfoProcessCallback;
    final C1151 mViewInfoStore;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$Aux  reason: case insensitive filesystem */
    public interface C3241Aux {
        /* renamed from: ı  reason: contains not printable characters */
        void m374(MotionEvent motionEvent);

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean m375(MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$If  reason: case insensitive filesystem */
    public interface C3242If {
        /* renamed from: ǃ  reason: contains not printable characters */
        int m472();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$aUx  reason: case insensitive filesystem */
    public static abstract class C3243aUx {
        /* renamed from: ı  reason: contains not printable characters */
        public void m473(RecyclerView recyclerView, int i) {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m474(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$Ɩ  reason: contains not printable characters */
    public interface C0031 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$І  reason: contains not printable characters */
    public interface C0039 {
        /* renamed from: ɩ  reason: contains not printable characters */
        void m502(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$Ӏ  reason: contains not printable characters */
    public static abstract class C0042 {
        /* renamed from: ı  reason: contains not printable characters */
        public abstract boolean m508(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ӏ  reason: contains not printable characters */
    public static abstract class C0043 {
        /* renamed from: ι  reason: contains not printable characters */
        public abstract View m509();
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    public void scrollTo(int i, int i2) {
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f154002130969213);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C3244auX();
        this.mRecycler = new AUx();
        this.mViewInfoStore = new C1151();
        this.mUpdateChildViewsRunnable = new Runnable() {
            public final void run() {
                if (RecyclerView.this.mFirstLayoutComplete && !RecyclerView.this.isLayoutRequested()) {
                    if (!RecyclerView.this.mIsAttached) {
                        RecyclerView.this.requestLayout();
                    } else if (RecyclerView.this.mLayoutSuppressed) {
                        RecyclerView.this.mLayoutWasDefered = true;
                    } else {
                        RecyclerView.this.consumePendingUpdateOperations();
                    }
                }
            }
        };
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C0030();
        this.mItemAnimator = new C0837();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new C0034();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C0903.If() : null;
        this.mState = new C0033();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C3245aux();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new Runnable() {
            public final void run() {
                if (RecyclerView.this.mItemAnimator != null) {
                    RecyclerView.this.mItemAnimator.runPendingAnimations();
                }
                RecyclerView.this.mPostedAnimatorRunner = false;
            }
        };
        this.mViewInfoProcessCallback = new C1151.Cif() {
            /* renamed from: ı  reason: contains not printable characters */
            public final void m338(con con, C3246iF.C0029 r3, C3246iF.C0029 r4) {
                RecyclerView.this.mRecycler.m368(con);
                RecyclerView.this.animateDisappearance(con, r3, r4);
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m341(con con, C3246iF.C0029 r3, C3246iF.C0029 r4) {
                RecyclerView.this.animateAppearance(con, r3, r4);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m339(con con, C3246iF.C0029 r3, C3246iF.C0029 r4) {
                con.setIsRecyclable(false);
                if (RecyclerView.this.mDataSetHasChangedAfterLayout) {
                    if (RecyclerView.this.mItemAnimator.animateChange(con, con, r3, r4)) {
                        RecyclerView.this.postAnimationRunner();
                    }
                } else if (RecyclerView.this.mItemAnimator.animatePersistence(con, r3, r4)) {
                    RecyclerView.this.postAnimationRunner();
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m340(con con) {
                IF ifR = RecyclerView.this.mLayout;
                View view = con.itemView;
                AUx aUx = RecyclerView.this.mRecycler;
                ifR.m436(view);
                aUx.m366(view);
            }
        };
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C0297.m4266(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C0297.m4262(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C0293.m4217(this) == 0) {
            C0293.m4203((View) this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1102(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0819.C0820.f5349, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C0819.C0820.f5349, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(C0819.C0820.f5354);
        if (obtainStyledAttributes.getInt(C0819.C0820.f5347, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(C0819.C0820.f5353, true);
        this.mEnableFastScroller = obtainStyledAttributes.getBoolean(C0819.C0820.f5345, false);
        if (this.mEnableFastScroller) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(C0819.C0820.f5356), obtainStyledAttributes.getDrawable(C0819.C0820.f5355), (StateListDrawable) obtainStyledAttributes.getDrawable(C0819.C0820.f5346), obtainStyledAttributes.getDrawable(C0819.C0820.f5351));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i, 0);
            if (Build.VERSION.SDK_INT >= 29) {
                saveAttributeDataForStyleable(context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes2, i, 0);
            }
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    /* access modifiers changed from: package-private */
    public String exceptionLabel() {
        StringBuilder sb = new StringBuilder(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.mAdapter);
        sb.append(", layout:");
        sb.append(this.mLayout);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C0293.m4145(this) == 0) {
            C0293.m4196((View) this, 8);
        }
    }

    public C1102 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void setAccessibilityDelegateCompat(C1102 r1) {
        this.mAccessibilityDelegate = r1;
        C0293.m4151((View) this, (C2449) this.mAccessibilityDelegate);
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(IF.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((IF) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    StringBuilder sb = new StringBuilder();
                    sb.append(attributeSet.getPositionDescription());
                    sb.append(": Error creating LayoutManager ");
                    sb.append(fullClassName);
                    throw new IllegalStateException(sb.toString(), e2);
                } catch (ClassNotFoundException e3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attributeSet.getPositionDescription());
                    sb2.append(": Unable to find LayoutManager ");
                    sb2.append(fullClassName);
                    throw new IllegalStateException(sb2.toString(), e3);
                } catch (InvocationTargetException e4) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attributeSet.getPositionDescription());
                    sb3.append(": Could not instantiate the LayoutManager: ");
                    sb3.append(fullClassName);
                    throw new IllegalStateException(sb3.toString(), e4);
                } catch (InstantiationException e5) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attributeSet.getPositionDescription());
                    sb4.append(": Could not instantiate the LayoutManager: ");
                    sb4.append(fullClassName);
                    throw new IllegalStateException(sb4.toString(), e5);
                } catch (IllegalAccessException e6) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attributeSet.getPositionDescription());
                    sb5.append(": Cannot access non-public constructor ");
                    sb5.append(fullClassName);
                    throw new IllegalStateException(sb5.toString(), e6);
                } catch (ClassCastException e7) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attributeSet.getPositionDescription());
                    sb6.append(": Class is not a LayoutManager ");
                    sb6.append(fullClassName);
                    throw new IllegalStateException(sb6.toString(), e7);
                }
            }
        }
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            return sb.toString();
        } else if (str.contains(".")) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(RecyclerView.class.getPackage().getName());
            sb2.append('.');
            sb2.append(str);
            return sb2.toString();
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C0878(new C0878.C0879() {
            /* renamed from: Ι  reason: contains not printable characters */
            public final int m348() {
                return RecyclerView.this.getChildCount();
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m345(View view, int i) {
                RecyclerView.this.addView(view, i);
                RecyclerView.this.dispatchChildAttached(view);
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final int m342(View view) {
                return RecyclerView.this.indexOfChild(view);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m347(int i) {
                View childAt = RecyclerView.this.getChildAt(i);
                if (childAt != null) {
                    RecyclerView.this.dispatchChildDetached(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeViewAt(i);
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final View m349(int i) {
                return RecyclerView.this.getChildAt(i);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final con m346(View view) {
                return RecyclerView.getChildViewHolderInt(view);
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final void m350(View view, int i, ViewGroup.LayoutParams layoutParams) {
                con childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                        childViewHolderInt.clearTmpDetachFlag();
                    } else {
                        StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                        sb.append(childViewHolderInt);
                        sb.append(RecyclerView.this.exceptionLabel());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                RecyclerView.this.attachViewToParent(view, i, layoutParams);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m344(View view) {
                con childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m352(View view) {
                con childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onLeftHiddenState(RecyclerView.this);
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m343() {
                int childCount = RecyclerView.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = RecyclerView.this.getChildAt(i);
                    RecyclerView.this.dispatchChildDetached(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m351(int i) {
                con childViewHolderInt;
                View childAt = RecyclerView.this.getChildAt(i);
                if (!(childAt == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) == null)) {
                    if (!childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                        childViewHolderInt.addFlags(256);
                    } else {
                        StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                        sb.append(childViewHolderInt);
                        sb.append(RecyclerView.this.exceptionLabel());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                RecyclerView.this.detachViewFromParent(i);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void initAdapterManager() {
        this.mAdapterHelper = new C0896(new C0896.Cif() {
            /* renamed from: ı  reason: contains not printable characters */
            public final con m330(int i) {
                con findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
                if (findViewHolderForPosition == null) {
                    return null;
                }
                C0878 r1 = RecyclerView.this.mChildHelper;
                if (r1.f5662.contains(findViewHolderForPosition.itemView)) {
                    return null;
                }
                return findViewHolderForPosition;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m334(int i, int i2) {
                RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mItemsAddedOrRemoved = true;
                recyclerView.mState.f374 += i2;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m331(int i, int i2) {
                RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m335(int i, int i2, Object obj) {
                RecyclerView.this.viewRangeUpdate(i, i2, obj);
                RecyclerView.this.mItemsChanged = true;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final void m337(C0896.C0897 r1) {
                m329(r1);
            }

            /* renamed from: ı  reason: contains not printable characters */
            private void m329(C0896.C0897 r3) {
                int i = r3.f5737;
                if (i == 1) {
                    RecyclerView.this.mLayout.m397(r3.f5735, r3.f5738);
                } else if (i == 2) {
                    RecyclerView.this.mLayout.m413(r3.f5735, r3.f5738);
                } else if (i == 4) {
                    RecyclerView.this.mLayout.m434(r3.f5735, r3.f5738);
                } else if (i == 8) {
                    RecyclerView.this.mLayout.m425(r3.f5735, r3.f5738);
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m333(C0896.C0897 r1) {
                m329(r1);
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final void m336(int i, int i2) {
                RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m332(int i, int i2) {
                RecyclerView.this.offsetPositionRecordsForMove(i, i2);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }
        });
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void swapAdapter(C0035 r2, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(r2, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void setAdapter(C0035 r3) {
        setLayoutFrozen(false);
        setAdapterInternal(r3, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void removeAndRecycleViews() {
        C3246iF iFVar = this.mItemAnimator;
        if (iFVar != null) {
            iFVar.endAnimations();
        }
        IF ifR = this.mLayout;
        if (ifR != null) {
            ifR.m402(this.mRecycler);
            this.mLayout.m428(this.mRecycler);
        }
        AUx aUx = this.mRecycler;
        aUx.f325.clear();
        aUx.m363();
    }

    private void setAdapterInternal(C0035 r4, boolean z, boolean z2) {
        C0035 r0 = this.mAdapter;
        if (r0 != null) {
            r0.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        C0896 r6 = this.mAdapterHelper;
        r6.m6653((List<C0896.C0897>) r6.f5728);
        r6.m6653((List<C0896.C0897>) r6.f5733);
        r6.f5731 = 0;
        C0035 r62 = this.mAdapter;
        this.mAdapter = r4;
        if (r4 != null) {
            r4.registerAdapterDataObserver(this.mObserver);
            r4.onAttachedToRecyclerView(this);
        }
        AUx aUx = this.mRecycler;
        C0035 r1 = this.mAdapter;
        aUx.f325.clear();
        aUx.m363();
        if (aUx.f331 == null) {
            aUx.f331 = new C0040();
        }
        C0040 r42 = aUx.f331;
        if (r62 != null) {
            r42.f392--;
        }
        if (!z && r42.f392 == 0) {
            for (int i = 0; i < r42.f393.size(); i++) {
                r42.f393.valueAt(i).f395.clear();
            }
        }
        if (r1 != null) {
            r42.f392++;
        }
        this.mState.f377 = true;
    }

    public C0035 getAdapter() {
        return this.mAdapter;
    }

    public void setRecyclerListener(C0031 r1) {
        this.mRecyclerListener = r1;
    }

    public int getBaseline() {
        if (this.mLayout != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public void addOnChildAttachStateChangeListener(C0039 r2) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(r2);
    }

    public void removeOnChildAttachStateChangeListener(C0039 r2) {
        List<C0039> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(r2);
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<C0039> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void setLayoutManager(IF ifR) {
        if (ifR != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                C3246iF iFVar = this.mItemAnimator;
                if (iFVar != null) {
                    iFVar.endAnimations();
                }
                this.mLayout.m402(this.mRecycler);
                this.mLayout.m428(this.mRecycler);
                AUx aUx = this.mRecycler;
                aUx.f325.clear();
                aUx.m363();
                if (this.mIsAttached) {
                    IF ifR2 = this.mLayout;
                    AUx aUx2 = this.mRecycler;
                    ifR2.f354 = false;
                    ifR2.m439(this, aUx2);
                }
                this.mLayout.m430((RecyclerView) null);
                this.mLayout = null;
            } else {
                AUx aUx3 = this.mRecycler;
                aUx3.f325.clear();
                aUx3.m363();
            }
            C0878 r0 = this.mChildHelper;
            C0878.Cif ifVar = r0.f5663;
            ifVar.f5665 = 0;
            if (ifVar.f5666 != null) {
                C0878.Cif ifVar2 = ifVar.f5666;
                while (true) {
                    ifVar2.f5665 = 0;
                    if (ifVar2.f5666 == null) {
                        break;
                    }
                    ifVar2 = ifVar2.f5666;
                }
            }
            for (int size = r0.f5662.size() - 1; size >= 0; size--) {
                r0.f5664.m6563(r0.f5662.get(size));
                r0.f5662.remove(size);
            }
            r0.f5664.m6554();
            this.mLayout = ifR;
            if (ifR != null) {
                if (ifR.f349 == null) {
                    this.mLayout.m430(this);
                    if (this.mIsAttached) {
                        this.mLayout.f354 = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("LayoutManager ");
                    sb.append(ifR);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(ifR.f349.exceptionLabel());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.mRecycler.m367();
            requestLayout();
        }
    }

    public void setOnFlingListener(C0042 r1) {
        this.mOnFlingListener = r1;
    }

    public C0042 getOnFlingListener() {
        return this.mOnFlingListener;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0036 r0 = new C0036(super.onSaveInstanceState());
        C0036 r1 = this.mPendingSavedState;
        if (r1 != null) {
            r0.f387 = r1.f387;
        } else {
            IF ifR = this.mLayout;
            if (ifR != null) {
                r0.f387 = ifR.m445();
            } else {
                r0.f387 = null;
            }
        }
        return r0;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0036)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.mPendingSavedState = (C0036) parcelable;
        super.onRestoreInstanceState(this.mPendingSavedState.f6905);
        if (this.mLayout != null && this.mPendingSavedState.f387 != null) {
            this.mLayout.m415(this.mPendingSavedState.f387);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    private void addAnimatingView(con con2) {
        View view = con2.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.m368(getChildViewHolder(view));
        if (con2.isTmpDetached()) {
            this.mChildHelper.m6543(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.m6545(view, -1, true);
        } else {
            C0878 r6 = this.mChildHelper;
            int r1 = r6.f5664.m6553(view);
            if (r1 >= 0) {
                r6.f5663.m6550(r1);
                r6.f5662.add(view);
                r6.f5664.m6555(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        C0878 r0 = this.mChildHelper;
        int r1 = r0.f5664.m6553(view);
        boolean z = true;
        if (r1 == -1) {
            if (r0.f5662.remove(view)) {
                r0.f5664.m6563(view);
            }
        } else if (r0.f5663.m6547(r1)) {
            r0.f5663.m6552(r1);
            if (r0.f5662.remove(view)) {
                r0.f5664.m6563(view);
            }
            r0.f5664.m6558(r1);
        } else {
            z = false;
        }
        if (z) {
            con childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m368(childViewHolderInt);
            this.mRecycler.m369(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z);
        return z;
    }

    public IF getLayoutManager() {
        return this.mLayout;
    }

    public C0040 getRecycledViewPool() {
        AUx aUx = this.mRecycler;
        if (aUx.f331 == null) {
            aUx.f331 = new C0040();
        }
        return aUx.f331;
    }

    public void setRecycledViewPool(C0040 r4) {
        AUx aUx = this.mRecycler;
        if (aUx.f331 != null) {
            C0040 r1 = aUx.f331;
            r1.f392--;
        }
        aUx.f331 = r4;
        if (aUx.f331 != null && RecyclerView.this.getAdapter() != null) {
            aUx.f331.f392++;
        }
    }

    public void setViewCacheExtension(C0043 r2) {
        this.mRecycler.f324 = r2;
    }

    public void setItemViewCacheSize(int i) {
        AUx aUx = this.mRecycler;
        aUx.f329 = i;
        aUx.m367();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.mScrollState) {
            this.mScrollState = i;
            if (i != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void addItemDecoration(C0037 r3, int i) {
        IF ifR = this.mLayout;
        if (ifR != null) {
            ifR.m440("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(r3);
        } else {
            this.mItemDecorations.add(i, r3);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addItemDecoration(C0037 r2) {
        addItemDecoration(r2, -1);
    }

    public C0037 getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is an invalid index for size ");
        sb.append(itemDecorationCount);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" is an invalid index for size ");
            sb.append(itemDecorationCount);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeItemDecoration(C0037 r3) {
        IF ifR = this.mLayout;
        if (ifR != null) {
            ifR.m440("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(r3);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C3242If ifR) {
        if (ifR != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = ifR;
            setChildrenDrawingOrderEnabled(this.mChildDrawingOrderCallback != null);
        }
    }

    @Deprecated
    public void setOnScrollListener(C3243aUx aux) {
        this.mScrollListener = aux;
    }

    public void addOnScrollListener(C3243aUx aux) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(aux);
    }

    public void removeOnScrollListener(C3243aUx aux) {
        List<C3243aUx> list = this.mScrollListeners;
        if (list != null) {
            list.remove(aux);
        }
    }

    public void clearOnScrollListeners() {
        List<C3243aUx> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void scrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            IF ifR = this.mLayout;
            if (ifR != null) {
                ifR.m424(i);
                awakenScrollBars();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.m424(i);
            awakenScrollBars();
        }
    }

    public void smoothScrollToPosition(int i) {
        IF ifR;
        if (!this.mLayoutSuppressed && (ifR = this.mLayout) != null) {
            ifR.m404(this, i);
        }
    }

    public void scrollBy(int i, int i2) {
        IF ifR = this.mLayout;
        if (ifR != null && !this.mLayoutSuppressed) {
            boolean r0 = ifR.m408();
            boolean r1 = this.mLayout.m453();
            if (r0 || r1) {
                if (!r0) {
                    i = 0;
                }
                if (!r1) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, (MotionEvent) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C1679.m9555(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int r5 = i != 0 ? this.mLayout.m442(i, this.mRecycler, this.mState) : 0;
        int r6 = i2 != 0 ? this.mLayout.m409(i2, this.mRecycler, this.mState) : 0;
        C1679.m9554();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = r5;
            iArr[1] = r6;
        }
    }

    /* access modifiers changed from: package-private */
    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C1679.m9555(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            C1679.m9554();
            return;
        }
        boolean z = false;
        if (this.mAdapterHelper.f5728.size() > 0) {
            if ((this.mAdapterHelper.f5731 & 4) != 0) {
                if (!((this.mAdapterHelper.f5731 & 11) != 0)) {
                    C1679.m9555(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.m6658();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.m6657();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    C1679.m9554();
                    return;
                }
            }
            if (this.mAdapterHelper.f5728.size() > 0) {
                z = true;
            }
            if (z) {
                C1679.m9555(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                C1679.m9554();
            }
        }
    }

    private boolean hasUpdatedView() {
        C0878 r0 = this.mChildHelper;
        int r1 = r0.f5664.m6559() - r0.f5662.size();
        for (int i = 0; i < r1; i++) {
            C0878 r3 = this.mChildHelper;
            con childViewHolderInt = getChildViewHolderInt(r3.f5664.m6560(r3.m6544(i)));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i7, i8, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i5 = i10;
            i6 = i9;
            i4 = i7 - i9;
            i3 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        int i11 = i6;
        dispatchNestedScroll(i6, i5, i4, i3, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i12 = i4 - iArr4[0];
        int i13 = i3 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i14 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C2814.m14732(motionEvent2, 8194)) {
                pullGlows(motionEvent.getX(), (float) i12, motionEvent.getY(), (float) i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        int i15 = i11;
        if (!(i15 == 0 && i5 == 0)) {
            dispatchOnScrolled(i15, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i15 == 0 && i5 == 0) ? false : true;
    }

    public int computeHorizontalScrollOffset() {
        IF ifR = this.mLayout;
        if (ifR != null && ifR.m408()) {
            return this.mLayout.m422(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        IF ifR = this.mLayout;
        if (ifR != null && ifR.m408()) {
            return this.mLayout.m452(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        IF ifR = this.mLayout;
        if (ifR != null && ifR.m408()) {
            return this.mLayout.m395(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        IF ifR = this.mLayout;
        if (ifR != null && ifR.m453()) {
            return this.mLayout.m444(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        IF ifR = this.mLayout;
        if (ifR != null && ifR.m453()) {
            return this.mLayout.m454(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        IF ifR = this.mLayout;
        if (ifR != null && ifR.m453()) {
            return this.mLayout.m410(this.mState);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void startInterceptRequestLayout() {
        this.mInterceptRequestLayoutDepth++;
        if (this.mInterceptRequestLayoutDepth == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth <= 0) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, (Interpolator) null);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, UNDEFINED_DURATION);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        IF ifR = this.mLayout;
        if (ifR != null && !this.mLayoutSuppressed) {
            int i4 = 0;
            if (!ifR.m408()) {
                i = 0;
            }
            if (!this.mLayout.m453()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        startNestedScroll(i4, 1);
                    }
                    this.mViewFlinger.m501(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    public boolean fling(int i, int i2) {
        IF ifR = this.mLayout;
        if (ifR == null || this.mLayoutSuppressed) {
            return false;
        }
        boolean r1 = ifR.m408();
        boolean r3 = this.mLayout.m453();
        int i3 = (!r1 || Math.abs(i) < this.mMinFlingVelocity) ? 0 : i;
        int i4 = (!r3 || Math.abs(i2) < this.mMinFlingVelocity) ? 0 : i2;
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        float f = (float) i3;
        float f2 = (float) i4;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = r1 || r3;
            dispatchNestedFling(f, f2, z);
            C0042 r6 = this.mOnFlingListener;
            if (r6 != null && r6.m508(i3, i4)) {
                return true;
            }
            if (z) {
                if (r3) {
                    r1 |= true;
                }
                startNestedScroll(r1 ? 1 : 0, 1);
                int i5 = this.mMaxFlingVelocity;
                int max = Math.max(-i5, Math.min(i3, i5));
                int i6 = this.mMaxFlingVelocity;
                int max2 = Math.max(-i6, Math.min(i4, i6));
                C0034 r12 = this.mViewFlinger;
                RecyclerView.this.setScrollState(2);
                r12.f384 = 0;
                r12.f381 = 0;
                Interpolator interpolator = r12.f382;
                Interpolator interpolator2 = sQuinticInterpolator;
                if (interpolator != interpolator2) {
                    r12.f382 = interpolator2;
                    r12.f380 = new OverScroller(RecyclerView.this.getContext(), sQuinticInterpolator);
                }
                r12.f380.fling(0, 0, max, max2, UNDEFINED_DURATION, Integer.MAX_VALUE, UNDEFINED_DURATION, Integer.MAX_VALUE);
                if (r12.f383) {
                    r12.f385 = true;
                } else {
                    RecyclerView.this.removeCallbacks(r12);
                    C0293.m4204((View) RecyclerView.this, (Runnable) r12);
                }
                return true;
            }
        }
        return false;
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    private void stopScrollersInternal() {
        C0034 r0 = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(r0);
        r0.f380.abortAnimation();
        IF ifR = this.mLayout;
        if (ifR != null) {
            ifR.m460();
        }
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            o.C0715.m5832(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            o.C0715.m5832(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            o.C0715.m5832(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            o.C0715.m5832(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            o.C0293.m4176(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C0293.m4176(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C0293.m4176(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C0293.m4176(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            this.mLeftGlow = C0030.m491(this);
            if (this.mClipToPadding) {
                this.mLeftGlow.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.mLeftGlow.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            this.mRightGlow = C0030.m491(this);
            if (this.mClipToPadding) {
                this.mRightGlow.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.mRightGlow.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            this.mTopGlow = C0030.m491(this);
            if (this.mClipToPadding) {
                this.mTopGlow.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.mTopGlow.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            this.mBottomGlow = C0030.m491(this);
            if (this.mClipToPadding) {
                this.mBottomGlow.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.mBottomGlow.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void setEdgeEffectFactory(C0030 r1) {
        if (r1 != null) {
            this.mEdgeEffectFactory = r1;
            invalidateGlows();
            return;
        }
        throw new NullPointerException();
    }

    public C0030 getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        boolean z2 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z2 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z2) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.m412(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.m453()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.m408()) {
                int i3 = (C0293.m4156(this.mLayout.f349) == 1) ^ (i == 2) ? 66 : 17;
                z = instance.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.m412(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (isPreferredNextFocus(view, view2, i)) {
                return view2;
            }
            return super.focusSearch(view, i);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            requestChildOnScreen(view2, (View) null);
            return view;
        }
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        int i3 = C0293.m4156(this.mLayout.f349) == 1 ? -1 : 1;
        if ((this.mTempRect.left < this.mTempRect2.left || this.mTempRect.right <= this.mTempRect2.left) && this.mTempRect.right < this.mTempRect2.right) {
            i2 = 1;
        } else {
            i2 = ((this.mTempRect.right > this.mTempRect2.right || this.mTempRect.left >= this.mTempRect2.right) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
        }
        if ((this.mTempRect.top < this.mTempRect2.top || this.mTempRect.bottom <= this.mTempRect2.top) && this.mTempRect.bottom < this.mTempRect2.bottom) {
            c = 1;
        } else if ((this.mTempRect.bottom <= this.mTempRect2.bottom && this.mTempRect.top < this.mTempRect2.bottom) || this.mTempRect.top <= this.mTempRect2.top) {
            c = 0;
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 <= 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 >= 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        StringBuilder sb = new StringBuilder("Invalid direction: ");
        sb.append(i);
        sb.append(exceptionLabel());
        throw new IllegalArgumentException(sb.toString());
    }

    public void requestChildFocus(View view, View view2) {
        IF ifR = this.mLayout;
        boolean z = true;
        if (!(ifR.f352 != null && ifR.f352.isRunning()) && !isComputingLayout()) {
            z = false;
        }
        if (!z && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0038) {
            C0038 r0 = (C0038) layoutParams;
            if (!r0.f390) {
                Rect rect = r0.f389;
                this.mTempRect.left -= rect.left;
                this.mTempRect.right += rect.right;
                this.mTempRect.top -= rect.top;
                this.mTempRect.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.m451(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.m451(this, view, rect, z, false);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r0 >= 30.0f) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.mLayoutOrScrollCounter = r0
            r1 = 1
            r4.mIsAttached = r1
            boolean r2 = r4.mFirstLayoutComplete
            if (r2 == 0) goto L_0x0015
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            r4.mFirstLayoutComplete = r2
            androidx.recyclerview.widget.RecyclerView$IF r2 = r4.mLayout
            if (r2 == 0) goto L_0x001e
            r2.f354 = r1
        L_0x001e:
            r4.mPostedAnimatorRunner = r0
            boolean r0 = ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L_0x006b
            java.lang.ThreadLocal<o.ǃɟ> r0 = o.C0903.f5749
            java.lang.Object r0 = r0.get()
            o.ǃɟ r0 = (o.C0903) r0
            r4.mGapWorker = r0
            o.ǃɟ r0 = r4.mGapWorker
            if (r0 != 0) goto L_0x0064
            o.ǃɟ r0 = new o.ǃɟ
            r0.<init>()
            r4.mGapWorker = r0
            android.view.Display r0 = o.C0293.m4214(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r0 = 1114636288(0x42700000, float:60.0)
        L_0x0054:
            o.ǃɟ r1 = r4.mGapWorker
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f5753 = r2
            java.lang.ThreadLocal<o.ǃɟ> r0 = o.C0903.f5749
            o.ǃɟ r1 = r4.mGapWorker
            r0.set(r1)
        L_0x0064:
            o.ǃɟ r0 = r4.mGapWorker
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f5752
            r0.add(r4)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C0903 r0;
        super.onDetachedFromWindow();
        C3246iF iFVar = this.mItemAnimator;
        if (iFVar != null) {
            iFVar.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        IF ifR = this.mLayout;
        if (ifR != null) {
            AUx aUx = this.mRecycler;
            ifR.f354 = false;
            ifR.m439(this, aUx);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        C1151.m7611();
        if (ALLOW_THREAD_GAP_WORK && (r0 = this.mGapWorker) != null) {
            r0.f5752.remove(this);
            this.mGapWorker = null;
        }
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    /* access modifiers changed from: package-private */
    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            StringBuilder sb = new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling");
            sb.append(exceptionLabel());
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(exceptionLabel());
        throw new IllegalStateException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                StringBuilder sb = new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(exceptionLabel());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(exceptionLabel());
            new IllegalStateException(sb2.toString());
        }
    }

    public void addOnItemTouchListener(C3241Aux aux) {
        this.mOnItemTouchListeners.add(aux);
    }

    public void removeOnItemTouchListener(C3241Aux aux) {
        this.mOnItemTouchListeners.remove(aux);
        if (this.mInterceptingOnItemTouchListener == aux) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        C3241Aux aux = this.mInterceptingOnItemTouchListener;
        if (aux != null) {
            aux.m374(motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        int i = 0;
        while (i < size) {
            C3241Aux aux = this.mOnItemTouchListeners.get(i);
            if (!aux.m375(motionEvent) || action == 3) {
                i++;
            } else {
                this.mInterceptingOnItemTouchListener = aux;
                return true;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        IF ifR = this.mLayout;
        if (ifR == null) {
            return false;
        }
        boolean r0 = ifR.m408();
        boolean r3 = this.mLayout.m453();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            if (r3) {
                r0 |= true;
            }
            startNestedScroll(r0 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i = x2 - this.mInitialTouchX;
                int i2 = y2 - this.mInitialTouchY;
                if (!r0 || Math.abs(i) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (r3 && Math.abs(i2) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (this.mScrollState == 1) {
            return true;
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L_0x01c6
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto L_0x000f
            goto L_0x01c6
        L_0x000f:
            boolean r0 = r17.dispatchToOnItemTouchListeners(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.cancelScroll()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$IF r0 = r6.mLayout
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.m408()
            androidx.recyclerview.widget.RecyclerView$IF r0 = r6.mLayout
            boolean r11 = r0.m453()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.mNestedOffsets
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.mNestedOffsets
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x019a
            if (r0 == r9) goto L_0x0158
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01bb
        L_0x0066:
            r17.onPointerUp(r18)
            goto L_0x01bb
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L_0x01bb
        L_0x0087:
            r17.cancelScroll()
            goto L_0x01bb
        L_0x008c:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x0095
            return r8
        L_0x0095:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto L_0x00de
            if (r10 == 0) goto L_0x00c2
            if (r0 <= 0) goto L_0x00b7
            int r2 = r6.mTouchSlop
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00be
        L_0x00b7:
            int r2 = r6.mTouchSlop
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00be:
            if (r0 == 0) goto L_0x00c2
            r2 = 1
            goto L_0x00c3
        L_0x00c2:
            r2 = 0
        L_0x00c3:
            if (r11 == 0) goto L_0x00d9
            if (r1 <= 0) goto L_0x00cf
            int r3 = r6.mTouchSlop
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00d6
        L_0x00cf:
            int r3 = r6.mTouchSlop
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00d6:
            if (r1 == 0) goto L_0x00d9
            r2 = 1
        L_0x00d9:
            if (r2 == 0) goto L_0x00de
            r6.setScrollState(r9)
        L_0x00de:
            r15 = r0
            r16 = r1
            int r0 = r6.mScrollState
            if (r0 != r9) goto L_0x01bb
            int[] r0 = r6.mReusableIntPair
            r0[r8] = r8
            r0[r9] = r8
            if (r10 == 0) goto L_0x00ef
            r1 = r15
            goto L_0x00f0
        L_0x00ef:
            r1 = 0
        L_0x00f0:
            if (r11 == 0) goto L_0x00f5
            r2 = r16
            goto L_0x00f6
        L_0x00f5:
            r2 = 0
        L_0x00f6:
            int[] r3 = r6.mReusableIntPair
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0125
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0125:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L_0x0137
            r1 = r15
            goto L_0x0138
        L_0x0137:
            r1 = 0
        L_0x0138:
            if (r11 == 0) goto L_0x013c
            r2 = r0
            goto L_0x013d
        L_0x013c:
            r2 = 0
        L_0x013d:
            boolean r1 = r6.scrollByInternal(r1, r2, r7)
            if (r1 == 0) goto L_0x014a
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x014a:
            o.ǃɟ r1 = r6.mGapWorker
            if (r1 == 0) goto L_0x01bb
            if (r15 != 0) goto L_0x0152
            if (r0 == 0) goto L_0x01bb
        L_0x0152:
            o.ǃɟ r1 = r6.mGapWorker
            r1.m6685((androidx.recyclerview.widget.RecyclerView) r6, (int) r15, (int) r0)
            goto L_0x01bb
        L_0x0158:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.mMaxFlingVelocity
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x0174
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x0175
        L_0x0174:
            r1 = 0
        L_0x0175:
            if (r11 == 0) goto L_0x0181
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0182
        L_0x0181:
            r2 = 0
        L_0x0182:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x018a
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0192
        L_0x018a:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L_0x0195
        L_0x0192:
            r6.setScrollState(r8)
        L_0x0195:
            r17.resetScroll()
            r8 = 1
            goto L_0x01bb
        L_0x019a:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r11 == 0) goto L_0x01b8
            r10 = r10 | 2
        L_0x01b8:
            r6.startNestedScroll(r10, r8)
        L_0x01bb:
            if (r8 != 0) goto L_0x01c2
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L_0x01c2:
            r12.recycle()
            return r9
        L_0x01c6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.mLayout.m453() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.m408()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.m453()) {
                        f2 = -axisValue;
                    } else if (this.mLayout.m408()) {
                        f = axisValue;
                        f2 = 0.0f;
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        IF ifR = this.mLayout;
        if (ifR == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (ifR.m405()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.f349.defaultOnMeasure(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.mAdapter != null) {
                if (this.mState.f370 == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.m447(i, i2);
                this.mState.f372 = true;
                dispatchLayoutStep2();
                this.mLayout.m458(i, i2);
                if (this.mLayout.m459()) {
                    this.mLayout.m447(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f372 = true;
                    dispatchLayoutStep2();
                    this.mLayout.m458(i, i2);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.f349.defaultOnMeasure(i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                if (this.mState.f379) {
                    this.mState.f378 = true;
                } else {
                    this.mAdapterHelper.m6652();
                    this.mState.f378 = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f379) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0035 r0 = this.mAdapter;
            if (r0 != null) {
                this.mState.f366 = r0.getItemCount();
            } else {
                this.mState.f366 = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.f349.defaultOnMeasure(i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f378 = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(IF.m380(i, getPaddingLeft() + getPaddingRight(), C0293.m4222(this)), IF.m380(i2, getPaddingTop() + getPaddingBottom(), C0293.m4182(this)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    public void setItemAnimator(C3246iF iFVar) {
        C3246iF iFVar2 = this.mItemAnimator;
        if (iFVar2 != null) {
            iFVar2.endAnimations();
            this.mItemAnimator.setListener((C3246iF.C0028) null);
        }
        this.mItemAnimator = iFVar;
        C3246iF iFVar3 = this.mItemAnimator;
        if (iFVar3 != null) {
            iFVar3.setListener(this.mItemAnimatorListener);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onExitLayoutOrScroll(boolean z) {
        this.mLayoutOrScrollCounter--;
        if (this.mLayoutOrScrollCounter <= 0) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0523.m5079(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int r3 = accessibilityEvent != null ? C0523.m5080(accessibilityEvent) : 0;
        if (r3 == 0) {
            r3 = 0;
        }
        this.mEatenAccessibilityChangeFlags = r3 | this.mEatenAccessibilityChangeFlags;
        return true;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public C3246iF getItemAnimator() {
        return this.mItemAnimator;
    }

    /* access modifiers changed from: package-private */
    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C0293.m4204((View) this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.m419();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z = false;
        if (this.mDataSetHasChangedAfterLayout) {
            C0896 r0 = this.mAdapterHelper;
            r0.m6653((List<C0896.C0897>) r0.f5728);
            r0.m6653((List<C0896.C0897>) r0.f5733);
            r0.f5731 = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.m423();
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.m6658();
        } else {
            this.mAdapterHelper.m6652();
        }
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f367 = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z2 || this.mLayout.f340) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.hasStableIds());
        C0033 r3 = this.mState;
        if (r3.f367 && z2 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z = true;
        }
        r3.f379 = z;
    }

    /* access modifiers changed from: package-private */
    public void dispatchLayout() {
        if (this.mAdapter != null && this.mLayout != null) {
            C0033 r0 = this.mState;
            boolean z = false;
            r0.f372 = false;
            if (r0.f370 == 1) {
                dispatchLayoutStep1();
                this.mLayout.m447(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
                dispatchLayoutStep2();
            } else {
                C0896 r02 = this.mAdapterHelper;
                if (!r02.f5733.isEmpty() && !r02.f5728.isEmpty()) {
                    z = true;
                }
                if (!z && this.mLayout.f351 == getWidth() && this.mLayout.f341 == getHeight()) {
                    this.mLayout.m447(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
                } else {
                    this.mLayout.m447(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
                    dispatchLayoutStep2();
                }
            }
            dispatchLayoutStep3();
        }
    }

    private void saveFocusInfo() {
        int i;
        con con2 = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            con2 = findContainingViewHolder(focusedChild);
        }
        if (con2 == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f373 = this.mAdapter.hasStableIds() ? con2.getItemId() : -1;
        C0033 r0 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            i = -1;
        } else if (con2.isRemoved()) {
            i = con2.mOldPosition;
        } else {
            i = con2.getAdapterPosition();
        }
        r0.f369 = i;
        this.mState.f371 = getDeepestFocusedViewWithId(con2.itemView);
    }

    private void resetFocusInfo() {
        C0033 r0 = this.mState;
        r0.f373 = -1;
        r0.f369 = -1;
        r0.f371 = -1;
    }

    private View findNextViewToFocus() {
        con findViewHolderForAdapterPosition;
        int i = this.mState.f369 != -1 ? this.mState.f369 : 0;
        C0033 r1 = this.mState;
        int i2 = r1.f378 ? r1.f375 - r1.f374 : r1.f366;
        int i3 = i;
        while (i3 < i2) {
            con findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            } else {
                i3++;
            }
        }
        int min = Math.min(i2, i);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void recoverFocusFromState() {
        /*
            r6 = this;
            boolean r0 = r6.mPreserveFocusAfterLayout
            if (r0 == 0) goto L_0x00cc
            androidx.recyclerview.widget.RecyclerView$ɩ r0 = r6.mAdapter
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r6.hasFocus()
            if (r0 == 0) goto L_0x00cc
            int r0 = r6.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L_0x00cc
            int r0 = r6.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x0026
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0026
            goto L_0x00cc
        L_0x0026:
            boolean r0 = r6.isFocused()
            if (r0 != 0) goto L_0x0060
            android.view.View r0 = r6.getFocusedChild()
            boolean r1 = IGNORE_DETACHED_FOCUSED_CHILD
            if (r1 == 0) goto L_0x0055
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0040
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L_0x0055
        L_0x0040:
            o.ǂ r0 = r6.mChildHelper
            o.ǂ$ǃ r1 = r0.f5664
            int r1 = r1.m6559()
            java.util.List<android.view.View> r0 = r0.f5662
            int r0 = r0.size()
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x0060
            r6.requestFocus()
            return
        L_0x0055:
            o.ǂ r1 = r6.mChildHelper
            java.util.List<android.view.View> r1 = r1.f5662
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0060
            return
        L_0x0060:
            androidx.recyclerview.widget.RecyclerView$ȷ r0 = r6.mState
            long r0 = r0.f373
            r2 = -1
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x007c
            androidx.recyclerview.widget.RecyclerView$ɩ r0 = r6.mAdapter
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L_0x007c
            androidx.recyclerview.widget.RecyclerView$ȷ r0 = r6.mState
            long r0 = r0.f373
            androidx.recyclerview.widget.RecyclerView$con r0 = r6.findViewHolderForItemId(r0)
            goto L_0x007d
        L_0x007c:
            r0 = r4
        L_0x007d:
            if (r0 == 0) goto L_0x0097
            o.ǂ r1 = r6.mChildHelper
            android.view.View r5 = r0.itemView
            java.util.List<android.view.View> r1 = r1.f5662
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto L_0x0097
            android.view.View r1 = r0.itemView
            boolean r1 = r1.hasFocusable()
            if (r1 != 0) goto L_0x0094
            goto L_0x0097
        L_0x0094:
            android.view.View r4 = r0.itemView
            goto L_0x00ac
        L_0x0097:
            o.ǂ r0 = r6.mChildHelper
            o.ǂ$ǃ r1 = r0.f5664
            int r1 = r1.m6559()
            java.util.List<android.view.View> r0 = r0.f5662
            int r0 = r0.size()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x00ac
            android.view.View r4 = r6.findNextViewToFocus()
        L_0x00ac:
            if (r4 == 0) goto L_0x00cc
            androidx.recyclerview.widget.RecyclerView$ȷ r0 = r6.mState
            int r0 = r0.f371
            long r0 = (long) r0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00c8
            androidx.recyclerview.widget.RecyclerView$ȷ r0 = r6.mState
            int r0 = r0.f371
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x00c8
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r0 = r4
        L_0x00c9:
            r0.requestFocus()
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.recoverFocusFromState():void");
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* access modifiers changed from: package-private */
    public final void fillRemainingScrollValues(C0033 r2) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f380;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
    }

    private void dispatchLayoutStep1() {
        this.mState.m498(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f372 = false;
        startInterceptRequestLayout();
        C1151 r0 = this.mViewInfoStore;
        r0.f6689.clear();
        r0.f6688.m6117();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C0033 r02 = this.mState;
        r02.f376 = r02.f367 && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        C0033 r03 = this.mState;
        r03.f378 = r03.f379;
        this.mState.f366 = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f367) {
            C0878 r04 = this.mChildHelper;
            int r3 = r04.f5664.m6559() - r04.f5662.size();
            for (int i = 0; i < r3; i++) {
                C0878 r4 = this.mChildHelper;
                con childViewHolderInt = getChildViewHolderInt(r4.f5664.m6560(r4.m6544(i)));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.m7614(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, C3246iF.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f376 && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f6688.m6116(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f379) {
            saveOldPositions();
            boolean z = this.mState.f377;
            C0033 r42 = this.mState;
            r42.f377 = false;
            this.mLayout.m429(this.mRecycler, r42);
            this.mState.f377 = z;
            int i2 = 0;
            while (true) {
                C0878 r43 = this.mChildHelper;
                if (i2 >= r43.f5664.m6559() - r43.f5662.size()) {
                    break;
                }
                C0878 r44 = this.mChildHelper;
                con childViewHolderInt2 = getChildViewHolderInt(r44.f5664.m6560(r44.m6544(i2)));
                if (!childViewHolderInt2.shouldIgnore()) {
                    C1151.C1152 r5 = this.mViewInfoStore.f6689.get(childViewHolderInt2);
                    if (!((r5 == null || (r5.f6693 & 4) == 0) ? false : true)) {
                        int buildAdapterChangeFlagsForAnimations = C3246iF.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                        boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                        if (!hasAnyOfTheFlags) {
                            buildAdapterChangeFlagsForAnimations |= C0872.f5653;
                        }
                        C3246iF.C0029 recordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, buildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                        if (hasAnyOfTheFlags) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, recordPreLayoutInformation);
                        } else {
                            C1151 r6 = this.mViewInfoStore;
                            C1151.C1152 r7 = r6.f6689.get(childViewHolderInt2);
                            if (r7 == null) {
                                r7 = C1151.C1152.m7623();
                                r6.f6689.put(childViewHolderInt2, r7);
                            }
                            r7.f6693 |= 2;
                            r7.f6692 = recordPreLayoutInformation;
                        }
                    }
                }
                i2++;
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f370 = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m498(6);
        this.mAdapterHelper.m6652();
        this.mState.f366 = this.mAdapter.getItemCount();
        C0033 r0 = this.mState;
        r0.f374 = 0;
        r0.f378 = false;
        this.mLayout.m429(this.mRecycler, r0);
        C0033 r02 = this.mState;
        r02.f377 = false;
        this.mPendingSavedState = null;
        r02.f367 = r02.f367 && this.mItemAnimator != null;
        this.mState.f370 = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.m498(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0033 r0 = this.mState;
        r0.f370 = 1;
        if (r0.f367) {
            C0878 r02 = this.mChildHelper;
            for (int r4 = (r02.f5664.m6559() - r02.f5662.size()) - 1; r4 >= 0; r4--) {
                C0878 r6 = this.mChildHelper;
                con childViewHolderInt = getChildViewHolderInt(r6.f5664.m6560(r6.m6544(r4)));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    C3246iF.C0029 recordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    con r5 = this.mViewInfoStore.f6688.m6119(changedHolderKey, null);
                    if (r5 != null && !r5.shouldIgnore()) {
                        C1151.C1152 r10 = this.mViewInfoStore.f6689.get(r5);
                        boolean z = (r10 == null || (r10.f6693 & 1) == 0) ? false : true;
                        C1151.C1152 r102 = this.mViewInfoStore.f6689.get(childViewHolderInt);
                        boolean z2 = (r102 == null || (r102.f6693 & 1) == 0) ? false : true;
                        if (!z || r5 != childViewHolderInt) {
                            C3246iF.C0029 r103 = this.mViewInfoStore.m7613(r5, 4);
                            this.mViewInfoStore.m7616(childViewHolderInt, recordPostLayoutInformation);
                            C3246iF.C0029 r11 = this.mViewInfoStore.m7613(childViewHolderInt, 8);
                            if (r103 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, r5);
                            } else {
                                animateChange(r5, childViewHolderInt, r103, r11, z, z2);
                            }
                        }
                    }
                    this.mViewInfoStore.m7616(childViewHolderInt, recordPostLayoutInformation);
                }
            }
            C1151 r42 = this.mViewInfoStore;
            C1151.Cif ifVar = this.mViewInfoProcessCallback;
            for (int size = r42.f6689.size() - 1; size >= 0; size--) {
                con con2 = (con) r42.f6689.f5784[size << 1];
                C1151.C1152 r9 = r42.f6689.m6721(size);
                if ((r9.f6693 & 3) == 3) {
                    ifVar.m7619(con2);
                } else if ((r9.f6693 & 1) != 0) {
                    if (r9.f6692 == null) {
                        ifVar.m7619(con2);
                    } else {
                        ifVar.m7617(con2, r9.f6692, r9.f6691);
                    }
                } else if ((r9.f6693 & 14) == 14) {
                    ifVar.m7620(con2, r9.f6692, r9.f6691);
                } else if ((r9.f6693 & 12) == 12) {
                    ifVar.m7618(con2, r9.f6692, r9.f6691);
                } else if ((r9.f6693 & 4) != 0) {
                    ifVar.m7617(con2, r9.f6692, (C3246iF.C0029) null);
                } else if ((r9.f6693 & 8) != 0) {
                    ifVar.m7620(con2, r9.f6692, r9.f6691);
                }
                C1151.C1152.m7622(r9);
            }
        }
        this.mLayout.m428(this.mRecycler);
        C0033 r03 = this.mState;
        r03.f375 = r03.f366;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        C0033 r04 = this.mState;
        r04.f367 = false;
        r04.f379 = false;
        this.mLayout.f340 = false;
        if (this.mRecycler.f326 != null) {
            this.mRecycler.f326.clear();
        }
        if (this.mLayout.f342) {
            IF ifR = this.mLayout;
            ifR.f339 = 0;
            ifR.f342 = false;
            this.mRecycler.m367();
        }
        this.mLayout.m438(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        C1151 r05 = this.mViewInfoStore;
        r05.f6689.clear();
        r05.f6688.m6117();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private void handleMissingPreInfoForChangeError(long j, con con2, con con3) {
        C0878 r9 = this.mChildHelper;
        int r0 = r9.f5664.m6559() - r9.f5662.size();
        int i = 0;
        while (i < r0) {
            C0878 r1 = this.mChildHelper;
            con childViewHolderInt = getChildViewHolderInt(r1.f5664.m6560(r1.m6544(i)));
            if (childViewHolderInt == con2 || getChangedHolderKey(childViewHolderInt) != j) {
                i++;
            } else {
                C0035 r6 = this.mAdapter;
                if (r6 == null || !r6.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(con2);
                    sb.append(exceptionLabel());
                    throw new IllegalStateException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(con2);
                sb2.append(exceptionLabel());
                throw new IllegalStateException(sb2.toString());
            }
        }
        exceptionLabel();
    }

    /* access modifiers changed from: package-private */
    public void recordAnimationInfoIfBouncedHiddenView(con con2, C3246iF.C0029 r5) {
        con2.setFlags(0, 8192);
        if (this.mState.f376 && con2.isUpdated() && !con2.isRemoved() && !con2.shouldIgnore()) {
            this.mViewInfoStore.f6688.m6116(getChangedHolderKey(con2), con2);
        }
        this.mViewInfoStore.m7614(con2, r5);
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        C0878 r0 = this.mChildHelper;
        int r1 = r0.f5664.m6559() - r0.f5662.size();
        if (r1 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = UNDEFINED_DURATION;
        for (int i3 = 0; i3 < r1; i3++) {
            C0878 r6 = this.mChildHelper;
            con childViewHolderInt = getChildViewHolderInt(r6.f5664.m6560(r6.m6544(i3)));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        con childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                sb.append(exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    /* access modifiers changed from: package-private */
    public long getChangedHolderKey(con con2) {
        return this.mAdapter.hasStableIds() ? con2.getItemId() : (long) con2.mPosition;
    }

    /* access modifiers changed from: package-private */
    public void animateAppearance(con con2, C3246iF.C0029 r3, C3246iF.C0029 r4) {
        con2.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(con2, r3, r4)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void animateDisappearance(con con2, C3246iF.C0029 r3, C3246iF.C0029 r4) {
        addAnimatingView(con2);
        con2.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(con2, r3, r4)) {
            postAnimationRunner();
        }
    }

    private void animateChange(con con2, con con3, C3246iF.C0029 r4, C3246iF.C0029 r5, boolean z, boolean z2) {
        con2.setIsRecyclable(false);
        if (z) {
            addAnimatingView(con2);
        }
        if (con2 != con3) {
            if (z2) {
                addAnimatingView(con3);
            }
            con2.mShadowedHolder = con3;
            addAnimatingView(con2);
            this.mRecycler.m368(con2);
            con3.setIsRecyclable(false);
            con3.mShadowingHolder = con2;
        }
        if (this.mItemAnimator.animateChange(con2, con3, r4, r5)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1679.m9555(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C1679.m9554();
        this.mFirstLayoutComplete = true;
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void markItemDecorInsetsDirty() {
        int r0 = this.mChildHelper.f5664.m6559();
        for (int i = 0; i < r0; i++) {
            ((C0038) this.mChildHelper.f5664.m6560(i).getLayoutParams()).f390 = true;
        }
        AUx aUx = this.mRecycler;
        int size = aUx.f328.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0038 r4 = (C0038) aUx.f328.get(i2).itemView.getLayoutParams();
            if (r4 != null) {
                r4.f390 = true;
            }
        }
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 == null || edgeEffect7.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 = z3 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.mItemAnimator != null && this.mItemDecorations.size() > 0 && this.mItemAnimator.isRunning()) {
            z2 = true;
        }
        if (z2) {
            C0293.m4176(this);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0038) && this.mLayout.m406((C0038) layoutParams);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        IF ifR = this.mLayout;
        if (ifR != null) {
            return ifR.m433();
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IF ifR = this.mLayout;
        if (ifR != null) {
            return ifR.m396(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IF ifR = this.mLayout;
        if (ifR != null) {
            return ifR.m446(layoutParams);
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    public boolean isAnimating() {
        C3246iF iFVar = this.mItemAnimator;
        return iFVar != null && iFVar.isRunning();
    }

    /* access modifiers changed from: package-private */
    public void saveOldPositions() {
        int r0 = this.mChildHelper.f5664.m6559();
        for (int i = 0; i < r0; i++) {
            con childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f5664.m6560(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void clearOldPositions() {
        int r0 = this.mChildHelper.f5664.m6559();
        for (int i = 0; i < r0; i++) {
            con childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f5664.m6560(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        AUx aUx = this.mRecycler;
        int size = aUx.f328.size();
        for (int i2 = 0; i2 < size; i2++) {
            aUx.f328.get(i2).clearOldPosition();
        }
        int size2 = aUx.f325.size();
        for (int i3 = 0; i3 < size2; i3++) {
            aUx.f325.get(i3).clearOldPosition();
        }
        if (aUx.f326 != null) {
            int size3 = aUx.f326.size();
            for (int i4 = 0; i4 < size3; i4++) {
                aUx.f326.get(i4).clearOldPosition();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int r0 = this.mChildHelper.f5664.m6559();
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i9 = 0; i9 < r0; i9++) {
            con childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f5664.m6560(i9));
            if (childViewHolderInt != null && childViewHolderInt.mPosition >= i5 && childViewHolderInt.mPosition <= i4) {
                if (childViewHolderInt.mPosition == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i3, false);
                }
                this.mState.f377 = true;
            }
        }
        AUx aUx = this.mRecycler;
        if (i < i2) {
            i8 = i;
            i7 = i2;
            i6 = -1;
        } else {
            i7 = i;
            i8 = i2;
            i6 = 1;
        }
        int size = aUx.f328.size();
        for (int i10 = 0; i10 < size; i10++) {
            con con2 = aUx.f328.get(i10);
            if (con2 != null && con2.mPosition >= i8 && con2.mPosition <= i7) {
                if (con2.mPosition == i) {
                    con2.offsetPosition(i2 - i, false);
                } else {
                    con2.offsetPosition(i6, false);
                }
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForInsert(int i, int i2) {
        int r0 = this.mChildHelper.f5664.m6559();
        for (int i3 = 0; i3 < r0; i3++) {
            con childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f5664.m6560(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f377 = true;
            }
        }
        AUx aUx = this.mRecycler;
        int size = aUx.f328.size();
        for (int i4 = 0; i4 < size; i4++) {
            con con2 = aUx.f328.get(i4);
            if (con2 != null && con2.mPosition >= i) {
                con2.offsetPosition(i2, true);
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int r1 = this.mChildHelper.f5664.m6559();
        for (int i4 = 0; i4 < r1; i4++) {
            con childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f5664.m6560(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                if (childViewHolderInt.mPosition >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f377 = true;
                } else if (childViewHolderInt.mPosition >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f377 = true;
                }
            }
        }
        AUx aUx = this.mRecycler;
        for (int size = aUx.f328.size() - 1; size >= 0; size--) {
            con con2 = aUx.f328.get(size);
            if (con2 != null) {
                if (con2.mPosition >= i3) {
                    con2.offsetPosition(-i2, z);
                } else if (con2.mPosition >= i) {
                    con2.addFlags(8);
                    aUx.m370(aUx.f328.get(size), true);
                    aUx.f328.remove(size);
                }
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int r0 = this.mChildHelper.f5664.m6559();
        int i4 = i2 + i;
        for (int i5 = 0; i5 < r0; i5++) {
            View r4 = this.mChildHelper.f5664.m6560(i5);
            con childViewHolderInt = getChildViewHolderInt(r4);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i && childViewHolderInt.mPosition < i4) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((C0038) r4.getLayoutParams()).f390 = true;
            }
        }
        AUx aUx = this.mRecycler;
        for (int size = aUx.f328.size() - 1; size >= 0; size--) {
            con con2 = aUx.f328.get(size);
            if (con2 != null && (i3 = con2.mPosition) >= i && i3 < i4) {
                con2.addFlags(2);
                aUx.m370(aUx.f328.get(size), true);
                aUx.f328.remove(size);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean canReuseUpdatedViewHolder(con con2) {
        C3246iF iFVar = this.mItemAnimator;
        return iFVar == null || iFVar.canReuseUpdatedViewHolder(con2, con2.getUnmodifiedPayloads());
    }

    /* access modifiers changed from: package-private */
    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    /* access modifiers changed from: package-private */
    public void markKnownViewsInvalid() {
        int r0 = this.mChildHelper.f5664.m6559();
        for (int i = 0; i < r0; i++) {
            con childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f5664.m6560(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        AUx aUx = this.mRecycler;
        int size = aUx.f328.size();
        for (int i2 = 0; i2 < size; i2++) {
            con con2 = aUx.f328.get(i2);
            if (con2 != null) {
                con2.addFlags(6);
                con2.addChangePayload((Object) null);
            }
        }
        if (RecyclerView.this.mAdapter == null || !RecyclerView.this.mAdapter.hasStableIds()) {
            aUx.m363();
        }
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            IF ifR = this.mLayout;
            if (ifR != null) {
                ifR.m440("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public con getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public con findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public static con getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C0038) view.getLayoutParams()).f388;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public int getChildAdapterPosition(View view) {
        con childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAdapterPosition();
        }
        return -1;
    }

    public int getChildLayoutPosition(View view) {
        con childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    public long getChildItemId(View view) {
        con childViewHolderInt;
        C0035 r0 = this.mAdapter;
        if (r0 == null || !r0.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.getItemId();
    }

    @Deprecated
    public con findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public con findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public con findViewHolderForAdapterPosition(int i) {
        con con2 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int r0 = this.mChildHelper.f5664.m6559();
        for (int i2 = 0; i2 < r0; i2++) {
            con childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f5664.m6560(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionFor(childViewHolderInt) == i) {
                C0878 r1 = this.mChildHelper;
                if (!r1.f5662.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                con2 = childViewHolderInt;
            }
        }
        return con2;
    }

    /* access modifiers changed from: package-private */
    public con findViewHolderForPosition(int i, boolean z) {
        int r0 = this.mChildHelper.f5664.m6559();
        con con2 = null;
        for (int i2 = 0; i2 < r0; i2++) {
            con childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f5664.m6560(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                }
                C0878 r1 = this.mChildHelper;
                if (!r1.f5662.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                con2 = childViewHolderInt;
            }
        }
        return con2;
    }

    public con findViewHolderForItemId(long j) {
        C0035 r0 = this.mAdapter;
        con con2 = null;
        if (r0 != null && r0.hasStableIds()) {
            int r02 = this.mChildHelper.f5664.m6559();
            for (int i = 0; i < r02; i++) {
                con childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f5664.m6560(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    C0878 r1 = this.mChildHelper;
                    if (!r1.f5662.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    con2 = childViewHolderInt;
                }
            }
        }
        return con2;
    }

    public View findChildViewUnder(float f, float f2) {
        C0878 r0 = this.mChildHelper;
        for (int r1 = (r0.f5664.m6559() - r0.f5662.size()) - 1; r1 >= 0; r1--) {
            C0878 r02 = this.mChildHelper;
            View r03 = r02.f5664.m6560(r02.m6544(r1));
            float translationX = r03.getTranslationX();
            float translationY = r03.getTranslationY();
            if (f >= ((float) r03.getLeft()) + translationX && f <= ((float) r03.getRight()) + translationX && f2 >= ((float) r03.getTop()) + translationY && f2 <= ((float) r03.getBottom()) + translationY) {
                return r03;
            }
        }
        return null;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void offsetChildrenVertical(int i) {
        C0878 r0 = this.mChildHelper;
        int r1 = r0.f5664.m6559() - r0.f5662.size();
        for (int i2 = 0; i2 < r1; i2++) {
            C0878 r2 = this.mChildHelper;
            r2.f5664.m6560(r2.m6544(i2)).offsetTopAndBottom(i);
        }
    }

    public void offsetChildrenHorizontal(int i) {
        C0878 r0 = this.mChildHelper;
        int r1 = r0.f5664.m6559() - r0.f5662.size();
        for (int i2 = 0; i2 < r1; i2++) {
            C0878 r2 = this.mChildHelper;
            r2.f5664.m6560(r2.m6544(i2)).offsetLeftAndRight(i);
        }
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C0038 r0 = (C0038) view.getLayoutParams();
        Rect rect2 = r0.f389;
        rect.set((view.getLeft() - rect2.left) - r0.leftMargin, (view.getTop() - rect2.top) - r0.topMargin, view.getRight() + rect2.right + r0.rightMargin, view.getBottom() + rect2.bottom + r0.bottomMargin);
    }

    /* access modifiers changed from: package-private */
    public Rect getItemDecorInsetsForChild(View view) {
        C0038 r0 = (C0038) view.getLayoutParams();
        if (!r0.f390) {
            return r0.f389;
        }
        if (this.mState.f378 && (r0.f388.isUpdated() || r0.f388.isInvalid())) {
            return r0.f389;
        }
        Rect rect = r0.f389;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            rect.left += this.mTempRect.left;
            rect.top += this.mTempRect.top;
            rect.right += this.mTempRect.right;
            rect.bottom += this.mTempRect.bottom;
        }
        r0.f390 = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        C3243aUx aux = this.mScrollListener;
        if (aux != null) {
            aux.m474(this, i, i2);
        }
        List<C3243aUx> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).m474(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrollStateChanged(int i) {
        IF ifR = this.mLayout;
        if (ifR != null) {
            ifR.m457(i);
        }
        onScrollStateChanged(i);
        C3243aUx aux = this.mScrollListener;
        if (aux != null) {
            aux.m473(this, i);
        }
        List<C3243aUx> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).m473(this, i);
            }
        }
    }

    public boolean hasPendingAdapterUpdates() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            return this.mAdapterHelper.f5728.size() > 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ɨ  reason: contains not printable characters */
    class C0034 implements Runnable {

        /* renamed from: ı  reason: contains not printable characters */
        OverScroller f380;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f381;

        /* renamed from: ɩ  reason: contains not printable characters */
        Interpolator f382 = RecyclerView.sQuinticInterpolator;

        /* renamed from: Ι  reason: contains not printable characters */
        boolean f383 = false;

        /* renamed from: ι  reason: contains not printable characters */
        int f384;

        /* renamed from: і  reason: contains not printable characters */
        boolean f385 = false;

        C0034() {
            this.f380 = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
        }

        public void run() {
            int i;
            int i2;
            if (RecyclerView.this.mLayout == null) {
                RecyclerView.this.removeCallbacks(this);
                this.f380.abortAnimation();
                return;
            }
            this.f385 = false;
            this.f383 = true;
            RecyclerView.this.consumePendingUpdateOperations();
            OverScroller overScroller = this.f380;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f381;
                int i4 = currY - this.f384;
                this.f381 = currX;
                this.f384 = currY;
                RecyclerView.this.mReusableIntPair[0] = 0;
                RecyclerView.this.mReusableIntPair[1] = 0;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.dispatchNestedPreScroll(i3, i4, recyclerView.mReusableIntPair, (int[]) null, 1)) {
                    i3 -= RecyclerView.this.mReusableIntPair[0];
                    i4 -= RecyclerView.this.mReusableIntPair[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                if (RecyclerView.this.mAdapter != null) {
                    RecyclerView.this.mReusableIntPair[0] = 0;
                    RecyclerView.this.mReusableIntPair[1] = 0;
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.scrollStep(i3, i4, recyclerView2.mReusableIntPair);
                    i2 = RecyclerView.this.mReusableIntPair[0];
                    i = RecyclerView.this.mReusableIntPair[1];
                    i3 -= i2;
                    i4 -= i;
                    C3240AuX auX = RecyclerView.this.mLayout.f352;
                    if (auX != null && !auX.isPendingInitialRun() && auX.isRunning()) {
                        C0033 r9 = RecyclerView.this.mState;
                        int i5 = r9.f378 ? r9.f375 - r9.f374 : r9.f366;
                        if (i5 == 0) {
                            auX.stop();
                        } else {
                            if (auX.getTargetPosition() >= i5) {
                                auX.setTargetPosition(i5 - 1);
                            }
                            auX.onAnimation(i2, i);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView.this.mReusableIntPair[0] = 0;
                RecyclerView.this.mReusableIntPair[1] = 0;
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.dispatchNestedScroll(i2, i, i3, i4, (int[]) null, 1, recyclerView3.mReusableIntPair);
                int i6 = i3 - RecyclerView.this.mReusableIntPair[0];
                int i7 = i4 - RecyclerView.this.mReusableIntPair[1];
                if (!(i2 == 0 && i == 0)) {
                    RecyclerView.this.dispatchOnScrolled(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                C3240AuX auX2 = RecyclerView.this.mLayout.f352;
                if ((auX2 != null && auX2.isPendingInitialRun()) || !z) {
                    if (this.f383) {
                        this.f385 = true;
                    } else {
                        RecyclerView.this.removeCallbacks(this);
                        C0293.m4204((View) RecyclerView.this, (Runnable) this);
                    }
                    if (RecyclerView.this.mGapWorker != null) {
                        RecyclerView.this.mGapWorker.m6685(RecyclerView.this, i2, i);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i8, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        C0903.If ifR = RecyclerView.this.mPrefetchRegistry;
                        if (ifR.f5755 != null) {
                            Arrays.fill(ifR.f5755, -1);
                        }
                        ifR.f5758 = 0;
                    }
                }
            }
            C3240AuX auX3 = RecyclerView.this.mLayout.f352;
            if (auX3 != null && auX3.isPendingInitialRun()) {
                auX3.onAnimation(0, 0);
            }
            this.f383 = false;
            if (this.f385) {
                RecyclerView.this.removeCallbacks(this);
                C0293.m4204((View) RecyclerView.this, (Runnable) this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }

        /* renamed from: ι  reason: contains not printable characters */
        private void m500() {
            if (this.f383) {
                this.f385 = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            C0293.m4204((View) RecyclerView.this, (Runnable) this);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m501(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m499(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f382 != interpolator) {
                this.f382 = interpolator;
                this.f380 = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f384 = 0;
            this.f381 = 0;
            RecyclerView.this.setScrollState(2);
            this.f380.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f380.computeScrollOffset();
            }
            m500();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private int m499(int i, int i2) {
            int i3;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt(0.0d);
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i4 = width / 2;
            float f = (float) width;
            float f2 = (float) i4;
            float sin = f2 + (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2);
            if (sqrt > 0) {
                i3 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i3 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i3, RecyclerView.MAX_SCROLL_DURATION);
        }
    }

    /* access modifiers changed from: package-private */
    public void repositionShadowingViews() {
        C0878 r0 = this.mChildHelper;
        int r1 = r0.f5664.m6559() - r0.f5662.size();
        for (int i = 0; i < r1; i++) {
            C0878 r2 = this.mChildHelper;
            View r22 = r2.f5664.m6560(r2.m6544(i));
            con childViewHolder = getChildViewHolder(r22);
            if (!(childViewHolder == null || childViewHolder.mShadowingHolder == null)) {
                View view = childViewHolder.mShadowingHolder.itemView;
                int left = r22.getLeft();
                int top = r22.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$auX  reason: case insensitive filesystem */
    class C3244auX extends C0032 {
        C3244auX() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m479() {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            boolean z = true;
            RecyclerView.this.mState.f377 = true;
            RecyclerView.this.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.f5728.size() <= 0) {
                z = false;
            }
            if (!z) {
                RecyclerView.this.requestLayout();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
            if (r0.f5728.size() == 1) goto L_0x0026;
         */
        /* renamed from: ɩ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m478(int r5, int r6, java.lang.Object r7) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                o.ǃǀ r0 = r0.mAdapterHelper
                r1 = 1
                if (r6 <= 0) goto L_0x0025
                java.util.ArrayList<o.ǃǀ$ǃ> r2 = r0.f5728
                r3 = 4
                o.ǃǀ$ǃ r5 = r0.m6656(r3, r5, r6, r7)
                r2.add(r5)
                int r5 = r0.f5731
                r5 = r5 | r3
                r0.f5731 = r5
                java.util.ArrayList<o.ǃǀ$ǃ> r5 = r0.f5728
                int r5 = r5.size()
                if (r5 != r1) goto L_0x0025
                goto L_0x0026
            L_0x0025:
                r1 = 0
            L_0x0026:
                if (r1 == 0) goto L_0x002b
                r4.m475()
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C3244auX.m478(int, int, java.lang.Object):void");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m480(int i) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            C0896 r0 = RecyclerView.this.mAdapterHelper;
            boolean z = true;
            r0.f5728.add(r0.m6656(1, i, 1, (Object) null));
            r0.f5731 |= 1;
            if (r0.f5728.size() != 1) {
                z = false;
            }
            if (z) {
                m475();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
            if (r0.f5728.size() == 1) goto L_0x0026;
         */
        /* renamed from: ı  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m476(int r6, int r7) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                o.ǃǀ r0 = r0.mAdapterHelper
                r2 = 1
                if (r7 <= 0) goto L_0x0025
                java.util.ArrayList<o.ǃǀ$ǃ> r3 = r0.f5728
                r4 = 2
                o.ǃǀ$ǃ r6 = r0.m6656(r4, r6, r7, r1)
                r3.add(r6)
                int r6 = r0.f5731
                r6 = r6 | r4
                r0.f5731 = r6
                java.util.ArrayList<o.ǃǀ$ǃ> r6 = r0.f5728
                int r6 = r6.size()
                if (r6 != r2) goto L_0x0025
                goto L_0x0026
            L_0x0025:
                r2 = 0
            L_0x0026:
                if (r2 == 0) goto L_0x002b
                r5.m475()
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C3244auX.m476(int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
            if (r0.f5728.size() == 1) goto L_0x0027;
         */
        /* renamed from: ɩ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m477(int r6, int r7) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                o.ǃǀ r0 = r0.mAdapterHelper
                r2 = 1
                if (r6 == r7) goto L_0x0026
                java.util.ArrayList<o.ǃǀ$ǃ> r3 = r0.f5728
                r4 = 8
                o.ǃǀ$ǃ r6 = r0.m6656(r4, r6, r7, r1)
                r3.add(r6)
                int r6 = r0.f5731
                r6 = r6 | r4
                r0.f5731 = r6
                java.util.ArrayList<o.ǃǀ$ǃ> r6 = r0.f5728
                int r6 = r6.size()
                if (r6 != r2) goto L_0x0026
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                if (r2 == 0) goto L_0x002c
                r5.m475()
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C3244auX.m477(int, int):void");
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private void m475() {
            if (!RecyclerView.POST_UPDATES_ON_ANIMATION || !RecyclerView.this.mHasFixedSize || !RecyclerView.this.mIsAttached) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mAdapterUpdateDuringMeasure = true;
                recyclerView.requestLayout();
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            C0293.m4204((View) recyclerView2, recyclerView2.mUpdateChildViewsRunnable);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ı  reason: contains not printable characters */
    public static class C0030 {
        /* renamed from: ǃ  reason: contains not printable characters */
        protected static EdgeEffect m491(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$і  reason: contains not printable characters */
    public static class C0040 {

        /* renamed from: ǃ  reason: contains not printable characters */
        int f392 = 0;

        /* renamed from: Ι  reason: contains not printable characters */
        SparseArray<C0041> f393 = new SparseArray<>();

        /* renamed from: androidx.recyclerview.widget.RecyclerView$і$ǃ  reason: contains not printable characters */
        static class C0041 {

            /* renamed from: ı  reason: contains not printable characters */
            long f394 = 0;

            /* renamed from: ɩ  reason: contains not printable characters */
            final ArrayList<con> f395 = new ArrayList<>();

            /* renamed from: Ι  reason: contains not printable characters */
            int f396 = 5;

            /* renamed from: ι  reason: contains not printable characters */
            long f397 = 0;

            C0041() {
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final con m507(int i) {
            C0041 r3 = this.f393.get(i);
            if (r3 == null || r3.f395.isEmpty()) {
                return null;
            }
            ArrayList<con> arrayList = r3.f395;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m504(con con) {
            int itemViewType = con.getItemViewType();
            ArrayList<con> arrayList = m505(itemViewType).f395;
            if (this.f393.get(itemViewType).f396 > arrayList.size()) {
                con.resetInternal();
                arrayList.add(con);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        static long m503(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m506(int i, long j) {
            C0041 r7 = m505(i);
            long j2 = r7.f397;
            if (j2 != 0) {
                j = (j / 4) + ((j2 / 4) * 3);
            }
            r7.f397 = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final C0041 m505(int i) {
            C0041 r0 = this.f393.get(i);
            if (r0 != null) {
                return r0;
            }
            C0041 r02 = new C0041();
            this.f393.put(i, r02);
            return r02;
        }
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    static void clearNestedRecyclerViewIfNotNested(con con2) {
        if (con2.mNestedRecyclerView != null) {
            View view = con2.mNestedRecyclerView.get();
            while (view != null) {
                if (view != con2.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            con2.mNestedRecyclerView = null;
        }
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public final class AUx {

        /* renamed from: ı  reason: contains not printable characters */
        final List<con> f323 = Collections.unmodifiableList(this.f325);

        /* renamed from: Ɩ  reason: contains not printable characters */
        C0043 f324;

        /* renamed from: ǃ  reason: contains not printable characters */
        final ArrayList<con> f325 = new ArrayList<>();

        /* renamed from: ɩ  reason: contains not printable characters */
        ArrayList<con> f326 = null;

        /* renamed from: Ι  reason: contains not printable characters */
        final ArrayList<con> f328 = new ArrayList<>();

        /* renamed from: ι  reason: contains not printable characters */
        int f329 = 2;

        /* renamed from: і  reason: contains not printable characters */
        private int f330 = 2;

        /* renamed from: Ӏ  reason: contains not printable characters */
        C0040 f331;

        public AUx() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m367() {
            this.f330 = this.f329 + (RecyclerView.this.mLayout != null ? RecyclerView.this.mLayout.f339 : 0);
            for (int size = this.f328.size() - 1; size >= 0 && this.f328.size() > this.f330; size--) {
                m370(this.f328.get(size), true);
                this.f328.remove(size);
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        private boolean m353(con con) {
            if (con.isRemoved()) {
                return RecyclerView.this.mState.f378;
            }
            if (con.mPosition < 0 || con.mPosition >= RecyclerView.this.mAdapter.getItemCount()) {
                StringBuilder sb = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                sb.append(con);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (!RecyclerView.this.mState.f378 && RecyclerView.this.mAdapter.getItemViewType(con.mPosition) != con.getItemViewType()) {
                return false;
            } else {
                if (!RecyclerView.this.mAdapter.hasStableIds() || con.getItemId() == RecyclerView.this.mAdapter.getItemId(con.mPosition)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private boolean m357(con con, int i, int i2, long j) {
            con.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = con.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != RecyclerView.FOREVER_NS) {
                long j2 = this.f331.m505(itemViewType).f394;
                if (!(j2 == 0 || j2 + nanoTime < j)) {
                    return false;
                }
            }
            RecyclerView.this.mAdapter.bindViewHolder(con, i);
            long nanoTime2 = RecyclerView.this.getNanoTime();
            C0040.C0041 r11 = this.f331.m505(con.getItemViewType());
            r11.f394 = C0040.m503(r11.f394, nanoTime2 - nanoTime);
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = con.itemView;
                if (C0293.m4217(view) == 0) {
                    C0293.m4203(view, 1);
                }
                if (RecyclerView.this.mAccessibilityDelegate != null) {
                    C1102.If ifR = RecyclerView.this.mAccessibilityDelegate.f6540;
                    if (ifR instanceof C1102.If) {
                        C1102.If ifR2 = ifR;
                        C2449 r0 = C0293.m4162(view);
                        if (!(r0 == null || r0 == ifR2)) {
                            ifR2.f6542.put(view, r0);
                        }
                    }
                    C0293.m4151(view, (C2449) ifR);
                }
            }
            if (RecyclerView.this.mState.f378) {
                con.mPreLayoutPosition = i2;
            }
            return true;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m365(int i) {
            if (i >= 0) {
                C0033 r0 = RecyclerView.this.mState;
                if (i < (r0.f378 ? r0.f375 - r0.f374 : r0.f366)) {
                    if (!RecyclerView.this.mState.f378) {
                        return i;
                    }
                    return RecyclerView.this.mAdapterHelper.m6655(i);
                }
            }
            StringBuilder sb = new StringBuilder("invalid position ");
            sb.append(i);
            sb.append(". State item count is ");
            C0033 r4 = RecyclerView.this.mState;
            sb.append(r4.f378 ? r4.f375 - r4.f374 : r4.f366);
            sb.append(RecyclerView.this.exceptionLabel());
            throw new IndexOutOfBoundsException(sb.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final View m361(int i) {
            return m362(i, RecyclerView.FOREVER_NS).itemView;
        }

        /* JADX WARNING: Removed duplicated region for block: B:106:0x0215  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x0223  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01ba  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01e3  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x01e6  */
        /* renamed from: ı  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.recyclerview.widget.RecyclerView.con m362(int r16, long r17) {
            /*
                r15 = this;
                r6 = r15
                r3 = r16
                if (r3 < 0) goto L_0x0246
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ȷ r0 = r0.mState
                boolean r1 = r0.f378
                if (r1 == 0) goto L_0x0013
                int r1 = r0.f375
                int r0 = r0.f374
                int r1 = r1 - r0
                goto L_0x0015
            L_0x0013:
                int r1 = r0.f366
            L_0x0015:
                if (r3 < r1) goto L_0x0019
                goto L_0x0246
            L_0x0019:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ȷ r0 = r0.mState
                boolean r0 = r0.f378
                r1 = 0
                r7 = 1
                r8 = 0
                if (r0 == 0) goto L_0x002c
                androidx.recyclerview.widget.RecyclerView$con r0 = r15.m354((int) r16)
                if (r0 == 0) goto L_0x002d
                r2 = 1
                goto L_0x002e
            L_0x002c:
                r0 = r1
            L_0x002d:
                r2 = 0
            L_0x002e:
                if (r0 != 0) goto L_0x0060
                androidx.recyclerview.widget.RecyclerView$con r0 = r15.m359((int) r16)
                if (r0 == 0) goto L_0x0060
                boolean r4 = r15.m353((androidx.recyclerview.widget.RecyclerView.con) r0)
                if (r4 != 0) goto L_0x005f
                r4 = 4
                r0.addFlags(r4)
                boolean r4 = r0.isScrap()
                if (r4 == 0) goto L_0x0051
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r5 = r0.itemView
                r4.removeDetachedView(r5, r8)
                r0.unScrap()
                goto L_0x005a
            L_0x0051:
                boolean r4 = r0.wasReturnedFromScrap()
                if (r4 == 0) goto L_0x005a
                r0.clearReturnedFromScrapFlag()
            L_0x005a:
                r15.m369(r0)
                r0 = r1
                goto L_0x0060
            L_0x005f:
                r2 = 1
            L_0x0060:
                if (r0 != 0) goto L_0x019b
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                o.ǃǀ r4 = r4.mAdapterHelper
                int r4 = r4.m6655(r3)
                if (r4 < 0) goto L_0x015e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ɩ r5 = r5.mAdapter
                int r5 = r5.getItemCount()
                if (r4 < r5) goto L_0x0078
                goto L_0x015e
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ɩ r5 = r5.mAdapter
                int r5 = r5.getItemViewType(r4)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ɩ r9 = r9.mAdapter
                boolean r9 = r9.hasStableIds()
                if (r9 == 0) goto L_0x009b
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ɩ r0 = r0.mAdapter
                long r9 = r0.getItemId(r4)
                androidx.recyclerview.widget.RecyclerView$con r0 = r15.m355(r9, r5)
                if (r0 == 0) goto L_0x009b
                r0.mPosition = r4
                r2 = 1
            L_0x009b:
                if (r0 != 0) goto L_0x00ea
                androidx.recyclerview.widget.RecyclerView$ӏ r4 = r6.f324
                if (r4 == 0) goto L_0x00ea
                android.view.View r4 = r4.m509()
                if (r4 == 0) goto L_0x00ea
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$con r0 = r0.getChildViewHolder(r4)
                if (r0 == 0) goto L_0x00d0
                boolean r4 = r0.shouldIgnore()
                if (r4 != 0) goto L_0x00b6
                goto L_0x00ea
            L_0x00b6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.<init>(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00d0:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.<init>(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ea:
                if (r0 != 0) goto L_0x0109
                androidx.recyclerview.widget.RecyclerView$і r0 = r6.f331
                if (r0 != 0) goto L_0x00f7
                androidx.recyclerview.widget.RecyclerView$і r0 = new androidx.recyclerview.widget.RecyclerView$і
                r0.<init>()
                r6.f331 = r0
            L_0x00f7:
                androidx.recyclerview.widget.RecyclerView$і r0 = r6.f331
                androidx.recyclerview.widget.RecyclerView$con r0 = r0.m507(r5)
                if (r0 == 0) goto L_0x0109
                r0.resetInternal()
                boolean r4 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r4 == 0) goto L_0x0109
                r15.m358((androidx.recyclerview.widget.RecyclerView.con) r0)
            L_0x0109:
                if (r0 != 0) goto L_0x019b
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r9 = r0.getNanoTime()
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
                if (r0 == 0) goto L_0x0134
                androidx.recyclerview.widget.RecyclerView$і r0 = r6.f331
                androidx.recyclerview.widget.RecyclerView$і$ǃ r0 = r0.m505(r5)
                long r11 = r0.f397
                r13 = 0
                int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r0 == 0) goto L_0x0130
                long r11 = r11 + r9
                int r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
                if (r0 >= 0) goto L_0x012e
                goto L_0x0130
            L_0x012e:
                r0 = 0
                goto L_0x0131
            L_0x0130:
                r0 = 1
            L_0x0131:
                if (r0 != 0) goto L_0x0134
                return r1
            L_0x0134:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ɩ r0 = r0.mAdapter
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$con r0 = r0.createViewHolder(r1, r5)
                boolean r1 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r1 == 0) goto L_0x0151
                android.view.View r1 = r0.itemView
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r1)
                if (r1 == 0) goto L_0x0151
                java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
                r4.<init>(r1)
                r0.mNestedRecyclerView = r4
            L_0x0151:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                long r11 = r1.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$і r1 = r6.f331
                long r11 = r11 - r9
                r1.m506(r5, r11)
                goto L_0x019b
            L_0x015e:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.<init>(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ȷ r2 = r2.mState
                boolean r3 = r2.f378
                if (r3 == 0) goto L_0x0185
                int r3 = r2.f375
                int r2 = r2.f374
                int r3 = r3 - r2
                goto L_0x0187
            L_0x0185:
                int r3 = r2.f366
            L_0x0187:
                r1.append(r3)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x019b:
                r10 = r0
                r9 = r2
                if (r9 == 0) goto L_0x01d5
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ȷ r0 = r0.mState
                boolean r0 = r0.f378
                if (r0 != 0) goto L_0x01d5
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x01d5
                r10.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ȷ r0 = r0.mState
                boolean r0 = r0.f367
                if (r0 == 0) goto L_0x01d5
                int r0 = androidx.recyclerview.widget.RecyclerView.C3246iF.buildAdapterChangeFlagsForAnimations(r10)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$iF r1 = r1.mItemAnimator
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ȷ r2 = r2.mState
                java.util.List r4 = r10.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$iF$ɩ r0 = r1.recordPreLayoutInformation(r2, r10, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.recordAnimationInfoIfBouncedHiddenView(r10, r0)
            L_0x01d5:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ȷ r0 = r0.mState
                boolean r0 = r0.f378
                if (r0 == 0) goto L_0x01e6
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x01e6
                r10.mPreLayoutPosition = r3
                goto L_0x01f9
            L_0x01e6:
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x01fb
                boolean r0 = r10.needsUpdate()
                if (r0 != 0) goto L_0x01fb
                boolean r0 = r10.isInvalid()
                if (r0 == 0) goto L_0x01f9
                goto L_0x01fb
            L_0x01f9:
                r0 = 0
                goto L_0x020d
            L_0x01fb:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                o.ǃǀ r0 = r0.mAdapterHelper
                int r2 = r0.m6655(r3)
                r0 = r15
                r1 = r10
                r3 = r16
                r4 = r17
                boolean r0 = r0.m357(r1, r2, r3, r4)
            L_0x020d:
                android.view.View r1 = r10.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x0223
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ι r1 = (androidx.recyclerview.widget.RecyclerView.C0038) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x023b
            L_0x0223:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0239
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$ι r1 = (androidx.recyclerview.widget.RecyclerView.C0038) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x023b
            L_0x0239:
                androidx.recyclerview.widget.RecyclerView$ι r1 = (androidx.recyclerview.widget.RecyclerView.C0038) r1
            L_0x023b:
                r1.f388 = r10
                if (r9 == 0) goto L_0x0242
                if (r0 == 0) goto L_0x0242
                goto L_0x0243
            L_0x0242:
                r7 = 0
            L_0x0243:
                r1.f391 = r7
                return r10
            L_0x0246:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid item position "
                r1.<init>(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$ȷ r2 = r2.mState
                boolean r3 = r2.f378
                if (r3 == 0) goto L_0x026d
                int r3 = r2.f375
                int r2 = r2.f374
                int r3 = r3 - r2
                goto L_0x026f
            L_0x026d:
                int r3 = r2.f366
            L_0x026f:
                r1.append(r3)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AUx.m362(int, long):androidx.recyclerview.widget.RecyclerView$con");
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private void m358(con con) {
            if (con.itemView instanceof ViewGroup) {
                m360((ViewGroup) con.itemView, false);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private void m360(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m360((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m366(View view) {
            con childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            m369(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m363() {
            for (int size = this.f328.size() - 1; size >= 0; size--) {
                m370(this.f328.get(size), true);
                this.f328.remove(size);
            }
            this.f328.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                C0903.If ifR = RecyclerView.this.mPrefetchRegistry;
                if (ifR.f5755 != null) {
                    Arrays.fill(ifR.f5755, -1);
                }
                ifR.f5758 = 0;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m369(con con) {
            boolean z;
            boolean z2 = false;
            if (con.isScrap() || con.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(con.isScrap());
                sb.append(" isAttached:");
                if (con.itemView.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (con.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(con);
                sb2.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb2.toString());
            } else if (!con.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = con.doesTransientStatePreventRecycling();
                if ((RecyclerView.this.mAdapter != null && doesTransientStatePreventRecycling && RecyclerView.this.mAdapter.onFailedToRecycleView(con)) || con.isRecyclable()) {
                    if (this.f330 <= 0 || con.hasAnyOfTheFlags(526)) {
                        z = false;
                    } else {
                        int size = this.f328.size();
                        if (size >= this.f330 && size > 0) {
                            m370(this.f328.get(0), true);
                            this.f328.remove(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.m6686(con.mPosition)) {
                            do {
                                size--;
                                if (size < 0) {
                                    break;
                                }
                            } while (RecyclerView.this.mPrefetchRegistry.m6686(this.f328.get(size).mPosition));
                            size++;
                        }
                        this.f328.add(size, con);
                        z = true;
                    }
                    if (!z) {
                        m370(con, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.mViewInfoStore.m7612(con);
                if (!z && !z2 && doesTransientStatePreventRecycling) {
                    con.mOwnerRecyclerView = null;
                }
            } else {
                StringBuilder sb3 = new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m370(con con, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(con);
            View view = con.itemView;
            if (RecyclerView.this.mAccessibilityDelegate != null) {
                C1102.If ifR = RecyclerView.this.mAccessibilityDelegate.f6540;
                C0293.m4151(view, ifR instanceof C1102.If ? ifR.f6542.remove(view) : null);
            }
            if (z) {
                m356(con);
            }
            con.mOwnerRecyclerView = null;
            if (this.f331 == null) {
                this.f331 = new C0040();
            }
            this.f331.m504(con);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m364(View view) {
            con childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f326 == null) {
                    this.f326 = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f326.add(childViewHolderInt);
            } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f325.add(childViewHolderInt);
            } else {
                StringBuilder sb = new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m368(con con) {
            if (con.mInChangeScrap) {
                this.f326.remove(con);
            } else {
                this.f325.remove(con);
            }
            con.mScrapContainer = null;
            con.mInChangeScrap = false;
            con.clearReturnedFromScrapFlag();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private con m354(int i) {
            int size;
            int r10;
            ArrayList<con> arrayList = this.f326;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    con con = this.f326.get(i3);
                    if (con.wasReturnedFromScrap() || con.getLayoutPosition() != i) {
                        i3++;
                    } else {
                        con.addFlags(32);
                        return con;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (r10 = RecyclerView.this.mAdapterHelper.m6651(i, 0)) > 0 && r10 < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(r10);
                    while (i2 < size) {
                        con con2 = this.f326.get(i2);
                        if (con2.wasReturnedFromScrap() || con2.getItemId() != itemId) {
                            i2++;
                        } else {
                            con2.addFlags(32);
                            return con2;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private con m359(int i) {
            View view;
            int size = this.f325.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                con con = this.f325.get(i3);
                if (con.wasReturnedFromScrap() || con.getLayoutPosition() != i || con.isInvalid() || (!RecyclerView.this.mState.f378 && con.isRemoved())) {
                    i3++;
                } else {
                    con.addFlags(32);
                    return con;
                }
            }
            C0878 r0 = RecyclerView.this.mChildHelper;
            int size2 = r0.f5662.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    view = null;
                    break;
                }
                view = r0.f5662.get(i4);
                con r6 = r0.f5664.m6557(view);
                if (r6.getLayoutPosition() == i && !r6.isInvalid() && !r6.isRemoved()) {
                    break;
                }
                i4++;
            }
            if (view != null) {
                con childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                C0878 r02 = RecyclerView.this.mChildHelper;
                int r1 = r02.f5664.m6553(view);
                if (r1 < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
                } else if (r02.f5663.m6547(r1)) {
                    r02.f5663.m6548(r1);
                    if (r02.f5662.remove(view)) {
                        r02.f5664.m6563(view);
                    }
                    int r03 = RecyclerView.this.mChildHelper.m6542(view);
                    if (r03 != -1) {
                        RecyclerView.this.mChildHelper.m6546(r03);
                        m364(view);
                        childViewHolderInt.addFlags(8224);
                        return childViewHolderInt;
                    }
                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                    sb.append(childViewHolderInt);
                    sb.append(RecyclerView.this.exceptionLabel());
                    throw new IllegalStateException(sb.toString());
                } else {
                    throw new RuntimeException("trying to unhide a view that was not hidden".concat(String.valueOf(view)));
                }
            } else {
                int size3 = this.f328.size();
                while (i2 < size3) {
                    con con2 = this.f328.get(i2);
                    if (con2.isInvalid() || con2.getLayoutPosition() != i || con2.isAttachedToTransitionOverlay()) {
                        i2++;
                    } else {
                        this.f328.remove(i2);
                        return con2;
                    }
                }
                return null;
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private con m355(long j, int i) {
            for (int size = this.f325.size() - 1; size >= 0; size--) {
                con con = this.f325.get(size);
                if (con.getItemId() == j && !con.wasReturnedFromScrap()) {
                    if (i == con.getItemViewType()) {
                        con.addFlags(32);
                        if (con.isRemoved() && !RecyclerView.this.mState.f378) {
                            con.setFlags(2, 14);
                        }
                        return con;
                    }
                    this.f325.remove(size);
                    RecyclerView.this.removeDetachedView(con.itemView, false);
                    con childViewHolderInt = RecyclerView.getChildViewHolderInt(con.itemView);
                    childViewHolderInt.mScrapContainer = null;
                    childViewHolderInt.mInChangeScrap = false;
                    childViewHolderInt.clearReturnedFromScrapFlag();
                    m369(childViewHolderInt);
                }
            }
            int size2 = this.f328.size() - 1;
            while (size2 >= 0) {
                con con2 = this.f328.get(size2);
                if (con2.getItemId() != j || con2.isAttachedToTransitionOverlay()) {
                    size2--;
                } else if (i == con2.getItemViewType()) {
                    this.f328.remove(size2);
                    return con2;
                } else {
                    m370(this.f328.get(size2), true);
                    this.f328.remove(size2);
                    return null;
                }
            }
            return null;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private void m356(con con) {
            if (RecyclerView.this.mAdapter != null) {
                RecyclerView.this.mAdapter.onViewRecycled(con);
            }
            if (RecyclerView.this.mState != null) {
                RecyclerView.this.mViewInfoStore.m7612(con);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ɩ  reason: contains not printable characters */
    public static abstract class C0035<VH extends con> {
        private boolean mHasStableIds = false;
        private final Cif mObservable = new Cif();

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                C1679.m9555(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C1679.m9554();
            }
        }

        public final void bindViewHolder(VH vh, int i) {
            vh.mPosition = i;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i);
            }
            vh.setFlags(1, 519);
            C1679.m9555(RecyclerView.TRACE_BIND_VIEW_TAG);
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof C0038) {
                ((C0038) layoutParams).f390 = true;
            }
            C1679.m9554();
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final boolean hasObservers() {
            return this.mObservable.m488();
        }

        public void registerAdapterDataObserver(C0032 r2) {
            this.mObservable.registerObserver(r2);
        }

        public void unregisterAdapterDataObserver(C0032 r2) {
            this.mObservable.unregisterObserver(r2);
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m485();
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.m486(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.m490(i, i2, obj);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.m489(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.m484(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.m487(i, 1);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.m487(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildDetached(View view) {
        con childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        C0035 r2 = this.mAdapter;
        if (!(r2 == null || childViewHolderInt == null)) {
            r2.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<C0039> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildAttached(View view) {
        con childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        C0035 r1 = this.mAdapter;
        if (!(r1 == null || childViewHolderInt == null)) {
            r1.onViewAttachedToWindow(childViewHolderInt);
        }
        List<C0039> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).m502(view);
            }
        }
    }

    public static abstract class IF {

        /* renamed from: ŀ  reason: contains not printable characters */
        public int f339;

        /* renamed from: ł  reason: contains not printable characters */
        boolean f340 = false;

        /* renamed from: ſ  reason: contains not printable characters */
        public int f341;

        /* renamed from: Ɨ  reason: contains not printable characters */
        public boolean f342;

        /* renamed from: ƚ  reason: contains not printable characters */
        public int f343;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C1106.Cif f344 = new C1106.Cif() {
            /* renamed from: Ι  reason: contains not printable characters */
            public final View m470(int i) {
                return IF.this.m432(i);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final int m468() {
                IF ifR = IF.this;
                if (ifR.f349 != null) {
                    return ifR.f349.getPaddingLeft();
                }
                return 0;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final int m469() {
                int i = IF.this.f351;
                IF ifR = IF.this;
                return i - (ifR.f349 != null ? ifR.f349.getPaddingRight() : 0);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final int m467(View view) {
                return (view.getLeft() - ((C0038) view.getLayoutParams()).f389.left) - ((C0038) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final int m466(View view) {
                return view.getRight() + ((C0038) view.getLayoutParams()).f389.right + ((C0038) view.getLayoutParams()).rightMargin;
            }
        };

        /* renamed from: ȷ  reason: contains not printable characters */
        public C0878 f345;

        /* renamed from: ɍ  reason: contains not printable characters */
        public int f346;

        /* renamed from: ɨ  reason: contains not printable characters */
        C1106 f347 = new C1106(this.f353);

        /* renamed from: ɩ  reason: contains not printable characters */
        private boolean f348 = true;

        /* renamed from: ɪ  reason: contains not printable characters */
        public RecyclerView f349;

        /* renamed from: ɿ  reason: contains not printable characters */
        public boolean f350 = true;

        /* renamed from: ʅ  reason: contains not printable characters */
        public int f351;

        /* renamed from: ʟ  reason: contains not printable characters */
        C3240AuX f352;

        /* renamed from: ι  reason: contains not printable characters */
        private final C1106.Cif f353 = new C1106.Cif() {
            /* renamed from: Ι  reason: contains not printable characters */
            public final View m465(int i) {
                return IF.this.m432(i);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final int m463() {
                IF ifR = IF.this;
                if (ifR.f349 != null) {
                    return ifR.f349.getPaddingTop();
                }
                return 0;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final int m464() {
                int i = IF.this.f341;
                IF ifR = IF.this;
                return i - (ifR.f349 != null ? ifR.f349.getPaddingBottom() : 0);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final int m462(View view) {
                return (view.getTop() - ((C0038) view.getLayoutParams()).f389.top) - ((C0038) view.getLayoutParams()).topMargin;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final int m461(View view) {
                return view.getBottom() + ((C0038) view.getLayoutParams()).f389.bottom + ((C0038) view.getLayoutParams()).bottomMargin;
            }
        };

        /* renamed from: г  reason: contains not printable characters */
        boolean f354 = false;

        /* renamed from: ӏ  reason: contains not printable characters */
        C1106 f355 = new C1106(this.f344);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$IF$ı  reason: contains not printable characters */
        public static class C0026 {

            /* renamed from: ı  reason: contains not printable characters */
            public boolean f358;

            /* renamed from: ǃ  reason: contains not printable characters */
            public int f359;

            /* renamed from: ɩ  reason: contains not printable characters */
            public boolean f360;

            /* renamed from: ι  reason: contains not printable characters */
            public int f361;
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$IF$ǃ  reason: contains not printable characters */
        public interface C0027 {
            /* renamed from: ι  reason: contains not printable characters */
            void m471(int i, int i2);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public int m395(C0033 r1) {
            return 0;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m397(int i, int i2) {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m404(RecyclerView recyclerView, int i) {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public boolean m405() {
            return false;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public boolean m406(C0038 r1) {
            return r1 != null;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public boolean m408() {
            return false;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public int m409(int i, AUx aUx, C0033 r3) {
            return 0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public int m410(C0033 r1) {
            return 0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public View m412(View view, int i, AUx aUx, C0033 r4) {
            return null;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m413(int i, int i2) {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m415(Parcelable parcelable) {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean m419() {
            return false;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public int m422(C0033 r1) {
            return 0;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m423() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m424(int i) {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m425(int i, int i2) {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m426(int i, C0027 r2) {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m429(AUx aUx, C0033 r2) {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public abstract C0038 m433();

        /* renamed from: Ι  reason: contains not printable characters */
        public void m434(int i, int i2) {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m435(int i, int i2, C0033 r3, C0027 r4) {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m438(C0033 r1) {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m439(RecyclerView recyclerView, AUx aUx) {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public int m442(int i, AUx aUx, C0033 r3) {
            return 0;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public int m444(C0033 r1) {
            return 0;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public Parcelable m445() {
            return null;
        }

        /* renamed from: І  reason: contains not printable characters */
        public int m452(C0033 r1) {
            return 0;
        }

        /* renamed from: І  reason: contains not printable characters */
        public boolean m453() {
            return false;
        }

        /* renamed from: і  reason: contains not printable characters */
        public int m454(C0033 r1) {
            return 0;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public void m457(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ӏ  reason: contains not printable characters */
        public boolean m459() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m430(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f349 = null;
                this.f345 = null;
                this.f351 = 0;
                this.f341 = 0;
            } else {
                this.f349 = recyclerView;
                this.f345 = recyclerView.mChildHelper;
                this.f351 = recyclerView.getWidth();
                this.f341 = recyclerView.getHeight();
            }
            this.f346 = 1073741824;
            this.f343 = 1073741824;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m447(int i, int i2) {
            this.f351 = View.MeasureSpec.getSize(i);
            this.f346 = View.MeasureSpec.getMode(i);
            if (this.f346 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f351 = 0;
            }
            this.f341 = View.MeasureSpec.getSize(i2);
            this.f343 = View.MeasureSpec.getMode(i2);
            if (this.f343 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f341 = 0;
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m398(Rect rect, int i, int i2) {
            int width = rect.width();
            RecyclerView recyclerView = this.f349;
            int i3 = 0;
            int paddingLeft = width + (recyclerView != null ? recyclerView.getPaddingLeft() : 0);
            RecyclerView recyclerView2 = this.f349;
            int paddingRight = paddingLeft + (recyclerView2 != null ? recyclerView2.getPaddingRight() : 0);
            int height = rect.height();
            RecyclerView recyclerView3 = this.f349;
            int paddingTop = height + (recyclerView3 != null ? recyclerView3.getPaddingTop() : 0);
            RecyclerView recyclerView4 = this.f349;
            if (recyclerView4 != null) {
                i3 = recyclerView4.getPaddingBottom();
            }
            this.f349.setMeasuredDimension(m380(i, paddingRight, C0293.m4222(this.f349)), m380(i2, paddingTop + i3, C0293.m4182(this.f349)));
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public static int m380(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m440(String str) {
            RecyclerView recyclerView = this.f349;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public C0038 m446(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C0038) {
                return new C0038((C0038) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new C0038((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new C0038(layoutParams);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public C0038 m396(Context context, AttributeSet attributeSet) {
            return new C0038(context, attributeSet);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m403(C3240AuX auX) {
            C3240AuX auX2 = this.f352;
            if (!(auX2 == null || auX == auX2 || !auX2.isRunning())) {
                this.f352.stop();
            }
            this.f352 = auX;
            this.f352.start(this.f349, this);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m416(View view) {
            m377(view, 0, true);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m448(View view) {
            m377(view, 0, false);
        }

        /* renamed from: ı  reason: contains not printable characters */
        private void m377(View view, int i, boolean z) {
            con childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                this.f349.mViewInfoStore.m7615(childViewHolderInt);
            } else {
                C1151.C1152 r8 = this.f349.mViewInfoStore.f6689.get(childViewHolderInt);
                if (r8 != null) {
                    r8.f6693 &= -2;
                }
            }
            C0038 r82 = (C0038) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.f345.m6543(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f349) {
                int r1 = this.f345.m6542(view);
                if (i == -1) {
                    C0878 r7 = this.f345;
                    i = r7.f5664.m6559() - r7.f5662.size();
                }
                if (r1 == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f349.indexOfChild(view));
                    sb.append(this.f349.exceptionLabel());
                    throw new IllegalStateException(sb.toString());
                } else if (r1 != i) {
                    this.f349.mLayout.m391(r1, i);
                }
            } else {
                this.f345.m6545(view, i, false);
                r82.f390 = true;
                C3240AuX auX = this.f352;
                if (auX != null && auX.isRunning()) {
                    this.f352.onChildAttachedToWindow(view);
                }
            }
            if (r82.f391) {
                childViewHolderInt.itemView.invalidate();
                r82.f391 = false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m436(View view) {
            C0878 r0 = this.f345;
            int r1 = r0.f5664.m6553(view);
            if (r1 >= 0) {
                if (r0.f5663.m6552(r1) && r0.f5662.remove(view)) {
                    r0.f5664.m6563(view);
                }
                r0.f5664.m6558(r1);
            }
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public static int m392(View view) {
            return ((C0038) view.getLayoutParams()).f388.getLayoutPosition();
        }

        /* renamed from: і  reason: contains not printable characters */
        public final View m455(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f349;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f345.f5662.contains(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private void m379(View view, int i) {
            C0038 r0 = (C0038) view.getLayoutParams();
            con childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.f349.mViewInfoStore.m7615(childViewHolderInt);
            } else {
                C1151.C1152 r2 = this.f349.mViewInfoStore.f6689.get(childViewHolderInt);
                if (r2 != null) {
                    r2.f6693 &= -2;
                }
            }
            this.f345.m6543(view, i, r0, childViewHolderInt.isRemoved());
        }

        /* renamed from: ɨ  reason: contains not printable characters */
        public final int m421() {
            C0878 r0 = this.f345;
            if (r0 != null) {
                return r0.f5664.m6559() - r0.f5662.size();
            }
            return 0;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final View m432(int i) {
            C0878 r0 = this.f345;
            if (r0 == null) {
                return null;
            }
            return r0.f5664.m6560(r0.m6544(i));
        }

        /* renamed from: ɪ  reason: contains not printable characters */
        public final View m431() {
            View focusedChild;
            RecyclerView recyclerView = this.f349;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f345.f5662.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public void m407(int i) {
            RecyclerView recyclerView = this.f349;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        /* renamed from: і  reason: contains not printable characters */
        public void m456(int i) {
            RecyclerView recyclerView = this.f349;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m449(AUx aUx) {
            for (int r0 = m421() - 1; r0 >= 0; r0--) {
                View r1 = m432(r0);
                con childViewHolderInt = RecyclerView.getChildViewHolderInt(r1);
                if (!childViewHolderInt.shouldIgnore()) {
                    if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.f349.mAdapter.hasStableIds()) {
                        m376(r0);
                        aUx.m364(r1);
                        C1151.C1152 r12 = this.f349.mViewInfoStore.f6689.get(childViewHolderInt);
                        if (r12 != null) {
                            r12.f6693 &= -2;
                        }
                    } else {
                        m387(r0);
                        aUx.m369(childViewHolderInt);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m450(View view, int i, int i2, C0038 r6) {
            return !this.f348 || !m389(view.getMeasuredWidth(), i, r6.width) || !m389(view.getMeasuredHeight(), i2, r6.height);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m441(View view, int i, int i2, C0038 r6) {
            return view.isLayoutRequested() || !this.f348 || !m389(view.getWidth(), i, r6.width) || !m389(view.getHeight(), i2, r6.height);
        }

        /* renamed from: ι  reason: contains not printable characters */
        private static boolean m389(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* renamed from: Ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m385(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002e
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002e
                if (r5 == r3) goto L_0x0021
                goto L_0x002e
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r6 = 1073741824(0x40000000, float:2.0)
                goto L_0x002f
            L_0x001f:
                if (r7 != r1) goto L_0x0024
            L_0x0021:
                r7 = r4
                r6 = r5
                goto L_0x002f
            L_0x0024:
                if (r7 != r0) goto L_0x002e
                if (r5 == r2) goto L_0x002a
                if (r5 != r3) goto L_0x002c
            L_0x002a:
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x002c:
                r7 = r4
                goto L_0x002f
            L_0x002e:
                r7 = 0
            L_0x002f:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.IF.m385(int, int, int, int, boolean):int");
        }

        /* renamed from: І  reason: contains not printable characters */
        public static int m390(View view) {
            Rect rect = ((C0038) view.getLayoutParams()).f389;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static int m378(View view) {
            Rect rect = ((C0038) view.getLayoutParams()).f389;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public static void m386(View view, int i, int i2, int i3, int i4) {
            C0038 r0 = (C0038) view.getLayoutParams();
            Rect rect = r0.f389;
            view.layout(i + rect.left + r0.leftMargin, i2 + rect.top + r0.topMargin, (i3 - rect.right) - r0.rightMargin, (i4 - rect.bottom) - r0.bottomMargin);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m400(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((C0038) view.getLayoutParams()).f389;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (!(this.f349 == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f349.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static void m388(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public static int m383(View view) {
            return ((C0038) view.getLayoutParams()).f389.top;
        }

        /* renamed from: ӏ  reason: contains not printable characters */
        public static int m393(View view) {
            return ((C0038) view.getLayoutParams()).f389.bottom;
        }

        /* renamed from: ɾ  reason: contains not printable characters */
        public static int m384(View view) {
            return ((C0038) view.getLayoutParams()).f389.left;
        }

        /* renamed from: ɪ  reason: contains not printable characters */
        public static int m382(View view) {
            return ((C0038) view.getLayoutParams()).f389.right;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ӏ  reason: contains not printable characters */
        public final void m460() {
            C3240AuX auX = this.f352;
            if (auX != null) {
                auX.stop();
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m402(AUx aUx) {
            for (int r0 = m421() - 1; r0 >= 0; r0--) {
                if (!RecyclerView.getChildViewHolderInt(m432(r0)).shouldIgnore()) {
                    m414(r0, aUx);
                }
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m418(AUx aUx, C0033 r5, C0520 r6) {
            if (this.f349.canScrollVertically(-1) || this.f349.canScrollHorizontally(-1)) {
                r6.m5030(8192);
                r6.m5028(true);
            }
            if (this.f349.canScrollVertically(1) || this.f349.canScrollHorizontally(1)) {
                r6.m5030((int) C0872.f5653);
                r6.m5028(true);
            }
            r6.m5035((Object) C0520.C0521.m5076(m394(aUx, r5), m443(aUx, r5), false, 0));
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m437(View view, C0520 r4) {
            con childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                C0878 r1 = this.f345;
                if (!r1.f5662.contains(childViewHolderInt.itemView)) {
                    m417(this.f349.mRecycler, this.f349.mState, view, r4);
                }
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m417(AUx aUx, C0033 r8, View view, C0520 r10) {
            r10.m5023((Object) C0520.If.m5072(m453() ? ((C0038) view.getLayoutParams()).f388.getLayoutPosition() : 0, 1, m408() ? ((C0038) view.getLayoutParams()).f388.getLayoutPosition() : 0, 1, false, false));
        }

        /* renamed from: ı  reason: contains not printable characters */
        public int m394(AUx aUx, C0033 r2) {
            RecyclerView recyclerView = this.f349;
            if (recyclerView == null || recyclerView.mAdapter == null || !m453()) {
                return 1;
            }
            return this.f349.mAdapter.getItemCount();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public int m443(AUx aUx, C0033 r2) {
            RecyclerView recyclerView = this.f349;
            if (recyclerView == null || recyclerView.mAdapter == null || !m408()) {
                return 1;
            }
            return this.f349.mAdapter.getItemCount();
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x009e A[ADDED_TO_REGION] */
        /* renamed from: ǃ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean m420(androidx.recyclerview.widget.RecyclerView.AUx r8, androidx.recyclerview.widget.RecyclerView.C0033 r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f349
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0057
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0013
                r2 = 0
                r3 = 0
                goto L_0x009c
            L_0x0013:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0034
                int r8 = r7.f341
                androidx.recyclerview.widget.RecyclerView r11 = r7.f349
                if (r11 == 0) goto L_0x0025
                int r11 = r11.getPaddingTop()
                goto L_0x0026
            L_0x0025:
                r11 = 0
            L_0x0026:
                int r8 = r8 - r11
                androidx.recyclerview.widget.RecyclerView r11 = r7.f349
                if (r11 == 0) goto L_0x0030
                int r11 = r11.getPaddingBottom()
                goto L_0x0031
            L_0x0030:
                r11 = 0
            L_0x0031:
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x0035
            L_0x0034:
                r8 = 0
            L_0x0035:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f349
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x009a
                int r10 = r7.f351
                androidx.recyclerview.widget.RecyclerView r11 = r7.f349
                if (r11 == 0) goto L_0x0048
                int r11 = r11.getPaddingLeft()
                goto L_0x0049
            L_0x0048:
                r11 = 0
            L_0x0049:
                int r10 = r10 - r11
                androidx.recyclerview.widget.RecyclerView r11 = r7.f349
                if (r11 == 0) goto L_0x0053
                int r11 = r11.getPaddingRight()
                goto L_0x0054
            L_0x0053:
                r11 = 0
            L_0x0054:
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x0097
            L_0x0057:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0076
                int r8 = r7.f341
                androidx.recyclerview.widget.RecyclerView r10 = r7.f349
                if (r10 == 0) goto L_0x0068
                int r10 = r10.getPaddingTop()
                goto L_0x0069
            L_0x0068:
                r10 = 0
            L_0x0069:
                int r8 = r8 - r10
                androidx.recyclerview.widget.RecyclerView r10 = r7.f349
                if (r10 == 0) goto L_0x0073
                int r10 = r10.getPaddingBottom()
                goto L_0x0074
            L_0x0073:
                r10 = 0
            L_0x0074:
                int r8 = r8 - r10
                goto L_0x0077
            L_0x0076:
                r8 = 0
            L_0x0077:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f349
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x009a
                int r10 = r7.f351
                androidx.recyclerview.widget.RecyclerView r11 = r7.f349
                if (r11 == 0) goto L_0x008a
                int r11 = r11.getPaddingLeft()
                goto L_0x008b
            L_0x008a:
                r11 = 0
            L_0x008b:
                int r10 = r10 - r11
                androidx.recyclerview.widget.RecyclerView r11 = r7.f349
                if (r11 == 0) goto L_0x0095
                int r11 = r11.getPaddingRight()
                goto L_0x0096
            L_0x0095:
                r11 = 0
            L_0x0096:
                int r10 = r10 - r11
            L_0x0097:
                r3 = r8
                r2 = r10
                goto L_0x009c
            L_0x009a:
                r3 = r8
                r2 = 0
            L_0x009c:
                if (r3 != 0) goto L_0x00a1
                if (r2 != 0) goto L_0x00a1
                return r9
            L_0x00a1:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f349
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.smoothScrollBy(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.IF.m420(androidx.recyclerview.widget.RecyclerView$AUx, androidx.recyclerview.widget.RecyclerView$ȷ, int, android.os.Bundle):boolean");
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public static C0026 m381(Context context, AttributeSet attributeSet, int i, int i2) {
            C0026 r0 = new C0026();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0819.C0820.f5349, i, i2);
            r0.f359 = obtainStyledAttributes.getInt(C0819.C0820.f5352, 1);
            r0.f361 = obtainStyledAttributes.getInt(C0819.C0820.f5357, 1);
            r0.f360 = obtainStyledAttributes.getBoolean(C0819.C0820.f5350, false);
            r0.f358 = obtainStyledAttributes.getBoolean(C0819.C0820.f5348, false);
            obtainStyledAttributes.recycle();
            return r0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ӏ  reason: contains not printable characters */
        public final void m458(int i, int i2) {
            C0878 r0 = this.f345;
            int r02 = r0 != null ? r0.f5664.m6559() - r0.f5662.size() : 0;
            if (r02 == 0) {
                this.f349.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = RecyclerView.UNDEFINED_DURATION;
            int i6 = RecyclerView.UNDEFINED_DURATION;
            for (int i7 = 0; i7 < r02; i7++) {
                C0878 r6 = this.f345;
                View r62 = r6 != null ? r6.f5664.m6560(r6.m6544(i7)) : null;
                Rect rect = this.f349.mTempRect;
                RecyclerView.getDecoratedBoundsWithMarginsInt(r62, rect);
                if (rect.left < i3) {
                    i3 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i4) {
                    i4 = rect.top;
                }
                if (rect.bottom > i6) {
                    i6 = rect.bottom;
                }
            }
            this.f349.mTempRect.set(i3, i4, i5, i6);
            m398(this.f349.mTempRect, i, i2);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m399(View view) {
            m377(view, -1, true);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m427(View view) {
            m377(view, -1, false);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
            r0 = r3.f345;
            r4 = r0.m6544(r4);
         */
        /* renamed from: ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m387(int r4) {
            /*
                r3 = this;
                o.ǂ r0 = r3.f345
                if (r0 == 0) goto L_0x000f
                int r1 = r0.m6544(r4)
                o.ǂ$ǃ r0 = r0.f5664
                android.view.View r0 = r0.m6560(r1)
                goto L_0x0010
            L_0x000f:
                r0 = 0
            L_0x0010:
                if (r0 == 0) goto L_0x003a
                o.ǂ r0 = r3.f345
                int r4 = r0.m6544(r4)
                o.ǂ$ǃ r1 = r0.f5664
                android.view.View r1 = r1.m6560(r4)
                if (r1 == 0) goto L_0x003a
                o.ǂ$if r2 = r0.f5663
                boolean r2 = r2.m6552(r4)
                if (r2 == 0) goto L_0x0035
                java.util.List<android.view.View> r2 = r0.f5662
                boolean r2 = r2.remove(r1)
                if (r2 == 0) goto L_0x0035
                o.ǂ$ǃ r2 = r0.f5664
                r2.m6563((android.view.View) r1)
            L_0x0035:
                o.ǂ$ǃ r0 = r0.f5664
                r0.m6558((int) r4)
            L_0x003a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.IF.m387(int):void");
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public View m411(int i) {
            View view;
            C0878 r0 = this.f345;
            int i2 = 0;
            int r02 = r0 != null ? r0.f5664.m6559() - r0.f5662.size() : 0;
            while (true) {
                view = null;
                if (i2 >= r02) {
                    return null;
                }
                C0878 r3 = this.f345;
                if (r3 != null) {
                    view = r3.f5664.m6560(r3.m6544(i2));
                }
                con childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt == null || childViewHolderInt.getLayoutPosition() != i || childViewHolderInt.shouldIgnore() || (!this.f349.mState.f378 && childViewHolderInt.isRemoved())) {
                    i2++;
                }
            }
            return view;
        }

        /* renamed from: ı  reason: contains not printable characters */
        private void m376(int i) {
            C0878 r0 = this.f345;
            if (r0 != null) {
                r0.f5664.m6560(r0.m6544(i));
            }
            C0878 r02 = this.f345;
            int r3 = r02.m6544(i);
            r02.f5663.m6552(r3);
            r02.f5664.m6562(r3);
        }

        /* renamed from: і  reason: contains not printable characters */
        private void m391(int i, int i2) {
            View view;
            C0878 r0 = this.f345;
            if (r0 != null) {
                view = r0.f5664.m6560(r0.m6544(i));
            } else {
                view = null;
            }
            if (view != null) {
                m376(i);
                m379(view, i2);
                return;
            }
            StringBuilder sb = new StringBuilder("Cannot move a child from non-existing index:");
            sb.append(i);
            sb.append(this.f349.toString());
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m414(int i, AUx aUx) {
            View view;
            C0878 r0 = this.f345;
            if (r0 != null) {
                view = r0.f5664.m6560(r0.m6544(i));
            } else {
                view = null;
            }
            m387(i);
            aUx.m366(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m428(AUx aUx) {
            int size = aUx.f325.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = aUx.f325.get(i).itemView;
                con childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.f349.removeDetachedView(view, false);
                    }
                    if (this.f349.mItemAnimator != null) {
                        this.f349.mItemAnimator.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    con childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    aUx.m369(childViewHolderInt2);
                }
            }
            aUx.f325.clear();
            if (aUx.f326 != null) {
                aUx.f326.clear();
            }
            if (size > 0) {
                this.f349.invalidate();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e5, code lost:
            if (r14 == false) goto L_0x00ec;
         */
        /* renamed from: ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean m451(androidx.recyclerview.widget.RecyclerView r10, android.view.View r11, android.graphics.Rect r12, boolean r13, boolean r14) {
            /*
                r9 = this;
                r0 = 2
                int[] r0 = new int[r0]
                androidx.recyclerview.widget.RecyclerView r1 = r9.f349
                r2 = 0
                if (r1 == 0) goto L_0x000d
                int r1 = r1.getPaddingLeft()
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                androidx.recyclerview.widget.RecyclerView r3 = r9.f349
                if (r3 == 0) goto L_0x0017
                int r3 = r3.getPaddingTop()
                goto L_0x0018
            L_0x0017:
                r3 = 0
            L_0x0018:
                int r4 = r9.f351
                androidx.recyclerview.widget.RecyclerView r5 = r9.f349
                if (r5 == 0) goto L_0x0023
                int r5 = r5.getPaddingRight()
                goto L_0x0024
            L_0x0023:
                r5 = 0
            L_0x0024:
                int r4 = r4 - r5
                int r5 = r9.f341
                androidx.recyclerview.widget.RecyclerView r6 = r9.f349
                if (r6 == 0) goto L_0x0030
                int r6 = r6.getPaddingBottom()
                goto L_0x0031
            L_0x0030:
                r6 = 0
            L_0x0031:
                int r5 = r5 - r6
                int r6 = r11.getLeft()
                int r7 = r12.left
                int r6 = r6 + r7
                int r7 = r11.getScrollX()
                int r6 = r6 - r7
                int r7 = r11.getTop()
                int r8 = r12.top
                int r7 = r7 + r8
                int r11 = r11.getScrollY()
                int r7 = r7 - r11
                int r11 = r12.width()
                int r11 = r11 + r6
                int r12 = r12.height()
                int r12 = r12 + r7
                int r6 = r6 - r1
                int r1 = java.lang.Math.min(r2, r6)
                int r7 = r7 - r3
                int r3 = java.lang.Math.min(r2, r7)
                int r11 = r11 - r4
                int r4 = java.lang.Math.max(r2, r11)
                int r12 = r12 - r5
                int r12 = java.lang.Math.max(r2, r12)
                androidx.recyclerview.widget.RecyclerView r5 = r9.f349
                int r5 = o.C0293.m4156(r5)
                r8 = 1
                if (r5 != r8) goto L_0x0079
                if (r4 == 0) goto L_0x0074
                goto L_0x0081
            L_0x0074:
                int r4 = java.lang.Math.max(r1, r11)
                goto L_0x0081
            L_0x0079:
                if (r1 == 0) goto L_0x007c
                goto L_0x0080
            L_0x007c:
                int r1 = java.lang.Math.min(r6, r4)
            L_0x0080:
                r4 = r1
            L_0x0081:
                if (r3 == 0) goto L_0x0084
                goto L_0x0088
            L_0x0084:
                int r3 = java.lang.Math.min(r7, r12)
            L_0x0088:
                r0[r2] = r4
                r0[r8] = r3
                r11 = r0[r2]
                r12 = r0[r8]
                if (r14 == 0) goto L_0x00e7
                android.view.View r14 = r10.getFocusedChild()
                if (r14 != 0) goto L_0x009a
            L_0x0098:
                r14 = 0
                goto L_0x00e5
            L_0x009a:
                androidx.recyclerview.widget.RecyclerView r0 = r9.f349
                if (r0 == 0) goto L_0x00a3
                int r0 = r0.getPaddingLeft()
                goto L_0x00a4
            L_0x00a3:
                r0 = 0
            L_0x00a4:
                androidx.recyclerview.widget.RecyclerView r1 = r9.f349
                if (r1 == 0) goto L_0x00ad
                int r1 = r1.getPaddingTop()
                goto L_0x00ae
            L_0x00ad:
                r1 = 0
            L_0x00ae:
                int r3 = r9.f351
                androidx.recyclerview.widget.RecyclerView r4 = r9.f349
                if (r4 == 0) goto L_0x00b9
                int r4 = r4.getPaddingRight()
                goto L_0x00ba
            L_0x00b9:
                r4 = 0
            L_0x00ba:
                int r3 = r3 - r4
                int r4 = r9.f341
                androidx.recyclerview.widget.RecyclerView r5 = r9.f349
                if (r5 == 0) goto L_0x00c6
                int r5 = r5.getPaddingBottom()
                goto L_0x00c7
            L_0x00c6:
                r5 = 0
            L_0x00c7:
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r9.f349
                android.graphics.Rect r5 = r5.mTempRect
                androidx.recyclerview.widget.RecyclerView.getDecoratedBoundsWithMarginsInt(r14, r5)
                int r14 = r5.left
                int r14 = r14 - r11
                if (r14 >= r3) goto L_0x0098
                int r14 = r5.right
                int r14 = r14 - r11
                if (r14 <= r0) goto L_0x0098
                int r14 = r5.top
                int r14 = r14 - r12
                if (r14 >= r4) goto L_0x0098
                int r14 = r5.bottom
                int r14 = r14 - r12
                if (r14 > r1) goto L_0x00e4
                goto L_0x0098
            L_0x00e4:
                r14 = 1
            L_0x00e5:
                if (r14 == 0) goto L_0x00ec
            L_0x00e7:
                if (r11 != 0) goto L_0x00ed
                if (r12 == 0) goto L_0x00ec
                goto L_0x00ed
            L_0x00ec:
                return r2
            L_0x00ed:
                if (r13 == 0) goto L_0x00f3
                r10.scrollBy(r11, r12)
                goto L_0x00f6
            L_0x00f3:
                r10.smoothScrollBy(r11, r12)
            L_0x00f6:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.IF.m451(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m401(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f349;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f349.canScrollVertically(-1) && !this.f349.canScrollHorizontally(-1) && !this.f349.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                if (this.f349.mAdapter != null) {
                    accessibilityEvent.setItemCount(this.f349.mAdapter.getItemCount());
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$Ι  reason: contains not printable characters */
    public static abstract class C0037 {
        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C0033 r3) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C0033 r3) {
            onDrawOver(canvas, recyclerView);
        }

        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0033 r4) {
            getItemOffsets(rect, ((C0038) view.getLayoutParams()).f388.getLayoutPosition(), recyclerView);
        }
    }

    public static abstract class con {
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public final View itemView;
        int mFlags;
        boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads = null;
        int mPendingAccessibilityState = -1;
        public int mPosition = -1;
        int mPreLayoutPosition = -1;
        AUx mScrapContainer = null;
        con mShadowedHolder = null;
        con mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public con(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* access modifiers changed from: package-private */
        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        /* access modifiers changed from: package-private */
        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((C0038) this.itemView.getLayoutParams()).f390 = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: package-private */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        /* access modifiers changed from: package-private */
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        /* access modifiers changed from: package-private */
        public void unScrap() {
            this.mScrapContainer.m368(this);
        }

        /* access modifiers changed from: package-private */
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: package-private */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: package-private */
        public void setScrapContainer(AUx aUx, boolean z) {
            this.mScrapContainer = aUx;
            this.mInChangeScrap = z;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        /* access modifiers changed from: package-private */
        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        /* access modifiers changed from: package-private */
        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        /* access modifiers changed from: package-private */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                this.mPayloads = new ArrayList();
                this.mUnmodifiedPayloads = Collections.unmodifiableList(this.mPayloads);
            }
        }

        /* access modifiers changed from: package-private */
        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        /* access modifiers changed from: package-private */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: package-private */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* access modifiers changed from: package-private */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C0293.m4217(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            this.mIsRecyclableCount = z ? i - 1 : i + 1;
            int i2 = this.mIsRecyclableCount;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && this.mIsRecyclableCount == 0) {
                this.mFlags &= -17;
            }
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !C0293.m4210(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C0293.m4210(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean setChildImportantForAccessibilityInternal(con con2, int i) {
        if (isComputingLayout()) {
            con2.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(con2);
            return false;
        }
        C0293.m4203(con2.itemView, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            con con2 = this.mPendingAccessibilityImportanceChange.get(size);
            if (con2.itemView.getParent() == this && !con2.shouldIgnore() && (i = con2.mPendingAccessibilityState) != -1) {
                C0293.m4203(con2.itemView, i);
                con2.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    /* access modifiers changed from: package-private */
    public int getAdapterPositionFor(con con2) {
        if (con2.hasAnyOfTheFlags(524) || !con2.isBound()) {
            return -1;
        }
        C0896 r0 = this.mAdapterHelper;
        int i = con2.mPosition;
        int size = r0.f5728.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0896.C0897 r4 = r0.f5728.get(i2);
            int i3 = r4.f5737;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        if (r4.f5735 == i) {
                            i = r4.f5738;
                        } else {
                            if (r4.f5735 < i) {
                                i--;
                            }
                            if (r4.f5738 <= i) {
                                i++;
                            }
                        }
                    }
                } else if (r4.f5735 > i) {
                    continue;
                } else if (r4.f5735 + r4.f5738 > i) {
                    return -1;
                } else {
                    i -= r4.f5738;
                }
            } else if (r4.f5735 <= i) {
                i += r4.f5738;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            StringBuilder sb = new StringBuilder("Trying to set fast scroller without both required drawables.");
            sb.append(exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        Resources resources = getContext().getResources();
        new C0928(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.f158412131165337), resources.getDimensionPixelSize(R.dimen.f158432131165339), resources.getDimensionPixelOffset(R.dimen.f158422131165338));
    }

    public void setNestedScrollingEnabled(boolean z) {
        C2601 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f11846) {
            C0293.m4155(scrollingChildHelper.f11847);
        }
        scrollingChildHelper.f11846 = z;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f11846;
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m13789(i, 0);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().m13789(i, i2);
    }

    public void stopNestedScroll() {
        C2601 scrollingChildHelper = getScrollingChildHelper();
        ViewParent r2 = scrollingChildHelper.m13785(0);
        if (r2 != null) {
            C0301.m4282(r2, scrollingChildHelper.f11847, 0);
            scrollingChildHelper.m13787(0, (ViewParent) null);
        }
    }

    public void stopNestedScroll(int i) {
        C2601 scrollingChildHelper = getScrollingChildHelper();
        ViewParent r1 = scrollingChildHelper.m13785(i);
        if (r1 != null) {
            C0301.m4282(r1, scrollingChildHelper.f11847, i);
            scrollingChildHelper.m13787(i, (ViewParent) null);
        }
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m13785(0) != null;
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().m13785(i) != null;
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m13786(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m13786(i, i2, i3, i4, iArr, i5, (int[]) null);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m13786(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m13790(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m13790(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m13788(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent r1;
        C2601 scrollingChildHelper = getScrollingChildHelper();
        if (!scrollingChildHelper.f11846 || (r1 = scrollingChildHelper.m13785(0)) == null) {
            return false;
        }
        return C0301.m4284(r1, scrollingChildHelper.f11847, f, f2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ι  reason: contains not printable characters */
    public static class C0038 extends ViewGroup.MarginLayoutParams {

        /* renamed from: ı  reason: contains not printable characters */
        con f388;

        /* renamed from: ɩ  reason: contains not printable characters */
        final Rect f389 = new Rect();

        /* renamed from: ι  reason: contains not printable characters */
        boolean f390 = true;

        /* renamed from: Ӏ  reason: contains not printable characters */
        boolean f391 = false;

        public C0038(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0038(int i, int i2) {
            super(i, i2);
        }

        public C0038(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0038(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0038(C0038 r1) {
            super(r1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ǃ  reason: contains not printable characters */
    public static abstract class C0032 {
        /* renamed from: ı  reason: contains not printable characters */
        public void m492() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m493(int i, int i2) {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m494(int i, int i2) {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m496() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m497(int i) {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m495(int i, int i2, Object obj) {
            m492();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$AuX  reason: case insensitive filesystem */
    public static abstract class C3240AuX {
        private IF mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final C0025 mRecyclingAction = new C0025((byte) 0);
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition = -1;
        private View mTargetView;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$AuX$if  reason: invalid class name */
        public interface Cif {
            /* renamed from: ι  reason: contains not printable characters */
            PointF m371(int i);
        }

        /* access modifiers changed from: protected */
        public abstract void onSeekTargetStep(int i, int i2, C0033 r3, C0025 r4);

        /* access modifiers changed from: protected */
        public abstract void onStart();

        /* access modifiers changed from: protected */
        public abstract void onStop();

        /* access modifiers changed from: protected */
        public abstract void onTargetFound(View view, C0033 r2, C0025 r3);

        /* access modifiers changed from: package-private */
        public void start(RecyclerView recyclerView, IF ifR) {
            C0034 r0 = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(r0);
            r0.f380.abortAnimation();
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = ifR;
            if (this.mTargetPosition != -1) {
                this.mRecyclerView.mState.f368 = this.mTargetPosition;
                this.mRunning = true;
                this.mPendingInitialRun = true;
                this.mTargetView = findViewByPosition(getTargetPosition());
                onStart();
                C0034 r4 = this.mRecyclerView.mViewFlinger;
                if (r4.f383) {
                    r4.f385 = true;
                } else {
                    RecyclerView.this.removeCallbacks(r4);
                    C0293.m4204((View) RecyclerView.this, (Runnable) r4);
                }
                this.mStarted = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public PointF computeScrollVectorForPosition(int i) {
            IF layoutManager = getLayoutManager();
            if (layoutManager instanceof Cif) {
                return ((Cif) layoutManager).m371(i);
            }
            Class<Cif> cls = Cif.class;
            return null;
        }

        public IF getLayoutManager() {
            return this.mLayoutManager;
        }

        /* access modifiers changed from: protected */
        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f368 = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                IF ifR = this.mLayoutManager;
                if (ifR.f352 == this) {
                    ifR.f352 = null;
                }
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        /* access modifiers changed from: package-private */
        public void onAnimation(int i, int i2) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (!(!this.mPendingInitialRun || this.mTargetView != null || this.mLayoutManager == null || (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) == null || (computeScrollVectorForPosition.x == 0.0f && computeScrollVectorForPosition.y == 0.0f))) {
                recyclerView.scrollStep((int) Math.signum(computeScrollVectorForPosition.x), (int) Math.signum(computeScrollVectorForPosition.y), (int[]) null);
            }
            boolean z = false;
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.m373(recyclerView);
                    stop();
                } else {
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                if (this.mRecyclingAction.f335 >= 0) {
                    z = true;
                }
                this.mRecyclingAction.m373(recyclerView);
                if (z && this.mRunning) {
                    this.mPendingInitialRun = true;
                    C0034 r6 = recyclerView.mViewFlinger;
                    if (r6.f383) {
                        r6.f385 = true;
                        return;
                    }
                    RecyclerView.this.removeCallbacks(r6);
                    C0293.m4204((View) RecyclerView.this, (Runnable) r6);
                }
            }
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.m421();
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.m411(i);
        }

        /* access modifiers changed from: protected */
        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        /* access modifiers changed from: protected */
        public void normalize(PointF pointF) {
            float sqrt = (float) Math.sqrt((double) ((pointF.x * pointF.x) + (pointF.y * pointF.y)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$AuX$ǃ  reason: contains not printable characters */
        public static class C0025 {

            /* renamed from: ı  reason: contains not printable characters */
            public Interpolator f332;

            /* renamed from: Ɩ  reason: contains not printable characters */
            public boolean f333;

            /* renamed from: ǃ  reason: contains not printable characters */
            public int f334;

            /* renamed from: ɩ  reason: contains not printable characters */
            public int f335;

            /* renamed from: Ι  reason: contains not printable characters */
            public int f336;

            /* renamed from: ι  reason: contains not printable characters */
            public int f337;

            /* renamed from: І  reason: contains not printable characters */
            private int f338;

            public C0025(byte b) {
                this();
            }

            private C0025() {
                this.f335 = -1;
                this.f333 = false;
                this.f338 = 0;
                this.f334 = 0;
                this.f337 = 0;
                this.f336 = RecyclerView.UNDEFINED_DURATION;
                this.f332 = null;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: Ι  reason: contains not printable characters */
            public final void m373(RecyclerView recyclerView) {
                int i = this.f335;
                if (i >= 0) {
                    this.f335 = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f333 = false;
                } else if (this.f333) {
                    m372();
                    recyclerView.mViewFlinger.m501(this.f334, this.f337, this.f336, this.f332);
                    this.f338++;
                    this.f333 = false;
                } else {
                    this.f338 = 0;
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            private void m372() {
                if (this.f332 != null && this.f336 <= 0) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f336 <= 0) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$if  reason: invalid class name */
    static class Cif extends Observable<C0032> {
        Cif() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m488() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m485() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0032) this.mObservers.get(size)).m496();
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m486(int i, int i2) {
            m490(i, i2, (Object) null);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m490(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0032) this.mObservers.get(size)).m495(i, i2, obj);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m489(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0032) this.mObservers.get(size)).m497(i);
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m487(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0032) this.mObservers.get(size)).m493(i, i2);
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m484(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0032) this.mObservers.get(size)).m494(i, i2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ɹ  reason: contains not printable characters */
    public static class C0036 extends C1219 {
        public static final Parcelable.Creator<C0036> CREATOR = new Parcelable.ClassLoaderCreator<C0036>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0036(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C0036[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C0036(parcel, (ClassLoader) null);
            }
        };

        /* renamed from: ɩ  reason: contains not printable characters */
        Parcelable f387;

        C0036(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f387 = parcel.readParcelable(classLoader == null ? IF.class.getClassLoader() : classLoader);
        }

        C0036(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f387, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$ȷ  reason: contains not printable characters */
    public static class C0033 {

        /* renamed from: ı  reason: contains not printable characters */
        public int f366 = 0;

        /* renamed from: Ɩ  reason: contains not printable characters */
        boolean f367 = false;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f368 = -1;

        /* renamed from: ɨ  reason: contains not printable characters */
        int f369;

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f370 = 1;

        /* renamed from: ɪ  reason: contains not printable characters */
        int f371;

        /* renamed from: ɹ  reason: contains not printable characters */
        public boolean f372 = false;

        /* renamed from: ɾ  reason: contains not printable characters */
        long f373;

        /* renamed from: Ι  reason: contains not printable characters */
        public int f374 = 0;

        /* renamed from: ι  reason: contains not printable characters */
        public int f375 = 0;

        /* renamed from: І  reason: contains not printable characters */
        public boolean f376 = false;

        /* renamed from: і  reason: contains not printable characters */
        boolean f377 = false;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public boolean f378 = false;

        /* renamed from: ӏ  reason: contains not printable characters */
        boolean f379 = false;

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m498(int i) {
            if ((this.f370 & i) == 0) {
                StringBuilder sb = new StringBuilder("Layout state should be one of ");
                sb.append(Integer.toBinaryString(i));
                sb.append(" but it is ");
                sb.append(Integer.toBinaryString(this.f370));
                throw new IllegalStateException(sb.toString());
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.f368);
            sb.append(", mData=");
            sb.append((Object) null);
            sb.append(", mItemCount=");
            sb.append(this.f366);
            sb.append(", mIsMeasuring=");
            sb.append(this.f372);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.f375);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.f374);
            sb.append(", mStructureChanged=");
            sb.append(this.f377);
            sb.append(", mInPreLayout=");
            sb.append(this.f378);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.f367);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.f379);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$aux  reason: case insensitive filesystem */
    class C3245aux implements C3246iF.C0028 {
        C3245aux() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m481(con con) {
            con.setIsRecyclable(true);
            if (con.mShadowedHolder != null && con.mShadowingHolder == null) {
                con.mShadowedHolder = null;
            }
            con.mShadowingHolder = null;
            if (!con.shouldBeKeptAsChild() && !RecyclerView.this.removeAnimatingView(con.itemView) && con.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(con.itemView, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$iF  reason: case insensitive filesystem */
    public static abstract class C3246iF {
        private long mAddDuration = 120;
        private long mChangeDuration = 250;
        private ArrayList<Object> mFinishedListeners = new ArrayList<>();
        private C0028 mListener = null;
        private long mMoveDuration = 250;
        private long mRemoveDuration = 120;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$iF$ı  reason: contains not printable characters */
        interface C0028 {
            /* renamed from: ɩ  reason: contains not printable characters */
            void m482(con con);
        }

        public abstract boolean animateAppearance(con con, C0029 r2, C0029 r3);

        public abstract boolean animateChange(con con, con con2, C0029 r3, C0029 r4);

        public abstract boolean animateDisappearance(con con, C0029 r2, C0029 r3);

        public abstract boolean animatePersistence(con con, C0029 r2, C0029 r3);

        public boolean canReuseUpdatedViewHolder(con con) {
            return true;
        }

        public abstract void endAnimation(con con);

        public abstract void endAnimations();

        public abstract boolean isRunning();

        public void onAnimationFinished(con con) {
        }

        public abstract void runPendingAnimations();

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        /* access modifiers changed from: package-private */
        public void setListener(C0028 r1) {
            this.mListener = r1;
        }

        public C0029 recordPreLayoutInformation(C0033 r1, con con, int i, List<Object> list) {
            return obtainHolderInfo().m483(con);
        }

        public C0029 recordPostLayoutInformation(C0033 r1, con con) {
            return obtainHolderInfo().m483(con);
        }

        static int buildAdapterChangeFlagsForAnimations(con con) {
            int i = con.mFlags & 14;
            if (con.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int oldPosition = con.getOldPosition();
            int adapterPosition = con.getAdapterPosition();
            return (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) ? i : i | 2048;
        }

        public final void dispatchAnimationFinished(con con) {
            onAnimationFinished(con);
            C0028 r0 = this.mListener;
            if (r0 != null) {
                r0.m482(con);
            }
        }

        public boolean canReuseUpdatedViewHolder(con con, List<Object> list) {
            return canReuseUpdatedViewHolder(con);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i = 0; i < size; i++) {
                this.mFinishedListeners.get(i);
            }
            this.mFinishedListeners.clear();
        }

        public C0029 obtainHolderInfo() {
            return new C0029();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$iF$ɩ  reason: contains not printable characters */
        public static class C0029 {

            /* renamed from: ı  reason: contains not printable characters */
            public int f364;

            /* renamed from: Ι  reason: contains not printable characters */
            public int f365;

            /* renamed from: ı  reason: contains not printable characters */
            public final C0029 m483(con con) {
                View view = con.itemView;
                this.f365 = view.getLeft();
                this.f364 = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C3242If ifR = this.mChildDrawingOrderCallback;
        if (ifR == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return ifR.m472();
    }

    private C2601 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C2601(this);
        }
        return this.mScrollingChildHelper;
    }
}
