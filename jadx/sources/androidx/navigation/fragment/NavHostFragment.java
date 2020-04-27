package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import o.C0440;
import o.C0540;
import o.C0546;
import o.C0588;
import o.C0593;
import o.C0699;
import o.C0712;
import o.C0746;
import o.C0800;
import o.C0818;
import o.C1265;
import o.C1277;
import o.C1300;
import o.C1550;
import o.C2851;
import o.R;

public class NavHostFragment extends C1277 {

    /* renamed from: ı  reason: contains not printable characters */
    private Boolean f263 = null;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f264;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C0588 f265;

    /* renamed from: ι  reason: contains not printable characters */
    private int f266;

    /* renamed from: ı  reason: contains not printable characters */
    public static C0540 m221(C1277 r5) {
        C0540 r2;
        C0540 r3;
        for (C1277 r0 = r5; r0 != null; r0 = r0.getParentFragment()) {
            if (r0 instanceof NavHostFragment) {
                C0588 r52 = ((NavHostFragment) r0).f265;
                if (r52 != null) {
                    return r52;
                }
                throw new IllegalStateException("NavController is not available before onCreate()");
            }
            C1277 r1 = r0.getParentFragmentManager().f8269;
            if (r1 instanceof NavHostFragment) {
                C0588 r53 = ((NavHostFragment) r1).f265;
                if (r53 != null) {
                    return r53;
                }
                throw new IllegalStateException("NavController is not available before onCreate()");
            }
        }
        View view = r5.getView();
        if (view != null) {
            View view2 = view;
            while (true) {
                r2 = null;
                if (view2 == null) {
                    break;
                }
                Object tag = view2.getTag(R.id.f166122131362175);
                if (tag instanceof WeakReference) {
                    r3 = (C0540) ((WeakReference) tag).get();
                } else if (tag instanceof C0540) {
                    r3 = (C0540) tag;
                } else {
                    r3 = null;
                }
                if (r3 != null) {
                    r2 = r3;
                    break;
                }
                ViewParent parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            }
            if (r2 != null) {
                return r2;
            }
            StringBuilder sb = new StringBuilder("View ");
            sb.append(view);
            sb.append(" does not have a NavController set");
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Fragment ");
        sb2.append(r5);
        sb2.append(" does not have a NavController set");
        throw new IllegalStateException(sb2.toString());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.f264) {
            new C1265(getParentFragmentManager()).m9967(this).m9966();
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f265 = new C0588(requireContext());
        this.f265.m5215((C2851) this);
        this.f265.m5214(requireActivity().getOnBackPressedDispatcher());
        C0588 r0 = this.f265;
        Boolean bool = this.f263;
        int i = 0;
        r0.m5217(bool != null && bool.booleanValue());
        Bundle bundle3 = null;
        this.f263 = null;
        this.f265.m5216(getViewModelStore());
        C0588 r1 = this.f265;
        r1.f4381.m5752((C0712<? extends C0593>) new C0800(requireContext(), getChildFragmentManager()));
        C0699 r12 = r1.f4381;
        Context requireContext = requireContext();
        C1550 childFragmentManager = getChildFragmentManager();
        int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.f166132131362176;
        }
        r12.m5752((C0712<? extends C0593>) new C0746(requireContext, childFragmentManager, id));
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f264 = true;
                new C1265(getParentFragmentManager()).m9967(this).m9966();
            }
            this.f266 = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            C0588 r10 = this.f265;
            bundle2.setClassLoader(r10.f4379.getClassLoader());
            r10.f4383 = bundle2.getBundle("android-support-nav:controller:navigatorState");
            r10.f4374 = bundle2.getParcelableArray("android-support-nav:controller:backStack");
            r10.f4376 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        int i2 = this.f266;
        if (i2 != 0) {
            this.f265.m5120(i2, (Bundle) null);
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("android-support-nav:fragment:graphId");
        }
        if (arguments != null) {
            bundle3 = arguments.getBundle("android-support-nav:fragment:startDestinationArgs");
        }
        if (i != 0) {
            this.f265.m5120(i, bundle3);
        }
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
        C0588 r0 = this.f265;
        if (r0 != null) {
            r0.m5217(z);
        } else {
            this.f263 = Boolean.valueOf(z);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1300 r2 = new C1300(layoutInflater.getContext());
        int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.f166132131362176;
        }
        r2.setId(id);
        return r2;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            view.setTag(R.id.f166122131362175, this.f265);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                if (view2.getId() == getId()) {
                    view2.setTag(R.id.f166122131362175, this.f265);
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("created host view ");
        sb.append(view);
        sb.append(" is not a ViewGroup");
        throw new IllegalStateException(sb.toString());
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0818.Cif.f5333);
        int resourceId = obtainStyledAttributes.getResourceId(C0818.Cif.f5337, 0);
        if (resourceId != 0) {
            this.f266 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0818.Cif.f5338);
        if (obtainStyledAttributes2.getBoolean(C0818.Cif.f5332, false)) {
            this.f264 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        super.onSaveInstanceState(bundle);
        C0588 r0 = this.f265;
        ArrayList arrayList = new ArrayList();
        Bundle bundle3 = new Bundle();
        for (Map.Entry next : r0.f4381.f4881.entrySet()) {
            String str = (String) next.getKey();
            Bundle r4 = ((C0712) next.getValue()).m5828();
            if (r4 != null) {
                arrayList.add(str);
                bundle3.putBundle(str, r4);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        } else {
            bundle2 = null;
        }
        if (!r0.f4386.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[r0.f4386.size()];
            int i = 0;
            for (C0546 r5 : r0.f4386) {
                parcelableArr[i] = new C0440(r5);
                i++;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (r0.f4376) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", r0.f4376);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.f264) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i2 = this.f266;
        if (i2 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i2);
        }
    }
}
