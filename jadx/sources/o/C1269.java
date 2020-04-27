package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.C2319;
import o.C2944;

/* renamed from: o.ɩɿ  reason: contains not printable characters */
public class C1269 extends C2557 implements C2944.C2946, C2944.Cif {
    boolean mCreated;
    final C2656 mFragmentLifecycleRegistry = new C2656(this);
    final C1471 mFragments = C1471.m8801((C1472<?>) new C1270());
    int mNextCandidateRequestIndex;
    C1286<String> mPendingFragmentActivityResults;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mStartedActivityFromFragment;
    boolean mStartedIntentSenderFromFragment;
    boolean mStopped = true;

    public void onAttachFragment(C1277 r1) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.m8802();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String r1 = this.mPendingFragmentActivityResults.m8216(i4);
            this.mPendingFragmentActivityResults.m8211(i4);
            if (r1 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C1277 r2 = this.mFragments.m8817(r1);
            if (r2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + r1);
                return;
            }
            r2.onActivityResult(i & 65535, i2, intent);
            return;
        }
        C2944.C2945 r0 = C2944.m15205();
        if (r0 == null || !r0.m15209(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.m8803(z);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.m8812(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.m8802();
        this.mFragments.m8819(configuration);
    }

    public void onCreate(Bundle bundle) {
        this.mFragments.m8822((C1277) null);
        if (bundle != null) {
            this.mFragments.m8811(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.mNextCandidateRequestIndex = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.mPendingFragmentActivityResults = new C1286<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.mPendingFragmentActivityResults.m8219(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new C1286<>();
            this.mNextCandidateRequestIndex = 0;
        }
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m14066(C2319.C2320.ON_CREATE);
        this.mFragments.m8820();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.m8813(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* access modifiers changed from: package-private */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.m8810(view, str, context, attributeSet);
    }

    public void onDestroy() {
        super.onDestroy();
        this.mFragments.m8824();
        this.mFragmentLifecycleRegistry.m14066(C2319.C2320.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.m8808();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.m8804(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.m8814(menuItem);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.m8821(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m8815();
        this.mFragmentLifecycleRegistry.m14066(C2319.C2320.ON_PAUSE);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.m8802();
    }

    public void onStateNotSaved() {
        this.mFragments.m8802();
    }

    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.m8802();
        this.mFragments.m8816();
    }

    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m14066(C2319.C2320.ON_RESUME);
        this.mFragments.m8823();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.m8807(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.m14066(C2319.C2320.ON_STOP);
        Parcelable r0 = this.mFragments.m8809();
        if (r0 != null) {
            bundle.putParcelable("android:support:fragments", r0);
        }
        if (this.mPendingFragmentActivityResults.m8210() > 0) {
            bundle.putInt("android:support:next_request_index", this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.m8210()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.m8210()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.m8210(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.m8208(i);
                strArr[i] = this.mPendingFragmentActivityResults.m8218(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.m8818();
        }
        this.mFragments.m8802();
        this.mFragments.m8816();
        this.mFragmentLifecycleRegistry.m14066(C2319.C2320.ON_START);
        this.mFragments.m8825();
    }

    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.m8805();
        this.mFragmentLifecycleRegistry.m14066(C2319.C2320.ON_STOP);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            C0401.m4684(this).m4685(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.m8806().m9090(str, fileDescriptor, printWriter, strArr);
    }

    public C1550 getSupportFragmentManager() {
        return this.mFragments.m8806();
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    static void checkForValidRequestCode(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public final void validateRequestPermissionsRequestCode(int i) {
        if (!this.mRequestedPermissionsFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.m8802();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String r2 = this.mPendingFragmentActivityResults.m8216(i3);
            this.mPendingFragmentActivityResults.m8211(i3);
            if (r2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C1277 r3 = this.mFragments.m8817(r2);
            if (r3 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + r2);
                return;
            }
            r3.onRequestPermissionsResult(i & 65535, strArr, iArr);
        }
    }

    public void startActivityFromFragment(C1277 r4, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        if (i == -1) {
            try {
                C2944.m15203(this, intent, -1, bundle);
            } finally {
                this.mStartedActivityFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            C2944.m15203(this, intent, ((allocateRequestIndex(r4) + 1) << 16) + (i & 65535), bundle);
            this.mStartedActivityFromFragment = false;
        }
    }

    private int allocateRequestIndex(C1277 r4) {
        if (this.mPendingFragmentActivityResults.m8210() < 65534) {
            while (this.mPendingFragmentActivityResults.m8220(this.mNextCandidateRequestIndex) >= 0) {
                this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
            }
            int i = this.mNextCandidateRequestIndex;
            this.mPendingFragmentActivityResults.m8219(i, r4.mWho);
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void requestPermissionsFromFragment(C1277 r3, String[] strArr, int i) {
        if (i == -1) {
            C2944.m15207(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            C2944.m15207(this, strArr, ((allocateRequestIndex(r3) + 1) << 16) + (i & 65535));
            this.mRequestedPermissionsFromFragment = false;
        } catch (Throwable th) {
            this.mRequestedPermissionsFromFragment = false;
            throw th;
        }
    }

    /* renamed from: o.ɩɿ$ı  reason: contains not printable characters */
    class C1270 extends C1472<C1269> implements C0350, C3251Aux {
        public C1270() {
            super(C1269.this);
        }

        public final C2319 getLifecycle() {
            return C1269.this.mFragmentLifecycleRegistry;
        }

        public final C0307 getViewModelStore() {
            return C1269.this.getViewModelStore();
        }

        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return C1269.this.getOnBackPressedDispatcher();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m8171(String str, PrintWriter printWriter, String[] strArr) {
            C1269.this.dump(str, (FileDescriptor) null, printWriter, strArr);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m8174() {
            return !C1269.this.isFinishing();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final LayoutInflater m8166() {
            return C1269.this.getLayoutInflater().cloneInContext(C1269.this);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m8168() {
            C1269.this.supportInvalidateOptionsMenu();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m8164(C1277 r2, Intent intent, int i, Bundle bundle) {
            C1269.this.startActivityFromFragment(r2, intent, i, bundle);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m8173(C1277 r2, String[] strArr, int i) {
            C1269.this.requestPermissionsFromFragment(r2, strArr, i);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m8169(String str) {
            return C2944.m15208(C1269.this, str);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m8172(C1277 r2) {
            C1269.this.onAttachFragment(r2);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final View m8167(int i) {
            return C1269.this.findViewById(i);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m8165() {
            Window window = C1269.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ Object m8170() {
            return C1269.this;
        }
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), C2319.Cif.CREATED));
    }

    private static boolean markState(C1550 r4, C2319.Cif ifVar) {
        boolean z = false;
        for (C1277 next : r4.m9087()) {
            if (next != null) {
                if (next.getHost() != null) {
                    z |= markState(next.getChildFragmentManager(), ifVar);
                }
                if (next.getLifecycle().m12096().m12099(C2319.Cif.STARTED)) {
                    next.mLifecycleRegistry.m14068(ifVar);
                    z = true;
                }
            }
        }
        return z;
    }
}
