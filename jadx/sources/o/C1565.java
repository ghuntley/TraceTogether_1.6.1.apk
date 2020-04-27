package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import o.C1260;

/* renamed from: o.ɿɩ  reason: contains not printable characters */
final class C1565 implements LayoutInflater.Factory2 {

    /* renamed from: ι  reason: contains not printable characters */
    private final C1550 f8317;

    C1565(C1550 r1) {
        this.f8317 = r1;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C1469 r0;
        if (C1300.class.getName().equals(str)) {
            return new C1300(context, attributeSet, this.f8317);
        }
        C1277 r02 = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1260.C1262.f7107);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C1260.C1262.f7108);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C1260.C1262.f7104, -1);
        String string = obtainStyledAttributes.getString(C1260.C1262.f7109);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C1469.m8795(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(attributeValue);
            throw new IllegalArgumentException(sb.toString());
        }
        if (resourceId != -1) {
            r02 = this.f8317.findFragmentById(resourceId);
        }
        if (r02 == null && string != null) {
            r02 = this.f8317.findFragmentByTag(string);
        }
        if (r02 == null && id != -1) {
            r02 = this.f8317.findFragmentById(id);
        }
        C1550.m9081(2);
        if (r02 == null) {
            C1550 r03 = this.f8317;
            if (r03.f8259 != null) {
                r0 = r03.f8259.mFragmentManager.m9131();
            } else {
                r0 = r03.f8279;
            }
            r02 = r0.m8798(context.getClassLoader(), attributeValue);
            r02.mFromLayout = true;
            r02.mFragmentId = resourceId != 0 ? resourceId : id;
            r02.mContainerId = id;
            r02.mTag = string;
            r02.mInLayout = true;
            C1550 r6 = this.f8317;
            r02.mFragmentManager = r6;
            r02.mHost = r6.f8263;
            r02.onInflate(this.f8317.f8263.f7905, attributeSet, r02.mSavedFragmentState);
            this.f8317.m9150(r02);
            this.f8317.m9146(r02);
        } else if (!r02.mInLayout) {
            r02.mInLayout = true;
            r02.mHost = this.f8317.f8263;
            r02.onInflate(this.f8317.f8263.f7905, attributeSet, r02.mSavedFragmentState);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(attributeSet.getPositionDescription());
            sb2.append(": Duplicate id 0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(", tag ");
            sb2.append(string);
            sb2.append(", or parent id 0x");
            sb2.append(Integer.toHexString(id));
            sb2.append(" with another fragment for ");
            sb2.append(attributeValue);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (this.f8317.f8266 > 0 || !r02.mFromLayout) {
            this.f8317.m9146(r02);
        } else {
            this.f8317.m9135(r02, 1);
        }
        if (r02.mView != null) {
            if (resourceId != 0) {
                r02.mView.setId(resourceId);
            }
            if (r02.mView.getTag() == null) {
                r02.mView.setTag(string);
            }
            return r02.mView;
        }
        StringBuilder sb3 = new StringBuilder("Fragment ");
        sb3.append(attributeValue);
        sb3.append(" did not create a view.");
        throw new IllegalStateException(sb3.toString());
    }
}
