package o;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ViewGroup;
import o.C2319;

/* renamed from: o.ʟι  reason: contains not printable characters */
public final class C1688 {

    /* renamed from: ı  reason: contains not printable characters */
    public final C1277 f8760;

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f8761 = -1;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1545 f8762;

    C1688(C1545 r2, C1277 r3) {
        this.f8762 = r2;
        this.f8760 = r3;
    }

    C1688(C1545 r2, ClassLoader classLoader, C1469 r4, C1674 r5) {
        this.f8762 = r2;
        this.f8760 = r4.m8798(classLoader, r5.f8695);
        if (r5.f8699 != null) {
            r5.f8699.setClassLoader(classLoader);
        }
        this.f8760.setArguments(r5.f8699);
        this.f8760.mWho = r5.f8696;
        this.f8760.mFromLayout = r5.f8692;
        C1277 r22 = this.f8760;
        r22.mRestored = true;
        r22.mFragmentId = r5.f8689;
        this.f8760.mContainerId = r5.f8687;
        this.f8760.mTag = r5.f8688;
        this.f8760.mRetainInstance = r5.f8698;
        this.f8760.mRemoving = r5.f8697;
        this.f8760.mDetached = r5.f8693;
        this.f8760.mHidden = r5.f8691;
        this.f8760.mMaxState = C2319.Cif.values()[r5.f8694];
        if (r5.f8690 != null) {
            this.f8760.mSavedFragmentState = r5.f8690;
        } else {
            this.f8760.mSavedFragmentState = new Bundle();
        }
        C1550.m9081(2);
    }

    C1688(C1545 r2, C1277 r3, C1674 r4) {
        this.f8762 = r2;
        this.f8760 = r3;
        C1277 r22 = this.f8760;
        r22.mSavedViewState = null;
        r22.mBackStackNesting = 0;
        r22.mInLayout = false;
        r22.mAdded = false;
        r22.mTargetWho = r22.mTarget != null ? this.f8760.mTarget.mWho : null;
        this.f8760.mTarget = null;
        if (r4.f8690 != null) {
            this.f8760.mSavedFragmentState = r4.f8690;
        } else {
            this.f8760.mSavedFragmentState = new Bundle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m9588() {
        int i = this.f8761;
        if (this.f8760.mFromLayout) {
            if (this.f8760.mInLayout) {
                i = Math.max(this.f8761, 1);
            } else if (this.f8761 < 2) {
                i = Math.min(i, this.f8760.mState);
            } else {
                i = Math.min(i, 1);
            }
        }
        if (!this.f8760.mAdded) {
            i = Math.min(i, 1);
        }
        if (this.f8760.mRemoving) {
            if (this.f8760.isInBackStack()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        if (this.f8760.mDeferStart && this.f8760.mState < 3) {
            i = Math.min(i, 2);
        }
        int i2 = AnonymousClass1.f8763[this.f8760.mMaxState.ordinal()];
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return Math.min(i, 3);
        }
        if (i2 != 3) {
            return Math.min(i, -1);
        }
        return Math.min(i, 1);
    }

    /* renamed from: o.ʟι$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: Ι  reason: contains not printable characters */
        static final /* synthetic */ int[] f8763 = new int[C2319.Cif.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                o.Іӏ$if[] r0 = o.C2319.Cif.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8763 = r0
                int[] r0 = f8763     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.Іӏ$if r1 = o.C2319.Cif.RESUMED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f8763     // Catch:{ NoSuchFieldError -> 0x001f }
                o.Іӏ$if r1 = o.C2319.Cif.STARTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f8763     // Catch:{ NoSuchFieldError -> 0x002a }
                o.Іӏ$if r1 = o.C2319.Cif.CREATED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1688.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9584() {
        if (this.f8760.mFromLayout && this.f8760.mInLayout && !this.f8760.mPerformedCreateView) {
            C1550.m9081(3);
            C1277 r0 = this.f8760;
            r0.performCreateView(r0.performGetLayoutInflater(r0.mSavedFragmentState), (ViewGroup) null, this.f8760.mSavedFragmentState);
            if (this.f8760.mView != null) {
                this.f8760.mView.setSaveFromParentEnabled(false);
                this.f8760.mView.setTag(R.id.f165312131362065, this.f8760);
                if (this.f8760.mHidden) {
                    this.f8760.mView.setVisibility(8);
                }
                C1277 r02 = this.f8760;
                r02.onViewCreated(r02.mView, this.f8760.mSavedFragmentState);
                C1545 r03 = this.f8762;
                C1277 r2 = this.f8760;
                r03.m9053(r2, r2.mView, this.f8760.mSavedFragmentState, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9590(ClassLoader classLoader) {
        if (this.f8760.mSavedFragmentState != null) {
            this.f8760.mSavedFragmentState.setClassLoader(classLoader);
            C1277 r4 = this.f8760;
            r4.mSavedViewState = r4.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            C1277 r42 = this.f8760;
            r42.mTargetWho = r42.mSavedFragmentState.getString("android:target_state");
            if (this.f8760.mTargetWho != null) {
                C1277 r43 = this.f8760;
                r43.mTargetRequestCode = r43.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            if (this.f8760.mSavedUserVisibleHint != null) {
                C1277 r44 = this.f8760;
                r44.mUserVisibleHint = r44.mSavedUserVisibleHint.booleanValue();
                this.f8760.mSavedUserVisibleHint = null;
            } else {
                C1277 r45 = this.f8760;
                r45.mUserVisibleHint = r45.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            if (!this.f8760.mUserVisibleHint) {
                this.f8760.mDeferStart = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9593(C1472<?> r2, C1550 r3, C1277 r4) {
        C1277 r0 = this.f8760;
        r0.mHost = r2;
        r0.mParentFragment = r4;
        r0.mFragmentManager = r3;
        this.f8762.m9042(r0, r2.f7905);
        this.f8760.performAttach();
        if (this.f8760.mParentFragment == null) {
            r2.m8836(this.f8760);
        } else {
            this.f8760.mParentFragment.onAttachFragment(this.f8760);
        }
        this.f8762.m9048(this.f8760, r2.f7905);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9592() {
        C1550.m9081(3);
        if (!this.f8760.mIsCreated) {
            C1545 r0 = this.f8762;
            C1277 r1 = this.f8760;
            r0.m9051(r1, r1.mSavedFragmentState);
            C1277 r02 = this.f8760;
            r02.performCreate(r02.mSavedFragmentState);
            C1545 r03 = this.f8762;
            C1277 r12 = this.f8760;
            r03.m9046(r12, r12.mSavedFragmentState);
            return;
        }
        C1277 r04 = this.f8760;
        r04.restoreChildFragmentState(r04.mSavedFragmentState);
        this.f8760.mState = 1;
    }

    /* JADX WARNING: type inference failed for: r5v20, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m9585(o.C1380 r5) {
        /*
            r4 = this;
            o.ɩʟ r0 = r4.f8760
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 3
            o.C1550.m9081((int) r0)
            r0 = 0
            o.ɩʟ r1 = r4.f8760
            android.view.ViewGroup r1 = r1.mContainer
            if (r1 == 0) goto L_0x0018
            o.ɩʟ r5 = r4.f8760
            android.view.ViewGroup r0 = r5.mContainer
            goto L_0x0093
        L_0x0018:
            o.ɩʟ r1 = r4.f8760
            int r1 = r1.mContainerId
            if (r1 == 0) goto L_0x0093
            o.ɩʟ r0 = r4.f8760
            int r0 = r0.mContainerId
            r1 = -1
            if (r0 == r1) goto L_0x0078
            o.ɩʟ r0 = r4.f8760
            int r0 = r0.mContainerId
            android.view.View r5 = r5.m8524(r0)
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0093
            o.ɩʟ r5 = r4.f8760
            boolean r5 = r5.mRestored
            if (r5 == 0) goto L_0x0039
            goto L_0x0093
        L_0x0039:
            o.ɩʟ r5 = r4.f8760     // Catch:{ NotFoundException -> 0x0048 }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ NotFoundException -> 0x0048 }
            o.ɩʟ r0 = r4.f8760     // Catch:{ NotFoundException -> 0x0048 }
            int r0 = r0.mContainerId     // Catch:{ NotFoundException -> 0x0048 }
            java.lang.String r5 = r5.getResourceName(r0)     // Catch:{ NotFoundException -> 0x0048 }
            goto L_0x004a
        L_0x0048:
            java.lang.String r5 = "unknown"
        L_0x004a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No view found for id 0x"
            r1.<init>(r2)
            o.ɩʟ r2 = r4.f8760
            int r2 = r2.mContainerId
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ") for fragment "
            r1.append(r5)
            o.ɩʟ r5 = r4.f8760
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0078:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot create fragment "
            r0.<init>(r1)
            o.ɩʟ r1 = r4.f8760
            r0.append(r1)
            java.lang.String r1 = " for a container view with no id"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0093:
            o.ɩʟ r5 = r4.f8760
            r5.mContainer = r0
            android.os.Bundle r1 = r5.mSavedFragmentState
            android.view.LayoutInflater r1 = r5.performGetLayoutInflater(r1)
            o.ɩʟ r2 = r4.f8760
            android.os.Bundle r2 = r2.mSavedFragmentState
            r5.performCreateView(r1, r0, r2)
            o.ɩʟ r5 = r4.f8760
            android.view.View r5 = r5.mView
            if (r5 == 0) goto L_0x0108
            o.ɩʟ r5 = r4.f8760
            android.view.View r5 = r5.mView
            r1 = 0
            r5.setSaveFromParentEnabled(r1)
            o.ɩʟ r5 = r4.f8760
            android.view.View r5 = r5.mView
            r2 = 2131362065(0x7f0a0111, float:1.83439E38)
            o.ɩʟ r3 = r4.f8760
            r5.setTag(r2, r3)
            if (r0 == 0) goto L_0x00c7
            o.ɩʟ r5 = r4.f8760
            android.view.View r5 = r5.mView
            r0.addView(r5)
        L_0x00c7:
            o.ɩʟ r5 = r4.f8760
            boolean r5 = r5.mHidden
            if (r5 == 0) goto L_0x00d6
            o.ɩʟ r5 = r4.f8760
            android.view.View r5 = r5.mView
            r0 = 8
            r5.setVisibility(r0)
        L_0x00d6:
            o.ɩʟ r5 = r4.f8760
            android.view.View r5 = r5.mView
            o.C0293.m4154(r5)
            o.ɩʟ r5 = r4.f8760
            android.view.View r0 = r5.mView
            o.ɩʟ r2 = r4.f8760
            android.os.Bundle r2 = r2.mSavedFragmentState
            r5.onViewCreated(r0, r2)
            o.ɾɩ r5 = r4.f8762
            o.ɩʟ r0 = r4.f8760
            android.view.View r2 = r0.mView
            o.ɩʟ r3 = r4.f8760
            android.os.Bundle r3 = r3.mSavedFragmentState
            r5.m9053(r0, r2, r3, r1)
            o.ɩʟ r5 = r4.f8760
            android.view.View r0 = r5.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0106
            o.ɩʟ r0 = r4.f8760
            android.view.ViewGroup r0 = r0.mContainer
            if (r0 == 0) goto L_0x0106
            r1 = 1
        L_0x0106:
            r5.mIsNewlyAdded = r1
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1688.m9585(o.ɪι):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9589() {
        C1550.m9081(3);
        C1277 r0 = this.f8760;
        r0.performActivityCreated(r0.mSavedFragmentState);
        C1545 r02 = this.f8762;
        C1277 r1 = this.f8760;
        r02.m9043(r1, r1.mSavedFragmentState);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m9595() {
        C1550.m9081(3);
        if (this.f8760.mView != null) {
            C1277 r0 = this.f8760;
            r0.restoreViewState(r0.mSavedFragmentState);
        }
        this.f8760.mSavedFragmentState = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m9587() {
        C1550.m9081(3);
        this.f8760.performStart();
        this.f8762.m9050(this.f8760);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public final void m9597() {
        C1550.m9081(3);
        this.f8760.performResume();
        this.f8762.m9045(this.f8760);
        C1277 r0 = this.f8760;
        r0.mSavedFragmentState = null;
        r0.mSavedViewState = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m9591() {
        C1550.m9081(3);
        this.f8760.performPause();
        this.f8762.m9052(this.f8760);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m9598() {
        C1550.m9081(3);
        this.f8760.performStop();
        this.f8762.m9041(this.f8760);
    }

    /* renamed from: І  reason: contains not printable characters */
    public final Bundle m9596() {
        Bundle bundle = new Bundle();
        this.f8760.performSaveInstanceState(bundle);
        this.f8762.m9049(this.f8760, bundle);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f8760.mView != null) {
            m9599();
        }
        if (this.f8760.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f8760.mSavedViewState);
        }
        if (!this.f8760.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f8760.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ӏ  reason: contains not printable characters */
    public final void m9599() {
        if (this.f8760.mView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f8760.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f8760.mSavedViewState = sparseArray;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m9594(o.C1472<?> r6, o.C1609 r7) {
        /*
            r5 = this;
            r0 = 3
            o.C1550.m9081((int) r0)
            o.ɩʟ r0 = r5.f8760
            boolean r0 = r0.mRemoving
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0016
            o.ɩʟ r0 = r5.f8760
            boolean r0 = r0.isInBackStack()
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 != 0) goto L_0x0032
            o.ɩʟ r3 = r5.f8760
            java.util.HashMap<java.lang.String, o.ɩʟ> r4 = r7.f8515
            java.lang.String r3 = r3.mWho
            boolean r3 = r4.containsKey(r3)
            if (r3 == 0) goto L_0x002c
            boolean r3 = r7.f8516
            if (r3 == 0) goto L_0x002c
            boolean r3 = r7.f8517
            goto L_0x002d
        L_0x002c:
            r3 = 1
        L_0x002d:
            if (r3 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r3 = 0
            goto L_0x0033
        L_0x0032:
            r3 = 1
        L_0x0033:
            if (r3 == 0) goto L_0x0061
            boolean r1 = r6 instanceof o.C0350
            if (r1 == 0) goto L_0x003c
            boolean r2 = r7.f8517
            goto L_0x004b
        L_0x003c:
            android.content.Context r1 = r6.f7905
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004b
            android.content.Context r6 = r6.f7905
            android.app.Activity r6 = (android.app.Activity) r6
            boolean r6 = r6.isChangingConfigurations()
            r2 = r2 ^ r6
        L_0x004b:
            if (r0 != 0) goto L_0x004f
            if (r2 == 0) goto L_0x0054
        L_0x004f:
            o.ɩʟ r6 = r5.f8760
            r7.m9343(r6)
        L_0x0054:
            o.ɩʟ r6 = r5.f8760
            r6.performDestroy()
            o.ɾɩ r6 = r5.f8762
            o.ɩʟ r7 = r5.f8760
            r6.m9054(r7)
            return
        L_0x0061:
            o.ɩʟ r6 = r5.f8760
            r6.mState = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1688.m9594(o.ɹі, o.ʅı):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9586(C1609 r5) {
        C1550.m9081(3);
        this.f8760.performDetach();
        this.f8762.m9044(this.f8760);
        C1277 r1 = this.f8760;
        r1.mState = -1;
        r1.mHost = null;
        r1.mParentFragment = null;
        r1.mFragmentManager = null;
        boolean z = true;
        if (!(r1.mRemoving && !this.f8760.isInBackStack())) {
            if (r5.f8515.containsKey(this.f8760.mWho) && r5.f8516) {
                z = r5.f8517;
            }
            if (!z) {
                return;
            }
        }
        C1550.m9081(3);
        this.f8760.initState();
    }
}
