package o;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment$2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import o.C2319;
import o.C3169;

/* renamed from: o.ɩʟ  reason: contains not printable characters */
public class C1277 implements ComponentCallbacks, View.OnCreateContextMenuListener, C0350, C2416, C1568 {
    static final Object USE_DEFAULT_TRANSITION = new Object();
    public boolean mAdded;
    C1278 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;
    C1550 mChildFragmentManager = new C1473();
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    private C3169.C3172 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    public int mFragmentId;
    public C1550 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    public C1472<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment = null;
    LayoutInflater mLayoutInflater;
    C2656 mLifecycleRegistry;
    C2319.Cif mMaxState = C2319.Cif.RESUMED;
    boolean mMenuVisible = true;
    C1277 mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable = new Runnable() {
        public final void run() {
            C1277.this.startPostponedEnterTransition();
        }
    };
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    C1554 mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    SparseArray<Parcelable> mSavedViewState;
    public int mState = -1;
    public String mTag;
    public C1277 mTarget;
    public int mTargetRequestCode;
    public String mTargetWho = null;
    boolean mUserVisibleHint = true;
    public View mView;
    C1903 mViewLifecycleOwner;
    C2687<C2851> mViewLifecycleOwnerLiveData = new C2687<>();
    public String mWho = UUID.randomUUID().toString();

    /* renamed from: o.ɩʟ$If */
    interface If {
        /* renamed from: Ι  reason: contains not printable characters */
        void m8191();

        /* renamed from: ι  reason: contains not printable characters */
        void m8192();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttachFragment(C1277 r1) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onDestroyOptionsMenu() {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public C2319 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public C2851 getViewLifecycleOwner() {
        C1903 r0 = this.mViewLifecycleOwner;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public C0307 getViewModelStore() {
        C1550 r0 = this.mFragmentManager;
        if (r0 != null) {
            return r0.m9112(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public C3169.C3172 getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new C0333(requireActivity().getApplication(), this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final C1555 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m9163();
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: o.ɩʟ$ɩ  reason: contains not printable characters */
    public static class C1280 implements Parcelable {
        public static final Parcelable.Creator<C1280> CREATOR = new Parcelable.ClassLoaderCreator<C1280>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1280(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C1280[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C1280(parcel, (ClassLoader) null);
            }
        };

        /* renamed from: ǃ  reason: contains not printable characters */
        final Bundle f7219;

        public int describeContents() {
            return 0;
        }

        C1280(Bundle bundle) {
            this.f7219 = bundle;
        }

        C1280(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle;
            this.f7219 = parcel.readBundle();
            if (classLoader != null && (bundle = this.f7219) != null) {
                bundle.setClassLoader(classLoader);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f7219);
        }
    }

    /* renamed from: o.ɩʟ$ǃ  reason: contains not printable characters */
    public static class C1279 extends RuntimeException {
        public C1279(String str, Exception exc) {
            super(str, exc);
        }
    }

    public C1277() {
        initLifecycle();
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C2656(this);
        this.mSavedStateRegistryController = C1554.m9161((C1568) this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.mLifecycleRegistry.m14072((C2608) new Fragment$2(this));
        }
    }

    @Deprecated
    public static C1277 instantiate(Context context, String str, Bundle bundle) {
        try {
            C1277 r4 = (C1277) C1469.m8797(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(r4.getClass().getClassLoader());
                r4.setArguments(bundle);
            }
            return r4;
        } catch (InstantiationException e) {
            throw new C1279("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C1279("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C1279("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C1279("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* access modifiers changed from: package-private */
    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C1993("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.m10374(C2319.C2320.ON_CREATE);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        sb.append(")");
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final boolean isStateSaved() {
        C1550 r0 = this.mFragmentManager;
        if (r0 == null) {
            return false;
        }
        return r0.m9137();
    }

    public void setInitialSavedState(C1280 r2) {
        if (this.mFragmentManager == null) {
            this.mSavedFragmentState = (r2 == null || r2.f7219 == null) ? null : r2.f7219;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public final C1277 getTargetFragment() {
        String str;
        C1277 r0 = this.mTarget;
        if (r0 != null) {
            return r0;
        }
        C1550 r02 = this.mFragmentManager;
        if (r02 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return r02.m9098(str);
    }

    public Context getContext() {
        C1472<?> r0 = this.mHost;
        if (r0 == null) {
            return null;
        }
        return r0.m8833();
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final C1269 getActivity() {
        C1472<?> r0 = this.mHost;
        if (r0 == null) {
            return null;
        }
        return (C1269) r0.m8839();
    }

    public final C1269 requireActivity() {
        C1269 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Object getHost() {
        C1472<?> r0 = this.mHost;
        if (r0 == null) {
            return null;
        }
        return r0.m8834();
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @Deprecated
    public final C1550 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final C1550 getParentFragmentManager() {
        C1550 r0 = this.mFragmentManager;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final C1550 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final C1277 getParentFragment() {
        return this.mParentFragment;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    /* access modifiers changed from: package-private */
    public final boolean isRemovingParent() {
        C1277 parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.mView;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isVisible() {
        /*
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1277.isVisible():boolean");
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        C1550 r0 = this.mFragmentManager;
        if (r0 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            r0.m9139(this);
        } else {
            r0.m9091(this);
        }
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.m8831();
            }
        }
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.m9097(this);
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 3 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        C1472<?> r0 = this.mHost;
        if (r0 != null) {
            r0.m8826(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, (Bundle) null);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        C1472<?> r0 = this.mHost;
        if (r0 != null) {
            r0.m8826(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final void requestPermissions(String[] strArr, int i) {
        C1472<?> r0 = this.mHost;
        if (r0 != null) {
            r0.m8837(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        C1472<?> r0 = this.mHost;
        if (r0 != null) {
            return r0.m8832(str);
        }
        return false;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        this.mLayoutInflater = onGetLayoutInflater(bundle);
        return this.mLayoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        C1472<?> r2 = this.mHost;
        if (r2 != null) {
            LayoutInflater r22 = r2.m8829();
            C2546.m13574(r22, this.mChildFragmentManager.m9094());
            return r22;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        C1472<?> r2 = this.mHost;
        Activity r22 = r2 == null ? null : r2.m8839();
        if (r22 != null) {
            this.mCalled = false;
            onInflate(r22, attributeSet, bundle);
        }
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        C1472<?> r2 = this.mHost;
        Activity r22 = r2 == null ? null : r2.m8839();
        if (r22 != null) {
            this.mCalled = false;
            onAttach(r22);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.m9102(1)) {
            this.mChildFragmentManager.m9096();
        }
    }

    /* access modifiers changed from: package-private */
    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.m9134(parcelable);
            this.mChildFragmentManager.m9096();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public View getView() {
        return this.mView;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    /* access modifiers changed from: package-private */
    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C1473();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public Object getEnterTransition() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.f7216;
    }

    public Object getReturnTransition() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.f7214 == USE_DEFAULT_TRANSITION ? getEnterTransition() : this.mAnimationInfo.f7214;
    }

    public Object getExitTransition() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.f7217;
    }

    public Object getReenterTransition() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.f7203 == USE_DEFAULT_TRANSITION ? getExitTransition() : this.mAnimationInfo.f7203;
    }

    public Object getSharedElementEnterTransition() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.f7209;
    }

    public Object getSharedElementReturnTransition() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.f7205 == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : this.mAnimationInfo.f7205;
    }

    public boolean getAllowEnterTransitionOverlap() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null || r0.f7206 == null) {
            return true;
        }
        return this.mAnimationInfo.f7206.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null || r0.f7208 == null) {
            return true;
        }
        return this.mAnimationInfo.f7208.booleanValue();
    }

    public void startPostponedEnterTransition() {
        C1550 r0 = this.mFragmentManager;
        if (r0 == null || r0.f8263 == null) {
            ensureAnimationInfo().f7215 = false;
        } else if (Looper.myLooper() != this.mFragmentManager.f8263.m8828().getLooper()) {
            this.mFragmentManager.f8263.m8828().postAtFrontOfQueue(new Runnable() {
                public final void run() {
                    C1277.this.callStartTransitionListener();
                }
            });
        } else {
            callStartTransitionListener();
        }
    }

    /* access modifiers changed from: package-private */
    public void callStartTransitionListener() {
        If ifR;
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            ifR = null;
        } else {
            r0.f7215 = false;
            ifR = r0.f7202;
            this.mAnimationInfo.f7202 = null;
        }
        if (ifR != null) {
            ifR.m8192();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        C1277 targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            C0401.m4684(this).m4685(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        C1550 r0 = this.mChildFragmentManager;
        r0.m9090(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public C1277 findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.m9088(str);
    }

    /* access modifiers changed from: package-private */
    public void performAttach() {
        this.mChildFragmentManager.m9120(this.mHost, new C1380() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public final View m8190(int i) {
                if (C1277.this.mView != null) {
                    return C1277.this.mView.findViewById(i);
                }
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(this);
                sb.append(" does not have a view");
                throw new IllegalStateException(sb.toString());
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final boolean m8189() {
                return C1277.this.mView != null;
            }
        }, this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m8833());
        if (!this.mCalled) {
            throw new C1993("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m9147();
        this.mState = 1;
        this.mCalled = false;
        this.mSavedStateRegistryController.m9164(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m14066(C2319.C2320.ON_CREATE);
            return;
        }
        throw new C1993("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m9147();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C1903();
        this.mView = onCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m10373();
            this.mViewLifecycleOwnerLiveData.m14290(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.m10372()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m9147();
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            this.mChildFragmentManager.m9145();
            return;
        }
        throw new C1993("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public void performStart() {
        this.mChildFragmentManager.m9147();
        this.mChildFragmentManager.m9141(true);
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            this.mLifecycleRegistry.m14066(C2319.C2320.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleOwner.m10374(C2319.C2320.ON_START);
            }
            this.mChildFragmentManager.m9149();
            return;
        }
        throw new C1993("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    public void performResume() {
        this.mChildFragmentManager.m9147();
        this.mChildFragmentManager.m9141(true);
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            this.mLifecycleRegistry.m14066(C2319.C2320.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleOwner.m10374(C2319.C2320.ON_RESUME);
            }
            this.mChildFragmentManager.m9128();
            return;
        }
        throw new C1993("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void noteStateNotSaved() {
        this.mChildFragmentManager.m9147();
    }

    /* access modifiers changed from: package-private */
    public void performPrimaryNavigationFragmentChanged() {
        boolean r0 = this.mFragmentManager.m9107(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != r0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(r0);
            onPrimaryNavigationFragmentChanged(r0);
            this.mChildFragmentManager.m9095();
        }
    }

    /* access modifiers changed from: package-private */
    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.m9101(z);
    }

    /* access modifiers changed from: package-private */
    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.m9093(z);
    }

    /* access modifiers changed from: package-private */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.m9089(configuration);
    }

    /* access modifiers changed from: package-private */
    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.m9129();
    }

    /* access modifiers changed from: package-private */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.m9122(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.m9104(menu);
    }

    /* access modifiers changed from: package-private */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if ((!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) && !this.mChildFragmentManager.m9105(menuItem)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!onContextItemSelected(menuItem) && !this.mChildFragmentManager.m9123(menuItem)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.m9117(menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m9162(bundle);
        Parcelable r0 = this.mChildFragmentManager.m9142();
        if (r0 != null) {
            bundle.putParcelable("android:support:fragments", r0);
        }
    }

    /* access modifiers changed from: package-private */
    public void performPause() {
        this.mChildFragmentManager.m9108();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m10374(C2319.C2320.ON_PAUSE);
        }
        this.mLifecycleRegistry.m14066(C2319.C2320.ON_PAUSE);
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C1993("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performStop() {
        this.mChildFragmentManager.m9110();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m10374(C2319.C2320.ON_STOP);
        }
        this.mLifecycleRegistry.m14066(C2319.C2320.ON_STOP);
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C1993("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroyView() {
        this.mChildFragmentManager.m9124();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m10374(C2319.C2320.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C0401.m4684(this).m4686();
            this.mPerformedCreateView = false;
            return;
        }
        throw new C1993("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void performDestroy() {
        this.mChildFragmentManager.m9144();
        this.mLifecycleRegistry.m14066(C2319.C2320.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C1993("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new C1993("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.mChildFragmentManager.m9140()) {
            this.mChildFragmentManager.m9144();
            this.mChildFragmentManager = new C1473();
        }
    }

    /* access modifiers changed from: package-private */
    public void setOnStartEnterTransitionListener(If ifR) {
        ensureAnimationInfo();
        if (ifR != this.mAnimationInfo.f7202) {
            if (ifR == null || this.mAnimationInfo.f7202 == null) {
                if (this.mAnimationInfo.f7215) {
                    this.mAnimationInfo.f7202 = ifR;
                }
                if (ifR != null) {
                    ifR.m8191();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    private C1278 ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C1278();
        }
        return this.mAnimationInfo;
    }

    /* access modifiers changed from: package-private */
    public int getNextAnim() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return 0;
        }
        return r0.f7213;
    }

    /* access modifiers changed from: package-private */
    public void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().f7213 = i;
        }
    }

    /* access modifiers changed from: package-private */
    public int getNextTransition() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return 0;
        }
        return r0.f7207;
    }

    /* access modifiers changed from: package-private */
    public void setNextTransition(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f7207 = i;
        }
    }

    /* access modifiers changed from: package-private */
    public C0409 getEnterTransitionCallback() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.f7210;
    }

    /* access modifiers changed from: package-private */
    public C0409 getExitTransitionCallback() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.f7218;
    }

    /* access modifiers changed from: package-private */
    public View getAnimatingAway() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.f7212;
    }

    /* access modifiers changed from: package-private */
    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f7212 = view;
    }

    /* access modifiers changed from: package-private */
    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f7204 = animator;
    }

    /* access modifiers changed from: package-private */
    public Animator getAnimator() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return null;
        }
        return r0.f7204;
    }

    /* access modifiers changed from: package-private */
    public int getStateAfterAnimating() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return 0;
        }
        return r0.f7201;
    }

    /* access modifiers changed from: package-private */
    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().f7201 = i;
    }

    /* access modifiers changed from: package-private */
    public boolean isPostponed() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return false;
        }
        return r0.f7215;
    }

    /* access modifiers changed from: package-private */
    public boolean isHideReplaced() {
        C1278 r0 = this.mAnimationInfo;
        if (r0 == null) {
            return false;
        }
        return r0.f7211;
    }

    /* access modifiers changed from: package-private */
    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().f7211 = z;
    }

    /* renamed from: o.ɩʟ$ı  reason: contains not printable characters */
    static class C1278 {

        /* renamed from: ı  reason: contains not printable characters */
        int f7201;

        /* renamed from: ł  reason: contains not printable characters */
        If f7202;

        /* renamed from: Ɩ  reason: contains not printable characters */
        Object f7203 = C1277.USE_DEFAULT_TRANSITION;

        /* renamed from: ǃ  reason: contains not printable characters */
        Animator f7204;

        /* renamed from: ȷ  reason: contains not printable characters */
        Object f7205 = C1277.USE_DEFAULT_TRANSITION;

        /* renamed from: ɨ  reason: contains not printable characters */
        Boolean f7206;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f7207;

        /* renamed from: ɪ  reason: contains not printable characters */
        Boolean f7208;

        /* renamed from: ɹ  reason: contains not printable characters */
        Object f7209 = null;

        /* renamed from: ɾ  reason: contains not printable characters */
        C0409 f7210 = null;

        /* renamed from: ʟ  reason: contains not printable characters */
        boolean f7211;

        /* renamed from: Ι  reason: contains not printable characters */
        View f7212;

        /* renamed from: ι  reason: contains not printable characters */
        int f7213;

        /* renamed from: І  reason: contains not printable characters */
        Object f7214 = C1277.USE_DEFAULT_TRANSITION;

        /* renamed from: г  reason: contains not printable characters */
        boolean f7215;

        /* renamed from: і  reason: contains not printable characters */
        Object f7216 = null;

        /* renamed from: Ӏ  reason: contains not printable characters */
        Object f7217 = null;

        /* renamed from: ӏ  reason: contains not printable characters */
        C0409 f7218 = null;

        C1278() {
        }
    }
}
