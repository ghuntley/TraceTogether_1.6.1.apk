package o;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;

/* renamed from: o.ɩа  reason: contains not printable characters */
public final class C1297 extends C0898 {

    /* renamed from: ǃ  reason: contains not printable characters */
    final C2999 f7269;

    /* renamed from: ι  reason: contains not printable characters */
    private final AccessibilityManager f7270;

    public C1297(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1297(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f148562130968624);
    }

    public C1297(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7270 = (AccessibilityManager) context.getSystemService("accessibility");
        this.f7269 = new C2999(getContext());
        this.f7269.m15380(true);
        this.f7269.m15369((View) this);
        this.f7269.m15371(2);
        this.f7269.m15357(getAdapter());
        this.f7269.m15379((AdapterView.OnItemClickListener) new AdapterView.OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C1297.m8240(C1297.this, i < 0 ? C1297.this.f7269.m15365() : C1297.this.getAdapter().getItem(i));
                AdapterView.OnItemClickListener onItemClickListener = C1297.this.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = C1297.this.f7269.m15360();
                        i = C1297.this.f7269.m15383();
                        j = C1297.this.f7269.m15359();
                    }
                    onItemClickListener.onItemClick(C1297.this.f7269.m15384(), view, i, j);
                }
                C1297.this.f7269.m15373();
            }
        });
    }

    public final void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() != 0 || (accessibilityManager = this.f7270) == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f7269.b_();
        }
    }

    public final <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f7269.m15357(getAdapter());
    }

    public final CharSequence getHint() {
        C1336 r0;
        ViewParent parent = getParent();
        while (true) {
            if (parent == null) {
                r0 = null;
                break;
            } else if (parent instanceof C1336) {
                r0 = (C1336) parent;
                break;
            } else {
                parent = parent.getParent();
            }
        }
        if (r0 == null || !r0.f7402) {
            return super.getHint();
        }
        if (r0.f7394) {
            return r0.f7382;
        }
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static /* synthetic */ void m8240(C1297 r2, Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            r2.setText(r2.convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = r2.getAdapter();
        r2.setAdapter((ListAdapter) null);
        r2.setText(r2.convertSelectionToString(obj));
        r2.setAdapter(adapter);
    }
}
