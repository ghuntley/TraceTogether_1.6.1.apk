package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import o.C1277;

public class ListFragment extends C1277 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Handler f212 = new Handler();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private TextView f213;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Runnable f214 = new Runnable() {
        public final void run() {
            ListFragment.this.f217.focusableViewAvailable(ListFragment.this.f217);
        }
    };

    /* renamed from: ɩ  reason: contains not printable characters */
    private ListAdapter f215;

    /* renamed from: ɹ  reason: contains not printable characters */
    private View f216;

    /* renamed from: Ι  reason: contains not printable characters */
    ListView f217;

    /* renamed from: ι  reason: contains not printable characters */
    private final AdapterView.OnItemClickListener f218 = new AdapterView.OnItemClickListener() {
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    };

    /* renamed from: І  reason: contains not printable characters */
    private boolean f219;

    /* renamed from: і  reason: contains not printable characters */
    private View f220;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private View f221;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m182();
    }

    public void onDestroyView() {
        this.f212.removeCallbacks(this.f214);
        this.f217 = null;
        this.f219 = false;
        this.f216 = null;
        this.f221 = null;
        this.f220 = null;
        this.f213 = null;
        super.onDestroyView();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m181(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.f215 != null;
        this.f215 = listAdapter;
        ListView listView = this.f217;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f219 && !z2) {
                if (requireView().getWindowToken() != null) {
                    z = true;
                }
                m180(true, z);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m180(boolean z, boolean z2) {
        m182();
        View view = this.f221;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f219 != z) {
            this.f219 = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.f216.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.f216.clearAnimation();
                }
                this.f221.setVisibility(8);
                this.f216.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.f216.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.f216.clearAnimation();
            }
            this.f221.setVisibility(0);
            this.f216.setVisibility(8);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m182() {
        if (this.f217 == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.f217 = (ListView) view;
                } else {
                    this.f213 = (TextView) view.findViewById(16711681);
                    TextView textView = this.f213;
                    if (textView == null) {
                        this.f220 = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.f221 = view.findViewById(16711682);
                    this.f216 = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        this.f217 = (ListView) findViewById;
                        View view2 = this.f220;
                        if (view2 != null) {
                            this.f217.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f219 = true;
                this.f217.setOnItemClickListener(this.f218);
                ListAdapter listAdapter = this.f215;
                if (listAdapter != null) {
                    this.f215 = null;
                    m181(listAdapter);
                } else if (this.f221 != null) {
                    m180(false, false);
                }
                this.f212.post(this.f214);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }
}
