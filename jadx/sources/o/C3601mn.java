package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u00002\u00020\u000fB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/mn;", "Landroid/view/MotionEvent;", "p0", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "", "setPagingEnabled", "(Z)V", "Landroid/content/Context;", "Landroid/util/AttributeSet;", "p1", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lo/јı;"}, k = 1, mv = {1, 1, 16})
/* renamed from: o.mn  reason: case insensitive filesystem */
public final class C3601mn extends C2613 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3601mn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context == null) {
            fM.m2256();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fM.m2254(motionEvent, "");
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fM.m2254(motionEvent, "");
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setPagingEnabled(boolean z) {
        setEnabled(z);
    }
}
